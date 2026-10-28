.class public abstract Lmf0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u0013\u0010\u0008\u001a\u00020\u0007*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;",
        "Lzr2/a;",
        "dateAndTimeProvider",
        "Lmf0/g;",
        "b",
        "(Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;Lzr2/a;)Lmf0/g;",
        "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;",
        "Lze0/c$d;",
        "a",
        "(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;)Lze0/c$d;",
        "advanced-labs_release"
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
.method private static final a(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;)Lze0/c$d;
    .locals 3

    invoke-virtual {p0}, Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;->getNavigationTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;->getTag()Lcom/whoop/design/models/items/TagModel;

    move-result-object p0

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    invoke-static {}, Lmd0/c;->z0()Ljb1/a;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    instance-of v2, p0, Lhy0/h1;

    if-eqz v2, :cond_1

    move-object v1, p0

    check-cast v1, Lhy0/h1;

    :cond_1
    new-instance p0, Lze0/c$d;

    invoke-direct {p0, v0, v1}, Lze0/c$d;-><init>(Ljava/lang/String;Lhy0/h1;)V

    return-object p0
.end method

.method public static final b(Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;Lzr2/a;)Lmf0/g;
    .locals 26

    move-object/from16 v0, p1

    const-string v1, "<this>"

    move-object/from16 v2, p0

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "dateAndTimeProvider"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->getDateTimeValue()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object v3, Lor2/u;->b:Lor2/u$a;

    invoke-virtual {v3}, Lor2/u$a;->f()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v3

    invoke-static {v1, v3}, Lorg/joda/time/DateTime;->parse(Ljava/lang/String;Lorg/joda/time/format/DateTimeFormatter;)Lorg/joda/time/DateTime;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    invoke-interface {v0}, Lzr2/a;->c()Lorg/joda/time/DateTime;

    move-result-object v1

    :cond_1
    invoke-static {v0, v1}, Lzr2/b;->d(Lzr2/a;Lorg/joda/time/DateTime;)Lorg/joda/time/LocalDateTime;

    move-result-object v12

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->getNavigationBar()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    move-result-object v0

    invoke-static {v0}, Lmf0/f;->a(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;)Lze0/c$d;

    move-result-object v3

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object v4

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->getSubtitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->getNameLabel()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->getNameValue()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->getDateLabel()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->getDateIcon()Ljava/lang/String;

    move-result-object v0

    const/4 v10, 0x0

    if-eqz v0, :cond_3

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v11

    array-length v13, v11

    move v14, v10

    :goto_0
    if-ge v14, v13, :cond_3

    aget-object v15, v11, v14

    invoke-virtual {v15}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    move-object v1, v15

    goto :goto_1

    :cond_2
    add-int/lit8 v14, v14, 0x1

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->getTimeLabel()Ljava/lang/String;

    move-result-object v11

    new-instance v13, Lny0/a0;

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->getButton()Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;->getTextDisplay()Lcom/whoop/design/util/TextResource;

    move-result-object v14

    const/16 v24, 0x3fe

    const/16 v25, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v13 .. v25}, Lny0/a0;-><init>(Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Ljava/lang/Integer;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->getDateTimeValue()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    const/4 v10, 0x1

    :cond_4
    move v14, v10

    new-instance v2, Lmf0/g;

    move-object v10, v1

    invoke-direct/range {v2 .. v14}, Lmf0/g;-><init>(Lze0/c$d;Lkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Lorg/joda/time/LocalDateTime;Lny0/a0;Z)V

    return-object v2
.end method
