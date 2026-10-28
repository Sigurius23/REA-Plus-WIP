.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/l;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/l;->w:I

    check-cast p1, Lc93/a;

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->B0(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/k0;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->E(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/h;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->t(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/x0;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->h0(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/e;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
