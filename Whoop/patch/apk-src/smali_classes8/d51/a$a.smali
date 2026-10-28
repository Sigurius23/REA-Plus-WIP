.class public final Ld51/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld51/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J3\u0010\u000c\u001a\u00020\u000b2\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J=\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u000fH\u0007\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Ld51/a$a;",
        "",
        "<init>",
        "()V",
        "",
        "",
        "transformations",
        "",
        "widthPx",
        "heightPx",
        "radiusPx",
        "Li2/s0;",
        "c",
        "(Ljava/util/List;III)Li2/s0;",
        "segmentCount",
        "",
        "d",
        "(I)D",
        "arcIndex",
        "Ld51/f;",
        "center",
        "a",
        "(IIILd51/f;Ljava/util/List;)Ld51/f;",
        "arcPoint",
        "tangentCoefficient",
        "Ld51/c;",
        "b",
        "(Ld51/f;Ld51/f;D)Ld51/c;",
        "design_release"
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
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ld51/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(IIILd51/f;Ljava/util/List;)Ld51/f;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III",
            "Ld51/f;",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;)",
            "Ld51/f;"
        }
    .end annotation

    const-string v0, "center"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transformations"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-double v0, p1

    const-wide v2, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr v0, v2

    const/4 v2, 0x2

    int-to-double v2, v2

    mul-double/2addr v0, v2

    int-to-double v2, p2

    div-double/2addr v0, v2

    new-instance p2, Ld51/f;

    int-to-double v2, p3

    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    mul-double/2addr v4, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v0

    mul-double/2addr v0, v2

    invoke-direct {p2, v4, v5, v0, v1}, Ld51/f;-><init>(DD)V

    invoke-virtual {p4, p2}, Ld51/f;->g(Ld51/f;)Ld51/f;

    move-result-object p2

    invoke-virtual {p2, p4}, Ld51/f;->d(Ld51/f;)Ld51/f;

    move-result-object p3

    invoke-virtual {p3}, Ld51/f;->e()Ld51/f;

    move-result-object p3

    invoke-static {p1, p5}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    if-eqz p1, :cond_0

    :goto_0
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    goto :goto_1

    :cond_0
    invoke-static {p5}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_1
    invoke-virtual {p3, p1}, Ld51/f;->i(F)Ld51/f;

    move-result-object p1

    invoke-virtual {p2, p1}, Ld51/f;->g(Ld51/f;)Ld51/f;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ld51/f;Ld51/f;D)Ld51/c;
    .locals 2

    const-string v0, "center"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arcPoint"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ld51/f;->d(Ld51/f;)Ld51/f;

    move-result-object p1

    invoke-virtual {p1}, Ld51/f;->f()Ld51/f;

    move-result-object v0

    invoke-virtual {v0}, Ld51/f;->e()Ld51/f;

    move-result-object v0

    invoke-virtual {v0, p3, p4}, Ld51/f;->h(D)Ld51/f;

    move-result-object p3

    invoke-virtual {p1}, Ld51/f;->c()D

    move-result-wide v0

    invoke-virtual {p3, v0, v1}, Ld51/f;->h(D)Ld51/f;

    move-result-object p1

    new-instance p3, Ld51/c;

    invoke-virtual {p2, p1}, Ld51/f;->d(Ld51/f;)Ld51/f;

    move-result-object p4

    invoke-virtual {p2, p1}, Ld51/f;->g(Ld51/f;)Ld51/f;

    move-result-object p1

    invoke-direct {p3, p4, p1}, Ld51/c;-><init>(Ld51/f;Ld51/f;)V

    return-object p3
.end method

.method public final c(Ljava/util/List;III)Li2/s0;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;III)",
            "Li2/s0;"
        }
    .end annotation

    move-object/from16 v5, p1

    const-string v0, "transformations"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    move-object v6, v5

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v0

    move-object/from16 v7, p0

    invoke-virtual {v7, v0}, Ld51/a$a;->d(I)D

    move-result-wide v8

    new-instance v4, Ld51/f;

    move/from16 v0, p2

    int-to-double v0, v0

    const/4 v2, 0x2

    int-to-double v2, v2

    div-double/2addr v0, v2

    move/from16 v10, p3

    int-to-double v10, v10

    div-double/2addr v10, v2

    invoke-direct {v4, v0, v1, v10, v11}, Ld51/f;-><init>(DD)V

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v10

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v11

    if-ltz v11, :cond_2

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    move-object v12, v0

    sget-object v0, Ld51/a;->a:Ld51/a$a;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v2

    move/from16 v3, p4

    invoke-virtual/range {v0 .. v5}, Ld51/a$a;->a(IIILd51/f;Ljava/util/List;)Ld51/f;

    move-result-object v2

    invoke-virtual {v0, v4, v2, v8, v9}, Ld51/a$a;->b(Ld51/f;Ld51/f;D)Ld51/c;

    move-result-object v0

    if-nez v1, :cond_0

    invoke-virtual {v2}, Ld51/f;->a()D

    move-result-wide v12

    double-to-float v3, v12

    invoke-virtual {v2}, Ld51/f;->b()D

    move-result-wide v12

    double-to-float v2, v12

    invoke-virtual {v10, v3, v2}, Li2/j;->i(FF)V

    goto :goto_1

    :cond_0
    if-eqz v12, :cond_1

    invoke-virtual {v12}, Ld51/c;->b()Ld51/f;

    move-result-object v3

    invoke-virtual {v3}, Ld51/f;->a()D

    move-result-wide v13

    double-to-float v3, v13

    invoke-virtual {v12}, Ld51/c;->b()Ld51/f;

    move-result-object v5

    invoke-virtual {v5}, Ld51/f;->b()D

    move-result-wide v12

    double-to-float v5, v12

    invoke-virtual {v0}, Ld51/c;->a()Ld51/f;

    move-result-object v12

    invoke-virtual {v12}, Ld51/f;->a()D

    move-result-wide v12

    double-to-float v12, v12

    invoke-virtual {v0}, Ld51/c;->a()Ld51/f;

    move-result-object v13

    invoke-virtual {v13}, Ld51/f;->b()D

    move-result-wide v13

    double-to-float v13, v13

    invoke-virtual {v2}, Ld51/f;->a()D

    move-result-wide v14

    double-to-float v14, v14

    move/from16 v16, v3

    invoke-virtual {v2}, Ld51/f;->b()D

    move-result-wide v2

    double-to-float v2, v2

    iget-object v15, v10, Li2/j;->a:Landroid/graphics/Path;

    move/from16 v21, v2

    move/from16 v17, v5

    move/from16 v18, v12

    move/from16 v19, v13

    move/from16 v20, v14

    invoke-virtual/range {v15 .. v21}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    :cond_1
    :goto_1
    if-eq v1, v11, :cond_2

    add-int/lit8 v1, v1, 0x1

    move-object/from16 v5, p1

    goto :goto_0

    :cond_2
    invoke-virtual {v10}, Li2/j;->f()V

    return-object v10

    :cond_3
    move-object/from16 v7, p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "transformations must not be empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d(I)D
    .locals 4

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    int-to-double v2, p1

    mul-double/2addr v2, v0

    const-wide v0, 0x400921fb54442d18L    # Math.PI

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->tan(D)D

    move-result-wide v0

    const-wide v2, 0x3ff5555555555555L    # 1.3333333333333333

    mul-double/2addr v0, v2

    return-wide v0
.end method
