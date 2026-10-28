.class public final Lgh/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgh/h;


# static fields
.field public static final f:Lud3/h;

.field public static final g:Lud3/h;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lmh/m;

.field public final c:Ll83/p;

.field public final d:Ll83/p;

.field public final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v0, Lud3/h;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x1

    const/4 v3, -0x1

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, -0x1

    const/4 v9, -0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v0 .. v13}, Lud3/h;-><init>(ZZIIZZZIIZZZLjava/lang/String;)V

    sput-object v0, Lgh/m;->f:Lud3/h;

    new-instance v1, Lud3/h;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v3, 0x0

    const/4 v5, -0x1

    const/4 v8, 0x0

    const/4 v10, -0x1

    const/4 v11, 0x1

    invoke-direct/range {v1 .. v14}, Lud3/h;-><init>(ZZIIZZZIIZZZLjava/lang/String;)V

    sput-object v1, Lgh/m;->g:Lud3/h;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lmh/m;Ll83/p;Ll83/p;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgh/m;->a:Ljava/lang/String;

    iput-object p2, p0, Lgh/m;->b:Lmh/m;

    iput-object p3, p0, Lgh/m;->c:Ll83/p;

    iput-object p4, p0, Lgh/m;->d:Ll83/p;

    iput-boolean p5, p0, Lgh/m;->e:Z

    return-void
.end method

