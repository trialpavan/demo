package com.target.ready.library.system.service.LibrarySystemService.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name="Book")
public class myClass{
    @Id
    private int bookId;
    private String bookName;
    private String bookDescription;
    private String categoryName;
    private String authorName;
    private int publicationYear;

}
