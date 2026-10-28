.class public final synthetic Lsl0/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/bot/view/AiConversationFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/bot/view/AiConversationFragment;I)V
    .locals 0

    iput p2, p0, Lsl0/g0;->w:I

    iput-object p1, p0, Lsl0/g0;->x:Lcom/whoop/bot/view/AiConversationFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lsl0/g0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsl0/g0;->x:Lcom/whoop/bot/view/AiConversationFragment;

    check-cast p1, Lnl0/d;

    invoke-static {v0, p1}, Lcom/whoop/bot/view/AiConversationFragment;->L(Lcom/whoop/bot/view/AiConversationFragment;Lnl0/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lsl0/g0;->x:Lcom/whoop/bot/view/AiConversationFragment;

    check-cast p1, Lml0/a;

    invoke-static {v0, p1}, Lcom/whoop/bot/view/AiConversationFragment;->B(Lcom/whoop/bot/view/AiConversationFragment;Lml0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
