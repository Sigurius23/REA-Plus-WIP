.class public final synthetic Lxp0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/community/CommunityLandingHostFragment;

.field public final synthetic y:Leq0/r0;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/community/CommunityLandingHostFragment;Leq0/r0;I)V
    .locals 0

    iput p3, p0, Lxp0/l;->w:I

    iput-object p1, p0, Lxp0/l;->x:Lcom/whoop/community/CommunityLandingHostFragment;

    iput-object p2, p0, Lxp0/l;->y:Leq0/r0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lxp0/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lxp0/l;->y:Leq0/r0;

    check-cast p1, Landroid/view/View;

    iget-object v1, p0, Lxp0/l;->x:Lcom/whoop/community/CommunityLandingHostFragment;

    invoke-static {v1, v0, p1}, Lcom/whoop/community/CommunityLandingHostFragment;->i0(Lcom/whoop/community/CommunityLandingHostFragment;Leq0/r0;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lxp0/l;->y:Leq0/r0;

    check-cast p1, Landroid/view/View;

    iget-object v1, p0, Lxp0/l;->x:Lcom/whoop/community/CommunityLandingHostFragment;

    invoke-static {v1, v0, p1}, Lcom/whoop/community/CommunityLandingHostFragment;->X(Lcom/whoop/community/CommunityLandingHostFragment;Leq0/r0;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
