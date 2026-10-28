.class public final Lh0/g3;
.super Ls83/h;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lu2/r;

.field public x:J

.field public y:I

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lu2/r;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lh0/g3;->E:Lu2/r;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/h;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    new-instance v0, Lh0/g3;

    iget-object v1, p0, Lh0/g3;->E:Lu2/r;

    invoke-direct {v0, v1, p2}, Lh0/g3;-><init>(Lu2/r;Lq83/d;)V

    iput-object p1, v0, Lh0/g3;->z:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu2/b;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh0/g3;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh0/g3;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh0/g3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lh0/g3;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-wide v3, p0, Lh0/g3;->x:J

    iget-object v1, p0, Lh0/g3;->z:Ljava/lang/Object;

    check-cast v1, Lu2/b;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lh0/g3;->z:Ljava/lang/Object;

    check-cast p1, Lu2/b;

    iget-object v1, p0, Lh0/g3;->E:Lu2/r;

    iget-wide v3, v1, Lu2/r;->b:J

    check-cast p1, Lu2/g0;

    invoke-virtual {p1}, Lu2/g0;->f()Lb3/j3;

    move-result-object v1

    invoke-interface {v1}, Lb3/j3;->b()J

    move-result-wide v5

    add-long/2addr v5, v3

    move-object v1, p1

    move-wide v3, v5

    :cond_2
    iput-object v1, p0, Lh0/g3;->z:Ljava/lang/Object;

    iput-wide v3, p0, Lh0/g3;->x:J

    iput v2, p0, Lh0/g3;->y:I

    const/4 p1, 0x3

    invoke-static {v1, p0, p1}, Lh0/o3;->c(Lu2/b;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    check-cast p1, Lu2/r;

    iget-wide v5, p1, Lu2/r;->b:J

    cmp-long v5, v5, v3

    if-ltz v5, :cond_2

    return-object p1
.end method
