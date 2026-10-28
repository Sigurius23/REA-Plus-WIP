.class public final synthetic Lsl0/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/bot/view/AiConversationFragment;

.field public final synthetic y:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/bot/view/AiConversationFragment;Lp1/c1;I)V
    .locals 0

    iput p3, p0, Lsl0/i0;->w:I

    iput-object p1, p0, Lsl0/i0;->x:Lcom/whoop/bot/view/AiConversationFragment;

    iput-object p2, p0, Lsl0/i0;->y:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lsl0/i0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsl0/i0;->x:Lcom/whoop/bot/view/AiConversationFragment;

    iget-object v1, p0, Lsl0/i0;->y:Lp1/c1;

    invoke-static {v0, v1}, Lcom/whoop/bot/view/AiConversationFragment;->M(Lcom/whoop/bot/view/AiConversationFragment;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lsl0/i0;->x:Lcom/whoop/bot/view/AiConversationFragment;

    iget-object v1, p0, Lsl0/i0;->y:Lp1/c1;

    invoke-static {v0, v1}, Lcom/whoop/bot/view/AiConversationFragment;->H(Lcom/whoop/bot/view/AiConversationFragment;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
