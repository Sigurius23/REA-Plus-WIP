.class public final Lbc3/t0;
.super Lbc3/m1;
.source "SourceFile"


# instance fields
.field public final synthetic E:I

.field public final F:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lbc3/t0;->E:I

    invoke-direct {p0}, Lhc3/k;-><init>()V

    iput-object p1, p0, Lbc3/t0;->F:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final i()Z
    .locals 1

    iget v0, p0, Lbc3/t0;->E:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return v0

    :pswitch_0
    const/4 v0, 0x0

    return v0

    :pswitch_1
    const/4 v0, 0x0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final j(Ljava/lang/Throwable;)V
    .locals 2

    iget v0, p0, Lbc3/t0;->E:I

    packed-switch v0, :pswitch_data_0

    iget-object p1, p0, Lbc3/t0;->F:Ljava/lang/Object;

    check-cast p1, Lbc3/n1;

    invoke-virtual {p0}, Lbc3/m1;->h()Lbc3/t1;

    move-result-object v0

    sget-object v1, Lbc3/t1;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lbc3/w;

    if-eqz v1, :cond_0

    check-cast v0, Lbc3/w;

    iget-object v0, v0, Lbc3/w;->a:Ljava/lang/Throwable;

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    invoke-virtual {p1, v0}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lbc3/f0;->I(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lbc3/t0;->F:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_1
    iget-object p1, p0, Lbc3/t0;->F:Ljava/lang/Object;

    check-cast p1, Lbc3/s0;

    invoke-interface {p1}, Lbc3/s0;->dispose()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
