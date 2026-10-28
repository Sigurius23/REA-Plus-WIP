.class final Lio/getstream/chat/android/ui/feature/search/SearchInputView$init$7$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/feature/search/SearchInputView;->init(Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $newQuery:Ljava/lang/String;

.field final synthetic this$0:Lio/getstream/chat/android/ui/feature/search/SearchInputView;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/feature/search/SearchInputView;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView$init$7$1;->this$0:Lio/getstream/chat/android/ui/feature/search/SearchInputView;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView$init$7$1;->$newQuery:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/search/SearchInputView$init$7$1;->invoke()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView$init$7$1;->this$0:Lio/getstream/chat/android/ui/feature/search/SearchInputView;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->access$getDebouncedInputChangedListener$p(Lio/getstream/chat/android/ui/feature/search/SearchInputView;)Lio/getstream/chat/android/ui/feature/search/SearchInputView$InputChangedListener;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/search/SearchInputView$init$7$1;->$newQuery:Ljava/lang/String;

    invoke-interface {v0, v1}, Lio/getstream/chat/android/ui/feature/search/SearchInputView$InputChangedListener;->onInputChanged(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
