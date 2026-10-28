.class public abstract Lm92/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a!\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0008*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u001b\u0010\u000c\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\"\u0015\u0010\u0010\u001a\u00020\u0001*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lm92/f;",
        "",
        "key",
        "h",
        "(Lm92/f;Ljava/lang/String;)Ljava/lang/String;",
        "",
        "e",
        "(Lm92/f;Ljava/lang/String;)I",
        "",
        "f",
        "(Lm92/f;Ljava/lang/String;)Ljava/util/List;",
        "Lcom/whoop/service/push/InvalidPushDataException;",
        "d",
        "(Lm92/f;Ljava/lang/String;)Lcom/whoop/service/push/InvalidPushDataException;",
        "g",
        "(Lm92/f;)Ljava/lang/String;",
        "notificationTypeOrThrow",
        "app_prodStandardRelease"
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
.method public static final synthetic a(Lm92/f;Ljava/lang/String;)I
    .locals 0

    invoke-static {p0, p1}, Lm92/c;->e(Lm92/f;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static final synthetic b(Lm92/f;Ljava/lang/String;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lm92/c;->f(Lm92/f;Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lm92/f;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lm92/c;->h(Lm92/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lm92/f;Ljava/lang/String;)Lcom/whoop/service/push/InvalidPushDataException;
    .locals 2

    new-instance v0, Lcom/whoop/service/push/InvalidPushDataException;

    const-string v1, "Failed to find: "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lcom/whoop/service/push/InvalidPushDataException;-><init>(Lm92/f;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final e(Lm92/f;Ljava/lang/String;)I
    .locals 5

    invoke-static {p0, p1}, Lm92/c;->h(Lm92/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_0
    new-instance v1, Lcom/whoop/service/push/InvalidPushDataException;

    const-string v2, " returned "

    const-string v3, ". Failed to parse into Int"

    const-string v4, "Key "

    invoke-static {v4, p1, v2, v0, v3}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p0, p1}, Lcom/whoop/service/push/InvalidPushDataException;-><init>(Lm92/f;Ljava/lang/String;)V

    throw v1
.end method

.method private static final f(Lm92/f;Ljava/lang/String;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm92/f;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    invoke-static {p0, p1}, Lm92/c;->h(Lm92/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v1

    :catch_0
    new-instance v0, Lcom/whoop/service/push/InvalidPushDataException;

    const-string v1, "Failed to parse JSON string array: "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lcom/whoop/service/push/InvalidPushDataException;-><init>(Lm92/f;Ljava/lang/String;)V

    throw v0
.end method

.method public static final g(Lm92/f;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationType"

    invoke-static {p0, v0}, Lm92/c;->h(Lm92/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lm92/f;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0, p1}, Lm92/f;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-static {p0, p1}, Lm92/c;->d(Lm92/f;Ljava/lang/String;)Lcom/whoop/service/push/InvalidPushDataException;

    move-result-object p0

    throw p0
.end method
