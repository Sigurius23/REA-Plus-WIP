.class public abstract Lso1/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfy1/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lso1/c0$a;,
        Lso1/c0$b;,
        Lso1/c0$c;,
        Lso1/c0$d;,
        Lso1/c0$e;,
        Lso1/c0$f;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0006\u0008\t\n\u000b\u000c\rB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lso1/c0;",
        "Lfy1/k;",
        "<init>",
        "()V",
        "Lcom/whoop/metrics/common/ScreenState;",
        "getState",
        "()Lcom/whoop/metrics/common/ScreenState;",
        "state",
        "b",
        "a",
        "e",
        "c",
        "d",
        "f",
        "Lso1/c0$a;",
        "Lso1/c0$b;",
        "Lso1/c0$c;",
        "Lso1/c0$d;",
        "Lso1/c0$e;",
        "Lso1/c0$f;",
        "hormonal-insights_release"
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
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lso1/c0;-><init>()V

    return-void
.end method


# virtual methods
.method public getState()Lcom/whoop/metrics/common/ScreenState;
    .locals 1

    instance-of v0, p0, Lso1/c0$b;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/whoop/metrics/common/ScreenState;->LOADING:Lcom/whoop/metrics/common/ScreenState;

    return-object v0

    :cond_0
    instance-of v0, p0, Lso1/c0$a;

    if-nez v0, :cond_5

    instance-of v0, p0, Lso1/c0$c;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    instance-of v0, p0, Lso1/c0$f;

    if-nez v0, :cond_4

    instance-of v0, p0, Lso1/c0$d;

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    sget-object v0, Lso1/c0$e;->b:Lso1/c0$e;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lcom/whoop/metrics/common/ScreenState;->OTHER:Lcom/whoop/metrics/common/ScreenState;

    return-object v0

    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_4
    :goto_0
    sget-object v0, Lcom/whoop/metrics/common/ScreenState;->SUCCESS:Lcom/whoop/metrics/common/ScreenState;

    return-object v0

    :cond_5
    :goto_1
    sget-object v0, Lcom/whoop/metrics/common/ScreenState;->ERROR:Lcom/whoop/metrics/common/ScreenState;

    return-object v0
.end method
