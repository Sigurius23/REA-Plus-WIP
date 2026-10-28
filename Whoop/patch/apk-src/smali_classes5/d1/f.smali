.class public final Ld1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Ljava/util/concurrent/atomic/AtomicReference;

.field public final c:Lp1/g1;


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ld1/f;->a:Z

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Ld1/f;->b:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance p1, Lp1/g1;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lp1/g1;-><init>(F)V

    iput-object p1, p0, Ld1/f;->c:Lp1/g1;

    return-void
.end method
