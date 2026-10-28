.class public abstract Lb01/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\"\u0017\u0010\u0011\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\"\u0017\u0010\u0017\u001a\u00020\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\"\u0017\u0010\u001c\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lb01/i;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "f",
        "(Landroidx/compose/ui/Modifier;Lb01/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "k",
        "(Landroidx/compose/runtime/Composer;I)V",
        "Lny0/h;",
        "a",
        "Lny0/h;",
        "getFakeCardButtonState",
        "()Lny0/h;",
        "fakeCardButtonState",
        "Lb01/d;",
        "b",
        "Lb01/d;",
        "getFakeCta",
        "()Lb01/d;",
        "fakeCta",
        "c",
        "Lb01/i;",
        "m",
        "()Lb01/i;",
        "fakeSanguineWaitlistBiomarkerListPreviewViewState",
        "design_release"
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
.field private static final a:Lny0/h;

.field private static final b:Lb01/d;

.field private static final c:Lb01/i;


# direct methods
.method static constructor <clinit>()V
    .locals 29

    const-string v0, "SEE ALL BIOMARKERS"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget-object v12, Lny0/g;->STANDARD:Lny0/g;

    sget-object v8, Lny0/p;->HIGHLIGHT:Lny0/p;

    new-instance v9, Lcom/whoop/navigation/e;

    const/16 v17, 0x7

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v13, v9

    invoke-direct/range {v13 .. v18}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lny0/h;

    const v27, 0x1ff9b0c

    const/16 v28, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x1

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

    invoke-direct/range {v1 .. v28}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lb01/h;->a:Lny0/h;

    new-instance v2, Lb01/d;

    new-instance v3, Lcom/whoop/navigation/e;

    const/4 v7, 0x7

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v2, v0, v3}, Lb01/d;-><init>(Ljava/lang/String;Lcom/whoop/navigation/e;)V

    sput-object v2, Lb01/h;->b:Lb01/d;

    new-instance v0, Lb01/i;

    new-instance v3, Lb01/q;

    new-instance v4, Lb01/c;

    const/16 v9, 0xc

    const-string v5, "id0"

    const-string v6, "Alkaline Phosphatase (ALP)"

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v10}, Lb01/c;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lb01/c;

    const/16 v10, 0xc

    const-string v6, "id1"

    const-string v7, "Alanine Aminotransferase (ALT)"

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lb01/c;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lb01/c;

    const/16 v11, 0xc

    const/4 v12, 0x0

    const-string v7, "id2"

    const-string v8, "Albumin"

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lb01/c;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Lb01/c;

    const/16 v12, 0xc

    const-string v8, "id3"

    const-string v9, "Albumin/Globulin Ratio"

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v13}, Lb01/c;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Lb01/c;

    const/16 v13, 0xc

    const-string v9, "id4"

    const-string v10, "Apolipoprotein B (ApoB)"

    const/4 v12, 0x0

    invoke-direct/range {v8 .. v14}, Lb01/c;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Lb01/c;

    const/16 v14, 0xc

    const/4 v15, 0x0

    const-string v10, "id5"

    const-string v11, "Aspartate Aminotransferase (AST)"

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v15}, Lb01/c;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v10, Lb01/c;

    const/16 v15, 0xc

    const/16 v16, 0x0

    const-string v11, "id6"

    const-string v12, "Basophil %"

    const/4 v14, 0x0

    invoke-direct/range {v10 .. v16}, Lb01/c;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v11, Lb01/c;

    const/16 v16, 0xc

    const-string v12, "id7"

    const-string v13, "Basophils"

    const/4 v15, 0x0

    invoke-direct/range {v11 .. v17}, Lb01/c;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array/range {v4 .. v11}, [Lb01/c;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const-string v5, ""

    const-string v6, "Search biomarkers"

    invoke-direct {v3, v5, v6, v4}, Lb01/q;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    invoke-direct {v0, v3, v2, v1}, Lb01/i;-><init>(Lb01/q;Lb01/d;Lny0/h;)V

    sput-object v0, Lb01/h;->c:Lb01/i;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lb01/i;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lb01/h;->i(Lkotlin/jvm/functions/Function1;Lb01/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lb01/h;->l(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lb01/h;->g(Lk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Lb01/i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lb01/h;->j(Landroidx/compose/ui/Modifier;Lb01/i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Lb01/i;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lb01/h;->h(Lkotlin/jvm/functions/Function1;Lb01/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Landroidx/compose/ui/Modifier;Lb01/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lb01/i;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v0, p4

    const-string v1, "viewState"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onViewEvent"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v1, -0x24550579

    invoke-virtual {v10, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p5, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v4, v0, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v0, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v10, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v0

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v5, v0

    :goto_1
    and-int/lit8 v6, v0, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_4
    and-int/lit16 v6, v0, 0x180

    if-nez v6, :cond_6

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x100

    goto :goto_3

    :cond_5
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v5, v6

    :cond_6
    move v15, v5

    and-int/lit16 v5, v15, 0x93

    const/16 v6, 0x92

    const/4 v7, 0x0

    if-eq v5, v6, :cond_7

    const/4 v5, 0x1

    goto :goto_4

    :cond_7
    move v5, v7

    :goto_4
    and-int/lit8 v6, v15, 0x1

    invoke-virtual {v10, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_17

    sget-object v5, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_8

    move-object v1, v5

    goto :goto_5

    :cond_8
    move-object v1, v4

    :goto_5
    sget-object v4, Ll0/m;->c:Ll0/g;

    sget-object v6, Lb2/e;->M:Lb2/k;

    invoke-static {v4, v6, v10, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v10, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-eqz v8, :cond_9

    invoke-virtual {v10, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_6
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v10, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v10, v4, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-nez v13, :cond_a

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_b

    :cond_a
    invoke-static {v6, v10, v6, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v10, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const-string v14, "SanguineWaitlistBiomarkerListPreview"

    invoke-static {v11, v14}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v14, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {v14}, Lkd1/w;->a()Lk91/a;

    move-result-object v14

    invoke-virtual {v14}, Lk91/a;->c()Lt0/i;

    move-result-object v14

    invoke-static {v11, v14}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v14, Lb2/e;->w:Lb2/m;

    invoke-static {v14, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v14

    move-object/from16 p0, v8

    iget-wide v7, v10, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v10, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-eqz v13, :cond_c

    invoke-virtual {v10, v12}, Lp1/q;->l(Lc93/a;)V

    :goto_7
    move-object/from16 v12, p0

    goto :goto_8

    :cond_c
    invoke-virtual {v10}, Lp1/q;->s0()V

    goto :goto_7

    :goto_8
    invoke-static {v10, v12, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v10, Lp1/q;->S:Z

    if-nez v4, :cond_d

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_e

    :cond_d
    invoke-static {v7, v10, v7, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    invoke-static {v10, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lb01/i;->f()Lb01/q;

    move-result-object v4

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-ne v6, v13, :cond_f

    new-instance v6, Lb01/f;

    const/4 v7, 0x0

    invoke-direct {v6, v7}, Lb01/f;-><init>(I)V

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {v5, v6}, Landroidx/compose/ui/draw/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v11, 0x6c00

    const/16 v12, 0x22

    move-object v7, v5

    const/4 v5, 0x0

    move-object v8, v7

    const/4 v7, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    move-object v14, v9

    const/4 v9, 0x0

    const/4 v0, 0x1

    invoke-static/range {v4 .. v12}, Lb01/p;->s(Lb01/q;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object v4, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v4, v14}, Landroidx/compose/foundation/layout/b;->b(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v23

    and-int/lit16 v4, v15, 0x380

    const/16 v5, 0x100

    if-ne v4, v5, :cond_10

    move v7, v0

    goto :goto_9

    :cond_10
    const/4 v7, 0x0

    :goto_9
    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v5, v7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_11

    if-ne v6, v13, :cond_12

    :cond_11
    new-instance v6, Lb01/g;

    const/4 v5, 0x0

    invoke-direct {v6, v3, v2, v5}, Lb01/g;-><init>(Lkotlin/jvm/functions/Function1;Lb01/i;I)V

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    move-object/from16 v27, v6

    check-cast v27, Lc93/a;

    const/16 v28, 0xf

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-static/range {v23 .. v28}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v5, v10, v6}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v2}, Lb01/i;->e()Lb01/d;

    move-result-object v5

    invoke-virtual {v5}, Lb01/d;->b()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const/4 v7, 0x2

    int-to-float v7, v7

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float v18, v7, v8

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v14

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v9, 0x100

    if-ne v4, v9, :cond_13

    move v9, v0

    goto :goto_a

    :cond_13
    move v9, v6

    :goto_a
    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v9, v11

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v9, :cond_14

    if-ne v11, v13, :cond_15

    :cond_14
    new-instance v11, Lb01/g;

    const/4 v9, 0x1

    invoke-direct {v11, v3, v2, v9}, Lb01/g;-><init>(Lkotlin/jvm/functions/Function1;Lb01/i;I)V

    invoke-virtual {v10, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v11, Lc93/a;

    const/16 v17, 0x0

    const/16 v18, 0x3fa

    move v9, v6

    move-object v6, v5

    const/4 v5, 0x0

    move v12, v4

    move-object v4, v7

    const/4 v7, 0x0

    move v13, v8

    const/4 v8, 0x0

    move v15, v9

    const/4 v9, 0x0

    move/from16 v16, v15

    move-object v15, v10

    const/4 v10, 0x0

    move-object/from16 v19, v14

    move-object v14, v11

    const/4 v11, 0x0

    move/from16 v20, v12

    const/4 v12, 0x0

    move/from16 v21, v13

    const/4 v13, 0x0

    move/from16 v22, v16

    const/16 v16, 0x6

    move-object/from16 v0, v19

    move-object/from16 v19, v1

    move-object v1, v0

    move/from16 v0, v22

    invoke-static/range {v4 .. v18}, Lny0/o0;->b(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lb91/a;Lg1/u0;Lf0/t;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;ZLl0/k1;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object v10, v15

    invoke-virtual {v2}, Lb01/i;->c()Lny0/h;

    move-result-object v5

    if-nez v5, :cond_16

    const v1, -0x9b414c2

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_b
    const/4 v0, 0x1

    goto :goto_c

    :cond_16
    const v4, -0x9b414c1

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    new-instance v3, Lny0/d;

    invoke-direct {v3}, Lny0/d;-><init>()V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/4 v1, 0x1

    int-to-float v4, v1

    mul-float v13, v4, v21

    const/4 v15, 0x0

    const/16 v16, 0xd

    const/4 v12, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    or-int/lit8 v8, v20, 0x6

    move-object/from16 v6, p2

    move-object v7, v10

    invoke-virtual/range {v3 .. v8}, Lny0/d;->e(Landroidx/compose/ui/Modifier;Lny0/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_b

    :goto_c
    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    move-object/from16 v1, v19

    goto :goto_d

    :cond_17
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v1, v4

    :goto_d
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_18

    new-instance v0, La01/e;

    const/16 v6, 0xc

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, La01/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method private static final g(Lk2/c;)Ll83/a0;
    .locals 13

    const-string v1, "$this$drawWithContent"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p0

    check-cast v1, La3/p0;

    invoke-virtual {v1}, La3/p0;->a()V

    iget-object v1, v1, La3/p0;->w:Lk2/b;

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v2

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    const v3, 0x3f19999a    # 0.6f

    mul-float/2addr v2, v3

    sget-object v3, Li2/t;->b:Li2/s;

    sget-wide v6, Li2/x;->b:J

    new-instance v8, Li2/x;

    invoke-direct {v8, v6, v7}, Li2/x;-><init>(J)V

    sget-wide v6, Li2/x;->m:J

    new-instance v9, Li2/x;

    invoke-direct {v9, v6, v7}, Li2/x;-><init>(J)V

    filled-new-array {v8, v9}, [Li2/x;

    move-result-object v6

    invoke-static {v6}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v7

    and-long/2addr v7, v4

    long-to-int v7, v7

    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    sub-float/2addr v7, v2

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v8

    and-long/2addr v8, v4

    long-to-int v8, v8

    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    const/16 v9, 0x8

    invoke-static {v3, v6, v7, v8, v9}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v3

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v6

    const/16 v8, 0x20

    shr-long/2addr v6, v8

    long-to-int v6, v6

    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    int-to-long v6, v6

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v9

    int-to-long v9, v9

    shl-long/2addr v6, v8

    and-long/2addr v9, v4

    or-long/2addr v6, v9

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v9

    and-long/2addr v9, v4

    long-to-int v1, v9

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    sub-float/2addr v1, v2

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v9, v2

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    shl-long v8, v9, v8

    and-long/2addr v1, v4

    or-long/2addr v1, v8

    move-wide v4, v6

    const/4 v7, 0x0

    const/16 v9, 0x38

    const/4 v6, 0x0

    const/4 v8, 0x6

    move-wide v11, v1

    move-object v1, v3

    move-wide v2, v11

    move-object v0, p0

    invoke-static/range {v0 .. v9}, Lk2/e;->u(Lk2/e;Li2/t;JJFLk2/f;II)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;Lb01/i;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lb01/i;->e()Lb01/d;

    move-result-object p1

    invoke-virtual {p1}, Lb01/d;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lkotlin/jvm/functions/Function1;Lb01/i;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lb01/i;->e()Lb01/d;

    move-result-object p1

    invoke-virtual {p1}, Lb01/d;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Landroidx/compose/ui/Modifier;Lb01/i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lb01/h;->f(Landroidx/compose/ui/Modifier;Lb01/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final k(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, -0x585c8ed9

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-static {v2, v1, v0}, Lc13/a;->p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v2, v1, v0}, Lc13/a;->z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lfy1/i;->a:Lfy1/i;

    invoke-static {v1, v2, v0}, Lc13/a;->q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Ldp0/i;->a:Ldp0/i;

    invoke-virtual {v1, v2}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    sget-object v1, Lb3/v1;->l:Lp1/u2;

    iget-object v2, v0, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-static {v1, v0, v2}, Lc13/a;->g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I

    move-result v0

    new-array v0, v0, [Lp1/u1;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp1/u1;

    new-instance v1, Lb01/h$a;

    invoke-direct {v1}, Lb01/h$a;-><init>()V

    const v2, -0x124c2861

    invoke-static {v2, p0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p0, v2}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, La11/h;

    const/16 v1, 0x13

    invoke-direct {v0, p1, v1}, La11/h;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final l(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lb01/h;->k(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final m()Lb01/i;
    .locals 1

    sget-object v0, Lb01/h;->c:Lb01/i;

    return-object v0
.end method
