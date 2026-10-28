.class public final Lf1/w0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lf1/b1;

.field public final b:Lp1/k1;

.field public final c:Lp1/k1;

.field public d:Lkotlin/jvm/functions/Function1;

.field public e:Lq2/a;

.field public f:Lkotlin/jvm/functions/Function1;

.field public final g:Lro/i;

.field public final h:Lg2/s;

.field public final i:Lp1/k1;

.field public final j:Lp1/f0;

.field public k:Lh2/b;

.field public l:Ly2/y;

.field public final m:Lp1/k1;

.field public final n:Lp1/k1;

.field public final o:Lp1/k1;

.field public final p:Lp1/k1;

.field public final q:Lp1/k1;

.field public final r:Lp1/k1;

.field public final s:Lp1/k1;

.field public t:Lf1/q0;

.field public u:Z

.field public v:Lbc3/c0;

.field public w:Lf1/p;

.field public x:Z


# direct methods
.method public constructor <init>(Lf1/b1;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/w0;->a:Lf1/b1;

    const/4 v0, 0x0

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    iput-object v1, p0, Lf1/w0;->b:Lp1/k1;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    iput-object v1, p0, Lf1/w0;->c:Lp1/k1;

    new-instance v1, Lf1/c0;

    const/4 v2, 0x7

    invoke-direct {v1, p0, v2}, Lf1/c0;-><init>(Lf1/w0;I)V

    iput-object v1, p0, Lf1/w0;->d:Lkotlin/jvm/functions/Function1;

    new-instance v1, Lro/i;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lro/i;-><init>(I)V

    iput-object v1, p0, Lf1/w0;->g:Lro/i;

    new-instance v1, Lg2/s;

    invoke-direct {v1}, Lg2/s;-><init>()V

    iput-object v1, p0, Lf1/w0;->h:Lg2/s;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    iput-object v1, p0, Lf1/w0;->i:Lp1/k1;

    new-instance v1, Lf1/d0;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v2}, Lf1/d0;-><init>(Lf1/w0;I)V

    invoke-static {v1}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v1

    iput-object v1, p0, Lf1/w0;->j:Lp1/f0;

    sget-object v1, Lp1/v0;->y:Lp1/v0;

    new-instance v2, Lp1/k1;

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    invoke-direct {v2, v3, v1}, Lp1/k1;-><init>(Ljava/lang/Object;Lp1/o2;)V

    iput-object v2, p0, Lf1/w0;->m:Lp1/k1;

    new-instance v1, Lh2/b;

    const-wide/16 v2, 0x0

    invoke-direct {v1, v2, v3}, Lh2/b;-><init>(J)V

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    iput-object v1, p0, Lf1/w0;->n:Lp1/k1;

    new-instance v1, Lh2/b;

    invoke-direct {v1, v2, v3}, Lh2/b;-><init>(J)V

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    iput-object v1, p0, Lf1/w0;->o:Lp1/k1;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    iput-object v1, p0, Lf1/w0;->p:Lp1/k1;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    iput-object v1, p0, Lf1/w0;->q:Lp1/k1;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    iput-object v1, p0, Lf1/w0;->r:Lp1/k1;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Lf1/w0;->s:Lp1/k1;

    new-instance v0, Lf1/c0;

    const/16 v1, 0x8

    invoke-direct {v0, p0, v1}, Lf1/c0;-><init>(Lf1/w0;I)V

    iput-object v0, p1, Lf1/b1;->e:Lf1/c0;

    new-instance v0, Las1/j;

    const/4 v1, 0x5

    invoke-direct {v0, p0, v1}, Las1/j;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p1, Lf1/b1;->f:Las1/j;

    new-instance v0, Ld30/k;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Ld30/k;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p1, Lf1/b1;->g:Ld30/k;

    new-instance v0, Lf1/d0;

    const/4 v1, 0x4

    invoke-direct {v0, p0, v1}, Lf1/d0;-><init>(Lf1/w0;I)V

    iput-object v0, p1, Lf1/b1;->h:Lf1/d0;

    new-instance v0, Lf1/c0;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lf1/c0;-><init>(Lf1/w0;I)V

    iput-object v0, p1, Lf1/b1;->i:Lf1/c0;

    new-instance v0, Lf1/c0;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lf1/c0;-><init>(Lf1/w0;I)V

    iput-object v0, p1, Lf1/b1;->j:Lf1/c0;

    return-void
.end method

