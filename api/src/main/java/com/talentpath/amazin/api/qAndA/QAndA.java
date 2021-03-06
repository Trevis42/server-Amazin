package com.talentpath.amazin.api.qAndA;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "questions", schema = "public")
public class QAndA {

    @Id
    @Column(name = "questionid")
    private Long id;
    @Column(name = "question")
    private String question;
    @Column(name = "itemid")
    private Long itemid;
    // private int votes;

    public QAndA(){

    }

    public QAndA(long id, String question, Long itemid){
        super();
        this.id = id;
        this.question = question;
        this.itemid = itemid;
        // this.votes = votes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion( String question) {
        this.question = question;
    }

    public Long getitemid() {
        return itemid;
    }

    public void setitemid(Long itemid) {
        this.itemid = itemid;
    }

    // public int getVotes() {
    //     return votes;
    // }

    // public void setVotes(int votes) {
    //     this.votes = votes;
    // }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        QAndA other = (QAndA) obj;
        // id comparison
        if (id == null) {
            if (other.id != null) return false;
        }
        else if (!id.equals(other.id)) return false;
        // arrayOfOtherIds comparison
        if (question == null) {
            if (other.question != null) return false;
        }
        else if (!question.equals(other.question)) return false;
        return true;
    }



}