.class public final synthetic Lcom/whoop/profile/view/edit/avatar/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;I)V
    .locals 0

    iput p4, p0, Lcom/whoop/profile/view/edit/avatar/a;->w:I

    iput-object p1, p0, Lcom/whoop/profile/view/edit/avatar/a;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/whoop/profile/view/edit/avatar/a;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lcom/whoop/profile/view/edit/avatar/a;->z:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lcom/whoop/profile/view/edit/avatar/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/whoop/profile/view/edit/avatar/a;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/whoop/profile/view/edit/avatar/a;->z:Lp1/c1;

    iget-object v2, p0, Lcom/whoop/profile/view/edit/avatar/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1, p1}, Lve0/e;->n(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/profile/view/edit/avatar/a;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/whoop/profile/view/edit/avatar/a;->z:Lp1/c1;

    iget-object v2, p0, Lcom/whoop/profile/view/edit/avatar/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1, p1}, Lnw0/o;->d(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lcom/whoop/profile/view/edit/avatar/a;->z:Lp1/c1;

    check-cast p1, Ljava/time/LocalDate;

    iget-object v1, p0, Lcom/whoop/profile/view/edit/avatar/a;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lcom/whoop/profile/view/edit/avatar/a;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2, v0, p1}, Ldk2/j;->h(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/time/LocalDate;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/avatar/a;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/whoop/profile/view/edit/avatar/a;->y:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lcom/whoop/profile/view/edit/avatar/a;->z:Lp1/c1;

    invoke-static {v0, v1, v2, p1}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetContentKt;->b(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Z)Ll83/a0;

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
