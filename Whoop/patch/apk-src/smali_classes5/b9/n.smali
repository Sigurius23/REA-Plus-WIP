.class public final synthetic Lb9/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyr/i;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lb9/n;->w:I

    iput-object p1, p0, Lb9/n;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lb9/n;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb9/n;->x:Ljava/lang/Object;

    check-cast v0, Lb30/m;

    new-instance v1, Lsn/m0;

    iget-object v2, v0, Lb30/m;->x:Ljava/lang/Object;

    check-cast v2, Ld1/j;

    iget-object v0, v0, Lb30/m;->y:Ljava/lang/Object;

    check-cast v0, Lwm/g;

    invoke-direct {v1, v2, v0}, Lsn/m0;-><init>(Ld1/j;Lwm/g;)V

    return-object v1

    :pswitch_0
    iget-object v0, p0, Lb9/n;->x:Ljava/lang/Object;

    check-cast v0, Lrm/z;

    iget-boolean v0, v0, Lrm/z;->Y:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lb9/n;->x:Ljava/lang/Object;

    check-cast v0, Lio/m;

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lb9/n;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lb9/n;->x:Ljava/lang/Object;

    check-cast v0, Lb9/l0;

    iget-boolean v0, v0, Lb9/l0;->d0:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lb9/n;->x:Ljava/lang/Object;

    check-cast v0, Ll9/p;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
