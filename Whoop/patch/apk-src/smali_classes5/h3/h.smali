.class public abstract synthetic Lh3/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroid/content/Context;)Landroid/media/MediaRecorder;
    .locals 1

    new-instance v0, Landroid/media/MediaRecorder;

    invoke-direct {v0, p0}, Landroid/media/MediaRecorder;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static synthetic b(Landroid/content/ClipData;I)Landroid/view/ContentInfo$Builder;
    .locals 1

    new-instance v0, Landroid/view/ContentInfo$Builder;

    invoke-direct {v0, p0, p1}, Landroid/view/ContentInfo$Builder;-><init>(Landroid/content/ClipData;I)V

    return-object v0
.end method

.method public static synthetic c(Landroidx/compose/ui/platform/AndroidComposeView;Landroid/graphics/Rect;Landroid/graphics/Point;Lh3/c;)Landroid/view/ScrollCaptureTarget;
    .locals 1

    new-instance v0, Landroid/view/ScrollCaptureTarget;

    invoke-direct {v0, p0, p1, p2, p3}, Landroid/view/ScrollCaptureTarget;-><init>(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Point;Landroid/view/ScrollCaptureCallback;)V

    return-object v0
.end method
