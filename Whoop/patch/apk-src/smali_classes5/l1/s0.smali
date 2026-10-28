.class public final synthetic Ll1/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ll1/g1;


# direct methods
.method public synthetic constructor <init>(Ll1/g1;I)V
    .locals 0

    iput p2, p0, Ll1/s0;->w:I

    iput-object p1, p0, Ll1/s0;->x:Ll1/g1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Ll1/s0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-object p1, p0, Ll1/s0;->x:Ll1/g1;

    check-cast p1, Ll1/h1;

    iget-object v2, p1, Ll1/h1;->c:Lm1/q;

    invoke-virtual {v2, v0, v1}, Lm1/q;->a(J)Lm1/r;

    move-result-object v0

    iget-object v1, p1, Ll1/h1;->a:Li93/j;

    iget v2, v0, Lm1/r;->a:I

    invoke-virtual {v1, v2}, Li93/j;->e(I)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p1, Ll1/h1;->e:Lp1/k1;

    invoke-virtual {p1, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Long;

    iget-object v0, p0, Ll1/s0;->x:Ll1/g1;

    check-cast v0, Ll1/h1;

    iget-object v1, v0, Ll1/h1;->f:Lp1/k1;

    const/4 v2, 0x0

    if-eqz p1, :cond_2

    iget-object v3, v0, Ll1/h1;->c:Lm1/q;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lm1/q;->d(J)Lm1/n;

    move-result-object p1

    iget-object v0, v0, Ll1/h1;->a:Li93/j;

    iget v3, p1, Lm1/n;->w:I

    invoke-virtual {v0, v3}, Li93/j;->e(I)Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v2, p1

    :cond_1
    invoke-virtual {v1, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v1, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Ll1/k1;

    iget p1, p1, Ll1/k1;->a:I

    iget-object v0, p0, Ll1/s0;->x:Ll1/g1;

    check-cast v0, Ll1/h1;

    invoke-virtual {v0}, Ll1/h1;->b()Ljava/lang/Long;

    move-result-object v1

    iget-object v2, v0, Ll1/h1;->c:Lm1/q;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lm1/q;->a(J)Lm1/r;

    move-result-object v1

    iget-wide v3, v1, Lm1/r;->e:J

    invoke-virtual {v2, v3, v4}, Lm1/q;->a(J)Lm1/r;

    move-result-object v1

    iget-object v2, v0, Ll1/h1;->a:Li93/j;

    iget v3, v1, Lm1/r;->a:I

    invoke-virtual {v2, v3}, Li93/j;->e(I)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, v0, Ll1/h1;->e:Lp1/k1;

    invoke-virtual {v2, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_3
    iget-object v0, v0, Ll1/h1;->g:Lp1/k1;

    new-instance v1, Ll1/k1;

    invoke-direct {v1, p1}, Ll1/k1;-><init>(I)V

    invoke-virtual {v0, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
