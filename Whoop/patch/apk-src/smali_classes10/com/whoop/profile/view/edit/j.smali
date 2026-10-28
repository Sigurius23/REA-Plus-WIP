.class public final synthetic Lcom/whoop/profile/view/edit/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p8, p0, Lcom/whoop/profile/view/edit/j;->w:I

    iput-object p1, p0, Lcom/whoop/profile/view/edit/j;->x:Ljava/lang/Object;

    iput-object p2, p0, Lcom/whoop/profile/view/edit/j;->y:Ljava/lang/Object;

    iput-object p3, p0, Lcom/whoop/profile/view/edit/j;->z:Ljava/lang/Object;

    iput-object p4, p0, Lcom/whoop/profile/view/edit/j;->E:Ljava/lang/Object;

    iput-object p5, p0, Lcom/whoop/profile/view/edit/j;->F:Ljava/lang/Object;

    iput-object p6, p0, Lcom/whoop/profile/view/edit/j;->G:Ljava/lang/Object;

    iput-object p7, p0, Lcom/whoop/profile/view/edit/j;->H:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lwb0/f;Lc93/m;Lbc3/c0;Lp1/c1;Lp1/c1;Lp1/c1;Lv41/f;)V
    .locals 1

    .line 2
    const/4 v0, 0x3

    iput v0, p0, Lcom/whoop/profile/view/edit/j;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/profile/view/edit/j;->y:Ljava/lang/Object;

    iput-object p2, p0, Lcom/whoop/profile/view/edit/j;->G:Ljava/lang/Object;

    iput-object p3, p0, Lcom/whoop/profile/view/edit/j;->x:Ljava/lang/Object;

    iput-object p4, p0, Lcom/whoop/profile/view/edit/j;->z:Ljava/lang/Object;

    iput-object p5, p0, Lcom/whoop/profile/view/edit/j;->E:Ljava/lang/Object;

    iput-object p6, p0, Lcom/whoop/profile/view/edit/j;->F:Ljava/lang/Object;

    iput-object p7, p0, Lcom/whoop/profile/view/edit/j;->H:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lcom/whoop/profile/view/edit/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/whoop/profile/view/edit/j;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lwb0/f;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/j;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc93/m;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/j;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lbc3/c0;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/j;->z:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lp1/c1;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/j;->E:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lp1/c1;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/j;->F:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lp1/c1;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/j;->H:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lv41/f;

    invoke-static/range {v1 .. v7}, Lyb0/g;->o(Lwb0/f;Lc93/m;Lbc3/c0;Lp1/c1;Lp1/c1;Lp1/c1;Lv41/f;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/profile/view/edit/j;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/j;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/j;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/j;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lio/getstream/chat/android/ui/common/helper/DateFormatter;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/j;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/j;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/j;->H:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lio/getstream/chat/android/models/Channel;

    invoke-static/range {v1 .. v7}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemDecoratorProvider;->b(Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;Lio/getstream/chat/android/ui/common/helper/DateFormatter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/models/Channel;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lcom/whoop/profile/view/edit/j;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lc93/p;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/j;->y:Ljava/lang/Object;

    check-cast v0, Lec3/f2;

    iget-object v2, p0, Lcom/whoop/profile/view/edit/j;->z:Ljava/lang/Object;

    check-cast v2, Lec3/f2;

    iget-object v3, p0, Lcom/whoop/profile/view/edit/j;->E:Ljava/lang/Object;

    check-cast v3, Lec3/f2;

    iget-object v4, p0, Lcom/whoop/profile/view/edit/j;->F:Ljava/lang/Object;

    check-cast v4, Lec3/f2;

    iget-object v5, p0, Lcom/whoop/profile/view/edit/j;->G:Ljava/lang/Object;

    check-cast v5, Lec3/f2;

    iget-object v6, p0, Lcom/whoop/profile/view/edit/j;->H:Ljava/lang/Object;

    check-cast v6, Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v3}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v4}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v5}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v6}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v7

    move-object v6, v5

    move-object v5, v4

    move-object v4, v3

    move-object v3, v2

    move-object v2, v0

    invoke-interface/range {v1 .. v7}, Lc93/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lcom/whoop/profile/view/edit/j;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lbc3/c0;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/j;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lg1/y3;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/j;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lp1/c1;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/j;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lp1/c1;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/j;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lp1/c1;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/j;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lp1/c1;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/j;->H:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lp1/c1;

    invoke-static/range {v1 .. v7}, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt;->i(Lbc3/c0;Lg1/y3;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
