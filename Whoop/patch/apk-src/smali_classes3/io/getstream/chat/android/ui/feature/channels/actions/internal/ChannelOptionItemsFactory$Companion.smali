.class public final Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelOptionItemsFactory$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelOptionItemsFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelOptionItemsFactory$Companion;",
        "",
        "<init>",
        "()V",
        "defaultFactory",
        "Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelOptionItemsFactory;",
        "context",
        "Landroid/content/Context;",
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


# static fields
.field static final synthetic $$INSTANCE:Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelOptionItemsFactory$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelOptionItemsFactory$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelOptionItemsFactory$Companion;->$$INSTANCE:Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelOptionItemsFactory$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final defaultFactory(Landroid/content/Context;)Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelOptionItemsFactory;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/DefaultChannelOptionItemsFactory;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/actions/internal/DefaultChannelOptionItemsFactory;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
