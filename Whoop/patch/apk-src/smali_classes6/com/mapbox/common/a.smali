.class public final synthetic Lcom/mapbox/common/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lcom/mapbox/common/a;->w:I

    iput-object p1, p0, Lcom/mapbox/common/a;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget v0, p0, Lcom/mapbox/common/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/mapbox/common/a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    invoke-static {v0}, Lcom/mapbox/common/RunloopErrorHandler;->a(Ljava/lang/Throwable;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/mapbox/common/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/common/ConnectionChangeCallback;

    invoke-static {v0}, Lcom/mapbox/common/ConnectionChangeCallback;->a(Lcom/mapbox/common/ConnectionChangeCallback;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
