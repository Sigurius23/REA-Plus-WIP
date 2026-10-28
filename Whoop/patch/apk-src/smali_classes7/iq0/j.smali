.class public final synthetic Liq0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo23/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Liq0/m;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Liq0/m;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Liq0/j;->w:I

    iput-object p1, p0, Liq0/j;->x:Liq0/m;

    iput-object p2, p0, Liq0/j;->y:Ljava/lang/Object;

    iput-object p3, p0, Liq0/j;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onResult(Ln23/h;)V
    .locals 3

    iget v0, p0, Liq0/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Liq0/j;->y:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/Message;

    iget-object v1, p0, Liq0/j;->z:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    iget-object v2, p0, Liq0/j;->x:Liq0/m;

    invoke-static {v2, v0, v1, p1}, Liq0/m$n;->i(Liq0/m;Lio/getstream/chat/android/models/Message;Lbc3/c0;Ln23/h;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Liq0/j;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Liq0/j;->z:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Liq0/j;->x:Liq0/m;

    invoke-static {v2, v0, v1, p1}, Liq0/m;->D(Liq0/m;Ljava/lang/String;Ljava/lang/String;Ln23/h;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Liq0/j;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Liq0/j;->z:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Liq0/j;->x:Liq0/m;

    invoke-static {v2, v0, v1, p1}, Liq0/m;->C(Liq0/m;Ljava/lang/String;Ljava/lang/String;Ln23/h;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
