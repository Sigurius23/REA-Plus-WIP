.class public interface abstract Lqc3/q0;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public b(Lrc3/a;)V
    .locals 1

    if-eqz p1, :cond_0

    const/16 v0, 0x9

    invoke-virtual {p1, v0}, Lrc3/a;->a(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-interface {p0, p1}, Lqc3/q0;->l(Ljava/lang/Integer;)V

    return-void
.end method

.method public abstract c()Ljava/lang/Integer;
.end method

.method public abstract d()Ljava/lang/Integer;
.end method

.method public abstract g()Ljava/lang/Integer;
.end method

.method public abstract h(Ljava/lang/Integer;)V
.end method

.method public abstract j()Lqc3/f;
.end method

.method public abstract k(Ljava/lang/Integer;)V
.end method

.method public abstract l(Ljava/lang/Integer;)V
.end method

.method public abstract n()Ljava/lang/Integer;
.end method

.method public abstract o(Ljava/lang/Integer;)V
.end method

.method public p()Lrc3/a;
    .locals 3

    invoke-interface {p0}, Lqc3/q0;->c()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    new-instance v1, Lrc3/a;

    const/16 v2, 0x9

    invoke-direct {v1, v0, v2}, Lrc3/a;-><init>(II)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract t(Lqc3/f;)V
.end method

.method public abstract u(Ljava/lang/Integer;)V
.end method

.method public abstract v()Ljava/lang/Integer;
.end method
