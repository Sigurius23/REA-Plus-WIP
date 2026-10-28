.class public final synthetic Lcom/whoop/bot/settings/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/bot/settings/CoachSettingsFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/bot/settings/CoachSettingsFragment;I)V
    .locals 0

    iput p2, p0, Lcom/whoop/bot/settings/b;->w:I

    iput-object p1, p0, Lcom/whoop/bot/settings/b;->x:Lcom/whoop/bot/settings/CoachSettingsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcom/whoop/bot/settings/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/whoop/bot/settings/b;->x:Lcom/whoop/bot/settings/CoachSettingsFragment;

    invoke-static {v0}, Lcom/whoop/bot/settings/CoachSettingsFragment;->A(Lcom/whoop/bot/settings/CoachSettingsFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/bot/settings/b;->x:Lcom/whoop/bot/settings/CoachSettingsFragment;

    invoke-static {v0}, Lcom/whoop/bot/settings/CoachSettingsFragment;->B(Lcom/whoop/bot/settings/CoachSettingsFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lcom/whoop/bot/settings/b;->x:Lcom/whoop/bot/settings/CoachSettingsFragment;

    invoke-static {v0}, Lcom/whoop/bot/settings/CoachSettingsFragment;->C(Lcom/whoop/bot/settings/CoachSettingsFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
