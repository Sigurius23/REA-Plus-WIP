.class public final Lhf/b;
.super Lhf/a;
.source "SourceFile"

# interfaces
.implements Ld93/b;


# instance fields
.field public final F:Ljava/util/Collection;

.field public final G:Lhf/g;

.field public final H:Lhf/g;


# direct methods
.method public constructor <init>(Ljava/util/Collection;Lhf/g;Lhf/g;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lhf/a;-><init>(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    iput-object p1, p0, Lhf/b;->F:Ljava/util/Collection;

    iput-object p2, p0, Lhf/b;->G:Lhf/g;

    iput-object p3, p0, Lhf/b;->H:Lhf/g;

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lhf/b;->H:Lhf/g;

    invoke-virtual {v0, p1}, Lhf/g;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lhf/b;->F:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 2

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lhf/b;->H:Lhf/g;

    iget-object v1, p0, Lhf/b;->G:Lhf/g;

    invoke-static {p1, v0, v1}, Lhg3/i;->r(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lhf/a;

    move-result-object p1

    iget-object v0, p0, Lhf/b;->F:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final clear()V
    .locals 1

    iget-object v0, p0, Lhf/b;->F:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    return-void
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    iget-object v0, p0, Lhf/b;->F:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "src2Dest"

    iget-object v2, p0, Lhf/b;->G:Lhf/g;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lhf/d;

    invoke-direct {v1, v0, v2}, Lhf/d;-><init>(Ljava/util/Iterator;Lkotlin/jvm/functions/Function1;)V

    return-object v1
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lhf/b;->H:Lhf/g;

    invoke-virtual {v0, p1}, Lhf/g;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lhf/b;->F:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 2

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lhf/b;->H:Lhf/g;

    iget-object v1, p0, Lhf/b;->G:Lhf/g;

    invoke-static {p1, v0, v1}, Lhg3/i;->r(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lhf/a;

    move-result-object p1

    iget-object v0, p0, Lhf/b;->F:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 2

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lhf/b;->H:Lhf/g;

    iget-object v1, p0, Lhf/b;->G:Lhf/g;

    invoke-static {p1, v0, v1}, Lhg3/i;->r(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lhf/a;

    move-result-object p1

    iget-object v0, p0, Lhf/b;->F:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->retainAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method
