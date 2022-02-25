OkHttpClient client = new OkHttpClient().newBuilder()
  .build();
MediaType mediaType = MediaType.parse("application/json");
RequestBody body = RequestBody.create(mediaType, "{\r\n  \"to\": \"62967888000\",\r\n  \"length\": 6,\r\n  \"tag\": \"compaign1\",\r\n  \"timeout\": 300,\r\n  \"notifyurl\": \"\"\r\n}");
Request request = new Request.Builder()
  .url("https://otpapi.worldhubcom.com/api/mcotp/send")
  .method("POST", body)
  .addHeader("Content-Type", "application/json")
  .addHeader("Authorization", "Basic writeyourauthcodehere")
  .build();
Response response = client.newCall(request).execute();