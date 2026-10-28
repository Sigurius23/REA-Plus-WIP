.class public final Lq00/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final A:Z

.field public final a:Ljava/util/List;

.field public final b:Ljava/lang/String;

.field public final c:Z

.field public final d:Lux/a;

.field public final e:Lux/b;

.field public final f:Ljava/lang/String;

.field public final g:Z

.field public final h:Z

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:Lzy/c;

.field public final l:Lzy/c;

.field public final m:Ljava/util/List;

.field public final n:Z

.field public final o:Ljava/lang/Boolean;

.field public final p:Ljava/lang/String;

.field public final q:Lzy/c;

.field public final r:Ll40/a;

.field public final s:Ll40/a;

.field public final t:Lq00/c;

.field public final u:Lzy/c;

.field public final v:Lzy/c;

.field public final w:Z

.field public final x:Z

.field public final y:Z

.field public final z:Lh20/l1;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;ZLux/a;Lux/b;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Lzy/c;Lzy/c;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Lzy/c;Ll40/a;Ll40/a;Lq00/c;Lzy/c;Lzy/c;ZZZLh20/l1;Z)V
    .locals 4

    move-object/from16 v0, p13

    move-object/from16 v1, p20

    move-object/from16 v2, p26

    const-string v3, "email"

    invoke-static {p2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "cardBrandFilter"

    invoke-static {p4, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "cardFundingFilter"

    invoke-static {p5, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "merchantName"

    invoke-static {p9, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "addPaymentMethodOptions"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "addBankAccountState"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "billingDetailsCollectionConfiguration"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq00/i0;->a:Ljava/util/List;

    iput-object p2, p0, Lq00/i0;->b:Ljava/lang/String;

    iput-boolean p3, p0, Lq00/i0;->c:Z

    iput-object p4, p0, Lq00/i0;->d:Lux/a;

    iput-object p5, p0, Lq00/i0;->e:Lux/b;

    iput-object p6, p0, Lq00/i0;->f:Ljava/lang/String;

    iput-boolean p7, p0, Lq00/i0;->g:Z

    iput-boolean p8, p0, Lq00/i0;->h:Z

    iput-object p9, p0, Lq00/i0;->i:Ljava/lang/String;

    iput-object p10, p0, Lq00/i0;->j:Ljava/lang/String;

    iput-object p11, p0, Lq00/i0;->k:Lzy/c;

    move-object/from16 p1, p12

    iput-object p1, p0, Lq00/i0;->l:Lzy/c;

    iput-object v0, p0, Lq00/i0;->m:Ljava/util/List;

    move/from16 p1, p14

    iput-boolean p1, p0, Lq00/i0;->n:Z

    move-object/from16 p1, p15

    iput-object p1, p0, Lq00/i0;->o:Ljava/lang/Boolean;

    move-object/from16 p1, p16

    iput-object p1, p0, Lq00/i0;->p:Ljava/lang/String;

    move-object/from16 p1, p17

    iput-object p1, p0, Lq00/i0;->q:Lzy/c;

    move-object/from16 p1, p18

    iput-object p1, p0, Lq00/i0;->r:Ll40/a;

    move-object/from16 p1, p19

    iput-object p1, p0, Lq00/i0;->s:Ll40/a;

    iput-object v1, p0, Lq00/i0;->t:Lq00/c;

    move-object/from16 p1, p21

    iput-object p1, p0, Lq00/i0;->u:Lzy/c;

    move-object/from16 p1, p22

    iput-object p1, p0, Lq00/i0;->v:Lzy/c;

    move/from16 p1, p23

    iput-boolean p1, p0, Lq00/i0;->w:Z

    move/from16 p1, p24

    iput-boolean p1, p0, Lq00/i0;->x:Z

    move/from16 p1, p25

    iput-boolean p1, p0, Lq00/i0;->y:Z

    iput-object v2, p0, Lq00/i0;->z:Lh20/l1;

    move/from16 p1, p27

    iput-boolean p1, p0, Lq00/i0;->A:Z

    return-void
.end method

.method public static a(Lq00/i0;Ljava/util/ArrayList;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Lzy/c;Ll40/a;Ll40/a;Lq00/c;Lzy/c;I)Lq00/i0;
    .locals 30

    move-object/from16 v0, p0

    and-int/lit8 v1, p11, 0x1

    if-eqz v1, :cond_0

    iget-object v1, v0, Lq00/i0;->a:Ljava/util/List;

    move-object v3, v1

    goto :goto_0

    :cond_0
    move-object/from16 v3, p1

    :goto_0
    iget-object v4, v0, Lq00/i0;->b:Ljava/lang/String;

    iget-boolean v5, v0, Lq00/i0;->c:Z

    iget-object v6, v0, Lq00/i0;->d:Lux/a;

    iget-object v7, v0, Lq00/i0;->e:Lux/b;

    and-int/lit8 v1, p11, 0x20

    if-eqz v1, :cond_1

    iget-object v1, v0, Lq00/i0;->f:Ljava/lang/String;

    move-object v8, v1

    goto :goto_1

    :cond_1
    move-object/from16 v8, p2

    :goto_1
    and-int/lit8 v1, p11, 0x40

    if-eqz v1, :cond_2

    iget-boolean v1, v0, Lq00/i0;->g:Z

    move v9, v1

    goto :goto_2

    :cond_2
    move/from16 v9, p3

    :goto_2
    iget-boolean v10, v0, Lq00/i0;->h:Z

    iget-object v11, v0, Lq00/i0;->i:Ljava/lang/String;

    iget-object v12, v0, Lq00/i0;->j:Ljava/lang/String;

    iget-object v13, v0, Lq00/i0;->k:Lzy/c;

    iget-object v14, v0, Lq00/i0;->l:Lzy/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v15, v0, Lq00/i0;->m:Ljava/util/List;

    iget-boolean v1, v0, Lq00/i0;->n:Z

    const v2, 0x8000

    and-int v2, p11, v2

    if-eqz v2, :cond_3

    iget-object v2, v0, Lq00/i0;->o:Ljava/lang/Boolean;

    move-object/from16 v17, v2

    goto :goto_3

    :cond_3
    move-object/from16 v17, p4

    :goto_3
    const/high16 v2, 0x10000

    and-int v2, p11, v2

    if-eqz v2, :cond_4

    iget-object v2, v0, Lq00/i0;->p:Ljava/lang/String;

    move-object/from16 v18, v2

    goto :goto_4

    :cond_4
    move-object/from16 v18, p5

    :goto_4
    const/high16 v2, 0x20000

    and-int v2, p11, v2

    if-eqz v2, :cond_5

    iget-object v2, v0, Lq00/i0;->q:Lzy/c;

    move-object/from16 v19, v2

    goto :goto_5

    :cond_5
    move-object/from16 v19, p6

    :goto_5
    const/high16 v2, 0x40000

    and-int v2, p11, v2

    if-eqz v2, :cond_6

    iget-object v2, v0, Lq00/i0;->r:Ll40/a;

    goto :goto_6

    :cond_6
    move-object/from16 v2, p7

    :goto_6
    const/high16 v16, 0x80000

    and-int v16, p11, v16

    if-eqz v16, :cond_7

    move/from16 v16, v1

    iget-object v1, v0, Lq00/i0;->s:Ll40/a;

    goto :goto_7

    :cond_7
    move/from16 v16, v1

    move-object/from16 v1, p8

    :goto_7
    const/high16 v20, 0x100000

    and-int v20, p11, v20

    move-object/from16 p1, v3

    if-eqz v20, :cond_8

    iget-object v3, v0, Lq00/i0;->t:Lq00/c;

    goto :goto_8

    :cond_8
    move-object/from16 v3, p9

    :goto_8
    const/high16 v20, 0x200000

    and-int v20, p11, v20

    if-eqz v20, :cond_9

    move/from16 v20, v5

    iget-object v5, v0, Lq00/i0;->u:Lzy/c;

    move-object/from16 v23, v5

    goto :goto_9

    :cond_9
    move/from16 v20, v5

    move-object/from16 v23, p10

    :goto_9
    iget-object v5, v0, Lq00/i0;->v:Lzy/c;

    const/high16 v21, 0x800000

    and-int v21, p11, v21

    move-object/from16 v24, v5

    if-eqz v21, :cond_a

    iget-boolean v5, v0, Lq00/i0;->w:Z

    :goto_a
    move/from16 v25, v5

    goto :goto_b

    :cond_a
    const/4 v5, 0x0

    goto :goto_a

    :goto_b
    const/high16 v5, 0x1000000

    and-int v5, p11, v5

    const/16 v21, 0x1

    if-eqz v5, :cond_b

    iget-boolean v5, v0, Lq00/i0;->x:Z

    move/from16 v26, v5

    goto :goto_c

    :cond_b
    move/from16 v26, v21

    :goto_c
    iget-boolean v5, v0, Lq00/i0;->y:Z

    move/from16 v27, v5

    iget-object v5, v0, Lq00/i0;->z:Lh20/l1;

    const/high16 v22, 0x8000000

    and-int v22, p11, v22

    move-object/from16 p2, v8

    if-eqz v22, :cond_c

    iget-boolean v8, v0, Lq00/i0;->A:Z

    move/from16 v29, v8

    goto :goto_d

    :cond_c
    move/from16 v29, v21

    :goto_d
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "email"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardBrandFilter"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardFundingFilter"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "merchantName"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addPaymentMethodOptions"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expiryDateInput"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cvcInput"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addBankAccountState"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "billingDetailsCollectionConfiguration"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v28, v5

    move/from16 v5, v20

    move-object/from16 v20, v2

    new-instance v2, Lq00/i0;

    move-object/from16 v8, p2

    move-object/from16 v21, v1

    move-object/from16 v22, v3

    move-object/from16 v3, p1

    invoke-direct/range {v2 .. v29}, Lq00/i0;-><init>(Ljava/util/List;Ljava/lang/String;ZLux/a;Lux/b;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Lzy/c;Lzy/c;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Lzy/c;Ll40/a;Ll40/a;Lq00/c;Lzy/c;Lzy/c;ZZZLh20/l1;Z)V

    return-object v2
.end method


# virtual methods
.method public final b()Lzy/b;
    .locals 5

    invoke-virtual {p0}, Lq00/i0;->d()Ly00/c0;

    move-result-object v0

    if-eqz v0, :cond_5

    instance-of v1, v0, Ly00/x;

    sget-object v2, Lm83/y;->w:Lm83/y;

    iget-object v3, p0, Lq00/i0;->i:Ljava/lang/String;

    iget-boolean v4, p0, Lq00/i0;->y:Z

    if-eqz v1, :cond_1

    if-eqz v4, :cond_0

    iget-object v0, p0, Lq00/i0;->j:Ljava/lang/String;

    if-eqz v0, :cond_0

    const v1, 0x7f14110f

    filled-new-array {v3, v0, v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, v0, v2}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const v1, 0x7f14110e

    invoke-static {v1, v0, v2}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v0

    return-object v0

    :cond_1
    instance-of v1, v0, Ly00/a0;

    if-nez v1, :cond_3

    instance-of v0, v0, Ly00/b0;

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_3
    :goto_0
    if-eqz v4, :cond_4

    const v0, 0x7f141075

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1, v2}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v0

    return-object v0

    :cond_4
    iget-boolean v0, p0, Lq00/i0;->h:Z

    if-eqz v0, :cond_5

    const v0, 0x7f141074

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1, v2}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v0

    return-object v0

    :cond_5
    const/4 v0, 0x0

    return-object v0
.end method

.method public final c()Lh00/o0;
    .locals 6

    iget-object v0, p0, Lq00/i0;->s:Ll40/a;

    iget-boolean v0, v0, Ll40/a;->b:Z

    invoke-virtual {p0}, Lq00/i0;->d()Ly00/c0;

    move-result-object v1

    instance-of v2, v1, Ly00/a0;

    if-eqz v2, :cond_0

    check-cast v1, Ly00/a0;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ly00/a0;->k()Z

    move-result v4

    if-ne v4, v3, :cond_1

    move v4, v3

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    if-eqz v1, :cond_2

    iget-object v1, v1, Ly00/a0;->M:Ly00/v0;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ly00/v0;->a()Z

    move-result v1

    goto :goto_2

    :cond_2
    move v1, v2

    :goto_2
    iget-object v5, p0, Lq00/i0;->r:Ll40/a;

    iget-boolean v5, v5, Ll40/a;->b:Z

    if-eqz v5, :cond_4

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    move v5, v2

    goto :goto_4

    :cond_4
    :goto_3
    move v5, v3

    :goto_4
    if-eqz v4, :cond_5

    if-nez v5, :cond_7

    :cond_5
    if-eqz v1, :cond_6

    if-eqz v0, :cond_7

    :cond_6
    iget-object v0, p0, Lq00/i0;->p:Ljava/lang/String;

    if-nez v0, :cond_7

    invoke-virtual {p0}, Lq00/i0;->d()Ly00/c0;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {p0, v0}, Lq00/i0;->e(Ly00/c0;)Z

    move-result v0

    if-ne v0, v3, :cond_7

    iget-object v0, p0, Lq00/i0;->t:Lq00/c;

    instance-of v0, v0, Lq00/b;

    if-eqz v0, :cond_8

    :cond_7
    move v2, v3

    :cond_8
    iget-boolean v0, p0, Lq00/i0;->g:Z

    if-eqz v0, :cond_9

    sget-object v0, Lh00/o0;->z:Lh00/o0;

    return-object v0

    :cond_9
    if-eqz v2, :cond_a

    sget-object v0, Lh00/o0;->y:Lh00/o0;

    return-object v0

    :cond_a
    sget-object v0, Lh00/o0;->x:Lh00/o0;

    return-object v0
.end method

.method public final d()Ly00/c0;
    .locals 4

    iget-object v0, p0, Lq00/i0;->a:Ljava/util/List;

    iget-object v1, p0, Lq00/i0;->f:Ljava/lang/String;

    if-eqz v1, :cond_2

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ly00/c0;

    invoke-virtual {v3}, Ly00/c0;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    check-cast v2, Ly00/c0;

    return-object v2

    :cond_2
    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly00/c0;

    return-object v0
.end method

.method public final e(Ly00/c0;)Z
    .locals 5

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "billingDetailsCollectionConfiguration"

    iget-object v1, p0, Lq00/i0;->z:Lh20/l1;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lh20/l1;->b()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    move v0, v2

    goto :goto_1

    :cond_0
    instance-of v1, p1, Ly00/a0;

    if-eqz v1, :cond_2

    move-object v1, p1

    check-cast v1, Ly00/a0;

    iget-object v1, v1, Ly00/a0;->G:Ly00/y;

    if-eqz v1, :cond_1

    iget-object v1, v1, Ly00/y;->G:Lcom/stripe/android/core/model/CountryCode;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object v1

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v4}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "toUpperCase(...)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v3

    goto :goto_1

    :cond_2
    instance-of v1, p1, Ly00/x;

    if-eqz v1, :cond_3

    sget-object v1, Lcom/stripe/android/core/model/CountryCode;->Companion:Lcom/stripe/android/core/model/b;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/core/model/CountryCode;->access$getUS$cp()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_1

    :cond_3
    instance-of v0, p1, Ly00/b0;

    if-eqz v0, :cond_a

    goto :goto_0

    :goto_1
    if-nez v0, :cond_4

    goto :goto_5

    :cond_4
    instance-of v0, p1, Ly00/a0;

    if-nez v0, :cond_5

    goto :goto_4

    :cond_5
    move-object v1, p1

    check-cast v1, Ly00/a0;

    iget-object v1, v1, Ly00/a0;->K:Ly00/i;

    iget-object v4, p0, Lq00/i0;->d:Lux/a;

    invoke-interface {v4, v1}, Lux/a;->o(Ly00/i;)Z

    move-result v1

    if-eqz v1, :cond_9

    instance-of v1, p1, Ly00/x;

    if-eqz v1, :cond_6

    :goto_2
    move p1, v2

    goto :goto_3

    :cond_6
    if-eqz v0, :cond_7

    check-cast p1, Ly00/a0;

    iget-object p1, p1, Ly00/a0;->N:Ly00/z;

    iget-object p1, p1, Ly00/z;->x:Ly00/j;

    iget-object v0, p0, Lq00/i0;->e:Lux/b;

    invoke-interface {v0, p1}, Lux/b;->F(Ly00/j;)Z

    move-result p1

    goto :goto_3

    :cond_7
    instance-of p1, p1, Ly00/b0;

    if-eqz p1, :cond_8

    goto :goto_2

    :goto_3
    if-eqz p1, :cond_9

    :goto_4
    return v2

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_9
    :goto_5
    return v3

    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto/16 :goto_1

    :cond_0
    instance-of v0, p1, Lq00/i0;

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    check-cast p1, Lq00/i0;

    iget-object v0, p0, Lq00/i0;->a:Ljava/util/List;

    iget-object v1, p1, Lq00/i0;->a:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    iget-object v0, p0, Lq00/i0;->b:Ljava/lang/String;

    iget-object v1, p1, Lq00/i0;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    iget-boolean v0, p0, Lq00/i0;->c:Z

    iget-boolean v1, p1, Lq00/i0;->c:Z

    if-eq v0, v1, :cond_4

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Lq00/i0;->d:Lux/a;

    iget-object v1, p1, Lq00/i0;->d:Lux/a;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :cond_5
    iget-object v0, p0, Lq00/i0;->e:Lux/b;

    iget-object v1, p1, Lq00/i0;->e:Lux/b;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_0

    :cond_6
    iget-object v0, p0, Lq00/i0;->f:Ljava/lang/String;

    iget-object v1, p1, Lq00/i0;->f:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_0

    :cond_7
    iget-boolean v0, p0, Lq00/i0;->g:Z

    iget-boolean v1, p1, Lq00/i0;->g:Z

    if-eq v0, v1, :cond_8

    goto/16 :goto_0

    :cond_8
    iget-boolean v0, p0, Lq00/i0;->h:Z

    iget-boolean v1, p1, Lq00/i0;->h:Z

    if-eq v0, v1, :cond_9

    goto/16 :goto_0

    :cond_9
    iget-object v0, p0, Lq00/i0;->i:Ljava/lang/String;

    iget-object v1, p1, Lq00/i0;->i:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_0

    :cond_a
    iget-object v0, p0, Lq00/i0;->j:Ljava/lang/String;

    iget-object v1, p1, Lq00/i0;->j:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto/16 :goto_0

    :cond_b
    iget-object v0, p0, Lq00/i0;->k:Lzy/c;

    iget-object v1, p1, Lq00/i0;->k:Lzy/c;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_0

    :cond_c
    iget-object v0, p0, Lq00/i0;->l:Lzy/c;

    iget-object v1, p1, Lq00/i0;->l:Lzy/c;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto/16 :goto_0

    :cond_d
    iget-object v0, p0, Lq00/i0;->m:Ljava/util/List;

    iget-object v1, p1, Lq00/i0;->m:Ljava/util/List;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto/16 :goto_0

    :cond_e
    iget-boolean v0, p0, Lq00/i0;->n:Z

    iget-boolean v1, p1, Lq00/i0;->n:Z

    if-eq v0, v1, :cond_f

    goto/16 :goto_0

    :cond_f
    iget-object v0, p0, Lq00/i0;->o:Ljava/lang/Boolean;

    iget-object v1, p1, Lq00/i0;->o:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto/16 :goto_0

    :cond_10
    iget-object v0, p0, Lq00/i0;->p:Ljava/lang/String;

    iget-object v1, p1, Lq00/i0;->p:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto/16 :goto_0

    :cond_11
    iget-object v0, p0, Lq00/i0;->q:Lzy/c;

    iget-object v1, p1, Lq00/i0;->q:Lzy/c;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    goto :goto_0

    :cond_12
    iget-object v0, p0, Lq00/i0;->r:Ll40/a;

    iget-object v1, p1, Lq00/i0;->r:Ll40/a;

    invoke-virtual {v0, v1}, Ll40/a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto :goto_0

    :cond_13
    iget-object v0, p0, Lq00/i0;->s:Ll40/a;

    iget-object v1, p1, Lq00/i0;->s:Ll40/a;

    invoke-virtual {v0, v1}, Ll40/a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    goto :goto_0

    :cond_14
    iget-object v0, p0, Lq00/i0;->t:Lq00/c;

    iget-object v1, p1, Lq00/i0;->t:Lq00/c;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    goto :goto_0

    :cond_15
    iget-object v0, p0, Lq00/i0;->u:Lzy/c;

    iget-object v1, p1, Lq00/i0;->u:Lzy/c;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    goto :goto_0

    :cond_16
    iget-object v0, p0, Lq00/i0;->v:Lzy/c;

    iget-object v1, p1, Lq00/i0;->v:Lzy/c;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    goto :goto_0

    :cond_17
    iget-boolean v0, p0, Lq00/i0;->w:Z

    iget-boolean v1, p1, Lq00/i0;->w:Z

    if-eq v0, v1, :cond_18

    goto :goto_0

    :cond_18
    iget-boolean v0, p0, Lq00/i0;->x:Z

    iget-boolean v1, p1, Lq00/i0;->x:Z

    if-eq v0, v1, :cond_19

    goto :goto_0

    :cond_19
    iget-boolean v0, p0, Lq00/i0;->y:Z

    iget-boolean v1, p1, Lq00/i0;->y:Z

    if-eq v0, v1, :cond_1a

    goto :goto_0

    :cond_1a
    iget-object v0, p0, Lq00/i0;->z:Lh20/l1;

    iget-object v1, p1, Lq00/i0;->z:Lh20/l1;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    goto :goto_0

    :cond_1b
    iget-boolean v0, p0, Lq00/i0;->A:Z

    iget-boolean p1, p1, Lq00/i0;->A:Z

    if-eq v0, p1, :cond_1c

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_1c
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lq00/i0;->a:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lq00/i0;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lq00/i0;->c:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lq00/i0;->d:Lux/a;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lq00/i0;->e:Lux/b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    const/4 v2, 0x0

    iget-object v3, p0, Lq00/i0;->f:Ljava/lang/String;

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-boolean v3, p0, Lq00/i0;->g:Z

    invoke-static {v0, v1, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v3, p0, Lq00/i0;->h:Z

    invoke-static {v0, v1, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lq00/i0;->i:Ljava/lang/String;

    invoke-static {v0, v1, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lq00/i0;->j:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lq00/i0;->k:Lzy/c;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v1

    iget-object v0, p0, Lq00/i0;->l:Lzy/c;

    if-nez v0, :cond_2

    move v0, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v3, v0

    mul-int/2addr v3, v1

    invoke-static {v3, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lq00/i0;->m:Ljava/util/List;

    invoke-static {v0, v1, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-boolean v3, p0, Lq00/i0;->n:Z

    invoke-static {v0, v1, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lq00/i0;->o:Ljava/lang/Boolean;

    if-nez v3, :cond_3

    move v3, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lq00/i0;->p:Ljava/lang/String;

    if-nez v3, :cond_4

    move v3, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lq00/i0;->q:Lzy/c;

    if-nez v3, :cond_5

    move v3, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lq00/i0;->r:Ll40/a;

    invoke-virtual {v3}, Ll40/a;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v1

    iget-object v0, p0, Lq00/i0;->s:Ll40/a;

    invoke-virtual {v0}, Ll40/a;->hashCode()I

    move-result v0

    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lq00/i0;->t:Lq00/c;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v1

    iget-object v0, p0, Lq00/i0;->u:Lzy/c;

    if-nez v0, :cond_6

    move v0, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_6
    add-int/2addr v3, v0

    mul-int/2addr v3, v1

    iget-object v0, p0, Lq00/i0;->v:Lzy/c;

    if-nez v0, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v3, v2

    mul-int/2addr v3, v1

    iget-boolean v0, p0, Lq00/i0;->w:Z

    invoke-static {v3, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lq00/i0;->x:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lq00/i0;->y:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lq00/i0;->z:Lh20/l1;

    invoke-virtual {v2}, Lh20/l1;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lq00/i0;->A:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", email="

    const-string v1, ", allowLogOut="

    const-string v2, "WalletUiState(paymentDetailsList="

    iget-object v3, p0, Lq00/i0;->b:Ljava/lang/String;

    iget-object v4, p0, Lq00/i0;->a:Ljava/util/List;

    invoke-static {v2, v0, v3, v1, v4}, Lnh3/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lq00/i0;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", cardBrandFilter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lq00/i0;->d:Lux/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cardFundingFilter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lq00/i0;->e:Lux/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", selectedItemId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lq00/i0;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isProcessing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isSettingUp="

    const-string v2, ", merchantName="

    iget-boolean v3, p0, Lq00/i0;->g:Z

    iget-boolean v4, p0, Lq00/i0;->h:Z

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", sellerBusinessName="

    const-string v2, ", primaryButtonLabel="

    iget-object v3, p0, Lq00/i0;->i:Ljava/lang/String;

    iget-object v4, p0, Lq00/i0;->j:Ljava/lang/String;

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lq00/i0;->k:Lzy/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", secondaryButtonLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lq00/i0;->l:Lzy/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hasCompleted=false, addPaymentMethodOptions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", collectMissingBillingDetailsForExistingPaymentMethods="

    const-string v2, ", userSetIsExpanded="

    iget-object v3, p0, Lq00/i0;->m:Ljava/util/List;

    iget-boolean v4, p0, Lq00/i0;->n:Z

    invoke-static {v1, v2, v0, v3, v4}, Lnh3/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Z)V

    const-string v1, ", cardBeingUpdated="

    const-string v2, ", errorMessage="

    iget-object v3, p0, Lq00/i0;->o:Ljava/lang/Boolean;

    iget-object v4, p0, Lq00/i0;->p:Ljava/lang/String;

    invoke-static {v3, v1, v4, v2, v0}, Lev/n;->w(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    iget-object v1, p0, Lq00/i0;->q:Lzy/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", expiryDateInput="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lq00/i0;->r:Ll40/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cvcInput="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lq00/i0;->s:Ll40/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", addBankAccountState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lq00/i0;->t:Lq00/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", alertMessage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lq00/i0;->u:Lzy/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", paymentSelectionHint="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lq00/i0;->v:Lzy/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isAutoSelecting="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", hasAttemptedAutoSelection="

    const-string v2, ", signupToggleEnabled="

    iget-boolean v3, p0, Lq00/i0;->w:Z

    iget-boolean v4, p0, Lq00/i0;->x:Z

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    iget-boolean v1, p0, Lq00/i0;->y:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", billingDetailsCollectionConfiguration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lq00/i0;->z:Lh20/l1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isValidating="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    iget-boolean v2, p0, Lq00/i0;->A:Z

    invoke-static {v0, v2, v1}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
