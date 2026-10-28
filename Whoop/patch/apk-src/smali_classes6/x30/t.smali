.class public final Lx30/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg40/z2;
.implements Lg40/x2;


# instance fields
.field public final a:Lg40/k0;

.field public final b:Lg40/c3;

.field public final c:Lx30/z;

.field public final d:Lx30/f0;

.field public final e:Lg40/c3;

.field public final f:Luo1/b;

.field public final g:Ljava/util/List;

.field public final h:Ln53/e;


# direct methods
.method public constructor <init>(Lzx/o;Ljava/util/LinkedHashMap;ZLw30/c;Lux/a;Lux/b;)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    move-object/from16 v10, p5

    move-object/from16 v11, p6

    sget-object v4, Lbc3/q0;->a:Lkc3/e;

    sget-object v6, Lhc3/o;->a:Lbc3/w1;

    sget-object v7, Lkc3/d;->w:Lkc3/d;

    new-instance v4, Lx30/y;

    sget-object v5, Lw30/b;->w:Lw30/b;

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const/4 v12, 0x1

    xor-int/2addr v5, v12

    invoke-direct {v4, v5, v10, v11}, Lx30/y;-><init>(ZLux/a;Lux/b;)V

    new-instance v13, Ld0/o2;

    const/16 v14, 0xa

    invoke-direct {v13, v14}, Ld0/o2;-><init>(I)V

    new-instance v15, Lg40/j0;

    invoke-direct {v15}, Lg40/j0;-><init>()V

    const-string v5, "cardAccountRangeRepositoryFactory"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "cbcEligibility"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "uiContext"

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "workContext"

    invoke-static {v7, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "cardBrandFilter"

    invoke-static {v10, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "cardFundingFilter"

    invoke-static {v11, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget-object v5, Lg40/k0;->w:Lg40/k0;

    iput-object v5, v0, Lx30/t;->a:Lg40/k0;

    sget-object v8, Lm83/y;->w:Lm83/y;

    const/4 v9, 0x0

    move/from16 v16, v12

    if-eqz p3, :cond_0

    new-instance v14, Lg40/f3;

    new-instance v17, Lg40/d3;

    const v5, 0x7f141049

    new-array v12, v9, [Ljava/lang/Object;

    invoke-static {v5, v12, v8}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v18

    const/16 v22, 0x0

    const/16 v23, 0x38

    const/16 v19, 0x2

    const/16 v20, 0x1

    const/16 v21, 0x0

    invoke-direct/range {v17 .. v23}, Lg40/d3;-><init>(Lzy/b;IILec3/h2;ZI)V

    move-object/from16 v5, v17

    sget-object v12, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getName$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v12

    invoke-virtual {v2, v12}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    move-object/from16 v18, v15

    const/4 v9, 0x4

    const/4 v15, 0x0

    invoke-direct {v14, v5, v12, v15, v9}, Lg40/f3;-><init>(Lg40/l3;Ljava/lang/String;Ldo0/c;I)V

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getName$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v5

    new-instance v12, Lg40/c3;

    invoke-direct {v12, v5, v14}, Lg40/c3;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lg40/m3;)V

    goto :goto_0

    :cond_0
    move-object/from16 v18, v15

    const/4 v9, 0x4

    const/4 v15, 0x0

    move-object v12, v15

    :goto_0
    iput-object v12, v0, Lx30/t;->b:Lg40/c3;

    sget-object v5, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCardNumber$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v14

    iget-object v1, v1, Lzx/o;->e:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lzx/n;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCardNumber$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    instance-of v9, v3, Lw30/a;

    if-eqz v9, :cond_2

    check-cast v3, Lw30/a;

    iget-object v3, v3, Lw30/a;->w:Ljava/util/List;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getPreferredCardBrand$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v9

    invoke-virtual {v2, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    if-eqz v9, :cond_1

    sget-object v19, Ly00/i;->M:Lt9/c0;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v9}, Lt9/c0;->i(Ljava/lang/String;)Ly00/i;

    move-result-object v9

    goto :goto_1

    :cond_1
    move-object v9, v15

    :goto_1
    new-instance v15, Lx30/p;

    invoke-direct {v15, v3, v9}, Lx30/p;-><init>(Ljava/util/List;Ly00/i;)V

    :goto_2
    move-object v9, v15

    goto :goto_3

    :cond_2
    instance-of v3, v3, Lw30/b;

    if-eqz v3, :cond_7

    sget-object v15, Lx30/q;->a:Lx30/q;

    goto :goto_2

    :goto_3
    new-instance v3, Lx30/p0;

    move-object v15, v8

    move-object v8, v1

    const/4 v1, 0x0

    invoke-direct/range {v3 .. v11}, Lx30/p0;-><init>(Lx30/y;Lzx/n;Lq83/j;Lq83/j;Ljava/lang/String;Lx30/r;Lux/a;Lux/b;)V

    new-instance v4, Lx30/z;

    invoke-direct {v4, v14, v3}, Lx30/z;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lx30/p0;)V

    iput-object v4, v0, Lx30/t;->c:Lx30/z;

    new-instance v3, Lx30/f0;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCardCvc$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v5

    new-instance v6, Lx30/e0;

    iget-object v7, v4, Lx30/z;->c:Lx30/p0;

    iget-object v7, v7, Lx30/p0;->u:Lec3/f2;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCardCvc$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-direct {v6, v13, v7, v8}, Lx30/e0;-><init>(Ld0/o2;Lec3/f2;Ljava/lang/String;)V

    invoke-direct {v3, v5, v6}, Lx30/f0;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lx30/e0;)V

    iput-object v3, v0, Lx30/t;->d:Lx30/f0;

    new-instance v5, Lg40/c3;

    const-string v6, "date"

    invoke-static {v6}, Lcom/stripe/android/uicore/elements/a;->a(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v6

    new-instance v7, Lg40/f3;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCardExpMonth$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCardExpYear$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v9

    invoke-virtual {v2, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v9, 0x2

    if-eqz v2, :cond_3

    invoke-static {v9, v2}, Lyb3/r;->M0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_4

    :cond_3
    const/4 v2, 0x0

    :goto_4
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v8, Lx30/s;->w:Lx30/s;

    move-object/from16 v10, v18

    invoke-direct {v7, v10, v2, v8}, Lg40/f3;-><init>(Lg40/l3;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    invoke-direct {v5, v6, v7}, Lg40/c3;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lg40/m3;)V

    iput-object v5, v0, Lx30/t;->e:Lg40/c3;

    new-instance v2, Luo1/b;

    const/16 v6, 0x1b

    invoke-direct {v2, v0, v6}, Luo1/b;-><init>(Ljava/lang/Object;I)V

    iput-object v2, v0, Lx30/t;->f:Luo1/b;

    new-array v2, v9, [Lg40/b3;

    aput-object v5, v2, v1

    aput-object v3, v2, v16

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    new-instance v6, Lg40/t2;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v7

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "row_"

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/stripe/android/uicore/elements/a;->a(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v7

    new-instance v8, Lg40/s2;

    invoke-direct {v8, v2}, Lg40/s2;-><init>(Ljava/util/List;)V

    invoke-direct {v6, v7, v2, v8}, Lg40/t2;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/List;Lg40/s2;)V

    const/4 v2, 0x3

    new-array v7, v2, [Lg40/y2;

    aput-object v12, v7, v1

    aput-object v4, v7, v16

    aput-object v6, v7, v9

    invoke-static {v7}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    iput-object v6, v0, Lx30/t;->g:Ljava/util/List;

    const/4 v6, 0x4

    new-array v6, v6, [Lg40/b3;

    aput-object v12, v6, v1

    aput-object v4, v6, v16

    aput-object v5, v6, v9

    aput-object v3, v6, v2

    invoke-static {v6}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg40/b3;

    invoke-virtual {v4}, Lg40/b3;->k()Lg40/k1;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_4
    new-instance v2, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v3, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg40/k1;

    invoke-interface {v4}, Lg40/z2;->f()Lec3/f2;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_6

    iget-object v1, v0, Lx30/t;->a:Lg40/k0;

    invoke-static {v15, v1}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/s;->D0(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg40/h1;

    invoke-static {v1}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v1

    goto :goto_7

    :cond_6
    invoke-static {v2}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    new-array v1, v1, [Lec3/l;

    invoke-interface {v3, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lec3/l;

    new-instance v3, Landroidx/room/y;

    const/4 v4, 0x7

    invoke-direct {v3, v4, v1, v0}, Landroidx/room/y;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    move-object v1, v3

    :goto_7
    new-instance v3, Lce/d;

    const/16 v4, 0xf

    invoke-direct {v3, v4, v2, v0}, Lce/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ln53/e;

    invoke-direct {v2, v1, v3}, Ln53/e;-><init>(Lec3/l;Lc93/a;)V

    iput-object v2, v0, Lx30/t;->h:Ln53/e;

    return-void

    :cond_7
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method


# virtual methods
.method public final b(Z)V
    .locals 2

    iget-object v0, p0, Lx30/t;->g:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg40/y2;

    invoke-interface {v1, p1}, Lg40/y2;->b(Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final f()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lx30/t;->h:Ln53/e;

    return-object v0
.end method

.method public final i(ZLg40/y2;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V
    .locals 7

    const-string p2, "modifier"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, p6

    check-cast v5, Lp1/q;

    const p2, -0x77c9019

    invoke-virtual {v5, p2}, Lp1/q;->e0(I)V

    and-int/lit8 p2, p7, 0xe

    shr-int/lit8 p6, p7, 0xc

    and-int/lit8 p6, p6, 0x70

    or-int/2addr p2, p6

    shr-int/lit8 p6, p7, 0x3

    and-int/lit16 v0, p6, 0x380

    or-int/2addr p2, v0

    sget v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    shl-int/lit8 v0, v0, 0x9

    or-int/2addr p2, v0

    and-int/lit16 p6, p6, 0x1c00

    or-int/2addr p2, p6

    shl-int/lit8 p6, p7, 0x6

    const p7, 0xe000

    and-int/2addr p6, p7

    or-int v6, p2, p6

    move-object v1, p0

    move v0, p1

    move-object v4, p3

    move-object v2, p4

    move-object v3, p5

    invoke-static/range {v0 .. v6}, Lrj/o;->a(ZLx30/t;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const/4 p1, 0x0

    invoke-virtual {v5, p1}, Lp1/q;->q(Z)V

    return-void
.end method
