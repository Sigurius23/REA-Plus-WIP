.class public final Lqt/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqt/f;
.implements Lqt/g;


# instance fields
.field public final a:Ldt/c;

.field public final b:Landroid/content/Context;

.field public final c:Lst/a;

.field public final d:Ljava/util/Set;

.field public final e:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;Lst/a;Ljava/util/concurrent/Executor;)V
    .locals 1

    new-instance v0, Ldt/c;

    invoke-direct {v0, p1, p2}, Ldt/c;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lqt/d;->a:Ldt/c;

    iput-object p3, p0, Lqt/d;->d:Ljava/util/Set;

    iput-object p5, p0, Lqt/d;->e:Ljava/util/concurrent/Executor;

    iput-object p4, p0, Lqt/d;->c:Lst/a;

    iput-object p1, p0, Lqt/d;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a()Lcq/u;
    .locals 2

    iget-object v0, p0, Lqt/d;->b:Landroid/content/Context;

    invoke-static {v0}, Lge3/g;->G(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, ""

    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->d(Ljava/lang/Object;)Lcq/u;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lqt/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lqt/c;-><init>(Lqt/d;I)V

    iget-object v1, p0, Lqt/d;->e:Ljava/util/concurrent/Executor;

    invoke-static {v1, v0}, Lcom/google/android/gms/tasks/Tasks;->b(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcq/u;

    move-result-object v0

    return-object v0
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lqt/d;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->d(Ljava/lang/Object;)Lcq/u;

    return-void

    :cond_0
    iget-object v0, p0, Lqt/d;->b:Landroid/content/Context;

    invoke-static {v0}, Lge3/g;->G(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->d(Ljava/lang/Object;)Lcq/u;

    return-void

    :cond_1
    new-instance v0, Lqt/c;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lqt/c;-><init>(Lqt/d;I)V

    iget-object v1, p0, Lqt/d;->e:Ljava/util/concurrent/Executor;

    invoke-static {v1, v0}, Lcom/google/android/gms/tasks/Tasks;->b(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcq/u;

    return-void
.end method
