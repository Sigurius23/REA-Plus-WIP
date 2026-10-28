.class public final Lio/getstream/chat/android/ui/common/helper/DurationFormatter$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/common/helper/DurationFormatter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/helper/DurationFormatter$Companion;",
        "",
        "<init>",
        "()V",
        "defaultFormatter",
        "Lio/getstream/chat/android/ui/common/helper/DurationFormatter;",
        "stream-chat-android-ui-common_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field static final synthetic $$INSTANCE:Lio/getstream/chat/android/ui/common/helper/DurationFormatter$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/common/helper/DurationFormatter$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/common/helper/DurationFormatter$Companion;->$$INSTANCE:Lio/getstream/chat/android/ui/common/helper/DurationFormatter$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final defaultFormatter()Lio/getstream/chat/android/ui/common/helper/DurationFormatter;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/common/helper/DefaultDurationFormatter;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0
.end method
