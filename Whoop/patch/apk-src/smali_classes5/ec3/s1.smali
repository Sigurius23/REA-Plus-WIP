.class public final Lec3/s1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/l;
.implements Lec3/d;


# instance fields
.field public final w:Ls83/i;


# direct methods
.method public constructor <init>(Lc93/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    check-cast p1, Ls83/i;

    iput-object p1, p0, Lec3/s1;->w:Ls83/i;

    return-void
.end method


# virtual methods
.method public final collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lec3/a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lec3/a;

    iget v1, v0, Lec3/a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lec3/a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lec3/a;

    invoke-direct {v0, p0, p2}, Lec3/a;-><init>(Lec3/s1;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lec3/a;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lec3/a;->z:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lec3/a;->w:Lfc3/t;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p2

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Lfc3/t;

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v2

    invoke-direct {p2, p1, v2}, Lfc3/t;-><init>(Lec3/m;Lq83/j;)V

    :try_start_1
    iput-object p2, v0, Lec3/a;->w:Lfc3/t;

    iput v4, v0, Lec3/a;->z:I

    iget-object p1, p0, Lec3/s1;->w:Ls83/i;

    invoke-interface {p1, p2, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_3

    goto :goto_1

    :cond_3
    move-object p1, v3

    :goto_1
    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    move-object p1, p2

    :goto_2
    invoke-virtual {p1}, Ls83/c;->releaseIntercepted()V

    return-object v3

    :goto_3
    move-object v5, p2

    move-object p2, p1

    move-object p1, v5

    goto :goto_4

    :catchall_1
    move-exception p1

    goto :goto_3

    :goto_4
    invoke-virtual {p1}, Ls83/c;->releaseIntercepted()V

    throw p2
.end method
