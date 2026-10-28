.class public interface abstract Lqc3/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc3/n;


# direct methods
.method public static e(Lqc3/l;)V
    .locals 3

    sget-object v0, Lqc3/o0;->w:Lqc3/o0;

    check-cast p0, Lqc3/c;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lsc3/c;

    new-instance v2, Lqc3/p;

    invoke-direct {v2, v0}, Lqc3/p;-><init>(Lqc3/o0;)V

    invoke-direct {v1, v2}, Lsc3/c;-><init>(Lsc3/j;)V

    invoke-interface {p0, v1}, Lqc3/c;->i(Lsc3/k;)V

    return-void
.end method
