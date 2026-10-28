.class public final synthetic Lcp0/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lcp0/w0;->w:I

    iput-object p1, p0, Lcp0/w0;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcp0/w0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcp0/w0;->x:Ljava/lang/Object;

    check-cast v0, Lcp0/z0;

    check-cast p1, Lp1/i0;

    invoke-static {v0, p1}, Lcp0/m1;->c(Lcp0/z0;Lp1/i0;)Lp1/h0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcp0/w0;->x:Ljava/lang/Object;

    check-cast v0, Lcp0/e1;

    check-cast p1, Ly3/c;

    invoke-static {v0, p1}, Lcp0/m1;->h(Lcp0/e1;Ly3/c;)Ly3/j;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lcp0/w0;->x:Ljava/lang/Object;

    check-cast v0, Lcp0/h1;

    check-cast p1, Ly3/c;

    invoke-static {v0, p1}, Lcp0/x0;->r(Lcp0/h1;Ly3/c;)Ly3/j;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lcp0/w0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    check-cast p1, Li3/z;

    invoke-static {v0, p1}, Lcp0/x0;->t(Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lcp0/w0;->x:Ljava/lang/Object;

    check-cast v0, Lch0/v0;

    check-cast p1, Lp1/i0;

    invoke-static {v0, p1}, Lcp0/x0;->p(Lch0/v0;Lp1/i0;)Lp1/h0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lcp0/w0;->x:Ljava/lang/Object;

    check-cast v0, Lp1/t2;

    check-cast p1, Lq3/y;

    invoke-static {v0, p1}, Lcp0/a0;->d(Lp1/t2;Lq3/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lcp0/w0;->x:Ljava/lang/Object;

    check-cast v0, Lql0/c;

    check-cast p1, Lp1/i0;

    invoke-static {v0, p1}, Lcp0/a0;->b(Lql0/c;Lp1/i0;)Lp1/h0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lcp0/w0;->x:Ljava/lang/Object;

    check-cast v0, Lh0/p;

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {v0, p1}, Lcp0/s;->a(Lh0/p;F)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lcp0/w0;->x:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    check-cast p1, Lh2/b;

    invoke-static {v0, p1}, Lcp0/x0$a;->a(Lc93/a;Lh2/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
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
