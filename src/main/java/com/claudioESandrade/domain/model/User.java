package com.claudioESandrade.domain.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    @OneToOne(cascade = CascadeType.ALL)
    private Card card;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Feature> features;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<News> news;

    public User() {  }

    public User(Long id, String name, Account account, Card card, List<Feature> features, List<News> news) {
        this.id = id;
        this.name = name;
        this.account = account;
        this.card = card;
        this.features = features;
        this.news = news;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Objects.equals(getId(), user.getId()) && Objects.equals(getName(), user.getName()) && Objects.equals(getAccount(), user.getAccount()) && Objects.equals(getCard(), user.getCard()) && Objects.equals(getFeatures(), user.getFeatures()) && Objects.equals(getNews(), user.getNews());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAccount(), getCard(), getFeatures(), getNews());
    }

    @Override
    public String toString() {
        return "User{\n" +
                " id=" + id +
                ", name='" + name + '\'' +
                ", account=" + account +
                ", card=" + card +
                ", features=" + features +
                ", news=" + news +
                "}\n";
    }
}
