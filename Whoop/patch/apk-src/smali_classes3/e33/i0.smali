.class public final Le33/i0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Le33/j0;


# direct methods
.method public constructor <init>(Le33/j0;)V
    .locals 0

    iput-object p1, p0, Le33/i0;->w:Le33/j0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    new-instance v0, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory;

    iget-object v1, p0, Le33/i0;->w:Le33/j0;

    iget-object v1, v1, Le33/j0;->d:Lt23/l;

    iget-object v1, v1, Lt23/l;->x:Lt23/c0;

    invoke-virtual {v1}, Lt23/c0;->f()Lorg/webrtc/EglBase;

    move-result-object v1

    invoke-interface {v1}, Lorg/webrtc/EglBase;->getEglBaseContext()Lorg/webrtc/EglBase$Context;

    move-result-object v1

    const/4 v2, 0x1

    sget-object v3, Lorg/webrtc/ResolutionAdjustment;->MULTIPLE_OF_16:Lorg/webrtc/ResolutionAdjustment;

    invoke-direct {v0, v1, v2, v2, v3}, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory;-><init>(Lorg/webrtc/EglBase$Context;ZZLorg/webrtc/ResolutionAdjustment;)V

    return-object v0
.end method
