.class public final synthetic Lio/getstream/chat/android/ui/widgets/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/widgets/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/widgets/a;->x:Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/widgets/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/a;->x:Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

    invoke-static {v0}, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;->b(Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/a;->x:Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;

    invoke-static {v0}, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;->a(Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
