.class public final Lhf/e;
.super Lh5/z;
.source "SourceFile"

# interfaces
.implements Ljava/util/ListIterator;


# instance fields
.field public final E:Lkotlin/jvm/functions/Function1;

.field public final F:Ljava/util/ListIterator;

.field public final G:Lkotlin/jvm/functions/Function1;

.field public final z:Ljava/util/ListIterator;


# direct methods
.method public constructor <init>(Ljava/util/ListIterator;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const-string v0, "src"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "src2Dest"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dest2Src"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lh5/z;-><init>(Ljava/util/Iterator;Lkotlin/jvm/functions/Function1;)V

    iput-object p1, p0, Lhf/e;->z:Ljava/util/ListIterator;

    iput-object p2, p0, Lhf/e;->E:Lkotlin/jvm/functions/Function1;

    iput-object p1, p0, Lhf/e;->F:Ljava/util/ListIterator;

    iput-object p3, p0, Lhf/e;->G:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lhf/e;->G:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lhf/e;->F:Ljava/util/ListIterator;

    invoke-interface {v0, p1}, Ljava/util/ListIterator;->add(Ljava/lang/Object;)V

    return-void
.end method

.method public final hasPrevious()Z
    .locals 1

    iget-object v0, p0, Lhf/e;->z:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    return v0
.end method

.method public final nextIndex()I
    .locals 1

    iget-object v0, p0, Lhf/e;->z:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    move-result v0

    return v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lhf/e;->z:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lhf/e;->E:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final previousIndex()I
    .locals 1

    iget-object v0, p0, Lhf/e;->z:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->previousIndex()I

    move-result v0

    return v0
.end method

.method public final remove()V
    .locals 1

    iget-object v0, p0, Lhf/e;->F:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->remove()V

    return-void
.end method

.method public final set(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lhf/e;->G:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lhf/e;->F:Ljava/util/ListIterator;

    invoke-interface {v0, p1}, Ljava/util/ListIterator;->set(Ljava/lang/Object;)V

    return-void
.end method
