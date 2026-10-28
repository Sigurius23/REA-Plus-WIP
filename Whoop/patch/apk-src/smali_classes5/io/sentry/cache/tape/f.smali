.class public abstract Lio/sentry/cache/tape/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ljava/io/Closeable;


# virtual methods
.method public final F0()Ljava/util/List;
    .locals 5

    invoke-virtual {p0}, Lio/sentry/cache/tape/f;->size()I

    move-result v0

    invoke-virtual {p0}, Lio/sentry/cache/tape/f;->size()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public abstract R0(I)V
.end method

.method public clear()V
    .locals 1

    invoke-virtual {p0}, Lio/sentry/cache/tape/f;->size()I

    move-result v0

    invoke-virtual {p0, v0}, Lio/sentry/cache/tape/f;->R0(I)V

    return-void
.end method

.method public abstract m(Ljava/lang/Object;)V
.end method

.method public abstract size()I
.end method
