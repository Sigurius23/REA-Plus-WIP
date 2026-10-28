.class public final Llive/hms/video/utils/SharedEglContext;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u001b\u0010\u0008\u001a\n \u0006*\u0004\u0018\u00010\t0\t\u00a2\u0006\n\n\u0002\u0010\u000c\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Llive/hms/video/utils/SharedEglContext;",
        "",
        "<init>",
        "()V",
        "base",
        "Lhms/webrtc/EglBase;",
        "kotlin.jvm.PlatformType",
        "Lhms/webrtc/EglBase;",
        "context",
        "Lhms/webrtc/EglBase$Context;",
        "getContext",
        "()Lhms/webrtc/EglBase$Context;",
        "Lhms/webrtc/EglBase$Context;",
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


# static fields
.field public static final INSTANCE:Llive/hms/video/utils/SharedEglContext;

.field private static final base:Lhms/webrtc/EglBase;

.field private static final context:Lhms/webrtc/EglBase$Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Llive/hms/video/utils/SharedEglContext;

    invoke-direct {v0}, Llive/hms/video/utils/SharedEglContext;-><init>()V

    sput-object v0, Llive/hms/video/utils/SharedEglContext;->INSTANCE:Llive/hms/video/utils/SharedEglContext;

    invoke-static {}, Lhms/webrtc/EglBase;->create()Lhms/webrtc/EglBase;

    move-result-object v0

    sput-object v0, Llive/hms/video/utils/SharedEglContext;->base:Lhms/webrtc/EglBase;

    invoke-interface {v0}, Lhms/webrtc/EglBase;->getEglBaseContext()Lhms/webrtc/EglBase$Context;

    move-result-object v0

    sput-object v0, Llive/hms/video/utils/SharedEglContext;->context:Lhms/webrtc/EglBase$Context;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getContext()Lhms/webrtc/EglBase$Context;
    .locals 1

    sget-object v0, Llive/hms/video/utils/SharedEglContext;->context:Lhms/webrtc/EglBase$Context;

    return-object v0
.end method
