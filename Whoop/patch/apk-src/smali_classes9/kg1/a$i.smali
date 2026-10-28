.class final Lkg1/a$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkg1/a;->o(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Z)Lec3/l;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lgt0/h;",
        "it",
        "Ll83/a0;",
        "<anonymous>",
        "(Lgt0/h;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.firmwareUpdateService.data.FirmwareUpdateManagerImpl$startFwUpdate$2$1"
    f = "FirmwareUpdateManagerImpl.kt"
    l = {
        0x62
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Z

.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lkg1/a;

.field final synthetic z:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;


# direct methods
.method public constructor <init>(Lkg1/a;Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;ZLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkg1/a;",
            "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;",
            "Z",
            "Lq83/d<",
            "-",
            "Lkg1/a$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkg1/a$i;->y:Lkg1/a;

    iput-object p2, p0, Lkg1/a$i;->z:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    iput-boolean p3, p0, Lkg1/a$i;->E:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lkg1/a$i;

    iget-object v1, p0, Lkg1/a$i;->y:Lkg1/a;

    iget-object v2, p0, Lkg1/a$i;->z:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    iget-boolean v3, p0, Lkg1/a$i;->E:Z

    invoke-direct {v0, v1, v2, v3, p2}, Lkg1/a$i;-><init>(Lkg1/a;Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;ZLq83/d;)V

    iput-object p1, v0, Lkg1/a$i;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lgt0/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgt0/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lkg1/a$i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkg1/a$i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkg1/a$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgt0/h;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkg1/a$i;->f(Lgt0/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lkg1/a$i;->x:Ljava/lang/Object;

    check-cast v0, Lgt0/h;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lkg1/a$i;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lkg1/a$i;->y:Lkg1/a;

    iget-object v2, p0, Lkg1/a$i;->z:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    iget-boolean v4, p0, Lkg1/a$i;->E:Z

    const/4 v5, 0x0

    iput-object v5, p0, Lkg1/a$i;->x:Ljava/lang/Object;

    iput v3, p0, Lkg1/a$i;->w:I

    invoke-static {p1, v2, v0, v4, p0}, Lkg1/a;->m(Lkg1/a;Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Lgt0/h;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
