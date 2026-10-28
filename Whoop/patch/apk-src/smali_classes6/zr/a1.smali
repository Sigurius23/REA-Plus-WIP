.class public final Lzr/a1;
.super Lzr/g0;
.source "SourceFile"


# instance fields
.field public final transient E:I

.field public final transient y:[Ljava/lang/Object;

.field public final transient z:I


# direct methods
.method public constructor <init>(II[Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    iput-object p3, p0, Lzr/a1;->y:[Ljava/lang/Object;

    iput p1, p0, Lzr/a1;->z:I

    iput p2, p0, Lzr/a1;->E:I

    return-void
.end method


# virtual methods
.method public final g()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lzr/a1;->E:I

    invoke-static {p1, v0}, Lrj/o;->i(II)V

    mul-int/lit8 p1, p1, 0x2

    iget v0, p0, Lzr/a1;->z:I

    add-int/2addr p1, v0

    iget-object v0, p0, Lzr/a1;->y:[Ljava/lang/Object;

    aget-object p1, v0, p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lzr/a1;->E:I

    return v0
.end method
