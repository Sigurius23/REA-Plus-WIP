.class public final Ld/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh5/u0;


# static fields
.field public static final d:[Ld/q;


# instance fields
.field public a:I

.field public b:Z

.field public c:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ld/q;

    sput-object v0, Ld/s;->d:[Ld/q;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p1, :cond_1

    if-nez p1, :cond_0

    sget-object p1, Ld/s;->d:[Ld/q;

    goto :goto_0

    :cond_0
    new-array p1, p1, [Ld/q;

    :goto_0
    iput-object p1, p0, Ld/s;->c:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, p0, Ld/s;->a:I

    iput-boolean p1, p0, Ld/s;->b:Z

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'initialCapacity\' must not be negative"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ljava/security/MessageDigest;I)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    .line 3
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 4
    iput-object p1, p0, Ld/s;->c:Ljava/lang/Object;

    iput p2, p0, Ld/s;->a:I

    return-void
.end method

.method public constructor <init>(Llb3/c0;IZ)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld/s;->c:Ljava/lang/Object;

    iput p2, p0, Ld/s;->a:I

    iput-boolean p3, p0, Ld/s;->b:Z

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ld/s;->b:Z

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Ld/s;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v0}, Landroidx/appcompat/widget/ActionBarContextView;->a(Landroidx/appcompat/widget/ActionBarContextView;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ld/s;->b:Z

    return-void
.end method

.method public c()V
    .locals 2

    iget-boolean v0, p0, Ld/s;->b:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ld/s;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/appcompat/widget/ActionBarContextView;->F:Lh5/t0;

    iget v1, p0, Ld/s;->a:I

    invoke-static {v0, v1}, Landroidx/appcompat/widget/ActionBarContextView;->b(Landroidx/appcompat/widget/ActionBarContextView;I)V

    return-void
.end method

.method public d(I)Ld/q;
    .locals 2

    iget v0, p0, Ld/s;->a:I

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Ld/s;->c:Ljava/lang/Object;

    check-cast v0, [Ld/q;

    aget-object p1, v0, p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " >= "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Ld/s;->a:I

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e(Ld/b1;)V
    .locals 5

    if-eqz p1, :cond_2

    iget-object v0, p0, Ld/s;->c:Ljava/lang/Object;

    check-cast v0, [Ld/q;

    array-length v1, v0

    iget v2, p0, Ld/s;->a:I

    const/4 v3, 0x1

    add-int/2addr v2, v3

    const/4 v4, 0x0

    if-le v2, v1, :cond_0

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    iget-boolean v1, p0, Ld/s;->b:Z

    or-int/2addr v1, v3

    if-eqz v1, :cond_1

    array-length v0, v0

    shr-int/lit8 v1, v2, 0x1

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    new-array v0, v0, [Ld/q;

    iget-object v1, p0, Ld/s;->c:Ljava/lang/Object;

    check-cast v1, [Ld/q;

    iget v3, p0, Ld/s;->a:I

    invoke-static {v1, v4, v0, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, p0, Ld/s;->c:Ljava/lang/Object;

    iput-boolean v4, p0, Ld/s;->b:Z

    :cond_1
    iget-object v0, p0, Ld/s;->c:Ljava/lang/Object;

    check-cast v0, [Ld/q;

    iget v1, p0, Ld/s;->a:I

    aput-object p1, v0, v1

    iput v2, p0, Ld/s;->a:I

    return-void

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "\'element\' cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f()[Ld/q;
    .locals 4

    iget v0, p0, Ld/s;->a:I

    if-nez v0, :cond_0

    sget-object v0, Ld/s;->d:[Ld/q;

    return-object v0

    :cond_0
    iget-object v1, p0, Ld/s;->c:Ljava/lang/Object;

    check-cast v1, [Ld/q;

    array-length v2, v1

    if-ne v2, v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ld/s;->b:Z

    return-object v1

    :cond_1
    new-array v2, v0, [Ld/q;

    const/4 v3, 0x0

    invoke-static {v1, v3, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Ld/s;->b:Z

    return v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Ld/s;->a:I

    return v0
.end method

.method public i()Llb3/c0;
    .locals 1

    iget-object v0, p0, Ld/s;->c:Ljava/lang/Object;

    check-cast v0, Llb3/c0;

    return-object v0
.end method
