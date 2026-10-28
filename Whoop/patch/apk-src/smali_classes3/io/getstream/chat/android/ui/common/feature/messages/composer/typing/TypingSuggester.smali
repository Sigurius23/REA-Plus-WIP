.class public final Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggester;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J!\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000bH\u0000\u00a2\u0006\u0002\u0008\u000cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggester;",
        "",
        "options",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggestionOptions;",
        "<init>",
        "(Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggestionOptions;)V",
        "typingSuggestion",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggestion;",
        "text",
        "",
        "caretLocation",
        "",
        "typingSuggestion$stream_chat_android_ui_common_release",
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


# instance fields
.field private final options:Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggestionOptions;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggestionOptions;)V
    .locals 1

    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggester;->options:Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggestionOptions;

    return-void
.end method

.method public static synthetic typingSuggestion$stream_chat_android_ui_common_release$default(Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggester;Ljava/lang/CharSequence;IILjava/lang/Object;)Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggestion;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p2

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggester;->typingSuggestion$stream_chat_android_ui_common_release(Ljava/lang/CharSequence;I)Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggestion;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final typingSuggestion$stream_chat_android_ui_common_release(Ljava/lang/CharSequence;I)Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggestion;
    .locals 3

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggester;->options:Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggestionOptions;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggestionOptions;->getSymbol()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, p2, -0x1

    const/4 v2, 0x4

    invoke-static {p1, v0, v1, v2}, Lyb3/r;->l0(Ljava/lang/CharSequence;Ljava/lang/String;II)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    add-int/lit8 v1, v0, -0x1

    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-static {v1}, Lva3/d;->i(C)Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_1
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggester;->options:Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggestionOptions;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggestionOptions;->getShouldTriggerOnlyAtStart()Z

    move-result v1

    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggester;->options:Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggestionOptions;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggestionOptions;->getSymbol()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v0

    if-ge p2, v1, :cond_3

    goto :goto_0

    :cond_3
    invoke-interface {p1, v1, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggester;->options:Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggestionOptions;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggestionOptions;->getMinimumRequiredCharacters()I

    move-result v2

    if-ge v0, v2, :cond_5

    :cond_4
    :goto_0
    const/4 p1, 0x0

    return-object p1

    :cond_5
    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggestion;

    invoke-static {v1, p2}, Le93/b;->i0(II)Li93/j;

    move-result-object p2

    invoke-direct {v0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggestion;-><init>(Ljava/lang/String;Li93/j;)V

    return-object v0
.end method
