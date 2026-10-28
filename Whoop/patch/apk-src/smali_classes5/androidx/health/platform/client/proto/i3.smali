.class public final Landroidx/health/platform/client/proto/i3;
.super Ljava/util/AbstractList;
.source "SourceFile"

# interfaces
.implements Landroidx/health/platform/client/proto/a1;
.implements Ljava/util/RandomAccess;


# instance fields
.field public final w:Landroidx/health/platform/client/proto/z0;


# direct methods
.method public constructor <init>(Landroidx/health/platform/client/proto/z0;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    iput-object p1, p0, Landroidx/health/platform/client/proto/i3;->w:Landroidx/health/platform/client/proto/z0;

    return-void
.end method


# virtual methods
.method public final M0(Landroidx/health/platform/client/proto/h;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final b()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Landroidx/health/platform/client/proto/i3;->w:Landroidx/health/platform/client/proto/z0;

    iget-object v0, v0, Landroidx/health/platform/client/proto/z0;->x:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/health/platform/client/proto/i3;->w:Landroidx/health/platform/client/proto/z0;

    invoke-virtual {v0, p1}, Landroidx/health/platform/client/proto/z0;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, Landroidx/health/platform/client/proto/h3;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Landroidx/health/platform/client/proto/i3;->w:Landroidx/health/platform/client/proto/z0;

    invoke-virtual {v1}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    iput-object v1, v0, Landroidx/health/platform/client/proto/h3;->w:Ljava/util/Iterator;

    return-object v0
.end method

.method public final k()Landroidx/health/platform/client/proto/a1;
    .locals 0

    return-object p0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 2

    new-instance v0, Landroidx/health/platform/client/proto/g3;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Landroidx/health/platform/client/proto/i3;->w:Landroidx/health/platform/client/proto/z0;

    invoke-virtual {v1, p1}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p1

    iput-object p1, v0, Landroidx/health/platform/client/proto/g3;->w:Ljava/util/ListIterator;

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Landroidx/health/platform/client/proto/i3;->w:Landroidx/health/platform/client/proto/z0;

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/z0;->size()I

    move-result v0

    return v0
.end method

.method public final x(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/health/platform/client/proto/i3;->w:Landroidx/health/platform/client/proto/z0;

    iget-object v0, v0, Landroidx/health/platform/client/proto/z0;->x:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
