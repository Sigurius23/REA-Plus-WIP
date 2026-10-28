.class public final La0/s0;
.super Ls83/h;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public E:I

.field public F:I

.field public synthetic G:Ljava/lang/Object;

.field public final synthetic H:La0/u0;

.field public final synthetic I:La0/t0;

.field public x:La0/t0;

.field public y:La0/u0;

.field public z:[J


# direct methods
.method public constructor <init>(La0/u0;La0/t0;Lq83/d;)V
    .locals 0

    iput-object p1, p0, La0/s0;->H:La0/u0;

    iput-object p2, p0, La0/s0;->I:La0/t0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/h;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    new-instance v0, La0/s0;

    iget-object v1, p0, La0/s0;->H:La0/u0;

    iget-object v2, p0, La0/s0;->I:La0/t0;

    invoke-direct {v0, v1, v2, p2}, La0/s0;-><init>(La0/u0;La0/t0;Lq83/d;)V

    iput-object p1, v0, La0/s0;->G:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lxb3/j;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La0/s0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La0/s0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La0/s0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La0/s0;->F:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget v1, p0, La0/s0;->E:I

    iget-object v3, p0, La0/s0;->z:[J

    iget-object v4, p0, La0/s0;->y:La0/u0;

    iget-object v5, p0, La0/s0;->x:La0/t0;

    iget-object v6, p0, La0/s0;->G:Ljava/lang/Object;

    check-cast v6, Lxb3/j;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La0/s0;->G:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Lxb3/j;

    iget-object v4, p0, La0/s0;->H:La0/u0;

    iget-object p1, v4, La0/u0;->x:La0/r0;

    iget-object v3, p1, La0/r0;->c:[J

    iget v1, p1, La0/r0;->e:I

    iget-object v5, p0, La0/s0;->I:La0/t0;

    :goto_0
    const p1, 0x7fffffff

    if-eq v1, p1, :cond_2

    aget-wide v7, v3, v1

    const/16 p1, 0x1f

    shr-long/2addr v7, p1

    const-wide/32 v9, 0x7fffffff

    and-long/2addr v7, v9

    long-to-int p1, v7

    iput v1, v5, La0/t0;->x:I

    iget-object v7, v4, La0/u0;->x:La0/r0;

    iget-object v7, v7, La0/r0;->b:[Ljava/lang/Object;

    aget-object v1, v7, v1

    iput-object v6, p0, La0/s0;->G:Ljava/lang/Object;

    iput-object v5, p0, La0/s0;->x:La0/t0;

    iput-object v4, p0, La0/s0;->y:La0/u0;

    iput-object v3, p0, La0/s0;->z:[J

    iput p1, p0, La0/s0;->E:I

    iput v2, p0, La0/s0;->F:I

    invoke-virtual {v6, v1, p0}, Lxb3/j;->b(Ljava/lang/Object;Lq83/d;)V

    return-object v0

    :cond_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
