.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/a;->w:I

    const/16 v1, 0x32

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/16 v4, 0x8

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle$Companion;

    invoke-static {v2}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPxPrecise(I)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_0
    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle$Companion;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle$Companion;->access$getDEFAULT_SCROLL_BUTTON_ELEVATION(Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle$Companion;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_1
    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle$Companion;

    const/4 v0, 0x2

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_2
    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle$Companion;

    const/4 v0, 0x6

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_3
    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle$Companion;

    invoke-static {v4}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_4
    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle$Companion;

    invoke-static {v1}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_5
    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle$Companion;

    invoke-static {v3}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_6
    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle$Companion;

    const/16 v0, 0x18

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_7
    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle$Companion;

    invoke-static {v4}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_8
    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle$Companion;

    invoke-static {v4}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_9
    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle$Companion;

    invoke-static {v3}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_a
    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle$Companion;

    invoke-static {v4}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_b
    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle$Companion;

    invoke-static {v4}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_c
    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle$Companion;

    invoke-static {v1}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_d
    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle$Companion;

    invoke-static {v3}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_e
    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle$Companion;

    invoke-static {v3}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_f
    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle$Companion;

    const/4 v0, 0x3

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v0

    int-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_10
    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->t0()Landroid/widget/FrameLayout$LayoutParams;

    move-result-object v0

    return-object v0

    :pswitch_11
    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle$Companion;

    invoke-static {v2}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPxPrecise(I)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
