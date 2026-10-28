.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;
.super Landroidx/appcompat/widget/LinearLayoutCompat;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008B#\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0004\u0010\u000bJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000c2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J-\u0010\u0015\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00142\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ3\u0010\u001f\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u001c\u001a\u00020\t2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\u0008\u001f\u0010 J\r\u0010!\u001a\u00020\u0011\u00a2\u0006\u0004\u0008!\u0010\u001aJ\u001d\u0010#\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\u0008#\u0010$J\r\u0010%\u001a\u00020\u0011\u00a2\u0006\u0004\u0008%\u0010\u001aJ\u0017\u0010*\u001a\u00020\u00112\u0006\u0010\'\u001a\u00020&H\u0000\u00a2\u0006\u0004\u0008(\u0010)J\'\u0010.\u001a\u00020\u00112\u0006\u0010,\u001a\u00020+2\u0008\u0010-\u001a\u0004\u0018\u00010+2\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\u0008.\u0010/J\r\u00100\u001a\u00020\u0011\u00a2\u0006\u0004\u00080\u0010\u001aJ!\u00104\u001a\u00020\u00112\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001101\u00a2\u0006\u0004\u00084\u00105J!\u00106\u001a\u00020\u00112\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001101\u00a2\u0006\u0004\u00086\u00105J1\u0010:\u001a\u00020\u00112\u0006\u00107\u001a\u00020+2\u0006\u0010\u001e\u001a\u00020\u001d2\u0008\u0008\u0002\u00108\u001a\u00020\u000c2\u0008\u0008\u0002\u00109\u001a\u00020\u000c\u00a2\u0006\u0004\u0008:\u0010;J\r\u0010<\u001a\u00020\u0011\u00a2\u0006\u0004\u0008<\u0010\u001aR\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008A\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008D\u0010ER\u0017\u0010F\u001a\u00020C8\u0006\u00a2\u0006\u000c\n\u0004\u0008F\u0010E\u001a\u0004\u0008G\u0010H\u00a8\u0006I"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;",
        "Landroidx/appcompat/widget/LinearLayoutCompat;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Landroid/util/AttributeSet;",
        "attrs",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "defStyleAttr",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "",
        "isMine",
        "",
        "Lio/getstream/chat/android/models/User;",
        "threadParticipants",
        "Ll83/a0;",
        "setupUserAvatars",
        "(ZLjava/util/List;)V",
        "Ll83/k;",
        "getTwoLastUsers",
        "(Ljava/util/List;)Ll83/k;",
        "applyGravity",
        "(Z)V",
        "showSimpleFootnote",
        "()V",
        "hideSimpleFootnote",
        "replyCount",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;",
        "style",
        "showThreadRepliesFootnote",
        "(ZILjava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V",
        "hideReadCounter",
        "count",
        "showReadCounter",
        "(ILio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V",
        "hideStatusIndicator",
        "Landroid/graphics/drawable/Drawable;",
        "drawableRes",
        "showStatusIndicator$stream_chat_android_ui_components_release",
        "(Landroid/graphics/drawable/Drawable;)V",
        "showStatusIndicator",
        "",
        "time",
        "editedAt",
        "showTime",
        "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V",
        "hideTimeLabel",
        "Lkotlin/Function1;",
        "Landroid/view/View;",
        "onClick",
        "setOnThreadClickListener",
        "(Lkotlin/jvm/functions/Function1;)V",
        "setOnTranslatedLabelClickListener",
        "languageName",
        "showOriginalTranslationEnabled",
        "showOriginalText",
        "showTranslatedLabel",
        "(Ljava/lang/String;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;ZZ)V",
        "hideTranslatedLabel",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;",
        "footnote",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;",
        "threadsFootnote",
        "Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;",
        "Landroid/widget/TextView;",
        "translatedLabel",
        "Landroid/widget/TextView;",
        "footerTextLabel",
        "getFooterTextLabel",
        "()Landroid/widget/TextView;",
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
.field public static final synthetic w:I


# instance fields
.field private final footerTextLabel:Landroid/widget/TextView;

.field private final footnote:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;

.field private final threadsFootnote:Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;

