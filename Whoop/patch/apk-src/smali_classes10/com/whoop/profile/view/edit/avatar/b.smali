.class public final synthetic Lcom/whoop/profile/view/edit/avatar/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lcom/whoop/profile/view/edit/avatar/b;->w:I

    iput-object p2, p0, Lcom/whoop/profile/view/edit/avatar/b;->x:Ljava/lang/Object;

    iput-object p3, p0, Lcom/whoop/profile/view/edit/avatar/b;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/whoop/profile/view/edit/avatar/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/whoop/profile/view/edit/avatar/b;->x:Ljava/lang/Object;

    check-cast v0, Lh/i;

    iget-object v1, p0, Lcom/whoop/profile/view/edit/avatar/b;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, p1}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetContentKt;->e(Lh/i;Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/profile/view/edit/avatar/b;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/whoop/profile/view/edit/avatar/b;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, v1, p1}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetContentKt;->d(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroid/net/Uri;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
