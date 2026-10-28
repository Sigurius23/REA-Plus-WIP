.class public final Lcom/whoop/profile/view/edit/CountrySelectionContentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a;\u0010\u0008\u001a\u00020\u00062\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0006H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000f\u00b2\u0006\u000e\u0010\r\u001a\u00020\u000c8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u0012\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\nX\u008a\u0084\u0002"
    }
    d2 = {
        "",
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;",
        "countries",
        "",
        "selectedCountryCode",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onCountrySelected",
        "CountrySelectionContent",
        "(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "CountrySelectionContentPreview",
        "(Landroidx/compose/runtime/Composer;I)V",
        "Lcom/whoop/design/util/TextResource;",
        "searchQuery",
        "filteredCountries",
        "profile_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final CountrySelectionContent(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;",
            ">;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "countries"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onCountrySelected"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p3

    check-cast v14, Lp1/q;

    const v0, 0x107a936c

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v6, v4, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v14, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    :cond_3
    and-int/lit16 v6, v4, 0x180

    if-nez v6, :cond_5

    invoke-virtual {v14, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v0, v6

    :cond_5
    and-int/lit16 v6, v0, 0x93

    const/16 v9, 0x92

    const/4 v10, 0x0

    if-eq v6, v9, :cond_6

    const/4 v6, 0x1

    goto :goto_4

    :cond_6
    move v6, v10

    :goto_4
    and-int/lit8 v9, v0, 0x1

    invoke-virtual {v14, v9, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_19

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v6, v9, :cond_7

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static {v6}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v6

    invoke-virtual {v14, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v6, Lp1/c1;

    const/4 v12, 0x3

    invoke-static {v10, v10, v14, v12}, Ln0/x;->a(IILandroidx/compose/runtime/Composer;I)Ln0/u;

    move-result-object v17

    invoke-static {v6}, Lcom/whoop/profile/view/edit/CountrySelectionContentKt;->CountrySelectionContent$lambda$1(Lp1/c1;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    sget v15, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v13, v14, v15}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v14, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    const-string v8, "toLowerCase(...)"

    const-string v11, "ROOT"

    if-nez v15, :cond_8

    if-ne v7, v9, :cond_9

    :cond_8
    invoke-static {v13}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    sget-object v13, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {v13, v11, v7, v13, v8}, Lr80/c;->q(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v14, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v7, Ljava/lang/String;

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    move/from16 v19, v12

    if-nez v13, :cond_a

    if-ne v15, v9, :cond_e

    :cond_a
    move-object v13, v1

    check-cast v13, Ljava/lang/Iterable;

    new-instance v15, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v13, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v15, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_d

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;

    invoke-virtual {v13}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;->getName()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    instance-of v10, v12, Lcom/whoop/design/util/TextResource$e;

    if-eqz v10, :cond_b

    check-cast v12, Lcom/whoop/design/util/TextResource$e;

    goto :goto_6

    :cond_b
    const/4 v12, 0x0

    :goto_6
    if-eqz v12, :cond_c

    invoke-virtual {v12}, Lcom/whoop/design/util/TextResource$e;->a()Ljava/lang/CharSequence;

    move-result-object v10

    if-eqz v10, :cond_c

    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_c

    sget-object v12, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {v12, v11, v10, v12, v8}, Lr80/c;->q(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    goto :goto_7

    :cond_c
    const/4 v10, 0x0

    :goto_7
    new-instance v12, Ll83/k;

    invoke-direct {v12, v13, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v15, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v10, 0x0

    goto :goto_5

    :cond_d
    invoke-virtual {v14, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v15, Ljava/util/List;

    invoke-virtual {v14, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v14, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v5, v8

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v5, :cond_f

    if-ne v8, v9, :cond_10

    :cond_f
    new-instance v5, Lcom/whoop/profile/view/edit/a;

    const/4 v8, 0x0

    invoke-direct {v5, v7, v8, v1, v15}, Lcom/whoop/profile/view/edit/a;-><init>(Ljava/lang/String;ILjava/util/List;Ljava/util/List;)V

    invoke-static {v5}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v8

    invoke-virtual {v14, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v8, Lp1/t2;

    const/high16 v5, 0x3f800000    # 1.0f

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const/16 v11, 0x190

    int-to-float v11, v11

    invoke-static {v11, v10}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, Ll0/m;->c:Ll0/g;

    sget-object v12, Lb2/e;->M:Lb2/k;

    const/4 v13, 0x0

    invoke-static {v11, v12, v14, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v11

    move-object v12, v6

    iget-wide v5, v14, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v14, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v22, La3/l;->a:La3/k;

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v15, v14, Lp1/q;->S:Z

    if-eqz v15, :cond_11

    invoke-virtual {v14, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_11
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_8
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v14, v13, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v14, v11, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v11, v14, Lp1/q;->S:Z

    if-nez v11, :cond_12

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_13

    :cond_12
    invoke-static {v5, v14, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v14, v5, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-static {v15, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v12}, Lcom/whoop/profile/view/edit/CountrySelectionContentKt;->CountrySelectionContent$lambda$1(Lp1/c1;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    move-object v10, v7

    new-instance v7, Lcom/whoop/design/util/TextResource$b;

    sget v11, Lcom/whoop/profile/R$string;->profile_search_countries_placeholder:I

    const/4 v13, 0x2

    const/4 v15, 0x0

    invoke-direct {v7, v11, v15, v13, v15}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v9, :cond_14

    new-instance v11, Laq1/d;

    const/16 v13, 0xc

    invoke-direct {v11, v13, v12}, Laq1/d;-><init>(ILp1/c1;)V

    invoke-virtual {v14, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    move-object/from16 v21, v11

    check-cast v21, Lkotlin/jvm/functions/Function1;

    sget v11, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v11, v11, 0x3

    or-int/lit8 v11, v11, 0x6

    sget v12, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v12, v12, 0x6

    or-int/2addr v11, v12

    const/16 v24, 0x6000

    const/16 v25, 0x3bf8

    move-object v12, v8

    const/4 v8, 0x0

    move-object v13, v9

    move-object v15, v10

    const-wide/16 v9, 0x0

    move/from16 v23, v11

    const/high16 v20, 0x3f800000    # 1.0f

    const/4 v11, 0x0

    move-object/from16 v26, v12

    const/4 v12, 0x0

    move-object/from16 v27, v13

    const/4 v13, 0x0

    move-object/from16 v22, v14

    move-object/from16 v29, v15

    const/16 v28, 0x0

    const-wide/16 v14, 0x0

    const/16 v30, 0x100

    const/16 v16, 0x0

    const/16 v31, 0x1

    const/16 v18, 0x0

    move/from16 v32, v19

    const/16 v19, 0x0

    move/from16 v33, v20

    const/16 v20, 0x0

    move-object/from16 v1, v26

    move-object/from16 v2, v27

    move-object/from16 v3, v29

    move/from16 v4, v32

    invoke-static/range {v5 .. v25}, Lhy0/v0;->j(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;JIZLg1/e8;JZLn0/u;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v22

    int-to-float v4, v4

    const/16 v5, 0x8

    int-to-float v5, v5

    invoke-static {v4, v5, v3, v14}, Ld;->w(FFLb2/t;Lp1/q;)V

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-static {v15, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    and-int/lit8 v4, v0, 0x70

    const/16 v6, 0x20

    if-ne v4, v6, :cond_15

    const/4 v10, 0x1

    goto :goto_9

    :cond_15
    move/from16 v10, v28

    :goto_9
    or-int/2addr v3, v10

    and-int/lit16 v0, v0, 0x380

    const/16 v4, 0x100

    if-ne v0, v4, :cond_16

    const/4 v10, 0x1

    goto :goto_a

    :cond_16
    move/from16 v10, v28

    :goto_a
    or-int v0, v3, v10

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_18

    if-ne v3, v2, :cond_17

    goto :goto_b

    :cond_17
    move-object/from16 v2, p1

    move-object/from16 v4, p2

    goto :goto_c

    :cond_18
    :goto_b
    new-instance v3, Lq;

    const/16 v0, 0x15

    move-object/from16 v2, p1

    move-object/from16 v4, p2

    invoke-direct {v3, v1, v2, v4, v0}, Lq;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v14, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_c
    move-object v13, v3

    check-cast v13, Lkotlin/jvm/functions/Function1;

    const/4 v15, 0x6

    const/16 v16, 0x1fc

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v6, v17

    invoke-static/range {v5 .. v16}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_19
    move-object v4, v3

    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_d
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_1a

    new-instance v0, Lcom/whoop/profile/view/edit/b;

    const/4 v5, 0x0

    move-object/from16 v1, p0

    move-object v3, v4

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/whoop/profile/view/edit/b;-><init>(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method private static final CountrySelectionContent$lambda$1(Lp1/c1;)Lcom/whoop/design/util/TextResource;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lcom/whoop/design/util/TextResource;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/design/util/TextResource;

    return-object p0
.end method

.method private static final CountrySelectionContent$lambda$2(Lp1/c1;Lcom/whoop/design/util/TextResource;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lcom/whoop/design/util/TextResource;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final CountrySelectionContent$lambda$5$0(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 1

    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object p1

    new-instance p2, Lb30/y4;

    const/4 v0, 0x7

    invoke-direct {p2, p0, v0}, Lb30/y4;-><init>(Ljava/lang/String;I)V

    invoke-static {p1, p2}, Lxb3/k;->r(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/f;

    move-result-object p0

    new-instance p1, Lcom/whoop/data/local/room/dao/persistent/i;

    const/16 p2, 0x16

    invoke-direct {p1, p2}, Lcom/whoop/data/local/room/dao/persistent/i;-><init>(I)V

    invoke-static {p0, p1}, Lxb3/k;->A(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/s;

    move-result-object p0

    invoke-static {p0}, Lxb3/k;->E(Lxb3/i;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final CountrySelectionContent$lambda$5$0$0(Ljava/lang/String;Ll83/k;)Z
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-static {p1, p0, v0}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p0

    const/4 p1, 0x1

    if-ne p0, p1, :cond_0

    return p1

    :cond_0
    return v0
.end method

.method private static final CountrySelectionContent$lambda$5$0$1(Ll83/k;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Ll83/k;->w:Ljava/lang/Object;

    check-cast p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;

    return-object p0
.end method

.method private static final CountrySelectionContent$lambda$6(Lp1/t2;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Ljava/util/List<",
            "Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method private static final CountrySelectionContent$lambda$7$0$0(Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lhy0/x0$c;

    if-eqz v0, :cond_0

    check-cast p1, Lhy0/x0$c;

    invoke-virtual {p1}, Lhy0/x0$c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/whoop/profile/view/edit/CountrySelectionContentKt;->CountrySelectionContent$lambda$2(Lp1/c1;Lcom/whoop/design/util/TextResource;)V

    goto :goto_0

    :cond_0
    instance-of p1, p1, Lhy0/x0$a;

    if-eqz p1, :cond_1

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/whoop/profile/view/edit/CountrySelectionContentKt;->CountrySelectionContent$lambda$2(Lp1/c1;Lcom/whoop/design/util/TextResource;)V

    :cond_1
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final CountrySelectionContent$lambda$7$1$0(Lp1/t2;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;
    .locals 4

    const-string v0, "$this$LazyColumn"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/whoop/profile/view/edit/CountrySelectionContentKt;->CountrySelectionContent$lambda$6(Lp1/t2;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-instance v2, Lcom/whoop/profile/view/edit/CountrySelectionContentKt$CountrySelectionContent$lambda$7$1$0$$inlined$itemsIndexed$default$2;

    invoke-direct {v2, v0}, Lcom/whoop/profile/view/edit/CountrySelectionContentKt$CountrySelectionContent$lambda$7$1$0$$inlined$itemsIndexed$default$2;-><init>(Ljava/util/List;)V

    new-instance v3, Lcom/whoop/profile/view/edit/CountrySelectionContentKt$CountrySelectionContent$lambda$7$1$0$$inlined$itemsIndexed$default$3;

    invoke-direct {v3, v0, p1, p2, p0}, Lcom/whoop/profile/view/edit/CountrySelectionContentKt$CountrySelectionContent$lambda$7$1$0$$inlined$itemsIndexed$default$3;-><init>(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lp1/t2;)V

    new-instance p0, Lx1/b;

    const/4 p1, 0x1

    const p2, 0x799532c4

    invoke-direct {p0, v3, p1, p2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    check-cast p3, Ln0/f;

    const/4 p1, 0x0

    invoke-virtual {p3, v1, p1, v2, p0}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final CountrySelectionContent$lambda$8(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lcom/whoop/profile/view/edit/CountrySelectionContentKt;->CountrySelectionContent(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final CountrySelectionContentPreview(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, 0x3f0230

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-static {v2, v1, v0}, Lc13/a;->p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v2, v1, v0}, Lc13/a;->z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lfy1/i;->a:Lfy1/i;

    invoke-static {v1, v2, v0}, Lc13/a;->q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Ldp0/i;->a:Ldp0/i;

    invoke-virtual {v1, v2}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    sget-object v1, Lb3/v1;->l:Lp1/u2;

    iget-object v2, v0, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-static {v1, v0, v2}, Lc13/a;->g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I

    move-result v0

    new-array v0, v0, [Lp1/u1;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp1/u1;

    new-instance v1, Lcom/whoop/profile/view/edit/CountrySelectionContentKt$CountrySelectionContentPreview$$inlined$WhoopPreviewTheme$1;

    invoke-direct {v1}, Lcom/whoop/profile/view/edit/CountrySelectionContentKt$CountrySelectionContentPreview$$inlined$WhoopPreviewTheme$1;-><init>()V

    const v2, -0x124c2861

    invoke-static {v2, p0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p0, v2}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lbz0/c;

    const/16 v1, 0x18

    invoke-direct {v0, p1, v1}, Lbz0/c;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final CountrySelectionContentPreview$lambda$1(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/whoop/profile/view/edit/CountrySelectionContentKt;->CountrySelectionContentPreview(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/edit/CountrySelectionContentKt;->CountrySelectionContent$lambda$7$0$0(Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$CountrySelectionContent$lambda$6(Lp1/t2;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/edit/CountrySelectionContentKt;->CountrySelectionContent$lambda$6(Lp1/t2;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/profile/view/edit/CountrySelectionContentKt;->CountrySelectionContentPreview$lambda$1(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/whoop/profile/view/edit/CountrySelectionContentKt;->CountrySelectionContent$lambda$8(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/String;Ll83/k;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/edit/CountrySelectionContentKt;->CountrySelectionContent$lambda$5$0$0(Ljava/lang/String;Ll83/k;)Z

    move-result p0

    return p0
.end method

.method public static synthetic e(Ll83/k;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/edit/CountrySelectionContentKt;->CountrySelectionContent$lambda$5$0$1(Ll83/k;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/profile/view/edit/CountrySelectionContentKt;->CountrySelectionContent$lambda$5$0(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lp1/t2;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/profile/view/edit/CountrySelectionContentKt;->CountrySelectionContent$lambda$7$1$0(Lp1/t2;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method
