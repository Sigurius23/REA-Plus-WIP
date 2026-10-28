.class public final synthetic Lsl0/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(ILp1/c1;)V
    .locals 0

    iput p1, p0, Lsl0/b1;->w:I

    iput-object p2, p0, Lsl0/b1;->x:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lsl0/b1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsl0/b1;->x:Lp1/c1;

    invoke-static {v0}, Lsl0/i3;->b(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lsl0/b1;->x:Lp1/c1;

    invoke-static {v0}, Lsl0/g3;->m(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lsl0/b1;->x:Lp1/c1;

    invoke-static {v0}, Lsl0/g3;->i(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lsl0/b1;->x:Lp1/c1;

    invoke-static {v0}, Lsl0/g3;->c(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lsl0/b1;->x:Lp1/c1;

    invoke-static {v0}, Lsl0/u2;->o(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lsl0/b1;->x:Lp1/c1;

    invoke-static {v0}, Lsl0/u2;->j(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lsl0/b1;->x:Lp1/c1;

    invoke-static {v0}, Lsl0/g1;->l(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lsl0/b1;->x:Lp1/c1;

    invoke-static {v0}, Lsl0/g1;->i(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lsl0/b1;->x:Lp1/c1;

    invoke-static {v0}, Lsl0/c1;->a(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, p0, Lsl0/b1;->x:Lp1/c1;

    invoke-static {v0}, Lsl0/c1;->i(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    iget-object v0, p0, Lsl0/b1;->x:Lp1/c1;

    invoke-static {v0}, Lsl0/c1;->d(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
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
