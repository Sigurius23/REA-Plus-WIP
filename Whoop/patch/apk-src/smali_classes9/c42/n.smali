.class public final synthetic Lc42/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/pregnancy/view/PregnancySettingsFragment;

.field public final synthetic y:Lc42/r;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/pregnancy/view/PregnancySettingsFragment;Lc42/r;I)V
    .locals 0

    iput p3, p0, Lc42/n;->w:I

    iput-object p1, p0, Lc42/n;->x:Lcom/whoop/pregnancy/view/PregnancySettingsFragment;

    iput-object p2, p0, Lc42/n;->y:Lc42/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lc42/n;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc42/n;->x:Lcom/whoop/pregnancy/view/PregnancySettingsFragment;

    iget-object v1, p0, Lc42/n;->y:Lc42/r;

    invoke-static {v0, v1}, Lcom/whoop/pregnancy/view/PregnancySettingsFragment;->Q(Lcom/whoop/pregnancy/view/PregnancySettingsFragment;Lc42/r;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lc42/n;->x:Lcom/whoop/pregnancy/view/PregnancySettingsFragment;

    iget-object v1, p0, Lc42/n;->y:Lc42/r;

    invoke-static {v0, v1}, Lcom/whoop/pregnancy/view/PregnancySettingsFragment;->S(Lcom/whoop/pregnancy/view/PregnancySettingsFragment;Lc42/r;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
