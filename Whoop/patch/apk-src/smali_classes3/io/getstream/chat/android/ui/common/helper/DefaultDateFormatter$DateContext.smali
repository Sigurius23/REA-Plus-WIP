.class public interface abstract Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "DateContext"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008f\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003H&J\u0008\u0010\u0007\u001a\u00020\u0008H&J\u0008\u0010\t\u001a\u00020\u0008H&J\u0008\u0010\n\u001a\u00020\u0005H&J\u0008\u0010\u000b\u001a\u00020\u0008H&J\u0010\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u000e\u00c0\u0006\u0003"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter$DateContext;",
        "",
        "now",
        "Ljava/util/Date;",
        "isWithinLastMinute",
        "",
        "date",
        "yesterdayString",
        "",
        "justNowString",
        "is24Hour",
        "dateTimePattern",
        "relativeTime",
        "relativeDate",
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


# virtual methods
.method public abstract dateTimePattern()Ljava/lang/String;
.end method

.method public abstract is24Hour()Z
.end method

.method public abstract isWithinLastMinute(Ljava/util/Date;)Z
.end method

.method public abstract justNowString()Ljava/lang/String;
.end method

.method public abstract now()Ljava/util/Date;
.end method

.method public abstract relativeDate(Ljava/util/Date;)Ljava/lang/String;
.end method

.method public abstract relativeTime(Ljava/util/Date;)Ljava/lang/String;
.end method

.method public abstract yesterdayString()Ljava/lang/String;
.end method
