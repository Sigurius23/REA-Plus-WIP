.class public final Lmh3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxg3/t;


# static fields
.field public static final y:Lmh3/a;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmh3/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lmh3/b;->y:Lmh3/a;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, Lmh3/b;->w:I

    packed-switch p1, :pswitch_data_0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lmh3/b;->x:Ljava/util/concurrent/atomic/AtomicReference;

    return-void

    .line 3
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance p1, Lfh3/a;

    .line 5
    invoke-direct {p1}, Lfh3/a;-><init>()V

    .line 6
    iput-object p1, p0, Lmh3/b;->x:Ljava/util/concurrent/atomic/AtomicReference;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Lbh3/a;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lmh3/b;->w:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lmh3/b;->x:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    iget v0, p0, Lmh3/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmh3/b;->x:Ljava/util/concurrent/atomic/AtomicReference;

    check-cast v0, Lfh3/a;

    invoke-virtual {v0}, Lfh3/a;->a()Z

    move-result v0

    return v0

    :pswitch_0
    iget-object v0, p0, Lmh3/b;->x:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lmh3/b;->y:Lmh3/a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()V
    .locals 3

    iget v0, p0, Lmh3/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmh3/b;->x:Ljava/util/concurrent/atomic/AtomicReference;

    check-cast v0, Lfh3/a;

    invoke-virtual {v0}, Lfh3/a;->b()V

    return-void

    :pswitch_0
    iget-object v0, p0, Lmh3/b;->x:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbh3/a;

    sget-object v2, Lmh3/b;->y:Lmh3/a;

    if-eq v1, v2, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbh3/a;

    if-eqz v0, :cond_0

    if-eq v0, v2, :cond_0

    invoke-interface {v0}, Lbh3/a;->call()V

    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
