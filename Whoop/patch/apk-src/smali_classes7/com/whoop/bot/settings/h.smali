.class public final synthetic Lcom/whoop/bot/settings/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:I

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FI)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    iput v0, p0, Lcom/whoop/bot/settings/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/bot/settings/h;->z:Ljava/lang/Object;

    iput-object p2, p0, Lcom/whoop/bot/settings/h;->E:Ljava/lang/Object;

    iput p3, p0, Lcom/whoop/bot/settings/h;->x:F

    iput p4, p0, Lcom/whoop/bot/settings/h;->y:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;FLjava/lang/Object;II)V
    .locals 0

    .line 2
    iput p5, p0, Lcom/whoop/bot/settings/h;->w:I

    iput-object p1, p0, Lcom/whoop/bot/settings/h;->z:Ljava/lang/Object;

    iput p2, p0, Lcom/whoop/bot/settings/h;->x:F

    iput-object p3, p0, Lcom/whoop/bot/settings/h;->E:Ljava/lang/Object;

    iput p4, p0, Lcom/whoop/bot/settings/h;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lcom/whoop/bot/settings/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/whoop/bot/settings/h;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lri0/i;

    iget-object v0, p0, Lcom/whoop/bot/settings/h;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v2, p0, Lcom/whoop/bot/settings/h;->x:F

    iget v4, p0, Lcom/whoop/bot/settings/h;->y:I

    invoke-static/range {v1 .. v6}, Lui0/p;->h(Lri0/i;FLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/bot/settings/h;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ln71/q;

    iget-object v0, p0, Lcom/whoop/bot/settings/h;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v2, p0, Lcom/whoop/bot/settings/h;->x:F

    iget v4, p0, Lcom/whoop/bot/settings/h;->y:I

    invoke-static/range {v1 .. v6}, Lsg2/p;->a(Ln71/q;FLandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lcom/whoop/bot/settings/h;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lcom/whoop/bot/settings/h;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/design/util/TextResource;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v3, p0, Lcom/whoop/bot/settings/h;->x:F

    iget v4, p0, Lcom/whoop/bot/settings/h;->y:I

    invoke-static/range {v1 .. v6}, Lqn0/b;->a(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lcom/whoop/bot/settings/h;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Llf0/m1;

    iget-object v0, p0, Lcom/whoop/bot/settings/h;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v2, p0, Lcom/whoop/bot/settings/h;->x:F

    iget v4, p0, Lcom/whoop/bot/settings/h;->y:I

    invoke-static/range {v1 .. v6}, Llf0/l1;->e(Llf0/m1;FLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lcom/whoop/bot/settings/h;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/bot/settings/CoachSettingsDisplayState;

    iget-object v0, p0, Lcom/whoop/bot/settings/h;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v2, p0, Lcom/whoop/bot/settings/h;->x:F

    iget v4, p0, Lcom/whoop/bot/settings/h;->y:I

    invoke-static/range {v1 .. v6}, Lcom/whoop/bot/settings/CoachSettingsScreenKt;->s(Lcom/whoop/bot/settings/CoachSettingsDisplayState;FLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lcom/whoop/bot/settings/h;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/bot/settings/SettingItem;

    iget-object v0, p0, Lcom/whoop/bot/settings/h;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v2, p0, Lcom/whoop/bot/settings/h;->x:F

    iget v4, p0, Lcom/whoop/bot/settings/h;->y:I

    invoke-static/range {v1 .. v6}, Lcom/whoop/bot/settings/CoachSettingsScreenKt;->D(Lcom/whoop/bot/settings/SettingItem;FLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
