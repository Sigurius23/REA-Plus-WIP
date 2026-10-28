.class public final synthetic Lo52/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/realtime/presentation/StartActivityActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/realtime/presentation/StartActivityActivity;I)V
    .locals 0

    iput p2, p0, Lo52/n0;->w:I

    iput-object p1, p0, Lo52/n0;->x:Lcom/whoop/realtime/presentation/StartActivityActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget v0, p0, Lo52/n0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lo52/n0;->x:Lcom/whoop/realtime/presentation/StartActivityActivity;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->P(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/view/View;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lo52/n0;->x:Lcom/whoop/realtime/presentation/StartActivityActivity;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->Y(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/view/View;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lo52/n0;->x:Lcom/whoop/realtime/presentation/StartActivityActivity;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->v0(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/view/View;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lo52/n0;->x:Lcom/whoop/realtime/presentation/StartActivityActivity;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->H(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/view/View;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Lo52/n0;->x:Lcom/whoop/realtime/presentation/StartActivityActivity;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->t0(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/view/View;)V

    return-void

    :pswitch_4
    iget-object v0, p0, Lo52/n0;->x:Lcom/whoop/realtime/presentation/StartActivityActivity;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->q0(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/view/View;)V

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
