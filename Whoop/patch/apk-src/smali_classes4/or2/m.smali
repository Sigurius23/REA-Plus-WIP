.class public final Lor2/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Lbc3/c0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lor2/m;",
        "Ljava/io/Closeable;",
        "Lbc3/c0;",
        "Lq83/j;",
        "coroutineContext",
        "<init>",
        "(Lq83/j;)V",
        "Ll83/a0;",
        "close",
        "()V",
        "w",
        "Lq83/j;",
        "getCoroutineContext",
        "()Lq83/j;",
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
.field private final w:Lq83/j;


# direct methods
.method public constructor <init>(Lq83/j;)V
    .locals 1

    const-string v0, "coroutineContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lor2/m;->w:Lq83/j;

    return-void
.end method

.method public constructor <init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object p1

    sget-object p2, Lbc3/q0;->a:Lkc3/e;

    .line 4
    sget-object p2, Lhc3/o;->a:Lbc3/w1;

    .line 5
    invoke-virtual {p2}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object p2

    .line 6
    invoke-static {p1, p2}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object p1

    .line 7
    :cond_0
    invoke-direct {p0, p1}, Lor2/m;-><init>(Lq83/j;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 2

    invoke-virtual {p0}, Lor2/m;->getCoroutineContext()Lq83/j;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lbc3/f0;->i(Lq83/j;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public getCoroutineContext()Lq83/j;
    .locals 1

    iget-object v0, p0, Lor2/m;->w:Lq83/j;

    return-object v0
.end method
