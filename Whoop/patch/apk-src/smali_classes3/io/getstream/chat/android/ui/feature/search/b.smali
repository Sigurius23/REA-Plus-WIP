.class public final synthetic Lio/getstream/chat/android/ui/feature/search/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# instance fields
.field public final synthetic a:Lio/getstream/chat/android/ui/feature/search/SearchInputView;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/search/SearchInputView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/search/b;->a:Lio/getstream/chat/android/ui/feature/search/SearchInputView;

    return-void
.end method


# virtual methods
.method public final onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/search/b;->a:Lio/getstream/chat/android/ui/feature/search/SearchInputView;

    invoke-static {v0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->b(Lio/getstream/chat/android/ui/feature/search/SearchInputView;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
