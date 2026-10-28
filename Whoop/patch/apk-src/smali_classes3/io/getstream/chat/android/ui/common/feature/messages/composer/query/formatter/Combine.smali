.class public final Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/Combine;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/QueryFormatter;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001d\u0008\u0016\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0007J\u0010\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/Combine;",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/QueryFormatter;",
        "transformers",
        "",
        "<init>",
        "(Ljava/util/List;)V",
        "",
        "([Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/QueryFormatter;)V",
        "format",
        "",
        "query",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final transformers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/QueryFormatter;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/QueryFormatter;",
            ">;)V"
        }
    .end annotation

    const-string v0, "transformers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/Combine;->transformers:Ljava/util/List;

    return-void
.end method

.method public varargs constructor <init>([Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/QueryFormatter;)V
    .locals 1

    const-string v0, "transformers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-static {p1}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/Combine;-><init>(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public final format(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/Combine;->transformers:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/QueryFormatter;

    invoke-interface {v1, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/QueryFormatter;->format(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    return-object p1
.end method
