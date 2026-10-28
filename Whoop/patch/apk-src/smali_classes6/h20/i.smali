.class public final Lh20/i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La00/g;ZZLq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lh20/i;->w:I

    .line 1
    iput-object p1, p0, Lh20/i;->z:Ljava/lang/Object;

    iput-boolean p2, p0, Lh20/i;->x:Z

    iput-boolean p3, p0, Lh20/i;->y:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(ZZLg2/s;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lh20/i;->w:I

    .line 2
    iput-boolean p1, p0, Lh20/i;->x:Z

    iput-boolean p2, p0, Lh20/i;->y:Z

    iput-object p3, p0, Lh20/i;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget p1, p0, Lh20/i;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lh20/i;

    iget-object v0, p0, Lh20/i;->z:Ljava/lang/Object;

    check-cast v0, Lg2/s;

    iget-boolean v1, p0, Lh20/i;->x:Z

    iget-boolean v2, p0, Lh20/i;->y:Z

    invoke-direct {p1, v1, v2, v0, p2}, Lh20/i;-><init>(ZZLg2/s;Lq83/d;)V

    return-object p1

    :pswitch_0
    new-instance p1, Lh20/i;

    iget-object v0, p0, Lh20/i;->z:Ljava/lang/Object;

    check-cast v0, La00/g;

    iget-boolean v1, p0, Lh20/i;->x:Z

    iget-boolean v2, p0, Lh20/i;->y:Z

    invoke-direct {p1, v0, v1, v2, p2}, Lh20/i;-><init>(La00/g;ZZLq83/d;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lh20/i;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lh20/i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh20/i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh20/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lh20/i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh20/i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh20/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lh20/i;->w:I

    iget-object v1, p0, Lh20/i;->z:Ljava/lang/Object;

    iget-boolean v2, p0, Lh20/i;->y:Z

    iget-boolean v3, p0, Lh20/i;->x:Z

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    if-eqz v3, :cond_0

    if-nez v2, :cond_0

    check-cast v1, Lg2/s;

    invoke-virtual {v1}, Lg2/s;->b()V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v1, La00/g;

    iget-object p1, v1, La00/g;->E:Ljava/lang/Object;

    check-cast p1, Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    const-string v0, "getValue(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/content/SharedPreferences;

    iget-object v0, v1, La00/g;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v1, "customer["

    const-string v4, "]"

    invoke-static {v1, v0, v4}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    const-string v0, "guest"

    :cond_2
    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    const-string p1, ""

    :cond_3
    const-string v0, ":"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x6

    invoke-static {p1, v0, v4}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v4

    const v5, -0x5b7b865e

    if-eq v4, v5, :cond_9

    const v3, -0x3d5b96c6

    if-eq v4, v3, :cond_6

    const p1, 0x32affa

    if-eq v4, p1, :cond_4

    goto :goto_1

    :cond_4
    const-string p1, "link"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_1

    :cond_5
    if-eqz v2, :cond_b

    sget-object v1, Lq20/g0;->w:Lq20/g0;

    goto :goto_1

    :cond_6
    const-string v2, "payment_method"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_1

    :cond_7
    const/4 v0, 0x1

    invoke-static {v0, p1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_b

    const/4 v1, 0x2

    invoke-static {v1, p1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz p1, :cond_8

    invoke-static {p1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result p1

    if-ne p1, v0, :cond_8

    goto :goto_0

    :cond_8
    move v0, v1

    :goto_0
    new-instance v1, Lq20/i0;

    invoke-direct {v1, v2, v0}, Lq20/i0;-><init>(Ljava/lang/String;Z)V

    goto :goto_1

    :cond_9
    const-string p1, "google_pay"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    goto :goto_1

    :cond_a
    if-eqz v3, :cond_b

    sget-object v1, Lq20/f0;->w:Lq20/f0;

    :cond_b
    :goto_1
    if-nez v1, :cond_c

    sget-object v1, Lq20/h0;->w:Lq20/h0;

    :cond_c
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
