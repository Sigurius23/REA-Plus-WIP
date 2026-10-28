.class public final Lne3/c0;
.super Lm83/e;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;


# instance fields
.field public final w:[Lne3/l;

.field public final x:[I


# direct methods
.method public constructor <init>([Lne3/l;[I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lne3/c0;->w:[Lne3/l;

    iput-object p2, p0, Lne3/c0;->x:[I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Lne3/c0;->w:[Lne3/l;

    array-length v0, v0

    return v0
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lne3/l;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lne3/l;

    invoke-super {p0, p1}, Lm83/a;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lne3/c0;->w:[Lne3/l;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1

    instance-of v0, p1, Lne3/l;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, Lne3/l;

    invoke-super {p0, p1}, Lm83/e;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    instance-of v0, p1, Lne3/l;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, Lne3/l;

    invoke-super {p0, p1}, Lm83/e;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method
