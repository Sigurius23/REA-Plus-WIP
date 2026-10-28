.class public final Lpg3/k;
.super Ljava/util/concurrent/CompletableFuture;
.source "SourceFile"


# instance fields
.field public final w:Lpg3/b0;


# direct methods
.method public constructor <init>(Lpg3/b0;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/CompletableFuture;-><init>()V

    iput-object p1, p0, Lpg3/k;->w:Lpg3/b0;

    return-void
.end method


# virtual methods
.method public final cancel(Z)Z
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lpg3/k;->w:Lpg3/b0;

    invoke-virtual {v0}, Lpg3/b0;->cancel()V

    :cond_0
    invoke-super {p0, p1}, Ljava/util/concurrent/CompletableFuture;->cancel(Z)Z

    move-result p1

    return p1
.end method
