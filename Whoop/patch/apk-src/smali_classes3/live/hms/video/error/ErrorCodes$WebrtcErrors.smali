.class public final Llive/hms/video/error/ErrorCodes$WebrtcErrors;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/error/ErrorCodes;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "WebrtcErrors"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Llive/hms/video/error/ErrorCodes$WebrtcErrors;",
        "",
        "<init>",
        "()V",
        "cCreateOfferFailed",
        "",
        "cCreateAnswerFailed",
        "cSetLocalDescriptionFailed",
        "cSetRemoteDescriptionFailed",
        "cICEFailure",
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
.field public static final INSTANCE:Llive/hms/video/error/ErrorCodes$WebrtcErrors;

.field public static final cCreateAnswerFailed:I = 0xfa2

.field public static final cCreateOfferFailed:I = 0xfa1

.field public static final cICEFailure:I = 0xfa5

.field public static final cSetLocalDescriptionFailed:I = 0xfa3

.field public static final cSetRemoteDescriptionFailed:I = 0xfa4


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Llive/hms/video/error/ErrorCodes$WebrtcErrors;

    invoke-direct {v0}, Llive/hms/video/error/ErrorCodes$WebrtcErrors;-><init>()V

    sput-object v0, Llive/hms/video/error/ErrorCodes$WebrtcErrors;->INSTANCE:Llive/hms/video/error/ErrorCodes$WebrtcErrors;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
