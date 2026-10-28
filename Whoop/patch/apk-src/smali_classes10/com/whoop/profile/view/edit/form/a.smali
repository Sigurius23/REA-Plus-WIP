.class public final synthetic Lcom/whoop/profile/view/edit/form/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/design/util/TextResource;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;I)V
    .locals 0

    iput p2, p0, Lcom/whoop/profile/view/edit/form/a;->w:I

    iput-object p1, p0, Lcom/whoop/profile/view/edit/form/a;->x:Lcom/whoop/design/util/TextResource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcom/whoop/profile/view/edit/form/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/a;->x:Lcom/whoop/design/util/TextResource;

    check-cast p1, Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-static {v0, p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->e(Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/a;->x:Lcom/whoop/design/util/TextResource;

    check-cast p1, Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-static {v0, p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->j(Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/a;->x:Lcom/whoop/design/util/TextResource;

    check-cast p1, Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-static {v0, p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->b(Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/a;->x:Lcom/whoop/design/util/TextResource;

    check-cast p1, Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-static {v0, p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->g(Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/a;->x:Lcom/whoop/design/util/TextResource;

    check-cast p1, Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-static {v0, p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->i(Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
