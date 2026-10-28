.class public final Lhms/webrtc/IceCandidateErrorEvent;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final address:Ljava/lang/String;

.field public final errorCode:I

.field public final errorText:Ljava/lang/String;

.field public final port:I

.field public final url:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation build Lhms/webrtc/CalledByNative;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhms/webrtc/IceCandidateErrorEvent;->address:Ljava/lang/String;

    iput p2, p0, Lhms/webrtc/IceCandidateErrorEvent;->port:I

    iput-object p3, p0, Lhms/webrtc/IceCandidateErrorEvent;->url:Ljava/lang/String;

    iput p4, p0, Lhms/webrtc/IceCandidateErrorEvent;->errorCode:I

    iput-object p5, p0, Lhms/webrtc/IceCandidateErrorEvent;->errorText:Ljava/lang/String;

    return-void
.end method
