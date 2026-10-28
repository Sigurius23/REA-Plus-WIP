.class public final Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility$Always;
.super Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Always"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility$Always;",
        "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;",
        "<init>",
        "()V",
        "toString",
        "",
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
.field public static final $stable:I

.field public static final INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility$Always;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility$Always;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility$Always;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility$Always;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Always"

    return-object v0
.end method
