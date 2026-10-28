.class public final Lp0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb2/u;


# instance fields
.field public w:Z

.field public final x:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lp0/d;->x:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final j(Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p1, Lp0/c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lp0/c;

    iget v1, v0, Lp0/c;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lp0/c;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lp0/c;

    invoke-direct {v0, p0, p1}, Lp0/c;-><init>(Lp0/d;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lp0/c;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lp0/c;->z:I

    iget-object v3, p0, Lp0/d;->x:Ljava/util/ArrayList;

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Lp0/c;->w:Lkotlin/jvm/internal/g0;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lp0/d;->w:Z

    if-nez p1, :cond_4

    new-instance p1, Lkotlin/jvm/internal/g0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    :try_start_1
    iput-object p1, v0, Lp0/c;->w:Lkotlin/jvm/internal/g0;

    iput v4, v0, Lp0/c;->z:I

    new-instance v2, Lbc3/m;

    invoke-static {v0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v0

    invoke-direct {v2, v4, v0}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v2}, Lbc3/m;->s()V

    iput-object v2, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p1

    :goto_1
    iget-object p1, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/jvm/internal/m0;->a(Ljava/util/AbstractCollection;)Ljava/util/Collection;

    invoke-interface {v3, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object v5, v0

    move-object v0, p1

    move-object p1, v5

    :goto_2
    iget-object v0, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/jvm/internal/m0;->a(Ljava/util/AbstractCollection;)Ljava/util/Collection;

    invoke-interface {v3, v0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    throw p1

    :cond_4
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
