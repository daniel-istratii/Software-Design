import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HTTPCommunication {
    private static HttpURLConnection connection;

    public StringBuffer competitionHttpRequest(Integer id) throws IOException {
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();
        try {
            // SEND THE HTTP REQUEST WITH THE ID OF THE COMPETITION
            String httpRequest = "http://api.football-data.org/v2/competitions/";
            httpRequest += id + "/teams";
            URL url = new URL(httpRequest);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("X-Auth-Token", "db6e589079004b379cbcc5f1e56b332c");
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();

            if (status > 299) {
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            } else {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return responseContent;
    }

    public StringBuffer teamHttpRequest(Integer id) throws IOException {
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();
        try {
            //HTTP REQUEST WITH THE TEAM ID
            String httpRequest = "http://api.football-data.org/v2/teams/";
            httpRequest += id;
            URL url = new URL(httpRequest);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("X-Auth-Token", "db6e589079004b379cbcc5f1e56b332c");
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();

            if (status > 299) {
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            } else {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return responseContent;
    }

    public StringBuffer playerHttpRequest(Integer id) throws IOException {
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();
        try {
            String httpRequest = "http://api.football-data.org/v2/players/";
            httpRequest += id;
            URL url = new URL(httpRequest);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("X-Auth-Token", "db6e589079004b379cbcc5f1e56b332c");
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();

            if (status > 299) {
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            } else {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return responseContent;

    }

    public StringBuffer standingsRequest(Integer id) throws IOException {
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();
        try {
            // HTTP REQUEST
            String httpRequest = "http://api.football-data.org/v2/competitions/";
            httpRequest += id + "/standings";
            URL url = new URL(httpRequest);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("X-Auth-Token", "db6e589079004b379cbcc5f1e56b332c");
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();

            if (status > 299) {
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            } else {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return responseContent;
    }

    public StringBuffer scorersRequest(Integer id) throws IOException {
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();

        try {
            // HTTP REQUEST
            String httpRequest = "http://api.football-data.org/v2/competitions/";
            httpRequest += id + "/scorers";
            URL url = new URL(httpRequest);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("X-Auth-Token", "db6e589079004b379cbcc5f1e56b332c");
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();

            if (status > 299) {
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            } else {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return responseContent;
    }

    public StringBuffer scheduleRequest(Integer id, Integer currentMatchDay) throws IOException {
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();

        try {
            // HTTP REQUEST
            String httpRequest = "http://api.football-data.org/v2/competitions/";
            httpRequest += id + "/matches?matchday=" + currentMatchDay;
            URL url = new URL(httpRequest);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("X-Auth-Token", "db6e589079004b379cbcc5f1e56b332c");
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();

            if (status > 299) {
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            } else {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return responseContent;
    }

    public StringBuffer matchDayRequest(Integer id) throws IOException {
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();
        try {
            String httpRequest = "http://api.football-data.org/v2/competitions/";
            httpRequest += id;
            URL url = new URL(httpRequest);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("X-Auth-Token", "db6e589079004b379cbcc5f1e56b332c");
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();

            if (status > 299) {
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            } else {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return responseContent;
    }

    public StringBuffer playerPerformanceHttpRequest(Integer id) throws IOException {
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();

        // API REQUEST
        try {
            String httpRequest = "http://api.football-data.org/v2/players/" + id + "/matches?status=FINISHED&limit=1";
            URL url = new URL(httpRequest);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("X-Auth-Token", "db6e589079004b379cbcc5f1e56b332c");
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();

            if (status > 299) {
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            } else {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return responseContent;
    }
}
