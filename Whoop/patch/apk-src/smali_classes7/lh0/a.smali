.class public final Llh0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Llh0/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0010\u00b2\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Llh0/a;",
        "Lm91/f;",
        "Llh0/b;",
        "<init>",
        "()V",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "c",
        "(Landroidx/compose/ui/Modifier;Llh0/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "",
        "showCyclingText",
        "bot_release"
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

.method public static synthetic a(Llh0/a;Landroidx/compose/ui/Modifier;Llh0/b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Llh0/a;->g(Llh0/a;Landroidx/compose/ui/Modifier;Llh0/b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llh0/a;->f(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lp1/c1;)Z
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

.method private static final e(Lp1/c1;Z)V
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

.method private static final f(Lp1/c1;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Llh0/a;->d(Lp1/c1;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {p0, v0}, Llh0/a;->e(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Llh0/a;Landroidx/compose/ui/Modifier;Llh0/b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Llh0/a;->c(Landroidx/compose/ui/Modifier;Llh0/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Llh0/b;

    invoke-virtual/range {p0 .. p5}, Llh0/a;->c(Landroidx/compose/ui/Modifier;Llh0/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public c(Landroidx/compose/ui/Modifier;Llh0/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Llh0/b;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v5, p2

    const-string v0, "modifier"

    move-object/from16 v4, p1

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemState"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    move-object/from16 v6, p3

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v1, -0x685e58bd

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p5, 0x30

    const/16 v2, 0x10

    if-nez v1, :cond_1

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x20

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int v1, p5, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p5

    :goto_1
    and-int/lit8 v3, v1, 0x11

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eq v3, v2, :cond_2

    move v2, v7

    goto :goto_2

    :cond_2
    move v2, v8

    :goto_2
    and-int/2addr v1, v7

    invoke-virtual {v0, v1, v2}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_3

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v1, Lp1/c1;

    invoke-virtual {v5}, Llh0/b;->a()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-static {v1}, Llh0/a;->d(Lp1/c1;)Z

    move-result v3

    if-eqz v3, :cond_4

    const v1, -0x7b351d8a

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {v2, v2, v0, v8, v1}, Lwl0/a;->d(Landroidx/compose/ui/Modifier;Lwl0/b;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v0, v8}, Lp1/q;->q(Z)V

    move-object v1, v0

    goto/16 :goto_5

    :cond_4
    const v3, -0x7b342b98

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    int-to-float v3, v7

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float v10, v3, v7

    const/16 v3, 0xa

    int-to-float v3, v3

    mul-float v12, v3, v7

    const/4 v13, 0x0

    const/16 v14, 0xa

    sget-object v9, Lb2/t;->w:Lb2/t;

    const/4 v11, 0x0

    invoke-static/range {v9 .. v14}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v7, 0x4

    int-to-float v7, v7

    mul-float/2addr v7, v7

    invoke-static {v7, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const-string v7, "loadingAnimation"

    invoke-static {v3, v7}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget v3, Lgy0/e;->f:I

    invoke-static {v3}, Lv41/r0$d;->b(I)I

    move-result v3

    invoke-static {v3}, Lv41/r0$d;->a(I)Lv41/r0$d;

    move-result-object v3

    invoke-virtual {v5}, Llh0/b;->a()Z

    move-result v9

    if-eqz v9, :cond_5

    const/4 v9, 0x2

    :goto_3
    move v11, v9

    goto :goto_4

    :cond_5
    const v9, 0x7fffffff

    goto :goto_3

    :goto_4
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v2, :cond_6

    new-instance v9, Ljt1/b;

    const/16 v2, 0x12

    invoke-direct {v9, v2, v1}, Ljt1/b;-><init>(ILp1/c1;)V

    invoke-virtual {v0, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v12, v9

    check-cast v12, Lc93/a;

    const v17, 0x30c06

    const/16 v18, 0x1c4

    const/4 v9, 0x0

    const/high16 v10, 0x3f000000    # 0.5f

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v16, v0

    move v0, v8

    move-object v8, v3

    invoke-static/range {v7 .. v18}, Lv41/p;->h(Landroidx/compose/ui/Modifier;Lv41/r0;ZFILc93/a;Lkotlin/jvm/functions/Function1;Ly2/k;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_7
    move-object v1, v0

    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_8

    new-instance v0, Llf0/p1;

    const/16 v2, 0x9

    move-object/from16 v3, p0

    move/from16 v1, p5

    invoke-direct/range {v0 .. v6}, Llf0/p1;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method
