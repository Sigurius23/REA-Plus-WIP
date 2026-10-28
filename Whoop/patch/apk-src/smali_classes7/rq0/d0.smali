.class public final synthetic Lrq0/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;I)V
    .locals 0

    iput p2, p0, Lrq0/d0;->w:I

    iput-object p1, p0, Lrq0/d0;->x:Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lrq0/d0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrq0/d0;->x:Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;

    check-cast p1, Lib/n;

    invoke-static {v0, p1}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->F(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lib/n;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lrq0/d0;->x:Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;

    check-cast p1, Lib/n;

    invoke-static {v0, p1}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->K(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lib/n;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lrq0/d0;->x:Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;

    check-cast p1, Landroid/text/Editable;

    invoke-static {v0, p1}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->G(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Landroid/text/Editable;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lrq0/d0;->x:Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;

    check-cast p1, Lrq0/j0;

    invoke-static {v0, p1}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->D(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lrq0/j0;)Ll83/a0;

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
