.class public final synthetic Lo52/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/realtime/presentation/RealTimeRecordActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/realtime/presentation/RealTimeRecordActivity;I)V
    .locals 0

    iput p2, p0, Lo52/x;->w:I

    iput-object p1, p0, Lo52/x;->x:Lcom/whoop/realtime/presentation/RealTimeRecordActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget v0, p0, Lo52/x;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lo52/x;->x:Lcom/whoop/realtime/presentation/RealTimeRecordActivity;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity;->E(Lcom/whoop/realtime/presentation/RealTimeRecordActivity;Landroid/view/View;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lo52/x;->x:Lcom/whoop/realtime/presentation/RealTimeRecordActivity;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity;->F(Lcom/whoop/realtime/presentation/RealTimeRecordActivity;Landroid/view/View;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lo52/x;->x:Lcom/whoop/realtime/presentation/RealTimeRecordActivity;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity;->J(Lcom/whoop/realtime/presentation/RealTimeRecordActivity;Landroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
