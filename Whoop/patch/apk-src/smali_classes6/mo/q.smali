.class public final synthetic Lmo/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ld1/j;


# direct methods
.method public synthetic constructor <init>(Ld1/j;IJ)V
    .locals 0

    .line 1
    const/4 p2, 0x0

    iput p2, p0, Lmo/q;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmo/q;->x:Ld1/j;

    return-void
.end method

.method public synthetic constructor <init>(Ld1/j;JI)V
    .locals 0

    .line 2
    const/4 p2, 0x6

    iput p2, p0, Lmo/q;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmo/q;->x:Ld1/j;

    return-void
.end method

.method public synthetic constructor <init>(Ld1/j;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p3, p0, Lmo/q;->w:I

    iput-object p1, p0, Lmo/q;->x:Ld1/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ld1/j;Ljava/lang/String;JJ)V
    .locals 0

    .line 4
    const/4 p2, 0x3

    iput p2, p0, Lmo/q;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmo/q;->x:Ld1/j;

    return-void
.end method

.method public synthetic constructor <init>(Ld1/j;Lrm/c0;Lum/d;)V
    .locals 0

    .line 5
    const/4 p2, 0x5

    iput p2, p0, Lmo/q;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmo/q;->x:Ld1/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget v0, p0, Lmo/q;->w:I

    iget-object v1, p0, Lmo/q;->x:Ld1/j;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Ld1/j;->y:Ljava/lang/Object;

    check-cast v0, Lrm/r;

    sget v1, Llo/y;->a:I

    iget-object v0, v0, Lrm/r;->w:Lrm/u;

    iget-object v0, v0, Lrm/u;->S:Lsm/d;

    iget-object v1, v0, Lsm/d;->z:La30/w0;

    iget-object v1, v1, La30/w0;->F:Ljava/lang/Object;

    check-cast v1, Lsn/v;

    invoke-virtual {v0, v1}, Lsm/d;->v(Lsn/v;)Lsm/a;

    move-result-object v1

    new-instance v2, Lsm/b;

    const/16 v3, 0x1c

    invoke-direct {v2, v3}, Lsm/b;-><init>(I)V

    const/16 v3, 0x3fd

    invoke-virtual {v0, v1, v3, v2}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void

    :pswitch_0
    iget-object v0, v1, Ld1/j;->y:Ljava/lang/Object;

    check-cast v0, Lrm/r;

    sget v1, Llo/y;->a:I

    iget-object v0, v0, Lrm/r;->w:Lrm/u;

    iget-object v0, v0, Lrm/u;->S:Lsm/d;

    invoke-virtual {v0}, Lsm/d;->y()Lsm/a;

    move-result-object v1

    new-instance v2, Lsm/b;

    const/16 v3, 0xc

    invoke-direct {v2, v3}, Lsm/b;-><init>(I)V

    const/16 v3, 0x3f9

    invoke-virtual {v0, v1, v3, v2}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void

    :pswitch_1
    iget-object v0, v1, Ld1/j;->y:Ljava/lang/Object;

    check-cast v0, Lrm/r;

    sget v1, Llo/y;->a:I

    iget-object v0, v0, Lrm/r;->w:Lrm/u;

    iget-object v0, v0, Lrm/u;->S:Lsm/d;

    invoke-virtual {v0}, Lsm/d;->y()Lsm/a;

    move-result-object v1

    new-instance v2, Lsm/b;

    const/16 v3, 0xd

    invoke-direct {v2, v3}, Lsm/b;-><init>(I)V

    const/16 v3, 0x3f7

    invoke-virtual {v0, v1, v3, v2}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void

    :pswitch_2
    iget-object v0, v1, Ld1/j;->y:Ljava/lang/Object;

    check-cast v0, Lrm/r;

    sget v1, Llo/y;->a:I

    iget-object v0, v0, Lrm/r;->w:Lrm/u;

    iget-object v0, v0, Lrm/u;->S:Lsm/d;

    invoke-virtual {v0}, Lsm/d;->y()Lsm/a;

    move-result-object v1

    new-instance v2, Lsm/b;

    const/16 v3, 0xf

    invoke-direct {v2, v3}, Lsm/b;-><init>(I)V

    const/16 v3, 0x3f8

    invoke-virtual {v0, v1, v3, v2}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void

    :pswitch_3
    iget-object v0, v1, Ld1/j;->y:Ljava/lang/Object;

    check-cast v0, Lrm/r;

    sget v1, Llo/y;->a:I

    iget-object v0, v0, Lrm/r;->w:Lrm/u;

    iget-object v0, v0, Lrm/u;->S:Lsm/d;

    invoke-virtual {v0}, Lsm/d;->y()Lsm/a;

    move-result-object v1

    new-instance v2, Lsm/c;

    const/16 v3, 0x13

    invoke-direct {v2, v3}, Lsm/c;-><init>(I)V

    const/16 v3, 0x406

    invoke-virtual {v0, v1, v3, v2}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void

    :pswitch_4
    iget-object v0, v1, Ld1/j;->y:Ljava/lang/Object;

    check-cast v0, Lrm/r;

    sget v1, Llo/y;->a:I

    iget-object v0, v0, Lrm/r;->w:Lrm/u;

    iget-object v0, v0, Lrm/u;->S:Lsm/d;

    invoke-virtual {v0}, Lsm/d;->y()Lsm/a;

    move-result-object v1

    new-instance v2, Lsm/c;

    const/16 v3, 0x8

    invoke-direct {v2, v3}, Lsm/c;-><init>(I)V

    const/16 v3, 0x3fb

    invoke-virtual {v0, v1, v3, v2}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void

    :pswitch_5
    iget-object v0, v1, Ld1/j;->y:Ljava/lang/Object;

    check-cast v0, Lrm/r;

    sget v1, Llo/y;->a:I

    iget-object v0, v0, Lrm/r;->w:Lrm/u;

    iget-object v0, v0, Lrm/u;->S:Lsm/d;

    iget-object v1, v0, Lsm/d;->z:La30/w0;

    iget-object v1, v1, La30/w0;->F:Ljava/lang/Object;

    check-cast v1, Lsn/v;

    invoke-virtual {v0, v1}, Lsm/d;->v(Lsn/v;)Lsm/a;

    move-result-object v1

    new-instance v2, Lsm/b;

    const/16 v3, 0x18

    invoke-direct {v2, v3}, Lsm/b;-><init>(I)V

    const/16 v3, 0x3fa

    invoke-virtual {v0, v1, v3, v2}, Lsm/d;->z(Lsm/a;ILlo/h;)V

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
