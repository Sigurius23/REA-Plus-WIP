.class public final Landroidx/lifecycle/h;
.super Landroidx/lifecycle/p0;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lev/i;


# direct methods
.method public constructor <init>(Lev/i;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/h;->a:Lev/i;

    invoke-direct {p0}, Landroidx/lifecycle/p0;-><init>()V

    return-void
.end method


# virtual methods
.method public final onActive()V
    .locals 2

    iget-object v0, p0, Landroidx/lifecycle/h;->a:Lev/i;

    iget-object v0, v0, Lev/i;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/m;

    invoke-static {}, Lt/a;->V()Lt/a;

    move-result-object v1

    iget-object v1, v1, Lt/a;->a:Lt/b;

    iget-object v1, v1, Lt/b;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
