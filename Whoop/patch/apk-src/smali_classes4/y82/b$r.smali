.class final enum Ly82/b$r;
.super Ly82/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly82/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4011
    name = null
.end annotation


# direct methods
.method public synthetic constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x7

    const-string v1, "Trigger Background FW Update"

    const-string v2, "TRIGGER_BACKGROUND_FW_UPDATE"

    invoke-direct {p0, v2, v0, v1}, Ly82/b$r;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, Ly82/b;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public perform(Landroid/content/Context;)Ly82/b$t;
    .locals 3

    const-class p1, Lgt0/e;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgt0/e;

    const-class v1, Lci2/b;

    invoke-static {v1, v0, v0}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lci2/b;

    invoke-interface {v1}, Lci2/b;->b()Lec3/t1;

    move-result-object v1

    invoke-interface {v1}, Lec3/t1;->getReplayCache()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljk0/d;

    :cond_0
    if-eqz v0, :cond_1

    new-instance v1, Lgt0/g$a;

    invoke-static {v0}, Lci2/a;->b(Ljk0/d;)Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    move-result-object v0

    invoke-direct {v1, v0}, Lgt0/g$a;-><init>(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)V

    invoke-interface {p1, v1}, Lgt0/e;->b(Lgt0/g;)Lec3/l;

    invoke-static {}, Ly82/b$t;->c()Ly82/b$t;

    move-result-object p1

    return-object p1

    :cond_1
    const-string p1, "No strap connected"

    invoke-static {p1}, Ly82/b$t;->b(Ljava/lang/String;)Ly82/b$t;

    move-result-object p1

    return-object p1
.end method
