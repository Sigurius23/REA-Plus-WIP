.class public final Lh0/r2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt2/a;


# instance fields
.field public final w:Lh0/c3;

.field public x:Z


# direct methods
.method public constructor <init>(Lh0/c3;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh0/r2;->w:Lh0/c3;

    iput-boolean p2, p0, Lh0/r2;->x:Z

    return-void
.end method


# virtual methods
.method public final J(JJI)J
    .locals 0

    iget-boolean p1, p0, Lh0/r2;->x:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lh0/r2;->w:Lh0/c3;

    iget-object p2, p1, Lh0/c3;->a:Lh0/x2;

    invoke-interface {p2}, Lh0/x2;->b()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p1, Lh0/c3;->a:Lh0/x2;

    invoke-virtual {p1, p3, p4}, Lh0/c3;->g(J)F

    move-result p3

    invoke-virtual {p1, p3}, Lh0/c3;->d(F)F

    move-result p3

    invoke-interface {p2, p3}, Lh0/x2;->e(F)F

    move-result p2

    invoke-virtual {p1, p2}, Lh0/c3;->d(F)F

    move-result p2

    invoke-virtual {p1, p2}, Lh0/c3;->h(F)J

    move-result-wide p1

    return-wide p1

    :cond_1
    :goto_0
    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method public final V(JJLq83/d;)Ljava/lang/Object;
    .locals 4

    instance-of p1, p5, Lh0/q2;

    if-eqz p1, :cond_0

    move-object p1, p5

    check-cast p1, Lh0/q2;

    iget p2, p1, Lh0/q2;->z:I

    const/high16 v0, -0x80000000

    and-int v1, p2, v0

    if-eqz v1, :cond_0

    sub-int/2addr p2, v0

    iput p2, p1, Lh0/q2;->z:I

    goto :goto_0

    :cond_0
    new-instance p1, Lh0/q2;

    check-cast p5, Ls83/c;

    invoke-direct {p1, p0, p5}, Lh0/q2;-><init>(Lh0/r2;Ls83/c;)V

    :goto_0
    iget-object p2, p1, Lh0/q2;->x:Ljava/lang/Object;

    sget-object p5, Lr83/a;->w:Lr83/a;

    iget v0, p1, Lh0/q2;->z:I

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    if-ne v0, v1, :cond_1

    iget-wide p3, p1, Lh0/q2;->w:J

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p2, p0, Lh0/r2;->x:Z

    const-wide/16 v2, 0x0

    if-eqz p2, :cond_5

    iget-object p2, p0, Lh0/r2;->w:Lh0/c3;

    iget-boolean v0, p2, Lh0/c3;->i:Z

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    iput-wide p3, p1, Lh0/q2;->w:J

    iput v1, p1, Lh0/q2;->z:I

    invoke-virtual {p2, p3, p4, p1}, Lh0/c3;->a(JLs83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, p5, :cond_4

    return-object p5

    :cond_4
    :goto_1
    check-cast p2, Ly3/q;

    invoke-virtual {p2}, Ly3/q;->j()J

    move-result-wide v2

    :goto_2
    invoke-static {p3, p4, v2, v3}, Ly3/q;->f(JJ)J

    move-result-wide v2

    :cond_5
    invoke-static {v2, v3}, Ly3/q;->a(J)Ly3/q;

    move-result-object p1

    return-object p1
.end method
