.class public final Lsc3/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsc3/n;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lsc3/f;

.field public final c:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lsc3/f;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsc3/p;->a:Ljava/lang/String;

    iput-object p2, p0, Lsc3/p;->b:Lsc3/f;

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object p1

    invoke-static {p1, p2}, Lsc3/l;->c(Ln83/c;Lsc3/k;)V

    invoke-static {p1}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object p1

    new-instance p2, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p1, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p2, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ln83/c;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p1

    :goto_0
    move-object v1, p1

    check-cast v1, Ln83/b;

    invoke-virtual {v1}, Ln83/b;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ln83/b;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsc3/j;

    invoke-interface {v1}, Lsc3/j;->c()Lsc3/a;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {p2}, Lm83/s;->y0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    invoke-static {p1, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsc3/a;

    const-string v1, "field"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lsc3/a;->b()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    new-instance v2, Lsc3/o;

    invoke-virtual {v0}, Lsc3/a;->a()Lsc3/r;

    move-result-object v0

    invoke-direct {v2, v0, v1}, Lsc3/o;-><init>(Lsc3/r;Ljava/lang/Object;)V

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "The field \'"

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lsc3/a;->c()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\' does not define a default value"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    iput-object p2, p0, Lsc3/p;->c:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a()Ltc3/a;
    .locals 14

    iget-object v0, p0, Lsc3/p;->b:Lsc3/f;

    invoke-virtual {v0}, Lsc3/f;->a()Ltc3/a;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    iget-object v3, p0, Lsc3/p;->c:Ljava/util/ArrayList;

    invoke-static {v3, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lsc3/o;

    new-instance v4, Lsc3/e;

    iget-object v5, v3, Lsc3/o;->b:Ljava/lang/Object;

    new-instance v6, Lq00/h0;

    iget-object v8, v3, Lsc3/o;->a:Lsc3/r;

    const/4 v12, 0x0

    const/16 v13, 0xa

    const/4 v7, 0x1

    const-class v9, Lsc3/r;

    const-string v10, "getter"

    const-string v11, "getter(Ljava/lang/Object;)Ljava/lang/Object;"

    invoke-direct/range {v6 .. v13}, Lq00/h0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-direct {v4, v5, v6}, Lsc3/e;-><init>(Ljava/lang/Object;Lq00/h0;)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    sget-object v5, Lsc3/t;->a:Lsc3/t;

    if-eqz v2, :cond_1

    move-object v8, v5

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_2

    invoke-static {v1}, Lm83/s;->p1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsc3/q;

    move-object v8, v1

    goto :goto_1

    :cond_2
    new-instance v2, Lsc3/g;

    invoke-direct {v2, v1}, Lsc3/g;-><init>(Ljava/util/ArrayList;)V

    move-object v8, v2

    :goto_1
    instance-of v1, v8, Lsc3/t;

    if-eqz v1, :cond_3

    new-instance v0, Ltc3/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    :cond_3
    new-instance v1, Ltc3/a;

    new-instance v6, Lq00/h0;

    const/4 v12, 0x0

    const/16 v13, 0xb

    const/4 v7, 0x1

    const-class v9, Lsc3/q;

    const-string v10, "test"

    const-string v11, "test(Ljava/lang/Object;)Z"

    invoke-direct/range {v6 .. v13}, Lq00/h0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v2, Ltc3/a;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    new-instance v11, Ll83/k;

    invoke-direct {v11, v6, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Lq00/h0;

    const/4 v9, 0x0

    const/16 v10, 0xc

    const/4 v4, 0x1

    const-class v6, Lsc3/t;

    const-string v7, "test"

    const-string v8, "test(Ljava/lang/Object;)Z"

    invoke-direct/range {v3 .. v10}, Lq00/h0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v2, Ll83/k;

    invoke-direct {v2, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v11, v2}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    return-object v1
.end method

.method public final b()Luc3/l;
    .locals 8

    new-instance v0, Luc3/l;

    iget-object v1, p0, Lsc3/p;->b:Lsc3/f;

    invoke-virtual {v1}, Lsc3/f;->b()Luc3/l;

    move-result-object v1

    new-instance v2, Lsc3/h;

    iget-object v3, p0, Lsc3/p;->a:Ljava/lang/String;

    invoke-direct {v2, v3}, Lsc3/h;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lsc3/h;->b()Luc3/l;

    move-result-object v2

    new-instance v3, Luc3/l;

    iget-object v4, p0, Lsc3/p;->c:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    sget-object v5, Lm83/y;->w:Lm83/y;

    if-eqz v4, :cond_0

    move-object v4, v5

    goto :goto_0

    :cond_0
    new-instance v4, Luc3/p;

    new-instance v6, Lrq0/x;

    const/16 v7, 0xb

    invoke-direct {v6, p0, v7}, Lrq0/x;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v4, v6}, Luc3/p;-><init>(Lrq0/x;)V

    invoke-static {v4}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    :goto_0
    invoke-direct {v3, v4, v5}, Luc3/l;-><init>(Ljava/util/List;Ljava/util/List;)V

    filled-new-array {v2, v3}, [Luc3/l;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lsb3/a;->c(Ljava/util/List;)Luc3/l;

    move-result-object v2

    filled-new-array {v1, v2}, [Luc3/l;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v5, v1}, Luc3/l;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lsc3/p;

    if-eqz v0, :cond_0

    check-cast p1, Lsc3/p;

    iget-object v0, p1, Lsc3/p;->a:Ljava/lang/String;

    iget-object v1, p0, Lsc3/p;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lsc3/p;->b:Lsc3/f;

    iget-object p1, p1, Lsc3/p;->b:Lsc3/f;

    invoke-virtual {v0, p1}, Lsc3/f;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lsc3/p;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lsc3/p;->b:Lsc3/f;

    iget-object v1, v1, Lsc3/f;->a:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Optional("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lsc3/p;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lsc3/p;->b:Lsc3/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
