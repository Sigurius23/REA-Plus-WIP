.class public final Lbc3/c;
.super Lbc3/m1;
.source "SourceFile"


# static fields
.field public static final synthetic H:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field public final E:Lbc3/m;

.field public F:Lbc3/s0;

.field public final synthetic G:Lbc3/e;

.field private volatile synthetic _disposer$volatile:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Ljava/lang/Object;

    const-string v1, "_disposer$volatile"

    const-class v2, Lbc3/c;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lbc3/c;->H:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lbc3/e;Lbc3/m;)V
    .locals 0

    iput-object p1, p0, Lbc3/c;->G:Lbc3/e;

    invoke-direct {p0}, Lhc3/k;-><init>()V

    iput-object p2, p0, Lbc3/c;->E:Lbc3/m;

    return-void
.end method


# virtual methods
.method public final i()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final j(Ljava/lang/Throwable;)V
    .locals 5

    iget-object v0, p0, Lbc3/c;->E:Lbc3/m;

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Lbc3/m;->F(Ljava/lang/Throwable;)Lhc3/x;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {v0, p1}, Lbc3/m;->n(Ljava/lang/Object;)V

    sget-object p1, Lbc3/c;->H:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbc3/d;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lbc3/d;->b()V

    return-void

    :cond_0
    sget-object p1, Lbc3/e;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    iget-object v1, p0, Lbc3/c;->G:Lbc3/e;

    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, v1, Lbc3/e;->a:[Lbc3/i0;

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, p1

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, p1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, p1, v3

    invoke-interface {v4}, Lbc3/i0;->b()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v1}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method
