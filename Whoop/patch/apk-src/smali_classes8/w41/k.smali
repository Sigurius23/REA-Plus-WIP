.class public abstract Lw41/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001aA\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a;\u0010\u000c\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0008\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\u000b\"\u001d\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\"C\u0010\u0017\u001a.\u0012*\u0012(\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u00140\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0010\u001a\u0004\u0008\u0016\u0010\u0012\u00a8\u0006\u001d\u00b2\u0006\u000e\u0010\u0018\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0019\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u001a\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002\u00b2\u0006\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lw41/z;",
        "mapState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "interactive",
        "Lw41/f;",
        "controller",
        "showGradientOverlay",
        "Ll83/a0;",
        "l",
        "(Lw41/z;Landroidx/compose/ui/Modifier;ZLw41/f;ZLandroidx/compose/runtime/Composer;II)V",
        "n",
        "Lp1/t1;",
        "",
        "a",
        "Lp1/t1;",
        "M",
        "()Lp1/t1;",
        "LocalActivityMapStyle",
        "Lkotlin/Function5;",
        "b",
        "getLocalActivityMapRenderer",
        "LocalActivityMapRenderer",
        "hasInitializedExternalCamera",
        "isFollowingRoute",
        "preserveExternalFollowZoom",
        "Lcom/google/android/gms/maps/model/LatLngBounds;",
        "lastFittedBounds",
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
.field private static final a:Lp1/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t1;"
        }
    .end annotation
.end field

.field private static final b:Lp1/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t1;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvw0/a;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Lvw0/a;-><init>(I)V

    new-instance v1, Lp1/b0;

    invoke-direct {v1, v0}, Lp1/b0;-><init>(Lc93/a;)V

    sput-object v1, Lw41/k;->a:Lp1/t1;

    new-instance v0, Lvw0/a;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Lvw0/a;-><init>(I)V

    new-instance v1, Lp1/b0;

    invoke-direct {v1, v0}, Lp1/b0;-><init>(Lc93/a;)V

    sput-object v1, Lw41/k;->b:Lp1/t1;

    return-void
.end method

