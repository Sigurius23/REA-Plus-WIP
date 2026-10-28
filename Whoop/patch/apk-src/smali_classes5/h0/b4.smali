.class public final synthetic Lh0/b4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FLjava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lh0/b4;->w:I

    iput p1, p0, Lh0/b4;->x:F

    iput-object p2, p0, Lh0/b4;->y:Ljava/lang/Object;

    iput-object p3, p0, Lh0/b4;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;FLjava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, Lh0/b4;->w:I

    iput-object p1, p0, Lh0/b4;->y:Ljava/lang/Object;

    iput p2, p0, Lh0/b4;->x:F

    iput-object p3, p0, Lh0/b4;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly2/j1;Ll1/q4;F)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput v0, p0, Lh0/b4;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh0/b4;->y:Ljava/lang/Object;

    iput-object p2, p0, Lh0/b4;->z:Ljava/lang/Object;

    iput p3, p0, Lh0/b4;->x:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lh0/b4;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lh0/b4;->x:F

    iget-object v1, p0, Lh0/b4;->y:Ljava/lang/Object;

    check-cast v1, Li2/g;

    iget-object v2, p0, Lh0/b4;->z:Ljava/lang/Object;

    check-cast v2, Li2/p;

    check-cast p1, Lk2/c;

    check-cast p1, La3/p0;

    invoke-virtual {p1}, La3/p0;->a()V

    iget-object p1, p1, La3/p0;->w:Lk2/b;

    iget-object v3, p1, Lk2/b;->x:La3/p;

    invoke-virtual {v3}, La3/p;->A()J

    move-result-wide v4

    invoke-virtual {v3}, La3/p;->w()Li2/v;

    move-result-object v6

    invoke-interface {v6}, Li2/v;->q()V

    :try_start_0
    iget-object v6, v3, La3/p;->x:Ljava/lang/Object;

    check-cast v6, Laj/d;

    const/4 v7, 0x0

    invoke-virtual {v6, v0, v7}, Laj/d;->B(FF)V

    const/high16 v0, 0x42340000    # 45.0f

    const-wide/16 v7, 0x0

    invoke-virtual {v6, v0, v7, v8}, Laj/d;->v(FJ)V

    invoke-virtual {p1, v1, v2}, Lk2/b;->e(Li2/g;Li2/p;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v3, v4, v5}, Ld;->z(La3/p;J)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-static {v3, v4, v5}, Ld;->z(La3/p;J)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lh0/b4;->y:Ljava/lang/Object;

    check-cast v0, Li2/j;

    iget-object v1, p0, Lh0/b4;->z:Ljava/lang/Object;

    check-cast v1, Li2/t;

    check-cast p1, Lk2/c;

    iget v2, p0, Lh0/b4;->x:F

    invoke-static {v2, v0, v1, p1}, Lrz0/e;->f(FLi2/j;Li2/t;Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lh0/b4;->y:Ljava/lang/Object;

    check-cast v0, Lp1/t2;

    iget-object v1, p0, Lh0/b4;->z:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    check-cast p1, Ln0/q;

    iget v2, p0, Lh0/b4;->x:F

    invoke-static {v0, v2, v1, p1}, Lr51/e;->a(Lp1/t2;FLp1/c1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lh0/b4;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/d0;

    iget-object v1, p0, Lh0/b4;->z:Ljava/lang/Object;

    check-cast v1, Ln0/r;

    check-cast p1, Ld0/k;

    iget v2, p0, Lh0/b4;->x:F

    const/4 v3, 0x0

    cmpl-float v4, v2, v3

    if-lez v4, :cond_1

    iget-object v3, p1, Ld0/k;->e:Lp1/k1;

    invoke-virtual {v3}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    cmpl-float v4, v3, v2

    if-lez v4, :cond_0

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    move v3, v2

    goto :goto_1

    :cond_1
    cmpg-float v4, v2, v3

    if-gez v4, :cond_2

    iget-object v3, p1, Ld0/k;->e:Lp1/k1;

    invoke-virtual {v3}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    cmpg-float v4, v3, v2

    if-gez v4, :cond_0

    goto :goto_0

    :cond_2
    :goto_1
    iget v2, v0, Lkotlin/jvm/internal/d0;->w:F

    sub-float v2, v3, v2

    invoke-interface {v1, v2}, Lh0/k2;->a(F)F

    move-result v1

    cmpg-float v1, v2, v1

    if-nez v1, :cond_3

    iget-object v1, p1, Ld0/k;->e:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    cmpg-float v1, v3, v1

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Ld0/k;->a()V

    :goto_2
    iget p1, v0, Lkotlin/jvm/internal/d0;->w:F

    add-float/2addr p1, v2

    iput p1, v0, Lkotlin/jvm/internal/d0;->w:F

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lh0/b4;->y:Ljava/lang/Object;

    check-cast v0, Ly2/j1;

    iget-object v1, p0, Lh0/b4;->z:Ljava/lang/Object;

    check-cast v1, Ll1/q4;

    check-cast p1, Ly2/i1;

    iget-object v1, v1, Ll1/q4;->S:Ld0/e;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    :goto_3
    float-to-int v1, v1

    goto :goto_4

    :cond_4
    iget v1, p0, Lh0/b4;->x:F

    goto :goto_3

    :goto_4
    const/4 v2, 0x0

    invoke-static {v0, v1, v2, p1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lh0/b4;->y:Ljava/lang/Object;

    check-cast v0, Lh0/d4;

    iget-object v1, p0, Lh0/b4;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    iget-wide v4, v0, Lh0/d4;->b:J

    const-wide/high16 v6, -0x8000000000000000L

    cmp-long p1, v4, v6

    if-nez p1, :cond_5

    iput-wide v2, v0, Lh0/d4;->b:J

    :cond_5
    new-instance v7, Ld0/n;

    iget p1, v0, Lh0/d4;->e:F

    invoke-direct {v7, p1}, Ld0/n;-><init>(F)V

    const/4 v4, 0x0

    iget v5, p0, Lh0/b4;->x:F

    cmpg-float v4, v5, v4

    sget-object v8, Lh0/d4;->f:Ld0/n;

    if-nez v4, :cond_6

    iget-object v4, v0, Lh0/d4;->a:Ld0/g2;

    new-instance v5, Ld0/n;

    invoke-direct {v5, p1}, Ld0/n;-><init>(F)V

    iget-object p1, v0, Lh0/d4;->c:Ld0/n;

    invoke-interface {v4, v5, v8, p1}, Ld0/g2;->c(Ld0/r;Ld0/r;Ld0/r;)J

    move-result-wide v4

    :goto_5
    move-wide v5, v4

    goto :goto_6

    :cond_6
    iget-wide v9, v0, Lh0/d4;->b:J

    sub-long v9, v2, v9

    long-to-float p1, v9

    div-float/2addr p1, v5

    float-to-double v4, p1

    invoke-static {v4, v5}, Le93/b;->Y(D)J

    move-result-wide v4

    goto :goto_5

    :goto_6
    iget-object v4, v0, Lh0/d4;->a:Ld0/g2;

    iget-object v9, v0, Lh0/d4;->c:Ld0/n;

    invoke-interface/range {v4 .. v9}, Ld0/g2;->h(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;

    move-result-object p1

    check-cast p1, Ld0/n;

    iget p1, p1, Ld0/n;->a:F

    iget-object v4, v0, Lh0/d4;->a:Ld0/g2;

    iget-object v9, v0, Lh0/d4;->c:Ld0/n;

    invoke-interface/range {v4 .. v9}, Ld0/g2;->m(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;

    move-result-object v4

    check-cast v4, Ld0/n;

    iput-object v4, v0, Lh0/d4;->c:Ld0/n;

    iput-wide v2, v0, Lh0/d4;->b:J

    iget v2, v0, Lh0/d4;->e:F

    sub-float/2addr v2, p1

    iput p1, v0, Lh0/d4;->e:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
