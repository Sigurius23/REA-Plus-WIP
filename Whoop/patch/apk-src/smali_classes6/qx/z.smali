.class public final Lqx/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Ljava/lang/Cloneable;


# instance fields
.field public final w:Lqx/w;

.field public final x:[Ljava/lang/Object;

.field public y:I


# direct methods
.method public constructor <init>(Lqx/w;[Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqx/z;->w:Lqx/w;

    iput-object p2, p0, Lqx/z;->x:[Ljava/lang/Object;

    iput p3, p0, Lqx/z;->y:I

    return-void
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 4

    new-instance v0, Lqx/z;

    iget-object v1, p0, Lqx/z;->x:[Ljava/lang/Object;

    iget v2, p0, Lqx/z;->y:I

    iget-object v3, p0, Lqx/z;->w:Lqx/w;

    invoke-direct {v0, v3, v1, v2}, Lqx/z;-><init>(Lqx/w;[Ljava/lang/Object;I)V

    return-object v0
.end method

.method public final hasNext()Z
    .locals 2

    iget v0, p0, Lqx/z;->y:I

    iget-object v1, p0, Lqx/z;->x:[Ljava/lang/Object;

    array-length v1, v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lqx/z;->y:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lqx/z;->y:I

    iget-object v1, p0, Lqx/z;->x:[Ljava/lang/Object;

    aget-object v0, v1, v0

    return-object v0
.end method

.method public final remove()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
