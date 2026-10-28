.class public abstract Llq2/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0019\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0019\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0010\u0010\u000f\u001a\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0011\u0010\u000f\u001a\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0012\u0010\u000f\u00a8\u0006\u0013"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "Llq2/e;",
        "type",
        "g",
        "(Landroidx/compose/ui/Modifier;Llq2/e;)Landroidx/compose/ui/Modifier;",
        "Llq2/g;",
        "b",
        "(Landroidx/compose/ui/Modifier;Llq2/g;)Landroidx/compose/ui/Modifier;",
        "Llq2/t;",
        "h",
        "(Landroidx/compose/ui/Modifier;Llq2/t;)Landroidx/compose/ui/Modifier;",
        "Li2/x;",
        "color",
        "Li2/t;",
        "c",
        "(J)Li2/t;",
        "d",
        "e",
        "f",
        "user-journey_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Llq2/t;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Llq2/m;->i(Llq2/t;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Llq2/g;)Landroidx/compose/ui/Modifier;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide v0, 0xff06080eL

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Li91/c;->o(J)Li91/a;

    move-result-object v0

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v0}, Li91/c;->c(Landroidx/compose/ui/Modifier;Li91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {p1}, Llq2/g;->b()Llq2/f;

    move-result-object v1

    sget-object v2, Llq2/f;->SECONDARY:Llq2/f;

    const v3, 0x3ecccccd    # 0.4f

    invoke-virtual {p1}, Llq2/g;->d()J

    move-result-wide v4

    if-ne v1, v2, :cond_0

    invoke-static {v3, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v4

    :cond_0
    invoke-virtual {p1}, Llq2/g;->b()Llq2/f;

    move-result-object v1

    invoke-virtual {p1}, Llq2/g;->c()J

    move-result-wide v6

    if-ne v1, v2, :cond_1

    invoke-static {v3, v6, v7}, Li2/x;->c(FJ)J

    move-result-wide v6

    :cond_1
    invoke-virtual {p1}, Llq2/g;->b()Llq2/f;

    move-result-object v1

    if-ne v1, v2, :cond_2

    invoke-virtual {p1}, Llq2/g;->a()J

    move-result-wide v1

    const/high16 p1, 0x3f000000    # 0.5f

    invoke-static {p1, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    invoke-static {v1, v2}, Llq2/m;->d(J)Li2/t;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Llq2/g;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, Llq2/m;->c(J)Li2/t;

    move-result-object p1

    :goto_0
    invoke-static {v4, v5}, Llq2/m;->f(J)Li2/t;

    move-result-object v1

    invoke-static {v1}, Li91/c;->h(Li2/t;)Li91/a;

    move-result-object v1

    invoke-static {p0, v1}, Li91/c;->c(Landroidx/compose/ui/Modifier;Li91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-interface {v0, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v6, v7}, Llq2/m;->e(J)Li2/t;

    move-result-object v1

    invoke-static {v1}, Li91/c;->h(Li2/t;)Li91/a;

    move-result-object v1

    invoke-static {p0, v1}, Li91/c;->c(Landroidx/compose/ui/Modifier;Li91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-interface {v0, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {p1}, Li91/c;->h(Li2/t;)Li91/a;

    move-result-object p1

    invoke-static {p0, p1}, Li91/c;->c(Landroidx/compose/ui/Modifier;Li91/a;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-interface {v0, p1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-interface {p0, p1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final c(J)Li2/t;
    .locals 6

    sget-object v0, Li2/t;->b:Li2/s;

    new-instance v1, Li2/x;

    invoke-direct {v1, p0, p1}, Li2/x;-><init>(J)V

    sget-object p0, Ly81/f;->TRANSPARENT:Ly81/f;

    invoke-virtual {p0}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide p0

    new-instance v2, Li2/x;

    invoke-direct {v2, p0, p1}, Li2/x;-><init>(J)V

    filled-new-array {v1, v2}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/high16 p0, 0x44af0000    # 1400.0f

    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long p0, p0

    const/high16 v2, 0x45160000    # 2400.0f

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    const/16 v4, 0x20

    shl-long/2addr p0, v4

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    or-long/2addr v2, p0

    const v4, 0x44bb8000    # 1500.0f

    const/16 v5, 0x8

    invoke-static/range {v0 .. v5}, Li2/s;->g(Li2/s;Ljava/util/List;JFI)Li2/u0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(J)Li2/t;
    .locals 6

    sget-object v0, Li2/t;->b:Li2/s;

    new-instance v1, Li2/x;

    invoke-direct {v1, p0, p1}, Li2/x;-><init>(J)V

    sget-object p0, Ly81/f;->TRANSPARENT:Ly81/f;

    invoke-virtual {p0}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide p0

    new-instance v2, Li2/x;

    invoke-direct {v2, p0, p1}, Li2/x;-><init>(J)V

    filled-new-array {v1, v2}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/high16 p0, -0x3c380000    # -400.0f

    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long p0, p0

    const v2, 0x450fc000    # 2300.0f

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    const/16 v4, 0x20

    shl-long/2addr p0, v4

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    or-long/2addr v2, p0

    const v4, 0x44bb8000    # 1500.0f

    const/16 v5, 0x8

    invoke-static/range {v0 .. v5}, Li2/s;->g(Li2/s;Ljava/util/List;JFI)Li2/u0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(J)Li2/t;
    .locals 6

    sget-object v0, Li2/t;->b:Li2/s;

    new-instance v1, Li2/x;

    invoke-direct {v1, p0, p1}, Li2/x;-><init>(J)V

    sget-object p0, Ly81/f;->TRANSPARENT:Ly81/f;

    invoke-virtual {p0}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide p0

    new-instance v2, Li2/x;

    invoke-direct {v2, p0, p1}, Li2/x;-><init>(J)V

    filled-new-array {v1, v2}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const p0, 0x44d48000    # 1700.0f

    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long p0, p0

    const/high16 v2, 0x44610000    # 900.0f

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    const/16 v4, 0x20

    shl-long/2addr p0, v4

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    or-long/2addr v2, p0

    const v4, 0x44898000    # 1100.0f

    const/16 v5, 0x8

    invoke-static/range {v0 .. v5}, Li2/s;->g(Li2/s;Ljava/util/List;JFI)Li2/u0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(J)Li2/t;
    .locals 6

    sget-object v0, Li2/t;->b:Li2/s;

    new-instance v1, Li2/x;

    invoke-direct {v1, p0, p1}, Li2/x;-><init>(J)V

    sget-object p0, Ly81/f;->TRANSPARENT:Ly81/f;

    invoke-virtual {p0}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide p0

    new-instance v2, Li2/x;

    invoke-direct {v2, p0, p1}, Li2/x;-><init>(J)V

    filled-new-array {v1, v2}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/high16 p0, -0x3b9f0000    # -900.0f

    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long p0, p0

    const/high16 v2, -0x3c6a0000    # -300.0f

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    const/16 v4, 0x20

    shl-long/2addr p0, v4

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    or-long/2addr v2, p0

    const v4, 0x44bb8000    # 1500.0f

    const/16 v5, 0x8

    invoke-static/range {v0 .. v5}, Li2/s;->g(Li2/s;Ljava/util/List;JFI)Li2/u0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Landroidx/compose/ui/Modifier;Llq2/e;)Landroidx/compose/ui/Modifier;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Llq2/t;

    if-eqz v0, :cond_0

    check-cast p1, Llq2/t;

    invoke-static {p0, p1}, Llq2/m;->h(Landroidx/compose/ui/Modifier;Llq2/t;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p1, Llq2/g;

    if-eqz v0, :cond_1

    check-cast p1, Llq2/g;

    invoke-static {p0, p1}, Llq2/m;->b(Landroidx/compose/ui/Modifier;Llq2/g;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0

    :cond_1
    instance-of v0, p1, Lkr2/d;

    if-eqz v0, :cond_2

    sget-object v0, Llq2/p;->a:Llq2/p;

    check-cast p1, Lkr2/d;

    invoke-virtual {v0, p1}, Llq2/p;->e(Lkr2/d;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-interface {p0, p1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    :cond_2
    return-object p0
.end method

.method public static final h(Landroidx/compose/ui/Modifier;Llq2/t;)Landroidx/compose/ui/Modifier;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lb30/a1;

    const/16 v1, 0x1d

    invoke-direct {v0, p1, v1}, Lb30/a1;-><init>(Ljava/lang/Object;I)V

    invoke-static {p0, v0}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Llq2/t;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 17

    move-object/from16 v0, p1

    const-string v1, "$this$composed"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p2

    check-cast v1, Lp1/q;

    const v2, 0x7929a

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    move-object/from16 v2, p0

    instance-of v3, v2, Llq2/t$b;

    sget-object v4, Lb2/t;->w:Lb2/t;

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    const v2, 0x713e0847

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v5}, Lp1/q;->q(Z)V

    invoke-static {v4}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-interface {v0, v2}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    goto/16 :goto_8

    :cond_0
    const v3, 0x713fb0b6

    invoke-virtual {v1, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v1, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly3/c;

    const/16 v7, 0x96

    int-to-float v7, v7

    invoke-interface {v6, v7}, Ly3/c;->q0(F)F

    move-result v6

    invoke-virtual {v1, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ly3/c;

    const/16 v8, 0x1f4

    int-to-float v8, v8

    invoke-interface {v7, v8}, Ly3/c;->q0(F)F

    move-result v7

    invoke-virtual {v1, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ly3/c;

    const/16 v9, 0x189

    int-to-float v9, v9

    invoke-interface {v8, v9}, Ly3/c;->q0(F)F

    move-result v8

    invoke-virtual {v1, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly3/c;

    const/16 v9, 0x118

    int-to-float v9, v9

    invoke-interface {v3, v9}, Ly3/c;->q0(F)F

    move-result v3

    invoke-virtual {v2}, Llq2/t;->b()Llq2/f;

    move-result-object v9

    sget-object v10, Llq2/f;->PRIMARY:Llq2/f;

    if-ne v9, v10, :cond_1

    const/4 v9, 0x1

    goto :goto_0

    :cond_1
    move v9, v5

    :goto_0
    const/16 v10, 0xc8

    int-to-float v10, v10

    invoke-static {v10, v4}, Lds/p;->s(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v10, Li2/t;->b:Li2/s;

    if-eqz v9, :cond_2

    invoke-virtual {v2}, Llq2/t;->a()Ljava/util/List;

    move-result-object v2

    :goto_1
    move-object v11, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Llq2/t;->c()Ljava/util/List;

    move-result-object v2

    goto :goto_1

    :goto_2
    const/16 v14, 0x20

    if-eqz v9, :cond_3

    const/high16 v3, 0x7f800000    # Float.POSITIVE_INFINITY

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v15

    move/from16 p2, v3

    const/16 p0, 0x0

    int-to-long v2, v15

    invoke-static/range {p2 .. p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v15

    const-wide p2, 0xffffffffL

    int-to-long v12, v15

    shl-long/2addr v2, v14

    and-long v12, v12, p2

    or-long/2addr v2, v12

    :goto_3
    move-wide v12, v2

    goto :goto_4

    :cond_3
    const/16 p0, 0x0

    const-wide p2, 0xffffffffL

    invoke-static/range {p0 .. p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v12, v2

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    shl-long/2addr v12, v14

    and-long v2, v2, p2

    or-long/2addr v2, v12

    goto :goto_3

    :goto_4
    if-eqz v9, :cond_4

    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    :goto_5
    int-to-long v6, v6

    shl-long/2addr v2, v14

    and-long v6, v6, p2

    or-long/2addr v2, v6

    move-wide v14, v2

    goto :goto_6

    :cond_4
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    invoke-static/range {p0 .. p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    goto :goto_5

    :goto_6
    const/16 v16, 0x8

    invoke-static/range {v10 .. v16}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object v2

    if-eqz v9, :cond_5

    const v3, 0x3ecccccd    # 0.4f

    goto :goto_7

    :cond_5
    const v3, 0x3e99999a    # 0.3f

    :goto_7
    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-static {v4, v2, v7, v3, v6}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-interface {v0, v2}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v1, v5}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual {v1, v5}, Lp1/q;->q(Z)V

    return-object v0
.end method
