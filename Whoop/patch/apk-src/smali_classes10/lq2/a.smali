.class public abstract Llq2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a+\u0010\n\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "",
        "height",
        "j",
        "(I)I",
        "",
        "isCurrentStep",
        "Lkotlin/Function1;",
        "Lc0/i0;",
        "Ll83/a0;",
        "content",
        "e",
        "(ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(I)I
    .locals 0

    invoke-static {p0}, Llq2/a;->f(I)I

    move-result p0

    return p0
.end method

.method public static synthetic b(ZLkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Llq2/a;->i(ZLkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function3;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Llq2/a;->h(Lkotlin/jvm/functions/Function3;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(I)I
    .locals 0

    invoke-static {p0}, Llq2/a;->g(I)I

    move-result p0

    return p0
.end method

.method public static final e(ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function3;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v7, p2

    check-cast v7, Lp1/q;

    const p2, 0x20a20678

    invoke-virtual {v7, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    const/4 v0, 0x2

    if-nez p2, :cond_1

    invoke-virtual {v7, p0}, Lp1/q;->h(Z)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    move p2, v0

    :goto_0
    or-int/2addr p2, p3

    goto :goto_1

    :cond_1
    move p2, p3

    :goto_1
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_3

    invoke-virtual {v7, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr p2, v1

    :cond_3
    and-int/lit8 v1, p2, 0x13

    const/16 v2, 0x12

    const/4 v3, 0x0

    if-eq v1, v2, :cond_4

    const/4 v1, 0x1

    goto :goto_3

    :cond_4
    move v1, v3

    :goto_3
    and-int/lit8 v2, p2, 0x1

    invoke-virtual {v7, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_7

    const/16 v1, 0x3e8

    const/4 v2, 0x0

    const/4 v4, 0x6

    invoke-static {v1, v3, v2, v4}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v6, v8, :cond_5

    new-instance v6, Llive/hms/video/media/capturers/camera/utils/a;

    const/16 v9, 0xf

    invoke-direct {v6, v9}, Llive/hms/video/media/capturers/camera/utils/a;-><init>(I)V

    invoke-virtual {v7, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {v5, v6}, Lc0/w0;->o(Ld0/c0;Lkotlin/jvm/functions/Function1;)Lc0/d1;

    move-result-object v5

    invoke-static {v1, v3, v2, v4}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v1

    invoke-static {v1, v0}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object v1

    invoke-virtual {v5, v1}, Lc0/c1;->a(Lc0/c1;)Lc0/d1;

    move-result-object v1

    const/16 v5, 0x1f4

    invoke-static {v5, v3, v2, v4}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v6

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v8, :cond_6

    new-instance v9, Llive/hms/video/media/capturers/camera/utils/a;

    const/16 v8, 0x10

    invoke-direct {v9, v8}, Llive/hms/video/media/capturers/camera/utils/a;-><init>(I)V

    invoke-virtual {v7, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v6, v9}, Lc0/w0;->s(Ld0/c0;Lkotlin/jvm/functions/Function1;)Lc0/f1;

    move-result-object v6

    invoke-static {v5, v3, v2, v4}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v2

    invoke-static {v2, v0}, Lc0/w0;->f(Ld0/c0;I)Lc0/f1;

    move-result-object v0

    invoke-virtual {v6, v0}, Lc0/e1;->a(Lc0/e1;)Lc0/f1;

    move-result-object v4

    new-instance v0, Lb30/a1;

    const/16 v2, 0x1b

    invoke-direct {v0, p1, v2}, Lb30/a1;-><init>(Ljava/lang/Object;I)V

    const v2, -0x2209d6b0

    invoke-static {v2, v7, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    and-int/lit8 p2, p2, 0xe

    const v0, 0x30d80

    or-int v8, p2, v0

    const/16 v9, 0x12

    const/4 v2, 0x0

    const/4 v5, 0x0

    move-object v3, v1

    move v1, p0

    invoke-static/range {v1 .. v9}, Landroidx/compose/animation/b;->f(ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    goto :goto_4

    :cond_7
    move v1, p0

    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_8

    new-instance p2, Lam0/b;

    const/16 v0, 0xb

    invoke-direct {p2, v1, p1, p3, v0}, Lam0/b;-><init>(ZLjava/lang/Object;II)V

    iput-object p2, p0, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final f(I)I
    .locals 0

    return p0
.end method

.method private static final g(I)I
    .locals 0

    invoke-static {p0}, Llq2/a;->j(I)I

    move-result p0

    return p0
.end method

.method private static final h(Lkotlin/jvm/functions/Function3;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 1

    const-string v0, "$this$AnimatedVisibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p3, p3, 0xe

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p0, p1, p2, p3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(ZLkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Llq2/a;->e(ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final j(I)I
    .locals 0

    div-int/lit8 p0, p0, 0x3

    return p0
.end method
