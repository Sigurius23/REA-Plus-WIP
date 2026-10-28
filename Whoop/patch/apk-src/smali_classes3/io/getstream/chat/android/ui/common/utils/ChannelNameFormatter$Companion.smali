.class public final Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0003\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\tH\u0007\u00a8\u0006\u000b"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter$Companion;",
        "",
        "<init>",
        "()V",
        "defaultFormatter",
        "Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;",
        "context",
        "Landroid/content/Context;",
        "fallback",
        "",
        "maxMembers",
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
.field static final synthetic $$INSTANCE:Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter$Companion;->$$INSTANCE:Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic defaultFormatter$default(Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter$Companion;Landroid/content/Context;IIILjava/lang/Object;)Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    sget p2, Lio/getstream/chat/android/ui/common/R$string;->stream_ui_channel_list_untitled_channel:I

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x2

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter$Companion;->defaultFormatter(Landroid/content/Context;II)Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final defaultFormatter(Landroid/content/Context;)Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;
    .locals 7

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter$Companion;->defaultFormatter$default(Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter$Companion;Landroid/content/Context;IIILjava/lang/Object;)Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;

    move-result-object p1

    return-object p1
.end method

.method public final defaultFormatter(Landroid/content/Context;I)Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;
    .locals 7

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    invoke-static/range {v1 .. v6}, Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter$Companion;->defaultFormatter$default(Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter$Companion;Landroid/content/Context;IIILjava/lang/Object;)Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;

    move-result-object p1

    return-object p1
.end method

.method public final defaultFormatter(Landroid/content/Context;II)Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Lio/getstream/chat/android/ui/common/utils/DefaultChannelNameFormatter;

    invoke-direct {v0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/utils/DefaultChannelNameFormatter;-><init>(Landroid/content/Context;II)V

    return-object v0
.end method
