.class public final Lio/getstream/chat/android/ui/common/utils/EmojiUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\t\u0010\u0008J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/utils/EmojiUtil;",
        "",
        "<init>",
        "()V",
        "Lio/getstream/chat/android/models/Message;",
        "message",
        "",
        "isEmojiOnly",
        "(Lio/getstream/chat/android/models/Message;)Z",
        "isSingleEmoji",
        "",
        "getEmojiCount",
        "(Lio/getstream/chat/android/models/Message;)I",
        "Lyb3/p;",
        "EMOJI_REGEX",
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
.field public static final $stable:I

.field private static final EMOJI_REGEX:Lyb3/p;

.field public static final INSTANCE:Lio/getstream/chat/android/ui/common/utils/EmojiUtil;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/getstream/chat/android/ui/common/utils/EmojiUtil;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/common/utils/EmojiUtil;->INSTANCE:Lio/getstream/chat/android/ui/common/utils/EmojiUtil;

    new-instance v0, Lyb3/p;

    const-string v1, "(?:[\\u2700-\\u27bf]|(?:[\\ud83c\\udde6-\\ud83c\\uddff]){2}|[\\ud800\\udc00-\\uDBFF\\uDFFF]|[\\u2600-\\u26FF])[\\ufe0e\\ufe0f]?(?:[\\u0300-\\u036f\\ufe20-\\ufe23\\u20d0-\\u20f0]|[\\ud83c\\udffb-\\ud83c\\udfff])?(?:\\u200d(?:[^\\ud800-\\udfff]|(?:[\\ud83c\\udde6-\\ud83c\\uddff]){2}|[\\ud800\\udc00-\\uDBFF\\uDFFF]|[\\u2600-\\u26FF])[\\ufe0e\\ufe0f]?(?:[\\u0300-\\u036f\\ufe20-\\ufe23\\u20d0-\\u20f0]|[\\ud83c\\udffb-\\ud83c\\udfff])?)*|[\\u0023-\\u0039]\\ufe0f?\\u20e3|\\u3299|\\u3297|\\u303d|\\u3030|\\u24c2|[\\ud83c\\udd70-\\ud83c\\udd71]|[\\ud83c\\udd7e-\\ud83c\\udd7f]|\\ud83c\\udd8e|[\\ud83c\\udd91-\\ud83c\\udd9a]|[\\ud83c\\udde6-\\ud83c\\uddff]|[\\ud83c\\ude01-\\ud83c\\ude02]|\\ud83c\\ude1a|\\ud83c\\ude2f|[\\ud83c\\ude32-\\ud83c\\ude3a]|[\\ud83c\\ude50-\\ud83c\\ude51]|\\u203c|\\u2049|[\\u25aa-\\u25ab]|\\u25b6|\\u25c0|[\\u25fb-\\u25fe]|\\u00a9|\\u00ae|\\u2122|\\u2139|\\ud83c\\udc04|[\\u2600-\\u26FF]|\\u2b05|\\u2b06|\\u2b07|\\u2b1b|\\u2b1c|\\u2b50|\\u2b55|\\u231a|\\u231b|\\u2328|\\u23cf|[\\u23e9-\\u23f3]|[\\u23f8-\\u23fa]|\\ud83c\\udccf|\\u2934|\\u2935|[\\u2190-\\u21ff]"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/ui/common/utils/EmojiUtil;->EMOJI_REGEX:Lyb3/p;

    const/16 v0, 0x8

    sput v0, Lio/getstream/chat/android/ui/common/utils/EmojiUtil;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getEmojiCount(Lio/getstream/chat/android/models/Message;)I
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/common/utils/EmojiUtil;->EMOJI_REGEX:Lyb3/p;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lyb3/p;->b(Ljava/lang/CharSequence;Lyb3/p;)Lx83/h;

    move-result-object p1

    invoke-static {p1}, Lxb3/k;->p(Lxb3/i;)I

    move-result p1

    return p1
.end method

.method public final isEmojiOnly(Lio/getstream/chat/android/models/Message;)Z
    .locals 3

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lio/getstream/chat/android/ui/common/utils/EmojiUtil;->EMOJI_REGEX:Lyb3/p;

    const-string v2, ""

    invoke-virtual {v1, v0, v2}, Lyb3/p;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getDeletedAt()Ljava/util/Date;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final isSingleEmoji(Lio/getstream/chat/android/models/Message;)Z
    .locals 2

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/common/utils/EmojiUtil;->isEmojiOnly(Lio/getstream/chat/android/models/Message;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lio/getstream/chat/android/ui/common/utils/EmojiUtil;->EMOJI_REGEX:Lyb3/p;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "input"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lyb3/p;->w:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "replaceFirst(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
