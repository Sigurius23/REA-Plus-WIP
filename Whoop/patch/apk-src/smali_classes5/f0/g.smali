.class public final Lf0/g;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lf0/h;


# direct methods
.method public synthetic constructor <init>(Lf0/h;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lf0/g;->w:I

    iput-object p1, p0, Lf0/g;->x:Lf0/h;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Lf0/g;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lf0/g;

    iget-object v0, p0, Lf0/g;->x:Lf0/h;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Lf0/g;-><init>(Lf0/h;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lf0/g;

    iget-object v0, p0, Lf0/g;->x:Lf0/h;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Lf0/g;-><init>(Lf0/h;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lf0/g;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lf0/g;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf0/g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf0/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lf0/g;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf0/g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf0/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lf0/g;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    const/4 v2, 0x3

    const/4 v3, 0x0

    iget-object v4, p0, Lf0/g;->x:Lf0/h;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v4, Lf0/h;->c0:Lj0/f;

    if-eqz p1, :cond_1

    new-instance v0, Lj0/g;

    invoke-direct {v0, p1}, Lj0/g;-><init>(Lj0/f;)V

    iget-object p1, v4, Lf0/h;->Q:Lj0/i;

    if-eqz p1, :cond_0

    invoke-virtual {v4}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v5

    new-instance v6, Ld30/o;

    const/16 v7, 0xa

    invoke-direct {v6, p1, v0, v3, v7}, Ld30/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v5, v3, v3, v6, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_0
    iput-object v3, v4, Lf0/h;->c0:Lj0/f;

    :cond_1
    return-object v1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v4, Lf0/h;->c0:Lj0/f;

    if-nez p1, :cond_3

    new-instance p1, Lj0/f;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iget-object v0, v4, Lf0/h;->Q:Lj0/i;

    if-eqz v0, :cond_2

    invoke-virtual {v4}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v5

    new-instance v6, Ld30/o;

    const/16 v7, 0x9

    invoke-direct {v6, v0, p1, v3, v7}, Ld30/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v5, v3, v3, v6, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_2
    iput-object p1, v4, Lf0/h;->c0:Lj0/f;

    :cond_3
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
