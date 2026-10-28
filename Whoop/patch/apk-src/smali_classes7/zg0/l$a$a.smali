.class final Lzg0/l$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzg0/l$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lzg0/m;

.field final synthetic x:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lzg0/m;Lec3/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzg0/m;",
            "Lec3/m;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lzg0/l$a$a;->w:Lzg0/m;

    iput-object p2, p0, Lzg0/l$a$a;->x:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lzg0/i;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzg0/i;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lzg0/l$a$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lzg0/l$a$a$a;

    iget v1, v0, Lzg0/l$a$a$a;->K:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lzg0/l$a$a$a;->K:I

    goto :goto_0

    :cond_0
    new-instance v0, Lzg0/l$a$a$a;

    invoke-direct {v0, p0, p2}, Lzg0/l$a$a$a;-><init>(Lzg0/l$a$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lzg0/l$a$a$a;->I:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lzg0/l$a$a$a;->K:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget p1, v0, Lzg0/l$a$a$a;->G:I

    iget-object v2, v0, Lzg0/l$a$a$a;->F:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v0, Lzg0/l$a$a$a;->z:Ljava/lang/Object;

    check-cast v2, Ljava/util/Iterator;

    iget-object v5, v0, Lzg0/l$a$a$a;->y:Ljava/lang/Object;

    check-cast v5, Lec3/m;

    iget-object v6, v0, Lzg0/l$a$a$a;->x:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Iterable;

    iget-object v6, v0, Lzg0/l$a$a$a;->w:Ljava/lang/Object;

    check-cast v6, Lzg0/i;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lzg0/l$a$a;->w:Lzg0/m;

    invoke-virtual {p1}, Lzg0/i;->f()Lzg0/f;

    move-result-object v2

    invoke-virtual {v2}, Lzg0/f;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lzg0/i;->f()Lzg0/f;

    move-result-object v5

    invoke-virtual {v5}, Lzg0/f;->e()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v5, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lzg0/e;

    invoke-virtual {v7}, Lzg0/e;->e()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lzg0/i;->f()Lzg0/f;

    move-result-object v5

    invoke-virtual {v5}, Lzg0/f;->e()Ljava/util/List;

    move-result-object v5

    invoke-virtual {p1}, Lzg0/i;->v()Z

    move-result p1

    invoke-static {v5, p1}, Lzg0/l;->a(Ljava/util/List;Z)Ljava/util/Set;

    move-result-object p1

    invoke-virtual {p2, v2, v6, p1}, Lzg0/m;->a(Ljava/lang/String;Ljava/util/List;Ljava/util/Set;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object p2, p0, Lzg0/l$a$a;->x:Lec3/m;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v2, p1

    move-object v5, p2

    move p1, v3

    :cond_4
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    const/4 v6, 0x0

    iput-object v6, v0, Lzg0/l$a$a$a;->w:Ljava/lang/Object;

    iput-object v6, v0, Lzg0/l$a$a$a;->x:Ljava/lang/Object;

    iput-object v5, v0, Lzg0/l$a$a$a;->y:Ljava/lang/Object;

    iput-object v2, v0, Lzg0/l$a$a$a;->z:Ljava/lang/Object;

    iput-object v6, v0, Lzg0/l$a$a$a;->E:Ljava/lang/Object;

    iput-object v6, v0, Lzg0/l$a$a$a;->F:Ljava/lang/Object;

    iput p1, v0, Lzg0/l$a$a$a;->G:I

    iput v3, v0, Lzg0/l$a$a$a;->H:I

    iput v4, v0, Lzg0/l$a$a$a;->K:I

    invoke-interface {v5, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lzg0/i;

    invoke-virtual {p0, p1, p2}, Lzg0/l$a$a;->b(Lzg0/i;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
