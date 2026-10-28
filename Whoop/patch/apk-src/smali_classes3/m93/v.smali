.class public final Lm93/v;
.super Lm93/x;
.source "SourceFile"

# interfaces
.implements Lm93/f;


# instance fields
.field public final f:[Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
    .locals 6

    const-string v0, "method"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "boundReceiverComponents"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object v0

    const-string v1, "getGenericParameterTypes(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, p2

    const-string v2, " is less than zero."

    const-string v3, "Requested element count "

    if-ltz v1, :cond_6

    array-length v4, v0

    sub-int/2addr v4, v1

    const/4 v1, 0x0

    if-gez v4, :cond_0

    move v4, v1

    :cond_0
    if-ltz v4, :cond_5

    if-nez v4, :cond_1

    sget-object v0, Lm83/y;->w:Lm83/y;

    goto :goto_1

    :cond_1
    array-length v2, v0

    if-lt v4, v2, :cond_2

    invoke-static {v0}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_2
    const/4 v3, 0x1

    if-ne v4, v3, :cond_3

    sub-int/2addr v2, v3

    aget-object v0, v0, v2

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_3
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    sub-int v4, v2, v4

    :goto_0
    if-ge v4, v2, :cond_4

    aget-object v5, v0, v4

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    move-object v0, v3

    :goto_1
    check-cast v0, Ljava/util/Collection;

    new-array v2, v1, [Ljava/lang/reflect/Type;

    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/reflect/Type;

    invoke-direct {p0, p1, v1, v0}, Lm93/x;-><init>(Ljava/lang/reflect/Method;Z[Ljava/lang/reflect/Type;)V

    iput-object p2, p0, Lm93/v;->f:[Ljava/lang/Object;

    return-void

    :cond_5
    invoke-static {v4, v3, v2}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_6
    invoke-static {v1, v3, v2}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public final call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lm93/y;->c([Ljava/lang/Object;)V

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/k0;-><init>(I)V

    iget-object v1, p0, Lm93/v;->f:[Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/k0;->e(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/k0;->e(Ljava/lang/Object;)V

    iget-object p1, v0, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lm93/x;->e([Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
