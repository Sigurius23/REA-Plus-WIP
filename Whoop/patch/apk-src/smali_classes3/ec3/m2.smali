.class public final Lec3/m2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/t1;


# instance fields
.field public final w:Lec3/t1;

.field public final x:Ls83/i;


# direct methods
.method public constructor <init>(Lec3/t1;Lc93/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lec3/m2;->w:Lec3/t1;

    check-cast p2, Ls83/i;

    iput-object p2, p0, Lec3/m2;->x:Ls83/i;

    return-void
.end method


# virtual methods
.method public final collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lec3/l2;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lec3/l2;

    iget v1, v0, Lec3/l2;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lec3/l2;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lec3/l2;

    invoke-direct {v0, p0, p2}, Lec3/l2;-><init>(Lec3/m2;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lec3/l2;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lec3/l2;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Lec3/k2;

    iget-object v2, p0, Lec3/m2;->x:Ls83/i;

    invoke-direct {p2, p1, v2}, Lec3/k2;-><init>(Lec3/m;Lc93/m;)V

    iput v3, v0, Lec3/l2;->y:I

    iget-object p1, p0, Lec3/m2;->w:Lec3/t1;

    invoke-interface {p1, p2, v0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public final getReplayCache()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lec3/m2;->w:Lec3/t1;

    invoke-interface {v0}, Lec3/t1;->getReplayCache()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
