.class public final Lio/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrm/f;


# static fields
.field public static final y:Li7/g;


# instance fields
.field public final w:Lsn/w0;

.field public final x:Lzr/g0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li7/g;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Li7/g;-><init>(I)V

    sput-object v0, Lio/t;->y:Li7/g;

    return-void
.end method

.method public constructor <init>(Lsn/w0;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/t;->w:Lsn/w0;

    .line 3
    const-string v0, "initialCapacity"

    const/4 v1, 0x4

    invoke-static {v1, v0}, Lzr/q;->c(ILjava/lang/String;)V

    .line 4
    new-array v0, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    move v2, v1

    .line 5
    :goto_0
    iget v3, p1, Lsn/w0;->w:I

    if-ge v1, v3, :cond_1

    .line 6
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 7
    array-length v4, v0

    add-int/lit8 v5, v2, 0x1

    invoke-static {v4, v5}, Lzr/a0;->e(II)I

    move-result v4

    .line 8
    array-length v6, v0

    if-gt v4, v6, :cond_0

    goto :goto_1

    .line 9
    :cond_0
    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    .line 10
    :goto_1
    aput-object v3, v0, v2

    add-int/lit8 v1, v1, 0x1

    move v2, v5

    goto :goto_0

    .line 11
    :cond_1
    invoke-static {v2, v0}, Lzr/g0;->j(I[Ljava/lang/Object;)Lzr/w0;

    move-result-object p1

    .line 12
    iput-object p1, p0, Lio/t;->x:Lzr/g0;

    return-void
.end method

.method public constructor <init>(Lsn/w0;Ljava/util/List;)V
    .locals 2

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 15
    invoke-static {p2}, Ljava/util/Collections;->min(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {p2}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget v1, p1, Lsn/w0;->w:I

    if-ge v0, v1, :cond_0

    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1

    .line 17
    :cond_1
    :goto_0
    iput-object p1, p0, Lio/t;->w:Lsn/w0;

    .line 18
    invoke-static {p2}, Lzr/g0;->m(Ljava/util/Collection;)Lzr/g0;

    move-result-object p1

    iput-object p1, p0, Lio/t;->x:Lzr/g0;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    const-class v2, Lio/t;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lio/t;

    iget-object v2, p0, Lio/t;->w:Lsn/w0;

    iget-object v3, p1, Lio/t;->w:Lsn/w0;

    invoke-virtual {v2, v3}, Lsn/w0;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lio/t;->x:Lzr/g0;

    iget-object p1, p1, Lio/t;->x:Lzr/g0;

    invoke-virtual {v2, p1}, Lzr/g0;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lio/t;->w:Lsn/w0;

    invoke-virtual {v0}, Lsn/w0;->hashCode()I

    move-result v0

    iget-object v1, p0, Lio/t;->x:Lzr/g0;

    invoke-virtual {v1}, Lzr/g0;->hashCode()I

    move-result v1

    mul-int/lit8 v1, v1, 0x1f

    add-int/2addr v1, v0

    return v1
.end method
