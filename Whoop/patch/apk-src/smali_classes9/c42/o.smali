.class public final synthetic Lc42/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:La42/a;

.field public final synthetic y:Z

.field public final synthetic z:Lcom/whoop/pregnancy/view/PregnancySettingsFragment;


# direct methods
.method public synthetic constructor <init>(La42/a;ZLcom/whoop/pregnancy/view/PregnancySettingsFragment;I)V
    .locals 0

    iput p4, p0, Lc42/o;->w:I

    iput-object p1, p0, Lc42/o;->x:La42/a;

    iput-boolean p2, p0, Lc42/o;->y:Z

    iput-object p3, p0, Lc42/o;->z:Lcom/whoop/pregnancy/view/PregnancySettingsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lc42/o;->w:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Lc42/o;->y:Z

    iget-object v1, p0, Lc42/o;->z:Lcom/whoop/pregnancy/view/PregnancySettingsFragment;

    iget-object v2, p0, Lc42/o;->x:La42/a;

    invoke-static {v2, v0, v1}, Lcom/whoop/pregnancy/view/PregnancySettingsFragment;->W(La42/a;ZLcom/whoop/pregnancy/view/PregnancySettingsFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-boolean v0, p0, Lc42/o;->y:Z

    iget-object v1, p0, Lc42/o;->z:Lcom/whoop/pregnancy/view/PregnancySettingsFragment;

    iget-object v2, p0, Lc42/o;->x:La42/a;

    invoke-static {v2, v0, v1}, Lcom/whoop/pregnancy/view/PregnancySettingsFragment;->X(La42/a;ZLcom/whoop/pregnancy/view/PregnancySettingsFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
