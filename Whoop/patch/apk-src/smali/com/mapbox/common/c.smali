.class public final synthetic Lcom/mapbox/common/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p2, p0, Lcom/mapbox/common/c;->w:I

    iput-object p1, p0, Lcom/mapbox/common/c;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget v0, p0, Lcom/mapbox/common/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/mapbox/common/c;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lcom/mapbox/common/LifecycleUtils;->b(Lkotlin/jvm/functions/Function1;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/mapbox/common/c;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lcom/mapbox/common/LifecycleUtils;->e(Lkotlin/jvm/functions/Function1;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/mapbox/common/c;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lcom/mapbox/common/LifecycleService;->b(Lkotlin/jvm/functions/Function1;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lcom/mapbox/common/c;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lcom/mapbox/common/LifecycleService;->a(Lkotlin/jvm/functions/Function1;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
