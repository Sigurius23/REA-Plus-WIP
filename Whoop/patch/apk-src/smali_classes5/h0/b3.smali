.class public final Lh0/b3;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public w:J

.field public x:I

.field public synthetic y:J

.field public final synthetic z:Lh0/c3;


# direct methods
.method public constructor <init>(Lh0/c3;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lh0/b3;->z:Lh0/c3;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    new-instance v0, Lh0/b3;

    iget-object v1, p0, Lh0/b3;->z:Lh0/c3;

    invoke-direct {v0, v1, p2}, Lh0/b3;-><init>(Lh0/c3;Lq83/d;)V

    check-cast p1, Ly3/q;

    iget-wide p1, p1, Ly3/q;->a:J

    iput-wide p1, v0, Lh0/b3;->y:J

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Ly3/q;

    iget-wide v0, p1, Ly3/q;->a:J

    check-cast p2, Lq83/d;

    new-instance p1, Lh0/b3;

    iget-object v2, p0, Lh0/b3;->z:Lh0/c3;

    invoke-direct {p1, v2, p2}, Lh0/b3;-><init>(Lh0/c3;Lq83/d;)V

    iput-wide v0, p1, Lh0/b3;->y:J

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh0/b3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lh0/b3;->x:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    iget-object v5, p0, Lh0/b3;->z:Lh0/c3;

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-wide v0, p0, Lh0/b3;->w:J

    iget-wide v2, p0, Lh0/b3;->y:J

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-wide v3, p0, Lh0/b3;->w:J

    iget-wide v6, p0, Lh0/b3;->y:J

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    iget-wide v6, p0, Lh0/b3;->y:J

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-wide v6, p0, Lh0/b3;->y:J

    iget-object p1, v5, Lh0/c3;->f:Lt2/d;

    iput-wide v6, p0, Lh0/b3;->y:J

    iput v4, p0, Lh0/b3;->x:I

    invoke-virtual {p1, v6, v7, p0}, Lt2/d;->b(JLs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_2

    :cond_4
    :goto_0
    check-cast p1, Ly3/q;

    iget-wide v8, p1, Ly3/q;->a:J

    invoke-static {v6, v7, v8, v9}, Ly3/q;->f(JJ)J

    move-result-wide v8

    iput-wide v6, p0, Lh0/b3;->y:J

    iput-wide v8, p0, Lh0/b3;->w:J

    iput v3, p0, Lh0/b3;->x:I

    invoke-virtual {v5, v8, v9, p0}, Lh0/c3;->a(JLs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_2

    :cond_5
    move-wide v3, v8

    :goto_1
    check-cast p1, Ly3/q;

    iget-wide v11, p1, Ly3/q;->a:J

    iget-object v8, v5, Lh0/c3;->f:Lt2/d;

    invoke-static {v3, v4, v11, v12}, Ly3/q;->f(JJ)J

    move-result-wide v9

    iput-wide v6, p0, Lh0/b3;->y:J

    iput-wide v11, p0, Lh0/b3;->w:J

    iput v2, p0, Lh0/b3;->x:I

    move-object v13, p0

    invoke-virtual/range {v8 .. v13}, Lt2/d;->a(JJLs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_2
    return-object v0

    :cond_6
    move-wide v2, v6

    move-wide v0, v11

    :goto_3
    check-cast p1, Ly3/q;

    iget-wide v4, p1, Ly3/q;->a:J

    invoke-static {v0, v1, v4, v5}, Ly3/q;->f(JJ)J

    move-result-wide v0

    invoke-static {v2, v3, v0, v1}, Ly3/q;->f(JJ)J

    move-result-wide v0

    new-instance p1, Ly3/q;

    invoke-direct {p1, v0, v1}, Ly3/q;-><init>(J)V

    return-object p1
.end method
