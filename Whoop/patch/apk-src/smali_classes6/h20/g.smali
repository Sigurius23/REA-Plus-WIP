.class public final Lh20/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lbc3/c0;

.field public final b:Lh20/y;

.field public final c:Lzx/o;

.field public final d:Lv00/c0;

.field public final e:Lc93/a;

.field public final f:Lkotlin/jvm/functions/Function1;

.field public final g:Lwz/l1;

.field public final h:Z

.field public final i:Lk20/a;

.field public final j:Landroidx/lifecycle/k1;

.field public final k:Lg40/z;

.field public final l:Z

.field public final m:Lb5/d;

.field public final n:Lb30/m;

.field public final o:Lec3/w1;

.field public final p:Lec3/j1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lbc3/c0;Lh20/y;Lzx/o;Lv00/c0;Lc93/a;Lkotlin/jvm/functions/Function1;Lwz/l1;ZLk20/a;Landroidx/lifecycle/k1;Lg40/z;ZLb5/d;Lb30/m;)V
    .locals 1

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardAccountRangeRepositoryFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodMetadata"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventReporter"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedStateHandle"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh20/g;->a:Lbc3/c0;

    iput-object p2, p0, Lh20/g;->b:Lh20/y;

    iput-object p3, p0, Lh20/g;->c:Lzx/o;

    iput-object p4, p0, Lh20/g;->d:Lv00/c0;

    iput-object p5, p0, Lh20/g;->e:Lc93/a;

    iput-object p6, p0, Lh20/g;->f:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lh20/g;->g:Lwz/l1;

    iput-boolean p8, p0, Lh20/g;->h:Z

    iput-object p9, p0, Lh20/g;->i:Lk20/a;

    iput-object p10, p0, Lh20/g;->j:Landroidx/lifecycle/k1;

    iput-object p11, p0, Lh20/g;->k:Lg40/z;

    iput-boolean p12, p0, Lh20/g;->l:Z

    iput-object p13, p0, Lh20/g;->m:Lb5/d;

    iput-object p14, p0, Lh20/g;->n:Lb30/m;

    const/4 p3, 0x7

    const/4 p4, 0x0

    const/4 p5, 0x0

    invoke-static {p4, p4, p5, p3}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p3

    iput-object p3, p0, Lh20/g;->o:Lec3/w1;

    iget-object p2, p2, Lh20/y;->b:Lec3/h2;

    if-eqz p14, :cond_0

    iget-object p4, p14, Lb30/m;->F:Ljava/lang/Object;

    check-cast p4, Lec3/r1;

    if-nez p4, :cond_1

    :cond_0
    invoke-static {p5}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object p4

    :cond_1
    new-instance p6, Lb30/l;

    const/4 p7, 0x1

    invoke-direct {p6, p0, p5, p7}, Lb30/l;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {p3, p2, p4, p6}, Lec3/v;->p(Lec3/l;Lec3/l;Lec3/l;Lc93/n;)Lec3/j1;

    move-result-object p2

    iput-object p2, p0, Lh20/g;->p:Lec3/j1;

    new-instance p2, La20/b;

    const/16 p3, 0x19

    invoke-direct {p2, p0, p5, p3}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 p3, 0x3

    invoke-static {p1, p5, p5, p2, p3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ls20/a;
    .locals 12

    const-string v0, "paymentMethodCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metadata"

    iget-object v1, p0, Lh20/g;->d:Lv00/c0;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v1, Lv00/c0;->I:Ljava/lang/String;

    invoke-virtual {v1}, Lv00/c0;->b()Lu30/a;

    move-result-object v6

    iget-object v7, v1, Lv00/c0;->K:Lh20/i1;

    iget-object v8, v1, Lv00/c0;->L:Li20/b;

    iget-object v11, v1, Lv00/c0;->x:Lh20/l1;

    iget-object v4, v1, Lv00/c0;->H:Lw30/c;

    invoke-virtual {v1, p1}, Lv00/c0;->x(Ljava/lang/String;)Z

    move-result v10

    iget-object v9, v1, Lv00/c0;->S:Lv00/i0;

    new-instance v2, Ls20/a;

    move-object v3, p1

    invoke-direct/range {v2 .. v11}, Ls20/a;-><init>(Ljava/lang/String;Lw30/c;Ljava/lang/String;Lu30/a;Lh20/i1;Li20/b;Lv00/i0;ZLh20/l1;)V

    return-object v2
.end method

.method public final b(Ljava/lang/String;)Ljava/util/List;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "code"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lh20/g;->e:Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh20/d0;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v2}, Lh20/d0;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    new-instance v4, Lg40/f4;

    const/4 v10, 0x0

    const/4 v11, 0x3

    const/4 v5, 0x1

    iget-object v6, v0, Lh20/g;->b:Lh20/y;

    const-class v7, Lh20/y;

    const-string v8, "onStateUpdated"

    const-string v9, "onStateUpdated(Lcom/stripe/android/link/ui/inline/InlineSignupViewState;)V"

    invoke-direct/range {v4 .. v11}, Lg40/f4;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    if-eqz v2, :cond_1

    invoke-interface {v2}, Lh20/d0;->e()Ly00/d5;

    move-result-object v5

    move-object v9, v5

    goto :goto_1

    :cond_1
    move-object v9, v3

    :goto_1
    if-eqz v2, :cond_2

    invoke-interface {v2}, Lh20/d0;->c()Ly00/u5;

    move-result-object v5

    move-object v10, v5

    goto :goto_2

    :cond_2
    move-object v10, v3

    :goto_2
    if-eqz v2, :cond_3

    invoke-interface {v2}, Lh20/d0;->a()Ly00/j5;

    move-result-object v5

    move-object v11, v5

    goto :goto_3

    :cond_3
    move-object v11, v3

    :goto_3
    if-eqz v2, :cond_4

    invoke-interface {v2}, Lh20/d0;->b()Lq20/y;

    move-result-object v5

    goto :goto_4

    :cond_4
    move-object v5, v3

    :goto_4
    instance-of v6, v5, Lq20/n;

    if-eqz v6, :cond_5

    check-cast v5, Lq20/n;

    iget-object v5, v5, Lq20/n;->G:Lj00/i0;

    move-object v12, v5

    goto :goto_5

    :cond_5
    move-object v12, v3

    :goto_5
    if-eqz v2, :cond_6

    invoke-interface {v2}, Lh20/d0;->b()Lq20/y;

    move-result-object v2

    goto :goto_6

    :cond_6
    move-object v2, v3

    :goto_6
    instance-of v5, v2, Lq20/n;

    if-eqz v5, :cond_8

    check-cast v2, Lq20/n;

    iget-object v2, v2, Lq20/n;->G:Lj00/i0;

    if-eqz v2, :cond_7

    const/4 v2, 0x1

    goto :goto_7

    :cond_7
    const/4 v2, 0x0

    :goto_7
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    :cond_8
    move-object/from16 v16, v3

    move-object v8, v4

    new-instance v4, Lv00/l0;

    iget-object v5, v0, Lh20/g;->c:Lzx/o;

    iget-object v6, v0, Lh20/g;->g:Lwz/l1;

    iget-object v7, v0, Lh20/g;->b:Lh20/y;

    iget-boolean v13, v0, Lh20/g;->h:Z

    iget-object v14, v0, Lh20/g;->k:Lg40/z;

    iget-boolean v15, v0, Lh20/g;->l:Z

    iget-object v2, v0, Lh20/g;->m:Lb5/d;

    iget-object v3, v0, Lh20/g;->n:Lb30/m;

    move-object/from16 v17, v2

    move-object/from16 v18, v3

    invoke-direct/range {v4 .. v18}, Lv00/l0;-><init>(Lzx/o;Lwz/l1;Lh20/y;Lkotlin/jvm/functions/Function1;Ly00/d5;Ly00/u5;Ly00/j5;Lj00/i0;ZLg40/z;ZLjava/lang/Boolean;Lb5/d;Lb30/m;)V

    iget-object v2, v0, Lh20/g;->d:Lv00/c0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "code"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Lv00/c0;->C(Ljava/lang/String;)Z

    move-result v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v3, :cond_9

    invoke-virtual {v2, v1}, Lv00/c0;->s(Ljava/lang/String;)Lw00/w;

    move-result-object v1

    if-eqz v1, :cond_e

    invoke-virtual {v4, v2, v5}, Lv00/l0;->a(Lv00/c0;Z)Lv00/m0;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lv00/p0;->h(Lv00/c0;Lv00/m0;)Ljava/util/List;

    move-result-object v6

    goto :goto_9

    :cond_9
    invoke-virtual {v2, v1}, Lv00/c0;->y(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-virtual {v2, v1}, Lv00/c0;->k(Ljava/lang/String;)Lw00/t;

    move-result-object v1

    if-eqz v1, :cond_e

    invoke-virtual {v4, v2, v5}, Lv00/l0;->a(Lv00/c0;Z)Lv00/m0;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lv00/p0;->h(Lv00/c0;Lv00/m0;)Ljava/util/List;

    move-result-object v6

    goto :goto_9

    :cond_a
    invoke-virtual {v2}, Lv00/c0;->N()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Lv00/b0;

    invoke-interface {v7}, Lv00/b0;->getType()Ly00/f4;

    move-result-object v7

    iget-object v7, v7, Ly00/f4;->w:Ljava/lang/String;

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_b

    goto :goto_8

    :cond_c
    move-object v5, v6

    :goto_8
    check-cast v5, Lv00/b0;

    if-nez v5, :cond_d

    goto :goto_9

    :cond_d
    invoke-interface {v5}, Lv00/b0;->b()Lv00/q0;

    move-result-object v1

    iget-object v3, v2, Lv00/c0;->M:Ljava/util/List;

    invoke-interface {v5, v2}, Lv00/b0;->c(Lv00/c0;)Z

    move-result v6

    invoke-virtual {v4, v2, v6}, Lv00/l0;->a(Lv00/c0;Z)Lv00/m0;

    move-result-object v4

    invoke-interface {v1, v5, v2, v3, v4}, Lv00/q0;->a(Lv00/b0;Lv00/c0;Ljava/util/List;Lv00/m0;)Ljava/util/List;

    move-result-object v6

    :cond_e
    :goto_9
    if-nez v6, :cond_f

    sget-object v1, Lm83/y;->w:Lm83/y;

    return-object v1

    :cond_f
    return-object v6
.end method

.method public final c(Ljava/lang/String;)Lh20/v;
    .locals 3

    const-string v0, "paymentMethodCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lh20/g;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg40/i1;

    invoke-interface {v2}, Lg40/i1;->d()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_2

    :cond_2
    :goto_0
    sget-object v1, Ly00/f4;->G:Lt9/c0;

    const-string v1, "us_bank_account"

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    const-string v1, "link"

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg40/i1;

    invoke-interface {v0}, Lg40/i1;->c()Lzy/c;

    move-result-object v0

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_6

    sget-object p1, Lh20/t;->a:Lh20/t;

    return-object p1

    :cond_6
    new-instance p1, Lh20/u;

    invoke-direct {p1, v0}, Lh20/u;-><init>(Lzy/c;)V

    return-object p1

    :cond_7
    :goto_2
    sget-object p1, Lh20/t;->b:Lh20/t;

    return-object p1
.end method

.method public final d(Lo20/b;Ljava/lang/String;)V
    .locals 7

    const-string v0, "selectedPaymentMethodCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lg20/p;

    const/16 v6, 0xe

    const/4 v5, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    iget-object p2, v2, Lh20/g;->a:Lbc3/c0;

    invoke-static {p2, v5, v5, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
