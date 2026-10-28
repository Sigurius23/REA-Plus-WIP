.class public final Lcom/whoop/service/rearchitect/c$h;
.super Llk0/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/service/rearchitect/c;-><init>(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Ljava/lang/Class;Lin2/d;Lz82/b;Lq92/h;Landroid/os/HandlerThread;Lmc3/a;Lbc3/c0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "com/whoop/service/rearchitect/c$h",
        "Llk0/b;",
        "Llt0/m;",
        "returnedObj",
        "Ll83/a0;",
        "f",
        "(Llt0/m;)V",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic E:Lbc3/c0;

.field final synthetic z:Lcom/whoop/service/rearchitect/c;


# direct methods
.method public constructor <init>(Lcom/whoop/service/rearchitect/c;Lbc3/c0;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    iput-object p2, p0, Lcom/whoop/service/rearchitect/c$h;->E:Lbc3/c0;

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2, p1}, Llk0/b;-><init>(Landroid/os/Handler;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic d(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Llt0/m;

    invoke-virtual {p0, p1}, Lcom/whoop/service/rearchitect/c$h;->f(Llt0/m;)V

    return-void
.end method

.method public f(Llt0/m;)V
    .locals 6

    const-string v0, "returnedObj"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Llt0/k;->b()Llt0/c;

    move-result-object p1

    instance-of v0, p1, Lek0/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-virtual {v0}, Lcom/whoop/service/rearchitect/c;->b()Lkk0/a;

    move-result-object v0

    check-cast p1, Lek0/b;

    invoke-virtual {p1}, Lek0/b;->b()Lkk0/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkk0/a;->c(Lkk0/a;)V

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    new-instance v1, Lws0/a;

    invoke-virtual {p1}, Lek0/b;->b()Lkk0/a;

    move-result-object v2

    invoke-virtual {v2}, Lkk0/a;->d()B

    move-result v2

    invoke-direct {v1, v2}, Lws0/a;-><init>(I)V

    invoke-static {v0, v1}, Lcom/whoop/service/rearchitect/c;->a3(Lcom/whoop/service/rearchitect/c;Lws0/a;)V

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/c;->P2(Lcom/whoop/service/rearchitect/c;)Z

    move-result v0

    if-eqz v0, :cond_18

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-virtual {v0}, Lcom/whoop/service/rearchitect/c;->n()Lkk0/b;

    move-result-object v0

    invoke-virtual {p1}, Lek0/b;->T()Lkk0/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lkk0/b;->c(Lkk0/b;)V

    return-void

    :cond_0
    instance-of v0, p1, Lek0/k;

    const/4 v1, 0x6

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-static {p1}, Lcom/whoop/service/rearchitect/c;->N2(Lcom/whoop/service/rearchitect/c;)Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object p1

    if-eqz p1, :cond_18

    invoke-virtual {p1}, Lcom/whoop/domain/model/WhoopStrapInfo;->getHardwareVersion()Loh2/c;

    move-result-object p1

    if-eqz p1, :cond_18

    invoke-virtual {p1}, Loh2/c;->a()J

    move-result-wide v2

    long-to-int p1, v2

    if-ne p1, v1, :cond_18

    iget-object p1, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-virtual {p1}, Lcom/whoop/service/rearchitect/c;->n()Lkk0/b;

    move-result-object p1

    invoke-virtual {p1}, Lkk0/b;->j()V

    return-void

    :cond_1
    instance-of v0, p1, Lek0/j;

    if-eqz v0, :cond_2

    iget-object p1, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-static {p1}, Lcom/whoop/service/rearchitect/c;->N2(Lcom/whoop/service/rearchitect/c;)Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object p1

    if-eqz p1, :cond_18

    invoke-virtual {p1}, Lcom/whoop/domain/model/WhoopStrapInfo;->getHardwareVersion()Loh2/c;

    move-result-object p1

    if-eqz p1, :cond_18

    invoke-virtual {p1}, Loh2/c;->a()J

    move-result-wide v2

    long-to-int p1, v2

    if-ne p1, v1, :cond_18

    iget-object p1, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-virtual {p1}, Lcom/whoop/service/rearchitect/c;->n()Lkk0/b;

    move-result-object p1

    invoke-virtual {p1}, Lkk0/b;->k()V

    return-void

    :cond_2
    instance-of v0, p1, Lek0/m;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_3

    iget-object p1, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-static {p1}, Lcom/whoop/service/rearchitect/c;->G2(Lcom/whoop/service/rearchitect/c;)Loh3/d;

    move-result-object p1

    const-string v0, "Double tap sync"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v3}, Loh3/d;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-static {p1}, Lcom/whoop/service/rearchitect/c;->F2(Lcom/whoop/service/rearchitect/c;)Lca2/f;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-static {p1, v0, v2, v1, v2}, Lca2/f;->c(Lca2/f;Ljk0/d;Ljava/lang/String;ILjava/lang/Object;)V

    return-void

    :cond_3
    instance-of v0, p1, Lek0/n;

    if-eqz v0, :cond_4

    iget-object p1, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-static {p1}, Lcom/whoop/service/rearchitect/c;->G2(Lcom/whoop/service/rearchitect/c;)Loh3/d;

    move-result-object p1

    const-string v0, "Flash init sync"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v3}, Loh3/d;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-static {p1}, Lcom/whoop/service/rearchitect/c;->F2(Lcom/whoop/service/rearchitect/c;)Lca2/f;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-static {p1, v0, v2, v1, v2}, Lca2/f;->c(Lca2/f;Ljk0/d;Ljava/lang/String;ILjava/lang/Object;)V

    return-void

    :cond_4
    instance-of v0, p1, Lek0/y;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/c;->G2(Lcom/whoop/service/rearchitect/c;)Loh3/d;

    move-result-object v0

    const-string v4, "Condition report sync"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v4, v3}, Loh3/d;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-virtual {v0}, Lcom/whoop/service/rearchitect/c;->b()Lkk0/a;

    move-result-object v0

    check-cast p1, Lek0/y;

    invoke-virtual {p1}, Lek0/y;->X()F

    move-result v3

    float-to-int v3, v3

    int-to-byte v3, v3

    invoke-virtual {v0, v3}, Lkk0/a;->m(B)V

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/c;->F2(Lcom/whoop/service/rearchitect/c;)Lca2/f;

    move-result-object v0

    iget-object v3, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-static {v0, v3, v2, v1, v2}, Lca2/f;->c(Lca2/f;Ljk0/d;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-virtual {v0}, Lcom/whoop/service/rearchitect/c;->n3()Ljk0/g;

    move-result-object v0

    invoke-virtual {p1}, Lek0/y;->Z()Z

    move-result p1

    if-eqz p1, :cond_5

    sget-object p1, Ljk0/a;->STRAP_ON_BODY:Ljk0/a;

    goto :goto_0

    :cond_5
    sget-object p1, Ljk0/a;->STRAP_OFF_BODY:Ljk0/a;

    :goto_0
    invoke-virtual {v0, p1}, Ljk0/g;->b(Ljk0/a;)V

    return-void

    :cond_6
    instance-of v0, p1, Lek0/x;

    const/4 v1, 0x3

    if-eqz v0, :cond_7

    iget-object p1, p0, Lcom/whoop/service/rearchitect/c$h;->E:Lbc3/c0;

    new-instance v0, Lcom/whoop/service/rearchitect/c$h$a;

    iget-object v3, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-direct {v0, v3, v2}, Lcom/whoop/service/rearchitect/c$h$a;-><init>(Lcom/whoop/service/rearchitect/c;Lq83/d;)V

    invoke-static {p1, v2, v2, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_7
    instance-of v0, p1, Lek0/a0;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/c;->J2(Lcom/whoop/service/rearchitect/c;)Lg83/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg83/d;->onNext(Ljava/lang/Object;)V

    return-void

    :cond_8
    instance-of v0, p1, Lek0/a;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/c;->J2(Lcom/whoop/service/rearchitect/c;)Lg83/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg83/d;->onNext(Ljava/lang/Object;)V

    return-void

    :cond_9
    instance-of v0, p1, Lek0/z;

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/c;->J2(Lcom/whoop/service/rearchitect/c;)Lg83/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg83/d;->onNext(Ljava/lang/Object;)V

    return-void

    :cond_a
    instance-of v0, p1, Lek0/b0;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/c;->J2(Lcom/whoop/service/rearchitect/c;)Lg83/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg83/d;->onNext(Ljava/lang/Object;)V

    return-void

    :cond_b
    instance-of v0, p1, Lek0/v;

    if-eqz v0, :cond_c

    iget-object p1, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-static {p1}, Lcom/whoop/service/rearchitect/c;->G2(Lcom/whoop/service/rearchitect/c;)Loh3/d;

    move-result-object p1

    const-string v0, "Received a HighFreqSyncPromptEventPacket"

    new-array v1, v3, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1}, Loh3/d;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-static {p1}, Lcom/whoop/service/rearchitect/c;->G2(Lcom/whoop/service/rearchitect/c;)Loh3/d;

    move-result-object p1

    const-string v0, "Triggering 1 minute sync based on the High Freq Sync Prompt"

    new-array v1, v3, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1}, Loh3/d;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-static {p1}, Lcom/whoop/service/rearchitect/c;->F2(Lcom/whoop/service/rearchitect/c;)Lca2/f;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    const-string v1, "HighFreqJob"

    invoke-interface {p1, v0, v1}, Lca2/f;->d(Ljk0/d;Ljava/lang/String;)V

    return-void

    :cond_c
    instance-of v0, p1, Lek0/t;

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/c;->G2(Lcom/whoop/service/rearchitect/c;)Loh3/d;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "emitting HighFreqSyncEnabledPacket "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Loh3/d;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/c;->E2(Lcom/whoop/service/rearchitect/c;)Le83/c;

    move-result-object v0

    invoke-interface {v0, p1}, Leg3/a;->onNext(Ljava/lang/Object;)V

    return-void

    :cond_d
    instance-of v0, p1, Lek0/s;

    if-eqz v0, :cond_e

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/c;->G2(Lcom/whoop/service/rearchitect/c;)Loh3/d;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "emitting HighFreqSyncDisabledPacket "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Loh3/d;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/c;->E2(Lcom/whoop/service/rearchitect/c;)Le83/c;

    move-result-object v0

    invoke-interface {v0, p1}, Leg3/a;->onNext(Ljava/lang/Object;)V

    return-void

    :cond_e
    instance-of v0, p1, Lek0/e0;

    const/4 v4, 0x1

    if-eqz v0, :cond_f

    sget-object p1, Lcom/whoop/service/rearchitect/c;->r1:Lcom/whoop/service/rearchitect/c$b;

    invoke-virtual {p1}, Lcom/whoop/service/rearchitect/c$b;->c()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p1

    invoke-virtual {p1, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object p1, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-virtual {p1}, Lcom/whoop/service/rearchitect/c;->n3()Ljk0/g;

    move-result-object p1

    sget-object v0, Ljk0/a;->STRAP_ON_BODY:Ljk0/a;

    invoke-virtual {p1, v0}, Ljk0/g;->b(Ljk0/a;)V

    return-void

    :cond_f
    instance-of v0, p1, Lek0/d0;

    if-eqz v0, :cond_10

    sget-object p1, Lcom/whoop/service/rearchitect/c;->r1:Lcom/whoop/service/rearchitect/c$b;

    invoke-virtual {p1}, Lcom/whoop/service/rearchitect/c$b;->c()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p1

    invoke-virtual {p1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object p1, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-virtual {p1}, Lcom/whoop/service/rearchitect/c;->n3()Ljk0/g;

    move-result-object p1

    sget-object v0, Ljk0/a;->STRAP_OFF_BODY:Ljk0/a;

    invoke-virtual {p1, v0}, Ljk0/g;->b(Ljk0/a;)V

    return-void

    :cond_10
    instance-of v0, p1, Lek0/c;

    if-eqz v0, :cond_12

    iget-object p1, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-static {p1}, Lcom/whoop/service/rearchitect/c;->Q2(Lcom/whoop/service/rearchitect/c;)Z

    move-result p1

    if-eqz p1, :cond_11

    iget-object p1, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-virtual {p1}, Lcom/whoop/service/rearchitect/c;->n()Lkk0/b;

    move-result-object p1

    invoke-virtual {p1}, Lkk0/b;->j()V

    :cond_11
    iget-object p1, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-static {p1, v4}, Lcom/whoop/service/rearchitect/c;->W2(Lcom/whoop/service/rearchitect/c;Z)V

    return-void

    :cond_12
    instance-of v0, p1, Lek0/e;

    if-eqz v0, :cond_14

    iget-object p1, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-static {p1}, Lcom/whoop/service/rearchitect/c;->Q2(Lcom/whoop/service/rearchitect/c;)Z

    move-result p1

    if-eqz p1, :cond_13

    iget-object p1, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-virtual {p1}, Lcom/whoop/service/rearchitect/c;->n()Lkk0/b;

    move-result-object p1

    invoke-virtual {p1}, Lkk0/b;->k()V

    :cond_13
    iget-object p1, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-static {p1, v3}, Lcom/whoop/service/rearchitect/c;->W2(Lcom/whoop/service/rearchitect/c;Z)V

    return-void

    :cond_14
    instance-of v0, p1, Lek0/p;

    if-eqz v0, :cond_15

    iget-object p1, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-static {p1}, Lcom/whoop/service/rearchitect/c;->G2(Lcom/whoop/service/rearchitect/c;)Loh3/d;

    move-result-object p1

    const-string v0, "Received Haptics Fired Event"

    new-array v1, v3, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1}, Loh3/d;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_15
    instance-of v0, p1, Lek0/q;

    if-eqz v0, :cond_16

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/c;->G2(Lcom/whoop/service/rearchitect/c;)Loh3/d;

    move-result-object v0

    check-cast p1, Lek0/q;

    invoke-virtual {p1}, Lek0/q;->T()I

    move-result v1

    invoke-virtual {p1}, Lek0/q;->U()Lek0/r;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Received Haptics terminated event, Revision - "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", Termination Code - "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, v3, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, Loh3/d;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_16
    instance-of v0, p1, Lek0/d;

    if-eqz v0, :cond_18

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-static {v0}, Lcom/whoop/service/rearchitect/c;->G2(Lcom/whoop/service/rearchitect/c;)Loh3/d;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Received Battery Pack Info event - "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v4, v3}, Loh3/d;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    move-object v0, p1

    check-cast v0, Lek0/d;

    invoke-virtual {v0}, Lek0/d;->W()Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

    move-result-object v3

    sget-object v4, Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;->PUFFIN:Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

    if-ne v3, v4, :cond_18

    invoke-virtual {v0}, Lek0/d;->T()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxj0/l;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_17

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$h;->E:Lbc3/c0;

    new-instance v3, Lcom/whoop/service/rearchitect/c$h$b;

    iget-object v4, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    invoke-direct {v3, v4, p1, v2}, Lcom/whoop/service/rearchitect/c$h$b;-><init>(Lcom/whoop/service/rearchitect/c;Llt0/c;Lq83/d;)V

    invoke-static {v0, v2, v2, v3, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_17
    iget-object p1, p0, Lcom/whoop/service/rearchitect/c$h;->z:Lcom/whoop/service/rearchitect/c;

    const-string v0, "Puffin name was empty in Battery Pack Slid-On Event from Strap"

    invoke-static {p1, v0}, Lcom/whoop/service/rearchitect/c;->S2(Lcom/whoop/service/rearchitect/c;Ljava/lang/String;)V

    :cond_18
    return-void
.end method
