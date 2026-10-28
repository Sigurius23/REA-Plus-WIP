.class public final Lg40/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq3/r;


# instance fields
.field public final w:Ljava/util/ArrayList;

.field public final x:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lg40/c1;->w:Ljava/util/ArrayList;

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lg40/c1;->x:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lg40/c1;->w:Ljava/util/ArrayList;

    iput-object p2, p0, Lg40/c1;->x:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 10

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v8, 0x0

    const/16 v9, 0x5b

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v4, " !\"#$&\'()+,/:;<=>?@[\\]^`{|}~"

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v9}, Lke3/a;->b(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lg40/c1;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v4, " !\"#$&\'()+,/:;<=>?@[\\]^`{|}~"

    move-object v1, p2

    invoke-static/range {v1 .. v9}, Lke3/a;->b(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lg40/c1;->x:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 10

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v8, 0x0

    const/16 v9, 0x53

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v4, " !\"#$&\'()+,/:;<=>?@[\\]^`{|}~"

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v1, p1

    invoke-static/range {v1 .. v9}, Lke3/a;->b(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lg40/c1;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v4, " !\"#$&\'()+,/:;<=>?@[\\]^`{|}~"

    move-object v1, p2

    invoke-static/range {v1 .. v9}, Lke3/a;->b(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lg40/c1;->x:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public c()Lud3/b0;
    .locals 3

    new-instance v0, Lud3/b0;

    iget-object v1, p0, Lg40/c1;->w:Ljava/util/ArrayList;

    iget-object v2, p0, Lg40/c1;->x:Ljava/util/ArrayList;

    invoke-direct {v0, v1, v2}, Lud3/b0;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    return-object v0
.end method

.method public n(I)I
    .locals 3

    iget-object v0, p0, Lg40/c1;->x:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    if-ge v1, p1, :cond_1

    add-int/lit8 v2, v2, 0x1

    if-ltz v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {}, Lwb3/f;->c0()V

    const/4 p1, 0x0

    throw p1

    :cond_3
    :goto_1
    sub-int/2addr p1, v2

    return p1
.end method

.method public x(I)I
    .locals 1

    iget-object v0, p0, Lg40/c1;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1
.end method
