.class public final synthetic Lrm/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llo/h;
.implements Lh5/u;
.implements Lbh3/g;
.implements Lcom/mapbox/common/location/GetLocationCallback;
.implements Lk83/a;
.implements Llo/i;
.implements Lb23/e;
.implements Lt30/z;
.implements Lcq/f;
.implements Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;
.implements Lor/m;
.implements Lcom/mapbox/maps/CameraChangedCoalescedCallback;
.implements Lt9/e;
.implements Lwm/b;
.implements Lyr/e;
.implements Lz7/c;
.implements Lcq/d;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lrm/p;->w:I

    iput-object p1, p0, Lrm/p;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lsm/d;Lrm/b1;)V
    .locals 0

    .line 2
    const/16 p2, 0xa

    iput p2, p0, Lrm/p;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrm/p;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Llo/f;)V
    .locals 5

    iget-object v0, p2, Llo/f;->a:Landroid/util/SparseBooleanArray;

    iget-object v1, p0, Lrm/p;->x:Ljava/lang/Object;

    check-cast v1, Lsm/d;

    if-nez p1, :cond_1

    iget-object p1, v1, Lsm/d;->E:Landroid/util/SparseArray;

    new-instance v1, Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseBooleanArray;->size()I

    move-result v2

    invoke-direct {v1, v2}, Landroid/util/SparseArray;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0}, Landroid/util/SparseBooleanArray;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    invoke-virtual {p2, v2}, Llo/f;->a(I)I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lsm/a;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v3, v4}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lrm/p;->x:Ljava/lang/Object;

    check-cast v0, Lv7/b;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, v0, Lv7/b;->e:I

    iget p1, v0, Lv7/b;->e:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lrm/p;->x:Ljava/lang/Object;

    check-cast v0, Lrq0/g1;

    invoke-static {v0, p1}, Lrq0/h1;->A(Lrq0/g1;Ljava/lang/Object;)Lhq0/a;

    move-result-object p1

    return-object p1
.end method

.method public c(Landroid/os/IInterface;Lds/w;)V
    .locals 1

    iget-object v0, p0, Lrm/p;->x:Ljava/lang/Object;

    check-cast v0, Lux/f0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lux/f0;->b(Landroid/os/IInterface;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p1}, Lds/w;->l(Ljava/lang/Object;)Z

    return-void
.end method

.method public d(J)J
    .locals 9

    iget v0, p0, Lrm/p;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrm/p;->x:Ljava/lang/Object;

    check-cast v0, Lt9/v;

    iget v1, v0, Lt9/v;->f:I

    int-to-long v1, v1

    mul-long/2addr p1, v1

    const-wide/32 v1, 0xf4240

    div-long v3, p1, v1

    iget-wide p1, v0, Lt9/v;->k:J

    const-wide/16 v0, 0x1

    sub-long v7, p1, v0

    const-wide/16 v5, 0x0

    invoke-static/range {v3 .. v8}, Llo/y;->i(JJJ)J

    move-result-wide p1

    return-wide p1

    :pswitch_0
    iget-object v0, p0, Lrm/p;->x:Ljava/lang/Object;

    check-cast v0, Lt9/v;

    iget v1, v0, Lt9/v;->f:I

    int-to-long v1, v1

    mul-long/2addr p1, v1

    const-wide/32 v1, 0xf4240

    div-long v3, p1, v1

    iget-wide p1, v0, Lt9/v;->k:J

    const-wide/16 v0, 0x1

    sub-long v7, p1, v0

    const-wide/16 v5, 0x0

    invoke-static/range {v3 .. v8}, Lx8/t;->h(JJJ)J

    move-result-wide p1

    return-wide p1

    nop

    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_0
    .end packed-switch
.end method

.method public f(Lor/h;I)V
    .locals 1

    iget-object v0, p0, Lrm/p;->x:Ljava/lang/Object;

    check-cast v0, Lxp0/p;

    invoke-static {v0, p1, p2}, Lcom/whoop/community/CommunityFragment;->L(Lxp0/p;Lor/h;I)V

    return-void
.end method

