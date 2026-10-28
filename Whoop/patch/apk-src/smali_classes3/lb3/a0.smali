.class public final Llb3/a0;
.super Llb3/n;
.source "SourceFile"


# instance fields
.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(Llb3/c0;I)V
    .locals 0

    iput p2, p0, Llb3/a0;->y:I

    invoke-direct {p0, p1}, Llb3/n;-><init>(Llb3/c0;)V

    return-void
.end method


# virtual methods
.method public final k0()Z
    .locals 1

    iget v0, p0, Llb3/a0;->y:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x1

    return v0

    :pswitch_0
    const/4 v0, 0x0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final y0(Llb3/c0;)Llb3/m;
    .locals 2

    iget v0, p0, Llb3/a0;->y:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Llb3/a0;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Llb3/a0;-><init>(Llb3/c0;I)V

    return-object v0

    :pswitch_0
    new-instance v0, Llb3/a0;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Llb3/a0;-><init>(Llb3/c0;I)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
