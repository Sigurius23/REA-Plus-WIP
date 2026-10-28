.class public final Lpg3/x0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lud3/i;

.field public b:Lud3/e0;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/ArrayList;

.field public final e:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lpg3/x0;->c:Ljava/util/ArrayList;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lpg3/x0;->d:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(Lpg3/y0;)V
    .locals 6

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lpg3/x0;->c:Ljava/util/ArrayList;

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lpg3/x0;->d:Ljava/util/ArrayList;

    .line 7
    iget-object v0, p1, Lpg3/y0;->b:Lud3/i;

    iget-object v1, p1, Lpg3/y0;->f:Ljava/util/List;

    iput-object v0, p0, Lpg3/x0;->a:Lud3/i;

    .line 8
    iget-object v0, p1, Lpg3/y0;->c:Lud3/e0;

    iput-object v0, p0, Lpg3/x0;->b:Lud3/e0;

    .line 9
    iget-object v0, p1, Lpg3/y0;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    iget v3, p1, Lpg3/y0;->e:I

    sub-int/2addr v2, v3

    const/4 v3, 0x1

    :goto_0
    if-ge v3, v2, :cond_0

    .line 10
    iget-object v4, p0, Lpg3/x0;->c:Ljava/util/ArrayList;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpg3/m;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 11
    :cond_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    iget v2, p1, Lpg3/y0;->g:I

    sub-int/2addr v0, v2

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v0, :cond_1

    .line 12
    iget-object v3, p0, Lpg3/x0;->d:Ljava/util/ArrayList;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpg3/f;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 13
    :cond_1
    iget-object p1, p1, Lpg3/y0;->h:Ljava/util/concurrent/Executor;

    iput-object p1, p0, Lpg3/x0;->e:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final a(Lpg3/f;)V
    .locals 1

    const-string v0, "factory == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, Lpg3/x0;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b(Lpg3/m;)V
    .locals 1

    const-string v0, "factory == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, Lpg3/x0;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 3

    const-string v0, "baseUrl == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lcom/iterable/iterableapi/v;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/iterable/iterableapi/v;-><init>(I)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lcom/iterable/iterableapi/v;->d(Lud3/e0;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/iterable/iterableapi/v;->b()Lud3/e0;

    move-result-object p1

    iget-object v0, p1, Lud3/e0;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lpg3/x0;->b:Lud3/e0;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "baseUrl must end in /: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d()Lpg3/y0;
    .locals 10

    iget-object v0, p0, Lpg3/x0;->b:Lud3/e0;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lpg3/x0;->a:Lud3/i;

    if-nez v0, :cond_0

    new-instance v0, Lud3/l0;

    invoke-direct {v0}, Lud3/l0;-><init>()V

    :cond_0
    move-object v2, v0

    iget-object v0, p0, Lpg3/x0;->e:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_1

    sget-object v0, Lpg3/o0;->a:Lcq/s;

    :cond_1
    move-object v8, v0

    sget-object v0, Lpg3/o0;->c:Lpg3/b;

    new-instance v1, Ljava/util/ArrayList;

    iget-object v3, p0, Lpg3/x0;->d:Ljava/util/ArrayList;

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v8}, Lpg3/b;->a(Ljava/util/concurrent/Executor;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v0}, Lpg3/b;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    new-instance v4, Ljava/util/ArrayList;

    iget-object v6, p0, Lpg3/x0;->c:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v7

    add-int/lit8 v7, v7, 0x1

    add-int/2addr v7, v5

    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v7, Lpg3/c;

    const/4 v9, 0x0

    invoke-direct {v7, v9}, Lpg3/c;-><init>(I)V

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    move-object v0, v1

    new-instance v1, Lpg3/y0;

    move-object v6, v3

    iget-object v3, p0, Lpg3/x0;->b:Lud3/e0;

    invoke-static {v4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v7

    move-object v6, v0

    invoke-direct/range {v1 .. v8}, Lpg3/y0;-><init>(Lud3/i;Lud3/e0;Ljava/util/List;ILjava/util/List;ILjava/util/concurrent/Executor;)V

    return-object v1

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Base URL required."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e(Lud3/l0;)V
    .locals 1

    const-string v0, "client == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lpg3/x0;->a:Lud3/i;

    return-void
.end method
