.class public final Lig/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhg/e;


# instance fields
.field public final w:Lhg/i;

.field public final x:Lyf/k;

.field public final y:J

.field public z:I


# direct methods
.method public constructor <init>(Lig/d;Lhg/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lig/b;->w:Lhg/i;

    iget-object p1, p1, Lig/d;->w:Lyf/k;

    iput-object p1, p0, Lig/b;->x:Lyf/k;

    iget-object p1, p1, Lyf/k;->w:Lne3/h;

    iget-wide p1, p1, Lne3/h;->x:J

    iput-wide p1, p0, Lig/b;->y:J

    return-void
.end method


# virtual methods
.method public final j(Lhg/k;)V
    .locals 7

    iget v0, p0, Lig/b;->z:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lig/b;->z:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lig/b;->w:Lhg/i;

    iget-object v2, v1, Lhg/i;->c:Ljava/util/Set;

    check-cast v2, Ljava/lang/Iterable;

    instance-of v3, v2, Ljava/util/Collection;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lhg/d;

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v2, v1, Lhg/i;->c:Ljava/util/Set;

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lhg/d;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    const-class v6, Lig/a;

    if-ne v5, v6, :cond_2

    goto :goto_2

    :cond_3
    move-object v3, v4

    :goto_2
    check-cast v3, Lhg/d;

    instance-of v2, v3, Lig/a;

    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    move-object v4, v3

    :goto_3
    check-cast v4, Lig/a;

    if-nez v4, :cond_5

    sget-object v4, Lig/a;->a:Lig/a;

    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v1}, Lds/q;->l(Lhg/i;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".member."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, p0, Lig/b;->z:I

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lig/d;

    iget-object v2, p0, Lig/b;->x:Lyf/k;

    invoke-direct {v1, v2, v0}, Lig/d;-><init>(Lyf/k;Ljava/lang/String;)V

    iget-object v0, p1, Lhg/k;->b:Lkotlin/jvm/internal/i;

    iget-object p1, p1, Lhg/k;->a:Ljava/lang/Object;

    invoke-interface {v0, v1, p1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
