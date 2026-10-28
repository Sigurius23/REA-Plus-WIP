.class public abstract Lva3/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroid/content/Context;)Ly3/e;
    .locals 3

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->fontScale:F

    new-instance v1, Ly3/e;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    invoke-static {v0}, Lz3/b;->a(F)Lz3/a;

    move-result-object v2

    if-nez v2, :cond_0

    new-instance v2, Ly3/n;

    invoke-direct {v2, v0}, Ly3/n;-><init>(F)V

    :cond_0
    invoke-direct {v1, p0, v0, v2}, Ly3/e;-><init>(FFLz3/a;)V

    return-object v1
.end method

.method public static final b(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Lyb3/n;
    .locals 0

    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->find(I)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance p1, Lyb3/n;

    invoke-direct {p1, p0, p2}, Lyb3/n;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    return-object p1
.end method

.method public static final c(Ll83/k;Lj93/d;)V
    .locals 3

    const-string v0, "clazz"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ll83/k;->x:Ljava/lang/Object;

    check-cast v0, Lrf3/b;

    iget-object v1, v0, Lrf3/b;->a:Lqf3/b;

    iget-object v2, v1, Lqf3/b;->f:Ljava/lang/Object;

    check-cast v2, Ljava/util/Collection;

    invoke-static {p1, v2}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v2

    iput-object v2, v1, Lqf3/b;->f:Ljava/lang/Object;

    iget-object v1, v0, Lrf3/b;->a:Lqf3/b;

    iget-object v2, v1, Lqf3/b;->c:Lvf3/a;

    iget-object v1, v1, Lqf3/b;->a:Lvf3/a;

    invoke-static {p1, v2, v1}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object p1

    iget-object p0, p0, Ll83/k;->w:Ljava/lang/Object;

    check-cast p0, Ltf3/a;

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    return-void
.end method

.method public static d(Z)V
    .locals 0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static e(ZLjava/lang/String;)V
    .locals 0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static f(II)V
    .locals 0

    if-ltz p0, :cond_0

    if-ge p0, p1, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p0
.end method

.method public static g(Lb9/q0;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public static h(Ljava/lang/String;Z)V
    .locals 0

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static i(Z)V
    .locals 0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0
.end method

.method public static j(Ljava/lang/Object;)V
    .locals 0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0
.end method

.method public static k(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static l(Ljava/lang/Class;)Lw93/b;
    .locals 14

    const-string v0, "klass"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpa3/f;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    iput-object v1, v0, Lpa3/f;->w:[I

    iput-object v1, v0, Lpa3/f;->x:Ljava/lang/String;

    const/4 v2, 0x0

    iput v2, v0, Lpa3/f;->y:I

    iput-object v1, v0, Lpa3/f;->z:[Ljava/lang/String;

    iput-object v1, v0, Lpa3/f;->E:[Ljava/lang/String;

    iput-object v1, v0, Lpa3/f;->F:[Ljava/lang/String;

    iput-object v1, v0, Lpa3/f;->G:Lpa3/a;

    iput-object v1, v0, Lpa3/f;->H:[Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v3

    const-string v4, "getDeclaredAnnotations(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v4, v3

    move v5, v2

    :goto_0
    if-ge v5, v4, :cond_6

    aget-object v6, v3, v5

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v6}, Ljc/x;->K(Ljava/lang/annotation/Annotation;)Lj93/d;

    move-result-object v7

    invoke-static {v7}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object v7

    invoke-static {v7}, Lx93/c;->a(Ljava/lang/Class;)Lva3/c;

    move-result-object v8

    invoke-virtual {v8}, Lva3/c;->a()Lva3/e;

    move-result-object v9

    sget-object v10, Lfa3/x;->a:Lva3/e;

    invoke-virtual {v9, v10}, Lva3/e;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    new-instance v8, Lbu/c;

    invoke-direct {v8, v0}, Lbu/c;-><init>(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    sget-object v10, Lfa3/x;->o:Lva3/e;

    invoke-virtual {v9, v10}, Lva3/e;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    new-instance v8, Lpa3/d;

    const/4 v9, 0x0

    invoke-direct {v8, v0, v9}, Lpa3/d;-><init>(Lpa3/f;I)V

    goto :goto_2

    :cond_1
    sget-boolean v9, Lpa3/f;->I:Z

    if-eqz v9, :cond_2

    goto :goto_1

    :cond_2
    iget-object v9, v0, Lpa3/f;->G:Lpa3/a;

    if-eqz v9, :cond_3

    goto :goto_1

    :cond_3
    sget-object v9, Lpa3/f;->J:Ljava/util/HashMap;

    invoke-virtual {v9, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lpa3/a;

    if-eqz v8, :cond_4

    iput-object v8, v0, Lpa3/f;->G:Lpa3/a;

    new-instance v8, Lpa3/d;

    const/4 v9, 0x1

    invoke-direct {v8, v0, v9}, Lpa3/d;-><init>(Lpa3/f;I)V

    goto :goto_2

    :cond_4
    :goto_1
    move-object v8, v1

    :goto_2
    if-eqz v8, :cond_5

    invoke-static {v8, v6, v7}, Lva3/b;->i(Loa3/n;Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V

    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_6
    new-instance v3, Lw93/b;

    sget-object v4, Lsa3/e;->g:Lsa3/e;

    iget-object v5, v0, Lpa3/f;->G:Lpa3/a;

    if-eqz v5, :cond_d

    iget-object v5, v0, Lpa3/f;->w:[I

    if-nez v5, :cond_7

    goto :goto_4

    :cond_7
    new-instance v8, Lsa3/e;

    iget-object v5, v0, Lpa3/f;->w:[I

    iget v6, v0, Lpa3/f;->y:I

    and-int/lit8 v6, v6, 0x8

    if-eqz v6, :cond_8

    const/4 v2, 0x1

    :cond_8
    invoke-direct {v8, v5, v2}, Lsa3/e;-><init>([IZ)V

    invoke-virtual {v8, v4}, Lsa3/e;->b(Lsa3/e;)Z

    move-result v2

    if-nez v2, :cond_9

    iget-object v2, v0, Lpa3/f;->z:[Ljava/lang/String;

    iput-object v2, v0, Lpa3/f;->F:[Ljava/lang/String;

    iput-object v1, v0, Lpa3/f;->z:[Ljava/lang/String;

    goto :goto_3

    :cond_9
    iget-object v2, v0, Lpa3/f;->G:Lpa3/a;

    sget-object v4, Lpa3/a;->E:Lpa3/a;

    if-eq v2, v4, :cond_a

    sget-object v4, Lpa3/a;->F:Lpa3/a;

    if-eq v2, v4, :cond_a

    sget-object v4, Lpa3/a;->I:Lpa3/a;

    if-ne v2, v4, :cond_b

    :cond_a
    iget-object v2, v0, Lpa3/f;->z:[Ljava/lang/String;

    if-nez v2, :cond_b

    goto :goto_4

    :cond_b
    :goto_3
    iget-object v2, v0, Lpa3/f;->H:[Ljava/lang/String;

    if-eqz v2, :cond_c

    invoke-static {v2}, Lua3/a;->a([Ljava/lang/String;)[B

    :cond_c
    new-instance v6, Lpa3/b;

    iget-object v7, v0, Lpa3/f;->G:Lpa3/a;

    iget-object v9, v0, Lpa3/f;->z:[Ljava/lang/String;

    iget-object v10, v0, Lpa3/f;->F:[Ljava/lang/String;

    iget-object v11, v0, Lpa3/f;->E:[Ljava/lang/String;

    iget-object v12, v0, Lpa3/f;->x:Ljava/lang/String;

    iget v13, v0, Lpa3/f;->y:I

    invoke-direct/range {v6 .. v13}, Lpa3/b;-><init>(Lpa3/a;Lsa3/e;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;I)V

    goto :goto_5

    :cond_d
    :goto_4
    move-object v6, v1

    :goto_5
    if-nez v6, :cond_e

    return-object v1

    :cond_e
    invoke-direct {v3, p0, v6}, Lw93/b;-><init>(Ljava/lang/Class;Lpa3/b;)V

    return-object v3
.end method

.method public static final m(Lva3/e;Lva3/e;)Lva3/e;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lva3/e;->a:Lva3/f;

    const-string v1, "prefix"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p1, Lva3/e;->a:Lva3/f;

    invoke-virtual {p0, p1}, Lva3/e;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lva3/f;->c()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, v0, Lva3/f;->a:Ljava/lang/String;

    iget-object v3, v1, Lva3/f;->a:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x2e

    if-ne v2, v3, :cond_4

    :goto_0
    invoke-virtual {v1}, Lva3/f;->c()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0, p1}, Lva3/e;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    sget-object p0, Lva3/e;->c:Lva3/e;

    return-object p0

    :cond_3
    new-instance p0, Lva3/e;

    iget-object p1, v0, Lva3/f;->a:Ljava/lang/String;

    iget-object v0, v1, Lva3/f;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "substring(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lva3/e;-><init>(Ljava/lang/String;)V

    :cond_4
    :goto_1
    return-object p0
.end method
