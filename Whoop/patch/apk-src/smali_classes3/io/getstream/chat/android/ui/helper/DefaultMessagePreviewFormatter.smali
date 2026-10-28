.class final Lio/getstream/chat/android/ui/helper/DefaultMessagePreviewFormatter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/helper/MessagePreviewFormatter;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/helper/DefaultMessagePreviewFormatter;",
        "Lio/getstream/chat/android/ui/helper/MessagePreviewFormatter;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "formatMessagePreview",
        "",
        "channel",
        "Lio/getstream/chat/android/models/Channel;",
        "message",
        "Lio/getstream/chat/android/models/Message;",
        "currentUser",
        "Lio/getstream/chat/android/models/User;",
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


# instance fields
.field private final context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/helper/DefaultMessagePreviewFormatter;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final formatMessagePreview(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;)Ljava/lang/CharSequence;
    .locals 7

    const-string v0, "channel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p3}, Lio/getstream/chat/android/ui/utils/extensions/MessageKt;->getTranslatedText(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isSystem(Lio/getstream/chat/android/models/Message;)Z

    move-result v1

    const/4 v2, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    new-instance p1, Landroid/text/SpannableStringBuilder;

    invoke-static {v0}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v4, v3, v2, v4}, Lio/getstream/chat/android/ui/utils/extensions/StringKt;->italicize$default(Ljava/lang/String;Ljava/util/List;ZILjava/lang/Object;)Landroid/text/SpannableString;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    return-object p1

    :cond_0
    iget-object v1, p0, Lio/getstream/chat/android/ui/helper/DefaultMessagePreviewFormatter;->context:Landroid/content/Context;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/utils/extensions/ChannelKt;->isDirectMessaging(Lio/getstream/chat/android/models/Channel;)Z

    move-result p1

    invoke-static {p2, v1, p1}, Lio/getstream/chat/android/ui/utils/extensions/MessageKt;->getSenderDisplayName(Lio/getstream/chat/android/models/Message;Landroid/content/Context;Z)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->hasAudioRecording(Lio/getstream/chat/android/models/Message;)Z

    move-result v1

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v1, :cond_4

    iget-object p2, p0, Lio/getstream/chat/android/ui/helper/DefaultMessagePreviewFormatter;->context:Landroid/content/Context;

    sget p3, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_audio_reply_info:I

    invoke-virtual {p2, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    const-string p3, "getString(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v4, v3, v2, v4}, Lio/getstream/chat/android/ui/utils/extensions/StringKt;->italicize$default(Ljava/lang/String;Ljava/util/List;ZILjava/lang/Object;)Landroid/text/SpannableString;

    move-result-object p2

    new-array p3, v5, [Ljava/lang/CharSequence;

    aput-object p1, p3, v3

    aput-object p2, p3, v6

    invoke-static {p3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    move-object p3, p2

    check-cast p3, Ljava/lang/CharSequence;

    if-eqz p3, :cond_1

    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result p3

    if-nez p3, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    new-instance v1, Landroid/text/SpannableStringBuilder;

    invoke-direct {v1}, Landroid/text/SpannableStringBuilder;-><init>()V

    const/4 v5, 0x0

    const/16 v6, 0x7c

    const-string v2, ": "

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lm83/s;->M0(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)V

    return-object v1

    :cond_4
    if-eqz p3, :cond_5

    iget-object v1, p0, Lio/getstream/chat/android/ui/helper/DefaultMessagePreviewFormatter;->context:Landroid/content/Context;

    invoke-static {p3, v1}, Lio/getstream/chat/android/ui/utils/extensions/UserKt;->asMention(Lio/getstream/chat/android/models/User;Landroid/content/Context;)Ljava/lang/String;

    move-result-object p3

    goto :goto_1

    :cond_5
    move-object p3, v4

    :goto_1
    invoke-static {v0}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz p3, :cond_6

    invoke-static {p3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    :cond_6
    invoke-static {v0, v4, v6}, Lio/getstream/chat/android/ui/utils/extensions/StringKt;->bold(Ljava/lang/String;Ljava/util/List;Z)Landroid/text/SpannableString;

    move-result-object p3

    invoke-static {p2}, Lio/getstream/chat/android/ui/utils/extensions/MessageKt;->getAttachmentsText(Lio/getstream/chat/android/models/Message;)Landroid/text/SpannableString;

    move-result-object p2

    new-array v0, v2, [Ljava/lang/CharSequence;

    aput-object p1, v0, v3

    aput-object p3, v0, v6

    aput-object p2, v0, v5

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_7
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    move-object p3, p2

    check-cast p3, Ljava/lang/CharSequence;

    if-eqz p3, :cond_7

    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result p3

    if-nez p3, :cond_8

    goto :goto_2

    :cond_8
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_9
    new-instance v1, Landroid/text/SpannableStringBuilder;

    invoke-direct {v1}, Landroid/text/SpannableStringBuilder;-><init>()V

    const/4 v5, 0x0

    const/16 v6, 0x7c

    const-string v2, ": "

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lm83/s;->M0(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)V

    return-object v1
.end method
