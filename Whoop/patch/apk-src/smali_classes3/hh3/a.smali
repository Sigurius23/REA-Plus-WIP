.class public abstract Lhh3/a;
.super Ljava/util/AbstractQueue;
.source "SourceFile"


# instance fields
.field public final w:Ljava/util/concurrent/atomic/AtomicReferenceArray;

.field public final x:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/util/AbstractQueue;-><init>()V

    invoke-static {p1}, Ldt/b;->M(I)I

    move-result p1

    add-int/lit8 v0, p1, -0x1

    iput v0, p0, Lhh3/a;->x:I

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-direct {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;-><init>(I)V

    iput-object v0, p0, Lhh3/a;->w:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    :cond_0
    :goto_0
    move-object v0, p0

    check-cast v0, Lhh3/b;

    invoke-virtual {v0}, Lhh3/b;->poll()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
