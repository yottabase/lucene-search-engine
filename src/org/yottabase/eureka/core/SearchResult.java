package org.yottabase.eureka.core;

import java.util.LinkedList;
import java.util.List;

public class SearchResult {

	/**
	 * Numero di item totali riscontrati dalla ricerca
	 */
	private Integer itemsCount;
	
	/**
	 * Numero di pagina della ricerca
	 */
	private Integer page;
	
	/**
	 * Numero di item (reali) presenti nella pagina
	 */
	private Integer itemsInPage;
	
	/**
	 * Items della ricerca
	 */
	private List<WebPageSearchResult> webPages;
	
	/**
	 * Elenco di possibile alternative della query (Forse cercavi)
	 */
	private List<String> suggestedSearches;

	/**
	 * Numero di secondi che sono stati utilizzati per effettuare la ricerca
	 */
	private Double queryResponseTime;
	
	/**
	 * Identificativo dell'ultimo documento della ricerca
	 */
	private Integer docID;
	
	/**
	 * Score dell'ultimo documento della ricerca
	 */
	private Float docScore;
	
	/**
	 * La query realmente eseguita in caso di mispelling
	 */
	private String executedQuery;
	
	public SearchResult() {
		this.webPages = new LinkedList<WebPageSearchResult>();
		this.suggestedSearches = new LinkedList<String>();
	}

	public Integer getItemsCount() {
		return itemsCount;
	}

	public void setItemsCount(Integer itemsCount) {
		this.itemsCount = itemsCount;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getItemsInPage() {
		return itemsInPage;
	}

	public void setItemsInPage(Integer itemInPage) {
		this.itemsInPage = itemInPage;
	}

	public List<WebPageSearchResult> getWebPages() {
		return webPages;
	}

	public void setWebPages(List<WebPageSearchResult> webPages) {
		this.webPages = webPages;
	}

	public List<String> getSuggestedSearches() {
		return suggestedSearches;
	}

	public void setSuggestedSearches(List<String> suggestedSearch) {
		this.suggestedSearches = suggestedSearch;
	}

	public Double getQueryResponseTime() {
		return queryResponseTime;
	}

	public void setQueryResponseTime(Double queryResponseTime) {
		this.queryResponseTime = queryResponseTime;
	}

	public Integer getDocID() {
		return docID;
	}

	public void setDocID(Integer doc) {
		this.docID = doc;
	}

	public Float getDocScore() {
		return docScore;
	}

	public void setDocScore(Float score) {
		this.docScore = score;
	}
	
	public String getExecutedQuery() {
		return executedQuery;
	}

	public void setExecutedQuery(String executedQuery) {
		this.executedQuery = executedQuery;
	}
	
	public boolean addWebSearchResult(WebPageSearchResult page) {
		return this.webPages.add(page);
	}
	
	public boolean addSuggestedSearch(String suggestedSearch) {
		return this.suggestedSearches.add(suggestedSearch);
	}

}
