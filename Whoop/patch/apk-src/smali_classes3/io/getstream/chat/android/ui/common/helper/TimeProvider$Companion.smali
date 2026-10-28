.class public final Lio/getstream/chat/android/ui/common/helper/TimeProvider$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/common/helper/TimeProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0006\u0010\u0003\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/helper/TimeProvider$Companion;",
        "",
        "<init>",
        "()V",
        "DEFAULT",
        "Lio/getstream/chat/android/ui/common/helper/TimeProvider;",
        "getDEFAULT$annotations",
        "getDEFAULT",
        "()Lio/getstream/chat/android/ui/common/helper/TimeProvider;",
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
.field static final synthetic $$INSTANCE:Lio/getstream/chat/android/ui/common/helper/TimeProvider$Companion;

.field private static final DEFAULT:Lio/getstream/chat/android/ui/common/helper/TimeProvider;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/common/helper/TimeProvider$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/common/helper/TimeProvider$Companion;->$$INSTANCE:Lio/getstream/chat/android/ui/common/helper/TimeProvider$Companion;

    sget-object v0, Lio/getstream/chat/android/ui/common/helper/TimeProvider$Companion$DEFAULT$1;->INSTANCE:Lio/getstream/chat/android/ui/common/helper/TimeProvider$Companion$DEFAULT$1;

    sput-object v0, Lio/getstream/chat/android/ui/common/helper/TimeProvider$Companion;->DEFAULT:Lio/getstream/chat/android/ui/common/helper/TimeProvider;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic getDEFAULT$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final getDEFAULT()Lio/getstream/chat/android/ui/common/helper/TimeProvider;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/common/helper/TimeProvider$Companion;->DEFAULT:Lio/getstream/chat/android/ui/common/helper/TimeProvider;

    return-object v0
.end method
