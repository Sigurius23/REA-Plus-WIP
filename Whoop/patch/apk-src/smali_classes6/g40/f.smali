.class public final Lg40/f;
.super Lg40/a3;
.source "SourceFile"

# interfaces
.implements Lg40/h;


# instance fields
.field public b:Ljava/util/Map;

.field public final c:Lg40/m;

.field public final d:Lg40/i0;

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:Lec3/h2;

.field public final i:Lg40/a1;

.field public final j:Lg40/c3;

.field public final k:Lx30/i;

.field public final l:Lg40/a2;

.field public final m:Ljava/util/LinkedHashMap;

.field public final n:Lqg3/d;

.field public o:Ljava/lang/Boolean;

.field public final p:Ln53/e;

.field public final q:Lg40/e;

.field public final r:Lec3/r1;


# direct methods
.method public constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Lg40/m;Ljava/util/Set;Lg40/i0;Lg40/v2;Ljava/util/Map;ZZI)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p6

    move-object/from16 v3, p7

    move/from16 v4, p10

    and-int/lit8 v5, v4, 0x4

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    new-instance v5, Lg40/l;

    const/4 v7, 0x7

    invoke-direct {v5, v6, v6, v7}, Lg40/l;-><init>(Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;I)V

    goto :goto_0

    :cond_0
    move-object/from16 v5, p3

    :goto_0
    and-int/lit8 v7, v4, 0x8

    if-eqz v7, :cond_1

    sget-object v7, Lm83/a0;->w:Lm83/a0;

    goto :goto_1

    :cond_1
    move-object/from16 v7, p4

    :goto_1
    and-int/lit8 v8, v4, 0x10

    if-eqz v8, :cond_2

    new-instance v8, Lg40/i0;

    sget-object v9, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCountry$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v9

    new-instance v10, Lg40/r0;

    new-instance v11, Lm63/d;

    const/16 v12, 0x3e

    invoke-direct {v11, v7, v6, v6, v12}, Lm63/d;-><init>(Ljava/util/Set;Lg1/u4;Lg1/u4;I)V

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCountry$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v12

    invoke-interface {v1, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-direct {v10, v11, v12}, Lg40/r0;-><init>(Lg40/p0;Ljava/lang/String;)V

    invoke-direct {v8, v9, v10}, Lg40/i0;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lg40/r0;)V

    goto :goto_2

    :cond_2
    move-object/from16 v8, p5

    :goto_2
    and-int/lit16 v9, v4, 0x80

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eqz v9, :cond_3

    :try_start_0
    const-string v9, "com.google.android.libraries.places.api.Places"

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move v9, v10

    goto :goto_3

    :catch_0
    move v9, v11

    goto :goto_3

    :cond_3
    move/from16 v9, p8

    :goto_3
    and-int/lit16 v4, v4, 0x100

    if-eqz v4, :cond_4

    move v4, v11

    goto :goto_4

    :cond_4
    move/from16 v4, p9

    :goto_4
    const-string v12, "_identifier"

    move-object/from16 v13, p1

    invoke-static {v13, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "rawValuesMap"

    invoke-static {v1, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "addressInputMode"

    invoke-static {v5, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "countryCodes"

    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "countryElement"

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, v8, Lg40/i0;->c:Lg40/r0;

    invoke-direct/range {p0 .. p1}, Lg40/a3;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V

    iput-object v1, v0, Lg40/f;->b:Ljava/util/Map;

    iput-object v5, v0, Lg40/f;->c:Lg40/m;

    iput-object v8, v0, Lg40/f;->d:Lg40/i0;

    iput-boolean v9, v0, Lg40/f;->e:Z

    iput-boolean v4, v0, Lg40/f;->f:Z

    iput-boolean v10, v0, Lg40/f;->g:Z

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, v0, Lg40/f;->h:Lec3/h2;

    new-instance v4, Lg40/a1;

    iget-object v8, v0, Lg40/f;->b:Ljava/util/Map;

    sget-object v9, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getEmail$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    const/4 v9, 0x5

    invoke-direct {v4, v6, v8, v9}, Lg40/a1;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/lang/String;I)V

    iput-object v4, v0, Lg40/f;->i:Lg40/a1;

    new-instance v4, Lg40/c3;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getName$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v8

    new-instance v9, Lg40/f3;

    new-instance v12, Lg40/d3;

    new-array v13, v11, [Ljava/lang/Object;

    const v14, 0x7f140f80

    sget-object v15, Lm83/y;->w:Lm83/y;

    invoke-static {v14, v13, v15}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v13

    invoke-virtual {v5}, Lg40/m;->s()Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    move-result-object v14

    sget-object v10, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->OPTIONAL:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    if-ne v14, v10, :cond_5

    const/16 v17, 0x1

    goto :goto_5

    :cond_5
    move/from16 v17, v11

    :goto_5
    const/16 v18, 0xe

    const/4 v14, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x0

    move-object/from16 v19, v16

    const/16 v16, 0x0

    move-object/from16 v20, v19

    invoke-direct/range {v12 .. v18}, Lg40/d3;-><init>(Lzy/b;IILec3/h2;ZI)V

    iget-object v13, v0, Lg40/f;->b:Ljava/util/Map;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getName$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v14

    invoke-interface {v13, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    const/4 v14, 0x4

    invoke-direct {v9, v12, v13, v6, v14}, Lg40/f3;-><init>(Lg40/l3;Ljava/lang/String;Ldo0/c;I)V

    invoke-direct {v4, v8, v9}, Lg40/c3;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lg40/m3;)V

    iput-object v4, v0, Lg40/f;->j:Lg40/c3;

    new-instance v4, Lx30/i;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getOneLineAddress$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v8

    const v9, 0x7f140f6d

    new-array v12, v11, [Ljava/lang/Object;

    move-object/from16 v13, v20

    invoke-static {v9, v12, v13}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v9

    instance-of v12, v5, Lg40/j;

    if-eqz v12, :cond_6

    move-object v12, v5

    check-cast v12, Lg40/j;

    goto :goto_6

    :cond_6
    move-object v12, v6

    :goto_6
    if-eqz v12, :cond_7

    iget-object v12, v12, Lg40/j;->F:Lc93/a;

    goto :goto_7

    :cond_7
    move-object v12, v6

    :goto_7
    invoke-direct {v4, v8, v9, v12}, Lx30/i;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lzy/b;Lc93/a;)V

    iput-object v4, v0, Lg40/f;->k:Lx30/i;

    new-instance v4, Lg40/a2;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getPhone$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v8

    iget-object v9, v0, Lg40/f;->b:Ljava/util/Map;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getPhone$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v12

    invoke-interface {v9, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    if-nez v9, :cond_8

    const-string v9, ""

    :cond_8
    invoke-virtual {v5}, Lg40/m;->x()Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    move-result-object v12

    if-ne v12, v10, :cond_9

    const/4 v10, 0x1

    goto :goto_8

    :cond_9
    move v10, v11

    :goto_8
    invoke-virtual {v5}, Lg40/m;->x()Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    move-result-object v5

    sget-object v12, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->REQUIRED:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    if-eq v5, v12, :cond_a

    const/4 v5, 0x1

    goto :goto_9

    :cond_a
    move v5, v11

    :goto_9
    const/4 v12, 0x6

    invoke-static {v9, v12, v6, v10, v5}, Lg40/l0;->a(Ljava/lang/String;ILjava/lang/String;ZZ)Lg40/z1;

    move-result-object v5

    invoke-direct {v4, v8, v5}, Lg40/a2;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lg40/z1;)V

    iput-object v4, v0, Lg40/f;->l:Lg40/a2;

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v4, v0, Lg40/f;->m:Ljava/util/LinkedHashMap;

    new-instance v4, Lqg3/d;

    sget-object v5, Le40/b;->a:Ljava/lang/Object;

    const/16 v5, 0xd

    invoke-direct {v4, v5, v11}, Lqg3/d;-><init>(IB)V

    iput-object v4, v0, Lg40/f;->n:Lqg3/d;

    iget-object v4, v7, Lg40/r0;->i:Ln53/e;

    new-instance v5, Leg/j;

    const/16 v7, 0x11

    invoke-direct {v5, v0, v7}, Leg/j;-><init>(Ljava/lang/Object;I)V

    invoke-static {v4, v5}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v5

    if-eqz v2, :cond_b

    iget-object v7, v2, Lg40/v2;->b:Lg40/u2;

    iget-object v7, v7, Lg40/u2;->e:Ljava/lang/Object;

    check-cast v7, Lec3/r1;

    if-nez v7, :cond_c

    :cond_b
    invoke-static {v6}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v7

    :cond_c
    new-instance v6, Lf01/f;

    const/16 v8, 0x10

    invoke-direct {v6, v8, v0, v3}, Lf01/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5, v7, v6}, Lbi/g;->p(Lec3/f2;Lec3/f2;Lc93/m;)Ln53/e;

    move-result-object v6

    new-instance v7, Lg1/u4;

    const/16 v8, 0xb

    invoke-direct {v7, v8}, Lg1/u4;-><init>(I)V

    invoke-static {v5, v7}, Lbi/g;->y(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v7

    new-instance v8, La01/d;

    const/16 v9, 0xf

    invoke-direct {v8, v0, v2, v3, v9}, La01/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v4, v7, v8}, Lbi/g;->p(Lec3/f2;Lec3/f2;Lc93/m;)Ln53/e;

    move-result-object v2

    new-instance v3, Lb30/t0;

    const/4 v7, 0x1

    invoke-direct {v3, v0, v7}, Lb30/t0;-><init>(Ljava/lang/Object;I)V

    move-object/from16 p5, v1

    move-object/from16 p4, v2

    move-object/from16 p6, v3

    move-object/from16 p1, v4

    move-object/from16 p2, v5

    move-object/from16 p3, v6

    invoke-static/range {p1 .. p6}, Lbi/g;->r(Lec3/f2;Lec3/f2;Lec3/f2;Lec3/f2;Lec3/f2;Lc93/o;)Ln53/e;

    move-result-object v1

    iput-object v1, v0, Lg40/f;->p:Ln53/e;

    new-instance v2, Lg40/e;

    invoke-direct {v2, v1}, Lg40/e;-><init>(Ln53/e;)V

    iput-object v2, v0, Lg40/f;->q:Lg40/e;

    invoke-static {v2}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v1

    iput-object v1, v0, Lg40/f;->r:Lec3/r1;

    return-void
.end method


# virtual methods
.method public final b(Z)V
    .locals 2

    iget-object v0, p0, Lg40/f;->h:Lec3/h2;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lev/n;->B(ZLec3/h2;Ljava/lang/Object;)V

    return-void
.end method

.method public final c()Lzy/c;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lg40/f;->g:Z

    return v0
.end method

.method public final e()Lec3/f2;
    .locals 2

    new-instance v0, Lg1/u4;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lg1/u4;-><init>(I)V

    iget-object v1, p0, Lg40/f;->p:Ln53/e;

    invoke-static {v1, v0}, Lbi/g;->y(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lec3/f2;
    .locals 2

    new-instance v0, Lg1/u4;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lg1/u4;-><init>(I)V

    iget-object v1, p0, Lg40/f;->p:Ln53/e;

    invoke-static {v1, v0}, Lbi/g;->y(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v0

    return-object v0
.end method

.method public final g()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lg40/f;->r:Lec3/r1;

    return-object v0
.end method

.method public final h(Ljava/util/Map;)V
    .locals 1

    const-string v0, "rawValuesMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lg40/f;->b:Ljava/util/Map;

    return-void
.end method

.method public final i()Lg40/z2;
    .locals 1

    iget-object v0, p0, Lg40/f;->q:Lg40/e;

    return-object v0
.end method

.method public final j()Lg40/i0;
    .locals 1

    iget-object v0, p0, Lg40/f;->d:Lg40/i0;

    return-object v0
.end method
