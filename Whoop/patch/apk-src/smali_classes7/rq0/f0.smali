.class public final synthetic Lrq0/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;

.field public final synthetic y:Lcom/whoop/domain/model/teams/TeamUser;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lcom/whoop/domain/model/teams/TeamUser;I)V
    .locals 0

    iput p3, p0, Lrq0/f0;->w:I

    iput-object p1, p0, Lrq0/f0;->x:Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;

    iput-object p2, p0, Lrq0/f0;->y:Lcom/whoop/domain/model/teams/TeamUser;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget v0, p0, Lrq0/f0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrq0/f0;->x:Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;

    iget-object v1, p0, Lrq0/f0;->y:Lcom/whoop/domain/model/teams/TeamUser;

    invoke-static {v0, v1, p1, p2}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->E(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lcom/whoop/domain/model/teams/TeamUser;Landroid/content/DialogInterface;I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lrq0/f0;->x:Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;

    iget-object v1, p0, Lrq0/f0;->y:Lcom/whoop/domain/model/teams/TeamUser;

    invoke-static {v0, v1, p1, p2}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->H(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lcom/whoop/domain/model/teams/TeamUser;Landroid/content/DialogInterface;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
