.class public final synthetic Lqi/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqi/v;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lqi/w;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lqi/w;II)V
    .locals 0

    iput p3, p0, Lqi/n;->a:I

    iput-object p1, p0, Lqi/n;->b:Lqi/w;

    iput p2, p0, Lqi/n;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lqi/n;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lqi/n;->b:Lqi/w;

    iget v1, p0, Lqi/n;->c:I

    invoke-virtual {v0, v1}, Lqi/w;->q(I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lqi/n;->b:Lqi/w;

    iget v1, p0, Lqi/n;->c:I

    invoke-virtual {v0, v1}, Lqi/w;->u(I)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lqi/n;->b:Lqi/w;

    iget v1, p0, Lqi/n;->c:I

    invoke-virtual {v0, v1}, Lqi/w;->r(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
