.class public final Lrb3/c;
.super Lrb3/a;
.source "SourceFile"


# instance fields
.field public w:[Ljava/lang/Object;

.field public x:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x14

    new-array v0, v0, [Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lrb3/c;->w:[Ljava/lang/Object;

    const/4 v0, 0x0

    iput v0, p0, Lrb3/c;->x:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lrb3/c;->x:I

    return v0
.end method

.method public final c(ILjava/lang/Object;)V
    .locals 2

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lrb3/c;->w:[Ljava/lang/Object;

    array-length v1, v0

    if-le v1, p1, :cond_0

    goto :goto_0

    :cond_0
    array-length v0, v0

    :cond_1
    mul-int/lit8 v0, v0, 0x2

    if-le v0, p1, :cond_1

    iget-object v1, p0, Lrb3/c;->w:[Ljava/lang/Object;

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "copyOf(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lrb3/c;->w:[Ljava/lang/Object;

    :goto_0
    iget-object v0, p0, Lrb3/c;->w:[Ljava/lang/Object;

    aget-object v1, v0, p1

    if-nez v1, :cond_2

    iget v1, p0, Lrb3/c;->x:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lrb3/c;->x:I

    :cond_2
    aput-object p2, v0, p1

    return-void
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lrb3/c;->w:[Ljava/lang/Object;

    invoke-static {p1, v0}, Lm83/n;->y0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lrb3/b;

    invoke-direct {v0, p0}, Lrb3/b;-><init>(Lrb3/c;)V

    return-object v0
.end method
