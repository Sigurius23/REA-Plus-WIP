.class public final Lxz0/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxz0/e;->A(Landroidx/compose/runtime/Composer;I)V
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
    .locals 53

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/lit8 v4, p2, 0x1

    move-object/from16 v8, p1

    check-cast v8, Lp1/q;

    invoke-virtual {v8, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    const v0, 0x35349951

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    const/4 v0, 0x3

    int-to-float v0, v0

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v0, v4

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v3, v3

    mul-float/2addr v3, v4

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v4, Lb2/e;->M:Lb2/k;

    const/4 v5, 0x6

    invoke-static {v3, v4, v8, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, v8, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v8, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {v8, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v8, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v8, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v8, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v4, v8, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v8, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v9, Lhy0/h1;

    const-string v0, "Upcoming"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    const v32, 0x3ffffe

    const/16 v33, 0x0

    const/4 v11, 0x0

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

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-direct/range {v9 .. v33}, Lhy0/h1;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/e;Li91/d;Ly81/e;Li2/t;Li2/t;Lhy0/o1;ZLi2/a1;FFFLy71/g;FLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lhy0/c1;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lxz0/a;

    const-string v4, "Sep"

    const-string v5, "16"

    invoke-direct {v3, v4, v5}, Lxz0/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v10, Lxz0/b;

    sget-object v11, Lgz0/m0;->CROSS:Lgz0/m0;

    const/16 v15, 0xe

    const/4 v14, 0x0

    invoke-direct/range {v10 .. v16}, Lxz0/b;-><init>(Lgz0/m0;Ljava/lang/Object;Lcom/whoop/whoopaction/domain/models/Action;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v23, v11

    new-instance v6, Lxz0/f;

    const/16 v21, 0x6d1

    const/16 v22, 0x0

    move-object v11, v10

    const/4 v10, 0x0

    const/4 v14, 0x0

    const/16 v20, 0x0

    const-string v13, "Today, 8:00 - 8:30 AM EST"

    const-string v15, "Dr. Drake Ramoray, MD, MPH"

    move-object/from16 v18, v3

    move-object v12, v9

    move-object v9, v6

    invoke-direct/range {v9 .. v22}, Lxz0/f;-><init>(Ljava/lang/String;Lxz0/b;Lhy0/h1;Ljava/lang/String;Lkd1/o;Ljava/lang/String;Lkd1/o;Lxz0/c;Lxz0/a;Ljava/util/List;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v9, 0x0

    const/4 v10, 0x5

    move-object v3, v5

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lxz0/e;->m(Landroidx/compose/ui/Modifier;Lxz0/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    new-instance v24, Lhy0/h1;

    const-string v5, "Request Confirmed"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v25

    const v47, 0x3ffffe

    const/16 v48, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    invoke-direct/range {v24 .. v48}, Lhy0/h1;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/e;Li91/d;Ly81/e;Li2/t;Li2/t;Lhy0/o1;ZLi2/a1;FFFLy71/g;FLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lhy0/c1;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Lxz0/b;

    sget-object v10, Lgz0/m0;->DOT_MENU:Lgz0/m0;

    const/16 v14, 0xe

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v15}, Lxz0/b;-><init>(Lgz0/m0;Ljava/lang/Object;Lcom/whoop/whoopaction/domain/models/Action;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lxz0/f;

    const/16 v21, 0x7d0

    const/4 v14, 0x0

    const/16 v18, 0x0

    const-string v10, "UPCOMING CLINICIAN VIDEO CALL"

    const-string v13, "On-demand consultation"

    const-string v15, "Your clinician will be joining shortly."

    move-object v11, v9

    move-object/from16 v12, v24

    move-object v9, v6

    invoke-direct/range {v9 .. v22}, Lxz0/f;-><init>(Ljava/lang/String;Lxz0/b;Lhy0/h1;Ljava/lang/String;Lkd1/o;Ljava/lang/String;Lkd1/o;Lxz0/c;Lxz0/a;Ljava/util/List;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v9, 0x0

    const/4 v10, 0x5

    const/4 v5, 0x0

    invoke-static/range {v5 .. v10}, Lxz0/e;->m(Landroidx/compose/ui/Modifier;Lxz0/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    new-instance v24, Lhy0/h1;

    const-string v5, "Available Now"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v25

    invoke-direct/range {v24 .. v48}, Lhy0/h1;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/e;Li91/d;Ly81/e;Li2/t;Li2/t;Lhy0/o1;ZLi2/a1;FFFLy71/g;FLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lhy0/c1;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lkd1/o$a;

    sget v6, Lgy0/a;->y:I

    invoke-direct {v5, v6}, Lkd1/o$a;-><init>(I)V

    new-instance v14, Lkd1/o$a;

    sget v6, Lvu1/c;->n:I

    invoke-direct {v14, v6}, Lkd1/o$a;-><init>(I)V

    new-instance v6, Lxz0/f;

    const/16 v21, 0x783

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-string v13, "Video consultation"

    const-string v15, "Dr. April Kepner, MD"

    move-object/from16 v16, v5

    move-object v9, v6

    move-object/from16 v12, v24

    invoke-direct/range {v9 .. v22}, Lxz0/f;-><init>(Ljava/lang/String;Lxz0/b;Lhy0/h1;Ljava/lang/String;Lkd1/o;Ljava/lang/String;Lkd1/o;Lxz0/c;Lxz0/a;Ljava/util/List;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v9, 0x0

    const/4 v10, 0x5

    const/4 v5, 0x0

    invoke-static/range {v5 .. v10}, Lxz0/e;->m(Landroidx/compose/ui/Modifier;Lxz0/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    new-instance v6, Lxz0/f;

    new-instance v24, Lhy0/h1;

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v25

    invoke-direct/range {v24 .. v48}, Lhy0/h1;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/e;Li91/d;Ly81/e;Li2/t;Li2/t;Lhy0/o1;ZLi2/a1;FFFLy71/g;FLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lhy0/c1;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v14, Lkd1/o$a;

    sget v0, Lvu1/c;->n:I

    invoke-direct {v14, v0}, Lkd1/o$a;-><init>(I)V

    new-instance v0, Lxz0/a;

    const-string v5, "Oct"

    const-string v7, "22"

    invoke-direct {v0, v5, v7}, Lxz0/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "Join Call"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v26

    sget-object v32, Lny0/p;->HIGHLIGHT:Lny0/p;

    new-instance v25, Lny0/h;

    const v51, 0x1ff9fbe

    const/16 v52, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x1

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v47, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    invoke-direct/range {v25 .. v52}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v5, v25

    new-instance v25, Lny0/h;

    const-string v7, "Reschedule"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v26

    const v51, 0x1ff9ffe

    const/16 v32, 0x0

    invoke-direct/range {v25 .. v52}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v7, v25

    filled-new-array {v5, v7}, [Lny0/h;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v19

    const/16 v21, 0x4c3

    const/4 v10, 0x0

    const/16 v16, 0x0

    const-string v13, "Wed, 2:00 - 2:30 PM EST"

    const-string v15, "Dr. Meredith Grey, MD"

    move-object/from16 v18, v0

    move-object v9, v6

    move-object/from16 v12, v24

    invoke-direct/range {v9 .. v22}, Lxz0/f;-><init>(Ljava/lang/String;Lxz0/b;Lhy0/h1;Ljava/lang/String;Lkd1/o;Ljava/lang/String;Lkd1/o;Lxz0/c;Lxz0/a;Ljava/util/List;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v9, 0x0

    const/4 v10, 0x5

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lxz0/e;->m(Landroidx/compose/ui/Modifier;Lxz0/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    new-instance v0, Lxz0/a;

    invoke-direct {v0, v4, v3}, Lxz0/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v11, Lxz0/b;

    const/16 v16, 0xe

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v12, v23

    invoke-direct/range {v11 .. v17}, Lxz0/b;-><init>(Lgz0/m0;Ljava/lang/Object;Lcom/whoop/whoopaction/domain/models/Action;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lxz0/f;

    const/16 v21, 0x6d1

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    const-string v13, "Today, 8:00 - 8:30 AM EST"

    const-string v15, "Dr. Drake Ramoray, MD, MPH"

    move-object/from16 v18, v0

    move-object v9, v6

    invoke-direct/range {v9 .. v22}, Lxz0/f;-><init>(Ljava/lang/String;Lxz0/b;Lhy0/h1;Ljava/lang/String;Lkd1/o;Ljava/lang/String;Lkd1/o;Lxz0/c;Lxz0/a;Ljava/util/List;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v9, 0x0

    const/4 v10, 0x5

    invoke-static/range {v5 .. v10}, Lxz0/e;->m(Landroidx/compose/ui/Modifier;Lxz0/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    return-void

    :cond_4
    invoke-virtual {v8}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lxz0/e$a;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
