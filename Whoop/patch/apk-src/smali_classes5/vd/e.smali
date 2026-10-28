.class public abstract Lvd/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Log/e;


# direct methods
.method public static final D(Landroid/view/View;)Landroid/view/Window;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/sentry/android/replay/f0;->a:Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p0

    const-string v0, "getRootView(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/sentry/android/replay/f0;->a:Ljava/lang/Object;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lio/sentry/android/replay/f0;->b:Ljava/lang/Object;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Field;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type android.view.Window"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroid/view/Window;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static F(Lkotlin/jvm/functions/Function1;)Lre/b;
    .locals 1

    new-instance v0, Lre/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Lre/b;

    invoke-direct {p0, v0}, Lre/b;-><init>(Lre/a;)V

    return-object p0
.end method

.method public static final G()Z
    .locals 2

    :try_start_0
    sget-object v0, Landroidx/lifecycle/ProcessLifecycleOwner;->I:Landroidx/lifecycle/ProcessLifecycleOwner;

    sget-object v0, Landroidx/lifecycle/ProcessLifecycleOwner;->I:Landroidx/lifecycle/ProcessLifecycleOwner;

    iget-object v0, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->F:Landroidx/lifecycle/i0;

    iget-object v0, v0, Landroidx/lifecycle/i0;->d:Landroidx/lifecycle/w;

    sget-object v1, Landroidx/lifecycle/w;->z:Landroidx/lifecycle/w;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/w;->a(Landroidx/lifecycle/w;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    const/4 v0, 0x0

    return v0
.end method

.method public static H(Ljava/lang/String;Lfk/a;)Z
    .locals 4

    const-string v0, ": "

    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    if-eqz p1, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to initialize "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Lfk/a;->error(Ljava/lang/String;)V

    goto :goto_0

    :catch_0
    move-exception v1

    if-eqz p1, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to load (UnsatisfiedLinkError) "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Lfk/a;->error(Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v1

    if-eqz p1, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Class not available:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Lfk/a;->debug(Ljava/lang/String;)V

    :cond_0
    :goto_0
    const/4 p0, 0x0

    :goto_1
    if-eqz p0, :cond_1

    const/4 p0, 0x1

    goto :goto_2

    :cond_1
    const/4 p0, 0x0

    :goto_2
    return p0
.end method

.method public static final J(Lp6/b;)Z
    .locals 3

    iget p0, p0, Lp6/b;->a:I

    const/high16 v0, -0x80000000

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-gt v0, p0, :cond_0

    const/4 v0, -0x1

    if-ge p0, v0, :cond_0

    move v2, v1

    :cond_0
    xor-int/lit8 p0, v2, 0x1

    return p0
.end method

.method public static M(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    const-string p1, "aggregationType"

    invoke-static {p0, p1}, Lih0/d0;->w(ILjava/lang/String;)V

    invoke-static {p0, p1}, Lih0/d0;->w(ILjava/lang/String;)V

    return-void
.end method

.method public static N(Led3/a;II)J
    .locals 7

    invoke-virtual {p0, p1}, Led3/a;->K(I)V

    invoke-virtual {p0}, Led3/a;->a()I

    move-result p1

    const/4 v0, 0x5

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-ge p1, v0, :cond_0

    return-wide v1

    :cond_0
    invoke-virtual {p0}, Led3/a;->i()I

    move-result p1

    const/high16 v0, 0x800000

    and-int/2addr v0, p1

    if-eqz v0, :cond_1

    return-wide v1

    :cond_1
    const v0, 0x1fff00

    and-int/2addr v0, p1

    shr-int/lit8 v0, v0, 0x8

    if-eq v0, p2, :cond_2

    return-wide v1

    :cond_2
    and-int/lit8 p1, p1, 0x20

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Led3/a;->y()I

    move-result p1

    const/4 p2, 0x7

    if-lt p1, p2, :cond_3

    invoke-virtual {p0}, Led3/a;->a()I

    move-result p1

    if-lt p1, p2, :cond_3

    invoke-virtual {p0}, Led3/a;->y()I

    move-result p1

    const/16 v0, 0x10

    and-int/2addr p1, v0

    if-ne p1, v0, :cond_3

    const/4 p1, 0x6

    new-array v0, p1, [B

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, p1}, Led3/a;->g([BII)V

    aget-byte p0, v0, v1

    int-to-long p0, p0

    const-wide/16 v1, 0xff

    and-long/2addr p0, v1

    const/16 v3, 0x19

    shl-long/2addr p0, v3

    const/4 v3, 0x1

    aget-byte v4, v0, v3

    int-to-long v4, v4

    and-long/2addr v4, v1

    const/16 v6, 0x11

    shl-long/2addr v4, v6

    or-long/2addr p0, v4

    const/4 v4, 0x2

    aget-byte v4, v0, v4

    int-to-long v4, v4

    and-long/2addr v4, v1

    const/16 v6, 0x9

    shl-long/2addr v4, v6

    or-long/2addr p0, v4

    const/4 v4, 0x3

    aget-byte v4, v0, v4

    int-to-long v4, v4

    and-long/2addr v4, v1

    shl-long v3, v4, v3

    or-long/2addr p0, v3

    const/4 v3, 0x4

    aget-byte v0, v0, v3

    int-to-long v3, v0

    and-long v0, v3, v1

    shr-long/2addr v0, p2

    or-long/2addr p0, v0

    return-wide p0

    :cond_3
    return-wide v1
.end method

.method public static final O(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lh40/k;
    .locals 8

    move-object v4, p1

    check-cast v4, Lp1/q;

    const p1, 0x7b6c7df5

    invoke-virtual {v4, p1}, Lp1/q;->e0(I)V

    sget-object v0, Lg1/z3;->w:Lg1/z3;

    and-int/lit8 p1, p2, 0x2

    sget-object p2, Lp1/l;->a:Lp1/v0;

    const/4 v7, 0x0

    if-eqz p1, :cond_1

    const p0, -0x14af218

    invoke-virtual {v4, p0}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p0

    if-ne p0, p2, :cond_0

    new-instance p0, Lh00/l0;

    const/16 p1, 0xf

    invoke-direct {p0, p1}, Lh00/l0;-><init>(I)V

    invoke-virtual {v4, p0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    check-cast p0, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    :cond_1
    move-object v2, p0

    const/4 p0, 0x7

    const/4 p1, 0x0

    invoke-static {v7, v7, p1, p0}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v1

    const/16 v5, 0xc30

    const/4 v6, 0x0

    const/4 v3, 0x1

    invoke-static/range {v0 .. v6}, Landroidx/compose/material/c;->c(Lg1/z3;Ld0/e2;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Lg1/y3;

    move-result-object p0

    const p1, 0x4a96bb98    # 4939212.0f

    invoke-virtual {v4, p1}, Lp1/q;->e0(I)V

    sget-object p1, Ll0/c2;->v:Ljava/util/WeakHashMap;

    invoke-static {v4}, Ll0/e;->e(Landroidx/compose/runtime/Composer;)Ll0/c2;

    move-result-object p1

    iget-object p1, p1, Ll0/c2;->c:Ll0/b;

    sget-object v0, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v4, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/c;

    invoke-virtual {p1}, Ll0/b;->e()Lv4/b;

    move-result-object p1

    iget p1, p1, Lv4/b;->d:I

    if-lez p1, :cond_2

    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    move p1, v7

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1, v4}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object p1

    sget-object v0, Lb3/v1;->p:Lp1/u2;

    invoke-virtual {v4, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb3/x2;

    const v1, 0x2b508c72

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, p2, :cond_3

    new-instance v1, Lh40/d;

    invoke-direct {v1, v0, p1}, Lh40/d;-><init>(Lb3/x2;Lp1/c1;)V

    invoke-virtual {v4, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v1, Lh40/d;

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    const p1, -0x14ac6dc

    invoke-virtual {v4, p1}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, p2, :cond_4

    new-instance p1, Lh40/k;

    invoke-direct {p1, p0, v1}, Lh40/k;-><init>(Lg1/y3;Lh40/d;)V

    invoke-virtual {v4, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast p1, Lh40/k;

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    return-object p1
.end method

.method public static P(Lw8/a;)V
    .locals 5

    const v0, -0x800001

    iput v0, p0, Lw8/a;->k:F

    const/high16 v0, -0x80000000

    iput v0, p0, Lw8/a;->j:I

    iget-object v0, p0, Lw8/a;->a:Ljava/lang/CharSequence;

    instance-of v1, v0, Landroid/text/Spanned;

    if-eqz v1, :cond_3

    instance-of v1, v0, Landroid/text/Spannable;

    if-nez v1, :cond_0

    invoke-static {v0}, Landroid/text/SpannableString;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableString;

    move-result-object v0

    iput-object v0, p0, Lw8/a;->a:Ljava/lang/CharSequence;

    :cond_0
    iget-object p0, p0, Lw8/a;->a:Ljava/lang/CharSequence;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p0, Landroid/text/Spannable;

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const-class v1, Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-interface {p0, v2, v0, v1}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    array-length v1, v0

    :goto_0
    if-ge v2, v1, :cond_3

    aget-object v3, v0, v2

    instance-of v4, v3, Landroid/text/style/AbsoluteSizeSpan;

    if-nez v4, :cond_1

    instance-of v4, v3, Landroid/text/style/RelativeSizeSpan;

    if-eqz v4, :cond_2

    :cond_1
    invoke-interface {p0, v3}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public static final Q(Ls/m2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvg/r;Ls83/c;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    move-object/from16 v2, p5

    instance-of v3, v2, Lae/a;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lae/a;

    iget v4, v3, Lae/a;->G:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lae/a;->G:I

    goto :goto_0

    :cond_0
    new-instance v3, Lae/a;

    invoke-direct {v3, v2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object v2, v3, Lae/a;->F:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lae/a;->G:I

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v5, :cond_3

    if-eq v5, v7, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v0, v3, Lae/a;->z:Ljava/lang/String;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, v3, Lae/a;->E:Lvg/r;

    iget-object v1, v3, Lae/a;->z:Ljava/lang/String;

    iget-object v5, v3, Lae/a;->y:Ljava/lang/String;

    iget-object v7, v3, Lae/a;->x:Ljava/lang/String;

    iget-object v9, v3, Lae/a;->w:Ls/m2;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v18, v7

    move-object v7, v0

    move-object v0, v9

    move-object v9, v2

    move-object/from16 v2, v18

    goto :goto_1

    :cond_3
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object v0, v3, Lae/a;->w:Ls/m2;

    move-object/from16 v2, p1

    iput-object v2, v3, Lae/a;->x:Ljava/lang/String;

    move-object/from16 v5, p2

    iput-object v5, v3, Lae/a;->y:Ljava/lang/String;

    move-object/from16 v9, p3

    iput-object v9, v3, Lae/a;->z:Ljava/lang/String;

    iput-object v1, v3, Lae/a;->E:Lvg/r;

    iput v7, v3, Lae/a;->G:I

    invoke-static {v1, v0, v3}, Lvd/e;->S(Lvg/n;Ls/m2;Ls83/c;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v4, :cond_4

    goto/16 :goto_2

    :cond_4
    move-object/from16 v18, v7

    move-object v7, v1

    move-object v1, v9

    move-object/from16 v9, v18

    :goto_1
    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-eqz v9, :cond_5

    return-object v8

    :cond_5
    sget-object v9, Lyd/f;->a:Ljf/a;

    const-string v9, "provider"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "sysPropSuffix"

    invoke-static {v2, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "envSuffix"

    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v10, Lh3/i;

    const/16 v16, 0x0

    const/16 v17, 0x3

    const/4 v11, 0x1

    sget-object v12, Lcg/o;->i:Lcg/n;

    const-class v13, Lcg/n;

    const-string v14, "parse"

    const-string v15, "parse(Ljava/lang/String;Laws/smithy/kotlin/runtime/net/url/UrlEncoding;)Laws/smithy/kotlin/runtime/net/url/Url;"

    invoke-direct/range {v10 .. v17}, Lh3/i;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    sget-object v9, Ljf/e;->a:Lg1/a7;

    const-string v9, "aws.endpointUrl"

    invoke-static {v9, v2}, Ljf/e;->a(Ljava/lang/String;Ljava/lang/String;)Lyb3/p;

    move-result-object v2

    const-string v9, "AWS_ENDPOINT_URL_"

    invoke-static {v9, v5}, Ljf/e;->a(Ljava/lang/String;Ljava/lang/String;)Lyb3/p;

    move-result-object v5

    invoke-virtual {v7}, Lvg/r;->a()Ljava/util/LinkedHashMap;

    move-result-object v9

    invoke-static {v9, v2}, Ljf/e;->d(Ljava/util/Map;Lyb3/p;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_6

    invoke-static {}, Ljava/lang/System;->getenv()Ljava/util/Map;

    move-result-object v2

    const-string v9, "getenv(...)"

    invoke-static {v2, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v5}, Ljf/e;->d(Ljava/util/Map;Lyb3/p;)Ljava/lang/String;

    move-result-object v2

    :cond_6
    if-eqz v2, :cond_7

    invoke-interface {v10, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_8

    :cond_7
    move-object v2, v8

    :cond_8
    check-cast v2, Lcg/o;

    if-nez v2, :cond_9

    sget-object v2, Lyd/f;->x:Ljf/a;

    invoke-static {v2, v7}, Ljf/e;->b(Ljf/a;Lvg/l;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcg/o;

    :cond_9
    if-nez v2, :cond_f

    iput-object v8, v3, Lae/a;->w:Ls/m2;

    iput-object v8, v3, Lae/a;->x:Ljava/lang/String;

    iput-object v8, v3, Lae/a;->y:Ljava/lang/String;

    iput-object v1, v3, Lae/a;->z:Ljava/lang/String;

    iput-object v8, v3, Lae/a;->E:Lvg/r;

    iput v6, v3, Lae/a;->G:I

    invoke-virtual {v0, v3}, Ls/m2;->g(Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_a

    :goto_2
    return-object v4

    :cond_a
    move-object v0, v1

    :goto_3
    check-cast v2, Lce/j;

    const-string v1, "<this>"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "serviceKey"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lce/j;->a()Lce/k;

    move-result-object v1

    const-string v3, "services"

    invoke-virtual {v1, v3, v8}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "endpoint_url"

    if-eqz v1, :cond_d

    iget-object v4, v2, Lce/j;->a:Ln83/f;

    sget-object v5, Lce/l;->y:Lce/l;

    invoke-virtual {v4, v5}, Ln83/f;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    if-nez v4, :cond_b

    sget-object v4, Lm83/z;->w:Lm83/z;

    :cond_b
    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lce/k;

    if-eqz v4, :cond_c

    invoke-static {v4, v0, v3}, Lo73/a;->N(Lce/k;Ljava/lang/String;Ljava/lang/String;)Lcg/o;

    move-result-object v0

    goto :goto_4

    :cond_c
    new-instance v0, Laws/sdk/kotlin/runtime/ConfigurationException;

    const-string v2, "shared config points to nonexistent services section \'"

    const/16 v3, 0x27

    invoke-static {v3, v2, v1}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    move-object v0, v8

    :goto_4
    if-nez v0, :cond_e

    invoke-virtual {v2}, Lce/j;->a()Lce/k;

    move-result-object v0

    invoke-static {v0, v3, v8}, Lo73/a;->N(Lce/k;Ljava/lang/String;Ljava/lang/String;)Lcg/o;

    move-result-object v0

    :cond_e
    return-object v0

    :cond_f
    return-object v2
.end method

.method public static R(Ls/m2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lvg/n;->a:Lvg/m;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lvg/m;->b:Lvg/r;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v6, p4

    invoke-static/range {v1 .. v6}, Lvd/e;->Q(Ls/m2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvg/r;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final S(Lvg/n;Ls/m2;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lae/b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lae/b;

    iget v1, v0, Lae/b;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lae/b;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lae/b;

    invoke-direct {v0, p2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lae/b;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lae/b;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p2, Lyd/f;->y:Ljf/a;

    invoke-static {p2, p0}, Ljf/e;->b(Ljf/a;Lvg/l;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    if-eqz p0, :cond_3

    :goto_1
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    goto :goto_3

    :cond_3
    iput v3, v0, Lae/b;->x:I

    invoke-virtual {p1, v0}, Ls/m2;->g(Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    :goto_2
    check-cast p2, Lce/j;

    invoke-virtual {p2}, Lce/j;->a()Lce/k;

    move-result-object p0

    const-string p1, "ignore_configured_endpoint_urls"

    invoke-static {p0, p1}, Lo73/a;->B(Lce/k;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p0

    if-eqz p0, :cond_5

    goto :goto_1

    :cond_5
    const/4 p0, 0x0

    :goto_3
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static T(FIII)F
    .locals 2

    const v0, -0x800001

    cmpl-float v1, p0, v0

    if-nez v1, :cond_0

    return v0

    :cond_0
    if-eqz p1, :cond_3

    const/4 p3, 0x1

    if-eq p1, p3, :cond_2

    const/4 p2, 0x2

    if-eq p1, p2, :cond_1

    return v0

    :cond_1
    return p0

    :cond_2
    int-to-float p1, p2

    :goto_0
    mul-float/2addr p0, p1

    return p0

    :cond_3
    int-to-float p1, p3

    goto :goto_0
.end method

.method public static final U(Lvg/n;Ls/m2;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lae/c;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lae/c;

    iget v1, v0, Lae/c;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lae/c;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lae/c;

    invoke-direct {v0, p2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lae/c;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lae/c;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p2, Lyd/f;->w:Ljf/a;

    invoke-static {p2, p0}, Ljf/e;->b(Ljf/a;Lvg/l;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    if-nez p0, :cond_4

    iput v3, v0, Lae/c;->x:I

    invoke-virtual {p1, v0}, Ls/m2;->g(Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lce/k;

    const-string p0, "<this>"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "use_dualstack_endpoint"

    invoke-static {p2, p0}, Lo73/a;->B(Lce/k;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p0

    :cond_4
    return-object p0
.end method

.method public static final V(Lvg/n;Ls/m2;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lae/d;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lae/d;

    iget v1, v0, Lae/d;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lae/d;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lae/d;

    invoke-direct {v0, p2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lae/d;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lae/d;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p2, Lyd/f;->v:Ljf/a;

    invoke-static {p2, p0}, Ljf/e;->b(Ljf/a;Lvg/l;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    if-nez p0, :cond_4

    iput v3, v0, Lae/d;->x:I

    invoke-virtual {p1, v0}, Ls/m2;->g(Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lce/k;

    const-string p0, "<this>"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "use_fips_endpoint"

    invoke-static {p2, p0}, Lo73/a;->B(Lce/k;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p0

    :cond_4
    return-object p0
.end method

.method public static synthetic W(Lb10/c1;Ljava/lang/String;Lyy/f;Ls83/c;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lm83/y;->w:Lm83/y;

    check-cast p0, Lb10/z0;

    invoke-virtual {p0, p1, p2, v0, p3}, Lb10/z0;->S(Ljava/lang/String;Lyy/f;Ljava/util/List;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final X(Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Ln53/a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ln53/a;

    iget v1, v0, Ln53/a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ln53/a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Ln53/a;

    invoke-direct {v0, p1}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p1, v0, Ln53/a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ln53/a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iput v3, v0, Ln53/a;->x:I

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p0, v1, :cond_3

    return-object v1

    :catch_0
    move-exception p0

    sget-object p1, Lb23/i;->a:Lb23/i;

    sget-object p1, Lb23/i;->d:Lb23/e;

    sget-object v0, Lb23/g;->F:Lb23/g;

    const-string v1, "SafeSuspendingCall"

    invoke-interface {p1, v0, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lb23/i;->c:Lb23/j;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Exception occurred: "

    invoke-static {v3, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v0, v1, v2, p0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final Y(La33/c;Lq83/d;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Ln53/b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ln53/b;

    iget v1, v0, Ln53/b;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ln53/b;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Ln53/b;

    invoke-direct {v0, p1}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p1, v0, Ln53/b;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ln53/b;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iput v3, v0, Ln53/b;->x:I

    invoke-virtual {p0, v0}, La33/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p0, Ln23/g;

    invoke-direct {p0, p1}, Ln23/g;-><init>(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    sget-object p1, Lb23/i;->a:Lb23/i;

    sget-object p1, Lb23/i;->d:Lb23/e;

    sget-object v0, Lb23/g;->F:Lb23/g;

    const-string v1, "SafeCall"

    invoke-interface {p1, v0, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Lb23/i;->c:Lb23/j;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Exception occurred: "

    invoke-static {v3, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v0, v1, v2, p0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    new-instance p1, Ln23/f;

    new-instance v0, Ln23/d;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Safe call failed with "

    invoke-static {v2, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p1, v0}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1
.end method

.method public static final Z(Lhg/m;Lud/g;)V
    .locals 5

    const-string v0, "serializer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lhg/i;

    sget-object v1, Lhg/l;->i:Lhg/l;

    new-instance v2, Lig/c;

    const-string v3, "arn"

    invoke-direct {v2, v3}, Lig/c;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x1

    new-array v3, v3, [Lhg/d;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    invoke-static {v3}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    invoke-direct {v0, v1, v2, v4}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v1, Lxl/a;

    const/16 v2, 0xd

    invoke-direct {v1, v2}, Lxl/a;-><init>(I)V

    new-instance v2, Lig/c;

    const-string v3, "PolicyDescriptorType"

    invoke-direct {v2, v3}, Lig/c;-><init>(Ljava/lang/String;)V

    iget-object v3, v1, Lxl/a;->y:Ljava/lang/Object;

    check-cast v3, Ljava/util/LinkedHashSet;

    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v0}, Lxl/a;->p(Lhg/i;)V

    new-instance v0, Lhg/j;

    invoke-direct {v0, v1}, Lhg/j;-><init>(Lxl/a;)V

    invoke-interface {p0, v0}, Lhg/m;->e(Lhg/j;)Lhg/n;

    move-result-object p0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p0}, Lhg/n;->o()V

    return-void
.end method

.method public static a0(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V
    .locals 11

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1}, Lb5/a;->l(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-lt v0, v1, :cond_1

    invoke-static {p0, p1}, Lb5/a;->l(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    return-void

    :cond_1
    iget v0, p0, Landroid/view/inputmethod/EditorInfo;->initialSelStart:I

    iget v1, p0, Landroid/view/inputmethod/EditorInfo;->initialSelEnd:I

    if-le v0, v1, :cond_2

    move v2, v1

    goto :goto_0

    :cond_2
    move v2, v0

    :goto_0
    if-le v0, v1, :cond_3

    goto :goto_1

    :cond_3
    move v0, v1

    :goto_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-ltz v2, :cond_c

    if-le v0, v1, :cond_4

    goto/16 :goto_5

    :cond_4
    iget v5, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    and-int/lit16 v5, v5, 0xfff

    const/16 v6, 0x81

    if-eq v5, v6, :cond_b

    const/16 v6, 0xe1

    if-eq v5, v6, :cond_b

    const/16 v6, 0x12

    if-ne v5, v6, :cond_5

    goto/16 :goto_4

    :cond_5
    const/16 v4, 0x800

    if-gt v1, v4, :cond_6

    invoke-static {p0, p1, v2, v0}, Lvd/e;->d0(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    return-void

    :cond_6
    sub-int v1, v0, v2

    const/16 v4, 0x400

    if-le v1, v4, :cond_7

    move v4, v3

    goto :goto_2

    :cond_7
    move v4, v1

    :goto_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v5

    sub-int/2addr v5, v0

    rsub-int v6, v4, 0x800

    const-wide v7, 0x3fe999999999999aL    # 0.8

    int-to-double v9, v6

    mul-double/2addr v9, v7

    double-to-int v7, v9

    invoke-static {v2, v7}, Ljava/lang/Math;->min(II)I

    move-result v7

    sub-int v7, v6, v7

    invoke-static {v5, v7}, Ljava/lang/Math;->min(II)I

    move-result v5

    sub-int/2addr v6, v5

    invoke-static {v2, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    sub-int/2addr v2, v6

    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    invoke-static {v7}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v7

    if-eqz v7, :cond_8

    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v6, v6, -0x1

    :cond_8
    add-int v7, v0, v5

    const/4 v8, 0x1

    sub-int/2addr v7, v8

    invoke-interface {p1, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    invoke-static {v7}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v7

    if-eqz v7, :cond_9

    add-int/lit8 v5, v5, -0x1

    :cond_9
    add-int v7, v6, v4

    add-int v9, v7, v5

    if-eq v4, v1, :cond_a

    add-int v1, v2, v6

    invoke-interface {p1, v2, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v1

    add-int/2addr v5, v0

    invoke-interface {p1, v0, v5}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/CharSequence;

    aput-object v1, v0, v3

    aput-object p1, v0, v8

    invoke-static {v0}, Landroid/text/TextUtils;->concat([Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    goto :goto_3

    :cond_a
    add-int/2addr v9, v2

    invoke-interface {p1, v2, v9}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    :goto_3
    invoke-static {p0, p1, v6, v7}, Lvd/e;->d0(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    return-void

    :cond_b
    :goto_4
    invoke-static {p0, v4, v3, v3}, Lvd/e;->d0(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    return-void

    :cond_c
    :goto_5
    invoke-static {p0, v4, v3, v3}, Lvd/e;->d0(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    return-void
.end method

.method public static final b(Lg40/n;Landroidx/compose/ui/Modifier;ZLc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 32

    move-object/from16 v1, p0

    move/from16 v3, p2

    move/from16 v5, p5

    move-object/from16 v15, p4

    check-cast v15, Lp1/q;

    const v0, 0x28ec4b3d

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v15, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    or-int/lit8 v0, v0, 0x30

    and-int/lit16 v2, v5, 0x180

    if-nez v2, :cond_3

    invoke-virtual {v15, v3}, Lp1/q;->h(Z)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x100

    goto :goto_2

    :cond_2
    const/16 v2, 0x80

    :goto_2
    or-int/2addr v0, v2

    :cond_3
    and-int/lit16 v2, v5, 0xc00

    if-nez v2, :cond_4

    or-int/lit16 v0, v0, 0x400

    :cond_4
    and-int/lit16 v0, v0, 0x493

    const/16 v2, 0x492

    if-ne v0, v2, :cond_6

    invoke-virtual {v15}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {v15}, Lp1/q;->X()V

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v26, v15

    goto/16 :goto_a

    :cond_6
    :goto_3
    invoke-virtual {v15}, Lp1/q;->Z()V

    and-int/lit8 v0, v5, 0x1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    const/4 v4, 0x0

    if-eqz v0, :cond_8

    invoke-virtual {v15}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_4

    :cond_7
    invoke-virtual {v15}, Lp1/q;->X()V

    move-object/from16 v0, p1

    move-object/from16 v6, p3

    goto :goto_5

    :cond_8
    :goto_4
    const v0, -0x308ed16f

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v0, :cond_9

    if-ne v6, v2, :cond_a

    :cond_9
    new-instance v6, Ld1/i;

    const/16 v0, 0x1a

    invoke-direct {v6, v1, v0}, Ld1/i;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v15, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object v0, v6

    check-cast v0, Lc93/a;

    invoke-virtual {v15, v4}, Lp1/q;->q(Z)V

    sget-object v6, Lb2/t;->w:Lb2/t;

    move-object/from16 v31, v6

    move-object v6, v0

    move-object/from16 v0, v31

    :goto_5
    invoke-virtual {v15}, Lp1/q;->r()V

    iget-object v7, v1, Lg40/n;->c:Lec3/r1;

    invoke-static {v7, v15, v4}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v7

    iget-object v8, v1, Lg40/n;->d:Ln53/e;

    invoke-static {v8, v15, v4}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v8

    sget-object v9, Ld40/r;->j:Lp1/u2;

    invoke-virtual {v15, v9}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ld40/g;

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lg40/h1;

    const/4 v10, 0x1

    if-eqz v8, :cond_b

    move v8, v10

    goto :goto_6

    :cond_b
    move v8, v4

    :goto_6
    invoke-virtual {v9}, Ld40/g;->a()Ll0/l1;

    move-result-object v25

    if-ne v8, v10, :cond_c

    sget-object v9, Lg40/e1;->x:Lg40/e1;

    goto :goto_7

    :cond_c
    if-nez v8, :cond_12

    sget-object v9, Lg40/e1;->w:Lg40/e1;

    :goto_7
    const v10, -0x308e6606    # -4.0534E9f

    invoke-virtual {v15, v10}, Lp1/q;->e0(I)V

    if-eqz v8, :cond_d

    sget-object v10, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v15, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lg1/c1;

    invoke-virtual {v10}, Lg1/c1;->c()J

    move-result-wide v10

    :goto_8
    move-wide v13, v10

    goto :goto_9

    :cond_d
    sget-wide v10, Li2/x;->m:J

    goto :goto_8

    :goto_9
    invoke-virtual {v15, v4}, Lp1/q;->q(Z)V

    const/16 v16, 0x0

    const/16 v17, 0xe

    move-object v10, v7

    move v11, v8

    const-wide/16 v7, 0x0

    move-object/from16 v18, v6

    move-object v6, v9

    move-object v12, v10

    const-wide/16 v9, 0x0

    move/from16 v20, v11

    move-object/from16 v19, v12

    const-wide/16 v11, 0x0

    move-object/from16 v4, v18

    move-object/from16 v1, v19

    invoke-static/range {v6 .. v17}, Lg40/j4;->d(Lg40/e1;JJJJLandroidx/compose/runtime/Composer;II)Lg1/y1;

    move-result-object v24

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const v7, -0x308e48d7

    invoke-virtual {v15, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_e

    if-ne v8, v2, :cond_f

    :cond_e
    new-instance v8, Ld42/o;

    const/16 v7, 0x1c

    invoke-direct {v8, v4, v7}, Ld42/o;-><init>(Lc93/a;I)V

    invoke-virtual {v15, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v8, Lc93/a;

    const/4 v7, 0x0

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    const/4 v7, 0x0

    const/4 v9, 0x6

    invoke-static {v6, v3, v7, v8, v9}, Landroidx/compose/foundation/a;->f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const v6, -0x308ea5a2

    invoke-virtual {v15, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v2, :cond_10

    new-instance v6, Lg1/u4;

    const/16 v2, 0xf

    invoke-direct {v6, v2}, Lg1/u4;-><init>(I)V

    invoke-virtual {v15, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object v7, v6

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x0

    invoke-virtual {v15, v2}, Lp1/q;->q(Z)V

    new-instance v2, Lg40/o;

    const/4 v6, 0x0

    invoke-direct {v2, v1, v6}, Lg40/o;-><init>(Lp1/t2;I)V

    const v1, 0x487e6137

    invoke-static {v1, v15, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v11

    const/16 v29, 0x0

    const v30, 0xf7130

    const-string v6, ""

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    move-object/from16 v26, v15

    move/from16 v15, v20

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const v27, 0x30d80c36

    const v28, 0x30030

    invoke-static/range {v6 .. v30}, Lvp/c;->g(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl3/v0;Lc93/m;Lc93/m;Lc93/m;Lc93/m;ZLq3/g0;Lu0/r0;Lu0/q0;ZIILj0/i;Li2/a1;Lg1/e8;Ll0/l1;Landroidx/compose/runtime/Composer;IIII)V

    move-object v2, v0

    :goto_a
    invoke-virtual/range {v26 .. v26}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_11

    new-instance v0, Lar2/a;

    const/16 v6, 0x9

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v6}, Lar2/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void

    :cond_12
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public static b0(Landroid/widget/TextView;I)V
    .locals 2

    invoke-static {p1}, Lwb3/f;->n(I)V

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->getFontMetricsInt(Landroid/graphics/Paint$FontMetricsInt;)I

    move-result v0

    if-eq p1, v0, :cond_0

    sub-int/2addr p1, v0

    int-to-float p1, p1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, p1, v0}, Landroid/widget/TextView;->setLineSpacing(FF)V

    :cond_0
    return-void
.end method

.method public static c0(Landroid/content/res/Configuration;Lb5/g;)V
    .locals 0

    iget-object p1, p1, Lb5/g;->a:Lb5/h;

    iget-object p1, p1, Lb5/h;->a:Landroid/os/LocaleList;

    invoke-virtual {p0, p1}, Landroid/content/res/Configuration;->setLocales(Landroid/os/LocaleList;)V

    return-void
.end method

.method public static final d(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJIFLp3/r;Landroid/graphics/Typeface;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    const-string v0, "markdown"

    move-object/from16 v6, p0

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modifier"

    move-object/from16 v7, p1

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fontWeight"

    move-object/from16 v10, p8

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p11

    check-cast v0, Lp1/q;

    const v1, -0x32c01575

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    sget-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Landroid/content/Context;

    new-instance v8, Lpj/g;

    move-wide/from16 v13, p4

    move/from16 v12, p6

    move/from16 v9, p7

    move-object/from16 v15, p9

    move-object/from16 v16, v10

    move-wide/from16 v10, p2

    invoke-direct/range {v8 .. v16}, Lpj/g;-><init>(FJIJLandroid/graphics/Typeface;Lp3/r;)V

    new-instance v3, Lpj/h;

    move-object/from16 v5, p10

    move-object v1, v3

    move-wide/from16 v3, p4

    invoke-direct/range {v1 .. v6}, Lpj/h;-><init>(Landroid/content/Context;JLkotlin/jvm/functions/Function1;Ljava/lang/String;)V

    move-object v3, v1

    and-int/lit8 v5, p12, 0x70

    const/4 v6, 0x0

    move-object v4, v0

    move-object v2, v7

    move-object v1, v8

    invoke-static/range {v1 .. v6}, Landroidx/compose/ui/viewinterop/a;->a(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v1, Lpj/i;

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-wide/from16 v4, p2

    move-wide/from16 v6, p4

    move/from16 v8, p6

    move/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lpj/i;-><init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJIFLp3/r;Landroid/graphics/Typeface;Lkotlin/jvm/functions/Function1;I)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static d0(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V
    .locals 2

    iget-object v0, p0, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    :cond_0
    if-eqz p1, :cond_1

    new-instance v0, Landroid/text/SpannableStringBuilder;

    invoke-direct {v0, p1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget-object p1, p0, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    const-string v1, "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    iget-object p1, p0, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    const-string v0, "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD"

    invoke-virtual {p1, v0, p2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    iget-object p0, p0, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    const-string p1, "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END"

    invoke-virtual {p0, p1, p3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    return-void
.end method

.method public static final f(FLx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 7

    move-object v4, p2

    check-cast v4, Lp1/q;

    const p2, -0x64206a91

    invoke-virtual {v4, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    if-nez p2, :cond_1

    invoke-virtual {v4, p0}, Lp1/q;->d(F)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    goto :goto_1

    :cond_1
    move p2, p3

    :goto_1
    and-int/lit8 p2, p2, 0x13

    const/16 v0, 0x12

    if-ne p2, v0, :cond_3

    invoke-virtual {v4}, Lp1/q;->F()Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v4}, Lp1/q;->X()V

    goto/16 :goto_4

    :cond_3
    :goto_2
    const p2, 0x105548d6

    invoke-virtual {v4, p2}, Lp1/q;->e0(I)V

    const/4 p2, 0x0

    cmpg-float p2, p0, p2

    const/4 v0, 0x0

    if-nez p2, :cond_7

    sget-object p2, Lb2/e;->w:Lb2/m;

    invoke-static {p2, v0}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object p2

    iget-wide v1, v4, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v6, v4, Lp1/q;->S:Z

    if-eqz v6, :cond_4

    invoke-virtual {v4, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_4
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_3
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v4, v5, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->f:La3/i;

    invoke-static {v4, p2, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->j:La3/i;

    iget-boolean v2, v4, Lp1/q;->S:Z

    if-nez v2, :cond_5

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    :cond_5
    invoke-static {v1, v4, v1, p2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object p2, La3/k;->d:La3/i;

    invoke-static {v4, p2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 p2, 0x36

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    sget-object v1, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {p1, v1, v4, p2}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p2, 0x1

    invoke-virtual {v4, p2}, Lp1/q;->q(Z)V

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_8

    new-instance v0, Lh00/j0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p3, v1}, Lh00/j0;-><init>(FLx1/b;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_7
    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    sget-object p2, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:Lp1/b0;

    invoke-virtual {v4, p2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/res/Configuration;

    iget p2, p2, Landroid/content/res/Configuration;->screenHeightDp:I

    new-instance v0, Lh00/k0;

    invoke-direct {v0, p2, p0, p1}, Lh00/k0;-><init>(IFLx1/b;)V

    const p2, 0x64ae2045

    invoke-static {p2, v4, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    const/16 v5, 0xc00

    const/4 v6, 0x7

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v6}, Ll0/f;->a(Landroidx/compose/ui/Modifier;Lb2/h;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    :goto_4
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_8

    new-instance v0, Lh00/j0;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, p3, v1}, Lh00/j0;-><init>(FLx1/b;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method public static f0(Lbz/c;Lbz/b;)V
    .locals 2

    check-cast p0, Lbz/a;

    iget-object p0, p0, Lbz/a;->a:Ljava/util/LinkedHashMap;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final g(ILkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lh40/l;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lh40/l;

    iget v1, v0, Lh40/l;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh40/l;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh40/l;

    invoke-direct {v0, p2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lh40/l;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh40/l;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p0, v0, Lh40/l;->x:I

    iget p1, v0, Lh40/l;->w:I

    iget-object v2, v0, Lh40/l;->y:Lkotlin/jvm/functions/Function1;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-object p2, v2

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    const/4 p2, 0x0

    move-object v4, p1

    move p1, p0

    move p0, p2

    move-object p2, v4

    :goto_1
    if-ge p0, p1, :cond_3

    :try_start_1
    iput-object p2, v0, Lh40/l;->y:Lkotlin/jvm/functions/Function1;

    iput p1, v0, Lh40/l;->w:I

    iput p0, v0, Lh40/l;->x:I

    iput v3, v0, Lh40/l;->E:I

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p0, v1, :cond_3

    goto :goto_4

    :catch_1
    :goto_2
    add-int/2addr p0, v3

    goto :goto_1

    :cond_3
    :goto_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_4
    return-object v1
.end method

.method public static final g0(Landroid/app/Service;ILandroid/app/Notification;Ljava/lang/String;I)Ln23/h;
    .locals 5

    const-string v0, "[startForegroundWithServiceType] 2 startForeground notificationId: "

    const-string v1, "[startForegroundWithServiceType] 1 startForeground notificationId: "

    const-string v2, "notification"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "trigger"

    invoke-static {p3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v3, 0x1d

    const-string v4, "AndroidUtils"

    if-ge v2, v3, :cond_0

    :try_start_1
    invoke-virtual {p0, p1, p2}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v4, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    goto :goto_2

    :cond_0
    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v1, "outgoing_call"

    :goto_0
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    goto :goto_1

    :sswitch_1
    const-string v1, "share_screen"

    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_1

    goto :goto_1

    :cond_1
    const/16 p4, 0x20

    goto :goto_1

    :sswitch_2
    const-string v1, "ongoing_call"

    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    goto :goto_1

    :sswitch_3
    const-string v1, "incoming_call"

    goto :goto_0

    :goto_1
    invoke-static {p0, p1, p2, p4}, Landroidx/core/app/ServiceCompat;->startForeground(Landroid/app/Service;ILandroid/app/Notification;I)V

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v4, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    :goto_2
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    new-instance p1, Ln23/g;

    invoke-direct {p1, p0}, Ln23/g;-><init>(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :catch_0
    move-exception p0

    sget-object p1, Lb23/i;->a:Lb23/i;

    sget-object p1, Lb23/i;->d:Lb23/e;

    sget-object p2, Lb23/g;->F:Lb23/g;

    const-string p3, "SafeCall"

    invoke-interface {p1, p2, p3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lb23/i;->c:Lb23/j;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p4

    const-string v0, "Exception occurred: "

    invoke-static {v0, p4}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-interface {p1, p2, p3, p4, p0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    new-instance p1, Ln23/f;

    new-instance p2, Ln23/d;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p3

    const-string p4, "Safe call failed with "

    invoke-static {p4, p3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p0}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p1, p2}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1

    :sswitch_data_0
    .sparse-switch
        -0x310b9d29 -> :sswitch_3
        -0x11069f5e -> :sswitch_2
        -0x10d05b34 -> :sswitch_1
        0x54f4351 -> :sswitch_0
    .end sparse-switch
.end method

.method public static final h0(Ly00/c0;Lh20/l1;Ld00/l;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "billingDetailsConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAccount"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Ly00/x;

    if-nez v0, :cond_0

    instance-of v0, p0, Ly00/a0;

    if-eqz v0, :cond_5

    :cond_0
    iget-object v0, p1, Lh20/l1;->z:Lh20/j1;

    sget-object v1, Lh20/j1;->y:Lh20/j1;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Ly00/c0;->b()Ly00/y;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v1, v0, Ly00/y;->x:Ljava/lang/String;

    if-eqz v1, :cond_4

    iget-object v1, v0, Ly00/y;->E:Ljava/lang/String;

    if-eqz v1, :cond_4

    iget-object v1, v0, Ly00/y;->F:Ljava/lang/String;

    if-eqz v1, :cond_4

    iget-object v0, v0, Ly00/y;->G:Lcom/stripe/android/core/model/CountryCode;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lh20/l1;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Ld00/l;->f()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lh20/l1;->h()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-virtual {p0}, Ly00/c0;->b()Ly00/y;

    move-result-object p0

    if-eqz p0, :cond_3

    iget-object p0, p0, Ly00/y;->w:Ljava/lang/String;

    goto :goto_0

    :cond_3
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_5

    :cond_4
    :goto_1
    const/4 p0, 0x0

    return p0

    :cond_5
    const/4 p0, 0x1

    return p0
.end method

.method public static final i0(Lm7/u0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Landroidx/health/platform/client/proto/u;
    .locals 2

    invoke-static {p0}, Lvd/f;->w(Lm7/g0;)Landroidx/health/platform/client/proto/p;

    move-result-object v0

    invoke-static {p1}, Lvd/f;->F(Ljava/lang/String;)Landroidx/health/platform/client/proto/w;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/health/platform/client/proto/p;->f(Landroidx/health/platform/client/proto/w;)V

    invoke-interface {p0}, Lm7/u0;->a()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/health/platform/client/proto/b0;

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v1, v0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v1, Landroidx/health/platform/client/proto/u;

    invoke-static {v1, p1}, Landroidx/health/platform/client/proto/u;->F(Landroidx/health/platform/client/proto/u;Landroidx/health/platform/client/proto/b0;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object p0

    check-cast p0, Landroidx/health/platform/client/proto/u;

    return-object p0
.end method

.method public static j()V
    .locals 2

    const/4 v0, 0x6

    const-string v1, "aggregationType"

    invoke-static {v0, v1}, Lih0/d0;->w(ILjava/lang/String;)V

    return-void
.end method

.method public static k(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;
    .locals 3

    :try_start_0
    new-instance v0, Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialDomException;

    new-instance v1, Ln5/a;

    const/16 v2, 0x1a

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialDomException;-><init>(Ln5/a;Ljava/lang/String;)V

    const-string v1, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ln5/a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_0
    const-string v1, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Ln5/a;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_1
    const-string v1, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Ln5/a;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_2
    const-string v1, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v1, Ln5/a;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_3
    const-string v1, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    new-instance v1, Ln5/a;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_4
    const-string v1, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance v1, Ln5/a;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_5
    const-string v1, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    new-instance v1, Ln5/a;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_6
    const-string v1, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    new-instance v1, Ln5/a;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_7
    const-string v1, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    new-instance v1, Ln5/a;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_8
    const-string v1, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    new-instance v1, Ln5/a;

    const/16 v2, 0x9

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_9
    const-string v1, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    new-instance v1, Ln5/a;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_a
    const-string v1, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    new-instance v1, Ln5/a;

    const/16 v2, 0xb

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_b
    const-string v1, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    new-instance v1, Ln5/a;

    const/16 v2, 0xc

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_c
    const-string v1, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    new-instance v1, Ln5/a;

    const/16 v2, 0xd

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_d
    const-string v1, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    new-instance v1, Ln5/a;

    const/16 v2, 0xe

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_e
    const-string v1, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    new-instance v1, Ln5/a;

    const/16 v2, 0xf

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_f
    const-string v1, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    new-instance v1, Ln5/a;

    const/16 v2, 0x10

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_10
    const-string v1, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    new-instance v1, Ln5/a;

    const/16 v2, 0x11

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_11
    const-string v1, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    new-instance v1, Ln5/a;

    const/16 v2, 0x12

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_12
    const-string v1, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_13

    new-instance v1, Ln5/a;

    const/16 v2, 0x13

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_13
    const-string v1, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_14

    new-instance v1, Ln5/a;

    const/16 v2, 0x14

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_14
    const-string v1, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_15

    new-instance v1, Ln5/a;

    const/16 v2, 0x15

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_15
    const-string v1, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_16

    new-instance v1, Ln5/a;

    const/16 v2, 0x16

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto/16 :goto_0

    :cond_16
    const-string v1, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_17

    new-instance v1, Ln5/a;

    const/16 v2, 0x17

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto :goto_0

    :cond_17
    const-string v1, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_18

    new-instance v1, Ln5/a;

    const/16 v2, 0x18

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto :goto_0

    :cond_18
    const-string v1, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_19

    new-instance v1, Ln5/a;

    const/16 v2, 0x19

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto :goto_0

    :cond_19
    const-string v1, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1a

    new-instance v1, Ln5/a;

    const/16 v2, 0x1a

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto :goto_0

    :cond_1a
    const-string v1, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1b

    new-instance v1, Ln5/a;

    const/16 v2, 0x1b

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    goto :goto_0

    :cond_1b
    const-string v1, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1c

    new-instance v1, Ln5/a;

    const/16 v2, 0x1c

    invoke-direct {v1, v2}, Ln5/a;-><init>(I)V

    invoke-static {v1, p1, v0}, Lvd/f;->d(Ln5/a;Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/Exception;

    move-result-object v0

    :goto_0
    check-cast v0, Landroidx/credentials/exceptions/CreateCredentialException;

    return-object v0

    :cond_1c
    new-instance v0, Landroidx/credentials/internal/FrameworkClassParsingException;

    invoke-direct {v0}, Landroidx/credentials/internal/FrameworkClassParsingException;-><init>()V

    throw v0
    :try_end_0
    .catch Landroidx/credentials/internal/FrameworkClassParsingException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance v0, Landroidx/credentials/exceptions/CreateCredentialCustomException;

    invoke-direct {v0, p0, p1}, Landroidx/credentials/exceptions/CreateCredentialCustomException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final l(I)Ljava/lang/String;
    .locals 1

    const-string v0, "appWidget-"

    invoke-static {p0, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final l0(JJ)J
    .locals 7

    invoke-static {p0, p1}, Ll3/u0;->f(J)I

    move-result v0

    invoke-static {p0, p1}, Ll3/u0;->e(J)I

    move-result v1

    invoke-static {p2, p3}, Ll3/u0;->f(J)I

    move-result v2

    invoke-static {p0, p1}, Ll3/u0;->e(J)I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ge v2, v3, :cond_0

    move v2, v5

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    invoke-static {p0, p1}, Ll3/u0;->f(J)I

    move-result v3

    invoke-static {p2, p3}, Ll3/u0;->e(J)I

    move-result v6

    if-ge v3, v6, :cond_1

    move v3, v5

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    and-int/2addr v2, v3

    if-eqz v2, :cond_9

    invoke-static {p2, p3}, Ll3/u0;->f(J)I

    move-result v2

    invoke-static {p0, p1}, Ll3/u0;->f(J)I

    move-result v3

    if-gt v2, v3, :cond_2

    move v2, v5

    goto :goto_2

    :cond_2
    move v2, v4

    :goto_2
    invoke-static {p0, p1}, Ll3/u0;->e(J)I

    move-result v3

    invoke-static {p2, p3}, Ll3/u0;->e(J)I

    move-result v6

    if-gt v3, v6, :cond_3

    move v3, v5

    goto :goto_3

    :cond_3
    move v3, v4

    :goto_3
    and-int/2addr v2, v3

    if-eqz v2, :cond_4

    invoke-static {p2, p3}, Ll3/u0;->f(J)I

    move-result v0

    move v1, v0

    goto :goto_6

    :cond_4
    invoke-static {p0, p1}, Ll3/u0;->f(J)I

    move-result v2

    invoke-static {p2, p3}, Ll3/u0;->f(J)I

    move-result v3

    if-gt v2, v3, :cond_5

    move v2, v5

    goto :goto_4

    :cond_5
    move v2, v4

    :goto_4
    invoke-static {p2, p3}, Ll3/u0;->e(J)I

    move-result v3

    invoke-static {p0, p1}, Ll3/u0;->e(J)I

    move-result p0

    if-gt v3, p0, :cond_6

    move v4, v5

    :cond_6
    and-int p0, v2, v4

    if-eqz p0, :cond_7

    invoke-static {p2, p3}, Ll3/u0;->d(J)I

    move-result p0

    :goto_5
    sub-int/2addr v1, p0

    goto :goto_6

    :cond_7
    invoke-static {p2, p3}, Ll3/u0;->f(J)I

    move-result p0

    invoke-static {p2, p3}, Ll3/u0;->e(J)I

    move-result p1

    if-ge v0, p1, :cond_8

    if-gt p0, v0, :cond_8

    invoke-static {p2, p3}, Ll3/u0;->f(J)I

    move-result v0

    invoke-static {p2, p3}, Ll3/u0;->d(J)I

    move-result p0

    goto :goto_5

    :cond_8
    invoke-static {p2, p3}, Ll3/u0;->f(J)I

    move-result v1

    goto :goto_6

    :cond_9
    invoke-static {p2, p3}, Ll3/u0;->f(J)I

    move-result p0

    if-le v1, p0, :cond_a

    invoke-static {p2, p3}, Ll3/u0;->d(J)I

    move-result p0

    sub-int/2addr v0, p0

    invoke-static {p2, p3}, Ll3/u0;->d(J)I

    move-result p0

    goto :goto_5

    :cond_a
    :goto_6
    invoke-static {v0, v1}, Lj93/l0;->f(II)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final m()J
    .locals 2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    return-wide v0
.end method

.method public static m0(I)I
    .locals 1

    and-int/lit8 v0, p0, -0x80

    if-nez v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    and-int/lit16 v0, p0, -0x4000

    if-nez v0, :cond_1

    const/4 p0, 0x2

    return p0

    :cond_1
    const/high16 v0, -0x200000

    and-int/2addr v0, p0

    if-nez v0, :cond_2

    const/4 p0, 0x3

    return p0

    :cond_2
    const/high16 v0, -0x10000000

    and-int/2addr p0, v0

    if-nez p0, :cond_3

    const/4 p0, 0x4

    return p0

    :cond_3
    const/4 p0, 0x5

    return p0
.end method

.method public static final n(Llb3/q0;)Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lvd/e;->o(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "hashCode: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lvd/e;->o(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "javaClass: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lvd/e;->o(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    invoke-interface {p0}, Llb3/q0;->d()Lr93/h;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "fqName: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v3, Lxa3/i;->c:Lxa3/i;

    invoke-virtual {v3, p0}, Lxa3/i;->w(Lr93/k;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lvd/e;->o(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lvd/e;->o(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    invoke-interface {p0}, Lr93/k;->g()Lr93/k;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static n0(J)I
    .locals 4

    const-wide/16 v0, -0x80

    and-long/2addr v0, p0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const-wide/16 v0, -0x4000

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    const/4 p0, 0x2

    return p0

    :cond_1
    const-wide/32 v0, -0x200000

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    const/4 p0, 0x3

    return p0

    :cond_2
    const-wide/32 v0, -0x10000000

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_3

    const/4 p0, 0x4

    return p0

    :cond_3
    const-wide v0, -0x800000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_4

    const/4 p0, 0x5

    return p0

    :cond_4
    const-wide v0, -0x40000000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_5

    const/4 p0, 0x6

    return p0

    :cond_5
    const-wide/high16 v0, -0x2000000000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_6

    const/4 p0, 0x7

    return p0

    :cond_6
    const-wide/high16 v0, -0x100000000000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_7

    const/16 p0, 0x8

    return p0

    :cond_7
    const-wide/high16 v0, -0x8000000000000000L

    and-long/2addr p0, v0

    cmp-long p0, p0, v2

    if-nez p0, :cond_8

    const/16 p0, 0x9

    return p0

    :cond_8
    const/16 p0, 0xa

    return p0
.end method

.method public static final o(Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0xa

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static p(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    const-string p1, "aggregationType"

    invoke-static {p0, p1}, Lih0/d0;->w(ILjava/lang/String;)V

    invoke-static {p0, p1}, Lih0/d0;->w(ILjava/lang/String;)V

    return-void
.end method

.method public static q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    const-string p1, "aggregationType"

    invoke-static {p0, p1}, Lih0/d0;->w(ILjava/lang/String;)V

    invoke-static {p0, p1}, Lih0/d0;->w(ILjava/lang/String;)V

    return-void
.end method

.method public static s()V
    .locals 2

    const/4 v0, 0x1

    const-string v1, "aggregationType"

    invoke-static {v0, v1}, Lih0/d0;->w(ILjava/lang/String;)V

    return-void
.end method

.method public static t()V
    .locals 2

    const/4 v0, 0x5

    const-string v1, "aggregationType"

    invoke-static {v0, v1}, Lih0/d0;->w(ILjava/lang/String;)V

    invoke-static {v0, v1}, Lih0/d0;->w(ILjava/lang/String;)V

    return-void
.end method

.method public static final u(I)Z
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final v(Landroid/os/Bundle;)Ljava/util/List;
    .locals 6

    const-string v0, "appWidgetMinHeight"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    const-string v2, "appWidgetMaxWidth"

    invoke-virtual {p0, v2, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    int-to-float v2, v2

    int-to-float v0, v0

    invoke-static {v2, v0}, Lvf3/b;->a(FF)J

    move-result-wide v4

    new-instance v0, Ly3/h;

    invoke-direct {v0, v4, v5}, Ly3/h;-><init>(J)V

    goto :goto_1

    :cond_1
    :goto_0
    move-object v0, v3

    :goto_1
    const-string v2, "appWidgetMaxHeight"

    invoke-virtual {p0, v2, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    const-string v4, "appWidgetMinWidth"

    invoke-virtual {p0, v4, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p0

    if-eqz v2, :cond_3

    if-nez p0, :cond_2

    goto :goto_2

    :cond_2
    int-to-float p0, p0

    int-to-float v1, v2

    invoke-static {p0, v1}, Lvf3/b;->a(FF)J

    move-result-wide v1

    new-instance v3, Ly3/h;

    invoke-direct {v3, v1, v2}, Ly3/h;-><init>(J)V

    :cond_3
    :goto_2
    filled-new-array {v0, v3}, [Ly3/h;

    move-result-object p0

    invoke-static {p0}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract A()I
.end method

.method public abstract B(Landroid/view/View;)I
.end method

.method public abstract C(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)I
.end method

.method public abstract E()I
.end method

.method public abstract I(F)Z
.end method

.method public abstract K(Landroid/view/View;)Z
.end method

.method public abstract L(FF)Z
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "ex"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "value"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public e()V
    .locals 0

    return-void
.end method

.method public abstract e0(Landroid/view/View;F)Z
.end method

.method public abstract h(Landroid/view/ViewGroup$MarginLayoutParams;)I
.end method

.method public abstract i(I)F
.end method

.method public abstract j0(Landroid/view/ViewGroup$MarginLayoutParams;I)V
.end method

.method public abstract k0(Landroid/view/ViewGroup$MarginLayoutParams;II)V
.end method

.method public r(Lc93/a;)V
    .locals 0

    return-void
.end method

.method public abstract w(Landroid/view/ViewGroup$MarginLayoutParams;)I
.end method

.method public abstract x()I
.end method

.method public abstract y()I
.end method

.method public abstract z()I
.end method
