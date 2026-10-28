.class public final synthetic Lo52/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/b;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lo52/m0;->w:I

    iput-object p1, p0, Lo52/m0;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lo52/m0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lo52/m0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/whooplive/selfie/camera/CameraView;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, p1}, Lcom/whoop/whooplive/selfie/camera/CameraView;->a(Lcom/whoop/whooplive/selfie/camera/CameraView;Ljava/lang/Boolean;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lo52/m0;->x:Ljava/lang/Object;

    check-cast v0, Lrq0/x;

    invoke-static {v0, p1}, Lcom/whoop/whooplive/live/views/WhoopGraphView;->a(Lrq0/x;Ljava/lang/Object;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lo52/m0;->x:Ljava/lang/Object;

    check-cast v0, Lp92/e;

    check-cast p1, Lcom/whoop/realtime/service/RealTimeActivityService;

    invoke-static {v0, p1}, Lcom/whoop/realtime/service/b;->a(Lp92/e;Lcom/whoop/realtime/service/RealTimeActivityService;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lo52/m0;->x:Ljava/lang/Object;

    check-cast v0, Lrq0/g1;

    invoke-static {v0, p1}, Lrq0/h1;->w(Lrq0/g1;Ljava/lang/Object;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Lo52/m0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/local/room/dao/wipeable/d;

    invoke-static {v0, p1}, Lrq0/e1$b;->m(Lcom/whoop/data/local/room/dao/wipeable/d;Ljava/lang/Object;)V

    return-void

    :pswitch_4
    iget-object v0, p0, Lo52/m0;->x:Ljava/lang/Object;

    check-cast v0, Lrq0/f;

    invoke-static {v0, p1}, Lrq0/e1$b;->l(Lrq0/f;Ljava/lang/Object;)V

    return-void

    :pswitch_5
    iget-object v0, p0, Lo52/m0;->x:Ljava/lang/Object;

    check-cast v0, Lrq0/f;

    invoke-static {v0, p1}, Lrq0/w0;->n(Lrq0/f;Ljava/lang/Object;)V

    return-void

    :pswitch_6
    iget-object v0, p0, Lo52/m0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/local/room/dao/wipeable/d;

    invoke-static {v0, p1}, Lrq0/w0;->l(Lcom/whoop/data/local/room/dao/wipeable/d;Ljava/lang/Object;)V

    return-void

    :pswitch_7
    iget-object v0, p0, Lo52/m0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/local/room/dao/wipeable/d;

    invoke-static {v0, p1}, Lrq0/k0;->m(Lcom/whoop/data/local/room/dao/wipeable/d;Ljava/lang/Object;)V

    return-void

    :pswitch_8
    iget-object v0, p0, Lo52/m0;->x:Ljava/lang/Object;

    check-cast v0, Lrq0/f;

    invoke-static {v0, p1}, Lrq0/k0;->l(Lrq0/f;Ljava/lang/Object;)V

    return-void

    :pswitch_9
    iget-object v0, p0, Lo52/m0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/local/room/dao/wipeable/d;

    invoke-static {v0, p1}, Lrq0/i0$b;->n(Lcom/whoop/data/local/room/dao/wipeable/d;Ljava/lang/Object;)V

    return-void

    :pswitch_a
    iget-object v0, p0, Lo52/m0;->x:Ljava/lang/Object;

    check-cast v0, Lrq0/f;

    invoke-static {v0, p1}, Lrq0/i0$b;->m(Lrq0/f;Ljava/lang/Object;)V

    return-void

    :pswitch_b
    iget-object v0, p0, Lo52/m0;->x:Ljava/lang/Object;

    check-cast v0, Lrq0/f;

    invoke-static {v0, p1}, Lrq0/g;->n(Lrq0/f;Ljava/lang/Object;)V

    return-void

    :pswitch_c
    iget-object v0, p0, Lo52/m0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/local/room/dao/wipeable/d;

    invoke-static {v0, p1}, Lrq0/g;->m(Lcom/whoop/data/local/room/dao/wipeable/d;Ljava/lang/Object;)V

    return-void

    :pswitch_d
    iget-object v0, p0, Lo52/m0;->x:Ljava/lang/Object;

    check-cast v0, Lpf/b;

    invoke-static {v0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->j(Lpf/b;Ljava/lang/Object;)V

    return-void

    :pswitch_e
    iget-object v0, p0, Lo52/m0;->x:Ljava/lang/Object;

    check-cast v0, Lqm2/i;

    invoke-static {v0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->Z(Lqm2/i;Ljava/lang/Object;)V

    return-void

    :pswitch_f
    iget-object v0, p0, Lo52/m0;->x:Ljava/lang/Object;

    check-cast v0, Lpf/b;

    invoke-static {v0, p1}, Lqm2/f;->w(Lpf/b;Ljava/lang/Object;)V

    return-void

    :pswitch_10
    iget-object v0, p0, Lo52/m0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;->N(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;Ljava/lang/Throwable;)V

    return-void

    :pswitch_11
    iget-object v0, p0, Lo52/m0;->x:Ljava/lang/Object;

    check-cast v0, Lqm2/b;

    invoke-static {v0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;->L(Lqm2/b;Ljava/lang/Object;)V

    return-void

    :pswitch_12
    iget-object v0, p0, Lo52/m0;->x:Ljava/lang/Object;

    check-cast v0, Lp92/g;

    invoke-static {v0, p1}, Lp92/h;->b(Lp92/g;Ljava/lang/Object;)V

    return-void

    :pswitch_13
    iget-object v0, p0, Lo52/m0;->x:Ljava/lang/Object;

    check-cast v0, Lp92/g;

    invoke-static {v0, p1}, Lp92/h;->a(Lp92/g;Ljava/lang/Object;)V

    return-void

    :pswitch_14
    iget-object v0, p0, Lo52/m0;->x:Ljava/lang/Object;

    check-cast v0, Lno0/e0;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/m;->b(Lno0/e0;Ljava/lang/Object;)V

    return-void

    :pswitch_15
    iget-object v0, p0, Lo52/m0;->x:Ljava/lang/Object;

    check-cast v0, Lo52/l0;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->X(Lo52/l0;Ljava/lang/Object;)V

    return-void

    :pswitch_16
    iget-object v0, p0, Lo52/m0;->x:Ljava/lang/Object;

    check-cast v0, Lo52/l0;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->r0(Lo52/l0;Ljava/lang/Object;)V

    return-void

    :pswitch_17
    iget-object v0, p0, Lo52/m0;->x:Ljava/lang/Object;

    check-cast v0, Lo52/l0;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->o0(Lo52/l0;Ljava/lang/Object;)V

    return-void

    :pswitch_18
    iget-object v0, p0, Lo52/m0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/realtime/presentation/StartActivityActivity;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->M(Lcom/whoop/realtime/presentation/StartActivityActivity;Ljava/lang/Boolean;)V

    return-void

    :pswitch_19
    iget-object v0, p0, Lo52/m0;->x:Ljava/lang/Object;

    check-cast v0, Lo52/l0;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->n0(Lo52/l0;Ljava/lang/Object;)V

    return-void

    :pswitch_1a
    iget-object v0, p0, Lo52/m0;->x:Ljava/lang/Object;

    check-cast v0, Lo52/l0;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->g0(Lo52/l0;Ljava/lang/Object;)V

    return-void

    :pswitch_1b
    iget-object v0, p0, Lo52/m0;->x:Ljava/lang/Object;

    check-cast v0, Lo52/l0;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->U(Lo52/l0;Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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
