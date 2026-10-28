.class public abstract Lcom/whoop/puffin/sync/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u00020\u0004*\u0004\u0018\u00010\u0000H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\"\u0018\u0010\n\u001a\u00020\u0007*\u00020\u00008@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/puffin/sync/f;",
        "Lcom/whoop/puffin/sync/f$b$d;",
        "b",
        "(Lcom/whoop/puffin/sync/f;)Lcom/whoop/puffin/sync/f$b$d;",
        "Lcom/whoop/puffin/sync/f$b$a;",
        "a",
        "(Lcom/whoop/puffin/sync/f;)Lcom/whoop/puffin/sync/f$b$a;",
        "",
        "c",
        "(Lcom/whoop/puffin/sync/f;)I",
        "totalCount",
        "puffin_release"
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
.method public static final a(Lcom/whoop/puffin/sync/f;)Lcom/whoop/puffin/sync/f$b$a;
    .locals 6

    if-nez p0, :cond_0

    new-instance v0, Lcom/whoop/puffin/sync/f$b$a;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/puffin/sync/f$b$a;-><init>(IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    new-instance v0, Lcom/whoop/puffin/sync/f$b$a;

    invoke-interface {p0}, Lcom/whoop/puffin/sync/f;->b()I

    move-result v1

    invoke-interface {p0}, Lcom/whoop/puffin/sync/f;->a()I

    move-result v2

    invoke-interface {p0}, Lcom/whoop/puffin/sync/f;->c()I

    move-result p0

    invoke-direct {v0, v1, v2, p0}, Lcom/whoop/puffin/sync/f$b$a;-><init>(III)V

    return-object v0
.end method

.method public static final b(Lcom/whoop/puffin/sync/f;)Lcom/whoop/puffin/sync/f$b$d;
    .locals 6

    if-nez p0, :cond_0

    new-instance v0, Lcom/whoop/puffin/sync/f$b$d;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/puffin/sync/f$b$d;-><init>(IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    new-instance v0, Lcom/whoop/puffin/sync/f$b$d;

    invoke-interface {p0}, Lcom/whoop/puffin/sync/f;->b()I

    move-result v1

    invoke-interface {p0}, Lcom/whoop/puffin/sync/f;->a()I

    move-result v2

    invoke-interface {p0}, Lcom/whoop/puffin/sync/f;->c()I

    move-result p0

    invoke-direct {v0, v1, v2, p0}, Lcom/whoop/puffin/sync/f$b$d;-><init>(III)V

    return-object v0
.end method

.method public static final c(Lcom/whoop/puffin/sync/f;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lcom/whoop/puffin/sync/f;->b()I

    move-result v0

    invoke-interface {p0}, Lcom/whoop/puffin/sync/f;->a()I

    move-result p0

    add-int/2addr p0, v0

    return p0
.end method
