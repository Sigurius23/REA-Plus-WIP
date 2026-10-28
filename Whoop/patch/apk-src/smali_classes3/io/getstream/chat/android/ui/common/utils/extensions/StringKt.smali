.class public final Lio/getstream/chat/android/ui/common/utils/extensions/StringKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0002\"\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "",
        "initials",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "",
        "containsLinks",
        "(Ljava/lang/String;)Z",
        "addSchemeToUrlIfNeeded",
        "Lyb3/p;",
        "whitespaceRegex",
        "Lyb3/p;",
        "stream-chat-android-ui-common_release"
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
.field private static final whitespaceRegex:Lyb3/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lyb3/p;

    const-string v1, "\\s+"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/ui/common/utils/extensions/StringKt;->whitespaceRegex:Lyb3/p;

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/utils/extensions/StringKt;->initials$lambda$0(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static final addSchemeToUrlIfNeeded(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mailto:"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "http://"

    invoke-static {p0, v0, v1}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    const-string v2, "https://"

    invoke-static {p0, v2, v1}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_2

    :goto_0
    return-object p0

    :cond_2
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final containsLinks(Ljava/lang/String;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lyb3/q;->x:Lyb3/q;

    const/4 v0, 0x2

    invoke-static {v0}, Ljc/b;->j(I)I

    move-result v0

    const-string v1, "(^|\\s)((http|https|ftp)://)?[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)+(/[a-zA-Z0-9- ;,./?%&=]*)?"

    invoke-static {v1, v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    const-string v1, "compile(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result p0

    return p0
.end method

.method public static final initials(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    sget-object v0, Lio/getstream/chat/android/ui/common/utils/extensions/StringKt;->whitespaceRegex:Lyb3/p;

    invoke-virtual {v0, p0}, Lyb3/p;->h(Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    const/4 v0, 0x2

    invoke-static {p0, v0}, Lm83/s;->w1(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v4, Lio/getstream/chat/android/ui/common/utils/extensions/a;

    const/4 p0, 0x0

    invoke-direct {v4, p0}, Lio/getstream/chat/android/ui/common/utils/extensions/a;-><init>(I)V

    const/16 v5, 0x1e

    const-string v1, ""

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final initials$lambda$0(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-static {v0, p0}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "toUpperCase(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
