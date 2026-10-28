.class public final Ln20/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Ln20/c;->a:I

    iput-object p1, p0, Ln20/c;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ln10/n0;
    .locals 4

    iget v0, p0, Ln20/c;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ln10/n0;

    iget-object v1, p0, Ln20/c;->b:Ljava/lang/Object;

    check-cast v1, Lt10/b;

    const/4 v2, 0x4

    invoke-direct {v0, v2}, Ln10/n0;-><init>(I)V

    iget-object v1, v1, Lt10/b;->d0:Lv03/h;

    new-instance v2, Lp20/i;

    const/16 v3, 0xc

    invoke-direct {v2, v1, v3}, Lp20/i;-><init>(Lv03/h;I)V

    invoke-static {v2}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v1

    iput-object v1, v0, Ln10/n0;->b:Lv03/h;

    return-object v0

    :pswitch_0
    new-instance v0, Ln10/n0;

    iget-object v1, p0, Ln20/c;->b:Ljava/lang/Object;

    check-cast v1, Lp20/h;

    const/4 v2, 0x3

    invoke-direct {v0, v2}, Ln10/n0;-><init>(I)V

    iget-object v1, v1, Lp20/h;->m0:Lv03/h;

    new-instance v2, Lp20/i;

    const/16 v3, 0xc

    invoke-direct {v2, v1, v3}, Lp20/i;-><init>(Lv03/h;I)V

    invoke-static {v2}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v1

    iput-object v1, v0, Ln10/n0;->b:Lv03/h;

    return-object v0

    :pswitch_1
    new-instance v0, Ln10/n0;

    iget-object v1, p0, Ln20/c;->b:Ljava/lang/Object;

    check-cast v1, Lp20/f;

    const/4 v2, 0x2

    invoke-direct {v0, v2}, Ln10/n0;-><init>(I)V

    iget-object v1, v1, Lp20/f;->F:Lv03/h;

    new-instance v2, Lp20/i;

    const/16 v3, 0xc

    invoke-direct {v2, v1, v3}, Lp20/i;-><init>(Lv03/h;I)V

    invoke-static {v2}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v1

    iput-object v1, v0, Ln10/n0;->b:Lv03/h;

    return-object v0

    :pswitch_2
    new-instance v0, Ln10/n0;

    iget-object v1, p0, Ln20/c;->b:Ljava/lang/Object;

    check-cast v1, Ln20/b;

    const/4 v2, 0x1

    invoke-direct {v0, v2}, Ln10/n0;-><init>(I)V

    iget-object v1, v1, Ln20/b;->f0:Lv03/h;

    new-instance v2, Lp20/i;

    const/16 v3, 0xc

    invoke-direct {v2, v1, v3}, Lp20/i;-><init>(Lv03/h;I)V

    invoke-static {v2}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v1

    iput-object v1, v0, Ln10/n0;->b:Lv03/h;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
