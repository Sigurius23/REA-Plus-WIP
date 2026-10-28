.class final Lkg1/a$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkg1/a;->d(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)Lec3/f2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.firmwareUpdateService.data.FirmwareUpdateManagerImpl$observeUpdate$1"
    f = "FirmwareUpdateManagerImpl.kt"
    l = {
        0x8f,
        0x90
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lkg1/a;

.field final synthetic y:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

.field final synthetic z:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkg1/a;Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Lec3/f2;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkg1/a;",
            "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;",
            "Lec3/f2;",
            "Lq83/d<",
            "-",
            "Lkg1/a$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkg1/a$d;->x:Lkg1/a;

    iput-object p2, p0, Lkg1/a$d;->y:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    iput-object p3, p0, Lkg1/a$d;->z:Lec3/f2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lkg1/a$d;

    iget-object v0, p0, Lkg1/a$d;->x:Lkg1/a;

    iget-object v1, p0, Lkg1/a$d;->y:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    iget-object v2, p0, Lkg1/a$d;->z:Lec3/f2;

    invoke-direct {p1, v0, v1, v2, p2}, Lkg1/a$d;-><init>(Lkg1/a;Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Lec3/f2;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lkg1/a$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkg1/a$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkg1/a$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkg1/a$d;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkg1/a$d;->w:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lkg1/a$d;->x:Lkg1/a;

    invoke-static {p1}, Lkg1/a;->j(Lkg1/a;)Lsg1/a;

    move-result-object p1

    iget-object v1, p0, Lkg1/a$d;->y:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    invoke-virtual {v1}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;->getSerial()Ljava/lang/String;

    move-result-object v1

    iput v3, p0, Lkg1/a$d;->w:I

    invoke-interface {p1, v1, p0}, Lsg1/a;->j(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lkg1/a$d;->z:Lec3/f2;

    invoke-interface {p1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Lgt0/h$e;

    if-nez p1, :cond_4

    iget-object p1, p0, Lkg1/a$d;->x:Lkg1/a;

    invoke-static {p1}, Lkg1/a;->h(Lkg1/a;)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object p1

    const-string v1, "silent-forced-fw-update"

    invoke-interface {p1, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lkg1/a$d;->x:Lkg1/a;

    invoke-static {p1}, Lkg1/a;->l(Lkg1/a;)Lrg1/c;

    move-result-object p1

    iget-object v1, p0, Lkg1/a$d;->y:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    new-instance v4, Lgt0/h$d;

    const/4 v5, 0x0

    invoke-direct {v4, v3, v5}, Lgt0/h$d;-><init>(ZZ)V

    iput v2, p0, Lkg1/a$d;->w:I

    invoke-virtual {p1, v1, v4, p0}, Lrg1/c;->a(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Lgt0/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
