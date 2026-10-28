.class public final Ln10/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln10/i0;


# instance fields
.field public final a:Ly00/n;

.field public final b:Lv00/u;

.field public final c:Lb10/c1;

.field public final d:Lyy/f;

.field public final e:Lqg3/d;

.field public final f:Lla/b;

.field public final g:Lqy/d;


# direct methods
.method public constructor <init>(Ly00/n;Lv00/u;Lb10/c1;Lyy/f;Lqg3/d;Lla/b;Lqy/d;)V
    .locals 1

    const-string v0, "clientAttributionMetadata"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "integrationMetadata"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestOptions"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setupIntentInterceptorFactory"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachPaymentMethodInterceptorFactory"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln10/k;->a:Ly00/n;

    iput-object p2, p0, Ln10/k;->b:Lv00/u;

    iput-object p3, p0, Ln10/k;->c:Lb10/c1;

    iput-object p4, p0, Ln10/k;->d:Lyy/f;

    iput-object p5, p0, Ln10/k;->e:Lqg3/d;

    iput-object p6, p0, Ln10/k;->f:Lla/b;

    iput-object p7, p0, Ln10/k;->g:Lqy/d;

    return-void
.end method


# virtual methods
.method public final a(Ly00/c8;Le10/u0;Ly00/p;Lq83/d;)Ljava/lang/Object;
    .locals 0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot use CustomerSheetConfirmationInterceptor with saved payment methods!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lx30/s0;->H(Ljava/lang/Throwable;)Lzy/c;

    move-result-object p2

    new-instance p3, Le10/b;

    sget-object p4, Le10/r;->a:Le10/r;

    invoke-direct {p3, p1, p2, p4}, Le10/b;-><init>(Ljava/lang/Throwable;Lzy/c;Le10/u;)V

    return-object p3
.end method

