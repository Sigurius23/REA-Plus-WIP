.class public final Lec3/k2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final w:Lec3/m;

.field public final x:Ls83/i;


# direct methods
.method public constructor <init>(Lec3/m;Lc93/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lec3/k2;->w:Lec3/m;

    check-cast p2, Ls83/i;

    iput-object p2, p0, Lec3/k2;->x:Ls83/i;

    return-void
.end method


# virtual methods
.method public final b(Ls83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p1, Lec3/j2;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lec3/j2;

    iget v1, v0, Lec3/j2;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lec3/j2;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lec3/j2;

    invoke-direct {v0, p0, p1}, Lec3/j2;-><init>(Lec3/k2;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lec3/j2;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lec3/j2;->E:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lec3/j2;->x:Lfc3/t;

    iget-object v5, v0, Lec3/j2;->w:Lec3/k2;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v2, Lfc3/t;

    iget-object p1, p0, Lec3/k2;->w:Lec3/m;

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v6

    invoke-direct {v2, p1, v6}, Lfc3/t;-><init>(Lec3/m;Lq83/j;)V

    :try_start_1
    iget-object p1, p0, Lec3/k2;->x:Ls83/i;

    iput-object p0, v0, Lec3/j2;->w:Lec3/k2;

    iput-object v2, v0, Lec3/j2;->x:Lfc3/t;

    iput v5, v0, Lec3/j2;->E:I

    invoke-interface {p1, v2, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v5, p0

    :goto_1
    invoke-virtual {v2}, Ls83/c;->releaseIntercepted()V

    iget-object p1, v5, Lec3/k2;->w:Lec3/m;

    instance-of v2, p1, Lec3/k2;

    if-eqz v2, :cond_5

    check-cast p1, Lec3/k2;

    const/4 v2, 0x0

    iput-object v2, v0, Lec3/j2;->w:Lec3/k2;

    iput-object v2, v0, Lec3/j2;->x:Lfc3/t;

    iput v4, v0, Lec3/j2;->E:I

    invoke-virtual {p1, v0}, Lec3/k2;->b(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    return-object v3

    :goto_3
    invoke-virtual {v2}, Ls83/c;->releaseIntercepted()V

    throw p1
.end method

.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lec3/k2;->w:Lec3/m;

    invoke-interface {v0, p1, p2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
