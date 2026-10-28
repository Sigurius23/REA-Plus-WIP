.class public final Lr0/d;
.super Lb2/v;
.source "SourceFile"


# instance fields
.field public O:Lr0/a;


# virtual methods
.method public final M0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final P0()V
    .locals 2

    iget-object v0, p0, Lr0/d;->O:Lr0/a;

    instance-of v1, v0, Lr0/c;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lr0/c;

    iget-object v1, v1, Lr0/c;->a:Lr1/c;

    invoke-virtual {v1, p0}, Lr1/c;->k(Ljava/lang/Object;)Z

    :cond_0
    instance-of v1, v0, Lr0/c;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lr0/c;

    iget-object v1, v1, Lr0/c;->a:Lr1/c;

    invoke-virtual {v1, p0}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_1
    iput-object v0, p0, Lr0/d;->O:Lr0/a;

    return-void
.end method

.method public final Q0()V
    .locals 2

    iget-object v0, p0, Lr0/d;->O:Lr0/a;

    instance-of v1, v0, Lr0/c;

    if-eqz v1, :cond_0

    check-cast v0, Lr0/c;

    iget-object v0, v0, Lr0/c;->a:Lr1/c;

    invoke-virtual {v0, p0}, Lr1/c;->k(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
