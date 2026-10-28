.class public abstract Llb1/h1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/h1$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/design/models/celebration/SlotConfigModel;",
        "Li51/v;",
        "b",
        "(Lcom/whoop/design/models/celebration/SlotConfigModel;)Li51/v;",
        "Lcom/whoop/design/models/celebration/AnimationModeModel;",
        "Li51/a;",
        "a",
        "(Lcom/whoop/design/models/celebration/AnimationModeModel;)Li51/a;",
        "Lcom/whoop/design/models/celebration/SlotGroupModel;",
        "Li51/w;",
        "c",
        "(Lcom/whoop/design/models/celebration/SlotGroupModel;)Li51/w;",
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
.method public static final a(Lcom/whoop/design/models/celebration/AnimationModeModel;)Li51/a;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/h1$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    sget-object p0, Li51/a;->OFF:Li51/a;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Li51/a;->PLAY_ONCE:Li51/a;

    return-object p0

    :cond_2
    sget-object p0, Li51/a;->LOOP:Li51/a;

    return-object p0
.end method

.method public static final b(Lcom/whoop/design/models/celebration/SlotConfigModel;)Li51/v;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/celebration/SlotConfigModel;->getOptions()Lcom/whoop/design/models/celebration/SlotOptionsModel;

    move-result-object v0

    instance-of v1, v0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;

    if-eqz v1, :cond_0

    new-instance p0, Li51/v$a;

    check-cast v0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->getMax()I

    move-result v1

    invoke-virtual {v0}, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->getSelected()I

    move-result v2

    invoke-virtual {v0}, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->getLayerPattern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->getBaseLayers()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v1, v2, v3, v0}, Li51/v$a;-><init>(IILjava/lang/String;Ljava/util/List;)V

    return-object p0

    :cond_0
    instance-of v1, v0, Lcom/whoop/design/models/celebration/SlotOptionsModel$ExclusiveOptionsModel;

    if-eqz v1, :cond_1

    new-instance p0, Li51/v$b;

    check-cast v0, Lcom/whoop/design/models/celebration/SlotOptionsModel$ExclusiveOptionsModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/celebration/SlotOptionsModel$ExclusiveOptionsModel;->getMax()I

    move-result v1

    invoke-virtual {v0}, Lcom/whoop/design/models/celebration/SlotOptionsModel$ExclusiveOptionsModel;->getSelected()I

    move-result v2

    invoke-virtual {v0}, Lcom/whoop/design/models/celebration/SlotOptionsModel$ExclusiveOptionsModel;->getLayerPattern()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v1, v2, v0}, Li51/v$b;-><init>(IILjava/lang/String;)V

    return-object p0

    :cond_1
    instance-of v1, v0, Lcom/whoop/design/models/celebration/SlotOptionsModel$BooleanOptionsModel;

    if-eqz v1, :cond_2

    new-instance p0, Li51/v$d;

    check-cast v0, Lcom/whoop/design/models/celebration/SlotOptionsModel$BooleanOptionsModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/celebration/SlotOptionsModel$BooleanOptionsModel;->getLayers()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Lcom/whoop/design/models/celebration/SlotOptionsModel$BooleanOptionsModel;->getValue()Z

    move-result v0

    invoke-direct {p0, v1, v0}, Li51/v$d;-><init>(Ljava/util/List;Z)V

    return-object p0

    :cond_2
    instance-of v1, v0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lcom/whoop/design/models/celebration/SlotConfigModel;->getName()Ljava/lang/String;

    move-result-object p0

    check-cast v0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->getSelectedGroup()I

    move-result v1

    invoke-virtual {v0}, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->getSelectedLevel()I

    move-result v2

    invoke-virtual {v0}, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->getGroups()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v0, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/celebration/SlotGroupModel;

    invoke-static {v4}, Llb1/h1;->c(Lcom/whoop/design/models/celebration/SlotGroupModel;)Li51/w;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    new-instance v0, Li51/v$c;

    invoke-direct {v0, p0, v1, v2, v3}, Li51/v$c;-><init>(Ljava/lang/String;IILjava/util/List;)V

    return-object v0

    :cond_4
    instance-of p0, v0, Lcom/whoop/design/models/celebration/SlotOptionsModel$UnknownOptionsModel;

    if-eqz p0, :cond_5

    const/4 p0, 0x0

    return-object p0

    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final c(Lcom/whoop/design/models/celebration/SlotGroupModel;)Li51/w;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Li51/w;

    invoke-virtual {p0}, Lcom/whoop/design/models/celebration/SlotGroupModel;->getId()I

    move-result v2

    invoke-virtual {p0}, Lcom/whoop/design/models/celebration/SlotGroupModel;->getMax()I

    move-result v3

    invoke-virtual {p0}, Lcom/whoop/design/models/celebration/SlotGroupModel;->getLayerPattern()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/celebration/SlotGroupModel;->getIndicatorLayers()Ljava/util/List;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/celebration/SlotGroupModel;->getWrapperLayers()Ljava/util/List;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Li51/w;-><init>(IILjava/lang/String;Ljava/util/List;Ljava/util/List;)V

    return-object v1
.end method
