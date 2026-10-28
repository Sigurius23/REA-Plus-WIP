.class public final Lb30/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lb30/j0;


# direct methods
.method public synthetic constructor <init>(Lb30/j0;I)V
    .locals 0

    iput p2, p0, Lb30/f0;->w:I

    iput-object p1, p0, Lb30/f0;->x:Lb30/j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lb30/f0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ll83/a0;

    iget-object p1, p0, Lb30/f0;->x:Lb30/j0;

    iget-object v0, p1, Lb30/j0;->l:Lq83/j;

    new-instance v1, La13/h;

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-direct {v1, p1, v2, v3}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0, v1, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_0
    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    iget-object p1, p0, Lb30/f0;->x:Lb30/j0;

    iget-object p1, p1, Lb30/j0;->q:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Lb30/b;

    const/4 v6, 0x0

    const/16 v7, 0x1df

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v7}, Lb30/b;->a(Lb30/b;Ljava/lang/String;Ls20/a;Ljava/util/List;Lq20/y;ZLt20/n;I)Lb30/b;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    move-object v4, p1

    check-cast v4, Lq20/y;

    iget-object p1, p0, Lb30/f0;->x:Lb30/j0;

    iget-object p1, p1, Lb30/j0;->q:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Lb30/b;

    const/4 v6, 0x0

    const/16 v7, 0x1ef

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lb30/b;->a(Lb30/b;Ljava/lang/String;Ls20/a;Ljava/util/List;Lq20/y;ZLt20/n;I)Lb30/b;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    iget-object p1, p0, Lb30/f0;->x:Lb30/j0;

    iget-object p2, p1, Lb30/j0;->d:La1/e;

    invoke-virtual {p2, v1}, La1/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    move-object v2, p2

    check-cast v2, Ls20/a;

    iget-object p2, p1, Lb30/j0;->e:La1/e;

    invoke-virtual {p2, v1}, La1/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    move-object v3, p2

    check-cast v3, Ljava/util/List;

    iget-object p2, p1, Lb30/j0;->j:Lq;

    invoke-virtual {p2, v1}, Lq;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    move-object v6, p2

    check-cast v6, Lt20/n;

    iget-object p1, p1, Lb30/j0;->q:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Lb30/b;

    const/4 v5, 0x0

    const/16 v7, 0xf2

    const/4 v4, 0x0

    invoke-static/range {v0 .. v7}, Lb30/b;->a(Lb30/b;Ljava/lang/String;Ls20/a;Ljava/util/List;Lq20/y;ZLt20/n;I)Lb30/b;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    check-cast p1, Lq20/y;

    iget-object p1, p0, Lb30/f0;->x:Lb30/j0;

    iget-object p1, p1, Lb30/j0;->f:Lb30/i0;

    invoke-virtual {p1}, Lb30/i0;->invoke()Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
