.class public abstract Landroidx/lifecycle/x1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljc/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljc/a;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ljc/a;-><init>(I)V

    sput-object v0, Landroidx/lifecycle/x1;->a:Ljc/a;

    return-void
.end method

.method public static final a(Landroidx/lifecycle/t0;)Landroidx/lifecycle/t0;
    .locals 4

    new-instance v0, Lkotlin/jvm/internal/b0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lkotlin/jvm/internal/b0;->w:Z

    invoke-virtual {p0}, Landroidx/lifecycle/p0;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lkotlin/jvm/internal/b0;->w:Z

    new-instance v1, Landroidx/lifecycle/t0;

    invoke-virtual {p0}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v1, v2}, Landroidx/lifecycle/t0;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v1, Landroidx/lifecycle/t0;

    invoke-direct {v1}, Landroidx/lifecycle/t0;-><init>()V

    :goto_0
    new-instance v2, La20/g;

    const/16 v3, 0x9

    invoke-direct {v2, v3, v1, v0}, La20/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Lt30/d;

    const/4 v3, 0x2

    invoke-direct {v0, v2, v3}, Lt30/d;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v1, p0, v0}, Landroidx/lifecycle/t0;->b(Landroidx/lifecycle/p0;Landroidx/lifecycle/v0;)V

    return-object v1
.end method

.method public static final b(Landroidx/lifecycle/w1;)Ln8/a;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/lifecycle/x1;->a:Ljc/a;

    monitor-enter v0

    :try_start_0
    const-string v1, "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY"

    invoke-virtual {p0, v1}, Landroidx/lifecycle/w1;->getCloseable(Ljava/lang/String;)Ljava/lang/AutoCloseable;

    move-result-object v1

    check-cast v1, Ln8/a;

    if-nez v1, :cond_0

    sget-object v1, Lq83/k;->w:Lq83/k;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    sget-object v2, Lbc3/q0;->a:Lkc3/e;

    sget-object v2, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {v2}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v1
    :try_end_1
    .catch Ll83/j; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_0
    :try_start_2
    new-instance v2, Ln8/a;

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v3

    invoke-interface {v1, v3}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v1

    invoke-direct {v2, v1}, Ln8/a;-><init>(Lq83/j;)V

    const-string v1, "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY"

    invoke-virtual {p0, v1, v2}, Landroidx/lifecycle/w1;->addCloseable(Ljava/lang/String;Ljava/lang/AutoCloseable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v1, v2

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-object v1

    :goto_1
    monitor-exit v0

    throw p0
.end method

.method public static final c(Lq83/j;Lc93/m;)Landroidx/lifecycle/j;
    .locals 4

    new-instance v0, Landroidx/lifecycle/j;

    invoke-direct {v0}, Landroidx/lifecycle/t0;-><init>()V

    sget-object v1, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {p0, v1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v1

    check-cast v1, Lbc3/k1;

    new-instance v2, Lbc3/e2;

    invoke-direct {v2, v1}, Lbc3/l1;-><init>(Lbc3/k1;)V

    sget-object v1, Lbc3/q0;->a:Lkc3/e;

    sget-object v1, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {v1}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v1

    invoke-virtual {v1, p0}, Lq83/a;->plus(Lq83/j;)Lq83/j;

    move-result-object p0

    invoke-interface {p0, v2}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p0

    invoke-static {p0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p0

    new-instance v1, La30/w0;

    new-instance v2, La1/j;

    const/4 v3, 0x5

    invoke-direct {v2, v0, v3}, La1/j;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v1, v0, p1, p0, v2}, La30/w0;-><init>(Landroidx/lifecycle/j;Lc93/m;Lhc3/d;La1/j;)V

    iput-object v1, v0, Landroidx/lifecycle/j;->b:La30/w0;

    return-object v0
.end method

.method public static synthetic d(Lc93/m;)Landroidx/lifecycle/j;
    .locals 1

    sget-object v0, Lq83/k;->w:Lq83/k;

    invoke-static {v0, p0}, Landroidx/lifecycle/x1;->c(Lq83/j;Lc93/m;)Landroidx/lifecycle/j;

    move-result-object p0

    return-object p0
.end method
