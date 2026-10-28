.class public final synthetic Lhh2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/stealthmode/view/StealthModeFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/stealthmode/view/StealthModeFragment;I)V
    .locals 0

    iput p2, p0, Lhh2/d;->w:I

    iput-object p1, p0, Lhh2/d;->x:Lcom/whoop/stealthmode/view/StealthModeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lhh2/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhh2/d;->x:Lcom/whoop/stealthmode/view/StealthModeFragment;

    invoke-static {v0}, Lcom/whoop/stealthmode/view/StealthModeFragment;->D(Lcom/whoop/stealthmode/view/StealthModeFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lhh2/d;->x:Lcom/whoop/stealthmode/view/StealthModeFragment;

    invoke-static {v0}, Lcom/whoop/stealthmode/view/StealthModeFragment;->C(Lcom/whoop/stealthmode/view/StealthModeFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lhh2/d;->x:Lcom/whoop/stealthmode/view/StealthModeFragment;

    invoke-static {v0}, Lcom/whoop/stealthmode/view/StealthModeFragment;->z(Lcom/whoop/stealthmode/view/StealthModeFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lhh2/d;->x:Lcom/whoop/stealthmode/view/StealthModeFragment;

    invoke-static {v0}, Lcom/whoop/stealthmode/view/StealthModeFragment;->E(Lcom/whoop/stealthmode/view/StealthModeFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lhh2/d;->x:Lcom/whoop/stealthmode/view/StealthModeFragment;

    invoke-static {v0}, Lcom/whoop/stealthmode/view/StealthModeFragment;->H(Lcom/whoop/stealthmode/view/StealthModeFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
