.class Lhms/webrtc/JNILogging;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final loggable:Lhms/webrtc/Loggable;


# direct methods
.method public constructor <init>(Lhms/webrtc/Loggable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhms/webrtc/JNILogging;->loggable:Lhms/webrtc/Loggable;

    return-void
.end method


# virtual methods
.method public logToInjectable(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 2
    .annotation build Lhms/webrtc/CalledByNative;
    .end annotation

    iget-object v0, p0, Lhms/webrtc/JNILogging;->loggable:Lhms/webrtc/Loggable;

    invoke-static {}, Lhms/webrtc/Logging$Severity;->values()[Lhms/webrtc/Logging$Severity;

    move-result-object v1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    aget-object p2, v1, p2

    invoke-interface {v0, p1, p2, p3}, Lhms/webrtc/Loggable;->onLogMessage(Ljava/lang/String;Lhms/webrtc/Logging$Severity;Ljava/lang/String;)V

    return-void
.end method
