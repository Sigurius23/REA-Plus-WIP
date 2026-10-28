.class public abstract Lhu1/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\'\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0000*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "",
        "Lmt0/g;",
        "",
        "versionId",
        "Lhu1/b;",
        "a",
        "(Ljava/util/List;I)Ljava/util/List;",
        "labrador-service_release"
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
.method public static final a(Ljava/util/List;I)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lmt0/g;",
            ">;I)",
            "Ljava/util/List<",
            "Lhu1/b;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lmt0/g;

    new-instance v2, Lhu1/b;

    invoke-virtual {v1}, Llt0/b;->Y()Lfk2/a;

    move-result-object v3

    invoke-virtual {v3}, Lfk2/a;->j()J

    move-result-wide v3

    invoke-virtual {v1}, Llt0/b;->U()S

    move-result v5

    invoke-virtual {v1}, Lmt0/g;->b0()Ljava/nio/ByteBuffer;

    move-result-object v6

    move v7, p1

    invoke-direct/range {v2 .. v7}, Lhu1/b;-><init>(JILjava/nio/ByteBuffer;I)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method
