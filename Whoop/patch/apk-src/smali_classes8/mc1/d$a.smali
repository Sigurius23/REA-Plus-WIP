.class public final Lmc1/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmc1/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmc1/d$a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J1\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lmc1/d$a;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/design/models/items/HeartRateTileId;",
        "Lmc1/b;",
        "b",
        "(Lcom/whoop/design/models/items/HeartRateTileId;)Lmc1/b;",
        "",
        "Ly11/l;",
        "horizontalBarGraphTileStates",
        "selectedHeartZoneType",
        "currentHeartZoneTypeState",
        "a",
        "(Ljava/util/List;Lmc1/b;Lmc1/b;)Ljava/util/List;",
        "design-models_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lmc1/d$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Lmc1/b;Lmc1/b;)Ljava/util/List;
    .locals 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ly11/l;",
            ">;",
            "Lmc1/b;",
            "Lmc1/b;",
            ")",
            "Ljava/util/List<",
            "Ly11/l;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    const-string v3, "horizontalBarGraphTileStates"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "selectedHeartZoneType"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "currentHeartZoneTypeState"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lmc1/b;->NONE:Lmc1/b;

    const/4 v5, 0x1

    if-eq v2, v3, :cond_0

    if-ne v2, v1, :cond_0

    move v15, v5

    goto :goto_0

    :cond_0
    const/4 v15, 0x0

    :goto_0
    move-object v3, v0

    check-cast v3, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v3, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object/from16 v16, v7

    check-cast v16, Ly11/l;

    invoke-virtual/range {v16 .. v16}, Ly11/l;->getEvent()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v2, :cond_2

    invoke-virtual/range {v16 .. v16}, Ly11/l;->getEvent()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v1, :cond_1

    move/from16 v26, v5

    goto :goto_2

    :cond_1
    const/16 v26, 0x0

    :goto_2
    invoke-static {v2, v0}, Lmc1/c;->e(Lmc1/b;Ljava/util/List;)Lcom/whoop/design/models/items/HeartRateTileStyle;

    move-result-object v7

    invoke-static {v7}, Lmc1/c;->c(Lcom/whoop/design/models/items/HeartRateTileStyle;)Ly11/a;

    move-result-object v23

    const v33, 0xfdbf

    const/16 v34, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-static/range {v16 .. v34}, Ly11/l;->b(Ly11/l;Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly11/a;Landroidx/compose/ui/Modifier;ZZLjava/util/List;ZLl83/k;ZZLcom/whoop/design/models/items/graph/LayoutDirection;ILjava/lang/Object;)Ly11/l;

    move-result-object v7

    move-object v4, v6

    goto :goto_5

    :cond_2
    if-eqz v15, :cond_3

    sget-object v7, Ly11/a;->AWAKE_SLEEP:Ly11/a;

    :goto_3
    move-object v13, v7

    goto :goto_4

    :cond_3
    invoke-virtual/range {v16 .. v16}, Ly11/l;->getEvent()Ljava/lang/Object;

    move-result-object v7

    const-string v8, "null cannot be cast to non-null type com.whoop.design.reducer.mapper.hrgraph.HeartRateZoneType"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Lmc1/b;

    invoke-static {v7, v0}, Lmc1/c;->e(Lmc1/b;Ljava/util/List;)Lcom/whoop/design/models/items/HeartRateTileStyle;

    move-result-object v7

    invoke-static {v7}, Lmc1/c;->c(Lcom/whoop/design/models/items/HeartRateTileStyle;)Ly11/a;

    move-result-object v7

    goto :goto_3

    :goto_4
    const v23, 0xfebf

    const/16 v24, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    move-object/from16 v17, v6

    move-object/from16 v6, v16

    const/16 v16, 0x0

    move-object/from16 v18, v17

    const/16 v17, 0x0

    move-object/from16 v19, v18

    const/16 v18, 0x0

    move-object/from16 v20, v19

    const/16 v19, 0x0

    move-object/from16 v21, v20

    const/16 v20, 0x0

    move-object/from16 v22, v21

    const/16 v21, 0x0

    move-object/from16 v25, v22

    const/16 v22, 0x0

    move-object/from16 v4, v25

    invoke-static/range {v6 .. v24}, Ly11/l;->b(Ly11/l;Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly11/a;Landroidx/compose/ui/Modifier;ZZLjava/util/List;ZLl83/k;ZZLcom/whoop/design/models/items/graph/LayoutDirection;ILjava/lang/Object;)Ly11/l;

    move-result-object v7

    :goto_5
    invoke-interface {v4, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v6, v4

    goto/16 :goto_1

    :cond_4
    move-object v4, v6

    return-object v4
.end method

.method public final b(Lcom/whoop/design/models/items/HeartRateTileId;)Lmc1/b;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lmc1/d$a$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Lmc1/b;->MEDIUM_STRESS:Lmc1/b;

    return-object p1

    :pswitch_1
    sget-object p1, Lmc1/b;->LOW_STRESS:Lmc1/b;

    return-object p1

    :pswitch_2
    sget-object p1, Lmc1/b;->HIGH_STRESS:Lmc1/b;

    return-object p1

    :pswitch_3
    sget-object p1, Lmc1/b;->AWAKE:Lmc1/b;

    return-object p1

    :pswitch_4
    sget-object p1, Lmc1/b;->SWS_SLEEP:Lmc1/b;

    return-object p1

    :pswitch_5
    sget-object p1, Lmc1/b;->REM_SLEEP:Lmc1/b;

    return-object p1

    :pswitch_6
    sget-object p1, Lmc1/b;->LIGHT_SLEEP:Lmc1/b;

    return-object p1

    :pswitch_7
    sget-object p1, Lmc1/b;->NONE:Lmc1/b;

    return-object p1

    :pswitch_8
    sget-object p1, Lmc1/b;->HOLD:Lmc1/b;

    return-object p1

    :pswitch_9
    sget-object p1, Lmc1/b;->EXHALE:Lmc1/b;

    return-object p1

    :pswitch_a
    sget-object p1, Lmc1/b;->INHALE:Lmc1/b;

    return-object p1

    :pswitch_b
    sget-object p1, Lmc1/b;->RESTORATIVE:Lmc1/b;

    return-object p1

    :pswitch_c
    sget-object p1, Lmc1/b;->LIGHT:Lmc1/b;

    return-object p1

    :pswitch_d
    sget-object p1, Lmc1/b;->VERY_LIGHT:Lmc1/b;

    return-object p1

    :pswitch_e
    sget-object p1, Lmc1/b;->MODERATE:Lmc1/b;

    return-object p1

    :pswitch_f
    sget-object p1, Lmc1/b;->HARD:Lmc1/b;

    return-object p1

    :pswitch_10
    sget-object p1, Lmc1/b;->MAX:Lmc1/b;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
