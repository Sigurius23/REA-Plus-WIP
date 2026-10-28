.class public final synthetic Lc42/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/pregnancy/view/PregnancySettingsFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/pregnancy/view/PregnancySettingsFragment;I)V
    .locals 0

    iput p2, p0, Lc42/m;->w:I

    iput-object p1, p0, Lc42/m;->x:Lcom/whoop/pregnancy/view/PregnancySettingsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lc42/m;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc42/m;->x:Lcom/whoop/pregnancy/view/PregnancySettingsFragment;

    invoke-static {v0}, Lcom/whoop/pregnancy/view/PregnancySettingsFragment;->M(Lcom/whoop/pregnancy/view/PregnancySettingsFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lc42/m;->x:Lcom/whoop/pregnancy/view/PregnancySettingsFragment;

    invoke-static {v0}, Lcom/whoop/pregnancy/view/PregnancySettingsFragment;->F(Lcom/whoop/pregnancy/view/PregnancySettingsFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lc42/m;->x:Lcom/whoop/pregnancy/view/PregnancySettingsFragment;

    invoke-static {v0}, Lcom/whoop/pregnancy/view/PregnancySettingsFragment;->D(Lcom/whoop/pregnancy/view/PregnancySettingsFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lc42/m;->x:Lcom/whoop/pregnancy/view/PregnancySettingsFragment;

    invoke-static {v0}, Lcom/whoop/pregnancy/view/PregnancySettingsFragment;->L(Lcom/whoop/pregnancy/view/PregnancySettingsFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lc42/m;->x:Lcom/whoop/pregnancy/view/PregnancySettingsFragment;

    invoke-static {v0}, Lcom/whoop/pregnancy/view/PregnancySettingsFragment;->P(Lcom/whoop/pregnancy/view/PregnancySettingsFragment;)Lc42/p;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lc42/m;->x:Lcom/whoop/pregnancy/view/PregnancySettingsFragment;

    invoke-static {v0}, Lcom/whoop/pregnancy/view/PregnancySettingsFragment;->O(Lcom/whoop/pregnancy/view/PregnancySettingsFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

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
