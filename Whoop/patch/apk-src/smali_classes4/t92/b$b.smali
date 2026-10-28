.class public final Lt92/b$b;
.super Lnk0/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt92/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt92/b$b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lt92/b$b;",
        "Lnk0/a$a;",
        "Llt0/c;",
        "blePacket",
        "Lst0/v;",
        "strapGen",
        "<init>",
        "(Lt92/b;Llt0/c;Lst0/v;)V",
        "Ll83/a0;",
        "run",
        "()V",
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
.field final synthetic z:Lt92/b;


# direct methods
.method public constructor <init>(Lt92/b;Llt0/c;Lst0/v;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llt0/c;",
            "Lst0/v;",
            ")V"
        }
    .end annotation

    const-string v0, "blePacket"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strapGen"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lt92/b$b;->z:Lt92/b;

    invoke-direct {p0, p2, p3}, Lnk0/a$a;-><init>(Llt0/c;Lst0/v;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    invoke-virtual {p0}, Lnk0/a$a;->a()Llt0/c;

    move-result-object v0

    instance-of v0, v0, Lxj0/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lt92/b$b;->z:Lt92/b;

    invoke-virtual {v0}, Lt92/b;->Y1()B

    move-result v0

    invoke-virtual {p0, v0}, Lnk0/a$a;->d(B)V

    :cond_0
    invoke-virtual {p0}, Lnk0/a$a;->a()Llt0/c;

    move-result-object v0

    instance-of v0, v0, Lxj0/z;

    const/4 v1, 0x0

    const-string v2, "droid-enable-fw-update-verbose-logging"

    if-eqz v0, :cond_1

    iget-object v0, p0, Lt92/b$b;->z:Lt92/b;

    invoke-virtual {v0}, Lt92/b;->P1()Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v0

    invoke-interface {v0, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    iget-object v0, p0, Lt92/b$b;->z:Lt92/b;

    invoke-static {v0}, Lt92/b;->o1(Lt92/b;)Ltr2/n;

    move-result-object v0

    invoke-virtual {p0}, Lnk0/a$a;->a()Llt0/c;

    move-result-object v3

    invoke-virtual {p0}, Lnk0/a$a;->a()Llt0/c;

    move-result-object v4

    invoke-virtual {v4}, Llt0/c;->O()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "outgoing BlePacket: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " with data "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v4, v1, [Lqr2/a$a;

    invoke-interface {v0, v3, v4}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_2
    invoke-virtual {p0}, Lnk0/a$a;->b()Lst0/v;

    move-result-object v0

    sget-object v3, Lt92/b$b$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v3, v0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_0
    sget-object v0, Lmt0/b;->f:Lmt0/b$a;

    new-instance v3, Lmt0/h;

    invoke-virtual {p0}, Lnk0/a$a;->a()Llt0/c;

    move-result-object v4

    invoke-virtual {v4}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-direct {v3, v4}, Lmt0/h;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-virtual {v0, v3}, Lmt0/b$a;->a(Llt0/i;)Lmt0/b;

    move-result-object v0

    goto :goto_0

    :pswitch_1
    sget-object v0, Lmt0/b;->f:Lmt0/b$a;

    new-instance v3, Lmt0/d;

    invoke-virtual {p0}, Lnk0/a$a;->a()Llt0/c;

    move-result-object v4

    invoke-virtual {v4}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-direct {v3, v4}, Lmt0/d;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-virtual {v0, v3}, Lmt0/b$a;->a(Llt0/i;)Lmt0/b;

    move-result-object v0

    goto :goto_0

    :pswitch_2
    sget-object v0, Lmt0/b;->f:Lmt0/b$a;

    new-instance v3, Lmt0/f;

    invoke-virtual {p0}, Lnk0/a$a;->a()Llt0/c;

    move-result-object v4

    invoke-virtual {v4}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-direct {v3, v4}, Lmt0/f;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-virtual {v0, v3}, Lmt0/b$a;->a(Llt0/i;)Lmt0/b;

    move-result-object v0

    goto :goto_0

    :pswitch_3
    sget-object v0, Lmt0/b;->f:Lmt0/b$a;

    new-instance v3, Lmt0/e;

    invoke-virtual {p0}, Lnk0/a$a;->a()Llt0/c;

    move-result-object v4

    invoke-virtual {v4}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-direct {v3, v4}, Lmt0/e;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-virtual {v0, v3}, Lmt0/b$a;->a(Llt0/i;)Lmt0/b;

    move-result-object v0

    goto :goto_0

    :pswitch_4
    sget-object v0, Lmt0/b;->f:Lmt0/b$a;

    new-instance v3, Lmt0/c;

    invoke-virtual {p0}, Lnk0/a$a;->a()Llt0/c;

    move-result-object v4

    invoke-virtual {v4}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-direct {v3, v4}, Lmt0/c;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-virtual {v0, v3}, Lmt0/b$a;->a(Llt0/i;)Lmt0/b;

    move-result-object v0

    :goto_0
    iget-object v3, p0, Lt92/b$b;->z:Lt92/b;

    invoke-static {v3}, Lt92/b;->k1(Lt92/b;)Lus0/a;

    move-result-object v3

    sget-object v4, Lus0/b;->OTHER_STRAP_BLUETOOTH_CALLBACK_OCCURRED:Lus0/b;

    invoke-interface {v3, v4}, Lus0/a;->m(Lus0/b;)V

    iget-object v3, p0, Lt92/b$b;->z:Lt92/b;

    invoke-static {v3}, Lt92/b;->m1(Lt92/b;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v3

    if-eqz v3, :cond_5

    iget-object v4, p0, Lt92/b$b;->z:Lt92/b;

    invoke-static {v4}, Lt92/b;->l1(Lt92/b;)Lys0/a;

    move-result-object v5

    invoke-virtual {v0}, Lmt0/b;->f()Ljava/nio/ByteBuffer;

    move-result-object v6

    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v6

    const-string v7, "null cannot be cast to non-null type kotlin.ByteArray"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v5, v3, v6}, Lys0/a;->z(Landroid/bluetooth/BluetoothGattCharacteristic;[B)Z

    move-result v3

    if-eqz v3, :cond_3

    const-string v3, "successful"

    goto :goto_1

    :cond_3
    const-string v3, "unsuccessful"

    :goto_1
    invoke-virtual {p0}, Lnk0/a$a;->a()Llt0/c;

    move-result-object v5

    instance-of v5, v5, Lxj0/z;

    if-eqz v5, :cond_4

    invoke-virtual {v4}, Lt92/b;->P1()Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v5

    invoke-interface {v5, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    :cond_4
    invoke-static {v4}, Lt92/b;->o1(Lt92/b;)Ltr2/n;

    move-result-object v2

    sget-object v4, Luk0/a;->a:Luk0/a;

    invoke-virtual {v0}, Lmt0/b;->f()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Luk0/a;->a([B)Ljava/lang/String;

    move-result-object v0

    const-string v4, "Writing the BlePacket: "

    const-string v5, " was "

    invoke-static {v4, v0, v5, v3}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v2, v0, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
