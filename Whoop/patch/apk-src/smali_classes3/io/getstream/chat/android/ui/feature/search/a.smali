.class public final synthetic Lio/getstream/chat/android/ui/feature/search/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/search/SearchInputView;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/search/SearchInputView;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/search/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/search/a;->x:Lio/getstream/chat/android/ui/feature/search/SearchInputView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/ui/feature/search/a;->w:I

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/search/a;->x:Lio/getstream/chat/android/ui/feature/search/SearchInputView;

    packed-switch v0, :pswitch_data_0

    sget p1, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->w:I

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->clear()Z

    return-void

    :pswitch_0
    invoke-static {v1, p1}, Lio/getstream/chat/android/ui/feature/search/SearchInputView;->a(Lio/getstream/chat/android/ui/feature/search/SearchInputView;Landroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
