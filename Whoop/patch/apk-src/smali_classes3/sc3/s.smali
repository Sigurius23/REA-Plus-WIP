.class public final Lsc3/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsc3/n;


# instance fields
.field public final a:Lsc3/c;

.field public final b:Ljava/util/Set;


# direct methods
.method public constructor <init>(Lsc3/c;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsc3/s;->a:Lsc3/c;

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v0

    invoke-static {v0, p1}, Lsc3/l;->c(Ln83/c;Lsc3/k;)V

    invoke-static {v0}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ln83/c;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p1

    :cond_0
    :goto_0
    move-object v1, p1

    check-cast v1, Ln83/b;

    invoke-virtual {v1}, Ln83/b;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ln83/b;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsc3/j;

    invoke-interface {v1}, Lsc3/j;->c()Lsc3/a;

    move-result-object v1

    invoke-virtual {v1}, Lsc3/a;->d()Lqc3/l0;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lsc3/s;->b:Ljava/util/Set;

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Signed format must contain at least one field with a sign"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a()Ltc3/a;
    .locals 2

    iget-object v0, p0, Lsc3/s;->a:Lsc3/c;

    iget-object v0, v0, Lsc3/c;->a:Lsc3/j;

    invoke-interface {v0}, Lsc3/j;->a()Ltc3/a;

    new-instance v0, Ltc3/a;

    new-instance v1, Lq00/h0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0
.end method

.method public final b()Luc3/l;
    .locals 5

    new-instance v0, Luc3/l;

    new-instance v1, Luc3/o;

    new-instance v2, Lr12/a;

    const/16 v3, 0x15

    invoke-direct {v2, p0, v3}, Lr12/a;-><init>(Ljava/lang/Object;I)V

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "sign for "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lsc3/s;->b:Ljava/util/Set;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Luc3/o;-><init>(Lr12/a;Ljava/lang/String;)V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sget-object v2, Lm83/y;->w:Lm83/y;

    invoke-direct {v0, v1, v2}, Luc3/l;-><init>(Ljava/util/List;Ljava/util/List;)V

    iget-object v1, p0, Lsc3/s;->a:Lsc3/c;

    iget-object v1, v1, Lsc3/c;->a:Lsc3/j;

    invoke-interface {v1}, Lsc3/j;->b()Luc3/l;

    move-result-object v1

    filled-new-array {v0, v1}, [Luc3/l;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lsb3/a;->c(Ljava/util/List;)Luc3/l;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lsc3/s;

    if-eqz v0, :cond_0

    check-cast p1, Lsc3/s;

    iget-object p1, p1, Lsc3/s;->a:Lsc3/c;

    iget-object v0, p0, Lsc3/s;->a:Lsc3/c;

    invoke-virtual {v0, p1}, Lsc3/c;->equals(Ljava/lang/Object;)Z

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

    iget-object v0, p0, Lsc3/s;->a:Lsc3/c;

    iget-object v0, v0, Lsc3/c;->a:Lsc3/j;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SignedFormatStructure("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lsc3/s;->a:Lsc3/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
