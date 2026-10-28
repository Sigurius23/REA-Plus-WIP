.class public final synthetic Le1/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ly2/j1;


# direct methods
.method public synthetic constructor <init>(Ly2/j1;I)V
    .locals 0

    iput p2, p0, Le1/m;->w:I

    iput-object p1, p0, Le1/m;->x:Ly2/j1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Le1/m;->w:I

    check-cast p1, Ly2/i1;

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    iget-object v1, p0, Le1/m;->x:Ly2/j1;

    invoke-static {v1, v0, v0, p1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    const/4 v0, 0x0

    iget-object v1, p0, Le1/m;->x:Ly2/j1;

    invoke-static {v1, v0, v0, p1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    goto :goto_0

    :pswitch_1
    invoke-virtual {p1}, Ly2/i1;->c()Ly3/m;

    move-result-object v0

    sget-object v1, Ly3/m;->w:Ly3/m;

    iget-object v2, p0, Le1/m;->x:Ly2/j1;

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Ly2/i1;->e()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Ly2/i1;->e()I

    move-result v0

    iget v1, v2, Ly2/j1;->w:I

    sub-int/2addr v0, v1

    long-to-int v1, v3

    sub-int/2addr v0, v1

    int-to-long v3, v0

    const/16 v0, 0x20

    shl-long/2addr v3, v0

    int-to-long v0, v1

    const-wide v7, 0xffffffffL

    and-long/2addr v0, v7

    or-long/2addr v0, v3

    invoke-static {v2, p1}, Ly2/i1;->a(Ly2/j1;Ly2/i1;)V

    iget-wide v3, v2, Ly2/j1;->E:J

    invoke-static {v0, v1, v3, v4}, Ly3/j;->d(JJ)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1, v5, v6}, Ly2/j1;->o0(JFLkotlin/jvm/functions/Function1;)V

    goto :goto_2

    :cond_1
    :goto_1
    invoke-static {v2, p1}, Ly2/i1;->a(Ly2/j1;Ly2/i1;)V

    iget-wide v0, v2, Ly2/j1;->E:J

    invoke-static {v3, v4, v0, v1}, Ly3/j;->d(JJ)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1, v5, v6}, Ly2/j1;->o0(JFLkotlin/jvm/functions/Function1;)V

    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    const/4 v0, 0x0

    iget-object v1, p0, Le1/m;->x:Ly2/j1;

    invoke-static {v1, v0, v0, p1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    goto :goto_0

    :pswitch_3
    const/4 v0, 0x0

    iget-object v1, p0, Le1/m;->x:Ly2/j1;

    invoke-static {v1, v0, v0, p1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    goto :goto_0

    :pswitch_4
    const/4 v0, 0x0

    iget-object v1, p0, Le1/m;->x:Ly2/j1;

    invoke-static {v1, v0, v0, p1}, Ly2/i1;->g(Ly2/j1;IILy2/i1;)V

    goto :goto_0

    :pswitch_5
    const/4 v0, 0x0

    iget-object v1, p0, Le1/m;->x:Ly2/j1;

    invoke-static {v1, v0, v0, p1}, Ly2/i1;->g(Ly2/j1;IILy2/i1;)V

    goto :goto_0

    nop

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
