.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;

.field public final synthetic y:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;Landroid/view/View;I)V
    .locals 0

    iput p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/a;->x:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/a;->y:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/a;->y:Landroid/view/View;

    check-cast p1, Landroidx/constraintlayout/widget/p;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/a;->x:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;

    invoke-static {v1, v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/FootnoteDecorator;->a(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;Landroid/view/View;Landroidx/constraintlayout/widget/p;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/a;->y:Landroid/view/View;

    check-cast p1, Landroidx/constraintlayout/widget/p;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/a;->x:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;

    invoke-static {v1, v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/FootnoteDecorator;->b(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;Landroid/view/View;Landroidx/constraintlayout/widget/p;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
