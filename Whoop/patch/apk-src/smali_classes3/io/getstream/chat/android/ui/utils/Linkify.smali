.class public final Lio/getstream/chat/android/ui/utils/Linkify;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;
    }
.end annotation

.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001%B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J!\u0010\u0014\u001a\u00020\u0013*\u00020\u00112\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0006H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015JC\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\'\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u0006*\u0008\u0012\u0004\u0012\u00020\u001d0\u00062\u0006\u0010 \u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008!\u0010\"J#\u0010\n\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000c2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\n\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/utils/Linkify;",
        "",
        "<init>",
        "()V",
        "Landroid/text/Spannable;",
        "spannable",
        "",
        "Lio/getstream/chat/android/models/User;",
        "mentionableUsers",
        "",
        "addLinks",
        "(Landroid/text/Spannable;Ljava/util/List;)Z",
        "Landroid/widget/TextView;",
        "t",
        "Ll83/a0;",
        "addLinkMovementMethod",
        "(Landroid/widget/TextView;)V",
        "",
        "prefixes",
        "Landroid/text/style/URLSpan;",
        "makeUrlSpan",
        "(Ljava/lang/String;Ljava/util/List;)Landroid/text/style/URLSpan;",
        "Ljava/util/regex/Pattern;",
        "pattern",
        "Landroid/text/util/Linkify$MatchFilter;",
        "matchFilter",
        "Lkotlin/Function1;",
        "Landroid/text/style/ClickableSpan;",
        "createSpan",
        "Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;",
        "gatherSpanSpecs",
        "(Landroid/text/Spannable;Ljava/util/regex/Pattern;Landroid/text/util/Linkify$MatchFilter;Lkotlin/jvm/functions/Function1;)Ljava/util/List;",
        "text",
        "pruneOverlaps",
        "(Ljava/util/List;Landroid/text/Spannable;)Ljava/util/List;",
        "textView",
        "(Landroid/widget/TextView;Ljava/util/List;)V",
        "SpanSpec",
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
.field public static final INSTANCE:Lio/getstream/chat/android/ui/utils/Linkify;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/utils/Linkify;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/utils/Linkify;->INSTANCE:Lio/getstream/chat/android/ui/utils/Linkify;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final addLinkMovementMethod(Landroid/widget/TextView;)V
    .locals 1

    invoke-virtual {p1}, Landroid/widget/TextView;->getMovementMethod()Landroid/text/method/MovementMethod;

    move-result-object v0

    instance-of v0, v0, Landroid/text/method/LinkMovementMethod;

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/widget/TextView;->getLinksClickable()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    :cond_0
    return-void
.end method

