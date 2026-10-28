.class public final Lt2/g;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/p2;
.implements Lt2/a;


# instance fields
.field public O:Lt2/a;

.field public P:Lt2/d;

.field public Q:Lt2/g;

.field public final R:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lt2/a;Lt2/d;)V
    .locals 0

    invoke-direct {p0}, Lb2/v;-><init>()V

    iput-object p1, p0, Lt2/g;->O:Lt2/a;

    if-nez p2, :cond_0

    new-instance p2, Lt2/d;

    invoke-direct {p2}, Lt2/d;-><init>()V

    :cond_0
    iput-object p2, p0, Lt2/g;->P:Lt2/d;

    const-string p1, "androidx.compose.ui.input.nestedscroll.NestedScrollNode"

    iput-object p1, p0, Lt2/g;->R:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final J(JJI)J
    .locals 6

    iget-object v0, p0, Lt2/g;->O:Lt2/a;

    move-wide v1, p1

    move-wide v3, p3

    move v5, p5

    invoke-interface/range {v0 .. v5}, Lt2/a;->J(JJI)J

    move-result-wide p1

    iget-boolean p3, p0, Lb2/v;->N:Z

    const/4 p4, 0x0

    if-eqz p3, :cond_0

    if-eqz p3, :cond_0

    invoke-static {p0}, La3/g;->g(La3/p2;)La3/p2;

    move-result-object p3

    move-object p4, p3

    check-cast p4, Lt2/g;

    :cond_0
    move-object v0, p4

    if-eqz v0, :cond_1

    invoke-static {v1, v2, p1, p2}, Lh2/b;->h(JJ)J

    move-result-wide v1

    invoke-static {v3, v4, p1, p2}, Lh2/b;->g(JJ)J

    move-result-wide v3

    invoke-virtual/range {v0 .. v5}, Lt2/g;->J(JJI)J

    move-result-wide p3

    goto :goto_0

    :cond_1
    const-wide/16 p3, 0x0

    :goto_0
    invoke-static {p1, p2, p3, p4}, Lh2/b;->h(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final P0()V
    .locals 3

    iget-object v0, p0, Lt2/g;->P:Lt2/d;

    iput-object p0, v0, Lt2/d;->a:Lt2/g;

    const/4 v1, 0x0

    iput-object v1, v0, Lt2/d;->b:Lt2/g;

    iput-object v1, p0, Lt2/g;->Q:Lt2/g;

    new-instance v1, La3/l0;

    const/16 v2, 0x14

    invoke-direct {v1, p0, v2}, La3/l0;-><init>(Ljava/lang/Object;I)V

    iput-object v1, v0, Lt2/d;->c:Lkotlin/jvm/internal/m;

    invoke-virtual {p0}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v1

    iput-object v1, v0, Lt2/d;->d:Lbc3/c0;

    return-void
.end method

.method public final Q0()V
    .locals 3

    new-instance v0, Lkotlin/jvm/internal/g0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, La3/m1;

    const/16 v2, 0x19

    invoke-direct {v1, v0, v2}, La3/m1;-><init>(Ljava/lang/Object;I)V

    invoke-static {p0, v1}, La3/g;->s(La3/p2;Lkotlin/jvm/functions/Function1;)V

    iget-object v0, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, La3/p2;

    check-cast v0, Lt2/g;

    iput-object v0, p0, Lt2/g;->Q:Lt2/g;

    iget-object v1, p0, Lt2/g;->P:Lt2/d;

    iput-object v0, v1, Lt2/d;->b:Lt2/g;

    iget-object v0, v1, Lt2/d;->a:Lt2/g;

    if-ne v0, p0, :cond_0

    const/4 v0, 0x0

    iput-object v0, v1, Lt2/d;->a:Lt2/g;

    :cond_0
    return-void
.end method

.method public final V(JJLq83/d;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p5, Lt2/e;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lt2/e;

    iget v1, v0, Lt2/e;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lt2/e;->E:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lt2/e;

    check-cast p5, Ls83/c;

    invoke-direct {v0, p0, p5}, Lt2/e;-><init>(Lt2/g;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object p5, v6, Lt2/e;->y:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lt2/e;->E:I

    const/4 v7, 0x2

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v2, :cond_2

    if-ne v1, v7, :cond_1

    iget-wide p1, v6, Lt2/e;->w:J

    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-wide p3, v6, Lt2/e;->x:J

    iget-wide p1, v6, Lt2/e;->w:J

    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, p0, Lt2/g;->O:Lt2/a;

    iput-wide p1, v6, Lt2/e;->w:J

    iput-wide p3, v6, Lt2/e;->x:J

    iput v2, v6, Lt2/e;->E:I

    move-wide v2, p1

    move-wide v4, p3

    invoke-interface/range {v1 .. v6}, Lt2/a;->V(JJLq83/d;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v0, :cond_4

    goto :goto_4

    :cond_4
    move-wide p1, v2

    move-wide p3, v4

    :goto_2
    check-cast p5, Ly3/q;

    invoke-virtual {p5}, Ly3/q;->j()J

    move-result-wide v8

    iget-boolean p5, p0, Lb2/v;->N:Z

    if-eqz p5, :cond_5

    const/4 v1, 0x0

    if-eqz p5, :cond_6

    if-eqz p5, :cond_6

    invoke-static {p0}, La3/g;->g(La3/p2;)La3/p2;

    move-result-object p5

    move-object v1, p5

    check-cast v1, Lt2/g;

    goto :goto_3

    :cond_5
    iget-object v1, p0, Lt2/g;->Q:Lt2/g;

    :cond_6
    :goto_3
    if-eqz v1, :cond_8

    invoke-static {p1, p2, v8, v9}, Ly3/q;->g(JJ)J

    move-result-wide v2

    invoke-static {p3, p4, v8, v9}, Ly3/q;->f(JJ)J

    move-result-wide v4

    iput-wide v8, v6, Lt2/e;->w:J

    iput v7, v6, Lt2/e;->E:I

    invoke-virtual/range {v1 .. v6}, Lt2/g;->V(JJLq83/d;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v0, :cond_7

    :goto_4
    return-object v0

    :cond_7
    move-wide p1, v8

    :goto_5
    check-cast p5, Ly3/q;

    invoke-virtual {p5}, Ly3/q;->j()J

    move-result-wide p3

    move-wide v8, p1

    goto :goto_6

    :cond_8
    const-wide/16 p3, 0x0

    :goto_6
    invoke-static {v8, v9, p3, p4}, Ly3/q;->g(JJ)J

    move-result-wide p1

    invoke-static {p1, p2}, Ly3/q;->a(J)Ly3/q;

    move-result-object p1

    return-object p1
.end method

.method public final X0()Lbc3/c0;
    .locals 3

    iget-boolean v0, p0, Lb2/v;->N:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {p0}, La3/g;->g(La3/p2;)La3/p2;

    move-result-object v0

    check-cast v0, Lt2/g;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lt2/g;->X0()Lbc3/c0;

    move-result-object v1

    :cond_1
    if-eqz v1, :cond_2

    invoke-static {v1}, Lbc3/f0;->w(Lbc3/c0;)Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_2

    return-object v1

    :cond_2
    iget-object v0, p0, Lt2/g;->P:Lt2/d;

    iget-object v0, v0, Lt2/d;->d:Lbc3/c0;

    if-eqz v0, :cond_3

    return-object v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final f()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lt2/g;->R:Ljava/lang/String;

    return-object v0
.end method

.method public final l0(JI)J
    .locals 3

    iget-boolean v0, p0, Lb2/v;->N:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    if-eqz v0, :cond_0

    invoke-static {p0}, La3/g;->g(La3/p2;)La3/p2;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lt2/g;

    :cond_0
    if-eqz v1, :cond_1

    invoke-virtual {v1, p1, p2, p3}, Lt2/g;->l0(JI)J

    move-result-wide v0

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x0

    :goto_0
    iget-object v2, p0, Lt2/g;->O:Lt2/a;

    invoke-static {p1, p2, v0, v1}, Lh2/b;->g(JJ)J

    move-result-wide p1

    invoke-interface {v2, p1, p2, p3}, Lt2/a;->l0(JI)J

    move-result-wide p1

    invoke-static {v0, v1, p1, p2}, Lh2/b;->h(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final p0(JLq83/d;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p3, Lt2/f;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lt2/f;

    iget v1, v0, Lt2/f;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lt2/f;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lt2/f;

    check-cast p3, Ls83/c;

    invoke-direct {v0, p0, p3}, Lt2/f;-><init>(Lt2/g;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lt2/f;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lt2/f;->z:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-wide p1, v0, Lt2/f;->w:J

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-wide p1, v0, Lt2/f;->w:J

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p3, p0, Lb2/v;->N:Z

    const/4 v2, 0x0

    if-eqz p3, :cond_4

    if-eqz p3, :cond_4

    invoke-static {p0}, La3/g;->g(La3/p2;)La3/p2;

    move-result-object p3

    move-object v2, p3

    check-cast v2, Lt2/g;

    :cond_4
    if-eqz v2, :cond_6

    iput-wide p1, v0, Lt2/f;->w:J

    iput v4, v0, Lt2/f;->z:I

    invoke-virtual {v2, p1, p2, v0}, Lt2/g;->p0(JLq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    goto :goto_4

    :cond_5
    :goto_1
    check-cast p3, Ly3/q;

    invoke-virtual {p3}, Ly3/q;->j()J

    move-result-wide v4

    :goto_2
    move-wide v6, v4

    move-wide v4, p1

    move-wide p1, v6

    goto :goto_3

    :cond_6
    const-wide/16 v4, 0x0

    goto :goto_2

    :goto_3
    iget-object p3, p0, Lt2/g;->O:Lt2/a;

    invoke-static {v4, v5, p1, p2}, Ly3/q;->f(JJ)J

    move-result-wide v4

    iput-wide p1, v0, Lt2/f;->w:J

    iput v3, v0, Lt2/f;->z:I

    invoke-interface {p3, v4, v5, v0}, Lt2/a;->p0(JLq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_7

    :goto_4
    return-object v1

    :cond_7
    :goto_5
    check-cast p3, Ly3/q;

    invoke-virtual {p3}, Ly3/q;->j()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, Ly3/q;->g(JJ)J

    move-result-wide p1

    invoke-static {p1, p2}, Ly3/q;->a(J)Ly3/q;

    move-result-object p1

    return-object p1
.end method
