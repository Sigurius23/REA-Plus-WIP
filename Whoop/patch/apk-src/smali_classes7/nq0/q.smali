.class public final synthetic Lnq0/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lcom/whoop/domain/model/teams/TeamUser;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/whoop/domain/model/teams/TeamUser;I)V
    .locals 0

    iput p3, p0, Lnq0/q;->w:I

    iput-object p1, p0, Lnq0/q;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lnq0/q;->y:Lcom/whoop/domain/model/teams/TeamUser;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget v0, p0, Lnq0/q;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lnq0/q;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lnq0/q;->y:Lcom/whoop/domain/model/teams/TeamUser;

    invoke-static {v0, v1, p1}, Lnq0/p$b;->a(Lkotlin/jvm/functions/Function1;Lcom/whoop/domain/model/teams/TeamUser;Landroid/view/View;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lnq0/q;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lnq0/q;->y:Lcom/whoop/domain/model/teams/TeamUser;

    invoke-static {v0, v1, p1}, Lnq0/p$b;->b(Lkotlin/jvm/functions/Function1;Lcom/whoop/domain/model/teams/TeamUser;Landroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
