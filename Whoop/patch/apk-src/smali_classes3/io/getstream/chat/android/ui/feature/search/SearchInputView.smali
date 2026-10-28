.class public final Lio/getstream/chat/android/ui/feature/search/SearchInputView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/search/SearchInputView$Companion;,
        Lio/getstream/chat/android/ui/feature/search/SearchInputView$InputChangedListener;,
        Lio/getstream/chat/android/ui/feature/search/SearchInputView$SearchStartedListener;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\r\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u0000 :2\u00020\u0001:\u0003:;<B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008B#\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0004\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u000c2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u000c2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001e\u0010\u0015\u001a\u00020\u000c2\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0013H\u0082\u0008\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000cH\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u000c2\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000c2\u0008\u0010!\u001a\u0004\u0018\u00010 \u00a2\u0006\u0004\u0008\"\u0010#J\u0017\u0010$\u001a\u00020\u000c2\u0008\u0010!\u001a\u0004\u0018\u00010 \u00a2\u0006\u0004\u0008$\u0010#J\u0017\u0010\'\u001a\u00020\u000c2\u0008\u0010&\u001a\u0004\u0018\u00010%\u00a2\u0006\u0004\u0008\'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008.\u0010-R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008&\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00081\u00102R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u00084\u00105R\u0016\u00106\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00086\u00107R\u0014\u0010\u001a\u001a\u00020\u00198BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u00088\u00109\u00a8\u0006="
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/search/SearchInputView;",
        "Landroid/widget/FrameLayout;",
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
        "Ll83/a0;",
        "init",
        "(Landroid/util/AttributeSet;)V",
        "",
        "text",
        "updateClearButtonVisibility",
        "(Ljava/lang/CharSequence;)V",
        "Lkotlin/Function0;",
        "actions",
        "withoutListenerNotifications",
        "(Lc93/a;)V",
        "onDetachedFromWindow",
        "()V",
        "",
        "query",
        "setQuery",
        "(Ljava/lang/String;)V",
        "",
        "clear",
        "()Z",
        "Lio/getstream/chat/android/ui/feature/search/SearchInputView$InputChangedListener;",
        "inputChangedListener",
        "setContinuousInputChangedListener",
        "(Lio/getstream/chat/android/ui/feature/search/SearchInputView$InputChangedListener;)V",
        "setDebouncedInputChangedListener",
        "Lio/getstream/chat/android/ui/feature/search/SearchInputView$SearchStartedListener;",
        "searchStartedListener",
        "setSearchStartedListener",
        "(Lio/getstream/chat/android/ui/feature/search/SearchInputView$SearchStartedListener;)V",
        "Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;",
        "binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;",
        "debouncedInputChangedListener",
        "Lio/getstream/chat/android/ui/feature/search/SearchInputView$InputChangedListener;",
        "continuousInputChangedListener",
        "Lio/getstream/chat/android/ui/feature/search/SearchInputView$SearchStartedListener;",
        "Lio/getstream/chat/android/core/utils/Debouncer;",
        "inputDebouncer",
        "Lio/getstream/chat/android/core/utils/Debouncer;",
        "Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;",
        "style",
        "Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;",
        "disableListeners",
        "Z",
        "getQuery",
        "()Ljava/lang/String;",
        "Companion",
        "InputChangedListener",
        "SearchStartedListener",
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
.field private static final Companion:Lio/getstream/chat/android/ui/feature/search/SearchInputView$Companion;

.field private static final FADE_DURATION:J = 0x12cL

.field private static final TYPING_DEBOUNCE_MS:J = 0x12cL

.field public static final synthetic w:I


# instance fields
.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;

.field private continuousInputChangedListener:Lio/getstream/chat/android/ui/feature/search/SearchInputView$InputChangedListener;

.field private debouncedInputChangedListener:Lio/getstream/chat/android/ui/feature/search/SearchInputView$InputChangedListener;

.field private disableListeners:Z

