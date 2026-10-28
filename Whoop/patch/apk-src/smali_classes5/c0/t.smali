.class public final Lc0/t;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc0/u;

.field public final synthetic y:J


# direct methods
.method public synthetic constructor <init>(Lc0/u;JI)V
    .locals 0

    iput p4, p0, Lc0/t;->w:I

    iput-object p1, p0, Lc0/t;->x:Lc0/u;

    iput-wide p2, p0, Lc0/t;->y:J

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lc0/t;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc0/t;->x:Lc0/u;

    iget-object v1, v0, Lc0/u;->R:Lc0/x;

    invoke-virtual {v1}, Lc0/x;->c()Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-wide v1, v0, Lc0/u;->S:J

    sget-wide v3, Landroidx/compose/animation/a;->a:J

    invoke-static {v1, v2, v3, v4}, Ly3/l;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-wide v0, p0, Lc0/t;->y:J

    goto :goto_0

    :cond_0
    iget-wide v0, v0, Lc0/u;->S:J

    goto :goto_0

    :cond_1
    iget-object v0, v0, Lc0/u;->R:Lc0/x;

    iget-object v0, v0, Lc0/x;->e:La0/v0;

    invoke-virtual {v0, p1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp1/t2;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly3/l;

    iget-wide v0, p1, Ly3/l;->a:J

    goto :goto_0

    :cond_2
    const-wide/16 v0, 0x0

    :goto_0
    new-instance p1, Ly3/l;

    invoke-direct {p1, v0, v1}, Ly3/l;-><init>(J)V

    return-object p1

    :pswitch_0
    check-cast p1, Ld0/t1;

    invoke-interface {p1}, Ld0/t1;->c()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lc0/t;->x:Lc0/u;

    iget-object v2, v1, Lc0/u;->R:Lc0/x;

    invoke-virtual {v2}, Lc0/x;->c()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const-wide/16 v2, 0x0

    if-eqz v0, :cond_4

    iget-wide v4, v1, Lc0/u;->S:J

    sget-wide v6, Landroidx/compose/animation/a;->a:J

    invoke-static {v4, v5, v6, v7}, Ly3/l;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-wide v4, p0, Lc0/t;->y:J

    goto :goto_1

    :cond_3
    iget-wide v4, v1, Lc0/u;->S:J

    goto :goto_1

    :cond_4
    iget-object v0, v1, Lc0/u;->R:Lc0/x;

    iget-object v0, v0, Lc0/x;->e:La0/v0;

    invoke-interface {p1}, Ld0/t1;->c()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v4}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp1/t2;

    if-eqz v0, :cond_5

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/l;

    iget-wide v4, v0, Ly3/l;->a:J

    goto :goto_1

    :cond_5
    move-wide v4, v2

    :goto_1
    iget-object v0, v1, Lc0/u;->R:Lc0/x;

    iget-object v0, v0, Lc0/x;->e:La0/v0;

    invoke-interface {p1}, Ld0/t1;->b()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp1/t2;

    if-eqz p1, :cond_6

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly3/l;

    iget-wide v2, p1, Ly3/l;->a:J

    :cond_6
    iget-object p1, v1, Lc0/u;->Q:Lp1/c1;

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc0/r1;

    if-eqz p1, :cond_7

    iget-object p1, p1, Lc0/r1;->b:Lc93/m;

    new-instance v0, Ly3/l;

    invoke-direct {v0, v4, v5}, Ly3/l;-><init>(J)V

    new-instance v1, Ly3/l;

    invoke-direct {v1, v2, v3}, Ly3/l;-><init>(J)V

    invoke-interface {p1, v0, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld0/c0;

    if-nez p1, :cond_8

    :cond_7
    const/high16 p1, 0x43c80000    # 400.0f

    const/4 v0, 0x5

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v1, p1, v0, v2}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object p1

    :cond_8
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
