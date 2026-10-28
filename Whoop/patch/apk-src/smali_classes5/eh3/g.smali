.class public final Leh3/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:[Leh3/h;

.field public c:J


# direct methods
.method public constructor <init>(Lgh3/i;I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Leh3/g;->a:I

    new-array v0, p2, [Leh3/h;

    iput-object v0, p0, Leh3/g;->b:[Leh3/h;

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    iget-object v1, p0, Leh3/g;->b:[Leh3/h;

    new-instance v2, Leh3/h;

    invoke-direct {v2, p1}, Leh3/k;-><init>(Ljava/util/concurrent/ThreadFactory;)V

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
