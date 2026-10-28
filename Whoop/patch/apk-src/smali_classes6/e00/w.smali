.class public final Le00/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lb10/d;

.field public final b:Lc93/a;

.field public final c:Lc93/a;

.field public final d:Lb10/c1;

.field public final e:Lg30/g;

.field public final f:Lq83/j;

.field public final g:Ljava/util/Locale;

.field public final h:Lb20/f;

.field public final i:Lty/a;


# direct methods
.method public constructor <init>(Landroid/app/Application;Lb10/d;Lc93/a;Lc93/a;Lb10/c1;Lg30/g;Lq83/j;Ljava/util/Locale;Lb20/f;)V
    .locals 1

    const-string v0, "application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestSurface"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKeyProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeAccountIdProvider"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeRepository"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consumersApiService"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Le00/w;->a:Lb10/d;

    iput-object p3, p0, Le00/w;->b:Lc93/a;

    iput-object p4, p0, Le00/w;->c:Lc93/a;

    iput-object p5, p0, Le00/w;->d:Lb10/c1;

    iput-object p6, p0, Le00/w;->e:Lg30/g;

    iput-object p7, p0, Le00/w;->f:Lq83/j;

    iput-object p8, p0, Le00/w;->g:Ljava/util/Locale;

    iput-object p9, p0, Le00/w;->h:Lb20/f;

    invoke-static {p1, p7}, Ls4/d;->a(Landroid/content/Context;Lq83/j;)Lty/a;

    move-result-object p1

    iput-object p1, p0, Le00/w;->i:Lty/a;

    invoke-virtual {p1}, Lty/a;->b()V

    return-void
.end method

.method public static final a(Le00/w;Ly00/n;)Ljava/util/Map;
    .locals 0

    const-string p0, "client_attribution_metadata"

    invoke-virtual {p1}, Ly00/n;->c0()Ljava/util/Map;

    move-result-object p1

    invoke-static {p0, p1}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b()Lyy/f;
    .locals 4

    new-instance v0, Lyy/f;

    iget-object v1, p0, Le00/w;->b:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Le00/w;->c:Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x4

    invoke-direct {v0, v1, v2, v3}, Lyy/f;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ls83/c;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p4, Le00/a;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Le00/a;

    iget v1, v0, Le00/a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le00/a;->y:I

    :goto_0
    move-object v7, v0

    goto :goto_1

    :cond_0
    new-instance v0, Le00/a;

    invoke-direct {v0, p0, p4}, Le00/a;-><init>(Le00/w;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object p4, v7, Le00/a;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v7, Le00/a;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    :try_start_0
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object v1, p0, Le00/w;->e:Lg30/g;

    iget-object p4, p0, Le00/w;->a:Lb10/d;

    iget-object v4, p4, Lb10/d;->w:Ljava/lang/String;

    sget-object p4, Ly00/j8;->w:[Ly00/j8;

    invoke-virtual {p0}, Le00/w;->b()Lyy/f;

    move-result-object v6

    iput v2, v7, Le00/a;->y:I

    move-object v3, p1

    move-object v2, p2

    move-object v5, p3

    invoke-virtual/range {v1 .. v7}, Lg30/g;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lyy/f;Le00/a;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    if-eqz p4, :cond_4

    check-cast p4, Lcom/stripe/android/model/ConsumerSession;

    return-object p4

    :cond_4
    const-string p1, "Required value was null."

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_3
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/l0;Ls83/c;)Ljava/lang/Object;
    .locals 13

    move-object/from16 v0, p7

    instance-of v2, v0, Le00/b;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Le00/b;

    iget v3, v2, Le00/b;->y:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Le00/b;->y:I

    :goto_0
    move-object v10, v2

    goto :goto_1

    :cond_0
    new-instance v2, Le00/b;

    invoke-direct {v2, p0, v0}, Le00/b;-><init>(Le00/w;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v0, v10, Le00/b;->w:Ljava/lang/Object;

    sget-object v11, Lr83/a;->w:Lr83/a;

    iget v2, v10, Le00/b;->y:I

    const/4 v12, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v12, :cond_1

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v0, Le00/c;

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    invoke-direct/range {v0 .. v9}, Le00/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v12, v10, Le00/b;->y:I

    iget-object v2, p0, Le00/w;->f:Lq83/j;

    invoke-static {v2, v0, v10}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_3

    return-object v11

    :cond_3
    :goto_2
    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;

    return-object v0
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/n;Ls83/c;)Ljava/lang/Object;
    .locals 11

    move-object/from16 v0, p5

    instance-of v2, v0, Le00/d;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Le00/d;

    iget v3, v2, Le00/d;->y:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Le00/d;->y:I

    :goto_0
    move-object v8, v2

    goto :goto_1

    :cond_0
    new-instance v2, Le00/d;

    invoke-direct {v2, p0, v0}, Le00/d;-><init>(Le00/w;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v0, v8, Le00/d;->w:Ljava/lang/Object;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v2, v8, Le00/d;->y:I

    const/4 v10, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v10, :cond_1

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v0, Lcz/d;

    const/4 v6, 0x0

    const/4 v7, 0x4

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-object v2, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v7}, Lcz/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v10, v8, Le00/d;->y:I

    iget-object v2, p0, Le00/w;->f:Lq83/j;

    invoke-static {v2, v0, v8}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_3

    return-object v9

    :cond_3
    :goto_2
    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Ly00/d5;Ljava/lang/String;Ljava/lang/String;Ly00/n;Ls83/c;)Ljava/lang/Object;
    .locals 10

    instance-of v2, p5, Le00/e;

    if-eqz v2, :cond_0

    move-object v2, p5

    check-cast v2, Le00/e;

    iget v3, v2, Le00/e;->y:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Le00/e;->y:I

    :goto_0
    move-object v7, v2

    goto :goto_1

    :cond_0
    new-instance v2, Le00/e;

    invoke-direct {v2, p0, p5}, Le00/e;-><init>(Le00/w;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v0, v7, Le00/e;->w:Ljava/lang/Object;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v2, v7, Le00/e;->y:I

    const/4 v9, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v9, :cond_1

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v0, Le00/f;

    const/4 v6, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-object v2, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v6}, Le00/f;-><init>(Le00/w;Ljava/lang/String;Ly00/d5;Ljava/lang/String;Ly00/n;Lq83/d;)V

    iput v9, v7, Le00/e;->y:I

    iget-object v2, p0, Le00/w;->f:Lq83/j;

    invoke-static {v2, v0, v7}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_3

    return-object v8

    :cond_3
    :goto_2
    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;

    return-object v0
