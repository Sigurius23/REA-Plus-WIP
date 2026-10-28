.class public final Lzr/w0;
.super Lzr/g0;
.source "SourceFile"


# static fields
.field public static final E:Lzr/w0;


# instance fields
.field public final transient y:[Ljava/lang/Object;

.field public final transient z:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lzr/w0;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-direct {v0, v1, v2}, Lzr/w0;-><init>(I[Ljava/lang/Object;)V

    sput-object v0, Lzr/w0;->E:Lzr/w0;

    return-void
.end method

.method public constructor <init>(I[Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    iput-object p2, p0, Lzr/w0;->y:[Ljava/lang/Object;

    iput p1, p0, Lzr/w0;->z:I

    return-void
.end method


# virtual methods
.method public final c(I[Ljava/lang/Object;)I
    .locals 3

    iget-object v0, p0, Lzr/w0;->y:[Ljava/lang/Object;

    const/4 v1, 0x0

    iget v2, p0, Lzr/w0;->z:I

    invoke-static {v0, v1, p2, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p1, v2

    return p1
.end method

.method public final d()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lzr/w0;->y:[Ljava/lang/Object;

    return-object v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lzr/w0;->z:I

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

.method public final get(I)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lzr/w0;->z:I

    invoke-static {p1, v0}, Lrj/o;->i(II)V

    iget-object v0, p0, Lzr/w0;->y:[Ljava/lang/Object;

    aget-object p1, v0, p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lzr/w0;->z:I

    return v0
.end method
