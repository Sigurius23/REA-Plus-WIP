.class public interface abstract Lqa/l;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public L([BII)Lqa/e;
    .locals 6

    invoke-static {}, Lzr/g0;->l()Lzr/d0;

    move-result-object p2

    new-instance v5, Lmm/d;

    const/16 v0, 0x14

    invoke-direct {v5, p2, v0}, Lmm/d;-><init>(Ljava/lang/Object;I)V

    const/4 v2, 0x0

    sget-object v4, Lqa/k;->c:Lqa/k;

    move-object v0, p0

    move-object v1, p1

    move v3, p3

    invoke-interface/range {v0 .. v5}, Lqa/l;->k([BIILqa/k;Lx8/d;)V

    new-instance p1, Lqa/c;

    invoke-virtual {p2}, Lzr/d0;->f()Lzr/w0;

    move-result-object p2

    invoke-direct {p1, p2}, Lqa/c;-><init>(Lzr/w0;)V

    return-object p1
.end method

.method public abstract c0()I
.end method

.method public abstract k([BIILqa/k;Lx8/d;)V
.end method

.method public reset()V
    .locals 0

    return-void
.end method
