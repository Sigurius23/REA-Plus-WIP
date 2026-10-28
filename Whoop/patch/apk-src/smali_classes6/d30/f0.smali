.class public final Ld30/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lr9/n;)V
    .locals 0

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ld30/f0;->c:Ljava/lang/Object;

    .line 58
    iput-object p2, p0, Ld30/f0;->d:Ljava/lang/Object;

    .line 59
    sget-object p1, Lzr/g0;->x:Lzr/e0;

    .line 60
    sget-object p1, Lzr/w0;->E:Lzr/w0;

    .line 61
    iput-object p1, p0, Ld30/f0;->g:Ljava/lang/Object;

    .line 62
    sget-object p1, Lu8/w0;->a:Lu8/w0;

    iput-object p1, p0, Ld30/f0;->h:Ljava/lang/Object;

    .line 63
    sget-object p1, Lx8/p;->a:Lx8/p;

    iput-object p1, p0, Ld30/f0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lh0/c3;Le10/k0;Lek/d;Ly3/c;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Ld30/f0;->c:Ljava/lang/Object;

    .line 51
    iput-object p2, p0, Ld30/f0;->d:Ljava/lang/Object;

    .line 52
    iput-object p3, p0, Ld30/f0;->e:Ljava/lang/Object;

    .line 53
    iput-object p4, p0, Ld30/f0;->f:Ljava/lang/Object;

    const/4 p1, 0x0

    const/4 p2, 0x6

    const p3, 0x7fffffff

    .line 54
    invoke-static {p3, p2, p1}, Lq83/g;->d(IILdc3/a;)Ldc3/h;

    move-result-object p1

    iput-object p1, p0, Ld30/f0;->g:Ljava/lang/Object;

    .line 55
    new-instance p1, Lqg3/d;

    const/16 p2, 0xe

    const/4 p3, 0x0

    invoke-direct {p1, p2, p3}, Lqg3/d;-><init>(IB)V

    iput-object p1, p0, Ld30/f0;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ld30/i;Lq83/j;)V
    .locals 1

    const-string v0, "expectedItems"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Ld30/f0;->c:Ljava/lang/Object;

    .line 44
    iput-object p2, p0, Ld30/f0;->d:Ljava/lang/Object;

    .line 45
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Ld30/f0;->e:Ljava/lang/Object;

    .line 46
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Ld30/f0;->f:Ljava/lang/Object;

    .line 47
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Ld30/f0;->g:Ljava/lang/Object;

    .line 48
    invoke-static {p3}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p1

    iput-object p1, p0, Ld30/f0;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lv00/c0;Ljava/lang/String;ZLs10/f;Ls10/e;Lbc3/c0;Lt10/e;Lk20/a;)V
    .locals 1

    const-string v0, "paymentMethodMetadata"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "embeddedSelectionHolder"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "embeddedFormHelperFactory"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModelScope"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formActivityStateHelper"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventReporter"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Ld30/f0;->c:Ljava/lang/Object;

    .line 35
    iput-object p2, p0, Ld30/f0;->d:Ljava/lang/Object;

    .line 36
    iput-boolean p3, p0, Ld30/f0;->a:Z

    .line 37
    iput-object p4, p0, Ld30/f0;->e:Ljava/lang/Object;

    .line 38
    iput-object p5, p0, Ld30/f0;->f:Ljava/lang/Object;

    .line 39
    iput-object p6, p0, Ld30/f0;->g:Ljava/lang/Object;

    .line 40
    iput-object p7, p0, Ld30/f0;->h:Ljava/lang/Object;

    .line 41
    iput-object p8, p0, Ld30/f0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lv00/m0;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ld30/f0;->c:Ljava/lang/Object;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ld30/f0;->d:Ljava/lang/Object;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ld30/f0;->e:Ljava/lang/Object;

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ld30/f0;->f:Ljava/lang/Object;

    .line 6
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Ld30/f0;->g:Ljava/lang/Object;

    .line 7
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Ld30/f0;->h:Ljava/lang/Object;

    .line 8
    iget-object p1, p1, Lv00/m0;->i:Lh20/l1;

    .line 9
    invoke-virtual {p1}, Lh20/l1;->b()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Ld30/f0;->b:Ljava/lang/Object;

    .line 10
    sget-object p1, Lu00/d;->E:Lt83/b;

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    new-instance v0, La0/i1;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, La0/i1;-><init>(Ljava/lang/Object;I)V

    .line 13
    :cond_0
    :goto_0
    invoke-virtual {v0}, La0/i1;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v0}, La0/i1;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu00/d;

    .line 14
    iget-object v1, p0, Ld30/f0;->c:Ljava/lang/Object;

    check-cast v1, Lv00/m0;

    .line 15
    iget-object v1, v1, Lv00/m0;->i:Lh20/l1;

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    const-string v2, "configuration"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-virtual {p1, v1}, Lu00/d;->a(Lh20/l1;)Lh20/k1;

    move-result-object v1

    .line 19
    sget-object v2, Lh20/k1;->y:Lh20/k1;

    if-ne v1, v2, :cond_0

    .line 20
    invoke-virtual {p0, p1}, Ld30/f0;->h(Lu00/d;)V

    goto :goto_0

    .line 21
    :cond_1
    iget-object p1, p0, Ld30/f0;->c:Ljava/lang/Object;

    check-cast p1, Lv00/m0;

    .line 22
    iget-object p1, p1, Lv00/m0;->i:Lh20/l1;

    .line 23
    iget-object p1, p1, Lh20/l1;->z:Lh20/j1;

    .line 24
    sget-object v0, Lh20/j1;->y:Lh20/j1;

    if-ne p1, v0, :cond_2

    .line 25
    iget-object p1, p0, Ld30/f0;->b:Ljava/lang/Object;

    check-cast p1, Ljava/util/Set;

    .line 26
    const-string v0, "availableCountries"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    iget-object v0, p0, Ld30/f0;->c:Ljava/lang/Object;

    check-cast v0, Lv00/m0;

    .line 28
    iget-object v0, v0, Lv00/m0;->i:Lh20/l1;

    .line 29
    iget-object v0, v0, Lh20/l1;->z:Lh20/j1;

    .line 30
    sget-object v1, Lh20/j1;->x:Lh20/j1;

    if-eq v0, v1, :cond_2

    const/4 v0, 0x1

    .line 31
    iput-boolean v0, p0, Ld30/f0;->a:Z

    .line 32
    iput-object p1, p0, Ld30/f0;->b:Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method public static final a(Ld30/f0;Lh0/c3;Lh0/x1;FFLs83/c;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v5, p0

    move-object/from16 v7, p1

    move-object/from16 v0, p2

    move-object/from16 v1, p5

    instance-of v2, v1, Lh0/z1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lh0/z1;

    iget v3, v2, Lh0/z1;->F:I

    const/high16 v4, -0x80000000

    and-int v6, v3, v4

    if-eqz v6, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lh0/z1;->F:I

    :goto_0
    move-object v9, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lh0/z1;

    invoke-direct {v2, v5, v1}, Lh0/z1;-><init>(Ld30/f0;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v1, v9, Lh0/z1;->z:Ljava/lang/Object;

    sget-object v10, Lr83/a;->w:Lr83/a;

    iget v2, v9, Lh0/z1;->F:I

    const/4 v11, 0x0

    sget-object v12, Ll83/a0;->a:Ll83/a0;

    const/4 v13, 0x2

    const/4 v14, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v14, :cond_2

    if-ne v2, v13, :cond_1

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v12

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget v0, v9, Lh0/z1;->y:F

    iget-object v2, v9, Lh0/z1;->x:Lkotlin/jvm/internal/d0;

    iget-object v3, v9, Lh0/z1;->w:Lh0/c3;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {v1}, Ldc/b;->w(Ljava/lang/Object;)Lkotlin/jvm/internal/g0;

    move-result-object v3

    iput-object v0, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-virtual {v5, v0}, Ld30/f0;->l(Lh0/x1;)V

    iget-object v0, v5, Ld30/f0;->g:Ljava/lang/Object;

    check-cast v0, Ldc3/h;

    invoke-static {v0}, Ld30/f0;->k(Ldc3/h;)Lh0/x1;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v5, v0}, Ld30/f0;->l(Lh0/x1;)V

    iget-object v1, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Lh0/x1;

    invoke-virtual {v1, v0}, Lh0/x1;->a(Lh0/x1;)Lh0/x1;

    move-result-object v0

    iput-object v0, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    :cond_4
    new-instance v1, Lkotlin/jvm/internal/d0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget-object v0, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Lh0/x1;

    iget-wide v13, v0, Lh0/x1;->a:J

    invoke-virtual {v7, v13, v14}, Lh0/c3;->e(J)J

    move-result-wide v13

    invoke-virtual {v7, v13, v14}, Lh0/c3;->g(J)F

    move-result v0

    iput v0, v1, Lkotlin/jvm/internal/d0;->w:F

    invoke-static {v0}, Lh0/w1;->a(F)Z

    move-result v0

    if-eqz v0, :cond_5

    goto/16 :goto_6

    :cond_5
    new-instance v2, Lkotlin/jvm/internal/g0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x1e

    invoke-static {v11, v11, v0}, Ld0/f;->b(FFI)Ld0/m;

    move-result-object v0

    iput-object v0, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    new-instance v0, Lh0/a2;

    const/4 v8, 0x0

    move/from16 v4, p3

    move/from16 v6, p4

    invoke-direct/range {v0 .. v8}, Lh0/a2;-><init>(Lkotlin/jvm/internal/d0;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/g0;FLd30/f0;FLh0/c3;Lq83/d;)V

    iput-object v7, v9, Lh0/z1;->w:Lh0/c3;

    iput-object v1, v9, Lh0/z1;->x:Lkotlin/jvm/internal/d0;

    iput v6, v9, Lh0/z1;->y:F

    const/4 v15, 0x1

    iput v15, v9, Lh0/z1;->F:I

    invoke-virtual {v5, v7, v0, v9}, Ld30/f0;->n(Lh0/c3;Lh0/a2;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_6

    goto/16 :goto_5

    :cond_6
    move-object v2, v1

    move v0, v6

    move-object v3, v7

    :goto_2
    iget-object v1, v5, Ld30/f0;->h:Ljava/lang/Object;

    check-cast v1, Lqg3/d;

    iget-object v4, v1, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v4, Lrm/j1;

    const v6, 0x7f7fffff    # Float.MAX_VALUE

    invoke-virtual {v4, v6}, Lrm/j1;->b(F)F

    move-result v4

    iget-object v1, v1, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v1, Lrm/j1;

    invoke-virtual {v1, v6}, Lrm/j1;->b(F)F

    move-result v1

    invoke-static {v4, v1}, Ls4/i;->a(FF)J

    move-result-wide v6

    invoke-static {v6, v7}, Ly3/q;->c(J)Z

    move-result v1

    if-eqz v1, :cond_9

    iget v1, v2, Lkotlin/jvm/internal/d0;->w:F

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    const/16 v4, 0x64

    int-to-float v4, v4

    div-float/2addr v1, v4

    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iget v1, v2, Lkotlin/jvm/internal/d0;->w:F

    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    move-result v1

    invoke-virtual {v3, v1}, Lh0/c3;->d(F)F

    move-result v1

    mul-float/2addr v1, v0

    const/16 v0, 0x3e8

    int-to-float v0, v0

    mul-float/2addr v1, v0

    cmpg-float v0, v1, v11

    if-nez v0, :cond_7

    const-wide/16 v0, 0x0

    :goto_3
    move-wide v6, v0

    goto :goto_4

    :cond_7
    iget-object v0, v3, Lh0/c3;->d:Lh0/d2;

    sget-object v2, Lh0/d2;->x:Lh0/d2;

    if-ne v0, v2, :cond_8

    invoke-static {v1, v11}, Ls4/i;->a(FF)J

    move-result-wide v0

    goto :goto_3

    :cond_8
    invoke-static {v11, v1}, Ls4/i;->a(FF)J

    move-result-wide v0

    goto :goto_3

    :cond_9
    :goto_4
    iget-object v0, v5, Ld30/f0;->e:Ljava/lang/Object;

    check-cast v0, Lek/d;

    new-instance v1, Ly3/q;

    invoke-direct {v1, v6, v7}, Ly3/q;-><init>(J)V

    const/4 v2, 0x0

    iput-object v2, v9, Lh0/z1;->w:Lh0/c3;

    iput-object v2, v9, Lh0/z1;->x:Lkotlin/jvm/internal/d0;

    const/4 v2, 0x2

    iput v2, v9, Lh0/z1;->F:I

    invoke-virtual {v0, v1, v9}, Lek/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-ne v12, v10, :cond_a

    :goto_5
    return-object v10

    :cond_a
    :goto_6
    return-object v12
.end method

.method public static final b(Ld30/f0;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/d0;Lh0/c3;Lkotlin/jvm/internal/g0;JLs83/c;)Ljava/lang/Object;
    .locals 14

    move-wide/from16 v0, p5

    move-object/from16 v2, p7

    instance-of v3, v2, Lh0/b2;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lh0/b2;

    iget v4, v3, Lh0/b2;->G:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lh0/b2;->G:I

    goto :goto_0

    :cond_0
    new-instance v3, Lh0/b2;

    invoke-direct {v3, v2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object v2, v3, Lh0/b2;->F:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lh0/b2;->G:I

    const/4 v6, 0x1

    if-eqz v5, :cond_2

    if-ne v5, v6, :cond_1

    iget-object p0, v3, Lh0/b2;->E:Lkotlin/jvm/internal/g0;

    iget-object v0, v3, Lh0/b2;->z:Lh0/c3;

    iget-object v1, v3, Lh0/b2;->y:Lkotlin/jvm/internal/d0;

    iget-object v4, v3, Lh0/b2;->x:Lkotlin/jvm/internal/g0;

    iget-object v3, v3, Lh0/b2;->w:Ld30/f0;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, p0

    move-object v8, v0

    move-object p0, v3

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    const-wide/16 v7, 0x0

    cmp-long v2, v0, v7

    if-gez v2, :cond_3

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0

    :cond_3
    new-instance v2, La20/b;

    const/4 v5, 0x0

    const/16 v7, 0x18

    invoke-direct {v2, p0, v5, v7}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p0, v3, Lh0/b2;->w:Ld30/f0;

    iput-object p1, v3, Lh0/b2;->x:Lkotlin/jvm/internal/g0;

    move-object/from16 v7, p2

    iput-object v7, v3, Lh0/b2;->y:Lkotlin/jvm/internal/d0;

    move-object/from16 v8, p3

    iput-object v8, v3, Lh0/b2;->z:Lh0/c3;

    move-object/from16 v9, p4

    iput-object v9, v3, Lh0/b2;->E:Lkotlin/jvm/internal/g0;

    iput v6, v3, Lh0/b2;->G:I

    invoke-static {v0, v1, v2, v3}, Lbc3/k2;->d(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_4

    return-object v4

    :cond_4
    move-object v4, p1

    move-object v1, v7

    :goto_1
    check-cast v2, Lh0/x1;

    if-eqz v2, :cond_5

    iget-object v0, v4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Lh0/x1;

    iget-boolean v0, v0, Lh0/x1;->c:Z

    iget-wide v10, v2, Lh0/x1;->a:J

    iget-wide v12, v2, Lh0/x1;->b:J

    new-instance v3, Lh0/x1;

    move/from16 p4, v0

    move-object p1, v3

    move-wide/from16 p2, v10

    move-wide/from16 p5, v12

    invoke-direct/range {p1 .. p6}, Lh0/x1;-><init>(JZJ)V

    move-object v0, p1

    iput-object v0, v4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-virtual {v8, v10, v11}, Lh0/c3;->e(J)J

    move-result-wide v3

    invoke-virtual {v8, v3, v4}, Lh0/c3;->g(J)F

    move-result v0

    iput v0, v1, Lkotlin/jvm/internal/d0;->w:F

    const/16 v0, 0x1e

    const/4 v3, 0x0

    invoke-static {v3, v3, v0}, Ld0/f;->b(FFI)Ld0/m;

    move-result-object v0

    iput-object v0, v9, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-virtual {p0, v2}, Ld30/f0;->l(Lh0/x1;)V

    iget p0, v1, Lkotlin/jvm/internal/d0;->w:F

    invoke-static {p0}, Lh0/w1;->a(F)Z

    move-result p0

    xor-int/2addr p0, v6

    goto :goto_2

    :cond_5
    const/4 p0, 0x0

    :goto_2
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static k(Ldc3/h;)Lh0/x1;
    .locals 3

    new-instance v0, Ld1/i;

    const/16 v1, 0x1d

    invoke-direct {v0, p0, v1}, Ld1/i;-><init>(Ljava/lang/Object;I)V

    new-instance p0, Lf1/v0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p0, v0, v2, v1}, Lf1/v0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {p0}, Lv63/c;->i(Lc93/m;)Lxb3/j;

    move-result-object p0

    :goto_0
    invoke-virtual {p0}, Lxb3/j;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lxb3/j;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh0/x1;

    if-nez v2, :cond_0

    :goto_1
    move-object v2, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v0}, Lh0/x1;->a(Lh0/x1;)Lh0/x1;

    move-result-object v0

    goto :goto_1

    :cond_1
    return-object v2
.end method


# virtual methods
.method public c(Lh0/a3;F)F
    .locals 4

    iget-object v0, p0, Ld30/f0;->c:Ljava/lang/Object;

    check-cast v0, Lh0/c3;

    invoke-virtual {v0, p2}, Lh0/c3;->d(F)F

    move-result p2

    invoke-virtual {v0, p2}, Lh0/c3;->h(F)J

    move-result-wide v1

    iget-object p1, p1, Lh0/a3;->a:Lh0/c3;

    iget-object p2, p1, Lh0/c3;->k:Lh0/k2;

    const/4 v3, 0x1

    invoke-virtual {p1, p2, v1, v2, v3}, Lh0/c3;->c(Lh0/k2;JI)J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Lh0/c3;->e(J)J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Lh0/c3;->g(J)F

    move-result p1

    return p1
.end method

.method public d(Lg40/i1;)V
    .locals 1

    const-string v0, "formElement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld30/f0;->e:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public e(Lx30/e1;)V
    .locals 1

    iget-object v0, p0, Ld30/f0;->f:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public f(Lu2/k;Lu2/l;J)V
    .locals 7

    sget-object p3, Lu2/l;->x:Lu2/l;

    if-ne p2, p3, :cond_5

    iget p2, p1, Lu2/k;->f:I

    iget-object p3, p1, Lu2/k;->a:Ljava/lang/Object;

    const/4 p4, 0x6

    if-ne p2, p4, :cond_5

    move-object p2, p3

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result p4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, p4, :cond_1

    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lu2/r;

    invoke-virtual {v2}, Lu2/r;->l()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_4

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object p4, p0, Ld30/f0;->d:Ljava/lang/Object;

    check-cast p4, Le10/k0;

    invoke-virtual {p4, p1}, Le10/k0;->l(Lu2/k;)J

    move-result-wide v2

    iget-object p1, p0, Ld30/f0;->c:Ljava/lang/Object;

    check-cast p1, Lh0/c3;

    invoke-virtual {p1, v2, v3}, Lh0/c3;->e(J)J

    move-result-wide v4

    invoke-virtual {p1, v4, v5}, Lh0/c3;->g(J)F

    move-result p4

    const/4 v1, 0x0

    cmpg-float v4, p4, v1

    if-nez v4, :cond_2

    move p1, v0

    goto :goto_1

    :cond_2
    cmpl-float p4, p4, v1

    if-lez p4, :cond_3

    iget-object p1, p1, Lh0/c3;->a:Lh0/x2;

    invoke-interface {p1}, Lh0/x2;->d()Z

    move-result p1

    goto :goto_1

    :cond_3
    iget-object p1, p1, Lh0/c3;->a:Lh0/x2;

    invoke-interface {p1}, Lh0/x2;->c()Z

    move-result p1

    :goto_1
    if-eqz p1, :cond_4

    iget-object p1, p0, Ld30/f0;->g:Ljava/lang/Object;

    check-cast p1, Ldc3/h;

    new-instance v1, Lh0/x1;

    invoke-static {p3}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lu2/r;

    iget-wide v5, p4, Lu2/r;->b:J

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lh0/x1;-><init>(JZJ)V

    invoke-interface {p1, v1}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Ldc3/n;

    xor-int/lit8 p1, p1, 0x1

    goto :goto_2

    :cond_4
    iget-boolean p1, p0, Ld30/f0;->a:Z

    :goto_2
    if-eqz p1, :cond_5

    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result p1

    :goto_3
    if-ge v0, p1, :cond_5

    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lu2/r;

    invoke-virtual {p2}, Lu2/r;->a()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_5
    :goto_4
    return-void
.end method

.method public g(Lu00/d;)V
    .locals 2

    iget-object v0, p0, Ld30/f0;->g:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashSet;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ld30/f0;->h:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashSet;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ld30/f0;->e:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ld30/f0;->c:Ljava/lang/Object;

    check-cast v1, Lv00/m0;

    iget-object v1, v1, Lv00/m0;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {p1, v1}, Lu00/d;->b(Ljava/util/LinkedHashMap;)Lg40/w2;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public h(Lu00/d;)V
    .locals 2

    iget-object v0, p0, Ld30/f0;->c:Ljava/lang/Object;

    check-cast v0, Lv00/m0;

    iget-object v0, v0, Lv00/m0;->i:Lh20/l1;

    const-string v1, "configuration"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lu00/d;->a(Lh20/l1;)Lh20/k1;

    move-result-object v0

    sget-object v1, Lh20/k1;->x:Lh20/k1;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Ld30/f0;->g:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashSet;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public i()V
    .locals 2

    iget-object v0, p0, Ld30/f0;->g:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    iget-object v0, p0, Ld30/f0;->f:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    iget-object v0, p0, Ld30/f0;->e:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ld30/f0;->a:Z

    iget-object v0, p0, Ld30/f0;->b:Ljava/lang/Object;

    check-cast v0, Lbc3/c2;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iget-object v0, p0, Ld30/f0;->h:Ljava/lang/Object;

    check-cast v0, Lhc3/d;

    invoke-static {v0, v1}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public j(Lbc3/c0;)V
    .locals 3

    iget-object v0, p0, Ld30/f0;->b:Ljava/lang/Object;

    check-cast v0, Lbc3/c2;

    if-nez v0, :cond_0

    new-instance v0, Ld30/o;

    const/16 v1, 0x18

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2, v1}, Ld30/o;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v1, 0x3

    invoke-static {p1, v2, v2, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, p0, Ld30/f0;->b:Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public l(Lh0/x1;)V
    .locals 7

    iget-object v0, p0, Ld30/f0;->h:Ljava/lang/Object;

    check-cast v0, Lqg3/d;

    iget-wide v1, p1, Lh0/x1;->b:J

    iget-wide v3, p1, Lh0/x1;->a:J

    iget-object p1, v0, Lqg3/d;->x:Ljava/lang/Object;

    check-cast p1, Lrm/j1;

    const/16 v5, 0x20

    shr-long v5, v3, v5

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    invoke-virtual {p1, v5, v1, v2}, Lrm/j1;->a(FJ)V

    iget-object p1, v0, Lqg3/d;->y:Ljava/lang/Object;

    check-cast p1, Lrm/j1;

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    long-to-int v0, v3

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-virtual {p1, v0, v1, v2}, Lrm/j1;->a(FJ)V

    return-void
.end method

.method public m(Ly3/c;)V
    .locals 0

    iput-object p1, p0, Ld30/f0;->f:Ljava/lang/Object;

    return-void
.end method

.method public n(Lh0/c3;Lh0/a2;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p3, Lh0/c2;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lh0/c2;

    iget v1, v0, Lh0/c2;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh0/c2;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh0/c2;

    invoke-direct {v0, p0, p3}, Lh0/c2;-><init>(Ld30/f0;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lh0/c2;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh0/c2;->y:I

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

    iput-boolean v3, p0, Ld30/f0;->a:Z

    new-instance p3, Ld30/o;

    const/4 v2, 0x0

    const/16 v4, 0x19

    invoke-direct {p3, p1, p2, v2, v4}, Ld30/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v3, v0, Lh0/c2;->y:I

    new-instance p1, Lbc3/d2;

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p2

    const/4 v2, 0x0

    invoke-direct {p1, p2, v0, v2}, Lbc3/d2;-><init>(Lq83/j;Lq83/d;I)V

    invoke-static {p1, v3, p1, p3}, Le93/b;->c0(Lhc3/u;ZLhc3/u;Lc93/m;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const/4 p1, 0x0

    iput-boolean p1, p0, Ld30/f0;->a:Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