.field private final translatedLabel:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 v1, 0x0

    .line 4
    invoke-static {p1, v0, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;

    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->getRoot()Landroidx/appcompat/widget/LinearLayoutCompat;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->footnote:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;

    .line 6
    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 7
    invoke-static {v2, v0, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;

    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->threadsFootnote:Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;

    .line 9
    new-instance v1, Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 10
    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setId(I)V

    .line 11
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 12
    iput-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->translatedLabel:Landroid/widget/TextView;

    .line 13
    iget-object v2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->messageFooterLabel:Landroid/widget/TextView;

    const-string v3, "messageFooterLabel"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->footerTextLabel:Landroid/widget/TextView;

    const/4 v2, 0x1

    .line 14
    invoke-virtual {p0, v2}, Landroidx/appcompat/widget/LinearLayoutCompat;->setOrientation(I)V

    .line 15
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->getRoot()Landroidx/appcompat/widget/LinearLayoutCompat;

    move-result-object v2

    const-string v3, "getRoot(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v4, 0x8

    .line 16
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 17
    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 19
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 20
    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->editedLabel:Landroid/widget/TextView;

    const-string v0, "editedLabel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 23
    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 p2, 0x0

    const/4 v0, 0x0

    .line 24
    invoke-static {p1, p2, v0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;

    move-result-object p1

    .line 25
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->getRoot()Landroidx/appcompat/widget/LinearLayoutCompat;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->footnote:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;

    .line 26
    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object v1

    .line 27
    invoke-static {v1, p2, v0}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;

    move-result-object p2

    .line 28
    invoke-virtual {p2}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->threadsFootnote:Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;

    .line 29
    new-instance v0, Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 30
    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 31
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 32
    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->translatedLabel:Landroid/widget/TextView;

    .line 33
    iget-object v1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->messageFooterLabel:Landroid/widget/TextView;

    const-string v2, "messageFooterLabel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->footerTextLabel:Landroid/widget/TextView;

    const/4 v1, 0x1

    .line 34
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/LinearLayoutCompat;->setOrientation(I)V

    .line 35
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->getRoot()Landroidx/appcompat/widget/LinearLayoutCompat;

    move-result-object v1

    const-string v2, "getRoot(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v3, 0x8

    .line 36
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 37
    invoke-virtual {p2}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p2

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-virtual {p2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 39
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 40
    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->editedLabel:Landroid/widget/TextView;

    const-string p2, "editedLabel"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    .line 43
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 44
    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 p2, 0x0

    const/4 p3, 0x0

    .line 45
    invoke-static {p1, p2, p3}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;

    move-result-object p1

    .line 46
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->getRoot()Landroidx/appcompat/widget/LinearLayoutCompat;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->footnote:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;

    .line 47
    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 48
    invoke-static {v0, p2, p3}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;

    move-result-object p2

    .line 49
    invoke-virtual {p2}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p3

    invoke-virtual {p0, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->threadsFootnote:Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;

    .line 50
    new-instance p3, Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 51
    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result v0

    invoke-virtual {p3, v0}, Landroid/view/View;->setId(I)V

    .line 52
    invoke-virtual {p0, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 53
    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->translatedLabel:Landroid/widget/TextView;

    .line 54
    iget-object v0, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->messageFooterLabel:Landroid/widget/TextView;

    const-string v1, "messageFooterLabel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->footerTextLabel:Landroid/widget/TextView;

    const/4 v0, 0x1

    .line 55
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/LinearLayoutCompat;->setOrientation(I)V

    .line 56
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->getRoot()Landroidx/appcompat/widget/LinearLayoutCompat;

    move-result-object v0

    const-string v1, "getRoot(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v2, 0x8

    .line 57
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 58
    invoke-virtual {p2}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    .line 60
    invoke-virtual {p3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 61
    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->editedLabel:Landroid/widget/TextView;

    const-string p2, "editedLabel"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public static synthetic d(Ljava/lang/String;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->showTime$lambda$12(Ljava/lang/String;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;Landroid/view/View;)V

    return-void
.end method

.method private final getTwoLastUsers(Ljava/util/List;)Ll83/k;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;)",
            "Ll83/k;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance p1, Ll83/k;

    invoke-direct {p1, v1, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v0

    const/4 v2, 0x1

    if-le v0, v2, :cond_1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->E0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v2}, Lm83/s;->B0(Ljava/lang/Iterable;I)Ljava/lang/Object;

    move-result-object p1

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :cond_1
    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->E0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    new-instance v0, Ll83/k;

    invoke-direct {v0, p1, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final setOnThreadClickListener$lambda$13(Lkotlin/jvm/functions/Function1;Landroid/view/View;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final setOnTranslatedLabelClickListener$lambda$14(Lkotlin/jvm/functions/Function1;Landroid/view/View;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final setupUserAvatars(ZLjava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->threadsFootnote:Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->firstTheirUserImage:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    const-string v2, "firstTheirUserImage"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v2, 0x8

    const/4 v3, 0x0

    if-nez p1, :cond_0

    move v4, v3

    goto :goto_0

    :cond_0
    move v4, v2

    :goto_0
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->secondTheirUserImage:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    const-string v4, "secondTheirUserImage"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_1

    move v4, v3

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->firstMineUserImage:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    const-string v4, "firstMineUserImage"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_2

    move v4, v3

    goto :goto_2

    :cond_2
    move v4, v2

    :goto_2
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->secondMineUserImage:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    const-string v4, "secondMineUserImage"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_3

    move v2, v3

    :cond_3
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->getTwoLastUsers(Ljava/util/List;)Ll83/k;

    move-result-object p2

    iget-object v1, p2, Ll83/k;->w:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/User;

    iget-object p2, p2, Ll83/k;->x:Ljava/lang/Object;

    check-cast p2, Lio/getstream/chat/android/models/User;

    if-eqz p1, :cond_4

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->firstMineUserImage:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    goto :goto_3

    :cond_4
    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->firstTheirUserImage:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    :goto_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->setupUserAvatars$applyUser(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;)V

    if-eqz p1, :cond_5

    iget-object p1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->secondMineUserImage:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    goto :goto_4

    :cond_5
    iget-object p1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->secondTheirUserImage:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    :goto_4
    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {p2, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->setupUserAvatars$applyUser(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;)V

    return-void
.end method

.method private static final setupUserAvatars$applyUser(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;)V
    .locals 3

    if-eqz p0, :cond_0

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, p0, v2, v0, v1}, Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;->setUser$default(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/models/User;ZILjava/lang/Object;)V

    return-void

    :cond_0
    const/16 p0, 0x8

    invoke-virtual {p1, p0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private static final showTime$lambda$12(Ljava/lang/String;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;Landroid/view/View;)V
    .locals 4

    if-eqz p0, :cond_4

    iget-object p0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->footnote:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;

    iget-object p0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->editedLabel:Landroid/widget/TextView;

    const-string p2, "editedLabel"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->footnote:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->editedLabel:Landroid/widget/TextView;

    invoke-static {v0, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result p2

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p2, :cond_0

    move p2, v0

    goto :goto_0

    :cond_0
    move p2, v1

    :goto_0
    const/16 v2, 0x8

    if-nez p2, :cond_1

    move p2, v1

    goto :goto_1

    :cond_1
    move p2, v2

    :goto_1
    invoke-virtual {p0, p2}, Landroid/view/View;->setVisibility(I)V

    iget-object p0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->footnote:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;

    iget-object p0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->editedInfo:Landroid/widget/TextView;

    const-string p2, "editedInfo"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->footnote:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;

    iget-object v3, v3, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->editedInfo:Landroid/widget/TextView;

    invoke-static {v3, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result p2

    if-nez p2, :cond_2

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    move v1, v2

    :goto_3
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object p0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->footnote:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;

    iget-object p0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->editedInfo:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_4
    return-void
.end method

.method public static synthetic showTranslatedLabel$default(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;Ljava/lang/String;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;ZZILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move p3, v0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    move p4, v0

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->showTranslatedLabel(Ljava/lang/String;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;ZZ)V

    return-void
.end method


# virtual methods
.method public final applyGravity(Z)V
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->footnote:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->messageFooterContainer:Landroidx/appcompat/widget/LinearLayoutCompat;

    const-string v1, "messageFooterContainer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    if-eqz v1, :cond_7

    const v3, 0x800003

    const v4, 0x800005

    if-eqz p1, :cond_0

    move v5, v4

    goto :goto_0

    :cond_0
    move v5, v3

    :goto_0
    invoke-virtual {p0, v5}, Landroidx/appcompat/widget/LinearLayoutCompat;->setGravity(I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->footnote:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->messageFooterContainerInner:Landroidx/appcompat/widget/LinearLayoutCompat;

    const-string v1, "messageFooterContainerInner"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    if-eqz v1, :cond_6

    if-eqz p1, :cond_1

    move v5, v4

    goto :goto_1

    :cond_1
    move v5, v3

    :goto_1
    invoke-virtual {p0, v5}, Landroidx/appcompat/widget/LinearLayoutCompat;->setGravity(I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->threadsFootnote:Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    const-string v1, "getRoot(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    if-eqz v1, :cond_5

    if-eqz p1, :cond_2

    move v5, v4

    goto :goto_2

    :cond_2
    move v5, v3

    :goto_2
    invoke-virtual {p0, v5}, Landroidx/appcompat/widget/LinearLayoutCompat;->setGravity(I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->translatedLabel:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    if-eqz v1, :cond_4

    if-eqz p1, :cond_3

    move v3, v4

    :cond_3
    invoke-virtual {p0, v3}, Landroidx/appcompat/widget/LinearLayoutCompat;->setGravity(I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getFooterTextLabel()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->footerTextLabel:Landroid/widget/TextView;

    return-object v0
.end method

.method public final hideReadCounter()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->footnote:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->readCount:Landroid/widget/TextView;

    const-string v1, "readCount"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final hideSimpleFootnote()V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->footnote:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->getRoot()Landroidx/appcompat/widget/LinearLayoutCompat;

    move-result-object v0

    const-string v1, "getRoot(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->threadsFootnote:Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final hideStatusIndicator()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->footnote:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->deliveryStatusIcon:Landroid/widget/ImageView;

    const-string v1, "deliveryStatusIcon"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final hideTimeLabel()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->footnote:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->timeView:Landroid/widget/TextView;

    const-string v1, "timeView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final hideTranslatedLabel()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->translatedLabel:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final setOnThreadClickListener(Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "onClick"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->threadsFootnote:Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/j;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final setOnTranslatedLabelClickListener(Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "onClick"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->translatedLabel:Landroid/widget/TextView;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/j;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final showReadCounter(ILio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V
    .locals 2

    const-string v0, "style"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->footnote:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->readCount:Landroid/widget/TextView;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getTextStyleReadCounter()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object p1

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    return-void
.end method

.method public final showSimpleFootnote()V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->footnote:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->getRoot()Landroidx/appcompat/widget/LinearLayoutCompat;

    move-result-object v0

    const-string v1, "getRoot(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->threadsFootnote:Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final showStatusIndicator$stream_chat_android_ui_components_release(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    const-string v0, "drawableRes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->footnote:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->deliveryStatusIcon:Landroid/widget/ImageView;

    const-string v1, "deliveryStatusIcon"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->footnote:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->deliveryStatusIcon:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final showThreadRepliesFootnote(ZILjava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZI",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;",
            "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;",
            ")V"
        }
    .end annotation

    const-string v0, "threadParticipants"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->footnote:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->getRoot()Landroidx/appcompat/widget/LinearLayoutCompat;

    move-result-object v0

    const-string v1, "getRoot(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->threadsFootnote:Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v3, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->threadsOrnamentLeft:Landroidx/appcompat/widget/AppCompatImageView;

    const-string v4, "threadsOrnamentLeft"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    move v4, v1

    goto :goto_0

    :cond_0
    move v4, v2

    :goto_0
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v3, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->threadsOrnamentRight:Landroidx/appcompat/widget/AppCompatImageView;

    const-string v4, "threadsOrnamentRight"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_1

    move v2, v1

    :cond_1
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->threadRepliesButton:Landroid/widget/TextView;

    if-nez p2, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget v2, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_list_thread_footnote_thread_reply:I

    invoke-virtual {p2, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lio/getstream/chat/android/ui/R$plurals;->stream_ui_message_list_thread_footnote:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, p2, v4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    :goto_1
    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->threadRepliesButton:Landroid/widget/TextView;

    const-string v0, "threadRepliesButton"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p4}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getTextStyleThreadCounter()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object p4

    invoke-static {p2, p4}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    invoke-direct {p0, p1, p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->setupUserAvatars(ZLjava/util/List;)V

    return-void
.end method

.method public final showTime(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V
    .locals 3

    const-string v0, "time"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->footnote:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->timeView:Landroid/widget/TextView;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p3}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getTextStyleMessageDate()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object p1

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->footnote:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->editedLabel:Landroid/widget/TextView;

    const-string p3, "editedLabel"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 p3, 0x8

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    move v1, p3

    :goto_0
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->footnote:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->editedInfo:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_list_footnote_edited_at:I

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->footnote:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->editedInfo:Landroid/widget/TextView;

    const-string v0, "editedInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->footnote:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;->getRoot()Landroidx/appcompat/widget/LinearLayoutCompat;

    move-result-object p1

    new-instance p3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/b;

    const/4 v0, 0x6

    invoke-direct {p3, v0, p2, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final showTranslatedLabel(Ljava/lang/String;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;ZZ)V
    .locals 2

    const-string v0, "languageName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->translatedLabel:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getTextStyleMessageLanguage()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object p2

    invoke-static {v0, p2}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    if-eqz p3, :cond_1

    if-eqz p4, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget p2, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_list_show_translation:I

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    sget p3, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_list_translated:I

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    sget p3, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_list_show_original:I

    invoke-virtual {p2, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->translatedLabel:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_1
    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->translatedLabel:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    sget p4, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_list_translated:I

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p3, p4, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
