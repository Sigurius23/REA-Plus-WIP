.class public abstract Llb1/v1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/v1$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0015\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/design/models/items/GoalSettingsTileModel;",
        "model",
        "Lf41/e;",
        "b",
        "(Lcom/whoop/design/models/items/GoalSettingsTileModel;)Lf41/e;",
        "Lcom/whoop/design/models/items/GoalSettingsTileStyle;",
        "style",
        "Ly81/e;",
        "a",
        "(Lcom/whoop/design/models/items/GoalSettingsTileStyle;)Ly81/e;",
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
.method public static final a(Lcom/whoop/design/models/items/GoalSettingsTileStyle;)Ly81/e;
    .locals 1

    const-string v0, "style"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/v1$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    sget-object p0, Llb1/v1$f;->w:Llb1/v1$f;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_1
    sget-object p0, Llb1/v1$e;->w:Llb1/v1$e;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_2
    sget-object p0, Llb1/v1$d;->w:Llb1/v1$d;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_3
    sget-object p0, Llb1/v1$c;->w:Llb1/v1$c;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_4
    sget-object p0, Llb1/v1$b;->w:Llb1/v1$b;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final b(Lcom/whoop/design/models/items/GoalSettingsTileModel;)Lf41/e;
    .locals 26

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    const-string v4, "getDefault(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "toUpperCase(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->getAvoidTextDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->getIcon()Ljava/lang/String;

    move-result-object v7

    const/4 v0, 0x0

    if-eqz v7, :cond_0

    new-instance v6, Lkd1/o$c;

    const/16 v11, 0xe

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    move-object v6, v0

    :goto_0
    invoke-virtual {v1}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->getTrend()Lcom/whoop/design/models/items/ImpactModel;

    move-result-object v7

    if-eqz v7, :cond_1

    new-instance v8, Lhy0/c2;

    invoke-virtual {v7}, Lcom/whoop/design/models/items/ImpactModel;->getTitleDisplay()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v7}, Lcom/whoop/design/models/items/ImpactModel;->getBackgroundEnabled()Z

    move-result v10

    invoke-virtual {v7}, Lcom/whoop/design/models/items/ImpactModel;->getTrend()Lhy0/b2;

    move-result-object v11

    const/16 v24, 0x7ff0

    const/16 v25, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v8 .. v25}, Lhy0/c2;-><init>(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;Lhy0/s0;ZZIIFLcom/whoop/navigation/e;Ljava/lang/Float;FLl0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v7, v8

    goto :goto_1

    :cond_1
    move-object v7, v0

    :goto_1
    invoke-virtual {v1}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->getStyle()Lcom/whoop/design/models/items/GoalSettingsTileStyle;

    move-result-object v8

    invoke-static {v8}, Llb1/v1;->a(Lcom/whoop/design/models/items/GoalSettingsTileStyle;)Ly81/e;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->getBackgroundImage()Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_2

    new-instance v9, Lkd1/o$c;

    const/16 v14, 0xe

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v15}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_2
    move-object v9, v0

    :goto_2
    invoke-virtual {v1}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->getSelectedValue()Ljava/lang/Integer;

    move-result-object v0

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eqz v0, :cond_3

    move v0, v10

    move v10, v11

    goto :goto_3

    :cond_3
    move v0, v10

    :goto_3
    invoke-virtual {v1}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->getAvoidTextDisplay()Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_4

    move v12, v11

    goto :goto_4

    :cond_4
    move v12, v11

    move v11, v0

    :goto_4
    invoke-virtual {v1}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->isAvoidChecked()Ljava/lang/Boolean;

    move-result-object v13

    if-eqz v13, :cond_5

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :cond_5
    invoke-virtual {v1}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->getDayOptions()Lcom/whoop/design/models/items/DayOptions;

    move-result-object v13

    invoke-virtual {v13}, Lcom/whoop/design/models/items/DayOptions;->getValues()Ljava/util/List;

    move-result-object v13

    check-cast v13, Ljava/lang/Iterable;

    new-instance v14, Ljava/util/ArrayList;

    const/16 v15, 0xa

    invoke-static {v13, v15}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v15

    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_5
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_6

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/whoop/design/models/items/Value;

    new-instance v12, Lf41/q;

    move/from16 v17, v0

    invoke-virtual {v15}, Lcom/whoop/design/models/items/Value;->getValue()I

    move-result v0

    invoke-virtual {v15}, Lcom/whoop/design/models/items/Value;->getTrailingDisplay()Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v18 .. v18}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {v15}, Lcom/whoop/design/models/items/Value;->getAvoidTrailingDisplay()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-direct {v12, v0, v1, v15}, Lf41/q;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-interface {v14, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, p0

    move/from16 v0, v17

    const/4 v12, 0x1

    goto :goto_5

    :cond_6
    move/from16 v17, v0

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->getDayOptions()Lcom/whoop/design/models/items/DayOptions;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/DayOptions;->getLeadingTitleDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    new-instance v13, Lf41/b;

    invoke-direct {v13, v14, v0}, Lf41/b;-><init>(Ljava/util/List;Lcom/whoop/design/util/TextResource;)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->getSelectedValue()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move v14, v0

    goto :goto_6

    :cond_7
    const/4 v14, 0x1

    :goto_6
    new-instance v1, Lf41/e;

    const/4 v15, 0x0

    const/16 v16, 0x2000

    move/from16 v12, v17

    const/16 v17, 0x0

    invoke-direct/range {v1 .. v17}, Lf41/e;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lhy0/c2;Ly81/e;Lkd1/o;ZZZLf41/b;ILf41/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
