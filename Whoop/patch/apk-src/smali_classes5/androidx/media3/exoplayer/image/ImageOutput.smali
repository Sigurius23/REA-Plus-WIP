.class public interface abstract Landroidx/media3/exoplayer/image/ImageOutput;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lh9/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lh9/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/media3/exoplayer/image/ImageOutput;->a:Lh9/d;

    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method public abstract onImageAvailable(JLandroid/graphics/Bitmap;)V
.end method
