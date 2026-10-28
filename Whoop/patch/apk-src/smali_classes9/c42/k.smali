.class public final synthetic Lc42/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/pregnancy/view/PregnancySettingsFragment;

.field public final synthetic y:La42/a;


# direct methods
.method public synthetic constructor <init>(La42/a;Lcom/whoop/pregnancy/view/PregnancySettingsFragment;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    iput v0, p0, Lc42/k;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc42/k;->y:La42/a;

    iput-object p2, p0, Lc42/k;->x:Lcom/whoop/pregnancy/view/PregnancySettingsFragment;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/pregnancy/view/PregnancySettingsFragment;La42/a;I)V
    .locals 0

    .line 2
    iput p3, p0, Lc42/k;->w:I

    iput-object p1, p0, Lc42/k;->x:Lcom/whoop/pregnancy/view/PregnancySettingsFragment;

    iput-object p2, p0, Lc42/k;->y:La42/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lc42/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc42/k;->y:La42/a;

    iget-object v1, p0, Lc42/k;->x:Lcom/whoop/pregnancy/view/PregnancySettingsFragment;

    invoke-static {v0, v1}, Lcom/whoop/pregnancy/view/PregnancySettingsFragment;->V(La42/a;Lcom/whoop/pregnancy/view/PregnancySettingsFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lc42/k;->x:Lcom/whoop/pregnancy/view/PregnancySettingsFragment;

    iget-object v1, p0, Lc42/k;->y:La42/a;

    invoke-static {v1, v0}, Lcom/whoop/pregnancy/view/PregnancySettingsFragment;->B(La42/a;Lcom/whoop/pregnancy/view/PregnancySettingsFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lc42/k;->x:Lcom/whoop/pregnancy/view/PregnancySettingsFragment;

    iget-object v1, p0, Lc42/k;->y:La42/a;

    invoke-static {v1, v0}, Lcom/whoop/pregnancy/view/PregnancySettingsFragment;->C(La42/a;Lcom/whoop/pregnancy/view/PregnancySettingsFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lc42/k;->x:Lcom/whoop/pregnancy/view/PregnancySettingsFragment;

    iget-object v1, p0, Lc42/k;->y:La42/a;

    invoke-static {v1, v0}, Lcom/whoop/pregnancy/view/PregnancySettingsFragment;->e0(La42/a;Lcom/whoop/pregnancy/view/PregnancySettingsFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lc42/k;->x:Lcom/whoop/pregnancy/view/PregnancySettingsFragment;

    iget-object v1, p0, Lc42/k;->y:La42/a;

    invoke-static {v1, v0}, Lcom/whoop/pregnancy/view/PregnancySettingsFragment;->K(La42/a;Lcom/whoop/pregnancy/view/PregnancySettingsFragment;)Ll83/a0;

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
