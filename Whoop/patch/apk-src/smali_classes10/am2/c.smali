.class public final synthetic Lam2/c;
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

    iput p1, p0, Lam2/c;->w:I

    iput-object p2, p0, Lam2/c;->x:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lam2/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lam2/c;->x:Lp1/c1;

    invoke-static {v0, p1}, Lam2/o0;->K(Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lam2/c;->x:Lp1/c1;

    invoke-static {v0, p1}, Lam2/o0;->t(Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lam2/c;->x:Lp1/c1;

    invoke-static {v0, p1}, Lam2/o0;->N(Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lam2/c;->x:Lp1/c1;

    check-cast p1, Lg1/z3;

    invoke-static {v0, p1}, Lam2/o0;->B(Lp1/c1;Lg1/z3;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lam2/c;->x:Lp1/c1;

    check-cast p1, Lg1/z3;

    invoke-static {v0, p1}, Lam2/w;->o(Lp1/c1;Lg1/z3;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lam2/c;->x:Lp1/c1;

    invoke-static {v0, p1}, Lam2/w;->h(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lam2/c;->x:Lp1/c1;

    invoke-static {v0, p1}, Lam2/w;->j(Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lam2/c;->x:Lp1/c1;

    check-cast p1, Lg1/z3;

    invoke-static {v0, p1}, Lam2/w;->e(Lp1/c1;Lg1/z3;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lam2/c;->x:Lp1/c1;

    invoke-static {v0, p1}, Lam2/k;->e(Lp1/c1;Z)Ll83/a0;

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
