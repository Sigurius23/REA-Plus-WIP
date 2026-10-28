.class public final synthetic Liv/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Liv/e;


# direct methods
.method public synthetic constructor <init>(Liv/e;I)V
    .locals 0

    iput p2, p0, Liv/b;->w:I

    iput-object p1, p0, Liv/b;->x:Liv/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget p2, p0, Liv/b;->w:I

    packed-switch p2, :pswitch_data_0

    const-string p2, "this$0"

    iget-object v0, p0, Liv/b;->x:Liv/e;

    invoke-static {v0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, v0, Liv/e;->G:Lcom/mapbox/maps/module/MapTelemetry;

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Lcom/mapbox/maps/module/MapTelemetry;->setUserTelemetryRequestState(Z)V

    :goto_0
    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    return-void

    :pswitch_0
    const-string p2, "this$0"

    iget-object v0, p0, Liv/b;->x:Liv/e;

    invoke-static {v0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, v0, Liv/e;->w:Landroid/content/Context;

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v1, 0x7f140825

    invoke-virtual {p2, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    const-string v1, "context.resources.getStr\u2026ing.mapbox_telemetryLink)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Liv/e;->b(Ljava/lang/String;)V

    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    return-void

    :pswitch_1
    const-string p2, "this$0"

    iget-object v0, p0, Liv/b;->x:Liv/e;

    invoke-static {v0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, v0, Liv/e;->G:Lcom/mapbox/maps/module/MapTelemetry;

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x1

    invoke-interface {p2, v0}, Lcom/mapbox/maps/module/MapTelemetry;->setUserTelemetryRequestState(Z)V

    :goto_1
    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
