.class public final synthetic Lio/getstream/chat/android/ui/viewmodel/messages/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/a;

.field public final synthetic y:Lc93/a;


# direct methods
.method public synthetic constructor <init>(ILc93/a;Lc93/a;)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/d;->w:I

    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/d;->x:Lc93/a;

    iput-object p3, p0, Lio/getstream/chat/android/ui/viewmodel/messages/d;->y:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/d;->y:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/d;->x:Lc93/a;

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/d;->y:Lc93/a;

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinding;->a(Lc93/a;Lc93/a;)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