.method private static final A(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final B(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final C(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final D(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final E()Lc93/q;
    .locals 1

    sget-object v0, Lw41/v;->a:Lw41/v;

    invoke-virtual {v0}, Lw41/v;->b()Lc93/q;

    move-result-object v0

    return-object v0
.end method

.method private static final F()Ljava/lang/String;
    .locals 1

    const-string v0, "[\n  {\n    \"elementType\": \"geometry\",\n    \"stylers\": [\n      {\n        \"color\": \"#212121\"\n      }\n    ]\n  },\n  {\n    \"elementType\": \"labels.icon\",\n    \"stylers\": [\n      {\n        \"visibility\": \"off\"\n      }\n    ]\n  },\n  {\n    \"elementType\": \"labels.text.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#757575\"\n      }\n    ]\n  },\n  {\n    \"elementType\": \"labels.text.stroke\",\n    \"stylers\": [\n      {\n        \"color\": \"#212121\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"administrative\",\n    \"elementType\": \"geometry\",\n    \"stylers\": [\n      {\n        \"color\": \"#757575\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"administrative.country\",\n    \"elementType\": \"labels.text.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#9e9e9e\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"administrative.land_parcel\",\n    \"stylers\": [\n      {\n        \"visibility\": \"off\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"administrative.locality\",\n    \"elementType\": \"labels.text.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#bdbdbd\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"poi\",\n    \"elementType\": \"labels.text.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#757575\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"poi.park\",\n    \"elementType\": \"geometry\",\n    \"stylers\": [\n      {\n        \"color\": \"#181818\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"poi.park\",\n    \"elementType\": \"labels.text.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#616161\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"poi.park\",\n    \"elementType\": \"labels.text.stroke\",\n    \"stylers\": [\n      {\n        \"color\": \"#1b1b1b\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road\",\n    \"elementType\": \"geometry.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#2c2c2c\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road\",\n    \"elementType\": \"labels.text.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#8a8a8a\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road.arterial\",\n    \"elementType\": \"geometry\",\n    \"stylers\": [\n      {\n        \"color\": \"#373737\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road.highway\",\n    \"elementType\": \"geometry\",\n    \"stylers\": [\n      {\n        \"color\": \"#3c3c3c\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road.highway.controlled_access\",\n    \"elementType\": \"geometry\",\n    \"stylers\": [\n      {\n        \"color\": \"#4e4e4e\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road.local\",\n    \"elementType\": \"labels.text.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#616161\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"transit\",\n    \"elementType\": \"labels.text.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#757575\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"water\",\n    \"elementType\": \"geometry\",\n    \"stylers\": [\n      {\n        \"color\": \"#000000\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"water\",\n    \"elementType\": \"labels.text.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#3d3d3d\"\n      }\n    ]\n  }\n]"

    return-object v0
.end method

.method public static final synthetic G(Lw41/z;Landroidx/compose/ui/Modifier;ZLw41/f;ZLandroidx/compose/runtime/Composer;II)V
    .locals 0

    invoke-static/range {p0 .. p7}, Lw41/k;->n(Lw41/z;Landroidx/compose/ui/Modifier;ZLw41/f;ZLandroidx/compose/runtime/Composer;II)V

    return-void
.end method

.method public static final synthetic H(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lw41/k;->p(Lp1/c1;Z)V

    return-void
.end method

.method public static final synthetic I(Lp1/c1;Lcom/google/android/gms/maps/model/LatLngBounds;)V
    .locals 0

    invoke-static {p0, p1}, Lw41/k;->r(Lp1/c1;Lcom/google/android/gms/maps/model/LatLngBounds;)V

    return-void
.end method

.method public static final synthetic J(Lp1/c1;)Z
    .locals 0

    invoke-static {p0}, Lw41/k;->z(Lp1/c1;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic K(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lw41/k;->A(Lp1/c1;Z)V

    return-void
.end method

.method public static final synthetic L(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lw41/k;->C(Lp1/c1;Z)V

    return-void
.end method

.method public static final M()Lp1/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lp1/t1;"
        }
    .end annotation

    sget-object v0, Lw41/k;->a:Lp1/t1;

    return-object v0
.end method

.method public static synthetic a(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lw41/k;->t(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/google/android/gms/maps/model/LatLng;FLeu/g;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lw41/k;->o(Lcom/google/android/gms/maps/model/LatLng;FLeu/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lw41/z;Landroidx/compose/ui/Modifier;ZLw41/f;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lw41/k;->y(Lw41/z;Landroidx/compose/ui/Modifier;ZLw41/f;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lw41/z$a;ZLbc3/c0;ZLeu/g;ILp1/c1;Lp1/c1;Lp1/c1;)Z
    .locals 0

    invoke-static/range {p0 .. p8}, Lw41/k;->w(Lw41/z$a;ZLbc3/c0;ZLeu/g;ILp1/c1;Lp1/c1;Lp1/c1;)Z

    move-result p0

    return p0
.end method

.method public static synthetic e(Lw41/z;Landroidx/compose/ui/Modifier;ZLw41/f;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lw41/k;->m(Lw41/z;Landroidx/compose/ui/Modifier;ZLw41/f;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lw41/z;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lw41/k;->x(Lw41/z;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lw41/k;->s(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lw41/k;->F()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic i(Lp1/c1;Lcom/google/android/gms/maps/model/LatLngBounds;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lw41/k;->v(Lp1/c1;Lcom/google/android/gms/maps/model/LatLngBounds;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lp1/c1;Lcom/google/android/gms/maps/model/LatLngBounds;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lw41/k;->u(Lp1/c1;Lcom/google/android/gms/maps/model/LatLngBounds;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k()Lc93/q;
    .locals 1

    invoke-static {}, Lw41/k;->E()Lc93/q;

    move-result-object v0

    return-object v0
.end method

.method public static final l(Lw41/z;Landroidx/compose/ui/Modifier;ZLw41/f;ZLandroidx/compose/runtime/Composer;II)V
    .locals 16

    move-object/from16 v1, p0

    move/from16 v8, p6

    const-string v0, "mapState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p5

    check-cast v6, Lp1/q;

    const v0, 0x5029c589

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v8, 0x6

    const/4 v2, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v8

    goto :goto_1

    :cond_1
    move v0, v8

    :goto_1
    and-int/lit8 v3, p7, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v8, 0x30

    if-nez v4, :cond_2

    move-object/from16 v4, p1

    invoke-virtual {v6, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :goto_3
    and-int/lit8 v5, p7, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move/from16 v7, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v8, 0x180

    if-nez v7, :cond_5

    move/from16 v7, p2

    invoke-virtual {v6, v7}, Lp1/q;->h(Z)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v0, v9

    :goto_5
    and-int/lit8 v9, p7, 0x8

    if-eqz v9, :cond_9

    or-int/lit16 v0, v0, 0xc00

    :cond_8
    move-object/from16 v10, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v10, v8, 0xc00

    if-nez v10, :cond_8

    move-object/from16 v10, p3

    invoke-virtual {v6, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    const/16 v11, 0x800

    goto :goto_6

    :cond_a
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v0, v11

    :goto_7
    and-int/lit8 v11, p7, 0x10

    if-eqz v11, :cond_c

    or-int/lit16 v0, v0, 0x6000

    :cond_b
    move/from16 v12, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v12, v8, 0x6000

    if-nez v12, :cond_b

    move/from16 v12, p4

    invoke-virtual {v6, v12}, Lp1/q;->h(Z)Z

    move-result v13

    if-eqz v13, :cond_d

    const/16 v13, 0x4000

    goto :goto_8

    :cond_d
    const/16 v13, 0x2000

    :goto_8
    or-int/2addr v0, v13

    :goto_9
    and-int/lit16 v13, v0, 0x2493

    const/16 v14, 0x2492

    const/4 v15, 0x1

    if-eq v13, v14, :cond_e

    move v13, v15

    goto :goto_a

    :cond_e
    const/4 v13, 0x0

    :goto_a
    and-int/lit8 v14, v0, 0x1

    invoke-virtual {v6, v14, v13}, Lp1/q;->U(IZ)Z

    move-result v13

    if-eqz v13, :cond_13

    if-eqz v3, :cond_f

    const/16 v3, 0x5f

    int-to-float v3, v3

    int-to-float v2, v2

    mul-float/2addr v3, v2

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    goto :goto_b

    :cond_f
    move-object v2, v4

    :goto_b
    if-eqz v5, :cond_10

    move v13, v15

    goto :goto_c

    :cond_10
    move v13, v7

    :goto_c
    if-eqz v9, :cond_11

    const/4 v3, 0x0

    move-object v4, v3

    goto :goto_d

    :cond_11
    move-object v4, v10

    :goto_d
    if-eqz v11, :cond_12

    move v12, v15

    :cond_12
    sget-object v3, Lw41/k;->b:Lp1/t1;

    invoke-virtual {v6, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc93/q;

    move v5, v0

    move-object v0, v3

    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    move v7, v5

    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    const v9, 0xfffe

    and-int/2addr v7, v9

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface/range {v0 .. v7}, Lc93/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v3, v13

    :goto_e
    move v5, v12

    goto :goto_f

    :cond_13
    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v2, v4

    move v3, v7

    move-object v4, v10

    goto :goto_e

    :goto_f
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_14

    new-instance v0, Lw41/h;

    const/4 v8, 0x0

    move-object/from16 v1, p0

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lw41/h;-><init>(Lw41/z;Landroidx/compose/ui/Modifier;ZLw41/f;ZIII)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final m(Lw41/z;Landroidx/compose/ui/Modifier;ZLw41/f;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lw41/k;->l(Lw41/z;Landroidx/compose/ui/Modifier;ZLw41/f;ZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lw41/z;Landroidx/compose/ui/Modifier;ZLw41/f;ZLandroidx/compose/runtime/Composer;II)V
    .locals 35

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v5, p2

    move/from16 v0, p4

    move/from16 v14, p6

    move-object/from16 v9, p5

    check-cast v9, Lp1/q;

    const v3, 0x7054c064

    invoke-virtual {v9, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v14, 0x6

    const/4 v4, 0x4

    if-nez v3, :cond_1

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v14

    goto :goto_1

    :cond_1
    move v3, v14

    :goto_1
    and-int/lit8 v6, v14, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v9, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :cond_3
    and-int/lit16 v6, v14, 0x180

    if-nez v6, :cond_5

    invoke-virtual {v9, v5}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v3, v6

    :cond_5
    and-int/lit8 v6, p7, 0x8

    if-eqz v6, :cond_7

    or-int/lit16 v3, v3, 0xc00

    :cond_6
    move-object/from16 v7, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v7, v14, 0xc00

    if-nez v7, :cond_6

    move-object/from16 v7, p3

    invoke-virtual {v9, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x800

    goto :goto_4

    :cond_8
    const/16 v8, 0x400

    :goto_4
    or-int/2addr v3, v8

    :goto_5
    and-int/lit16 v8, v14, 0x6000

    if-nez v8, :cond_a

    invoke-virtual {v9, v0}, Lp1/q;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_9

    const/16 v8, 0x4000

    goto :goto_6

    :cond_9
    const/16 v8, 0x2000

    :goto_6
    or-int/2addr v3, v8

    :cond_a
    and-int/lit16 v8, v3, 0x2493

    const/16 v10, 0x2492

    if-eq v8, v10, :cond_b

    const/4 v8, 0x1

    goto :goto_7

    :cond_b
    const/4 v8, 0x0

    :goto_7
    and-int/lit8 v10, v3, 0x1

    invoke-virtual {v9, v10, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_31

    const/16 v16, 0x0

    if-eqz v6, :cond_c

    move-object/from16 v18, v16

    goto :goto_8

    :cond_c
    move-object/from16 v18, v7

    :goto_8
    invoke-static {v1}, Lw41/b;->a(Lw41/z;)Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object v6

    instance-of v7, v1, Lw41/z$a;

    if-eqz v7, :cond_e

    move-object v8, v1

    check-cast v8, Lw41/z$a;

    invoke-virtual {v8}, Lw41/z$a;->c()Lw41/w;

    move-result-object v8

    if-eqz v8, :cond_d

    invoke-static {v8}, Lw41/p;->a(Lw41/w;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v8

    if-nez v8, :cond_f

    :cond_d
    invoke-virtual {v6}, Lcom/google/android/gms/maps/model/LatLngBounds;->f()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v8

    goto :goto_9

    :cond_e
    instance-of v8, v1, Lw41/z$b;

    if-eqz v8, :cond_30

    invoke-virtual {v6}, Lcom/google/android/gms/maps/model/LatLngBounds;->f()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v8

    :cond_f
    :goto_9
    if-eqz v7, :cond_10

    const/high16 v10, 0x41800000    # 16.0f

    goto :goto_a

    :cond_10
    const/high16 v10, 0x41500000    # 13.0f

    :goto_a
    invoke-static {}, Lx81/e;->p()Lp1/t1;

    move-result-object v13

    invoke-virtual {v9, v13}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v15, "start-activity-revamp"

    invoke-interface {v13, v15}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v15

    if-eqz v18, :cond_11

    const/4 v13, 0x1

    goto :goto_b

    :cond_11
    const/4 v13, 0x0

    :goto_b
    invoke-static {v1, v15, v13}, Lx41/i;->a(Lw41/z;ZZ)Lw41/x;

    move-result-object v17

    const/4 v12, 0x3

    if-eqz v17, :cond_12

    invoke-static/range {v17 .. v17}, Lw41/m;->d(Lw41/x;)Ll0/k1;

    move-result-object v17

    if-eqz v17, :cond_12

    move-object/from16 v27, v17

    goto :goto_c

    :cond_12
    const/4 v11, 0x0

    invoke-static {v11, v11, v12}, Landroidx/compose/foundation/layout/a;->a(FFI)Ll0/l1;

    move-result-object v11

    move-object/from16 v27, v11

    :goto_c
    if-eqz v18, :cond_13

    invoke-virtual/range {v18 .. v18}, Lw41/f;->a()Leu/g;

    move-result-object v11

    goto :goto_d

    :cond_13
    move-object/from16 v11, v16

    :goto_d
    if-nez v11, :cond_14

    const v11, -0x51d94d24

    invoke-virtual {v9, v11}, Lp1/q;->e0(I)V

    new-instance v11, Ld0/w1;

    invoke-direct {v11, v8, v10, v4}, Ld0/w1;-><init>(Ljava/lang/Object;FI)V

    const v4, -0x71e929de

    invoke-virtual {v9, v4}, Lp1/q;->f0(I)V

    move v4, v7

    sget-object v7, Leu/g;->h:Lp0/n0;

    move-object/from16 v17, v6

    const/4 v12, 0x0

    new-array v6, v12, [Ljava/lang/Object;

    move-object/from16 v20, v8

    new-instance v8, Lw41/k$a;

    invoke-direct {v8, v11}, Lw41/k$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    move/from16 v21, v10

    const/16 v10, 0x48

    const/4 v11, 0x0

    move/from16 v26, v4

    move v4, v12

    move-object/from16 v12, v17

    move-object/from16 v33, v20

    invoke-static/range {v6 .. v11}, Ly1/k;->e([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    move-result-object v6

    move-object v11, v6

    check-cast v11, Leu/g;

    invoke-virtual {v9, v4}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v4}, Lp1/q;->q(Z)V

    :goto_e
    move-object v7, v11

    goto :goto_f

    :cond_14
    move-object v12, v6

    move/from16 v26, v7

    move-object/from16 v33, v8

    move/from16 v21, v10

    const/4 v4, 0x0

    const v6, -0x51d95161

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v4}, Lp1/q;->q(Z)V

    goto :goto_e

    :goto_f
    and-int/lit16 v6, v3, 0x1c00

    const/16 v8, 0x800

    if-ne v6, v8, :cond_15

    const/4 v11, 0x1

    goto :goto_10

    :cond_15
    move v11, v4

    :goto_10
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-nez v11, :cond_16

    if-ne v8, v10, :cond_17

    :cond_16
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v8}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v8

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v8, Lp1/c1;

    invoke-static/range {v21 .. v21}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    const/16 v4, 0x800

    if-ne v6, v4, :cond_18

    const/4 v4, 0x1

    goto :goto_11

    :cond_18
    const/4 v4, 0x0

    :goto_11
    invoke-virtual {v9, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v4, v6

    invoke-virtual {v9, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v4, v6

    move-object/from16 v6, v33

    invoke-virtual {v9, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    or-int v4, v4, v17

    move/from16 v0, v21

    invoke-virtual {v9, v0}, Lp1/q;->d(F)Z

    move-result v17

    or-int v4, v4, v17

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v4, :cond_1a

    if-ne v0, v10, :cond_19

    goto :goto_12

    :cond_19
    move-object v8, v7

    move-object/from16 v7, v18

    goto :goto_13

    :cond_1a
    :goto_12
    new-instance v17, Lw41/k$b;

    const/16 v23, 0x0

    move-object/from16 v20, v6

    move-object/from16 v19, v7

    move-object/from16 v22, v8

    invoke-direct/range {v17 .. v23}, Lw41/k$b;-><init>(Lw41/f;Leu/g;Lcom/google/android/gms/maps/model/LatLng;FLp1/c1;Lq83/d;)V

    move-object/from16 v0, v17

    move-object/from16 v7, v18

    move-object/from16 v8, v19

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_13
    check-cast v0, Lc93/m;

    shr-int/lit8 v4, v3, 0x9

    and-int/lit8 v4, v4, 0xe

    invoke-static {v7, v6, v11, v0, v9}, Lp1/x;->i(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_1b

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    check-cast v0, Lp1/c1;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v10, :cond_1c

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v6}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v6

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    check-cast v6, Lp1/c1;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v10, :cond_1d

    invoke-static/range {v16 .. v16}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v11

    invoke-virtual {v9, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v11, Lp1/c1;

    if-eqz v26, :cond_1e

    move-object/from16 v17, v1

    check-cast v17, Lw41/z$a;

    goto :goto_14

    :cond_1e
    move-object/from16 v17, v16

    :goto_14
    if-eqz v15, :cond_1f

    if-eqz v17, :cond_1f

    const/16 v18, 0x1

    :goto_15
    move-object/from16 v19, v8

    goto :goto_16

    :cond_1f
    const/16 v18, 0x0

    goto :goto_15

    :goto_16
    invoke-static/range {v18 .. v18}, Lx41/h;->k(Z)I

    move-result v8

    move/from16 v20, v4

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v10, :cond_20

    invoke-static {v9}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v4

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    check-cast v4, Lbc3/c0;

    move-object/from16 v21, v4

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v10, :cond_21

    new-instance v4, Lw41/l;

    const/4 v5, 0x3

    invoke-direct {v4, v0, v5}, Lw41/l;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_21
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v10, :cond_22

    new-instance v5, Lw41/l;

    move-object/from16 p3, v0

    const/4 v0, 0x4

    invoke-direct {v5, v6, v0}, Lw41/l;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v9, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_17

    :cond_22
    move-object/from16 p3, v0

    :goto_17
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_23

    new-instance v0, Lw41/l;

    move-object/from16 v22, v4

    const/4 v4, 0x5

    invoke-direct {v0, v11, v4}, Lw41/l;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_18

    :cond_23
    move-object/from16 v22, v4

    :goto_18
    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/high16 v4, 0x6d80000

    or-int v4, v20, v4

    move-object/from16 v20, v0

    and-int/lit16 v0, v3, 0x380

    or-int/2addr v4, v0

    sget-object v23, Leu/g;->h:Lp0/n0;

    const v23, 0x8000

    or-int v4, v4, v23

    move-object/from16 v14, v20

    move-object/from16 v20, v11

    move-object v11, v14

    move-object v14, v12

    move-object/from16 v34, v21

    move/from16 v21, v0

    move-object v12, v9

    move-object v0, v10

    move-object/from16 v9, v22

    move-object v10, v5

    move/from16 v22, v13

    move/from16 v5, p2

    move v13, v4

    move-object/from16 v4, v17

    move/from16 v17, v3

    move-object v3, v7

    move-object/from16 v7, v19

    move-object/from16 v19, v6

    move/from16 v6, v18

    move/from16 v18, v15

    const/4 v15, 0x0

    invoke-static/range {v3 .. v13}, Lx41/g;->e(Lw41/f;Lw41/z$a;ZZLeu/g;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v33, v3

    move v13, v5

    move v3, v8

    move-object v9, v12

    move-object v8, v7

    sget-object v5, Lb2/t;->w:Lb2/t;

    if-eqz p4, :cond_24

    invoke-static {v5}, Lgb1/b0;->d0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    goto :goto_19

    :cond_24
    move-object v7, v5

    :goto_19
    invoke-interface {v7, v2}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v10, Lb2/e;->w:Lb2/m;

    invoke-static {v10, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v10

    iget-wide v11, v9, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v9, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v23, La3/l;->a:La3/k;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v2, v9, Lp1/q;->S:Z

    if-eqz v2, :cond_25

    invoke-virtual {v9, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1a

    :cond_25
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_1a
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v9, v2, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v9, v2, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-nez v10, :cond_26

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_27

    :cond_26
    invoke-static {v11, v9, v11, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_27
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v9, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    instance-of v2, v1, Lw41/z$b;

    if-eqz v2, :cond_28

    const v7, -0x35e36ba3

    invoke-virtual {v9, v7}, Lp1/q;->e0(I)V

    const/16 v7, 0x40

    invoke-static {v14, v8, v9, v7}, Lw41/c;->b(Lcom/google/android/gms/maps/model/LatLngBounds;Leu/g;Landroidx/compose/runtime/Composer;I)V

    const/4 v12, 0x0

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    move-object v15, v9

    move v9, v3

    move-object v3, v15

    move/from16 v23, v2

    move-object v15, v4

    move-object v2, v5

    move-object/from16 v25, v14

    move v14, v6

    move/from16 v6, v18

    goto/16 :goto_1c

    :cond_28
    if-eqz v26, :cond_2f

    const v7, -0x35e3550e    # -2566844.5f

    invoke-virtual {v9, v7}, Lp1/q;->e0(I)V

    move-object v7, v8

    move v8, v3

    move-object v3, v1

    check-cast v3, Lw41/z$a;

    move-object v10, v4

    invoke-static/range {p3 .. p3}, Lw41/k;->B(Lp1/c1;)Z

    move-result v4

    move-object v11, v5

    invoke-static/range {v19 .. v19}, Lw41/k;->D(Lp1/c1;)Z

    move-result v5

    invoke-static/range {v20 .. v20}, Lw41/k;->q(Lp1/c1;)Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object v12

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-ne v15, v0, :cond_29

    new-instance v15, Lw41/l;

    move/from16 v23, v2

    const/4 v2, 0x6

    move-object/from16 v25, v14

    move-object/from16 v14, v20

    invoke-direct {v15, v14, v2}, Lw41/l;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v9, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_1b

    :cond_29
    move/from16 v23, v2

    move-object/from16 v25, v14

    move-object/from16 v14, v20

    :goto_1b
    check-cast v15, Lkotlin/jvm/functions/Function1;

    and-int/lit8 v2, v17, 0xe

    const v17, 0xc08000

    or-int v2, v2, v17

    move-object/from16 v20, v12

    move v12, v2

    move-object v2, v11

    move-object v11, v9

    move-object/from16 v9, v20

    move-object/from16 v20, v15

    move-object v15, v10

    move-object/from16 v10, v20

    move-object/from16 v20, v14

    move v14, v6

    move/from16 v6, v18

    invoke-static/range {v3 .. v12}, Lx41/g;->i(Lw41/z$a;ZZZLeu/g;ILcom/google/android/gms/maps/model/LatLngBounds;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move v9, v8

    move-object v3, v11

    const/4 v12, 0x0

    move-object v8, v7

    invoke-virtual {v3, v12}, Lp1/q;->q(Z)V

    :goto_1c
    if-eqz v6, :cond_2a

    if-eqz v26, :cond_2a

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    goto :goto_1d

    :cond_2a
    move-object v5, v2

    :goto_1d
    invoke-static {v5}, Lgb1/b0;->d0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    new-instance v4, Lwp/g;

    sget-object v5, Lw41/k;->a:Lp1/t1;

    invoke-virtual {v3, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-direct {v4, v5}, Lwp/g;-><init>(Ljava/lang/String;)V

    if-eqz v23, :cond_2b

    move-object/from16 v5, v25

    goto :goto_1e

    :cond_2b
    move-object/from16 v5, v16

    :goto_1e
    invoke-static {v1}, Lw41/q;->a(Lw41/z;)Z

    move-result v7

    new-instance v10, Leu/z;

    const/16 v11, 0x18b

    invoke-direct {v10, v7, v5, v4, v11}, Leu/z;-><init>(ZLcom/google/android/gms/maps/model/LatLngBounds;Lwp/g;I)V

    move/from16 v11, v22

    invoke-static {v13, v1, v6, v11}, Lw41/q;->b(ZLw41/z;ZZ)Leu/d0;

    move-result-object v16

    invoke-virtual {v3, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    move/from16 v5, v21

    const/16 v6, 0x100

    if-ne v5, v6, :cond_2c

    const/16 v28, 0x1

    goto :goto_1f

    :cond_2c
    const/16 v28, 0x0

    :goto_1f
    or-int v4, v4, v28

    move-object/from16 v6, v34

    invoke-virtual {v3, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v3, v14}, Lp1/q;->h(Z)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v3, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v3, v9}, Lp1/q;->e(I)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_2d

    if-ne v5, v0, :cond_2e

    :cond_2d
    move-object v11, v3

    goto :goto_20

    :cond_2e
    move-object v0, v3

    move-object/from16 v18, v10

    goto :goto_21

    :goto_20
    new-instance v3, Lw41/i;

    move-object/from16 v18, v10

    move-object v0, v11

    move v5, v13

    move v7, v14

    move-object v4, v15

    move-object/from16 v11, v19

    move-object/from16 v12, v20

    move-object/from16 v10, p3

    invoke-direct/range {v3 .. v12}, Lw41/i;-><init>(Lw41/z$a;ZLbc3/c0;ZLeu/g;ILp1/c1;Lp1/c1;Lp1/c1;)V

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v5, v3

    :goto_21
    move-object/from16 v24, v5

    check-cast v24, Lc93/a;

    new-instance v3, Lw41/j;

    invoke-direct {v3, v1}, Lw41/j;-><init>(Lw41/z;)V

    const v4, -0x39bc6d3e

    invoke-static {v4, v0, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v28

    const/high16 v31, 0x30000

    const/16 v32, 0x37ac

    const/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const v30, 0x8040

    move-object/from16 v29, v0

    move-object v15, v2

    move-object/from16 v19, v16

    move-object/from16 v16, v8

    invoke-static/range {v15 .. v32}, Lx30/s0;->c(Landroidx/compose/ui/Modifier;Leu/g;Lc93/a;Leu/z;Leu/d0;Leu/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ll0/k1;Lc93/m;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v29

    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    move-object/from16 v4, v33

    goto :goto_22

    :cond_2f
    const v0, -0x35e370a0    # -2565080.0f

    const/4 v12, 0x0

    invoke-static {v0, v9, v12}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_30
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_31
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v4, v7

    :goto_22
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_32

    new-instance v0, Lw41/h;

    const/4 v8, 0x1

    move-object/from16 v2, p1

    move/from16 v3, p2

    move/from16 v5, p4

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lw41/h;-><init>(Lw41/z;Landroidx/compose/ui/Modifier;ZLw41/f;ZIII)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_32
    return-void
.end method

.method private static final o(Lcom/google/android/gms/maps/model/LatLng;FLeu/g;)Ll83/a0;
    .locals 2

    const-string v0, "$this$rememberCameraPositionState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/maps/model/CameraPosition;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1, v1}, Lcom/google/android/gms/maps/model/CameraPosition;-><init>(Lcom/google/android/gms/maps/model/LatLng;FFF)V

    invoke-virtual {p2, v0}, Leu/g;->d(Lcom/google/android/gms/maps/model/CameraPosition;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final q(Lp1/c1;)Lcom/google/android/gms/maps/model/LatLngBounds;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lcom/google/android/gms/maps/model/LatLngBounds;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/maps/model/LatLngBounds;

    return-object p0
.end method

.method private static final r(Lp1/c1;Lcom/google/android/gms/maps/model/LatLngBounds;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lcom/google/android/gms/maps/model/LatLngBounds;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final s(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lw41/k;->C(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lw41/k;->p(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lp1/c1;Lcom/google/android/gms/maps/model/LatLngBounds;)Ll83/a0;
    .locals 0

    if-eqz p1, :cond_0

    invoke-static {p0, p1}, Lw41/k;->r(Lp1/c1;Lcom/google/android/gms/maps/model/LatLngBounds;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lp1/c1;Lcom/google/android/gms/maps/model/LatLngBounds;)Ll83/a0;
    .locals 1

    const-string v0, "fittedBounds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lw41/k;->r(Lp1/c1;Lcom/google/android/gms/maps/model/LatLngBounds;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lw41/z$a;ZLbc3/c0;ZLeu/g;ILp1/c1;Lp1/c1;Lp1/c1;)Z
    .locals 10

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    new-instance v0, Lw41/k$c;

    const/4 v9, 0x0

    move-object v1, p0

    move v2, p1

    move v3, p3

    move-object v4, p4

    move v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v9}, Lw41/k$c;-><init>(Lw41/z$a;ZZLeu/g;ILp1/c1;Lp1/c1;Lp1/c1;Lq83/d;)V

    const/4 p0, 0x3

    const/4 p1, 0x0

    invoke-static {p2, p1, p1, v0, p0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final x(Lw41/z;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 4

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_3

    instance-of p2, p0, Lw41/z$b;

    if-eqz p2, :cond_1

    const p2, 0x43a9f424

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    check-cast p0, Lw41/z$b;

    invoke-static {p0, p1, v3}, Lw41/a0;->b(Lw41/z$b;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, v3}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_1
    instance-of p2, p0, Lw41/z$a;

    if-eqz p2, :cond_2

    const p2, 0x43a9fe02

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    check-cast p0, Lw41/z$a;

    invoke-static {p0, p1, v3}, Lx41/a;->b(Lw41/z$a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, v3}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_2
    const p0, 0x43a9ecbf

    invoke-static {p0, p1, v3}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0

    :cond_3
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lw41/z;Landroidx/compose/ui/Modifier;ZLw41/f;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lw41/k;->n(Lw41/z;Landroidx/compose/ui/Modifier;ZLw41/f;ZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method
