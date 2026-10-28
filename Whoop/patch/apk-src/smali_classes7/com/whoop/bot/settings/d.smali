.class public final synthetic Lcom/whoop/bot/settings/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/bot/settings/CoachSettingsViewState$Success;

.field public final synthetic y:Leb/u0;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/bot/settings/CoachSettingsViewState$Success;Leb/u0;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p4, p0, Lcom/whoop/bot/settings/d;->w:I

    iput-object p1, p0, Lcom/whoop/bot/settings/d;->x:Lcom/whoop/bot/settings/CoachSettingsViewState$Success;

    iput-object p2, p0, Lcom/whoop/bot/settings/d;->y:Leb/u0;

    iput-object p3, p0, Lcom/whoop/bot/settings/d;->z:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lcom/whoop/bot/settings/d;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v4, p1

    check-cast v4, Leb/q;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v1, p0, Lcom/whoop/bot/settings/d;->x:Lcom/whoop/bot/settings/CoachSettingsViewState$Success;

    iget-object v2, p0, Lcom/whoop/bot/settings/d;->y:Leb/u0;

    iget-object v3, p0, Lcom/whoop/bot/settings/d;->z:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v1 .. v6}, Lcom/whoop/bot/settings/CoachSettingsScreenKt;->P(Lcom/whoop/bot/settings/CoachSettingsViewState$Success;Leb/u0;Lkotlin/jvm/functions/Function1;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v3, p1

    check-cast v3, Leb/q;

    move-object v4, p2

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lcom/whoop/bot/settings/d;->x:Lcom/whoop/bot/settings/CoachSettingsViewState$Success;

    iget-object v1, p0, Lcom/whoop/bot/settings/d;->y:Leb/u0;

    iget-object v2, p0, Lcom/whoop/bot/settings/d;->z:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v5}, Lcom/whoop/bot/settings/CoachSettingsScreenKt;->y(Lcom/whoop/bot/settings/CoachSettingsViewState$Success;Leb/u0;Lkotlin/jvm/functions/Function1;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    move-object v3, p1

    check-cast v3, Leb/q;

    move-object v4, p2

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lcom/whoop/bot/settings/d;->x:Lcom/whoop/bot/settings/CoachSettingsViewState$Success;

    iget-object v1, p0, Lcom/whoop/bot/settings/d;->y:Leb/u0;

    iget-object v2, p0, Lcom/whoop/bot/settings/d;->z:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v5}, Lcom/whoop/bot/settings/CoachSettingsScreenKt;->q(Lcom/whoop/bot/settings/CoachSettingsViewState$Success;Leb/u0;Lkotlin/jvm/functions/Function1;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
