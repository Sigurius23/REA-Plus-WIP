.class public interface abstract Lnk0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvk0/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnk0/a$a;,
        Lnk0/a$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008f\u0018\u00002\u00020\u0001:\u0002\u0017\u0018J0\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ#\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000eH\'\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J.\u0010\u0015\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0019\u00c0\u0006\u0003"
    }
    d2 = {
        "Lnk0/a;",
        "Lvk0/i;",
        "Lvk0/g;",
        "task",
        "Lkotlin/time/Duration;",
        "timeout",
        "",
        "dualResponse",
        "Ll83/n;",
        "Lzj0/h;",
        "i",
        "(Lvk0/g;JZLq83/d;)Ljava/lang/Object;",
        "Llt0/c;",
        "blePacket",
        "",
        "delay",
        "Lnk0/a$a;",
        "G",
        "(Llt0/c;J)Lnk0/a$a;",
        "Lxj0/b;",
        "commandPacket",
        "E0",
        "(Lxj0/b;JZLq83/d;)Ljava/lang/Object;",
        "b",
        "a",
        "connectivity_release"
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
.method public static synthetic Q0(Lnk0/a;Llt0/c;JILjava/lang/Object;)Lnk0/a$a;
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const-wide/16 p2, 0x0

    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lnk0/a;->G(Llt0/c;J)Lnk0/a$a;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: sendCommandToStrap"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic T(Lnk0/a;Lxj0/b;JZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    if-nez p7, :cond_2

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    const-wide/16 p2, 0x1388

    :cond_0
    move-wide v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    const/4 p4, 0x0

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lnk0/a;->E0(Lxj0/b;JZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: sendCommandToStrapSuspend"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract E0(Lxj0/b;JZLq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxj0/b;",
            "JZ",
            "Lq83/d<",
            "-",
            "Lzj0/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Ll83/c;
    .end annotation
.end method

.method public abstract G(Llt0/c;J)Lnk0/a$a;
    .annotation runtime Ll83/c;
    .end annotation
.end method

.method public abstract i(Lvk0/g;JZLq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvk0/g;",
            "JZ",
            "Lq83/d<",
            "-",
            "Ll83/n;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
