.class public final Lkc3/d;
.super Lbc3/c1;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# static fields
.field public static final w:Lkc3/d;

.field public static final x:Lbc3/z;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lkc3/d;

    invoke-direct {v0}, Lbc3/z;-><init>()V

    sput-object v0, Lkc3/d;->w:Lkc3/d;

    sget-object v0, Lkc3/l;->w:Lkc3/l;

    sget v1, Lhc3/y;->a:I

    const/16 v2, 0x40

    if-ge v2, v1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    const/16 v2, 0xc

    const-string v3, "kotlinx.coroutines.io.parallelism"

    invoke-static {v1, v2, v3}, Lhc3/b;->k(IILjava/lang/String;)I

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2, v3}, Lbc3/z;->limitedParallelism$default(Lbc3/z;ILjava/lang/String;ILjava/lang/Object;)Lbc3/z;

    move-result-object v0

    sput-object v0, Lkc3/d;->x:Lbc3/z;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot be invoked on Dispatchers.IO"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final dispatch(Lq83/j;Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, Lkc3/d;->x:Lbc3/z;

    invoke-virtual {v0, p1, p2}, Lbc3/z;->dispatch(Lq83/j;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final dispatchYield(Lq83/j;Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, Lkc3/d;->x:Lbc3/z;

    invoke-virtual {v0, p1, p2}, Lbc3/z;->dispatchYield(Lq83/j;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, Lq83/k;->w:Lq83/k;

    invoke-virtual {p0, v0, p1}, Lkc3/d;->dispatch(Lq83/j;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final getExecutor()Ljava/util/concurrent/Executor;
    .locals 0

    return-object p0
.end method

.method public final limitedParallelism(ILjava/lang/String;)Lbc3/z;
    .locals 1

    sget-object v0, Lkc3/l;->w:Lkc3/l;

    invoke-virtual {v0, p1, p2}, Lkc3/l;->limitedParallelism(ILjava/lang/String;)Lbc3/z;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.IO"

    return-object v0
.end method