.end method

.method public final g(Ljava/lang/String;Ly00/c8;Ly00/p2;Ls83/c;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p4, Le00/g;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Le00/g;

    iget v1, v0, Le00/g;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le00/g;->y:I

    :goto_0
    move-object v7, v0

    goto :goto_1

    :cond_0
    new-instance v0, Le00/g;

    invoke-direct {v0, p0, p4}, Le00/g;-><init>(Le00/w;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object p4, v7, Le00/g;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v7, Le00/g;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p4, Ll83/n;

    iget-object p1, p4, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {p2}, Ly00/c8;->getClientSecret()Ljava/lang/String;

    move-result-object v3

    iget-object p2, p0, Le00/w;->a:Lb10/d;

    iget-object v5, p2, Lb10/d;->w:Ljava/lang/String;

    invoke-virtual {p0}, Le00/w;->b()Lyy/f;

    move-result-object v6

    iput v2, v7, Le00/g;->y:I

    iget-object v1, p0, Le00/w;->e:Lg30/g;

    move-object v2, p1

    move-object v4, p3

    invoke-virtual/range {v1 .. v7}, Lg30/g;->b(Ljava/lang/String;Ljava/lang/String;Ly00/p2;Ljava/lang/String;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    return-object p1
.end method

.method public final h(Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p3, Le00/h;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Le00/h;

    iget v1, v0, Le00/h;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le00/h;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Le00/h;

    invoke-direct {v0, p0, p3}, Le00/h;-><init>(Le00/w;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Le00/h;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le00/h;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Le00/w;->b()Lyy/f;

    move-result-object p3

    iput v3, v0, Le00/h;->y:I

    iget-object v2, p0, Le00/w;->d:Lb10/c1;

    check-cast v2, Lb10/z0;

    invoke-virtual {v2, p2, p1, v0, p3}, Lb10/z0;->t(Ljava/lang/String;Ljava/lang/String;Ls83/c;Lyy/f;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final i(Ljava/util/Set;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p3, Le00/i;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Le00/i;

    iget v1, v0, Le00/i;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le00/i;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Le00/i;

    invoke-direct {v0, p0, p3}, Le00/i;-><init>(Le00/w;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Le00/i;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le00/i;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Le00/w;->b()Lyy/f;

    move-result-object p3

    iput v3, v0, Le00/i;->y:I

    iget-object v2, p0, Le00/w;->d:Lb10/c1;

    check-cast v2, Lb10/z0;

    invoke-virtual {v2, p2, p1, v0, p3}, Lb10/z0;->D(Ljava/lang/String;Ljava/util/Set;Ls83/c;Lyy/f;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final j(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Le00/j;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Le00/j;

    iget v1, v0, Le00/j;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le00/j;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Le00/j;

    invoke-direct {v0, p0, p2}, Le00/j;-><init>(Le00/w;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Le00/j;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le00/j;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p1, p2, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Le00/w;->b()Lyy/f;

    move-result-object p2

    iput v3, v0, Le00/j;->y:I

    iget-object v2, p0, Le00/w;->d:Lb10/c1;

    check-cast v2, Lb10/z0;

    invoke-virtual {v2, p1, p2, v0}, Lb10/z0;->E(Ljava/lang/String;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final k(Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p3, Le00/k;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Le00/k;

    iget v1, v0, Le00/k;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le00/k;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Le00/k;

    invoke-direct {v0, p0, p3}, Le00/k;-><init>(Le00/w;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Le00/k;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le00/k;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v5, p0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v4, La1/h;

    const/4 v8, 0x0

    const/16 v9, 0x10

    move-object v5, p0

    move-object v6, p1

    move-object v7, p2

    invoke-direct/range {v4 .. v9}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v3, v0, Le00/k;->y:I

    iget-object p1, v5, Le00/w;->f:Lq83/j;

    invoke-static {p1, v4, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    return-object p1
.end method

.method public final l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ls83/c;)Ljava/lang/Object;
    .locals 11

    move-object/from16 v0, p6

    instance-of v2, v0, Le00/l;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Le00/l;

    iget v3, v2, Le00/l;->y:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Le00/l;->y:I

    :goto_0
    move-object v8, v2

    goto :goto_1

    :cond_0
    new-instance v2, Le00/l;

    invoke-direct {v2, p0, v0}, Le00/l;-><init>(Le00/w;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v0, v8, Le00/l;->w:Ljava/lang/Object;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v2, v8, Le00/l;->y:I

    const/4 v10, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v10, :cond_1

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v0, Le00/c;

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v6, p4

    move-object/from16 v5, p5

    invoke-direct/range {v0 .. v7}, Le00/c;-><init>(Le00/w;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lq83/d;)V

    iput v10, v8, Le00/l;->y:I

    iget-object v2, p0, Le00/w;->f:Lq83/j;

    invoke-static {v2, v0, v8}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_3

    return-object v9

    :cond_3
    :goto_2
    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;

    return-object v0
.end method

.method public final m(Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p3, Le00/m;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Le00/m;

    iget v1, v0, Le00/m;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le00/m;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Le00/m;

    invoke-direct {v0, p0, p3}, Le00/m;-><init>(Le00/w;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Le00/m;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le00/m;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v5, p0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v4, Lb2/y;

    const/4 v8, 0x0

    const/4 v9, 0x3

    move-object v5, p0

    move-object v6, p1

    move-object v7, p2

    invoke-direct/range {v4 .. v9}, Lb2/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v3, v0, Le00/m;->y:I

    iget-object p1, v5, Le00/w;->f:Lq83/j;

    invoke-static {p1, v4, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    return-object p1
.end method

.method public final n(Ljava/lang/String;Ly00/c2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 15

    move-object/from16 v0, p10

    instance-of v2, v0, Le00/n;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Le00/n;

    iget v3, v2, Le00/n;->y:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Le00/n;->y:I

    :goto_0
    move-object v12, v2

    goto :goto_1

    :cond_0
    new-instance v2, Le00/n;

    invoke-direct {v2, p0, v0}, Le00/n;-><init>(Le00/w;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v0, v12, Le00/n;->w:Ljava/lang/Object;

    sget-object v13, Lr83/a;->w:Lr83/a;

    iget v2, v12, Le00/n;->y:I

    const/4 v14, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v14, :cond_1

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v0, Le00/o;

    const/4 v11, 0x0

    move-object v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v7, p8

    move-object/from16 v10, p9

    invoke-direct/range {v0 .. v11}, Le00/o;-><init>(Le00/w;Ljava/lang/String;Ly00/c2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    iput v14, v12, Le00/n;->y:I

    iget-object v2, p0, Le00/w;->f:Lq83/j;

    invoke-static {v2, v0, v12}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v13, :cond_3

    return-object v13

    :cond_3
    :goto_2
    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;

    return-object v0
.end method

.method public final o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/l0;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p11

    instance-of v2, v0, Le00/p;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Le00/p;

    iget v3, v2, Le00/p;->y:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Le00/p;->y:I

    :goto_0
    move-object v13, v2

    goto :goto_1

    :cond_0
    new-instance v2, Le00/p;

    invoke-direct {v2, v1, v0}, Le00/p;-><init>(Le00/w;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v0, v13, Le00/p;->w:Ljava/lang/Object;

    sget-object v14, Lr83/a;->w:Lr83/a;

    iget v2, v13, Le00/p;->y:I

    const/4 v15, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v15, :cond_1

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v0, Le00/o;

    const/4 v12, 0x0

    move-object/from16 v6, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v9, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v0 .. v12}, Le00/o;-><init>(Le00/w;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ly00/l0;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    iput v15, v13, Le00/p;->y:I

    iget-object v2, v1, Le00/w;->f:Lq83/j;

    invoke-static {v2, v0, v13}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v14, :cond_3

    return-object v14

    :cond_3
    :goto_2
    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;

    return-object v0
.end method

.method public final p(Ljava/lang/String;ZLs83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p3, Le00/q;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Le00/q;

    iget v1, v0, Le00/q;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le00/q;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Le00/q;

    invoke-direct {v0, p0, p3}, Le00/q;-><init>(Le00/w;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Le00/q;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le00/q;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p3, Landroidx/room/y0;

    const/4 v2, 0x0

    invoke-direct {p3, p0, p1, p2, v2}, Landroidx/room/y0;-><init>(Le00/w;Ljava/lang/String;ZLq83/d;)V

    iput v3, v0, Le00/q;->y:I

    iget-object p1, p0, Le00/w;->f:Lq83/j;

    invoke-static {p1, p3, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    return-object p1
.end method

.method public final q(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ls83/c;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p4, Le00/r;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Le00/r;

    iget v1, v0, Le00/r;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le00/r;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Le00/r;

    invoke-direct {v0, p0, p4}, Le00/r;-><init>(Le00/w;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Le00/r;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le00/r;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v5, p0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v4, Lcz/d;

    const/4 v9, 0x0

    const/4 v10, 0x5

    move-object v5, p0

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    invoke-direct/range {v4 .. v10}, Lcz/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v3, v0, Le00/r;->y:I

    iget-object p1, v5, Le00/w;->f:Lq83/j;

    invoke-static {p1, v4, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p4, Ll83/n;

    iget-object p1, p4, Ll83/n;->w:Ljava/lang/Object;

    return-object p1
.end method

.method public final r(Ly00/d5;Ljava/lang/String;Ljava/lang/String;Ly00/n;Ls83/c;)Ljava/lang/Object;
    .locals 10

    instance-of v1, p5, Le00/s;

    if-eqz v1, :cond_0

    move-object v1, p5

    check-cast v1, Le00/s;

    iget v3, v1, Le00/s;->y:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v1, Le00/s;->y:I

    :goto_0
    move-object v7, v1

    goto :goto_1

    :cond_0
    new-instance v1, Le00/s;

    invoke-direct {v1, p0, p5}, Le00/s;-><init>(Le00/w;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v0, v7, Le00/s;->w:Ljava/lang/Object;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v1, v7, Le00/s;->y:I

    const/4 v9, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v9, :cond_1

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v0, Le00/f;

    const/4 v6, 0x0

    move-object v2, p0

    move-object v1, p1

    move-object v5, p2

    move-object v4, p3

    move-object v3, p4

    invoke-direct/range {v0 .. v6}, Le00/f;-><init>(Ly00/d5;Le00/w;Ly00/n;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    iput v9, v7, Le00/s;->y:I

    iget-object v1, p0, Le00/w;->f:Lq83/j;

    invoke-static {v1, v0, v7}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_3

    return-object v8

    :cond_3
    :goto_2
    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;

    return-object v0
.end method

.method public final s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/n;Ls83/c;)Ljava/lang/Object;
    .locals 13

    move-object/from16 v0, p8

    instance-of v2, v0, Le00/t;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Le00/t;

    iget v3, v2, Le00/t;->y:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Le00/t;->y:I

    :goto_0
    move-object v10, v2

    goto :goto_1

    :cond_0
    new-instance v2, Le00/t;

    invoke-direct {v2, p0, v0}, Le00/t;-><init>(Le00/w;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v0, v10, Le00/t;->w:Ljava/lang/Object;

    sget-object v11, Lr83/a;->w:Lr83/a;

    iget v2, v10, Le00/t;->y:I

    const/4 v12, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v12, :cond_1

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v0, La30/q;

    const/4 v9, 0x0

    move-object v1, p0

    move-object v5, p1

    move-object v6, p2

    move-object/from16 v7, p3

    move-object/from16 v8, p4

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    move-object/from16 v4, p7

    invoke-direct/range {v0 .. v9}, La30/q;-><init>(Le00/w;Ljava/lang/String;Ljava/lang/String;Ly00/n;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    iput v12, v10, Le00/t;->y:I

    iget-object v2, p0, Le00/w;->f:Lq83/j;

    invoke-static {v2, v0, v10}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_3

    return-object v11

    :cond_3
    :goto_2
    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;

    return-object v0
.end method

.method public final t(Ljava/lang/String;ZLs83/c;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p3, Le00/u;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Le00/u;

    iget v1, v0, Le00/u;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le00/u;->y:I

    :goto_0
    move-object v7, v0

    goto :goto_1

    :cond_0
    new-instance v0, Le00/u;

    invoke-direct {v0, p0, p3}, Le00/u;-><init>(Le00/w;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object p3, v7, Le00/u;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v7, Le00/u;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object v1, p0, Le00/w;->e:Lg30/g;

    iget-object p3, p0, Le00/w;->g:Ljava/util/Locale;

    if-nez p3, :cond_3

    sget-object p3, Ljava/util/Locale;->US:Ljava/util/Locale;

    :cond_3
    move-object v3, p3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p3, p0, Le00/w;->a:Lb10/d;

    iget-object v4, p3, Lb10/d;->w:Ljava/lang/String;

    sget-object p3, Ly00/j8;->w:[Ly00/j8;

    invoke-virtual {p0}, Le00/w;->b()Lyy/f;

    move-result-object v5

    iput v2, v7, Le00/u;->y:I

    move-object v2, p1

    move v6, p2

    invoke-virtual/range {v1 .. v7}, Lg30/g;->k(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Lyy/f;ZLe00/u;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v0, :cond_4

    return-object v0

    :cond_4
    :goto_2
    if-eqz p3, :cond_5

    check-cast p3, Lcom/stripe/android/model/ConsumerSession;

    return-object p3

    :cond_5
    const-string p1, "Required value was null."

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_3
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1
.end method

.method public final u(Ly00/i0;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p3, Le00/v;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Le00/v;

    iget v1, v0, Le00/v;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le00/v;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Le00/v;

    invoke-direct {v0, p0, p3}, Le00/v;-><init>(Le00/w;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Le00/v;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le00/v;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Le00/w;->b()Lyy/f;

    move-result-object p3

    iput v3, v0, Le00/v;->y:I

    iget-object v2, p0, Le00/w;->d:Lb10/c1;

    check-cast v2, Lb10/z0;

    invoke-virtual {v2, p2, p1, p3, v0}, Lb10/z0;->W(Ljava/lang/String;Ly00/i0;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method
