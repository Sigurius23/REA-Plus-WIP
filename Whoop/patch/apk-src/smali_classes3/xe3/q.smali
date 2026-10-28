.class public final Lxe3/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldf3/a;


# instance fields
.field public final a:C

.field public b:I

.field public final c:Ljava/util/LinkedList;


# direct methods
.method public constructor <init>(C)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lxe3/q;->b:I

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lxe3/q;->c:Ljava/util/LinkedList;

    iput-char p1, p0, Lxe3/q;->a:C

    return-void
.end method


# virtual methods
.method public final a(Lxe3/d;Lxe3/d;)I
    .locals 5

    iget-object v0, p1, Lxe3/d;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Lxe3/q;->c:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ldf3/a;

    invoke-interface {v3}, Ldf3/a;->c()I

    move-result v4

    if-gt v4, v0, :cond_0

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ldf3/a;

    :goto_0
    invoke-interface {v3, p1, p2}, Ldf3/a;->a(Lxe3/d;Lxe3/d;)I

    move-result p1

    return p1
.end method

.method public final b()C
    .locals 1

    iget-char v0, p0, Lxe3/q;->a:C

    return v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lxe3/q;->b:I

    return v0
.end method

.method public final d()C
    .locals 1

    iget-char v0, p0, Lxe3/q;->a:C

    return v0
.end method

.method public final e(Ldf3/a;)V
    .locals 5

    invoke-interface {p1}, Ldf3/a;->c()I

    move-result v0

    iget-object v1, p0, Lxe3/q;->c:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/AbstractList;->listIterator()Ljava/util/ListIterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/ListIterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ldf3/a;

    invoke-interface {v3}, Ldf3/a;->c()I

    move-result v4

    if-le v0, v4, :cond_0

    invoke-interface {v2}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    invoke-interface {v2, p1}, Ljava/util/ListIterator;->add(Ljava/lang/Object;)V

    return-void

    :cond_0
    if-eq v0, v4, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Cannot add two delimiter processors for char \'"

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-char v4, p0, Lxe3/q;->a:C

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v4, "\' and minimum length "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "; conflicting processors: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-virtual {v1, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    iput v0, p0, Lxe3/q;->b:I

    return-void
.end method
