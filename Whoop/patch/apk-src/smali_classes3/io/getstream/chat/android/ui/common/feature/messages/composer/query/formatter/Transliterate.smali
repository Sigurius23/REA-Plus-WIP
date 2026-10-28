.class public final Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/Transliterate;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/QueryFormatter;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/Transliterate;",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/QueryFormatter;",
        "transliterator",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/StreamTransliterator;",
        "<init>",
        "(Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/StreamTransliterator;)V",
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
.field private final transliterator:Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/StreamTransliterator;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/Transliterate;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/StreamTransliterator;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/StreamTransliterator;)V
    .locals 1

    const-string v0, "transliterator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/Transliterate;->transliterator:Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/StreamTransliterator;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/StreamTransliterator;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    .line 4
    new-instance p1, Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/DefaultStreamTransliterator;

    const/4 p2, 0x0

    invoke-direct {p1, p2, p3, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/DefaultStreamTransliterator;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/Transliterate;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/StreamTransliterator;)V

    return-void
.end method


# virtual methods
.method public final format(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/Transliterate;->transliterator:Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/StreamTransliterator;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/StreamTransliterator;->transliterate(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
