.class public final synthetic Lcom/whoop/profile/view/memberlevels/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;I)V
    .locals 0

    iput p2, p0, Lcom/whoop/profile/view/memberlevels/a;->w:I

    iput-object p1, p0, Lcom/whoop/profile/view/memberlevels/a;->x:Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcom/whoop/profile/view/memberlevels/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/whoop/profile/view/memberlevels/a;->x:Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->G(Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/profile/view/memberlevels/a;->x:Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;->H(Lcom/whoop/profile/view/memberlevels/MemberLevelsFragment;Ljava/util/List;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
