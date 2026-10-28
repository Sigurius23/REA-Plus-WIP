.class public final synthetic Ltm/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lq3/i;


# direct methods
.method public synthetic constructor <init>(Lq3/i;IJJ)V
    .locals 0

    .line 1
    const/4 p2, 0x1

    iput p2, p0, Ltm/i;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltm/i;->x:Lq3/i;

    return-void
.end method

.method public synthetic constructor <init>(Lq3/i;J)V
    .locals 0

    .line 2
    const/4 p2, 0x4

    iput p2, p0, Ltm/i;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltm/i;->x:Lq3/i;

    return-void
.end method

.method public synthetic constructor <init>(Lq3/i;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p3, p0, Ltm/i;->w:I

    iput-object p1, p0, Ltm/i;->x:Lq3/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lq3/i;Ljava/lang/String;JJ)V
    .locals 0

    .line 4
    const/4 p2, 0x2

    iput p2, p0, Ltm/i;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltm/i;->x:Lq3/i;

    return-void
.end method

.method public synthetic constructor <init>(Lq3/i;Lrm/c0;Lum/d;)V
    .locals 0

    .line 5
    const/4 p2, 0x6

    iput p2, p0, Ltm/i;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltm/i;->x:Lq3/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget v0, p0, Ltm/i;->w:I

    const/16 v1, 0x14

    const/16 v2, 0x16

    iget-object v3, p0, Ltm/i;->x:Lq3/i;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v3, Lq3/i;->x:Ljava/lang/Object;

    check-cast v0, Lrm/r;

    sget v1, Llo/y;->a:I

    iget-object v0, v0, Lrm/r;->w:Lrm/u;

    iget-object v0, v0, Lrm/u;->S:Lsm/d;

    invoke-virtual {v0}, Lsm/d;->y()Lsm/a;

    move-result-object v1

    new-instance v2, Lsm/b;

    const/16 v3, 0x1b

    invoke-direct {v2, v3}, Lsm/b;-><init>(I)V

    const/16 v3, 0x3f6

    invoke-virtual {v0, v1, v3, v2}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void

    :pswitch_0
    iget-object v0, v3, Lq3/i;->x:Ljava/lang/Object;

    check-cast v0, Lrm/r;

    sget v1, Llo/y;->a:I

    iget-object v0, v0, Lrm/r;->w:Lrm/u;

    iget-object v0, v0, Lrm/u;->S:Lsm/d;

    invoke-virtual {v0}, Lsm/d;->y()Lsm/a;

    move-result-object v1

    new-instance v2, Lsm/c;

    const/16 v3, 0x15

    invoke-direct {v2, v3}, Lsm/c;-><init>(I)V

    const/16 v3, 0x3f1

    invoke-virtual {v0, v1, v3, v2}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void

    :pswitch_1
    iget-object v0, v3, Lq3/i;->x:Ljava/lang/Object;

    check-cast v0, Lrm/r;

    sget v1, Llo/y;->a:I

    iget-object v0, v0, Lrm/r;->w:Lrm/u;

    iget-object v0, v0, Lrm/u;->S:Lsm/d;

    invoke-virtual {v0}, Lsm/d;->y()Lsm/a;

    move-result-object v1

    new-instance v2, Lsm/c;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Lsm/c;-><init>(I)V

    const/16 v3, 0x3ef

    invoke-virtual {v0, v1, v3, v2}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void

    :pswitch_2
    iget-object v0, v3, Lq3/i;->x:Ljava/lang/Object;

    check-cast v0, Lrm/r;

    sget v1, Llo/y;->a:I

    iget-object v0, v0, Lrm/r;->w:Lrm/u;

    iget-object v0, v0, Lrm/u;->S:Lsm/d;

    invoke-virtual {v0}, Lsm/d;->y()Lsm/a;

    move-result-object v1

    new-instance v3, Lsm/b;

    invoke-direct {v3, v2}, Lsm/b;-><init>(I)V

    const/16 v2, 0x3f2

    invoke-virtual {v0, v1, v2, v3}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void

    :pswitch_3
    iget-object v0, v3, Lq3/i;->x:Ljava/lang/Object;

    check-cast v0, Lrm/r;

    sget v2, Llo/y;->a:I

    iget-object v0, v0, Lrm/r;->w:Lrm/u;

    iget-object v0, v0, Lrm/u;->S:Lsm/d;

    invoke-virtual {v0}, Lsm/d;->y()Lsm/a;

    move-result-object v2

    new-instance v3, Lsm/c;

    invoke-direct {v3, v1}, Lsm/c;-><init>(I)V

    const/16 v1, 0x405

    invoke-virtual {v0, v2, v1, v3}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void

    :pswitch_4
    iget-object v0, v3, Lq3/i;->x:Ljava/lang/Object;

    check-cast v0, Lrm/r;

    sget v1, Llo/y;->a:I

    iget-object v0, v0, Lrm/r;->w:Lrm/u;

    iget-object v0, v0, Lrm/u;->S:Lsm/d;

    invoke-virtual {v0}, Lsm/d;->y()Lsm/a;

    move-result-object v1

    new-instance v2, Lqa/b;

    const/16 v3, 0x1d

    invoke-direct {v2, v3}, Lqa/b;-><init>(I)V

    const/16 v3, 0x3f0

    invoke-virtual {v0, v1, v3, v2}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void

    :pswitch_5
    iget-object v0, v3, Lq3/i;->x:Ljava/lang/Object;

    check-cast v0, Lrm/r;

    sget v1, Llo/y;->a:I

    iget-object v0, v0, Lrm/r;->w:Lrm/u;

    iget-object v0, v0, Lrm/u;->S:Lsm/d;

    invoke-virtual {v0}, Lsm/d;->y()Lsm/a;

    move-result-object v1

    new-instance v3, Lsm/c;

    invoke-direct {v3, v2}, Lsm/c;-><init>(I)V

    const/16 v2, 0x3f3

    invoke-virtual {v0, v1, v2, v3}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void

    :pswitch_6
    iget-object v0, v3, Lq3/i;->x:Ljava/lang/Object;

    check-cast v0, Lrm/r;

    sget v2, Llo/y;->a:I

    iget-object v0, v0, Lrm/r;->w:Lrm/u;

    iget-object v0, v0, Lrm/u;->S:Lsm/d;

    invoke-virtual {v0}, Lsm/d;->y()Lsm/a;

    move-result-object v2

    new-instance v3, Lsm/b;

    invoke-direct {v3, v1}, Lsm/b;-><init>(I)V

    const/16 v1, 0x3f4

    invoke-virtual {v0, v2, v1, v3}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void

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
