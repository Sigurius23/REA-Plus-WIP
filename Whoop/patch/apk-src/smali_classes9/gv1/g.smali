.class public abstract Lgv1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgv1/g$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a;\u0010\u0008\u001a\u00020\u00042\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0006H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001aA\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00062\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00062\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0006H\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0019\u00b2\u0006\u000e\u0010\u0011\u001a\u00020\n8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0012\u001a\u00020\n8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0013\u001a\u00020\n8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0015\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002\u00b2\u0006\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00168\n@\nX\u008a\u008e\u0002\u00b2\u0006\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00148\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lgv1/o;",
        "lottieSource",
        "Lkotlin/Function1;",
        "Lgv1/m;",
        "Ll83/a0;",
        "onViewEvent",
        "Lkotlin/Function0;",
        "onDismiss",
        "p",
        "(Lgv1/o;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "",
        "hasOverride",
        "onLoadUrlClick",
        "onLoadLocalFileClick",
        "onRemoveOverrideClick",
        "Q",
        "(ZLc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "showLottieTesterSheet",
        "showLoadUrlSheet",
        "showLoadLocalFileSheet",
        "",
        "urlInput",
        "Landroid/net/Uri;",
        "selectedFileUri",
        "selectedFileName",
        "lottie-tester_release"
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
.method private static final A(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lgv1/g;->P(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lkotlin/jvm/functions/Function1;Lc93/a;)Ll83/a0;
    .locals 1

    sget-object v0, Lgv1/m$e;->a:Lgv1/m$e;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
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

.method private static final D(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lgv1/g;->N(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lkotlin/jvm/functions/Function1;Lc93/a;Lp1/c1;Lp1/c1;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    const-string v0, "$this$BottomSheetM3"

    move-object/from16 v1, p5

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p7, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p7, 0x1

    move-object/from16 v2, p6

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p2}, Lgv1/g;->r(Lp1/c1;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v1, v3, :cond_1

    new-instance v1, Lf1/a0;

    const/16 v4, 0xc

    invoke-direct {v1, v4, p2}, Lf1/a0;-><init>(ILp1/c1;)V

    invoke-virtual {v2, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v2, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_2

    if-ne v5, v3, :cond_3

    :cond_2
    new-instance v5, Lam2/r;

    const/16 v11, 0xb

    move-object v6, p0

    move-object v7, p1

    move-object v8, p2

    move-object v9, p3

    move-object/from16 v10, p4

    invoke-direct/range {v5 .. v11}, Lam2/r;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v2, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/16 v3, 0x30

    invoke-static {v0, v1, v5, v2, v3}, Lgv1/k;->d(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_4
    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final F(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lgv1/g;->s(Lp1/c1;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Lkotlin/jvm/functions/Function1;Lc93/a;Lp1/c1;Lp1/c1;Lp1/c1;Lgv1/l;)Ll83/a0;
    .locals 1

    const-string v0, "urlType"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lgv1/g$a;->a:[I

    invoke-virtual {p5}, Ljava/lang/Enum;->ordinal()I

    move-result p5

    aget p5, v0, p5

    const/4 v0, 0x1

    if-eq p5, v0, :cond_1

    const/4 v0, 0x2

    if-ne p5, v0, :cond_0

    new-instance p5, Lgv1/m$b;

    invoke-static {p2}, Lgv1/g;->r(Lp1/c1;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p5, p2}, Lgv1/m$b;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    new-instance p5, Lgv1/m$d;

    invoke-static {p2}, Lgv1/g;->r(Lp1/c1;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p5, p2}, Lgv1/m$d;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-interface {p0, p5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p0, 0x0

    invoke-static {p3, p0}, Lgv1/g;->N(Lp1/c1;Z)V

    invoke-static {p4, p0}, Lgv1/g;->C(Lp1/c1;Z)V

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lgv1/g;->P(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lh/i;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lc93/a;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 13

    const-string v0, "$this$BottomSheetM3"

    move-object/from16 v1, p8

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p10, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p10, 0x1

    move-object/from16 v4, p9

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static/range {p4 .. p4}, Lgv1/g;->v(Lp1/c1;)Ljava/lang/String;

    move-result-object v0

    invoke-static/range {p5 .. p5}, Lgv1/g;->t(Lp1/c1;)Landroid/net/Uri;

    move-result-object v1

    if-eqz v1, :cond_1

    move v2, v3

    :cond_1
    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-nez v1, :cond_3

    if-ne v3, v5, :cond_2

    goto :goto_1

    :cond_2
    move-object/from16 v7, p5

    goto :goto_2

    :cond_3
    :goto_1
    new-instance v3, Lep1/g;

    const/16 v1, 0x10

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    invoke-direct {v3, p0, v7, v6, v1}, Lep1/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_2
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {v4, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p0, v1

    move-object/from16 v10, p3

    invoke-virtual {v4, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p0, v1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez p0, :cond_4

    if-ne v1, v5, :cond_5

    :cond_4
    new-instance v6, Lam2/b;

    move-object v8, p1

    move-object v9, p2

    move-object/from16 v11, p6

    move-object/from16 v12, p7

    invoke-direct/range {v6 .. v12}, Lam2/b;-><init>(Lp1/c1;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lc93/a;Lp1/c1;Lp1/c1;)V

    invoke-virtual {v4, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v6

    :cond_5
    check-cast v1, Lkotlin/jvm/functions/Function1;

    const/4 p0, 0x0

    move/from16 p5, p0

    move-object p0, v0

    move-object/from16 p3, v1

    move p1, v2

    move-object p2, v3

    move-object/from16 p4, v4

    invoke-static/range {p0 .. p5}, Lgv1/j;->d(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_3

    :cond_6
    move-object p0, v4

    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Lh/i;Lp1/c1;Lp1/c1;Lgv1/l;)Ll83/a0;
    .locals 1

    const-string v0, "fileType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lgv1/g;->u(Lp1/c1;Landroid/net/Uri;)V

    invoke-static {p2, v0}, Lgv1/g;->w(Lp1/c1;Ljava/lang/String;)V

    sget-object p1, Lgv1/g$a;->a:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    const/4 p2, 0x1

    if-eq p1, p2, :cond_1

    const/4 p2, 0x2

    if-ne p1, p2, :cond_0

    const-string p1, "image/*"

    invoke-virtual {p0, p1, v0}, Lh/i;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    const-string p1, "application/json"

    invoke-virtual {p0, p1, v0}, Lh/i;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lp1/c1;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lc93/a;Lp1/c1;Lp1/c1;Lgv1/l;)Ll83/a0;
    .locals 2

    const-string v0, "fileType"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lgv1/g;->t(Lp1/c1;)Landroid/net/Uri;

    move-result-object p0

    if-eqz p0, :cond_3

    sget-object v0, Lgv1/g$a;->a:[I

    invoke-virtual {p6}, Ljava/lang/Enum;->ordinal()I

    move-result p6

    aget p6, v0, p6

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p6, v0, :cond_1

    const/4 p1, 0x2

    if-ne p6, p1, :cond_0

    new-instance p1, Lgv1/m$a;

    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p6, "toString(...)"

    invoke-static {p0, p6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, p0}, Lgv1/m$a;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p4, v1}, Lgv1/g;->P(Lp1/c1;Z)V

    invoke-static {p5, v1}, Lgv1/g;->C(Lp1/c1;Z)V

    invoke-interface {p3}, Lc93/a;->invoke()Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object p0

    if-eqz p0, :cond_2

    sget-object p1, Lyb3/a;->a:Ljava/nio/charset/Charset;

    new-instance p6, Ljava/io/InputStreamReader;

    invoke-direct {p6, p0, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    new-instance p0, Ljava/io/BufferedReader;

    const/16 p1, 0x2000

    invoke-direct {p0, p6, p1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    :try_start_0
    invoke-static {p0}, Lvf3/b;->h(Ljava/io/Reader;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    goto :goto_0

    :catchall_0
    move-exception p1

    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p2

    invoke-static {p0, p1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p2

    :cond_2
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_3

    new-instance p0, Lgv1/m$c;

    invoke-direct {p0, p1}, Lgv1/m$c;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p4, v1}, Lgv1/g;->P(Lp1/c1;Z)V

    invoke-static {p5, v1}, Lgv1/g;->C(Lp1/c1;Z)V

    invoke-interface {p3}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_3
    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Lgv1/o;Lkotlin/jvm/functions/Function1;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lgv1/g;->p(Lgv1/o;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final M(Lp1/c1;)Z
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

.method private static final N(Lp1/c1;Z)V
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

.method private static final O(Lp1/c1;)Z
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

.method private static final P(Lp1/c1;Z)V
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

.method public static final Q(ZLc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 44
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lc93/a;",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v13, p1

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    move/from16 v2, p5

    const-string v3, "onLoadUrlClick"

    invoke-static {v13, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onLoadLocalFileClick"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onRemoveOverrideClick"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p4

    check-cast v14, Lp1/q;

    const v3, 0x5d0ebbd8

    invoke-virtual {v14, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    const/4 v4, 0x2

    if-nez v3, :cond_1

    move/from16 v3, p0

    invoke-virtual {v14, v3}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    move v5, v4

    :goto_0
    or-int/2addr v5, v2

    goto :goto_1

    :cond_1
    move/from16 v3, p0

    move v5, v2

    :goto_1
    and-int/lit8 v6, v2, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v14, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_3
    and-int/lit16 v6, v2, 0x180

    if-nez v6, :cond_5

    invoke-virtual {v14, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v5, v6

    :cond_5
    and-int/lit16 v6, v2, 0xc00

    if-nez v6, :cond_7

    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x800

    goto :goto_4

    :cond_6
    const/16 v6, 0x400

    :goto_4
    or-int/2addr v5, v6

    :cond_7
    and-int/lit16 v6, v5, 0x493

    const/16 v7, 0x492

    const/4 v8, 0x1

    if-eq v6, v7, :cond_8

    move v6, v8

    goto :goto_5

    :cond_8
    const/4 v6, 0x0

    :goto_5
    and-int/lit8 v7, v5, 0x1

    invoke-virtual {v14, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_c

    const/high16 v6, 0x3f800000    # 1.0f

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    int-to-float v10, v4

    const/16 v11, 0x8

    int-to-float v11, v11

    mul-float/2addr v10, v11

    const/4 v12, 0x0

    invoke-static {v9, v10, v12, v4}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v15

    const/4 v4, 0x3

    int-to-float v4, v4

    mul-float v19, v4, v11

    const/16 v20, 0x7

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v10}, Ll0/m;->i(F)Ll0/k;

    move-result-object v9

    sget-object v10, Lb2/e;->M:Lb2/k;

    const/4 v11, 0x6

    invoke-static {v9, v10, v14, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v11, v14, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v14, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v15, v14, Lp1/q;->S:Z

    if-eqz v15, :cond_9

    invoke-virtual {v14, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_6
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v14, v12, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v14, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v11, v14, Lp1/q;->S:Z

    if-nez v11, :cond_a

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_b

    :cond_a
    invoke-static {v10, v14, v10, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v14, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v4, v14, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->a()Lb91/a;

    move-result-object v34

    invoke-virtual {v4, v14, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->c1()J

    move-result-wide v16

    sget v4, Lb91/a;->d:I

    shl-int/lit8 v38, v4, 0x12

    const v39, 0x2fffa

    const/4 v15, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v37, 0x6

    move-object/from16 v36, v14

    const-string v14, "Replace any Lottie animation or image on this screen with a remote URL or a local file."

    invoke-static/range {v14 .. v39}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v36

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-string v4, "LOAD URL"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget v9, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v18, v9, 0x12

    or-int/lit8 v15, v18, 0x6

    shl-int/lit8 v9, v5, 0x6

    and-int/lit16 v9, v9, 0x1c00

    const/16 v17, 0x1fbe

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v10, v6

    move-object v6, v4

    const/4 v4, 0x0

    move v11, v5

    const/4 v5, 0x0

    move-object v12, v7

    const/4 v7, 0x0

    move/from16 v16, v8

    const/4 v8, 0x0

    move/from16 v19, v16

    move/from16 v16, v9

    const/4 v9, 0x0

    move/from16 v20, v10

    const/4 v10, 0x0

    move/from16 v21, v11

    const/4 v11, 0x0

    move-object/from16 v22, v12

    const/4 v12, 0x0

    move/from16 v40, v21

    move-object/from16 v41, v22

    const/16 v19, 0x6

    invoke-static/range {v0 .. v17}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v41

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-string v3, "LOAD LOCAL FILE"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    move/from16 v11, v40

    shl-int/lit8 v3, v11, 0x3

    and-int/lit16 v4, v3, 0x1c00

    const/4 v1, 0x0

    move v10, v0

    move-object v0, v2

    const/4 v2, 0x0

    move v5, v3

    const/4 v3, 0x0

    move/from16 v16, v4

    const/4 v4, 0x0

    move v7, v5

    const/4 v5, 0x0

    move v8, v7

    const/4 v7, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v12, v9

    const/4 v9, 0x0

    move/from16 v20, v10

    const/4 v10, 0x0

    move/from16 v21, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move/from16 v20, v13

    move/from16 v42, v21

    move-object/from16 v43, v41

    move-object/from16 v13, p2

    invoke-static/range {v0 .. v17}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v43

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-string v1, "REMOVE OVERRIDE"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    and-int/lit8 v1, v20, 0x70

    or-int/lit8 v1, v1, 0x6

    or-int v15, v1, v18

    move/from16 v11, v42

    and-int/lit16 v1, v11, 0x1c00

    const/16 v17, 0x1fbc

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v13, p3

    move/from16 v16, v1

    move/from16 v1, p0

    invoke-static/range {v0 .. v17}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    const/4 v0, 0x1

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_c
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_d

    new-instance v0, Lar2/a;

    const/16 v6, 0xb

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lar2/a;-><init>(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final R(ZLc93/a;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lgv1/g;->Q(ZLc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lgv1/g;->F(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lgv1/g;->D(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/c1;Lp1/c1;Landroid/net/Uri;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lgv1/g;->x(Lp1/c1;Lp1/c1;Landroid/net/Uri;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(ZLc93/a;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lgv1/g;->R(ZLc93/a;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Lc93/a;Lp1/c1;Lp1/c1;Lp1/c1;Lgv1/l;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lgv1/g;->G(Lkotlin/jvm/functions/Function1;Lc93/a;Lp1/c1;Lp1/c1;Lp1/c1;Lgv1/l;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Lc93/a;Lp1/c1;Lp1/c1;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lgv1/g;->E(Lkotlin/jvm/functions/Function1;Lc93/a;Lp1/c1;Lp1/c1;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lh/i;Lp1/c1;Lp1/c1;Lgv1/l;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lgv1/g;->J(Lh/i;Lp1/c1;Lp1/c1;Lgv1/l;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lgv1/g;->A(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lp1/c1;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lc93/a;Lp1/c1;Lp1/c1;Lgv1/l;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lgv1/g;->K(Lp1/c1;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lc93/a;Lp1/c1;Lp1/c1;Lgv1/l;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lh/i;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lc93/a;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p10}, Lgv1/g;->I(Lh/i;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lc93/a;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lgv1/g;->H(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lgv1/g;->z(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lgv1/o;Lkotlin/jvm/functions/Function1;Lc93/a;Lp1/c1;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lgv1/g;->y(Lgv1/o;Lkotlin/jvm/functions/Function1;Lc93/a;Lp1/c1;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lgv1/o;Lkotlin/jvm/functions/Function1;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lgv1/g;->L(Lgv1/o;Lkotlin/jvm/functions/Function1;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lc93/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lgv1/g;->B(Lkotlin/jvm/functions/Function1;Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final p(Lgv1/o;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 46
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgv1/o;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v7, p4

    const-string v0, "onViewEvent"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onDismiss"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p3

    check-cast v14, Lp1/q;

    const v0, -0x1bb69c14

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v7, 0x6

    const/4 v4, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v4

    :goto_0
    or-int/2addr v0, v7

    goto :goto_1

    :cond_1
    move v0, v7

    :goto_1
    and-int/lit8 v5, v7, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_3
    and-int/lit16 v5, v7, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v14, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v0, v5

    :cond_5
    move v8, v0

    and-int/lit16 v0, v8, 0x93

    const/16 v5, 0x92

    if-eq v0, v5, :cond_6

    const/4 v0, 0x1

    goto :goto_4

    :cond_6
    const/4 v0, 0x0

    :goto_4
    and-int/lit8 v5, v8, 0x1

    invoke-virtual {v14, v5, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-ne v0, v10, :cond_7

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    invoke-virtual {v14, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object/from16 v17, v0

    check-cast v17, Lp1/c1;

    const/4 v11, 0x6

    const/4 v0, 0x0

    invoke-static {v11, v0, v14, v4}, Ll1/n2;->g(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll1/w3;

    move-result-object v12

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v10, :cond_8

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v5}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v5

    invoke-virtual {v14, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v5, Lp1/c1;

    invoke-static {v11, v0, v14, v4}, Ll1/n2;->g(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll1/w3;

    move-result-object v18

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v10, :cond_9

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v6}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v6

    invoke-virtual {v14, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v6, Lp1/c1;

    invoke-static {v11, v0, v14, v4}, Ll1/n2;->g(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll1/w3;

    move-result-object v19

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v10, :cond_c

    instance-of v4, v1, Lgv1/o$d;

    if-eqz v4, :cond_a

    move-object v4, v1

    check-cast v4, Lgv1/o$d;

    invoke-virtual {v4}, Lgv1/o$d;->a()Ljava/lang/String;

    move-result-object v4

    goto :goto_5

    :cond_a
    instance-of v4, v1, Lgv1/o$b;

    if-eqz v4, :cond_b

    move-object v4, v1

    check-cast v4, Lgv1/o$b;

    invoke-virtual {v4}, Lgv1/o$b;->a()Ljava/lang/String;

    move-result-object v4

    goto :goto_5

    :cond_b
    const-string v4, ""

    :goto_5
    invoke-static {v4}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v14, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object/from16 v20, v4

    check-cast v20, Lp1/c1;

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v10, :cond_d

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v14, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object v13, v4

    check-cast v13, Lp1/c1;

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v10, :cond_e

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v14, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object v15, v4

    check-cast v15, Lp1/c1;

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v14, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v21, v0

    check-cast v21, Landroid/content/Context;

    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$GetContent;

    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$GetContent;-><init>()V

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v10, :cond_f

    new-instance v4, Lam2/j;

    const/4 v9, 0x3

    invoke-direct {v4, v9, v13, v15}, Lam2/j;-><init>(ILp1/c1;Lp1/c1;)V

    invoke-virtual {v14, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x30

    invoke-static {v0, v4, v14, v9}, Lwb3/f;->a0(Lk/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lh/i;

    move-result-object v22

    invoke-static/range {v17 .. v17}, Lgv1/g;->q(Lp1/c1;)Z

    move-result v0

    if-eqz v0, :cond_10

    const v0, -0x7686643

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    new-instance v23, Lv41/g;

    const-string v0, "Lottie Tester"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    const/16 v31, 0x7e

    const/16 v32, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v23 .. v32}, Lv41/g;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;Lv41/i0;Ly81/e;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, La81/n;

    move-object v4, v5

    move-object v5, v6

    const/4 v6, 0x6

    invoke-direct/range {v0 .. v6}, La81/n;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v1, 0x7afb268b

    invoke-static {v1, v14, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    sget v1, Lv41/g;->h:I

    shl-int/2addr v1, v11

    shl-int/lit8 v2, v8, 0xc

    const/high16 v3, 0x380000

    and-int/2addr v2, v3

    or-int/2addr v1, v2

    move-object v2, v15

    const/16 v15, 0x180

    const/16 v16, 0xfb9

    move-object v6, v13

    move-object v13, v14

    move v14, v1

    move-object v1, v12

    move-object v12, v0

    const/4 v0, 0x0

    const/4 v3, 0x0

    move-object v8, v4

    const/4 v4, 0x0

    move-object v9, v5

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object/from16 v24, v8

    const/4 v8, 0x0

    move-object/from16 v25, v9

    const/4 v9, 0x0

    move-object/from16 v26, v10

    const/4 v10, 0x0

    move/from16 v27, v11

    const/4 v11, 0x0

    move-object/from16 v34, v26

    move-object/from16 v26, v2

    move-object/from16 v2, v23

    move-object/from16 v23, v6

    move-object/from16 v6, p2

    invoke-static/range {v0 .. v16}, Lv41/e;->g(Landroidx/compose/ui/Modifier;Ll1/w3;Lv41/g;Ly81/e;Lc93/a;Lc93/a;Lc93/a;Li2/a1;ZLny0/q;Li2/t;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V

    const/4 v6, 0x0

    invoke-virtual {v13, v6}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_10
    move-object/from16 v24, v5

    move-object/from16 v25, v6

    move-object/from16 v34, v10

    move/from16 v27, v11

    move-object/from16 v23, v13

    move-object v13, v14

    move-object/from16 v26, v15

    const/4 v6, 0x0

    const v0, -0x75e2dca

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v6}, Lp1/q;->q(Z)V

    :goto_6
    invoke-static/range {v24 .. v24}, Lgv1/g;->M(Lp1/c1;)Z

    move-result v0

    const/high16 v28, 0x180000

    if-eqz v0, :cond_12

    const v0, -0x75d4e02

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    new-instance v35, Lv41/g;

    const-string v0, "Load URL"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v36

    const/16 v43, 0x7e

    const/16 v44, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    invoke-direct/range {v35 .. v44}, Lv41/g;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;Lv41/i0;Ly81/e;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v7, v34

    if-ne v0, v7, :cond_11

    new-instance v0, Lg11/b;

    const/16 v1, 0xa

    move-object/from16 v4, v24

    invoke-direct {v0, v1, v4}, Lg11/b;-><init>(ILp1/c1;)V

    invoke-virtual {v13, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_7

    :cond_11
    move-object/from16 v4, v24

    :goto_7
    move-object v8, v0

    check-cast v8, Lc93/a;

    new-instance v0, La81/n;

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v5, v17

    move-object/from16 v3, v20

    invoke-direct/range {v0 .. v5}, La81/n;-><init>(Lkotlin/jvm/functions/Function1;Lc93/a;Lp1/c1;Lp1/c1;Lp1/c1;)V

    move-object v1, v0

    move-object v0, v5

    const v2, 0x2355bdb4

    invoke-static {v2, v13, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    sget v2, Lv41/g;->h:I

    shl-int/lit8 v2, v2, 0x6

    or-int v15, v2, v28

    const/16 v16, 0x180

    const/16 v17, 0xfb9

    move-object v14, v13

    move-object v13, v1

    const/4 v1, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move/from16 v33, v6

    const/4 v6, 0x0

    move-object/from16 v34, v7

    move-object v7, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 p3, v0

    move-object/from16 v2, v18

    move/from16 v0, v33

    move-object/from16 v45, v34

    move-object/from16 v3, v35

    invoke-static/range {v1 .. v17}, Lv41/e;->g(Landroidx/compose/ui/Modifier;Ll1/w3;Lv41/g;Ly81/e;Lc93/a;Lc93/a;Lc93/a;Li2/a1;ZLny0/q;Li2/t;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V

    move-object v13, v14

    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_12
    move v0, v6

    move-object/from16 p3, v17

    move-object/from16 v45, v34

    const v1, -0x74f584a

    invoke-virtual {v13, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    :goto_8
    invoke-static/range {v25 .. v25}, Lgv1/g;->O(Lp1/c1;)Z

    move-result v1

    if-eqz v1, :cond_14

    const v1, -0x74dd6f8

    invoke-virtual {v13, v1}, Lp1/q;->e0(I)V

    new-instance v2, Lv41/g;

    const-string v1, "Load Local File"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const/16 v10, 0x7e

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v2 .. v11}, Lv41/g;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;Lv41/i0;Ly81/e;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v10, v2

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v7, v45

    if-ne v1, v7, :cond_13

    new-instance v1, Lg11/b;

    const/16 v2, 0xb

    move-object/from16 v5, v25

    invoke-direct {v1, v2, v5}, Lg11/b;-><init>(ILp1/c1;)V

    invoke-virtual {v13, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_9

    :cond_13
    move-object/from16 v5, v25

    :goto_9
    move-object v11, v1

    check-cast v11, Lc93/a;

    move/from16 v33, v0

    new-instance v0, Lgv1/f;

    const/4 v9, 0x0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v8, p3

    move-object v7, v5

    move-object/from16 v2, v21

    move-object/from16 v1, v22

    move-object/from16 v6, v23

    move-object/from16 v5, v26

    invoke-direct/range {v0 .. v9}, Lgv1/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v1, 0x7321a653

    invoke-static {v1, v13, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    sget v1, Lv41/g;->h:I

    shl-int/lit8 v1, v1, 0x6

    or-int v15, v1, v28

    const/16 v16, 0x180

    const/16 v17, 0xfb9

    const/4 v1, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v2, v10

    const/4 v10, 0x0

    move-object v7, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v3, v2

    move-object v14, v13

    move-object/from16 v2, v19

    move-object v13, v0

    move/from16 v0, v33

    invoke-static/range {v1 .. v17}, Lv41/e;->g(Landroidx/compose/ui/Modifier;Ll1/w3;Lv41/g;Ly81/e;Lc93/a;Lc93/a;Lc93/a;Li2/a1;ZLny0/q;Li2/t;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V

    move-object v13, v14

    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_14
    const v1, -0x72f224a

    invoke-virtual {v13, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_15
    move-object v13, v14

    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_16

    new-instance v0, Lcy1/b;

    const/16 v5, 0x1c

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lcy1/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method private static final q(Lp1/c1;)Z
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

.method private static final r(Lp1/c1;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final s(Lp1/c1;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final t(Lp1/c1;)Landroid/net/Uri;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Landroid/net/Uri;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/net/Uri;

    return-object p0
.end method

.method private static final u(Lp1/c1;Landroid/net/Uri;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Landroid/net/Uri;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final v(Lp1/c1;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final w(Lp1/c1;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final x(Lp1/c1;Lp1/c1;Landroid/net/Uri;)Ll83/a0;
    .locals 0

    invoke-static {p0, p2}, Lgv1/g;->u(Lp1/c1;Landroid/net/Uri;)V

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-static {p1, p0}, Lgv1/g;->w(Lp1/c1;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lgv1/o;Lkotlin/jvm/functions/Function1;Lc93/a;Lp1/c1;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    const-string v1, "$this$BottomSheetM3"

    invoke-static {p5, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p7, 0x11

    const/16 v2, 0x10

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v1, v2, :cond_0

    move v1, v4

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    and-int/lit8 v2, p7, 0x1

    move-object v5, p6

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_6

    if-eqz p0, :cond_1

    move v3, v4

    :cond_1
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_2

    new-instance v1, Lg11/b;

    const/16 v4, 0xc

    invoke-direct {v1, v4, p3}, Lg11/b;-><init>(ILp1/c1;)V

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v1, Lc93/a;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_3

    new-instance v4, Lg11/b;

    const/16 v6, 0x9

    invoke-direct {v4, v6, p4}, Lg11/b;-><init>(ILp1/c1;)V

    invoke-virtual {v5, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v4, Lc93/a;

    invoke-virtual {v5, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v5, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_4

    if-ne v7, v2, :cond_5

    :cond_4
    new-instance v7, Lg32/j;

    const/4 v2, 0x1

    invoke-direct {v7, p1, p2, v2}, Lg32/j;-><init>(Lkotlin/jvm/functions/Function1;Lc93/a;I)V

    invoke-virtual {v5, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v7, Lc93/a;

    const/16 v0, 0x1b0

    move p5, v0

    move-object p1, v1

    move p0, v3

    move-object p2, v4

    move-object p4, v5

    move-object p3, v7

    invoke-static/range {p0 .. p5}, Lgv1/g;->Q(ZLc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_6
    move-object v0, v5

    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final z(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lgv1/g;->N(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
