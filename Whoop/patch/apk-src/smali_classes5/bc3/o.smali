.class public final Lbc3/o;
.super Lbc3/m1;
.source "SourceFile"


# instance fields
.field public final synthetic E:I

.field public final F:Lbc3/m;


# direct methods
.method public synthetic constructor <init>(Lbc3/m;I)V
    .locals 0

    iput p2, p0, Lbc3/o;->E:I

    invoke-direct {p0}, Lhc3/k;-><init>()V

    iput-object p1, p0, Lbc3/o;->F:Lbc3/m;

    return-void
.end method


# virtual methods
.method public final i()Z
    .locals 1

    iget v0, p0, Lbc3/o;->E:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return v0

    :pswitch_0
    const/4 v0, 0x1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final j(Ljava/lang/Throwable;)V
    .locals 6

    iget p1, p0, Lbc3/o;->E:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Lbc3/o;->F:Lbc3/m;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    return-void

    :pswitch_0
    invoke-virtual {p0}, Lbc3/m1;->h()Lbc3/t1;

    move-result-object p1

    iget-object v0, p0, Lbc3/o;->F:Lbc3/m;

    invoke-virtual {v0, p1}, Lbc3/m;->q(Lbc3/t1;)Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {v0}, Lbc3/m;->x()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, v0, Lbc3/m;->z:Lq83/d;

    check-cast v1, Lhc3/f;

    sget-object v2, Lhc3/f;->H:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :goto_0
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lhc3/b;->c:Lhc3/x;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    :cond_1
    invoke-virtual {v2, v1, v4, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v4, :cond_1

    goto :goto_0

    :cond_3
    instance-of v4, v3, Ljava/lang/Throwable;

    if-eqz v4, :cond_4

    goto :goto_2

    :cond_4
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v3, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    :goto_1
    invoke-virtual {v0, p1}, Lbc3/m;->cancel(Ljava/lang/Throwable;)Z

    invoke-virtual {v0}, Lbc3/m;->x()Z

    move-result p1

    if-nez p1, :cond_5

    invoke-virtual {v0}, Lbc3/m;->o()V

    :cond_5
    :goto_2
    return-void

    :cond_6
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eq v4, v3, :cond_4

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
