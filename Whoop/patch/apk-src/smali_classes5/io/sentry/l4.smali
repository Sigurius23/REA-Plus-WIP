.class public interface abstract Lio/sentry/l4;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static y(Lio/sentry/v0;Ljava/lang/String;)Z
    .locals 3

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    :goto_0
    sget-object p1, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v0, "No cached dir path is defined in options."

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-interface {p0, p1, v0, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return v1
.end method


# virtual methods
.method public abstract t(Lio/sentry/d1;Lio/sentry/q6;)Lio/sentry/k4;
.end method