.method public static d(Ljava/lang/String;Lud3/h0;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p1, Lud3/h0;->a:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_1

    const-string v1, "text/plain"

    const/4 v2, 0x0

    invoke-static {p1, v1, v2}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v1

    invoke-static {v1, p0}, Lqh/d;->b(Landroid/webkit/MimeTypeMap;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_2

    return-object p0

    :cond_2
    if-eqz p1, :cond_3

    const/16 p0, 0x3b

    invoke-static {p1, p0}, Lyb3/r;->H0(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    return-object v0
.end method


# virtual methods
.method public final a(Lq83/d;)Ljava/lang/Object;
    .locals 14

    instance-of v0, p1, Lgh/l;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lgh/l;

    iget v1, v0, Lgh/l;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lgh/l;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lgh/l;

    check-cast p1, Ls83/c;

    invoke-direct {v0, p0, p1}, Lgh/l;-><init>(Lgh/m;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lgh/l;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lgh/l;->F:I

    const/4 v3, 0x3

    const-string v4, "response body == null"

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v6, :cond_2

    if-ne v2, v5, :cond_1

    iget-object v1, v0, Lgh/l;->y:Ljava/lang/Object;

    check-cast v1, Lud3/x0;

    iget-object v2, v0, Lgh/l;->x:Leh/g;

    iget-object v0, v0, Lgh/l;->w:Lgh/m;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_8

    :catch_0
    move-exception p1

    goto/16 :goto_a

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lgh/l;->y:Ljava/lang/Object;

    check-cast v2, Llh/d;

    iget-object v6, v0, Lgh/l;->x:Leh/g;

    iget-object v8, v0, Lgh/l;->w:Lgh/m;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object v13, v6

    move-object v6, v2

    move-object v2, v13

    goto/16 :goto_3

    :catch_1
    move-exception p1

    goto/16 :goto_b

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lgh/m;->b:Lmh/m;

    iget-object v2, p1, Lmh/m;->n:Lmh/b;

    iget-boolean v2, v2, Lmh/b;->w:Z

    iget-object v8, p0, Lgh/m;->a:Ljava/lang/String;

    if-eqz v2, :cond_5

    iget-object v2, p0, Lgh/m;->d:Ll83/p;

    invoke-virtual {v2}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Leh/h;

    if-eqz v2, :cond_5

    iget-object p1, p1, Lmh/m;->i:Ljava/lang/String;

    if-nez p1, :cond_4

    move-object p1, v8

    :cond_4
    iget-object v2, v2, Leh/h;->b:Leh/e;

    sget-object v9, Lne3/l;->z:Lne3/k;

    invoke-static {p1}, Lne3/k;->b(Ljava/lang/String;)Lne3/l;

    move-result-object p1

    const-string v9, "SHA-256"

    invoke-virtual {p1, v9}, Lne3/l;->c(Ljava/lang/String;)Lne3/l;

    move-result-object p1

    invoke-virtual {p1}, Lne3/l;->e()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Leh/e;->i(Ljava/lang/String;)Leh/c;

    move-result-object p1

    if-eqz p1, :cond_5

    new-instance v2, Leh/g;

    invoke-direct {v2, p1}, Leh/g;-><init>(Leh/c;)V

    goto :goto_1

    :cond_5
    move-object v2, v7

    :goto_1
    if-eqz v2, :cond_b

    :try_start_2
    invoke-virtual {p0}, Lgh/m;->c()Lne3/p;

    move-result-object p1

    iget-object v9, v2, Leh/g;->w:Leh/c;

    iget-boolean v10, v9, Leh/c;->x:Z

    if-nez v10, :cond_a

    iget-object v9, v9, Leh/c;->w:Leh/b;

    iget-object v9, v9, Leh/b;->c:Ljava/util/ArrayList;

    const/4 v10, 0x0

    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lne3/e0;

    invoke-virtual {p1, v9}, Lne3/p;->T(Lne3/e0;)Ln4/f;

    move-result-object p1

    iget-object p1, p1, Ln4/f;->e:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Long;

    if-nez p1, :cond_6

    goto :goto_2

    :cond_6
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    const-wide/16 v11, 0x0

    cmp-long p1, v9, v11

    if-nez p1, :cond_7

    new-instance p1, Lgh/n;

    invoke-virtual {p0, v2}, Lgh/m;->g(Leh/g;)Ldh/p;

    move-result-object v0

    invoke-static {v8, v7}, Lgh/m;->d(Ljava/lang/String;Lud3/h0;)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Ldh/g;->y:Ldh/g;

    invoke-direct {p1, v0, v1, v3}, Lgh/n;-><init>(Ldh/x;Ljava/lang/String;Ldh/g;)V

    return-object p1

    :catch_2
    move-exception p1

    move-object v6, v2

    goto/16 :goto_b

    :cond_7
    :goto_2
    iget-boolean p1, p0, Lgh/m;->e:Z

    if-eqz p1, :cond_8

    new-instance p1, Llh/c;

    invoke-virtual {p0}, Lgh/m;->e()Lud3/o0;

    move-result-object v9

    invoke-virtual {p0, v2}, Lgh/m;->f(Leh/g;)Llh/b;

    move-result-object v10

    invoke-direct {p1, v9, v10}, Llh/c;-><init>(Lud3/o0;Llh/b;)V

    invoke-virtual {p1}, Llh/c;->a()Llh/d;

    move-result-object p1

    iget-object v9, p1, Llh/d;->b:Llh/b;

    iget-object v10, p1, Llh/d;->a:Lud3/o0;

    if-nez v10, :cond_c

    if-eqz v9, :cond_c

    new-instance p1, Lgh/n;

    invoke-virtual {p0, v2}, Lgh/m;->g(Leh/g;)Ldh/p;

    move-result-object v0

    iget-object v1, v9, Llh/b;->b:Ljava/lang/Object;

    invoke-interface {v1}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud3/h0;

    invoke-static {v8, v1}, Lgh/m;->d(Ljava/lang/String;Lud3/h0;)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Ldh/g;->y:Ldh/g;

    invoke-direct {p1, v0, v1, v3}, Lgh/n;-><init>(Ldh/x;Ljava/lang/String;Ldh/g;)V

    return-object p1

    :cond_8
    new-instance p1, Lgh/n;

    invoke-virtual {p0, v2}, Lgh/m;->g(Leh/g;)Ldh/p;

    move-result-object v0

    invoke-virtual {p0, v2}, Lgh/m;->f(Leh/g;)Llh/b;

    move-result-object v1

    if-eqz v1, :cond_9

    iget-object v1, v1, Llh/b;->b:Ljava/lang/Object;

    invoke-interface {v1}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lud3/h0;

    :cond_9
    invoke-static {v8, v7}, Lgh/m;->d(Ljava/lang/String;Lud3/h0;)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Ldh/g;->y:Ldh/g;

    invoke-direct {p1, v0, v1, v3}, Lgh/n;-><init>(Ldh/x;Ljava/lang/String;Ldh/g;)V

    return-object p1

    :cond_a
    const-string p1, "snapshot is closed"

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance p1, Llh/c;

    invoke-virtual {p0}, Lgh/m;->e()Lud3/o0;

    move-result-object v8

    invoke-direct {p1, v8, v7}, Llh/c;-><init>(Lud3/o0;Llh/b;)V

    invoke-virtual {p1}, Llh/c;->a()Llh/d;

    move-result-object p1

    :cond_c
    iget-object v8, p1, Llh/d;->a:Lud3/o0;

    invoke-static {v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object p0, v0, Lgh/l;->w:Lgh/m;

    iput-object v2, v0, Lgh/l;->x:Leh/g;

    iput-object p1, v0, Lgh/l;->y:Ljava/lang/Object;

    iput v6, v0, Lgh/l;->F:I

    invoke-virtual {p0, v8, v0}, Lgh/m;->b(Lud3/o0;Ls83/c;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_d

    goto/16 :goto_7

    :cond_d
    move-object v8, v6

    move-object v6, p1

    move-object p1, v8

    move-object v8, p0

    :goto_3
    check-cast p1, Lud3/x0;

    sget-object v9, Lqh/d;->a:[Landroid/graphics/Bitmap$Config;

    iget-object v9, p1, Lud3/x0;->G:Lud3/a1;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    if-eqz v9, :cond_15

    :try_start_3
    iget-object v10, v6, Llh/d;->a:Lud3/o0;

    iget-object v6, v6, Llh/d;->b:Llh/b;

    invoke-virtual {v8, v2, v10, p1, v6}, Lgh/m;->h(Leh/g;Lud3/o0;Lud3/x0;Llh/b;)Leh/g;

    move-result-object v2
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    iget-object v6, v8, Lgh/m;->a:Ljava/lang/String;

    if-eqz v2, :cond_f

    :try_start_4
    new-instance v0, Lgh/n;

    invoke-virtual {v8, v2}, Lgh/m;->g(Leh/g;)Ldh/p;

    move-result-object v1

    invoke-virtual {v8, v2}, Lgh/m;->f(Leh/g;)Llh/b;

    move-result-object v3

    if-eqz v3, :cond_e

    iget-object v3, v3, Llh/b;->b:Ljava/lang/Object;

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Lud3/h0;

    goto :goto_5

    :goto_4
    move-object v1, p1

    move-object p1, v0

    goto/16 :goto_a

    :cond_e
    :goto_5
    invoke-static {v6, v7}, Lgh/m;->d(Ljava/lang/String;Lud3/h0;)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ldh/g;->z:Ldh/g;

    invoke-direct {v0, v1, v3, v4}, Lgh/n;-><init>(Ldh/x;Ljava/lang/String;Ldh/g;)V

    return-object v0

    :catch_3
    move-exception v0

    goto :goto_4

    :cond_f
    invoke-virtual {v9}, Lud3/a1;->d1()Lne3/j;

    move-result-object v10

    const-wide/16 v11, 0x1

    invoke-interface {v10, v11, v12}, Lne3/j;->request(J)Z

    move-result v10

    if-eqz v10, :cond_11

    new-instance v0, Lgh/n;

    invoke-virtual {v9}, Lud3/a1;->d1()Lne3/j;

    move-result-object v1

    iget-object v4, v8, Lgh/m;->b:Lmh/m;

    iget-object v4, v4, Lmh/m;->a:Landroid/content/Context;

    new-instance v5, Ldh/z;

    new-instance v8, Lal0/f;

    invoke-direct {v8, v4, v3}, Lal0/f;-><init>(Landroid/content/Context;I)V

    invoke-direct {v5, v1, v8, v7}, Ldh/z;-><init>(Lne3/j;Lc93/a;Ldt/b;)V

    invoke-virtual {v9}, Lud3/a1;->k()Lud3/h0;

    move-result-object v1

    invoke-static {v6, v1}, Lgh/m;->d(Ljava/lang/String;Lud3/h0;)Ljava/lang/String;

    move-result-object v1

    iget-object v3, p1, Lud3/x0;->I:Lud3/x0;

    if-eqz v3, :cond_10

    sget-object v3, Ldh/g;->z:Ldh/g;

    goto :goto_6

    :cond_10
    sget-object v3, Ldh/g;->y:Ldh/g;

    :goto_6
    invoke-direct {v0, v5, v1, v3}, Lgh/n;-><init>(Ldh/x;Ljava/lang/String;Ldh/g;)V

    return-object v0

    :cond_11
    invoke-static {p1}, Lqh/d;->a(Ljava/io/Closeable;)V

    invoke-virtual {v8}, Lgh/m;->e()Lud3/o0;

    move-result-object v6

    iput-object v8, v0, Lgh/l;->w:Lgh/m;

    iput-object v2, v0, Lgh/l;->x:Leh/g;

    iput-object p1, v0, Lgh/l;->y:Ljava/lang/Object;

    iput v5, v0, Lgh/l;->F:I

    invoke-virtual {v8, v6, v0}, Lgh/m;->b(Lud3/o0;Ls83/c;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    if-ne v0, v1, :cond_12

    :goto_7
    return-object v1

    :cond_12
    move-object v1, p1

    move-object p1, v0

    move-object v0, v8

    :goto_8
    :try_start_5
    check-cast p1, Lud3/x0;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    :try_start_6
    sget-object v1, Lqh/d;->a:[Landroid/graphics/Bitmap$Config;

    iget-object v1, p1, Lud3/x0;->G:Lud3/a1;

    if-eqz v1, :cond_14

    new-instance v4, Lgh/n;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Lud3/a1;->d1()Lne3/j;

    move-result-object v5

    iget-object v6, v0, Lgh/m;->b:Lmh/m;

    iget-object v6, v6, Lmh/m;->a:Landroid/content/Context;

    new-instance v8, Ldh/z;

    new-instance v9, Lal0/f;

    invoke-direct {v9, v6, v3}, Lal0/f;-><init>(Landroid/content/Context;I)V

    invoke-direct {v8, v5, v9, v7}, Ldh/z;-><init>(Lne3/j;Lc93/a;Ldt/b;)V

    iget-object v0, v0, Lgh/m;->a:Ljava/lang/String;

    invoke-virtual {v1}, Lud3/a1;->k()Lud3/h0;

    move-result-object v1

    invoke-static {v0, v1}, Lgh/m;->d(Ljava/lang/String;Lud3/h0;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Lud3/x0;->I:Lud3/x0;

    if-eqz v1, :cond_13

    sget-object v1, Ldh/g;->z:Ldh/g;

    goto :goto_9

    :cond_13
    sget-object v1, Ldh/g;->y:Ldh/g;

    :goto_9
    invoke-direct {v4, v8, v0, v1}, Lgh/n;-><init>(Ldh/x;Ljava/lang/String;Ldh/g;)V

    return-object v4

    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    :goto_a
    :try_start_7
    invoke-static {v1}, Lqh/d;->a(Ljava/io/Closeable;)V

    throw p1

    :cond_15
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2

    :goto_b
    if-eqz v6, :cond_16

    invoke-static {v6}, Lqh/d;->a(Ljava/io/Closeable;)V

    :cond_16
    throw p1
.end method

.method public final b(Lud3/o0;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lgh/k;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lgh/k;

    iget v1, v0, Lgh/k;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lgh/k;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lgh/k;

    invoke-direct {v0, p0, p2}, Lgh/k;-><init>(Lgh/m;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lgh/k;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lgh/k;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p2, Lqh/d;->a:[Landroid/graphics/Bitmap$Config;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    iget-object v2, p0, Lgh/m;->c:Ll83/p;

    if-eqz p2, :cond_4

    iget-object p2, p0, Lgh/m;->b:Lmh/m;

    iget-object p2, p2, Lmh/m;->o:Lmh/b;

    iget-boolean p2, p2, Lmh/b;->w:Z

    if-nez p2, :cond_3

    invoke-virtual {v2}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lud3/i;

    check-cast p2, Lud3/l0;

    invoke-virtual {p2, p1}, Lud3/l0;->b(Lud3/o0;)Lzd3/o;

    move-result-object p1

    invoke-virtual {p1}, Lzd3/o;->e()Lud3/x0;

    move-result-object p1

    goto :goto_2

    :cond_3
    new-instance p1, Landroid/os/NetworkOnMainThreadException;

    invoke-direct {p1}, Landroid/os/NetworkOnMainThreadException;-><init>()V

    throw p1

    :cond_4
    invoke-virtual {v2}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lud3/i;

    check-cast p2, Lud3/l0;

    invoke-virtual {p2, p1}, Lud3/l0;->b(Lud3/o0;)Lzd3/o;

    move-result-object p1

    iput v3, v0, Lgh/k;->y:I

    new-instance p2, Lbc3/m;

    invoke-static {v0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v0

    invoke-direct {p2, v3, v0}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {p2}, Lbc3/m;->s()V

    new-instance v0, Lja3/l;

    const/4 v2, 0x3

    invoke-direct {v0, v2, p1, p2}, Lja3/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lzd3/o;->d(Lud3/k;)V

    invoke-virtual {p2, v0}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    return-object v1

    :cond_5
    :goto_1
    move-object p1, p2

    check-cast p1, Lud3/x0;

    :goto_2
    iget-boolean p2, p1, Lud3/x0;->Q:Z

    if-nez p2, :cond_7

    iget p2, p1, Lud3/x0;->z:I

    const/16 v0, 0x130

    if-eq p2, v0, :cond_7

    iget-object p2, p1, Lud3/x0;->G:Lud3/a1;

    if-eqz p2, :cond_6

    invoke-static {p2}, Lqh/d;->a(Ljava/io/Closeable;)V

    :cond_6
    new-instance p2, Lcoil/network/HttpException;

    invoke-direct {p2, p1}, Lcoil/network/HttpException;-><init>(Lud3/x0;)V

    throw p2

    :cond_7
    return-object p1
.end method

.method public final c()Lne3/p;
    .locals 1

    iget-object v0, p0, Lgh/m;->d:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v0, Leh/h;

    iget-object v0, v0, Leh/h;->a:Lne3/p;

    return-object v0
.end method

.method public final e()Lud3/o0;
    .locals 6

    new-instance v0, Lud3/n0;

    invoke-direct {v0}, Lud3/n0;-><init>()V

    iget-object v1, p0, Lgh/m;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lud3/n0;->f(Ljava/lang/String;)V

    iget-object v1, p0, Lgh/m;->b:Lmh/m;

    iget-object v2, v1, Lmh/m;->j:Lud3/d0;

    invoke-virtual {v0, v2}, Lud3/n0;->d(Lud3/d0;)V

    iget-object v2, v1, Lmh/m;->k:Lmh/p;

    iget-object v2, v2, Lmh/p;->a:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/lang/Class;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    const-string v5, "type"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v0, Lud3/n0;->e:Lv63/c;

    invoke-virtual {v5, v4, v3}, Lv63/c;->k(Lj93/d;Ljava/lang/Object;)Lv63/c;

    move-result-object v3

    iput-object v3, v0, Lud3/n0;->e:Lv63/c;

    goto :goto_0

    :cond_0
    iget-object v2, v1, Lmh/m;->n:Lmh/b;

    iget-boolean v3, v2, Lmh/b;->w:Z

    iget-object v1, v1, Lmh/m;->o:Lmh/b;

    iget-boolean v1, v1, Lmh/b;->w:Z

    if-nez v1, :cond_1

    if-eqz v3, :cond_1

    sget-object v1, Lud3/h;->o:Lud3/h;

    invoke-virtual {v0, v1}, Lud3/n0;->b(Lud3/h;)V

    goto :goto_1

    :cond_1
    if-eqz v1, :cond_3

    if-nez v3, :cond_3

    iget-boolean v1, v2, Lmh/b;->x:Z

    if-eqz v1, :cond_2

    sget-object v1, Lud3/h;->n:Lud3/h;

    invoke-virtual {v0, v1}, Lud3/n0;->b(Lud3/h;)V

    goto :goto_1

    :cond_2
    sget-object v1, Lgh/m;->f:Lud3/h;

    invoke-virtual {v0, v1}, Lud3/n0;->b(Lud3/h;)V

    goto :goto_1

    :cond_3
    if-nez v1, :cond_4

    if-nez v3, :cond_4

    sget-object v1, Lgh/m;->g:Lud3/h;

    invoke-virtual {v0, v1}, Lud3/n0;->b(Lud3/h;)V

    :cond_4
    :goto_1
    new-instance v1, Lud3/o0;

    invoke-direct {v1, v0}, Lud3/o0;-><init>(Lud3/n0;)V

    return-object v1
.end method

.method public final f(Leh/g;)Llh/b;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Lgh/m;->c()Lne3/p;

    move-result-object v1

    iget-object p1, p1, Leh/g;->w:Leh/c;

    iget-boolean v2, p1, Leh/c;->x:Z

    if-nez v2, :cond_1

    iget-object p1, p1, Leh/c;->w:Leh/b;

    iget-object p1, p1, Leh/b;->c:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lne3/e0;

    invoke-virtual {v1, p1}, Lne3/p;->x0(Lne3/e0;)Lne3/p0;

    move-result-object p1

    invoke-static {p1}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-instance v1, Llh/b;

    invoke-direct {v1, p1}, Llh/b;-><init>(Lne3/j0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {p1}, Lne3/j0;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object p1, v0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_1

    :catchall_1
    move-exception v1

    :try_start_3
    invoke-virtual {p1}, Lne3/j0;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception p1

    :try_start_4
    invoke-static {v1, p1}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_0
    move-object p1, v1

    move-object v1, v0

    :goto_1
    if-nez p1, :cond_0

    return-object v1

    :cond_0
    throw p1

    :cond_1
    const-string p1, "snapshot is closed"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    return-object v0
.end method

.method public final g(Leh/g;)Ldh/p;
    .locals 4

    iget-object v0, p1, Leh/g;->w:Leh/c;

    iget-boolean v1, v0, Leh/c;->x:Z

    if-nez v1, :cond_1

    iget-object v0, v0, Leh/c;->w:Leh/b;

    iget-object v0, v0, Leh/b;->c:Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lne3/e0;

    invoke-virtual {p0}, Lgh/m;->c()Lne3/p;

    move-result-object v1

    iget-object v2, p0, Lgh/m;->b:Lmh/m;

    iget-object v2, v2, Lmh/m;->i:Ljava/lang/String;

    if-nez v2, :cond_0

    iget-object v2, p0, Lgh/m;->a:Ljava/lang/String;

    :cond_0
    new-instance v3, Ldh/p;

    invoke-direct {v3, v0, v1, v2, p1}, Ldh/p;-><init>(Lne3/e0;Lne3/p;Ljava/lang/String;Ljava/io/Closeable;)V

    return-object v3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "snapshot is closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final h(Leh/g;Lud3/o0;Lud3/x0;Llh/b;)Leh/g;
    .locals 3

    iget-object v0, p0, Lgh/m;->b:Lmh/m;

    iget-object v0, v0, Lmh/m;->n:Lmh/b;

    iget-boolean v0, v0, Lmh/b;->x:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    iget-boolean v0, p0, Lgh/m;->e:Z

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lud3/o0;->a()Lud3/h;

    move-result-object p2

    iget-boolean p2, p2, Lud3/h;->b:Z

    if-nez p2, :cond_9

    invoke-virtual {p3}, Lud3/x0;->b()Lud3/h;

    move-result-object p2

    iget-boolean p2, p2, Lud3/h;->b:Z

    if-nez p2, :cond_9

    iget-object p2, p3, Lud3/x0;->F:Lud3/d0;

    const-string v0, "Vary"

    invoke-virtual {p2, v0}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "*"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_9

    :cond_0
    const/16 p2, 0xa

    if-eqz p1, :cond_1

    iget-object p1, p1, Leh/g;->w:Leh/c;

    iget-object v0, p1, Leh/c;->y:Leh/e;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p1}, Leh/c;->close()V

    iget-object p1, p1, Leh/c;->w:Leh/b;

    iget-object p1, p1, Leh/b;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Leh/e;->h(Ljava/lang/String;)Leh/a;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    if-eqz p1, :cond_3

    new-instance v0, Laj/c;

    invoke-direct {v0, p1, p2}, Laj/c;-><init>(Ljava/lang/Object;I)V

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :cond_1
    iget-object p1, p0, Lgh/m;->d:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Leh/h;

    if-eqz p1, :cond_3

    iget-object v0, p0, Lgh/m;->b:Lmh/m;

    iget-object v0, v0, Lmh/m;->i:Ljava/lang/String;

    if-nez v0, :cond_2

    iget-object v0, p0, Lgh/m;->a:Ljava/lang/String;

    :cond_2
    iget-object p1, p1, Leh/h;->b:Leh/e;

    sget-object v2, Lne3/l;->z:Lne3/k;

    invoke-static {v0}, Lne3/k;->b(Ljava/lang/String;)Lne3/l;

    move-result-object v0

    const-string v2, "SHA-256"

    invoke-virtual {v0, v2}, Lne3/l;->c(Ljava/lang/String;)Lne3/l;

    move-result-object v0

    invoke-virtual {v0}, Lne3/l;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Leh/e;->h(Ljava/lang/String;)Leh/a;

    move-result-object p1

    if-eqz p1, :cond_3

    new-instance v0, Laj/c;

    invoke-direct {v0, p1, p2}, Laj/c;-><init>(Ljava/lang/Object;I)V

    goto :goto_0

    :cond_3
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_4

    goto/16 :goto_8

    :cond_4
    const/4 p1, 0x0

    :try_start_1
    iget p2, p3, Lud3/x0;->z:I

    const/16 v2, 0x130

    if-ne p2, v2, :cond_6

    if-eqz p4, :cond_6

    invoke-virtual {p3}, Lud3/x0;->h()Lud3/w0;

    move-result-object p2

    iget-object p4, p4, Llh/b;->f:Lud3/d0;

    iget-object v2, p3, Lud3/x0;->F:Lud3/d0;

    invoke-static {p4, v2}, Lge3/g;->n(Lud3/d0;Lud3/d0;)Lud3/d0;

    move-result-object p4

    invoke-virtual {p2, p4}, Lud3/w0;->c(Lud3/d0;)V

    invoke-virtual {p2}, Lud3/w0;->a()Lud3/x0;

    move-result-object p2

    invoke-virtual {p0}, Lgh/m;->c()Lne3/p;

    move-result-object p4

    iget-object v2, v0, Laj/c;->x:Ljava/lang/Object;

    check-cast v2, Leh/a;

    invoke-virtual {v2, p1}, Leh/a;->b(I)Lne3/e0;

    move-result-object v2

    invoke-virtual {p4, v2, p1}, Lne3/p;->p0(Lne3/e0;Z)Lne3/n0;

    move-result-object p4

    invoke-static {p4}, Lne3/b;->b(Lne3/n0;)Lne3/h0;

    move-result-object p4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    :try_start_2
    new-instance v2, Llh/b;

    invoke-direct {v2, p2}, Llh/b;-><init>(Lud3/x0;)V

    invoke-virtual {v2, p4}, Llh/b;->a(Lne3/h0;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    invoke-virtual {p4}, Lne3/h0;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    goto :goto_1

    :catchall_2
    move-exception p2

    move-object v1, p2

    :try_start_4
    invoke-virtual {p4}, Lne3/h0;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception p2

    :try_start_5
    invoke-static {v1, p2}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_1
    if-nez v1, :cond_5

    goto/16 :goto_5

    :cond_5
    throw v1

    :catchall_4
    move-exception p1

    goto/16 :goto_7

    :catch_0
    move-exception p2

    goto/16 :goto_6

    :cond_6
    invoke-virtual {p0}, Lgh/m;->c()Lne3/p;

    move-result-object p2

    iget-object p4, v0, Laj/c;->x:Ljava/lang/Object;

    check-cast p4, Leh/a;

    invoke-virtual {p4, p1}, Leh/a;->b(I)Lne3/e0;

    move-result-object p4

    invoke-virtual {p2, p4, p1}, Lne3/p;->p0(Lne3/e0;Z)Lne3/n0;

    move-result-object p2

    invoke-static {p2}, Lne3/b;->b(Lne3/n0;)Lne3/h0;

    move-result-object p2
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    :try_start_6
    new-instance p4, Llh/b;

    invoke-direct {p4, p3}, Llh/b;-><init>(Lud3/x0;)V

    invoke-virtual {p4, p2}, Llh/b;->a(Lne3/h0;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    :try_start_7
    invoke-virtual {p2}, Lne3/h0;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    move-object p2, v1

    goto :goto_3

    :catchall_5
    move-exception p2

    goto :goto_3

    :catchall_6
    move-exception p4

    :try_start_8
    invoke-virtual {p2}, Lne3/h0;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    goto :goto_2

    :catchall_7
    move-exception p2

    :try_start_9
    invoke-static {p4, p2}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_2
    move-object p2, p4

    :goto_3
    if-nez p2, :cond_8

    invoke-virtual {p0}, Lgh/m;->c()Lne3/p;

    move-result-object p2

    iget-object p4, v0, Laj/c;->x:Ljava/lang/Object;

    check-cast p4, Leh/a;

    const/4 v2, 0x1

    invoke-virtual {p4, v2}, Leh/a;->b(I)Lne3/e0;

    move-result-object p4

    invoke-virtual {p2, p4, p1}, Lne3/p;->p0(Lne3/e0;Z)Lne3/n0;

    move-result-object p2

    invoke-static {p2}, Lne3/b;->b(Lne3/n0;)Lne3/h0;

    move-result-object p2
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    :try_start_a
    iget-object p4, p3, Lud3/x0;->G:Lud3/a1;

    invoke-static {p4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p4}, Lud3/a1;->d1()Lne3/j;

    move-result-object p4

    invoke-interface {p4, p2}, Lne3/j;->P0(Lne3/i;)J
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    :try_start_b
    invoke-virtual {p2}, Lne3/h0;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    goto :goto_4

    :catchall_8
    move-exception v1

    goto :goto_4

    :catchall_9
    move-exception p4

    move-object v1, p4

    :try_start_c
    invoke-virtual {p2}, Lne3/h0;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_a

    goto :goto_4

    :catchall_a
    move-exception p2

    :try_start_d
    invoke-static {v1, p2}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_4
    if-nez v1, :cond_7

    :goto_5
    invoke-virtual {v0}, Laj/c;->B()Leh/g;

    move-result-object p1
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_0
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    invoke-static {p3}, Lqh/d;->a(Ljava/io/Closeable;)V

    return-object p1

    :cond_7
    :try_start_e
    throw v1

    :cond_8
    throw p2
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_0
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    :goto_6
    :try_start_f
    sget-object p4, Lqh/d;->a:[Landroid/graphics/Bitmap$Config;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    :try_start_10
    iget-object p4, v0, Laj/c;->x:Ljava/lang/Object;

    check-cast p4, Leh/a;

    invoke-virtual {p4, p1}, Leh/a;->a(Z)V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_1
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    :catch_1
    :try_start_11
    throw p2
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    :goto_7
    invoke-static {p3}, Lqh/d;->a(Ljava/io/Closeable;)V

    throw p1

    :cond_9
    if-eqz p1, :cond_a

    invoke-static {p1}, Lqh/d;->a(Ljava/io/Closeable;)V

    :cond_a
    :goto_8
    return-object v1
.end method
