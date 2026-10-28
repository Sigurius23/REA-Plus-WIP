.class public final synthetic Lxp0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/community/CommunityFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/community/CommunityFragment;I)V
    .locals 0

    iput p2, p0, Lxp0/e;->w:I

    iput-object p1, p0, Lxp0/e;->x:Lcom/whoop/community/CommunityFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lxp0/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lxp0/e;->x:Lcom/whoop/community/CommunityFragment;

    check-cast p1, Lcom/whoop/domain/model/teams/Team;

    invoke-static {v0, p1}, Lcom/whoop/community/CommunityFragment;->I(Lcom/whoop/community/CommunityFragment;Lcom/whoop/domain/model/teams/Team;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lxp0/e;->x:Lcom/whoop/community/CommunityFragment;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/community/CommunityFragment;->E(Lcom/whoop/community/CommunityFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
