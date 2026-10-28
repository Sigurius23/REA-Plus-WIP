.class public interface abstract Lqc3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc3/o;


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lqc3/b;->c()Laa3/u0;

    move-result-object v0

    new-instance v1, Lsc3/h;

    invoke-direct {v1, p1}, Lsc3/h;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Laa3/u0;->f(Lsc3/k;)V

    return-void
.end method

.method public build()Lsc3/d;
    .locals 3

    new-instance v0, Lsc3/d;

    invoke-interface {p0}, Lqc3/b;->c()Laa3/u0;

    move-result-object v1

    iget-object v1, v1, Laa3/u0;->a:Ljava/util/ArrayList;

    const-string v2, "formats"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lsc3/d;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public abstract c()Laa3/u0;
.end method

.method public abstract f()Lqc3/b;
.end method
