.class public final synthetic Lsz0/p1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J


# direct methods
.method public synthetic constructor <init>(JI)V
    .locals 0

    iput p3, p0, Lsz0/p1;->w:I

    iput-wide p1, p0, Lsz0/p1;->x:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lsz0/p1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-wide v0, p0, Lsz0/p1;->x:J

    check-cast p1, Lk2/e;

    invoke-static {v0, v1, p1}, Lzy0/f;->a(JLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-wide v0, p0, Lsz0/p1;->x:J

    check-cast p1, Lk2/e;

    invoke-static {v0, v1, p1}, Lzq0/f;->d(JLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-wide v0, p0, Lsz0/p1;->x:J

    check-cast p1, Lk2/c;

    invoke-static {v0, v1, p1}, Lzi1/q;->b(JLk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-wide v0, p0, Lsz0/p1;->x:J

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lyt0/c;->i(JLtb/a;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-wide v0, p0, Lsz0/p1;->x:J

    check-cast p1, Lk2/e;

    invoke-static {v0, v1, p1}, Lxo1/b;->d(JLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-wide v0, p0, Lsz0/p1;->x:J

    check-cast p1, Lk2/e;

    invoke-static {v0, v1, p1}, Lxo1/b;->k(JLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-wide v0, p0, Lsz0/p1;->x:J

    check-cast p1, Lk2/e;

    invoke-static {v0, v1, p1}, Lwr0/j0;->h(JLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-wide v0, p0, Lsz0/p1;->x:J

    check-cast p1, Lk2/c;

    invoke-static {v0, v1, p1}, Lw11/b;->a(JLk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-wide v0, p0, Lsz0/p1;->x:J

    check-cast p1, Lk2/c;

    invoke-static {v0, v1, p1}, Lvn1/p;->i(JLk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-wide v0, p0, Lsz0/p1;->x:J

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lus1/b;->j(JLtb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Li3/z;

    sget-object v0, Lf1/p0;->c:Li3/y;

    new-instance v1, Lf1/o0;

    sget-object v2, Lu0/f0;->w:Lu0/f0;

    sget-object v5, Lf1/n0;->x:Lf1/n0;

    const/4 v6, 0x1

    iget-wide v3, p0, Lsz0/p1;->x:J

    invoke-direct/range {v1 .. v6}, Lf1/o0;-><init>(Lu0/f0;JLf1/n0;Z)V

    check-cast p1, Li3/l;

    invoke-virtual {p1, v0, v1}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_a
    check-cast p1, Lf2/d;

    iget-object v0, p1, Lf2/d;->w:Lf2/b;

    invoke-interface {v0}, Lf2/b;->d()J

    move-result-wide v0

    const/16 v2, 0x20

    shr-long/2addr v0, v2

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-static {p1, v0}, Lf1/y0;->r(Lf2/d;F)Li2/g;

    move-result-object v1

    new-instance v2, Li2/p;

    iget-wide v3, p0, Lsz0/p1;->x:J

    const/4 v5, 0x5

    invoke-direct {v2, v3, v4, v5}, Li2/p;-><init>(JI)V

    new-instance v3, Lh0/b4;

    const/4 v4, 0x5

    invoke-direct {v3, v0, v1, v2, v4}, Lh0/b4;-><init>(FLjava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p1, v3}, Lf2/d;->a(Lkotlin/jvm/functions/Function1;)Lf2/g;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-wide v0, p0, Lsz0/p1;->x:J

    check-cast p1, Lk2/e;

    invoke-static {v0, v1, p1}, Lsz0/r1;->g(JLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
