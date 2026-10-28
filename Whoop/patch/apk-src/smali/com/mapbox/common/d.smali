.class public final synthetic Lcom/mapbox/common/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroid/content/Context;

.field public final synthetic y:Landroid/os/Looper;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p4, p0, Lcom/mapbox/common/d;->w:I

    iput-object p1, p0, Lcom/mapbox/common/d;->x:Landroid/content/Context;

    iput-object p2, p0, Lcom/mapbox/common/d;->y:Landroid/os/Looper;

    iput-object p3, p0, Lcom/mapbox/common/d;->z:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lcom/mapbox/common/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/mapbox/common/d;->y:Landroid/os/Looper;

    iget-object v1, p0, Lcom/mapbox/common/d;->z:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lcom/mapbox/common/d;->x:Landroid/content/Context;

    invoke-static {v2, v0, v1}, Lcom/mapbox/common/LifecycleUtils;->a(Landroid/content/Context;Landroid/os/Looper;Lkotlin/jvm/functions/Function1;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/mapbox/common/d;->y:Landroid/os/Looper;

    iget-object v1, p0, Lcom/mapbox/common/d;->z:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lcom/mapbox/common/d;->x:Landroid/content/Context;

    invoke-static {v2, v0, v1}, Lcom/mapbox/common/LifecycleUtils;->d(Landroid/content/Context;Landroid/os/Looper;Lkotlin/jvm/functions/Function1;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