.method public static final a(Lf1/w0;Ls83/i;)Ljava/lang/Object;
    .locals 10

    invoke-virtual {p0}, Lf1/w0;->e()Ll83/k;

    move-result-object v0

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v2, v0, Ll83/k;->w:Ljava/lang/Object;

    move-object v5, v2

    check-cast v5, Ll3/g;

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    check-cast v0, Ll3/u0;

    iget-wide v6, v0, Ll3/u0;->a:J

    iget-object v4, p0, Lf1/w0;->w:Lf1/p;

    if-eqz v4, :cond_3

    invoke-virtual {v5}, Ll3/g;->length()I

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v6, v7}, Ll3/u0;->c(J)Z

    move-result p0

    if-eqz p0, :cond_2

    :goto_0
    move-object p0, v1

    goto :goto_1

    :cond_2
    new-instance v3, Lf0/c;

    const/4 v8, 0x0

    const/4 v9, 0x2

    invoke-direct/range {v3 .. v9}, Lf0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;JLq83/d;I)V

    iget-object p0, v4, Lf1/p;->a:Lq83/j;

    new-instance v0, Lb2/y;

    const/4 v2, 0x0

    invoke-direct {v0, v4, v3, v2}, Lb2/y;-><init>(Lf1/p;Lc93/m;Lq83/d;)V

    invoke-static {p0, v0, p1}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    :goto_1
    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_3

    return-object p0

    :cond_3
    :goto_2
    return-object v1
.end method


# virtual methods
.method public final b(Ly2/y;J)J
    .locals 1

    iget-object v0, p0, Lf1/w0;->l:Ly2/y;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ly2/y;->g()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lf1/w0;->k()Ly2/y;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Ly2/y;->k(Ly2/y;J)J

    move-result-wide p1

    return-wide p1

    :cond_1
    :goto_0
    const-wide p1, 0x7fc000007fc00000L    # 2.247117487993712E307

    return-wide p1
.end method

