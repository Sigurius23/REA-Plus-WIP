.class public final Lcz/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcz/i;


# instance fields
.field public final a:Lhm/d;

.field public final b:La33/d;

.field public final c:Lb20/f;

.field public final d:Lq83/j;


# direct methods
.method public constructor <init>(Ltz/a;Lf20/a;Lu00/e;La33/d;Lb20/f;Lq83/j;)V
    .locals 1

    const-string v0, "googlePayRepositoryFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "isFinancialConnectionsAvailable"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "lpmRepository"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "eventReporter"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "errorReporter"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "workContext"

    invoke-static {p6, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lhz/a;->a:Lec3/h2;

    invoke-static {p1}, Ls2/e;->n(Lec3/h2;)Lhm/d;

    move-result-object p1

    sget-object p2, Lhz/a;->d:Lec3/h2;

    invoke-static {p2}, Ls2/e;->n(Lec3/h2;)Lhm/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcz/w0;->a:Lhm/d;

    iput-object p4, p0, Lcz/w0;->b:La33/d;

    iput-object p5, p0, Lcz/w0;->c:Lb20/f;

    iput-object p6, p0, Lcz/w0;->d:Lq83/j;

    return-void
.end method


# virtual methods
.method public final a(Lcz/b;Ls83/c;)Ljava/io/Serializable;
    .locals 6

    instance-of v0, p2, Lcz/u0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcz/u0;

    iget v1, v0, Lcz/u0;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcz/u0;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcz/u0;

    invoke-direct {v0, p0, p2}, Lcz/u0;-><init>(Lcz/w0;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lcz/u0;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcz/u0;->E:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v4, :cond_4

    if-eq v2, v3, :cond_2

    const/4 p1, 0x3

    if-eq v2, p1, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object p1, v0, Lcz/u0;->w:Lcz/w0;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Lv00/c0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception p2

    goto :goto_4

    :cond_2
    iget-object p1, v0, Lcz/u0;->w:Lcz/w0;

    :try_start_1
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    if-nez p2, :cond_3

    throw v5

    :cond_3
    new-instance p2, Ljava/lang/ClassCastException;

    invoke-direct {p2}, Ljava/lang/ClassCastException;-><init>()V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_4
    iget-object p1, v0, Lcz/u0;->x:Lcz/b;

    iget-object v1, v0, Lcz/u0;->w:Lcz/w0;

    :try_start_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p2, p2, Ll83/n;->w:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p2

    :goto_1
    move-object p1, v1

    goto :goto_4

    :cond_5
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_3
    iput-object p0, v0, Lcz/u0;->w:Lcz/w0;

    iput-object p1, v0, Lcz/u0;->x:Lcz/b;

    iput v4, v0, Lcz/u0;->E:I

    invoke-virtual {p0, v0}, Lcz/w0;->b(Ls83/c;)Ljava/lang/Object;

    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    if-ne p2, v1, :cond_6

    return-object v1

    :cond_6
    move-object v1, p0

    :goto_2
    :try_start_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    if-nez p2, :cond_7

    iput-object v1, v0, Lcz/u0;->w:Lcz/w0;

    iput-object p1, v0, Lcz/u0;->x:Lcz/b;

    iput v3, v0, Lcz/u0;->E:I

    throw v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :cond_7
    :try_start_5
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :goto_3
    move-object p2, p1

    goto :goto_1

    :catchall_2
    move-exception p1

    goto :goto_3

    :catchall_3
    move-exception p2

    move-object p1, p0

    :goto_4
    invoke-static {p2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p2

    invoke-static {p2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_8

    iget-object p1, p1, Lcz/w0;->b:La33/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p2, Ldz/c;

    invoke-direct {p2, v0}, Ldz/c;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p1, p2}, La33/d;->m(Ldz/i;)V

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1

    :cond_8
    check-cast p2, Ll83/k;

    iget-object v0, p2, Ll83/k;->w:Ljava/lang/Object;

    if-nez v0, :cond_a

    iget-object p2, p2, Ll83/k;->x:Ljava/lang/Object;

    if-nez p2, :cond_9

    iget-object p1, p1, Lcz/w0;->b:La33/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "customerSheetSession"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    throw v5

    :cond_9
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1
.end method

.method public final b(Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p1, Lcz/v0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcz/v0;

    iget v1, v0, Lcz/v0;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcz/v0;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcz/v0;

    invoke-direct {v0, p0, p1}, Lcz/v0;-><init>(Lcz/w0;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lcz/v0;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcz/v0;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lcz/v0;->w:Lcz/w0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/4 p1, 0x5

    sget-object v2, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {p1, v2}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v4

    new-instance p1, Lcu2/l;

    const/16 v2, 0x8

    invoke-direct {p1, v2}, Lcu2/l;-><init>(I)V

    iput-object p0, v0, Lcz/v0;->w:Lcz/w0;

    iput v3, v0, Lcz/v0;->z:I

    iget-object v2, p0, Lcz/w0;->a:Lhm/d;

    invoke-static {v2, v4, v5, p1, v0}, Ls2/e;->o(Lhm/d;JLcu2/l;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v0, v0, Lcz/w0;->c:Lb20/f;

    sget-object v2, Lb20/c;->G:Lb20/c;

    sget v3, Lcom/stripe/android/core/exception/StripeException;->E:I

    invoke-static {v1}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x4

    invoke-static {v0, v2, v1, v3, v4}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    :cond_4
    return-object p1
.end method
