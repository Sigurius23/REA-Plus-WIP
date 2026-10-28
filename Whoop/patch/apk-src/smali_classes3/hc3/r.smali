.class public final Lhc3/r;
.super Lbc3/z;
.source "SourceFile"

# interfaces
.implements Lbc3/k0;


# instance fields
.field public final synthetic w:Lbc3/k0;

.field public final x:Lbc3/z;

.field public final y:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lbc3/z;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Lbc3/z;-><init>()V

    instance-of v0, p1, Lbc3/k0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lbc3/k0;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    sget-object v0, Lbc3/h0;->a:Lbc3/k0;

    :cond_1
    iput-object v0, p0, Lhc3/r;->w:Lbc3/k0;

    iput-object p1, p0, Lhc3/r;->x:Lbc3/z;

    iput-object p2, p0, Lhc3/r;->y:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final dispatch(Lq83/j;Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lhc3/r;->x:Lbc3/z;

    invoke-virtual {v0, p1, p2}, Lbc3/z;->dispatch(Lq83/j;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final dispatchYield(Lq83/j;Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lhc3/r;->x:Lbc3/z;

    invoke-virtual {v0, p1, p2}, Lbc3/z;->dispatchYield(Lq83/j;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final i(JLjava/lang/Runnable;Lq83/j;)Lbc3/s0;
    .locals 1

    iget-object v0, p0, Lhc3/r;->w:Lbc3/k0;

    invoke-interface {v0, p1, p2, p3, p4}, Lbc3/k0;->i(JLjava/lang/Runnable;Lq83/j;)Lbc3/s0;

    move-result-object p1

    return-object p1
.end method

.method public final isDispatchNeeded(Lq83/j;)Z
    .locals 1

    iget-object v0, p0, Lhc3/r;->x:Lbc3/z;

    invoke-virtual {v0, p1}, Lbc3/z;->isDispatchNeeded(Lq83/j;)Z

    move-result p1

    return p1
.end method

.method public final m(JLbc3/m;)V
    .locals 1

    iget-object v0, p0, Lhc3/r;->w:Lbc3/k0;

    invoke-interface {v0, p1, p2, p3}, Lbc3/k0;->m(JLbc3/m;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lhc3/r;->y:Ljava/lang/String;

    return-object v0
.end method
