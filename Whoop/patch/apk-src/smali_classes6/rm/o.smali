.class public abstract Lrm/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()Lsm/f;
    .locals 2

    new-instance v0, Lsm/f;

    invoke-static {}, Lc9/g;->d()Landroid/media/metrics/LogSessionId;

    new-instance v1, Lsm/e;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-direct {v0, v1}, Lsm/f;-><init>(Lsm/e;)V

    return-object v0
.end method
