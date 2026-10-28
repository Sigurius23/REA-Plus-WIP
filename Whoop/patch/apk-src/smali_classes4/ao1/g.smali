.class public final synthetic Lao1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lxf3/c;


# direct methods
.method public synthetic constructor <init>(Lxf3/c;I)V
    .locals 0

    iput p2, p0, Lao1/g;->w:I

    iput-object p1, p0, Lao1/g;->x:Lxf3/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lao1/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lao1/g;->x:Lxf3/c;

    invoke-static {v0}, Lpf1/a;->f(Lxf3/c;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lao1/g;->x:Lxf3/c;

    invoke-static {v0}, Lon1/b;->e(Lxf3/c;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lao1/g;->x:Lxf3/c;

    invoke-static {v0}, Lnd1/c;->e(Lxf3/c;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lao1/g;->x:Lxf3/c;

    invoke-static {v0}, Lhl1/h;->S(Lxf3/c;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lao1/g;->x:Lxf3/c;

    invoke-static {v0}, Lfq0/b;->p(Lxf3/c;)Ldq0/b;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lao1/g;->x:Lxf3/c;

    invoke-static {v0}, Lfq0/b;->l(Lxf3/c;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lao1/g;->x:Lxf3/c;

    invoke-static {v0}, Les1/a;->h(Lxf3/c;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lao1/g;->x:Lxf3/c;

    invoke-static {v0}, Lao1/j;->b(Lxf3/c;)Lmo1/d;

    move-result-object v0

    return-object v0

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
