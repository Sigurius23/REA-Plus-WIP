.class public abstract Lui0/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001ai\u0010\u000c\u001a\u00020\u00042\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u001c\u0010\u0005\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u00040\u00062\u001a\u0008\u0002\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0002H\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0014\u00b2\u0006\u000e\u0010\u0013\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lcom/whoop/archv2/feature/domain/p;",
        "pendingPick",
        "Lkotlin/Function2;",
        "",
        "Ll83/a0;",
        "onResult",
        "Lkotlin/Function1;",
        "onUnavailable",
        "Landroid/content/Context;",
        "Ljava/io/File;",
        "Landroid/net/Uri;",
        "captureUriFor",
        "f",
        "(Lcom/whoop/archv2/feature/domain/p;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;II)V",
        "Ltr2/n;",
        "a",
        "Ltr2/n;",
        "logger",
        "",
        "pickLaunched",
        "arch-v2_release"
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
.field private static final a:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "MediaPickEffects"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sput-object v0, Lui0/r;->a:Ltr2/n;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lcom/whoop/archv2/feature/domain/p;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lui0/r;->h(Lkotlin/jvm/functions/Function1;Lcom/whoop/archv2/feature/domain/p;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Landroid/net/Uri;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lui0/r;->i(Lkotlin/jvm/functions/Function1;Landroid/net/Uri;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/archv2/feature/domain/p;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lui0/r;->m(Lcom/whoop/archv2/feature/domain/p;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Lp1/c1;
    .locals 1

    invoke-static {}, Lui0/r;->j()Lp1/c1;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e(Lc93/m;Lcom/whoop/archv2/feature/domain/p;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lui0/r;->g(Lc93/m;Lcom/whoop/archv2/feature/domain/p;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lcom/whoop/archv2/feature/domain/p;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/archv2/feature/domain/p;",
            "Lc93/m;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/m;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    move/from16 v9, p5

    const-string v0, "onResult"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onUnavailable"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    const v0, -0x2793f212

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v9, 0x6

    const/4 v2, 0x4

    if-nez v0, :cond_2

    and-int/lit8 v0, v9, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v9

    goto :goto_2

    :cond_2
    move v0, v9

    :goto_2
    and-int/lit8 v3, v9, 0x30

    const/16 v4, 0x20

    if-nez v3, :cond_4

    invoke-virtual {v10, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    move v3, v4

    goto :goto_3

    :cond_3
    const/16 v3, 0x10

    :goto_3
    or-int/2addr v0, v3

    :cond_4
    and-int/lit16 v3, v9, 0x180

    const/16 v5, 0x100

    if-nez v3, :cond_6

    invoke-virtual {v10, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    move v3, v5

    goto :goto_4

    :cond_5
    const/16 v3, 0x80

    :goto_4
    or-int/2addr v0, v3

    :cond_6
    and-int/lit8 v3, p6, 0x8

    if-eqz v3, :cond_8

    or-int/lit16 v0, v0, 0xc00

    :cond_7
    move-object/from16 v6, p3

    goto :goto_6

    :cond_8
    and-int/lit16 v6, v9, 0xc00

    if-nez v6, :cond_7

    move-object/from16 v6, p3

    invoke-virtual {v10, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_9

    const/16 v11, 0x800

    goto :goto_5

    :cond_9
    const/16 v11, 0x400

    :goto_5
    or-int/2addr v0, v11

    :goto_6
    and-int/lit16 v11, v0, 0x493

    const/16 v12, 0x492

    const/4 v13, 0x0

    if-eq v11, v12, :cond_a

    const/4 v11, 0x1

    goto :goto_7

    :cond_a
    move v11, v13

    :goto_7
    and-int/lit8 v12, v0, 0x1

    invoke-virtual {v10, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_1f

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_c

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v11, :cond_b

    sget-object v3, Lui0/r$a;->w:Lui0/r$a;

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v3, Lj93/g;

    check-cast v3, Lc93/m;

    move-object v12, v3

    goto :goto_8

    :cond_c
    move-object v12, v6

    :goto_8
    and-int/lit8 v3, v0, 0x70

    if-ne v3, v4, :cond_d

    const/4 v3, 0x1

    goto :goto_9

    :cond_d
    move v3, v13

    :goto_9
    and-int/lit8 v4, v0, 0xe

    if-eq v4, v2, :cond_f

    and-int/lit8 v6, v0, 0x8

    if-eqz v6, :cond_e

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e

    goto :goto_a

    :cond_e
    move v6, v13

    goto :goto_b

    :cond_f
    :goto_a
    const/4 v6, 0x1

    :goto_b
    or-int/2addr v3, v6

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_10

    if-ne v6, v11, :cond_11

    :cond_10
    new-instance v6, Lsg2/t;

    const/16 v3, 0x1b

    invoke-direct {v6, v3, v7, v1}, Lsg2/t;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v6, Lkotlin/jvm/functions/Function1;

    and-int/lit16 v3, v0, 0x380

    if-ne v3, v5, :cond_12

    const/4 v3, 0x1

    goto :goto_c

    :cond_12
    move v3, v13

    :goto_c
    if-eq v4, v2, :cond_14

    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_13

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_13

    goto :goto_d

    :cond_13
    move v5, v13

    goto :goto_e

    :cond_14
    :goto_d
    const/4 v5, 0x1

    :goto_e
    or-int/2addr v3, v5

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_15

    if-ne v5, v11, :cond_16

    :cond_15
    new-instance v5, Lui0/q;

    invoke-direct {v5, v13, v8, v1}, Lui0/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v5, Lc93/a;

    new-instance v3, Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia;

    invoke-direct {v3}, Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia;-><init>()V

    invoke-virtual {v10, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v15, :cond_17

    if-ne v14, v11, :cond_18

    :cond_17
    new-instance v14, Lsg2/b;

    const/16 v15, 0x1a

    invoke-direct {v14, v6, v15}, Lsg2/b;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v14, Lkotlin/jvm/functions/Function1;

    invoke-static {v3, v14, v10, v13}, Lwb3/f;->a0(Lk/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lh/i;

    move-result-object v3

    shr-int/lit8 v14, v0, 0x3

    and-int/lit16 v14, v14, 0x380

    invoke-static {v6, v5, v12, v10, v14}, Lui0/c;->l(Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/m;Landroidx/compose/runtime/Composer;I)Lui0/a;

    move-result-object v6

    if-eqz v1, :cond_19

    invoke-virtual {v1}, Lcom/whoop/archv2/feature/domain/p;->d()Ljava/lang/String;

    move-result-object v14

    goto :goto_f

    :cond_19
    const/4 v14, 0x0

    :goto_f
    filled-new-array {v14}, [Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-ne v15, v11, :cond_1a

    new-instance v15, Lu91/a;

    const/16 v13, 0x16

    invoke-direct {v15, v13}, Lu91/a;-><init>(I)V

    invoke-virtual {v10, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    check-cast v15, Lc93/a;

    const/16 v13, 0x30

    invoke-static {v14, v15, v10, v13}, Ly1/k;->c([Ljava/lang/Object;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lp1/c1;

    if-eq v4, v2, :cond_1c

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_1b

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1b

    goto :goto_10

    :cond_1b
    const/16 v16, 0x0

    goto :goto_11

    :cond_1c
    :goto_10
    const/16 v16, 0x1

    :goto_11
    invoke-virtual {v10, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    or-int v0, v16, v0

    invoke-virtual {v10, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-virtual {v10, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_1d

    if-ne v2, v11, :cond_1e

    :cond_1d
    new-instance v0, Lui0/r$b;

    move-object v2, v6

    const/4 v6, 0x0

    move-object v4, v5

    move-object v5, v13

    invoke-direct/range {v0 .. v6}, Lui0/r$b;-><init>(Lcom/whoop/archv2/feature/domain/p;Lui0/a;Lh/i;Lc93/a;Lp1/c1;Lq83/d;)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v0

    :cond_1e
    check-cast v2, Lc93/m;

    sget-object v0, Lcom/whoop/navigation/models/GenericInteraction;->Companion:Lcom/whoop/navigation/models/GenericInteraction$Companion;

    invoke-static {v10, v2, v1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v4, v12

    goto :goto_12

    :cond_1f
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v4, v6

    :goto_12
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_20

    new-instance v0, Lsl0/k2;

    const/16 v7, 0xa

    move-object/from16 v2, p1

    move/from16 v6, p6

    move-object v3, v8

    move v5, v9

    invoke-direct/range {v0 .. v7}, Lsl0/k2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_20
    return-void
.end method

.method private static final g(Lc93/m;Lcom/whoop/archv2/feature/domain/p;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-interface {p0, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;Lcom/whoop/archv2/feature/domain/p;)Ll83/a0;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lkotlin/jvm/functions/Function1;Landroid/net/Uri;)Ll83/a0;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j()Lp1/c1;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    return-object v0
.end method

.method private static final k(Lp1/c1;)Z
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

.method private static final l(Lp1/c1;Z)V
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

.method private static final m(Lcom/whoop/archv2/feature/domain/p;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lui0/r;->f(Lcom/whoop/archv2/feature/domain/p;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic n(Lp1/c1;)Z
    .locals 0

    invoke-static {p0}, Lui0/r;->k(Lp1/c1;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic o(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lui0/r;->l(Lp1/c1;Z)V

    return-void
.end method

.method public static final synthetic p()Ltr2/n;
    .locals 1

    sget-object v0, Lui0/r;->a:Ltr2/n;

    return-object v0
.end method
