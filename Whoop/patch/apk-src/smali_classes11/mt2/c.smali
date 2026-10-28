.class public final synthetic Lmt2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lc00/a;Ld00/l;ZLc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lmt2/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmt2/c;->E:Ljava/lang/Object;

    iput-object p2, p0, Lmt2/c;->F:Ljava/lang/Object;

    iput-boolean p3, p0, Lmt2/c;->x:Z

    iput-object p4, p0, Lmt2/c;->y:Ljava/lang/Object;

    iput-object p5, p0, Lmt2/c;->z:Ljava/lang/Object;

    iput-object p6, p0, Lmt2/c;->G:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lot2/m;Lnt2/c;Lc93/a;Lc93/a;Lmt2/f;Z)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lmt2/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmt2/c;->E:Ljava/lang/Object;

    iput-object p2, p0, Lmt2/c;->F:Ljava/lang/Object;

    iput-object p3, p0, Lmt2/c;->y:Ljava/lang/Object;

    iput-object p4, p0, Lmt2/c;->z:Ljava/lang/Object;

    iput-object p5, p0, Lmt2/c;->G:Ljava/lang/Object;

    iput-boolean p6, p0, Lmt2/c;->x:Z

    return-void
.end method

.method public synthetic constructor <init>(Lu0/s0;ZLb3/m3;Lf1/s1;Lq3/y;Lq3/r;)V
    .locals 1

    .line 3
    const/4 v0, 0x2

    iput v0, p0, Lmt2/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmt2/c;->E:Ljava/lang/Object;

    iput-boolean p2, p0, Lmt2/c;->x:Z

    iput-object p3, p0, Lmt2/c;->F:Ljava/lang/Object;

    iput-object p4, p0, Lmt2/c;->y:Ljava/lang/Object;

    iput-object p5, p0, Lmt2/c;->z:Ljava/lang/Object;

    iput-object p6, p0, Lmt2/c;->G:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v0, p0

    iget v1, v0, Lmt2/c;->w:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Lmt2/c;->E:Ljava/lang/Object;

    check-cast v1, Lu0/s0;

    iget-object v2, v1, Lu0/s0;->o:Lp1/k1;

    iget-object v3, v0, Lmt2/c;->F:Ljava/lang/Object;

    check-cast v3, Lb3/m3;

    iget-object v4, v0, Lmt2/c;->y:Ljava/lang/Object;

    check-cast v4, Lf1/s1;

    iget-object v5, v0, Lmt2/c;->z:Ljava/lang/Object;

    move-object v7, v5

    check-cast v7, Lq3/y;

    iget-object v5, v0, Lmt2/c;->G:Ljava/lang/Object;

    move-object v8, v5

    check-cast v8, Lq3/r;

    move-object/from16 v5, p1

    check-cast v5, Ly2/y;

    iput-object v5, v1, Lu0/s0;->h:Ly2/y;

    invoke-virtual {v1}, Lu0/s0;->d()Lu0/p1;

    move-result-object v6

    if-eqz v6, :cond_0

    iput-object v5, v6, Lu0/p1;->b:Ly2/y;

    :cond_0
    iget-boolean v5, v0, Lmt2/c;->x:Z

    if-eqz v5, :cond_5

    invoke-virtual {v1}, Lu0/s0;->a()Lu0/g0;

    move-result-object v5

    sget-object v6, Lu0/g0;->x:Lu0/g0;

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-ne v5, v6, :cond_2

    iget-object v5, v1, Lu0/s0;->l:Lp1/k1;

    invoke-virtual {v5}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_1

    check-cast v3, Lb3/n2;

    iget-object v3, v3, Lb3/n2;->c:Lp1/k1;

    invoke-virtual {v3}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v4}, Lf1/s1;->q()V

    goto :goto_0

    :cond_1
    invoke-virtual {v4}, Lf1/s1;->n()V

    :goto_0
    invoke-static {v4, v10}, Lf1/y0;->x(Lf1/s1;Z)Z

    move-result v3

    iget-object v5, v1, Lu0/s0;->m:Lp1/k1;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v5, v3}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-static {v4, v9}, Lf1/y0;->x(Lf1/s1;Z)Z

    move-result v3

    iget-object v4, v1, Lu0/s0;->n:Lp1/k1;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v4, v3}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-wide v3, v7, Lq3/y;->b:J

    invoke-static {v3, v4}, Ll3/u0;->c(J)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v2, v3}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lu0/s0;->a()Lu0/g0;

    move-result-object v3

    sget-object v5, Lu0/g0;->y:Lu0/g0;

    if-ne v3, v5, :cond_3

    invoke-static {v4, v10}, Lf1/y0;->x(Lf1/s1;Z)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v2, v3}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_3
    :goto_1
    invoke-static {v1, v7, v8}, Lu0/n0;->s(Lu0/s0;Lq3/y;Lq3/r;)V

    invoke-virtual {v1}, Lu0/s0;->d()Lu0/p1;

    move-result-object v2

    if-eqz v2, :cond_5

    iget-object v3, v1, Lu0/s0;->e:Lq3/d0;

    if-eqz v3, :cond_5

    invoke-virtual {v1}, Lu0/s0;->b()Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, v2, Lu0/p1;->b:Ly2/y;

    if-eqz v1, :cond_5

    invoke-interface {v1}, Ly2/y;->g()Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_2

    :cond_4
    iget-object v4, v2, Lu0/p1;->c:Ly2/y;

    if-eqz v4, :cond_5

    iget-object v2, v2, Lu0/p1;->a:Ll3/r0;

    new-instance v10, Ls;

    const/16 v5, 0x15

    invoke-direct {v10, v1, v5}, Ls;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1}, Lf1/y0;->z(Ly2/y;)Lh2/c;

    move-result-object v11

    invoke-interface {v1, v4, v9}, Ly2/y;->r(Ly2/y;Z)Lh2/c;

    move-result-object v12

    iget-object v1, v3, Lq3/d0;->a:Lq3/z;

    iget-object v1, v1, Lq3/z;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq3/d0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v6, v3, Lq3/d0;->b:Lq3/t;

    move-object v9, v2

    invoke-interface/range {v6 .. v12}, Lq3/t;->g(Lq3/y;Lq3/r;Ll3/r0;Ls;Lh2/c;Lh2/c;)V

    :cond_5
    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    iget-object v1, v0, Lmt2/c;->E:Ljava/lang/Object;

    check-cast v1, Lc00/a;

    iget-object v2, v0, Lmt2/c;->F:Ljava/lang/Object;

    move-object v4, v2

    check-cast v4, Ld00/l;

    iget-object v2, v0, Lmt2/c;->y:Ljava/lang/Object;

    move-object v13, v2

    check-cast v13, Lc93/a;

    iget-object v2, v0, Lmt2/c;->z:Ljava/lang/Object;

    move-object v14, v2

    check-cast v14, Lc93/a;

    iget-object v2, v0, Lmt2/c;->G:Ljava/lang/Object;

    move-object v15, v2

    check-cast v15, Lkotlin/jvm/functions/Function1;

    move-object/from16 v2, p1

    check-cast v2, Ll8/c;

    const-string v3, "$this$initializer"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lc00/a;->j:Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lxz/f0;

    invoke-virtual {v1}, Lc00/a;->b()Lxz/x;

    move-result-object v6

    iget-object v2, v1, Lc00/a;->C:Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lyz/b;

    iget-object v2, v1, Lc00/a;->u:Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Lqy/d;

    iget-object v9, v1, Lc00/a;->f:Lwz/n0;

    iget-object v2, v1, Lc00/a;->k0:Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Lwz/s1;

    new-instance v16, Lm7/l0;

    invoke-virtual {v1}, Lc00/a;->c()Lwz/y;

    move-result-object v18

    const/16 v22, 0x0

    const/16 v23, 0x1c

    const/16 v17, 0x1

    const-class v19, Lwz/y;

    const-string v20, "onVerificationSucceeded"

    const-string v21, "onVerificationSucceeded(Lcom/stripe/android/model/ConsumerSessionRefresh;)V"

    invoke-direct/range {v16 .. v23}, Lm7/l0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v3, Lp00/o;

    iget-boolean v11, v0, Lmt2/c;->x:Z

    move-object/from16 v12, v16

    invoke-direct/range {v3 .. v15}, Lp00/o;-><init>(Ld00/l;Lxz/f0;Lxz/x;Lyz/b;Lqy/d;Lwz/n0;Lwz/s1;ZLm7/l0;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;)V

    return-object v3

    :pswitch_1
    iget-object v1, v0, Lmt2/c;->E:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lot2/m;

    iget-object v1, v0, Lmt2/c;->F:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lnt2/c;

    iget-object v1, v0, Lmt2/c;->y:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Lc93/a;

    iget-object v1, v0, Lmt2/c;->z:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Lc93/a;

    iget-object v1, v0, Lmt2/c;->G:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Lmt2/f;

    iget-boolean v7, v0, Lmt2/c;->x:Z

    move-object/from16 v8, p1

    check-cast v8, Leb/s0;

    invoke-static/range {v2 .. v8}, Lmt2/e;->n(Lot2/m;Lnt2/c;Lc93/a;Lc93/a;Lmt2/f;ZLeb/s0;)Ll83/a0;

    move-result-object v1

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
