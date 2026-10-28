.class public abstract Lbc0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfy1/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbc0/c$a;,
        Lbc0/c$b;,
        Lbc0/c$c;,
        Lbc0/c$d;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0004\u0008\t\n\u000bB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006\u0082\u0001\u0004\u000c\r\u000e\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lbc0/c;",
        "Lfy1/k;",
        "<init>",
        "()V",
        "Lcom/whoop/metrics/common/ScreenState;",
        "getState",
        "()Lcom/whoop/metrics/common/ScreenState;",
        "state",
        "b",
        "a",
        "c",
        "d",
        "Lbc0/c$a;",
        "Lbc0/c$b;",
        "Lbc0/c$c;",
        "Lbc0/c$d;",
        "advanced-labs_release"
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
    invoke-direct {p0}, Lbc0/c;-><init>()V

    return-void
.end method


# virtual methods
.method public getState()Lcom/whoop/metrics/common/ScreenState;
    .locals 1

    instance-of v0, p0, Lbc0/c$b;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/whoop/metrics/common/ScreenState;->LOADING:Lcom/whoop/metrics/common/ScreenState;

    return-object v0

    :cond_0
    instance-of v0, p0, Lbc0/c$a;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/whoop/metrics/common/ScreenState;->ERROR:Lcom/whoop/metrics/common/ScreenState;

    return-object v0

    :cond_1
    instance-of v0, p0, Lbc0/c$c;

    if-eqz v0, :cond_2

    sget-object v0, Lcom/whoop/metrics/common/ScreenState;->SUCCESS:Lcom/whoop/metrics/common/ScreenState;

    return-object v0

    :cond_2
    instance-of v0, p0, Lbc0/c$d;

    if-eqz v0, :cond_3

    sget-object v0, Lcom/whoop/metrics/common/ScreenState;->SUCCESS:Lcom/whoop/metrics/common/ScreenState;

    return-object v0

    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
