.class public final Lxz/x;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lxz/f0;

.field public final b:Lwz/g0;

.field public final c:Le00/w;

.field public final d:Lyz/b;

.field public final e:Lb20/f;

.field public final f:Lwz/n0;

.field public final g:Lxz/e0;

.field public final h:Lec3/h2;

.field public final i:Lec3/r1;

.field public j:Ly00/k0;

.field public final k:Lec3/h2;

.field public final l:Lec3/r1;

.field public final m:Landroidx/room/y;


# direct methods
.method public constructor <init>(Lxz/f0;Lwz/g0;Le00/w;Lyz/b;Lb20/f;Lwz/n0;Lxz/e0;)V
    .locals 1

    const-string v0, "linkAccountHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkEventsReporter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAuth"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxz/x;->a:Lxz/f0;

    iput-object p2, p0, Lxz/x;->b:Lwz/g0;

    iput-object p3, p0, Lxz/x;->c:Le00/w;

    iput-object p4, p0, Lxz/x;->d:Lyz/b;

    iput-object p5, p0, Lxz/x;->e:Lb20/f;

    iput-object p6, p0, Lxz/x;->f:Lwz/n0;

    iput-object p7, p0, Lxz/x;->g:Lxz/e0;

    const/4 p2, 0x0

    invoke-static {p2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p3

    iput-object p3, p0, Lxz/x;->h:Lec3/h2;

    invoke-static {p3}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object p3

    iput-object p3, p0, Lxz/x;->i:Lec3/r1;

    invoke-static {p2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p2

    iput-object p2, p0, Lxz/x;->k:Lec3/h2;

    invoke-static {p2}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object p2

    iput-object p2, p0, Lxz/x;->l:Lec3/r1;

    iget-object p1, p1, Lxz/f0;->b:Lec3/r1;

    new-instance p2, Landroidx/room/y;

    const/16 p3, 0x8

    invoke-direct {p2, p3, p1, p0}, Landroidx/room/y;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, p0, Lxz/x;->m:Landroidx/room/y;

    return-void
.end method

.method public static synthetic p(Lxz/x;Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Ls83/c;I)Ljava/lang/Object;
    .locals 6

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    move-object v2, p2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v5, p3

    invoke-virtual/range {v0 .. v5}, Lxz/x;->o(Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;Ld00/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/Boolean;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p3, Lxz/a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lxz/a;

    iget v1, v0, Lxz/a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lxz/a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lxz/a;

    invoke-direct {v0, p0, p3}, Lxz/a;-><init>(Lxz/x;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lxz/a;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lxz/a;->z:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lxz/a;->w:Lxz/x;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p2, p3, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Lxz/x;->a:Lxz/f0;

    iget-object p3, p3, Lxz/f0;->b:Lec3/r1;

    iget-object p3, p3, Lec3/r1;->w:Lec3/f2;

    invoke-interface {p3}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lwz/d;

    iget-object p3, p3, Lwz/d;->w:Ld00/l;

    if-nez p3, :cond_4

    new-instance p1, Lcom/stripe/android/link/NoLinkAccountFoundException;

    invoke-direct {p1}, Lcom/stripe/android/link/NoLinkAccountFoundException;-><init>()V

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1

    :cond_4
    iget-object p3, p3, Ld00/l;->G:Ljava/lang/String;

    iput-object p0, v0, Lxz/a;->w:Lxz/x;

    iput v4, v0, Lxz/a;->z:I

    iget-object v2, p0, Lxz/x;->c:Le00/w;

    invoke-virtual {v2, p1, p3, p2, v0}, Le00/w;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto :goto_2

    :cond_5
    move-object p1, p0

    :goto_1
    instance-of p3, p2, Ll83/m;

    const/4 v2, 0x0

    if-nez p3, :cond_6

    move-object v4, p2

    check-cast v4, Lcom/stripe/android/model/ConsumerSession;

    iget-object v4, p1, Lxz/x;->d:Lyz/b;

    sget-object v5, Lyz/c;->Q:Lyz/c;

    invoke-virtual {v4, v5, v2}, Lyz/b;->a(Ldz/i;Ljava/util/Map;)V

    :cond_6
    invoke-static {p2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_7

    iget-object v4, p1, Lxz/x;->d:Lyz/b;

    sget-object v5, Lyz/c;->R:Lyz/c;

    invoke-virtual {v4, v5, v2}, Lyz/b;->a(Ldz/i;Ljava/util/Map;)V

    :cond_7
    if-nez p3, :cond_9

    check-cast p2, Lcom/stripe/android/model/ConsumerSession;

    iput-object v2, v0, Lxz/a;->w:Lxz/x;

    iput v3, v0, Lxz/a;->z:I

    const/16 p3, 0xe

    invoke-static {p1, p2, v2, v0, p3}, Lxz/x;->p(Lxz/x;Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Ls83/c;I)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_8

    :goto_2
    return-object v1

    :cond_8
    :goto_3
    check-cast p3, Ld00/l;

    return-object p3

    :cond_9
    return-object p2
.end method

.method public final b(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lxz/b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lxz/b;

    iget v1, v0, Lxz/b;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lxz/b;->y:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lxz/b;

    invoke-direct {v0, p0, p2}, Lxz/b;-><init>(Lxz/x;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Lxz/b;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lxz/b;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

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

    iget-object p2, p0, Lxz/x;->a:Lxz/f0;

    iget-object p2, p2, Lxz/f0;->b:Lec3/r1;

    iget-object p2, p2, Lec3/r1;->w:Lec3/f2;

    invoke-interface {p2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lwz/d;

    iget-object p2, p2, Lwz/d;->w:Ld00/l;

    if-eqz p2, :cond_4

    iget-object v3, p2, Ld00/l;->H:Ljava/lang/String;

    iget-object v4, p2, Ld00/l;->G:Ljava/lang/String;

    iget-object p2, p0, Lxz/x;->b:Lwz/g0;

    iget-object v5, p2, Lwz/g0;->i0:Ly00/n;

    iput v2, v6, Lxz/b;->y:I

    iget-object v1, p0, Lxz/x;->c:Le00/w;

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Le00/w;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/n;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    return-object p1

    :cond_4
    sget-object p1, Lb20/e;->M:Lb20/e;

    const/4 p2, 0x6

    iget-object v0, p0, Lxz/x;->e:Lb20/f;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1, v1, p2}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "A non-null Link account is needed to create payment details"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ly00/d5;Ls83/c;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p2, Lxz/c;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lxz/c;

    iget v1, v0, Lxz/c;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lxz/c;->z:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lxz/c;

    invoke-direct {v0, p0, p2}, Lxz/c;-><init>(Lxz/x;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Lxz/c;->x:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lxz/c;->z:I

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Lxz/c;->w:Lxz/x;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p2, p2, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lxz/x;->a:Lxz/f0;

    iget-object p2, p2, Lxz/f0;->b:Lec3/r1;

    iget-object p2, p2, Lec3/r1;->w:Lec3/f2;

    invoke-interface {p2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lwz/d;

    iget-object p2, p2, Lwz/d;->w:Ld00/l;

    if-eqz p2, :cond_5

    iget-object v3, p2, Ld00/l;->H:Ljava/lang/String;

    iget-object v1, p0, Lxz/x;->b:Lwz/g0;

    iget-object v4, v1, Lwz/g0;->w:Ly00/c8;

    iget-object v4, p2, Ld00/l;->G:Ljava/lang/String;

    iget-object v5, v1, Lwz/g0;->i0:Ly00/n;

    iput-object p0, v6, Lxz/c;->w:Lxz/x;

    iput v2, v6, Lxz/c;->z:I

    iget-object v1, p0, Lxz/x;->c:Le00/w;

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Le00/w;->f(Ly00/d5;Ljava/lang/String;Ljava/lang/String;Ly00/n;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_3

    return-object v0

    :cond_3
    move-object p1, p0

    :goto_2
    instance-of v0, p2, Ll83/m;

    if-nez v0, :cond_4

    move-object v0, p2

    check-cast v0, Lwz/o0;

    iget-object p1, p1, Lxz/x;->e:Lb20/f;

    sget-object v0, Lb20/d;->E:Lb20/d;

    invoke-static {p1, v0, v8, v8, v7}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    :cond_4
    return-object p2

    :cond_5
    iget-object p1, p0, Lxz/x;->e:Lb20/f;

    sget-object p2, Lb20/e;->L:Lb20/e;

    invoke-static {p1, p2, v8, v8, v7}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "A non-null Link account is needed to create payment details"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p1, Lxz/d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lxz/d;

    iget v1, v0, Lxz/d;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lxz/d;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lxz/d;

    invoke-direct {v0, p0, p1}, Lxz/d;-><init>(Lxz/x;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lxz/d;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lxz/d;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lxz/x;->a:Lxz/f0;

    iget-object p1, p1, Lxz/f0;->b:Lec3/r1;

    iget-object p1, p1, Lec3/r1;->w:Lec3/f2;

    invoke-interface {p1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lwz/d;

    iget-object p1, p1, Lwz/d;->w:Ld00/l;

    if-eqz p1, :cond_4

    iget-object v2, p0, Lxz/x;->c:Le00/w;

    iget-object p1, p1, Ld00/l;->G:Ljava/lang/String;

    iget-object v4, p0, Lxz/x;->b:Lwz/g0;

    iget-object v5, v4, Lwz/g0;->w:Ly00/c8;

    iget-object v4, v4, Lwz/g0;->T:Ly00/p2;

    iput v3, v0, Lxz/d;->y:I

    invoke-virtual {v2, p1, v5, v4, v0}, Le00/w;->g(Ljava/lang/String;Ly00/c8;Ly00/p2;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ly00/k2;

    return-object p1

    :cond_4
    const-string p1, "Required value was null."

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_2
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lxz/e;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lxz/e;

    iget v1, v0, Lxz/e;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lxz/e;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lxz/e;

    invoke-direct {v0, p0, p2}, Lxz/e;-><init>(Lxz/x;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lxz/e;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lxz/e;->y:I

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

    iget-object p2, p0, Lxz/x;->a:Lxz/f0;

    iget-object p2, p2, Lxz/f0;->b:Lec3/r1;

    iget-object p2, p2, Lec3/r1;->w:Lec3/f2;

    invoke-interface {p2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lwz/d;

    iget-object p2, p2, Lwz/d;->w:Ld00/l;

    if-nez p2, :cond_3

    new-instance p1, Lcom/stripe/android/link/NoLinkAccountFoundException;

    invoke-direct {p1}, Lcom/stripe/android/link/NoLinkAccountFoundException;-><init>()V

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1

    :cond_3
    iget-object p2, p2, Ld00/l;->G:Ljava/lang/String;

    iput v3, v0, Lxz/e;->y:I

    iget-object v2, p0, Lxz/x;->c:Le00/w;

    invoke-virtual {v2, p1, p2, v0}, Le00/w;->h(Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    return-object p1
.end method

.method public final f(Ld00/l;ZLs83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p3, Lxz/f;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lxz/f;

    iget v1, v0, Lxz/f;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lxz/f;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lxz/f;

    invoke-direct {v0, p0, p3}, Lxz/f;-><init>(Lxz/x;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lxz/f;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lxz/f;->y:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Lxz/x;->b:Lwz/g0;

    iget-object p3, p3, Lwz/g0;->F:Lwz/f0;

    iget-object p3, p3, Lwz/f0;->x:Ljava/lang/String;

    if-eqz p3, :cond_3

    if-eqz p2, :cond_3

    goto :goto_1

    :cond_3
    move-object p3, v4

    :goto_1
    iput v3, v0, Lxz/f;->y:I

    invoke-virtual {p0, p1, p3, v0}, Lxz/x;->j(Ld00/l;Ljava/lang/String;Ls83/c;)Ljava/io/Serializable;

    move-result-object p3

    if-ne p3, v1, :cond_4

    return-object v1

    :cond_4
    :goto_2
    check-cast p3, Ll83/n;

    if-eqz p3, :cond_8

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    instance-of p2, p1, Ll83/m;

    if-nez p2, :cond_6

    check-cast p1, Ld00/l;

    if-eqz p1, :cond_5

    iget-object v4, p1, Ld00/l;->L:Ld00/f;

    :cond_5
    move-object p1, v4

    :cond_6
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_7

    goto :goto_3

    :cond_7
    new-instance p1, Ld00/a;

    invoke-direct {p1, p2}, Ld00/a;-><init>(Ljava/lang/Throwable;)V

    :goto_3
    check-cast p1, Ld00/f;

    if-eqz p1, :cond_8

    return-object p1

    :cond_8
    sget-object p1, Ld00/c;->a:Ld00/c;

    return-object p1
.end method

.method public final g(Ljava/util/Set;Ls83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lxz/g;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lxz/g;

    iget v1, v0, Lxz/g;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lxz/g;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lxz/g;

    invoke-direct {v0, p0, p2}, Lxz/g;-><init>(Lxz/x;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lxz/g;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lxz/g;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lxz/g;->w:Lxz/x;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p2, p2, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lxz/x;->a:Lxz/f0;

    iget-object p2, p2, Lxz/f0;->b:Lec3/r1;

    iget-object p2, p2, Lec3/r1;->w:Lec3/f2;

    invoke-interface {p2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lwz/d;

    iget-object p2, p2, Lwz/d;->w:Ld00/l;

    if-nez p2, :cond_3

    new-instance p1, Lcom/stripe/android/link/NoLinkAccountFoundException;

    invoke-direct {p1}, Lcom/stripe/android/link/NoLinkAccountFoundException;-><init>()V

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1

    :cond_3
    iget-object p2, p2, Ld00/l;->G:Ljava/lang/String;

    iput-object p0, v0, Lxz/g;->w:Lxz/x;

    iput v3, v0, Lxz/g;->z:I

    iget-object v2, p0, Lxz/x;->c:Le00/w;

    invoke-virtual {v2, p1, p2, v0}, Le00/w;->i(Ljava/util/Set;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    move-object p1, p0

    :goto_1
    instance-of v0, p2, Ll83/m;

    if-nez v0, :cond_b

    move-object v0, p2

    check-cast v0, Ly00/d0;

    iget-object p1, p1, Lxz/x;->h:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwz/a;

    const/16 v2, 0xa

    const-string v3, "response"

    const/4 v4, 0x0

    if-eqz v1, :cond_9

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v1, Lwz/a;->a:Ljava/util/ArrayList;

    invoke-static {v1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-static {v3}, Lm83/g0;->W(I)I

    move-result v3

    const/16 v5, 0x10

    if-ge v3, v5, :cond_5

    move v3, v5

    :cond_5
    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Lwz/s0;

    iget-object v6, v6, Lwz/s0;->x:Ly00/c0;

    invoke-virtual {v6}, Ly00/c0;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_6
    iget-object v0, v0, Ly00/d0;->w:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly00/c0;

    invoke-virtual {v2}, Ly00/c0;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwz/s0;

    if-eqz v3, :cond_7

    const/4 v6, 0x6

    invoke-static {v3, v2, v4, v6}, Lwz/s0;->i(Lwz/s0;Ly00/c0;Ljava/lang/String;I)Lwz/s0;

    move-result-object v2

    goto :goto_4

    :cond_7
    new-instance v3, Lwz/s0;

    invoke-direct {v3, v2, v4, v4}, Lwz/s0;-><init>(Ly00/c0;Ljava/lang/String;Ljava/lang/String;)V

    move-object v2, v3

    :goto_4
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_8
    new-instance v0, Lwz/a;

    invoke-direct {v0, v1}, Lwz/a;-><init>(Ljava/util/ArrayList;)V

    goto :goto_6

    :cond_9
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Ly00/d0;->w:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly00/c0;

    new-instance v3, Lwz/s0;

    invoke-direct {v3, v2, v4, v4}, Lwz/s0;-><init>(Ly00/c0;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_a
    new-instance v0, Lwz/a;

    invoke-direct {v0, v1}, Lwz/a;-><init>(Ljava/util/ArrayList;)V

    :goto_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, v4, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_b
    return-object p2
.end method

.method public final h(Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lxz/h;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lxz/h;

    iget v1, v0, Lxz/h;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lxz/h;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lxz/h;

    invoke-direct {v0, p0, p1}, Lxz/h;-><init>(Lxz/x;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lxz/h;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lxz/h;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lxz/x;->a:Lxz/f0;

    iget-object p1, p1, Lxz/f0;->b:Lec3/r1;

    iget-object p1, p1, Lec3/r1;->w:Lec3/f2;

    invoke-interface {p1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lwz/d;

    iget-object p1, p1, Lwz/d;->w:Ld00/l;

    if-nez p1, :cond_3

    new-instance p1, Lcom/stripe/android/link/NoLinkAccountFoundException;

    invoke-direct {p1}, Lcom/stripe/android/link/NoLinkAccountFoundException;-><init>()V

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1

    :cond_3
    iget-object p1, p1, Ld00/l;->G:Ljava/lang/String;

    iput v3, v0, Lxz/h;->y:I

    iget-object v2, p0, Lxz/x;->c:Le00/w;

    invoke-virtual {v2, p1, v0}, Le00/w;->j(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    return-object p1
.end method

.method public final i(Ls83/c;)Ljava/lang/Object;
    .locals 8

    const-string v0, "msg"

    const-string v1, "Failed to log out of Link: "

    instance-of v2, p1, Lxz/i;

    if-eqz v2, :cond_0

    move-object v2, p1

    check-cast v2, Lxz/i;

    iget v3, v2, Lxz/i;->z:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lxz/i;->z:I

    goto :goto_0

    :cond_0
    new-instance v2, Lxz/i;

    invoke-direct {v2, p0, p1}, Lxz/i;-><init>(Lxz/x;Ls83/c;)V

    :goto_0
    iget-object p1, v2, Lxz/i;->x:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lxz/i;->z:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v2, v2, Lxz/i;->w:Lxz/x;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lxz/x;->a:Lxz/f0;

    iget-object p1, p1, Lxz/f0;->b:Lec3/r1;

    iget-object p1, p1, Lec3/r1;->w:Lec3/f2;

    invoke-interface {p1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lwz/d;

    iget-object p1, p1, Lwz/d;->w:Ld00/l;

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const-string p1, "Required value was null."

    new-instance v4, Ljava/lang/IllegalArgumentException;

    invoke-direct {v4, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p1

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_1
    instance-of v4, p1, Ll83/m;

    if-nez v4, :cond_7

    :try_start_2
    check-cast p1, Ld00/l;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    :try_start_3
    iget-object v4, p0, Lxz/x;->c:Le00/w;

    iget-object v6, p1, Ld00/l;->G:Ljava/lang/String;

    iget-object p1, p1, Ld00/l;->x:Ljava/lang/String;

    iput-object p0, v2, Lxz/i;->w:Lxz/x;

    iput v5, v2, Lxz/i;->z:I

    invoke-virtual {v4, v6, p1, v2}, Le00/w;->k(Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-ne p1, v3, :cond_4

    return-object v3

    :cond_4
    move-object v2, p0

    :goto_2
    :try_start_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Lcom/stripe/android/model/ConsumerSession;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_4

    :catchall_2
    move-exception p1

    move-object v2, p0

    :goto_3
    :try_start_5
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_4
    instance-of v3, p1, Ll83/m;

    const/4 v4, 0x0

    if-nez v3, :cond_5

    move-object v3, p1

    check-cast v3, Lcom/stripe/android/model/ConsumerSession;

    iget-object v3, v2, Lxz/x;->e:Lb20/f;

    sget-object v5, Lb20/d;->F:Lb20/d;

    const/4 v6, 0x6

    invoke-static {v3, v5, v4, v4, v6}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    goto :goto_5

    :catchall_3
    move-exception p1

    goto :goto_6

    :cond_5
    :goto_5
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_6

    iget-object v2, v2, Lxz/x;->e:Lb20/f;

    sget-object v5, Lb20/c;->L:Lb20/c;

    sget v6, Lcom/stripe/android/core/exception/StripeException;->E:I

    invoke-static {v3}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v6

    const/4 v7, 0x4

    invoke-static {v2, v5, v6, v4, v7}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Lcom/stripe/android/model/ConsumerSession;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_7

    :goto_6
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :cond_7
    :goto_7
    return-object p1
.end method

.method public final j(Ld00/l;Ljava/lang/String;Ls83/c;)Ljava/io/Serializable;
    .locals 7

    instance-of v0, p3, Lxz/j;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lxz/j;

    iget v1, v0, Lxz/j;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lxz/j;->y:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lxz/j;

    invoke-direct {v0, p0, p3}, Lxz/j;-><init>(Lxz/x;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object p3, v6, Lxz/j;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lxz/j;->y:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    goto/16 :goto_7

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Lxz/x;->b:Lwz/g0;

    const/4 v1, 0x0

    iget-object v4, p0, Lxz/x;->f:Lwz/n0;

    if-eqz v4, :cond_a

    instance-of v5, v4, Lwz/i0;

    if-nez v5, :cond_a

    instance-of v5, v4, Lwz/k0;

    if-nez v5, :cond_a

    sget-object v5, Lwz/l0;->w:Lwz/l0;

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    instance-of v5, v4, Lwz/m0;

    if-eqz v5, :cond_4

    goto :goto_5

    :cond_4
    instance-of p2, v4, Lwz/j0;

    if-eqz p2, :cond_9

    check-cast v4, Lwz/j0;

    iget-object p2, v4, Lwz/j0;->w:Ljava/lang/String;

    if-eqz p1, :cond_7

    iget-object v3, p1, Ld00/l;->z:Ld00/m;

    if-eqz v3, :cond_5

    iget-object v3, v3, Ld00/m;->w:Ljava/lang/String;

    goto :goto_2

    :cond_5
    move-object v3, v1

    :goto_2
    invoke-static {v3, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_3

    :cond_6
    move-object p1, v1

    :goto_3
    if-eqz p1, :cond_7

    goto :goto_4

    :cond_7
    invoke-virtual {p3}, Lwz/g0;->b()Ljava/lang/String;

    move-result-object p1

    iput v2, v6, Lxz/j;->y:I

    invoke-virtual {p0, p2, p1, v6}, Lxz/x;->l(Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    goto :goto_6

    :cond_8
    :goto_4
    new-instance p2, Ll83/n;

    invoke-direct {p2, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    return-object p2

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_a
    :goto_5
    if-eqz p1, :cond_b

    new-instance p2, Ll83/n;

    invoke-direct {p2, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    return-object p2

    :cond_b
    if-eqz p2, :cond_d

    move p1, v3

    sget-object v3, Ly00/c2;->y:Ly00/c2;

    invoke-virtual {p3}, Lwz/g0;->b()Ljava/lang/String;

    move-result-object v5

    iput p1, v6, Lxz/j;->y:I

    const/4 v4, 0x1

    move-object v1, p0

    move-object v2, p2

    invoke-virtual/range {v1 .. v6}, Lxz/x;->k(Ljava/lang/String;Ly00/c2;ZLjava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_c

    :goto_6
    return-object v0

    :cond_c
    :goto_7
    new-instance p2, Ll83/n;

    invoke-direct {p2, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    return-object p2

    :cond_d
    return-object v1
.end method

.method public final k(Ljava/lang/String;Ly00/c2;ZLjava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 13

    move/from16 v0, p3

    move-object/from16 v1, p5

    instance-of v2, v1, Lxz/k;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lxz/k;

    iget v3, v2, Lxz/k;->E:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lxz/k;->E:I

    :goto_0
    move-object v10, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lxz/k;

    invoke-direct {v2, p0, v1}, Lxz/k;-><init>(Lxz/x;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v1, v10, Lxz/k;->y:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v10, Lxz/k;->E:I

    const/4 v11, 0x2

    const/4 v4, 0x1

    const/4 v12, 0x0

    if-eqz v3, :cond_3

    if-eq v3, v4, :cond_2

    if-ne v3, v11, :cond_1

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-boolean p1, v10, Lxz/k;->x:Z

    iget-object p2, v10, Lxz/k;->w:Lxz/x;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v1, Ll83/n;

    iget-object v0, v1, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_3

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, p0, Lxz/x;->b:Lwz/g0;

    iget-object v8, v1, Lwz/g0;->S:Ljava/lang/String;

    sget-object v1, Ly00/j8;->w:[Ly00/j8;

    const-string v1, "SMS"

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    if-eqz v0, :cond_4

    move-object v9, v1

    goto :goto_2

    :cond_4
    move-object v9, v12

    :goto_2
    iput-object p0, v10, Lxz/k;->w:Lxz/x;

    iput-boolean v0, v10, Lxz/k;->x:Z

    iput v4, v10, Lxz/k;->E:I

    iget-object v3, p0, Lxz/x;->g:Lxz/e0;

    const/4 v6, 0x0

    move-object v4, p1

    move-object v5, p2

    move-object/from16 v7, p4

    invoke-virtual/range {v3 .. v10}, Lxz/e0;->b(Ljava/lang/String;Ly00/c2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_5

    goto :goto_4

    :cond_5
    move p2, v0

    move-object v0, p1

    move p1, p2

    move-object p2, p0

    :goto_3
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_6

    iget-object v3, p2, Lxz/x;->d:Lyz/b;

    invoke-virtual {v3, v1}, Lyz/b;->b(Ljava/lang/Throwable;)V

    :cond_6
    instance-of v1, v0, Ll83/m;

    if-nez v1, :cond_8

    check-cast v0, Lcom/stripe/android/model/ConsumerSessionLookup;

    iput-object v12, v10, Lxz/k;->w:Lxz/x;

    iput v11, v10, Lxz/k;->E:I

    invoke-virtual {p2, v0, p1, v12, v10}, Lxz/x;->q(Lcom/stripe/android/model/ConsumerSessionLookup;ZLjava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_7

    :goto_4
    return-object v2

    :cond_7
    :goto_5
    check-cast v1, Ld00/l;

    return-object v1

    :cond_8
    return-object v0
.end method

.method public final l(Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p3, Lxz/l;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lxz/l;

    iget v1, v0, Lxz/l;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lxz/l;->E:I

    :goto_0
    move-object v8, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lxz/l;

    invoke-direct {v0, p0, p3}, Lxz/l;-><init>(Lxz/x;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object p3, v8, Lxz/l;->y:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v8, Lxz/l;->E:I

    const/4 v9, 0x2

    const/4 v10, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v10, :cond_2

    if-ne v1, v9, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v8, Lxz/l;->x:Ljava/lang/String;

    iget-object p2, v8, Lxz/l;->w:Lxz/x;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p3, p3, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_2

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Lxz/x;->b:Lwz/g0;

    iget-object v6, p3, Lwz/g0;->S:Ljava/lang/String;

    sget-object p3, Ly00/j8;->w:[Ly00/j8;

    const-string p3, "SMS"

    invoke-static {p3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    iput-object p0, v8, Lxz/l;->w:Lxz/x;

    iput-object p1, v8, Lxz/l;->x:Ljava/lang/String;

    iput v10, v8, Lxz/l;->E:I

    iget-object v1, p0, Lxz/x;->g:Lxz/e0;

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, p1

    move-object v5, p2

    invoke-virtual/range {v1 .. v8}, Lxz/e0;->b(Ljava/lang/String;Ly00/c2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ls83/c;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v0, :cond_4

    goto :goto_3

    :cond_4
    move-object p2, p0

    move-object p1, v4

    :goto_2
    invoke-static {p3}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_5

    iget-object v2, p2, Lxz/x;->d:Lyz/b;

    invoke-virtual {v2, v1}, Lyz/b;->b(Ljava/lang/Throwable;)V

    :cond_5
    instance-of v1, p3, Ll83/m;

    if-nez v1, :cond_7

    check-cast p3, Lcom/stripe/android/model/ConsumerSessionLookup;

    const/4 v1, 0x0

    iput-object v1, v8, Lxz/l;->w:Lxz/x;

    iput-object v1, v8, Lxz/l;->x:Ljava/lang/String;

    iput v9, v8, Lxz/l;->E:I

    invoke-virtual {p2, p3, v10, p1, v8}, Lxz/x;->q(Lcom/stripe/android/model/ConsumerSessionLookup;ZLjava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v0, :cond_6

    :goto_3
    return-object v0

    :cond_6
    :goto_4
    check-cast p3, Ld00/l;

    :cond_7
    return-object p3
.end method

.method public final m(ZLs83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lxz/m;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lxz/m;

    iget v1, v0, Lxz/m;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lxz/m;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lxz/m;

    invoke-direct {v0, p0, p2}, Lxz/m;-><init>(Lxz/x;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lxz/m;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lxz/m;->y:I

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

    iget-object p2, p0, Lxz/x;->a:Lxz/f0;

    iget-object p2, p2, Lxz/f0;->b:Lec3/r1;

    iget-object p2, p2, Lec3/r1;->w:Lec3/f2;

    invoke-interface {p2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lwz/d;

    iget-object p2, p2, Lwz/d;->w:Ld00/l;

    if-nez p2, :cond_3

    new-instance p1, Lcom/stripe/android/link/NoLinkAccountFoundException;

    invoke-direct {p1}, Lcom/stripe/android/link/NoLinkAccountFoundException;-><init>()V

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1

    :cond_3
    iget-object p2, p2, Ld00/l;->G:Ljava/lang/String;

    iput v3, v0, Lxz/m;->y:I

    iget-object v2, p0, Lxz/x;->c:Le00/w;

    invoke-virtual {v2, p2, p1, v0}, Le00/w;->p(Ljava/lang/String;ZLs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    return-object p1
.end method

.method public final n(Ls83/c;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p1, Lxz/n;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lxz/n;

    iget v1, v0, Lxz/n;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lxz/n;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lxz/n;

    invoke-direct {v0, p0, p1}, Lxz/n;-><init>(Lxz/x;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lxz/n;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lxz/n;->z:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lxz/n;->w:Ljava/lang/Object;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lxz/n;->w:Ljava/lang/Object;

    check-cast v2, Lxz/x;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lxz/x;->a:Lxz/f0;

    iget-object p1, p1, Lxz/f0;->b:Lec3/r1;

    iget-object p1, p1, Lec3/r1;->w:Lec3/f2;

    invoke-interface {p1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lwz/d;

    iget-object p1, p1, Lwz/d;->w:Ld00/l;

    if-nez p1, :cond_4

    new-instance p1, Lcom/stripe/android/link/NoLinkAccountFoundException;

    invoke-direct {p1}, Lcom/stripe/android/link/NoLinkAccountFoundException;-><init>()V

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1

    :cond_4
    iget-object p1, p1, Ld00/l;->G:Ljava/lang/String;

    sget-object v2, Ly00/j8;->w:[Ly00/j8;

    const-string v2, "SMS"

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    iput-object p0, v0, Lxz/n;->w:Ljava/lang/Object;

    iput v4, v0, Lxz/n;->z:I

    iget-object v4, p0, Lxz/x;->g:Lxz/e0;

    invoke-virtual {v4, p1, v2, v0}, Lxz/e0;->e(Ljava/lang/String;Ljava/util/List;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_2

    :cond_5
    move-object v2, p0

    :goto_1
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_6

    iget-object v5, v2, Lxz/x;->d:Lyz/b;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v6, "error_message"

    invoke-static {v4}, Ls4/b;->k(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    invoke-static {v4}, Lb20/a;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object v4

    invoke-static {v6, v4}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v4

    sget-object v6, Lyz/c;->y:Lyz/c;

    invoke-virtual {v5, v6, v4}, Lyz/b;->a(Ldz/i;Ljava/util/Map;)V

    :cond_6
    instance-of v4, p1, Ll83/m;

    if-nez v4, :cond_7

    move-object v4, p1

    check-cast v4, Lcom/stripe/android/model/ConsumerSessionRefresh;

    invoke-virtual {v4}, Lcom/stripe/android/model/ConsumerSessionRefresh;->getConsumerSession()Lcom/stripe/android/model/ConsumerSession;

    move-result-object v4

    iput-object p1, v0, Lxz/n;->w:Ljava/lang/Object;

    iput v3, v0, Lxz/n;->z:I

    const/4 v3, 0x0

    const/16 v5, 0xe

    invoke-static {v2, v4, v3, v0, v5}, Lxz/x;->p(Lxz/x;Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Ls83/c;I)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_7

    :goto_2
    return-object v1

    :cond_7
    return-object p1
.end method

.method public final o(Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;Ld00/m;Ls83/c;)Ljava/lang/Object;
    .locals 12

    move-object/from16 v0, p5

    instance-of v1, v0, Lxz/o;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lxz/o;

    iget v2, v1, Lxz/o;->z:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lxz/o;->z:I

    goto :goto_0

    :cond_0
    new-instance v1, Lxz/o;

    invoke-direct {v1, p0, v0}, Lxz/o;-><init>(Lxz/x;Ls83/c;)V

    :goto_0
    iget-object v0, v1, Lxz/o;->x:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lxz/o;->z:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object p1, v1, Lxz/o;->w:Ld00/l;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, p0, Lxz/x;->a:Lxz/f0;

    iget-object v0, v0, Lxz/f0;->b:Lec3/r1;

    iget-object v0, v0, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwz/d;

    iget-object v0, v0, Lwz/d;->w:Ld00/l;

    const/4 v3, 0x0

    if-eqz v0, :cond_3

    iget-object v5, v0, Ld00/l;->H:Ljava/lang/String;

    goto :goto_1

    :cond_3
    move-object v5, v3

    :goto_1
    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSession;->getEmailAddress()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez p2, :cond_4

    if-eqz v0, :cond_5

    iget-object p2, v0, Ld00/l;->x:Ljava/lang/String;

    if-eqz p2, :cond_5

    if-eqz v5, :cond_5

    :cond_4
    move-object v8, p2

    goto :goto_2

    :cond_5
    move-object v8, v3

    :goto_2
    if-nez p3, :cond_7

    if-eqz v0, :cond_6

    iget-object p2, v0, Ld00/l;->y:Lcom/stripe/android/model/DisplayablePaymentDetails;

    if-eqz p2, :cond_6

    if-eqz v5, :cond_6

    move-object v9, p2

    goto :goto_3

    :cond_6
    move-object v9, v3

    goto :goto_3

    :cond_7
    move-object v9, p3

    :goto_3
    if-nez p4, :cond_9

    if-eqz v0, :cond_8

    iget-object p2, v0, Ld00/l;->z:Ld00/m;

    if-eqz p2, :cond_8

    if-eqz v5, :cond_8

    move-object v10, p2

    goto :goto_4

    :cond_8
    move-object v10, v3

    goto :goto_4

    :cond_9
    move-object/from16 v10, p4

    :goto_4
    new-instance v6, Ld00/l;

    const/4 v11, 0x0

    move-object v7, p1

    invoke-direct/range {v6 .. v11}, Ld00/l;-><init>(Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;Ld00/m;Z)V

    sget-object p1, Lbc3/q0;->a:Lkc3/e;

    sget-object p1, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {p1}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object p1

    new-instance p2, Lo23/p;

    const/16 v0, 0x12

    invoke-direct {p2, p0, v6, v3, v0}, Lo23/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object v6, v1, Lxz/o;->w:Ld00/l;

    iput v4, v1, Lxz/o;->z:I

    invoke-static {p1, p2, v1}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_a

    return-object v2

    :cond_a
    return-object v6
.end method

.method public final q(Lcom/stripe/android/model/ConsumerSessionLookup;ZLjava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lxz/x;->k:Lec3/h2;

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSessionLookup;->getSuggestedEmail()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lec3/h2;->j(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p3, :cond_2

    new-instance v1, Ld00/m;

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSessionLookup;->getConsentUi()Lcom/stripe/android/model/ConsentUi;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/stripe/android/model/ConsentUi;->getConsentPane()Lcom/stripe/android/model/ConsentUi$ConsentPane;

    move-result-object v3

    if-eqz v3, :cond_0

    new-instance v2, Ld00/h;

    invoke-direct {v2, v3}, Ld00/h;-><init>(Lcom/stripe/android/model/ConsentUi$ConsentPane;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/stripe/android/model/ConsentUi;->getConsentSection()Lcom/stripe/android/model/ConsentUi$ConsentSection;

    move-result-object v2

    if-eqz v2, :cond_1

    new-instance v3, Ld00/j;

    invoke-direct {v3, v2}, Ld00/j;-><init>(Lcom/stripe/android/model/ConsentUi$ConsentSection;)V

    move-object v2, v3

    goto :goto_0

    :cond_1
    move-object v2, v0

    :goto_0
    invoke-direct {v1, p3, v2}, Ld00/m;-><init>(Ljava/lang/String;Ld00/k;)V

    move-object v7, v1

    goto :goto_1

    :cond_2
    move-object v7, v0

    :goto_1
    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSessionLookup;->getConsumerSession()Lcom/stripe/android/model/ConsumerSession;

    move-result-object v4

    if-eqz v4, :cond_5

    if-eqz p2, :cond_4

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSessionLookup;->getPublishableKey()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSessionLookup;->getDisplayablePaymentDetails()Lcom/stripe/android/model/DisplayablePaymentDetails;

    move-result-object v6

    move-object v3, p0

    move-object v8, p4

    invoke-virtual/range {v3 .. v8}, Lxz/x;->o(Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;Ld00/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_3

    return-object p1

    :cond_3
    check-cast p1, Ld00/l;

    return-object p1

    :cond_4
    new-instance v3, Ld00/l;

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSessionLookup;->getPublishableKey()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSessionLookup;->getDisplayablePaymentDetails()Lcom/stripe/android/model/DisplayablePaymentDetails;

    move-result-object v6

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v8}, Ld00/l;-><init>(Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;Ld00/m;Z)V

    return-object v3

    :cond_5
    return-object v0
.end method

.method public final r(Lwz/o0;Ls83/c;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, Lxz/p;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lxz/p;

    iget v1, v0, Lxz/p;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lxz/p;->y:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lxz/p;

    invoke-direct {v0, p0, p2}, Lxz/p;-><init>(Lxz/x;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Lxz/p;->w:Ljava/lang/Object;

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v0, v6, Lxz/p;->y:I

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    if-ne v0, v1, :cond_1

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p1, p2, Ll83/n;->w:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p2, p0, Lxz/x;->a:Lxz/f0;

    iget-object p2, p2, Lxz/f0;->b:Lec3/r1;

    iget-object p2, p2, Lec3/r1;->w:Lec3/f2;

    invoke-interface {p2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lwz/d;

    iget-object p2, p2, Lwz/d;->w:Ld00/l;

    if-eqz p2, :cond_3

    goto :goto_2

    :cond_3
    const-string p2, "Required value was null."

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    move-object p2, v0

    invoke-static {p2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p2

    :goto_2
    instance-of v0, p2, Ll83/m;

    if-nez v0, :cond_5

    :try_start_2
    check-cast p2, Ld00/l;

    iget-object v0, p1, Lwz/o0;->w:Ly00/c0;

    iget-object v2, p1, Lwz/o0;->y:Ly00/d5;

    move p1, v1

    iget-object v1, p0, Lxz/x;->c:Le00/w;

    invoke-virtual {v0}, Ly00/c0;->getId()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p2, Ld00/l;->G:Ljava/lang/String;

    iget-object p2, p0, Lxz/x;->b:Lwz/g0;

    iget-object v5, p2, Lwz/g0;->i0:Ly00/n;

    iput p1, v6, Lxz/p;->y:I

    invoke-virtual/range {v1 .. v6}, Le00/w;->r(Ly00/d5;Ljava/lang/String;Ljava/lang/String;Ly00/n;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v7, :cond_4

    return-object v7

    :cond_4
    :goto_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Lwz/p0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_4
    move-object p2, p1

    goto :goto_6

    :goto_5
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    goto :goto_4

    :cond_5
    :goto_6
    return-object p2
.end method

.method public final s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 11

    move-object/from16 v0, p6

    instance-of v1, v0, Lxz/q;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lxz/q;

    iget v2, v1, Lxz/q;->y:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lxz/q;->y:I

    :goto_0
    move-object v10, v1

    goto :goto_1

    :cond_0
    new-instance v1, Lxz/q;

    invoke-direct {v1, p0, v0}, Lxz/q;-><init>(Lxz/x;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v0, v10, Lxz/q;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v10, Lxz/q;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v0, Ll83/n;

    iget-object p1, v0, Ll83/n;->w:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object v0, p0, Lxz/x;->a:Lxz/f0;

    iget-object v0, v0, Lxz/f0;->b:Lec3/r1;

    iget-object v0, v0, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwz/d;

    iget-object v0, v0, Lwz/d;->w:Ld00/l;

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    const-string v0, "Required value was null."

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_2
    instance-of v2, v0, Ll83/m;

    if-nez v2, :cond_5

    :try_start_2
    check-cast v0, Ld00/l;

    iget-object v2, p0, Lxz/x;->c:Le00/w;

    iget-object v0, v0, Ld00/l;->G:Ljava/lang/String;

    iget-object v4, p0, Lxz/x;->b:Lwz/g0;

    iget-object v9, v4, Lwz/g0;->i0:Ly00/n;

    iput v3, v10, Lxz/q;->y:I

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    move-object/from16 v8, p5

    move-object v3, v0

    invoke-virtual/range {v2 .. v10}, Le00/w;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/n;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    :goto_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ly00/h6;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_4
    move-object v0, p1

    goto :goto_6

    :goto_5
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    goto :goto_4

    :cond_5
    :goto_6
    return-object v0
.end method

.method public final t(Lj00/i0;Ls83/c;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p2, Lxz/r;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lxz/r;

    iget v1, v0, Lxz/r;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lxz/r;->y:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lxz/r;

    invoke-direct {v0, p0, p2}, Lxz/r;-><init>(Lxz/x;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Lxz/r;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lxz/r;->y:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

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

    check-cast p2, Ll83/n;

    iget-object p1, p2, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_2

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p2, p1, Lj00/g0;

    if-eqz p2, :cond_7

    check-cast p1, Lj00/g0;

    iget-object v2, p1, Lj00/g0;->w:Ljava/lang/String;

    move p1, v3

    sget-object v3, Ly00/c2;->x:Ly00/c2;

    iget-object p2, p0, Lxz/x;->b:Lwz/g0;

    invoke-virtual {p2}, Lwz/g0;->b()Ljava/lang/String;

    move-result-object v5

    iput p1, v6, Lxz/r;->y:I

    const/4 v4, 0x1

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Lxz/x;->k(Ljava/lang/String;Ly00/c2;ZLjava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_3

    :cond_4
    :goto_2
    instance-of p2, p1, Ll83/m;

    if-nez p2, :cond_6

    :try_start_0
    check-cast p1, Ld00/l;

    if-eqz p1, :cond_5

    return-object p1

    :cond_5
    const-string p1, "Error fetching user account"

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :cond_6
    return-object p1

    :cond_7
    instance-of p2, p1, Lj00/h0;

    if-eqz p2, :cond_9

    check-cast p1, Lj00/h0;

    move p2, v2

    iget-object v2, p1, Lj00/h0;->w:Ljava/lang/String;

    iget-object v4, p1, Lj00/h0;->y:Ljava/lang/String;

    iget-object v5, p1, Lj00/h0;->F:Ljava/lang/String;

    iget-object v3, p1, Lj00/h0;->x:Ljava/lang/String;

    move-object v8, v6

    iget-object v6, p1, Lj00/h0;->z:Ljava/lang/String;

    iget-object v7, p1, Lj00/h0;->E:Lj00/e0;

    iput p2, v8, Lxz/r;->y:I

    move-object v1, p0

    invoke-virtual/range {v1 .. v8}, Lxz/x;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj00/e0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    :goto_3
    return-object v0

    :cond_8
    return-object p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj00/e0;Ls83/c;)Ljava/lang/Object;
    .locals 11

    move-object/from16 v0, p7

    instance-of v1, v0, Lxz/s;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lxz/s;

    iget v2, v1, Lxz/s;->z:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lxz/s;->z:I

    :goto_0
    move-object v9, v1

    goto :goto_1

    :cond_0
    new-instance v1, Lxz/s;

    invoke-direct {v1, p0, v0}, Lxz/s;-><init>(Lxz/x;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v0, v9, Lxz/s;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v9, Lxz/s;->z:I

    const/4 v10, 0x2

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v3, :cond_2

    if-ne v2, v10, :cond_1

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v9, Lxz/s;->w:Lxz/x;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v0, Ll83/n;

    iget-object p2, v0, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_2

    :cond_3
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v9, Lxz/s;->w:Lxz/x;

    iput v3, v9, Lxz/s;->z:I

    iget-object v2, p0, Lxz/x;->g:Lxz/e0;

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    invoke-virtual/range {v2 .. v9}, Lxz/e0;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj00/e0;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_3

    :cond_4
    move-object p1, p0

    :goto_2
    instance-of p3, p2, Ll83/m;

    if-nez p3, :cond_6

    :try_start_1
    check-cast p2, Lcom/stripe/android/model/ConsumerSessionSignup;

    invoke-virtual {p2}, Lcom/stripe/android/model/ConsumerSessionSignup;->getConsumerSession()Lcom/stripe/android/model/ConsumerSession;

    move-result-object p3

    invoke-virtual {p2}, Lcom/stripe/android/model/ConsumerSessionSignup;->getPublishableKey()Ljava/lang/String;

    move-result-object p2

    const/4 p4, 0x0

    iput-object p4, v9, Lxz/s;->w:Lxz/x;

    iput v10, v9, Lxz/s;->z:I

    const/16 p4, 0xc

    invoke-static {p1, p3, p2, v9, p4}, Lxz/x;->p(Lxz/x;Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Ls83/c;I)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_5

    :goto_3
    return-object v1

    :cond_5
    :goto_4
    check-cast v0, Ld00/l;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object v0

    :goto_5
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1

    :cond_6
    return-object p2
.end method

.method public final v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj00/e0;Ls83/c;)Ljava/lang/Object;
    .locals 13

    move-object/from16 v0, p7

    instance-of v1, v0, Lxz/t;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lxz/t;

    iget v2, v1, Lxz/t;->K:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lxz/t;->K:I

    :goto_0
    move-object v9, v1

    goto :goto_1

    :cond_0
    new-instance v1, Lxz/t;

    invoke-direct {v1, p0, v0}, Lxz/t;-><init>(Lxz/x;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v0, v9, Lxz/t;->I:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v9, Lxz/t;->K:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v9, Lxz/t;->w:Lxz/x;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v9, Lxz/t;->H:Ljava/lang/String;

    iget-object v2, v9, Lxz/t;->G:Lj00/e0;

    iget-object v4, v9, Lxz/t;->F:Ljava/lang/String;

    iget-object v5, v9, Lxz/t;->E:Ljava/lang/String;

    iget-object v6, v9, Lxz/t;->z:Ljava/lang/String;

    iget-object v7, v9, Lxz/t;->y:Ljava/lang/String;

    iget-object v8, v9, Lxz/t;->x:Ljava/lang/String;

    iget-object v10, v9, Lxz/t;->w:Lxz/x;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v12, v10

    move-object v10, v2

    move-object v2, v12

    move-object v12, v7

    move-object v7, v4

    move-object v4, v12

    move-object v12, v6

    move-object v6, v5

    move-object v5, v12

    goto :goto_2

    :cond_3
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, p0, Lxz/x;->a:Lxz/f0;

    iget-object v0, v0, Lxz/f0;->b:Lec3/r1;

    iget-object v0, v0, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwz/d;

    iget-object v0, v0, Lwz/d;->w:Ld00/l;

    if-eqz v0, :cond_4

    iget-object v2, v0, Ld00/l;->H:Ljava/lang/String;

    if-nez v2, :cond_5

    :cond_4
    iget-object v2, p0, Lxz/x;->b:Lwz/g0;

    iget-object v2, v2, Lwz/g0;->F:Lwz/f0;

    iget-object v2, v2, Lwz/f0;->x:Ljava/lang/String;

    :cond_5
    iput-object p0, v9, Lxz/t;->w:Lxz/x;

    iput-object p1, v9, Lxz/t;->x:Ljava/lang/String;

    iput-object p2, v9, Lxz/t;->y:Ljava/lang/String;

    move-object/from16 v6, p3

    iput-object v6, v9, Lxz/t;->z:Ljava/lang/String;

    move-object/from16 v7, p4

    iput-object v7, v9, Lxz/t;->E:Ljava/lang/String;

    move-object/from16 v8, p5

    iput-object v8, v9, Lxz/t;->F:Ljava/lang/String;

    move-object/from16 v10, p6

    iput-object v10, v9, Lxz/t;->G:Lj00/e0;

    iput-object v2, v9, Lxz/t;->H:Ljava/lang/String;

    iput v4, v9, Lxz/t;->K:I

    invoke-virtual {p0, v0, v4, v9}, Lxz/x;->f(Ld00/l;ZLs83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_6

    goto :goto_4

    :cond_6
    move-object v4, p2

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, p1

    move-object p1, v2

    move-object v2, p0

    :goto_2
    check-cast v0, Ld00/f;

    instance-of v11, v0, Ld00/e;

    if-eqz v11, :cond_7

    iget-object v1, v2, Lxz/x;->d:Lyz/b;

    sget-object v2, Lyz/f;->x:Lyz/f;

    invoke-virtual {v1, v2}, Lyz/b;->c(Lyz/f;)V

    new-instance v1, Lcom/stripe/android/link/account/AlreadyLoggedInLinkException;

    invoke-direct {v1, p1, v0}, Lcom/stripe/android/link/account/AlreadyLoggedInLinkException;-><init>(Ljava/lang/String;Ld00/f;)V

    invoke-static {v1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1

    :cond_7
    instance-of v11, v0, Ld00/b;

    if-nez v11, :cond_e

    sget-object v11, Ld00/d;->a:Ld00/d;

    invoke-static {v0, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    goto :goto_6

    :cond_8
    sget-object p1, Ld00/c;->a:Ld00/c;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    instance-of p1, v0, Ld00/a;

    if-eqz p1, :cond_9

    goto :goto_3

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_a
    :goto_3
    iput-object v2, v9, Lxz/t;->w:Lxz/x;

    const/4 p1, 0x0

    iput-object p1, v9, Lxz/t;->x:Ljava/lang/String;

    iput-object p1, v9, Lxz/t;->y:Ljava/lang/String;

    iput-object p1, v9, Lxz/t;->z:Ljava/lang/String;

    iput-object p1, v9, Lxz/t;->E:Ljava/lang/String;

    iput-object p1, v9, Lxz/t;->F:Ljava/lang/String;

    iput-object p1, v9, Lxz/t;->G:Lj00/e0;

    iput-object p1, v9, Lxz/t;->H:Ljava/lang/String;

    iput v3, v9, Lxz/t;->K:I

    move-object v3, v8

    move-object v8, v10

    invoke-virtual/range {v2 .. v9}, Lxz/x;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj00/e0;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_b

    :goto_4
    return-object v1

    :cond_b
    move-object p1, v2

    :goto_5
    instance-of v1, v0, Ll83/m;

    if-nez v1, :cond_c

    move-object v1, v0

    check-cast v1, Ld00/l;

    iget-object v1, p1, Lxz/x;->d:Lyz/b;

    invoke-virtual {v1}, Lyz/b;->d()V

    :cond_c
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_d

    iget-object p1, p1, Lxz/x;->d:Lyz/b;

    invoke-virtual {p1, v1}, Lyz/b;->e(Ljava/lang/Throwable;)V

    :cond_d
    return-object v0

    :cond_e
    :goto_6
    iget-object v1, v2, Lxz/x;->d:Lyz/b;

    sget-object v2, Lyz/f;->w:Lyz/f;

    invoke-virtual {v1, v2}, Lyz/b;->c(Lyz/f;)V

    new-instance v1, Lcom/stripe/android/link/account/AlreadyLoggedInLinkException;

    invoke-direct {v1, p1, v0}, Lcom/stripe/android/link/account/AlreadyLoggedInLinkException;-><init>(Ljava/lang/String;Ld00/f;)V

    invoke-static {v1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1
.end method

.method public final w(ZLs83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lxz/v;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lxz/v;

    iget v1, v0, Lxz/v;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lxz/v;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lxz/v;

    invoke-direct {v0, p0, p2}, Lxz/v;-><init>(Lxz/x;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lxz/v;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lxz/v;->z:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lxz/v;->w:Lxz/x;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p2, p2, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lxz/x;->a:Lxz/f0;

    iget-object p2, p2, Lxz/f0;->b:Lec3/r1;

    iget-object p2, p2, Lec3/r1;->w:Lec3/f2;

    invoke-interface {p2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lwz/d;

    iget-object p2, p2, Lwz/d;->w:Ld00/l;

    if-nez p2, :cond_4

    new-instance p1, Lcom/stripe/android/link/NoLinkAccountFoundException;

    invoke-direct {p1}, Lcom/stripe/android/link/NoLinkAccountFoundException;-><init>()V

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1

    :cond_4
    iget-object v2, p0, Lxz/x;->d:Lyz/b;

    sget-object v6, Lyz/c;->S:Lyz/c;

    invoke-virtual {v2, v6, v5}, Lyz/b;->a(Ldz/i;Ljava/util/Map;)V

    iget-object p2, p2, Ld00/l;->G:Ljava/lang/String;

    iput-object p0, v0, Lxz/v;->w:Lxz/x;

    iput v4, v0, Lxz/v;->z:I

    iget-object v2, p0, Lxz/x;->c:Le00/w;

    invoke-virtual {v2, p2, p1, v0}, Le00/w;->t(Ljava/lang/String;ZLs83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto :goto_2

    :cond_5
    move-object p1, p0

    :goto_1
    invoke-static {p2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_6

    iget-object v2, p1, Lxz/x;->d:Lyz/b;

    sget-object v4, Lyz/c;->T:Lyz/c;

    invoke-virtual {v2, v4, v5}, Lyz/b;->a(Ldz/i;Ljava/util/Map;)V

    :cond_6
    instance-of v2, p2, Ll83/m;

    if-nez v2, :cond_8

    check-cast p2, Lcom/stripe/android/model/ConsumerSession;

    iput-object v5, v0, Lxz/v;->w:Lxz/x;

    iput v3, v0, Lxz/v;->z:I

    const/16 v2, 0xe

    invoke-static {p1, p2, v5, v0, v2}, Lxz/x;->p(Lxz/x;Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Ls83/c;I)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    :goto_2
    return-object v1

    :cond_7
    :goto_3
    check-cast p2, Ld00/l;

    :cond_8
    return-object p2
.end method

.method public final x(Ly00/i0;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p3, Lxz/w;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lxz/w;

    iget v1, v0, Lxz/w;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lxz/w;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lxz/w;

    invoke-direct {v0, p0, p3}, Lxz/w;-><init>(Lxz/x;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lxz/w;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lxz/w;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p2, v0, Lxz/w;->x:Ljava/lang/String;

    iget-object p1, v0, Lxz/w;->w:Lxz/x;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p3, p3, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Lxz/x;->a:Lxz/f0;

    iget-object p3, p3, Lxz/f0;->b:Lec3/r1;

    iget-object p3, p3, Lec3/r1;->w:Lec3/f2;

    invoke-interface {p3}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lwz/d;

    iget-object p3, p3, Lwz/d;->w:Ld00/l;

    if-nez p3, :cond_3

    new-instance p1, Lcom/stripe/android/link/NoLinkAccountFoundException;

    invoke-direct {p1}, Lcom/stripe/android/link/NoLinkAccountFoundException;-><init>()V

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1

    :cond_3
    iget-object p3, p3, Ld00/l;->G:Ljava/lang/String;

    iput-object p0, v0, Lxz/w;->w:Lxz/x;

    iput-object p2, v0, Lxz/w;->x:Ljava/lang/String;

    iput v3, v0, Lxz/w;->E:I

    iget-object v2, p0, Lxz/x;->c:Le00/w;

    invoke-virtual {v2, p1, p3, v0}, Le00/w;->u(Ly00/i0;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    return-object v1

    :cond_4
    move-object p1, p0

    :goto_1
    instance-of v0, p3, Ll83/m;

    if-nez v0, :cond_a

    check-cast p3, Ly00/d0;

    iget-object p1, p1, Lxz/x;->h:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwz/a;

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    iget-object v2, p3, Ly00/d0;->w:Ljava/util/List;

    invoke-static {v2}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly00/c0;

    const-string v3, "updatedPayment"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lwz/a;->a:Ljava/util/ArrayList;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v0, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwz/s0;

    iget-object v5, v4, Lwz/s0;->x:Ly00/c0;

    iget-object v6, v4, Lwz/s0;->z:Ljava/lang/String;

    invoke-virtual {v5}, Ly00/c0;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Ly00/c0;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    if-nez p2, :cond_5

    goto :goto_3

    :cond_5
    move-object v6, p2

    :goto_3
    const/4 v5, 0x2

    invoke-static {v4, v2, v6, v5}, Lwz/s0;->i(Lwz/s0;Ly00/c0;Ljava/lang/String;I)Lwz/s0;

    move-result-object v4

    goto :goto_4

    :cond_6
    if-nez v6, :cond_7

    move-object v6, p2

    :cond_7
    const/4 v5, 0x3

    invoke-static {v4, v1, v6, v5}, Lwz/s0;->i(Lwz/s0;Ly00/c0;Ljava/lang/String;I)Lwz/s0;

    move-result-object v4

    :goto_4
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_8
    new-instance v1, Lwz/a;

    invoke-direct {v1, v3}, Lwz/a;-><init>(Ljava/util/ArrayList;)V

    :cond_9
    invoke-virtual {p1, v1}, Lec3/h2;->j(Ljava/lang/Object;)V

    :cond_a
    return-object p3
.end method
