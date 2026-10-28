.class public final Lt2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lt2/g;

.field public b:Lt2/g;

.field public c:Lkotlin/jvm/internal/m;

.field public d:Lbc3/c0;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, La3/l0;

    const/16 v1, 0x13

    invoke-direct {v0, p0, v1}, La3/l0;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lt2/d;->c:Lkotlin/jvm/internal/m;

    return-void
.end method


# virtual methods
.method public final a(JJLs83/c;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p5, Lt2/b;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lt2/b;

    iget v1, v0, Lt2/b;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lt2/b;->y:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lt2/b;

    invoke-direct {v0, p0, p5}, Lt2/b;-><init>(Lt2/d;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object p5, v6, Lt2/b;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lt2/b;->y:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p5, p0, Lt2/d;->a:Lt2/g;

    const/4 v1, 0x0

    if-eqz p5, :cond_4

    iget-boolean v4, p5, Lb2/v;->N:Z

    if-eqz v4, :cond_4

    invoke-static {p5}, La3/g;->g(La3/p2;)La3/p2;

    move-result-object p5

    check-cast p5, Lt2/g;

    goto :goto_2

    :cond_4
    move-object p5, v1

    :goto_2
    const-wide/16 v4, 0x0

    if-nez p5, :cond_6

    iget-object v1, p0, Lt2/d;->b:Lt2/g;

    if-eqz v1, :cond_a

    iput v3, v6, Lt2/b;->y:I

    move-wide v2, p1

    move-wide v4, p3

    invoke-virtual/range {v1 .. v6}, Lt2/g;->V(JJLq83/d;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v0, :cond_5

    goto :goto_4

    :cond_5
    :goto_3
    check-cast p5, Ly3/q;

    invoke-virtual {p5}, Ly3/q;->j()J

    move-result-wide v4

    goto :goto_6

    :cond_6
    move-wide v7, p3

    move p3, v2

    move-wide v2, p1

    move-wide p1, v4

    move-wide v4, v7

    iget-object p4, p0, Lt2/d;->a:Lt2/g;

    if-eqz p4, :cond_7

    iget-boolean p5, p4, Lb2/v;->N:Z

    if-eqz p5, :cond_7

    invoke-static {p4}, La3/g;->g(La3/p2;)La3/p2;

    move-result-object p4

    move-object v1, p4

    check-cast v1, Lt2/g;

    :cond_7
    if-eqz v1, :cond_9

    iput p3, v6, Lt2/b;->y:I

    invoke-virtual/range {v1 .. v6}, Lt2/g;->V(JJLq83/d;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v0, :cond_8

    :goto_4
    return-object v0

    :cond_8
    :goto_5
    check-cast p5, Ly3/q;

    invoke-virtual {p5}, Ly3/q;->j()J

    move-result-wide v4

    goto :goto_6

    :cond_9
    move-wide v4, p1

    :cond_a
    :goto_6
    invoke-static {v4, v5}, Ly3/q;->a(J)Ly3/q;

    move-result-object p1

    return-object p1
.end method

.method public final b(JLs83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p3, Lt2/c;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lt2/c;

    iget v1, v0, Lt2/c;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lt2/c;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lt2/c;

    invoke-direct {v0, p0, p3}, Lt2/c;-><init>(Lt2/d;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lt2/c;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lt2/c;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Lt2/d;->a:Lt2/g;

    const/4 v2, 0x0

    if-eqz p3, :cond_3

    iget-boolean v4, p3, Lb2/v;->N:Z

    if-eqz v4, :cond_3

    invoke-static {p3}, La3/g;->g(La3/p2;)La3/p2;

    move-result-object p3

    move-object v2, p3

    check-cast v2, Lt2/g;

    :cond_3
    if-eqz v2, :cond_5

    iput v3, v0, Lt2/c;->y:I

    invoke-virtual {v2, p1, p2, v0}, Lt2/g;->p0(JLq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    check-cast p3, Ly3/q;

    invoke-virtual {p3}, Ly3/q;->j()J

    move-result-wide p1

    goto :goto_2

    :cond_5
    const-wide/16 p1, 0x0

    :goto_2
    invoke-static {p1, p2}, Ly3/q;->a(J)Ly3/q;

    move-result-object p1

    return-object p1
.end method

.method public final c()Lbc3/c0;
    .locals 2

    iget-object v0, p0, Lt2/d;->c:Lkotlin/jvm/internal/m;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbc3/c0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
