.class public final Lb30/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lb30/q0;


# direct methods
.method public synthetic constructor <init>(Lb30/q0;I)V
    .locals 0

    iput p2, p0, Lb30/n0;->w:I

    iput-object p1, p0, Lb30/n0;->x:Lb30/q0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 8

    iget p2, p0, Lb30/n0;->w:I

    packed-switch p2, :pswitch_data_0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lb30/n0;->x:Lb30/q0;

    iget-object p2, p1, Lb30/q0;->l:Lb30/h0;

    iget-object p1, p1, Lb30/q0;->o:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p2, p1, v0}, Lb30/h0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    move-object v2, p1

    check-cast v2, Lh20/t0;

    iget-object p1, p0, Lb30/n0;->x:Lb30/q0;

    iget-object p2, p1, Lb30/q0;->p:Lec3/h2;

    :cond_1
    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lb30/p5;

    const/4 v6, 0x0

    const/16 v7, 0x3d

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lb30/p5;->a(Lb30/p5;Ljava/util/List;Lh20/t0;ZZZZI)Lb30/p5;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Lq20/y;

    iget-object p2, p0, Lb30/n0;->x:Lb30/q0;

    iget-object p2, p2, Lb30/q0;->o:Lec3/h2;

    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p2, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    :cond_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    iget-object p1, p0, Lb30/n0;->x:Lb30/q0;

    iget-object p2, p1, Lb30/q0;->p:Lec3/h2;

    :cond_3
    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lb30/p5;

    const/4 v6, 0x0

    const/16 v7, 0x37

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lb30/p5;->a(Lb30/p5;Ljava/util/List;Lh20/t0;ZZZZI)Lb30/p5;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    iget-object p1, p0, Lb30/n0;->x:Lb30/q0;

    iget-object p2, p1, Lb30/q0;->p:Lec3/h2;

    :cond_4
    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lb30/p5;

    const/4 v5, 0x0

    const/16 v7, 0x1f

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v7}, Lb30/p5;->a(Lb30/p5;Ljava/util/List;Lh20/t0;ZZZZI)Lb30/p5;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_4
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    iget-object p1, p0, Lb30/n0;->x:Lb30/q0;

    iget-object p2, p1, Lb30/q0;->p:Lec3/h2;

    :cond_5
    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lb30/p5;

    const/4 v6, 0x0

    const/16 v7, 0x2f

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v7}, Lb30/p5;->a(Lb30/p5;Ljava/util/List;Lh20/t0;ZZZZI)Lb30/p5;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_5
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    iget-object p1, p0, Lb30/n0;->x:Lb30/q0;

    iget-object p2, p1, Lb30/q0;->p:Lec3/h2;

    :cond_6
    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lb30/p5;

    const/4 v6, 0x0

    const/16 v7, 0x3b

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lb30/p5;->a(Lb30/p5;Ljava/util/List;Lh20/t0;ZZZZI)Lb30/p5;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_6
    move-object v1, p1

    check-cast v1, Ljava/util/List;

    iget-object p1, p0, Lb30/n0;->x:Lb30/q0;

    iget-object p1, p1, Lb30/q0;->p:Lec3/h2;

    :cond_7
    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Lb30/p5;

    const/4 v6, 0x0

    const/16 v7, 0x3e

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lb30/p5;->a(Lb30/p5;Ljava/util/List;Lh20/t0;ZZZZI)Lb30/p5;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_7

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
