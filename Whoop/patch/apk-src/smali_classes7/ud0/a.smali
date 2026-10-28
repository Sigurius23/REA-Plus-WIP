.class public final synthetic Lud0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment;I)V
    .locals 0

    iput p2, p0, Lud0/a;->w:I

    iput-object p1, p0, Lud0/a;->x:Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lud0/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lud0/a;->x:Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment;

    check-cast p1, Lod0/a;

    invoke-static {v0, p1}, Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment;->A(Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment;Lod0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lud0/a;->x:Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment;

    check-cast p1, Lrd0/a;

    invoke-static {v0, p1}, Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment;->C(Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment;Lrd0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
