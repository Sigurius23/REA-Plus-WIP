.class public final Ll1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll1/d;

.field public static final b:F

.field public static final c:F

.field public static final d:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ll1/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll1/d;->a:Ll1/d;

    sget-object v0, Lo1/v;->a:Lo1/t;

    sget v0, Lo1/v;->e:F

    const/16 v0, 0x38

    int-to-float v0, v0

    const/16 v1, 0x280

    int-to-float v1, v1

    sput v1, Ll1/d;->b:F

    sput v0, Ll1/d;->c:F

    const/16 v0, 0x7d

    int-to-float v0, v0

    sput v0, Ll1/d;->d:F

    return-void
.end method

.method public static b(Lp1/q;)Ll0/e1;
    .locals 2

    sget-object v0, Ll0/c2;->v:Ljava/util/WeakHashMap;

    invoke-static {p0}, Ll0/e;->e(Landroidx/compose/runtime/Composer;)Ll0/c2;

    move-result-object p0

    iget-object p0, p0, Ll0/c2;->k:Ll0/w1;

    new-instance v0, Ll0/e1;

    const/16 v1, 0x30

    invoke-direct {v0, p0, v1}, Ll0/e1;-><init>(Ll0/b2;I)V

    return-object v0
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/Modifier;FFLi2/a1;JLandroidx/compose/runtime/Composer;I)V
    .locals 22

    move/from16 v8, p8

    move-object/from16 v0, p7

    check-cast v0, Lp1/q;

    const v1, -0x515137eb

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    or-int/lit16 v1, v8, 0x25b6

    and-int/lit16 v2, v1, 0x2493

    const/16 v3, 0x2492

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq v2, v3, :cond_0

    move v2, v5

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    and-int/2addr v1, v5

    invoke-virtual {v0, v1, v2}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v1, v8, 0x1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v10, p4

    move-wide/from16 v11, p5

    goto :goto_2

    :cond_2
    :goto_1
    sget v1, Lo1/v;->d:F

    sget v2, Lo1/v;->c:F

    sget-object v3, Ll1/q3;->a:Lp1/u2;

    invoke-virtual {v0, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll1/p3;

    iget-object v3, v3, Ll1/p3;->e:Lt0/a;

    sget-object v6, Lo1/v;->b:Lo1/f;

    invoke-static {v6, v0}, Ll1/n;->d(Lo1/f;Landroidx/compose/runtime/Composer;)J

    move-result-wide v6

    sget-object v9, Lb2/t;->w:Lb2/t;

    move-object v10, v3

    move-wide v11, v6

    move v3, v2

    move v2, v1

    move-object v1, v9

    :goto_2
    invoke-virtual {v0}, Lp1/q;->r()V

    const v6, 0x7f1407ca

    invoke-static {v0, v6}, Lm1/e0;->i(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    sget v9, Ll1/t3;->a:F

    invoke-static {v1, v7, v9, v5}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_3

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v9, v7, :cond_4

    :cond_3
    new-instance v9, Lht2/d;

    const/16 v7, 0xb

    invoke-direct {v9, v6, v7}, Lht2/d;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v5, v4, v9}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    new-instance v4, Ll1/c;

    invoke-direct {v4, v2, v3}, Ll1/c;-><init>(FF)V

    const v5, -0x3df6a050

    invoke-static {v5, v0, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v18

    const/high16 v20, 0xc00000

    const/16 v21, 0x78

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v19, v0

    invoke-static/range {v9 .. v21}, Ll1/c4;->a(Landroidx/compose/ui/Modifier;Li2/a1;JJFFLf0/t;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    move v4, v3

    move-object v5, v10

    move-wide v6, v11

    move v3, v2

    move-object v2, v1

    goto :goto_3

    :cond_5
    move-object/from16 v19, v0

    invoke-virtual/range {v19 .. v19}, Lp1/q;->X()V

    move-object/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-wide/from16 v6, p5

    :goto_3
    invoke-virtual/range {v19 .. v19}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_6

    new-instance v0, Ll1/b;

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v8}, Ll1/b;-><init>(Ll1/d;Landroidx/compose/ui/Modifier;FFLi2/a1;JI)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method
