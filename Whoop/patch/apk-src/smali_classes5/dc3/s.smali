.class public final Ldc3/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldc3/s;->w:I

    iput-object p1, p0, Ldc3/s;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Llb3/k0;Llb3/q0;Z)V
    .locals 0

    const/16 p1, 0x9

    iput p1, p0, Ldc3/s;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Ldc3/s;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v1, p0

    iget v0, v1, Ldc3/s;->w:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    packed-switch v0, :pswitch_data_0

    move-object/from16 v0, p1

    check-cast v0, Lz1/j;

    sget-object v2, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    sget-wide v4, Lz1/l;->e:J

    int-to-long v6, v3

    add-long/2addr v6, v4

    sput-wide v6, Lz1/l;->e:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    iget-object v2, v1, Ldc3/s;->x:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    new-instance v3, Lz1/e;

    invoke-direct {v3, v4, v5, v0, v2}, Lz1/e;-><init>(JLz1/j;Lkotlin/jvm/functions/Function1;)V

    return-object v3

    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0

    :pswitch_0
    iget-object v0, v1, Ldc3/s;->x:Ljava/lang/Object;

    check-cast v0, Lu93/e0;

    move-object/from16 v2, p1

    check-cast v2, Lva3/e;

    const-string v3, "fqName"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v0, Lu93/e0;->G:Lu93/j0;

    iget-object v4, v0, Lu93/e0;->z:Lkb3/k;

    check-cast v3, Lu93/i0;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "storageManager"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lu93/a0;

    invoke-direct {v3, v0, v2, v4}, Lu93/a0;-><init>(Lu93/e0;Lva3/e;Lkb3/k;)V

    return-object v3

    :pswitch_1
    move-object/from16 v0, p1

    check-cast v0, Lmb3/f;

    iget-object v2, v1, Ldc3/s;->x:Ljava/lang/Object;

    check-cast v2, Lu93/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v2, Lu93/a;->x:Lu93/b;

    iget-object v0, v0, Lu93/b;->x:Lkb3/i;

    invoke-virtual {v0}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llb3/c0;

    return-object v0

    :pswitch_2
    iget-object v0, v1, Ldc3/s;->x:Ljava/lang/Object;

    check-cast v0, Lq93/p;

    move-object/from16 v3, p1

    check-cast v3, Ll83/k;

    const-string v4, "<destruct>"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v3, Ll83/k;->w:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v3, v3, Ll83/k;->x:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v0, v0, Lq93/p;->a:Lu93/e0;

    iget-object v0, v0, Lu93/e0;->E:Lo93/h;

    const-string v5, "\'"

    const-string v6, "()\' member of List is redundant in Kotlin and might be removed soon. Please use \'"

    const-string v7, "()\' stdlib extension instead"

    invoke-static {v5, v4, v6, v3, v7}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "()"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v5, "HIDDEN"

    invoke-static {v0, v4, v3, v5}, Ls93/e;->a(Lo93/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ls93/l;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v0, Ls93/g;->a:Ls93/f;

    goto :goto_0

    :cond_0
    new-instance v3, Ls93/j;

    invoke-direct {v3, v0, v2}, Ls93/j;-><init>(Ljava/util/List;I)V

    move-object v0, v3

    :goto_0
    return-object v0

    :pswitch_3
    iget-object v0, v1, Ldc3/s;->x:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/internal/k0;

    move-object/from16 v3, p1

    check-cast v3, Lw93/b;

    const-string v4, "kotlinClass"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    new-instance v7, Lxl/a;

    invoke-direct {v7, v0, v4, v5}, Lxl/a;-><init>(Lcom/google/crypto/tink/internal/k0;Ljava/util/HashMap;Ljava/util/HashMap;)V

    iget-object v0, v3, Lw93/b;->a:Ljava/lang/Class;

    const-string v3, "getDeclaredAnnotations(...)"

    const-string v8, "klass"

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v8

    const-string v9, "getDeclaredMethods(...)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v9, v8

    move v10, v2

    :goto_1
    if-ge v10, v9, :cond_5

    aget-object v11, v8, v10

    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v12

    invoke-static {v11}, Ls93/h;->t(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v7, v12, v13}, Lxl/a;->J(Lva3/h;Ljava/lang/String;)Loa3/b;

    move-result-object v12

    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v13

    invoke-static {v13, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v14, v13

    move v15, v2

    :goto_2
    if-ge v15, v14, :cond_1

    aget-object v2, v13, v15

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v12, v2}, Lva3/b;->h(Loa3/p;Ljava/lang/annotation/Annotation;)V

    add-int/lit8 v15, v15, 0x1

    const/4 v2, 0x0

    goto :goto_2

    :cond_1
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object v2

    const-string v11, "getParameterAnnotations(...)"

    invoke-static {v2, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, [[Ljava/lang/annotation/Annotation;

    array-length v11, v2

    const/4 v13, 0x0

    :goto_3
    if-ge v13, v11, :cond_4

    aget-object v14, v2, v13

    invoke-static {v14}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    array-length v15, v14

    move-object/from16 p1, v0

    const/4 v0, 0x0

    :goto_4
    if-ge v0, v15, :cond_3

    move/from16 v16, v0

    aget-object v0, v14, v16

    invoke-static {v0}, Ljc/x;->K(Ljava/lang/annotation/Annotation;)Lj93/d;

    move-result-object v17

    move-object/from16 v18, v2

    invoke-static/range {v17 .. v17}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object v2

    move-object/from16 v17, v8

    invoke-static {v2}, Lx93/c;->a(Ljava/lang/Class;)Lva3/c;

    move-result-object v8

    move/from16 v19, v9

    new-instance v9, Lw93/a;

    invoke-direct {v9, v0}, Lw93/a;-><init>(Ljava/lang/annotation/Annotation;)V

    invoke-virtual {v12, v13, v8, v9}, Loa3/b;->X(ILva3/c;Lw93/a;)Lm63/d;

    move-result-object v8

    if-eqz v8, :cond_2

    invoke-static {v8, v0, v2}, Lva3/b;->i(Loa3/n;Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V

    :cond_2
    add-int/lit8 v0, v16, 0x1

    move-object/from16 v8, v17

    move-object/from16 v2, v18

    move/from16 v9, v19

    goto :goto_4

    :cond_3
    move-object/from16 v18, v2

    move-object/from16 v17, v8

    move/from16 v19, v9

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v0, p1

    goto :goto_3

    :cond_4
    move-object/from16 p1, v0

    move-object/from16 v17, v8

    move/from16 v19, v9

    invoke-virtual {v12}, Lgm/r;->V()V

    add-int/lit8 v10, v10, 0x1

    const/4 v2, 0x0

    goto/16 :goto_1

    :cond_5
    move-object/from16 p1, v0

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v0

    const-string v2, "getDeclaredConstructors(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v2, v0

    const/4 v8, 0x0

    :goto_5
    if-ge v8, v2, :cond_b

    aget-object v9, v0, v8

    sget-object v10, Lva3/j;->e:Lva3/h;

    invoke-static {v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v9}, Ls93/h;->d(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7, v10, v11}, Lxl/a;->J(Lva3/h;Ljava/lang/String;)Loa3/b;

    move-result-object v10

    invoke-virtual {v9}, Ljava/lang/reflect/Constructor;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v11

    invoke-static {v11, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v12, v11

    const/4 v13, 0x0

    :goto_6
    if-ge v13, v12, :cond_6

    aget-object v14, v11, v13

    invoke-static {v14}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v10, v14}, Lva3/b;->h(Loa3/p;Ljava/lang/annotation/Annotation;)V

    add-int/lit8 v13, v13, 0x1

    goto :goto_6

    :cond_6
    invoke-virtual {v9}, Ljava/lang/reflect/Constructor;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object v11

    invoke-static {v11}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    array-length v12, v11

    if-nez v12, :cond_8

    :cond_7
    move-object/from16 v16, v0

    move/from16 v19, v2

    move/from16 v18, v8

    goto :goto_9

    :cond_8
    invoke-virtual {v9}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v9

    array-length v9, v9

    array-length v12, v11

    sub-int/2addr v9, v12

    array-length v12, v11

    const/4 v13, 0x0

    :goto_7
    if-ge v13, v12, :cond_7

    aget-object v14, v11, v13

    invoke-static {v14}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    array-length v15, v14

    move-object/from16 v16, v0

    const/4 v0, 0x0

    :goto_8
    if-ge v0, v15, :cond_a

    move/from16 v17, v0

    aget-object v0, v14, v17

    invoke-static {v0}, Ljc/x;->K(Ljava/lang/annotation/Annotation;)Lj93/d;

    move-result-object v18

    move/from16 v19, v2

    invoke-static/range {v18 .. v18}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object v2

    move/from16 v18, v8

    add-int v8, v13, v9

    move/from16 v20, v9

    invoke-static {v2}, Lx93/c;->a(Ljava/lang/Class;)Lva3/c;

    move-result-object v9

    move-object/from16 v21, v11

    new-instance v11, Lw93/a;

    invoke-direct {v11, v0}, Lw93/a;-><init>(Ljava/lang/annotation/Annotation;)V

    invoke-virtual {v10, v8, v9, v11}, Loa3/b;->X(ILva3/c;Lw93/a;)Lm63/d;

    move-result-object v8

    if-eqz v8, :cond_9

    invoke-static {v8, v0, v2}, Lva3/b;->i(Loa3/n;Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V

    :cond_9
    add-int/lit8 v0, v17, 0x1

    move/from16 v8, v18

    move/from16 v2, v19

    move/from16 v9, v20

    move-object/from16 v11, v21

    goto :goto_8

    :cond_a
    move/from16 v19, v2

    move/from16 v18, v8

    move/from16 v20, v9

    move-object/from16 v21, v11

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v0, v16

    goto :goto_7

    :goto_9
    invoke-virtual {v10}, Lgm/r;->V()V

    add-int/lit8 v8, v18, 0x1

    move-object/from16 v0, v16

    move/from16 v2, v19

    goto/16 :goto_5

    :cond_b
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    const-string v2, "getDeclaredFields(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v2, v0

    const/4 v8, 0x0

    :goto_a
    if-ge v8, v2, :cond_d

    aget-object v9, v0, v8

    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v10

    invoke-static {v9}, Ls93/h;->l(Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7, v10, v11}, Lxl/a;->I(Lva3/h;Ljava/lang/String;)Lgm/r;

    move-result-object v10

    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v9

    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v11, v9

    const/4 v12, 0x0

    :goto_b
    if-ge v12, v11, :cond_c

    aget-object v13, v9, v12

    invoke-static {v13}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v10, v13}, Lva3/b;->h(Loa3/p;Ljava/lang/annotation/Annotation;)V

    add-int/lit8 v12, v12, 0x1

    goto :goto_b

    :cond_c
    invoke-virtual {v10}, Lgm/r;->V()V

    add-int/lit8 v8, v8, 0x1

    goto :goto_a

    :cond_d
    new-instance v0, Loa3/d;

    invoke-direct {v0, v4, v5, v6}, Loa3/d;-><init>(Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;)V

    return-object v0

    :pswitch_4
    move-object/from16 v0, p1

    check-cast v0, Lva3/h;

    iget-object v2, v1, Ldc3/s;->x:Ljava/lang/Object;

    check-cast v2, Lo93/h;

    invoke-virtual {v2}, Lo93/h;->l()Lu93/e0;

    move-result-object v2

    sget-object v3, Lo93/n;->k:Lva3/e;

    invoke-virtual {v2, v3}, Lu93/e0;->F(Lva3/e;)Lr93/k0;

    move-result-object v2

    check-cast v2, Lu93/a0;

    iget-object v2, v2, Lu93/a0;->H:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/k;

    if-eqz v2, :cond_10

    sget-object v4, Lz93/c;->w:Lz93/c;

    invoke-virtual {v2, v0, v4}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/a;->getContributedClassifier(Lva3/h;Lz93/a;)Lr93/h;

    move-result-object v2

    if-eqz v2, :cond_f

    instance-of v3, v2, Lr93/e;

    if-eqz v3, :cond_e

    check-cast v2, Lr93/e;

    return-object v2

    :cond_e
    new-instance v3, Ljava/lang/AssertionError;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Must be a class descriptor "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", but was "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v3

    :cond_f
    new-instance v2, Ljava/lang/AssertionError;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Built-in class "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Lva3/e;->a(Lva3/h;)Lva3/e;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " is not found"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v2

    :cond_10
    const/16 v0, 0xb

    invoke-static {v0}, Lo93/h;->a(I)V

    throw v4

    :pswitch_5
    iget-object v0, v1, Ldc3/s;->x:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/internal/l0;

    move-object/from16 v2, p1

    check-cast v2, Llb3/t0;

    invoke-virtual {v2}, Llb3/t0;->b()Lr93/x0;

    move-result-object v4

    invoke-virtual {v2}, Llb3/t0;->a()Lka3/a;

    move-result-object v2

    invoke-virtual {v2}, Lka3/a;->e()Ljava/util/Set;

    move-result-object v5

    if-eqz v5, :cond_11

    invoke-interface {v4}, Lr93/x0;->a()Lr93/x0;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-virtual {v0, v2}, Lcom/google/crypto/tink/internal/l0;->N(Lka3/a;)Llb3/f1;

    move-result-object v0

    goto/16 :goto_f

    :cond_11
    invoke-interface {v4}, Lr93/h;->i()Llb3/c0;

    move-result-object v6

    const-string v7, "getDefaultType(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6, v5}, Lio/sentry/config/a;->v(Llb3/c0;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object v6

    const/16 v7, 0xa

    invoke-static {v6, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-static {v7}, Lm83/g0;->W(I)I

    move-result v7

    const/16 v8, 0x10

    if-ge v7, v8, :cond_12

    move v7, v8

    :cond_12
    new-instance v8, Ljava/util/LinkedHashMap;

    invoke-direct {v8, v7}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_c
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_15

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lr93/x0;

    if-eqz v5, :cond_14

    invoke-interface {v5, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_13

    goto :goto_d

    :cond_13
    invoke-static {v7, v2}, Llb3/d1;->k(Lr93/x0;Lka3/a;)Llb3/u0;

    move-result-object v9

    goto :goto_e

    :cond_14
    :goto_d
    invoke-virtual {v2, v4}, Lka3/a;->j(Lr93/x0;)Lka3/a;

    move-result-object v9

    invoke-virtual {v0, v7, v9}, Lcom/google/crypto/tink/internal/l0;->P(Lr93/x0;Lka3/a;)Llb3/y;

    move-result-object v9

    invoke-static {v7, v2, v0, v9}, Ljc/b;->k(Lr93/x0;Lka3/a;Lcom/google/crypto/tink/internal/l0;Llb3/y;)Llb3/u0;

    move-result-object v9

    :goto_e
    invoke-interface {v7}, Lr93/x0;->e()Llb3/q0;

    move-result-object v7

    invoke-interface {v8, v7, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_c

    :cond_15
    new-instance v5, Llb3/r0;

    invoke-direct {v5, v8}, Llb3/r0;-><init>(Ljava/util/Map;)V

    new-instance v6, Llb3/a1;

    invoke-direct {v6, v5}, Llb3/a1;-><init>(Llb3/y0;)V

    invoke-interface {v4}, Lr93/x0;->getUpperBounds()Ljava/util/List;

    move-result-object v4

    const-string v5, "getUpperBounds(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v6, v4, v2}, Lcom/google/crypto/tink/internal/l0;->k0(Llb3/a1;Ljava/util/List;Lka3/a;)Ln83/i;

    move-result-object v4

    iget-object v5, v4, Ln83/i;->w:Ln83/f;

    invoke-virtual {v5}, Ln83/f;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_17

    iget-object v0, v4, Ln83/i;->w:Ln83/f;

    iget v0, v0, Ln83/f;->I:I

    if-ne v0, v3, :cond_16

    invoke-static {v4}, Lm83/s;->o1(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llb3/y;

    goto :goto_f

    :cond_16
    const-string v0, "Should only be one computed upper bound if no need to intersect all bounds"

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_17
    invoke-virtual {v0, v2}, Lcom/google/crypto/tink/internal/l0;->N(Lka3/a;)Llb3/f1;

    move-result-object v0

    :goto_f
    return-object v0

    :pswitch_6
    iget-object v0, v1, Ldc3/s;->x:Ljava/lang/Object;

    check-cast v0, Llb3/q0;

    move-object/from16 v2, p1

    check-cast v2, Lmb3/f;

    const-string v3, "refiner"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Llb3/q0;->d()Lr93/h;

    return-object v4

    :pswitch_7
    iget-object v0, v1, Ldc3/s;->x:Ljava/lang/Object;

    check-cast v0, Llb3/f;

    move-object/from16 v2, p1

    check-cast v2, Llb3/e;

    const-string v3, "supertypes"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Llb3/f;->g()Lr93/v0;

    move-result-object v3

    iget-object v5, v2, Llb3/e;->a:Ljava/util/Collection;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "superTypes"

    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1a

    invoke-virtual {v0}, Llb3/f;->e()Llb3/y;

    move-result-object v3

    if-eqz v3, :cond_18

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto :goto_10

    :cond_18
    move-object v3, v4

    :goto_10
    if-nez v3, :cond_19

    sget-object v3, Lm83/y;->w:Lm83/y;

    :cond_19
    move-object v5, v3

    check-cast v5, Ljava/util/Collection;

    :cond_1a
    instance-of v3, v5, Ljava/util/List;

    if-eqz v3, :cond_1b

    move-object v4, v5

    check-cast v4, Ljava/util/List;

    :cond_1b
    if-nez v4, :cond_1c

    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v5}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v4

    :cond_1c
    invoke-virtual {v0, v4}, Llb3/f;->j(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    const-string v3, "<set-?>"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v2, Llb3/e;->b:Ljava/util/List;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_8
    iget-object v0, v1, Ldc3/s;->x:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lja3/i;

    move-object/from16 v0, p1

    check-cast v0, Lmb3/f;

    const-string v2, "it"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lja3/o;

    iget-object v5, v6, Lja3/i;->J:Lzt/q;

    iget-object v7, v6, Lja3/i;->H:Lx93/n;

    iget-object v0, v6, Lja3/i;->I:Lr93/e;

    if-eqz v0, :cond_1d

    move v8, v3

    goto :goto_11

    :cond_1d
    const/4 v8, 0x0

    :goto_11
    iget-object v9, v6, Lja3/i;->Q:Lja3/o;

    invoke-direct/range {v4 .. v9}, Lja3/o;-><init>(Lzt/q;Lr93/e;Lx93/n;ZLja3/o;)V

    return-object v4

    :pswitch_9
    iget-object v0, v1, Ldc3/s;->x:Ljava/lang/Object;

    check-cast v0, Lia3/e;

    move-object/from16 v2, p1

    check-cast v2, Lx93/b0;

    const-string v3, "typeParameter"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v0, Lia3/e;->d:Ljava/util/LinkedHashMap;

    iget-object v5, v0, Lia3/e;->b:Lr93/l;

    invoke-virtual {v3, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    if-eqz v3, :cond_1e

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    new-instance v4, Lja3/f0;

    iget-object v6, v0, Lia3/e;->a:Lzt/q;

    const-string v7, "<this>"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Lzt/q;

    iget-object v8, v6, Lzt/q;->x:Ljava/lang/Object;

    check-cast v8, Lia3/a;

    iget-object v6, v6, Lzt/q;->z:Ljava/lang/Object;

    invoke-direct {v7, v8, v0, v6}, Lzt/q;-><init>(Lia3/a;Lia3/f;Ll83/h;)V

    invoke-interface {v5}, Ls93/a;->getAnnotations()Ls93/i;

    move-result-object v6

    invoke-static {v7, v6}, Lge3/g;->o(Lzt/q;Ls93/i;)Lzt/q;

    move-result-object v6

    iget v0, v0, Lia3/e;->c:I

    add-int/2addr v0, v3

    invoke-direct {v4, v6, v2, v0, v5}, Lja3/f0;-><init>(Lzt/q;Lx93/b0;ILr93/l;)V

    :cond_1e
    return-object v4

    :pswitch_a
    iget-object v0, v1, Ldc3/s;->x:Ljava/lang/Object;

    check-cast v0, Lia3/c;

    move-object/from16 v2, p1

    check-cast v2, Lx93/d;

    const-string v3, "annotation"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lga3/c;->a:Lva3/h;

    iget-object v3, v0, Lia3/c;->w:Lzt/q;

    iget-boolean v0, v0, Lia3/c;->y:Z

    invoke-static {v2, v3, v0}, Lga3/c;->b(Lx93/d;Lzt/q;Z)Lha3/g;

    move-result-object v0

    return-object v0

    :pswitch_b
    iget-object v0, v1, Ldc3/s;->x:Ljava/lang/Object;

    check-cast v0, Lhb3/g;

    move-object/from16 v2, p1

    check-cast v2, Lhb3/f;

    const-string v3, "key"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v2, Lhb3/f;->a:Lva3/c;

    iget-object v5, v0, Lhb3/g;->a:Lhb3/i;

    iget-object v6, v5, Lhb3/i;->k:Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1f
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_20

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lt93/c;

    invoke-interface {v7, v3}, Lt93/c;->c(Lva3/c;)Lr93/e;

    move-result-object v7

    if-eqz v7, :cond_1f

    move-object v4, v7

    goto/16 :goto_15

    :cond_20
    sget-object v6, Lhb3/g;->c:Ljava/util/Set;

    invoke-interface {v6, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_21

    goto/16 :goto_15

    :cond_21
    iget-object v2, v2, Lhb3/f;->b:Lhb3/d;

    if-nez v2, :cond_22

    iget-object v2, v5, Lhb3/i;->d:Lhb3/e;

    invoke-interface {v2, v3}, Lhb3/e;->x(Lva3/c;)Lhb3/d;

    move-result-object v2

    if-nez v2, :cond_22

    goto/16 :goto_15

    :cond_22
    iget-object v7, v2, Lhb3/d;->a:Lsa3/f;

    iget-object v12, v2, Lhb3/d;->b:Lqa3/k;

    iget-object v10, v2, Lhb3/d;->c:Lsa3/a;

    iget-object v2, v2, Lhb3/d;->d:Lr93/s0;

    invoke-virtual {v3}, Lva3/c;->e()Lva3/c;

    move-result-object v6

    if-eqz v6, :cond_26

    invoke-virtual {v0, v6, v4}, Lhb3/g;->a(Lva3/c;Lhb3/d;)Lr93/e;

    move-result-object v0

    instance-of v5, v0, Ljb3/h;

    if-eqz v5, :cond_23

    check-cast v0, Ljb3/h;

    goto :goto_12

    :cond_23
    move-object v0, v4

    :goto_12
    if-nez v0, :cond_24

    goto/16 :goto_15

    :cond_24
    invoke-virtual {v3}, Lva3/c;->f()Lva3/h;

    move-result-object v3

    invoke-virtual {v0}, Ljb3/h;->X()Ljb3/g;

    move-result-object v5

    invoke-virtual {v5}, Ljb3/q;->f()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_25

    goto :goto_15

    :cond_25
    iget-object v0, v0, Ljb3/h;->L:Lhb3/k;

    goto :goto_14

    :cond_26
    iget-object v0, v5, Lhb3/i;->f:Lr93/j0;

    iget-object v6, v3, Lva3/c;->a:Lva3/e;

    invoke-static {v0, v6}, Lj93/l0;->R(Lr93/j0;Lva3/e;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_28

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Lr93/g0;

    instance-of v9, v8, Lib3/c;

    if-eqz v9, :cond_29

    check-cast v8, Lib3/c;

    invoke-virtual {v3}, Lva3/c;->f()Lva3/h;

    move-result-object v9

    invoke-virtual {v8}, Lib3/c;->u()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v8

    check-cast v8, Ljb3/q;

    invoke-virtual {v8}, Ljb3/q;->f()Ljava/util/Set;

    move-result-object v8

    invoke-interface {v8, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_27

    goto :goto_13

    :cond_28
    move-object v6, v4

    :cond_29
    :goto_13
    check-cast v6, Lr93/g0;

    if-nez v6, :cond_2a

    goto :goto_15

    :cond_2a
    new-instance v8, Lsa3/h;

    iget-object v0, v12, Lqa3/k;->a0:Lqa3/c1;

    const-string v3, "getTypeTable(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v8, v0}, Lsa3/h;-><init>(Lqa3/c1;)V

    sget-object v0, Lsa3/j;->b:Lsa3/j;

    iget-object v0, v12, Lqa3/k;->c0:Lqa3/j1;

    const-string v3, "getVersionRequirementTable(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lpf/c;->r(Lqa3/j1;)Lsa3/j;

    move-result-object v9

    const/4 v11, 0x0

    invoke-virtual/range {v5 .. v11}, Lhb3/i;->a(Lr93/g0;Lsa3/f;Lsa3/h;Lsa3/j;Lsa3/a;Ljb3/j;)Lhb3/k;

    move-result-object v0

    :goto_14
    new-instance v6, Ljb3/h;

    move-object v11, v2

    move-object v9, v7

    move-object v8, v12

    move-object v7, v0

    invoke-direct/range {v6 .. v11}, Ljb3/h;-><init>(Lhb3/k;Lqa3/k;Lsa3/f;Lsa3/a;Lr93/s0;)V

    move-object v4, v6

    :goto_15
    return-object v4

    :pswitch_c
    iget-object v0, v1, Ldc3/s;->x:Ljava/lang/Object;

    check-cast v0, Lq93/r;

    move-object/from16 v2, p1

    check-cast v2, Lva3/e;

    const-string v3, "fqName"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lq93/r;->c(Lva3/e;)Lib3/c;

    move-result-object v2

    if-eqz v2, :cond_2c

    iget-object v0, v0, Lq93/r;->c:Lhb3/i;

    if-eqz v0, :cond_2b

    invoke-virtual {v2, v0}, Lib3/c;->K0(Lhb3/i;)V

    move-object v4, v2

    goto :goto_16

    :cond_2b
    const-string v0, "components"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_2c
    :goto_16
    return-object v4

    :pswitch_d
    iget-object v0, v1, Ldc3/s;->x:Ljava/lang/Object;

    check-cast v0, Lwe/o;

    move-object/from16 v2, p1

    check-cast v2, Lva3/e;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lwe/o;->w:Ljava/lang/Object;

    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2d
    :goto_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_30

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lva3/e;

    invoke-virtual {v2, v6}, Lva3/e;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2f

    const-string v7, "packageName"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, v2, Lva3/e;->a:Lva3/f;

    invoke-virtual {v7}, Lva3/f;->c()Z

    move-result v7

    if-eqz v7, :cond_2e

    move-object v7, v4

    goto :goto_18

    :cond_2e
    invoke-virtual {v2}, Lva3/e;->b()Lva3/e;

    move-result-object v7

    :goto_18
    invoke-static {v7, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2d

    :cond_2f
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v3, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_17

    :cond_30
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_31

    goto :goto_19

    :cond_31
    move-object v3, v4

    :goto_19
    if-nez v3, :cond_32

    goto :goto_1b

    :cond_32
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_33

    move-object v3, v4

    goto :goto_1a

    :cond_33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_34

    goto :goto_1a

    :cond_34
    move-object v5, v3

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lva3/e;

    invoke-static {v5, v2}, Lva3/g;->m(Lva3/e;Lva3/e;)Lva3/e;

    move-result-object v5

    iget-object v5, v5, Lva3/e;->a:Lva3/f;

    iget-object v5, v5, Lva3/f;->a:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    :cond_35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Ljava/util/Map$Entry;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lva3/e;

    invoke-static {v7, v2}, Lva3/g;->m(Lva3/e;Lva3/e;)Lva3/e;

    move-result-object v7

    iget-object v7, v7, Lva3/e;->a:Lva3/f;

    iget-object v7, v7, Lva3/f;->a:Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    if-le v5, v7, :cond_36

    move-object v3, v6

    move v5, v7

    :cond_36
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_35

    :goto_1a
    check-cast v3, Ljava/util/Map$Entry;

    if-eqz v3, :cond_37

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    :cond_37
    :goto_1b
    return-object v4

    :pswitch_e
    iget-object v0, v1, Ldc3/s;->x:Ljava/lang/Object;

    check-cast v0, Ll83/g;

    move-object/from16 v2, p1

    check-cast v2, Lva3/e;

    const-string v3, "it"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lfa3/r;->a:Lva3/e;

    sget-object v3, Lfa3/a0;->i:Lfa3/z;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lfa3/z;->b:Lwe/o;

    const-string v4, "configuredReportLevels"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v3, Lwe/o;->x:Ljava/lang/Object;

    check-cast v3, Landroidx/lifecycle/h2;

    invoke-virtual {v3, v2}, Landroidx/lifecycle/h2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lfa3/b0;

    if-eqz v3, :cond_38

    goto :goto_1c

    :cond_38
    sget-object v3, Lfa3/r;->c:Lwe/o;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v3, Lwe/o;->x:Ljava/lang/Object;

    check-cast v3, Landroidx/lifecycle/h2;

    invoke-virtual {v3, v2}, Landroidx/lifecycle/h2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfa3/s;

    if-nez v2, :cond_39

    sget-object v3, Lfa3/b0;->x:Lfa3/b0;

    goto :goto_1c

    :cond_39
    iget-object v3, v2, Lfa3/s;->b:Ll83/g;

    if-eqz v3, :cond_3a

    iget v3, v3, Ll83/g;->y:I

    iget v0, v0, Ll83/g;->y:I

    sub-int/2addr v3, v0

    if-gtz v3, :cond_3a

    iget-object v3, v2, Lfa3/s;->c:Lfa3/b0;

    goto :goto_1c

    :cond_3a
    iget-object v3, v2, Lfa3/s;->a:Lfa3/b0;

    :goto_1c
    return-object v3

    :pswitch_f
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Throwable;

    iget-object v0, v1, Ldc3/s;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/m;

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, v2}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
