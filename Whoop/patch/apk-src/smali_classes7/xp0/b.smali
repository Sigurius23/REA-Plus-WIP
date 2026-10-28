.class public final synthetic Lxp0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/community/CommunityAddMemberFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/community/CommunityAddMemberFragment;I)V
    .locals 0

    iput p2, p0, Lxp0/b;->w:I

    iput-object p1, p0, Lxp0/b;->x:Lcom/whoop/community/CommunityAddMemberFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lxp0/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lxp0/b;->x:Lcom/whoop/community/CommunityAddMemberFragment;

    invoke-static {v0}, Lcom/whoop/community/CommunityAddMemberFragment;->M(Lcom/whoop/community/CommunityAddMemberFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lxp0/b;->x:Lcom/whoop/community/CommunityAddMemberFragment;

    invoke-static {v0}, Lcom/whoop/community/CommunityAddMemberFragment;->E(Lcom/whoop/community/CommunityAddMemberFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
