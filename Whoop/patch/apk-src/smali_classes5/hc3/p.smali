.class public final Lhc3/p;
.super Lbc3/w1;
.source "SourceFile"

# interfaces
.implements Lbc3/k0;


# virtual methods
.method public final T()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. \'kotlinx-coroutines-android\' and ensure it has the same version as \'kotlinx-coroutines-core\'"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final dispatch(Lq83/j;Ljava/lang/Runnable;)V
    .locals 0

    invoke-virtual {p0}, Lhc3/p;->T()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final i(JLjava/lang/Runnable;Lq83/j;)Lbc3/s0;
    .locals 0

    invoke-virtual {p0}, Lhc3/p;->T()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final isDispatchNeeded(Lq83/j;)Z
    .locals 0

    invoke-virtual {p0}, Lhc3/p;->T()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final limitedParallelism(ILjava/lang/String;)Lbc3/z;
    .locals 0

    invoke-virtual {p0}, Lhc3/p;->T()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final m(JLbc3/m;)V
    .locals 0

    invoke-virtual {p0}, Lhc3/p;->T()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final s()Lbc3/w1;
    .locals 0

    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    const-string v0, ""

    const/16 v1, 0x5d

    const-string v2, "Dispatchers.Main[missing"

    invoke-static {v1, v2, v0}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
