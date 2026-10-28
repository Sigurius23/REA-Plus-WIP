.class public abstract Lk93/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lj93/d;)Lj93/g;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lkotlin/reflect/jvm/internal/KClassImpl;

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KClassImpl;->getConstructors()Ljava/util/Collection;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lj93/g;

    const-string v2, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.DescriptorKFunction"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lkotlin/reflect/jvm/internal/DescriptorKFunction;

    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/DescriptorKFunction;->getDescriptor()Lr93/w;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ConstructorDescriptor"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lr93/j;

    invoke-interface {v1}, Lr93/j;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Lj93/g;

    return-object v0
.end method

.method public static final b(Lj93/d;Lj93/d;)Z
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "base"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    sget-object v0, Lk93/b;->w:Lk93/b;

    new-instance v0, Lg73/d;

    invoke-direct {v0}, Lg73/d;-><init>()V

    new-instance v1, Ls;

    const/16 v2, 0xa

    invoke-direct {v1, p1, v2}, Ls;-><init>(Ljava/lang/Object;I)V

    invoke-static {p0, v0, v1}, Ls93/h;->r(Ljava/util/Collection;Lub3/a;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method
