.class public final synthetic Lxp0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/community/CommunityLandingHostFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/community/CommunityLandingHostFragment;I)V
    .locals 0

    iput p2, p0, Lxp0/h;->w:I

    iput-object p1, p0, Lxp0/h;->x:Lcom/whoop/community/CommunityLandingHostFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lxp0/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lxp0/h;->x:Lcom/whoop/community/CommunityLandingHostFragment;

    invoke-static {v0}, Lcom/whoop/community/CommunityLandingHostFragment;->d0(Lcom/whoop/community/CommunityLandingHostFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lxp0/h;->x:Lcom/whoop/community/CommunityLandingHostFragment;

    invoke-static {v0}, Lcom/whoop/community/CommunityLandingHostFragment;->N(Lcom/whoop/community/CommunityLandingHostFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
