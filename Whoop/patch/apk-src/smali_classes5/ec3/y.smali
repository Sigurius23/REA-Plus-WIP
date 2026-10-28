.class public final Lec3/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/l;


# instance fields
.field public final synthetic w:Lec3/l;

.field public final synthetic x:Ls83/i;


# direct methods
.method public constructor <init>(Lec3/l;Lkotlin/jvm/functions/Function3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lec3/y;->w:Lec3/l;

    check-cast p2, Ls83/i;

    iput-object p2, p0, Lec3/y;->x:Ls83/i;

    return-void
.end method


# virtual methods
.method public final collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, Lec3/x;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lec3/x;

    iget v1, v0, Lec3/x;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lec3/x;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lec3/x;

    invoke-direct {v0, p0, p2}, Lec3/x;-><init>(Lec3/y;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lec3/x;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lec3/x;->x:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lec3/x;->z:Ljava/lang/Object;

    check-cast p1, Lfc3/t;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p2

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lec3/x;->z:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_6

    :cond_3
    iget-object p1, v0, Lec3/x;->E:Lec3/m;

    iget-object v2, v0, Lec3/x;->z:Ljava/lang/Object;

    check-cast v2, Lec3/y;

    :try_start_1
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_4

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iget-object p2, p0, Lec3/y;->w:Lec3/l;

    iput-object p0, v0, Lec3/x;->z:Ljava/lang/Object;

    iput-object p1, v0, Lec3/x;->E:Lec3/m;

    iput v5, v0, Lec3/x;->x:I

    invoke-interface {p2, p1, v0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    if-ne p2, v1, :cond_5

    goto :goto_5

    :cond_5
    move-object v2, p0

    :goto_1
    new-instance p2, Lfc3/t;

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v4

    invoke-direct {p2, p1, v4}, Lfc3/t;-><init>(Lec3/m;Lq83/j;)V

    :try_start_3
    iget-object p1, v2, Lec3/y;->x:Ls83/i;

    iput-object p2, v0, Lec3/x;->z:Ljava/lang/Object;

    iput-object v6, v0, Lec3/x;->E:Lec3/m;

    iput v3, v0, Lec3/x;->x:I

    invoke-interface {p1, p2, v6, v0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-ne p1, v1, :cond_6

    goto :goto_5

    :cond_6
    move-object p1, p2

    :goto_2
    invoke-virtual {p1}, Ls83/c;->releaseIntercepted()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_2
    move-exception p1

    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    :goto_3
    invoke-virtual {p1}, Ls83/c;->releaseIntercepted()V

    throw p2

    :catchall_3
    move-exception p1

    move-object v2, p0

    :goto_4
    new-instance p2, Lec3/n2;

    invoke-direct {p2, p1}, Lec3/n2;-><init>(Ljava/lang/Throwable;)V

    iget-object v2, v2, Lec3/y;->x:Ls83/i;

    iput-object p1, v0, Lec3/x;->z:Ljava/lang/Object;

    iput-object v6, v0, Lec3/x;->E:Lec3/m;

    iput v4, v0, Lec3/x;->x:I

    invoke-static {p2, v2, p1, v0}, Lec3/v;->e(Lec3/n2;Lkotlin/jvm/functions/Function3;Ljava/lang/Throwable;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    :goto_5
    return-object v1

    :cond_7
    :goto_6
    throw p1
.end method
