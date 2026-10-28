.class public final Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ConverterMoshiInstanceKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\" \u0010\u0001\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0001\u0010\u0002\u0012\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0007"
    }
    d2 = {
        "Lqx/l0;",
        "moshi",
        "Lqx/l0;",
        "getMoshi",
        "()Lqx/l0;",
        "getMoshi$annotations",
        "()V",
        "stream-chat-android-client_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final moshi:Lqx/l0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lqx/i0;

    invoke-direct {v0}, Lqx/i0;-><init>()V

    new-instance v1, Lio/getstream/chat/android/client/parser2/adapters/DateAdapter;

    invoke-direct {v1}, Lio/getstream/chat/android/client/parser2/adapters/DateAdapter;-><init>()V

    const-class v2, Ljava/util/Date;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->d(Ljava/lang/Class;)Lj93/a0;

    move-result-object v2

    invoke-static {v2}, Lj93/l0;->B(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lqx/i0;->b(Ljava/lang/reflect/Type;Lcom/squareup/moshi/JsonAdapter;)V

    new-instance v1, Lsx/c;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v1}, Lqx/i0;->c(Lqx/s;)V

    sget-object v1, Lqx/n0;->d:Lqx/m0;

    invoke-virtual {v0, v1}, Lqx/i0;->c(Lqx/s;)V

    new-instance v1, Lqx/l0;

    invoke-direct {v1, v0}, Lqx/l0;-><init>(Lqx/i0;)V

    sput-object v1, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ConverterMoshiInstanceKt;->moshi:Lqx/l0;

    return-void
.end method

.method public static final getMoshi()Lqx/l0;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ConverterMoshiInstanceKt;->moshi:Lqx/l0;

    return-object v0
.end method

.method public static synthetic getMoshi$annotations()V
    .locals 0

    return-void
.end method
