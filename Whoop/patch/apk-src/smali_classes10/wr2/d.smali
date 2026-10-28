.class public interface abstract Lwr2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u001c\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004R\u001a\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012\u00c0\u0006\u0003"
    }
    d2 = {
        "Lwr2/d;",
        "",
        "",
        "e",
        "()Ljava/lang/String;",
        "userFacingText",
        "",
        "b",
        "()Ljava/util/List;",
        "userFacingKeywords",
        "",
        "c",
        "()Ljava/lang/Iterable;",
        "metadataKeywords",
        "Lyb3/p;",
        "a",
        "()Lyb3/p;",
        "searchQueryDelimiter",
        "feature_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public a()Lyb3/p;
    .locals 1

    sget-object v0, Lor2/j1;->a:Lor2/j1;

    invoke-virtual {v0}, Lor2/j1;->c()Lyb3/p;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, Lwr2/d;->e()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0}, Lwr2/d;->a()Lyb3/p;

    move-result-object v1

    invoke-virtual {v1, v0}, Lyb3/p;->h(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/lang/Iterable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Iterable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    sget-object v0, Lm83/y;->w:Lm83/y;

    return-object v0
.end method

.method public abstract e()Ljava/lang/String;
.end method
