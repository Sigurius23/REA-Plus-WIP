.class public final synthetic Loq0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;I)V
    .locals 0

    iput p2, p0, Loq0/j;->w:I

    iput-object p1, p0, Loq0/j;->x:Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Loq0/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Loq0/j;->x:Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;

    invoke-static {v0}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->G(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Loq0/j;->x:Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;

    invoke-static {v0}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->E(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
