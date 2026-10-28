.class public final Lpj/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/h0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La3/z0;


# direct methods
.method public synthetic constructor <init>(La3/z0;I)V
    .locals 0

    iput p2, p0, Lpj/w;->a:I

    iput-object p1, p0, Lpj/w;->b:La3/z0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 1

    iget v0, p0, Lpj/w;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpj/w;->b:La3/z0;

    invoke-virtual {v0}, La3/z0;->invoke()Ljava/lang/Object;

    return-void

    :pswitch_0
    iget-object v0, p0, Lpj/w;->b:La3/z0;

    invoke-virtual {v0}, La3/z0;->invoke()Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
