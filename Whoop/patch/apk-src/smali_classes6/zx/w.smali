.class public final Lzx/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzx/f;


# instance fields
.field public final E:Lb10/b;

.field public final F:Lec3/h2;

.field public final G:Lec3/r1;

.field public final w:Lb10/z0;

.field public final x:Lyy/f;

.field public final y:Lbi/p;

.field public final z:Lyy/j;


# direct methods
.method public constructor <init>(Lb10/z0;Lyy/f;Lbi/p;Lyy/j;Lb10/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzx/w;->w:Lb10/z0;

    iput-object p2, p0, Lzx/w;->x:Lyy/f;

    iput-object p3, p0, Lzx/w;->y:Lbi/p;

    iput-object p4, p0, Lzx/w;->z:Lyy/j;

    iput-object p5, p0, Lzx/w;->E:Lb10/b;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lzx/w;->F:Lec3/h2;

    invoke-static {p1}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lzx/w;->G:Lec3/r1;

    return-void
.end method


# virtual methods
.method public final d(Lzx/g;Lq83/d;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Lzx/u;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lzx/u;

    iget v4, v3, Lzx/u;->H:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lzx/u;->H:I

    goto :goto_0

    :cond_0
    new-instance v3, Lzx/u;

    check-cast v2, Ls83/c;

    invoke-direct {v3, v0, v2}, Lzx/u;-><init>(Lzx/w;Ls83/c;)V

    :goto_0
    iget-object v2, v3, Lzx/u;->F:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lzx/u;->H:I

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v5, :cond_4

    if-eq v5, v8, :cond_3

    if-eq v5, v7, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v1, v3, Lzx/u;->z:Ljava/lang/Object;

    iget-object v4, v3, Lzx/u;->y:Lzx/a;

    iget-object v5, v3, Lzx/u;->x:Lzx/g;

    iget-object v3, v3, Lzx/u;->w:Lzx/w;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v3, Lzx/u;->E:Lzx/u;

    iget-object v5, v3, Lzx/u;->z:Ljava/lang/Object;

    check-cast v5, Lzx/w;

    iget-object v7, v3, Lzx/u;->y:Lzx/a;

    iget-object v10, v3, Lzx/u;->x:Lzx/g;

    iget-object v11, v3, Lzx/u;->w:Lzx/w;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v2, Ll83/n;

    iget-object v2, v2, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_2

    :cond_3
    iget-object v1, v3, Lzx/u;->E:Lzx/u;

    iget-object v5, v3, Lzx/u;->z:Ljava/lang/Object;

    check-cast v5, Lzx/w;

    iget-object v10, v3, Lzx/u;->y:Lzx/a;

    iget-object v11, v3, Lzx/u;->x:Lzx/g;

    iget-object v12, v3, Lzx/u;->w:Lzx/w;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v2, v1

    move-object v1, v11

    goto :goto_1

    :cond_4
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v10, v1, Lzx/g;->g:Lzx/a;

    if-eqz v10, :cond_e

    sget-object v2, Lbc3/q0;->a:Lkc3/e;

    sget-object v2, Lhc3/o;->a:Lbc3/w1;

    new-instance v5, Lzx/v;

    const/4 v11, 0x0

    invoke-direct {v5, v0, v9, v11}, Lzx/v;-><init>(Lzx/w;Lq83/d;I)V

    iput-object v0, v3, Lzx/u;->w:Lzx/w;

    iput-object v1, v3, Lzx/u;->x:Lzx/g;

    iput-object v10, v3, Lzx/u;->y:Lzx/a;

    iput-object v0, v3, Lzx/u;->z:Ljava/lang/Object;

    iput-object v3, v3, Lzx/u;->E:Lzx/u;

    iput v8, v3, Lzx/u;->H:I

    invoke-static {v2, v5, v3}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_5

    goto :goto_3

    :cond_5
    move-object v5, v0

    move-object v12, v5

    move-object v2, v3

    :goto_1
    iget-object v11, v12, Lzx/w;->w:Lb10/z0;

    iget-object v13, v12, Lzx/w;->x:Lyy/f;

    iput-object v12, v3, Lzx/u;->w:Lzx/w;

    iput-object v1, v3, Lzx/u;->x:Lzx/g;

    iput-object v10, v3, Lzx/u;->y:Lzx/a;

    iput-object v5, v3, Lzx/u;->z:Ljava/lang/Object;

    iput-object v2, v3, Lzx/u;->E:Lzx/u;

    iput v7, v3, Lzx/u;->H:I

    invoke-virtual {v11, v10, v13, v3}, Lb10/z0;->z(Lzx/a;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v4, :cond_6

    goto :goto_3

    :cond_6
    move-object v11, v10

    move-object v10, v1

    move-object v1, v2

    move-object v2, v7

    move-object v7, v11

    move-object v11, v12

    :goto_2
    instance-of v12, v2, Ll83/m;

    if-nez v12, :cond_7

    check-cast v2, Ly00/l;

    iget-object v2, v2, Ly00/l;->x:Ljava/util/ArrayList;

    :cond_7
    sget-object v12, Lbc3/q0;->a:Lkc3/e;

    sget-object v12, Lhc3/o;->a:Lbc3/w1;

    new-instance v13, Lzx/v;

    invoke-direct {v13, v5, v9, v8}, Lzx/v;-><init>(Lzx/w;Lq83/d;I)V

    iput-object v11, v3, Lzx/u;->w:Lzx/w;

    iput-object v10, v3, Lzx/u;->x:Lzx/g;

    iput-object v7, v3, Lzx/u;->y:Lzx/a;

    iput-object v2, v3, Lzx/u;->z:Ljava/lang/Object;

    iput-object v9, v3, Lzx/u;->E:Lzx/u;

    iput v6, v3, Lzx/u;->H:I

    invoke-static {v12, v13, v1}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_8

    :goto_3
    return-object v4

    :cond_8
    move-object v1, v2

    move-object v4, v7

    move-object v5, v10

    move-object v3, v11

    :goto_4
    instance-of v2, v1, Ll83/m;

    if-nez v2, :cond_c

    move-object v6, v1

    check-cast v6, Ljava/util/List;

    iget-object v7, v3, Lzx/w;->y:Lbi/p;

    const-string v8, "bin"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "accountRanges"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, v7, Lbi/p;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v7, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v4, v6

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_c

    check-cast v6, Ljava/lang/Iterable;

    instance-of v4, v6, Ljava/util/Collection;

    if-eqz v4, :cond_9

    move-object v4, v6

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_9

    goto :goto_5

    :cond_9
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly00/b;

    iget-object v6, v6, Ly00/b;->w:Ly00/f;

    invoke-virtual {v6, v5}, Ly00/f;->b(Lzx/g;)Z

    move-result v6

    if-eqz v6, :cond_a

    goto :goto_6

    :cond_b
    :goto_5
    iget-boolean v4, v5, Lzx/g;->h:Z

    if-eqz v4, :cond_c

    iget-object v4, v3, Lzx/w;->z:Lyy/j;

    iget-object v10, v3, Lzx/w;->E:Lb10/b;

    sget-object v11, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->u0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v15, 0x0

    const/16 v16, 0x3e

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v10 .. v16}, Lb10/b;->c(Lb10/b;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;I)Lyy/b;

    move-result-object v3

    invoke-virtual {v4, v3}, Lyy/j;->a(Lyy/b;)V

    :cond_c
    :goto_6
    if-eqz v2, :cond_d

    goto :goto_7

    :cond_d
    move-object v9, v1

    :goto_7
    check-cast v9, Ljava/util/List;

    :cond_e
    return-object v9
.end method

.method public final getLoading()Lec3/r1;
    .locals 1

    iget-object v0, p0, Lzx/w;->G:Lec3/r1;

    return-object v0
.end method
