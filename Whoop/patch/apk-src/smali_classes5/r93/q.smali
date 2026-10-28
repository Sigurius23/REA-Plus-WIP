.class public abstract Lr93/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lr93/p;

.field public static final b:Lr93/p;

.field public static final c:Lr93/p;

.field public static final d:Lr93/p;

.field public static final e:Lr93/p;

.field public static final f:Lr93/p;

.field public static final g:Lr93/p;

.field public static final h:Lr93/p;

.field public static final i:Lr93/p;

.field public static final j:Lr93/p;

.field public static final k:Lr93/v0;

.field public static final l:Lr93/v0;

.field public static final m:Lr93/v0;

.field public static final n:Lrb3/o;

.field public static final o:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 17

    new-instance v0, Lr93/p;

    sget-object v1, Lr93/g1;->c:Lr93/g1;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lr93/p;-><init>(Lr93/m1;I)V

    sput-object v0, Lr93/q;->a:Lr93/p;

    new-instance v1, Lr93/p;

    sget-object v3, Lr93/h1;->c:Lr93/h1;

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lr93/p;-><init>(Lr93/m1;I)V

    sput-object v1, Lr93/q;->b:Lr93/p;

    new-instance v3, Lr93/p;

    sget-object v5, Lr93/i1;->c:Lr93/i1;

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lr93/p;-><init>(Lr93/m1;I)V

    sput-object v3, Lr93/q;->c:Lr93/p;

    new-instance v5, Lr93/p;

    sget-object v7, Lr93/d1;->c:Lr93/d1;

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lr93/p;-><init>(Lr93/m1;I)V

    sput-object v5, Lr93/q;->d:Lr93/p;

    new-instance v7, Lr93/p;

    sget-object v9, Lr93/j1;->c:Lr93/j1;

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lr93/p;-><init>(Lr93/m1;I)V

    sput-object v7, Lr93/q;->e:Lr93/p;

    new-instance v9, Lr93/p;

    sget-object v11, Lr93/f1;->c:Lr93/f1;

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lr93/p;-><init>(Lr93/m1;I)V

    sput-object v9, Lr93/q;->f:Lr93/p;

    new-instance v11, Lr93/p;

    sget-object v12, Lr93/c1;->c:Lr93/c1;

    const/4 v13, 0x6

    invoke-direct {v11, v12, v13}, Lr93/p;-><init>(Lr93/m1;I)V

    sput-object v11, Lr93/q;->g:Lr93/p;

    new-instance v12, Lr93/p;

    sget-object v14, Lr93/e1;->c:Lr93/e1;

    const/4 v15, 0x7

    invoke-direct {v12, v14, v15}, Lr93/p;-><init>(Lr93/m1;I)V

    sput-object v12, Lr93/q;->h:Lr93/p;

    new-instance v14, Lr93/p;

    sget-object v15, Lr93/k1;->c:Lr93/k1;

    move/from16 v16, v2

    const/16 v2, 0x8

    invoke-direct {v14, v15, v2}, Lr93/p;-><init>(Lr93/m1;I)V

    sput-object v14, Lr93/q;->i:Lr93/p;

    new-array v2, v10, [Lr93/r;

    aput-object v0, v2, v16

    aput-object v1, v2, v4

    aput-object v5, v2, v6

    aput-object v9, v2, v8

    invoke-static {v2}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, v13}, Ljava/util/HashMap;-><init>(I)V

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v2, v1, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, v0, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v2, v5, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, v3, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v2, v7, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    sput-object v7, Lr93/q;->j:Lr93/p;

    new-instance v2, Lr93/v0;

    invoke-direct {v2, v4}, Lr93/v0;-><init>(I)V

    sput-object v2, Lr93/q;->k:Lr93/v0;

    new-instance v2, Lr93/v0;

    invoke-direct {v2, v6}, Lr93/v0;-><init>(I)V

    sput-object v2, Lr93/q;->l:Lr93/v0;

    new-instance v2, Lr93/v0;

    invoke-direct {v2, v8}, Lr93/v0;-><init>(I)V

    sput-object v2, Lr93/q;->m:Lr93/v0;

    move/from16 v2, v16

    :try_start_0
    new-array v2, v2, [Lrb3/o;

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lrb3/o;

    goto :goto_0

    :cond_0
    sget-object v2, Lrb3/o;->a:Lrb3/o;

    :goto_0
    sput-object v2, Lr93/q;->n:Lrb3/o;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    sput-object v2, Lr93/q;->o:Ljava/util/HashMap;

    invoke-static {v0}, Lr93/q;->f(Lr93/o;)V

    invoke-static {v1}, Lr93/q;->f(Lr93/o;)V

    invoke-static {v3}, Lr93/q;->f(Lr93/o;)V

    invoke-static {v5}, Lr93/q;->f(Lr93/o;)V

    invoke-static {v7}, Lr93/q;->f(Lr93/o;)V

    invoke-static {v9}, Lr93/q;->f(Lr93/o;)V

    invoke-static {v11}, Lr93/q;->f(Lr93/o;)V

    invoke-static {v12}, Lr93/q;->f(Lr93/o;)V

    invoke-static {v14}, Lr93/q;->f(Lr93/o;)V

    return-void

    :catchall_0
    move-exception v0

    new-instance v1, Ljava/util/ServiceConfigurationError;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/util/ServiceConfigurationError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static synthetic a(I)V
    .locals 8

    const/16 v0, 0x10

    if-eq p0, v0, :cond_0

    const-string v1, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    const-string v1, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v2, 0x3

    const/4 v3, 0x2

    if-eq p0, v0, :cond_1

    move v4, v2

    goto :goto_1

    :cond_1
    move v4, v3

    :goto_1
    new-array v4, v4, [Ljava/lang/Object;

    const-string v5, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities"

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eq p0, v6, :cond_2

    if-eq p0, v2, :cond_2

    const/4 v2, 0x5

    if-eq p0, v2, :cond_2

    const/4 v2, 0x7

    if-eq p0, v2, :cond_2

    packed-switch p0, :pswitch_data_0

    const-string v2, "what"

    aput-object v2, v4, v7

    goto :goto_2

    :pswitch_0
    aput-object v5, v4, v7

    goto :goto_2

    :pswitch_1
    const-string v2, "visibility"

    aput-object v2, v4, v7

    goto :goto_2

    :pswitch_2
    const-string v2, "second"

    aput-object v2, v4, v7

    goto :goto_2

    :pswitch_3
    const-string v2, "first"

    aput-object v2, v4, v7

    goto :goto_2

    :cond_2
    :pswitch_4
    const-string v2, "from"

    aput-object v2, v4, v7

    :goto_2
    const-string v2, "toDescriptorVisibility"

    if-eq p0, v0, :cond_3

    aput-object v5, v4, v6

    goto :goto_3

    :cond_3
    aput-object v2, v4, v6

    :goto_3
    packed-switch p0, :pswitch_data_1

    const-string v2, "isVisible"

    aput-object v2, v4, v3

    goto :goto_4

    :pswitch_5
    aput-object v2, v4, v3

    goto :goto_4

    :pswitch_6
    const-string v2, "isPrivate"

    aput-object v2, v4, v3

    goto :goto_4

    :pswitch_7
    const-string v2, "compare"

    aput-object v2, v4, v3

    goto :goto_4

    :pswitch_8
    const-string v2, "compareLocal"

    aput-object v2, v4, v3

    goto :goto_4

    :pswitch_9
    const-string v2, "findInvisibleMember"

    aput-object v2, v4, v3

    goto :goto_4

    :pswitch_a
    const-string v2, "inSameFile"

    aput-object v2, v4, v3

    goto :goto_4

    :pswitch_b
    const-string v2, "isVisibleWithAnyReceiver"

    aput-object v2, v4, v3

    goto :goto_4

    :pswitch_c
    const-string v2, "isVisibleIgnoringReceiver"

    aput-object v2, v4, v3

    :goto_4
    :pswitch_d
    invoke-static {v1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eq p0, v0, :cond_4

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_d
    .end packed-switch
.end method

.method public static b(Lr93/r;Lr93/r;)Ljava/lang/Integer;
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_3

    if-eqz p1, :cond_2

    check-cast p0, Lr93/o;

    iget-object p0, p0, Lr93/o;->a:Lr93/m1;

    check-cast p1, Lr93/o;

    iget-object p1, p1, Lr93/o;->a:Lr93/m1;

    invoke-virtual {p0, p1}, Lr93/m1;->a(Lr93/m1;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p1, p0}, Lr93/m1;->a(Lr93/m1;)Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    neg-int p0, p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v0

    :cond_2
    const/16 p0, 0xd

    invoke-static {p0}, Lr93/q;->a(I)V

    throw v0

    :cond_3
    const/16 p0, 0xc

    invoke-static {p0}, Lr93/q;->a(I)V

    throw v0
.end method

.method public static c(Lfb3/d;Lr93/n;Lr93/k;)Lr93/n;
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    if-eqz p2, :cond_3

    invoke-interface {p1}, Lr93/k;->a()Lr93/k;

    move-result-object v1

    check-cast v1, Lr93/n;

    :goto_0
    if-eqz v1, :cond_1

    invoke-interface {v1}, Lr93/n;->getVisibility()Lr93/r;

    move-result-object v2

    sget-object v3, Lr93/q;->f:Lr93/p;

    if-eq v2, v3, :cond_1

    invoke-interface {v1}, Lr93/n;->getVisibility()Lr93/r;

    move-result-object v2

    invoke-virtual {v2, p0, v1, p2}, Lr93/r;->a(Lfb3/d;Lr93/n;Lr93/k;)Z

    move-result v2

    if-nez v2, :cond_0

    return-object v1

    :cond_0
    const-class v2, Lr93/n;

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Lya3/f;->h(Lr93/k;Ljava/lang/Class;Z)Lr93/k;

    move-result-object v1

    check-cast v1, Lr93/n;

    goto :goto_0

    :cond_1
    instance-of v1, p1, Lu93/s0;

    if-eqz v1, :cond_2

    check-cast p1, Lu93/s0;

    check-cast p1, Lu93/t0;

    invoke-virtual {p1}, Lu93/t0;->V0()Lu93/j;

    move-result-object p1

    invoke-static {p0, p1, p2}, Lr93/q;->c(Lfb3/d;Lr93/n;Lr93/k;)Lr93/n;

    move-result-object p0

    if-eqz p0, :cond_2

    return-object p0

    :cond_2
    return-object v0

    :cond_3
    const/16 p0, 0x9

    invoke-static {p0}, Lr93/q;->a(I)V

    throw v0

    :cond_4
    const/16 p0, 0x8

    invoke-static {p0}, Lr93/q;->a(I)V

    throw v0
.end method

.method public static d(Lr93/n;Lr93/k;)Z
    .locals 1

    if-eqz p1, :cond_1

    invoke-static {p1}, Lya3/f;->e(Lr93/k;)Lr93/t0;

    move-result-object p1

    sget-object v0, Lr93/t0;->a:Lr93/t0;

    if-eq p1, v0, :cond_0

    invoke-static {p0}, Lya3/f;->e(Lr93/k;)Lr93/t0;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    const/4 p0, 0x7

    invoke-static {p0}, Lr93/q;->a(I)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static e(Lr93/r;)Z
    .locals 1

    if-eqz p0, :cond_2

    sget-object v0, Lr93/q;->a:Lr93/p;

    if-eq p0, v0, :cond_1

    sget-object v0, Lr93/q;->b:Lr93/p;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_2
    const/16 p0, 0xe

    invoke-static {p0}, Lr93/q;->a(I)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static f(Lr93/o;)V
    .locals 2

    sget-object v0, Lr93/q;->o:Ljava/util/HashMap;

    iget-object v1, p0, Lr93/o;->a:Lr93/m1;

    invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static g(Lr93/m1;)Lr93/r;
    .locals 3

    if-eqz p0, :cond_1

    sget-object v0, Lr93/q;->o:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr93/r;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Inapplicable visibility: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/16 p0, 0xf

    invoke-static {p0}, Lr93/q;->a(I)V

    const/4 p0, 0x0

    throw p0
.end method