.field private final inputDebouncer:Lio/getstream/chat/android/core/utils/Debouncer;

.field private searchStartedListener:Lio/getstream/chat/android/ui/feature/search/SearchInputView$SearchStartedListener;

.field private style:Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/search/SearchInputView$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->Companion:Lio/getstream/chat/android/ui/feature/search/SearchInputView$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {p1, p0, v0}, Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;

    .line 3
    new-instance v0, Lio/getstream/chat/android/core/utils/Debouncer;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const-wide/16 v1, 0x12c

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/core/utils/Debouncer;-><init>(JLbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->inputDebouncer:Lio/getstream/chat/android/core/utils/Debouncer;

    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 6
    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {p1, p0, v0}, Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;

    .line 7
    new-instance v0, Lio/getstream/chat/android/core/utils/Debouncer;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const-wide/16 v1, 0x12c

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/core/utils/Debouncer;-><init>(JLbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->inputDebouncer:Lio/getstream/chat/android/core/utils/Debouncer;

    .line 8
    invoke-direct {p0, p2}, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    .line 10
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 p3, 0x1

    invoke-static {p1, p0, p3}, Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;

    .line 12
    new-instance v0, Lio/getstream/chat/android/core/utils/Debouncer;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const-wide/16 v1, 0x12c

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/core/utils/Debouncer;-><init>(JLbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->inputDebouncer:Lio/getstream/chat/android/core/utils/Debouncer;

    .line 13
    invoke-direct {p0, p2}, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/feature/search/SearchInputView;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->init$lambda$0(Lio/getstream/chat/android/ui/feature/search/SearchInputView;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic access$getContinuousInputChangedListener$p(Lio/getstream/chat/android/ui/feature/search/SearchInputView;)Lio/getstream/chat/android/ui/feature/search/SearchInputView$InputChangedListener;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->continuousInputChangedListener:Lio/getstream/chat/android/ui/feature/search/SearchInputView$InputChangedListener;

    return-object p0
.end method

.method public static final synthetic access$getDebouncedInputChangedListener$p(Lio/getstream/chat/android/ui/feature/search/SearchInputView;)Lio/getstream/chat/android/ui/feature/search/SearchInputView$InputChangedListener;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->debouncedInputChangedListener:Lio/getstream/chat/android/ui/feature/search/SearchInputView$InputChangedListener;

    return-object p0
.end method

.method public static final synthetic access$getDisableListeners$p(Lio/getstream/chat/android/ui/feature/search/SearchInputView;)Z
    .locals 0

    iget-boolean p0, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->disableListeners:Z

    return p0
.end method

.method public static final synthetic access$getInputDebouncer$p(Lio/getstream/chat/android/ui/feature/search/SearchInputView;)Lio/getstream/chat/android/core/utils/Debouncer;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->inputDebouncer:Lio/getstream/chat/android/core/utils/Debouncer;

    return-object p0
.end method

.method public static final synthetic access$getQuery(Lio/getstream/chat/android/ui/feature/search/SearchInputView;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->getQuery()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$updateClearButtonVisibility(Lio/getstream/chat/android/ui/feature/search/SearchInputView;Ljava/lang/CharSequence;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->updateClearButtonVisibility(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static synthetic b(Lio/getstream/chat/android/ui/feature/search/SearchInputView;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->init$lambda$7(Lio/getstream/chat/android/ui/feature/search/SearchInputView;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method private final getQuery()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;->inputField:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    const-string v1, "getText(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final init(Landroid/util/AttributeSet;)V
    .locals 5

    sget-object v0, Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle$Companion;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle$Companion;->invoke(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->style:Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    new-instance v0, Lio/getstream/chat/android/ui/feature/search/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/search/a;-><init>(Lio/getstream/chat/android/ui/feature/search/SearchInputView;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    const-string v0, "getRoot(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_16

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->style:Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;

    const/4 v2, 0x0

    const-string v3, "style"

    if-eqz v1, :cond_15

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;->getSearchInputHeight()I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;->clearInputButton:Landroid/widget/ImageView;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->style:Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;

    if-eqz v0, :cond_14

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;->getClearInputDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;->searchIcon:Landroid/widget/ImageView;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->style:Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;

    if-eqz v0, :cond_13

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;->getSearchIconDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;->searchIcon:Landroid/widget/ImageView;

    const-string v0, "searchIcon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    if-eqz v0, :cond_12

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->style:Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;

    if-eqz v4, :cond_11

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;->getSearchIconWidth()I

    move-result v4

    iput v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->style:Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;

    if-eqz v4, :cond_10

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;->getSearchIconHeight()I

    move-result v4

    iput v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->style:Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;

    if-eqz v4, :cond_f

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;->getSearchIconMarginStart()I

    move-result v4

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;->clearInputButton:Landroid/widget/ImageView;

    const-string v0, "clearInputButton"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_e

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->style:Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;

    if-eqz v4, :cond_d

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;->getClearIconWidth()I

    move-result v4

    iput v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->style:Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;

    if-eqz v4, :cond_c

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;->getClearIconHeight()I

    move-result v4

    iput v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->style:Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;

    if-eqz v4, :cond_b

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;->getClearIconMarginEnd()I

    move-result v4

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;->inputField:Landroid/widget/EditText;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->style:Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;->getHintText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;->inputField:Landroid/widget/EditText;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->style:Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;->getHintColor()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setHintTextColor(I)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;->inputField:Landroid/widget/EditText;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->style:Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;->getTextColor()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->style:Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;->getBackgroundDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->style:Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;->getBackgroundDrawableOutline()Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle$DrawableOutline;

    move-result-object v0

    instance-of v4, p1, Landroid/graphics/drawable/GradientDrawable;

    if-eqz v4, :cond_0

    if-eqz v0, :cond_0

    check-cast p1, Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle$DrawableOutline;->getWidth()I

    move-result v4

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle$DrawableOutline;->getColor()I

    move-result v0

    invoke-virtual {p1, v4, v0}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->style:Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;->getBackgroundDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;->inputField:Landroid/widget/EditText;

    const-string v0, "inputField"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->style:Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;->getTextSize()I

    move-result v4

    int-to-float v4, v4

    invoke-static {p1, v4}, Lio/getstream/chat/android/ui/utils/extensions/TextViewKt;->setTextSizePx(Landroid/widget/TextView;F)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;->inputField:Landroid/widget/EditText;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    if-eqz v4, :cond_3

    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->style:Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;->getTextMarginStart()I

    move-result v1

    invoke-virtual {v4, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->style:Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;->getTextMarginEnd()I

    move-result v1

    invoke-virtual {v4, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {p1, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;->inputField:Landroid/widget/EditText;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/search/SearchInputView$init$$inlined$doAfterTextChanged$1;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/search/SearchInputView$init$$inlined$doAfterTextChanged$1;-><init>(Lio/getstream/chat/android/ui/feature/search/SearchInputView;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;->inputField:Landroid/widget/EditText;

    new-instance v0, Lio/getstream/chat/android/ui/feature/search/b;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/search/b;-><init>(Lio/getstream/chat/android/ui/feature/search/SearchInputView;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;->clearInputButton:Landroid/widget/ImageView;

    new-instance v0, Lio/getstream/chat/android/ui/feature/search/a;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/search/a;-><init>(Lio/getstream/chat/android/ui/feature/search/SearchInputView;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->getQuery()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->updateClearButtonVisibility(Ljava/lang/CharSequence;)V

    return-void

    :cond_1
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_2
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_5
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_6
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_7
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_8
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_9
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_a
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_b
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_c
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_d
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_e
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_f
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_10
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_11
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_12
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_13
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_14
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_15
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_16
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static final init$lambda$0(Lio/getstream/chat/android/ui/feature/search/SearchInputView;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;

    iget-object p0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;->inputField:Landroid/widget/EditText;

    const-string p1, "inputField"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/EditTextKt;->focusAndShowKeyboard(Landroid/widget/EditText;)V

    return-void
.end method

.method private static final init$lambda$7(Lio/getstream/chat/android/ui/feature/search/SearchInputView;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    const/4 p1, 0x3

    if-ne p2, p1, :cond_1

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->searchStartedListener:Lio/getstream/chat/android/ui/feature/search/SearchInputView$SearchStartedListener;

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->getQuery()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Lio/getstream/chat/android/ui/feature/search/SearchInputView$SearchStartedListener;->onSearchStarted(Ljava/lang/String;)V

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method private static final init$lambda$8(Lio/getstream/chat/android/ui/feature/search/SearchInputView;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->clear()Z

    return-void
.end method

.method private final updateClearButtonVisibility(Ljava/lang/CharSequence;)V
    .locals 6

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move p1, v0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    const-string v1, "clearInputButton"

    if-nez p1, :cond_3

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;

    iget-object v2, v2, Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;->clearInputButton:Landroid/widget/ImageView;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v2

    new-instance v3, Lbc/h;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lbc/h;-><init>(Ljava/lang/Object;)V

    const-wide/16 v4, 0x12c

    iput-wide v4, v3, Lbc/w;->y:J

    invoke-static {v2, v3}, Lbc/a0;->a(Landroid/view/ViewGroup;Lbc/w;)V

    :cond_3
    :goto_2
    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;

    iget-object v2, v2, Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;->clearInputButton:Landroid/widget/ImageView;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_4

    goto :goto_3

    :cond_4
    const/16 v0, 0x8

    :goto_3
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final withoutListenerNotifications(Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->disableListeners:Z

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->disableListeners:Z

    return-void
.end method


# virtual methods
.method public final clear()Z
    .locals 4

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->getQuery()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->disableListeners:Z

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;

    iget-object v2, v2, Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;->inputField:Landroid/widget/EditText;

    const-string v3, ""

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->continuousInputChangedListener:Lio/getstream/chat/android/ui/feature/search/SearchInputView$InputChangedListener;

    if-eqz v2, :cond_1

    invoke-interface {v2, v3}, Lio/getstream/chat/android/ui/feature/search/SearchInputView$InputChangedListener;->onInputChanged(Ljava/lang/String;)V

    :cond_1
    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->debouncedInputChangedListener:Lio/getstream/chat/android/ui/feature/search/SearchInputView$InputChangedListener;

    if-eqz v2, :cond_2

    invoke-interface {v2, v3}, Lio/getstream/chat/android/ui/feature/search/SearchInputView$InputChangedListener;->onInputChanged(Ljava/lang/String;)V

    :cond_2
    iput-boolean v1, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->disableListeners:Z

    return v0
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->inputDebouncer:Lio/getstream/chat/android/core/utils/Debouncer;

    invoke-virtual {v0}, Lio/getstream/chat/android/core/utils/Debouncer;->shutdown()V

    return-void
.end method

.method public final setContinuousInputChangedListener(Lio/getstream/chat/android/ui/feature/search/SearchInputView$InputChangedListener;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->continuousInputChangedListener:Lio/getstream/chat/android/ui/feature/search/SearchInputView$InputChangedListener;

    return-void
.end method

.method public final setDebouncedInputChangedListener(Lio/getstream/chat/android/ui/feature/search/SearchInputView$InputChangedListener;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->debouncedInputChangedListener:Lio/getstream/chat/android/ui/feature/search/SearchInputView$InputChangedListener;

    return-void
.end method

.method public final setQuery(Ljava/lang/String;)V
    .locals 1

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiSearchViewBinding;->inputField:Landroid/widget/EditText;

    invoke-static {p1}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setSearchStartedListener(Lio/getstream/chat/android/ui/feature/search/SearchInputView$SearchStartedListener;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->searchStartedListener:Lio/getstream/chat/android/ui/feature/search/SearchInputView$SearchStartedListener;

    return-void
.end method