.method public final b(Ly00/c8;Le10/t0;Ly00/p;Lq83/d;)Ljava/lang/Object;
    .locals 7

    instance-of p3, p4, Ln10/j;

    if-eqz p3, :cond_0

    move-object p3, p4

    check-cast p3, Ln10/j;

    iget v0, p3, Ln10/j;->E:I

    const/high16 v1, -0x80000000

    and-int v2, v0, v1

    if-eqz v2, :cond_0

    sub-int/2addr v0, v1

    iput v0, p3, Ln10/j;->E:I

    goto :goto_0

    :cond_0
    new-instance p3, Ln10/j;

    check-cast p4, Ls83/c;

    invoke-direct {p3, p0, p4}, Ln10/j;-><init>(Ln10/k;Ls83/c;)V

    :goto_0
    iget-object p4, p3, Ln10/j;->y:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p3, Ln10/j;->E:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_4

    if-eq v1, v4, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    :try_start_0
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p4, Le10/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p4

    :catchall_0
    move-exception p1

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :try_start_1
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_5

    :cond_3
    iget-object p1, p3, Ln10/j;->x:Ln10/k;

    iget-object p2, p3, Ln10/j;->w:Ly00/g6;

    :try_start_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :cond_4
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p4, p1, Ly00/g6;

    if-nez p4, :cond_5

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot use payment intents in Customer Sheet!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    new-instance p2, Le10/b;

    invoke-static {p1}, Lx30/s0;->H(Ljava/lang/Throwable;)Lzy/c;

    move-result-object p3

    sget-object p4, Le10/r;->a:Le10/r;

    invoke-direct {p2, p1, p3, p4}, Le10/b;-><init>(Ljava/lang/Throwable;Lzy/c;Le10/u;)V

    return-object p2

    :cond_5
    :try_start_3
    iget-object p2, p2, Le10/t0;->w:Ly00/d5;

    move-object p4, p1

    check-cast p4, Ly00/g6;

    iput-object p4, p3, Ln10/j;->w:Ly00/g6;

    iput-object p0, p3, Ln10/j;->x:Ln10/k;

    iput v4, p3, Ln10/j;->E:I

    invoke-virtual {p0, p2, p3}, Ln10/k;->c(Ly00/d5;Ls83/c;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v0, :cond_6

    goto/16 :goto_4

    :cond_6
    move-object p2, p1

    move-object p1, p0

    :goto_1
    check-cast p4, Ly00/o4;

    const-string v1, "<this>"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p4, Ly00/o4;->E:Ly00/f4;

    sget-object v6, Ly00/f4;->l0:Ly00/f4;

    if-ne v1, v6, :cond_8

    iget-object v1, p4, Ly00/o4;->Q:Ly00/l4;

    if-eqz v1, :cond_7

    iget-object v1, v1, Ly00/l4;->F:Ljava/lang/String;

    goto :goto_2

    :cond_7
    move-object v1, v5

    :goto_2
    if-nez v1, :cond_8

    move v1, v4

    goto :goto_3

    :cond_8
    const/4 v1, 0x0

    :goto_3
    if-eqz v1, :cond_9

    new-instance p1, Le10/a;

    check-cast p2, Ly00/g6;

    const p3, 0x3ff7f

    invoke-static {p2, p4, v5, p3}, Ly00/g6;->b(Ly00/g6;Ly00/o4;Ljava/util/List;I)Ly00/g6;

    move-result-object p2

    invoke-direct {p1, p2, v5, v4}, Le10/a;-><init>(Ly00/c8;Ln10/c0;Z)V

    return-object p1

    :cond_9
    iget-object v1, p1, Ln10/k;->b:Lv00/u;

    iget-object v1, v1, Lv00/u;->w:Lv00/t;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eqz v1, :cond_b

    if-ne v1, v4, :cond_a

    iget-object p1, p1, Ln10/k;->f:Lla/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ln10/o;

    sget-object v3, Lhz/a;->b:Lec3/h2;

    invoke-static {v3}, Ls2/e;->n(Lec3/h2;)Lhm/d;

    move-result-object v3

    iget-object p1, p1, Lla/b;->x:Ljava/lang/Object;

    check-cast p1, Lqy/d;

    invoke-direct {v1, v3, p1}, Ln10/o;-><init>(Lhm/d;Lqy/d;)V

    check-cast p2, Ly00/g6;

    iput-object v5, p3, Ln10/j;->w:Ly00/g6;

    iput-object v5, p3, Ln10/j;->x:Ln10/k;

    iput v2, p3, Ln10/j;->E:I

    invoke-virtual {v1, p2, p4, p3}, Ln10/o;->b(Ly00/g6;Ly00/o4;Ls83/c;)V

    return-object v0

    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_b
    iget-object v1, p1, Ln10/k;->e:Lqg3/d;

    iget-object p1, p1, Ln10/k;->a:Ly00/n;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "clientAttributionMetadata"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ln10/o;

    sget-object v4, Lhz/a;->d:Lec3/h2;

    invoke-static {v4}, Ls2/e;->n(Lec3/h2;)Lhm/d;

    move-result-object v4

    iget-object v6, v1, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v6, Ln10/o0;

    iget-object v1, v1, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v1, Lqy/d;

    invoke-direct {v2, v4, v6, v1, p1}, Ln10/o;-><init>(Lhm/d;Ln10/o0;Lqy/d;Ly00/n;)V

    check-cast p2, Ly00/g6;

    iput-object v5, p3, Ln10/j;->w:Ly00/g6;

    iput-object v5, p3, Ln10/j;->x:Ln10/k;

    iput v3, p3, Ln10/j;->E:I

    invoke-virtual {v2, p2, p4, p3}, Ln10/o;->a(Ly00/g6;Ly00/o4;Ls83/c;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v0, :cond_c

    :goto_4
    return-object v0

    :cond_c
    :goto_5
    check-cast p4, Le10/d;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    return-object p4

    :goto_6
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_d

    check-cast p1, Ljava/lang/Void;

    goto :goto_7

    :cond_d
    new-instance v5, Le10/b;

    invoke-static {p2}, Lx30/s0;->H(Ljava/lang/Throwable;)Lzy/c;

    move-result-object p1

    sget-object p3, Le10/t;->a:Le10/t;

    invoke-direct {v5, p2, p1, p3}, Le10/b;-><init>(Ljava/lang/Throwable;Lzy/c;Le10/u;)V

    :goto_7
    return-object v5
.end method

.method public final c(Ly00/d5;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Ln10/i;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ln10/i;

    iget v1, v0, Ln10/i;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ln10/i;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Ln10/i;

    invoke-direct {v0, p0, p2}, Ln10/i;-><init>(Ln10/k;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Ln10/i;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ln10/i;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Ln10/i;->x:Ly00/d5;

    iget-object v0, v0, Ln10/i;->w:Ln10/k;

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

    iput-object p0, v0, Ln10/i;->w:Ln10/k;

    iput-object p1, v0, Ln10/i;->x:Ly00/d5;

    iput v3, v0, Ln10/i;->E:I

    iget-object p2, p0, Ln10/k;->c:Lb10/c1;

    check-cast p2, Lb10/z0;

    iget-object v2, p0, Ln10/k;->d:Lyy/f;

    invoke-virtual {p2, p1, v2, v0}, Lb10/z0;->p(Ly00/d5;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    invoke-static {p2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v0, v0, Ln10/k;->g:Lqy/d;

    iget-object p1, p1, Ly00/d5;->w:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to create payment method for "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, v1}, Lqy/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p2
.end method
