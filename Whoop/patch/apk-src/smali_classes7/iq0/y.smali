.class public final synthetic Liq0/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/community/presentation/chat/NotificationSettingsFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/community/presentation/chat/NotificationSettingsFragment;I)V
    .locals 0

    iput p2, p0, Liq0/y;->w:I

    iput-object p1, p0, Liq0/y;->x:Lcom/whoop/community/presentation/chat/NotificationSettingsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Liq0/y;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Liq0/y;->x:Lcom/whoop/community/presentation/chat/NotificationSettingsFragment;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/whoop/community/presentation/chat/NotificationSettingsFragment;->G(Lcom/whoop/community/presentation/chat/NotificationSettingsFragment;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Liq0/y;->x:Lcom/whoop/community/presentation/chat/NotificationSettingsFragment;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/community/presentation/chat/NotificationSettingsFragment;->E(Lcom/whoop/community/presentation/chat/NotificationSettingsFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
