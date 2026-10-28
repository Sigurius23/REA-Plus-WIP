.class public final Lx43/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:J

.field public final c:Lc53/a;

.field public final d:Ls83/i;

.field public final e:Ls83/i;

.field public final f:Lkotlin/jvm/internal/m;

.field public g:I

.field public h:J

.field public i:Lbc3/c2;

.field public j:Lbc3/c2;

.field public k:Lbc3/c2;

.field public final l:Ll83/p;


# direct methods
.method public constructor <init>(Lc53/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;I)V
    .locals 4

    and-int/lit8 v0, p5, 0x2

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x2710

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x1388

    :goto_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    const-wide/16 v2, 0x7530

    goto :goto_1

    :cond_1
    const-wide/16 v2, 0x3a98

    :goto_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide v0, p0, Lx43/h;->a:J

    iput-wide v2, p0, Lx43/h;->b:J

    iput-object p1, p0, Lx43/h;->c:Lc53/a;

    check-cast p2, Ls83/i;

    iput-object p2, p0, Lx43/h;->d:Ls83/i;

    check-cast p3, Ls83/i;

    iput-object p3, p0, Lx43/h;->e:Ls83/i;

    check-cast p4, Lkotlin/jvm/internal/m;

    iput-object p4, p0, Lx43/h;->f:Lkotlin/jvm/internal/m;

    const-string p1, "Video:SocketMonitor"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lx43/h;->l:Ll83/p;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    invoke-virtual {p0}, Lx43/h;->d()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lx43/h;->h:J

    const/4 v0, 0x0

    iput v0, p0, Lx43/h;->g:I

    invoke-virtual {p0}, Lx43/h;->b()V

    return-void
.end method

.method public final b()V
    .locals 5

    iget-object v0, p0, Lx43/h;->i:Lbc3/c2;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    new-instance v0, La13/h;

    const/16 v2, 0x16

    invoke-direct {v0, p0, v1, v2}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    new-instance v2, Lh0/l1;

    iget-wide v3, p0, Lx43/h;->a:J

    invoke-direct {v2, v3, v4, v0, v1}, Lh0/l1;-><init>(JLc93/m;Lq83/d;)V

    const/4 v0, 0x3

    iget-object v3, p0, Lx43/h;->c:Lc53/a;

    invoke-static {v3, v1, v1, v2, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    iput-object v0, p0, Lx43/h;->i:Lbc3/c2;

    return-void
.end method

.method public final c()V
    .locals 8

    iget-object v0, p0, Lx43/h;->k:Lbc3/c2;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iget v0, p0, Lx43/h;->g:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Lx43/h;->g:I

    mul-int/lit16 v2, v0, 0x7d0

    add-int/lit16 v2, v2, 0x1f4

    const/16 v3, 0x61a8

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    add-int/lit8 v0, v0, -0x1

    mul-int/lit16 v0, v0, 0x7d0

    const/16 v4, 0xfa

    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v3

    sub-int/2addr v2, v0

    int-to-double v5, v2

    mul-double/2addr v3, v5

    int-to-double v5, v0

    add-double/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-long v2, v2

    iget-object v0, p0, Lx43/h;->l:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    iget-object v4, v0, Lb23/k;->c:Lb23/e;

    iget-object v5, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->z:Lb23/g;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v4, "Next connection attempt in "

    const-string v7, " ms"

    invoke-static {v2, v3, v4, v7}, Lr80/c;->l(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v6, v5, v4, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    new-instance v0, Lx43/g;

    const/4 v4, 0x1

    invoke-direct {v0, p0, v1, v4}, Lx43/g;-><init>(Lx43/h;Lq83/d;I)V

    new-instance v4, Lh0/l1;

    invoke-direct {v4, v2, v3, v0, v1}, Lh0/l1;-><init>(JLc93/m;Lq83/d;)V

    const/4 v0, 0x3

    iget-object v2, p0, Lx43/h;->c:Lc53/a;

    invoke-static {v2, v1, v1, v4, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    iput-object v0, p0, Lx43/h;->k:Lbc3/c2;

    return-void
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Lx43/h;->k:Lbc3/c2;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iget-object v0, p0, Lx43/h;->j:Lbc3/c2;

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_1
    iget-object v0, p0, Lx43/h;->i:Lbc3/c2;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v1}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_2
    return-void
.end method
