.class public final Lio/seon/androidsdk/service/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroid/content/Context;

.field public b:Lio/sentry/hints/j;

.field public c:Ljava/lang/String;


# virtual methods
.method public final a()Lio/seon/androidsdk/service/f;
    .locals 4

    iget-object v0, p0, Lio/seon/androidsdk/service/c;->a:Landroid/content/Context;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/seon/androidsdk/service/c;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const-string v0, "SEON"

    const-string v1, "Seon object should be configured first with a context and a session_id!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    new-instance v0, Lio/seon/androidsdk/service/f;

    iget-object v1, p0, Lio/seon/androidsdk/service/c;->a:Landroid/content/Context;

    iget-object v2, p0, Lio/seon/androidsdk/service/c;->c:Ljava/lang/String;

    iget-object v3, p0, Lio/seon/androidsdk/service/c;->b:Lio/sentry/hints/j;

    invoke-direct {v0, v1, v2, v3}, Lio/seon/androidsdk/service/f;-><init>(Landroid/content/Context;Ljava/lang/String;Lio/sentry/hints/j;)V

    return-object v0
.end method
