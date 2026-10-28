.class public final synthetic Lr9/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lxl/a;


# direct methods
.method public synthetic constructor <init>(Lxl/a;IJ)V
    .locals 0

    .line 1
    const/4 p2, 0x3

    iput p2, p0, Lr9/q;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr9/q;->x:Lxl/a;

    return-void
.end method

.method public synthetic constructor <init>(Lxl/a;JI)V
    .locals 0

    .line 2
    const/4 p2, 0x4

    iput p2, p0, Lr9/q;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr9/q;->x:Lxl/a;

    return-void
.end method

.method public synthetic constructor <init>(Lxl/a;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p3, p0, Lr9/q;->w:I

    iput-object p1, p0, Lr9/q;->x:Lxl/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lxl/a;Ljava/lang/String;JJ)V
    .locals 0

    .line 4
    const/4 p2, 0x0

    iput p2, p0, Lr9/q;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr9/q;->x:Lxl/a;

    return-void
.end method

.method public synthetic constructor <init>(Lxl/a;Lu8/p;Lb9/h;)V
    .locals 0

    .line 5
    const/4 p2, 0x6

    iput p2, p0, Lr9/q;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr9/q;->x:Lxl/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget v0, p0, Lr9/q;->w:I

    iget-object v1, p0, Lr9/q;->x:Lxl/a;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Lxl/a;->y:Ljava/lang/Object;

    check-cast v0, Lb9/c0;

    sget v1, Lx8/t;->a:I

    iget-object v0, v0, Lb9/c0;->w:Lb9/f0;

    iget-object v0, v0, Lb9/f0;->T:Lc9/h;

    invoke-virtual {v0}, Lc9/h;->k()Lc9/a;

    move-result-object v1

    new-instance v2, Lc9/d;

    const/16 v3, 0x11

    invoke-direct {v2, v3}, Lc9/d;-><init>(I)V

    const/16 v3, 0x3f9

    invoke-virtual {v0, v1, v3, v2}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void

    :pswitch_0
    iget-object v0, v1, Lxl/a;->y:Ljava/lang/Object;

    check-cast v0, Lb9/c0;

    sget v1, Lx8/t;->a:I

    iget-object v0, v0, Lb9/c0;->w:Lb9/f0;

    iget-object v0, v0, Lb9/f0;->T:Lc9/h;

    invoke-virtual {v0}, Lc9/h;->k()Lc9/a;

    move-result-object v1

    new-instance v2, Lc9/d;

    const/16 v3, 0x16

    invoke-direct {v2, v3}, Lc9/d;-><init>(I)V

    const/16 v3, 0x3f7

    invoke-virtual {v0, v1, v3, v2}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void

    :pswitch_1
    iget-object v0, v1, Lxl/a;->y:Ljava/lang/Object;

    check-cast v0, Lb9/c0;

    sget v1, Lx8/t;->a:I

    iget-object v0, v0, Lb9/c0;->w:Lb9/f0;

    iget-object v0, v0, Lb9/f0;->T:Lc9/h;

    iget-object v1, v0, Lc9/h;->z:La30/w0;

    iget-object v1, v1, La30/w0;->F:Ljava/lang/Object;

    check-cast v1, Ll9/c0;

    invoke-virtual {v0, v1}, Lc9/h;->h(Ll9/c0;)Lc9/a;

    move-result-object v1

    new-instance v2, Lc9/d;

    const/16 v3, 0xd

    invoke-direct {v2, v3}, Lc9/d;-><init>(I)V

    const/16 v3, 0x3fd

    invoke-virtual {v0, v1, v3, v2}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void

    :pswitch_2
    iget-object v0, v1, Lxl/a;->y:Ljava/lang/Object;

    check-cast v0, Lb9/c0;

    sget v1, Lx8/t;->a:I

    iget-object v0, v0, Lb9/c0;->w:Lb9/f0;

    iget-object v0, v0, Lb9/f0;->T:Lc9/h;

    iget-object v1, v0, Lc9/h;->z:La30/w0;

    iget-object v1, v1, La30/w0;->F:Ljava/lang/Object;

    check-cast v1, Ll9/c0;

    invoke-virtual {v0, v1}, Lc9/h;->h(Ll9/c0;)Lc9/a;

    move-result-object v1

    new-instance v2, Lc9/d;

    const/16 v3, 0xc

    invoke-direct {v2, v3}, Lc9/d;-><init>(I)V

    const/16 v3, 0x3fa

    invoke-virtual {v0, v1, v3, v2}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void

    :pswitch_3
    iget-object v0, v1, Lxl/a;->y:Ljava/lang/Object;

    check-cast v0, Lb9/c0;

    sget v1, Lx8/t;->a:I

    iget-object v0, v0, Lb9/c0;->w:Lb9/f0;

    iget-object v0, v0, Lb9/f0;->T:Lc9/h;

    invoke-virtual {v0}, Lc9/h;->k()Lc9/a;

    move-result-object v1

    new-instance v2, Lab/a;

    const/16 v3, 0x15

    invoke-direct {v2, v3}, Lab/a;-><init>(I)V

    const/16 v3, 0x3fb

    invoke-virtual {v0, v1, v3, v2}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void

    :pswitch_4
    iget-object v0, v1, Lxl/a;->y:Ljava/lang/Object;

    check-cast v0, Lb9/c0;

    sget v1, Lx8/t;->a:I

    iget-object v0, v0, Lb9/c0;->w:Lb9/f0;

    iget-object v0, v0, Lb9/f0;->T:Lc9/h;

    invoke-virtual {v0}, Lc9/h;->k()Lc9/a;

    move-result-object v1

    new-instance v2, Lc9/g;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Lc9/g;-><init>(I)V

    const/16 v3, 0x406

    invoke-virtual {v0, v1, v3, v2}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void

    :pswitch_5
    iget-object v0, v1, Lxl/a;->y:Ljava/lang/Object;

    check-cast v0, Lb9/c0;

    sget v1, Lx8/t;->a:I

    iget-object v0, v0, Lb9/c0;->w:Lb9/f0;

    iget-object v0, v0, Lb9/f0;->T:Lc9/h;

    invoke-virtual {v0}, Lc9/h;->k()Lc9/a;

    move-result-object v1

    new-instance v2, Lc9/d;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Lc9/d;-><init>(I)V

    const/16 v3, 0x3f8

    invoke-virtual {v0, v1, v3, v2}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
