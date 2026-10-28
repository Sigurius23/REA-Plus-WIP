.class public final Llive/hms/video/sdk/featureflags/Features$SOFTWARE_ECHO_CANCELLATION_ENABLED;
.super Llive/hms/video/sdk/featureflags/Features;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/sdk/featureflags/Features;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SOFTWARE_ECHO_CANCELLATION_ENABLED"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Llive/hms/video/sdk/featureflags/Features$SOFTWARE_ECHO_CANCELLATION_ENABLED;",
        "Llive/hms/video/sdk/featureflags/Features;",
        "<init>",
        "()V",
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
.field public static final INSTANCE:Llive/hms/video/sdk/featureflags/Features$SOFTWARE_ECHO_CANCELLATION_ENABLED;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Llive/hms/video/sdk/featureflags/Features$SOFTWARE_ECHO_CANCELLATION_ENABLED;

    invoke-direct {v0}, Llive/hms/video/sdk/featureflags/Features$SOFTWARE_ECHO_CANCELLATION_ENABLED;-><init>()V

    sput-object v0, Llive/hms/video/sdk/featureflags/Features$SOFTWARE_ECHO_CANCELLATION_ENABLED;->INSTANCE:Llive/hms/video/sdk/featureflags/Features$SOFTWARE_ECHO_CANCELLATION_ENABLED;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    const-string v0, "softwareEchoCancellationEnabled"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Llive/hms/video/sdk/featureflags/Features;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
