.class public final Lie/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcf/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Lsf/e;Lsf/m;)Ljava/lang/Object;
    .locals 9

    invoke-interface {p2}, Lq83/d;->getContext()Lq83/j;

    move-result-object p2

    const-class v0, Lie/c;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-static {p2, v0}, Lvd/f;->B(Lq83/j;Ljava/lang/String;)Lgm/r;

    move-result-object p2

    iget-object v0, p1, Lsf/e;->c:Ldg/a;

    sget-object v1, Lbf/b;->a:Lgf/a;

    invoke-virtual {v0, v1}, Ldg/a;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    if-eqz v0, :cond_9

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v7, 0x0

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lbf/a;

    invoke-interface {v3}, Lbf/a;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x2

    if-le v4, v5, :cond_0

    new-instance v2, Lh02/n0;

    const/16 v4, 0x12

    invoke-direct {v2, v3, v4}, Lh02/n0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p2, v7, v2}, Lgm/r;->n(Ljava/lang/Throwable;Lc93/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_2

    const-string p2, ""

    goto :goto_4

    :cond_2
    new-instance v5, Lib0/c;

    const/16 p2, 0xd

    invoke-direct {v5, p2}, Lib0/c;-><init>(I)V

    const/16 v6, 0x1c

    const-string v2, ","

    const-string v3, "m/"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lyb3/y;->D(Ljava/lang/String;)[B

    move-result-object v0

    array-length v1, v0

    const/16 v2, 0x400

    if-gt v1, v2, :cond_3

    goto :goto_4

    :cond_3
    const/4 v1, 0x0

    invoke-static {v1, v2}, Le93/b;->i0(II)Li93/j;

    move-result-object v2

    invoke-static {v0, v2}, Lm83/n;->N0([BLi93/j;)[B

    move-result-object v2

    array-length v3, v2

    const/4 v4, -0x1

    add-int/2addr v3, v4

    if-ltz v3, :cond_6

    :goto_1
    add-int/lit8 v5, v3, -0x1

    aget-byte v6, v2, v3

    const/16 v8, 0x2c

    if-ne v6, v8, :cond_4

    goto :goto_3

    :cond_4
    if-gez v5, :cond_5

    goto :goto_2

    :cond_5
    move v3, v5

    goto :goto_1

    :cond_6
    :goto_2
    move v3, v4

    :goto_3
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    if-eq v3, v4, :cond_7

    move-object v7, v2

    :cond_7
    if-eqz v7, :cond_8

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/4 v2, 0x1

    invoke-static {v0, v1, p2, v2}, Lyb3/y;->B([BIIZ)Ljava/lang/String;

    move-result-object p2

    :goto_4
    iget-object v0, p1, Lsf/e;->b:Lvf/a;

    invoke-interface {v0}, Lvf/a;->getHeaders()Lmf/h;

    move-result-object v0

    const-string v1, "User-Agent"

    invoke-interface {v0, v1}, Lgf/t;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object p1, p1, Lsf/e;->b:Lvf/a;

    invoke-static {p1}, Ls93/k;->i(Lvf/a;)Lvf/b;

    move-result-object p1

    iget-object v2, p1, Lvf/b;->y:Lmf/c;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2, v1}, La2/a;->N(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lvf/b;->b()Lvf/h;

    move-result-object p1

    return-object p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Business metrics are incorrectly formatted: "

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    iget-object p1, p1, Lsf/e;->b:Lvf/a;

    return-object p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "logger<T> cannot be used on an anonymous object"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
