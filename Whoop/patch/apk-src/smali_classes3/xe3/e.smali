.class public final Lxe3/e;
.super Lcf3/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Laf3/a;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, Lxe3/e;->a:I

    packed-switch p1, :pswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Laf3/g;

    invoke-direct {p1}, Laf3/t;-><init>()V

    iput-object p1, p0, Lxe3/e;->b:Laf3/a;

    return-void

    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Laf3/b0;

    invoke-direct {p1}, Laf3/t;-><init>()V

    iput-object p1, p0, Lxe3/e;->b:Laf3/a;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method private final j(Lbf3/d;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public a(Lbf3/d;)V
    .locals 0

    iget p1, p0, Lxe3/e;->a:I

    return-void
.end method

.method public c(Laf3/a;)Z
    .locals 1

    iget v0, p0, Lxe3/e;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Lcf3/a;->c(Laf3/a;)Z

    move-result p1

    return p1

    :pswitch_0
    const/4 p1, 0x1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final f()Laf3/a;
    .locals 1

    iget v0, p0, Lxe3/e;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lxe3/e;->b:Laf3/a;

    check-cast v0, Laf3/b0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lxe3/e;->b:Laf3/a;

    check-cast v0, Laf3/g;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public g()Z
    .locals 1

    iget v0, p0, Lxe3/e;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Lcf3/a;->g()Z

    move-result v0

    return v0

    :pswitch_0
    const/4 v0, 0x1

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Lxe3/g;)Lha/h;
    .locals 1

    iget v0, p0, Lxe3/e;->a:I

    packed-switch v0, :pswitch_data_0

    const/4 p1, 0x0

    return-object p1

    :pswitch_0
    iget p1, p1, Lxe3/g;->c:I

    invoke-static {p1}, Lha/h;->a(I)Lha/h;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
