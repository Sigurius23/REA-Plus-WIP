.class public final synthetic Lcom/whoop/ui/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lcom/whoop/ui/q;->a:I

    iput-object p2, p0, Lcom/whoop/ui/q;->b:Ljava/lang/Object;

    iput-object p3, p0, Lcom/whoop/ui/q;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 2

    iget v0, p0, Lcom/whoop/ui/q;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/whoop/ui/q;->b:Ljava/lang/Object;

    check-cast v0, Leq0/r1;

    iget-object v1, p0, Lcom/whoop/ui/q;->c:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/community/presentation/teams/d;

    invoke-static {v0, v1, p1, p2}, Lcom/whoop/community/presentation/teams/d;->S(Leq0/r1;Lcom/whoop/community/presentation/teams/d;Landroid/view/View;Z)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/ui/q;->b:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ui/WhoopEditText;

    iget-object v1, p0, Lcom/whoop/ui/q;->c:Ljava/lang/Object;

    check-cast v1, Lbh3/b;

    invoke-static {v0, v1, p1, p2}, Lcom/whoop/ui/WhoopEditText;->Q(Lcom/whoop/ui/WhoopEditText;Lbh3/b;Landroid/view/View;Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
