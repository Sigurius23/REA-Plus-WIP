.class public final synthetic Lio/sentry/android/replay/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/e4;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/internal/g0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/g0;I)V
    .locals 0

    iput p2, p0, Lio/sentry/android/replay/m;->w:I

    iput-object p1, p0, Lio/sentry/android/replay/m;->x:Lkotlin/jvm/internal/g0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object p2, p0, Lio/sentry/android/replay/m;->x:Lkotlin/jvm/internal/g0;

    iput-object p1, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    return-void
.end method

.method public h(Lio/sentry/b1;)V
    .locals 2

    iget v0, p0, Lio/sentry/android/replay/m;->w:I

    iget-object v1, p0, Lio/sentry/android/replay/m;->x:Lkotlin/jvm/internal/g0;

    packed-switch v0, :pswitch_data_0

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Lio/sentry/b1;->v()Ljava/util/Queue;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    return-void

    :pswitch_0
    sget v0, Lio/sentry/android/replay/ReplayIntegration;->R:I

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/sentry/b1;->A()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const/16 v0, 0x2e

    invoke-static {v0, p1, p1}, Lyb3/r;->F0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
