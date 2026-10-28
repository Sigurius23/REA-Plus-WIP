.class public final synthetic Lf1/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lf1/w0;


# direct methods
.method public synthetic constructor <init>(Lf1/w0;I)V
    .locals 0

    iput p2, p0, Lf1/c0;->w:I

    iput-object p1, p0, Lf1/c0;->x:Lf1/w0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lf1/c0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-object p1, p0, Lf1/c0;->x:Lf1/w0;

    iget-object v2, p1, Lf1/w0;->a:Lf1/b1;

    invoke-virtual {v2}, Lf1/b1;->a()La0/k0;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, La0/k0;->b(J)Z

    move-result v0

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lf1/w0;->m:Lp1/k1;

    invoke-virtual {v0, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lf1/w0;->n()V

    invoke-virtual {p1}, Lf1/w0;->p()V

    :cond_0
    return-object v1

    :pswitch_0
    iget-object v0, p0, Lf1/c0;->x:Lf1/w0;

    check-cast p1, Lf1/u;

    invoke-virtual {v0, p1}, Lf1/w0;->m(Lf1/u;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lf1/c0;->x:Lf1/w0;

    invoke-virtual {v0, p1}, Lf1/w0;->l(Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lf1/c0;->x:Lf1/w0;

    iget-object v1, v0, Lf1/w0;->i:Lp1/k1;

    check-cast p1, Lg2/v;

    check-cast p1, Lg2/w;

    invoke-virtual {p1}, Lg2/w;->a()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Lf1/w0;->j()V

    :cond_1
    invoke-virtual {p1}, Lg2/w;->a()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v1, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    check-cast p1, Ly2/y;

    iget-object v0, p0, Lf1/c0;->x:Lf1/w0;

    iput-object p1, v0, Lf1/w0;->l:Ly2/y;

    iget-object v1, v0, Lf1/w0;->i:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Lf1/w0;->g()Lf1/u;

    move-result-object v1

    if-eqz v1, :cond_3

    if-eqz p1, :cond_2

    const-wide/16 v1, 0x0

    invoke-interface {p1, v1, v2}, Ly2/y;->E(J)J

    move-result-wide v1

    new-instance p1, Lh2/b;

    invoke-direct {p1, v1, v2}, Lh2/b;-><init>(J)V

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    iget-object v1, v0, Lf1/w0;->k:Lh2/b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iput-object p1, v0, Lf1/w0;->k:Lh2/b;

    invoke-virtual {v0}, Lf1/w0;->n()V

    invoke-virtual {v0}, Lf1/w0;->p()V

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_4
    check-cast p1, Ly2/y;

    iget-object v0, p0, Lf1/c0;->x:Lf1/w0;

    iget-object v1, v0, Lf1/w0;->j:Lp1/f0;

    invoke-virtual {v1}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh2/c;

    if-nez v1, :cond_4

    const/4 p1, 0x0

    goto :goto_1

    :cond_4
    iget-object v0, v0, Lf1/w0;->l:Ly2/y;

    if-eqz v0, :cond_5

    invoke-static {v1, v0, p1}, Landroidx/compose/foundation/text/contextmenu/modifier/a;->d(Lh2/c;Ly2/y;Ly2/y;)Lh2/c;

    move-result-object p1

    :goto_1
    return-object p1

    :cond_5
    const-string p1, "Required value was null."

    invoke-static {p1}, Lk0/a;->d(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :pswitch_5
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-object p1, p0, Lf1/c0;->x:Lf1/w0;

    invoke-virtual {p1}, Lf1/w0;->g()Lf1/u;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_6

    iget-object v2, v2, Lf1/u;->a:Lf1/t;

    if-eqz v2, :cond_6

    iget-wide v4, v2, Lf1/t;->c:J

    cmp-long v2, v0, v4

    if-nez v2, :cond_6

    iget-object v2, p1, Lf1/w0;->p:Lp1/k1;

    invoke-virtual {v2, v3}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_6
    invoke-virtual {p1}, Lf1/w0;->g()Lf1/u;

    move-result-object v2

    if-eqz v2, :cond_7

    iget-object v2, v2, Lf1/u;->b:Lf1/t;

    if-eqz v2, :cond_7

    iget-wide v4, v2, Lf1/t;->c:J

    cmp-long v2, v0, v4

    if-nez v2, :cond_7

    iget-object v2, p1, Lf1/w0;->q:Lp1/k1;

    invoke-virtual {v2, v3}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_7
    iget-object v2, p1, Lf1/w0;->a:Lf1/b1;

    invoke-virtual {v2}, Lf1/b1;->a()La0/k0;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, La0/k0;->b(J)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p1}, Lf1/w0;->p()V

    :cond_8
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_6
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-object p1, p0, Lf1/c0;->x:Lf1/w0;

    iget-object v2, p1, Lf1/w0;->a:Lf1/b1;

    invoke-virtual {v2}, Lf1/b1;->a()La0/k0;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, La0/k0;->b(J)Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p1}, Lf1/w0;->j()V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lf1/w0;->m(Lf1/u;)V

    :cond_9
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_7
    check-cast p1, Lp1/i0;

    new-instance p1, Lb1/e;

    const/4 v0, 0x4

    iget-object v1, p0, Lf1/c0;->x:Lf1/w0;

    invoke-direct {p1, v1, v0}, Lb1/e;-><init>(Ljava/lang/Object;I)V

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
