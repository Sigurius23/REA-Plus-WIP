.class public final Lbc3/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field public final a:[Lbc3/i0;

.field private volatile synthetic notCompletedCount$volatile:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lbc3/e;

    const-string v1, "notCompletedCount$volatile"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lbc3/e;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>([Lbc3/i0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbc3/e;->a:[Lbc3/i0;

    array-length p1, p1

    iput p1, p0, Lbc3/e;->notCompletedCount$volatile:I

    return-void
.end method


# virtual methods
.method public final a(Lq83/d;)Ljava/lang/Object;
    .locals 8

    new-instance v0, Lbc3/m;

    invoke-static {p1}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p1

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    iget-object p1, p0, Lbc3/e;->a:[Lbc3/i0;

    array-length v2, p1

    new-array v3, v2, [Lbc3/c;

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v2, :cond_0

    aget-object v6, p1, v5

    move-object v7, v6

    check-cast v7, Lbc3/t1;

    invoke-virtual {v7}, Lbc3/t1;->start()Z

    new-instance v7, Lbc3/c;

    invoke-direct {v7, p0, v0}, Lbc3/c;-><init>(Lbc3/e;Lbc3/m;)V

    invoke-static {v6, v1, v7}, Lbc3/f0;->v(Lbc3/k1;ZLbc3/m1;)Lbc3/s0;

    move-result-object v6

    iput-object v6, v7, Lbc3/c;->F:Lbc3/s0;

    aput-object v7, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lbc3/d;

    invoke-direct {p1, v3}, Lbc3/d;-><init>([Lbc3/c;)V

    :goto_1
    if-ge v4, v2, :cond_1

    aget-object v1, v3, v4

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lbc3/c;->H:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v5, v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lbc3/m;->w()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lbc3/d;->b()V

    goto :goto_2

    :cond_2
    invoke-virtual {v0, p1}, Lbc3/m;->v(Lbc3/a2;)V

    :goto_2
    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    return-object p1
.end method
