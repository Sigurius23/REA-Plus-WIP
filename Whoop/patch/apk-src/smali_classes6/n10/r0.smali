.class public final Ln10/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln10/i0;


# instance fields
.field public final a:Lh20/u2;

.field public final b:Lb20/f;

.field public final c:Lb10/c1;

.field public final d:Lyy/f;


# direct methods
.method public constructor <init>(Lh20/u2;Lb20/f;Lb10/c1;Lyy/f;)V
    .locals 2

    const-string v0, "intentConfiguration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handler"

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestOptions"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln10/r0;->a:Lh20/u2;

    iput-object p2, p0, Ln10/r0;->b:Lb20/f;

    iput-object p3, p0, Ln10/r0;->c:Lb10/c1;

    iput-object p4, p0, Ln10/r0;->d:Lyy/f;

    return-void
.end method


# virtual methods
.method public final a(Ly00/c8;Le10/u0;Ly00/p;Lq83/d;)Ljava/lang/Object;
    .locals 0

    iget-object p2, p2, Le10/u0;->w:Ly00/o4;

    check-cast p4, Ls83/c;

    invoke-virtual {p0, p1, p2, p3, p4}, Ln10/r0;->c(Ly00/c8;Ly00/o4;Ly00/p;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ly00/c8;Le10/t0;Ly00/p;Lq83/d;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p4, Ln10/p0;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Ln10/p0;

    iget v1, v0, Ln10/p0;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ln10/p0;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Ln10/p0;

    check-cast p4, Ls83/c;

    invoke-direct {v0, p0, p4}, Ln10/p0;-><init>(Ln10/r0;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Ln10/p0;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ln10/p0;->F:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p3, v0, Ln10/p0;->y:Ly00/p;

    iget-object p1, v0, Ln10/p0;->x:Ly00/c8;

    iget-object p2, v0, Ln10/p0;->w:Ln10/r0;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p4, Ll83/n;

    iget-object p4, p4, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_3
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p2, Le10/t0;->w:Ly00/d5;

    iget-object p4, p0, Ln10/r0;->a:Lh20/u2;

    invoke-static {p2, p4}, Lx30/s0;->L(Ly00/d5;Lh20/u2;)Ly00/d5;

    move-result-object p2

    iput-object p0, v0, Ln10/p0;->w:Ln10/r0;

    iput-object p1, v0, Ln10/p0;->x:Ly00/c8;

    iput-object p3, v0, Ln10/p0;->y:Ly00/p;

    iput v4, v0, Ln10/p0;->F:I

    iget-object p4, p0, Ln10/r0;->c:Lb10/c1;

    check-cast p4, Lb10/z0;

    iget-object v2, p0, Ln10/r0;->d:Lyy/f;

    invoke-virtual {p4, p2, v2, v0}, Lb10/z0;->p(Ly00/d5;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object p2, p0

    :goto_1
    invoke-static {p4}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_6

    check-cast p4, Ly00/o4;

    const/4 v2, 0x0

    iput-object v2, v0, Ln10/p0;->w:Ln10/r0;

    iput-object v2, v0, Ln10/p0;->x:Ly00/c8;

    iput-object v2, v0, Ln10/p0;->y:Ly00/p;

    iput v3, v0, Ln10/p0;->F:I

    invoke-virtual {p2, p1, p4, p3, v0}, Ln10/r0;->c(Ly00/c8;Ly00/o4;Ly00/p;Ls83/c;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    check-cast p4, Le10/d;

    return-object p4

    :cond_6
    new-instance p1, Le10/b;

    invoke-static {v2}, Lx30/s0;->H(Ljava/lang/Throwable;)Lzy/c;

    move-result-object p2

    sget-object p3, Le10/t;->a:Le10/t;

    invoke-direct {p1, v2, p2, p3}, Le10/b;-><init>(Ljava/lang/Throwable;Lzy/c;Le10/u;)V

    return-object p1
.end method

.method public final c(Ly00/c8;Ly00/o4;Ly00/p;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p4, Ln10/q0;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Ln10/q0;

    iget v1, v0, Ln10/q0;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ln10/q0;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Ln10/q0;

    invoke-direct {v0, p0, p4}, Ln10/q0;-><init>(Ln10/r0;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Ln10/q0;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ln10/q0;->F:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Ln10/q0;->w:Ljava/lang/Object;

    check-cast p1, Ly00/c8;

    :try_start_0
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Le10/a;

    sget-object p3, Ln10/c0;->z:Ln10/c0;

    const/4 p4, 0x0

    invoke-direct {p2, p1, p3, p4}, Le10/a;-><init>(Ly00/c8;Ln10/c0;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p3, v0, Ln10/q0;->y:Ly00/p;

    iget-object p1, v0, Ln10/q0;->x:Ly00/c8;

    iget-object p2, v0, Ln10/q0;->w:Ljava/lang/Object;

    check-cast p2, Ln10/r0;

    :try_start_1
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p4, Ll83/n;

    iget-object p4, p4, Ll83/n;->w:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p4

    goto :goto_3

    :cond_3
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iget-object p4, p0, Ln10/r0;->c:Lb10/c1;

    iget-object p2, p2, Ly00/o4;->w:Ljava/lang/String;

    iget-object v2, p0, Ln10/r0;->d:Lyy/f;

    iput-object p0, v0, Ln10/q0;->w:Ljava/lang/Object;

    iput-object p1, v0, Ln10/q0;->x:Ly00/c8;

    iput-object p3, v0, Ln10/q0;->y:Ly00/p;

    iput v4, v0, Ln10/q0;->F:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    check-cast p4, Lb10/z0;

    invoke-virtual {p4, p2, v2, v0}, Lb10/z0;->q(Ljava/lang/String;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-ne p4, v1, :cond_4

    return-object v1

    :cond_4
    move-object p2, p0

    :goto_1
    :try_start_4
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p4, Ly00/b6;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_4

    :catchall_1
    move-exception p2

    move-object p4, p2

    :goto_2
    move-object p2, p0

    goto :goto_3

    :catchall_2
    move-exception p4

    goto :goto_2

    :goto_3
    invoke-static {p4}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p4

    :goto_4
    invoke-static {p4}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p4

    const/4 v1, 0x0

    if-eqz p4, :cond_5

    iget-object v2, p2, Ln10/r0;->b:Lb20/f;

    sget-object v4, Lb20/c;->W:Lb20/c;

    sget v5, Lcom/stripe/android/core/exception/StripeException;->E:I

    invoke-static {p4}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object p4

    const/4 v5, 0x4

    invoke-static {v2, v4, p4, v1, v5}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    :cond_5
    :try_start_5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p3, :cond_6

    iget-object p2, p3, Ly00/p;->w:Ly00/c;

    iget-object p2, p2, Ly00/c;->y:Ljava/lang/String;

    :cond_6
    iput-object p1, v0, Ln10/q0;->w:Ljava/lang/Object;

    iput-object v1, v0, Ln10/q0;->x:Ly00/c8;

    iput-object v1, v0, Ln10/q0;->y:Ly00/p;

    iput v3, v0, Ln10/q0;->F:I

    throw v1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    :goto_5
    new-instance p2, Le10/b;

    invoke-static {p1}, Lv8/b;->x(Ljava/lang/Throwable;)Lzy/c;

    move-result-object p3

    sget-object p4, Le10/t;->a:Le10/t;

    invoke-direct {p2, p1, p3, p4}, Le10/b;-><init>(Ljava/lang/Throwable;Lzy/c;Le10/u;)V

    return-object p2
.end method
