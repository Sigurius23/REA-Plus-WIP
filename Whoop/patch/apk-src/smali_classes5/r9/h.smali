.class public final Lr9/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lu8/x0;


# direct methods
.method public constructor <init>(Lu8/x0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr9/h;->a:Lu8/x0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    :try_start_0
    const-string v0, "androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lu8/x0;

    filled-new-array {v1}, [Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    iget-object v1, p0, Lr9/h;->a:Lu8/x0;

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr9/h;

    invoke-virtual {v0}, Lr9/h;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    instance-of v1, v0, Landroidx/media3/common/VideoFrameProcessingException;

    if-eqz v1, :cond_0

    sget v1, Landroidx/media3/common/VideoFrameProcessingException;->w:I

    check-cast v0, Landroidx/media3/common/VideoFrameProcessingException;

    goto :goto_0

    :cond_0
    new-instance v1, Landroidx/media3/common/VideoFrameProcessingException;

    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    move-object v0, v1

    :goto_0
    throw v0
.end method
