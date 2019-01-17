package edu.uniba.di.lacam.kdde.ws4j;

public class ATest {
public static void main(String[] args) {
	String json="{\r\n" + 
			"  \"audio_src\": \"twilio\",\r\n" + 
			"  \"signals\": [\r\n" + 
			"    \r\n" + 
			"  ],\r\n" + 
			"  \"conversation\": [\r\n" + 
			"    {\r\n" + 
			"      \"from\": 0.0,\r\n" + 
			"      \"to\": 3.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Thank you for calling and burmaster. This is Kaylee speaking. How can I help you?\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8453729\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 1.0,\r\n" + 
			"      \"to\": 6.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Kelly hi. I wanted to go ahead and speak with.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.81026524\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 8.0,\r\n" + 
			"      \"to\": 10.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" Elsa on Oppa\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.6494222\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 11.0,\r\n" + 
			"      \"to\": 12.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" You I\\u0027m sorry. With whom?\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        {\r\n" + 
			"          \"name\": \"Sadness\",\r\n" + 
			"          \"type\": \"ToneAnalyzer\",\r\n" + 
			"          \"featureValue\": \"0.916667\",\r\n" + 
			"          \"featureType\": \" You I\\u0027m sorry. With whom?\",\r\n" + 
			"          \"color\": \"#7e5d4f\"\r\n" + 
			"        }\r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.74084175\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 11.0,\r\n" + 
			"      \"to\": 14.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" Chelsea Canova\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.6816388\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 14.0,\r\n" + 
			"      \"to\": 16.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" Ooh, sure. Let me transfer you.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        {\r\n" + 
			"          \"name\": \"Confident\",\r\n" + 
			"          \"type\": \"ToneAnalyzer\",\r\n" + 
			"          \"featureValue\": \"0.992758\",\r\n" + 
			"          \"featureType\": \" Ooh, sure. Let me transfer you.\",\r\n" + 
			"          \"color\": \"#926a59\"\r\n" + 
			"        }\r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8811898\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 16.0,\r\n" + 
			"      \"to\": 17.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" Thank you.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        {\r\n" + 
			"          \"name\": \"Joy\",\r\n" + 
			"          \"type\": \"ToneAnalyzer\",\r\n" + 
			"          \"featureValue\": \"0.880435\",\r\n" + 
			"          \"featureType\": \" Thank you.\",\r\n" + 
			"          \"color\": \"#9f7563\"\r\n" + 
			"        }\r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8304869\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 19.0,\r\n" + 
			"      \"to\": 19.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 21.0,\r\n" + 
			"      \"to\": 21.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 24.0,\r\n" + 
			"      \"to\": 32.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" environmental stress Chelsea\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8232772\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 33.0,\r\n" + 
			"      \"to\": 36.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" Hey, good, how are you?\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8851522\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 30.0,\r\n" + 
			"      \"to\": 41.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" Hi Chauncey, how are you doing today? I\\u0027m doing good Chelsea. I understand that you\\u0027re the Director of Business Development in inside sales.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.83887243\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 41.0,\r\n" + 
			"      \"to\": 42.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" Yes.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7246623\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 41.0,\r\n" + 
			"      \"to\": 51.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" Perfect Jessie, I think I have something of interest, but I\\u0027m not a hundred percent sure, and I wanted to talk to you for two minutes to establish a relevance a bad time.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.869033\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 52.0,\r\n" + 
			"      \"to\": 59.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" What is it that you\\u0027re offering? I was right in the middle of something, but I did answer my phone. So I got a couple minutes.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        {\r\n" + 
			"          \"name\": \"Tentative\",\r\n" + 
			"          \"type\": \"ToneAnalyzer\",\r\n" + 
			"          \"featureValue\": \"0.84639\",\r\n" + 
			"          \"featureType\": \" What is it that you\\u0027re offering? I was right in the middle of something, but I did answer my phone. So I got a couple minutes.\",\r\n" + 
			"          \"color\": \"#ba8f72\"\r\n" + 
			"        }\r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8862079\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 59.0,\r\n" + 
			"      \"to\": 77.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" All right, cuz you see what we do here is we are I\\u0027m calling you from a company called 35 and what we do is provide you with a ground-level visibility is to get those numbers for you, right?\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8611105\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 75.0,\r\n" + 
			"      \"to\": 76.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" Yes.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.80227214\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 77.0,\r\n" + 
			"      \"to\": 85.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" Perfect and like I was saying so we we we have a platform called telling defy which works.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.88180494\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 84.0,\r\n" + 
			"      \"to\": 87.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" Talent divide is that what you\\u0027re saying?\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8748681\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 87.0,\r\n" + 
			"      \"to\": 89.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" No, I\\u0027m saying that in defy.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.79296654\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 89.0,\r\n" + 
			"      \"to\": 91.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" Okay.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7351574\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 91.0,\r\n" + 
			"      \"to\": 95.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" 75 St. Tal ENT ify\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.71332055\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 96.0,\r\n" + 
			"      \"to\": 98.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" Got it, okay.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7885735\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 99.0,\r\n" + 
			"      \"to\": 100.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" all right, and\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        {\r\n" + 
			"          \"name\": \"Confident\",\r\n" + 
			"          \"type\": \"ToneAnalyzer\",\r\n" + 
			"          \"featureValue\": \"0.989586\",\r\n" + 
			"          \"featureType\": \" all right, and\",\r\n" + 
			"          \"color\": \"#cea583\"\r\n" + 
			"        }\r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8396104\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 101.0,\r\n" + 
			"      \"to\": 104.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" what I was trying to say here is was that\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8870344\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 107.0,\r\n" + 
			"      \"to\": 130.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" which we help you basically improve your sales conversions by over 30% using artificial intelligence. We also help your sales rep convert better by giving detailed inside into the gaps in their sales pitches and help them improve dramatically. We do this at very low cost. It would be great to have a conversation with you about this now.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.89361745\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 129.0,\r\n" + 
			"      \"to\": 132.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" Could you send me some information to my email?\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        {\r\n" + 
			"          \"name\": \"Tentative\",\r\n" + 
			"          \"type\": \"ToneAnalyzer\",\r\n" + 
			"          \"featureValue\": \"0.976993\",\r\n" + 
			"          \"featureType\": \" Could you send me some information to my email?\",\r\n" + 
			"          \"color\": \"#999999\"\r\n" + 
			"        }\r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8899819\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 132.0,\r\n" + 
			"      \"to\": 137.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" Sure, I\\u0027ll go ahead and send it to you. But I also want you to understand. How big is your team the inside sales team?\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        {\r\n" + 
			"          \"name\": \"Confident\",\r\n" + 
			"          \"type\": \"ToneAnalyzer\",\r\n" + 
			"          \"featureValue\": \"0.906441\",\r\n" + 
			"          \"featureType\": \" Sure, I\\u0027ll go ahead and send it to you. But I also want you to understand. How big is your team the inside sales team?\",\r\n" + 
			"          \"color\": \"#777777\"\r\n" + 
			"        }\r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8817022\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 143.0,\r\n" + 
			"      \"to\": 143.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" All right.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        {\r\n" + 
			"          \"name\": \"Confident\",\r\n" + 
			"          \"type\": \"ToneAnalyzer\",\r\n" + 
			"          \"featureValue\": \"0.996934\",\r\n" + 
			"          \"featureType\": \" All right.\",\r\n" + 
			"          \"color\": \"#555555\"\r\n" + 
			"        }\r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.6624054\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 145.0,\r\n" + 
			"      \"to\": 145.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" right\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 137.0,\r\n" + 
			"      \"to\": 150.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" It\\u0027s currently at 15 reps, and we\\u0027re growing to 20 by the end of March and my recruiting efforts go how I need it to go and then possibly up to 33 by next year.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9038311\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 153.0,\r\n" + 
			"      \"to\": 153.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" Yep.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.6270928\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 151.0,\r\n" + 
			"      \"to\": 158.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" Right. That\\u0027s that\\u0027s a very good growth rate. But just I just want you to understand. Do you have a complete visibility on your sales team?\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        {\r\n" + 
			"          \"name\": \"Tentative\",\r\n" + 
			"          \"type\": \"ToneAnalyzer\",\r\n" + 
			"          \"featureValue\": \"0.84639\",\r\n" + 
			"          \"featureType\": \" Right. That\\u0027s that\\u0027s a very good growth rate. But just I just want you to understand. Do you have a complete visibility on your sales team?\",\r\n" + 
			"          \"color\": \"#333333\"\r\n" + 
			"        }\r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8493323\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 158.0,\r\n" + 
			"      \"to\": 159.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" Yes.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7152524\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 163.0,\r\n" + 
			"      \"to\": 164.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" Yes.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7376143\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 160.0,\r\n" + 
			"      \"to\": 165.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" All right. And do you have a CRM and recording? I\\u0027m sure that you would be using a teller, right?\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        {\r\n" + 
			"          \"name\": \"Confident\",\r\n" + 
			"          \"type\": \"ToneAnalyzer\",\r\n" + 
			"          \"featureValue\": \"0.979426\",\r\n" + 
			"          \"featureType\": \" All right. And do you have a CRM and recording? I\\u0027m sure that you would be using a teller, right?\",\r\n" + 
			"          \"color\": \"#111111\"\r\n" + 
			"        }\r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8953864\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 165.0,\r\n" + 
			"      \"to\": 167.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" Yes.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.76436317\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 167.0,\r\n" + 
			"      \"to\": 189.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" Perfect. No traditionally what used to happen. Is that you when you want to check the recording. So you want to check how your customer you know, your customers are responding to your sales reps out. How are you still supporting those, you know, the products that you\\u0027re selling to your customers, you would sample those recordings like you will take out a few number of calls and you will listen to them and try to give them feedback on that, correct.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.89568\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 188.0,\r\n" + 
			"      \"to\": 195.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" We listen we listen to a hundred percent of the calls that result in an appointment here.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.86180264\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 195.0,\r\n" + 
			"      \"to\": 202.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" Right. So you only listen to a hundred percent of the calls that are winning are basically winning those calls or getting an appointment for you.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8787156\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 202.0,\r\n" + 
			"      \"to\": 203.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" Yes.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.71979135\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 214.0,\r\n" + 
			"      \"to\": 216.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" Sure.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.80432785\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 203.0,\r\n" + 
			"      \"to\": 221.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" Right, but what if I can tell you that I can provide you with a platform that listens to hundred percent of the calls that are happening on your inside sales team. I am talking about those calls that you\\u0027re making that are not resulting in appointment and comparing those calls with all the winning calls that you\\u0027re winning reps are making is a get.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.88403744\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 220.0,\r\n" + 
			"      \"to\": 225.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" Sure, like I said, that would be cool. If you could just send me the information so I can review it after hours.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.86205095\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 232.0,\r\n" + 
			"      \"to\": 232.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" hours\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.71914315\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 226.0,\r\n" + 
			"      \"to\": 234.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" Shift no problem. I\\u0027ll go ahead and drop an email. I have your email address here with me as C KO n o p Ka at NYU.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8740506\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 235.0,\r\n" + 
			"      \"to\": 237.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" - master.com\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.76482475\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 234.0,\r\n" + 
			"      \"to\": 238.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" That\\u0027s right. Yep. You got it.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8854572\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 239.0,\r\n" + 
			"      \"to\": 256.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" perfect. So go ahead and drop an email. I I just wanted to tell you before I talk the phone that I have an open slot for this Thursday for an half an hour for a quick demo session about how the exact how the product exactly works if you like what I\\u0027m sending out to you. Can you can you just confirm your ability for Thursday?\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8863213\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 261.0,\r\n" + 
			"      \"to\": 262.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" Sure.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.673407\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 254.0,\r\n" + 
			"      \"to\": 267.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" I don\\u0027t schedule anything on my calendar until I\\u0027ve had a chance to do my research, but I would not be available at that time regardless, so\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8919268\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 265.0,\r\n" + 
			"      \"to\": 271.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" Alright, no problem. Just let me know when I can follow up with you or I\\u0027ll try reaching out to you on Monday or Tuesday next week.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8913286\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 271.0,\r\n" + 
			"      \"to\": 272.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" Sounds good. Alright. Thank you.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.80088186\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 275.0,\r\n" + 
			"      \"to\": 275.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" Bye.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.666292\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 273.0,\r\n" + 
			"      \"to\": 276.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \" Perfect. Thank you very much. Thank you for time. Bye. Bye.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7890424\r\n" + 
			"    }\r\n" + 
			"  ],\r\n" + 
			"  \"wordWiseTranscription\": [\r\n" + 
			"    {\r\n" + 
			"      \"from\": 0.0,\r\n" + 
			"      \"to\": 0.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Thank\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7595041\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 0.0,\r\n" + 
			"      \"to\": 0.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 0.0,\r\n" + 
			"      \"to\": 1.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"for\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 1.0,\r\n" + 
			"      \"to\": 1.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"calling\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 1.0,\r\n" + 
			"      \"to\": 1.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"and\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 1.0,\r\n" + 
			"      \"to\": 1.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"burmaster.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.66450757\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 1.0,\r\n" + 
			"      \"to\": 2.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"This\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7101314\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 2.0,\r\n" + 
			"      \"to\": 2.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"is\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.78627867\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 2.0,\r\n" + 
			"      \"to\": 2.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Kaylee\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.6317849\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 2.0,\r\n" + 
			"      \"to\": 2.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"speaking.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 2.0,\r\n" + 
			"      \"to\": 3.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"How\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 3.0,\r\n" + 
			"      \"to\": 3.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"can\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 3.0,\r\n" + 
			"      \"to\": 3.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 3.0,\r\n" + 
			"      \"to\": 3.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"help\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 3.0,\r\n" + 
			"      \"to\": 3.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you?\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 1.0,\r\n" + 
			"      \"to\": 4.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Kelly\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8631043\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 4.0,\r\n" + 
			"      \"to\": 4.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"hi.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 4.0,\r\n" + 
			"      \"to\": 4.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.73216754\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 4.0,\r\n" + 
			"      \"to\": 5.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"wanted\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.6454521\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 5.0,\r\n" + 
			"      \"to\": 5.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"to\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.5684775\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 5.0,\r\n" + 
			"      \"to\": 5.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"go\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 5.0,\r\n" + 
			"      \"to\": 5.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"ahead\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 5.0,\r\n" + 
			"      \"to\": 5.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"and\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7292586\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 5.0,\r\n" + 
			"      \"to\": 6.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"speak\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 6.0,\r\n" + 
			"      \"to\": 6.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"with.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 8.0,\r\n" + 
			"      \"to\": 9.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Elsa\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.798038\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 9.0,\r\n" + 
			"      \"to\": 10.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"on\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.4288431\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 10.0,\r\n" + 
			"      \"to\": 10.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Oppa\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.72138566\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 11.0,\r\n" + 
			"      \"to\": 11.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"You\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.62891805\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 11.0,\r\n" + 
			"      \"to\": 11.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\\u0027m\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.5799495\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 11.0,\r\n" + 
			"      \"to\": 11.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"sorry.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 11.0,\r\n" + 
			"      \"to\": 12.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"With\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.6696645\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 12.0,\r\n" + 
			"      \"to\": 12.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"whom?\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 11.0,\r\n" + 
			"      \"to\": 13.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Chelsea\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.6581472\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 13.0,\r\n" + 
			"      \"to\": 14.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Canova\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.70513034\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 14.0,\r\n" + 
			"      \"to\": 14.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Ooh,\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.87050104\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 14.0,\r\n" + 
			"      \"to\": 15.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"sure.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7652837\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 15.0,\r\n" + 
			"      \"to\": 15.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Let\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 15.0,\r\n" + 
			"      \"to\": 15.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"me\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 15.0,\r\n" + 
			"      \"to\": 16.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"transfer\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 16.0,\r\n" + 
			"      \"to\": 16.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 16.0,\r\n" + 
			"      \"to\": 17.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Thank\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7481352\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 17.0,\r\n" + 
			"      \"to\": 17.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 19.0,\r\n" + 
			"      \"to\": 19.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 21.0,\r\n" + 
			"      \"to\": 21.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 24.0,\r\n" + 
			"      \"to\": 31.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"environmental\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 31.0,\r\n" + 
			"      \"to\": 31.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"stress\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.6474892\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 31.0,\r\n" + 
			"      \"to\": 32.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Chelsea\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9095038\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 33.0,\r\n" + 
			"      \"to\": 35.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Hey,\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8256227\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 35.0,\r\n" + 
			"      \"to\": 35.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"good,\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 35.0,\r\n" + 
			"      \"to\": 35.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"how\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8839649\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 35.0,\r\n" + 
			"      \"to\": 36.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"are\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8904967\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 36.0,\r\n" + 
			"      \"to\": 36.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you?\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 30.0,\r\n" + 
			"      \"to\": 33.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Hi\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 33.0,\r\n" + 
			"      \"to\": 33.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Chauncey,\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.6210775\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 33.0,\r\n" + 
			"      \"to\": 33.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"how\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 33.0,\r\n" + 
			"      \"to\": 33.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"are\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 33.0,\r\n" + 
			"      \"to\": 34.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 34.0,\r\n" + 
			"      \"to\": 34.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"doing\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 34.0,\r\n" + 
			"      \"to\": 34.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"today?\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 34.0,\r\n" + 
			"      \"to\": 36.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\\u0027m\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 36.0,\r\n" + 
			"      \"to\": 37.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"doing\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 37.0,\r\n" + 
			"      \"to\": 37.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"good\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 37.0,\r\n" + 
			"      \"to\": 37.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Chelsea.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 37.0,\r\n" + 
			"      \"to\": 37.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 37.0,\r\n" + 
			"      \"to\": 38.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"understand\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7648451\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 38.0,\r\n" + 
			"      \"to\": 38.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"that\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.87576306\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 38.0,\r\n" + 
			"      \"to\": 38.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\\u0027re\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 38.0,\r\n" + 
			"      \"to\": 39.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"the\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 39.0,\r\n" + 
			"      \"to\": 39.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Director\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 39.0,\r\n" + 
			"      \"to\": 39.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"of\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 39.0,\r\n" + 
			"      \"to\": 39.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Business\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 39.0,\r\n" + 
			"      \"to\": 39.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Development\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 39.0,\r\n" + 
			"      \"to\": 40.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"in\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.35653552\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 40.0,\r\n" + 
			"      \"to\": 40.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"inside\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.5787945\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 40.0,\r\n" + 
			"      \"to\": 41.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"sales.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.5787945\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 41.0,\r\n" + 
			"      \"to\": 42.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Yes.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7246623\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 41.0,\r\n" + 
			"      \"to\": 43.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Perfect\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.66151667\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 43.0,\r\n" + 
			"      \"to\": 43.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Jessie,\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.36454007\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 43.0,\r\n" + 
			"      \"to\": 43.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 43.0,\r\n" + 
			"      \"to\": 44.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"think\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.44057786\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 44.0,\r\n" + 
			"      \"to\": 44.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 44.0,\r\n" + 
			"      \"to\": 44.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"have\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 44.0,\r\n" + 
			"      \"to\": 44.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"something\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 44.0,\r\n" + 
			"      \"to\": 44.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"of\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 44.0,\r\n" + 
			"      \"to\": 44.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"interest,\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 44.0,\r\n" + 
			"      \"to\": 46.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"but\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 46.0,\r\n" + 
			"      \"to\": 46.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\\u0027m\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 46.0,\r\n" + 
			"      \"to\": 46.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"not\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 46.0,\r\n" + 
			"      \"to\": 46.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"a\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 46.0,\r\n" + 
			"      \"to\": 46.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"hundred\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 46.0,\r\n" + 
			"      \"to\": 46.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"percent\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 46.0,\r\n" + 
			"      \"to\": 47.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"sure,\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 47.0,\r\n" + 
			"      \"to\": 47.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"and\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 47.0,\r\n" + 
			"      \"to\": 48.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 48.0,\r\n" + 
			"      \"to\": 48.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"wanted\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 48.0,\r\n" + 
			"      \"to\": 48.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"to\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 48.0,\r\n" + 
			"      \"to\": 48.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"talk\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 48.0,\r\n" + 
			"      \"to\": 48.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"to\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 48.0,\r\n" + 
			"      \"to\": 48.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 48.0,\r\n" + 
			"      \"to\": 49.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"for\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 49.0,\r\n" + 
			"      \"to\": 49.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"two\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 49.0,\r\n" + 
			"      \"to\": 49.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"minutes\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 49.0,\r\n" + 
			"      \"to\": 49.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"to\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 49.0,\r\n" + 
			"      \"to\": 50.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"establish\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 50.0,\r\n" + 
			"      \"to\": 50.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"a\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 50.0,\r\n" + 
			"      \"to\": 50.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"relevance\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 50.0,\r\n" + 
			"      \"to\": 50.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"a\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.73914194\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 50.0,\r\n" + 
			"      \"to\": 51.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"bad\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 51.0,\r\n" + 
			"      \"to\": 51.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"time.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 52.0,\r\n" + 
			"      \"to\": 54.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"What\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 54.0,\r\n" + 
			"      \"to\": 54.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"is\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 54.0,\r\n" + 
			"      \"to\": 54.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"it\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 54.0,\r\n" + 
			"      \"to\": 54.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"that\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 54.0,\r\n" + 
			"      \"to\": 55.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\\u0027re\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 55.0,\r\n" + 
			"      \"to\": 55.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"offering?\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 55.0,\r\n" + 
			"      \"to\": 56.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.53669745\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 56.0,\r\n" + 
			"      \"to\": 56.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"was\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 56.0,\r\n" + 
			"      \"to\": 56.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"right\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 56.0,\r\n" + 
			"      \"to\": 56.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"in\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.59658265\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 56.0,\r\n" + 
			"      \"to\": 56.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"the\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 56.0,\r\n" + 
			"      \"to\": 56.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"middle\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 56.0,\r\n" + 
			"      \"to\": 57.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"of\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 57.0,\r\n" + 
			"      \"to\": 57.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"something,\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 57.0,\r\n" + 
			"      \"to\": 57.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"but\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 57.0,\r\n" + 
			"      \"to\": 57.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 57.0,\r\n" + 
			"      \"to\": 57.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"did\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 57.0,\r\n" + 
			"      \"to\": 58.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"answer\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 58.0,\r\n" + 
			"      \"to\": 58.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"my\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 58.0,\r\n" + 
			"      \"to\": 58.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"phone.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 58.0,\r\n" + 
			"      \"to\": 58.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"So\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 58.0,\r\n" + 
			"      \"to\": 58.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 58.0,\r\n" + 
			"      \"to\": 59.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"got\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 59.0,\r\n" + 
			"      \"to\": 59.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"a\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 59.0,\r\n" + 
			"      \"to\": 59.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"couple\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 59.0,\r\n" + 
			"      \"to\": 59.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"minutes.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 59.0,\r\n" + 
			"      \"to\": 60.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"All\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.68627286\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 60.0,\r\n" + 
			"      \"to\": 60.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"right,\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.6976543\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 60.0,\r\n" + 
			"      \"to\": 60.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"cuz\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.4873362\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 60.0,\r\n" + 
			"      \"to\": 61.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7307267\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 61.0,\r\n" + 
			"      \"to\": 61.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"see\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 61.0,\r\n" + 
			"      \"to\": 61.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"what\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9031915\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 61.0,\r\n" + 
			"      \"to\": 61.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"we\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 61.0,\r\n" + 
			"      \"to\": 61.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"do\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 61.0,\r\n" + 
			"      \"to\": 61.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"here\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 61.0,\r\n" + 
			"      \"to\": 62.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"is\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 62.0,\r\n" + 
			"      \"to\": 62.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"we\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 62.0,\r\n" + 
			"      \"to\": 63.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"are\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 63.0,\r\n" + 
			"      \"to\": 63.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\\u0027m\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 63.0,\r\n" + 
			"      \"to\": 63.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"calling\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 63.0,\r\n" + 
			"      \"to\": 63.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 63.0,\r\n" + 
			"      \"to\": 63.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"from\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 63.0,\r\n" + 
			"      \"to\": 64.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"a\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.89708036\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 64.0,\r\n" + 
			"      \"to\": 64.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"company\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 64.0,\r\n" + 
			"      \"to\": 64.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"called\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 64.0,\r\n" + 
			"      \"to\": 65.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"35\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 65.0,\r\n" + 
			"      \"to\": 65.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"and\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 65.0,\r\n" + 
			"      \"to\": 65.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"what\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 65.0,\r\n" + 
			"      \"to\": 65.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"we\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 65.0,\r\n" + 
			"      \"to\": 66.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"do\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 66.0,\r\n" + 
			"      \"to\": 66.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"is\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 66.0,\r\n" + 
			"      \"to\": 66.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"provide\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 66.0,\r\n" + 
			"      \"to\": 67.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 67.0,\r\n" + 
			"      \"to\": 67.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"with\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 67.0,\r\n" + 
			"      \"to\": 67.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"a\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 67.0,\r\n" + 
			"      \"to\": 69.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"ground-level\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.720688\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 69.0,\r\n" + 
			"      \"to\": 70.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"visibility\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 70.0,\r\n" + 
			"      \"to\": 70.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"is\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.35584202\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 70.0,\r\n" + 
			"      \"to\": 75.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"to\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 75.0,\r\n" + 
			"      \"to\": 76.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"get\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 76.0,\r\n" + 
			"      \"to\": 76.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"those\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 76.0,\r\n" + 
			"      \"to\": 76.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"numbers\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.71936744\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 76.0,\r\n" + 
			"      \"to\": 76.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"for\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 76.0,\r\n" + 
			"      \"to\": 76.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you,\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 76.0,\r\n" + 
			"      \"to\": 77.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"right?\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 75.0,\r\n" + 
			"      \"to\": 76.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Yes.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.80227214\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 77.0,\r\n" + 
			"      \"to\": 79.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Perfect\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 79.0,\r\n" + 
			"      \"to\": 80.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"and\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 80.0,\r\n" + 
			"      \"to\": 80.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"like\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 80.0,\r\n" + 
			"      \"to\": 80.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 80.0,\r\n" + 
			"      \"to\": 80.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"was\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 80.0,\r\n" + 
			"      \"to\": 80.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"saying\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 80.0,\r\n" + 
			"      \"to\": 81.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"so\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 81.0,\r\n" + 
			"      \"to\": 81.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"we\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 81.0,\r\n" + 
			"      \"to\": 81.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"we\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 81.0,\r\n" + 
			"      \"to\": 82.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"we\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.89060605\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 82.0,\r\n" + 
			"      \"to\": 82.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"have\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 82.0,\r\n" + 
			"      \"to\": 82.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"a\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 82.0,\r\n" + 
			"      \"to\": 82.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"platform\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 82.0,\r\n" + 
			"      \"to\": 83.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"called\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 83.0,\r\n" + 
			"      \"to\": 83.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"telling\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7154444\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 83.0,\r\n" + 
			"      \"to\": 83.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"defy\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.65124047\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 83.0,\r\n" + 
			"      \"to\": 84.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"which\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8354566\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 84.0,\r\n" + 
			"      \"to\": 85.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"works.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 84.0,\r\n" + 
			"      \"to\": 85.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Talent\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8643257\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 85.0,\r\n" + 
			"      \"to\": 86.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"divide\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.70956147\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 86.0,\r\n" + 
			"      \"to\": 86.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"is\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 86.0,\r\n" + 
			"      \"to\": 86.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"that\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8988356\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 86.0,\r\n" + 
			"      \"to\": 86.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"what\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 86.0,\r\n" + 
			"      \"to\": 86.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\\u0027re\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 86.0,\r\n" + 
			"      \"to\": 87.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"saying?\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 87.0,\r\n" + 
			"      \"to\": 87.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"No,\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7205095\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 87.0,\r\n" + 
			"      \"to\": 88.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\\u0027m\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 88.0,\r\n" + 
			"      \"to\": 88.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"saying\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 88.0,\r\n" + 
			"      \"to\": 88.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"that\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 88.0,\r\n" + 
			"      \"to\": 88.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"in\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.713251\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 88.0,\r\n" + 
			"      \"to\": 89.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"defy.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.58552253\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 89.0,\r\n" + 
			"      \"to\": 91.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Okay.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7351574\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 91.0,\r\n" + 
			"      \"to\": 92.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"75\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7938924\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 92.0,\r\n" + 
			"      \"to\": 92.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"St.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8662256\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 92.0,\r\n" + 
			"      \"to\": 94.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Tal\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.90141636\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 94.0,\r\n" + 
			"      \"to\": 95.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"ENT\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.38719058\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 95.0,\r\n" + 
			"      \"to\": 95.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"ify\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.6178778\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 96.0,\r\n" + 
			"      \"to\": 97.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Got\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.72526824\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 97.0,\r\n" + 
			"      \"to\": 97.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"it,\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 97.0,\r\n" + 
			"      \"to\": 98.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"okay.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.72761375\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 99.0,\r\n" + 
			"      \"to\": 99.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"all\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.6931539\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 99.0,\r\n" + 
			"      \"to\": 99.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"right,\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 99.0,\r\n" + 
			"      \"to\": 100.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"and\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 101.0,\r\n" + 
			"      \"to\": 103.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"what\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8506707\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 103.0,\r\n" + 
			"      \"to\": 103.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.72500485\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 103.0,\r\n" + 
			"      \"to\": 103.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"was\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9047991\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 103.0,\r\n" + 
			"      \"to\": 103.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"trying\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 103.0,\r\n" + 
			"      \"to\": 103.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"to\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 103.0,\r\n" + 
			"      \"to\": 103.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"say\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 103.0,\r\n" + 
			"      \"to\": 104.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"here\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 104.0,\r\n" + 
			"      \"to\": 104.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"is\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 104.0,\r\n" + 
			"      \"to\": 104.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"was\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 104.0,\r\n" + 
			"      \"to\": 104.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"that\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 107.0,\r\n" + 
			"      \"to\": 108.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"which\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.84704447\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 108.0,\r\n" + 
			"      \"to\": 108.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"we\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 108.0,\r\n" + 
			"      \"to\": 108.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"help\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 108.0,\r\n" + 
			"      \"to\": 109.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 109.0,\r\n" + 
			"      \"to\": 109.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"basically\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 109.0,\r\n" + 
			"      \"to\": 109.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"improve\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 109.0,\r\n" + 
			"      \"to\": 110.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"your\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 110.0,\r\n" + 
			"      \"to\": 110.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"sales\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 110.0,\r\n" + 
			"      \"to\": 110.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"conversions\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 110.0,\r\n" + 
			"      \"to\": 111.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"by\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 111.0,\r\n" + 
			"      \"to\": 111.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"over\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 111.0,\r\n" + 
			"      \"to\": 111.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"30%\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.6919997\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 111.0,\r\n" + 
			"      \"to\": 112.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"using\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 112.0,\r\n" + 
			"      \"to\": 113.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"artificial\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9084079\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 113.0,\r\n" + 
			"      \"to\": 113.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"intelligence.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 113.0,\r\n" + 
			"      \"to\": 114.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"We\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.6986547\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 114.0,\r\n" + 
			"      \"to\": 114.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"also\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 114.0,\r\n" + 
			"      \"to\": 115.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"help\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 115.0,\r\n" + 
			"      \"to\": 115.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"your\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 115.0,\r\n" + 
			"      \"to\": 115.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"sales\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7125002\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 115.0,\r\n" + 
			"      \"to\": 115.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"rep\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.6732382\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 115.0,\r\n" + 
			"      \"to\": 116.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"convert\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 116.0,\r\n" + 
			"      \"to\": 116.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"better\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 116.0,\r\n" + 
			"      \"to\": 116.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"by\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 116.0,\r\n" + 
			"      \"to\": 116.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"giving\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 116.0,\r\n" + 
			"      \"to\": 117.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"detailed\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7260252\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 117.0,\r\n" + 
			"      \"to\": 118.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"inside\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9108117\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 118.0,\r\n" + 
			"      \"to\": 118.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"into\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 118.0,\r\n" + 
			"      \"to\": 118.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"the\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 118.0,\r\n" + 
			"      \"to\": 119.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"gaps\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 119.0,\r\n" + 
			"      \"to\": 119.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"in\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 119.0,\r\n" + 
			"      \"to\": 120.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"their\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 120.0,\r\n" + 
			"      \"to\": 120.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"sales\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 120.0,\r\n" + 
			"      \"to\": 120.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"pitches\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 120.0,\r\n" + 
			"      \"to\": 121.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"and\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 121.0,\r\n" + 
			"      \"to\": 121.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"help\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 121.0,\r\n" + 
			"      \"to\": 121.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"them\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 121.0,\r\n" + 
			"      \"to\": 121.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"improve\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 121.0,\r\n" + 
			"      \"to\": 122.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"dramatically.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 123.0,\r\n" + 
			"      \"to\": 124.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"We\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 124.0,\r\n" + 
			"      \"to\": 124.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"do\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 124.0,\r\n" + 
			"      \"to\": 124.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"this\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 124.0,\r\n" + 
			"      \"to\": 124.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"at\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 124.0,\r\n" + 
			"      \"to\": 125.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"very\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 125.0,\r\n" + 
			"      \"to\": 125.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"low\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 125.0,\r\n" + 
			"      \"to\": 125.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"cost.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 125.0,\r\n" + 
			"      \"to\": 125.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"It\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 125.0,\r\n" + 
			"      \"to\": 126.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"would\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 126.0,\r\n" + 
			"      \"to\": 126.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"be\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 126.0,\r\n" + 
			"      \"to\": 126.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"great\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 126.0,\r\n" + 
			"      \"to\": 127.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"to\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 127.0,\r\n" + 
			"      \"to\": 127.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"have\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 127.0,\r\n" + 
			"      \"to\": 127.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"a\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 127.0,\r\n" + 
			"      \"to\": 127.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"conversation\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 127.0,\r\n" + 
			"      \"to\": 128.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"with\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 128.0,\r\n" + 
			"      \"to\": 128.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 128.0,\r\n" + 
			"      \"to\": 128.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"about\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 128.0,\r\n" + 
			"      \"to\": 128.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"this\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 128.0,\r\n" + 
			"      \"to\": 130.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"now.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 129.0,\r\n" + 
			"      \"to\": 130.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Could\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7071293\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 130.0,\r\n" + 
			"      \"to\": 130.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 130.0,\r\n" + 
			"      \"to\": 130.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"send\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 130.0,\r\n" + 
			"      \"to\": 130.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"me\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 130.0,\r\n" + 
			"      \"to\": 130.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"some\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 130.0,\r\n" + 
			"      \"to\": 130.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"information\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 130.0,\r\n" + 
			"      \"to\": 131.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"to\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 131.0,\r\n" + 
			"      \"to\": 131.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"my\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 131.0,\r\n" + 
			"      \"to\": 132.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"email?\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 132.0,\r\n" + 
			"      \"to\": 132.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Sure,\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.72464484\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 132.0,\r\n" + 
			"      \"to\": 133.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\\u0027ll\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 133.0,\r\n" + 
			"      \"to\": 133.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"go\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 133.0,\r\n" + 
			"      \"to\": 133.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"ahead\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 133.0,\r\n" + 
			"      \"to\": 133.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"and\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 133.0,\r\n" + 
			"      \"to\": 133.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"send\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 133.0,\r\n" + 
			"      \"to\": 133.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"it\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 133.0,\r\n" + 
			"      \"to\": 133.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"to\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 133.0,\r\n" + 
			"      \"to\": 134.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 134.0,\r\n" + 
			"      \"to\": 134.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"But\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9021645\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 134.0,\r\n" + 
			"      \"to\": 134.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.91249037\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 134.0,\r\n" + 
			"      \"to\": 134.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"also\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 134.0,\r\n" + 
			"      \"to\": 134.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"want\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7645703\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 134.0,\r\n" + 
			"      \"to\": 135.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7497441\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 135.0,\r\n" + 
			"      \"to\": 135.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"to\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 135.0,\r\n" + 
			"      \"to\": 135.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"understand.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 135.0,\r\n" + 
			"      \"to\": 135.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"How\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 135.0,\r\n" + 
			"      \"to\": 135.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"big\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 135.0,\r\n" + 
			"      \"to\": 136.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"is\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 136.0,\r\n" + 
			"      \"to\": 136.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"your\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 136.0,\r\n" + 
			"      \"to\": 136.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"team\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 136.0,\r\n" + 
			"      \"to\": 136.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"the\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.6450075\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 136.0,\r\n" + 
			"      \"to\": 137.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"inside\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 137.0,\r\n" + 
			"      \"to\": 137.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"sales\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 137.0,\r\n" + 
			"      \"to\": 137.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"team?\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 143.0,\r\n" + 
			"      \"to\": 143.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"All\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.6122682\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 143.0,\r\n" + 
			"      \"to\": 143.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"right.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7125425\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 145.0,\r\n" + 
			"      \"to\": 145.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"right\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 137.0,\r\n" + 
			"      \"to\": 138.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"It\\u0027s\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.88788974\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 138.0,\r\n" + 
			"      \"to\": 138.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"currently\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 138.0,\r\n" + 
			"      \"to\": 139.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"at\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 139.0,\r\n" + 
			"      \"to\": 139.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"15\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 139.0,\r\n" + 
			"      \"to\": 140.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"reps,\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 140.0,\r\n" + 
			"      \"to\": 140.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"and\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 140.0,\r\n" + 
			"      \"to\": 140.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"we\\u0027re\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 140.0,\r\n" + 
			"      \"to\": 140.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"growing\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 140.0,\r\n" + 
			"      \"to\": 141.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"to\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 141.0,\r\n" + 
			"      \"to\": 141.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"20\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 141.0,\r\n" + 
			"      \"to\": 141.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"by\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 141.0,\r\n" + 
			"      \"to\": 141.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"the\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 141.0,\r\n" + 
			"      \"to\": 142.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"end\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 142.0,\r\n" + 
			"      \"to\": 142.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"of\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 142.0,\r\n" + 
			"      \"to\": 142.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"March\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 142.0,\r\n" + 
			"      \"to\": 143.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"and\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.66653585\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 143.0,\r\n" + 
			"      \"to\": 143.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"my\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.90624154\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 143.0,\r\n" + 
			"      \"to\": 143.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"recruiting\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 143.0,\r\n" + 
			"      \"to\": 144.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"efforts\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 144.0,\r\n" + 
			"      \"to\": 144.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"go\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 144.0,\r\n" + 
			"      \"to\": 144.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"how\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 144.0,\r\n" + 
			"      \"to\": 144.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 144.0,\r\n" + 
			"      \"to\": 145.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"need\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 145.0,\r\n" + 
			"      \"to\": 145.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"it\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 145.0,\r\n" + 
			"      \"to\": 145.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"to\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 145.0,\r\n" + 
			"      \"to\": 145.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"go\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 145.0,\r\n" + 
			"      \"to\": 146.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"and\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 146.0,\r\n" + 
			"      \"to\": 146.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"then\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 146.0,\r\n" + 
			"      \"to\": 147.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"possibly\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 147.0,\r\n" + 
			"      \"to\": 147.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"up\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 147.0,\r\n" + 
			"      \"to\": 147.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"to\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 147.0,\r\n" + 
			"      \"to\": 148.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"33\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 148.0,\r\n" + 
			"      \"to\": 149.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"by\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8754337\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 149.0,\r\n" + 
			"      \"to\": 150.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"next\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 150.0,\r\n" + 
			"      \"to\": 150.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"year.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 153.0,\r\n" + 
			"      \"to\": 153.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Yep.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.6270928\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 151.0,\r\n" + 
			"      \"to\": 151.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Right.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 151.0,\r\n" + 
			"      \"to\": 151.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"That\\u0027s\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.90211284\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 151.0,\r\n" + 
			"      \"to\": 151.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"that\\u0027s\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 151.0,\r\n" + 
			"      \"to\": 151.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"a\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 151.0,\r\n" + 
			"      \"to\": 151.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"very\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 151.0,\r\n" + 
			"      \"to\": 152.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"good\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 152.0,\r\n" + 
			"      \"to\": 152.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"growth\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 152.0,\r\n" + 
			"      \"to\": 152.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"rate.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 152.0,\r\n" + 
			"      \"to\": 153.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"But\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 153.0,\r\n" + 
			"      \"to\": 153.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"just\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.5149858\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 153.0,\r\n" + 
			"      \"to\": 153.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.66668063\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 153.0,\r\n" + 
			"      \"to\": 154.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"just\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.6561655\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 154.0,\r\n" + 
			"      \"to\": 154.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"want\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.6946224\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 154.0,\r\n" + 
			"      \"to\": 154.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8792965\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 154.0,\r\n" + 
			"      \"to\": 154.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"to\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 154.0,\r\n" + 
			"      \"to\": 154.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"understand.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 154.0,\r\n" + 
			"      \"to\": 155.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Do\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.59616166\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 155.0,\r\n" + 
			"      \"to\": 155.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 155.0,\r\n" + 
			"      \"to\": 155.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"have\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.74152464\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 155.0,\r\n" + 
			"      \"to\": 155.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"a\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 155.0,\r\n" + 
			"      \"to\": 156.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"complete\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 156.0,\r\n" + 
			"      \"to\": 156.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"visibility\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 156.0,\r\n" + 
			"      \"to\": 156.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"on\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 156.0,\r\n" + 
			"      \"to\": 157.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"your\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 157.0,\r\n" + 
			"      \"to\": 157.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"sales\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 157.0,\r\n" + 
			"      \"to\": 158.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"team?\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 158.0,\r\n" + 
			"      \"to\": 159.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Yes.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7152524\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 163.0,\r\n" + 
			"      \"to\": 164.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Yes.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7376143\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 160.0,\r\n" + 
			"      \"to\": 160.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"All\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.75350153\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 160.0,\r\n" + 
			"      \"to\": 160.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"right.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 160.0,\r\n" + 
			"      \"to\": 160.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"And\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 160.0,\r\n" + 
			"      \"to\": 161.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"do\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 161.0,\r\n" + 
			"      \"to\": 161.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 161.0,\r\n" + 
			"      \"to\": 161.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"have\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 161.0,\r\n" + 
			"      \"to\": 161.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"a\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 161.0,\r\n" + 
			"      \"to\": 161.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"CRM\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 161.0,\r\n" + 
			"      \"to\": 162.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"and\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 162.0,\r\n" + 
			"      \"to\": 163.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"recording?\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.88280034\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 163.0,\r\n" + 
			"      \"to\": 164.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\\u0027m\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7531708\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 164.0,\r\n" + 
			"      \"to\": 164.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"sure\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 164.0,\r\n" + 
			"      \"to\": 164.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"that\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 164.0,\r\n" + 
			"      \"to\": 164.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 164.0,\r\n" + 
			"      \"to\": 165.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"would\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 165.0,\r\n" + 
			"      \"to\": 165.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"be\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 165.0,\r\n" + 
			"      \"to\": 165.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"using\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 165.0,\r\n" + 
			"      \"to\": 165.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"a\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 165.0,\r\n" + 
			"      \"to\": 165.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"teller,\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 165.0,\r\n" + 
			"      \"to\": 165.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"right?\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 165.0,\r\n" + 
			"      \"to\": 167.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Yes.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.76436317\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 167.0,\r\n" + 
			"      \"to\": 168.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Perfect.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 168.0,\r\n" + 
			"      \"to\": 168.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"No\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9015647\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 168.0,\r\n" + 
			"      \"to\": 169.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"traditionally\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 169.0,\r\n" + 
			"      \"to\": 169.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"what\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 169.0,\r\n" + 
			"      \"to\": 169.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"used\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 169.0,\r\n" + 
			"      \"to\": 169.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"to\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 169.0,\r\n" + 
			"      \"to\": 169.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"happen.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 169.0,\r\n" + 
			"      \"to\": 170.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Is\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 170.0,\r\n" + 
			"      \"to\": 170.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"that\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 170.0,\r\n" + 
			"      \"to\": 170.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 170.0,\r\n" + 
			"      \"to\": 171.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"when\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9072416\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 171.0,\r\n" + 
			"      \"to\": 171.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 171.0,\r\n" + 
			"      \"to\": 171.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"want\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 171.0,\r\n" + 
			"      \"to\": 171.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"to\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 171.0,\r\n" + 
			"      \"to\": 171.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"check\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 171.0,\r\n" + 
			"      \"to\": 171.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"the\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 171.0,\r\n" + 
			"      \"to\": 172.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"recording.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 172.0,\r\n" + 
			"      \"to\": 172.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"So\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 172.0,\r\n" + 
			"      \"to\": 172.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 172.0,\r\n" + 
			"      \"to\": 172.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"want\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 172.0,\r\n" + 
			"      \"to\": 172.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"to\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 172.0,\r\n" + 
			"      \"to\": 172.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"check\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 172.0,\r\n" + 
			"      \"to\": 173.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"how\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 173.0,\r\n" + 
			"      \"to\": 173.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"your\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 173.0,\r\n" + 
			"      \"to\": 174.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"customer\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 174.0,\r\n" + 
			"      \"to\": 174.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 174.0,\r\n" + 
			"      \"to\": 174.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"know,\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 174.0,\r\n" + 
			"      \"to\": 174.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"your\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 174.0,\r\n" + 
			"      \"to\": 175.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"customers\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 175.0,\r\n" + 
			"      \"to\": 175.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"are\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 175.0,\r\n" + 
			"      \"to\": 175.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"responding\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 175.0,\r\n" + 
			"      \"to\": 176.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"to\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 176.0,\r\n" + 
			"      \"to\": 176.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"your\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 176.0,\r\n" + 
			"      \"to\": 176.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"sales\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 176.0,\r\n" + 
			"      \"to\": 176.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"reps\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 176.0,\r\n" + 
			"      \"to\": 176.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"out.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.40407687\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 176.0,\r\n" + 
			"      \"to\": 177.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"How\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7059558\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 177.0,\r\n" + 
			"      \"to\": 177.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"are\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.67702043\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 177.0,\r\n" + 
			"      \"to\": 177.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 177.0,\r\n" + 
			"      \"to\": 177.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"still\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 177.0,\r\n" + 
			"      \"to\": 177.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"supporting\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 177.0,\r\n" + 
			"      \"to\": 178.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"those,\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 178.0,\r\n" + 
			"      \"to\": 179.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.85839534\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 179.0,\r\n" + 
			"      \"to\": 179.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"know,\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 179.0,\r\n" + 
			"      \"to\": 179.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"the\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 179.0,\r\n" + 
			"      \"to\": 180.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"products\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 180.0,\r\n" + 
			"      \"to\": 180.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"that\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 180.0,\r\n" + 
			"      \"to\": 180.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\\u0027re\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 180.0,\r\n" + 
			"      \"to\": 180.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"selling\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 180.0,\r\n" + 
			"      \"to\": 180.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"to\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 180.0,\r\n" + 
			"      \"to\": 181.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"your\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 181.0,\r\n" + 
			"      \"to\": 181.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"customers,\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 181.0,\r\n" + 
			"      \"to\": 181.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 181.0,\r\n" + 
			"      \"to\": 182.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"would\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 182.0,\r\n" + 
			"      \"to\": 182.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"sample\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 182.0,\r\n" + 
			"      \"to\": 182.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"those\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 182.0,\r\n" + 
			"      \"to\": 183.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"recordings\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 183.0,\r\n" + 
			"      \"to\": 183.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"like\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 183.0,\r\n" + 
			"      \"to\": 184.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 184.0,\r\n" + 
			"      \"to\": 184.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"will\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 184.0,\r\n" + 
			"      \"to\": 184.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"take\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 184.0,\r\n" + 
			"      \"to\": 184.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"out\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 184.0,\r\n" + 
			"      \"to\": 184.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"a\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 184.0,\r\n" + 
			"      \"to\": 184.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"few\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 184.0,\r\n" + 
			"      \"to\": 185.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"number\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 185.0,\r\n" + 
			"      \"to\": 185.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"of\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 185.0,\r\n" + 
			"      \"to\": 185.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"calls\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 185.0,\r\n" + 
			"      \"to\": 185.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"and\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 185.0,\r\n" + 
			"      \"to\": 185.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 185.0,\r\n" + 
			"      \"to\": 186.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"will\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 186.0,\r\n" + 
			"      \"to\": 186.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"listen\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 186.0,\r\n" + 
			"      \"to\": 186.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"to\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 186.0,\r\n" + 
			"      \"to\": 186.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"them\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 186.0,\r\n" + 
			"      \"to\": 186.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"and\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 186.0,\r\n" + 
			"      \"to\": 187.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"try\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.73637915\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 187.0,\r\n" + 
			"      \"to\": 187.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"to\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.74966353\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 187.0,\r\n" + 
			"      \"to\": 187.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"give\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8682497\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 187.0,\r\n" + 
			"      \"to\": 187.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"them\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 187.0,\r\n" + 
			"      \"to\": 187.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"feedback\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 187.0,\r\n" + 
			"      \"to\": 188.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"on\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 188.0,\r\n" + 
			"      \"to\": 188.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"that,\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 188.0,\r\n" + 
			"      \"to\": 189.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"correct.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 188.0,\r\n" + 
			"      \"to\": 189.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"We\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7148118\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 189.0,\r\n" + 
			"      \"to\": 189.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"listen\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.60235554\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 189.0,\r\n" + 
			"      \"to\": 190.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"we\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 190.0,\r\n" + 
			"      \"to\": 190.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"listen\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8797638\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 190.0,\r\n" + 
			"      \"to\": 190.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"to\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.6691396\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 190.0,\r\n" + 
			"      \"to\": 190.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"a\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 190.0,\r\n" + 
			"      \"to\": 190.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"hundred\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 190.0,\r\n" + 
			"      \"to\": 191.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"percent\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 191.0,\r\n" + 
			"      \"to\": 191.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"of\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 191.0,\r\n" + 
			"      \"to\": 191.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"the\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 191.0,\r\n" + 
			"      \"to\": 191.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"calls\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 191.0,\r\n" + 
			"      \"to\": 192.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"that\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 192.0,\r\n" + 
			"      \"to\": 193.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"result\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8999994\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 193.0,\r\n" + 
			"      \"to\": 193.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"in\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 193.0,\r\n" + 
			"      \"to\": 194.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"an\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 194.0,\r\n" + 
			"      \"to\": 194.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"appointment\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 194.0,\r\n" + 
			"      \"to\": 195.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"here.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.84334934\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 195.0,\r\n" + 
			"      \"to\": 196.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Right.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7252189\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 196.0,\r\n" + 
			"      \"to\": 196.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"So\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 196.0,\r\n" + 
			"      \"to\": 196.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 196.0,\r\n" + 
			"      \"to\": 196.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"only\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 196.0,\r\n" + 
			"      \"to\": 197.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"listen\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7465374\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 197.0,\r\n" + 
			"      \"to\": 197.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"to\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 197.0,\r\n" + 
			"      \"to\": 197.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"a\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7894442\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 197.0,\r\n" + 
			"      \"to\": 197.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"hundred\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 197.0,\r\n" + 
			"      \"to\": 197.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"percent\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 197.0,\r\n" + 
			"      \"to\": 197.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"of\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 197.0,\r\n" + 
			"      \"to\": 197.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"the\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 197.0,\r\n" + 
			"      \"to\": 198.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"calls\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 198.0,\r\n" + 
			"      \"to\": 198.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"that\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 198.0,\r\n" + 
			"      \"to\": 198.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"are\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.68713963\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 198.0,\r\n" + 
			"      \"to\": 198.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"winning\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8900911\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 198.0,\r\n" + 
			"      \"to\": 199.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"are\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.75140524\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 199.0,\r\n" + 
			"      \"to\": 199.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"basically\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 199.0,\r\n" + 
			"      \"to\": 200.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"winning\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 200.0,\r\n" + 
			"      \"to\": 200.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"those\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 200.0,\r\n" + 
			"      \"to\": 200.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"calls\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 200.0,\r\n" + 
			"      \"to\": 201.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"or\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 201.0,\r\n" + 
			"      \"to\": 201.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"getting\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 201.0,\r\n" + 
			"      \"to\": 201.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"an\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 201.0,\r\n" + 
			"      \"to\": 201.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"appointment\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 201.0,\r\n" + 
			"      \"to\": 202.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"for\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 202.0,\r\n" + 
			"      \"to\": 202.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 202.0,\r\n" + 
			"      \"to\": 203.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Yes.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.71979135\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 214.0,\r\n" + 
			"      \"to\": 216.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Sure.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.80432785\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 203.0,\r\n" + 
			"      \"to\": 204.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Right,\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8719662\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 204.0,\r\n" + 
			"      \"to\": 204.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"but\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.90007544\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 204.0,\r\n" + 
			"      \"to\": 204.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"what\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 204.0,\r\n" + 
			"      \"to\": 205.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"if\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7886018\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 205.0,\r\n" + 
			"      \"to\": 205.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8736921\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 205.0,\r\n" + 
			"      \"to\": 205.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"can\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 205.0,\r\n" + 
			"      \"to\": 205.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"tell\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 205.0,\r\n" + 
			"      \"to\": 205.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 205.0,\r\n" + 
			"      \"to\": 205.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"that\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 205.0,\r\n" + 
			"      \"to\": 206.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 206.0,\r\n" + 
			"      \"to\": 206.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"can\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 206.0,\r\n" + 
			"      \"to\": 206.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"provide\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 206.0,\r\n" + 
			"      \"to\": 206.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 206.0,\r\n" + 
			"      \"to\": 206.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"with\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 206.0,\r\n" + 
			"      \"to\": 206.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"a\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 206.0,\r\n" + 
			"      \"to\": 207.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"platform\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 207.0,\r\n" + 
			"      \"to\": 207.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"that\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 207.0,\r\n" + 
			"      \"to\": 207.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"listens\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 207.0,\r\n" + 
			"      \"to\": 207.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"to\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 207.0,\r\n" + 
			"      \"to\": 208.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"hundred\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 208.0,\r\n" + 
			"      \"to\": 208.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"percent\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 208.0,\r\n" + 
			"      \"to\": 208.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"of\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 208.0,\r\n" + 
			"      \"to\": 208.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"the\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 208.0,\r\n" + 
			"      \"to\": 208.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"calls\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 208.0,\r\n" + 
			"      \"to\": 209.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"that\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 209.0,\r\n" + 
			"      \"to\": 209.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"are\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 209.0,\r\n" + 
			"      \"to\": 209.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"happening\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 209.0,\r\n" + 
			"      \"to\": 209.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"on\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 209.0,\r\n" + 
			"      \"to\": 209.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"your\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 209.0,\r\n" + 
			"      \"to\": 210.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"inside\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.66402286\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 210.0,\r\n" + 
			"      \"to\": 210.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"sales\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.6640229\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 210.0,\r\n" + 
			"      \"to\": 210.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"team.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.66402286\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 210.0,\r\n" + 
			"      \"to\": 211.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.40090582\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 211.0,\r\n" + 
			"      \"to\": 211.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"am\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 211.0,\r\n" + 
			"      \"to\": 212.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"talking\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7185684\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 212.0,\r\n" + 
			"      \"to\": 212.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"about\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.71045774\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 212.0,\r\n" + 
			"      \"to\": 212.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"those\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 212.0,\r\n" + 
			"      \"to\": 213.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"calls\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 213.0,\r\n" + 
			"      \"to\": 213.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"that\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 213.0,\r\n" + 
			"      \"to\": 213.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\\u0027re\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 213.0,\r\n" + 
			"      \"to\": 213.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"making\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 213.0,\r\n" + 
			"      \"to\": 213.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"that\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 213.0,\r\n" + 
			"      \"to\": 214.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"are\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 214.0,\r\n" + 
			"      \"to\": 214.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"not\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 214.0,\r\n" + 
			"      \"to\": 214.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"resulting\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 214.0,\r\n" + 
			"      \"to\": 214.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"in\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 214.0,\r\n" + 
			"      \"to\": 215.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"appointment\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 215.0,\r\n" + 
			"      \"to\": 216.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"and\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 216.0,\r\n" + 
			"      \"to\": 216.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"comparing\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 216.0,\r\n" + 
			"      \"to\": 216.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"those\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 216.0,\r\n" + 
			"      \"to\": 217.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"calls\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 217.0,\r\n" + 
			"      \"to\": 217.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"with\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 217.0,\r\n" + 
			"      \"to\": 217.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"all\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 217.0,\r\n" + 
			"      \"to\": 218.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"the\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 218.0,\r\n" + 
			"      \"to\": 218.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"winning\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 218.0,\r\n" + 
			"      \"to\": 218.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"calls\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 218.0,\r\n" + 
			"      \"to\": 218.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"that\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 218.0,\r\n" + 
			"      \"to\": 219.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\\u0027re\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 219.0,\r\n" + 
			"      \"to\": 219.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"winning\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 219.0,\r\n" + 
			"      \"to\": 219.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"reps\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 219.0,\r\n" + 
			"      \"to\": 219.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"are\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 219.0,\r\n" + 
			"      \"to\": 220.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"making\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 220.0,\r\n" + 
			"      \"to\": 221.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"is\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 221.0,\r\n" + 
			"      \"to\": 221.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"a\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 221.0,\r\n" + 
			"      \"to\": 221.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"get.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 220.0,\r\n" + 
			"      \"to\": 221.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Sure,\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.71734643\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 221.0,\r\n" + 
			"      \"to\": 221.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"like\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 221.0,\r\n" + 
			"      \"to\": 221.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.62993175\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 221.0,\r\n" + 
			"      \"to\": 221.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"said,\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.72671485\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 221.0,\r\n" + 
			"      \"to\": 221.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"that\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7081901\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 221.0,\r\n" + 
			"      \"to\": 222.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"would\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 222.0,\r\n" + 
			"      \"to\": 222.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"be\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 222.0,\r\n" + 
			"      \"to\": 222.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"cool.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 222.0,\r\n" + 
			"      \"to\": 222.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"If\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 222.0,\r\n" + 
			"      \"to\": 222.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 222.0,\r\n" + 
			"      \"to\": 222.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"could\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 222.0,\r\n" + 
			"      \"to\": 222.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"just\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 222.0,\r\n" + 
			"      \"to\": 223.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"send\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 223.0,\r\n" + 
			"      \"to\": 223.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"me\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 223.0,\r\n" + 
			"      \"to\": 223.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"the\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 223.0,\r\n" + 
			"      \"to\": 223.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"information\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 223.0,\r\n" + 
			"      \"to\": 224.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"so\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 224.0,\r\n" + 
			"      \"to\": 224.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7243097\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 224.0,\r\n" + 
			"      \"to\": 224.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"can\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 224.0,\r\n" + 
			"      \"to\": 224.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"review\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.85763025\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 224.0,\r\n" + 
			"      \"to\": 224.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"it\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.85763025\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 224.0,\r\n" + 
			"      \"to\": 224.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"after\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 224.0,\r\n" + 
			"      \"to\": 225.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"hours.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 232.0,\r\n" + 
			"      \"to\": 232.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"hours\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.71914315\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 226.0,\r\n" + 
			"      \"to\": 226.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Shift\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.72002447\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 226.0,\r\n" + 
			"      \"to\": 226.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"no\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 226.0,\r\n" + 
			"      \"to\": 227.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"problem.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7542126\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 227.0,\r\n" + 
			"      \"to\": 227.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\\u0027ll\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 227.0,\r\n" + 
			"      \"to\": 227.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"go\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 227.0,\r\n" + 
			"      \"to\": 227.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"ahead\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 227.0,\r\n" + 
			"      \"to\": 227.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"and\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 227.0,\r\n" + 
			"      \"to\": 227.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"drop\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 227.0,\r\n" + 
			"      \"to\": 227.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"an\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 227.0,\r\n" + 
			"      \"to\": 227.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"email.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 227.0,\r\n" + 
			"      \"to\": 228.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 228.0,\r\n" + 
			"      \"to\": 228.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"have\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 228.0,\r\n" + 
			"      \"to\": 228.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"your\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 228.0,\r\n" + 
			"      \"to\": 228.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"email\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 228.0,\r\n" + 
			"      \"to\": 228.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"address\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 228.0,\r\n" + 
			"      \"to\": 229.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"here\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 229.0,\r\n" + 
			"      \"to\": 229.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"with\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 229.0,\r\n" + 
			"      \"to\": 229.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"me\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 229.0,\r\n" + 
			"      \"to\": 230.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"as\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 230.0,\r\n" + 
			"      \"to\": 231.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"C\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 231.0,\r\n" + 
			"      \"to\": 232.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"KO\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 232.0,\r\n" + 
			"      \"to\": 232.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"n\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7827338\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 232.0,\r\n" + 
			"      \"to\": 233.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"o\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7866916\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 233.0,\r\n" + 
			"      \"to\": 233.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"p\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7866916\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 233.0,\r\n" + 
			"      \"to\": 233.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Ka\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7866916\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 233.0,\r\n" + 
			"      \"to\": 234.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"at\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7255504\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 234.0,\r\n" + 
			"      \"to\": 234.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"NYU.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 235.0,\r\n" + 
			"      \"to\": 236.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"-\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.75131947\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 236.0,\r\n" + 
			"      \"to\": 237.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"master.com\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.77832997\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 234.0,\r\n" + 
			"      \"to\": 236.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"That\\u0027s\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.813107\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 236.0,\r\n" + 
			"      \"to\": 236.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"right.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 237.0,\r\n" + 
			"      \"to\": 238.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Yep.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8482822\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 238.0,\r\n" + 
			"      \"to\": 238.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"You\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 238.0,\r\n" + 
			"      \"to\": 238.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"got\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 238.0,\r\n" + 
			"      \"to\": 238.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"it.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 239.0,\r\n" + 
			"      \"to\": 239.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"perfect.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 239.0,\r\n" + 
			"      \"to\": 240.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"So\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 240.0,\r\n" + 
			"      \"to\": 240.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"go\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 240.0,\r\n" + 
			"      \"to\": 240.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"ahead\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 240.0,\r\n" + 
			"      \"to\": 240.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"and\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 240.0,\r\n" + 
			"      \"to\": 240.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"drop\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.5955115\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 240.0,\r\n" + 
			"      \"to\": 240.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"an\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.50902694\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 240.0,\r\n" + 
			"      \"to\": 240.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"email.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 240.0,\r\n" + 
			"      \"to\": 241.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.4805395\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 241.0,\r\n" + 
			"      \"to\": 242.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.68542844\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 242.0,\r\n" + 
			"      \"to\": 242.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"just\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 242.0,\r\n" + 
			"      \"to\": 242.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"wanted\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.755252\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 242.0,\r\n" + 
			"      \"to\": 242.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"to\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.6763788\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 242.0,\r\n" + 
			"      \"to\": 242.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"tell\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 242.0,\r\n" + 
			"      \"to\": 242.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 242.0,\r\n" + 
			"      \"to\": 242.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"before\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 242.0,\r\n" + 
			"      \"to\": 243.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 243.0,\r\n" + 
			"      \"to\": 243.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"talk\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 243.0,\r\n" + 
			"      \"to\": 243.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"the\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 243.0,\r\n" + 
			"      \"to\": 243.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"phone\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 243.0,\r\n" + 
			"      \"to\": 243.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"that\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 243.0,\r\n" + 
			"      \"to\": 243.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 243.0,\r\n" + 
			"      \"to\": 243.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"have\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 243.0,\r\n" + 
			"      \"to\": 244.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"an\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 244.0,\r\n" + 
			"      \"to\": 244.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"open\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 244.0,\r\n" + 
			"      \"to\": 244.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"slot\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 244.0,\r\n" + 
			"      \"to\": 245.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"for\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 245.0,\r\n" + 
			"      \"to\": 245.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"this\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 245.0,\r\n" + 
			"      \"to\": 246.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Thursday\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 246.0,\r\n" + 
			"      \"to\": 246.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"for\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 246.0,\r\n" + 
			"      \"to\": 247.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"an\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 247.0,\r\n" + 
			"      \"to\": 247.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"half\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 247.0,\r\n" + 
			"      \"to\": 247.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"an\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 247.0,\r\n" + 
			"      \"to\": 247.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"hour\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 247.0,\r\n" + 
			"      \"to\": 248.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"for\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 248.0,\r\n" + 
			"      \"to\": 248.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"a\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 248.0,\r\n" + 
			"      \"to\": 248.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"quick\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 248.0,\r\n" + 
			"      \"to\": 248.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"demo\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 248.0,\r\n" + 
			"      \"to\": 249.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"session\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 249.0,\r\n" + 
			"      \"to\": 249.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"about\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 249.0,\r\n" + 
			"      \"to\": 249.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"how\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 249.0,\r\n" + 
			"      \"to\": 249.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"the\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 249.0,\r\n" + 
			"      \"to\": 250.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"exact\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 250.0,\r\n" + 
			"      \"to\": 250.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"how\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 250.0,\r\n" + 
			"      \"to\": 250.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"the\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 250.0,\r\n" + 
			"      \"to\": 250.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"product\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 250.0,\r\n" + 
			"      \"to\": 251.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"exactly\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 251.0,\r\n" + 
			"      \"to\": 251.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"works\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 251.0,\r\n" + 
			"      \"to\": 252.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"if\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 252.0,\r\n" + 
			"      \"to\": 252.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 252.0,\r\n" + 
			"      \"to\": 252.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"like\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 252.0,\r\n" + 
			"      \"to\": 253.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"what\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 253.0,\r\n" + 
			"      \"to\": 253.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\\u0027m\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 253.0,\r\n" + 
			"      \"to\": 253.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"sending\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 253.0,\r\n" + 
			"      \"to\": 253.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"out\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 253.0,\r\n" + 
			"      \"to\": 253.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"to\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 253.0,\r\n" + 
			"      \"to\": 253.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 253.0,\r\n" + 
			"      \"to\": 253.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Can\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 253.0,\r\n" + 
			"      \"to\": 254.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 254.0,\r\n" + 
			"      \"to\": 254.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"can\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 254.0,\r\n" + 
			"      \"to\": 254.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 254.0,\r\n" + 
			"      \"to\": 254.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"just\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 254.0,\r\n" + 
			"      \"to\": 254.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"confirm\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 254.0,\r\n" + 
			"      \"to\": 255.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"your\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.91109836\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 255.0,\r\n" + 
			"      \"to\": 255.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"ability\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 255.0,\r\n" + 
			"      \"to\": 255.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"for\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 255.0,\r\n" + 
			"      \"to\": 256.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Thursday?\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 261.0,\r\n" + 
			"      \"to\": 262.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Sure.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.673407\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 254.0,\r\n" + 
			"      \"to\": 257.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 257.0,\r\n" + 
			"      \"to\": 258.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"don\\u0027t\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 258.0,\r\n" + 
			"      \"to\": 258.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"schedule\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 258.0,\r\n" + 
			"      \"to\": 258.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"anything\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 258.0,\r\n" + 
			"      \"to\": 259.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"on\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 259.0,\r\n" + 
			"      \"to\": 259.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"my\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 259.0,\r\n" + 
			"      \"to\": 259.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"calendar\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 259.0,\r\n" + 
			"      \"to\": 259.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"until\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 259.0,\r\n" + 
			"      \"to\": 259.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\\u0027ve\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 259.0,\r\n" + 
			"      \"to\": 260.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"had\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 260.0,\r\n" + 
			"      \"to\": 260.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"a\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 260.0,\r\n" + 
			"      \"to\": 260.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"chance\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 260.0,\r\n" + 
			"      \"to\": 260.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"to\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 260.0,\r\n" + 
			"      \"to\": 260.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"do\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 260.0,\r\n" + 
			"      \"to\": 260.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"my\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 260.0,\r\n" + 
			"      \"to\": 261.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"research,\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 261.0,\r\n" + 
			"      \"to\": 262.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"but\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.62022066\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 262.0,\r\n" + 
			"      \"to\": 262.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.694162\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 262.0,\r\n" + 
			"      \"to\": 262.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"would\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 262.0,\r\n" + 
			"      \"to\": 262.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"not\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 262.0,\r\n" + 
			"      \"to\": 262.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"be\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 262.0,\r\n" + 
			"      \"to\": 262.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"available\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.8595186\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 262.0,\r\n" + 
			"      \"to\": 263.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"at\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 263.0,\r\n" + 
			"      \"to\": 263.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"that\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 263.0,\r\n" + 
			"      \"to\": 263.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"time\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 263.0,\r\n" + 
			"      \"to\": 264.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"regardless,\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 264.0,\r\n" + 
			"      \"to\": 267.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"so\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 265.0,\r\n" + 
			"      \"to\": 266.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Alright,\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.50705534\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 266.0,\r\n" + 
			"      \"to\": 266.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"no\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 266.0,\r\n" + 
			"      \"to\": 266.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"problem.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 266.0,\r\n" + 
			"      \"to\": 266.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Just\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.81828266\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 266.0,\r\n" + 
			"      \"to\": 266.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"let\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 266.0,\r\n" + 
			"      \"to\": 266.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"me\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 266.0,\r\n" + 
			"      \"to\": 266.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"know\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 266.0,\r\n" + 
			"      \"to\": 267.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"when\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 267.0,\r\n" + 
			"      \"to\": 267.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 267.0,\r\n" + 
			"      \"to\": 267.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"can\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 267.0,\r\n" + 
			"      \"to\": 268.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"follow\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 268.0,\r\n" + 
			"      \"to\": 268.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"up\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.832412\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 268.0,\r\n" + 
			"      \"to\": 268.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"with\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 268.0,\r\n" + 
			"      \"to\": 268.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 268.0,\r\n" + 
			"      \"to\": 269.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"or\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 269.0,\r\n" + 
			"      \"to\": 269.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"I\\u0027ll\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 269.0,\r\n" + 
			"      \"to\": 269.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"try\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 269.0,\r\n" + 
			"      \"to\": 269.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"reaching\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 269.0,\r\n" + 
			"      \"to\": 269.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"out\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 269.0,\r\n" + 
			"      \"to\": 270.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"to\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 270.0,\r\n" + 
			"      \"to\": 270.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 270.0,\r\n" + 
			"      \"to\": 270.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"on\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 270.0,\r\n" + 
			"      \"to\": 270.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Monday\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 270.0,\r\n" + 
			"      \"to\": 270.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"or\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 270.0,\r\n" + 
			"      \"to\": 271.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Tuesday\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 271.0,\r\n" + 
			"      \"to\": 271.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"next\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 271.0,\r\n" + 
			"      \"to\": 271.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"week.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 271.0,\r\n" + 
			"      \"to\": 271.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Sounds\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7542741\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 271.0,\r\n" + 
			"      \"to\": 272.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"good.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 272.0,\r\n" + 
			"      \"to\": 272.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Alright.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7197788\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 272.0,\r\n" + 
			"      \"to\": 272.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Thank\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.70467955\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 272.0,\r\n" + 
			"      \"to\": 272.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 275.0,\r\n" + 
			"      \"to\": 275.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Bye.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.666292\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 273.0,\r\n" + 
			"      \"to\": 273.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Perfect.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.7839185\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 273.0,\r\n" + 
			"      \"to\": 273.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Thank\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 273.0,\r\n" + 
			"      \"to\": 273.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 273.0,\r\n" + 
			"      \"to\": 274.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"very\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 274.0,\r\n" + 
			"      \"to\": 274.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"much.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 274.0,\r\n" + 
			"      \"to\": 274.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Thank\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 274.0,\r\n" + 
			"      \"to\": 274.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"you\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 274.0,\r\n" + 
			"      \"to\": 274.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"for\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.9128386\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 274.0,\r\n" + 
			"      \"to\": 274.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"time.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.35865286\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 274.0,\r\n" + 
			"      \"to\": 276.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Bye.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.6505215\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"from\": 276.0,\r\n" + 
			"      \"to\": 276.0,\r\n" + 
			"      \"speaker\": \"Customer\",\r\n" + 
			"      \"text\": \"Bye.\",\r\n" + 
			"      \"signals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"invisibleSignals\": [\r\n" + 
			"        \r\n" + 
			"      ],\r\n" + 
			"      \"confidence\": 0.49650362\r\n" + 
			"    }\r\n" + 
			"  ],\r\n" + 
			"  \"audio_url\": \"http://sales.talentify.in/salesdata/twilio/CA33a710d25209a24906174b0705ea0965/REf2e030656746cf62355f31946dab11b1.wav\",\r\n" + 
			"  \"callDuration\": 100,\r\n" + 
			"  \"agentTimeRatio\": 0.0,\r\n" + 
			"  \"CustomerTimeRatio\": 0.0,\r\n" + 
			"  \"agentAmplitudes\": [\r\n" + 
			"    \r\n" + 
			"  ],\r\n" + 
			"  \"customerAmplitudes\": [\r\n" + 
			"    \r\n" + 
			"  ]\r\n" + 
			"}";
}
}
