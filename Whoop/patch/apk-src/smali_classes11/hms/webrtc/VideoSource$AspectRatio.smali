.class public Lhms/webrtc/VideoSource$AspectRatio;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhms/webrtc/VideoSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AspectRatio"
.end annotation


# static fields
.field public static final UNDEFINED:Lhms/webrtc/VideoSource$AspectRatio;


# instance fields
.field public final height:I

.field public final width:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhms/webrtc/VideoSource$AspectRatio;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lhms/webrtc/VideoSource$AspectRatio;-><init>(II)V

    sput-object v0, Lhms/webrtc/VideoSource$AspectRatio;->UNDEFINED:Lhms/webrtc/VideoSource$AspectRatio;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lhms/webrtc/VideoSource$AspectRatio;->width:I

    iput p2, p0, Lhms/webrtc/VideoSource$AspectRatio;->height:I

    return-void
.end method
