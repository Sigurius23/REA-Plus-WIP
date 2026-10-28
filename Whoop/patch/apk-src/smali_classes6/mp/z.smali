.class public final Lmp/z;
.super Lmp/p;
.source "SourceFile"


# static fields
.field public static final I:[Ljava/lang/Object;

.field public static final J:Lmp/z;


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

    sput-object v5, Lmp/z;->I:[Ljava/lang/Object;

    new-instance v1, Lmp/z;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v2, 0x0

    move-object v6, v5

    invoke-direct/range {v1 .. v6}, Lmp/z;-><init>(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    sput-object v1, Lmp/z;->J:Lmp/z;

    return-void
.end method

.method public constructor <init>(III[Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    iput-object p4, p0, Lmp/z;->z:[Ljava/lang/Object;

    iput p1, p0, Lmp/z;->E:I

    iput-object p5, p0, Lmp/z;->F:[Ljava/lang/Object;

    iput p2, p0, Lmp/z;->G:I

    iput p3, p0, Lmp/z;->H:I

    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;)I
    .locals 3

    iget-object v0, p0, Lmp/z;->z:[Ljava/lang/Object;

    const/4 v1, 0x0

    iget v2, p0, Lmp/z;->H:I

    invoke-static {v0, v1, p1, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return v2
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lmp/z;->H:I

    return v0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 5

    if-eqz p1, :cond_3

    iget-object v0, p0, Lmp/z;->F:[Ljava/lang/Object;

    array-length v1, v0

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    int-to-long v1, v1

    const-wide/32 v3, -0x3361d2af

    mul-long/2addr v1, v3

    long-to-int v1, v1

    const/16 v2, 0xf

    invoke-static {v1, v2}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v1

    int-to-long v1, v1

    const-wide/32 v3, 0x1b873593

    mul-long/2addr v1, v3

    long-to-int v1, v1

    :goto_0
    iget v2, p0, Lmp/z;->G:I

    and-int/2addr v1, v2

    aget-object v2, v0, v1

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final d()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final e()Lmp/e0;
    .locals 2

    invoke-virtual {p0}, Lmp/p;->l()Lmp/n;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lmp/n;->n(I)Lmp/j;

    move-result-object v0

    return-object v0
.end method

.method public final f()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lmp/z;->z:[Ljava/lang/Object;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Lmp/z;->E:I

    return v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    invoke-virtual {p0}, Lmp/p;->l()Lmp/n;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lmp/n;->n(I)Lmp/j;

    move-result-object v0

    return-object v0
.end method

.method public final m()Lmp/n;
    .locals 2

    iget-object v0, p0, Lmp/z;->z:[Ljava/lang/Object;

    iget v1, p0, Lmp/z;->H:I

    invoke-static {v1, v0}, Lmp/n;->l(I[Ljava/lang/Object;)Lmp/y;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lmp/z;->H:I

    return v0
.end method
