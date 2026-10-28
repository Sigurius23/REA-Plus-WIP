.class public final Ly73/a;
.super Ll73/f;
.source "SourceFile"


# instance fields
.field public volatile E:Z

.field public final w:Lq73/e;

.field public final x:Ln73/a;

.field public final y:Lq73/e;

.field public final z:Ly73/c;


# direct methods
.method public constructor <init>(Ly73/c;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly73/a;->z:Ly73/c;

    new-instance p1, Lq73/e;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly73/a;->w:Lq73/e;

    new-instance v0, Ln73/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ly73/a;->x:Ln73/a;

    new-instance v1, Lq73/e;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Ly73/a;->y:Lq73/e;

    invoke-virtual {v1, p1}, Lq73/e;->a(Ln73/b;)Z

    invoke-virtual {v1, v0}, Lq73/e;->a(Ln73/b;)Z

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ln73/b;
    .locals 6

    iget-boolean v0, p0, Ly73/a;->E:Z

    if-eqz v0, :cond_0

    sget-object p1, Lq73/d;->w:Lq73/d;

    return-object p1

    :cond_0
    iget-object v0, p0, Ly73/a;->z:Ly73/c;

    iget-object v5, p0, Ly73/a;->x:Ln73/a;

    move-object v1, p1

    move-wide v2, p2

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Ly73/j;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Lq73/b;)Ly73/m;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/Runnable;)V
    .locals 7

    iget-boolean v0, p0, Ly73/a;->E:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Ly73/a;->z:Ly73/c;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v6, p0, Ly73/a;->w:Lq73/e;

    const-wide/16 v3, 0x0

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Ly73/j;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Lq73/b;)Ly73/m;

    return-void
.end method

.method public final dispose()V
    .locals 1

    iget-boolean v0, p0, Ly73/a;->E:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Ly73/a;->E:Z

    iget-object v0, p0, Ly73/a;->y:Lq73/e;

    invoke-virtual {v0}, Lq73/e;->dispose()V

    :cond_0
    return-void
.end method

.method public final isDisposed()Z
    .locals 1

    iget-boolean v0, p0, Ly73/a;->E:Z

    return v0
.end method
