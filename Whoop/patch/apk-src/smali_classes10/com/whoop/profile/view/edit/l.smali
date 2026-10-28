.class public final synthetic Lcom/whoop/profile/view/edit/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/m;


# direct methods
.method public synthetic constructor <init>(ILc93/m;)V
    .locals 0

    iput p1, p0, Lcom/whoop/profile/view/edit/l;->w:I

    iput-object p2, p0, Lcom/whoop/profile/view/edit/l;->x:Lc93/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcom/whoop/profile/view/edit/l;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lcom/whoop/profile/view/edit/l;->x:Lc93/m;

    invoke-static {v0, p1, p2}, Lv41/d;->i(Lc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lcom/whoop/profile/view/edit/l;->x:Lc93/m;

    invoke-static {v0, p1, p2}, Lv41/d;->j(Lc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lcom/whoop/profile/view/edit/l;->x:Lc93/m;

    invoke-static {v0, p1, p2}, Lp11/e;->g(Lc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Lcom/whoop/payments/domain/models/Card;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/l;->x:Lc93/m;

    invoke-static {v0, p1, p2}, Llw1/e;->a(Lc93/m;ZLcom/whoop/payments/domain/models/Card;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    iget-object v0, p0, Lcom/whoop/profile/view/edit/l;->x:Lc93/m;

    invoke-static {v0, p1, p2}, Lic2/f;->m(Lc93/m;Ljava/lang/String;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lcom/whoop/profile/view/edit/l;->x:Lc93/m;

    invoke-static {v0, p1, p2}, Lf01/w;->b(Lc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;

    check-cast p2, Ljava/lang/String;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/l;->x:Lc93/m;

    invoke-static {v0, p1, p2}, Lcom/whoop/profile/view/edit/EditProfileFieldsContentKt;->h(Lc93/m;Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    check-cast p2, Ljava/lang/String;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/l;->x:Lc93/m;

    invoke-static {v0, p1, p2}, Lcom/whoop/profile/view/edit/EditProfileContentKt;->e(Lc93/m;Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    check-cast p2, Ljava/lang/String;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/l;->x:Lc93/m;

    invoke-static {v0, p1, p2}, Lcom/whoop/profile/view/edit/EditProfileContentKt;->c(Lc93/m;Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
