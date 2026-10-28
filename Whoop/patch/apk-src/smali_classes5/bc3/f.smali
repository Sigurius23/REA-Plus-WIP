.class public final Lbc3/f;
.super Lbc3/a;
.source "SourceFile"


# instance fields
.field public final E:Lbc3/a1;

.field public final z:Ljava/lang/Thread;


# direct methods
.method public constructor <init>(Lq83/j;Ljava/lang/Thread;Lbc3/a1;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, v0}, Lbc3/a;-><init>(Lq83/j;ZZ)V

    iput-object p2, p0, Lbc3/f;->z:Ljava/lang/Thread;

    iput-object p3, p0, Lbc3/f;->E:Lbc3/a1;

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iget-object v0, p0, Lbc3/f;->z:Ljava/lang/Thread;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-static {v0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_0
    return-void
.end method
