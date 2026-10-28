.class public interface abstract Lz8/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu8/h;


# virtual methods
.method public abstract addTransferListener(Lz8/n;)V
.end method

.method public abstract close()V
.end method

.method public getResponseHeaders()Ljava/util/Map;
    .locals 1

    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    return-object v0
.end method

.method public abstract getUri()Landroid/net/Uri;
.end method

.method public abstract open(Lz8/g;)J
.end method
