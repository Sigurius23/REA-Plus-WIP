.class public interface abstract Lhf1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0005\u0008f\u0018\u00002\u00020\u0001J\"\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000c\u001a\u00020\u000bH\u00a6@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000eH\u00a6@\u00a2\u0006\u0004\u0008\u000f\u0010\rJ6\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0004H\u00a6@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015\u00c0\u0006\u0003"
    }
    d2 = {
        "Lhf1/b;",
        "",
        "Lhf1/a;",
        "experiment",
        "",
        "isAuthenticated",
        "",
        "e",
        "(Lhf1/a;ZLq83/d;)Ljava/lang/Object;",
        "f",
        "(Lhf1/a;Lq83/d;)Ljava/lang/Object;",
        "Ll83/a0;",
        "b",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "c",
        "",
        "cacheTtlSeconds",
        "shouldBucketUser",
        "a",
        "(Lhf1/a;JZZLq83/d;)Ljava/lang/Object;",
        "experiments_release"
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
.method public static synthetic d(Lhf1/b;Lhf1/a;JZZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 7

    if-nez p8, :cond_3

    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_0

    const-wide/32 p2, 0x15180

    :cond_0
    move-wide v2, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_1

    const/4 p4, 0x0

    :cond_1
    move v4, p4

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_2

    const/4 p5, 0x1

    :cond_2
    move-object v0, p0

    move-object v1, p1

    move v5, p5

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Lhf1/b;->a(Lhf1/a;JZZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_3
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: getVariant"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract a(Lhf1/a;JZZLq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhf1/a;",
            "JZZ",
            "Lq83/d<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract b(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract c(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract e(Lhf1/a;ZLq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhf1/a;",
            "Z",
            "Lq83/d<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Ll83/c;
    .end annotation
.end method

.method public abstract f(Lhf1/a;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhf1/a;",
            "Lq83/d<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
