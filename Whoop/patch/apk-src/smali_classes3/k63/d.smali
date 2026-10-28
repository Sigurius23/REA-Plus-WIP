.class public final Lk63/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p5, p0, Lk63/d;->w:I

    iput-object p1, p0, Lk63/d;->x:Ljava/lang/Object;

    iput-object p2, p0, Lk63/d;->y:Ljava/lang/Object;

    iput-object p3, p0, Lk63/d;->z:Ljava/lang/Object;

    iput-object p4, p0, Lk63/d;->E:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lk63/d;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object p2, p0, Lk63/d;->z:Ljava/lang/Object;

    check-cast p2, Lf1/s1;

    iget-object v0, p0, Lk63/d;->x:Ljava/lang/Object;

    check-cast v0, Lu0/s0;

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Lu0/s0;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lk63/d;->y:Ljava/lang/Object;

    check-cast p1, Lq3/z;

    invoke-virtual {p2}, Lf1/s1;->m()Lq3/y;

    move-result-object v1

    iget-object v2, p0, Lk63/d;->E:Ljava/lang/Object;

    check-cast v2, Lq3/l;

    iget-object p2, p2, Lf1/s1;->b:Lq3/r;

    invoke-static {p1, v0, v1, v2, p2}, Lu0/n0;->u(Lq3/z;Lu0/s0;Lq3/y;Lq3/l;Lq3/r;)V

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lu0/n0;->l(Lu0/s0;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    iget-object p1, p0, Lk63/d;->x:Ljava/lang/Object;

    check-cast p1, Ln0/u;

    iget-object p1, p1, Ln0/u;->e:Ll2/a;

    iget-object p2, p1, Ll2/a;->b:Ljava/lang/Object;

    check-cast p2, Lp1/h1;

    invoke-virtual {p2}, Lp1/h1;->x()I

    move-result p2

    div-int/lit8 p2, p2, 0xc

    iget-object p1, p1, Ll2/a;->b:Ljava/lang/Object;

    check-cast p1, Lp1/h1;

    invoke-virtual {p1}, Lp1/h1;->x()I

    move-result p1

    rem-int/lit8 p1, p1, 0xc

    const/4 v0, 0x1

    add-int/2addr p1, v0

    iget-object v1, p0, Lk63/d;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lk63/d;->z:Ljava/lang/Object;

    check-cast v2, Lm1/o;

    iget-object v3, p0, Lk63/d;->E:Ljava/lang/Object;

    check-cast v3, Li93/j;

    iget v3, v3, Li93/h;->w:I

    add-int/2addr v3, p2

    check-cast v2, Lm1/q;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, p1, v0}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    move-result-object p1

    invoke-virtual {v2, p1}, Lm1/q;->e(Ljava/time/LocalDate;)Lm1/r;

    move-result-object p1

    iget-wide p1, p1, Lm1/r;->e:J

    new-instance v0, Ljava/lang/Long;

    invoke-direct {v0, p1, p2}, Ljava/lang/Long;-><init>(J)V

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    instance-of v0, p2, Lk63/c;

    if-eqz v0, :cond_1

    move-object v0, p2

    check-cast v0, Lk63/c;

    iget v1, v0, Lk63/c;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_1

    sub-int/2addr v1, v2

    iput v1, v0, Lk63/c;->x:I

    goto :goto_1

    :cond_1
    new-instance v0, Lk63/c;

    invoke-direct {v0, p0, p2}, Lk63/c;-><init>(Lk63/d;Lq83/d;)V

    :goto_1
    iget-object p2, v0, Lk63/c;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lk63/c;->x:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v4, :cond_3

    if-ne v2, v3, :cond_2

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    iget-object p1, v0, Lk63/c;->y:Lec3/m;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lk63/d;->x:Ljava/lang/Object;

    check-cast p2, Lec3/m;

    check-cast p1, Lk63/b;

    iget-object v2, p0, Lk63/d;->y:Ljava/lang/Object;

    check-cast v2, Ljava/nio/charset/Charset;

    iget-object v5, p0, Lk63/d;->z:Ljava/lang/Object;

    check-cast v5, Ls63/a;

    iget-object v6, p0, Lk63/d;->E:Ljava/lang/Object;

    check-cast v6, Lio/ktor/utils/io/q;

    iput-object p2, v0, Lk63/c;->y:Lec3/m;

    iput v4, v0, Lk63/c;->x:I

    invoke-interface {p1, v2, v5, v6, v0}, Lk63/b;->b(Ljava/nio/charset/Charset;Ls63/a;Lio/ktor/utils/io/q;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_4

    :cond_5
    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    :goto_2
    const/4 v2, 0x0

    iput-object v2, v0, Lk63/c;->y:Lec3/m;

    iput v3, v0, Lk63/c;->x:I

    invoke-interface {p1, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_4

    :cond_6
    :goto_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_4
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
