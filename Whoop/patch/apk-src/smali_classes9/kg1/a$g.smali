.class public final Lkg1/a$g;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


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
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "it",
        "Ll83/a0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.firmwareUpdateService.data.FirmwareUpdateManagerImpl$startFwUpdate$$inlined$flatMapLatest$1"
    f = "FirmwareUpdateManagerImpl.kt"
    l = {
        0xc0,
        0xbd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Z

.field final synthetic F:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

.field final synthetic G:Lug1/e;

.field H:Ljava/lang/Object;

.field I:Ljava/lang/Object;

.field J:Z

.field K:I

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lkg1/a;


# direct methods
.method public constructor <init>(Lq83/d;Lkg1/a;ZLcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Lug1/e;)V
    .locals 0

    iput-object p2, p0, Lkg1/a$g;->z:Lkg1/a;

    iput-boolean p3, p0, Lkg1/a$g;->E:Z

    iput-object p4, p0, Lkg1/a$g;->F:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    iput-object p5, p0, Lkg1/a$g;->G:Lug1/e;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Ljava/lang/Boolean;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lkg1/a$g;

    iget-object v2, p0, Lkg1/a$g;->z:Lkg1/a;

    iget-boolean v3, p0, Lkg1/a$g;->E:Z

    iget-object v4, p0, Lkg1/a$g;->F:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    iget-object v5, p0, Lkg1/a$g;->G:Lug1/e;

    move-object v1, p3

    invoke-direct/range {v0 .. v5}, Lkg1/a$g;-><init>(Lq83/d;Lkg1/a;ZLcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Lug1/e;)V

    iput-object p1, v0, Lkg1/a$g;->x:Ljava/lang/Object;

    iput-object p2, v0, Lkg1/a$g;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lkg1/a$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lkg1/a$g;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkg1/a$g;->w:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lkg1/a$g;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lkg1/a$g;->I:Ljava/lang/Object;

    check-cast v1, Lq83/d;

    iget-object v1, p0, Lkg1/a$g;->H:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    iget-object v3, p0, Lkg1/a$g;->x:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lkg1/a$g;->x:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lec3/m;

    iget-object p1, p0, Lkg1/a$g;->y:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 v5, 0x0

    if-eqz p1, :cond_4

    iget-object v6, p0, Lkg1/a$g;->z:Lkg1/a;

    invoke-static {v6}, Lkg1/a;->i(Lkg1/a;)Lgt0/d;

    move-result-object v6

    iget-boolean v7, p0, Lkg1/a$g;->E:Z

    iget-object v8, p0, Lkg1/a$g;->F:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    invoke-interface {v6, v7, v8}, Lgt0/d;->c(ZLcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)V

    iget-object v6, p0, Lkg1/a$g;->z:Lkg1/a;

    invoke-static {v6}, Lkg1/a;->l(Lkg1/a;)Lrg1/c;

    move-result-object v6

    iget-object v7, p0, Lkg1/a$g;->F:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    new-instance v8, Lgt0/h$g;

    invoke-static {v5}, Lbt0/c;->a(I)I

    move-result v9

    iget-boolean v10, p0, Lkg1/a$g;->E:Z

    xor-int/2addr v10, v3

    invoke-direct {v8, v9, v10, v4}, Lgt0/h$g;-><init>(IZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v4, p0, Lkg1/a$g;->x:Ljava/lang/Object;

    iput-object v4, p0, Lkg1/a$g;->y:Ljava/lang/Object;

    iput-object v1, p0, Lkg1/a$g;->H:Ljava/lang/Object;

    iput-object v4, p0, Lkg1/a$g;->I:Ljava/lang/Object;

    iput-boolean p1, p0, Lkg1/a$g;->J:Z

    iput v5, p0, Lkg1/a$g;->K:I

    iput v3, p0, Lkg1/a$g;->w:I

    invoke-virtual {v6, v7, v8, p0}, Lrg1/c;->a(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Lgt0/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    iget-object p1, p0, Lkg1/a$g;->G:Lug1/e;

    new-instance v3, Lug1/i$a;

    iget-object v5, p0, Lkg1/a$g;->F:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    iget-boolean v6, p0, Lkg1/a$g;->E:Z

    invoke-direct {v3, v5, v6}, Lug1/i$a;-><init>(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Z)V

    new-instance v5, La6/u;

    const/4 v6, 0x1

    invoke-direct {v5, v3, v6}, La6/u;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p1, v5}, Lod1/g;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    new-instance v3, Lkg1/a$i;

    iget-object v5, p0, Lkg1/a$g;->z:Lkg1/a;

    iget-object v6, p0, Lkg1/a$g;->F:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    iget-boolean v7, p0, Lkg1/a$g;->E:Z

    invoke-direct {v3, v5, v6, v7, v4}, Lkg1/a$i;-><init>(Lkg1/a;Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;ZLq83/d;)V

    new-instance v5, Lec3/j1;

    const/4 v6, 0x0

    invoke-direct {v5, p1, v3, v6}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    goto :goto_1

    :cond_4
    iget-object p1, p0, Lkg1/a$g;->z:Lkg1/a;

    invoke-static {p1}, Lkg1/a;->k(Lkg1/a;)Ltr2/n;

    move-result-object p1

    iget-object v3, p0, Lkg1/a$g;->F:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    invoke-virtual {v3}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;->getDeviceName()Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Firmware files not found for device: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v6, v5, [Lqr2/a$a;

    invoke-interface {p1, v3, v6}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lgt0/h$b;

    sget-object v3, Lgt0/f$b;->b:Lgt0/f$b;

    invoke-direct {p1, v3, v5, v2, v4}, Lgt0/h$b;-><init>(Lgt0/f;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, La6/u;

    const/4 v3, 0x1

    invoke-direct {v5, p1, v3}, La6/u;-><init>(Ljava/lang/Object;I)V

    :goto_1
    iput-object v4, p0, Lkg1/a$g;->x:Ljava/lang/Object;

    iput-object v4, p0, Lkg1/a$g;->y:Ljava/lang/Object;

    iput-object v4, p0, Lkg1/a$g;->H:Ljava/lang/Object;

    iput-object v4, p0, Lkg1/a$g;->I:Ljava/lang/Object;

    iput v2, p0, Lkg1/a$g;->w:I

    invoke-static {v1, v5, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_2
    return-object v0

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
