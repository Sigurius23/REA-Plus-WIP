.class public final Lsa3/c;
.super Lq1/j0;
.source "SourceFile"


# instance fields
.field public final d:[Lwa3/q;


# direct methods
.method public constructor <init>(I[Lwa3/q;)V
    .locals 4

    if-eqz p2, :cond_3

    array-length v0, p2

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/16 v2, 0x1f

    :goto_0
    if-ltz v2, :cond_2

    shl-int v3, v1, v2

    and-int/2addr v3, v0

    if-eqz v3, :cond_1

    add-int/2addr v1, v2

    :goto_1
    const/4 v0, 0x1

    const/4 v2, 0x0

    invoke-direct {p0, p1, v1, v0, v2}, Lq1/j0;-><init>(IIIB)V

    iput-object p2, p0, Lsa3/c;->d:[Lwa3/q;

    return-void

    :cond_1
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Empty enum: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Argument for @NotNull parameter \'enumEntries\' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final e(I)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lq1/j0;->c:I

    const/4 v1, 0x1

    shl-int v0, v1, v0

    sub-int/2addr v0, v1

    iget v1, p0, Lq1/j0;->b:I

    shl-int/2addr v0, v1

    and-int/2addr p1, v0

    shr-int/2addr p1, v1

    iget-object v0, p0, Lsa3/c;->d:[Lwa3/q;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-interface {v3}, Lwa3/q;->a()I

    move-result v4

    if-ne v4, p1, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
