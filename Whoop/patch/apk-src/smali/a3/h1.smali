.class public abstract La3/h1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb2/u;
.implements Lb3/j2;


# instance fields
.field private _inspectorValues:Lb3/l2;


# virtual methods
.method public abstract create()Lb2/v;
.end method

.method public final getInspectableElements()Lxb3/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxb3/i;"
        }
    .end annotation

    invoke-virtual {p0}, La3/h1;->j()Lb3/l2;

    move-result-object v0

    invoke-virtual {v0}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    return-object v0
.end method

.method public final getNameFallback()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, La3/h1;->j()Lb3/l2;

    move-result-object v0

    invoke-virtual {v0}, Lb3/l2;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public inspectableProperties(Lb3/l2;)V
    .locals 6

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    new-instance v1, Lb2/d;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lb2/d;-><init>(I)V

    invoke-static {v0, v1}, Lm83/n;->Q0([Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/reflect/Field;

    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v4

    const-class v5, La3/h1;

    invoke-virtual {v4, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-nez v4, :cond_0

    const/4 v4, 0x1

    :try_start_0
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v4

    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v4, v3, v5}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final j()Lb3/l2;
    .locals 3

    iget-object v0, p0, La3/h1;->_inspectorValues:Lb3/l2;

    if-nez v0, :cond_0

    new-instance v0, Lb3/l2;

    invoke-direct {v0}, Lb3/l2;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-interface {v1}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb3/l2;->c(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, La3/h1;->inspectableProperties(Lb3/l2;)V

    iput-object v0, p0, La3/h1;->_inspectorValues:Lb3/l2;

    :cond_0
    return-object v0
.end method

.method public abstract update(Lb2/v;)V
.end method
