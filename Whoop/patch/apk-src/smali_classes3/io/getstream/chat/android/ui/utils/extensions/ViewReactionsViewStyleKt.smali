.class public final Lio/getstream/chat/android/ui/utils/extensions/ViewReactionsViewStyleKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u00a8\u0006\u0003"
    }
    d2 = {
        "toSingleReactionViewStyle",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;",
        "stream-chat-android-ui-components_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final toSingleReactionViewStyle(Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;)Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;
    .locals 18

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getBubbleBorderColorMine()I

    move-result v2

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getBubbleBorderColorTheirs()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getBubbleColorMine()I

    move-result v4

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getBubbleColorTheirs()I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getBubbleBorderWidthMine()F

    move-result v6

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getBubbleBorderWidthTheirs()Ljava/lang/Float;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getTotalHeight()I

    move-result v8

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getBubbleHeight()I

    move-result v9

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getBubbleRadius()I

    move-result v10

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getLargeTailBubbleCy()I

    move-result v11

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getLargeTailBubbleRadius()I

    move-result v12

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getLargeTailBubbleOffset()I

    move-result v13

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getSmallTailBubbleCy()I

    move-result v14

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getSmallTailBubbleRadius()I

    move-result v15

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getSmallTailBubbleOffset()I

    move-result v16

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;->getMessageOptionsUserReactionOrientation()I

    move-result v17

    invoke-direct/range {v1 .. v17}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;-><init>(ILjava/lang/Integer;IIFLjava/lang/Float;IIIIIIIIII)V

    return-object v1
.end method
