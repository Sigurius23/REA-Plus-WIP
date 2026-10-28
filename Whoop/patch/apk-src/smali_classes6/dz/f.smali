.class public final Ldz/f;
.super Ldz/i;
.source "SourceFile"


# instance fields
.field public final w:Lcz/b;

.field public final x:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcz/b;Lcz/h;)V
    .locals 1

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "integrationType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldz/f;->w:Lcz/b;

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    const-string p1, "cs_init_with_customer_session"

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    const-string p1, "cs_init_with_customer_adapter"

    :goto_0
    iput-object p1, p0, Ldz/f;->x:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 27

    move-object/from16 v0, p0

    iget-object v1, v0, Ldz/f;->w:Lcz/b;

    iget-boolean v2, v1, Lcz/b;->x:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    new-instance v3, Ll83/k;

    const-string v4, "google_pay_enabled"

    invoke-direct {v3, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v2, v1, Lcz/b;->z:Lh20/i1;

    invoke-virtual {v2}, Lh20/i1;->b()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    new-instance v4, Ll83/k;

    const-string v5, "default_billing_details"

    invoke-direct {v4, v5, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v2, v1, Lcz/b;->w:Lh20/h1;

    const-string v5, "<this>"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v2, Lh20/h1;->z:Lh20/l3;

    iget-object v7, v2, Lh20/h1;->y:Lh20/c3;

    iget-object v8, v2, Lh20/h1;->E:Lh20/y2;

    iget-object v9, v8, Lh20/y2;->w:Lh20/z2;

    iget-object v10, v8, Lh20/y2;->y:Lh20/a3;

    sget-object v11, Lh20/z2;->F:Lh20/z2;

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    const/4 v11, 0x1

    xor-int/2addr v9, v11

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    new-instance v12, Ll83/k;

    const-string v13, "colorsLight"

    invoke-direct {v12, v13, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v9, v8, Lh20/y2;->x:Lh20/z2;

    sget-object v14, Lh20/z2;->G:Lh20/z2;

    invoke-static {v9, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    xor-int/2addr v9, v11

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    new-instance v14, Ll83/k;

    const-string v15, "colorsDark"

    invoke-direct {v14, v15, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v9, v10, Lh20/a3;->w:Ljava/lang/Float;

    const/16 v16, 0x0

    if-eqz v9, :cond_0

    move v9, v11

    goto :goto_0

    :cond_0
    move/from16 v9, v16

    :goto_0
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    move/from16 v17, v11

    new-instance v11, Ll83/k;

    const-string v0, "corner_radius"

    invoke-direct {v11, v0, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v9, v10, Lh20/a3;->x:Ljava/lang/Float;

    if-eqz v9, :cond_1

    move/from16 v9, v17

    goto :goto_1

    :cond_1
    move/from16 v9, v16

    :goto_1
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    new-instance v10, Ll83/k;

    move-object/from16 v18, v3

    const-string v3, "border_width"

    invoke-direct {v10, v3, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v8, v8, Lh20/y2;->z:Lh20/b3;

    iget-object v8, v8, Lh20/b3;->w:Ljava/lang/Integer;

    if-eqz v8, :cond_2

    move/from16 v8, v17

    goto :goto_2

    :cond_2
    move/from16 v8, v16

    :goto_2
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    new-instance v9, Ll83/k;

    move-object/from16 v19, v4

    const-string v4, "font"

    invoke-direct {v9, v4, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v12, v14, v11, v10, v9}, [Ll83/k;

    move-result-object v8

    invoke-static {v8}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v8

    iget-object v9, v2, Lh20/h1;->w:Lh20/v1;

    sget-object v10, Lh20/v1;->L:Lh20/v1;

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    xor-int/lit8 v9, v9, 0x1

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    new-instance v10, Ll83/k;

    invoke-direct {v10, v13, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v9, v2, Lh20/h1;->x:Lh20/v1;

    sget-object v11, Lh20/v1;->M:Lh20/v1;

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    xor-int/lit8 v9, v9, 0x1

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    new-instance v11, Ll83/k;

    invoke-direct {v11, v15, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget v9, v7, Lh20/c3;->w:F

    sget-object v12, Ld40/q;->c:Ld40/o;

    iget v13, v12, Ld40/o;->a:F

    cmpg-float v9, v9, v13

    if-nez v9, :cond_3

    move/from16 v9, v17

    goto :goto_3

    :cond_3
    move/from16 v9, v16

    :goto_3
    xor-int/lit8 v9, v9, 0x1

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    new-instance v13, Ll83/k;

    invoke-direct {v13, v0, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget v0, v7, Lh20/c3;->x:F

    iget v7, v12, Ld40/o;->c:F

    cmpg-float v0, v0, v7

    if-nez v0, :cond_4

    move/from16 v0, v17

    goto :goto_4

    :cond_4
    move/from16 v0, v16

    :goto_4
    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    new-instance v7, Ll83/k;

    invoke-direct {v7, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, v6, Lh20/l3;->x:Ljava/lang/Integer;

    if-eqz v0, :cond_5

    move/from16 v0, v17

    goto :goto_5

    :cond_5
    move/from16 v0, v16

    :goto_5
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    new-instance v3, Ll83/k;

    invoke-direct {v3, v4, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget v0, v6, Lh20/l3;->w:F

    sget-object v4, Ld40/q;->d:Ld40/s;

    iget v4, v4, Ld40/s;->d:F

    cmpg-float v0, v0, v4

    if-nez v0, :cond_6

    move/from16 v0, v17

    goto :goto_6

    :cond_6
    move/from16 v0, v16

    :goto_6
    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    new-instance v4, Ll83/k;

    const-string v6, "size_scale_factor"

    invoke-direct {v4, v6, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ll83/k;

    const-string v6, "primary_button"

    invoke-direct {v0, v6, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v26, v0

    move-object/from16 v24, v3

    move-object/from16 v25, v4

    move-object/from16 v23, v7

    move-object/from16 v20, v10

    move-object/from16 v21, v11

    move-object/from16 v22, v13

    filled-new-array/range {v20 .. v26}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->b0([Ll83/k;)Ljava/util/LinkedHashMap;

    move-result-object v0

    iget-object v2, v2, Lh20/h1;->F:Lh20/g1;

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v2, Lh20/g1;->w:Lh20/f1;

    sget-object v3, Lh20/g1;->E:Lh20/g1;

    iget-object v3, v3, Lh20/g1;->w:Lh20/f1;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    new-instance v4, Ll83/k;

    const-string v6, "style"

    invoke-direct {v4, v6, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v3, v2, Lh20/e1;

    if-eqz v3, :cond_7

    const-string v2, "floating_button"

    goto :goto_7

    :cond_7
    instance-of v3, v2, Lh20/d1;

    if-eqz v3, :cond_8

    const-string v2, "flat_with_radio"

    goto :goto_7

    :cond_8
    instance-of v3, v2, Lh20/z0;

    if-eqz v3, :cond_9

    const-string v2, "flat_with_checkmark"

    goto :goto_7

    :cond_9
    instance-of v2, v2, Lh20/b1;

    if-eqz v2, :cond_13

    const-string v2, "flat_with_disclosure"

    :goto_7
    new-instance v3, Ll83/k;

    const-string v6, "row_style"

    invoke-direct {v3, v6, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v4, v3}, [Ll83/k;

    move-result-object v2

    invoke-static {v2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v2

    const-string v3, "embedded_payment_element"

    const/4 v4, 0x0

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v8}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v3

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v3, v6}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_a
    :goto_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    instance-of v9, v8, Ljava/lang/Boolean;

    if-eqz v9, :cond_a

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_b
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v6

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_c
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    instance-of v9, v8, Ljava/lang/Boolean;

    if-eqz v9, :cond_c

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_d
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v6, :cond_e

    if-nez v3, :cond_e

    if-eqz v2, :cond_f

    :cond_e
    move/from16 v16, v17

    :cond_f
    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const-string v3, "usage"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ll83/k;

    const-string v3, "appearance"

    invoke-direct {v2, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, v1, Lcz/b;->H:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    new-instance v6, Ll83/k;

    const-string v3, "allows_removal_of_last_saved_payment_method"

    invoke-direct {v6, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, v1, Lcz/b;->I:Ljava/util/List;

    new-instance v7, Ll83/k;

    const-string v3, "payment_method_order"

    invoke-direct {v7, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, v1, Lcz/b;->E:Lh20/l1;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ln83/f;

    invoke-direct {v3}, Ln83/f;-><init>()V

    iget-boolean v8, v0, Lh20/l1;->E:Z

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    const-string v9, "attach_defaults"

    invoke-virtual {v3, v9, v8}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v8, v0, Lh20/l1;->w:Lh20/k1;

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    const-string v9, "name"

    invoke-virtual {v3, v9, v8}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v8, v0, Lh20/l1;->y:Lh20/k1;

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    const-string v9, "email"

    invoke-virtual {v3, v9, v8}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v8, v0, Lh20/l1;->x:Lh20/k1;

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    const-string v9, "phone"

    invoke-virtual {v3, v9, v8}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v8, v0, Lh20/l1;->z:Lh20/j1;

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    const-string v9, "address"

    invoke-virtual {v3, v9, v8}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lh20/l1;->b()Ljava/util/Set;

    move-result-object v8

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_10

    invoke-virtual {v0}, Lh20/l1;->b()Ljava/util/Set;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/Iterable;

    const/4 v12, 0x0

    const/16 v13, 0x3e

    const-string v9, ","

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    const-string v8, "allowed_countries"

    invoke-virtual {v3, v8, v0}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_10
    invoke-virtual {v3}, Ln83/f;->b()Ln83/f;

    move-result-object v0

    new-instance v8, Ll83/k;

    const-string v3, "billing_details_collection_configuration"

    invoke-direct {v8, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, v1, Lcz/b;->G:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_11

    move-object v9, v0

    goto :goto_a

    :cond_11
    move-object v9, v4

    :goto_a
    if-eqz v9, :cond_12

    new-instance v13, Lgo1/a;

    const/16 v0, 0x12

    invoke-direct {v13, v0}, Lgo1/a;-><init>(I)V

    const/16 v14, 0x1f

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v4

    :cond_12
    new-instance v9, Ll83/k;

    const-string v0, "preferred_networks"

    invoke-direct {v9, v0, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, v1, Lcz/b;->J:Lh20/t1;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, v0, Lh20/p1;

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    new-instance v10, Ll83/k;

    const-string v3, "card_brand_acceptance"

    invoke-direct {v10, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, v1, Lcz/b;->K:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    new-instance v11, Ll83/k;

    const-string v1, "open_card_scan_automatically_enabled"

    invoke-direct {v11, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v5, v2

    move-object/from16 v3, v18

    move-object/from16 v4, v19

    filled-new-array/range {v3 .. v11}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "cs_config"

    invoke-static {v1, v0}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :cond_13
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ldz/f;->x:Ljava/lang/String;

    return-object v0
.end method
