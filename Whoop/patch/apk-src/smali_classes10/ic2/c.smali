.class public final synthetic Lic2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/settings/notification/SettingsNotificationFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/settings/notification/SettingsNotificationFragment;I)V
    .locals 0

    iput p2, p0, Lic2/c;->w:I

    iput-object p1, p0, Lic2/c;->x:Lcom/whoop/settings/notification/SettingsNotificationFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lic2/c;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    iget-object v0, p0, Lic2/c;->x:Lcom/whoop/settings/notification/SettingsNotificationFragment;

    invoke-static {v0, p1, p2}, Lcom/whoop/settings/notification/SettingsNotificationFragment;->H(Lcom/whoop/settings/notification/SettingsNotificationFragment;Ljava/lang/String;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lic2/c;->x:Lcom/whoop/settings/notification/SettingsNotificationFragment;

    invoke-static {v0, p1, p2}, Lcom/whoop/settings/notification/SettingsNotificationFragment;->F(Lcom/whoop/settings/notification/SettingsNotificationFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
