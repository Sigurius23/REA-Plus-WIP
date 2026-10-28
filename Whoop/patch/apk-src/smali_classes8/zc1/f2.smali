.class public abstract Lzc1/f2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001aI\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\")\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00150\u00140\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Ll83/a0;",
        "c",
        "(Landroidx/compose/runtime/Composer;I)V",
        "",
        "id",
        "title",
        "glyph",
        "Lm91/u;",
        "trailing",
        "",
        "isSelected",
        "",
        "description",
        "Lh31/q;",
        "f",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;ZLjava/util/List;)Lh31/q;",
        "Lv71/i;",
        "a",
        "Lv71/i;",
        "allTasksPreviewItemsCardState",
        "Ll83/k;",
        "Lv51/c;",
        "b",
        "Ljava/util/List;",
        "h",
        "()Ljava/util/List;",
        "expandableContentGalleryStates",
        "design-showcase_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Lv71/i;

.field private static final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ll83/k;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 37

    new-instance v0, Lv71/i;

    new-instance v1, Lf81/c;

    const v2, 0x3dac0831    # 0.084f

    sget-object v3, Ly81/f;->ACCENT_ONBOARDING_ACTION:Ly81/f;

    const/4 v4, 0x0

    invoke-direct {v1, v4, v4, v2, v3}, Lf81/c;-><init>(Ljava/lang/String;Ljava/lang/String;FLy81/f;)V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    new-instance v1, Lny0/l;

    sget-object v3, Lgz0/m0;->AI_SPARKLE:Lgz0/m0;

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const-string v2, "all-tasks-preview-steps-coach"

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lny0/l;-><init>(Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/e;ZLi91/a;Lny0/p;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v7, "\ud83d\udc5f"

    const/4 v9, 0x1

    const-string v5, "all-tasks-preview-steps"

    const-string v6, "648 / 7,700 steps"

    move-object v8, v1

    invoke-static/range {v5 .. v10}, Lzc1/f2;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;ZLjava/util/List;)Lh31/q;

    move-result-object v1

    new-instance v4, Lv51/c;

    sget-object v2, Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;->VERTICAL:Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;

    sget-object v5, Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;->BOTTOM:Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;

    new-instance v6, Lny0/l;

    sget-object v8, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    const/16 v13, 0x3c

    const/4 v14, 0x0

    const-string v7, "all-tasks-preview-strength-chevron"

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v6 .. v14}, Lny0/l;-><init>(Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/e;ZLi91/a;Lny0/p;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v14, v8

    const/16 v12, 0x30

    const/4 v13, 0x0

    move-object v9, v6

    const-string v6, "all-tasks-preview-strength"

    const-string v7, "Full Body Strength Training"

    const-string v8, "\ud83c\udfcb\ufe0f"

    invoke-static/range {v6 .. v13}, Lzc1/f2;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;ZLjava/util/List;ILjava/lang/Object;)Lh31/q;

    move-result-object v6

    new-instance v18, Lny0/l;

    move-object v8, v14

    const/16 v14, 0x3c

    const/4 v15, 0x0

    move-object v9, v8

    const-string v8, "all-tasks-preview-strength-chevron"

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v7, v18

    invoke-direct/range {v7 .. v15}, Lny0/l;-><init>(Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/e;ZLi91/a;Lny0/p;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v21, 0x30

    const/16 v22, 0x0

    const-string v15, "all-tasks-preview-teeth"

    const-string v16, "Brush teeth by 8:30"

    const-string v17, "\ud83e\udea5"

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v15 .. v22}, Lzc1/f2;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;ZLjava/util/List;ILjava/lang/Object;)Lh31/q;

    move-result-object v7

    new-instance v11, Lny0/l;

    const/16 v18, 0x3c

    const/16 v19, 0x0

    const-string v12, "all-tasks-preview-sleep-coach"

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v13, v3

    invoke-direct/range {v11 .. v19}, Lny0/l;-><init>(Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/e;ZLi91/a;Lny0/p;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v14, 0x30

    const/4 v15, 0x0

    const-string v8, "all-tasks-preview-sleep"

    const-string v9, "Asleep by 1:10 am"

    const-string v10, "\ud83d\ude34"

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v8 .. v15}, Lzc1/f2;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;ZLjava/util/List;ILjava/lang/Object;)Lh31/q;

    move-result-object v3

    filled-new-array {v6, v7, v3}, [Lh31/q;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    const/16 v18, 0x37c

    move-object/from16 v16, v5

    const-string v5, "program-hub-all-tasks-expansion"

    const-string v6, "ALL TASKS (4)"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    move-object v15, v2

    invoke-direct/range {v4 .. v19}, Lv51/c;-><init>(Ljava/lang/String;Ljava/lang/String;Lb91/c;Li2/x;Lp3/r;ZLhy0/h1;ZLi2/x;Ly3/f;Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v9, 0x2

    new-array v2, v9, [Lm91/u;

    aput-object v1, v2, v10

    const/4 v11, 0x1

    aput-object v4, v2, v11

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const/16 v7, 0x37

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Lv71/i;-><init>(Lv71/e;Lv71/c;Lv71/a;Ljava/util/List;Ljava/util/List;Ll0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lzc1/f2;->a:Lv71/i;

    new-instance v12, Lv51/c;

    new-instance v13, Lsz0/c0;

    sget-object v16, Lb91/c;->B1:Lb91/c;

    sget-object v17, Ly81/f;->WHITE_70:Ly81/f;

    const/16 v24, 0x3f0

    const/16 v25, 0x0

    const-string v14, "Warm up with 5-10 minutes of light cardio before every session."

    move-object/from16 v15, v16

    move-object/from16 v16, v17

    const/16 v17, 0x5

    const/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v13 .. v25}, Lsz0/c0;-><init>(Ljava/lang/String;Lb91/c;Ly81/f;ILgz0/m0;Ljava/lang/Integer;Ljava/lang/Integer;Li2/t;ZLsz0/y;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v17, v16

    move-object/from16 v16, v15

    new-instance v0, Lhy0/e;

    const/4 v4, 0x7

    invoke-direct/range {v0 .. v5}, Lhy0/e;-><init>(Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v14, Lsz0/c0;

    const/16 v25, 0x3f0

    const/16 v26, 0x0

    const-string v15, "Drink water before, during, and after exercise."

    const/16 v18, 0x5

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v14 .. v26}, Lsz0/c0;-><init>(Ljava/lang/String;Lb91/c;Ly81/f;ILgz0/m0;Ljava/lang/Integer;Ljava/lang/Integer;Li2/t;ZLsz0/y;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v16

    move-object/from16 v2, v17

    const/4 v3, 0x3

    new-array v4, v3, [Lm91/u;

    aput-object v13, v4, v10

    aput-object v0, v4, v11

    aput-object v14, v4, v9

    invoke-static {v4}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v25

    const/16 v26, 0xf3d

    const/16 v27, 0x0

    const/4 v13, 0x0

    const-string v14, "Training Tips"

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x1

    const/16 v23, 0x0

    invoke-direct/range {v12 .. v27}, Lv51/c;-><init>(Ljava/lang/String;Ljava/lang/String;Lb91/c;Li2/x;Lp3/r;ZLhy0/h1;ZLi2/x;Ly3/f;Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Ll83/k;

    const-string v4, "Expanded \u2014 no tag"

    invoke-direct {v0, v4, v12}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v13, Lv51/c;

    new-instance v14, Lsz0/c0;

    const/16 v25, 0x3f0

    const/16 v26, 0x0

    const-string v15, "REM sleep is critical for memory consolidation and emotional regulation."

    const/16 v18, 0x5

    const/16 v20, 0x0

    const/16 v23, 0x0

    move-object/from16 v16, v1

    move-object/from16 v17, v2

    invoke-direct/range {v14 .. v26}, Lsz0/c0;-><init>(Ljava/lang/String;Lb91/c;Ly81/f;ILgz0/m0;Ljava/lang/Integer;Ljava/lang/Integer;Li2/t;ZLsz0/y;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v14

    new-instance v18, Lhy0/e;

    const/16 v22, 0x7

    const/16 v23, 0x0

    invoke-direct/range {v18 .. v23}, Lhy0/e;-><init>(Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v18

    new-instance v14, Lsz0/c0;

    const-string v15, "Aim for 7-9 hours of sleep to maximize your Recovery score."

    const/16 v18, 0x5

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v14 .. v26}, Lsz0/c0;-><init>(Ljava/lang/String;Lb91/c;Ly81/f;ILgz0/m0;Ljava/lang/Integer;Ljava/lang/Integer;Li2/t;ZLsz0/y;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v16

    move-object/from16 v5, v17

    new-array v6, v3, [Lm91/u;

    aput-object v1, v6, v10

    aput-object v2, v6, v11

    aput-object v14, v6, v9

    invoke-static {v6}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v26

    const/16 v27, 0xf3d

    const/16 v28, 0x0

    const/4 v14, 0x0

    const-string v15, "Sleep Insights"

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v13 .. v28}, Lv51/c;-><init>(Ljava/lang/String;Ljava/lang/String;Lb91/c;Li2/x;Lp3/r;ZLhy0/h1;ZLi2/x;Ly3/f;Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Ll83/k;

    const-string v2, "Collapsed \u2014 no tag"

    invoke-direct {v1, v2, v13}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lv51/c;

    new-instance v21, Lhy0/h1;

    const-string v6, "6"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    sget-object v20, Lhy0/o1;->BADGE_SMALL_SECONDARY_NEUTRAL:Lhy0/o1;

    const v35, 0x3fff7e

    const/16 v36, 0x0

    const/4 v15, 0x0

    const/16 v19, 0x0

    move-object/from16 v12, v21

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    invoke-direct/range {v12 .. v36}, Lhy0/h1;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/e;Li91/d;Ly81/e;Li2/t;Li2/t;Lhy0/o1;ZLi2/a1;FFFLy71/g;FLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lhy0/c1;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v14, Lsz0/c0;

    const/16 v25, 0x3f0

    const-string v15, "HRV is one of the primary inputs for your WHOOP Recovery score."

    const/16 v18, 0x5

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v16, v4

    move-object/from16 v17, v5

    invoke-direct/range {v14 .. v26}, Lsz0/c0;-><init>(Ljava/lang/String;Lb91/c;Ly81/f;ILgz0/m0;Ljava/lang/Integer;Ljava/lang/Integer;Li2/t;ZLsz0/y;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v4, v14

    new-instance v18, Lhy0/e;

    const/16 v22, 0x7

    const/16 v23, 0x0

    invoke-direct/range {v18 .. v23}, Lhy0/e;-><init>(Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v5, v18

    new-instance v14, Lsz0/c0;

    const-string v15, "A lower resting heart rate generally indicates better cardiovascular fitness."

    const/16 v18, 0x5

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v14 .. v26}, Lsz0/c0;-><init>(Ljava/lang/String;Lb91/c;Ly81/f;ILgz0/m0;Ljava/lang/Integer;Ljava/lang/Integer;Li2/t;ZLsz0/y;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-array v3, v3, [Lm91/u;

    aput-object v4, v3, v10

    aput-object v5, v3, v11

    aput-object v14, v3, v9

    invoke-static {v3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v27

    const/16 v28, 0xf3d

    const/4 v15, 0x0

    const-string v16, "Recovery Factors"

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x1

    const/16 v23, 0x0

    const/16 v25, 0x0

    move-object v14, v2

    move-object/from16 v21, v12

    invoke-direct/range {v14 .. v29}, Lv51/c;-><init>(Ljava/lang/String;Ljava/lang/String;Lb91/c;Li2/x;Lp3/r;ZLhy0/h1;ZLi2/x;Ly3/f;Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Ll83/k;

    const-string v3, "Expanded \u2014 with tag"

    invoke-direct {v2, v3, v14}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v1, v2}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lzc1/f2;->b:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/f2;->d(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/f2;->e(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/runtime/Composer;I)V
    .locals 11

    move-object v5, p0

    check-cast v5, Lp1/q;

    const p0, 0x11c9241c

    invoke-virtual {v5, p0}, Lp1/q;->g0(I)Lp1/q;

    const/4 p0, 0x0

    const/4 v8, 0x1

    if-eqz p1, :cond_0

    move v0, v8

    goto :goto_0

    :cond_0
    move v0, p0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {v5, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_6

    const/high16 v0, 0x3f800000    # 1.0f

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v9}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Ll0/m;->c:Ll0/g;

    sget-object v2, Lb2/e;->M:Lb2/k;

    invoke-static {v1, v2, v5, p0}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v2, v5, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v5, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v4, La3/l;->a:La3/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v6, v5, Lp1/q;->S:Z

    if-eqz v6, :cond_1

    invoke-virtual {v5, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_1
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v5, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v5, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v3, v5, Lp1/q;->S:Z

    if-nez v3, :cond_2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    :cond_2
    invoke-static {v2, v5, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v5, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, 0xb0c4f9

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lzc1/f2;->b:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x4

    const/4 v3, 0x2

    const/4 v4, 0x6

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll83/k;

    iget-object v6, v1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    invoke-static {v6, v5, p0}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    int-to-float v3, v3

    int-to-float v2, v2

    mul-float/2addr v3, v2

    invoke-static {v3, v9}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v5, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v3, Lv51/a;

    invoke-direct {v3}, Lv51/a;-><init>()V

    iget-object v1, v1, Ll83/k;->x:Ljava/lang/Object;

    check-cast v1, Lm91/u;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v6, v7, :cond_4

    new-instance v6, Lzc1/w1;

    const/4 v7, 0x2

    invoke-direct {v6, v7}, Lzc1/w1;-><init>(I)V

    invoke-virtual {v5, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v6, Lkotlin/jvm/functions/Function1;

    sget v7, Lv51/c;->n:I

    or-int/lit8 v7, v7, 0x30

    sget v10, Lv51/a;->a:I

    shl-int/lit8 v4, v10, 0x6

    or-int/2addr v4, v7

    invoke-virtual {v3, v1, v6, v5, v4}, Lv51/a;->Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v2, v2, v9, v5}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    goto :goto_2

    :cond_5
    invoke-virtual {v5, p0}, Lp1/q;->q(Z)V

    const-string p0, "Header bottom \u2014 inside items card, collapsed"

    invoke-static {p0, v5, v4}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    int-to-float p0, v3

    int-to-float v10, v2

    invoke-static {p0, v10, v9, v5}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    sget-object v1, Lzc1/f2;->a:Lv71/i;

    sget p0, Lv71/i;->g:I

    shl-int/lit8 v6, p0, 0x3

    const/16 v7, 0x1d

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v7}, Lv71/h;->q(Landroidx/compose/ui/Modifier;Lv71/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v10, v10, v9, v5, v8}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto :goto_3

    :cond_6
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_7

    new-instance v0, Lzc1/w0;

    const/16 v1, 0x18

    invoke-direct {v0, p1, v1}, Lzc1/w0;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final d(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/f2;->c(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;ZLjava/util/List;)Lh31/q;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lm91/u;",
            "Z",
            "Ljava/util/List<",
            "+",
            "Lm91/u;",
            ">;)",
            "Lh31/q;"
        }
    .end annotation

    new-instance v0, Lh31/q;

    sget-object v2, Lh31/n;->UNCOMMITTED:Lh31/n;

    new-instance v11, Luy0/b;

    const-string v1, "-emoji"

    move-object/from16 v9, p0

    invoke-static {v9, v1}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v1, 0x6

    int-to-float v1, v1

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float v6, v1, v3

    const/high16 v7, 0x41a20000    # 20.25f

    const/4 v8, 0x0

    move-object/from16 v5, p2

    move-object v3, v11

    invoke-direct/range {v3 .. v8}, Luy0/b;-><init>(Ljava/lang/String;Ljava/lang/String;FFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Li31/g;

    const/16 v15, 0x61c

    const/16 v16, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v5, p1

    move-object/from16 v10, p3

    move/from16 v12, p4

    move-object/from16 v9, p5

    invoke-direct/range {v3 .. v16}, Li31/g;-><init>(Ljava/lang/String;Ljava/lang/String;Lb91/c;Lm91/u;Lkd1/o;Ljava/util/List;Lm91/u;Lm91/u;ZZLcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v9, 0x98

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object/from16 v1, p0

    move/from16 v7, p4

    invoke-direct/range {v0 .. v10}, Lh31/q;-><init>(Ljava/lang/String;Lh31/n;Lm91/u;Ljava/util/List;Lm91/u;ZZLh31/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static synthetic g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;ZLjava/util/List;ILjava/lang/Object;)Lh31/q;
    .locals 6

    and-int/lit8 p7, p6, 0x10

    if-eqz p7, :cond_0

    const/4 p4, 0x0

    :cond_0
    move v4, p4

    and-int/lit8 p4, p6, 0x20

    if-eqz p4, :cond_1

    sget-object p5, Lm83/y;->w:Lm83/y;

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    invoke-static/range {v0 .. v5}, Lzc1/f2;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;ZLjava/util/List;)Lh31/q;

    move-result-object p0

    return-object p0
.end method

.method public static final h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ll83/k;",
            ">;"
        }
    .end annotation

    sget-object v0, Lzc1/f2;->b:Ljava/util/List;

    return-object v0
.end method
