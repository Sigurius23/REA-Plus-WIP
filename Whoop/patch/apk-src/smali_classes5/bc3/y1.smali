.class public final Lbc3/y1;
.super Lq83/a;
.source "SourceFile"

# interfaces
.implements Lbc3/k1;


# static fields
.field public static final w:Lbc3/y1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbc3/y1;

    sget-object v1, Lbc3/j1;->w:Lbc3/j1;

    invoke-direct {v0, v1}, Lq83/a;-><init>(Lq83/i;)V

    sput-object v0, Lbc3/y1;->w:Lbc3/y1;

    return-void
.end method


# virtual methods
.method public final attachChild(Lbc3/r;)Lbc3/p;
    .locals 0

    sget-object p1, Lbc3/z1;->w:Lbc3/z1;

    return-object p1
.end method

.method public final cancel(Ljava/util/concurrent/CancellationException;)V
    .locals 0

    return-void
.end method

.method public final getCancellationException()Ljava/util/concurrent/CancellationException;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This job is always active"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getChildren()Lxb3/i;
    .locals 1

    sget-object v0, Lxb3/d;->a:Lxb3/d;

    return-object v0
.end method

.method public final invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;
    .locals 0

    .line 1
    sget-object p1, Lbc3/z1;->w:Lbc3/z1;

    return-object p1
.end method

.method public final invokeOnCompletion(ZZLkotlin/jvm/functions/Function1;)Lbc3/s0;
    .locals 0

    .line 2
    sget-object p1, Lbc3/z1;->w:Lbc3/z1;

    return-object p1
.end method

.method public final isActive()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final isCancelled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final isCompleted()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final join(Lq83/d;)Ljava/lang/Object;
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "This job is always active"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final start()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "NonCancellable"

    return-object v0
.end method
