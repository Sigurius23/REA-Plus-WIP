.class public abstract Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Mode"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode$AutoOn;,
        Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode$Available;,
        Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode$Companion;,
        Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode$Disabled;,
        Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode$ModeAdapter;,
        Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode$Unknown;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u0000 \n2\u00020\u0001:\u0006\u0008\t\n\u000b\u000c\rB\u000f\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u0082\u0001\u0004\u000e\u000f\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode;",
        "",
        "value",
        "",
        "(Ljava/lang/String;)V",
        "getValue",
        "()Ljava/lang/String;",
        "toString",
        "AutoOn",
        "Available",
        "Companion",
        "Disabled",
        "ModeAdapter",
        "Unknown",
        "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode$AutoOn;",
        "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode$Available;",
        "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode$Disabled;",
        "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode$Unknown;",
        "stream-video-android-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode$Companion;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode;->Companion:Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode;->value:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode;->value:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode;->value:Ljava/lang/String;

    return-object v0
.end method
