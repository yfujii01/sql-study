package com.yfujii01.sqlstudy.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class Book {
  /** ID */
  @Id
  private Long id;

  /** タイトル */
  @NotNull @NotEmpty private String title;

  /** 国際標準図書番号 */
  @NotNull private String isbn;

  /** 公開年 */
  @NotNull private String publicationYear;

  /** 出版社ID */
  private Long pubId;
}