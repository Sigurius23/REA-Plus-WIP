.class public interface abstract Lio/getstream/chat/android/ui/common/helper/TimeProvider;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/common/helper/TimeProvider$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0004\u0008\u00e6\u0080\u0001\u0018\u0000 \u00052\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005J\u000e\u0010\u0003\u001a\u00020\u0002H\u00a6\u0002\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0006\u00c0\u0006\u0003"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/helper/TimeProvider;",
        "Lkotlin/Function0;",
        "",
        "invoke",
        "()Ljava/lang/Long;",
        "Companion",
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
.field public static final Companion:Lio/getstream/chat/android/ui/common/helper/TimeProvider$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/common/helper/TimeProvider$Companion;->$$INSTANCE:Lio/getstream/chat/android/ui/common/helper/TimeProvider$Companion;

    sput-object v0, Lio/getstream/chat/android/ui/common/helper/TimeProvider;->Companion:Lio/getstream/chat/android/ui/common/helper/TimeProvider$Companion;

    return-void
.end method

.method public static getDEFAULT()Lio/getstream/chat/android/ui/common/helper/TimeProvider;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/common/helper/TimeProvider;->Companion:Lio/getstream/chat/android/ui/common/helper/TimeProvider$Companion;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/helper/TimeProvider$Companion;->getDEFAULT()Lio/getstream/chat/android/ui/common/helper/TimeProvider;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract invoke()Ljava/lang/Long;
.end method

.method public abstract synthetic invoke()Ljava/lang/Object;
.end method
