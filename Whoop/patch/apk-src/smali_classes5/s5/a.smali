.class public final Ls5/a;
.super Lq5/b;
.source "SourceFile"


# static fields
.field public static final synthetic i:I


# instance fields
.field public e:Lm5/g;

.field public f:Ljava/util/concurrent/Executor;

.field public g:Landroid/os/CancellationSignal;

.field public final h:Lr5/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, Lr5/d;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lr5/d;-><init>(Lq5/b;Landroid/os/Handler;I)V

    iput-object v0, p0, Ls5/a;->h:Lr5/d;

    return-void
.end method
