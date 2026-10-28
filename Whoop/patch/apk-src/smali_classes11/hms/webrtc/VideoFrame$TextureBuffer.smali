.class public interface abstract Lhms/webrtc/VideoFrame$TextureBuffer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/VideoFrame$Buffer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhms/webrtc/VideoFrame;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "TextureBuffer"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhms/webrtc/VideoFrame$TextureBuffer$Type;
    }
.end annotation


# virtual methods
.method public applyTransformMatrix(Landroid/graphics/Matrix;II)Lhms/webrtc/VideoFrame$TextureBuffer;
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Not implemented"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract getTextureId()I
.end method

.method public abstract getTransformMatrix()Landroid/graphics/Matrix;
.end method

.method public abstract getType()Lhms/webrtc/VideoFrame$TextureBuffer$Type;
.end method
