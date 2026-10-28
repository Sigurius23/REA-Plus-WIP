.class public final Ln10/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln10/i0;


# instance fields
.field public final a:Lh20/u2;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ly00/n;

.field public final e:Landroid/content/Context;

.field public final f:Lb10/c1;

.field public final g:Lyy/f;

.field public final h:Lbz/i;

.field public final i:Lb9/m1;


# direct methods
.method public constructor <init>(Lh20/u2;Ljava/lang/String;Ljava/lang/String;Ly00/n;Landroid/content/Context;Lb10/c1;Lyy/f;Lbz/i;)V
    .locals 2

    const-string v0, "intentConfiguration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createIntentCallback"

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientAttributionMetadata"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeRepository"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestOptions"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userFacingLogger"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln10/g;->a:Lh20/u2;

    iput-object p2, p0, Ln10/g;->b:Ljava/lang/String;

    iput-object p3, p0, Ln10/g;->c:Ljava/lang/String;

    iput-object p4, p0, Ln10/g;->d:Ly00/n;

    iput-object p5, p0, Ln10/g;->e:Landroid/content/Context;

    iput-object p6, p0, Ln10/g;->f:Lb10/c1;

    iput-object p7, p0, Ln10/g;->g:Lyy/f;

    iput-object p8, p0, Ln10/g;->h:Lbz/i;

    new-instance p1, Lb9/m1;

    invoke-virtual {p7}, Lyy/f;->f()Z

    move-result p2

    const/4 p3, 0x3

    invoke-direct {p1, p2, p3}, Lb9/m1;-><init>(ZI)V

    iput-object p1, p0, Ln10/g;->i:Lb9/m1;

    return-void
.end method


