.class public abstract Lmy2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a#\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001ak\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u001a\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000c0\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000fH\u0000\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Loy2/b$h;",
        "textInputState",
        "",
        "input",
        "c",
        "(Loy2/b$h;Ljava/lang/String;)Ljava/lang/String;",
        "Loy2/b$c;",
        "current",
        "reading",
        "Lzr2/a;",
        "dateAndTimeProvider",
        "Lkotlin/Function2;",
        "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;",
        "",
        "updateMysticReading",
        "Lkotlin/Function1;",
        "markFieldAsInteracted",
        "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;",
        "Ll83/a0;",
        "onSuccess",
        "Loy2/b;",
        "a",
        "(Loy2/b$c;Ljava/lang/String;Lzr2/a;Lc93/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Loy2/b;",
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
.method public static final a(Loy2/b$c;Ljava/lang/String;Lzr2/a;Lc93/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Loy2/b;
    .locals 42
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loy2/b$c;",
            "Ljava/lang/String;",
            "Lzr2/a;",
            "Lc93/m;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Loy2/b;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    const-string v5, "current"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "reading"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "dateAndTimeProvider"

    move-object/from16 v6, p2

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "updateMysticReading"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "markFieldAsInteracted"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "onSuccess"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, ""

    invoke-virtual {v0, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_0

    invoke-static {v0}, Lmy2/a;->b(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {v1}, Loy2/b$c;->E()Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->getMysticReading()Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;

    move-result-object v7

    if-nez v7, :cond_1

    new-instance v8, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;

    invoke-interface {v6}, Lzr2/a;->f()Lorg/joda/time/Instant;

    move-result-object v9

    const/16 v13, 0xe

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v8 .. v14}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;-><init>(Lorg/joda/time/Instant;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v7, v8

    :cond_1
    :try_start_0
    invoke-virtual {v0, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1}, Loy2/b$c;->E()Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;

    move-result-object v8

    invoke-interface {v2, v7, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;

    const/16 v21, 0xfdf

    const/16 v22, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v8 .. v22}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->copy$default(Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;IIILorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;

    move-result-object v8

    invoke-interface {v4, v8}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v40, 0x1f

    const/16 v41, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, -0x41

    move-object/from16 v0, p4

    invoke-static/range {v1 .. v41}, Loy2/b$c;->i(Loy2/b$c;Loy2/o;Ljava/lang/String;Ljava/lang/String;ZZLoy2/g;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZIILjava/lang/Object;)Loy2/b$c;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Loy2/b;

    return-object v0

    :catch_0
    :goto_1
    return-object p0
.end method

.method private static final b(Ljava/lang/String;)Z
    .locals 2

    const-string v0, "[0-9]+"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    const-string v1, "compile(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "input"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static final c(Loy2/b$h;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const-string v0, "textInputState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    invoke-virtual {p0}, Loy2/b$h;->l()Loy2/i;

    move-result-object v0

    invoke-virtual {v0}, Loy2/i;->c()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_1
    const v0, 0x7fffffff

    :goto_0
    invoke-virtual {p0}, Loy2/b$h;->l()Loy2/i;

    move-result-object v1

    invoke-virtual {v1}, Loy2/i;->e()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_3

    return-object v3

    :cond_3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-le v2, v0, :cond_4

    invoke-virtual {p0}, Loy2/b$h;->l()Loy2/i;

    move-result-object p0

    invoke-virtual {p0}, Loy2/i;->d()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-ge p1, v1, :cond_5

    invoke-virtual {p0}, Loy2/b$h;->l()Loy2/i;

    move-result-object p0

    invoke-virtual {p0}, Loy2/i;->f()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_5
    return-object v3
.end method
