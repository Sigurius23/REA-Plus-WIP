.class public final Lf1/n1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu0/d1;


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lf1/s1;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lf1/n1;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lf1/n1;->c:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lf1/n1;->b:Z

    return-void
.end method

.method public constructor <init>(Lf1/s1;Z)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lf1/n1;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lf1/n1;->c:Ljava/lang/Object;

    iput-boolean p2, p0, Lf1/n1;->b:Z

    return-void
.end method

.method public constructor <init>(ZLf1/w0;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lf1/n1;->a:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-boolean p1, p0, Lf1/n1;->b:Z

    iput-object p2, p0, Lf1/n1;->c:Ljava/lang/Object;

    return-void
.end method

.method private final e()V
    .locals 0

    return-void
.end method

.method private final f()V
    .locals 0

    return-void
.end method

.method private final h(J)V
    .locals 0

    return-void
.end method

.method private final i()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 9

    iget v0, p0, Lf1/n1;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf1/n1;->c:Ljava/lang/Object;

    check-cast v0, Lf1/w0;

    iget-boolean v1, p0, Lf1/n1;->b:Z

    if-eqz v1, :cond_0

    iget-object v2, v0, Lf1/w0;->p:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh2/b;

    goto :goto_0

    :cond_0
    iget-object v2, v0, Lf1/w0;->q:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh2/b;

    :goto_0
    if-eqz v2, :cond_7

    invoke-virtual {v0}, Lf1/w0;->g()Lf1/u;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_3

    :cond_1
    if-eqz v1, :cond_2

    iget-object v3, v2, Lf1/u;->a:Lf1/t;

    goto :goto_1

    :cond_2
    iget-object v3, v2, Lf1/u;->b:Lf1/t;

    :goto_1
    invoke-virtual {v0, v3}, Lf1/w0;->d(Lf1/t;)Lf1/l;

    move-result-object v3

    if-nez v3, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Lf1/l;->d()Ly2/y;

    move-result-object v4

    if-nez v4, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v3, v2, v1}, Lf1/l;->a(Lf1/u;Z)J

    move-result-wide v2

    const-wide v5, 0x7fffffff7fffffffL

    and-long/2addr v5, v2

    const-wide v7, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v5, v5, v7

    if-nez v5, :cond_5

    goto :goto_3

    :cond_5
    invoke-static {v2, v3}, Lf1/p0;->a(J)J

    move-result-wide v2

    invoke-virtual {v0}, Lf1/w0;->k()Ly2/y;

    move-result-object v5

    invoke-interface {v5, v4, v2, v3}, Ly2/y;->k(Ly2/y;J)J

    move-result-wide v2

    new-instance v4, Lh2/b;

    invoke-direct {v4, v2, v3}, Lh2/b;-><init>(J)V

    iget-object v2, v0, Lf1/w0;->s:Lp1/k1;

    invoke-virtual {v2, v4}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    if-eqz v1, :cond_6

    sget-object v1, Lu0/f0;->x:Lu0/f0;

    goto :goto_2

    :cond_6
    sget-object v1, Lu0/f0;->y:Lu0/f0;

    :goto_2
    iget-object v2, v0, Lf1/w0;->r:Lp1/k1;

    invoke-virtual {v2, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    const/4 v1, 0x0

    iput-boolean v1, v0, Lf1/w0;->x:Z

    invoke-virtual {v0}, Lf1/w0;->p()V

    :cond_7
    :goto_3
    :pswitch_0
    return-void

    :pswitch_1
    iget-object v0, p0, Lf1/n1;->c:Ljava/lang/Object;

    check-cast v0, Lf1/s1;

    iget-boolean v1, p0, Lf1/n1;->b:Z

    if-eqz v1, :cond_8

    sget-object v2, Lu0/f0;->x:Lu0/f0;

    goto :goto_4

    :cond_8
    sget-object v2, Lu0/f0;->y:Lu0/f0;

    :goto_4
    iget-object v3, v0, Lf1/s1;->r:Lp1/k1;

    invoke-virtual {v3, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lf1/s1;->k(Z)J

    move-result-wide v1

    invoke-static {v1, v2}, Lf1/p0;->a(J)J

    move-result-wide v1

    iget-object v3, v0, Lf1/s1;->d:Lu0/s0;

    if-eqz v3, :cond_b

    invoke-virtual {v3}, Lu0/s0;->d()Lu0/p1;

    move-result-object v3

    if-nez v3, :cond_9

    goto :goto_5

    :cond_9
    invoke-virtual {v3, v1, v2}, Lu0/p1;->e(J)J

    move-result-wide v1

    iput-wide v1, v0, Lf1/s1;->o:J

    new-instance v3, Lh2/b;

    invoke-direct {v3, v1, v2}, Lh2/b;-><init>(J)V

    iget-object v1, v0, Lf1/s1;->s:Lp1/k1;

    invoke-virtual {v1, v3}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    const-wide/16 v1, 0x0

    iput-wide v1, v0, Lf1/s1;->q:J

    const/4 v1, -0x1

    iput v1, v0, Lf1/s1;->t:I

    iget-object v1, v0, Lf1/s1;->d:Lu0/s0;

    if-eqz v1, :cond_a

    iget-object v1, v1, Lu0/s0;->q:Lp1/k1;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_a
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lf1/s1;->s(Z)V

    :cond_b
    :goto_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(J)V
    .locals 11

    iget v0, p0, Lf1/n1;->a:I

    packed-switch v0, :pswitch_data_0

    iget-boolean p1, p0, Lf1/n1;->b:Z

    iget-object p2, p0, Lf1/n1;->c:Ljava/lang/Object;

    check-cast p2, Lf1/w0;

    invoke-virtual {p2}, Lf1/w0;->f()Lu0/f0;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p2}, Lf1/w0;->g()Lf1/u;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    if-eqz p1, :cond_1

    iget-object v1, v0, Lf1/u;->a:Lf1/t;

    goto :goto_0

    :cond_1
    iget-object v1, v0, Lf1/u;->b:Lf1/t;

    :goto_0
    iget-object v2, p2, Lf1/w0;->a:Lf1/b1;

    iget-object v2, v2, Lf1/b1;->c:La0/k0;

    iget-wide v3, v1, Lf1/t;->c:J

    invoke-virtual {v2, v3, v4}, La0/k0;->e(J)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_4

    check-cast v1, Lf1/l;

    invoke-virtual {v1}, Lf1/l;->d()Ly2/y;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v1, v0, p1}, Lf1/l;->a(Lf1/u;Z)J

    move-result-wide v0

    const-wide v3, 0x7fffffff7fffffffL

    and-long/2addr v3, v0

    const-wide v5, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long p1, v3, v5

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {v0, v1}, Lf1/p0;->a(J)J

    move-result-wide v0

    invoke-virtual {p2}, Lf1/w0;->k()Ly2/y;

    move-result-object p1

    invoke-interface {p1, v2, v0, v1}, Ly2/y;->k(Ly2/y;J)J

    move-result-wide v0

    iget-object p1, p2, Lf1/w0;->n:Lp1/k1;

    new-instance v2, Lh2/b;

    invoke-direct {v2, v0, v1}, Lh2/b;-><init>(J)V

    invoke-virtual {p1, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object p1, p2, Lf1/w0;->o:Lp1/k1;

    new-instance p2, Lh2/b;

    const-wide/16 v0, 0x0

    invoke-direct {p2, v0, v1}, Lh2/b;-><init>(J)V

    invoke-virtual {p1, p2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :goto_1
    return-void

    :cond_3
    const-string p1, "Current selectable should have layout coordinates."

    invoke-static {p1}, Lk0/a;->d(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :cond_4
    const-string p1, "SelectionRegistrar should contain the current selection\'s selectableIds"

    invoke-static {p1}, Lk0/a;->d(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lf1/n1;->c:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lf1/s1;

    iget-object v0, v1, Lf1/s1;->r:Lp1/k1;

    invoke-virtual {v1}, Lf1/s1;->j()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lu0/f0;

    if-eqz v2, :cond_5

    goto/16 :goto_3

    :cond_5
    sget-object v2, Lu0/f0;->y:Lu0/f0;

    invoke-virtual {v0, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    const/4 v0, -0x1

    iput v0, v1, Lf1/s1;->t:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lf1/n1;->b:Z

    invoke-virtual {v1}, Lf1/s1;->n()V

    iget-object v2, v1, Lf1/s1;->d:Lu0/s0;

    const/4 v3, 0x0

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lu0/s0;->d()Lu0/p1;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v2, p1, p2}, Lu0/p1;->c(J)Z

    move-result v2

    if-ne v2, v0, :cond_7

    invoke-virtual {v1}, Lf1/s1;->m()Lq3/y;

    move-result-object v0

    iget-object v0, v0, Lq3/y;->a:Ll3/g;

    iget-object v0, v0, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_3

    :cond_6
    invoke-virtual {v1, v3}, Lf1/s1;->h(Z)V

    invoke-virtual {v1}, Lf1/s1;->m()Lq3/y;

    move-result-object v0

    sget-wide v2, Ll3/u0;->b:J

    const/4 v4, 0x5

    const/4 v5, 0x0

    invoke-static {v0, v5, v2, v3, v4}, Lq3/y;->b(Lq3/y;Ll3/g;JI)Lq3/y;

    move-result-object v2

    sget-object v7, Lf1/w;->e:Lf1/v;

    const/4 v8, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-wide v3, p1

    invoke-static/range {v1 .. v8}, Lf1/s1;->c(Lf1/s1;Lq3/y;JZZLf1/v;Z)J

    move-result-wide p1

    move-wide v9, v3

    move-object v4, v1

    move-wide v1, v9

    new-instance v0, Ll3/u0;

    invoke-direct {v0, p1, p2}, Ll3/u0;-><init>(J)V

    iput-object v0, v4, Lf1/s1;->p:Ll3/u0;

    goto :goto_2

    :cond_7
    move-object v4, v1

    move-wide v1, p1

    iget-object p1, v4, Lf1/s1;->d:Lu0/s0;

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lu0/s0;->d()Lu0/p1;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {p1, v1, v2, v0}, Lu0/p1;->b(JZ)I

    move-result p1

    iget-object p2, v4, Lf1/s1;->b:Lq3/r;

    invoke-interface {p2, p1}, Lq3/r;->n(I)I

    move-result p1

    invoke-virtual {v4}, Lf1/s1;->m()Lq3/y;

    move-result-object p2

    iget-object p2, p2, Lq3/y;->a:Ll3/g;

    invoke-static {p1, p1}, Lj93/l0;->f(II)J

    move-result-wide v5

    invoke-static {p2, v5, v6}, Lf1/s1;->e(Ll3/g;J)Lq3/y;

    move-result-object p1

    invoke-virtual {v4, v3}, Lf1/s1;->h(Z)V

    iget-object p2, v4, Lf1/s1;->k:Lq2/a;

    if-eqz p2, :cond_8

    const/16 v0, 0x9

    invoke-interface {p2, v0}, Lq2/a;->a(I)V

    :cond_8
    iget-object p2, v4, Lf1/s1;->c:Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide p1, p1, Lq3/y;->b:J

    new-instance v0, Ll3/u0;

    invoke-direct {v0, p1, p2}, Ll3/u0;-><init>(J)V

    iput-object v0, v4, Lf1/s1;->w:Ll3/u0;

    :cond_9
    iput-boolean v3, p0, Lf1/n1;->b:Z

    :goto_2
    sget-object p1, Lu0/g0;->w:Lu0/g0;

    invoke-virtual {v4, p1}, Lf1/s1;->p(Lu0/g0;)V

    iput-wide v1, v4, Lf1/s1;->o:J

    new-instance p1, Lh2/b;

    invoke-direct {p1, v1, v2}, Lh2/b;-><init>(J)V

    iget-object p2, v4, Lf1/s1;->s:Lp1/k1;

    invoke-virtual {p2, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    const-wide/16 p1, 0x0

    iput-wide p1, v4, Lf1/s1;->q:J

    :cond_a
    :goto_3
    :pswitch_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c()V
    .locals 3

    iget v0, p0, Lf1/n1;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf1/n1;->c:Ljava/lang/Object;

    check-cast v0, Lf1/w0;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lf1/w0;->x:Z

    invoke-virtual {v0}, Lf1/w0;->p()V

    iget-object v1, v0, Lf1/w0;->r:Lp1/k1;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v0, v0, Lf1/w0;->s:Lp1/k1;

    invoke-virtual {v0, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :pswitch_0
    return-void

    :pswitch_1
    iget-object v0, p0, Lf1/n1;->c:Ljava/lang/Object;

    check-cast v0, Lf1/s1;

    iget-object v1, v0, Lf1/s1;->r:Lp1/k1;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v1, v0, Lf1/s1;->s:Lp1/k1;

    invoke-virtual {v1, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lf1/s1;->s(Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d(J)V
    .locals 20

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    iget v3, v0, Lf1/n1;->a:I

    packed-switch v3, :pswitch_data_0

    iget-object v3, v0, Lf1/n1;->c:Ljava/lang/Object;

    move-object v4, v3

    check-cast v4, Lf1/w0;

    iget-object v3, v4, Lf1/w0;->n:Lp1/k1;

    iget-object v11, v4, Lf1/w0;->o:Lp1/k1;

    invoke-virtual {v4}, Lf1/w0;->f()Lu0/f0;

    move-result-object v5

    if-nez v5, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v11}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lh2/b;

    iget-wide v5, v5, Lh2/b;->a:J

    invoke-static {v5, v6, v1, v2}, Lh2/b;->h(JJ)J

    move-result-wide v1

    new-instance v5, Lh2/b;

    invoke-direct {v5, v1, v2}, Lh2/b;-><init>(J)V

    invoke-virtual {v11, v5}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh2/b;

    iget-wide v1, v1, Lh2/b;->a:J

    invoke-virtual {v11}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lh2/b;

    iget-wide v5, v5, Lh2/b;->a:J

    invoke-static {v1, v2, v5, v6}, Lh2/b;->h(JJ)J

    move-result-wide v5

    invoke-virtual {v3}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh2/b;

    iget-wide v7, v1, Lh2/b;->a:J

    iget-boolean v9, v0, Lf1/n1;->b:Z

    sget-object v10, Lf1/w;->g:Lf1/v;

    invoke-virtual/range {v4 .. v10}, Lf1/w0;->o(JJZLf1/v;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Lh2/b;

    invoke-direct {v1, v5, v6}, Lh2/b;-><init>(J)V

    invoke-virtual {v3, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    new-instance v1, Lh2/b;

    const-wide/16 v2, 0x0

    invoke-direct {v1, v2, v3}, Lh2/b;-><init>(J)V

    invoke-virtual {v11, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-void

    :pswitch_0
    sget-object v18, Lf1/w;->e:Lf1/v;

    iget-object v3, v0, Lf1/n1;->c:Ljava/lang/Object;

    move-object v4, v3

    check-cast v4, Lf1/s1;

    invoke-virtual {v4}, Lf1/s1;->j()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-virtual {v4}, Lf1/s1;->m()Lq3/y;

    move-result-object v3

    iget-object v3, v3, Lq3/y;->a:Ll3/g;

    iget-object v3, v3, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_2

    goto/16 :goto_3

    :cond_2
    iget-wide v5, v4, Lf1/s1;->q:J

    invoke-static {v5, v6, v1, v2}, Lh2/b;->h(JJ)J

    move-result-wide v1

    iput-wide v1, v4, Lf1/s1;->q:J

    iget-object v1, v4, Lf1/s1;->d:Lu0/s0;

    const/4 v2, 0x0

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lu0/s0;->d()Lu0/p1;

    move-result-object v1

    if-eqz v1, :cond_7

    iget-wide v5, v4, Lf1/s1;->o:J

    iget-wide v7, v4, Lf1/s1;->q:J

    invoke-static {v5, v6, v7, v8}, Lh2/b;->h(JJ)J

    move-result-wide v5

    new-instance v3, Lh2/b;

    invoke-direct {v3, v5, v6}, Lh2/b;-><init>(J)V

    iget-object v5, v4, Lf1/s1;->s:Lp1/k1;

    invoke-virtual {v5, v3}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v3, v4, Lf1/s1;->p:Ll3/u0;

    if-nez v3, :cond_4

    invoke-virtual {v4}, Lf1/s1;->i()Lh2/b;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-wide v5, v3, Lh2/b;->a:J

    invoke-virtual {v1, v5, v6}, Lu0/p1;->c(J)Z

    move-result v3

    if-nez v3, :cond_4

    iget-object v3, v4, Lf1/s1;->b:Lq3/r;

    iget-wide v5, v4, Lf1/s1;->o:J

    const/4 v7, 0x1

    invoke-virtual {v1, v5, v6, v7}, Lu0/p1;->b(JZ)I

    move-result v5

    invoke-interface {v3, v5}, Lq3/r;->n(I)I

    move-result v3

    iget-object v5, v4, Lf1/s1;->b:Lq3/r;

    invoke-virtual {v4}, Lf1/s1;->i()Lh2/b;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-wide v8, v6, Lh2/b;->a:J

    invoke-virtual {v1, v8, v9, v7}, Lu0/p1;->b(JZ)I

    move-result v1

    invoke-interface {v5, v1}, Lq3/r;->n(I)I

    move-result v1

    if-ne v3, v1, :cond_3

    sget-object v18, Lf1/w;->d:Lf1/v;

    :cond_3
    move-object/from16 v10, v18

    invoke-virtual {v4}, Lf1/s1;->m()Lq3/y;

    move-result-object v5

    invoke-virtual {v4}, Lf1/s1;->i()Lh2/b;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-wide v6, v1, Lh2/b;->a:J

    const/4 v9, 0x0

    const/4 v11, 0x1

    const/4 v8, 0x0

    invoke-static/range {v4 .. v11}, Lf1/s1;->c(Lf1/s1;Lq3/y;JZZLf1/v;Z)J

    move-result-wide v5

    goto :goto_2

    :cond_4
    iget-object v3, v4, Lf1/s1;->p:Ll3/u0;

    if-eqz v3, :cond_5

    iget-wide v5, v3, Ll3/u0;->a:J

    const/16 v3, 0x20

    shr-long/2addr v5, v3

    long-to-int v3, v5

    goto :goto_1

    :cond_5
    iget-wide v5, v4, Lf1/s1;->o:J

    invoke-virtual {v1, v5, v6, v2}, Lu0/p1;->b(JZ)I

    move-result v3

    :goto_1
    invoke-virtual {v4}, Lf1/s1;->i()Lh2/b;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-wide v5, v5, Lh2/b;->a:J

    invoke-virtual {v1, v5, v6, v2}, Lu0/p1;->b(JZ)I

    move-result v1

    iget-object v5, v4, Lf1/s1;->p:Ll3/u0;

    if-nez v5, :cond_6

    if-ne v3, v1, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {v4}, Lf1/s1;->m()Lq3/y;

    move-result-object v13

    invoke-virtual {v4}, Lf1/s1;->i()Lh2/b;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-wide v14, v1, Lh2/b;->a:J

    const/16 v17, 0x0

    const/16 v19, 0x1

    const/16 v16, 0x0

    move-object v12, v4

    invoke-static/range {v12 .. v19}, Lf1/s1;->c(Lf1/s1;Lq3/y;JZZLf1/v;Z)J

    move-result-wide v5

    :goto_2
    iget-object v1, v4, Lf1/s1;->p:Ll3/u0;

    invoke-static {v5, v6, v1}, Ll3/u0;->a(JLjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    iput-boolean v2, v0, Lf1/n1;->b:Z

    :cond_7
    invoke-virtual {v4, v2}, Lf1/s1;->s(Z)V

    :cond_8
    :goto_3
    return-void

    :pswitch_1
    iget-object v3, v0, Lf1/n1;->c:Ljava/lang/Object;

    move-object v4, v3

    check-cast v4, Lf1/s1;

    iget-wide v5, v4, Lf1/s1;->q:J

    invoke-static {v5, v6, v1, v2}, Lh2/b;->h(JJ)J

    move-result-wide v1

    iput-wide v1, v4, Lf1/s1;->q:J

    iget-wide v5, v4, Lf1/s1;->o:J

    invoke-static {v5, v6, v1, v2}, Lh2/b;->h(JJ)J

    move-result-wide v1

    new-instance v3, Lh2/b;

    invoke-direct {v3, v1, v2}, Lh2/b;-><init>(J)V

    iget-object v1, v4, Lf1/s1;->s:Lp1/k1;

    invoke-virtual {v1, v3}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lf1/s1;->m()Lq3/y;

    move-result-object v5

    invoke-virtual {v4}, Lf1/s1;->i()Lh2/b;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-wide v6, v1, Lh2/b;->a:J

    iget-boolean v9, v0, Lf1/n1;->b:Z

    sget-object v10, Lf1/w;->g:Lf1/v;

    const/4 v11, 0x1

    const/4 v8, 0x0

    invoke-static/range {v4 .. v11}, Lf1/s1;->c(Lf1/s1;Lq3/y;JZZLf1/v;Z)J

    const/4 v1, 0x0

    invoke-virtual {v4, v1}, Lf1/s1;->s(Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public g()V
    .locals 7

    iget-object v0, p0, Lf1/n1;->c:Ljava/lang/Object;

    check-cast v0, Lf1/s1;

    iget-object v1, v0, Lf1/s1;->r:Lp1/k1;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v1, v0, Lf1/s1;->s:Lp1/k1;

    invoke-virtual {v1, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lf1/s1;->s(Z)V

    invoke-virtual {v0}, Lf1/s1;->m()Lq3/y;

    move-result-object v3

    iget-wide v3, v3, Lq3/y;->b:J

    invoke-static {v3, v4}, Ll3/u0;->c(J)Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v4, Lu0/g0;->y:Lu0/g0;

    goto :goto_0

    :cond_0
    sget-object v4, Lu0/g0;->x:Lu0/g0;

    :goto_0
    invoke-virtual {v0, v4}, Lf1/s1;->p(Lu0/g0;)V

    iget-object v4, v0, Lf1/s1;->d:Lu0/s0;

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    if-nez v3, :cond_1

    invoke-static {v0, v1}, Lf1/y0;->x(Lf1/s1;Z)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v1

    goto :goto_1

    :cond_1
    move v6, v5

    :goto_1
    iget-object v4, v4, Lu0/s0;->m:Lp1/k1;

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-virtual {v4, v6}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_2
    iget-object v4, v0, Lf1/s1;->d:Lu0/s0;

    if-eqz v4, :cond_4

    if-nez v3, :cond_3

    invoke-static {v0, v5}, Lf1/y0;->x(Lf1/s1;Z)Z

    move-result v6

    if-eqz v6, :cond_3

    move v6, v1

    goto :goto_2

    :cond_3
    move v6, v5

    :goto_2
    iget-object v4, v4, Lu0/s0;->n:Lp1/k1;

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-virtual {v4, v6}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_4
    iget-object v4, v0, Lf1/s1;->d:Lu0/s0;

    if-eqz v4, :cond_6

    if-eqz v3, :cond_5

    invoke-static {v0, v1}, Lf1/y0;->x(Lf1/s1;Z)Z

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_3

    :cond_5
    move v1, v5

    :goto_3
    iget-object v3, v4, Lu0/s0;->o:Lp1/k1;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v3, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_6
    iget-boolean v1, p0, Lf1/n1;->b:Z

    if-eqz v1, :cond_7

    iget-object v1, v0, Lf1/s1;->p:Ll3/u0;

    invoke-static {v0, v1}, Lf1/s1;->a(Lf1/s1;Ll3/u0;)V

    :cond_7
    iput-object v2, v0, Lf1/s1;->p:Ll3/u0;

    return-void
.end method

.method public final onCancel()V
    .locals 3

    iget v0, p0, Lf1/n1;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf1/n1;->c:Ljava/lang/Object;

    check-cast v0, Lf1/w0;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lf1/w0;->x:Z

    invoke-virtual {v0}, Lf1/w0;->p()V

    iget-object v1, v0, Lf1/w0;->r:Lp1/k1;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v0, v0, Lf1/w0;->s:Lp1/k1;

    invoke-virtual {v0, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void

    :pswitch_0
    invoke-virtual {p0}, Lf1/n1;->g()V

    :pswitch_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onStop()V
    .locals 3

    iget v0, p0, Lf1/n1;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf1/n1;->c:Ljava/lang/Object;

    check-cast v0, Lf1/w0;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lf1/w0;->x:Z

    invoke-virtual {v0}, Lf1/w0;->p()V

    iget-object v1, v0, Lf1/w0;->r:Lp1/k1;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v0, v0, Lf1/w0;->s:Lp1/k1;

    invoke-virtual {v0, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void

    :pswitch_0
    invoke-virtual {p0}, Lf1/n1;->g()V

    return-void

    :pswitch_1
    iget-object v0, p0, Lf1/n1;->c:Ljava/lang/Object;

    check-cast v0, Lf1/s1;

    iget-object v1, v0, Lf1/s1;->r:Lp1/k1;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v1, v0, Lf1/s1;->s:Lp1/k1;

    invoke-virtual {v1, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lf1/s1;->s(Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
