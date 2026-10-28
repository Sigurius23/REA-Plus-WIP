.class public final Lv00/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lzx/o;

.field public final b:Lwz/l1;

.field public final c:Lh20/y;

.field public final d:Lkotlin/jvm/functions/Function1;

.field public final e:Ly00/d5;

.field public final f:Ly00/u5;

.field public final g:Ly00/j5;

.field public final h:Lj00/i0;

.field public final i:Z

.field public final j:Lg40/z;

.field public final k:Z

.field public final l:Ljava/lang/Boolean;

.field public final m:Lb5/d;

.field public final n:Lb30/m;


# direct methods
.method public constructor <init>(Lzx/o;Lwz/l1;Lh20/y;Lkotlin/jvm/functions/Function1;Ly00/d5;Ly00/u5;Ly00/j5;Lj00/i0;ZLg40/z;ZLjava/lang/Boolean;Lb5/d;Lb30/m;)V
    .locals 1

    const-string v0, "cardAccountRangeRepositoryFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv00/l0;->a:Lzx/o;

    iput-object p2, p0, Lv00/l0;->b:Lwz/l1;

    iput-object p3, p0, Lv00/l0;->c:Lh20/y;

    iput-object p4, p0, Lv00/l0;->d:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lv00/l0;->e:Ly00/d5;

    iput-object p6, p0, Lv00/l0;->f:Ly00/u5;

    iput-object p7, p0, Lv00/l0;->g:Ly00/j5;

    iput-object p8, p0, Lv00/l0;->h:Lj00/i0;

    iput-boolean p9, p0, Lv00/l0;->i:Z

    iput-object p10, p0, Lv00/l0;->j:Lg40/z;

    iput-boolean p11, p0, Lv00/l0;->k:Z

    iput-object p12, p0, Lv00/l0;->l:Ljava/lang/Boolean;

    iput-object p13, p0, Lv00/l0;->m:Lb5/d;

    iput-object p14, p0, Lv00/l0;->n:Lb30/m;

    return-void
.end method


