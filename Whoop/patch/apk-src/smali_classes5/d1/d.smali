.class public final synthetic Ld1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ld1/e;


# direct methods
.method public synthetic constructor <init>(Ld1/e;I)V
    .locals 0

    .line 1
    iput p2, p0, Ld1/d;->w:I

    iput-object p1, p0, Ld1/d;->x:Ld1/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ld1/e;Li3/z;)V
    .locals 0

    .line 2
    const/4 p2, 0x3

    iput p2, p0, Ld1/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld1/d;->x:Ld1/e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Ld1/d;->w:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    iget-object v3, p0, Ld1/d;->x:Ld1/e;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ll3/g;

    iget-boolean v0, v3, Ld1/e;->T:Z

    if-nez v0, :cond_2

    iget-boolean v0, v3, Ld1/e;->U:Z

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, v3, Ld1/e;->S:Lu0/s0;

    iget-object v0, v0, Lu0/s0;->e:Lq3/d0;

    if-eqz v0, :cond_1

    new-instance v4, Lq3/j;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v5, Lq3/a;

    invoke-direct {v5, p1, v2}, Lq3/a;-><init>(Ll3/g;I)V

    const/4 p1, 0x2

    new-array p1, p1, [Lq3/h;

    aput-object v4, p1, v1

    aput-object v5, p1, v2

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iget-object v1, v3, Ld1/e;->S:Lu0/s0;

    iget-object v3, v1, Lu0/s0;->d:Lq3/i;

    iget-object v1, v1, Lu0/s0;->v:Lu0/v;

    invoke-virtual {v3, p1}, Lq3/i;->b(Ljava/util/List;)Lq3/y;

    move-result-object p1

    const/4 v3, 0x0

    invoke-virtual {v0, v3, p1}, Lq3/d0;->a(Lq3/y;Lq3/y;)V

    invoke-virtual {v1, p1}, Lu0/v;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    move v1, v2

    goto :goto_1

    :cond_1
    iget-object v0, v3, Ld1/e;->R:Lq3/y;

    iget-object v1, v0, Lq3/y;->a:Ll3/g;

    iget-object v1, v1, Ll3/g;->x:Ljava/lang/String;

    iget-wide v4, v0, Lq3/y;->b:J

    sget v0, Ll3/u0;->c:I

    const/16 v0, 0x20

    shr-long v6, v4, v0

    long-to-int v6, v6

    const-wide v7, 0xffffffffL

    and-long/2addr v4, v7

    long-to-int v4, v4

    invoke-static {v1, v6, v4, p1}, Lyb3/r;->u0(Ljava/lang/CharSequence;IILjava/lang/CharSequence;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v4, v3, Ld1/e;->R:Lq3/y;

    iget-wide v4, v4, Lq3/y;->b:J

    shr-long/2addr v4, v0

    long-to-int v0, v4

    iget-object p1, p1, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p1, v0

    invoke-static {p1, p1}, Lj93/l0;->f(II)J

    move-result-wide v4

    iget-object p1, v3, Ld1/e;->S:Lu0/s0;

    iget-object p1, p1, Lu0/s0;->v:Lu0/v;

    new-instance v0, Lq3/y;

    const/4 v3, 0x4

    invoke-direct {v0, v3, v1, v4, v5}, Lq3/y;-><init>(ILjava/lang/String;J)V

    invoke-virtual {p1, v0}, Lu0/v;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ll3/g;

    iget-object v0, v3, Ld1/e;->S:Lu0/s0;

    iget-object p1, p1, Ll3/g;->x:Ljava/lang/String;

    iget-boolean v1, v3, Ld1/e;->T:Z

    iget-boolean v2, v3, Ld1/e;->U:Z

    invoke-static {v0, p1, v1, v2}, Ld1/e;->a1(Lu0/s0;Ljava/lang/String;ZZ)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/util/List;

    iget-object v0, v3, Ld1/e;->S:Lu0/s0;

    invoke-virtual {v0}, Lu0/s0;->d()Lu0/p1;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, v3, Ld1/e;->S:Lu0/s0;

    invoke-virtual {v0}, Lu0/s0;->d()Lu0/p1;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, v0, Lu0/p1;->a:Ll3/r0;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v1, v2

    :cond_3
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ll3/g;

    iget-object v0, v3, Ld1/e;->S:Lu0/s0;

    iget-object v0, v0, Lu0/s0;->t:Lp1/k1;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v0, v3, Ld1/e;->S:Lu0/s0;

    iget-object v0, v0, Lu0/s0;->s:Lp1/k1;

    invoke-virtual {v0, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v0, v3, Ld1/e;->S:Lu0/s0;

    iget-object p1, p1, Ll3/g;->x:Ljava/lang/String;

    iget-boolean v2, v3, Ld1/e;->T:Z

    iget-boolean v3, v3, Ld1/e;->U:Z

    invoke-static {v0, p1, v2, v3}, Ld1/e;->a1(Lu0/s0;Ljava/lang/String;ZZ)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
