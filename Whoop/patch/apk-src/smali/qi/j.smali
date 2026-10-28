.class public final synthetic Lqi/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqi/z;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicBoolean;I)V
    .locals 0

    iput p3, p0, Lqi/j;->a:I

    iput-object p1, p0, Lqi/j;->b:Ljava/lang/String;

    iput-object p2, p0, Lqi/j;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onResult(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Lqi/j;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Throwable;

    sget-object p1, Lqi/l;->a:Ljava/util/HashMap;

    iget-object v0, p0, Lqi/j;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    iget-object v1, p0, Lqi/j;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-virtual {p1}, Ljava/util/HashMap;->size()I

    move-result p1

    if-nez p1, :cond_0

    invoke-static {}, Lqi/l;->k()V

    :cond_0
    return-void

    :pswitch_0
    check-cast p1, Lqi/i;

    sget-object p1, Lqi/l;->a:Ljava/util/HashMap;

    iget-object v0, p0, Lqi/j;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    iget-object v1, p0, Lqi/j;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-virtual {p1}, Ljava/util/HashMap;->size()I

    move-result p1

    if-nez p1, :cond_1

    invoke-static {}, Lqi/l;->k()V

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
