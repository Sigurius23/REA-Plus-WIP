.class public final synthetic Lqq0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/community/presentation/share/selectteam/SelectTeamFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/community/presentation/share/selectteam/SelectTeamFragment;I)V
    .locals 0

    iput p2, p0, Lqq0/b;->w:I

    iput-object p1, p0, Lqq0/b;->x:Lcom/whoop/community/presentation/share/selectteam/SelectTeamFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lqq0/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lqq0/b;->x:Lcom/whoop/community/presentation/share/selectteam/SelectTeamFragment;

    check-cast p1, Lcom/whoop/domain/model/teams/share/SelectTeam;

    invoke-static {v0, p1}, Lcom/whoop/community/presentation/share/selectteam/SelectTeamFragment;->E(Lcom/whoop/community/presentation/share/selectteam/SelectTeamFragment;Lcom/whoop/domain/model/teams/share/SelectTeam;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lqq0/b;->x:Lcom/whoop/community/presentation/share/selectteam/SelectTeamFragment;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/community/presentation/share/selectteam/SelectTeamFragment;->I(Lcom/whoop/community/presentation/share/selectteam/SelectTeamFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lqq0/b;->x:Lcom/whoop/community/presentation/share/selectteam/SelectTeamFragment;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/community/presentation/share/selectteam/SelectTeamFragment;->H(Lcom/whoop/community/presentation/share/selectteam/SelectTeamFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lqq0/b;->x:Lcom/whoop/community/presentation/share/selectteam/SelectTeamFragment;

    check-cast p1, Lqq0/e;

    invoke-static {v0, p1}, Lcom/whoop/community/presentation/share/selectteam/SelectTeamFragment;->F(Lcom/whoop/community/presentation/share/selectteam/SelectTeamFragment;Lqq0/e;)Ll83/a0;

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
