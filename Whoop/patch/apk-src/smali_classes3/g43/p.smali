.class public interface abstract Lg43/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic d(Lg43/p;Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/util/Map;I)Landroid/app/Notification;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p4, 0x0

    goto :goto_0

    :cond_0
    const/4 p4, 0x1

    :goto_0
    invoke-interface {p0, p1, p2, p4, p3}, Lg43/p;->a(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;ZLjava/util/Map;)Landroid/app/Notification;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract a(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;ZLjava/util/Map;)Landroid/app/Notification;
.end method

.method public abstract g(Lt23/d3;Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;ZLjava/util/Map;)Landroid/app/Notification;
.end method

.method public abstract j(Ljava/lang/String;Lio/getstream/video/android/model/StreamCallId;)Landroid/app/Notification;
.end method
