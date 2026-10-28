.class public abstract Lhn/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lhn/i;Lsm/f;)V
    .locals 1

    iget-object p1, p1, Lsm/f;->a:Lsm/e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lc9/g;->d()Landroid/media/metrics/LogSessionId;

    move-result-object p1

    invoke-virtual {p1, p1}, Landroid/media/metrics/LogSessionId;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p0, p0, Lhn/i;->b:Landroid/media/MediaFormat;

    const-string v0, "log-session-id"

    invoke-virtual {p1}, Landroid/media/metrics/LogSessionId;->getStringId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
