.class public final Le51/l$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le51/l;->v(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/m;"
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/runtime/Composer;I)V
    .locals 37

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v8, p1

    check-cast v8, Lp1/q;

    invoke-virtual {v8, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, 0x7fe0a15e

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    new-instance v4, Le51/n;

    new-instance v9, Le51/p;

    const/4 v13, 0x4

    const/4 v14, 0x0

    const/4 v12, 0x0

    const-string v10, "Suggested"

    const-string v11, "suggested"

    invoke-direct/range {v9 .. v14}, Le51/p;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v10, Le51/p;

    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v13, 0x0

    const-string v11, "Physical Symptoms"

    const-string v12, "physical_symptoms"

    invoke-direct/range {v10 .. v15}, Le51/p;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v11, Le51/p;

    const/4 v15, 0x4

    const/16 v16, 0x0

    const/4 v14, 0x0

    const-string v12, "Flow"

    const-string v13, "flow"

    invoke-direct/range {v11 .. v16}, Le51/p;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v12, Le51/p;

    const/16 v16, 0x4

    const/16 v17, 0x0

    const/4 v15, 0x0

    const-string v13, "Cervical Mucus"

    const-string v14, "cervical_mucus"

    invoke-direct/range {v12 .. v17}, Le51/p;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v9, v10, v11, v12}, [Le51/p;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    new-instance v11, Le51/e;

    const-string v0, "Suggested Symptoms"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    new-instance v13, Ln01/e;

    new-instance v14, Lry0/d;

    sget-object v18, Lgz0/m0;->BLOOD_OXYGEN:Lgz0/m0;

    sget-object v21, Lry0/c;->MCI_FLOW:Lry0/c;

    const/16 v30, 0x7f30

    const/16 v31, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const-string v15, "preview-multi1"

    const-string v16, "Multi Option 1"

    const-string v17, "Can select multiple"

    invoke-direct/range {v14 .. v31}, Lry0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;ZLry0/c;ZZLjava/lang/Object;Ljava/lang/Object;ZZLy3/f;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v14}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    const/16 v21, 0x74

    const/16 v22, 0x0

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/16 v18, 0x0

    const-string v14, "multi-select"

    invoke-direct/range {v13 .. v22}, Ln01/e;-><init>(Ljava/lang/String;IILjava/util/List;Ljava/util/Set;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v13}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    sget-object v15, Le51/d;->NORMAL:Le51/d;

    const/16 v20, 0xf0

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-string v13, "suggested"

    invoke-direct/range {v11 .. v21}, Le51/e;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Le51/d;Lb91/c;Lp31/p$a;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v16, Le51/e;

    const-string v0, "Physical Symptoms"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    new-instance v18, Lry0/d;

    sget-object v22, Lgz0/m0;->ACTIVITY:Lgz0/m0;

    sget-object v25, Lry0/c;->CERVICAL_MUCUS:Lry0/c;

    const/16 v34, 0x7fb0

    const/16 v35, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const-string v19, "preview-multi2"

    const-string v20, "Multi Option 2"

    const-string v21, "Up to 3 selections"

    invoke-direct/range {v18 .. v35}, Lry0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;ZLry0/c;ZZLjava/lang/Object;Ljava/lang/Object;ZZLy3/f;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v25

    invoke-static/range {v18 .. v18}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v19

    sget-object v20, Le51/d;->COMPACT:Le51/d;

    const/16 v25, 0xf0

    const/16 v26, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-string v18, "physical_symptoms"

    invoke-direct/range {v16 .. v26}, Le51/e;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Le51/d;Lb91/c;Lp31/p$a;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v5, v15

    move-object/from16 v3, v16

    new-instance v15, Le51/e;

    const-string v6, "Flow Tracking"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    new-instance v19, Lry0/d;

    const/16 v35, 0x7fb0

    const/16 v36, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v34, 0x0

    const-string v20, "preview-multi2"

    const-string v21, "Multi Option 2"

    const-string v22, "Up to 3 selections"

    move-object/from16 v23, v0

    move-object/from16 v26, v1

    invoke-direct/range {v19 .. v36}, Lry0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;ZLry0/c;ZZLjava/lang/Object;Ljava/lang/Object;ZZLy3/f;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v19 .. v19}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v18

    const/16 v24, 0xf0

    const/16 v25, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-string v17, "flow"

    move-object/from16 v19, v5

    invoke-direct/range {v15 .. v25}, Le51/e;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Le51/d;Lb91/c;Lp31/p$a;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v11, v3, v15}, [Le51/e;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    const/16 v15, 0x18

    const/16 v16, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-string v12, "suggested"

    move-object v9, v4

    invoke-direct/range {v9 .. v16}, Le51/n;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Le51/m;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v9, 0x0

    const/16 v10, 0x1d

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v10}, Le51/l;->i(Landroidx/compose/ui/Modifier;Le51/n;Ll0/k1;Ln0/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    return-void

    :cond_1
    invoke-virtual {v8}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Le51/l$h;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
