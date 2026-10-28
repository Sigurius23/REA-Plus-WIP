.class public final synthetic Llz/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Llz/k;->w:I

    iput-object p1, p0, Llz/k;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget v0, p0, Llz/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llz/k;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/community/CommunityManageTeamFragment;

    invoke-static {v0, p1, p2}, Lcom/whoop/community/CommunityManageTeamFragment;->N(Lcom/whoop/community/CommunityManageTeamFragment;Landroid/content/DialogInterface;I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Llz/k;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/community/CommunityFragment;

    invoke-static {v0, p1, p2}, Lcom/whoop/community/CommunityFragment;->J(Lcom/whoop/community/CommunityFragment;Landroid/content/DialogInterface;I)V

    return-void

    :pswitch_1
    iget-object v0, p0, Llz/k;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;

    invoke-static {v0, p1, p2}, Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;->L(Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;Landroid/content/DialogInterface;I)V

    return-void

    :pswitch_2
    iget-object p1, p0, Llz/k;->x:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
