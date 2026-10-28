.class public final Lzr/c1;
.super Lzr/j0;
.source "SourceFile"


# static fields
.field public static final I:[Ljava/lang/Object;

.field public static final J:Lzr/c1;


# instance fields
.field public final transient E:I

.field public final transient F:[Ljava/lang/Object;

.field public final transient G:I

.field public final transient H:I

.field public final transient z:[Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/4 v0, 0x0

    new-array v5, v0, [Ljava/lang/Object;

    sput-object v5, Lzr/c1;->I:[Ljava/lang/Object;

    new-instance v1, Lzr/c1;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v2, 0x0

    move-object v6, v5

    invoke-direct/range {v1 .. v6}, Lzr/c1;-><init>(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    sput-object v1, Lzr/c1;->J:Lzr/c1;

    return-void
.end method

.method public constructor <init>(III[Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    iput-object p4, p0, Lzr/c1;->z:[Ljava/lang/Object;

    iput p1, p0, Lzr/c1;->E:I

    iput-object p5, p0, Lzr/c1;->F:[Ljava/lang/Object;

    iput p2, p0, Lzr/c1;->G:I

    iput p3, p0, Lzr/c1;->H:I

    return-void
.end method


# virtual methods
.method public final c(I[Ljava/lang/Object;)I
    .locals 3

    iget-object v0, p0, Lzr/c1;->z:[Ljava/lang/Object;

    const/4 v1, 0x0

    iget v2, p0, Lzr/c1;->H:I

    invoke-static {v0, v1, p2, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p1, v2

    return p1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    iget-object v1, p0, Lzr/c1;->F:[Ljava/lang/Object;

    array-length v2, v1

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p1}, Lzr/q;->q(Ljava/lang/Object;)I

    move-result v2

    :goto_0
    iget v3, p0, Lzr/c1;->G:I

    and-int/2addr v2, v3

    aget-object v3, v1, v2

    if-nez v3, :cond_1

    return v0

    :cond_1
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return v0
.end method

.method public final d()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lzr/c1;->z:[Ljava/lang/Object;

    return-object v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lzr/c1;->H:I

    return v0
.end method

.method public final f()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final g()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Lzr/c1;->E:I

    return v0
.end method

.method public final n()Lzr/g0;
    .locals 2

    iget-object v0, p0, Lzr/c1;->z:[Ljava/lang/Object;

    iget v1, p0, Lzr/c1;->H:I

    invoke-static {v1, v0}, Lzr/g0;->j(I[Ljava/lang/Object;)Lzr/w0;

    move-result-object v0

    return-object v0
.end method

.method public final o()Lzr/k1;
    .locals 2

    invoke-virtual {p0}, Lzr/j0;->a()Lzr/g0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lzr/g0;->o(I)Lzr/e0;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lzr/c1;->H:I

    return v0
.end method
