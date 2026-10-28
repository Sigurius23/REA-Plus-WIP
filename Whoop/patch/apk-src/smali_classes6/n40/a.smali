.class public final synthetic Ln40/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroid/view/View;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;ILjava/lang/Object;)V
    .locals 0

    iput p2, p0, Ln40/a;->w:I

    iput-object p1, p0, Ln40/a;->x:Landroid/view/View;

    iput-object p3, p0, Ln40/a;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 3

    iget v0, p0, Ln40/a;->w:I

    iget-object v1, p0, Ln40/a;->y:Ljava/lang/Object;

    iget-object v2, p0, Ln40/a;->x:Landroid/view/View;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;

    invoke-static {v2, v1}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->H(Landroid/view/View;Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;)V

    return-void

    :pswitch_0
    check-cast v1, Lp1/c1;

    sget-object v0, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {v2}, Lh5/i0;->a(Landroid/view/View;)Lh5/q1;

    move-result-object v0

    if-eqz v0, :cond_0

    const/16 v2, 0x8

    iget-object v0, v0, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {v0, v2}, Lh5/o1;->q(I)Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {v1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
