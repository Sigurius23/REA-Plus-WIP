.class public final Llive/hms/video/error/ErrorCodes$WebSocketConnectionErrors;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/error/ErrorCodes;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "WebSocketConnectionErrors"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "Llive/hms/video/error/ErrorCodes$WebSocketConnectionErrors;",
        "",
        "<init>",
        "()V",
        "cGenericConnect",
        "",
        "cWebSocketConnectionLost",
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
.field public static final INSTANCE:Llive/hms/video/error/ErrorCodes$WebSocketConnectionErrors;

.field public static final cGenericConnect:I = 0x3e8

.field public static final cWebSocketConnectionLost:I = 0x3eb


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Llive/hms/video/error/ErrorCodes$WebSocketConnectionErrors;

    invoke-direct {v0}, Llive/hms/video/error/ErrorCodes$WebSocketConnectionErrors;-><init>()V

    sput-object v0, Llive/hms/video/error/ErrorCodes$WebSocketConnectionErrors;->INSTANCE:Llive/hms/video/error/ErrorCodes$WebSocketConnectionErrors;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
