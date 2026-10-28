.class public final Lhf/i;
.super Lhf/a;
.source "SourceFile"

# interfaces
.implements Ld93/f;
.implements Ljava/util/Set;


# instance fields
.field public final F:Ljava/util/Set;

.field public final G:Lkotlin/jvm/internal/c;

.field public final H:Lkotlin/jvm/internal/i;


# direct methods
.method public constructor <init>(Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const-string v0, "src"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-direct {p0, v0, p2, p3}, Lhf/a;-><init>(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    iput-object p1, p0, Lhf/i;->F:Ljava/util/Set;

    check-cast p2, Lkotlin/jvm/internal/c;

    iput-object p2, p0, Lhf/i;->G:Lkotlin/jvm/internal/c;

    check-cast p3, Lkotlin/jvm/internal/i;

    iput-object p3, p0, Lhf/i;->H:Lkotlin/jvm/internal/i;

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lhf/i;->H:Lkotlin/jvm/internal/i;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lhf/i;->F:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 2

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lhf/i;->H:Lkotlin/jvm/internal/i;

    iget-object v1, p0, Lhf/i;->G:Lkotlin/jvm/internal/c;

    invoke-static {p1, v0, v1}, Lhg3/i;->r(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lhf/a;

    move-result-object p1

    iget-object v0, p0, Lhf/i;->F:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final clear()V
    .locals 1

    iget-object v0, p0, Lhf/i;->F:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-void
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    iget-object v0, p0, Lhf/i;->F:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "src2Dest"

    iget-object v2, p0, Lhf/i;->G:Lkotlin/jvm/internal/c;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lhf/d;

    invoke-direct {v1, v0, v2}, Lhf/d;-><init>(Ljava/util/Iterator;Lkotlin/jvm/functions/Function1;)V

    return-object v1
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lhf/i;->H:Lkotlin/jvm/internal/i;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lhf/i;->F:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 2

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lhf/i;->H:Lkotlin/jvm/internal/i;

    iget-object v1, p0, Lhf/i;->G:Lkotlin/jvm/internal/c;

    invoke-static {p1, v0, v1}, Lhg3/i;->r(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lhf/a;

    move-result-object p1

    iget-object v0, p0, Lhf/i;->F:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 2

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lhf/i;->H:Lkotlin/jvm/internal/i;

    iget-object v1, p0, Lhf/i;->G:Lkotlin/jvm/internal/c;

    invoke-static {p1, v0, v1}, Lhg3/i;->r(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lhf/a;

    move-result-object p1

    iget-object v0, p0, Lhf/i;->F:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->retainAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method
