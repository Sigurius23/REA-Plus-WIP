.class public abstract Lyy/m0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private postHeaders:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final shouldCache:Z


# virtual methods
.method public abstract getHeaders()Ljava/util/Map;
.end method

.method public abstract getMethod()Lyy/k0;
.end method

.method public getPostHeaders()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lyy/m0;->postHeaders:Ljava/util/Map;

    return-object v0
.end method

.method public abstract getRetryResponseCodes()Ljava/lang/Iterable;
.end method

.method public getShouldCache()Z
    .locals 1

    iget-boolean v0, p0, Lyy/m0;->shouldCache:Z

    return v0
.end method

.method public abstract getUrl()Ljava/lang/String;
.end method

.method public setPostHeaders(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lyy/m0;->postHeaders:Ljava/util/Map;

    return-void
.end method

.method public writePostBody(Ljava/io/OutputStream;)V
    .locals 0

    return-void
.end method
