.class public final Lor2/s0;
.super Landroidx/lifecycle/u0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/lifecycle/u0;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J+\u0010\n\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00080\u0007H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00028\u0000H\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lor2/s0;",
        "T",
        "Landroidx/lifecycle/u0;",
        "<init>",
        "()V",
        "Landroidx/lifecycle/g0;",
        "owner",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "observeFunction",
        "c",
        "(Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;)V",
        "value",
        "e",
        "(Ljava/lang/Object;)V",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "a",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "completed",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroidx/lifecycle/p0;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lor2/s0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public static synthetic b(Lor2/s0;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lor2/s0;->d(Lor2/s0;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lor2/s0;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 2

    iget-object p0, p0, Lor2/s0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final c(Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/g0;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "observeFunction"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lor2/q;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0, p2}, Lor2/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance p2, Lor2/s0$a;

    invoke-direct {p2, v0}, Lor2/s0$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-super {p0, p1, p2}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    return-void
.end method

.method public final e(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lor2/s0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-super {p0, p1}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    return-void
.end method
