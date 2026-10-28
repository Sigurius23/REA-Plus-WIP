.class public final Lu8/q0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lu8/p0;

.field public final b:Lzr/g0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lx8/t;->F(I)V

    const/4 v0, 0x1

    invoke-static {v0}, Lx8/t;->F(I)V

    return-void
.end method

.method public constructor <init>(Lu8/p0;Ljava/util/List;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p2}, Ljava/util/Collections;->min(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {p2}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget v1, p1, Lu8/p0;->a:I

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    iput-object p1, p0, Lu8/q0;->a:Lu8/p0;

    invoke-static {p2}, Lzr/g0;->m(Ljava/util/Collection;)Lzr/g0;

    move-result-object p1

    iput-object p1, p0, Lu8/q0;->b:Lzr/g0;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    const-class v2, Lu8/q0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lu8/q0;

    iget-object v2, p0, Lu8/q0;->a:Lu8/p0;

    iget-object v3, p1, Lu8/q0;->a:Lu8/p0;

    invoke-virtual {v2, v3}, Lu8/p0;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lu8/q0;->b:Lzr/g0;

    iget-object p1, p1, Lu8/q0;->b:Lzr/g0;

    invoke-virtual {v2, p1}, Lzr/g0;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lu8/q0;->a:Lu8/p0;

    invoke-virtual {v0}, Lu8/p0;->hashCode()I

    move-result v0

    iget-object v1, p0, Lu8/q0;->b:Lzr/g0;

    invoke-virtual {v1}, Lzr/g0;->hashCode()I

    move-result v1

    mul-int/lit8 v1, v1, 0x1f

    add-int/2addr v1, v0

    return v1
.end method
