.class public final synthetic Lcom/whoop/bot/settings/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/bot/settings/CoachSettingsViewState$Success;

.field public final synthetic y:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/bot/settings/CoachSettingsViewState$Success;Lc93/a;I)V
    .locals 0

    iput p3, p0, Lcom/whoop/bot/settings/f;->w:I

    iput-object p1, p0, Lcom/whoop/bot/settings/f;->x:Lcom/whoop/bot/settings/CoachSettingsViewState$Success;

    iput-object p2, p0, Lcom/whoop/bot/settings/f;->y:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/whoop/bot/settings/f;->w:I

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/whoop/bot/settings/f;->x:Lcom/whoop/bot/settings/CoachSettingsViewState$Success;

    iget-object v1, p0, Lcom/whoop/bot/settings/f;->y:Lc93/a;

    invoke-static {v0, v1, p1, p2, p3}, Lcom/whoop/bot/settings/CoachSettingsScreenKt;->M(Lcom/whoop/bot/settings/CoachSettingsViewState$Success;Lc93/a;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/bot/settings/f;->x:Lcom/whoop/bot/settings/CoachSettingsViewState$Success;

    iget-object v1, p0, Lcom/whoop/bot/settings/f;->y:Lc93/a;

    invoke-static {v0, v1, p1, p2, p3}, Lcom/whoop/bot/settings/CoachSettingsScreenKt;->A(Lcom/whoop/bot/settings/CoachSettingsViewState$Success;Lc93/a;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lcom/whoop/bot/settings/f;->x:Lcom/whoop/bot/settings/CoachSettingsViewState$Success;

    iget-object v1, p0, Lcom/whoop/bot/settings/f;->y:Lc93/a;

    invoke-static {v0, v1, p1, p2, p3}, Lcom/whoop/bot/settings/CoachSettingsScreenKt;->G(Lcom/whoop/bot/settings/CoachSettingsViewState$Success;Lc93/a;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lcom/whoop/bot/settings/f;->x:Lcom/whoop/bot/settings/CoachSettingsViewState$Success;

    iget-object v1, p0, Lcom/whoop/bot/settings/f;->y:Lc93/a;

    invoke-static {v0, v1, p1, p2, p3}, Lcom/whoop/bot/settings/CoachSettingsScreenKt;->Q(Lcom/whoop/bot/settings/CoachSettingsViewState$Success;Lc93/a;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
