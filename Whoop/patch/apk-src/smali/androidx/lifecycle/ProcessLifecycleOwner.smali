.class public final Landroidx/lifecycle/ProcessLifecycleOwner;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/g0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Landroidx/lifecycle/ProcessLifecycleOwner;",
        "Landroidx/lifecycle/g0;",
        "<init>",
        "()V",
        "androidx/lifecycle/a1",
        "lifecycle-process_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final I:Landroidx/lifecycle/ProcessLifecycleOwner;


# instance fields
.field public E:Landroid/os/Handler;

.field public final F:Landroidx/lifecycle/i0;

.field public final G:Landroidx/lifecycle/z0;

.field public final H:Landroidx/lifecycle/d2;

.field public w:I

.field public x:I

.field public y:Z

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/lifecycle/ProcessLifecycleOwner;

    invoke-direct {v0}, Landroidx/lifecycle/ProcessLifecycleOwner;-><init>()V

    sput-object v0, Landroidx/lifecycle/ProcessLifecycleOwner;->I:Landroidx/lifecycle/ProcessLifecycleOwner;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/ProcessLifecycleOwner;->y:Z

    iput-boolean v0, p0, Landroidx/lifecycle/ProcessLifecycleOwner;->z:Z

    new-instance v0, Landroidx/lifecycle/i0;

    invoke-direct {v0, p0}, Landroidx/lifecycle/i0;-><init>(Landroidx/lifecycle/g0;)V

    iput-object v0, p0, Landroidx/lifecycle/ProcessLifecycleOwner;->F:Landroidx/lifecycle/i0;

    new-instance v0, Landroidx/lifecycle/z0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/lifecycle/z0;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Landroidx/lifecycle/ProcessLifecycleOwner;->G:Landroidx/lifecycle/z0;

    new-instance v0, Landroidx/lifecycle/d2;

    invoke-direct {v0, p0}, Landroidx/lifecycle/d2;-><init>(Landroidx/lifecycle/ProcessLifecycleOwner;)V

    iput-object v0, p0, Landroidx/lifecycle/ProcessLifecycleOwner;->H:Landroidx/lifecycle/d2;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget v0, p0, Landroidx/lifecycle/ProcessLifecycleOwner;->x:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Landroidx/lifecycle/ProcessLifecycleOwner;->x:I

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Landroidx/lifecycle/ProcessLifecycleOwner;->y:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/ProcessLifecycleOwner;->F:Landroidx/lifecycle/i0;

    sget-object v1, Landroidx/lifecycle/v;->ON_RESUME:Landroidx/lifecycle/v;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/i0;->g(Landroidx/lifecycle/v;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/lifecycle/ProcessLifecycleOwner;->y:Z

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/lifecycle/ProcessLifecycleOwner;->E:Landroid/os/Handler;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v1, p0, Landroidx/lifecycle/ProcessLifecycleOwner;->G:Landroidx/lifecycle/z0;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public final getLifecycle()Landroidx/lifecycle/x;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/ProcessLifecycleOwner;->F:Landroidx/lifecycle/i0;

    return-object v0
.end method
