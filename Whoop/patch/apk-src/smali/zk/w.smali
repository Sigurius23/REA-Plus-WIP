.class public final Lzk/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lzk/w;->a:Ljava/lang/Object;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    return-void
.end method

.method public constructor <init>([J)V
    .locals 5

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_4

    .line 5
    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object p1

    .line 6
    new-instance v0, La0/j0;

    array-length v1, p1

    invoke-direct {v0, v1}, La0/j0;-><init>(I)V

    .line 7
    iget v1, v0, La0/j0;->b:I

    if-ltz v1, :cond_3

    .line 8
    array-length v2, p1

    if-nez v2, :cond_0

    goto :goto_0

    .line 9
    :cond_0
    array-length v2, p1

    add-int/2addr v2, v1

    .line 10
    iget-object v3, v0, La0/j0;->a:[J

    .line 11
    array-length v4, v3

    if-ge v4, v2, :cond_1

    .line 12
    array-length v4, v3

    mul-int/lit8 v4, v4, 0x3

    div-int/lit8 v4, v4, 0x2

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 13
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v2

    const-string v3, "copyOf(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, La0/j0;->a:[J

    .line 14
    :cond_1
    iget-object v2, v0, La0/j0;->a:[J

    .line 15
    iget v3, v0, La0/j0;->b:I

    if-eq v1, v3, :cond_2

    .line 16
    array-length v4, p1

    add-int/2addr v4, v1

    .line 17
    invoke-static {v2, v2, v4, v1, v3}, Lm83/n;->g0([J[JIII)V

    :cond_2
    const/4 v3, 0x0

    .line 18
    array-length v4, p1

    invoke-static {p1, v2, v1, v3, v4}, Lm83/n;->g0([J[JIII)V

    .line 19
    iget v1, v0, La0/j0;->b:I

    array-length p1, p1

    add-int/2addr v1, p1

    iput v1, v0, La0/j0;->b:I

    goto :goto_0

    .line 20
    :cond_3
    const-string p1, ""

    invoke-static {p1}, Lug/m;->Q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    .line 21
    :cond_4
    new-instance v0, La0/j0;

    const/16 p1, 0x10

    .line 22
    invoke-direct {v0, p1}, La0/j0;-><init>(I)V

    .line 23
    :goto_0
    iput-object v0, p0, Lzk/w;->a:Ljava/lang/Object;

    return-void
.end method
