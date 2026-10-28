.class public final Lio/getstream/chat/android/client/parser2/adapters/EventAdapterFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqx/s;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J5\u0010\u000c\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0008\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lio/getstream/chat/android/client/parser2/adapters/EventAdapterFactory;",
        "Lqx/s;",
        "<init>",
        "()V",
        "Ljava/lang/reflect/Type;",
        "type",
        "",
        "",
        "annotations",
        "Lqx/l0;",
        "moshi",
        "Lcom/squareup/moshi/JsonAdapter;",
        "create",
        "(Ljava/lang/reflect/Type;Ljava/util/Set;Lqx/l0;)Lcom/squareup/moshi/JsonAdapter;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/reflect/Type;Ljava/util/Set;Lqx/l0;)Lcom/squareup/moshi/JsonAdapter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "Ljava/util/Set<",
            "+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Lqx/l0;",
            ")",
            "Lcom/squareup/moshi/JsonAdapter<",
            "*>;"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotations"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "moshi"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/room/c1;->z(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p1

    const-string p2, "getRawType(this)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-class p2, Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;

    invoke-direct {p1, p3}, Lio/getstream/chat/android/client/parser2/adapters/EventDtoAdapter;-><init>(Lqx/l0;)V

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
