.class public interface abstract Lvk0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvk0/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f\u00c0\u0006\u0003"
    }
    d2 = {
        "Lvk0/g;",
        "Lvk0/a;",
        "Lst0/v;",
        "whoopDeviceType",
        "Llt0/a;",
        "s",
        "(Lst0/v;)Llt0/a;",
        "",
        "p",
        "()Z",
        "dualResponse",
        "Lkotlin/time/Duration;",
        "I",
        "()J",
        "timeout",
        "connectivity-core_release"
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
.method public static synthetic B(Lvk0/g;Lst0/v;ILjava/lang/Object;)Llt0/a;
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Lst0/v;->GEN_4:Lst0/v;

    :cond_0
    invoke-interface {p0, p1}, Lvk0/g;->s(Lst0/v;)Llt0/a;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: commandNumber"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public I()J
    .locals 2

    invoke-static {}, Lvk0/f;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method public abstract p()Z
.end method

.method public abstract s(Lst0/v;)Llt0/a;
.end method
