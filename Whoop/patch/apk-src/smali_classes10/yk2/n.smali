.class public abstract Lyk2/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u001aE\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a5\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a+\u0010\u0010\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a1\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001a\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\"\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\"\u001a\u0010#\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"\"\u001a\u0010&\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008$\u0010 \u001a\u0004\u0008%\u0010\"\u00a8\u0006\'"
    }
    d2 = {
        "Ltk2/q;",
        "state",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ly3/f;",
        "horizontalBleed",
        "statusBarTop",
        "Lw41/f;",
        "mapController",
        "navigationBarsBottom",
        "Ll83/a0;",
        "h",
        "(Ltk2/q;Landroidx/compose/ui/Modifier;FFLw41/f;FLandroidx/compose/runtime/Composer;II)V",
        "Ltk2/q$b;",
        "e",
        "(Ltk2/q$b;Landroidx/compose/ui/Modifier;FLw41/f;Landroidx/compose/runtime/Composer;II)V",
        "m",
        "(Landroidx/compose/ui/Modifier;FFF)Landroidx/compose/ui/Modifier;",
        "Ly81/f;",
        "backgroundColor",
        "topBleed",
        "j",
        "(Ly81/f;FFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "navigationBarBottom",
        "Lw41/x$a;",
        "l",
        "(FF)Lw41/x$a;",
        "Lw41/w;",
        "a",
        "Lw41/w;",
        "defaultUserLocation",
        "b",
        "F",
        "getTrackSessionMapTopOverlayHeight",
        "()F",
        "trackSessionMapTopOverlayHeight",
        "c",
        "getTrackSessionMapBottomOverlayHeight",
        "trackSessionMapBottomOverlayHeight",
        "track-activity_release"
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
.field private static final a:Lw41/w;

.field private static final b:F

.field private static final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lw41/w;

    const-wide v1, 0x40452e17c1bda512L    # 42.3601

    const-wide v3, -0x3fae3c3afb7e9100L    # -71.0589

    invoke-direct {v0, v1, v2, v3, v4}, Lw41/w;-><init>(DD)V

    sput-object v0, Lyk2/n;->a:Lw41/w;

    const/16 v0, 0xe

    int-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sput v0, Lyk2/n;->b:F

    const/16 v0, 0x19

    int-to-float v0, v0

    mul-float/2addr v0, v1

    sput v0, Lyk2/n;->c:F

    return-void
.end method

.method public static synthetic a(Ltk2/q$b;Landroidx/compose/ui/Modifier;FLw41/f;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lyk2/n;->g(Ltk2/q$b;Landroidx/compose/ui/Modifier;FLw41/f;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ltk2/q;Landroidx/compose/ui/Modifier;FFLw41/f;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lyk2/n;->i(Ltk2/q;Landroidx/compose/ui/Modifier;FFLw41/f;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ltk2/q$b;FLandroidx/compose/ui/Modifier;Lw41/f;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lyk2/n;->f(Ltk2/q$b;FLandroidx/compose/ui/Modifier;Lw41/f;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ly81/f;FFLandroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lyk2/n;->k(Ly81/f;FFLandroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Ltk2/q$b;Landroidx/compose/ui/Modifier;FLw41/f;Landroidx/compose/runtime/Composer;II)V
    .locals 12

    move/from16 v5, p5

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v1, -0x1dee1981

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v5, 0x6

    if-nez v1, :cond_2

    and-int/lit8 v1, v5, 0x8

    if-nez v1, :cond_0

    invoke-virtual {v0, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_1

    :cond_1
    const/4 v1, 0x2

    :goto_1
    or-int/2addr v1, v5

    goto :goto_2

    :cond_2
    move v1, v5

    :goto_2
    and-int/lit8 v2, p6, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_4

    :cond_3
    and-int/lit8 v3, v5, 0x30

    if-nez v3, :cond_5

    invoke-virtual {v0, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_3

    :cond_4
    const/16 v3, 0x10

    :goto_3
    or-int/2addr v1, v3

    :cond_5
    :goto_4
    and-int/lit16 v3, v5, 0x180

    if-nez v3, :cond_7

    invoke-virtual {v0, p2}, Lp1/q;->d(F)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v3, 0x100

    goto :goto_5

    :cond_6
    const/16 v3, 0x80

    :goto_5
    or-int/2addr v1, v3

    :cond_7
    and-int/lit8 v3, p6, 0x8

    if-eqz v3, :cond_8

    or-int/lit16 v1, v1, 0xc00

    goto :goto_7

    :cond_8
    and-int/lit16 v4, v5, 0xc00

    if-nez v4, :cond_a

    invoke-virtual {v0, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    const/16 v4, 0x800

    goto :goto_6

    :cond_9
    const/16 v4, 0x400

    :goto_6
    or-int/2addr v1, v4

    :cond_a
    :goto_7
    and-int/lit16 v4, v1, 0x493

    const/16 v6, 0x492

    const/4 v7, 0x1

    if-eq v4, v6, :cond_b

    move v4, v7

    goto :goto_8

    :cond_b
    const/4 v4, 0x0

    :goto_8
    and-int/2addr v1, v7

    invoke-virtual {v0, v1, v4}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_e

    if-eqz v2, :cond_c

    sget-object p1, Lb2/t;->w:Lb2/t;

    :cond_c
    move-object v9, p1

    if-eqz v3, :cond_d

    const/4 p3, 0x0

    :cond_d
    move-object v10, p3

    invoke-static {}, Lw41/k;->M()Lp1/t1;

    move-result-object p1

    const-string p3, "[\n  {\n    \"elementType\": \"geometry\",\n    \"stylers\": [\n      {\n        \"color\": \"#212426\"\n      }\n    ]\n  },\n  {\n    \"elementType\": \"labels.icon\",\n    \"stylers\": [\n      {\n        \"visibility\": \"off\"\n      }\n    ]\n  },\n  {\n    \"elementType\": \"labels.text.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#565A5C\"\n      }\n    ]\n  },\n  {\n    \"elementType\": \"labels.text.stroke\",\n    \"stylers\": [\n      {\n        \"color\": \"#212426\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"poi\",\n    \"stylers\": [\n      {\n        \"visibility\": \"off\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"transit\",\n    \"stylers\": [\n      {\n        \"visibility\": \"off\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"administrative.land_parcel\",\n    \"stylers\": [\n      {\n        \"visibility\": \"off\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"administrative.neighborhood\",\n    \"elementType\": \"labels.text.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#505456\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road\",\n    \"elementType\": \"geometry\",\n    \"stylers\": [\n      {\n        \"color\": \"#2C3032\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road\",\n    \"elementType\": \"labels.text.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#5A5E60\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road.local\",\n    \"elementType\": \"geometry\",\n    \"stylers\": [\n      {\n        \"color\": \"#292D2F\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road.arterial\",\n    \"elementType\": \"geometry\",\n    \"stylers\": [\n      {\n        \"color\": \"#323638\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road.highway\",\n    \"elementType\": \"geometry\",\n    \"stylers\": [\n      {\n        \"color\": \"#363B3D\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road.highway\",\n    \"elementType\": \"labels\",\n    \"stylers\": [\n      {\n        \"visibility\": \"off\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road.highway.controlled_access\",\n    \"elementType\": \"labels\",\n    \"stylers\": [\n      {\n        \"visibility\": \"off\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"water\",\n    \"elementType\": \"geometry\",\n    \"stylers\": [\n      {\n        \"color\": \"#171B1D\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"water\",\n    \"elementType\": \"labels.text.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#484C4E\"\n      }\n    ]\n  }\n]"

    invoke-virtual {p1, p3}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object p1

    new-instance v6, Lz;

    const/4 v11, 0x2

    move-object v7, p0

    move v8, p2

    invoke-direct/range {v6 .. v11}, Lz;-><init>(Ljava/lang/Object;FLjava/lang/Object;Ljava/lang/Object;I)V

    const p3, 0x3d0d69bf

    invoke-static {p3, v0, v6}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object p3

    const/16 v1, 0x38

    invoke-static {p1, p3, v0, v1}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    move-object v2, v9

    move-object v4, v10

    goto :goto_9

    :cond_e
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v2, p1

    move-object v4, p3

    :goto_9
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_f

    new-instance v0, Lcom/whoop/profile/view/j;

    move-object v1, p0

    move v3, p2

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/whoop/profile/view/j;-><init>(Ltk2/q$b;Landroidx/compose/ui/Modifier;FLw41/f;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final f(Ltk2/q$b;FLandroidx/compose/ui/Modifier;Lw41/f;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 17

    and-int/lit8 v0, p5, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/lit8 v1, p5, 0x1

    move-object/from16 v9, p4

    check-cast v9, Lp1/q;

    invoke-virtual {v9, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual/range {p0 .. p0}, Ltk2/q$b;->a()Lw41/z;

    move-result-object v0

    if-eqz v0, :cond_2

    const v1, -0x4419c99f

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    instance-of v1, v0, Lw41/z$a;

    if-eqz v1, :cond_1

    const v1, -0x4418d0c6

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    sget-object v1, Ll0/c2;->v:Ljava/util/WeakHashMap;

    invoke-static {v9}, Ll0/e;->e(Landroidx/compose/runtime/Composer;)Ll0/c2;

    move-result-object v1

    iget-object v1, v1, Ll0/c2;->e:Ll0/b;

    invoke-static {v1, v9}, Ll0/f;->e(Ll0/b2;Landroidx/compose/runtime/Composer;)Ll0/x0;

    move-result-object v1

    invoke-virtual {v1}, Ll0/x0;->a()F

    move-result v1

    move-object v10, v0

    check-cast v10, Lw41/z$a;

    move/from16 v0, p1

    invoke-static {v0, v1}, Lyk2/n;->l(FF)Lw41/x$a;

    move-result-object v14

    const/4 v15, 0x7

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v10 .. v16}, Lw41/z$a;->b(Lw41/z$a;Lw41/w;Ljava/util/List;ZLw41/x$a;ILjava/lang/Object;)Lw41/z$a;

    move-result-object v0

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    :goto_1
    move-object v4, v0

    goto :goto_2

    :cond_1
    const v1, -0x4412f165

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    goto :goto_1

    :goto_2
    sget v0, Lw41/z;->a:I

    or-int/lit16 v10, v0, 0x6180

    const/4 v11, 0x0

    const/4 v6, 0x1

    const/4 v8, 0x0

    move-object/from16 v5, p2

    move-object/from16 v7, p3

    invoke-static/range {v4 .. v11}, Lw41/k;->l(Lw41/z;Landroidx/compose/ui/Modifier;ZLw41/f;ZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_2
    const v0, -0x440e53a4

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-static {}, Lw41/a;->n()Lp1/t1;

    move-result-object v0

    invoke-virtual {v9, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lc93/p;

    invoke-virtual/range {p0 .. p0}, Ltk2/q$b;->b()Lw41/w;

    move-result-object v0

    if-nez v0, :cond_3

    sget-object v0, Lyk2/n;->a:Lw41/w;

    :cond_3
    move-object v6, v0

    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v0, Lyk2/a;->a:Lyk2/a;

    invoke-virtual {v0}, Lyk2/a;->b()Lc93/m;

    move-result-object v8

    sget v0, Lw41/w;->c:I

    shl-int/lit8 v0, v0, 0x3

    or-int/lit16 v0, v0, 0xd80

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    move-object/from16 v5, p2

    invoke-interface/range {v4 .. v10}, Lc93/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_4
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Ltk2/q$b;Landroidx/compose/ui/Modifier;FLw41/f;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lyk2/n;->e(Ltk2/q$b;Landroidx/compose/ui/Modifier;FLw41/f;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h(Ltk2/q;Landroidx/compose/ui/Modifier;FFLw41/f;FLandroidx/compose/runtime/Composer;II)V
    .locals 13

    move/from16 v4, p3

    move/from16 v9, p5

    move/from16 v10, p7

    const-string v0, "state"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p6

    check-cast v6, Lp1/q;

    const v0, 0x32ef1b88

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v10, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v10, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v6, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v10

    goto :goto_2

    :cond_2
    move v0, v10

    :goto_2
    and-int/lit8 v2, p8, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    goto :goto_4

    :cond_3
    and-int/lit8 v3, v10, 0x30

    if-nez v3, :cond_5

    invoke-virtual {v6, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_3

    :cond_4
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v0, v5

    :cond_5
    :goto_4
    and-int/lit16 v5, v10, 0x180

    if-nez v5, :cond_7

    invoke-virtual {v6, p2}, Lp1/q;->d(F)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x100

    goto :goto_5

    :cond_6
    const/16 v5, 0x80

    :goto_5
    or-int/2addr v0, v5

    :cond_7
    and-int/lit16 v5, v10, 0xc00

    if-nez v5, :cond_9

    invoke-virtual {v6, v4}, Lp1/q;->d(F)Z

    move-result v5

    if-eqz v5, :cond_8

    const/16 v5, 0x800

    goto :goto_6

    :cond_8
    const/16 v5, 0x400

    :goto_6
    or-int/2addr v0, v5

    :cond_9
    and-int/lit8 v5, p8, 0x10

    if-eqz v5, :cond_b

    or-int/lit16 v0, v0, 0x6000

    :cond_a
    move-object/from16 v7, p4

    goto :goto_8

    :cond_b
    and-int/lit16 v7, v10, 0x6000

    if-nez v7, :cond_a

    move-object/from16 v7, p4

    invoke-virtual {v6, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_c

    const/16 v8, 0x4000

    goto :goto_7

    :cond_c
    const/16 v8, 0x2000

    :goto_7
    or-int/2addr v0, v8

    :goto_8
    const/high16 v8, 0x30000

    and-int/2addr v8, v10

    if-nez v8, :cond_e

    invoke-virtual {v6, v9}, Lp1/q;->d(F)Z

    move-result v8

    if-eqz v8, :cond_d

    const/high16 v8, 0x20000

    goto :goto_9

    :cond_d
    const/high16 v8, 0x10000

    :goto_9
    or-int/2addr v0, v8

    :cond_e
    const v8, 0x12493

    and-int/2addr v8, v0

    const v11, 0x12492

    const/4 v12, 0x0

    if-eq v8, v11, :cond_f

    const/4 v8, 0x1

    goto :goto_a

    :cond_f
    move v8, v12

    :goto_a
    and-int/lit8 v11, v0, 0x1

    invoke-virtual {v6, v11, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_14

    if-eqz v2, :cond_10

    sget-object v2, Lb2/t;->w:Lb2/t;

    move-object v11, v2

    goto :goto_b

    :cond_10
    move-object v11, p1

    :goto_b
    if-eqz v5, :cond_11

    const/4 v2, 0x0

    move-object v5, v2

    goto :goto_c

    :cond_11
    move-object v5, v7

    :goto_c
    instance-of v2, p0, Ltk2/q$b;

    if-eqz v2, :cond_12

    const v2, 0x33968163

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    move-object v2, p0

    check-cast v2, Ltk2/q$b;

    invoke-static {v11, p2, v4, v9}, Lyk2/n;->m(Landroidx/compose/ui/Modifier;FFF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    and-int/lit8 v7, v0, 0xe

    shr-int/lit8 v0, v0, 0x3

    and-int/lit16 v8, v0, 0x380

    or-int/2addr v7, v8

    and-int/lit16 v0, v0, 0x1c00

    or-int/2addr v7, v0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v8}, Lyk2/n;->e(Ltk2/q$b;Landroidx/compose/ui/Modifier;FLw41/f;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v5

    move-object v4, v6

    invoke-virtual {v4, v12}, Lp1/q;->q(Z)V

    move-object v3, v11

    goto :goto_d

    :cond_12
    move-object v7, v5

    move-object v4, v6

    instance-of v2, p0, Ltk2/q$a;

    if-eqz v2, :cond_13

    const v2, 0x3f405f04

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    move-object v2, p0

    check-cast v2, Ltk2/q$a;

    invoke-virtual {v2}, Ltk2/q$a;->a()Ly81/f;

    move-result-object v2

    shr-int/lit8 v3, v0, 0x3

    and-int/lit16 v3, v3, 0x3f0

    shl-int/lit8 v0, v0, 0x6

    and-int/lit16 v0, v0, 0x1c00

    or-int v5, v3, v0

    const/4 v6, 0x0

    move v1, p2

    move-object v0, v2

    move-object v3, v11

    move/from16 v2, p3

    invoke-static/range {v0 .. v6}, Lyk2/n;->j(Ly81/f;FFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v12}, Lp1/q;->q(Z)V

    :goto_d
    move-object v2, v3

    :goto_e
    move-object v5, v7

    goto :goto_f

    :cond_13
    const p0, 0x33967ae3

    invoke-static {p0, v4, v12}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0

    :cond_14
    move-object v4, v6

    invoke-virtual {v4}, Lp1/q;->X()V

    move-object v2, p1

    goto :goto_e

    :goto_f
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_15

    new-instance v0, Lmy0/a;

    move-object v1, p0

    move v3, p2

    move/from16 v4, p3

    move/from16 v8, p8

    move v6, v9

    move v7, v10

    invoke-direct/range {v0 .. v8}, Lmy0/a;-><init>(Ltk2/q;Landroidx/compose/ui/Modifier;FFLw41/f;FII)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_15
    return-void
.end method

.method private static final i(Ltk2/q;Landroidx/compose/ui/Modifier;FFLw41/f;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Lyk2/n;->h(Ltk2/q;Landroidx/compose/ui/Modifier;FFLw41/f;FLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Ly81/f;FFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 15

    move/from16 v5, p5

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v1, -0x2ffb9dd6

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v5, 0x6

    if-nez v1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    invoke-virtual {v0, v1}, Lp1/q;->e(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v5

    goto :goto_1

    :cond_1
    move v1, v5

    :goto_1
    and-int/lit8 v2, v5, 0x30

    if-nez v2, :cond_3

    move/from16 v2, p1

    invoke-virtual {v0, v2}, Lp1/q;->d(F)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    goto :goto_3

    :cond_3
    move/from16 v2, p1

    :goto_3
    and-int/lit16 v3, v5, 0x180

    if-nez v3, :cond_5

    move/from16 v3, p2

    invoke-virtual {v0, v3}, Lp1/q;->d(F)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_4

    :cond_4
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v1, v4

    goto :goto_5

    :cond_5
    move/from16 v3, p2

    :goto_5
    and-int/lit8 v4, p6, 0x8

    if-eqz v4, :cond_7

    or-int/lit16 v1, v1, 0xc00

    :cond_6
    move-object/from16 v6, p3

    goto :goto_7

    :cond_7
    and-int/lit16 v6, v5, 0xc00

    if-nez v6, :cond_6

    move-object/from16 v6, p3

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x800

    goto :goto_6

    :cond_8
    const/16 v7, 0x400

    :goto_6
    or-int/2addr v1, v7

    :goto_7
    and-int/lit16 v7, v1, 0x493

    const/16 v8, 0x492

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-eq v7, v8, :cond_9

    move v7, v13

    goto :goto_8

    :cond_9
    move v7, v12

    :goto_8
    and-int/lit8 v8, v1, 0x1

    invoke-virtual {v0, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_e

    sget-object v14, Lb2/t;->w:Lb2/t;

    if-eqz v4, :cond_a

    move-object v6, v14

    :cond_a
    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v9, 0x0

    move v7, v2

    move v8, v3

    invoke-static/range {v6 .. v11}, Lzk2/w;->k(Landroidx/compose/ui/Modifier;FFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v0, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->o()J

    move-result-wide v3

    sget-object v7, Li2/w0;->a:Li2/v0;

    invoke-static {v2, v3, v4, v7}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->w:Lb2/m;

    invoke-static {v3, v12}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v7, v0, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v0, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v9, v0, Lp1/q;->S:Z

    if-eqz v9, :cond_b

    invoke-virtual {v0, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_b
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_9
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v0, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v0, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v7, v0, Lp1/q;->S:Z

    if-nez v7, :cond_c

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_d

    :cond_c
    invoke-static {v4, v0, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v0, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    sget-object v3, Lb2/e;->x:Lb2/m;

    invoke-virtual {v2, v14, v3}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    and-int/lit8 v1, v1, 0xe

    invoke-static {p0, v2, v0, v1, v12}, Lzk2/w;->f(Ly81/f;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v0, v13}, Lp1/q;->q(Z)V

    :goto_a
    move-object v4, v6

    goto :goto_b

    :cond_e
    invoke-virtual {v0}, Lp1/q;->X()V

    goto :goto_a

    :goto_b
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_f

    new-instance v0, Lyk2/m;

    move-object v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lyk2/m;-><init>(Ly81/f;FFLandroidx/compose/ui/Modifier;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final k(Ly81/f;FFLandroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lyk2/n;->j(Ly81/f;FFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final l(FF)Lw41/x$a;
    .locals 6

    new-instance v0, Lw41/x$a;

    const/4 v1, 0x2

    int-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v1, v2

    sget v3, Lyk2/n;->b:F

    add-float/2addr p0, v3

    const/4 v3, 0x0

    int-to-float v3, v3

    mul-float/2addr v3, v2

    sget v2, Lyk2/n;->c:F

    add-float v4, p1, v2

    const/4 v5, 0x0

    move v2, p0

    invoke-direct/range {v0 .. v5}, Lw41/x$a;-><init>(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static final m(Landroidx/compose/ui/Modifier;FFF)Landroidx/compose/ui/Modifier;
    .locals 1

    const-string v0, "$this$trackSessionMapLayerBleed"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2, p3}, Lzk2/w;->j(Landroidx/compose/ui/Modifier;FFF)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/high16 p1, 0x3f800000    # 1.0f

    invoke-static {p1, p0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method
