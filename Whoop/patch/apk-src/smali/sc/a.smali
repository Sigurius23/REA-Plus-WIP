.class public interface abstract Lsc/a;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public a(Ljava/lang/Runnable;)V
    .locals 1

    move-object v0, p0

    check-cast v0, Lsc/b;

    iget-object v0, v0, Lsc/b;->a:Landroidx/room/u1;

    invoke-virtual {v0, p1}, Landroidx/room/u1;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
