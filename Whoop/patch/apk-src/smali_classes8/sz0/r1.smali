.class public abstract Lsz0/r1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0006\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u001d\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a5\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0015H\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a5\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00182\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\"\u001d\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lsz0/s1;",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "m",
        "(Landroidx/compose/ui/Modifier;Lsz0/s1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Li2/x;",
        "color",
        "",
        "opacity",
        "v",
        "(JF)J",
        "Lcom/whoop/design/util/TextResource;",
        "value",
        "units",
        "",
        "editable",
        "Lkotlin/Function0;",
        "j",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLc93/a;Landroidx/compose/runtime/Composer;I)V",
        "Lsz0/t1;",
        "r",
        "(Landroidx/compose/ui/Modifier;Lsz0/t1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "a",
        "Ljava/util/List;",
        "w",
        "()Ljava/util/List;",
        "zoneRowsSample",
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
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lsz0/s1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 26

    const-string v0, "Zone 5"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget-object v4, Ly81/f;->STRAIN_ZONE_5:Ly81/f;

    new-instance v8, Lsz0/u1;

    const-string v0, "174"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    const/16 v1, 0xae

    const/4 v12, 0x1

    invoke-direct {v8, v1, v0, v12}, Lsz0/u1;-><init>(ILcom/whoop/design/util/TextResource;Z)V

    new-instance v9, Lsz0/u1;

    const-string v0, "192"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0xc0

    invoke-direct {v9, v2, v0, v1}, Lsz0/u1;-><init>(ILcom/whoop/design/util/TextResource;Z)V

    const-string v0, "bpm"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v1, Lsz0/s1;

    const/16 v10, 0x30

    const/4 v11, 0x0

    const-string v2, "ZONE_5"

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v11}, Lsz0/s1;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;FLsz0/u1;Lsz0/u1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v2, "Zone 4"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    sget-object v16, Ly81/f;->STRAIN_ZONE_4:Ly81/f;

    new-instance v2, Lsz0/u1;

    const-string v3, "155"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const/16 v4, 0x9b

    invoke-direct {v2, v4, v3, v12}, Lsz0/u1;-><init>(ILcom/whoop/design/util/TextResource;Z)V

    new-instance v3, Lsz0/u1;

    const-string v4, "173"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const/16 v5, 0xad

    invoke-direct {v3, v5, v4, v12}, Lsz0/u1;-><init>(ILcom/whoop/design/util/TextResource;Z)V

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    new-instance v13, Lsz0/s1;

    const/16 v22, 0x30

    const/16 v23, 0x0

    const-string v14, "ZONE_4"

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v20, v2

    move-object/from16 v21, v3

    invoke-direct/range {v13 .. v23}, Lsz0/s1;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;FLsz0/u1;Lsz0/u1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v2, "Zone 3"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    sget-object v17, Ly81/f;->STRAIN_ZONE_3:Ly81/f;

    new-instance v2, Lsz0/u1;

    const-string v3, "135"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const/16 v4, 0x87

    invoke-direct {v2, v4, v3, v12}, Lsz0/u1;-><init>(ILcom/whoop/design/util/TextResource;Z)V

    new-instance v3, Lsz0/u1;

    const-string v4, "154"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const/16 v5, 0x9a

    invoke-direct {v3, v5, v4, v12}, Lsz0/u1;-><init>(ILcom/whoop/design/util/TextResource;Z)V

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    new-instance v14, Lsz0/s1;

    const/16 v23, 0x30

    const/16 v24, 0x0

    const-string v15, "ZONE_3"

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v21, v2

    move-object/from16 v22, v3

    invoke-direct/range {v14 .. v24}, Lsz0/s1;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;FLsz0/u1;Lsz0/u1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v2, "Zone 2"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    sget-object v18, Ly81/f;->STRAIN_ZONE_2:Ly81/f;

    new-instance v2, Lsz0/u1;

    const-string v3, "116"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const/16 v4, 0x74

    invoke-direct {v2, v4, v3, v12}, Lsz0/u1;-><init>(ILcom/whoop/design/util/TextResource;Z)V

    new-instance v3, Lsz0/u1;

    const-string v4, "134"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const/16 v5, 0x86

    invoke-direct {v3, v5, v4, v12}, Lsz0/u1;-><init>(ILcom/whoop/design/util/TextResource;Z)V

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v19

    new-instance v15, Lsz0/s1;

    const/16 v24, 0x30

    const/16 v25, 0x0

    const-string v16, "ZONE_2"

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v22, v2

    move-object/from16 v23, v3

    invoke-direct/range {v15 .. v25}, Lsz0/s1;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;FLsz0/u1;Lsz0/u1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v2, "Zone 1"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget-object v6, Ly81/f;->STRAIN_ZONE_1:Ly81/f;

    new-instance v10, Lsz0/u1;

    const-string v2, "96"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const/16 v3, 0x60

    invoke-direct {v10, v3, v2, v12}, Lsz0/u1;-><init>(ILcom/whoop/design/util/TextResource;Z)V

    new-instance v11, Lsz0/u1;

    const-string v2, "115"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const/16 v3, 0x73

    invoke-direct {v11, v3, v2, v12}, Lsz0/u1;-><init>(ILcom/whoop/design/util/TextResource;Z)V

    sget-object v8, Ly81/f;->STRAIN:Ly81/f;

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    new-instance v3, Lsz0/s1;

    const-string v4, "ZONE_1"

    const v9, 0x3dcccccd    # 0.1f

    invoke-direct/range {v3 .. v11}, Lsz0/s1;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;FLsz0/u1;Lsz0/u1;)V

    filled-new-array {v1, v13, v14, v15, v3}, [Lsz0/s1;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lsz0/r1;->a:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Lsz0/s1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lsz0/r1;->o(Lsz0/s1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lsz0/r1;->l(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lsz0/s1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lsz0/r1;->p(Lsz0/s1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lsz0/r1;->t(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsz0/r1;->s(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsz0/r1;->k(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(JLk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lsz0/r1;->n(JLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Landroidx/compose/ui/Modifier;Lsz0/t1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lsz0/r1;->u(Landroidx/compose/ui/Modifier;Lsz0/t1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Landroidx/compose/ui/Modifier;Lsz0/s1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lsz0/r1;->q(Landroidx/compose/ui/Modifier;Lsz0/s1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 41
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Z",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move/from16 v6, p2

    move-object/from16 v5, p3

    move/from16 v1, p5

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v2, -0x7469f2ac

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v8, 0x4

    if-nez v2, :cond_1

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v8

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    and-int/lit8 v9, v1, 0x30

    if-nez v9, :cond_3

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    const/16 v9, 0x20

    goto :goto_2

    :cond_2
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v2, v9

    :cond_3
    and-int/lit16 v9, v1, 0x180

    if-nez v9, :cond_5

    invoke-virtual {v0, v6}, Lp1/q;->h(Z)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x100

    goto :goto_3

    :cond_4
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v2, v9

    :cond_5
    and-int/lit16 v9, v1, 0xc00

    const/16 v10, 0x800

    if-nez v9, :cond_7

    invoke-virtual {v0, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    move v9, v10

    goto :goto_4

    :cond_6
    const/16 v9, 0x400

    :goto_4
    or-int/2addr v2, v9

    :cond_7
    and-int/lit16 v9, v2, 0x493

    const/16 v11, 0x492

    if-eq v9, v11, :cond_8

    const/4 v9, 0x1

    goto :goto_5

    :cond_8
    const/4 v9, 0x0

    :goto_5
    and-int/lit8 v11, v2, 0x1

    invoke-virtual {v0, v11, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_10

    and-int/lit16 v9, v2, 0x1c00

    if-ne v9, v10, :cond_9

    const/4 v9, 0x1

    goto :goto_6

    :cond_9
    const/4 v9, 0x0

    :goto_6
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_a

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v10, v9, :cond_b

    :cond_a
    new-instance v10, Lry2/g;

    const/4 v9, 0x3

    invoke-direct {v10, v5, v9}, Lry2/g;-><init>(Lc93/a;I)V

    invoke-virtual {v0, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object/from16 v18, v10

    check-cast v18, Lc93/a;

    const/16 v19, 0xf

    sget-object v14, Lb2/t;->w:Lb2/t;

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v9

    move-object v10, v14

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v11, Lx81/d;->a:Lx81/d;

    const/4 v14, 0x6

    invoke-virtual {v11, v0, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v15}, Ly81/i;->t()J

    move-result-wide v12

    sget-object v15, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {v15}, Lkd1/w;->a()Lk91/a;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lk91/a;->c()Lt0/i;

    move-result-object v7

    invoke-static {v9, v12, v13, v7}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const-wide/high16 v12, 0x3fd0000000000000L    # 0.25

    double-to-float v9, v12

    int-to-float v8, v8

    mul-float/2addr v9, v8

    invoke-virtual {v11, v0, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->Y0()J

    move-result-wide v12

    invoke-virtual {v15}, Lkd1/w;->a()Lk91/a;

    move-result-object v15

    invoke-virtual {v15}, Lk91/a;->c()Lt0/i;

    move-result-object v15

    invoke-static {v7, v9, v12, v13, v15}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v9, Ll0/m;->g:Ll0/h;

    sget-object v12, Lb2/e;->K:Lb2/l;

    const/16 v13, 0x36

    invoke-static {v9, v12, v0, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v9

    iget-wide v12, v0, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v0, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v14, v0, Lp1/q;->S:Z

    if-eqz v14, :cond_c

    invoke-virtual {v0, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_c
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_7
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v0, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v0, v9, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v13, v0, Lp1/q;->S:Z

    if-nez v13, :cond_d

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_e

    :cond_d
    invoke-static {v12, v0, v12, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v0, v9, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v7, v2, 0xe

    invoke-static {v3, v0, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    const/4 v9, 0x3

    int-to-float v12, v9

    mul-float/2addr v12, v8

    move v13, v8

    invoke-static {v12, v10}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/4 v14, 0x6

    invoke-virtual {v11, v0, v14}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v15

    invoke-virtual {v15}, Lb91/d;->D()Lb91/a;

    move-result-object v27

    if-eqz v6, :cond_f

    const v15, 0x508ffada

    invoke-static {v0, v15, v11, v0, v14}, Lm4/a;->B(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v19

    const/4 v15, 0x0

    :goto_8
    invoke-virtual {v0, v15}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_f
    const/4 v15, 0x0

    const v9, 0x508fff17

    invoke-virtual {v0, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v0, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->Y0()J

    move-result-wide v19

    goto :goto_8

    :goto_9
    const/16 v31, 0x0

    const v32, 0x2fff8

    move-object v9, v11

    move/from16 v23, v12

    const-wide/16 v11, 0x0

    move v15, v13

    const/4 v13, 0x0

    move/from16 v17, v14

    const/4 v14, 0x0

    move/from16 v21, v15

    const/4 v15, 0x0

    move/from16 v24, v17

    const/16 v22, 0x1

    const-wide/16 v16, 0x0

    const/16 v25, 0x2

    const/16 v18, 0x0

    move-object/from16 v26, v10

    move-wide/from16 v39, v19

    move-object/from16 v20, v9

    move-wide/from16 v9, v39

    const/16 v19, 0x0

    move-object/from16 v28, v20

    move/from16 v29, v21

    const-wide/16 v20, 0x0

    move/from16 v30, v22

    const/16 v22, 0x0

    move/from16 v33, v23

    const/16 v23, 0x0

    move/from16 v34, v24

    const/16 v24, 0x0

    move/from16 v35, v25

    const/16 v25, 0x0

    move-object/from16 v36, v26

    const/16 v26, 0x0

    move-object/from16 v37, v28

    const/16 v28, 0x0

    move/from16 v38, v30

    const/16 v30, 0x30

    move/from16 v34, v33

    move/from16 v1, v35

    const/16 v35, 0x3

    move/from16 v33, v29

    move-object/from16 v29, v0

    move-object/from16 v0, v37

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v29

    shr-int/lit8 v2, v2, 0x3

    and-int/lit8 v2, v2, 0xe

    invoke-static {v4, v7, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    int-to-float v1, v1

    mul-float v21, v1, v33

    const/16 v24, 0x0

    const/16 v25, 0xa

    const/16 v22, 0x0

    move/from16 v23, v34

    move-object/from16 v20, v36

    invoke-static/range {v20 .. v25}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/4 v14, 0x6

    invoke-virtual {v0, v7, v14}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->a()Lb91/a;

    move-result-object v27

    invoke-virtual {v0, v7, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->Y0()J

    move-result-wide v9

    const/4 v14, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    move-object v7, v2

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v29

    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_10
    move-object v7, v0

    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_11

    new-instance v0, Lrq2/w;

    const/4 v2, 0x5

    move/from16 v1, p5

    invoke-direct/range {v0 .. v6}, Lrq2/w;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ll83/e;Z)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final k(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lsz0/r1;->j(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final m(Landroidx/compose/ui/Modifier;Lsz0/s1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 50
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lsz0/s1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "itemState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p3

    check-cast v9, Lp1/q;

    const v0, -0x2c963f80

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v5, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v6, v4, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v4, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-virtual {v9, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v7, v5

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v4

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v4

    :goto_1
    and-int/lit8 v8, v4, 0x30

    if-nez v8, :cond_5

    and-int/lit8 v8, v4, 0x40

    if-nez v8, :cond_3

    invoke-virtual {v9, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    goto :goto_2

    :cond_3
    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    :goto_2
    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_3

    :cond_4
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v7, v8

    :cond_5
    and-int/lit16 v8, v4, 0x180

    if-nez v8, :cond_7

    invoke-virtual {v9, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x100

    goto :goto_4

    :cond_6
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v7, v8

    :cond_7
    and-int/lit16 v8, v7, 0x93

    const/16 v12, 0x92

    const/4 v13, 0x0

    if-eq v8, v12, :cond_8

    const/4 v8, 0x1

    goto :goto_5

    :cond_8
    move v8, v13

    :goto_5
    and-int/lit8 v12, v7, 0x1

    invoke-virtual {v9, v12, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_25

    sget-object v8, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_9

    move-object v15, v8

    goto :goto_6

    :cond_9
    move-object v15, v6

    :goto_6
    invoke-virtual {v2}, Lsz0/s1;->a()Ly81/e;

    move-result-object v0

    invoke-interface {v0, v9, v13}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v10

    invoke-virtual {v2}, Lsz0/s1;->g()F

    move-result v0

    invoke-static {v10, v11, v0}, Lsz0/r1;->v(JF)J

    move-result-wide v10

    invoke-virtual {v2}, Lsz0/s1;->c()Ly81/e;

    move-result-object v0

    invoke-interface {v0, v9, v13}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v1

    int-to-float v0, v5

    mul-float v19, v0, v0

    const/16 v20, 0x7

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object/from16 v31, v15

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Ll0/m;->a:Ll0/e;

    sget-object v15, Lb2/e;->J:Lb2/l;

    invoke-static {v6, v15, v9, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v12, v9, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v9, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v17, v15

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v14, v9, Lp1/q;->S:Z

    if-eqz v14, :cond_a

    invoke-virtual {v9, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_7
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v9, v14, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v9, v6, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v4, v9, Lp1/q;->S:Z

    if-nez v4, :cond_b

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    move/from16 v19, v7

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_c

    goto :goto_8

    :cond_b
    move/from16 v19, v7

    :goto_8
    invoke-static {v12, v9, v12, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v9, v4, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v5, 0x3e851eb8    # 0.26f

    sget-object v7, Ll0/t1;->a:Ll0/t1;

    const/4 v12, 0x1

    invoke-virtual {v7, v8, v12, v5}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v12, Li2/t;->b:Li2/s;

    move-object/from16 v20, v7

    const/16 v21, 0x0

    invoke-static/range {v21 .. v21}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    new-instance v3, Li2/x;

    invoke-direct {v3, v10, v11}, Li2/x;-><init>(J)V

    new-instance v10, Ll83/k;

    invoke-direct {v10, v7, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v3, 0x3f666666    # 0.9f

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    move-object v11, v8

    sget-wide v7, Li2/x;->m:J

    move-object/from16 v22, v11

    new-instance v11, Li2/x;

    invoke-direct {v11, v7, v8}, Li2/x;-><init>(J)V

    new-instance v7, Ll83/k;

    invoke-direct {v7, v3, v11}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v10, v7}, [Ll83/k;

    move-result-object v3

    invoke-static {v12, v3}, Li2/s;->b(Li2/s;[Ll83/k;)Li2/k0;

    move-result-object v3

    const/4 v7, 0x0

    const/4 v8, 0x6

    move/from16 v10, v21

    invoke-static {v5, v3, v7, v10, v8}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v9, v1, v2}, Lp1/q;->f(J)Z

    move-result v5

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-nez v5, :cond_d

    if-ne v7, v10, :cond_e

    :cond_d
    new-instance v7, Lsz0/p1;

    const/4 v5, 0x0

    invoke-direct {v7, v1, v2, v5}, Lsz0/p1;-><init>(JI)V

    invoke-virtual {v9, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v3, v7}, Landroidx/compose/ui/draw/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Ll0/m;->c:Ll0/g;

    sget-object v3, Lb2/e;->M:Lb2/k;

    const/4 v5, 0x0

    invoke-static {v2, v3, v9, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v11, v9, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v9, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v12, v9, Lp1/q;->S:Z

    if-eqz v12, :cond_f

    invoke-virtual {v9, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_f
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v9, v14, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v9, Lp1/q;->S:Z

    if-nez v7, :cond_10

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v7, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_11

    :cond_10
    invoke-static {v5, v9, v5, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    invoke-static {v9, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lsz0/s1;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const/4 v5, 0x0

    invoke-static {v1, v9, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    const/4 v7, 0x3

    int-to-float v7, v7

    mul-float/2addr v7, v0

    move-object/from16 v11, v22

    invoke-static {v7, v11}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v12, Lx81/d;->a:Lx81/d;

    invoke-virtual {v12, v9, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    invoke-virtual {v12, v9, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->y()J

    move-result-wide v21

    const/16 v29, 0x0

    const v30, 0x2fff8

    move-object/from16 v27, v9

    move-object v12, v10

    const-wide/16 v9, 0x0

    move-object/from16 v16, v11

    const/4 v11, 0x0

    move-object/from16 v23, v12

    const/4 v12, 0x0

    move-object/from16 v24, v13

    const/4 v13, 0x0

    move-object/from16 v28, v14

    move-object/from16 v26, v15

    const-wide/16 v14, 0x0

    move-object/from16 v32, v16

    const/16 v16, 0x0

    move-object/from16 v33, v17

    const/16 v17, 0x0

    move/from16 v34, v19

    const/16 v35, 0x1

    const-wide/16 v18, 0x0

    move-object/from16 v36, v20

    const/16 v20, 0x0

    move/from16 v37, v8

    move-wide/from16 v48, v21

    move-object/from16 v22, v6

    move-object v6, v7

    move-wide/from16 v7, v48

    const/16 v21, 0x0

    move-object/from16 v38, v22

    const/16 v22, 0x0

    move-object/from16 v39, v23

    const/16 v23, 0x0

    move-object/from16 v40, v24

    const/16 v24, 0x0

    move-object/from16 v41, v26

    const/16 v26, 0x0

    move-object/from16 v42, v28

    const/16 v28, 0x30

    move-object v5, v1

    move-object/from16 p0, v2

    move-object/from16 p3, v3

    move-object/from16 v1, v33

    move/from16 v43, v34

    move/from16 v3, v35

    move-object/from16 v2, v36

    move-object/from16 v45, v39

    move-object/from16 v44, v40

    move-object/from16 v33, v4

    move-object/from16 v4, v32

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v27

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    const v5, 0x3f3ae148    # 0.73f

    invoke-virtual {v2, v4, v3, v5}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v6, 0x2

    int-to-float v6, v6

    const/4 v7, 0x6

    invoke-static {v6, v0, v1, v9, v7}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v0

    iget-wide v6, v9, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v9, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v7, v9, Lp1/q;->S:Z

    if-eqz v7, :cond_12

    move-object/from16 v11, v41

    invoke-virtual {v9, v11}, Lp1/q;->l(Lc93/a;)V

    :goto_a
    move-object/from16 v12, v42

    goto :goto_b

    :cond_12
    move-object/from16 v11, v41

    invoke-virtual {v9}, Lp1/q;->s0()V

    goto :goto_a

    :goto_b
    invoke-static {v9, v12, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v0, v38

    invoke-static {v9, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v9, Lp1/q;->S:Z

    if-nez v6, :cond_13

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_14

    :cond_13
    move-object/from16 v13, v44

    goto :goto_d

    :cond_14
    move-object/from16 v13, v44

    :goto_c
    move-object/from16 v1, v33

    goto :goto_e

    :goto_d
    invoke-static {v1, v9, v1, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_c

    :goto_e
    invoke-static {v9, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v14, 0x3eb851ec    # 0.36f

    invoke-virtual {v2, v4, v3, v14}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object/from16 v15, p0

    move-object/from16 v6, p3

    const/4 v7, 0x0

    invoke-static {v15, v6, v9, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    move-object/from16 v16, v15

    iget-wide v14, v9, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v9, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v14, v9, Lp1/q;->S:Z

    if-eqz v14, :cond_15

    invoke-virtual {v9, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_15
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_f
    invoke-static {v9, v12, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v0, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v8, v9, Lp1/q;->S:Z

    if-nez v8, :cond_16

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_17

    :cond_16
    invoke-static {v7, v9, v7, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    invoke-static {v9, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lsz0/s1;->f()Lsz0/u1;

    move-result-object v5

    invoke-virtual {v5}, Lsz0/u1;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    move-object v7, v6

    invoke-virtual/range {p1 .. p1}, Lsz0/s1;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lsz0/s1;->f()Lsz0/u1;

    move-result-object v8

    invoke-virtual {v8}, Lsz0/u1;->c()Z

    move-result v8

    move/from16 v14, v43

    and-int/lit8 v15, v14, 0x70

    const/16 v10, 0x20

    if-eq v15, v10, :cond_19

    and-int/lit8 v17, v14, 0x40

    move-object/from16 v3, p1

    if-eqz v17, :cond_18

    invoke-virtual {v9, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_18

    goto :goto_10

    :cond_18
    const/16 v17, 0x0

    goto :goto_11

    :cond_19
    move-object/from16 v3, p1

    :goto_10
    const/16 v17, 0x1

    :goto_11
    and-int/lit16 v10, v14, 0x380

    move/from16 v19, v14

    const/16 v14, 0x100

    if-ne v10, v14, :cond_1a

    const/16 v20, 0x1

    goto :goto_12

    :cond_1a
    const/16 v20, 0x0

    :goto_12
    or-int v17, v17, v20

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v17, :cond_1c

    move/from16 v17, v10

    move-object/from16 v10, v45

    if-ne v14, v10, :cond_1b

    goto :goto_13

    :cond_1b
    move-object/from16 v20, v5

    move-object/from16 v23, v10

    move-object/from16 v10, p2

    goto :goto_14

    :cond_1c
    move/from16 v17, v10

    move-object/from16 v10, v45

    :goto_13
    new-instance v14, Lsz0/q1;

    move-object/from16 v20, v5

    const/4 v5, 0x0

    move-object/from16 v23, v10

    move-object/from16 v10, p2

    invoke-direct {v14, v3, v10, v5}, Lsz0/q1;-><init>(Lsz0/s1;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_14
    check-cast v14, Lc93/a;

    const/4 v10, 0x0

    move-object v3, v14

    move-object v14, v7

    move v7, v8

    move-object v8, v3

    move/from16 v46, v17

    move-object/from16 v5, v20

    move-object/from16 v47, v23

    const/16 v3, 0x20

    invoke-static/range {v5 .. v10}, Lsz0/r1;->j(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    const/4 v5, 0x1

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    const v6, 0x3eb851ec    # 0.36f

    invoke-virtual {v2, v4, v5, v6}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object/from16 v4, v16

    const/4 v5, 0x0

    invoke-static {v4, v14, v9, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v6, v9, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v9, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v8, v9, Lp1/q;->S:Z

    if-eqz v8, :cond_1d

    invoke-virtual {v9, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_15

    :cond_1d
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_15
    invoke-static {v9, v12, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v9, Lp1/q;->S:Z

    if-nez v0, :cond_1e

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1f

    :cond_1e
    invoke-static {v6, v9, v6, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1f
    invoke-static {v9, v1, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lsz0/s1;->e()Lsz0/u1;

    move-result-object v0

    invoke-virtual {v0}, Lsz0/u1;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lsz0/s1;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lsz0/s1;->e()Lsz0/u1;

    move-result-object v1

    invoke-virtual {v1}, Lsz0/u1;->c()Z

    move-result v7

    if-eq v15, v3, :cond_21

    and-int/lit8 v1, v19, 0x40

    move-object/from16 v2, p1

    if-eqz v1, :cond_20

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    goto :goto_17

    :cond_20
    move v13, v5

    :goto_16
    move/from16 v1, v46

    const/16 v12, 0x100

    goto :goto_18

    :cond_21
    move-object/from16 v2, p1

    :goto_17
    const/4 v13, 0x1

    goto :goto_16

    :goto_18
    if-ne v1, v12, :cond_22

    const/4 v5, 0x1

    :cond_22
    or-int v1, v13, v5

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_24

    move-object/from16 v10, v47

    if-ne v3, v10, :cond_23

    goto :goto_19

    :cond_23
    move-object/from16 v4, p2

    goto :goto_1a

    :cond_24
    :goto_19
    new-instance v3, Lsz0/q1;

    const/4 v1, 0x1

    move-object/from16 v4, p2

    invoke-direct {v3, v2, v4, v1}, Lsz0/q1;-><init>(Lsz0/s1;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1a
    move-object v8, v3

    check-cast v8, Lc93/a;

    const/4 v10, 0x0

    move-object v5, v0

    invoke-static/range {v5 .. v10}, Lsz0/r1;->j(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    const/4 v12, 0x1

    invoke-static {v9, v12, v12, v12}, Lm4/a;->y(Lp1/q;ZZZ)V

    move-object/from16 v1, v31

    goto :goto_1b

    :cond_25
    move-object v4, v3

    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v1, v6

    :goto_1b
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_26

    new-instance v0, Ls51/b;

    const/16 v6, 0x1b

    move/from16 v5, p5

    move-object v3, v4

    move/from16 v4, p4

    invoke-direct/range {v0 .. v6}, Ls51/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_26
    return-void
.end method

.method private static final n(JLk2/e;)Ll83/a0;
    .locals 11

    const-string v1, "$this$drawBehind"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Lk2/e;->d()J

    move-result-wide v1

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v5, v2

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    const/16 v7, 0x20

    shl-long/2addr v5, v7

    and-long/2addr v1, v3

    or-long/2addr v5, v1

    const/4 v1, 0x1

    int-to-float v1, v1

    const/4 v2, 0x4

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-interface {p2, v1}, Ly3/c;->q0(F)F

    move-result v7

    const/4 v9, 0x0

    const/16 v10, 0x1f0

    const-wide/16 v3, 0x0

    const/4 v8, 0x0

    move-wide v1, p0

    move-object v0, p2

    invoke-static/range {v0 .. v10}, Lk2/e;->A0(Lk2/e;JJJFILi2/t0;I)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final o(Lsz0/s1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 3

    invoke-virtual {p0}, Lsz0/s1;->f()Lsz0/u1;

    move-result-object v0

    invoke-virtual {v0}, Lsz0/u1;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lsz0/r0;

    invoke-virtual {p0}, Lsz0/s1;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lsz0/s1;->f()Lsz0/u1;

    move-result-object p0

    invoke-virtual {p0}, Lsz0/u1;->b()I

    move-result p0

    sget-object v2, Lsz0/v1;->MANUAL_ZONE_MIN:Lsz0/v1;

    invoke-direct {v0, v1, p0, v2}, Lsz0/r0;-><init>(Ljava/lang/String;ILsz0/v1;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lsz0/s1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 3

    invoke-virtual {p0}, Lsz0/s1;->e()Lsz0/u1;

    move-result-object v0

    invoke-virtual {v0}, Lsz0/u1;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lsz0/r0;

    invoke-virtual {p0}, Lsz0/s1;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lsz0/s1;->e()Lsz0/u1;

    move-result-object p0

    invoke-virtual {p0}, Lsz0/u1;->b()I

    move-result p0

    sget-object v2, Lsz0/v1;->MANUAL_ZONE_MAX:Lsz0/v1;

    invoke-direct {v0, v1, p0, v2}, Lsz0/r0;-><init>(Ljava/lang/String;ILsz0/v1;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Landroidx/compose/ui/Modifier;Lsz0/s1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lsz0/r1;->m(Landroidx/compose/ui/Modifier;Lsz0/s1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final r(Landroidx/compose/ui/Modifier;Lsz0/t1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 59
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lsz0/t1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "modifier"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p3

    check-cast v9, Lp1/q;

    const v0, -0x5e49bdf7

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_3
    and-int/lit8 v5, p5, 0x4

    if-eqz v5, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move-object/from16 v7, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_4

    move-object/from16 v7, p2

    invoke-virtual {v9, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x100

    goto :goto_3

    :cond_6
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v0, v8

    :goto_4
    and-int/lit16 v8, v0, 0x93

    const/16 v10, 0x92

    const/4 v11, 0x0

    if-eq v8, v10, :cond_7

    const/4 v8, 0x1

    goto :goto_5

    :cond_7
    move v8, v11

    :goto_5
    and-int/lit8 v10, v0, 0x1

    invoke-virtual {v9, v10, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_17

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_9

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v8, :cond_8

    new-instance v5, Lsz0/k;

    const/4 v7, 0x4

    invoke-direct {v5, v7}, Lsz0/k;-><init>(I)V

    invoke-virtual {v9, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v5, Lkotlin/jvm/functions/Function1;

    goto :goto_6

    :cond_9
    move-object v5, v7

    :goto_6
    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v13, Ll0/m;->c:Ll0/g;

    sget-object v14, Lb2/e;->M:Lb2/k;

    invoke-static {v13, v14, v9, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v15

    move-object/from16 p2, v13

    iget-wide v12, v9, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v9, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v16, v14

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v6, v9, Lp1/q;->S:Z

    if-eqz v6, :cond_a

    invoke-virtual {v9, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_7
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v9, v6, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->f:La3/i;

    invoke-static {v9, v15, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-nez v11, :cond_b

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v11, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    :cond_b
    invoke-static {v12, v9, v12, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v9, v3, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v20

    const/4 v10, 0x4

    int-to-float v10, v10

    mul-float v24, v10, v10

    const/16 v25, 0x7

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v20 .. v25}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, Ll0/m;->g:Ll0/h;

    sget-object v7, Lb2/e;->K:Lb2/l;

    const/16 v2, 0x36

    invoke-static {v12, v7, v9, v2}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    move-object v7, v5

    iget-wide v4, v9, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v9, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v12, v9, Lp1/q;->S:Z

    if-eqz v12, :cond_d

    invoke-virtual {v9, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_d
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v9, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v9, Lp1/q;->S:Z

    if-nez v2, :cond_e

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    :cond_e
    invoke-static {v4, v9, v4, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    invoke-static {v9, v3, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lsz0/t1;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const/4 v4, 0x0

    invoke-static {v2, v9, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    const v2, 0x3e8a3d71    # 0.27f

    sget-object v11, Ll0/t1;->a:Ll0/t1;

    const/4 v12, 0x1

    invoke-virtual {v11, v1, v12, v2}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v20

    const/4 v2, 0x6

    int-to-float v2, v2

    mul-float v22, v2, v10

    const/4 v2, 0x3

    int-to-float v2, v2

    mul-float v24, v2, v10

    move/from16 v23, v24

    const/16 v24, 0x0

    const/16 v25, 0xa

    move/from16 v21, v22

    const/16 v22, 0x0

    invoke-static/range {v20 .. v25}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move/from16 v31, v21

    move/from16 v32, v23

    sget-object v10, Lx81/d;->a:Lx81/d;

    const/4 v4, 0x6

    invoke-virtual {v10, v9, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->t()Lb91/a;

    move-result-object v25

    const/4 v4, 0x6

    invoke-virtual {v10, v9, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->b1()J

    move-result-wide v20

    const/16 v29, 0x0

    const v30, 0x2fff8

    move-object/from16 v27, v9

    move-object v4, v10

    const-wide/16 v9, 0x0

    move-object/from16 v22, v11

    const/4 v11, 0x0

    move/from16 v23, v12

    const/4 v12, 0x0

    move-object/from16 v24, v13

    const/4 v13, 0x0

    move-object/from16 v26, v14

    move-object/from16 v28, v15

    const-wide/16 v14, 0x0

    move-object/from16 v33, v16

    const/16 v16, 0x0

    const/16 v34, 0x100

    const/16 v17, 0x0

    const/high16 v35, 0x3f800000    # 1.0f

    const/16 v36, 0x0

    const-wide/16 v18, 0x0

    move-object/from16 v37, v8

    move-wide/from16 v57, v20

    move-object/from16 v21, v7

    move-wide/from16 v7, v57

    const/16 v20, 0x0

    move-object/from16 v38, v21

    const/16 v21, 0x0

    move-object/from16 v39, v22

    const/16 v22, 0x0

    move/from16 v40, v23

    const/16 v23, 0x0

    move-object/from16 v41, v24

    const/16 v24, 0x0

    move-object/from16 v42, v26

    const/16 v26, 0x0

    move-object/from16 v43, v28

    const/16 v28, 0x0

    move-object/from16 v44, p2

    move-object/from16 v50, v4

    move-object/from16 v47, v6

    move-object/from16 v45, v33

    move/from16 v4, v36

    move-object/from16 v51, v37

    move-object/from16 v53, v39

    move-object/from16 v49, v41

    move-object/from16 v46, v42

    move-object/from16 v48, v43

    move-object v6, v2

    move-object/from16 v2, v38

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v27

    invoke-virtual/range {p1 .. p1}, Lsz0/t1;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5, v9, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x3eb851ec    # 0.36f

    sget-object v7, Lb2/t;->w:Lb2/t;

    move-object/from16 v10, v53

    const/4 v8, 0x1

    invoke-virtual {v10, v7, v8, v6}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v21

    const/16 v25, 0x0

    const/16 v26, 0xa

    const/16 v23, 0x0

    move/from16 v22, v31

    move/from16 v24, v32

    invoke-static/range {v21 .. v26}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v11, 0x6

    move-object/from16 v12, v50

    invoke-virtual {v12, v9, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->t()Lb91/a;

    move-result-object v25

    const/4 v11, 0x6

    invoke-virtual {v12, v9, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->b1()J

    move-result-wide v13

    move-object/from16 v22, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move/from16 v52, v8

    move-wide/from16 v57, v13

    move-object v14, v7

    move-wide/from16 v7, v57

    const/4 v13, 0x0

    move-object/from16 v16, v14

    const-wide/16 v14, 0x0

    move-object/from16 v17, v16

    const/16 v16, 0x0

    move-object/from16 v18, v17

    const/16 v17, 0x0

    move-object/from16 v20, v18

    const-wide/16 v18, 0x0

    move-object/from16 v21, v20

    const/16 v20, 0x0

    move-object/from16 v23, v21

    const/16 v21, 0x0

    move-object/from16 v39, v22

    const/16 v22, 0x0

    move-object/from16 v24, v23

    const/16 v23, 0x0

    move-object/from16 v26, v24

    const/16 v24, 0x0

    move-object/from16 v28, v26

    const/16 v26, 0x0

    move-object/from16 v33, v28

    const/16 v28, 0x0

    move-object/from16 v56, v33

    move-object/from16 v55, v39

    move-object/from16 v54, v50

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v27

    invoke-virtual/range {p1 .. p1}, Lsz0/t1;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5, v9, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x3eb851ec    # 0.36f

    move-object/from16 v10, v55

    const/4 v7, 0x1

    invoke-virtual {v10, v1, v7, v6}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v21

    const/16 v25, 0x0

    const/16 v26, 0xa

    const/16 v23, 0x0

    move/from16 v22, v31

    move/from16 v24, v32

    invoke-static/range {v21 .. v26}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v8, 0x6

    move-object/from16 v12, v54

    invoke-virtual {v12, v9, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->t()Lb91/a;

    move-result-object v25

    const/4 v8, 0x6

    invoke-virtual {v12, v9, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->b1()J

    move-result-wide v10

    move/from16 v52, v7

    move-wide v7, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    move/from16 v4, v52

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v27

    invoke-virtual {v9, v4}, Lp1/q;->q(Z)V

    move-object/from16 v14, v56

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object/from16 v6, v44

    move-object/from16 v7, v45

    const/4 v8, 0x0

    invoke-static {v6, v7, v9, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v7, v9, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v9, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-eqz v10, :cond_10

    move-object/from16 v10, v46

    invoke-virtual {v9, v10}, Lp1/q;->l(Lc93/a;)V

    :goto_9
    move-object/from16 v10, v47

    goto :goto_a

    :cond_10
    invoke-virtual {v9}, Lp1/q;->s0()V

    goto :goto_9

    :goto_a
    invoke-static {v9, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v6, v48

    invoke-static {v9, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v9, Lp1/q;->S:Z

    if-nez v6, :cond_11

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_12

    :cond_11
    move-object/from16 v6, v49

    invoke-static {v7, v9, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    invoke-static {v9, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v3, 0x13e1ca3b

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lsz0/t1;->e()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_16

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lsz0/s1;

    and-int/lit16 v6, v0, 0x380

    const/16 v12, 0x100

    if-ne v6, v12, :cond_13

    move v11, v4

    goto :goto_c

    :cond_13
    const/4 v11, 0x0

    :goto_c
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v13, v51

    if-nez v11, :cond_14

    if-ne v6, v13, :cond_15

    :cond_14
    new-instance v6, Lsg2/b;

    const/4 v7, 0x7

    invoke-direct {v6, v2, v7}, Lsg2/b;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    move-object v8, v6

    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/4 v10, 0x0

    const/4 v11, 0x6

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v11}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v51, v13

    goto :goto_b

    :cond_16
    const/4 v8, 0x0

    invoke-static {v9, v8, v4, v4}, Lm4/a;->y(Lp1/q;ZZZ)V

    move-object v3, v2

    goto :goto_d

    :cond_17
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v3, v7

    :goto_d
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_18

    new-instance v0, Ls51/b;

    const/16 v6, 0x1c

    move-object/from16 v2, p1

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Ls51/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method private static final s(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Landroidx/compose/ui/Modifier;Lsz0/t1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lsz0/r1;->r(Landroidx/compose/ui/Modifier;Lsz0/t1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final v(JF)J
    .locals 1

    invoke-static {p0, p1}, Li2/x;->e(J)F

    move-result v0

    mul-float/2addr v0, p2

    invoke-static {v0, p0, p1}, Li2/x;->c(FJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final w()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lsz0/s1;",
            ">;"
        }
    .end annotation

    sget-object v0, Lsz0/r1;->a:Ljava/util/List;

    return-object v0
.end method
