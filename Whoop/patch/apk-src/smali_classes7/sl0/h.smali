.class public final synthetic Lsl0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(ILp1/c1;)V
    .locals 0

    iput p1, p0, Lsl0/h;->w:I

    iput-object p2, p0, Lsl0/h;->x:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lsl0/h;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lsl0/h;->x:Lp1/c1;

    invoke-static {v0, p1}, Lsl0/p3;->b(Lp1/c1;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lsl0/h;->x:Lp1/c1;

    check-cast p1, Ly2/y;

    invoke-static {v0, p1}, Lsl0/p3;->a(Lp1/c1;Ly2/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lsl0/h;->x:Lp1/c1;

    invoke-static {v0, p1}, Lsl0/i3;->c(Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lsl0/h;->x:Lp1/c1;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lsl0/u2;->p(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lsl0/h;->x:Lp1/c1;

    check-cast p1, Ll3/r0;

    invoke-static {v0, p1}, Lsl0/l2;->c(Lp1/c1;Ll3/r0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lsl0/h;->x:Lp1/c1;

    check-cast p1, Lq3/y;

    invoke-static {v0, p1}, Lsl0/d2;->t(Lp1/c1;Lq3/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lsl0/h;->x:Lp1/c1;

    invoke-static {v0, p1}, Lsl0/g1;->g(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lsl0/h;->x:Lp1/c1;

    check-cast p1, Lg2/v;

    invoke-static {v0, p1}, Lsl0/o0;->a(Lp1/c1;Lg2/v;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lsl0/h;->x:Lp1/c1;

    check-cast p1, Lg2/v;

    invoke-static {v0, p1}, Lsl0/w;->n(Lp1/c1;Lg2/v;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lsl0/h;->x:Lp1/c1;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lsl0/i;->l(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
