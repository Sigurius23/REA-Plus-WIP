.class public final Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/IgnoreDiacritics;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/QueryFormatter;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/IgnoreDiacritics;",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/QueryFormatter;",
        "<init>",
        "()V",
        "",
        "removeDiacritics",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "query",
        "format",
        "Lyb3/p;",
        "diacriticsRegex",
        "Lyb3/p;",
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
.field private final diacriticsRegex:Lyb3/p;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lyb3/p;

    const-string v1, "\\p{InCombiningDiacriticalMarks}+"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/IgnoreDiacritics;->diacriticsRegex:Lyb3/p;

    return-void
.end method

.method private final removeDiacritics(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    sget-object v0, Ljava/text/Normalizer$Form;->NFD:Ljava/text/Normalizer$Form;

    invoke-static {p1, v0}, Ljava/text/Normalizer;->normalize(Ljava/lang/CharSequence;Ljava/text/Normalizer$Form;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/IgnoreDiacritics;->diacriticsRegex:Lyb3/p;

    const-string v1, ""

    invoke-virtual {v0, p1, v1}, Lyb3/p;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final format(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/IgnoreDiacritics;->removeDiacritics(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
