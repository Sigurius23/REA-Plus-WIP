.class public final synthetic Lic2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/settings/notification/SettingsNotificationFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/settings/notification/SettingsNotificationFragment;I)V
    .locals 0

    iput p2, p0, Lic2/d;->w:I

    iput-object p1, p0, Lic2/d;->x:Lcom/whoop/settings/notification/SettingsNotificationFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lic2/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lic2/d;->x:Lcom/whoop/settings/notification/SettingsNotificationFragment;

    invoke-static {v0}, Lcom/whoop/settings/notification/SettingsNotificationFragment;->J(Lcom/whoop/settings/notification/SettingsNotificationFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lic2/d;->x:Lcom/whoop/settings/notification/SettingsNotificationFragment;

    invoke-static {v0}, Lcom/whoop/settings/notification/SettingsNotificationFragment;->I(Lcom/whoop/settings/notification/SettingsNotificationFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lic2/d;->x:Lcom/whoop/settings/notification/SettingsNotificationFragment;

    invoke-static {v0}, Lcom/whoop/settings/notification/SettingsNotificationFragment;->G(Lcom/whoop/settings/notification/SettingsNotificationFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
