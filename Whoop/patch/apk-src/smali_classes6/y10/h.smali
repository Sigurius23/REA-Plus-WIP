.class public final Ly10/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lb10/z0;


# direct methods
.method public synthetic constructor <init>(Lb10/z0;)V
    .locals 0

    iput-object p1, p0, Ly10/h;->a:Lb10/z0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e(Lw10/d;Ljava/lang/String;Ljava/lang/String;)Ly00/p0;
    .locals 8

    instance-of v0, p0, Lw10/b;

    if-eqz v0, :cond_0

    new-instance v1, Ly00/o0;

    check-cast p0, Lw10/b;

    iget-object v3, p0, Lw10/b;->w:Ljava/lang/String;

    iget-object v4, p0, Lw10/b;->x:Ljava/lang/String;

    const/4 v6, 0x0

    move-object v2, p1

    move-object v5, p2

    invoke-direct/range {v1 .. v6}, Ly00/o0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/p2;)V

    return-object v1

    :cond_0
    move-object v2, p1

    move-object v5, p2

    instance-of p1, p0, Lw10/c;

    const/4 p2, 0x0

    if-eqz p1, :cond_2

    move-object v3, v2

    new-instance v2, Ly00/o0;

    check-cast p0, Lw10/c;

    iget-object v4, p0, Lw10/c;->w:Ljava/lang/String;

    move-object v6, v5

    iget-object v5, p0, Lw10/c;->x:Ljava/lang/String;

    iget-object p0, p0, Lw10/c;->y:Ljz/e;

    if-eqz p0, :cond_1

    iget-object p2, p0, Ljz/e;->y:Ly00/p2;

    :cond_1
    move-object v7, p2

    invoke-direct/range {v2 .. v7}, Ly00/o0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/p2;)V

    return-object v2

    :cond_2
    instance-of p1, p0, Lw10/a;

    if-eqz p1, :cond_4

    new-instance p1, Ly00/n0;

    check-cast p0, Lw10/a;

    iget-object v0, p0, Lw10/a;->w:Ljava/lang/String;

    iget-object p0, p0, Lw10/a;->x:Ljz/e;

    if-eqz p0, :cond_3

    iget-object p2, p0, Ljz/e;->y:Ly00/p2;

    :cond_3
    invoke-direct {p1, v2, v0, v5, p2}, Ly00/n0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/p2;)V

    return-object p1

    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/p2;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 14

    move-object/from16 v0, p11

    instance-of v1, v0, Ly10/e;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ly10/e;

    iget v2, v1, Ly10/e;->y:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Ly10/e;->y:I

    goto :goto_0

    :cond_0
    new-instance v1, Ly10/e;

    invoke-direct {v1, p0, v0}, Ly10/e;-><init>(Ly10/h;Ls83/c;)V

    :goto_0
    iget-object v0, v1, Ly10/e;->w:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Ly10/e;->y:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v0, Ll83/n;

    iget-object p1, v0, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Ly00/i8;->w:Ly00/i8;

    new-instance v5, Ly00/m0;

    move-object/from16 v6, p3

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    move-object/from16 v7, p6

    move-object/from16 v10, p7

    move-object/from16 v12, p8

    move-object/from16 v13, p9

    move-object/from16 v11, p10

    invoke-direct/range {v5 .. v13}, Ly00/m0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/p2;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    new-instance v0, Lyy/f;

    const/4 v3, 0x4

    move-object/from16 v6, p2

    invoke-direct {v0, p1, v6, v3}, Lyy/f;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    iput v4, v1, Ly10/e;->y:I

    iget-object p1, p0, Ly10/h;->a:Lb10/z0;

    invoke-virtual {p1, v5, v0, v1}, Lb10/z0;->n(Ly00/m0;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    return-object v2

    :cond_3
    return-object p1
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lw10/d;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p6, Ly10/f;

    if-eqz v0, :cond_0

    move-object v0, p6

    check-cast v0, Ly10/f;

    iget v1, v0, Ly10/f;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ly10/f;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Ly10/f;

    invoke-direct {v0, p0, p6}, Ly10/f;-><init>(Ly10/h;Ls83/c;)V

    :goto_0
    iget-object p6, v0, Ly10/f;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ly10/f;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p6}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p6, Ll83/n;

    iget-object p1, p6, Ll83/n;->w:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p6}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    new-instance p6, Ly00/f3;

    invoke-direct {p6, p2}, Ly00/f3;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p6

    invoke-static {p6}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p6

    :goto_1
    instance-of v2, p6, Ll83/m;

    if-nez v2, :cond_4

    :try_start_2
    check-cast p6, Ly00/f3;

    iget-object v2, p0, Ly10/h;->a:Lb10/z0;

    iget-object p6, p6, Ly00/f3;->b:Ljava/lang/String;

    invoke-static {p5, p2, p4}, Ly10/h;->e(Lw10/d;Ljava/lang/String;Ljava/lang/String;)Ly00/p0;

    move-result-object p2

    new-instance p4, Lyy/f;

    const/4 p5, 0x4

    invoke-direct {p4, p1, p3, p5}, Lyy/f;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    iput v3, v0, Ly10/f;->y:I

    invoke-virtual {v2, p6, p2, p4, v0}, Lb10/z0;->o(Ljava/lang/String;Ly00/p0;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ly00/f2;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_3
    move-object p6, p1

    goto :goto_5

    :goto_4
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    goto :goto_3

    :cond_4
    :goto_5
    return-object p6
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lw10/d;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p6, Ly10/g;

    if-eqz v0, :cond_0

    move-object v0, p6

    check-cast v0, Ly10/g;

    iget v1, v0, Ly10/g;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ly10/g;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Ly10/g;

    invoke-direct {v0, p0, p6}, Ly10/g;-><init>(Ly10/h;Ls83/c;)V

    :goto_0
    iget-object p6, v0, Ly10/g;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ly10/g;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p6}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p6, Ll83/n;

    iget-object p1, p6, Ll83/n;->w:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p6}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    new-instance p6, Ly00/d6;

    invoke-direct {p6, p2}, Ly00/d6;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p6

    invoke-static {p6}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p6

    :goto_1
    instance-of v2, p6, Ll83/m;

    if-nez v2, :cond_4

    :try_start_2
    check-cast p6, Ly00/d6;

    iget-object v2, p0, Ly10/h;->a:Lb10/z0;

    iget-object p6, p6, Ly00/d6;->b:Ljava/lang/String;

    invoke-static {p5, p2, p4}, Ly10/h;->e(Lw10/d;Ljava/lang/String;Ljava/lang/String;)Ly00/p0;

    move-result-object p2

    new-instance p4, Lyy/f;

    const/4 p5, 0x4

    invoke-direct {p4, p1, p3, p5}, Lyy/f;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    iput v3, v0, Ly10/g;->y:I

    invoke-virtual {v2, p6, p2, p4, v0}, Lb10/z0;->r(Ljava/lang/String;Ly00/p0;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ly00/f2;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_3
    move-object p6, p1

    goto :goto_5

    :goto_4
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    goto :goto_3

    :cond_4
    :goto_5
    return-object p6
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p4, Ly10/i;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Ly10/i;

    iget v1, v0, Ly10/i;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ly10/i;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Ly10/i;

    invoke-direct {v0, p0, p4}, Ly10/i;-><init>(Ly10/h;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Ly10/i;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ly10/i;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

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

    new-instance p4, Lyy/f;

    const/4 v2, 0x4

    invoke-direct {p4, p1, p2, v2}, Lyy/f;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    iput v3, v0, Ly10/i;->y:I

    sget-object p1, Lm83/y;->w:Lm83/y;

    iget-object p2, p0, Ly10/h;->a:Lb10/z0;

    invoke-virtual {p2, p3, p4, p1, v0}, Lb10/z0;->S(Ljava/lang/String;Lyy/f;Ljava/util/List;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method
