.class public interface abstract Llive/hms/video/plugin/video/virtualbackground/HmsVirtualBackgroundInterface;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/plugin/video/HMSVideoPlugin;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/plugin/video/virtualbackground/HmsVirtualBackgroundInterface$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH&\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Llive/hms/video/plugin/video/virtualbackground/HmsVirtualBackgroundInterface;",
        "Llive/hms/video/plugin/video/HMSVideoPlugin;",
        "",
        "getCurrentBlurPercentage",
        "()I",
        "blurPercentage",
        "Ll83/a0;",
        "enableBlur",
        "(I)V",
        "Landroid/graphics/Bitmap;",
        "bitmap",
        "enableBackground",
        "(Landroid/graphics/Bitmap;)V",
        "disableEffects",
        "()V",
        "Llive/hms/video/plugin/video/virtualbackground/VideoFrameInfoListener;",
        "listener",
        "setVideoFrameInfoListener",
        "(Llive/hms/video/plugin/video/virtualbackground/VideoFrameInfoListener;)V",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract disableEffects()V
.end method

.method public abstract enableBackground(Landroid/graphics/Bitmap;)V
.end method

.method public abstract enableBlur(I)V
.end method

.method public abstract getCurrentBlurPercentage()I
.end method

.method public abstract setVideoFrameInfoListener(Llive/hms/video/plugin/video/virtualbackground/VideoFrameInfoListener;)V
.end method
