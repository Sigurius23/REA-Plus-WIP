.class public final Lio/getstream/chat/android/models/NoOpChannelTransformer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/models/ChannelTransformer;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "Lio/getstream/chat/android/models/NoOpChannelTransformer;",
        "Lio/getstream/chat/android/models/ChannelTransformer;",
        "<init>",
        "()V",
        "transform",
        "Lio/getstream/chat/android/models/Channel;",
        "channel",
        "stream-chat-android-core"
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
.field public static final INSTANCE:Lio/getstream/chat/android/models/NoOpChannelTransformer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/models/NoOpChannelTransformer;

    invoke-direct {v0}, Lio/getstream/chat/android/models/NoOpChannelTransformer;-><init>()V

    sput-object v0, Lio/getstream/chat/android/models/NoOpChannelTransformer;->INSTANCE:Lio/getstream/chat/android/models/NoOpChannelTransformer;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public transform(Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/models/Channel;
    .locals 1

    const-string v0, "channel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
