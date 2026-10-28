.class public final Llive/hms/video/utils/HmsUtilities;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/utils/HmsUtilities$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Llive/hms/video/utils/HmsUtilities;",
        "",
        "<init>",
        "()V",
        "Companion",
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
.field public static final Companion:Llive/hms/video/utils/HmsUtilities$Companion;

.field private static final SOFTWARE_IMPLEMENTATION_PREFIXES:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Llive/hms/video/utils/HmsUtilities$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/utils/HmsUtilities$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/utils/HmsUtilities;->Companion:Llive/hms/video/utils/HmsUtilities$Companion;

    const-string v0, "OMX.SEC."

    const-string v1, "c2.android"

    const-string v2, "OMX.google."

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Llive/hms/video/utils/HmsUtilities;->SOFTWARE_IMPLEMENTATION_PREFIXES:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$getSOFTWARE_IMPLEMENTATION_PREFIXES$cp()[Ljava/lang/String;
    .locals 1

    sget-object v0, Llive/hms/video/utils/HmsUtilities;->SOFTWARE_IMPLEMENTATION_PREFIXES:[Ljava/lang/String;

    return-object v0
.end method