.method public get()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lrm/p;->w:I

    iget-object v1, p0, Lrm/p;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, La20/h;

    iget-object v0, v1, La20/h;->b:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lux/y;->y:Lux/y;

    if-nez v1, :cond_2

    new-instance v1, Lux/x;

    invoke-direct {v1, v0}, Lux/x;-><init>(Landroid/content/Context;)V

    iget-object v0, v1, Lux/x;->a:Landroid/content/SharedPreferences;

    const-string v1, "key_publishable_key"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v3, Lux/y;

    const-string v4, "key_account_id"

    invoke-interface {v0, v4, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v1, v0}, Lux/y;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v1, v3

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_1

    sput-object v1, Lux/y;->y:Lux/y;

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "PaymentConfiguration was not initialized. Call PaymentConfiguration.init()."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_1
    return-object v1

    :pswitch_0
    check-cast v1, Lal0/f;

    sget v0, Lcom/stripe/android/view/CardNumberEditText;->p0:I

    invoke-virtual {v1}, Lal0/f;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lrm/p;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrm/p;->x:Ljava/lang/Object;

    check-cast v0, Lmo/r;

    check-cast p1, Lrm/z0;

    invoke-interface {p1, v0}, Lrm/z0;->q(Lmo/r;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lrm/p;->x:Ljava/lang/Object;

    check-cast v0, Lrm/i;

    check-cast p1, Lrm/z0;

    invoke-interface {p1, v0}, Lrm/z0;->b(Lrm/i;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lrm/p;->x:Ljava/lang/Object;

    check-cast v0, Lin/c;

    check-cast p1, Lrm/z0;

    invoke-interface {p1, v0}, Lrm/z0;->i(Lin/c;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lrm/p;->x:Ljava/lang/Object;

    check-cast v0, Lrm/r;

    check-cast p1, Lrm/z0;

    iget-object v0, v0, Lrm/r;->w:Lrm/u;

    iget-object v0, v0, Lrm/u;->p0:Lrm/m0;

    invoke-interface {p1, v0}, Lrm/z0;->s(Lrm/m0;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public isLoggable(Lb23/g;Ljava/lang/String;)Z
    .locals 2

    iget-object v0, p0, Lrm/p;->x:Ljava/lang/Object;

    check-cast v0, Lt23/k3;

    const-string v1, "<anonymous parameter 1>"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget p1, p1, Lb23/g;->w:I

    iget-object p2, v0, Lt23/k3;->e:Lb43/b;

    iget-object p2, p2, Lb43/b;->a:Lb23/g;

    iget p2, p2, Lb23/g;->w:I

    if-lt p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public o(Landroid/view/View;Lh5/q1;)Lh5/q1;
    .locals 1

    iget v0, p0, Lrm/p;->w:I

    sparse-switch v0, :sswitch_data_0

    iget-object v0, p0, Lrm/p;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/community/CommunityShowInviteFragment;

    invoke-static {v0, p1, p2}, Lcom/whoop/community/CommunityShowInviteFragment;->J(Lcom/whoop/community/CommunityShowInviteFragment;Landroid/view/View;Lh5/q1;)Lh5/q1;

    move-result-object p1

    return-object p1

    :sswitch_0
    iget-object v0, p0, Lrm/p;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/community/CommunityFragment;

    invoke-static {v0, p1, p2}, Lcom/whoop/community/CommunityFragment;->F(Lcom/whoop/community/CommunityFragment;Landroid/view/View;Lh5/q1;)Lh5/q1;

    move-result-object p1

    return-object p1

    :sswitch_1
    iget-object v0, p0, Lrm/p;->x:Ljava/lang/Object;

    check-cast v0, Lrq0/z0;

    invoke-static {v0, p1, p2}, Lrq0/z0;->F(Lrq0/z0;Landroid/view/View;Lh5/q1;)Lh5/q1;

    move-result-object p1

    return-object p1

    :sswitch_2
    iget-object v0, p0, Lrm/p;->x:Ljava/lang/Object;

    check-cast v0, [Landroid/view/View;

    invoke-static {v0, p1, p2}, Lrq0/u0;->a([Landroid/view/View;Landroid/view/View;Lh5/q1;)Lh5/q1;

    move-result-object p1

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_2
        0x5 -> :sswitch_1
        0x10 -> :sswitch_0
    .end sparse-switch
.end method

.method public onReactionClick(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lrm/p;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;->q(Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/internal/EditReactionsView;Ljava/lang/String;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Lrm/p;->w:I

    iget-object v1, p0, Lrm/p;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lcom/google/firebase/messaging/FirebaseMessaging;

    check-cast p1, Lso/a;

    sget-object v0, Lcom/google/firebase/messaging/FirebaseMessaging;->k:Lu93/d0;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lso/a;->w:Landroid/content/Intent;

    invoke-static {p1}, Lva3/l;->o(Landroid/content/Intent;)V

    invoke-virtual {v1}, Lcom/google/firebase/messaging/FirebaseMessaging;->g()V

    :cond_0
    return-void

    :pswitch_0
    check-cast v1, Lsg2/b;

    invoke-virtual {v1, p1}, Lsg2/b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
    .end packed-switch
.end method

.method public q(Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    iget-object p1, p0, Lrm/p;->x:Ljava/lang/Object;

    check-cast p1, Landroid/content/Intent;

    invoke-static {p1}, Lzt/z;->b(Landroid/content/Intent;)V

    return-void
.end method

.method public run(Lcom/mapbox/common/location/Location;)V
    .locals 1

    iget-object v0, p0, Lrm/p;->x:Ljava/lang/Object;

    check-cast v0, Ldc3/u;

    if-eqz p1, :cond_0

    .line 3
    check-cast v0, Ldc3/t;

    invoke-virtual {v0, p1}, Ldc3/t;->s(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public run(Lcom/mapbox/maps/CameraChangedCoalesced;)V
    .locals 2

    iget-object v0, p0, Lrm/p;->x:Ljava/lang/Object;

    check-cast v0, Lxv/g;

    .line 1
    const-string v1, "this$0"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/mapbox/maps/CameraChangedCoalesced;->getCameraState()Lcom/mapbox/maps/CameraState;

    move-result-object p1

    const-string v1, "it.cameraState"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lxv/g;->b(Lcom/mapbox/maps/CameraState;)V

    return-void
.end method
