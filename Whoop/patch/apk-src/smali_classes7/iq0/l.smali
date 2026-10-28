.class public final synthetic Liq0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo23/a;
.implements Lh5/u;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Liq0/l;->w:I

    iput-object p1, p0, Liq0/l;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public o(Landroid/view/View;Lh5/q1;)Lh5/q1;
    .locals 1

    iget-object v0, p0, Liq0/l;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/community/presentation/chat/NotificationSettingsFragment;

    invoke-static {v0, p1, p2}, Lcom/whoop/community/presentation/chat/NotificationSettingsFragment;->H(Lcom/whoop/community/presentation/chat/NotificationSettingsFragment;Landroid/view/View;Lh5/q1;)Lh5/q1;

    move-result-object p1

    return-object p1
.end method

.method public onResult(Ln23/h;)V
    .locals 1

    iget v0, p0, Liq0/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Liq0/l;->x:Ljava/lang/Object;

    check-cast v0, Liq0/m;

    invoke-static {v0, p1}, Liq0/m;->F(Liq0/m;Ln23/h;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Liq0/l;->x:Ljava/lang/Object;

    check-cast v0, Liq0/m;

    invoke-static {v0, p1}, Liq0/m;->w(Liq0/m;Ln23/h;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