.method private final addLinks(Landroid/text/Spannable;Ljava/util/List;)Z
    .locals 10
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "RestrictedApi"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/text/Spannable;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;)Z"
        }
    .end annotation

    .line 9
    sget-object v0, Lg5/c;->a:Ljava/util/regex/Pattern;

    const-string v1, "AUTOLINK_WEB_URL"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    sget-object v1, Landroid/text/util/Linkify;->sUrlMatchFilter:Landroid/text/util/Linkify$MatchFilter;

    .line 11
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 12
    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 13
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    .line 14
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->start()I

    move-result v3

    .line 15
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->end()I

    move-result v5

    if-eqz v1, :cond_1

    .line 16
    invoke-interface {v1, p1, v3, v5}, Landroid/text/util/Linkify$MatchFilter;->acceptMatch(Ljava/lang/CharSequence;II)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 17
    :cond_1
    invoke-virtual {v0, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-static {v4}, Lio/getstream/chat/android/ui/utils/Linkify;->addLinks$lambda$0(Ljava/lang/String;)Landroid/text/style/ClickableSpan;

    move-result-object v4

    check-cast v4, Landroid/text/style/URLSpan;

    new-instance v6, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;

    invoke-direct {v6, v4, v3, v5}, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;-><init>(Landroid/text/style/ClickableSpan;II)V

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 18
    :cond_2
    sget-object v0, Lg5/c;->b:Ljava/util/regex/Pattern;

    const-string v1, "AUTOLINK_EMAIL_ADDRESS"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 20
    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 21
    :cond_3
    :goto_1
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 22
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->start()I

    move-result v3

    .line 23
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->end()I

    move-result v5

    .line 24
    invoke-virtual {v0, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-static {v6}, Lio/getstream/chat/android/ui/utils/Linkify;->addLinks$lambda$1(Ljava/lang/String;)Landroid/text/style/ClickableSpan;

    move-result-object v6

    check-cast v6, Landroid/text/style/URLSpan;

    new-instance v7, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;

    invoke-direct {v7, v6, v3, v5}, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;-><init>(Landroid/text/style/ClickableSpan;II)V

    invoke-interface {v1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 25
    :cond_4
    invoke-static {v2, v1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    .line 26
    check-cast p2, Ljava/lang/Iterable;

    .line 27
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 28
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 29
    check-cast v2, Lio/getstream/chat/android/models/User;

    .line 30
    sget-object v3, Lio/getstream/chat/android/ui/utils/Linkify;->INSTANCE:Lio/getstream/chat/android/ui/utils/Linkify;

    .line 31
    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->getName()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "((?:\\B|^)(@"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ")(?:\\b|$))"

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v5

    const-string v6, "compile(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 34
    invoke-virtual {v5, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    .line 35
    :cond_5
    :goto_3
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->find()Z

    move-result v6

    if-eqz v6, :cond_6

    .line 36
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->start()I

    move-result v6

    .line 37
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->end()I

    move-result v7

    .line 38
    invoke-virtual {v5, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_5

    invoke-static {v2, v8}, Lio/getstream/chat/android/ui/utils/Linkify;->addLinks$lambda$3$lambda$2(Lio/getstream/chat/android/models/User;Ljava/lang/String;)Landroid/text/style/ClickableSpan;

    move-result-object v8

    check-cast v8, Lio/getstream/chat/android/ui/utils/UserSpan;

    new-instance v9, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;

    invoke-direct {v9, v8, v6, v7}, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;-><init>(Landroid/text/style/ClickableSpan;II)V

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 39
    :cond_6
    invoke-static {v1, v3}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_2

    .line 40
    :cond_7
    invoke-static {v0, v1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p2

    .line 41
    invoke-direct {p0, p2, p1}, Lio/getstream/chat/android/ui/utils/Linkify;->pruneOverlaps(Ljava/util/List;Landroid/text/Spannable;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p2, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 43
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 44
    check-cast v1, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;

    .line 45
    invoke-virtual {v1}, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;->getSpan()Landroid/text/style/ClickableSpan;

    move-result-object v2

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;->getStart()I

    move-result v3

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;->getEnd()I

    move-result v1

    const/16 v4, 0x21

    invoke-interface {p1, v2, v3, v1, v4}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    .line 46
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 47
    :cond_8
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method private static final addLinks$lambda$0(Ljava/lang/String;)Landroid/text/style/ClickableSpan;
    .locals 4

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/utils/Linkify;->INSTANCE:Lio/getstream/chat/android/ui/utils/Linkify;

    const-string v1, "https://"

    const-string v2, "rtsp://"

    const-string v3, "http://"

    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/utils/Linkify;->makeUrlSpan(Ljava/lang/String;Ljava/util/List;)Landroid/text/style/URLSpan;

    move-result-object p0

    return-object p0
.end method

.method private static final addLinks$lambda$1(Ljava/lang/String;)Landroid/text/style/ClickableSpan;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/utils/Linkify;->INSTANCE:Lio/getstream/chat/android/ui/utils/Linkify;

    const-string v1, "mailto:"

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/utils/Linkify;->makeUrlSpan(Ljava/lang/String;Ljava/util/List;)Landroid/text/style/URLSpan;

    move-result-object p0

    return-object p0
.end method

.method private static final addLinks$lambda$3$lambda$2(Lio/getstream/chat/android/models/User;Ljava/lang/String;)Landroid/text/style/ClickableSpan;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lio/getstream/chat/android/ui/utils/UserSpan;

    invoke-direct {p1, p0}, Lio/getstream/chat/android/ui/utils/UserSpan;-><init>(Lio/getstream/chat/android/models/User;)V

    return-object p1
.end method

.method private final gatherSpanSpecs(Landroid/text/Spannable;Ljava/util/regex/Pattern;Landroid/text/util/Linkify$MatchFilter;Lkotlin/jvm/functions/Function1;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/text/Spannable;",
            "Ljava/util/regex/Pattern;",
            "Landroid/text/util/Linkify$MatchFilter;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-virtual {p2}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p2}, Ljava/util/regex/Matcher;->start()I

    move-result v1

    invoke-virtual {p2}, Ljava/util/regex/Matcher;->end()I

    move-result v2

    if-eqz p3, :cond_1

    invoke-interface {p3, p1, v1, v2}, Landroid/text/util/Linkify$MatchFilter;->acceptMatch(Ljava/lang/CharSequence;II)Z

    move-result v3

    if-eqz v3, :cond_0

    :cond_1
    const/4 v3, 0x0

    invoke-virtual {p2, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-interface {p4, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/text/style/ClickableSpan;

    if-eqz v3, :cond_0

    new-instance v4, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;

    invoke-direct {v4, v3, v1, v2}, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;-><init>(Landroid/text/style/ClickableSpan;II)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method private final makeUrlSpan(Ljava/lang/String;Ljava/util/List;)Landroid/text/style/URLSpan;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Landroid/text/style/URLSpan;"
        }
    .end annotation

    move-object v0, p2

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "US"

    const-string v5, "toLowerCase(...)"

    invoke-static {v3, v4, v2, v3, v5}, Lr80/c;->q(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance v2, Ll83/k;

    invoke-direct {v2, p1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v4, v2, Ll83/k;->w:Ljava/lang/Object;

    move-object v5, v4

    check-cast v5, Ljava/lang/String;

    const/4 v6, 0x1

    invoke-static {v5, v1, v6}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_2

    move-object v3, v4

    :cond_2
    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_1

    invoke-static {v3, v1, v1, v6}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v2, v3

    goto :goto_1

    :cond_3
    iget-object v0, v2, Ll83/k;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    move-object v2, v3

    :goto_2
    if-eqz v2, :cond_5

    iget-object v0, v2, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_5

    goto :goto_3

    :cond_5
    invoke-static {p2}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_3
    new-instance p1, Landroid/text/style/URLSpan;

    invoke-direct {p1, v0}, Landroid/text/style/URLSpan;-><init>(Ljava/lang/String;)V

    return-object p1
.end method

.method private final pruneOverlaps(Ljava/util/List;Landroid/text/Spannable;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;",
            ">;",
            "Landroid/text/Spannable;",
            ")",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;",
            ">;"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const-class v1, Landroid/text/style/URLSpan;

    const/4 v2, 0x0

    invoke-interface {p2, v2, v0, v1}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getSpans(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    array-length v3, v0

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    array-length v3, v0

    :goto_0
    if-ge v2, v3, :cond_0

    aget-object v4, v0, v2

    check-cast v4, Landroid/text/style/URLSpan;

    new-instance v5, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {p2, v4}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v6

    invoke-interface {p2, v4}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v7

    invoke-direct {v5, v4, v6, v7}, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;-><init>(Landroid/text/style/ClickableSpan;II)V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;->getStart()I

    move-result v6

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;->getStart()I

    move-result v7

    if-gt v6, v7, :cond_1

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;->getEnd()I

    move-result v5

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;->getEnd()I

    move-result v6

    if-lt v5, v6, :cond_1

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;->getStart()I

    move-result v7

    invoke-virtual {v6}, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;->getStart()I

    move-result v8

    if-gt v7, v8, :cond_3

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;->getEnd()I

    move-result v7

    invoke-virtual {v6}, Lio/getstream/chat/android/ui/utils/Linkify$SpanSpec;->getEnd()I

    move-result v6

    if-lt v7, v6, :cond_3

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    invoke-static {v2, v3}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {p2, v1}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_1

    :cond_5
    invoke-static {p2}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p1, p2}, Lm83/s;->c1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final addLinks(Landroid/widget/TextView;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/TextView;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;)V"
        }
    .end annotation

    const-string v0, "textView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mentionableUsers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    const-string v1, "getText(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    instance-of v1, v0, Landroid/text/Spannable;

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Landroid/text/Spannable;

    invoke-direct {p0, v0, p2}, Lio/getstream/chat/android/ui/utils/Linkify;->addLinks(Landroid/text/Spannable;Ljava/util/List;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 4
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/utils/Linkify;->addLinkMovementMethod(Landroid/widget/TextView;)V

    return-void

    .line 5
    :cond_0
    invoke-static {v0}, Landroid/text/SpannableString;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableString;

    move-result-object v0

    .line 6
    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {p0, v0, p2}, Lio/getstream/chat/android/ui/utils/Linkify;->addLinks(Landroid/text/Spannable;Ljava/util/List;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 7
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/utils/Linkify;->addLinkMovementMethod(Landroid/widget/TextView;)V

    .line 8
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method
