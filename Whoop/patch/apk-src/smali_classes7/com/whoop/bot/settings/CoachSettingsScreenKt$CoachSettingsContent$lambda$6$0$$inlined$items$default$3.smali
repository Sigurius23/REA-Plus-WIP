.class public final Lcom/whoop/bot/settings/CoachSettingsScreenKt$CoachSettingsContent$lambda$6$0$$inlined$items$default$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


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
        "Lkotlin/jvm/functions/Function1;"
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
.field final synthetic $contentType:Lkotlin/jvm/functions/Function1;

.field final synthetic $items:Ljava/util/List;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/bot/settings/CoachSettingsScreenKt$CoachSettingsContent$lambda$6$0$$inlined$items$default$3;->$contentType:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/whoop/bot/settings/CoachSettingsScreenKt$CoachSettingsContent$lambda$6$0$$inlined$items$default$3;->$items:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(I)Ljava/lang/Object;
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsScreenKt$CoachSettingsContent$lambda$6$0$$inlined$items$default$3;->$contentType:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/whoop/bot/settings/CoachSettingsScreenKt$CoachSettingsContent$lambda$6$0$$inlined$items$default$3;->$items:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/whoop/bot/settings/CoachSettingsScreenKt$CoachSettingsContent$lambda$6$0$$inlined$items$default$3;->invoke(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
