.class public final synthetic Lcom/mapbox/common/location/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcq/f;
.implements Lo23/a;
.implements Lax/c;
.implements Lio/sentry/e4;
.implements Lcq/e;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p2, p0, Lcom/mapbox/common/location/a;->w:I

    iput-object p1, p0, Lcom/mapbox/common/location/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ZLjava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/location/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1, p2, p3}, Lio/getstream/chat/android/ui/utils/PermissionChecker;->g(Lkotlin/jvm/functions/Function1;ZLjava/util/ArrayList;Ljava/util/ArrayList;)V

    return-void
.end method

.method public h(Lio/sentry/b1;)V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/location/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1}, Lrr2/m;->k(Lkotlin/jvm/functions/Function1;Lio/sentry/b1;)V

    return-void
.end method

.method public n(Ljava/lang/Exception;)V
    .locals 1

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/common/location/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public onResult(Ln23/h;)V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/location/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->d(Lkotlin/jvm/functions/Function1;Ln23/h;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lcom/mapbox/common/location/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/mapbox/common/location/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;->b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/mapbox/common/location/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lcom/mapbox/common/module/cronet/LazyEngine;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/mapbox/common/location/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->g(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lcom/mapbox/common/location/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Lcom/mapbox/common/location/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    return-void

    :pswitch_4
    iget-object v0, p0, Lcom/mapbox/common/location/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->j(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
