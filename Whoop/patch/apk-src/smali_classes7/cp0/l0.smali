.class public final synthetic Lcp0/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/z0;


# direct methods
.method public synthetic constructor <init>(Lp1/z0;I)V
    .locals 0

    iput p2, p0, Lcp0/l0;->w:I

    iput-object p1, p0, Lcp0/l0;->x:Lp1/z0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcp0/l0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcp0/l0;->x:Lp1/z0;

    check-cast p1, Ly3/l;

    invoke-static {v0, p1}, Lcp0/x0;->c(Lp1/z0;Ly3/l;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lcp0/l0;->x:Lp1/z0;

    invoke-static {v0, p1}, Lcp0/j0;->h(Lp1/z0;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lcp0/l0;->x:Lp1/z0;

    invoke-static {v0, p1}, Lcp0/j0;->l(Lp1/z0;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lcp0/l0;->x:Lp1/z0;

    invoke-static {v0, p1}, Lcp0/a0;->e(Lp1/z0;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lcp0/l0;->x:Lp1/z0;

    invoke-static {v0, p1}, Lcp0/j0$c;->f(Lp1/z0;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lcp0/l0;->x:Lp1/z0;

    invoke-static {v0, p1}, Lcp0/j0$c;->i(Lp1/z0;F)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