# virtual methods
.method public final a(Lv00/c0;Z)Lv00/m0;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v8, v1, Lv00/c0;->I:Ljava/lang/String;

    iget-object v9, v1, Lv00/c0;->H:Lw30/c;

    iget-object v2, v1, Lv00/c0;->K:Lh20/i1;

    const-string v3, ""

    iget-object v4, v0, Lv00/l0;->e:Ly00/d5;

    sget-object v5, Lm83/z;->w:Lm83/z;

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ly00/d5;->c0()Ljava/util/Map;

    move-result-object v4

    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {v4, v3, v6}, Lup/d;->l(Ljava/util/Map;Ljava/lang/String;Ljava/util/LinkedHashMap;)V

    goto :goto_0

    :cond_0
    move-object v6, v5

    :goto_0
    iget-object v4, v0, Lv00/l0;->g:Ly00/j5;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ly00/j5;->c0()Ljava/util/Map;

    move-result-object v4

    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {v4, v3, v5}, Lup/d;->l(Ljava/util/Map;Ljava/lang/String;Ljava/util/LinkedHashMap;)V

    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-interface {v5}, Ljava/util/Map;->size()I

    move-result v4

    invoke-static {v4}, Lm83/g0;->W(I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    move-object v10, v7

    check-cast v10, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    sget-object v13, Lg40/v1;->w:Lg40/v1;

    const/4 v14, 0x3

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v10 .. v15}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->copy$default(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/lang/String;ZLg40/w1;ILjava/lang/Object;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v7

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v3, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    move-object v5, v3

    :cond_2
    sget-object v3, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getName$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    if-eqz v2, :cond_3

    iget-object v7, v2, Lh20/i1;->y:Ljava/lang/String;

    goto :goto_2

    :cond_3
    const/4 v7, 0x0

    :goto_2
    new-instance v10, Ll83/k;

    invoke-direct {v10, v3, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getEmail$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    if-eqz v2, :cond_4

    iget-object v7, v2, Lh20/i1;->x:Ljava/lang/String;

    goto :goto_3

    :cond_4
    const/4 v7, 0x0

    :goto_3
    new-instance v11, Ll83/k;

    invoke-direct {v11, v3, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getPhone$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    if-eqz v2, :cond_5

    iget-object v7, v2, Lh20/i1;->z:Ljava/lang/String;

    goto :goto_4

    :cond_5
    const/4 v7, 0x0

    :goto_4
    new-instance v12, Ll83/k;

    invoke-direct {v12, v3, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getLine1$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    if-eqz v2, :cond_6

    iget-object v7, v2, Lh20/i1;->w:Lh20/x0;

    if-eqz v7, :cond_6

    iget-object v7, v7, Lh20/x0;->y:Ljava/lang/String;

    goto :goto_5

    :cond_6
    const/4 v7, 0x0

    :goto_5
    new-instance v13, Ll83/k;

    invoke-direct {v13, v3, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getLine2$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    if-eqz v2, :cond_7

    iget-object v7, v2, Lh20/i1;->w:Lh20/x0;

    if-eqz v7, :cond_7

    iget-object v7, v7, Lh20/x0;->z:Ljava/lang/String;

    goto :goto_6

    :cond_7
    const/4 v7, 0x0

    :goto_6
    new-instance v14, Ll83/k;

    invoke-direct {v14, v3, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCity$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    if-eqz v2, :cond_8

    iget-object v7, v2, Lh20/i1;->w:Lh20/x0;

    if-eqz v7, :cond_8

    iget-object v7, v7, Lh20/x0;->w:Ljava/lang/String;

    goto :goto_7

    :cond_8
    const/4 v7, 0x0

    :goto_7
    new-instance v15, Ll83/k;

    invoke-direct {v15, v3, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getState$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    if-eqz v2, :cond_9

    iget-object v7, v2, Lh20/i1;->w:Lh20/x0;

    if-eqz v7, :cond_9

    iget-object v7, v7, Lh20/x0;->F:Ljava/lang/String;

    goto :goto_8

    :cond_9
    const/4 v7, 0x0

    :goto_8
    new-instance v4, Ll83/k;

    invoke-direct {v4, v3, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCountry$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    if-eqz v2, :cond_a

    iget-object v7, v2, Lh20/i1;->w:Lh20/x0;

    if-eqz v7, :cond_a

    iget-object v7, v7, Lh20/x0;->x:Ljava/lang/String;

    :goto_9
    move-object/from16 v16, v4

    goto :goto_a

    :cond_a
    const/4 v7, 0x0

    goto :goto_9

    :goto_a
    new-instance v4, Ll83/k;

    invoke-direct {v4, v3, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getPostalCode$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    if-eqz v2, :cond_b

    iget-object v7, v2, Lh20/i1;->w:Lh20/x0;

    if-eqz v7, :cond_b

    iget-object v7, v7, Lh20/x0;->E:Ljava/lang/String;

    :goto_b
    move-object/from16 v17, v4

    goto :goto_c

    :cond_b
    const/4 v7, 0x0

    goto :goto_b

    :goto_c
    new-instance v4, Ll83/k;

    invoke-direct {v4, v3, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v18, v4

    filled-new-array/range {v10 .. v18}, [Ll83/k;

    move-result-object v3

    invoke-static {v3}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v3

    invoke-static {v3, v6}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v3

    invoke-static {v3, v5}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v4

    iget-object v3, v1, Lv00/c0;->L:Li20/b;

    if-eqz v3, :cond_c

    invoke-static {v3, v2}, Li20/l1;->p(Li20/b;Lh20/i1;)Ljava/util/Map;

    move-result-object v2

    move-object v6, v2

    goto :goto_d

    :cond_c
    const/4 v6, 0x0

    :goto_d
    const/4 v2, 0x0

    iget-object v3, v0, Lv00/l0;->f:Ly00/u5;

    if-eqz v3, :cond_d

    invoke-static {v3}, Ly00/g;->d(Ly00/u5;)Ly00/o;

    move-result-object v3

    if-eqz v3, :cond_d

    sget-object v5, Ly00/o;->z:Ly00/o;

    if-eq v3, v5, :cond_d

    const/4 v2, 0x1

    :cond_d
    move v7, v2

    iget-object v10, v1, Lv00/c0;->x:Lh20/l1;

    iget-object v13, v1, Lv00/c0;->X:Lux/a;

    iget-object v14, v1, Lv00/c0;->Y:Lux/b;

    new-instance v1, Lv00/m0;

    iget-object v2, v0, Lv00/l0;->a:Lzx/o;

    iget-object v3, v0, Lv00/l0;->b:Lwz/l1;

    iget-object v5, v0, Lv00/l0;->h:Lj00/i0;

    iget-object v12, v0, Lv00/l0;->d:Lkotlin/jvm/functions/Function1;

    iget-boolean v15, v0, Lv00/l0;->i:Z

    iget-object v11, v0, Lv00/l0;->j:Lg40/z;

    move-object/from16 p1, v1

    iget-object v1, v0, Lv00/l0;->c:Lh20/y;

    move-object/from16 v17, v1

    iget-boolean v1, v0, Lv00/l0;->k:Z

    move/from16 v18, v1

    iget-object v1, v0, Lv00/l0;->l:Ljava/lang/Boolean;

    move-object/from16 v19, v1

    iget-object v1, v0, Lv00/l0;->m:Lb5/d;

    move-object/from16 v20, v1

    iget-object v1, v0, Lv00/l0;->n:Lb30/m;

    move-object/from16 v21, v1

    move-object/from16 v16, v11

    move-object/from16 v1, p1

    move/from16 v11, p2

    invoke-direct/range {v1 .. v21}, Lv00/m0;-><init>(Lzx/o;Lwz/l1;Ljava/util/LinkedHashMap;Lj00/i0;Ljava/util/Map;ZLjava/lang/String;Lw30/c;Lh20/l1;ZLkotlin/jvm/functions/Function1;Lux/a;Lux/b;ZLg40/z;Lh20/y;ZLjava/lang/Boolean;Lb5/d;Lb30/m;)V

    return-object v1
.end method
