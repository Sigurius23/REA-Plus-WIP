.class public final Lbd1/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Lbd1/n;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ3\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00022\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0017\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lbd1/m;",
        "Lm91/f;",
        "Lbd1/n;",
        "<init>",
        "()V",
        "Lny0/q;",
        "type",
        "",
        "i",
        "(Lny0/q;)Ljava/lang/String;",
        "",
        "enabled",
        "h",
        "(Z)Ljava/lang/String;",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "d",
        "(Landroidx/compose/ui/Modifier;Lbd1/n;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "design-showcase_release"
    }
    k = 0x1
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

.method public static synthetic a(Lbd1/m;Landroidx/compose/ui/Modifier;Lbd1/n;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lbd1/m;->g(Lbd1/m;Landroidx/compose/ui/Modifier;Lbd1/n;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lbd1/m;->f()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lbd1/n;Lbd1/m;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lbd1/m;->e(Lbd1/n;Lbd1/m;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lbd1/n;Lbd1/m;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 32

    move-object/from16 v0, p1

    const-string v1, "$this$GalleryColumnCard"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p4, 0x11

    const/16 v2, 0x10

    const/4 v3, 0x1

    if-eq v1, v2, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, p4, 0x1

    move-object/from16 v9, p3

    check-cast v9, Lp1/q;

    invoke-virtual {v9, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual/range {p0 .. p0}, Lbd1/n;->a()Lny0/o;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lbd1/n;->a()Lny0/o;

    move-result-object v1

    invoke-virtual {v1}, Lny0/o;->m()Lny0/q;

    move-result-object v1

    invoke-direct {v0, v1}, Lbd1/m;->i(Lny0/q;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lbd1/n;->a()Lny0/o;

    move-result-object v2

    invoke-virtual {v2}, Lny0/o;->k()Z

    move-result v2

    invoke-direct {v0, v2}, Lbd1/m;->h(Z)Ljava/lang/String;

    move-result-object v2

    const-string v5, " "

    invoke-static {v1, v5, v2}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_1

    new-instance v1, Lb1/h;

    const/16 v2, 0x1a

    invoke-direct {v1, v2}, Lb1/h;-><init>(I)V

    invoke-virtual {v9, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v8, v1

    check-cast v8, Lc93/a;

    sget v1, Lny0/o;->k:I

    or-int/lit16 v10, v1, 0x6000

    const/16 v11, 0xc

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v11}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float v2, v1, v1

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v9, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lbd1/n;->a()Lny0/o;

    move-result-object v2

    invoke-virtual {v2}, Lny0/o;->m()Lny0/q;

    move-result-object v2

    invoke-direct {v0, v2}, Lbd1/m;->i(Lny0/q;)Ljava/lang/String;

    move-result-object v2

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v5, v9, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v7

    const/16 v27, 0x0

    const v28, 0x1fffa

    move-object v10, v5

    const/4 v5, 0x0

    move v11, v6

    move-wide v6, v7

    move-object/from16 v25, v9

    const-wide/16 v8, 0x0

    move-object v12, v10

    const/4 v10, 0x0

    move v13, v11

    const/4 v11, 0x0

    move-object v14, v12

    const/4 v12, 0x0

    move/from16 v16, v13

    move-object v15, v14

    const-wide/16 v13, 0x0

    move-object/from16 v17, v15

    const/4 v15, 0x0

    move/from16 v18, v16

    const/16 v16, 0x0

    move-object/from16 v19, v17

    move/from16 v20, v18

    const-wide/16 v17, 0x0

    move-object/from16 v21, v19

    const/16 v19, 0x0

    move/from16 v22, v20

    const/16 v20, 0x0

    move-object/from16 v23, v21

    const/16 v21, 0x0

    move/from16 v24, v22

    const/16 v22, 0x0

    move-object/from16 v26, v23

    const/16 v23, 0x0

    move/from16 v29, v24

    const/16 v24, 0x0

    move-object/from16 v30, v26

    const/16 v26, 0x0

    move/from16 v31, v29

    move/from16 v29, v1

    move-object v1, v4

    move-object v4, v2

    move-object/from16 v2, v30

    move/from16 v30, v31

    invoke-static/range {v4 .. v28}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v25

    int-to-float v3, v3

    mul-float v3, v3, v29

    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v9, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lbd1/n;->a()Lny0/o;

    move-result-object v1

    invoke-virtual {v1}, Lny0/o;->k()Z

    move-result v1

    invoke-direct {v0, v1}, Lbd1/m;->h(Z)Ljava/lang/String;

    move-result-object v4

    move/from16 v11, v30

    invoke-virtual {v2, v9, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v6

    const-wide/16 v8, 0x0

    const/4 v11, 0x0

    invoke-static/range {v4 .. v28}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_2
    move-object/from16 v25, v9

    invoke-virtual/range {v25 .. v25}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Lbd1/m;Landroidx/compose/ui/Modifier;Lbd1/n;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Lbd1/m;->d(Landroidx/compose/ui/Modifier;Lbd1/n;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final h(Z)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_0

    const-string p1, "Enabled"

    return-object p1

    :cond_0
    const-string p1, "Disabled"

    return-object p1
.end method

.method private final i(Lny0/q;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lny0/q$c;->f:Lny0/q$c;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "Primary Small"

    return-object p1

    :cond_0
    sget-object v0, Lny0/q$b;->f:Lny0/q$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "Primary Medium"

    return-object p1

    :cond_1
    sget-object v0, Lny0/q$a;->f:Lny0/q$a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p1, "Primary Large"

    return-object p1

    :cond_2
    sget-object v0, Lny0/q$g;->f:Lny0/q$g;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string p1, "Secondary Small"

    return-object p1

    :cond_3
    sget-object v0, Lny0/q$e;->f:Lny0/q$e;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string p1, "Secondary Medium"

    return-object p1

    :cond_4
    sget-object v0, Lny0/q$d;->f:Lny0/q$d;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string p1, "Secondary Extra Small"

    return-object p1

    :cond_5
    sget-object v0, Lny0/q$f;->f:Lny0/q$f;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    const-string p1, "Secondary Medium V2"

    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Lbd1/n;

    invoke-virtual/range {p0 .. p5}, Lbd1/m;->d(Landroidx/compose/ui/Modifier;Lbd1/n;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public d(Landroidx/compose/ui/Modifier;Lbd1/n;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lbd1/n;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "modifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p4, Lp1/q;

    const v0, -0x77059ba

    invoke-virtual {p4, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x30

    if-nez v0, :cond_2

    and-int/lit8 v0, p5, 0x40

    if-nez v0, :cond_0

    invoke-virtual {p4, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/16 v0, 0x20

    goto :goto_1

    :cond_1
    const/16 v0, 0x10

    :goto_1
    or-int/2addr v0, p5

    goto :goto_2

    :cond_2
    move v0, p5

    :goto_2
    and-int/lit16 v1, p5, 0xc00

    if-nez v1, :cond_4

    invoke-virtual {p4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x800

    goto :goto_3

    :cond_3
    const/16 v1, 0x400

    :goto_3
    or-int/2addr v0, v1

    :cond_4
    and-int/lit16 v1, v0, 0x411

    const/16 v2, 0x410

    const/4 v3, 0x1

    if-eq v1, v2, :cond_5

    move v1, v3

    goto :goto_4

    :cond_5
    const/4 v1, 0x0

    :goto_4
    and-int/2addr v0, v3

    invoke-virtual {p4, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v0, Ll;

    const/4 v1, 0x5

    invoke-direct {v0, v1, p2, p0}, Ll;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v1, -0x264a25fd

    invoke-static {v1, p4, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, p4, v1}, Lbd1/k;->c(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    goto :goto_5

    :cond_6
    invoke-virtual {p4}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {p4}, Lp1/q;->u()Lp1/v1;

    move-result-object p4

    if-eqz p4, :cond_7

    new-instance v0, Lm;

    const/16 v6, 0x16

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lm;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p4, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method
