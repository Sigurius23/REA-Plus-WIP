.class public final synthetic Lsc2/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lsc2/y;


# direct methods
.method public synthetic constructor <init>(Lsc2/y;I)V
    .locals 0

    iput p2, p0, Lsc2/w;->w:I

    iput-object p1, p0, Lsc2/w;->x:Lsc2/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lsc2/w;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsc2/w;->x:Lsc2/y;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lsc2/y;->J(Lsc2/y;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lsc2/w;->x:Lsc2/y;

    check-cast p1, Lsc2/f;

    invoke-static {v0, p1}, Lsc2/y;->G(Lsc2/y;Lsc2/f;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lsc2/w;->x:Lsc2/y;

    check-cast p1, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    invoke-static {v0, p1}, Lsc2/y;->K(Lsc2/y;Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lsc2/w;->x:Lsc2/y;

    check-cast p1, Lsc2/v;

    invoke-static {v0, p1}, Lsc2/y;->F(Lsc2/y;Lsc2/v;)Ll83/a0;

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
