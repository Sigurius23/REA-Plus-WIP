.class public final Lsr/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lxr/t;

.field public final b:Ljava/lang/String;

.field public final c:Lcq/i;

.field public final d:Lng3/n;

.field public final e:Lxr/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lxr/t;Lng3/n;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcq/i;

    invoke-direct {v0}, Lcq/i;-><init>()V

    iput-object v0, p0, Lsr/h;->c:Lcq/i;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lsr/h;->b:Ljava/lang/String;

    iput-object p2, p0, Lsr/h;->a:Lxr/t;

    iput-object p3, p0, Lsr/h;->d:Lng3/n;

    new-instance p3, Lxr/b;

    sget-object v1, Lsr/i;->a:Landroid/content/Intent;

    new-instance v2, Lng3/o;

    const/16 v3, 0x1b

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Lng3/o;-><init>(IZ)V

    invoke-direct {p3, p1, p2, v1, v2}, Lxr/b;-><init>(Landroid/content/Context;Lxr/t;Landroid/content/Intent;Lng3/o;)V

    iput-object p3, p0, Lsr/h;->e:Lxr/b;

    new-instance p2, Lsr/c;

    invoke-direct {p2, p0, v0, p1}, Lsr/c;-><init>(Lsr/h;Lcq/i;Landroid/content/Context;)V

    invoke-virtual {p3}, Lxr/b;->a()Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static a(Lsr/h;Lsr/o;JJ)Landroid/os/Bundle;
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "package.name"

    iget-object p0, p0, Lsr/h;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "cloud.prj"

    invoke-virtual {v0, p0, p2, p3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string p0, "nonce"

    iget-object p2, p1, Lsr/o;->a:Ljava/lang/String;

    invoke-virtual {v0, p0, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "warm.up.sid"

    invoke-virtual {v0, p0, p4, p5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string p0, "playcore.integrity.version.major"

    const/4 p2, 0x1

    invoke-virtual {v0, p0, p2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p0, "playcore.integrity.version.minor"

    const/4 p2, 0x4

    invoke-virtual {v0, p0, p2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p0, "playcore.integrity.version.patch"

    const/4 p2, 0x0

    invoke-virtual {v0, p0, p2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p0, "webview.request.mode"

    invoke-virtual {v0, p0, p2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    new-instance p0, Ljava/util/ArrayList;

    iget-object p1, p1, Lsr/o;->b:Ljava/util/Set;

    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string p1, "request.verdict.opt.out"

    invoke-virtual {v0, p1, p0}, Landroid/os/Bundle;->putIntegerArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    new-instance p3, Lxr/o;

    const/4 p4, 0x5

    invoke-direct {p3, p4, p1, p2}, Lxr/o;-><init>(IJ)V

    invoke-virtual {p0, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Ljava/util/ArrayList;

    invoke-static {p0}, Lrj/o;->g(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string p0, "event_timestamps"

    invoke-virtual {v0, p0, p1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    return-object v0
.end method

.method public static b(Lsr/h;J)Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "package.name"

    iget-object p0, p0, Lsr/h;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "cloud.prj"

    invoke-virtual {v0, p0, p1, p2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string p0, "playcore.integrity.version.major"

    const/4 p1, 0x1

    invoke-virtual {v0, p0, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p0, "playcore.integrity.version.minor"

    const/4 p1, 0x4

    invoke-virtual {v0, p0, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p0, "playcore.integrity.version.patch"

    const/4 p2, 0x0

    invoke-virtual {v0, p0, p2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p0, "webview.request.mode"

    invoke-virtual {v0, p0, p2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    new-instance p2, Lxr/o;

    invoke-direct {p2, p1, v1, v2}, Lxr/o;-><init>(IJ)V

    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Ljava/util/ArrayList;

    invoke-static {p0}, Lrj/o;->g(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string p0, "event_timestamps"

    invoke-virtual {v0, p0, p1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    return-object v0
.end method

.method public static c(Lsr/h;)Z
    .locals 1

    iget-object v0, p0, Lsr/h;->c:Lcq/i;

    iget-object v0, v0, Lcq/i;->a:Lcq/u;

    invoke-virtual {v0}, Lcq/u;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lsr/h;->c:Lcq/i;

    iget-object p0, p0, Lcq/i;->a:Lcq/u;

    invoke-virtual {p0}, Lcq/u;->getResult()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    const v0, 0x4f8e360

    if-ge p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static d(Lsr/h;)Z
    .locals 1

    iget-object v0, p0, Lsr/h;->c:Lcq/i;

    iget-object v0, v0, Lcq/i;->a:Lcq/u;

    invoke-virtual {v0}, Lcq/u;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lsr/h;->c:Lcq/i;

    iget-object p0, p0, Lcq/i;->a:Lcq/u;

    invoke-virtual {p0}, Lcq/u;->getResult()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
