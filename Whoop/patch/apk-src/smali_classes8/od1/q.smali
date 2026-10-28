.class public final synthetic Lod1/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/b;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Llh3/b;


# direct methods
.method public synthetic constructor <init>(Llh3/b;I)V
    .locals 0

    iput p2, p0, Lod1/q;->w:I

    iput-object p1, p0, Lod1/q;->x:Llh3/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lod1/q;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lod1/q;->x:Llh3/b;

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {v0, p1}, Llh3/b;->onError(Ljava/lang/Throwable;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lod1/q;->x:Llh3/b;

    check-cast p1, Lcom/whoop/service/network/model/SportList;

    invoke-virtual {v0, p1}, Llh3/b;->onNext(Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
