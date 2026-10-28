.class public final synthetic Lrl2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/training/ui/activitysettings/ActivitySettingsFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/training/ui/activitysettings/ActivitySettingsFragment;I)V
    .locals 0

    iput p2, p0, Lrl2/a;->w:I

    iput-object p1, p0, Lrl2/a;->x:Lcom/whoop/training/ui/activitysettings/ActivitySettingsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lrl2/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrl2/a;->x:Lcom/whoop/training/ui/activitysettings/ActivitySettingsFragment;

    invoke-static {v0}, Lcom/whoop/training/ui/activitysettings/ActivitySettingsFragment;->F(Lcom/whoop/training/ui/activitysettings/ActivitySettingsFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lrl2/a;->x:Lcom/whoop/training/ui/activitysettings/ActivitySettingsFragment;

    invoke-static {v0}, Lcom/whoop/training/ui/activitysettings/ActivitySettingsFragment;->H(Lcom/whoop/training/ui/activitysettings/ActivitySettingsFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lrl2/a;->x:Lcom/whoop/training/ui/activitysettings/ActivitySettingsFragment;

    invoke-static {v0}, Lcom/whoop/training/ui/activitysettings/ActivitySettingsFragment;->E(Lcom/whoop/training/ui/activitysettings/ActivitySettingsFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lrl2/a;->x:Lcom/whoop/training/ui/activitysettings/ActivitySettingsFragment;

    invoke-static {v0}, Lcom/whoop/training/ui/activitysettings/ActivitySettingsFragment;->I(Lcom/whoop/training/ui/activitysettings/ActivitySettingsFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
