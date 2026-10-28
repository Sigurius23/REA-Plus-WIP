.class public final synthetic Lwo1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p2, p0, Lwo1/h;->w:I

    iput-object p1, p0, Lwo1/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lwo1/h;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lwo1/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lzr1/b;->a(ILkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lwo1/h;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/String;

    invoke-static {p1, v0}, Lzr1/b;->f(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lwo1/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lzq2/l;->d(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lwo1/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lzq2/l;->b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lwo1/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lzd0/b;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lwo1/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1}, Lzc1/i5;->n(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lwo1/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lz51/m;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lwo1/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lz51/b;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lwo1/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lyu2/e;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lwo1/h;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lcom/whoop/design/models/modal/DecodedGenericInteraction;

    invoke-static {v0, p1}, Lyo1/a;->a(Lkotlin/jvm/functions/Function1;Lcom/whoop/design/models/modal/DecodedGenericInteraction;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lwo1/h;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lyn1/a;

    invoke-static {v0, p1}, Lyo1/a;->b(Lkotlin/jvm/functions/Function1;Lyn1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lwo1/h;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/String;

    invoke-static {p1, v0}, Lyk2/l;->r(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lwo1/h;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lwb0/f;

    invoke-static {v0, p1}, Lyb0/k;->n(Lkotlin/jvm/functions/Function1;Lwb0/f;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lwo1/h;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/String;

    invoke-static {p1, v0}, Lxw1/f;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lwo1/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lxi2/c;->b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lwo1/h;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ly3/l;

    invoke-static {v0, p1}, Lxi0/a;->a(Lkotlin/jvm/functions/Function1;Ly3/l;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lwo1/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lxa0/b;->d(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lwo1/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lwq1/c;->f(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lwo1/h;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lyn1/a;

    invoke-static {v0, p1}, Lwo1/o0;->a(Lkotlin/jvm/functions/Function1;Lyn1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lwo1/h;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lro1/g;

    invoke-static {v0, p1}, Lwo1/o0;->c(Lkotlin/jvm/functions/Function1;Lro1/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lwo1/h;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/String;

    invoke-static {p1, v0}, Lwo1/f0;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lwo1/h;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lyn1/a;

    invoke-static {v0, p1}, Lwo1/d0;->f(Lkotlin/jvm/functions/Function1;Lyn1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lwo1/h;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lyn1/a;

    invoke-static {v0, p1}, Lwo1/d0;->b(Lkotlin/jvm/functions/Function1;Lyn1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lwo1/h;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lro1/g;

    invoke-static {v0, p1}, Lwo1/d0;->c(Lkotlin/jvm/functions/Function1;Lro1/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lwo1/h;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lwo1/t;->h(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lwo1/h;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lvy0/y;

    invoke-static {v0, p1}, Lwo1/s;->b(Lkotlin/jvm/functions/Function1;Lvy0/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lwo1/h;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/time/LocalDate;

    invoke-static {v0, p1}, Lwo1/s;->a(Lkotlin/jvm/functions/Function1;Ljava/time/LocalDate;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lwo1/h;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/String;

    invoke-static {p1, v0}, Lwo1/s;->e(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lwo1/h;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lso1/d;

    invoke-static {v0, p1}, Lwo1/i;->c(Lkotlin/jvm/functions/Function1;Lso1/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lwo1/h;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lyn1/a;

    invoke-static {v0, p1}, Lwo1/i;->d(Lkotlin/jvm/functions/Function1;Lyn1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
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
