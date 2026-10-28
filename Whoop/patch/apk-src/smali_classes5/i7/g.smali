.class public final synthetic Li7/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/g;
.implements Lpg3/n;
.implements Lrm/e;
.implements Lio/getstream/chat/android/client/notifications/PushNotificationReceivedListener;
.implements Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelListItemPredicate;
.implements Lio/getstream/chat/android/ui/helper/StyleTransformer;
.implements Lio/getstream/chat/android/ui/common/helper/ClipboardHandler;
.implements Lo23/a;
.implements Lio/sentry/util/e;
.implements Lio/sentry/a4;
.implements Lio/sentry/transport/f;
.implements Lio/sentry/e4;
.implements Lcom/mapbox/common/geofencing/GeofencingUtilsUserConsentResponseCallback;
.implements Lyr/e;
.implements Lx8/d;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Li7/g;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lio/sentry/b7;)V
    .locals 0

    return-void
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ll9/x0;

    iget-object p1, p1, Ll9/x0;->b:Lg9/g;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Li7/g;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lu8/p0;

    iget p1, p1, Lu8/p0;->c:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ll9/a0;

    invoke-interface {p1}, Ll9/a0;->k()Ll9/g1;

    move-result-object p1

    iget-object p1, p1, Ll9/g1;->b:Lzr/w0;

    new-instance v0, Li7/g;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Li7/g;-><init>(I)V

    invoke-static {p1, v0}, Lzr/q;->t(Ljava/util/List;Lyr/e;)Ljava/util/AbstractList;

    move-result-object p1

    invoke-static {p1}, Lzr/g0;->m(Ljava/util/Collection;)Lzr/g0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lt9/n;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1a
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lpg3/v0;

    invoke-static {p1}, Li92/a;->a(Lpg3/v0;)Lpg3/v0;

    move-result-object p1

    return-object p1
.end method

.method public c()J
    .locals 2

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lud3/a1;

    invoke-static {p1}, Lif1/a;->a(Lud3/a1;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public copyMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 0

    invoke-static {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->d(Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public e(Landroid/os/Bundle;)Lrm/f;
    .locals 7

    iget v0, p0, Li7/g;->w:I

    const/16 v1, 0x24

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    invoke-static {v2, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lrm/c0;->h0:Lqa/b;

    invoke-static {v2, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    sget-object v5, Lzr/g0;->x:Lzr/e0;

    sget-object v5, Lzr/w0;->E:Lzr/w0;

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v3, v4}, Llo/a;->q(Lrm/e;Ljava/util/ArrayList;)Lzr/w0;

    move-result-object v5

    :goto_0
    const/4 v3, 0x1

    invoke-static {v3, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    const-string v6, ""

    invoke-virtual {v0, v4, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v4, Lsn/w0;

    new-array v2, v2, [Lrm/c0;

    invoke-virtual {v5, v2}, Lzr/b0;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lrm/c0;

    invoke-direct {v4, v0, v2}, Lsn/w0;-><init>(Ljava/lang/String;[Lrm/c0;)V

    invoke-static {v3, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object p1

    if-nez p1, :cond_1

    new-instance p1, Lio/t;

    invoke-direct {p1, v4}, Lio/t;-><init>(Lsn/w0;)V

    goto :goto_1

    :cond_1
    new-instance v0, Lio/t;

    invoke-static {p1}, Lvd/f;->i([I)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, v4, p1}, Lio/t;-><init>(Lsn/w0;Ljava/util/List;)V

    move-object p1, v0

    :goto_1
    return-object p1

    :pswitch_0
    invoke-static {v2, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    sget-object v0, Lzr/g0;->x:Lzr/e0;

    sget-object v0, Lzr/w0;->E:Lzr/w0;

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    sget-object v0, Lio/t;->y:Li7/g;

    invoke-static {v0, p1}, Llo/a;->q(Lrm/e;Ljava/util/ArrayList;)Lzr/w0;

    move-result-object v0

    :goto_2
    new-instance p1, Lab/h0;

    const/4 v1, 0x4

    invoke-direct {p1, v1}, Lab/h0;-><init>(I)V

    :goto_3
    iget v1, v0, Lzr/w0;->z:I

    if-ge v2, v1, :cond_3

    invoke-virtual {v0, v2}, Lzr/w0;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/t;

    iget-object v3, v1, Lio/t;->w:Lsn/w0;

    invoke-virtual {p1, v3, v1}, Lab/h0;->t(Ljava/lang/Object;Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_3
    new-instance v0, Lio/u;

    invoke-virtual {p1}, Lab/h0;->i()Lzr/b1;

    move-result-object p1

    invoke-direct {v0, p1}, Lio/u;-><init>(Ljava/util/Map;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_0
    .end packed-switch
.end method

.method public h(Lio/sentry/b1;)V
    .locals 2

    iget v0, p0, Li7/g;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lhn/p;

    const/16 v1, 0x14

    invoke-direct {v0, p1, v1}, Lhn/p;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p1, v0}, Lio/sentry/b1;->M(Lio/sentry/z3;)La3/p;

    return-void

    :pswitch_0
    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    invoke-interface {p1, v0}, Lio/sentry/b1;->t(Lio/sentry/protocol/v;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_0
    .end packed-switch
.end method

.method public j()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lio/sentry/q6;->empty()Lio/sentry/q6;

    move-result-object v0

    return-object v0
.end method

.method public onPushNotificationReceived(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/notifications/ChatNotifications;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onResult(Ln23/h;)V
    .locals 0

    invoke-static {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;->g(Ln23/h;)V

    return-void
.end method

.method public predicate(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;)Z
    .locals 0

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->e(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;)V

    const/4 p1, 0x1

    return p1
.end method

.method public run(Lcom/mapbox/bindgen/Expected;)V
    .locals 2

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/mapbox/common/geofencing/GeofencingError;

    if-eqz p1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unable to set user consent: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mapbox/common/geofencing/GeofencingError;->getType()Lcom/mapbox/common/geofencing/GeofencingErrorType;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "GeofencingConsent"

    invoke-static {v0, p1}, Lcom/mapbox/maps/MapboxLogger;->logW(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public transform(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p1
.end method
