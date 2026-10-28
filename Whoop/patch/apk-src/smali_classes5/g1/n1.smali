.class public final Lg1/n1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lz1/p;


# direct methods
.method public synthetic constructor <init>(Lz1/p;I)V
    .locals 0

    iput p2, p0, Lg1/n1;->w:I

    iput-object p1, p0, Lg1/n1;->x:Lz1/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 1

    iget p2, p0, Lg1/n1;->w:I

    packed-switch p2, :pswitch_data_0

    check-cast p1, Lj0/h;

    instance-of p2, p1, Lj0/f;

    iget-object v0, p0, Lg1/n1;->x:Lz1/p;

    if-eqz p2, :cond_0

    invoke-virtual {v0, p1}, Lz1/p;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    instance-of p2, p1, Lj0/g;

    if-eqz p2, :cond_1

    check-cast p1, Lj0/g;

    iget-object p1, p1, Lj0/g;->a:Lj0/f;

    invoke-virtual {v0, p1}, Lz1/p;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    instance-of p2, p1, Lj0/d;

    if-eqz p2, :cond_2

    invoke-virtual {v0, p1}, Lz1/p;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    instance-of p2, p1, Lj0/e;

    if-eqz p2, :cond_3

    check-cast p1, Lj0/e;

    iget-object p1, p1, Lj0/e;->a:Lj0/d;

    invoke-virtual {v0, p1}, Lz1/p;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    instance-of p2, p1, Lj0/l;

    if-eqz p2, :cond_4

    invoke-virtual {v0, p1}, Lz1/p;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    instance-of p2, p1, Lj0/m;

    if-eqz p2, :cond_5

    check-cast p1, Lj0/m;

    iget-object p1, p1, Lj0/m;->a:Lj0/l;

    invoke-virtual {v0, p1}, Lz1/p;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    instance-of p2, p1, Lj0/k;

    if-eqz p2, :cond_6

    check-cast p1, Lj0/k;

    iget-object p1, p1, Lj0/k;->a:Lj0/l;

    invoke-virtual {v0, p1}, Lz1/p;->remove(Ljava/lang/Object;)Z

    :cond_6
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lj0/h;

    instance-of p2, p1, Lj0/l;

    iget-object v0, p0, Lg1/n1;->x:Lz1/p;

    if-eqz p2, :cond_7

    invoke-virtual {v0, p1}, Lz1/p;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_7
    instance-of p2, p1, Lj0/m;

    if-eqz p2, :cond_8

    check-cast p1, Lj0/m;

    iget-object p1, p1, Lj0/m;->a:Lj0/l;

    invoke-virtual {v0, p1}, Lz1/p;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_8
    instance-of p2, p1, Lj0/k;

    if-eqz p2, :cond_9

    check-cast p1, Lj0/k;

    iget-object p1, p1, Lj0/k;->a:Lj0/l;

    invoke-virtual {v0, p1}, Lz1/p;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_9
    instance-of p2, p1, Lj0/b;

    if-eqz p2, :cond_a

    invoke-virtual {v0, p1}, Lz1/p;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_a
    instance-of p2, p1, Lj0/c;

    if-eqz p2, :cond_b

    check-cast p1, Lj0/c;

    iget-object p1, p1, Lj0/c;->a:Lj0/b;

    invoke-virtual {v0, p1}, Lz1/p;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_b
    instance-of p2, p1, Lj0/a;

    if-eqz p2, :cond_c

    check-cast p1, Lj0/a;

    iget-object p1, p1, Lj0/a;->a:Lj0/b;

    invoke-virtual {v0, p1}, Lz1/p;->remove(Ljava/lang/Object;)Z

    :cond_c
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Lj0/h;

    instance-of p2, p1, Lj0/l;

    iget-object v0, p0, Lg1/n1;->x:Lz1/p;

    if-eqz p2, :cond_d

    invoke-virtual {v0, p1}, Lz1/p;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_d
    instance-of p2, p1, Lj0/m;

    if-eqz p2, :cond_e

    check-cast p1, Lj0/m;

    iget-object p1, p1, Lj0/m;->a:Lj0/l;

    invoke-virtual {v0, p1}, Lz1/p;->remove(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_e
    instance-of p2, p1, Lj0/k;

    if-eqz p2, :cond_f

    check-cast p1, Lj0/k;

    iget-object p1, p1, Lj0/k;->a:Lj0/l;

    invoke-virtual {v0, p1}, Lz1/p;->remove(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_f
    instance-of p2, p1, Lj0/b;

    if-eqz p2, :cond_10

    invoke-virtual {v0, p1}, Lz1/p;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_10
    instance-of p2, p1, Lj0/c;

    if-eqz p2, :cond_11

    check-cast p1, Lj0/c;

    iget-object p1, p1, Lj0/c;->a:Lj0/b;

    invoke-virtual {v0, p1}, Lz1/p;->remove(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_11
    instance-of p2, p1, Lj0/a;

    if-eqz p2, :cond_12

    check-cast p1, Lj0/a;

    iget-object p1, p1, Lj0/a;->a:Lj0/b;

    invoke-virtual {v0, p1}, Lz1/p;->remove(Ljava/lang/Object;)Z

    :cond_12
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, Lj0/h;

    instance-of p2, p1, Lj0/f;

    iget-object v0, p0, Lg1/n1;->x:Lz1/p;

    if-eqz p2, :cond_13

    invoke-virtual {v0, p1}, Lz1/p;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_13
    instance-of p2, p1, Lj0/g;

    if-eqz p2, :cond_14

    check-cast p1, Lj0/g;

    iget-object p1, p1, Lj0/g;->a:Lj0/f;

    invoke-virtual {v0, p1}, Lz1/p;->remove(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_14
    instance-of p2, p1, Lj0/d;

    if-eqz p2, :cond_15

    invoke-virtual {v0, p1}, Lz1/p;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_15
    instance-of p2, p1, Lj0/e;

    if-eqz p2, :cond_16

    check-cast p1, Lj0/e;

    iget-object p1, p1, Lj0/e;->a:Lj0/d;

    invoke-virtual {v0, p1}, Lz1/p;->remove(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_16
    instance-of p2, p1, Lj0/l;

    if-eqz p2, :cond_17

    invoke-virtual {v0, p1}, Lz1/p;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_17
    instance-of p2, p1, Lj0/m;

    if-eqz p2, :cond_18

    check-cast p1, Lj0/m;

    iget-object p1, p1, Lj0/m;->a:Lj0/l;

    invoke-virtual {v0, p1}, Lz1/p;->remove(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_18
    instance-of p2, p1, Lj0/k;

    if-eqz p2, :cond_19

    check-cast p1, Lj0/k;

    iget-object p1, p1, Lj0/k;->a:Lj0/l;

    invoke-virtual {v0, p1}, Lz1/p;->remove(Ljava/lang/Object;)Z

    :cond_19
    :goto_3
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
