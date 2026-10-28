.class public final synthetic Lio/seon/androidsdk/service/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# virtual methods
.method public final run()V
    .locals 5

    sget-boolean v0, Lio/seon/androidsdk/service/PageSizeUtil;->a:Z

    if-nez v0, :cond_0

    sget-object v0, Lio/seon/androidsdk/service/PageSizeUtil;->b:Landroid/content/Context;

    if-eqz v0, :cond_0

    new-instance v1, Ls/m2;

    const/16 v2, 0xc

    invoke-direct {v1, v2}, Ls/m2;-><init>(I)V

    const-string v2, "Beginning load of %s..."

    const-string v3, "pgs"

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2, v4}, Ls/m2;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v1, v0, v3}, Ls/m2;->n(Landroid/content/Context;Ljava/lang/String;)V

    const/4 v0, 0x1

    sput-boolean v0, Lio/seon/androidsdk/service/PageSizeUtil;->a:Z

    :cond_0
    return-void
.end method
