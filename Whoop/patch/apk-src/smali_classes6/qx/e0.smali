.class public final Lqx/e0;
.super Lqw/l;
.source "SourceFile"


# instance fields
.field public final synthetic F:I


# direct methods
.method public synthetic constructor <init>(Lqx/h0;I)V
    .locals 0

    iput p2, p0, Lqx/e0;->F:I

    invoke-direct {p0, p1}, Lqw/l;-><init>(Lqx/h0;)V

    return-void
.end method


# virtual methods
.method public next()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lqx/e0;->F:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Lqw/l;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-virtual {p0}, Lqw/l;->b()Lqx/g0;

    move-result-object v0

    iget-object v0, v0, Lqx/g0;->F:Ljava/lang/Object;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
