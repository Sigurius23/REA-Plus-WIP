.class public final synthetic Liq0/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo23/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Liq0/m;

.field public final synthetic y:Lio/getstream/chat/android/models/Message;


# direct methods
.method public synthetic constructor <init>(Liq0/m;Lio/getstream/chat/android/models/Message;I)V
    .locals 0

    iput p3, p0, Liq0/p;->w:I

    iput-object p1, p0, Liq0/p;->x:Liq0/m;

    iput-object p2, p0, Liq0/p;->y:Lio/getstream/chat/android/models/Message;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onResult(Ln23/h;)V
    .locals 2

    iget v0, p0, Liq0/p;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Liq0/p;->x:Liq0/m;

    iget-object v1, p0, Liq0/p;->y:Lio/getstream/chat/android/models/Message;

    invoke-static {v0, v1, p1}, Liq0/m;->z(Liq0/m;Lio/getstream/chat/android/models/Message;Ln23/h;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Liq0/p;->x:Liq0/m;

    iget-object v1, p0, Liq0/p;->y:Lio/getstream/chat/android/models/Message;

    invoke-static {v0, v1, p1}, Liq0/m;->E(Liq0/m;Lio/getstream/chat/android/models/Message;Ln23/h;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Liq0/p;->x:Liq0/m;

    iget-object v1, p0, Liq0/p;->y:Lio/getstream/chat/android/models/Message;

    invoke-static {v0, v1, p1}, Liq0/m$o;->f(Liq0/m;Lio/getstream/chat/android/models/Message;Ln23/h;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
