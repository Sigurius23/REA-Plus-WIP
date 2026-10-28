.class public abstract Ll73/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln73/b;


# virtual methods
.method public abstract a(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ln73/b;
.end method

.method public b(Ljava/lang/Runnable;)V
    .locals 3

    const-wide/16 v0, 0x0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0, p1, v0, v1, v2}, Ll73/f;->a(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ln73/b;

    return-void
.end method
