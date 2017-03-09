package com.shopspreeng.android.javadev;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by jayson surface on 09/03/2017.
 */

public class UserJson {

    private static String username;

    private static String userImg;

    private static String userUrl;


    private static final String LAG_JAVA_DEV = "{  \n" +
            "   \"total_count\":134,\n" +
            "   \"incomplete_results\":false,\n" +
            "   \"items\":[  \n" +
            "      {  \n" +
            "         \"login\":\"moyheen\",\n" +
            "         \"id\":8110201,\n" +
            "         \"avatar_url\":\"https://avatars1.githubusercontent.com/u/8110201?v=3\",\n" +
            "         \"gravatar_id\":\"\",\n" +
            "         \"url\":\"https://api.github.com/users/moyheen\",\n" +
            "         \"html_url\":\"https://github.com/moyheen\",\n" +
            "         \"followers_url\":\"https://api.github.com/users/moyheen/followers\",\n" +
            "         \"following_url\":\"https://api.github.com/users/moyheen/following{/other_user}\",\n" +
            "         \"gists_url\":\"https://api.github.com/users/moyheen/gists{/gist_id}\",\n" +
            "         \"starred_url\":\"https://api.github.com/users/moyheen/starred{/owner}{/repo}\",\n" +
            "         \"subscriptions_url\":\"https://api.github.com/users/moyheen/subscriptions\",\n" +
            "         \"organizations_url\":\"https://api.github.com/users/moyheen/orgs\",\n" +
            "         \"repos_url\":\"https://api.github.com/users/moyheen/repos\",\n" +
            "         \"events_url\":\"https://api.github.com/users/moyheen/events{/privacy}\",\n" +
            "         \"received_events_url\":\"https://api.github.com/users/moyheen/received_events\",\n" +
            "         \"type\":\"User\",\n" +
            "         \"site_admin\":false,\n" +
            "         \"score\":1.0\n" +
            "      },\n" +
            "      {  \n" +
            "         \"login\":\"segunfamisa\",\n" +
            "         \"id\":2130907,\n" +
            "         \"avatar_url\":\"https://avatars1.githubusercontent.com/u/2130907?v=3\",\n" +
            "         \"gravatar_id\":\"\",\n" +
            "         \"url\":\"https://api.github.com/users/segunfamisa\",\n" +
            "         \"html_url\":\"https://github.com/segunfamisa\",\n" +
            "         \"followers_url\":\"https://api.github.com/users/segunfamisa/followers\",\n" +
            "         \"following_url\":\"https://api.github.com/users/segunfamisa/following{/other_user}\",\n" +
            "         \"gists_url\":\"https://api.github.com/users/segunfamisa/gists{/gist_id}\",\n" +
            "         \"starred_url\":\"https://api.github.com/users/segunfamisa/starred{/owner}{/repo}\",\n" +
            "         \"subscriptions_url\":\"https://api.github.com/users/segunfamisa/subscriptions\",\n" +
            "         \"organizations_url\":\"https://api.github.com/users/segunfamisa/orgs\",\n" +
            "         \"repos_url\":\"https://api.github.com/users/segunfamisa/repos\",\n" +
            "         \"events_url\":\"https://api.github.com/users/segunfamisa/events{/privacy}\",\n" +
            "         \"received_events_url\":\"https://api.github.com/users/segunfamisa/received_events\",\n" +
            "         \"type\":\"User\",\n" +
            "         \"site_admin\":false,\n" +
            "         \"score\":1.0\n" +
            "      },\n" +
            "      {  \n" +
            "         \"login\":\"takwas\",\n" +
            "         \"id\":3008235,\n" +
            "         \"avatar_url\":\"https://avatars3.githubusercontent.com/u/3008235?v=3\",\n" +
            "         \"gravatar_id\":\"\",\n" +
            "         \"url\":\"https://api.github.com/users/takwas\",\n" +
            "         \"html_url\":\"https://github.com/takwas\",\n" +
            "         \"followers_url\":\"https://api.github.com/users/takwas/followers\",\n" +
            "         \"following_url\":\"https://api.github.com/users/takwas/following{/other_user}\",\n" +
            "         \"gists_url\":\"https://api.github.com/users/takwas/gists{/gist_id}\",\n" +
            "         \"starred_url\":\"https://api.github.com/users/takwas/starred{/owner}{/repo}\",\n" +
            "         \"subscriptions_url\":\"https://api.github.com/users/takwas/subscriptions\",\n" +
            "         \"organizations_url\":\"https://api.github.com/users/takwas/orgs\",\n" +
            "         \"repos_url\":\"https://api.github.com/users/takwas/repos\",\n" +
            "         \"events_url\":\"https://api.github.com/users/takwas/events{/privacy}\",\n" +
            "         \"received_events_url\":\"https://api.github.com/users/takwas/received_events\",\n" +
            "         \"type\":\"User\",\n" +
            "         \"site_admin\":false,\n" +
            "         \"score\":1.0\n" +
            "      },\n" +
            "      {  \n" +
            "         \"login\":\"VictorAlagwu\",\n" +
            "         \"id\":15857679,\n" +
            "         \"avatar_url\":\"https://avatars3.githubusercontent.com/u/15857679?v=3\",\n" +
            "         \"gravatar_id\":\"\",\n" +
            "         \"url\":\"https://api.github.com/users/VictorAlagwu\",\n" +
            "         \"html_url\":\"https://github.com/VictorAlagwu\",\n" +
            "         \"followers_url\":\"https://api.github.com/users/VictorAlagwu/followers\",\n" +
            "         \"following_url\":\"https://api.github.com/users/VictorAlagwu/following{/other_user}\",\n" +
            "         \"gists_url\":\"https://api.github.com/users/VictorAlagwu/gists{/gist_id}\",\n" +
            "         \"starred_url\":\"https://api.github.com/users/VictorAlagwu/starred{/owner}{/repo}\",\n" +
            "         \"subscriptions_url\":\"https://api.github.com/users/VictorAlagwu/subscriptions\",\n" +
            "         \"organizations_url\":\"https://api.github.com/users/VictorAlagwu/orgs\",\n" +
            "         \"repos_url\":\"https://api.github.com/users/VictorAlagwu/repos\",\n" +
            "         \"events_url\":\"https://api.github.com/users/VictorAlagwu/events{/privacy}\",\n" +
            "         \"received_events_url\":\"https://api.github.com/users/VictorAlagwu/received_events\",\n" +
            "         \"type\":\"User\",\n" +
            "         \"site_admin\":false,\n" +
            "         \"score\":1.0\n" +
            "      },\n" +
            "      {  \n" +
            "         \"login\":\"othreecodes\",\n" +
            "         \"id\":18391371,\n" +
            "         \"avatar_url\":\"https://avatars2.githubusercontent.com/u/18391371?v=3\",\n" +
            "         \"gravatar_id\":\"\",\n" +
            "         \"url\":\"https://api.github.com/users/othreecodes\",\n" +
            "         \"html_url\":\"https://github.com/othreecodes\",\n" +
            "         \"followers_url\":\"https://api.github.com/users/othreecodes/followers\",\n" +
            "         \"following_url\":\"https://api.github.com/users/othreecodes/following{/other_user}\",\n" +
            "         \"gists_url\":\"https://api.github.com/users/othreecodes/gists{/gist_id}\",\n" +
            "         \"starred_url\":\"https://api.github.com/users/othreecodes/starred{/owner}{/repo}\",\n" +
            "         \"subscriptions_url\":\"https://api.github.com/users/othreecodes/subscriptions\",\n" +
            "         \"organizations_url\":\"https://api.github.com/users/othreecodes/orgs\",\n" +
            "         \"repos_url\":\"https://api.github.com/users/othreecodes/repos\",\n" +
            "         \"events_url\":\"https://api.github.com/users/othreecodes/events{/privacy}\",\n" +
            "         \"received_events_url\":\"https://api.github.com/users/othreecodes/received_events\",\n" +
            "         \"type\":\"User\",\n" +
            "         \"site_admin\":false,\n" +
            "         \"score\":1.0\n" +
            "      },\n" +
            "      {  \n" +
            "         \"login\":\"Auwalms\",\n" +
            "         \"id\":11312931,\n" +
            "         \"avatar_url\":\"https://avatars0.githubusercontent.com/u/11312931?v=3\",\n" +
            "         \"gravatar_id\":\"\",\n" +
            "         \"url\":\"https://api.github.com/users/Auwalms\",\n" +
            "         \"html_url\":\"https://github.com/Auwalms\",\n" +
            "         \"followers_url\":\"https://api.github.com/users/Auwalms/followers\",\n" +
            "         \"following_url\":\"https://api.github.com/users/Auwalms/following{/other_user}\",\n" +
            "         \"gists_url\":\"https://api.github.com/users/Auwalms/gists{/gist_id}\",\n" +
            "         \"starred_url\":\"https://api.github.com/users/Auwalms/starred{/owner}{/repo}\",\n" +
            "         \"subscriptions_url\":\"https://api.github.com/users/Auwalms/subscriptions\",\n" +
            "         \"organizations_url\":\"https://api.github.com/users/Auwalms/orgs\",\n" +
            "         \"repos_url\":\"https://api.github.com/users/Auwalms/repos\",\n" +
            "         \"events_url\":\"https://api.github.com/users/Auwalms/events{/privacy}\",\n" +
            "         \"received_events_url\":\"https://api.github.com/users/Auwalms/received_events\",\n" +
            "         \"type\":\"User\",\n" +
            "         \"site_admin\":false,\n" +
            "         \"score\":1.0\n" +
            "      },\n" +
            "      {  \n" +
            "         \"login\":\"KingsMentor\",\n" +
            "         \"id\":5605785,\n" +
            "         \"avatar_url\":\"https://avatars2.githubusercontent.com/u/5605785?v=3\",\n" +
            "         \"gravatar_id\":\"\",\n" +
            "         \"url\":\"https://api.github.com/users/KingsMentor\",\n" +
            "         \"html_url\":\"https://github.com/KingsMentor\",\n" +
            "         \"followers_url\":\"https://api.github.com/users/KingsMentor/followers\",\n" +
            "         \"following_url\":\"https://api.github.com/users/KingsMentor/following{/other_user}\",\n" +
            "         \"gists_url\":\"https://api.github.com/users/KingsMentor/gists{/gist_id}\",\n" +
            "         \"starred_url\":\"https://api.github.com/users/KingsMentor/starred{/owner}{/repo}\",\n" +
            "         \"subscriptions_url\":\"https://api.github.com/users/KingsMentor/subscriptions\",\n" +
            "         \"organizations_url\":\"https://api.github.com/users/KingsMentor/orgs\",\n" +
            "         \"repos_url\":\"https://api.github.com/users/KingsMentor/repos\",\n" +
            "         \"events_url\":\"https://api.github.com/users/KingsMentor/events{/privacy}\",\n" +
            "         \"received_events_url\":\"https://api.github.com/users/KingsMentor/received_events\",\n" +
            "         \"type\":\"User\",\n" +
            "         \"site_admin\":false,\n" +
            "         \"score\":1.0\n" +
            "      },\n" +
            "      {  \n" +
            "         \"login\":\"larikraun\",\n" +
            "         \"id\":2240178,\n" +
            "         \"avatar_url\":\"https://avatars1.githubusercontent.com/u/2240178?v=3\",\n" +
            "         \"gravatar_id\":\"\",\n" +
            "         \"url\":\"https://api.github.com/users/larikraun\",\n" +
            "         \"html_url\":\"https://github.com/larikraun\",\n" +
            "         \"followers_url\":\"https://api.github.com/users/larikraun/followers\",\n" +
            "         \"following_url\":\"https://api.github.com/users/larikraun/following{/other_user}\",\n" +
            "         \"gists_url\":\"https://api.github.com/users/larikraun/gists{/gist_id}\",\n" +
            "         \"starred_url\":\"https://api.github.com/users/larikraun/starred{/owner}{/repo}\",\n" +
            "         \"subscriptions_url\":\"https://api.github.com/users/larikraun/subscriptions\",\n" +
            "         \"organizations_url\":\"https://api.github.com/users/larikraun/orgs\",\n" +
            "         \"repos_url\":\"https://api.github.com/users/larikraun/repos\",\n" +
            "         \"events_url\":\"https://api.github.com/users/larikraun/events{/privacy}\",\n" +
            "         \"received_events_url\":\"https://api.github.com/users/larikraun/received_events\",\n" +
            "         \"type\":\"User\",\n" +
            "         \"site_admin\":false,\n" +
            "         \"score\":1.0\n" +
            "      },\n" +
            "      {  \n" +
            "         \"login\":\"Mozartted\",\n" +
            "         \"id\":11639772,\n" +
            "         \"avatar_url\":\"https://avatars3.githubusercontent.com/u/11639772?v=3\",\n" +
            "         \"gravatar_id\":\"\",\n" +
            "         \"url\":\"https://api.github.com/users/Mozartted\",\n" +
            "         \"html_url\":\"https://github.com/Mozartted\",\n" +
            "         \"followers_url\":\"https://api.github.com/users/Mozartted/followers\",\n" +
            "         \"following_url\":\"https://api.github.com/users/Mozartted/following{/other_user}\",\n" +
            "         \"gists_url\":\"https://api.github.com/users/Mozartted/gists{/gist_id}\",\n" +
            "         \"starred_url\":\"https://api.github.com/users/Mozartted/starred{/owner}{/repo}\",\n" +
            "         \"subscriptions_url\":\"https://api.github.com/users/Mozartted/subscriptions\",\n" +
            "         \"organizations_url\":\"https://api.github.com/users/Mozartted/orgs\",\n" +
            "         \"repos_url\":\"https://api.github.com/users/Mozartted/repos\",\n" +
            "         \"events_url\":\"https://api.github.com/users/Mozartted/events{/privacy}\",\n" +
            "         \"received_events_url\":\"https://api.github.com/users/Mozartted/received_events\",\n" +
            "         \"type\":\"User\",\n" +
            "         \"site_admin\":false,\n" +
            "         \"score\":1.0\n" +
            "      },\n" +
            "      {  \n" +
            "         \"login\":\"oluwasayo\",\n" +
            "         \"id\":900868,\n" +
            "         \"avatar_url\":\"https://avatars1.githubusercontent.com/u/900868?v=3\",\n" +
            "         \"gravatar_id\":\"\",\n" +
            "         \"url\":\"https://api.github.com/users/oluwasayo\",\n" +
            "         \"html_url\":\"https://github.com/oluwasayo\",\n" +
            "         \"followers_url\":\"https://api.github.com/users/oluwasayo/followers\",\n" +
            "         \"following_url\":\"https://api.github.com/users/oluwasayo/following{/other_user}\",\n" +
            "         \"gists_url\":\"https://api.github.com/users/oluwasayo/gists{/gist_id}\",\n" +
            "         \"starred_url\":\"https://api.github.com/users/oluwasayo/starred{/owner}{/repo}\",\n" +
            "         \"subscriptions_url\":\"https://api.github.com/users/oluwasayo/subscriptions\",\n" +
            "         \"organizations_url\":\"https://api.github.com/users/oluwasayo/orgs\",\n" +
            "         \"repos_url\":\"https://api.github.com/users/oluwasayo/repos\",\n" +
            "         \"events_url\":\"https://api.github.com/users/oluwasayo/events{/privacy}\",\n" +
            "         \"received_events_url\":\"https://api.github.com/users/oluwasayo/received_events\",\n" +
            "         \"type\":\"User\",\n" +
            "         \"site_admin\":false,\n" +
            "         \"score\":1.0\n" +
            "      },\n" +
            "      {  \n" +
            "         \"login\":\"EnoIme\",\n" +
            "         \"id\":7225217,\n" +
            "         \"avatar_url\":\"https://avatars0.githubusercontent.com/u/7225217?v=3\",\n" +
            "         \"gravatar_id\":\"\",\n" +
            "         \"url\":\"https://api.github.com/users/EnoIme\",\n" +
            "         \"html_url\":\"https://github.com/EnoIme\",\n" +
            "         \"followers_url\":\"https://api.github.com/users/EnoIme/followers\",\n" +
            "         \"following_url\":\"https://api.github.com/users/EnoIme/following{/other_user}\",\n" +
            "         \"gists_url\":\"https://api.github.com/users/EnoIme/gists{/gist_id}\",\n" +
            "         \"starred_url\":\"https://api.github.com/users/EnoIme/starred{/owner}{/repo}\",\n" +
            "         \"subscriptions_url\":\"https://api.github.com/users/EnoIme/subscriptions\",\n" +
            "         \"organizations_url\":\"https://api.github.com/users/EnoIme/orgs\",\n" +
            "         \"repos_url\":\"https://api.github.com/users/EnoIme/repos\",\n" +
            "         \"events_url\":\"https://api.github.com/users/EnoIme/events{/privacy}\",\n" +
            "         \"received_events_url\":\"https://api.github.com/users/EnoIme/received_events\",\n" +
            "         \"type\":\"User\",\n" +
            "         \"site_admin\":false,\n" +
            "         \"score\":1.0\n" +
            "      },\n" +
            "      {  \n" +
            "         \"login\":\"Udokah\",\n" +
            "         \"id\":3197630,\n" +
            "         \"avatar_url\":\"https://avatars1.githubusercontent.com/u/3197630?v=3\",\n" +
            "         \"gravatar_id\":\"\",\n" +
            "         \"url\":\"https://api.github.com/users/Udokah\",\n" +
            "         \"html_url\":\"https://github.com/Udokah\",\n" +
            "         \"followers_url\":\"https://api.github.com/users/Udokah/followers\",\n" +
            "         \"following_url\":\"https://api.github.com/users/Udokah/following{/other_user}\",\n" +
            "         \"gists_url\":\"https://api.github.com/users/Udokah/gists{/gist_id}\",\n" +
            "         \"starred_url\":\"https://api.github.com/users/Udokah/starred{/owner}{/repo}\",\n" +
            "         \"subscriptions_url\":\"https://api.github.com/users/Udokah/subscriptions\",\n" +
            "         \"organizations_url\":\"https://api.github.com/users/Udokah/orgs\",\n" +
            "         \"repos_url\":\"https://api.github.com/users/Udokah/repos\",\n" +
            "         \"events_url\":\"https://api.github.com/users/Udokah/events{/privacy}\",\n" +
            "         \"received_events_url\":\"https://api.github.com/users/Udokah/received_events\",\n" +
            "         \"type\":\"User\",\n" +
            "         \"site_admin\":false,\n" +
            "         \"score\":1.0\n" +
            "      },\n" +
            "      {  \n" +
            "         \"login\":\"tdscientist\",\n" +
            "         \"id\":6681855,\n" +
            "         \"avatar_url\":\"https://avatars2.githubusercontent.com/u/6681855?v=3\",\n" +
            "         \"gravatar_id\":\"\",\n" +
            "         \"url\":\"https://api.github.com/users/tdscientist\",\n" +
            "         \"html_url\":\"https://github.com/tdscientist\",\n" +
            "         \"followers_url\":\"https://api.github.com/users/tdscientist/followers\",\n" +
            "         \"following_url\":\"https://api.github.com/users/tdscientist/following{/other_user}\",\n" +
            "         \"gists_url\":\"https://api.github.com/users/tdscientist/gists{/gist_id}\",\n" +
            "         \"starred_url\":\"https://api.github.com/users/tdscientist/starred{/owner}{/repo}\",\n" +
            "         \"subscriptions_url\":\"https://api.github.com/users/tdscientist/subscriptions\",\n" +
            "         \"organizations_url\":\"https://api.github.com/users/tdscientist/orgs\",\n" +
            "         \"repos_url\":\"https://api.github.com/users/tdscientist/repos\",\n" +
            "         \"events_url\":\"https://api.github.com/users/tdscientist/events{/privacy}\",\n" +
            "         \"received_events_url\":\"https://api.github.com/users/tdscientist/received_events\",\n" +
            "         \"type\":\"User\",\n" +
            "         \"site_admin\":false,\n" +
            "         \"score\":1.0\n" +
            "      },\n" +
            "      {  \n" +
            "         \"login\":\"jirevwe\",\n" +
            "         \"id\":5263355,\n" +
            "         \"avatar_url\":\"https://avatars0.githubusercontent.com/u/5263355?v=3\",\n" +
            "         \"gravatar_id\":\"\",\n" +
            "         \"url\":\"https://api.github.com/users/jirevwe\",\n" +
            "         \"html_url\":\"https://github.com/jirevwe\",\n" +
            "         \"followers_url\":\"https://api.github.com/users/jirevwe/followers\",\n" +
            "         \"following_url\":\"https://api.github.com/users/jirevwe/following{/other_user}\",\n" +
            "         \"gists_url\":\"https://api.github.com/users/jirevwe/gists{/gist_id}\",\n" +
            "         \"starred_url\":\"https://api.github.com/users/jirevwe/starred{/owner}{/repo}\",\n" +
            "         \"subscriptions_url\":\"https://api.github.com/users/jirevwe/subscriptions\",\n" +
            "         \"organizations_url\":\"https://api.github.com/users/jirevwe/orgs\",\n" +
            "         \"repos_url\":\"https://api.github.com/users/jirevwe/repos\",\n" +
            "         \"events_url\":\"https://api.github.com/users/jirevwe/events{/privacy}\",\n" +
            "         \"received_events_url\":\"https://api.github.com/users/jirevwe/received_events\",\n" +
            "         \"type\":\"User\",\n" +
            "         \"site_admin\":false,\n" +
            "         \"score\":1.0\n" +
            "      },\n" +
            "      {  \n" +
            "         \"login\":\"segun\",\n" +
            "         \"id\":44811,\n" +
            "         \"avatar_url\":\"https://avatars1.githubusercontent.com/u/44811?v=3\",\n" +
            "         \"gravatar_id\":\"\",\n" +
            "         \"url\":\"https://api.github.com/users/segun\",\n" +
            "         \"html_url\":\"https://github.com/segun\",\n" +
            "         \"followers_url\":\"https://api.github.com/users/segun/followers\",\n" +
            "         \"following_url\":\"https://api.github.com/users/segun/following{/other_user}\",\n" +
            "         \"gists_url\":\"https://api.github.com/users/segun/gists{/gist_id}\",\n" +
            "         \"starred_url\":\"https://api.github.com/users/segun/starred{/owner}{/repo}\",\n" +
            "         \"subscriptions_url\":\"https://api.github.com/users/segun/subscriptions\",\n" +
            "         \"organizations_url\":\"https://api.github.com/users/segun/orgs\",\n" +
            "         \"repos_url\":\"https://api.github.com/users/segun/repos\",\n" +
            "         \"events_url\":\"https://api.github.com/users/segun/events{/privacy}\",\n" +
            "         \"received_events_url\":\"https://api.github.com/users/segun/received_events\",\n" +
            "         \"type\":\"User\",\n" +
            "         \"site_admin\":false,\n" +
            "         \"score\":1.0\n" +
            "      },\n" +
            "      {  \n" +
            "         \"login\":\"kodejuice\",\n" +
            "         \"id\":9017620,\n" +
            "         \"avatar_url\":\"https://avatars2.githubusercontent.com/u/9017620?v=3\",\n" +
            "         \"gravatar_id\":\"\",\n" +
            "         \"url\":\"https://api.github.com/users/kodejuice\",\n" +
            "         \"html_url\":\"https://github.com/kodejuice\",\n" +
            "         \"followers_url\":\"https://api.github.com/users/kodejuice/followers\",\n" +
            "         \"following_url\":\"https://api.github.com/users/kodejuice/following{/other_user}\",\n" +
            "         \"gists_url\":\"https://api.github.com/users/kodejuice/gists{/gist_id}\",\n" +
            "         \"starred_url\":\"https://api.github.com/users/kodejuice/starred{/owner}{/repo}\",\n" +
            "         \"subscriptions_url\":\"https://api.github.com/users/kodejuice/subscriptions\",\n" +
            "         \"organizations_url\":\"https://api.github.com/users/kodejuice/orgs\",\n" +
            "         \"repos_url\":\"https://api.github.com/users/kodejuice/repos\",\n" +
            "         \"events_url\":\"https://api.github.com/users/kodejuice/events{/privacy}\",\n" +
            "         \"received_events_url\":\"https://api.github.com/users/kodejuice/received_events\",\n" +
            "         \"type\":\"User\",\n" +
            "         \"site_admin\":false,\n" +
            "         \"score\":1.0\n" +
            "      },\n" +
            "      {  \n" +
            "         \"login\":\"zeddysoft\",\n" +
            "         \"id\":6921756,\n" +
            "         \"avatar_url\":\"https://avatars0.githubusercontent.com/u/6921756?v=3\",\n" +
            "         \"gravatar_id\":\"\",\n" +
            "         \"url\":\"https://api.github.com/users/zeddysoft\",\n" +
            "         \"html_url\":\"https://github.com/zeddysoft\",\n" +
            "         \"followers_url\":\"https://api.github.com/users/zeddysoft/followers\",\n" +
            "         \"following_url\":\"https://api.github.com/users/zeddysoft/following{/other_user}\",\n" +
            "         \"gists_url\":\"https://api.github.com/users/zeddysoft/gists{/gist_id}\",\n" +
            "         \"starred_url\":\"https://api.github.com/users/zeddysoft/starred{/owner}{/repo}\",\n" +
            "         \"subscriptions_url\":\"https://api.github.com/users/zeddysoft/subscriptions\",\n" +
            "         \"organizations_url\":\"https://api.github.com/users/zeddysoft/orgs\",\n" +
            "         \"repos_url\":\"https://api.github.com/users/zeddysoft/repos\",\n" +
            "         \"events_url\":\"https://api.github.com/users/zeddysoft/events{/privacy}\",\n" +
            "         \"received_events_url\":\"https://api.github.com/users/zeddysoft/received_events\",\n" +
            "         \"type\":\"User\",\n" +
            "         \"site_admin\":false,\n" +
            "         \"score\":1.0\n" +
            "      },\n" +
            "      {  \n" +
            "         \"login\":\"tonespy\",\n" +
            "         \"id\":3057485,\n" +
            "         \"avatar_url\":\"https://avatars1.githubusercontent.com/u/3057485?v=3\",\n" +
            "         \"gravatar_id\":\"\",\n" +
            "         \"url\":\"https://api.github.com/users/tonespy\",\n" +
            "         \"html_url\":\"https://github.com/tonespy\",\n" +
            "         \"followers_url\":\"https://api.github.com/users/tonespy/followers\",\n" +
            "         \"following_url\":\"https://api.github.com/users/tonespy/following{/other_user}\",\n" +
            "         \"gists_url\":\"https://api.github.com/users/tonespy/gists{/gist_id}\",\n" +
            "         \"starred_url\":\"https://api.github.com/users/tonespy/starred{/owner}{/repo}\",\n" +
            "         \"subscriptions_url\":\"https://api.github.com/users/tonespy/subscriptions\",\n" +
            "         \"organizations_url\":\"https://api.github.com/users/tonespy/orgs\",\n" +
            "         \"repos_url\":\"https://api.github.com/users/tonespy/repos\",\n" +
            "         \"events_url\":\"https://api.github.com/users/tonespy/events{/privacy}\",\n" +
            "         \"received_events_url\":\"https://api.github.com/users/tonespy/received_events\",\n" +
            "         \"type\":\"User\",\n" +
            "         \"site_admin\":false,\n" +
            "         \"score\":1.0\n" +
            "      },\n" +
            "      {  \n" +
            "         \"login\":\"joelezeu\",\n" +
            "         \"id\":8350676,\n" +
            "         \"avatar_url\":\"https://avatars3.githubusercontent.com/u/8350676?v=3\",\n" +
            "         \"gravatar_id\":\"\",\n" +
            "         \"url\":\"https://api.github.com/users/joelezeu\",\n" +
            "         \"html_url\":\"https://github.com/joelezeu\",\n" +
            "         \"followers_url\":\"https://api.github.com/users/joelezeu/followers\",\n" +
            "         \"following_url\":\"https://api.github.com/users/joelezeu/following{/other_user}\",\n" +
            "         \"gists_url\":\"https://api.github.com/users/joelezeu/gists{/gist_id}\",\n" +
            "         \"starred_url\":\"https://api.github.com/users/joelezeu/starred{/owner}{/repo}\",\n" +
            "         \"subscriptions_url\":\"https://api.github.com/users/joelezeu/subscriptions\",\n" +
            "         \"organizations_url\":\"https://api.github.com/users/joelezeu/orgs\",\n" +
            "         \"repos_url\":\"https://api.github.com/users/joelezeu/repos\",\n" +
            "         \"events_url\":\"https://api.github.com/users/joelezeu/events{/privacy}\",\n" +
            "         \"received_events_url\":\"https://api.github.com/users/joelezeu/received_events\",\n" +
            "         \"type\":\"User\",\n" +
            "         \"site_admin\":false,\n" +
            "         \"score\":1.0\n" +
            "      },\n" +
            "      {  \n" +
            "         \"login\":\"andela-dJames\",\n" +
            "         \"id\":10341438,\n" +
            "         \"avatar_url\":\"https://avatars1.githubusercontent.com/u/10341438?v=3\",\n" +
            "         \"gravatar_id\":\"\",\n" +
            "         \"url\":\"https://api.github.com/users/andela-dJames\",\n" +
            "         \"html_url\":\"https://github.com/andela-dJames\",\n" +
            "         \"followers_url\":\"https://api.github.com/users/andela-dJames/followers\",\n" +
            "         \"following_url\":\"https://api.github.com/users/andela-dJames/following{/other_user}\",\n" +
            "         \"gists_url\":\"https://api.github.com/users/andela-dJames/gists{/gist_id}\",\n" +
            "         \"starred_url\":\"https://api.github.com/users/andela-dJames/starred{/owner}{/repo}\",\n" +
            "         \"subscriptions_url\":\"https://api.github.com/users/andela-dJames/subscriptions\",\n" +
            "         \"organizations_url\":\"https://api.github.com/users/andela-dJames/orgs\",\n" +
            "         \"repos_url\":\"https://api.github.com/users/andela-dJames/repos\",\n" +
            "         \"events_url\":\"https://api.github.com/users/andela-dJames/events{/privacy}\",\n" +
            "         \"received_events_url\":\"https://api.github.com/users/andela-dJames/received_events\",\n" +
            "         \"type\":\"User\",\n" +
            "         \"site_admin\":false,\n" +
            "         \"score\":1.0\n" +
            "      },\n" +
            "      {  \n" +
            "         \"login\":\"superibk\",\n" +
            "         \"id\":4223777,\n" +
            "         \"avatar_url\":\"https://avatars0.githubusercontent.com/u/4223777?v=3\",\n" +
            "         \"gravatar_id\":\"\",\n" +
            "         \"url\":\"https://api.github.com/users/superibk\",\n" +
            "         \"html_url\":\"https://github.com/superibk\",\n" +
            "         \"followers_url\":\"https://api.github.com/users/superibk/followers\",\n" +
            "         \"following_url\":\"https://api.github.com/users/superibk/following{/other_user}\",\n" +
            "         \"gists_url\":\"https://api.github.com/users/superibk/gists{/gist_id}\",\n" +
            "         \"starred_url\":\"https://api.github.com/users/superibk/starred{/owner}{/repo}\",\n" +
            "         \"subscriptions_url\":\"https://api.github.com/users/superibk/subscriptions\",\n" +
            "         \"organizations_url\":\"https://api.github.com/users/superibk/orgs\",\n" +
            "         \"repos_url\":\"https://api.github.com/users/superibk/repos\",\n" +
            "         \"events_url\":\"https://api.github.com/users/superibk/events{/privacy}\",\n" +
            "         \"received_events_url\":\"https://api.github.com/users/superibk/received_events\",\n" +
            "         \"type\":\"User\",\n" +
            "         \"site_admin\":false,\n" +
            "         \"score\":1.0\n" +
            "      },\n" +
            "      {  \n" +
            "         \"login\":\"didagu\",\n" +
            "         \"id\":11537985,\n" +
            "         \"avatar_url\":\"https://avatars2.githubusercontent.com/u/11537985?v=3\",\n" +
            "         \"gravatar_id\":\"\",\n" +
            "         \"url\":\"https://api.github.com/users/didagu\",\n" +
            "         \"html_url\":\"https://github.com/didagu\",\n" +
            "         \"followers_url\":\"https://api.github.com/users/didagu/followers\",\n" +
            "         \"following_url\":\"https://api.github.com/users/didagu/following{/other_user}\",\n" +
            "         \"gists_url\":\"https://api.github.com/users/didagu/gists{/gist_id}\",\n" +
            "         \"starred_url\":\"https://api.github.com/users/didagu/starred{/owner}{/repo}\",\n" +
            "         \"subscriptions_url\":\"https://api.github.com/users/didagu/subscriptions\",\n" +
            "         \"organizations_url\":\"https://api.github.com/users/didagu/orgs\",\n" +
            "         \"repos_url\":\"https://api.github.com/users/didagu/repos\",\n" +
            "         \"events_url\":\"https://api.github.com/users/didagu/events{/privacy}\",\n" +
            "         \"received_events_url\":\"https://api.github.com/users/didagu/received_events\",\n" +
            "         \"type\":\"User\",\n" +
            "         \"site_admin\":false,\n" +
            "         \"score\":1.0\n" +
            "      },\n" +
            "      {  \n" +
            "         \"login\":\"jerryhanks\",\n" +
            "         \"id\":12306753,\n" +
            "         \"avatar_url\":\"https://avatars0.githubusercontent.com/u/12306753?v=3\",\n" +
            "         \"gravatar_id\":\"\",\n" +
            "         \"url\":\"https://api.github.com/users/jerryhanks\",\n" +
            "         \"html_url\":\"https://github.com/jerryhanks\",\n" +
            "         \"followers_url\":\"https://api.github.com/users/jerryhanks/followers\",\n" +
            "         \"following_url\":\"https://api.github.com/users/jerryhanks/following{/other_user}\",\n" +
            "         \"gists_url\":\"https://api.github.com/users/jerryhanks/gists{/gist_id}\",\n" +
            "         \"starred_url\":\"https://api.github.com/users/jerryhanks/starred{/owner}{/repo}\",\n" +
            "         \"subscriptions_url\":\"https://api.github.com/users/jerryhanks/subscriptions\",\n" +
            "         \"organizations_url\":\"https://api.github.com/users/jerryhanks/orgs\",\n" +
            "         \"repos_url\":\"https://api.github.com/users/jerryhanks/repos\",\n" +
            "         \"events_url\":\"https://api.github.com/users/jerryhanks/events{/privacy}\",\n" +
            "         \"received_events_url\":\"https://api.github.com/users/jerryhanks/received_events\",\n" +
            "         \"type\":\"User\",\n" +
            "         \"site_admin\":false,\n" +
            "         \"score\":1.0\n" +
            "      },\n" +
            "      {  \n" +
            "         \"login\":\"donaldepignosis\",\n" +
            "         \"id\":1412129,\n" +
            "         \"avatar_url\":\"https://avatars2.githubusercontent.com/u/1412129?v=3\",\n" +
            "         \"gravatar_id\":\"\",\n" +
            "         \"url\":\"https://api.github.com/users/donaldepignosis\",\n" +
            "         \"html_url\":\"https://github.com/donaldepignosis\",\n" +
            "         \"followers_url\":\"https://api.github.com/users/donaldepignosis/followers\",\n" +
            "         \"following_url\":\"https://api.github.com/users/donaldepignosis/following{/other_user}\",\n" +
            "         \"gists_url\":\"https://api.github.com/users/donaldepignosis/gists{/gist_id}\",\n" +
            "         \"starred_url\":\"https://api.github.com/users/donaldepignosis/starred{/owner}{/repo}\",\n" +
            "         \"subscriptions_url\":\"https://api.github.com/users/donaldepignosis/subscriptions\",\n" +
            "         \"organizations_url\":\"https://api.github.com/users/donaldepignosis/orgs\",\n" +
            "         \"repos_url\":\"https://api.github.com/users/donaldepignosis/repos\",\n" +
            "         \"events_url\":\"https://api.github.com/users/donaldepignosis/events{/privacy}\",\n" +
            "         \"received_events_url\":\"https://api.github.com/users/donaldepignosis/received_events\",\n" +
            "         \"type\":\"User\",\n" +
            "         \"site_admin\":false,\n" +
            "         \"score\":1.0\n" +
            "      },\n" +
            "      {  \n" +
            "         \"login\":\"IreOlaniyan\",\n" +
            "         \"id\":16060037,\n" +
            "         \"avatar_url\":\"https://avatars3.githubusercontent.com/u/16060037?v=3\",\n" +
            "         \"gravatar_id\":\"\",\n" +
            "         \"url\":\"https://api.github.com/users/IreOlaniyan\",\n" +
            "         \"html_url\":\"https://github.com/IreOlaniyan\",\n" +
            "         \"followers_url\":\"https://api.github.com/users/IreOlaniyan/followers\",\n" +
            "         \"following_url\":\"https://api.github.com/users/IreOlaniyan/following{/other_user}\",\n" +
            "         \"gists_url\":\"https://api.github.com/users/IreOlaniyan/gists{/gist_id}\",\n" +
            "         \"starred_url\":\"https://api.github.com/users/IreOlaniyan/starred{/owner}{/repo}\",\n" +
            "         \"subscriptions_url\":\"https://api.github.com/users/IreOlaniyan/subscriptions\",\n" +
            "         \"organizations_url\":\"https://api.github.com/users/IreOlaniyan/orgs\",\n" +
            "         \"repos_url\":\"https://api.github.com/users/IreOlaniyan/repos\",\n" +
            "         \"events_url\":\"https://api.github.com/users/IreOlaniyan/events{/privacy}\",\n" +
            "         \"received_events_url\":\"https://api.github.com/users/IreOlaniyan/received_events\",\n" +
            "         \"type\":\"User\",\n" +
            "         \"site_admin\":false,\n" +
            "         \"score\":1.0\n" +
            "      },\n" +
            "      {  \n" +
            "         \"login\":\"Oziomajnr\",\n" +
            "         \"id\":19992726,\n" +
            "         \"avatar_url\":\"https://avatars0.githubusercontent.com/u/19992726?v=3\",\n" +
            "         \"gravatar_id\":\"\",\n" +
            "         \"url\":\"https://api.github.com/users/Oziomajnr\",\n" +
            "         \"html_url\":\"https://github.com/Oziomajnr\",\n" +
            "         \"followers_url\":\"https://api.github.com/users/Oziomajnr/followers\",\n" +
            "         \"following_url\":\"https://api.github.com/users/Oziomajnr/following{/other_user}\",\n" +
            "         \"gists_url\":\"https://api.github.com/users/Oziomajnr/gists{/gist_id}\",\n" +
            "         \"starred_url\":\"https://api.github.com/users/Oziomajnr/starred{/owner}{/repo}\",\n" +
            "         \"subscriptions_url\":\"https://api.github.com/users/Oziomajnr/subscriptions\",\n" +
            "         \"organizations_url\":\"https://api.github.com/users/Oziomajnr/orgs\",\n" +
            "         \"repos_url\":\"https://api.github.com/users/Oziomajnr/repos\",\n" +
            "         \"events_url\":\"https://api.github.com/users/Oziomajnr/events{/privacy}\",\n" +
            "         \"received_events_url\":\"https://api.github.com/users/Oziomajnr/received_events\",\n" +
            "         \"type\":\"User\",\n" +
            "         \"site_admin\":false,\n" +
            "         \"score\":1.0\n" +
            "      },\n" +
            "      {  \n" +
            "         \"login\":\"mathemandy\",\n" +
            "         \"id\":6526607,\n" +
            "         \"avatar_url\":\"https://avatars0.githubusercontent.com/u/6526607?v=3\",\n" +
            "         \"gravatar_id\":\"\",\n" +
            "         \"url\":\"https://api.github.com/users/mathemandy\",\n" +
            "         \"html_url\":\"https://github.com/mathemandy\",\n" +
            "         \"followers_url\":\"https://api.github.com/users/mathemandy/followers\",\n" +
            "         \"following_url\":\"https://api.github.com/users/mathemandy/following{/other_user}\",\n" +
            "         \"gists_url\":\"https://api.github.com/users/mathemandy/gists{/gist_id}\",\n" +
            "         \"starred_url\":\"https://api.github.com/users/mathemandy/starred{/owner}{/repo}\",\n" +
            "         \"subscriptions_url\":\"https://api.github.com/users/mathemandy/subscriptions\",\n" +
            "         \"organizations_url\":\"https://api.github.com/users/mathemandy/orgs\",\n" +
            "         \"repos_url\":\"https://api.github.com/users/mathemandy/repos\",\n" +
            "         \"events_url\":\"https://api.github.com/users/mathemandy/events{/privacy}\",\n" +
            "         \"received_events_url\":\"https://api.github.com/users/mathemandy/received_events\",\n" +
            "         \"type\":\"User\",\n" +
            "         \"site_admin\":false,\n" +
            "         \"score\":1.0\n" +
            "      },\n" +
            "      {  \n" +
            "         \"login\":\"finkcloud\",\n" +
            "         \"id\":5889921,\n" +
            "         \"avatar_url\":\"https://avatars1.githubusercontent.com/u/5889921?v=3\",\n" +
            "         \"gravatar_id\":\"\",\n" +
            "         \"url\":\"https://api.github.com/users/finkcloud\",\n" +
            "         \"html_url\":\"https://github.com/finkcloud\",\n" +
            "         \"followers_url\":\"https://api.github.com/users/finkcloud/followers\",\n" +
            "         \"following_url\":\"https://api.github.com/users/finkcloud/following{/other_user}\",\n" +
            "         \"gists_url\":\"https://api.github.com/users/finkcloud/gists{/gist_id}\",\n" +
            "         \"starred_url\":\"https://api.github.com/users/finkcloud/starred{/owner}{/repo}\",\n" +
            "         \"subscriptions_url\":\"https://api.github.com/users/finkcloud/subscriptions\",\n" +
            "         \"organizations_url\":\"https://api.github.com/users/finkcloud/orgs\",\n" +
            "         \"repos_url\":\"https://api.github.com/users/finkcloud/repos\",\n" +
            "         \"events_url\":\"https://api.github.com/users/finkcloud/events{/privacy}\",\n" +
            "         \"received_events_url\":\"https://api.github.com/users/finkcloud/received_events\",\n" +
            "         \"type\":\"User\",\n" +
            "         \"site_admin\":false,\n" +
            "         \"score\":1.0\n" +
            "      },\n" +
            "      {  \n" +
            "         \"login\":\"twisstosin\",\n" +
            "         \"id\":12116352,\n" +
            "         \"avatar_url\":\"https://avatars1.githubusercontent.com/u/12116352?v=3\",\n" +
            "         \"gravatar_id\":\"\",\n" +
            "         \"url\":\"https://api.github.com/users/twisstosin\",\n" +
            "         \"html_url\":\"https://github.com/twisstosin\",\n" +
            "         \"followers_url\":\"https://api.github.com/users/twisstosin/followers\",\n" +
            "         \"following_url\":\"https://api.github.com/users/twisstosin/following{/other_user}\",\n" +
            "         \"gists_url\":\"https://api.github.com/users/twisstosin/gists{/gist_id}\",\n" +
            "         \"starred_url\":\"https://api.github.com/users/twisstosin/starred{/owner}{/repo}\",\n" +
            "         \"subscriptions_url\":\"https://api.github.com/users/twisstosin/subscriptions\",\n" +
            "         \"organizations_url\":\"https://api.github.com/users/twisstosin/orgs\",\n" +
            "         \"repos_url\":\"https://api.github.com/users/twisstosin/repos\",\n" +
            "         \"events_url\":\"https://api.github.com/users/twisstosin/events{/privacy}\",\n" +
            "         \"received_events_url\":\"https://api.github.com/users/twisstosin/received_events\",\n" +
            "         \"type\":\"User\",\n" +
            "         \"site_admin\":false,\n" +
            "         \"score\":1.0\n" +
            "      },\n" +
            "      {  \n" +
            "         \"login\":\"Simfa11\",\n" +
            "         \"id\":11083332,\n" +
            "         \"avatar_url\":\"https://avatars0.githubusercontent.com/u/11083332?v=3\",\n" +
            "         \"gravatar_id\":\"\",\n" +
            "         \"url\":\"https://api.github.com/users/Simfa11\",\n" +
            "         \"html_url\":\"https://github.com/Simfa11\",\n" +
            "         \"followers_url\":\"https://api.github.com/users/Simfa11/followers\",\n" +
            "         \"following_url\":\"https://api.github.com/users/Simfa11/following{/other_user}\",\n" +
            "         \"gists_url\":\"https://api.github.com/users/Simfa11/gists{/gist_id}\",\n" +
            "         \"starred_url\":\"https://api.github.com/users/Simfa11/starred{/owner}{/repo}\",\n" +
            "         \"subscriptions_url\":\"https://api.github.com/users/Simfa11/subscriptions\",\n" +
            "         \"organizations_url\":\"https://api.github.com/users/Simfa11/orgs\",\n" +
            "         \"repos_url\":\"https://api.github.com/users/Simfa11/repos\",\n" +
            "         \"events_url\":\"https://api.github.com/users/Simfa11/events{/privacy}\",\n" +
            "         \"received_events_url\":\"https://api.github.com/users/Simfa11/received_events\",\n" +
            "         \"type\":\"User\",\n" +
            "         \"site_admin\":false,\n" +
            "         \"score\":1.0\n" +
            "      }\n" +
            "   ]\n" +
            "}";

    public static ArrayList<Users> extractUsers() {

        // Create an empty ArrayList that we can start adding earthquakes to
        ArrayList<Users> users = new ArrayList<>();

        try {
            JSONObject JSONroot = new JSONObject(LAG_JAVA_DEV);

            JSONArray itemsArray = JSONroot.getJSONArray("items");

            for(int i = 0; i < itemsArray.length(); i++){

                JSONObject itemsObject = itemsArray.getJSONObject(i);

                String username = itemsObject.getString("login");

                String userImg = itemsObject.getString("avatar_url");

                String url  = itemsObject.getString("html_url");

                Users javaDev = new Users(username,userImg,url);
                users.add(javaDev);

            }

        } catch (JSONException e) {
            Log.e("QueryJSON", "Problem parsing the GitUsers JSON results", e);
        }
        return users;
    }

}
