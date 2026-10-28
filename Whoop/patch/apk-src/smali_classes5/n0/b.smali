.class public final Ln0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp0/s0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Lh0/x2;


# direct methods
.method public synthetic constructor <init>(Lh0/x2;ZI)V
    .locals 0

    iput p3, p0, Ln0/b;->a:I

    iput-object p1, p0, Ln0/b;->c:Lh0/x2;

    iput-boolean p2, p0, Ln0/b;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ILg1/j5;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Ln0/b;->a:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iget-object v2, p0, Ln0/b;->c:Lh0/x2;

    packed-switch v0, :pswitch_data_0

    check-cast v2, Lq0/y;

    invoke-static {v2, p1, p2}, Lq0/y;->v(Lq0/y;ILs83/i;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    move-object v1, p1

    :cond_0
    return-object v1

    :pswitch_0
    check-cast v2, Ln0/u;

    sget-object v0, Ln0/u;->x:Lp0/n0;

    const/4 v0, 0x0

    invoke-virtual {v2, p1, v0, p2}, Ln0/u;->j(IILq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    move-object v1, p1

    :cond_1
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()I
    .locals 2

    iget v0, p0, Ln0/b;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ln0/b;->c:Lh0/x2;

    check-cast v0, Lq0/y;

    invoke-virtual {v0}, Lq0/y;->l()Lq0/q;

    move-result-object v1

    iget v1, v1, Lq0/q;->f:I

    neg-int v1, v1

    invoke-virtual {v0}, Lq0/y;->l()Lq0/q;

    move-result-object v0

    iget v0, v0, Lq0/q;->d:I

    :goto_0
    add-int/2addr v1, v0

    return v1

    :pswitch_0
    iget-object v0, p0, Ln0/b;->c:Lh0/x2;

    check-cast v0, Ln0/u;

    invoke-virtual {v0}, Ln0/u;->h()Ln0/n;

    move-result-object v1

    iget v1, v1, Ln0/n;->l:I

    neg-int v1, v1

    invoke-virtual {v0}, Ln0/u;->h()Ln0/n;

    move-result-object v0

    iget v0, v0, Ln0/n;->p:I

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c()F
    .locals 3

    iget v0, p0, Ln0/b;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ln0/b;->c:Lh0/x2;

    check-cast v0, Lq0/y;

    invoke-virtual {v0}, Lq0/y;->l()Lq0/q;

    move-result-object v1

    invoke-virtual {v0}, Lq0/y;->m()I

    move-result v0

    invoke-static {v1, v0}, Lq0/c0;->a(Lq0/q;I)J

    move-result-wide v0

    long-to-float v0, v0

    return v0

    :pswitch_0
    iget-object v0, p0, Ln0/b;->c:Lh0/x2;

    check-cast v0, Ln0/u;

    iget-object v1, v0, Ln0/u;->e:Ll2/a;

    iget-object v1, v1, Ll2/a;->b:Ljava/lang/Object;

    check-cast v1, Lp1/h1;

    invoke-virtual {v1}, Lp1/h1;->x()I

    move-result v1

    iget-object v2, v0, Ln0/u;->e:Ll2/a;

    iget-object v2, v2, Ll2/a;->c:Ljava/lang/Object;

    check-cast v2, Lp1/h1;

    invoke-virtual {v2}, Lp1/h1;->x()I

    move-result v2

    invoke-virtual {v0}, Ln0/u;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    mul-int/lit16 v1, v1, 0x1f4

    add-int/2addr v1, v2

    int-to-float v0, v1

    const/16 v1, 0x64

    int-to-float v1, v1

    add-float/2addr v0, v1

    goto :goto_0

    :cond_0
    mul-int/lit16 v1, v1, 0x1f4

    add-int/2addr v1, v2

    int-to-float v0, v1

    :goto_0
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d()Li3/b;
    .locals 3

    iget v0, p0, Ln0/b;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ln0/b;->c:Lh0/x2;

    check-cast v0, Lq0/y;

    iget-boolean v1, p0, Ln0/b;->b:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    new-instance v1, Li3/b;

    invoke-virtual {v0}, Lq0/y;->m()I

    move-result v0

    invoke-direct {v1, v0, v2}, Li3/b;-><init>(II)V

    goto :goto_0

    :cond_0
    new-instance v1, Li3/b;

    invoke-virtual {v0}, Lq0/y;->m()I

    move-result v0

    invoke-direct {v1, v2, v0}, Li3/b;-><init>(II)V

    :goto_0
    return-object v1

    :pswitch_0
    iget-object v0, p0, Ln0/b;->c:Lh0/x2;

    check-cast v0, Ln0/u;

    iget-boolean v1, p0, Ln0/b;->b:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    new-instance v1, Li3/b;

    invoke-virtual {v0}, Ln0/u;->h()Ln0/n;

    move-result-object v0

    iget v0, v0, Ln0/n;->n:I

    invoke-direct {v1, v0, v2}, Li3/b;-><init>(II)V

    goto :goto_1

    :cond_1
    new-instance v1, Li3/b;

    invoke-virtual {v0}, Ln0/u;->h()Ln0/n;

    move-result-object v0

    iget v0, v0, Ln0/n;->n:I

    invoke-direct {v1, v2, v0}, Li3/b;-><init>(II)V

    :goto_1
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e()I
    .locals 4

    iget v0, p0, Ln0/b;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ln0/b;->c:Lh0/x2;

    check-cast v0, Lq0/y;

    invoke-virtual {v0}, Lq0/y;->l()Lq0/q;

    move-result-object v1

    iget-object v1, v1, Lq0/q;->e:Lh0/d2;

    sget-object v2, Lh0/d2;->w:Lh0/d2;

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lq0/y;->l()Lq0/q;

    move-result-object v0

    invoke-virtual {v0}, Lq0/q;->e()J

    move-result-wide v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    :goto_0
    long-to-int v0, v0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Lq0/y;->l()Lq0/q;

    move-result-object v0

    invoke-virtual {v0}, Lq0/q;->e()J

    move-result-wide v0

    const/16 v2, 0x20

    shr-long/2addr v0, v2

    goto :goto_0

    :goto_1
    return v0

    :pswitch_0
    iget-object v0, p0, Ln0/b;->c:Lh0/x2;

    check-cast v0, Ln0/u;

    invoke-virtual {v0}, Ln0/u;->h()Ln0/n;

    move-result-object v1

    iget-object v1, v1, Ln0/n;->o:Lh0/d2;

    sget-object v2, Lh0/d2;->w:Lh0/d2;

    if-ne v1, v2, :cond_1

    invoke-virtual {v0}, Ln0/u;->h()Ln0/n;

    move-result-object v0

    invoke-virtual {v0}, Ln0/n;->e()J

    move-result-wide v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    :goto_2
    long-to-int v0, v0

    goto :goto_3

    :cond_1
    invoke-virtual {v0}, Ln0/u;->h()Ln0/n;

    move-result-object v0

    invoke-virtual {v0}, Ln0/n;->e()J

    move-result-wide v0

    const/16 v2, 0x20

    shr-long/2addr v0, v2

    goto :goto_2

    :goto_3
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final f()F
    .locals 2

    iget v0, p0, Ln0/b;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ln0/b;->c:Lh0/x2;

    check-cast v0, Lq0/y;

    invoke-static {v0}, Le4/a;->t(Lq0/y;)J

    move-result-wide v0

    long-to-float v0, v0

    return v0

    :pswitch_0
    iget-object v0, p0, Ln0/b;->c:Lh0/x2;

    check-cast v0, Ln0/u;

    iget-object v1, v0, Ln0/u;->e:Ll2/a;

    iget-object v1, v1, Ll2/a;->b:Ljava/lang/Object;

    check-cast v1, Lp1/h1;

    invoke-virtual {v1}, Lp1/h1;->x()I

    move-result v1

    iget-object v0, v0, Ln0/u;->e:Ll2/a;

    iget-object v0, v0, Ll2/a;->c:Ljava/lang/Object;

    check-cast v0, Lp1/h1;

    invoke-virtual {v0}, Lp1/h1;->x()I

    move-result v0

    mul-int/lit16 v1, v1, 0x1f4

    add-int/2addr v1, v0

    int-to-float v0, v1

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
