.class public abstract Lh0/f1;
.super La3/o;
.source "SourceFile"

# interfaces
.implements La3/f2;


# instance fields
.field public Q:Lh0/d2;

.field public R:Lkotlin/jvm/functions/Function1;

.field public S:Z

.field public T:Lj0/i;

.field public U:Ldc3/h;

.field public V:Lj0/b;

.field public W:Z

.field public X:J

.field public Y:Lu2/h0;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;ZLj0/i;Lh0/d2;)V
    .locals 0

    invoke-direct {p0}, La3/o;-><init>()V

    iput-object p4, p0, Lh0/f1;->Q:Lh0/d2;

    iput-object p1, p0, Lh0/f1;->R:Lkotlin/jvm/functions/Function1;

    iput-boolean p2, p0, Lh0/f1;->S:Z

    iput-object p3, p0, Lh0/f1;->T:Lj0/i;

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lh0/f1;->X:J

    return-void
.end method

.method public static final a1(Lh0/f1;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Lh0/b1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lh0/b1;

    iget v1, v0, Lh0/b1;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh0/b1;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh0/b1;

    invoke-direct {v0, p0, p1}, Lh0/b1;-><init>(Lh0/f1;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lh0/b1;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh0/b1;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lh0/f1;->V:Lj0/b;

    if-eqz p1, :cond_4

    iget-object v2, p0, Lh0/f1;->T:Lj0/i;

    if-eqz v2, :cond_3

    new-instance v4, Lj0/a;

    invoke-direct {v4, p1}, Lj0/a;-><init>(Lj0/b;)V

    iput v3, v0, Lh0/b1;->y:I

    check-cast v2, Lj0/j;

    invoke-virtual {v2, v4, v0}, Lj0/j;->a(Lj0/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const/4 p1, 0x0

    iput-object p1, p0, Lh0/f1;->V:Lj0/b;

    :cond_4
    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lh0/f1;->g1(J)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final b1(Lh0/f1;Lh0/i0;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lh0/c1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lh0/c1;

    iget v1, v0, Lh0/c1;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh0/c1;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh0/c1;

    invoke-direct {v0, p0, p2}, Lh0/c1;-><init>(Lh0/f1;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lh0/c1;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh0/c1;->E:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lh0/c1;->x:Lj0/b;

    iget-object v0, v0, Lh0/c1;->w:Lh0/i0;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p1, v0, Lh0/c1;->w:Lh0/i0;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lh0/f1;->V:Lj0/b;

    if-eqz p2, :cond_4

    iget-object v2, p0, Lh0/f1;->T:Lj0/i;

    if-eqz v2, :cond_4

    new-instance v5, Lj0/a;

    invoke-direct {v5, p2}, Lj0/a;-><init>(Lj0/b;)V

    iput-object p1, v0, Lh0/c1;->w:Lh0/i0;

    iput v4, v0, Lh0/c1;->E:I

    check-cast v2, Lj0/j;

    invoke-virtual {v2, v5, v0}, Lj0/j;->a(Lj0/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    new-instance p2, Lj0/b;

    invoke-direct {p2}, Lj0/b;-><init>()V

    iget-object v2, p0, Lh0/f1;->T:Lj0/i;

    if-eqz v2, :cond_6

    iput-object p1, v0, Lh0/c1;->w:Lh0/i0;

    iput-object p2, v0, Lh0/c1;->x:Lj0/b;

    iput v3, v0, Lh0/c1;->E:I

    check-cast v2, Lj0/j;

    invoke-virtual {v2, p2, v0}, Lj0/j;->a(Lj0/h;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object v0, p1

    move-object p1, p2

    :goto_3
    move-object p2, p1

    move-object p1, v0

    :cond_6
    iput-object p2, p0, Lh0/f1;->V:Lj0/b;

    invoke-virtual {p1}, Lh0/i0;->a()J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lh0/f1;->f1(J)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final c1(Lh0/f1;Lh0/j0;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lh0/d1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lh0/d1;

    iget v1, v0, Lh0/d1;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh0/d1;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh0/d1;

    invoke-direct {v0, p0, p2}, Lh0/d1;-><init>(Lh0/f1;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lh0/d1;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh0/d1;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lh0/d1;->w:Lh0/j0;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lh0/f1;->V:Lj0/b;

    if-eqz p2, :cond_4

    iget-object v2, p0, Lh0/f1;->T:Lj0/i;

    if-eqz v2, :cond_3

    new-instance v4, Lj0/c;

    invoke-direct {v4, p2}, Lj0/c;-><init>(Lj0/b;)V

    iput-object p1, v0, Lh0/d1;->w:Lh0/j0;

    iput v3, v0, Lh0/d1;->z:I

    check-cast v2, Lj0/j;

    invoke-virtual {v2, v4, v0}, Lj0/j;->a(Lj0/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const/4 p2, 0x0

    iput-object p2, p0, Lh0/f1;->V:Lj0/b;

    :cond_4
    invoke-virtual {p1}, Lh0/j0;->a()J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lh0/f1;->g1(J)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final Q0()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lh0/f1;->W:Z

    invoke-virtual {p0}, Lh0/f1;->d1()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lh0/f1;->X:J

    return-void
.end method

.method public final b0()V
    .locals 1

    iget-object v0, p0, Lh0/f1;->Y:Lu2/h0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lu2/h0;->b0()V

    :cond_0
    return-void
.end method

.method public final d1()V
    .locals 3

    iget-object v0, p0, Lh0/f1;->V:Lj0/b;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lh0/f1;->T:Lj0/i;

    if-eqz v1, :cond_0

    new-instance v2, Lj0/a;

    invoke-direct {v2, v0}, Lj0/a;-><init>(Lj0/b;)V

    check-cast v1, Lj0/j;

    invoke-virtual {v1, v2}, Lj0/j;->b(Lj0/h;)Z

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lh0/f1;->V:Lj0/b;

    :cond_1
    return-void
.end method

.method public abstract e1(Lh0/e1;Lh0/e1;)Ljava/lang/Object;
.end method

.method public abstract f1(J)V
.end method

.method public abstract g1(J)V
.end method

.method public abstract h1()Z
.end method

.method public final i1(Lkotlin/jvm/functions/Function1;ZLj0/i;Lh0/d2;Z)V
    .locals 1

    iput-object p1, p0, Lh0/f1;->R:Lkotlin/jvm/functions/Function1;

    iget-boolean p1, p0, Lh0/f1;->S:Z

    const/4 v0, 0x1

    if-eq p1, p2, :cond_2

    iput-boolean p2, p0, Lh0/f1;->S:Z

    if-nez p2, :cond_1

    invoke-virtual {p0}, Lh0/f1;->d1()V

    iget-object p1, p0, Lh0/f1;->Y:Lu2/h0;

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, La3/o;->Y0(La3/n;)V

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lh0/f1;->Y:Lu2/h0;

    :cond_1
    move p5, v0

    :cond_2
    iget-object p1, p0, Lh0/f1;->T:Lj0/i;

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {p0}, Lh0/f1;->d1()V

    iput-object p3, p0, Lh0/f1;->T:Lj0/i;

    :cond_3
    iget-object p1, p0, Lh0/f1;->Q:Lh0/d2;

    if-eq p1, p4, :cond_4

    iput-object p4, p0, Lh0/f1;->Q:Lh0/d2;

    goto :goto_0

    :cond_4
    move v0, p5

    :goto_0
    if-eqz v0, :cond_5

    iget-object p1, p0, Lh0/f1;->Y:Lu2/h0;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lu2/h0;->Z0()V

    :cond_5
    return-void
.end method

.method public r0(Lu2/k;Lu2/l;J)V
    .locals 2

    iget-boolean v0, p0, Lh0/f1;->S:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh0/f1;->Y:Lu2/h0;

    if-nez v0, :cond_0

    new-instance v0, La1/f;

    const/4 v1, 0x4

    invoke-direct {v0, p0, v1}, La1/f;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Lu2/c0;->a(Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Lu2/h0;

    move-result-object v0

    invoke-virtual {p0, v0}, La3/o;->X0(La3/n;)La3/n;

    iput-object v0, p0, Lh0/f1;->Y:Lu2/h0;

    :cond_0
    iget-object v0, p0, Lh0/f1;->Y:Lu2/h0;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2, p3, p4}, Lu2/h0;->r0(Lu2/k;Lu2/l;J)V

    :cond_1
    return-void
.end method
