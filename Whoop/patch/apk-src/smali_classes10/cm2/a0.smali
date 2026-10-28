.class public abstract Lcm2/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfy1/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcm2/a0$a;,
        Lcm2/a0$b;,
        Lcm2/a0$c;,
        Lcm2/a0$d;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u000c2\u00020\u0001:\u0004\u0005\r\u000c\u000eB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00088VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\n\u0082\u0001\u0003\u000f\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcm2/a0;",
        "Lfy1/k;",
        "<init>",
        "()V",
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
        "Lcm2/a0$b;",
        "Lcm2/a0$c;",
        "Lcm2/a0$d;",
        "trends_release"
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
.field public static final b:Lcm2/a0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcm2/a0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcm2/a0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcm2/a0;->b:Lcm2/a0$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcm2/a0;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/lang/String;
.end method

.method public getState()Lcom/whoop/metrics/common/ScreenState;
    .locals 1

    instance-of v0, p0, Lcm2/a0$c;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/whoop/metrics/common/ScreenState;->LOADING:Lcom/whoop/metrics/common/ScreenState;

    return-object v0

    :cond_0
    instance-of v0, p0, Lcm2/a0$b;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/whoop/metrics/common/ScreenState;->ERROR:Lcom/whoop/metrics/common/ScreenState;

    return-object v0

    :cond_1
    instance-of v0, p0, Lcm2/a0$d;

    if-eqz v0, :cond_2

    sget-object v0, Lcom/whoop/metrics/common/ScreenState;->SUCCESS:Lcom/whoop/metrics/common/ScreenState;

    return-object v0

    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
