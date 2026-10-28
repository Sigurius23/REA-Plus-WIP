.class public interface abstract Luf/o;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public c(Lm63/d;)V
    .locals 3

    iget-object p1, p1, Lm63/d;->x:Ljava/lang/Object;

    check-cast p1, Lio/sentry/android/replay/video/d;

    iget-object p1, p1, Lio/sentry/android/replay/video/d;->b:Ljava/lang/Object;

    check-cast p1, Lag/e;

    sget-object v0, Lag/f;->w:Lag/f;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lag/f;->x:Lag/f;

    new-instance v1, Lag/e;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lag/e;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v1, v0}, Lag/e;->c(Lag/b;Lag/f;)V

    return-void
.end method

.method public abstract d(Ljava/lang/Object;Lag/d;)Ljava/lang/Object;
.end method
