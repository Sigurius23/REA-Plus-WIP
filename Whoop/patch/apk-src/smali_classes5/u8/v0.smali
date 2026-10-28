.class public final Lu8/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lu8/v0;


# instance fields
.field public final a:Lzr/g0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lu8/v0;

    sget-object v1, Lzr/g0;->x:Lzr/e0;

    sget-object v1, Lzr/w0;->E:Lzr/w0;

    invoke-direct {v0, v1}, Lu8/v0;-><init>(Lzr/w0;)V

    sput-object v0, Lu8/v0;->b:Lu8/v0;

    const/4 v0, 0x0

    invoke-static {v0}, Lx8/t;->F(I)V

    return-void
.end method

.method public constructor <init>(Lzr/w0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lzr/g0;->m(Ljava/util/Collection;)Lzr/g0;

    move-result-object p1

    iput-object p1, p0, Lu8/v0;->a:Lzr/g0;

    return-void
.end method


# virtual methods
.method public final a(I)Z
    .locals 8

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lu8/v0;->a:Lzr/g0;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v3

    if-ge v1, v3, :cond_2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lu8/u0;

    iget-object v3, v2, Lu8/u0;->e:[Z

    array-length v4, v3

    move v5, v0

    :goto_1
    if-ge v5, v4, :cond_1

    aget-boolean v6, v3, v5

    const/4 v7, 0x1

    if-ne v6, v7, :cond_0

    iget-object v2, v2, Lu8/u0;->b:Lu8/p0;

    iget v2, v2, Lu8/p0;->c:I

    if-ne v2, p1, :cond_1

    return v7

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    const-class v0, Lu8/v0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lu8/v0;

    iget-object v0, p0, Lu8/v0;->a:Lzr/g0;

    iget-object p1, p1, Lu8/v0;->a:Lzr/g0;

    invoke-virtual {v0, p1}, Lzr/g0;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lu8/v0;->a:Lzr/g0;

    invoke-virtual {v0}, Lzr/g0;->hashCode()I

    move-result v0

    return v0
.end method
