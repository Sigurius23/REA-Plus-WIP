.class public abstract Lcom/whoop/straphistorysync/sync/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u001d\u0010\u0007\u001a\u00020\u0006*\u0004\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u0015\u0010\n\u001a\u00020\t*\u0004\u0018\u00010\u0000H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/straphistorysync/sync/f;",
        "Lcom/whoop/straphistorysync/sync/f$b$e;",
        "c",
        "(Lcom/whoop/straphistorysync/sync/f;)Lcom/whoop/straphistorysync/sync/f$b$e;",
        "Lbi2/a;",
        "reason",
        "Lcom/whoop/straphistorysync/sync/f$b$b;",
        "b",
        "(Lcom/whoop/straphistorysync/sync/f;Lbi2/a;)Lcom/whoop/straphistorysync/sync/f$b$b;",
        "Lcom/whoop/straphistorysync/sync/f$b$a;",
        "a",
        "(Lcom/whoop/straphistorysync/sync/f;)Lcom/whoop/straphistorysync/sync/f$b$a;",
        "strap-history-sync_release"
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
.method public static final a(Lcom/whoop/straphistorysync/sync/f;)Lcom/whoop/straphistorysync/sync/f$b$a;
    .locals 6

    if-nez p0, :cond_0

    new-instance v0, Lcom/whoop/straphistorysync/sync/f$b$a;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/straphistorysync/sync/f$b$a;-><init>(Lbi2/l;ILbi2/k;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    new-instance v0, Lcom/whoop/straphistorysync/sync/f$b$a;

    invoke-interface {p0}, Lcom/whoop/straphistorysync/sync/f;->b()Lbi2/l;

    move-result-object v1

    invoke-interface {p0}, Lcom/whoop/straphistorysync/sync/f;->c()I

    move-result v2

    invoke-interface {p0}, Lcom/whoop/straphistorysync/sync/f;->a()Lbi2/k;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lcom/whoop/straphistorysync/sync/f$b$a;-><init>(Lbi2/l;ILbi2/k;)V

    return-object v0
.end method

.method public static final b(Lcom/whoop/straphistorysync/sync/f;Lbi2/a;)Lcom/whoop/straphistorysync/sync/f$b$b;
    .locals 8

    const-string v0, "reason"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p0, :cond_0

    new-instance v1, Lcom/whoop/straphistorysync/sync/f$b$b;

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, Lcom/whoop/straphistorysync/sync/f$b$b;-><init>(Lbi2/a;Lbi2/l;ILbi2/k;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    move-object v2, p1

    invoke-interface {p0}, Lcom/whoop/straphistorysync/sync/f;->b()Lbi2/l;

    move-result-object p1

    invoke-interface {p0}, Lcom/whoop/straphistorysync/sync/f;->c()I

    move-result v0

    invoke-interface {p0}, Lcom/whoop/straphistorysync/sync/f;->a()Lbi2/k;

    move-result-object p0

    new-instance v1, Lcom/whoop/straphistorysync/sync/f$b$b;

    invoke-direct {v1, v2, p1, v0, p0}, Lcom/whoop/straphistorysync/sync/f$b$b;-><init>(Lbi2/a;Lbi2/l;ILbi2/k;)V

    return-object v1
.end method

.method public static final c(Lcom/whoop/straphistorysync/sync/f;)Lcom/whoop/straphistorysync/sync/f$b$e;
    .locals 6

    if-nez p0, :cond_0

    new-instance v0, Lcom/whoop/straphistorysync/sync/f$b$e;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/straphistorysync/sync/f$b$e;-><init>(Lbi2/l;ILbi2/k;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    new-instance v0, Lcom/whoop/straphistorysync/sync/f$b$e;

    invoke-interface {p0}, Lcom/whoop/straphistorysync/sync/f;->b()Lbi2/l;

    move-result-object v1

    invoke-interface {p0}, Lcom/whoop/straphistorysync/sync/f;->c()I

    move-result v2

    invoke-interface {p0}, Lcom/whoop/straphistorysync/sync/f;->a()Lbi2/k;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lcom/whoop/straphistorysync/sync/f$b$e;-><init>(Lbi2/l;ILbi2/k;)V

    return-object v0
.end method