# virtual methods
.method public final a(Ly00/c8;Le10/u0;Ly00/p;Lq83/d;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p4, Ln10/f;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Ln10/f;

    iget v1, v0, Ln10/f;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ln10/f;->G:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Ln10/f;

    check-cast p4, Ls83/c;

    invoke-direct {v0, p0, p4}, Ln10/f;-><init>(Ln10/g;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object p4, v6, Ln10/f;->E:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ln10/f;->G:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p3, v6, Ln10/f;->z:Ly00/p;

    iget-object p2, v6, Ln10/f;->y:Le10/u0;

    iget-object p1, v6, Ln10/f;->x:Ly00/c8;

    iget-object v1, v6, Ln10/f;->w:Ln10/g;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p4, Ll83/n;

    iget-object p4, p4, Ll83/n;->w:Ljava/lang/Object;

    :goto_2
    move-object v4, p3

    goto :goto_3

    :cond_3
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p4, p2, Le10/u0;->w:Ly00/o4;

    iget-object v1, p0, Ln10/g;->d:Ly00/n;

    invoke-virtual {p0, p2, p3, v1}, Ln10/g;->e(Le10/v0;Ly00/p;Ly00/n;)Ly00/w;

    move-result-object v1

    iget-object p4, p4, Ly00/o4;->G:Ljava/lang/String;

    iget-object v4, p0, Ln10/g;->g:Lyy/f;

    if-eqz p4, :cond_5

    iget-object p4, p0, Ln10/g;->c:Ljava/lang/String;

    if-nez p4, :cond_4

    iget-object p4, p0, Ln10/g;->h:Lbz/i;

    const-string v5, "Ephemeral key secret is required to confirm with saved payment method"

    invoke-virtual {p4, v5}, Lbz/i;->a(Ljava/lang/String;)V

    const-string p4, ""

    :cond_4
    const/4 v5, 0x6

    invoke-static {v4, p4, v5}, Lyy/f;->b(Lyy/f;Ljava/lang/String;I)Lyy/f;

    move-result-object v4

    :cond_5
    iput-object p0, v6, Ln10/f;->w:Ln10/g;

    iput-object p1, v6, Ln10/f;->x:Ly00/c8;

    iput-object p2, v6, Ln10/f;->y:Le10/u0;

    iput-object p3, v6, Ln10/f;->z:Ly00/p;

    iput v3, v6, Ln10/f;->G:I

    iget-object p4, p0, Ln10/g;->f:Lb10/c1;

    check-cast p4, Lb10/z0;

    invoke-virtual {p4, v1, v4, v6}, Lb10/z0;->m(Ly00/w;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v0, :cond_6

    goto :goto_4

    :cond_6
    move-object v1, p0

    goto :goto_2

    :goto_3
    invoke-static {p4}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p3

    if-nez p3, :cond_8

    move-object v3, p4

    check-cast v3, Ly00/u;

    iget-object v5, p2, Le10/u0;->z:Ljava/lang/String;

    const/4 p2, 0x0

    iput-object p2, v6, Ln10/f;->w:Ln10/g;

    iput-object p2, v6, Ln10/f;->x:Ly00/c8;

    iput-object p2, v6, Ln10/f;->y:Le10/u0;

    iput-object p2, v6, Ln10/f;->z:Ly00/p;

    iput v2, v6, Ln10/f;->G:I

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Ln10/g;->d(Ly00/c8;Ly00/u;Ly00/p;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v0, :cond_7

    :goto_4
    return-object v0

    :cond_7
    :goto_5
    check-cast p4, Le10/d;

    return-object p4

    :cond_8
    new-instance p1, Le10/b;

    invoke-static {p3}, Lx30/s0;->H(Ljava/lang/Throwable;)Lzy/c;

    move-result-object p2

    sget-object p4, Le10/t;->a:Le10/t;

    invoke-direct {p1, p3, p2, p4}, Le10/b;-><init>(Ljava/lang/Throwable;Lzy/c;Le10/u;)V

    return-object p1
.end method

.method public final b(Ly00/c8;Le10/t0;Ly00/p;Lq83/d;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p4, Ln10/e;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Ln10/e;

    iget v1, v0, Ln10/e;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ln10/e;->F:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Ln10/e;

    check-cast p4, Ls83/c;

    invoke-direct {v0, p0, p4}, Ln10/e;-><init>(Ln10/g;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object p4, v6, Ln10/e;->z:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ln10/e;->F:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p3, v6, Ln10/e;->y:Ly00/p;

    iget-object p1, v6, Ln10/e;->x:Ly00/c8;

    iget-object p2, v6, Ln10/e;->w:Ln10/g;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p4, Ll83/n;

    iget-object p4, p4, Ll83/n;->w:Ljava/lang/Object;

    move-object v1, p2

    :goto_2
    move-object v4, p3

    goto :goto_3

    :cond_3
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p4, p0, Ln10/g;->d:Ly00/n;

    invoke-virtual {p0, p2, p3, p4}, Ln10/g;->e(Le10/v0;Ly00/p;Ly00/n;)Ly00/w;

    move-result-object p2

    iput-object p0, v6, Ln10/e;->w:Ln10/g;

    iput-object p1, v6, Ln10/e;->x:Ly00/c8;

    iput-object p3, v6, Ln10/e;->y:Ly00/p;

    iput v3, v6, Ln10/e;->F:I

    iget-object p4, p0, Ln10/g;->f:Lb10/c1;

    check-cast p4, Lb10/z0;

    iget-object v1, p0, Ln10/g;->g:Lyy/f;

    invoke-virtual {p4, p2, v1, v6}, Lb10/z0;->m(Ly00/w;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v0, :cond_4

    goto :goto_4

    :cond_4
    move-object v1, p0

    goto :goto_2

    :goto_3
    invoke-static {p4}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_6

    move-object v3, p4

    check-cast v3, Ly00/u;

    const/4 p2, 0x0

    iput-object p2, v6, Ln10/e;->w:Ln10/g;

    iput-object p2, v6, Ln10/e;->x:Ly00/c8;

    iput-object p2, v6, Ln10/e;->y:Ly00/p;

    iput v2, v6, Ln10/e;->F:I

    const/4 v5, 0x0

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Ln10/g;->d(Ly00/c8;Ly00/u;Ly00/p;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v0, :cond_5

    :goto_4
    return-object v0

    :cond_5
    :goto_5
    check-cast p4, Le10/d;

    return-object p4

    :cond_6
    new-instance p1, Le10/b;

    invoke-static {p2}, Lx30/s0;->H(Ljava/lang/Throwable;)Lzy/c;

    move-result-object p3

    sget-object p4, Le10/t;->a:Le10/t;

    invoke-direct {p1, p2, p3, p4}, Le10/b;-><init>(Ljava/lang/Throwable;Lzy/c;Le10/u;)V

    return-object p1
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;Ly00/p;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p5, Ln10/c;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Ln10/c;

    iget v1, v0, Ln10/c;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ln10/c;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, Ln10/c;

    invoke-direct {v0, p0, p5}, Ln10/c;-><init>(Ln10/g;Ls83/c;)V

    :goto_0
    iget-object p5, v0, Ln10/c;->F:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ln10/c;->H:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p4, v0, Ln10/c;->E:Ljava/lang/String;

    iget-object p3, v0, Ln10/c;->z:Ly00/p;

    iget-object p2, v0, Ln10/c;->y:Ljava/lang/String;

    iget-object p1, v0, Ln10/c;->x:Ljava/lang/String;

    iget-object v0, v0, Ln10/c;->w:Ln10/g;

    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p5, Ll83/n;

    iget-object p5, p5, Ll83/n;->w:Ljava/lang/Object;

    :goto_1
    move-object v5, p1

    move-object v7, p3

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Ln10/c;->w:Ln10/g;

    iput-object p1, v0, Ln10/c;->x:Ljava/lang/String;

    iput-object p2, v0, Ln10/c;->y:Ljava/lang/String;

    iput-object p3, v0, Ln10/c;->z:Ly00/p;

    iput-object p4, v0, Ln10/c;->E:Ljava/lang/String;

    iput v3, v0, Ln10/c;->H:I

    iget-object p5, p0, Ln10/g;->f:Lb10/c1;

    iget-object v2, p0, Ln10/g;->g:Lyy/f;

    invoke-static {p5, p1, v2, v0}, Lvd/e;->W(Lb10/c1;Ljava/lang/String;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    goto :goto_1

    :goto_2
    instance-of p1, p5, Ll83/m;

    if-nez p1, :cond_6

    :try_start_0
    move-object v6, p5

    check-cast v6, Ly00/c8;

    invoke-interface {v6}, Ly00/c8;->j0()Z

    move-result p1

    if-eqz p1, :cond_4

    new-instance p1, Le10/a;

    sget-object p2, Ln10/c0;->y:Ln10/c0;

    invoke-direct {p1, v6, p2, v3}, Le10/a;-><init>(Ly00/c8;Ln10/c0;Z)V

    goto :goto_3

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_4

    :cond_4
    invoke-interface {v6}, Ly00/c8;->z()Z

    move-result p1

    if-eqz p1, :cond_5

    new-instance p1, Le10/c;

    new-instance p2, Ln10/e0;

    invoke-direct {p2, v6}, Ln10/e0;-><init>(Ly00/c8;)V

    sget-object p3, Ln10/c0;->y:Ln10/c0;

    const/4 p4, 0x0

    invoke-direct {p1, p2, p4, p3}, Le10/c;-><init>(Ljava/lang/Object;ZLn10/c0;)V

    goto :goto_3

    :cond_5
    iget-object v4, v0, Ln10/g;->i:Lb9/m1;

    new-instance v9, Ljs2/h;

    const/16 p1, 0x18

    invoke-direct {v9, p2, p4, v0, p1}, Ljs2/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const/4 v8, 0x1

    invoke-virtual/range {v4 .. v9}, Lb9/m1;->b(Ljava/lang/String;Ly00/c8;Ly00/p;ZLkotlin/jvm/functions/Function1;)Le10/d;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_3
    move-object p5, p1

    goto :goto_5

    :goto_4
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    goto :goto_3

    :cond_6
    :goto_5
    invoke-static {p5}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_7

    goto :goto_6

    :cond_7
    new-instance p5, Le10/b;

    invoke-static {p1}, Lx30/s0;->H(Ljava/lang/Throwable;)Lzy/c;

    move-result-object p2

    sget-object p3, Le10/t;->a:Le10/t;

    invoke-direct {p5, p1, p2, p3}, Le10/b;-><init>(Ljava/lang/Throwable;Lzy/c;Le10/u;)V

    :goto_6
    return-object p5
.end method

.method public final d(Ly00/c8;Ly00/u;Ly00/p;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p5, Ln10/d;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Ln10/d;

    iget v1, v0, Ln10/d;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ln10/d;->H:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Ln10/d;

    invoke-direct {v0, p0, p5}, Ln10/d;-><init>(Ln10/g;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object p5, v6, Ln10/d;->F:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ln10/d;->H:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_8

    const/4 p1, 0x2

    if-eq v1, v2, :cond_2

    if-ne v1, p1, :cond_1

    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v5, v6, Ln10/d;->E:Ljava/lang/String;

    iget-object v4, v6, Ln10/d;->z:Ly00/p;

    iget-object p2, v6, Ln10/d;->y:Ly00/u;

    iget-object p3, v6, Ln10/d;->x:Ly00/c8;

    iget-object v1, v6, Ln10/d;->w:Ln10/g;

    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p5, Lh20/e;

    instance-of p4, p5, Lh20/d;

    if-eqz p4, :cond_5

    check-cast p5, Lh20/d;

    iget-object p4, p5, Lh20/d;->a:Ljava/lang/String;

    const-string v7, "COMPLETE_WITHOUT_CONFIRMING_INTENT"

    invoke-static {p4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_3

    new-instance p1, Le10/a;

    sget-object p2, Ln10/c0;->z:Ln10/c0;

    invoke-direct {p1, p3, p2, v2}, Le10/a;-><init>(Ly00/c8;Ln10/c0;Z)V

    return-object p1

    :cond_3
    iget-object v2, p5, Lh20/d;->a:Ljava/lang/String;

    iget-object p2, p2, Ly00/u;->w:Ljava/lang/String;

    iput-object v3, v6, Ln10/d;->w:Ln10/g;

    iput-object v3, v6, Ln10/d;->x:Ly00/c8;

    iput-object v3, v6, Ln10/d;->y:Ly00/u;

    iput-object v3, v6, Ln10/d;->z:Ly00/p;

    iput-object v3, v6, Ln10/d;->E:Ljava/lang/String;

    iput p1, v6, Ln10/d;->H:I

    move-object v3, p2

    invoke-virtual/range {v1 .. v6}, Ln10/g;->c(Ljava/lang/String;Ljava/lang/String;Ly00/p;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    return-object p1

    :cond_5
    instance-of p1, p5, Lh20/c;

    if-eqz p1, :cond_7

    new-instance p1, Lcom/stripe/android/paymentelement/confirmation/intent/CreateIntentWithConfirmationTokenCallbackFailureException;

    check-cast p5, Lh20/c;

    iget-object p2, p5, Lh20/c;->a:Ljava/lang/Exception;

    invoke-direct {p1, p2}, Lcom/stripe/android/paymentelement/confirmation/intent/CreateIntentWithConfirmationTokenCallbackFailureException;-><init>(Ljava/lang/Exception;)V

    new-instance p2, Le10/b;

    iget-object p3, p5, Lh20/c;->b:Ljava/lang/String;

    if-eqz p3, :cond_6

    invoke-static {p3}, Ls4/i;->i(Ljava/lang/String;)Lzy/d;

    move-result-object p3

    goto :goto_2

    :cond_6
    invoke-static {p1}, Lx30/s0;->H(Ljava/lang/Throwable;)Lzy/c;

    move-result-object p3

    :goto_2
    sget-object p4, Le10/t;->a:Le10/t;

    invoke-direct {p2, p1, p3, p4}, Le10/b;-><init>(Ljava/lang/Throwable;Lzy/c;Le10/u;)V

    return-object p2

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_8
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v6, Ln10/d;->w:Ln10/g;

    iput-object p1, v6, Ln10/d;->x:Ly00/c8;

    iput-object p2, v6, Ln10/d;->y:Ly00/u;

    iput-object p3, v6, Ln10/d;->z:Ly00/p;

    iput-object p4, v6, Ln10/d;->E:Ljava/lang/String;

    iput v2, v6, Ln10/d;->H:I

    throw v3
.end method

.method public final e(Le10/v0;Ly00/p;Ly00/n;)Ly00/w;
    .locals 24

    move-object/from16 v0, p0

    iget-object v1, v0, Ln10/g;->a:Lh20/u2;

    move-object/from16 v2, p1

    invoke-interface {v2, v1}, Le10/v0;->Z(Lh20/u2;)Le10/v0;

    move-result-object v2

    const-string v3, "context"

    iget-object v4, v0, Ln10/g;->e:Landroid/content/Context;

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "getPackageName(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "stripesdk://payment_return_url/"

    invoke-static {v4, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    instance-of v3, v2, Le10/u0;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    move-object v5, v2

    check-cast v5, Le10/u0;

    goto :goto_0

    :cond_0
    move-object v5, v4

    :goto_0
    if-eqz v5, :cond_1

    iget-object v5, v5, Le10/u0;->w:Ly00/o4;

    if-eqz v5, :cond_1

    iget-object v5, v5, Ly00/o4;->w:Ljava/lang/String;

    move-object v6, v5

    goto :goto_1

    :cond_1
    move-object v6, v4

    :goto_1
    instance-of v5, v2, Le10/t0;

    if-eqz v5, :cond_2

    move-object v7, v2

    check-cast v7, Le10/t0;

    goto :goto_2

    :cond_2
    move-object v7, v4

    :goto_2
    if-eqz v7, :cond_3

    iget-object v7, v7, Le10/t0;->w:Ly00/d5;

    goto :goto_3

    :cond_3
    move-object v7, v4

    :goto_3
    invoke-interface {v2}, Le10/v0;->n()Ly00/u5;

    move-result-object v9

    if-eqz v9, :cond_4

    invoke-static {v9}, Ly00/g;->d(Ly00/u5;)Ly00/o;

    move-result-object v9

    if-nez v9, :cond_6

    :cond_4
    iget-object v9, v1, Lh20/u2;->w:Lh20/r2;

    invoke-virtual {v9}, Lh20/r2;->b()Lh20/t2;

    move-result-object v9

    if-eqz v9, :cond_5

    invoke-static {v9}, Lx30/s0;->I(Lh20/t2;)Ly00/o;

    move-result-object v9

    goto :goto_4

    :cond_5
    move-object v9, v4

    :cond_6
    :goto_4
    if-eqz v5, :cond_7

    sget-object v10, Ly00/f4;->G:Lt9/c0;

    move-object v11, v2

    check-cast v11, Le10/t0;

    iget-object v11, v11, Le10/t0;->w:Ly00/d5;

    iget-object v11, v11, Ly00/d5;->w:Ljava/lang/String;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v11}, Lt9/c0;->k(Ljava/lang/String;)Ly00/f4;

    move-result-object v10

    goto :goto_5

    :cond_7
    if-eqz v3, :cond_14

    move-object v10, v2

    check-cast v10, Le10/u0;

    iget-object v10, v10, Le10/u0;->w:Ly00/o4;

    iget-object v10, v10, Ly00/o4;->E:Ly00/f4;

    :goto_5
    if-eqz v5, :cond_8

    move-object v3, v2

    check-cast v3, Le10/t0;

    iget-object v3, v3, Le10/t0;->w:Ly00/d5;

    iget-boolean v3, v3, Ly00/d5;->x:Z

    goto :goto_6

    :cond_8
    if-eqz v3, :cond_13

    const/4 v3, 0x0

    :goto_6
    invoke-interface {v2}, Le10/v0;->n()Ly00/u5;

    move-result-object v5

    iget-object v11, v1, Lh20/u2;->w:Lh20/r2;

    invoke-virtual {v11}, Lh20/r2;->b()Lh20/t2;

    move-result-object v11

    if-eqz v11, :cond_9

    invoke-static {v11}, Lx30/s0;->I(Lh20/t2;)Ly00/o;

    move-result-object v11

    goto :goto_7

    :cond_9
    move-object v11, v4

    :goto_7
    invoke-static {v10, v3, v5, v11}, Ls4/b;->s(Ly00/f4;ZLy00/u5;Ly00/o;)Ly00/x2;

    move-result-object v11

    invoke-interface {v2}, Le10/v0;->V()Z

    move-result v3

    iget-boolean v5, v1, Lh20/u2;->E:Z

    if-eqz v5, :cond_b

    invoke-interface {v2}, Le10/v0;->n()Ly00/u5;

    move-result-object v5

    instance-of v10, v5, Ly00/l5;

    if-eqz v10, :cond_a

    check-cast v5, Ly00/l5;

    goto :goto_8

    :cond_a
    move-object v5, v4

    :goto_8
    if-eqz v5, :cond_b

    iget-object v5, v5, Ly00/l5;->x:Ljava/lang/String;

    move-object v13, v5

    goto :goto_9

    :cond_b
    move-object v13, v4

    :goto_9
    iget-object v5, v0, Ln10/g;->g:Lyy/f;

    invoke-virtual {v5}, Lyy/f;->f()Z

    move-result v5

    if-eqz v5, :cond_c

    move-object v14, v4

    goto :goto_f

    :cond_c
    invoke-interface {v2}, Le10/v0;->n()Ly00/u5;

    move-result-object v2

    invoke-static {v1}, Lse/a;->g0(Lh20/u2;)Ly00/a1;

    move-result-object v5

    iget-object v10, v5, Ly00/a1;->w:Ly00/z0;

    instance-of v12, v10, Ly00/w0;

    if-eqz v12, :cond_d

    move-object v12, v10

    check-cast v12, Ly00/w0;

    goto :goto_a

    :cond_d
    move-object v12, v4

    :goto_a
    new-instance v14, Ly00/v;

    invoke-interface {v10}, Ly00/z0;->v()Ljava/lang/String;

    move-result-object v15

    invoke-interface {v10}, Ly00/z0;->k0()Ljava/lang/String;

    move-result-object v16

    if-eqz v2, :cond_f

    invoke-static {v2}, Ly00/g;->d(Ly00/u5;)Ly00/o;

    move-result-object v2

    if-nez v2, :cond_e

    goto :goto_c

    :cond_e
    :goto_b
    move-object/from16 v17, v2

    goto :goto_d

    :cond_f
    :goto_c
    iget-object v1, v1, Lh20/u2;->w:Lh20/r2;

    invoke-virtual {v1}, Lh20/r2;->b()Lh20/t2;

    move-result-object v1

    if-eqz v1, :cond_10

    invoke-static {v1}, Lx30/s0;->I(Lh20/t2;)Ly00/o;

    move-result-object v2

    goto :goto_b

    :cond_10
    move-object/from16 v17, v4

    :goto_d
    if-eqz v12, :cond_11

    iget-object v1, v12, Ly00/w0;->z:Ly00/e3;

    if-eqz v1, :cond_11

    iget-object v1, v1, Ly00/e3;->w:Ljava/lang/String;

    move-object/from16 v18, v1

    goto :goto_e

    :cond_11
    move-object/from16 v18, v4

    :goto_e
    iget-object v1, v5, Ly00/a1;->x:Ljava/util/List;

    iget-object v2, v5, Ly00/a1;->z:Ljava/lang/String;

    iget-object v5, v5, Ly00/a1;->y:Ljava/lang/String;

    if-eqz v12, :cond_12

    iget-object v4, v12, Ly00/w0;->E:Ljava/lang/String;

    :cond_12
    move-object/from16 v23, v4

    iget-object v4, v0, Ln10/g;->b:Ljava/lang/String;

    move-object/from16 v19, v1

    move-object/from16 v20, v2

    move-object/from16 v22, v4

    move-object/from16 v21, v5

    invoke-direct/range {v14 .. v23}, Ly00/v;-><init>(Ljava/lang/String;Ljava/lang/String;Ly00/o;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_f
    new-instance v5, Ly00/w;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    move-object/from16 v10, p2

    move-object/from16 v15, p3

    invoke-direct/range {v5 .. v15}, Ly00/w;-><init>(Ljava/lang/String;Ly00/d5;Ljava/lang/String;Ly00/o;Ly00/p;Ly00/x2;Ljava/lang/Boolean;Ljava/lang/String;Ly00/v;Ly00/n;)V

    return-object v5

    :cond_13
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_14
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
