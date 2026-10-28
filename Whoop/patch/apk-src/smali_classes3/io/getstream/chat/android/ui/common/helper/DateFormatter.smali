.class public interface abstract Lio/getstream/chat/android/ui/common/helper/DateFormatter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/common/helper/DateFormatter$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008f\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u0012\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0007\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\n\u00c0\u0006\u0003"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/helper/DateFormatter;",
        "",
        "formatDate",
        "",
        "date",
        "Ljava/util/Date;",
        "formatTime",
        "formatRelativeTime",
        "formatRelativeDate",
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
.field public static final Companion:Lio/getstream/chat/android/ui/common/helper/DateFormatter$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/common/helper/DateFormatter$Companion;->$$INSTANCE:Lio/getstream/chat/android/ui/common/helper/DateFormatter$Companion;

    sput-object v0, Lio/getstream/chat/android/ui/common/helper/DateFormatter;->Companion:Lio/getstream/chat/android/ui/common/helper/DateFormatter$Companion;

    return-void
.end method

.method public static from(Landroid/content/Context;)Lio/getstream/chat/android/ui/common/helper/DateFormatter;
    .locals 1

    .line 1
    sget-object v0, Lio/getstream/chat/android/ui/common/helper/DateFormatter;->Companion:Lio/getstream/chat/android/ui/common/helper/DateFormatter$Companion;

    invoke-virtual {v0, p0}, Lio/getstream/chat/android/ui/common/helper/DateFormatter$Companion;->from(Landroid/content/Context;)Lio/getstream/chat/android/ui/common/helper/DateFormatter;

    move-result-object p0

    return-object p0
.end method

.method public static from(Landroid/content/Context;Ljava/util/Locale;)Lio/getstream/chat/android/ui/common/helper/DateFormatter;
    .locals 1

    .line 2
    sget-object v0, Lio/getstream/chat/android/ui/common/helper/DateFormatter;->Companion:Lio/getstream/chat/android/ui/common/helper/DateFormatter$Companion;

    invoke-virtual {v0, p0, p1}, Lio/getstream/chat/android/ui/common/helper/DateFormatter$Companion;->from(Landroid/content/Context;Ljava/util/Locale;)Lio/getstream/chat/android/ui/common/helper/DateFormatter;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract formatDate(Ljava/util/Date;)Ljava/lang/String;
.end method

.method public abstract formatRelativeDate(Ljava/util/Date;)Ljava/lang/String;
.end method

.method public abstract formatRelativeTime(Ljava/util/Date;)Ljava/lang/String;
.end method

.method public abstract formatTime(Ljava/util/Date;)Ljava/lang/String;
.end method
