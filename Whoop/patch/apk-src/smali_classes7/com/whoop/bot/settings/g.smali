.class public final synthetic Lcom/whoop/bot/settings/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FLri0/e$a;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    iput v0, p0, Lcom/whoop/bot/settings/g;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/whoop/bot/settings/g;->x:F

    iput-object p2, p0, Lcom/whoop/bot/settings/g;->y:Ljava/lang/Object;

    iput-object p3, p0, Lcom/whoop/bot/settings/g;->z:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;FLjava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, Lcom/whoop/bot/settings/g;->w:I

    iput-object p1, p0, Lcom/whoop/bot/settings/g;->y:Ljava/lang/Object;

    iput p2, p0, Lcom/whoop/bot/settings/g;->x:F

    iput-object p3, p0, Lcom/whoop/bot/settings/g;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lp71/c;Lkotlin/jvm/functions/Function1;F)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput v0, p0, Lcom/whoop/bot/settings/g;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/bot/settings/g;->y:Ljava/lang/Object;

    iput-object p2, p0, Lcom/whoop/bot/settings/g;->z:Ljava/lang/Object;

    iput p3, p0, Lcom/whoop/bot/settings/g;->x:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lcom/whoop/bot/settings/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/whoop/bot/settings/g;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lri0/e$a;

    iget-object v0, p0, Lcom/whoop/bot/settings/g;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v4, p1

    check-cast v4, Landroidx/compose/foundation/lazy/a;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v1, p0, Lcom/whoop/bot/settings/g;->x:F

    invoke-static/range {v1 .. v6}, Lzi0/a;->j(FLri0/e$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/bot/settings/g;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lg51/c;

    iget-object v0, p0, Lcom/whoop/bot/settings/g;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v4

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v2, p0, Lcom/whoop/bot/settings/g;->x:F

    invoke-static/range {v1 .. v6}, Lv81/c;->a(Lg51/c;FLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lcom/whoop/bot/settings/g;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lkd1/o;

    iget-object v0, p0, Lcom/whoop/bot/settings/g;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    move-object v4, p1

    check-cast v4, Ll0/v;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v2, p0, Lcom/whoop/bot/settings/g;->x:F

    invoke-static/range {v1 .. v6}, Luu2/g0;->e(Lkd1/o;FLjava/lang/String;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lcom/whoop/bot/settings/g;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lp71/c;

    iget-object v0, p0, Lcom/whoop/bot/settings/g;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v4, p1

    check-cast v4, Lc0/i0;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lcom/whoop/bot/settings/g;->x:F

    invoke-static/range {v1 .. v6}, Lp71/b;->c(Lp71/c;Lkotlin/jvm/functions/Function1;FLc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lcom/whoop/bot/settings/g;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;

    iget-object v0, p0, Lcom/whoop/bot/settings/g;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v4, p1

    check-cast v4, Landroidx/compose/foundation/lazy/a;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v2, p0, Lcom/whoop/bot/settings/g;->x:F

    invoke-static/range {v1 .. v6}, Lcom/whoop/bot/settings/CoachSettingsScreenKt;->i(Lcom/whoop/bot/settings/CoachSettingsViewState$Success;FLc93/a;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
