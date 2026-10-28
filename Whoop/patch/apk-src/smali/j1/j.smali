.class public final Lj1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt2/a;


# instance fields
.field public final w:Landroidx/room/u;

.field public final x:Lj1/h;


# direct methods
.method public constructor <init>(Landroidx/room/u;Lj1/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj1/j;->w:Landroidx/room/u;

    iput-object p2, p0, Lj1/j;->x:Lj1/h;

    return-void
.end method


# virtual methods
.method public final J(JJI)J
    .locals 2

    const/4 p1, 0x1

    if-ne p5, p1, :cond_0

    const-wide p1, 0xffffffffL

    and-long/2addr p3, p1

    long-to-int p3, p3

    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p4

    const/4 p5, 0x0

    cmpl-float p4, p4, p5

    if-lez p4, :cond_0

    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p3

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    iget-object p4, p0, Lj1/j;->w:Landroidx/room/u;

    invoke-virtual {p4, p3}, Landroidx/room/u;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->floatValue()F

    move-result p3

    invoke-static {p5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p4

    int-to-long p4, p4

    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p3

    int-to-long v0, p3

    const/16 p3, 0x20

    shl-long p3, p4, p3

    and-long/2addr p1, v0

    or-long/2addr p1, p3

    return-wide p1

    :cond_0
    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method public final l0(JI)J
    .locals 4

    const/4 v0, 0x1

    if-ne p3, v0, :cond_0

    const-wide v0, 0xffffffffL

    and-long/2addr p1, v0

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    const/4 p3, 0x0

    cmpg-float p2, p2, p3

    if-gez p2, :cond_0

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iget-object p2, p0, Lj1/j;->w:Landroidx/room/u;

    invoke-virtual {p2, p1}, Landroidx/room/u;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    int-to-long p2, p2

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v2, p1

    const/16 p1, 0x20

    shl-long p1, p2, p1

    and-long/2addr v0, v2

    or-long/2addr p1, v0

    return-wide p1

    :cond_0
    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method public final p0(JLq83/d;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p3, Lj1/i;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lj1/i;

    iget v1, v0, Lj1/i;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lj1/i;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lj1/i;

    check-cast p3, Ls83/c;

    invoke-direct {v0, p0, p3}, Lj1/i;-><init>(Lj1/j;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lj1/i;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lj1/i;->y:I

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

    invoke-static {p1, p2}, Ly3/q;->e(J)F

    move-result p1

    new-instance p2, Ljava/lang/Float;

    invoke-direct {p2, p1}, Ljava/lang/Float;-><init>(F)V

    iput v3, v0, Lj1/i;->y:I

    iget-object p1, p0, Lj1/j;->x:Lj1/h;

    invoke-virtual {p1, p2, v0}, Lj1/h;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->floatValue()F

    move-result p1

    const/4 p2, 0x0

    invoke-static {p2, p1}, Ls4/i;->a(FF)J

    move-result-wide p1

    invoke-static {p1, p2}, Ly3/q;->a(J)Ly3/q;

    move-result-object p1

    return-object p1
.end method
