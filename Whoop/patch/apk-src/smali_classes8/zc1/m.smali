.class public abstract Lzc1/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\",\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00038\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Ll83/a0;",
        "c",
        "(Landroidx/compose/runtime/Composer;I)V",
        "",
        "Ll83/k;",
        "",
        "Lc41/m0;",
        "a",
        "Ljava/util/List;",
        "getAlertTileStates",
        "()Ljava/util/List;",
        "AlertTileStates",
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
.field private static final a:Ljava/util/List;
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
    .locals 29

    new-instance v0, Lc41/m0;

    const-string v10, "Title"

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const-string v11, "Subtitle"

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    new-instance v3, Lc41/n0$a;

    const/4 v12, 0x0

    const/4 v13, 0x1

    invoke-direct {v3, v12, v13, v12}, Lc41/n0$a;-><init>(Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v18, Lkd1/l;->CARD_EXPIRED:Lkd1/l;

    const/16 v8, 0x70

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v4, v18

    invoke-direct/range {v0 .. v9}, Lc41/m0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc41/n0;Lkd1/l;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Ll83/k;

    const-string v2, "Error with subtitle"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v19, Lc41/m0;

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    new-instance v0, Lc41/n0$a;

    sget-object v2, Ly81/f;->BRAND_WHITE:Ly81/f;

    invoke-direct {v0, v2}, Lc41/n0$a;-><init>(Ly81/f;)V

    sget-object v23, Lkd1/l;->CRITICAL_OUTAGE:Lkd1/l;

    const/16 v27, 0x70

    const/16 v28, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object/from16 v22, v0

    invoke-direct/range {v19 .. v28}, Lc41/m0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc41/n0;Lkd1/l;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v19

    new-instance v3, Ll83/k;

    const-string v4, "Error with subtitle and setting the title color"

    invoke-direct {v3, v4, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v14, Lc41/m0;

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    new-instance v0, Lc41/n0$a;

    invoke-direct {v0, v12, v13, v12}, Lc41/n0$a;-><init>(Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v22, 0x72

    const/16 v23, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v17, v0

    invoke-direct/range {v14 .. v23}, Lc41/m0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc41/n0;Lkd1/l;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v3

    new-instance v3, Ll83/k;

    const-string v4, "Error with no subtitle"

    invoke-direct {v3, v4, v14}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v14, Lc41/m0;

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    new-instance v4, Lc41/n0$e;

    invoke-direct {v4, v12, v13, v12}, Lc41/n0$e;-><init>(Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v22, 0x70

    move-object/from16 v17, v4

    invoke-direct/range {v14 .. v23}, Lc41/m0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc41/n0;Lkd1/l;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Ll83/k;

    const-string v5, "Warning with subtitle"

    invoke-direct {v4, v5, v14}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v19, Lc41/m0;

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    new-instance v5, Lc41/n0$e;

    invoke-direct {v5, v2}, Lc41/n0$e;-><init>(Ly81/f;)V

    sget-object v23, Lkd1/l;->MAJOR_OUTAGE:Lkd1/l;

    move-object/from16 v22, v5

    invoke-direct/range {v19 .. v28}, Lc41/m0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc41/n0;Lkd1/l;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v19

    new-instance v5, Ll83/k;

    const-string v6, "Warning with subtitle and setting the title color"

    invoke-direct {v5, v6, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v14, Lc41/m0;

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    new-instance v2, Lc41/n0$e;

    invoke-direct {v2, v12, v13, v12}, Lc41/n0$e;-><init>(Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v22, 0x72

    const/16 v23, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v17, v2

    invoke-direct/range {v14 .. v23}, Lc41/m0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc41/n0;Lkd1/l;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Ll83/k;

    const-string v2, "Warning with no subtitle"

    invoke-direct {v6, v2, v14}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v15, Lc41/m0;

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    sget-object v18, Lc41/n0$c;->d:Lc41/n0$c;

    sget-object v19, Lkd1/l;->MAINTENANCE:Lkd1/l;

    const/16 v23, 0x70

    const/16 v22, 0x0

    invoke-direct/range {v15 .. v24}, Lc41/m0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc41/n0;Lkd1/l;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Ll83/k;

    const-string v2, "Maintenance alert"

    invoke-direct {v7, v2, v15}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v16, Lc41/m0;

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    new-instance v2, Lc41/n0$a;

    invoke-direct {v2, v12, v13, v12}, Lc41/n0$a;-><init>(Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v20, Lkd1/l;->UNKNOWN:Lkd1/l;

    const/16 v24, 0x70

    const/16 v23, 0x0

    move-object/from16 v19, v2

    invoke-direct/range {v16 .. v25}, Lc41/m0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc41/n0;Lkd1/l;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v16

    new-instance v8, Ll83/k;

    const-string v9, "Unknown alert "

    invoke-direct {v8, v9, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v2, v0

    filled-new-array/range {v1 .. v8}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lzc1/m;->a:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/m;->e(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/m;->d(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/runtime/Composer;I)V
    .locals 10

    check-cast p0, Lp1/q;

    const v0, 0x3f020c7c

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    and-int/lit8 v3, p1, 0x1

    invoke-virtual {p0, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_6

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Ll0/m;->c:Ll0/g;

    sget-object v5, Lb2/e;->M:Lb2/k;

    invoke-static {v4, v5, p0, v0}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v5, p0, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {p0}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {p0, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {p0}, Lp1/q;->i0()V

    iget-boolean v8, p0, Lp1/q;->S:Z

    if-eqz v8, :cond_1

    invoke-virtual {p0, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->s0()V

    :goto_1
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {p0, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {p0, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, p0, Lp1/q;->S:Z

    if-nez v6, :cond_2

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    :cond_2
    invoke-static {v5, p0, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {p0, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, 0x6df1e771

    invoke-virtual {p0, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lzc1/m;->a:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll83/k;

    iget-object v5, v4, Ll83/k;->w:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    invoke-static {v5, p0, v0}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v5, 0x2

    int-to-float v5, v5

    const/4 v6, 0x4

    int-to-float v6, v6

    mul-float/2addr v5, v6

    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {p0, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v5, Lc41/h0;

    invoke-direct {v5}, Lc41/h0;-><init>()V

    iget-object v4, v4, Ll83/k;->x:Ljava/lang/Object;

    check-cast v4, Lm91/u;

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v7, v8, :cond_4

    new-instance v7, Lz72/f;

    const/16 v8, 0x9

    invoke-direct {v7, v8}, Lz72/f;-><init>(I)V

    invoke-virtual {p0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v7, Lkotlin/jvm/functions/Function1;

    sget v8, Lc41/m0;->h:I

    or-int/lit8 v8, v8, 0x30

    sget v9, Lc41/h0;->a:I

    shl-int/lit8 v9, v9, 0x6

    or-int/2addr v8, v9

    invoke-virtual {v5, v4, v7, p0, v8}, Lc41/h0;->Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v6, v6, v3, p0}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    goto :goto_2

    :cond_5
    invoke-virtual {p0, v0}, Lp1/q;->q(Z)V

    invoke-virtual {p0, v1}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_6
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_7

    new-instance v0, Lzc1/j;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, Lzc1/j;-><init>(II)V

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

    invoke-static {p1, p0}, Lzc1/m;->c(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
