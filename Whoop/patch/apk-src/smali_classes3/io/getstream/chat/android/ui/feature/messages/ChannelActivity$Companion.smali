.class public final Lio/getstream/chat/android/ui/feature/messages/ChannelActivity$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/ChannelActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J6\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00052\u0010\u0008\u0002\u0010\r\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u000f0\u000eH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/ChannelActivity$Companion;",
        "",
        "<init>",
        "()V",
        "EXTRA_CID",
        "",
        "EXTRA_MESSAGE_ID",
        "createIntent",
        "Landroid/content/Intent;",
        "context",
        "Landroid/content/Context;",
        "cid",
        "messageId",
        "activityClass",
        "Ljava/lang/Class;",
        "Lio/getstream/chat/android/ui/feature/messages/ChannelActivity;",
        "stream-chat-android-ui-components_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic createIntent$default(Lio/getstream/chat/android/ui/feature/messages/ChannelActivity$Companion;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;ILjava/lang/Object;)Landroid/content/Intent;
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    const/4 p3, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    const-class p4, Lio/getstream/chat/android/ui/feature/messages/ChannelActivity;

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/feature/messages/ChannelActivity$Companion;->createIntent(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final createIntent(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 8

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v7}, Lio/getstream/chat/android/ui/feature/messages/ChannelActivity$Companion;->createIntent$default(Lio/getstream/chat/android/ui/feature/messages/ChannelActivity$Companion;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;ILjava/lang/Object;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public final createIntent(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    .locals 8

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-static/range {v1 .. v7}, Lio/getstream/chat/android/ui/feature/messages/ChannelActivity$Companion;->createIntent$default(Lio/getstream/chat/android/ui/feature/messages/ChannelActivity$Companion;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;ILjava/lang/Object;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public final createIntent(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)Landroid/content/Intent;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lio/getstream/chat/android/ui/feature/messages/ChannelActivity;",
            ">;)",
            "Landroid/content/Intent;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityClass"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p1, p4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 4
    const-string p1, "extra_cid"

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 5
    const-string p1, "extra_message_id"

    invoke-virtual {v0, p1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-object v0
.end method
