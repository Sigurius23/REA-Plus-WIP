.class public final synthetic Lu0/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lu0/s0;


# direct methods
.method public synthetic constructor <init>(Lu0/s0;I)V
    .locals 0

    iput p2, p0, Lu0/v;->w:I

    iput-object p1, p0, Lu0/v;->x:Lu0/s0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lu0/v;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lq3/k;

    iget-object v0, p0, Lu0/v;->x:Lu0/s0;

    iget-object v0, v0, Lu0/s0;->r:Lu0/o0;

    iget p1, p1, Lq3/k;->a:I

    invoke-virtual {v0, p1}, Lu0/o0;->c(I)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lq3/k;

    iget-object v0, p0, Lu0/v;->x:Lu0/s0;

    iget-object v0, v0, Lu0/s0;->r:Lu0/o0;

    iget p1, p1, Lq3/k;->a:I

    invoke-virtual {v0, p1}, Lu0/o0;->c(I)Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lu0/v;->x:Lu0/s0;

    iget-object v1, v0, Lu0/s0;->t:Lp1/k1;

    check-cast p1, Lq3/y;

    iget-object v2, p1, Lq3/y;->a:Ll3/g;

    iget-object v2, v2, Ll3/g;->x:Ljava/lang/String;

    iget-object v3, v0, Lu0/s0;->j:Ll3/g;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    iget-object v3, v3, Ll3/g;->x:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v3, v4

    :goto_0
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    sget-object v2, Lu0/g0;->w:Lu0/g0;

    iget-object v3, v0, Lu0/s0;->k:Lp1/k1;

    invoke-virtual {v3, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    iget-object v1, v0, Lu0/s0;->s:Lp1/k1;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_2
    :goto_1
    sget-wide v1, Ll3/u0;->b:J

    invoke-virtual {v0, v1, v2}, Lu0/s0;->f(J)V

    invoke-virtual {v0, v1, v2}, Lu0/s0;->e(J)V

    iget-object v1, v0, Lu0/s0;->u:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, v0, Lu0/s0;->b:Lp1/v1;

    iget-object v0, p1, Lp1/v1;->a:Lp1/w;

    if-eqz v0, :cond_3

    invoke-virtual {v0, p1, v4}, Lp1/w;->r(Lp1/v1;Ljava/lang/Object;)Lp1/p0;

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    iget-object v0, p0, Lu0/v;->x:Lu0/s0;

    iget-object v0, v0, Lu0/s0;->q:Lp1/k1;

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
