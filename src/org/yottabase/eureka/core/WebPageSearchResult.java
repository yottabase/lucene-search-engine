package org.yottabase.eureka.core;

import java.util.Date;
import java.util.List;

public class WebPageSearchResult {
	
	/**
	 * Titolo
	 */
	private String title;
	
	/**
	 * Pezzo di pagina che contiene il risultato della query
	 */
	private String snippet;
	
	/**
	 * Url della pagina
	 */
	private String url;
	
	/**
	 * Elenco dei termini di ricerca saltati durante la query
	 */
	private List<String> skippedWords;

	/**
	 * La data in cui è stato esguito il crawling della pagina
	 */
	private Date date;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSnippet() {
		return snippet;
	}

	public void setSnippet(String snippet) {
		this.snippet = snippet;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<String> getSkippedWords() {
		return skippedWords;
	}

	public void setSkippedWords(List<String> skippedWords) {
		this.skippedWords = skippedWords;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}