.method public final c()V
    .locals 13

    invoke-virtual {p0}, Lf1/w0;->g()Lf1/u;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lf1/w0;->a:Lf1/b1;

    invoke-virtual {v0}, Lf1/b1;->a()La0/k0;

    move-result-object v2

    iget v2, v2, La0/k0;->e:I

    if-nez v2, :cond_0

    goto/16 :goto_3

    :cond_0
    new-instance v2, Ll3/d;

    invoke-direct {v2}, Ll3/d;-><init>()V

    invoke-virtual {p0}, Lf1/w0;->k()Ly2/y;

    move-result-object v3

    invoke-virtual {v0, v3}, Lf1/b1;->e(Ly2/y;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v4

    :cond_1
    invoke-interface {v4}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v5

    const/4 v6, -0x1

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf1/l;

    invoke-virtual {v0}, Lf1/b1;->a()La0/k0;

    move-result-object v7

    iget-wide v8, v5, Lf1/l;->a:J

    invoke-virtual {v7, v8, v9}, La0/k0;->e(J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf1/u;

    if-eqz v5, :cond_1

    iget-object v7, v5, Lf1/u;->a:Lf1/t;

    iget v7, v7, Lf1/t;->b:I

    iget-object v5, v5, Lf1/u;->b:Lf1/t;

    iget v5, v5, Lf1/t;->b:I

    if-eq v7, v5, :cond_1

    invoke-interface {v4}, Ljava/util/ListIterator;->nextIndex()I

    move-result v4

    goto :goto_0

    :cond_2
    move v4, v6

    :goto_0
    if-eq v4, v6, :cond_5

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v5

    const/4 v6, 0x0

    move v7, v6

    :goto_1
    if-ge v7, v5, :cond_5

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lf1/l;

    invoke-virtual {v0}, Lf1/b1;->a()La0/k0;

    move-result-object v9

    iget-wide v10, v8, Lf1/l;->a:J

    invoke-virtual {v9, v10, v11}, La0/k0;->e(J)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lf1/u;

    if-eqz v9, :cond_4

    invoke-virtual {v8}, Lf1/l;->e()Ll3/g;

    move-result-object v8

    iget-object v10, v9, Lf1/u;->a:Lf1/t;

    iget v10, v10, Lf1/t;->b:I

    iget-object v9, v9, Lf1/u;->b:Lf1/t;

    iget v9, v9, Lf1/t;->b:I

    invoke-static {v10, v9}, Lj93/l0;->f(II)J

    move-result-wide v9

    if-lt v7, v4, :cond_3

    const/4 v11, 0x1

    goto :goto_2

    :cond_3
    move v11, v6

    :goto_2
    invoke-static {v9, v10}, Ll3/u0;->f(J)I

    move-result v12

    invoke-static {v9, v10}, Ll3/u0;->e(J)I

    move-result v9

    invoke-virtual {v2, v8, v12, v9}, Ll3/d;->d(Ll3/g;II)V

    if-nez v11, :cond_4

    const/16 v8, 0xa

    iget-object v9, v2, Ll3/d;->w:Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_5
    invoke-virtual {v2}, Ll3/d;->k()Ll3/g;

    move-result-object v0

    goto :goto_4

    :cond_6
    :goto_3
    move-object v0, v1

    :goto_4
    if-eqz v0, :cond_8

    iget-object v2, v0, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_7

    move-object v1, v0

    :cond_7
    if-eqz v1, :cond_8

    iget-object v0, p0, Lf1/w0;->f:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_8

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    return-void
.end method

.method public final d(Lf1/t;)Lf1/l;
    .locals 3

    iget-object v0, p0, Lf1/w0;->a:Lf1/b1;

    iget-object v0, v0, Lf1/b1;->c:La0/k0;

    iget-wide v1, p1, Lf1/t;->c:J

    invoke-virtual {v0, v1, v2}, La0/k0;->e(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf1/l;

    return-object p1
.end method

.method public final e()Ll83/k;
    .locals 16

    invoke-virtual/range {p0 .. p0}, Lf1/w0;->g()Lf1/u;

    move-result-object v0

    if-eqz v0, :cond_a

    move-object/from16 v0, p0

    iget-object v1, v0, Lf1/w0;->a:Lf1/b1;

    iget-object v2, v1, Lf1/b1;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_4

    :cond_0
    new-instance v2, Ll3/d;

    invoke-direct {v2}, Ll3/d;-><init>()V

    invoke-virtual {v0}, Lf1/w0;->k()Ly2/y;

    move-result-object v3

    invoke-virtual {v1, v3}, Lf1/b1;->e(Ly2/y;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v4

    :cond_1
    invoke-interface {v4}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v5

    const/4 v6, -0x1

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf1/l;

    invoke-virtual {v1}, Lf1/b1;->a()La0/k0;

    move-result-object v7

    iget-wide v8, v5, Lf1/l;->a:J

    invoke-virtual {v7, v8, v9}, La0/k0;->e(J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf1/u;

    if-eqz v5, :cond_1

    iget-object v7, v5, Lf1/u;->a:Lf1/t;

    iget v7, v7, Lf1/t;->b:I

    iget-object v5, v5, Lf1/u;->b:Lf1/t;

    iget v5, v5, Lf1/t;->b:I

    if-eq v7, v5, :cond_1

    invoke-interface {v4}, Ljava/util/ListIterator;->nextIndex()I

    move-result v4

    goto :goto_0

    :cond_2
    move v4, v6

    :goto_0
    if-eq v4, v6, :cond_7

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v5

    const/4 v7, 0x0

    move v9, v6

    move v10, v9

    move v8, v7

    :goto_1
    if-ge v8, v5, :cond_8

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lf1/l;

    invoke-virtual {v1}, Lf1/b1;->a()La0/k0;

    move-result-object v12

    iget-wide v13, v11, Lf1/l;->a:J

    invoke-virtual {v12, v13, v14}, La0/k0;->e(J)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lf1/u;

    if-eqz v12, :cond_6

    invoke-virtual {v11}, Lf1/l;->e()Ll3/g;

    move-result-object v11

    iget-object v13, v12, Lf1/u;->a:Lf1/t;

    iget v13, v13, Lf1/t;->b:I

    iget-object v12, v12, Lf1/u;->b:Lf1/t;

    iget v12, v12, Lf1/t;->b:I

    invoke-static {v13, v12}, Lj93/l0;->f(II)J

    move-result-wide v12

    if-lt v8, v4, :cond_3

    const/4 v14, 0x1

    goto :goto_2

    :cond_3
    move v14, v7

    :goto_2
    if-ne v9, v6, :cond_4

    invoke-static {v12, v13}, Ll3/u0;->f(J)I

    move-result v9

    invoke-static {v12, v13}, Ll3/u0;->f(J)I

    move-result v15

    invoke-virtual {v2, v11, v7, v15}, Ll3/d;->d(Ll3/g;II)V

    :cond_4
    invoke-static {v12, v13}, Ll3/u0;->f(J)I

    move-result v15

    invoke-static {v12, v13}, Ll3/u0;->e(J)I

    move-result v7

    invoke-virtual {v2, v11, v15, v7}, Ll3/d;->d(Ll3/g;II)V

    iget-object v7, v2, Ll3/d;->w:Ljava/lang/StringBuilder;

    if-nez v14, :cond_5

    const/16 v11, 0xa

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_5
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->length()I

    move-result v10

    invoke-static {v12, v13}, Ll3/u0;->e(J)I

    move-result v7

    iget-object v12, v11, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v12

    invoke-virtual {v2, v11, v7, v12}, Ll3/d;->d(Ll3/g;II)V

    :cond_6
    :goto_3
    add-int/lit8 v8, v8, 0x1

    const/4 v7, 0x0

    goto :goto_1

    :cond_7
    move v9, v6

    move v10, v9

    :cond_8
    invoke-virtual {v2}, Ll3/d;->k()Ll3/g;

    move-result-object v1

    if-eq v9, v6, :cond_b

    if-ne v10, v6, :cond_9

    goto :goto_4

    :cond_9
    new-instance v2, Ll83/k;

    invoke-static {v9, v10}, Lj93/l0;->f(II)J

    move-result-wide v3

    new-instance v5, Ll3/u0;

    invoke-direct {v5, v3, v4}, Ll3/u0;-><init>(J)V

    invoke-direct {v2, v1, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v2

    :cond_a
    move-object/from16 v0, p0

    :cond_b
    :goto_4
    const/4 v1, 0x0

    return-object v1
.end method

.method public final f()Lu0/f0;
    .locals 1

    iget-object v0, p0, Lf1/w0;->r:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu0/f0;

    return-object v0
.end method

.method public final g()Lf1/u;
    .locals 1

    iget-object v0, p0, Lf1/w0;->b:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf1/u;

    return-object v0
.end method

.method public final h()Z
    .locals 1

    iget-object v0, p0, Lf1/w0;->c:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final i()Z
    .locals 9

    invoke-virtual {p0}, Lf1/w0;->g()Lf1/u;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v2, v0, Lf1/u;->b:Lf1/t;

    iget-object v0, v0, Lf1/u;->a:Lf1/t;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_2

    :cond_1
    iget-wide v3, v0, Lf1/t;->c:J

    iget-wide v5, v2, Lf1/t;->c:J

    cmp-long v0, v3, v5

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lf1/w0;->k()Ly2/y;

    move-result-object v0

    iget-object v2, p0, Lf1/w0;->a:Lf1/b1;

    invoke-virtual {v2, v0}, Lf1/b1;->e(Ly2/y;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v4, v1

    :goto_0
    if-ge v4, v3, :cond_4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf1/l;

    invoke-virtual {v2}, Lf1/b1;->a()La0/k0;

    move-result-object v6

    iget-wide v7, v5, Lf1/l;->a:J

    invoke-virtual {v6, v7, v8}, La0/k0;->e(J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf1/u;

    if-eqz v5, :cond_3

    iget-object v6, v5, Lf1/u;->a:Lf1/t;

    iget v6, v6, Lf1/t;->b:I

    iget-object v5, v5, Lf1/u;->b:Lf1/t;

    iget v5, v5, Lf1/t;->b:I

    if-eq v6, v5, :cond_3

    :goto_1
    const/4 v0, 0x1

    return v0

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    :goto_2
    return v1
.end method

.method public final j()V
    .locals 2

    sget-object v0, La0/w;->a:La0/k0;

    const-string v1, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lf1/w0;->a:Lf1/b1;

    iget-object v1, v1, Lf1/b1;->k:Lp1/k1;

    invoke-virtual {v1, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lf1/w0;->x:Z

    invoke-virtual {p0}, Lf1/w0;->p()V

    invoke-virtual {p0}, Lf1/w0;->g()Lf1/u;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf1/w0;->d:Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lf1/w0;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf1/w0;->e:Lq2/a;

    if-eqz v0, :cond_0

    const/16 v1, 0x9

    invoke-interface {v0, v1}, Lq2/a;->a(I)V

    :cond_0
    return-void
.end method

.method public final k()Ly2/y;
    .locals 2

    iget-object v0, p0, Lf1/w0;->l:Ly2/y;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ly2/y;->g()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "unattached coordinates"

    invoke-static {v1}, Lk0/a;->a(Ljava/lang/String;)V

    :cond_0
    return-object v0

    :cond_1
    const-string v0, "null coordinates"

    invoke-static {v0}, Lk0/a;->b(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0
.end method

.method public final l(Z)V
    .locals 2

    iget-object v0, p0, Lf1/w0;->c:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eq v1, p1, :cond_0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lf1/w0;->p()V

    :cond_0
    return-void
.end method

.method public final m(Lf1/u;)V
    .locals 1

    iget-object v0, p0, Lf1/w0;->b:Lp1/k1;

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lf1/w0;->n()V

    :cond_0
    return-void
.end method

.method public final n()V
    .locals 20

    move-object/from16 v0, p0

    invoke-virtual {v0}, Lf1/w0;->g()Lf1/u;

    move-result-object v1

    iget-object v2, v0, Lf1/w0;->l:Ly2/y;

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    iget-object v4, v1, Lf1/u;->a:Lf1/t;

    if-eqz v4, :cond_0

    invoke-virtual {v0, v4}, Lf1/w0;->d(Lf1/t;)Lf1/l;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v3

    :goto_0
    if-eqz v1, :cond_1

    iget-object v5, v1, Lf1/u;->b:Lf1/t;

    if-eqz v5, :cond_1

    invoke-virtual {v0, v5}, Lf1/w0;->d(Lf1/t;)Lf1/l;

    move-result-object v5

    goto :goto_1

    :cond_1
    move-object v5, v3

    :goto_1
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lf1/l;->d()Ly2/y;

    move-result-object v6

    goto :goto_2

    :cond_2
    move-object v6, v3

    :goto_2
    if-eqz v5, :cond_3

    invoke-virtual {v5}, Lf1/l;->d()Ly2/y;

    move-result-object v7

    goto :goto_3

    :cond_3
    move-object v7, v3

    :goto_3
    iget-object v8, v0, Lf1/w0;->q:Lp1/k1;

    iget-object v9, v0, Lf1/w0;->p:Lp1/k1;

    if-eqz v1, :cond_c

    if-eqz v2, :cond_c

    invoke-interface {v2}, Ly2/y;->g()Z

    move-result v10

    if-eqz v10, :cond_c

    if-nez v6, :cond_4

    if-nez v7, :cond_4

    goto :goto_7

    :cond_4
    invoke-static {v2}, Lf1/y0;->z(Ly2/y;)Lh2/c;

    move-result-object v10

    const-wide v13, 0x7fffffff7fffffffL

    if-eqz v6, :cond_6

    const/4 v15, 0x1

    const-wide v16, 0x7fc000007fc00000L    # 2.247117487993712E307

    invoke-virtual {v4, v1, v15}, Lf1/l;->a(Lf1/u;Z)J

    move-result-wide v11

    and-long v18, v11, v13

    cmp-long v4, v18, v16

    if-nez v4, :cond_5

    goto :goto_4

    :cond_5
    invoke-interface {v2, v6, v11, v12}, Ly2/y;->k(Ly2/y;J)J

    move-result-wide v11

    new-instance v4, Lh2/b;

    invoke-direct {v4, v11, v12}, Lh2/b;-><init>(J)V

    invoke-virtual {v0}, Lf1/w0;->f()Lu0/f0;

    move-result-object v6

    sget-object v15, Lu0/f0;->x:Lu0/f0;

    if-eq v6, v15, :cond_8

    invoke-static {v10, v11, v12}, Lf1/y0;->q(Lh2/c;J)Z

    move-result v6

    if-eqz v6, :cond_7

    goto :goto_5

    :cond_6
    const-wide v16, 0x7fc000007fc00000L    # 2.247117487993712E307

    :cond_7
    :goto_4
    move-object v4, v3

    :cond_8
    :goto_5
    invoke-virtual {v9, v4}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    if-eqz v7, :cond_b

    const/4 v4, 0x0

    invoke-virtual {v5, v1, v4}, Lf1/l;->a(Lf1/u;Z)J

    move-result-wide v4

    and-long v11, v4, v13

    cmp-long v1, v11, v16

    if-nez v1, :cond_9

    goto :goto_6

    :cond_9
    invoke-interface {v2, v7, v4, v5}, Ly2/y;->k(Ly2/y;J)J

    move-result-wide v1

    new-instance v4, Lh2/b;

    invoke-direct {v4, v1, v2}, Lh2/b;-><init>(J)V

    invoke-virtual {v0}, Lf1/w0;->f()Lu0/f0;

    move-result-object v5

    sget-object v6, Lu0/f0;->y:Lu0/f0;

    if-eq v5, v6, :cond_a

    invoke-static {v10, v1, v2}, Lf1/y0;->q(Lh2/c;J)Z

    move-result v1

    if-eqz v1, :cond_b

    :cond_a
    move-object v3, v4

    :cond_b
    :goto_6
    invoke-virtual {v8, v3}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void

    :cond_c
    :goto_7
    invoke-virtual {v9, v3}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v8, v3}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final o(JJZLf1/v;)Z
    .locals 33

    move-object/from16 v0, p0

    if-eqz p5, :cond_0

    sget-object v1, Lu0/f0;->x:Lu0/f0;

    goto :goto_0

    :cond_0
    sget-object v1, Lu0/f0;->y:Lu0/f0;

    :goto_0
    iget-object v2, v0, Lf1/w0;->r:Lp1/k1;

    invoke-virtual {v2, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    new-instance v1, Lh2/b;

    move-wide/from16 v3, p1

    invoke-direct {v1, v3, v4}, Lh2/b;-><init>(J)V

    iget-object v2, v0, Lf1/w0;->s:Lp1/k1;

    invoke-virtual {v2, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lf1/w0;->k()Ly2/y;

    move-result-object v7

    iget-object v1, v0, Lf1/w0;->a:Lf1/b1;

    invoke-virtual {v1, v7}, Lf1/b1;->e(Ly2/y;)Ljava/util/ArrayList;

    move-result-object v11

    sget v2, La0/v;->a:I

    new-instance v2, La0/i0;

    const/4 v5, 0x6

    invoke-direct {v2, v5}, La0/i0;-><init>(I)V

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v12, 0x0

    move v6, v12

    :goto_1
    if-ge v6, v5, :cond_1

    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lf1/l;

    iget-wide v8, v8, Lf1/l;->a:J

    invoke-virtual {v2, v6, v8, v9}, La0/i0;->e(IJ)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_1
    new-instance v10, Lf1/u0;

    invoke-direct {v10, v2, v12}, Lf1/u0;-><init>(Ljava/lang/Object;I)V

    const-wide v13, 0x7fffffff7fffffffL

    and-long v5, p3, v13

    const-wide v15, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v2, v5, v15

    const/16 v17, 0x0

    if-nez v2, :cond_2

    move-object/from16 v9, v17

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lf1/w0;->g()Lf1/u;

    move-result-object v2

    move-object v9, v2

    :goto_2
    new-instance v20, Lf1/r0;

    move-wide/from16 v5, p3

    move/from16 v8, p5

    move-object/from16 v2, v20

    invoke-direct/range {v2 .. v10}, Lf1/r0;-><init>(JJLy2/y;ZLf1/u;Lf1/u0;)V

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v4, v12

    :goto_3
    iget-object v6, v2, Lf1/r0;->h:Ljava/util/ArrayList;

    if-ge v4, v3, :cond_17

    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lf1/l;

    invoke-virtual {v7}, Lf1/l;->d()Ly2/y;

    move-result-object v8

    if-nez v8, :cond_3

    :goto_4
    move/from16 p3, v3

    move/from16 p4, v4

    move-object/from16 v30, v11

    move/from16 p2, v12

    move-wide/from16 v26, v13

    move-wide/from16 v28, v15

    move-object v15, v2

    goto/16 :goto_14

    :cond_3
    iget-object v9, v7, Lf1/l;->c:Le1/i;

    invoke-virtual {v9}, Le1/i;->invoke()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll3/r0;

    if-nez v9, :cond_4

    goto :goto_4

    :cond_4
    move-wide/from16 v26, v13

    const-wide/16 v13, 0x0

    iget-object v10, v2, Lf1/r0;->c:Ly2/y;

    invoke-interface {v10, v8, v13, v14}, Ly2/y;->k(Ly2/y;J)J

    move-result-wide v13

    move-object v8, v6

    iget-wide v5, v2, Lf1/r0;->a:J

    invoke-static {v5, v6, v13, v14}, Lh2/b;->g(JJ)J

    move-result-wide v5

    move v10, v12

    move-wide/from16 p2, v13

    iget-wide v12, v2, Lf1/r0;->b:J

    and-long v18, v12, v26

    cmp-long v14, v18, v15

    if-nez v14, :cond_5

    move/from16 p2, v10

    move-object v14, v11

    move-wide v10, v15

    goto :goto_5

    :cond_5
    move-object v14, v11

    move-wide/from16 v31, p2

    move/from16 p2, v10

    move-wide/from16 v10, v31

    invoke-static {v12, v13, v10, v11}, Lh2/b;->g(JJ)J

    move-result-wide v10

    :goto_5
    iget-wide v12, v7, Lf1/l;->a:J

    move/from16 p3, v3

    move v7, v4

    iget-wide v3, v9, Ll3/r0;->c:J

    const/16 v18, 0x20

    move-wide/from16 v19, v3

    shr-long v3, v19, v18

    long-to-int v3, v3

    int-to-float v3, v3

    const-wide v21, 0xffffffffL

    move/from16 v23, v3

    and-long v3, v19, v21

    long-to-int v3, v3

    int-to-float v3, v3

    move/from16 v19, v3

    shr-long v3, v5, v18

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    const/16 v18, 0x0

    cmpg-float v4, v4, v18

    if-gez v4, :cond_6

    sget-object v3, Lf1/h;->w:Lf1/h;

    :goto_6
    move-object/from16 p4, v3

    goto :goto_7

    :cond_6
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    cmpl-float v3, v3, v23

    if-lez v3, :cond_7

    sget-object v3, Lf1/h;->y:Lf1/h;

    goto :goto_6

    :cond_7
    sget-object v3, Lf1/h;->x:Lf1/h;

    goto :goto_6

    :goto_7
    and-long v3, v5, v21

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    cmpg-float v4, v4, v18

    if-gez v4, :cond_8

    sget-object v3, Lf1/h;->w:Lf1/h;

    :goto_8
    move-object/from16 v19, v3

    goto :goto_9

    :cond_8
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    cmpl-float v3, v3, v19

    if-lez v3, :cond_9

    sget-object v3, Lf1/h;->y:Lf1/h;

    goto :goto_8

    :cond_9
    sget-object v3, Lf1/h;->x:Lf1/h;

    goto :goto_8

    :goto_9
    iget-boolean v3, v2, Lf1/r0;->d:Z

    iget-object v4, v2, Lf1/r0;->e:Lf1/u;

    if-eqz v3, :cond_b

    move-wide/from16 v28, v15

    if-eqz v4, :cond_a

    iget-object v15, v4, Lf1/u;->b:Lf1/t;

    move-object/from16 v23, v15

    :goto_a
    move-object/from16 v18, p4

    move-object/from16 v20, v2

    move-wide/from16 v21, v12

    goto :goto_b

    :cond_a
    move-object/from16 v23, v17

    goto :goto_a

    :goto_b
    invoke-static/range {v18 .. v23}, Lf1/y0;->o(Lf1/h;Lf1/h;Lf1/r0;JLf1/t;)Lf1/h;

    move-result-object v2

    move/from16 v16, v3

    move/from16 p4, v7

    move-object/from16 p5, v8

    move-object/from16 v30, v14

    move-object/from16 v3, v18

    move-object v12, v3

    move-object/from16 v8, v19

    move-object v13, v8

    move-object v7, v2

    move-object v14, v7

    :goto_c
    move-object/from16 v15, v20

    goto :goto_e

    :cond_b
    move-object/from16 v18, p4

    move-object/from16 v20, v2

    move-wide/from16 v21, v12

    move-wide/from16 v28, v15

    if-eqz v4, :cond_c

    iget-object v2, v4, Lf1/u;->a:Lf1/t;

    move-object/from16 v23, v2

    goto :goto_d

    :cond_c
    move-object/from16 v23, v17

    :goto_d
    invoke-static/range {v18 .. v23}, Lf1/y0;->o(Lf1/h;Lf1/h;Lf1/r0;JLf1/t;)Lf1/h;

    move-result-object v2

    move-object/from16 v12, v18

    move-object/from16 v13, v19

    move/from16 v16, v3

    move/from16 p4, v7

    move-object/from16 p5, v8

    move-object v7, v12

    move-object/from16 v30, v14

    move-object v3, v2

    move-object v8, v3

    move-object v14, v13

    goto :goto_c

    :goto_e
    invoke-static {v12, v13}, Lf1/y0;->y(Lf1/h;Lf1/h;)Lf1/h;

    move-result-object v12

    sget-object v13, Lf1/h;->x:Lf1/h;

    if-eq v12, v13, :cond_d

    if-eq v12, v2, :cond_16

    :cond_d
    iget-object v2, v9, Ll3/r0;->a:Ll3/q0;

    iget-object v2, v2, Ll3/q0;->a:Ll3/g;

    iget-object v2, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    iget-object v12, v15, Lf1/r0;->f:Lf1/u0;

    if-eqz v16, :cond_11

    invoke-static {v5, v6, v9}, Lf1/y0;->t(JLl3/r0;)I

    move-result v5

    if-eqz v4, :cond_10

    iget-object v4, v4, Lf1/u;->b:Lf1/t;

    if-eqz v4, :cond_10

    move v13, v5

    iget-wide v5, v4, Lf1/t;->c:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v12, v5, v6}, Lf1/u0;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v5

    if-gez v5, :cond_e

    move/from16 v2, p2

    goto :goto_f

    :cond_e
    if-lez v5, :cond_f

    goto :goto_f

    :cond_f
    iget v2, v4, Lf1/t;->b:I

    goto :goto_f

    :cond_10
    move v13, v5

    move v2, v13

    :goto_f
    move/from16 v23, v2

    move v5, v13

    goto :goto_12

    :cond_11
    invoke-static {v5, v6, v9}, Lf1/y0;->t(JLl3/r0;)I

    move-result v5

    if-eqz v4, :cond_14

    iget-object v4, v4, Lf1/u;->a:Lf1/t;

    if-eqz v4, :cond_14

    move v13, v5

    iget-wide v5, v4, Lf1/t;->c:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v12, v5, v6}, Lf1/u0;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v5

    if-gez v5, :cond_12

    move/from16 v2, p2

    goto :goto_10

    :cond_12
    if-lez v5, :cond_13

    goto :goto_10

    :cond_13
    iget v2, v4, Lf1/t;->b:I

    :goto_10
    move v5, v2

    goto :goto_11

    :cond_14
    move v13, v5

    move v5, v13

    :goto_11
    move/from16 v23, v13

    :goto_12
    and-long v12, v10, v26

    cmp-long v2, v12, v28

    if-nez v2, :cond_15

    const/16 v24, -0x1

    goto :goto_13

    :cond_15
    invoke-static {v10, v11, v9}, Lf1/y0;->t(JLl3/r0;)I

    move-result v2

    move/from16 v24, v2

    :goto_13
    iget v2, v15, Lf1/r0;->k:I

    add-int/lit8 v2, v2, 0x2

    iput v2, v15, Lf1/r0;->k:I

    new-instance v18, Lf1/r;

    move-object/from16 v25, v9

    move-wide/from16 v19, v21

    move/from16 v21, v2

    move/from16 v22, v5

    invoke-direct/range {v18 .. v25}, Lf1/r;-><init>(JIIIILl3/r0;)V

    move-object/from16 v2, v18

    move-wide/from16 v4, v19

    iget v6, v15, Lf1/r0;->i:I

    invoke-virtual {v15, v6, v3, v8}, Lf1/r0;->a(ILf1/h;Lf1/h;)I

    move-result v3

    iput v3, v15, Lf1/r0;->i:I

    iget v3, v15, Lf1/r0;->j:I

    invoke-virtual {v15, v3, v7, v14}, Lf1/r0;->a(ILf1/h;Lf1/h;)I

    move-result v3

    iput v3, v15, Lf1/r0;->j:I

    iget-object v3, v15, Lf1/r0;->g:La0/i0;

    invoke-virtual/range {p5 .. p5}, Ljava/util/ArrayList;->size()I

    move-result v6

    invoke-virtual {v3, v6, v4, v5}, La0/i0;->e(IJ)V

    move-object/from16 v8, p5

    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_16
    :goto_14
    add-int/lit8 v4, p4, 0x1

    move/from16 v12, p2

    move/from16 v3, p3

    move-object v2, v15

    move-wide/from16 v13, v26

    move-wide/from16 v15, v28

    move-object/from16 v11, v30

    goto/16 :goto_3

    :cond_17
    move-object v15, v2

    move-object v8, v6

    move/from16 p2, v12

    iget v2, v15, Lf1/r0;->k:I

    const/4 v3, 0x1

    add-int/2addr v2, v3

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-eqz v4, :cond_1d

    if-eq v4, v3, :cond_1a

    new-instance v18, Lf1/k;

    iget v4, v15, Lf1/r0;->i:I

    const/4 v5, -0x1

    if-ne v4, v5, :cond_18

    move/from16 v21, v2

    goto :goto_15

    :cond_18
    move/from16 v21, v4

    :goto_15
    iget v4, v15, Lf1/r0;->j:I

    if-ne v4, v5, :cond_19

    move/from16 v22, v2

    goto :goto_16

    :cond_19
    move/from16 v22, v4

    :goto_16
    iget-boolean v2, v15, Lf1/r0;->d:Z

    iget-object v4, v15, Lf1/r0;->e:Lf1/u;

    iget-object v5, v15, Lf1/r0;->g:La0/i0;

    move/from16 v23, v2

    move-object/from16 v24, v4

    move-object/from16 v19, v5

    move-object/from16 v20, v8

    invoke-direct/range {v18 .. v24}, Lf1/k;-><init>(La0/i0;Ljava/util/List;IIZLf1/u;)V

    move-object/from16 v6, v18

    goto :goto_19

    :cond_1a
    const/4 v5, -0x1

    invoke-static {v8}, Lm83/s;->p1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    move-object v11, v4

    check-cast v11, Lf1/r;

    iget v4, v15, Lf1/r0;->i:I

    if-ne v4, v5, :cond_1b

    move v8, v2

    goto :goto_17

    :cond_1b
    move v8, v4

    :goto_17
    iget v4, v15, Lf1/r0;->j:I

    if-ne v4, v5, :cond_1c

    move v9, v2

    goto :goto_18

    :cond_1c
    move v9, v4

    :goto_18
    new-instance v6, Lf1/e1;

    iget-boolean v7, v15, Lf1/r0;->d:Z

    iget-object v10, v15, Lf1/r0;->e:Lf1/u;

    invoke-direct/range {v6 .. v11}, Lf1/e1;-><init>(ZIILf1/u;Lf1/r;)V

    goto :goto_19

    :cond_1d
    move-object/from16 v6, v17

    :goto_19
    if-nez v6, :cond_1e

    goto :goto_1a

    :cond_1e
    iget-object v2, v0, Lf1/w0;->t:Lf1/q0;

    invoke-interface {v6, v2}, Lf1/q0;->f(Lf1/q0;)Z

    move-result v2

    if-nez v2, :cond_1f

    :goto_1a
    return p2

    :cond_1f
    move-object/from16 v2, p6

    invoke-virtual {v2, v6}, Lf1/v;->a(Lf1/q0;)Lf1/u;

    move-result-object v2

    invoke-virtual {v0}, Lf1/w0;->g()Lf1/u;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_22

    invoke-virtual {v0}, Lf1/w0;->h()Z

    move-result v4

    if-eqz v4, :cond_21

    iget-object v4, v1, Lf1/b1;->b:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    move/from16 v7, p2

    :goto_1b
    if-ge v7, v5, :cond_21

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lf1/l;

    invoke-virtual {v8}, Lf1/l;->e()Ll3/g;

    move-result-object v8

    iget-object v8, v8, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    if-lez v8, :cond_20

    iget-object v4, v0, Lf1/w0;->e:Lq2/a;

    if-eqz v4, :cond_21

    const/16 v5, 0x9

    invoke-interface {v4, v5}, Lq2/a;->a(I)V

    goto :goto_1c

    :cond_20
    add-int/lit8 v7, v7, 0x1

    goto :goto_1b

    :cond_21
    :goto_1c
    invoke-interface {v6, v2}, Lf1/q0;->h(Lf1/u;)La0/k0;

    move-result-object v4

    iget-object v1, v1, Lf1/b1;->k:Lp1/k1;

    invoke-virtual {v1, v4}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v1, v0, Lf1/w0;->d:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move/from16 v10, p2

    iput-boolean v10, v0, Lf1/w0;->u:Z

    :cond_22
    iput-object v6, v0, Lf1/w0;->t:Lf1/q0;

    return v3
.end method

.method public final p()V
    .locals 3

    iget-object v0, p0, Lf1/w0;->i:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lf1/w0;->x:Z

    iget-object v1, p0, Lf1/w0;->g:Lro/i;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lf1/w0;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lf1/w0;->j:Lp1/f0;

    invoke-virtual {v0}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh2/c;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lro/i;->D()V

    return-void

    :cond_2
    iget-object v0, v1, Lro/i;->x:Ljava/lang/Object;

    check-cast v0, La1/k;

    if-eqz v0, :cond_4

    iget-object v1, v0, La1/k;->U:Lbc3/c2;

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    iput-object v2, v0, La1/k;->U:Lbc3/c2;

    :cond_4
    :goto_0
    return-void
.end method
