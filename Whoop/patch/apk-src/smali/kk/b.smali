.class public final Lkk/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lgj/d;

.field public final b:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final c:Laj/d;

.field public final d:Lbd3/v;

.field public final e:Lik/b;

.field public final f:Lbc3/c0;

.field public final g:Ldc3/l;

.field public final h:Ldc3/l;

.field public i:Z

.field public j:Z

.field public final k:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final l:Ll83/p;


# direct methods
.method public constructor <init>(Lgj/d;)V
    .locals 10

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iget-object v2, p1, Lgj/d;->a:Lgj/g;

    new-instance v3, Laj/d;

    invoke-direct {v3, v2}, Laj/d;-><init>(Ljava/lang/Object;)V

    new-instance v4, Lbd3/v;

    iget v2, v2, Lgj/g;->h:I

    const/16 v5, 0x8

    invoke-direct {v4, v2, v5}, Lbd3/v;-><init>(II)V

    invoke-virtual {p1}, Lgj/d;->f()Lik/b;

    move-result-object v2

    iget-object v5, p1, Lgj/d;->c:Lbc3/c0;

    const v6, 0x7fffffff

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static {v6, v7, v8}, Lq83/g;->d(IILdc3/a;)Ldc3/h;

    move-result-object v9

    invoke-static {v6, v7, v8}, Lq83/g;->d(IILdc3/a;)Ldc3/h;

    move-result-object v6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkk/b;->a:Lgj/d;

    iput-object v0, p0, Lkk/b;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object v3, p0, Lkk/b;->c:Laj/d;

    iput-object v4, p0, Lkk/b;->d:Lbd3/v;

    iput-object v2, p0, Lkk/b;->e:Lik/b;

    iput-object v5, p0, Lkk/b;->f:Lbc3/c0;

    iput-object v9, p0, Lkk/b;->g:Ldc3/l;

    iput-object v6, p0, Lkk/b;->h:Ldc3/l;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, Lkk/b;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance p1, La3/l0;

    const/16 v0, 0xf

    invoke-direct {p1, p0, v0}, La3/l0;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lkk/b;->l:Ll83/p;

    iput-boolean v1, p0, Lkk/b;->i:Z

    iput-boolean v1, p0, Lkk/b;->j:Z

    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object p1

    new-instance v0, Lgj/c;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lgj/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Ljava/lang/Runtime;->addShutdownHook(Ljava/lang/Thread;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method


# virtual methods
.method public final a(Ljk/a;)V
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p1, Ljk/a;->L:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p1, Ljk/a;->L:I

    new-instance v0, Lkk/f;

    invoke-direct {v0, v1, p1}, Lkk/f;-><init>(ILjk/a;)V

    iget-object p1, p0, Lkk/b;->g:Ldc3/l;

    invoke-interface {p1, v0}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
