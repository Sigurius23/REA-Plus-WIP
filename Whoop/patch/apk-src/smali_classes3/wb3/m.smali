.class public final Lwb3/m;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final x:Lva3/e;

.field public final y:Lj93/d;


# direct methods
.method public constructor <init>(Lj93/d;Lva3/e;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lwb3/m;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb3/m;->y:Lj93/d;

    iput-object p2, p0, Lwb3/m;->x:Lva3/e;

    return-void
.end method

.method public constructor <init>(Lva3/e;Lj93/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lwb3/m;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb3/m;->x:Lva3/e;

    iput-object p2, p0, Lwb3/m;->y:Lj93/d;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lwb3/m;->w:I

    const-string v1, "klass"

    const/16 v2, 0xa

    iget-object v3, p0, Lwb3/m;->y:Lj93/d;

    iget-object v4, p0, Lwb3/m;->x:Lva3/e;

    const/4 v5, 0x0

    check-cast p1, Lwb3/l;

    packed-switch v0, :pswitch_data_0

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lo93/m;->K:Lva3/e;

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "No mutable collection class found: "

    const-string v6, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.types.AbstractKType"

    if-eqz v0, :cond_1

    sget-object v0, Lj93/d0;->c:Lj93/d0;

    const-class v4, Ljava/lang/Iterable;

    invoke-static {v4, v0}, Lkotlin/jvm/internal/h0;->e(Ljava/lang/Class;Lj93/d0;)Lj93/a0;

    move-result-object v0

    sget-object v7, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v7, v0}, Lkotlin/jvm/internal/i0;->mutableCollectionType(Lj93/a0;)Lj93/a0;

    move-result-object v0

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lwb3/a;

    invoke-virtual {v0}, Lwb3/a;->b()Lj93/d;

    move-result-object v0

    if-eqz v0, :cond_0

    goto/16 :goto_0

    :cond_0
    new-instance p1, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v7, v4, v0}, Lr80/c;->r(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    sget-object v0, Lo93/m;->L:Lva3/e;

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const-class v7, Ljava/util/Collection;

    if-eqz v0, :cond_3

    sget-object v0, Lj93/d0;->c:Lj93/d0;

    invoke-static {v7, v0}, Lkotlin/jvm/internal/h0;->e(Ljava/lang/Class;Lj93/d0;)Lj93/a0;

    move-result-object v0

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v0}, Lkotlin/jvm/internal/i0;->mutableCollectionType(Lj93/a0;)Lj93/a0;

    move-result-object v0

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lwb3/a;

    invoke-virtual {v0}, Lwb3/a;->b()Lj93/d;

    move-result-object v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v4, v7, v0}, Lr80/c;->r(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    sget-object v0, Lo93/m;->N:Lva3/e;

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lj93/d0;->c:Lj93/d0;

    invoke-static {v7, v0}, Lkotlin/jvm/internal/h0;->e(Ljava/lang/Class;Lj93/d0;)Lj93/a0;

    move-result-object v0

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v0}, Lkotlin/jvm/internal/i0;->mutableCollectionType(Lj93/a0;)Lj93/a0;

    move-result-object v0

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lwb3/a;

    invoke-virtual {v0}, Lwb3/a;->b()Lj93/d;

    move-result-object v0

    if-eqz v0, :cond_4

    goto :goto_0

    :cond_4
    new-instance p1, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v4, v7, v0}, Lr80/c;->r(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    sget-object v0, Lo93/m;->M:Lva3/e;

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object v0, Lj93/d0;->c:Lj93/d0;

    const-class v4, Ljava/util/Iterator;

    invoke-static {v4, v0}, Lkotlin/jvm/internal/h0;->e(Ljava/lang/Class;Lj93/d0;)Lj93/a0;

    move-result-object v0

    sget-object v7, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v7, v0}, Lkotlin/jvm/internal/i0;->mutableCollectionType(Lj93/a0;)Lj93/a0;

    move-result-object v0

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lwb3/a;

    invoke-virtual {v0}, Lwb3/a;->b()Lj93/d;

    move-result-object v0

    if-eqz v0, :cond_6

    goto :goto_0

    :cond_6
    new-instance p1, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v7, v4, v0}, Lr80/c;->r(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    const/4 v0, 0x0

    :goto_0
    iget-object p1, p1, Lwb3/l;->y:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {p1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    sget-object v6, Lm83/y;->w:Lm83/y;

    if-eqz v4, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj93/b0;

    sget-object v7, Lj93/d0;->c:Lj93/d0;

    invoke-static {v4, v6, v5, v6}, Ljc/x;->z(Lj93/e;Ljava/util/List;ZLjava/util/List;)Lwb3/a;

    move-result-object v4

    invoke-static {v4}, Lx43/j;->I(Lj93/a0;)Lj93/d0;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_8
    const/4 p1, 0x2

    new-array p1, p1, [Lj93/d;

    aput-object v3, p1, v5

    const/4 v3, 0x1

    aput-object v0, p1, v3

    invoke-static {p1}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj93/d;

    invoke-static {v2, v1, v5, v6}, Ljc/x;->z(Lj93/e;Ljava/util/List;ZLjava/util/List;)Lwb3/a;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_9
    return-object v0

    :pswitch_0
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v3}, Lj93/d;->getTypeParameters()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj93/b0;

    new-instance v3, Lkotlin/reflect/jvm/internal/KTypeParameterImpl;

    invoke-interface {v2}, Lj93/b0;->getName()Ljava/lang/String;

    move-result-object v2

    sget-object v6, Lo93/m;->J:Lva3/e;

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_b

    sget-object v6, Lo93/m;->I:Lva3/e;

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_a

    goto :goto_4

    :cond_a
    sget-object v6, Lj93/e0;->w:Lj93/e0;

    goto :goto_5

    :cond_b
    :goto_4
    sget-object v6, Lj93/e0;->y:Lj93/e0;

    :goto_5
    invoke-direct {v3, p1, v2, v6, v5}, Lkotlin/reflect/jvm/internal/KTypeParameterImpl;-><init>(Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;Ljava/lang/String;Lj93/e0;Z)V

    sget-object v2, Lkotlin/reflect/jvm/internal/StandardKTypes;->INSTANCE:Lkotlin/reflect/jvm/internal/StandardKTypes;

    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/StandardKTypes;->getNULLABLE_ANY()Lj93/a0;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v3, v2}, Lkotlin/reflect/jvm/internal/KTypeParameterImpl;->setUpperBounds(Ljava/util/List;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_c
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
