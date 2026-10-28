.class public final Lm83/d;
.super Lm83/e;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;


# instance fields
.field public final w:Lm83/e;

.field public final x:I

.field public final y:I


# direct methods
.method public constructor <init>(Lm83/e;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm83/d;->w:Lm83/e;

    iput p2, p0, Lm83/d;->x:I

    invoke-virtual {p1}, Lm83/a;->a()I

    move-result p1

    invoke-static {p2, p3, p1}, Lq83/g;->o(III)V

    sub-int/2addr p3, p2

    iput p3, p0, Lm83/d;->y:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lm83/d;->y:I

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lm83/d;->y:I

    if-ltz p1, :cond_0

    if-ge p1, v0, :cond_0

    iget v0, p0, Lm83/d;->x:I

    add-int/2addr v0, p1

    iget-object p1, p0, Lm83/d;->w:Lm83/e;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, "index: "

    const-string v3, ", size: "

    invoke-static {p1, v0, v2, v3}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final subList(II)Ljava/util/List;
    .locals 2

    iget v0, p0, Lm83/d;->y:I

    invoke-static {p1, p2, v0}, Lq83/g;->o(III)V

    new-instance v0, Lm83/d;

    iget v1, p0, Lm83/d;->x:I

    add-int/2addr p1, v1

    add-int/2addr v1, p2

    iget-object p2, p0, Lm83/d;->w:Lm83/e;

    invoke-direct {v0, p2, p1, v1}, Lm83/d;-><init>(Lm83/e;II)V

    return-object v0
.end method
