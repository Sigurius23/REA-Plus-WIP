.class public final Lkz2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Ld11/i;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lkz2/e;",
        "Lm91/f;",
        "Ld11/i;",
        "<init>",
        "()V",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "d",
        "(Landroidx/compose/ui/Modifier;Ld11/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Ld11/d;",
        "a",
        "Ld11/d;",
        "ctaTileItem",
        "whooplabs_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:I


# instance fields
.field private final a:Ld11/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ld11/d;->a:I

    sput v0, Lkz2/e;->b:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ld11/d;

    invoke-direct {v0}, Ld11/d;-><init>()V

    iput-object v0, p0, Lkz2/e;->a:Ld11/d;

    return-void
.end method

.method public static synthetic a(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Lkz2/e;->e(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lmh/h;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkz2/e;->f(Lmh/h;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkz2/e;Landroidx/compose/ui/Modifier;Ld11/i;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lkz2/e;->g(Lkz2/e;Landroidx/compose/ui/Modifier;Ld11/i;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Ly81/i;)Li2/t;
    .locals 4

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Li2/t;->b:Li2/s;

    const v0, 0x33101518

    invoke-static {v0}, Li2/w0;->c(I)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-static {v0}, Li2/w0;->c(I)J

    move-result-wide v0

    new-instance v2, Li2/x;

    invoke-direct {v2, v0, v1}, Li2/x;-><init>(J)V

    filled-new-array {v3, v2}, [Li2/x;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {p0, v0, v1, v1, v2}, Li2/s;->a(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lmh/h;)Ll83/a0;
    .locals 1

    const-string v0, "$this$copy"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lmh/h;->b()V

    const/16 v0, 0x1f4

    invoke-virtual {p0, v0}, Lmh/h;->c(I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lkz2/e;Landroidx/compose/ui/Modifier;Ld11/i;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Lkz2/e;->d(Landroidx/compose/ui/Modifier;Ld11/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Ld11/i;

    invoke-virtual/range {p0 .. p5}, Lkz2/e;->d(Landroidx/compose/ui/Modifier;Ld11/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public d(Landroidx/compose/ui/Modifier;Ld11/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 39
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ld11/i;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v0, p3

    move/from16 v4, p5

    const-string v5, "modifier"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "itemState"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "onViewEvent"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v5, p4

    check-cast v5, Lp1/q;

    const v6, -0x7c454a81

    invoke-virtual {v5, v6}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v6, v4, 0x6

    const/4 v7, 0x2

    const/4 v8, 0x4

    if-nez v6, :cond_1

    invoke-virtual {v5, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    move v6, v8

    goto :goto_0

    :cond_0
    move v6, v7

    :goto_0
    or-int/2addr v6, v4

    goto :goto_1

    :cond_1
    move v6, v4

    :goto_1
    and-int/lit8 v9, v4, 0x30

    if-nez v9, :cond_4

    and-int/lit8 v9, v4, 0x40

    if-nez v9, :cond_2

    invoke-virtual {v5, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    goto :goto_2

    :cond_2
    invoke-virtual {v5, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    :goto_2
    if-eqz v9, :cond_3

    const/16 v9, 0x20

    goto :goto_3

    :cond_3
    const/16 v9, 0x10

    :goto_3
    or-int/2addr v6, v9

    :cond_4
    and-int/lit16 v9, v4, 0x180

    if-nez v9, :cond_6

    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    const/16 v9, 0x100

    goto :goto_4

    :cond_5
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v6, v9

    :cond_6
    and-int/lit16 v9, v4, 0xc00

    if-nez v9, :cond_9

    and-int/lit16 v9, v4, 0x1000

    if-nez v9, :cond_7

    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    goto :goto_5

    :cond_7
    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    :goto_5
    if-eqz v9, :cond_8

    const/16 v9, 0x800

    goto :goto_6

    :cond_8
    const/16 v9, 0x400

    :goto_6
    or-int/2addr v6, v9

    :cond_9
    and-int/lit16 v9, v6, 0x493

    const/16 v10, 0x492

    if-eq v9, v10, :cond_a

    const/4 v9, 0x1

    goto :goto_7

    :cond_a
    const/4 v9, 0x0

    :goto_7
    and-int/lit8 v10, v6, 0x1

    invoke-virtual {v5, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_d

    iget-object v9, v1, Lkz2/e;->a:Ld11/d;

    const/16 v10, 0x1e

    int-to-float v10, v10

    int-to-float v8, v8

    mul-float/2addr v10, v8

    const/4 v8, 0x0

    invoke-static {v2, v10, v8, v7}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v35

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v7, v8, :cond_b

    new-instance v7, Lkx1/b;

    const/4 v10, 0x3

    invoke-direct {v7, v10}, Lkx1/b;-><init>(I)V

    invoke-virtual {v5, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v7}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v23

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v8, :cond_c

    new-instance v7, Lkx1/b;

    const/4 v8, 0x4

    invoke-direct {v7, v8}, Lkx1/b;-><init>(I)V

    invoke-virtual {v5, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object v14, v7

    check-cast v14, Lkotlin/jvm/functions/Function1;

    const v33, 0x1bf7fbff

    const/16 v34, 0x0

    const/4 v4, 0x0

    move-object v7, v5

    const/4 v5, 0x0

    move v8, v6

    const/4 v6, 0x0

    move-object v10, v7

    const/4 v7, 0x0

    move v11, v8

    const/4 v8, 0x0

    move-object v12, v9

    const/4 v9, 0x0

    move-object v13, v10

    const/4 v10, 0x0

    move v15, v11

    const/4 v11, 0x0

    move-object/from16 v16, v12

    const/4 v12, 0x0

    move-object/from16 v17, v13

    const/4 v13, 0x0

    move/from16 v18, v15

    const/4 v15, 0x0

    move-object/from16 v19, v16

    const/16 v16, 0x0

    move-object/from16 v20, v17

    const/16 v17, 0x0

    move/from16 v21, v18

    const/16 v18, 0x0

    move-object/from16 v22, v19

    const/16 v19, 0x0

    move-object/from16 v24, v20

    const/16 v20, 0x0

    move/from16 v25, v21

    const/16 v21, 0x0

    move-object/from16 v26, v22

    const/16 v22, 0x0

    move-object/from16 v27, v24

    const/16 v24, 0x0

    move/from16 v28, v25

    const/16 v25, 0x0

    move-object/from16 v29, v26

    const/16 v26, 0x0

    move-object/from16 v30, v27

    const/16 v27, 0x0

    move/from16 v31, v28

    const/16 v28, 0x0

    move-object/from16 v32, v29

    const/16 v29, 0x0

    move-object/from16 v36, v30

    const/high16 v30, 0x7fc00000    # Float.NaN

    move/from16 v37, v31

    const/16 v31, 0x0

    move-object/from16 v38, v32

    const/16 v32, 0x0

    move/from16 v0, v37

    invoke-static/range {v3 .. v34}, Ld11/i;->f(Ld11/i;Ljava/lang/Object;Lkd1/l;Ll3/v0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ll3/v0;Ly71/g;Lkd1/o;Lkd1/o;Lkd1/o;Lkotlin/jvm/functions/Function1;ZZLd11/a;Lk91/a;Ld11/b;ZZLd11/c;Li91/a;Lj91/b;Li2/t;FFFFFLjava/lang/Object;Lcom/whoop/navigation/e;ILjava/lang/Object;)Ld11/i;

    move-result-object v5

    sget v3, Ld11/i;->E:I

    shl-int/lit8 v3, v3, 0x3

    and-int/lit16 v0, v0, 0x380

    or-int/2addr v0, v3

    sget v3, Ld11/d;->a:I

    shl-int/lit8 v3, v3, 0x9

    or-int v8, v0, v3

    move-object/from16 v6, p3

    move-object/from16 v4, v35

    move-object/from16 v7, v36

    move-object/from16 v3, v38

    invoke-virtual/range {v3 .. v8}, Ld11/d;->d(Landroidx/compose/ui/Modifier;Ld11/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_8

    :cond_d
    move-object/from16 v36, v5

    invoke-virtual/range {v36 .. v36}, Lp1/q;->X()V

    :goto_8
    invoke-virtual/range {v36 .. v36}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_e

    new-instance v0, Lj41/a;

    const/16 v6, 0x19

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lj41/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method
