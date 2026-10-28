.class public Lhms/webrtc/PeerConnectionFactory$InitializationOptions$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhms/webrtc/PeerConnectionFactory$InitializationOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private final applicationContext:Landroid/content/Context;

.field private enableInternalTracer:Z

.field private fieldTrials:Ljava/lang/String;

.field private loggable:Lhms/webrtc/Loggable;

.field private loggableSeverity:Lhms/webrtc/Logging$Severity;

.field private nativeLibraryLoader:Lhms/webrtc/NativeLibraryLoader;

.field private nativeLibraryName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lhms/webrtc/PeerConnectionFactory$InitializationOptions$Builder;->fieldTrials:Ljava/lang/String;

    new-instance v0, Lhms/webrtc/NativeLibrary$DefaultLoader;

    invoke-direct {v0}, Lhms/webrtc/NativeLibrary$DefaultLoader;-><init>()V

    iput-object v0, p0, Lhms/webrtc/PeerConnectionFactory$InitializationOptions$Builder;->nativeLibraryLoader:Lhms/webrtc/NativeLibraryLoader;

    const-string v0, "hmsjingle_peerconnection_so"

    iput-object v0, p0, Lhms/webrtc/PeerConnectionFactory$InitializationOptions$Builder;->nativeLibraryName:Ljava/lang/String;

    iput-object p1, p0, Lhms/webrtc/PeerConnectionFactory$InitializationOptions$Builder;->applicationContext:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public createInitializationOptions()Lhms/webrtc/PeerConnectionFactory$InitializationOptions;
    .locals 9

    new-instance v0, Lhms/webrtc/PeerConnectionFactory$InitializationOptions;

    iget-object v1, p0, Lhms/webrtc/PeerConnectionFactory$InitializationOptions$Builder;->applicationContext:Landroid/content/Context;

    iget-object v2, p0, Lhms/webrtc/PeerConnectionFactory$InitializationOptions$Builder;->fieldTrials:Ljava/lang/String;

    iget-boolean v3, p0, Lhms/webrtc/PeerConnectionFactory$InitializationOptions$Builder;->enableInternalTracer:Z

    iget-object v4, p0, Lhms/webrtc/PeerConnectionFactory$InitializationOptions$Builder;->nativeLibraryLoader:Lhms/webrtc/NativeLibraryLoader;

    iget-object v5, p0, Lhms/webrtc/PeerConnectionFactory$InitializationOptions$Builder;->nativeLibraryName:Ljava/lang/String;

    iget-object v6, p0, Lhms/webrtc/PeerConnectionFactory$InitializationOptions$Builder;->loggable:Lhms/webrtc/Loggable;

    iget-object v7, p0, Lhms/webrtc/PeerConnectionFactory$InitializationOptions$Builder;->loggableSeverity:Lhms/webrtc/Logging$Severity;

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Lhms/webrtc/PeerConnectionFactory$InitializationOptions;-><init>(Landroid/content/Context;Ljava/lang/String;ZLhms/webrtc/NativeLibraryLoader;Ljava/lang/String;Lhms/webrtc/Loggable;Lhms/webrtc/Logging$Severity;I)V

    return-object v0
.end method

.method public setEnableInternalTracer(Z)Lhms/webrtc/PeerConnectionFactory$InitializationOptions$Builder;
    .locals 0

    iput-boolean p1, p0, Lhms/webrtc/PeerConnectionFactory$InitializationOptions$Builder;->enableInternalTracer:Z

    return-object p0
.end method

.method public setFieldTrials(Ljava/lang/String;)Lhms/webrtc/PeerConnectionFactory$InitializationOptions$Builder;
    .locals 0

    iput-object p1, p0, Lhms/webrtc/PeerConnectionFactory$InitializationOptions$Builder;->fieldTrials:Ljava/lang/String;

    return-object p0
.end method

.method public setInjectableLogger(Lhms/webrtc/Loggable;Lhms/webrtc/Logging$Severity;)Lhms/webrtc/PeerConnectionFactory$InitializationOptions$Builder;
    .locals 0

    iput-object p1, p0, Lhms/webrtc/PeerConnectionFactory$InitializationOptions$Builder;->loggable:Lhms/webrtc/Loggable;

    iput-object p2, p0, Lhms/webrtc/PeerConnectionFactory$InitializationOptions$Builder;->loggableSeverity:Lhms/webrtc/Logging$Severity;

    return-object p0
.end method

.method public setNativeLibraryLoader(Lhms/webrtc/NativeLibraryLoader;)Lhms/webrtc/PeerConnectionFactory$InitializationOptions$Builder;
    .locals 0

    iput-object p1, p0, Lhms/webrtc/PeerConnectionFactory$InitializationOptions$Builder;->nativeLibraryLoader:Lhms/webrtc/NativeLibraryLoader;

    return-object p0
.end method

.method public setNativeLibraryName(Ljava/lang/String;)Lhms/webrtc/PeerConnectionFactory$InitializationOptions$Builder;
    .locals 0

    iput-object p1, p0, Lhms/webrtc/PeerConnectionFactory$InitializationOptions$Builder;->nativeLibraryName:Ljava/lang/String;

    return-object p0
.end method
