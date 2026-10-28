.class public final synthetic Lb4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lc93/a;I)V
    .locals 0

    iput p2, p0, Lb4/a;->w:I

    iput-object p1, p0, Lb4/a;->x:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget v0, p0, Lb4/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb4/a;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void

    :pswitch_0
    iget-object v0, p0, Lb4/a;->x:Lc93/a;

    invoke-static {v0}, Lcom/whoop/community/presentation/ui/PillRadioGroup;->c(Lc93/a;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lb4/a;->x:Lc93/a;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/channels/list/internal/SimpleChannelListView;->q(Lc93/a;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lb4/a;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void

    :pswitch_3
    iget-object v0, p0, Lb4/a;->x:Lc93/a;

    invoke-static {v0}, Lcom/mapbox/maps/threading/AnimationThreadController;->a(Lc93/a;)V

    return-void

    :pswitch_4
    iget-object v0, p0, Lb4/a;->x:Lc93/a;

    invoke-static {v0}, Lcom/mapbox/maps/threading/AnimationThreadController;->b(Lc93/a;)V

    return-void

    :pswitch_5
    iget-object v0, p0, Lb4/a;->x:Lc93/a;

    invoke-static {v0}, Lcom/mapbox/maps/renderer/RenderHandlerThread;->a(Lc93/a;)V

    return-void

    :pswitch_6
    iget-object v0, p0, Lb4/a;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void

    :pswitch_7
    iget-object v0, p0, Lb4/a;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void

    :pswitch_8
    iget-object v0, p0, Lb4/a;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
