.class public interface abstract Lcom/whoop/contentsearch/domain/ContentSearchApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008`\u0018\u00002\u00020\u0001J<\u0010\t\u001a\u00020\u00082\n\u0008\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/contentsearch/domain/ContentSearchApi;",
        "",
        "",
        "key",
        "nextToken",
        "",
        "limit",
        "type",
        "Lcom/whoop/contentsearch/domain/models/ContentSearchResponse;",
        "getContentSearch",
        "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "content-search_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Lcom/whoop/contentsearch/domain/ContentSearchApi;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p7, :cond_3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    const-string p1, ""

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p6, p6, 0x4

    if-eqz p6, :cond_2

    const/16 p3, 0x14

    :cond_2
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-interface/range {p2 .. p7}, Lcom/whoop/contentsearch/domain/ContentSearchApi;->getContentSearch(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_3
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: getContentSearch"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract getContentSearch(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "key"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "next_token"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lwg3/t;
            value = "limit"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "type"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/contentsearch/domain/models/ContentSearchResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "onboarding-service/v1/learn-more-carousel/bff/explore"
    .end annotation
.end method
