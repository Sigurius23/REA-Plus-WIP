.class public abstract Llz2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/LegalDocumentResponse;",
        "Ly71/o;",
        "a",
        "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/LegalDocumentResponse;)Ly71/o;",
        "whooplabs_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/LegalDocumentResponse;)Ly71/o;
    .locals 28

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Ly71/o;->p:Ly71/o$c;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/LegalDocumentResponse;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/LegalDocumentResponse;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget-object v0, Llz2/a$a;->w:Llz2/a$a;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/LegalDocumentResponse;->getLeftIcon()Ljava/lang/String;

    move-result-object v0

    const-string v3, ""

    const/4 v4, 0x0

    const/4 v7, 0x0

    if-eqz v0, :cond_3

    sget-object v8, Lgz0/m0;->ACTIVITY:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v9

    array-length v10, v9

    move v11, v4

    :goto_0
    if-ge v11, v10, :cond_1

    aget-object v12, v9, v11

    invoke-virtual {v12}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    :cond_1
    move-object v12, v7

    :goto_1
    if-nez v12, :cond_2

    goto :goto_2

    :cond_2
    move-object v8, v12

    :goto_2
    invoke-virtual {v8}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    new-instance v9, Ly71/g;

    invoke-direct {v9, v0, v8}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    goto :goto_3

    :cond_3
    move-object v9, v7

    :goto_3
    sget-object v0, Llz2/a$b;->w:Llz2/a$b;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/LegalDocumentResponse;->getRightIcon()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    sget-object v10, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v11

    array-length v12, v11

    :goto_4
    if-ge v4, v12, :cond_5

    aget-object v13, v11, v4

    invoke-virtual {v13}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_4

    move-object v7, v13

    goto :goto_5

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_5
    :goto_5
    if-nez v7, :cond_6

    goto :goto_6

    :cond_6
    move-object v10, v7

    :goto_6
    invoke-virtual {v10}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    new-instance v7, Ly71/g;

    invoke-direct {v7, v0, v3}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    :cond_7
    sget-object v0, Llz2/a$c;->w:Llz2/a$c;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v10

    sget-object v0, Llz2/a$d;->w:Llz2/a$d;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v15

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/LegalDocumentResponse;->getMenuItemState()Ljava/lang/String;

    move-result-object v0

    const-string v3, "ENABLED"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v16

    const v25, 0x7f9e06

    const/16 v26, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v27, v9

    move-object v9, v7

    move-object/from16 v7, v27

    invoke-static/range {v1 .. v26}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v0

    return-object v0
.end method
