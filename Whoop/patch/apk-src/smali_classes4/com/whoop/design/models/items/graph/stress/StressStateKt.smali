.class public final Lcom/whoop/design/models/items/graph/stress/StressStateKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/graph/stress/StressStateKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/stress/StressState;",
        "Ly81/e;",
        "toWhoopColor",
        "(Lcom/whoop/design/models/items/graph/stress/StressState;)Ly81/e;",
        "design-models_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final toWhoopColor(Lcom/whoop/design/models/items/graph/stress/StressState;)Ly81/e;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/graph/stress/StressStateKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-ne p0, v0, :cond_0

    sget-object p0, Lcom/whoop/design/models/items/graph/stress/StressStateKt$toWhoopColor$5;->INSTANCE:Lcom/whoop/design/models/items/graph/stress/StressStateKt$toWhoopColor$5;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lcom/whoop/design/models/items/graph/stress/StressStateKt$toWhoopColor$4;->INSTANCE:Lcom/whoop/design/models/items/graph/stress/StressStateKt$toWhoopColor$4;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :cond_2
    sget-object p0, Lcom/whoop/design/models/items/graph/stress/StressStateKt$toWhoopColor$3;->INSTANCE:Lcom/whoop/design/models/items/graph/stress/StressStateKt$toWhoopColor$3;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :cond_3
    sget-object p0, Lcom/whoop/design/models/items/graph/stress/StressStateKt$toWhoopColor$2;->INSTANCE:Lcom/whoop/design/models/items/graph/stress/StressStateKt$toWhoopColor$2;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :cond_4
    sget-object p0, Lcom/whoop/design/models/items/graph/stress/StressStateKt$toWhoopColor$1;->INSTANCE:Lcom/whoop/design/models/items/graph/stress/StressStateKt$toWhoopColor$1;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0
.end method
