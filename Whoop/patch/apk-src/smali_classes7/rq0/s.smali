.class public final synthetic Lrq0/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/community/presentation/teams/c;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/community/presentation/teams/c;I)V
    .locals 0

    iput p2, p0, Lrq0/s;->w:I

    iput-object p1, p0, Lrq0/s;->x:Lcom/whoop/community/presentation/teams/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget v0, p0, Lrq0/s;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrq0/s;->x:Lcom/whoop/community/presentation/teams/c;

    invoke-static {v0, p1}, Lcom/whoop/community/presentation/teams/c;->U(Lcom/whoop/community/presentation/teams/c;Landroid/view/View;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lrq0/s;->x:Lcom/whoop/community/presentation/teams/c;

    invoke-static {v0, p1}, Lcom/whoop/community/presentation/teams/c;->S(Lcom/whoop/community/presentation/teams/c;Landroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
