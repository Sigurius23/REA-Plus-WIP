.class public interface abstract Lhw0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfy1/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhw0/d$a;,
        Lhw0/d$b;,
        Lhw0/d$c;,
        Lhw0/d$d;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u0000 \u00032\u00020\u0001:\u0004\u0003\n\u000b\u000cR\u0014\u0010\u0005\u001a\u00020\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u0082\u0001\u0002\r\u000e\u00a8\u0006\u000f\u00c0\u0006\u0003"
    }
    d2 = {
        "Lhw0/d;",
        "Lfy1/k;",
        "",
        "a",
        "()Ljava/lang/String;",
        "screenTag",
        "Lcom/whoop/metrics/common/ScreenState;",
        "getState",
        "()Lcom/whoop/metrics/common/ScreenState;",
        "state",
        "b",
        "c",
        "d",
        "Lhw0/d$b;",
        "Lhw0/d$c;",
        "core-details_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lhw0/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lhw0/d$a;->a:Lhw0/d$a;

    sput-object v0, Lhw0/d;->a:Lhw0/d$a;

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/lang/String;
.end method

.method public getState()Lcom/whoop/metrics/common/ScreenState;
    .locals 2

    instance-of v0, p0, Lhw0/d$c;

    if-eqz v0, :cond_3

    move-object v0, p0

    check-cast v0, Lhw0/d$c;

    invoke-virtual {v0}, Lhw0/d$c;->p()Lsz0/p0;

    move-result-object v0

    instance-of v1, v0, Lsz0/p0$c;

    if-eqz v1, :cond_0

    sget-object v0, Lcom/whoop/metrics/common/ScreenState;->LOADING:Lcom/whoop/metrics/common/ScreenState;

    return-object v0

    :cond_0
    instance-of v1, v0, Lsz0/p0$b;

    if-eqz v1, :cond_1

    sget-object v0, Lcom/whoop/metrics/common/ScreenState;->ERROR:Lcom/whoop/metrics/common/ScreenState;

    return-object v0

    :cond_1
    instance-of v0, v0, Lsz0/p0$h;

    if-eqz v0, :cond_2

    sget-object v0, Lcom/whoop/metrics/common/ScreenState;->SUCCESS:Lcom/whoop/metrics/common/ScreenState;

    return-object v0

    :cond_2
    sget-object v0, Lcom/whoop/metrics/common/ScreenState;->OTHER:Lcom/whoop/metrics/common/ScreenState;

    return-object v0

    :cond_3
    instance-of v0, p0, Lhw0/d$b;

    if-eqz v0, :cond_4

    sget-object v0, Lcom/whoop/metrics/common/ScreenState;->SUCCESS:Lcom/whoop/metrics/common/ScreenState;

    return-object v0

    :cond_4
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
