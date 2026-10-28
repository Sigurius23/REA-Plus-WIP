.class public abstract Lm4/j;
.super Lm4/e;
.source "SourceFile"


# instance fields
.field public r0:[Lm4/e;

.field public s0:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lm4/e;-><init>()V

    const/4 v0, 0x4

    new-array v0, v0, [Lm4/e;

    iput-object v0, p0, Lm4/j;->r0:[Lm4/e;

    const/4 v0, 0x0

    iput v0, p0, Lm4/j;->s0:I

    return-void
.end method


# virtual methods
.method public final V(Lm4/e;)V
    .locals 3

    if-eq p1, p0, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Lm4/j;->s0:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lm4/j;->r0:[Lm4/e;

    array-length v2, v1

    if-le v0, v2, :cond_1

    array-length v0, v1

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lm4/e;

    iput-object v0, p0, Lm4/j;->r0:[Lm4/e;

    :cond_1
    iget-object v0, p0, Lm4/j;->r0:[Lm4/e;

    iget v1, p0, Lm4/j;->s0:I

    aput-object p1, v0, v1

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lm4/j;->s0:I

    :cond_2
    :goto_0
    return-void
.end method

.method public final W(ILjava/util/ArrayList;Ln4/o;)V
    .locals 3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v2, p0, Lm4/j;->s0:I

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lm4/j;->r0:[Lm4/e;

    aget-object v2, v2, v1

    invoke-virtual {p3, v2}, Ln4/o;->a(Lm4/e;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    iget v1, p0, Lm4/j;->s0:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lm4/j;->r0:[Lm4/e;

    aget-object v1, v1, v0

    invoke-static {v1, p1, p2, p3}, Lv8/b;->p(Lm4/e;ILjava/util/ArrayList;Ln4/o;)Ln4/o;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public X()V
    .locals 0

    return-void
.end method
