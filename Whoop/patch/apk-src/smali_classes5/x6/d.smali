.class public final Lx6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/w0;


# instance fields
.field public E:I

.field public F:J

.field public G:Lbc3/m;

.field public final w:Lbc3/c0;

.field public final x:Lwr1/f;

.field public final y:Lp1/e;

.field public final z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lx6/u;)V
    .locals 2

    new-instance v0, Lwr1/f;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Lwr1/f;-><init>(I)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/d;->w:Lbc3/c0;

    iput-object v0, p0, Lx6/d;->x:Lwr1/f;

    new-instance p1, Lp1/e;

    new-instance v0, Lvv1/c;

    const/16 v1, 0x14

    invoke-direct {v0, p0, v1}, Lvv1/c;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p1, v0}, Lp1/e;-><init>(Lc93/a;)V

    iput-object p1, p0, Lx6/d;->y:Lp1/e;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/d;->z:Ljava/lang/Object;

    const/4 p1, 0x5

    iput p1, p0, Lx6/d;->E:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lx6/d;->z:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lx6/d;->G:Lbc3/m;

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lbc3/m;->cancel(Ljava/lang/Throwable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method public final fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p2, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final get(Lq83/i;)Lq83/h;
    .locals 0

    invoke-static {p0, p1}, Le93/b;->D(Lq83/h;Lq83/i;)Lq83/h;

    move-result-object p1

    return-object p1
.end method

.method public final k(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lx6/d;->y:Lp1/e;

    invoke-virtual {v0, p1, p2}, Lp1/e;->k(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final minusKey(Lq83/i;)Lq83/j;
    .locals 0

    invoke-static {p0, p1}, Le93/b;->Q(Lq83/h;Lq83/i;)Lq83/j;

    move-result-object p1

    return-object p1
.end method

.method public final plus(Lq83/j;)Lq83/j;
    .locals 0

    invoke-static {p0, p1}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object p1

    return-object p1
.end method
