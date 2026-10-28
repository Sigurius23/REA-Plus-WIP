.class public final Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0008R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser$Companion;",
        "",
        "<init>",
        "()V",
        "instance",
        "Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser;",
        "get",
        "isInitialized",
        "",
        "stream-chat-android-client_release"
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
.field static final synthetic $$INSTANCE:Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser$Companion;

.field private static instance:Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser$Companion;->$$INSTANCE:Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser;
    .locals 3

    sget-object v0, Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser$Companion;->instance:Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser;

    if-nez v0, :cond_0

    new-instance v0, Lio/getstream/chat/android/client/plugins/requests/ApiRequestsDumper;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, v2}, Lio/getstream/chat/android/client/plugins/requests/ApiRequestsDumper;-><init>(Ljava/text/DateFormat;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser$Companion;->instance:Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser;

    :cond_0
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser$Companion;->instance:Lio/getstream/chat/android/client/plugins/requests/ApiRequestsAnalyser;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
