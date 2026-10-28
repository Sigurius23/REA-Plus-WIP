.class public interface abstract Lqc3/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc3/o;


# direct methods
.method public static g(Lqc3/n;)V
    .locals 3

    sget-object v0, Lqc3/o0;->w:Lqc3/o0;

    check-cast p0, Lqc3/e;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lsc3/c;

    new-instance v2, Lqc3/h0;

    invoke-direct {v2, v0}, Lqc3/h0;-><init>(Lqc3/o0;)V

    invoke-direct {v1, v2}, Lsc3/c;-><init>(Lsc3/j;)V

    invoke-interface {p0, v1}, Lqc3/e;->b(Lsc3/c;)V

    return-void
.end method

.method public static h(Lqc3/n;)V
    .locals 3

    sget-object v0, Lqc3/o0;->w:Lqc3/o0;

    check-cast p0, Lqc3/e;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lsc3/c;

    new-instance v2, Lqc3/e1;

    invoke-direct {v2, v0}, Lqc3/e1;-><init>(Lqc3/o0;)V

    invoke-direct {v1, v2}, Lsc3/c;-><init>(Lsc3/j;)V

    invoke-interface {p0, v1}, Lqc3/e;->b(Lsc3/c;)V

    return-void
.end method
