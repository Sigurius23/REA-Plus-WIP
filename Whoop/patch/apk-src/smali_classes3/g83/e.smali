.class public final Lg83/e;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Ln73/b;


# instance fields
.field public final w:Ll73/d;

.field public final x:Lg83/g;

.field public y:Ljava/lang/Integer;

.field public volatile z:Z


# direct methods
.method public constructor <init>(Ll73/d;Lg83/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lg83/e;->w:Ll73/d;

    iput-object p2, p0, Lg83/e;->x:Lg83/g;

    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 1

    iget-boolean v0, p0, Lg83/e;->z:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lg83/e;->z:Z

    iget-object v0, p0, Lg83/e;->x:Lg83/g;

    invoke-virtual {v0, p0}, Lg83/g;->f(Lg83/e;)V

    :cond_0
    return-void
.end method

.method public final isDisposed()Z
    .locals 1

    iget-boolean v0, p0, Lg83/e;->z:Z

    return v0
.end method
