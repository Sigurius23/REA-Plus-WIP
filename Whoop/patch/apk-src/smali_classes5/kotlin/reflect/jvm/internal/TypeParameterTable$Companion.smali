.class public final Lkotlin/reflect/jvm/internal/TypeParameterTable$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/reflect/jvm/internal/TypeParameterTable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J5\u0010\r\u001a\u00020\u00072\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lkotlin/reflect/jvm/internal/TypeParameterTable$Companion;",
        "",
        "<init>",
        "()V",
        "",
        "Laa3/d1;",
        "kmTypeParameters",
        "Lkotlin/reflect/jvm/internal/TypeParameterTable;",
        "parent",
        "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;",
        "container",
        "Ljava/lang/ClassLoader;",
        "classLoader",
        "create",
        "(Ljava/util/List;Lkotlin/reflect/jvm/internal/TypeParameterTable;Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;Ljava/lang/ClassLoader;)Lkotlin/reflect/jvm/internal/TypeParameterTable;",
        "EMPTY",
        "Lkotlin/reflect/jvm/internal/TypeParameterTable;",
        "kotlin-reflection"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/TypeParameterTable$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Ljava/util/List;Lkotlin/reflect/jvm/internal/TypeParameterTable;Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;Ljava/lang/ClassLoader;)Lkotlin/reflect/jvm/internal/TypeParameterTable;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Laa3/d1;",
            ">;",
            "Lkotlin/reflect/jvm/internal/TypeParameterTable;",
            "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;",
            "Ljava/lang/ClassLoader;",
            ")",
            "Lkotlin/reflect/jvm/internal/TypeParameterTable;"
        }
    .end annotation

    const-string v0, "kmTypeParameters"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "container"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classLoader"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Laa3/d1;

    new-instance v5, Lkotlin/reflect/jvm/internal/KTypeParameterImpl;

    iget-object v6, v4, Laa3/d1;->b:Ljava/lang/String;

    iget-object v7, v4, Laa3/d1;->d:Laa3/g1;

    invoke-static {v7}, Lkotlin/reflect/jvm/internal/ConvertFromMetadataKt;->access$toKVariance(Laa3/g1;)Lj93/e0;

    move-result-object v7

    sget-object v8, Laa3/p;->l:Lcom/google/crypto/tink/internal/l0;

    sget-object v9, Laa3/p;->a:[Lj93/z;

    const/16 v10, 0x31

    aget-object v9, v9, v10

    invoke-virtual {v8, v4, v9}, Lcom/google/crypto/tink/internal/l0;->W(Ljava/lang/Object;Lj93/z;)Z

    move-result v4

    invoke-direct {v5, p3, v6, v7, v4}, Lkotlin/reflect/jvm/internal/KTypeParameterImpl;-><init>(Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;Ljava/lang/String;Lj93/e0;Z)V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lm83/s;->J1(Ljava/lang/Iterable;)Lm83/q;

    move-result-object p3

    invoke-static {p3, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v0}, Lm83/g0;->W(I)I

    move-result v0

    const/16 v3, 0x10

    if-ge v0, v3, :cond_1

    move v0, v3

    :cond_1
    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-virtual {p3}, Lm83/q;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1
    move-object v0, p3

    check-cast v0, Lm83/d0;

    iget-object v4, v0, Lm83/d0;->x:Ljava/util/Iterator;

    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v0}, Lm83/d0;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm83/c0;

    iget v4, v0, Lm83/c0;->a:I

    iget-object v0, v0, Lm83/c0;->b:Ljava/lang/Object;

    check-cast v0, Laa3/d1;

    iget v0, v0, Laa3/d1;->c:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    new-instance v7, Lkotlin/reflect/jvm/internal/TypeParameterTable;

    const/4 p3, 0x0

    invoke-direct {v7, v1, v3, p2, p3}, Lkotlin/reflect/jvm/internal/TypeParameterTable;-><init>(Ljava/util/List;Ljava/util/Map;Lkotlin/reflect/jvm/internal/TypeParameterTable;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 p3, 0x0

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    add-int/lit8 v0, p3, 0x1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/reflect/jvm/internal/KTypeParameterImpl;

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Laa3/d1;

    iget-object p3, p3, Laa3/d1;->e:Ljava/util/ArrayList;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {p3, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_3
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Laa3/b1;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v6, p4

    invoke-static/range {v5 .. v10}, Lkotlin/reflect/jvm/internal/ConvertFromMetadataKt;->toKType$default(Laa3/b1;Ljava/lang/ClassLoader;Lkotlin/reflect/jvm/internal/TypeParameterTable;Lc93/a;ILjava/lang/Object;)Lj93/a0;

    move-result-object p4

    invoke-virtual {v3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object p4, v6

    goto :goto_3

    :cond_3
    move-object v6, p4

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_4

    sget-object p3, Lkotlin/reflect/jvm/internal/StandardKTypes;->INSTANCE:Lkotlin/reflect/jvm/internal/StandardKTypes;

    invoke-virtual {p3}, Lkotlin/reflect/jvm/internal/StandardKTypes;->getNULLABLE_ANY()Lj93/a0;

    move-result-object p3

    invoke-static {p3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    :cond_4
    check-cast v3, Ljava/util/List;

    invoke-virtual {v1, v3}, Lkotlin/reflect/jvm/internal/KTypeParameterImpl;->setUpperBounds(Ljava/util/List;)V

    move p3, v0

    move-object p4, v6

    goto :goto_2

    :cond_5
    return-object v7
.end method
