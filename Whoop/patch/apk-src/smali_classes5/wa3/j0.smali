.class public final Lwa3/j0;
.super Ljava/util/AbstractList;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;
.implements Lwa3/t;


# instance fields
.field public final w:Lwa3/s;


# direct methods
.method public constructor <init>(Lwa3/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    iput-object p1, p0, Lwa3/j0;->w:Lwa3/s;

    return-void
.end method


# virtual methods
.method public final S0(Lwa3/u;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final b()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lwa3/j0;->w:Lwa3/s;

    iget-object v0, v0, Lwa3/s;->w:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final b0(I)Lwa3/e;
    .locals 1

    iget-object v0, p0, Lwa3/j0;->w:Lwa3/s;

    invoke-virtual {v0, p1}, Lwa3/s;->b0(I)Lwa3/e;

    move-result-object p1

    return-object p1
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lwa3/j0;->w:Lwa3/s;

    invoke-virtual {v0, p1}, Lwa3/s;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lwa3/i0;

    invoke-direct {v0, p0}, Lwa3/i0;-><init>(Lwa3/j0;)V

    return-object v0
.end method

.method public final k()Lwa3/j0;
    .locals 0

    return-object p0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 1

    new-instance v0, Lwa3/h0;

    invoke-direct {v0, p0, p1}, Lwa3/h0;-><init>(Lwa3/j0;I)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lwa3/j0;->w:Lwa3/s;

    invoke-virtual {v0}, Lwa3/s;->size()I

    move-result v0

    return v0
.end method
