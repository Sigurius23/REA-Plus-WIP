.class public abstract Lpc1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpc1/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0011\u0010\t\u001a\u00020\u0008*\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u0011\u0010\u000c\u001a\u00020\u000b*\u00020\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\u0000*\u00020\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;",
        "Lh31/n;",
        "e",
        "(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;)Lh31/n;",
        "Lh31/f;",
        "b",
        "(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;)Lh31/f;",
        "Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;",
        "Lh31/b;",
        "d",
        "(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;)Lh31/b;",
        "Lh31/c;",
        "a",
        "(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;)Lh31/c;",
        "c",
        "(Lh31/n;)Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;",
        "design-models_release"
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
.method public static final a(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;)Lh31/c;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lpc1/d$a;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    sget-object p0, Lh31/c;->CAROUSEL:Lh31/c;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lh31/c;->LIST:Lh31/c;

    return-object p0
.end method

.method public static final b(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;)Lh31/f;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lpc1/d$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    sget-object p0, Lh31/f;->COMPLETED:Lh31/f;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lh31/f;->COMMITTED:Lh31/f;

    return-object p0

    :cond_2
    sget-object p0, Lh31/f;->UNCOMMITTED:Lh31/f;

    return-object p0
.end method

.method public static final c(Lh31/n;)Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lpc1/d$a;->c:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    sget-object p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;->COMPLETED:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;->COMMITTED:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    return-object p0

    :cond_2
    sget-object p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;->UNCOMMITTED:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    return-object p0
.end method

.method public static final d(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;)Lh31/b;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lpc1/d$a;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    sget-object p0, Lh31/b;->CAROUSEL:Lh31/b;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lh31/b;->LIST:Lh31/b;

    return-object p0
.end method

.method public static final e(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;)Lh31/n;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lpc1/d$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    sget-object p0, Lh31/n;->COMPLETED:Lh31/n;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lh31/n;->COMMITTED:Lh31/n;

    return-object p0

    :cond_2
    sget-object p0, Lh31/n;->UNCOMMITTED:Lh31/n;

    return-object p0
.end method
