package com.iphone.models;

import com.iphone.models.internet.Browser;
import com.iphone.models.player.MusicPlayer;
import com.iphone.models.telefone.Phone;

public class Iphone {
	private MusicPlayer musicPlayer;
	private Phone phone;
	private Browser browser;
	
	public Iphone() {
		this.musicPlayer = new MusicPlayer();
		this.phone = new Phone();
		this.browser = new Browser();
	}

	public MusicPlayer getMusicPlayer() {
		return musicPlayer;
	}

	public void setMusicPlayer(MusicPlayer musicPlayer) {
		this.musicPlayer = musicPlayer;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public Browser getBrowser() {
		return browser;
	}

	public void setBrowser(Browser browser) {
		this.browser = browser;
	}
	
	

}
