.class public final Lc0/o1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public w:I

.field public final synthetic x:Lc0/n1;

.field public final synthetic y:J

.field public final synthetic z:Lc0/q1;


# direct methods
.method public constructor <init>(Lc0/n1;JLc0/q1;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lc0/o1;->x:Lc0/n1;

    iput-wide p2, p0, Lc0/o1;->y:J

    iput-object p4, p0, Lc0/o1;->z:Lc0/q1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6

    new-instance v0, Lc0/o1;

    iget-wide v2, p0, Lc0/o1;->y:J

    iget-object v4, p0, Lc0/o1;->z:Lc0/q1;

    iget-object v1, p0, Lc0/o1;->x:Lc0/n1;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lc0/o1;-><init>(Lc0/n1;JLc0/q1;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lc0/o1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lc0/o1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lc0/o1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lc0/o1;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lc0/o1;->x:Lc0/n1;

    iget-object v3, p1, Lc0/n1;->a:Ld0/e;

    new-instance v4, Ly3/l;

    iget-wide v5, p0, Lc0/o1;->y:J

    invoke-direct {v4, v5, v6}, Ly3/l;-><init>(J)V

    iget-object p1, p0, Lc0/o1;->z:Lc0/q1;

    iget-object v5, p1, Lc0/q1;->P:Ld0/l;

    iput v2, p0, Lc0/o1;->w:I

    const/4 v6, 0x0

    const/16 v8, 0xc

    move-object v7, p0

    invoke-static/range {v3 .. v8}, Ld0/e;->d(Ld0/e;Ljava/lang/Object;Ld0/l;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Ld0/j;

    iget-object p1, p1, Ld0/j;->b:Ld0/i;

    sget-object p1, Ld0/i;->w:Ld0/i;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
