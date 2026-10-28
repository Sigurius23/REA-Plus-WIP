.class public final synthetic Lm22/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/pairing/ui/view/PairingFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/pairing/ui/view/PairingFragment;I)V
    .locals 0

    iput p2, p0, Lm22/g;->w:I

    iput-object p1, p0, Lm22/g;->x:Lcom/whoop/pairing/ui/view/PairingFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lm22/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lm22/g;->x:Lcom/whoop/pairing/ui/view/PairingFragment;

    invoke-static {v0}, Lcom/whoop/pairing/ui/view/PairingFragment;->D(Lcom/whoop/pairing/ui/view/PairingFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lm22/g;->x:Lcom/whoop/pairing/ui/view/PairingFragment;

    invoke-static {v0}, Lcom/whoop/pairing/ui/view/PairingFragment;->y(Lcom/whoop/pairing/ui/view/PairingFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lm22/g;->x:Lcom/whoop/pairing/ui/view/PairingFragment;

    invoke-static {v0}, Lcom/whoop/pairing/ui/view/PairingFragment;->A(Lcom/whoop/pairing/ui/view/PairingFragment;)Lcom/whoop/pairing/ui/view/PairingFragment$b;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
