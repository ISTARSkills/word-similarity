package ai.talentify.db.utils;

import java.util.ArrayList;

public class Analysis {
	String audio_src;
	String twilio_sid;
	String callSid;
	private ArrayList<Signal> signals = new ArrayList<>();;
	private ArrayList<Snippet> conversation = new ArrayList<>();
	private ArrayList<Snippet> wordWiseTranscription = new ArrayList<>();
	private String audio_url;
	private String video_url;
	private Float voiceQuality;
	private Float talkRatio;
	private Float sentiment;
	private Integer callDuration;
	private Float talentifyScore;
	private Float agentTimeRatio = 0.0f;
	private Float CustomerTimeRatio = 0.0f;
	ArrayList<Float> agentAmplitudes = new ArrayList<>();
	ArrayList<Float> customerAmplitudes = new ArrayList<>();

	public ArrayList<Signal> getSignals() {
		return signals;
	}

	public void setSignals(ArrayList<Signal> signals) {
		this.signals = signals;
	}

	public ArrayList<Snippet> getConversation() {
		return conversation;
	}

	public void setConversation(ArrayList<Snippet> conversation) {
		this.conversation = conversation;
	}

	public ArrayList<Snippet> getWordWiseTranscription() {
		return wordWiseTranscription;
	}

	public void setWordWiseTranscription(ArrayList<Snippet> wordWiseTranscription) {
		this.wordWiseTranscription = wordWiseTranscription;
	}

	public String getAudio_url() {
		return audio_url;
	}

	public void setAudio_url(String audio_url) {
		this.audio_url = audio_url;
	}

	public String getVideo_url() {
		return video_url;
	}

	public void setVideo_url(String video_url) {
		this.video_url = video_url;
	}

	public Float getVoiceQuality() {
		return voiceQuality;
	}

	public void setVoiceQuality(Float voiceQuality) {
		this.voiceQuality = voiceQuality;
	}

	public Float getTalkRatio() {
		return talkRatio;
	}

	public void setTalkRatio(Float talkRatio) {
		this.talkRatio = talkRatio;
	}

	public Float getSentiment() {
		return sentiment;
	}

	public void setSentiment(Float sentiment) {
		this.sentiment = sentiment;
	}

	public Integer getCallDuration() {
		return callDuration;
	}

	public void setCallDuration(Integer callDuration) {
		this.callDuration = callDuration;
	}

	public Float getTalentifyScore() {
		return talentifyScore;
	}

	public void setTalentifyScore(Float talentifyScore) {
		this.talentifyScore = talentifyScore;
	}

	public Float getAgentTimeRatio() {
		return agentTimeRatio;
	}

	public void setAgentTimeRatio(Float agentTimeRatio) {
		this.agentTimeRatio = agentTimeRatio;
	}

	public Float getCustomerTimeRatio() {
		return CustomerTimeRatio;
	}

	public void setCustomerTimeRatio(Float customerTimeRatio) {
		CustomerTimeRatio = customerTimeRatio;
	}

	public ArrayList<Float> getAgentAmplitudes() {
		return agentAmplitudes;
	}

	public void setAgentAmplitudes(ArrayList<Float> agentAmplitudes) {
		this.agentAmplitudes = agentAmplitudes;
	}

	public ArrayList<Float> getCustomerAmplitudes() {
		return customerAmplitudes;
	}

	public void setCustomerAmplitudes(ArrayList<Float> customerAmplitudes) {
		this.customerAmplitudes = customerAmplitudes;
	}

	public enum Stages {
		Submitted, Transcripted, Analyzed, INCOMPLETE
	}

	public enum actors {
		Agent, Customer
	}

	public void clean() {
		if (signals == null)
			signals = new ArrayList<>();
		if (conversation == null)
			conversation = new ArrayList<>();
		if (wordWiseTranscription == null)
			wordWiseTranscription = new ArrayList<>();
		if (voiceQuality == null)
			voiceQuality = 0f;
		if (talkRatio == null)
			talkRatio = 0f;
		if (sentiment == null)
			sentiment = 0f;
		if (callDuration == null)
			callDuration = 0;
		if (talentifyScore == null)
			talentifyScore = 0f;
		if (agentTimeRatio == null)
			agentTimeRatio = 50f;
		if (CustomerTimeRatio == null)
			CustomerTimeRatio = 50f;
		if (agentAmplitudes == null)
			agentAmplitudes = new ArrayList<>();
		if (customerAmplitudes == null)
			customerAmplitudes = new ArrayList<>();

	}

	public String getAudio_src() {
		return audio_src;
	}

	public void setAudio_src(String audio_src) {
		this.audio_src = audio_src;
	}

	public String getTwilio_sid() {
		return twilio_sid;
	}

	public void setTwilio_sid(String twilio_sid) {
		this.twilio_sid = twilio_sid;
	}

	public String getCallSid() {
		return callSid;
	}

	public void setCallSid(String callSid) {
		this.callSid = callSid;
	}

	
	
}
