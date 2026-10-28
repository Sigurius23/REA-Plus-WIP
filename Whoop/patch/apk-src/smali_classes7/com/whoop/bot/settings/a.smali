.class public final synthetic Lcom/whoop/bot/settings/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/o;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p2, p0, Lcom/whoop/bot/settings/a;->w:I

    iput-object p1, p0, Lcom/whoop/bot/settings/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lcom/whoop/bot/settings/a;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v2, p1

    check-cast v2, Landroidx/compose/foundation/lazy/a;

    move-object v3, p2

    check-cast v3, Lcom/whoop/bot/settings/ConcisenessMode;

    move-object v4, p3

    check-cast v4, Lf31/a;

    move-object v5, p4

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p5, Ljava/lang/Integer;

    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v1, p0, Lcom/whoop/bot/settings/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v1 .. v6}, Lcom/whoop/bot/settings/CoachSettingsConcisenessContentKt;->c(Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Lcom/whoop/bot/settings/ConcisenessMode;Lf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v1, p1

    check-cast v1, Landroidx/compose/foundation/lazy/a;

    move-object v2, p2

    check-cast v2, Lcom/whoop/bot/settings/CoachingMode;

    move-object v3, p3

    check-cast v3, Lf31/a;

    move-object v4, p4

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p5, Ljava/lang/Integer;

    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lcom/whoop/bot/settings/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v5}, Lcom/whoop/bot/settings/CoachSettingsCoachingModeKt;->f(Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Lcom/whoop/bot/settings/CoachingMode;Lf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
