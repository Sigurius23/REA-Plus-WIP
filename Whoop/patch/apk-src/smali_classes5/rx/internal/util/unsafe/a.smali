.class public abstract Lrx/internal/util/unsafe/a;
.super Lrx/internal/util/unsafe/b;
.source "SourceFile"


# static fields
.field public static final E:I

.field public static final y:I

.field public static final z:J


# instance fields
.field public final w:J

.field public final x:[Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "sparse.shift"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/lang/Integer;->getInteger(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sput v0, Lrx/internal/util/unsafe/a;->y:I

    sget-object v1, Lrx/internal/util/unsafe/j;->a:Lsun/misc/Unsafe;

    const-class v2, [Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lsun/misc/Unsafe;->arrayIndexScale(Ljava/lang/Class;)I

    move-result v3

    const/4 v4, 0x4

    if-ne v4, v3, :cond_0

    add-int/lit8 v3, v0, 0x2

    sput v3, Lrx/internal/util/unsafe/a;->E:I

    goto :goto_0

    :cond_0
    const/16 v4, 0x8

    if-ne v4, v3, :cond_1

    add-int/lit8 v3, v0, 0x3

    sput v3, Lrx/internal/util/unsafe/a;->E:I

    :goto_0
    invoke-virtual {v1, v2}, Lsun/misc/Unsafe;->arrayBaseOffset(Ljava/lang/Class;)I

    move-result v1

    sget v2, Lrx/internal/util/unsafe/a;->E:I

    sub-int/2addr v2, v0

    const/16 v0, 0x20

    shl-int/2addr v0, v2

    add-int/2addr v1, v0

    int-to-long v0, v1

    sput-wide v0, Lrx/internal/util/unsafe/a;->z:J

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unknown pointer size"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Ljava/util/AbstractQueue;-><init>()V

    invoke-static {p1}, Ldt/b;->M(I)I

    move-result p1

    add-int/lit8 v0, p1, -0x1

    int-to-long v0, v0

    iput-wide v0, p0, Lrx/internal/util/unsafe/a;->w:J

    sget v0, Lrx/internal/util/unsafe/a;->y:I

    shl-int/2addr p1, v0

    add-int/lit8 p1, p1, 0x40

    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Lrx/internal/util/unsafe/a;->x:[Ljava/lang/Object;

    return-void
.end method

.method public static c([Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lrx/internal/util/unsafe/j;->a:Lsun/misc/Unsafe;

    invoke-virtual {v0, p0, p1, p2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static d([Ljava/lang/Object;JLjava/lang/Object;)V
    .locals 1

    sget-object v0, Lrx/internal/util/unsafe/j;->a:Lsun/misc/Unsafe;

    invoke-virtual {v0, p0, p1, p2, p3}, Lsun/misc/Unsafe;->putOrderedObject(Ljava/lang/Object;JLjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a(J)J
    .locals 2

    iget-wide v0, p0, Lrx/internal/util/unsafe/a;->w:J

    and-long/2addr p1, v0

    sget v0, Lrx/internal/util/unsafe/a;->E:I

    shl-long/2addr p1, v0

    sget-wide v0, Lrx/internal/util/unsafe/a;->z:J

    add-long/2addr v0, p1

    return-wide v0
.end method

.method public final clear()V
    .locals 1

    :cond_0
    :goto_0
    invoke-interface {p0}, Lrx/internal/util/unsafe/c;->poll()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
