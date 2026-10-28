.class public final Lcom/whoop/bot/settings/CoachSettingsScreenKt$CoachSettingsContent$lambda$6$0$$inlined$items$default$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/bot/settings/CoachSettingsScreenKt;->CoachSettingsContent(Lcom/whoop/bot/settings/CoachSettingsViewState$Success;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/n;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $contentHorizontalPadding$inlined:F

.field final synthetic $items:Ljava/util/List;

.field final synthetic $onViewEvent$inlined:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Ljava/util/List;FLkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/bot/settings/CoachSettingsScreenKt$CoachSettingsContent$lambda$6$0$$inlined$items$default$4;->$items:Ljava/util/List;

    iput p2, p0, Lcom/whoop/bot/settings/CoachSettingsScreenKt$CoachSettingsContent$lambda$6$0$$inlined$items$default$4;->$contentHorizontalPadding$inlined:F

    iput-object p3, p0, Lcom/whoop/bot/settings/CoachSettingsScreenKt$CoachSettingsContent$lambda$6$0$$inlined$items$default$4;->$onViewEvent$inlined:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/bot/settings/CoachSettingsScreenKt$CoachSettingsContent$lambda$6$0$$inlined$items$default$4;->invoke(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 3

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    move-object v0, p3

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    :goto_0
    or-int/2addr p1, p4

    goto :goto_1

    :cond_1
    move p1, p4

    :goto_1
    and-int/lit8 p4, p4, 0x30

    if-nez p4, :cond_3

    move-object p4, p3

    check-cast p4, Lp1/q;

    invoke-virtual {p4, p2}, Lp1/q;->e(I)Z

    move-result p4

    if-eqz p4, :cond_2

    const/16 p4, 0x20

    goto :goto_2

    :cond_2
    const/16 p4, 0x10

    :goto_2
    or-int/2addr p1, p4

    :cond_3
    and-int/lit16 p4, p1, 0x93

    const/16 v0, 0x92

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p4, v0, :cond_4

    move p4, v2

    goto :goto_3

    :cond_4
    move p4, v1

    :goto_3
    and-int/2addr p1, v2

    check-cast p3, Lp1/q;

    invoke-virtual {p3, p1, p4}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 2
    iget-object p1, p0, Lcom/whoop/bot/settings/CoachSettingsScreenKt$CoachSettingsContent$lambda$6$0$$inlined$items$default$4;->$items:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/bot/settings/SettingItem;

    const p2, 0x6dabecca

    .line 3
    invoke-virtual {p3, p2}, Lp1/q;->e0(I)V

    iget p2, p0, Lcom/whoop/bot/settings/CoachSettingsScreenKt$CoachSettingsContent$lambda$6$0$$inlined$items$default$4;->$contentHorizontalPadding$inlined:F

    iget-object p4, p0, Lcom/whoop/bot/settings/CoachSettingsScreenKt$CoachSettingsContent$lambda$6$0$$inlined$items$default$4;->$onViewEvent$inlined:Lkotlin/jvm/functions/Function1;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int/lit8 v0, v0, 0x30

    invoke-static {p1, p2, p4, p3, v0}, Lcom/whoop/bot/settings/CoachSettingsScreenKt;->access$SettingItemEntry-rAjV9yQ(Lcom/whoop/bot/settings/SettingItem;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 4
    invoke-virtual {p3, v1}, Lp1/q;->q(Z)V

    return-void

    .line 5
    :cond_5
    invoke-virtual {p3}, Lp1/q;->X()V

    return-void
.end method
