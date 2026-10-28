.class public final Lwb3/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lwb3/k;


# instance fields
.field public final a:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lwb3/k;

    sget-object v1, Lm83/z;->w:Lm83/z;

    invoke-direct {v0, v1}, Lwb3/k;-><init>(Ljava/util/Map;)V

    sput-object v0, Lwb3/k;->b:Lwb3/k;

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb3/k;->a:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a(Lj93/a0;)Lj93/d0;
    .locals 9

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lwb3/a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v2, p1

    check-cast v2, Lwb3/a;

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lwb3/a;->g()Lwb3/a;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    if-eqz v0, :cond_2

    move-object v3, p1

    check-cast v3, Lwb3/a;

    goto :goto_2

    :cond_2
    move-object v3, v1

    :goto_2
    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lwb3/a;->j()Lwb3/a;

    move-result-object v3

    goto :goto_3

    :cond_3
    move-object v3, v1

    :goto_3
    if-eqz v2, :cond_8

    if-eqz v3, :cond_8

    invoke-virtual {p0, v2}, Lwb3/k;->a(Lj93/a0;)Lj93/d0;

    move-result-object p1

    iget-object v0, p1, Lj93/d0;->b:Lj93/a0;

    instance-of v2, v0, Lwb3/a;

    if-eqz v2, :cond_4

    check-cast v0, Lwb3/a;

    goto :goto_4

    :cond_4
    move-object v0, v1

    :goto_4
    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lwb3/a;->g()Lwb3/a;

    move-result-object v0

    if-eqz v0, :cond_5

    new-instance v2, Lj93/d0;

    iget-object p1, p1, Lj93/d0;->a:Lj93/e0;

    invoke-direct {v2, p1, v0}, Lj93/d0;-><init>(Lj93/e0;Lj93/a0;)V

    move-object p1, v2

    :cond_5
    invoke-virtual {p0, v3}, Lwb3/k;->a(Lj93/a0;)Lj93/d0;

    move-result-object v0

    iget-object v2, v0, Lj93/d0;->b:Lj93/a0;

    instance-of v3, v2, Lwb3/a;

    if-eqz v3, :cond_6

    move-object v1, v2

    check-cast v1, Lwb3/a;

    :cond_6
    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lwb3/a;->j()Lwb3/a;

    move-result-object v1

    if-eqz v1, :cond_7

    new-instance v2, Lj93/d0;

    iget-object v0, v0, Lj93/d0;->a:Lj93/e0;

    invoke-direct {v2, v0, v1}, Lj93/d0;-><init>(Lj93/e0;Lj93/a0;)V

    move-object v0, v2

    :cond_7
    new-instance v1, Lj93/d0;

    iget-object v2, p1, Lj93/d0;->a:Lj93/e0;

    iget-object p1, p1, Lj93/d0;->b:Lj93/a0;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lj93/d0;->b:Lj93/a0;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {p1, v0}, Lsc3/l;->f(Lj93/a0;Lj93/a0;)Lwb3/a;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Lj93/d0;-><init>(Lj93/e0;Lj93/a0;)V

    return-object v1

    :cond_8
    invoke-interface {p1}, Lj93/a0;->getClassifier()Lj93/e;

    move-result-object v2

    if-nez v2, :cond_9

    sget-object v0, Lj93/d0;->c:Lj93/d0;

    invoke-static {p1}, Lx43/j;->I(Lj93/a0;)Lj93/d0;

    move-result-object p1

    return-object p1

    :cond_9
    iget-object v3, p0, Lwb3/k;->a:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj93/d0;

    if-eqz v3, :cond_11

    iget-object v2, v3, Lj93/d0;->a:Lj93/e0;

    iget-object v4, v3, Lj93/d0;->b:Lj93/a0;

    if-nez v4, :cond_a

    return-object v3

    :cond_a
    new-instance v3, Lj93/d0;

    move-object v5, v4

    check-cast v5, Lob3/h;

    invoke-interface {p1}, Lj93/a0;->isMarkedNullable()Z

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-nez v6, :cond_c

    invoke-interface {v4}, Lj93/a0;->isMarkedNullable()Z

    move-result v4

    if-eqz v4, :cond_b

    goto :goto_5

    :cond_b
    move v4, v7

    goto :goto_6

    :cond_c
    :goto_5
    move v4, v8

    :goto_6
    move-object v6, v5

    check-cast v6, Lwb3/a;

    invoke-virtual {v6, v4}, Lwb3/a;->i(Z)Lwb3/a;

    move-result-object v4

    if-eqz v0, :cond_d

    move-object v0, p1

    check-cast v0, Lwb3/a;

    goto :goto_7

    :cond_d
    move-object v0, v1

    :goto_7
    if-eqz v0, :cond_e

    invoke-virtual {v0}, Lwb3/a;->c()Z

    move-result v0

    if-ne v0, v8, :cond_e

    goto :goto_8

    :cond_e
    instance-of v0, v5, Lwb3/a;

    if-eqz v0, :cond_f

    move-object v1, v5

    check-cast v1, Lwb3/a;

    :cond_f
    if-eqz v1, :cond_10

    invoke-virtual {v1}, Lwb3/a;->c()Z

    move-result v0

    if-ne v0, v8, :cond_10

    invoke-interface {p1}, Lj93/a0;->isMarkedNullable()Z

    move-result p1

    if-nez p1, :cond_10

    :goto_8
    move v7, v8

    :cond_10
    invoke-virtual {v4, v7}, Lwb3/a;->h(Z)Lwb3/a;

    move-result-object p1

    invoke-direct {v3, v2, p1}, Lj93/d0;-><init>(Lj93/e0;Lj93/a0;)V

    return-object v3

    :cond_11
    sget-object v3, Lj93/d0;->c:Lj93/d0;

    invoke-interface {p1}, Lj93/a0;->getArguments()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_12

    goto :goto_c

    :cond_12
    invoke-interface {p1}, Lj93/a0;->getArguments()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_14

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lj93/d0;

    iget-object v5, v5, Lj93/d0;->b:Lj93/a0;

    if-eqz v5, :cond_13

    invoke-virtual {p0, v5}, Lwb3/k;->a(Lj93/a0;)Lj93/d0;

    move-result-object v5

    goto :goto_a

    :cond_13
    sget-object v5, Lj93/d0;->c:Lj93/d0;

    :goto_a
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_14
    invoke-interface {p1}, Lj93/a0;->isMarkedNullable()Z

    move-result v3

    invoke-interface {p1}, Lj93/b;->getAnnotations()Ljava/util/List;

    move-result-object v5

    if-eqz v0, :cond_15

    check-cast p1, Lwb3/a;

    goto :goto_b

    :cond_15
    move-object p1, v1

    :goto_b
    if-eqz p1, :cond_16

    invoke-virtual {p1}, Lwb3/a;->b()Lj93/d;

    move-result-object v1

    :cond_16
    invoke-static {v2, v4, v3, v5, v1}, Ljc/x;->A(Lj93/e;Ljava/util/List;ZLjava/util/List;Lj93/d;)Lwb3/a;

    move-result-object p1

    :goto_c
    invoke-static {p1}, Lx43/j;->I(Lj93/a0;)Lj93/d0;

    move-result-object p1

    return-object p1
.end method
