.class public final synthetic Lcom/whoop/profile/view/edit/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic J:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p10, p0, Lcom/whoop/profile/view/edit/f;->w:I

    iput-object p1, p0, Lcom/whoop/profile/view/edit/f;->x:Ljava/lang/Object;

    iput-object p2, p0, Lcom/whoop/profile/view/edit/f;->y:Ljava/lang/Object;

    iput-object p3, p0, Lcom/whoop/profile/view/edit/f;->z:Ljava/lang/Object;

    iput-object p4, p0, Lcom/whoop/profile/view/edit/f;->E:Ljava/lang/Object;

    iput-object p5, p0, Lcom/whoop/profile/view/edit/f;->F:Ljava/lang/Object;

    iput-object p6, p0, Lcom/whoop/profile/view/edit/f;->G:Ljava/lang/Object;

    iput-object p7, p0, Lcom/whoop/profile/view/edit/f;->H:Ljava/lang/Object;

    iput-object p8, p0, Lcom/whoop/profile/view/edit/f;->I:Ljava/lang/Object;

    iput-object p9, p0, Lcom/whoop/profile/view/edit/f;->J:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lcom/whoop/profile/view/edit/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/whoop/profile/view/edit/f;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/client/api/internal/DistinctChatApi;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/f;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lio/getstream/chat/android/models/FilterObject;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/f;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lio/getstream/chat/android/models/querysort/QuerySorter;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/f;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/Integer;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/f;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/lang/Integer;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/f;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ljava/util/Date;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/f;->H:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Ljava/util/Date;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/f;->I:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Ljava/util/Date;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/f;->J:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Ljava/util/Date;

    invoke-static/range {v1 .. v9}, Lio/getstream/chat/android/client/api/internal/DistinctChatApi;->i(Lio/getstream/chat/android/client/api/internal/DistinctChatApi;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)Lo23/d;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/profile/view/edit/f;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lbc3/c0;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/f;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lg1/y3;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/f;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lp1/c1;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/f;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lp1/c1;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/f;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lp1/c1;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/f;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lp1/c1;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/f;->H:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lp1/c1;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/f;->I:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lp1/c1;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/f;->J:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Lp1/c1;

    invoke-static/range {v1 .. v9}, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt;->c(Lbc3/c0;Lg1/y3;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
