.class public final synthetic La61/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p2, p0, La61/a;->w:I

    iput-object p1, p0, La61/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, La61/a;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, La61/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Ldk2/j;->f(ILkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, La61/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Ld90/a;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, La61/a;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/String;

    invoke-static {p1, v0}, Ld42/p;->n(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, La61/a;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/String;

    invoke-static {p1, v0}, Ld42/p;->y(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, La61/a;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/String;

    invoke-static {p1, v0}, Ld21/f;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, La61/a;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/ui/WhoopNewToolbar;->k(Lkotlin/jvm/functions/Function1;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, La61/a;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lg2/v;

    invoke-static {v0, p1}, Lcom/whoop/profile/view/edit/form/EditProfileTextFieldKt;->c(Lkotlin/jvm/functions/Function1;Lg2/v;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, La61/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lcom/whoop/profile/presentation/edit/HeightWeightContentKt;->e(ILkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, La61/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lcom/whoop/profile/presentation/edit/HeightWeightContentKt;->d(ILkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, La61/a;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lck1/j;->a(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, La61/a;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-static {p1, v0}, Lck1/i;->c(Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, La61/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lc41/i2;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, La61/a;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ll3/r0;

    invoke-static {v0, p1}, Lc41/v1;->f(Lkotlin/jvm/functions/Function1;Ll3/r0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, La61/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lc41/c1;->b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, La61/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lc41/y0;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, La61/a;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/String;

    invoke-static {p1, v0}, Lbv2/c;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, La61/a;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lorg/joda/time/LocalDateTime;

    invoke-static {v0, p1}, Lbe1/g;->B(Lkotlin/jvm/functions/Function1;Lorg/joda/time/LocalDateTime;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, La61/a;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lorg/joda/time/LocalDateTime;

    invoke-static {v0, p1}, Lbe1/g;->s(Lkotlin/jvm/functions/Function1;Lorg/joda/time/LocalDateTime;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, La61/a;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lsp0/j;

    invoke-static {v0, p1}, Lbe1/g;->m(Lkotlin/jvm/functions/Function1;Lsp0/j;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, La61/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1}, Lbe1/g;->z(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, La61/a;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ltp0/c;

    invoke-static {v0, p1}, Lbe1/g;->g(Lkotlin/jvm/functions/Function1;Ltp0/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, La61/a;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/String;

    invoke-static {p1, v0}, Lbe1/g;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, La61/a;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln82/b;

    invoke-static {v0, p1}, Lbe1/g;->C(Lkotlin/jvm/functions/Function1;Ln82/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, La61/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lb90/a;->b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Landroid/view/View;

    const v0, 0x7f0a01ce

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type T of androidx.compose.ui.viewinterop.AndroidViewBindingKt.getBinding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lec/a;

    iget-object v0, p0, La61/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_18
    iget-object v0, p0, La61/a;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lb01/c;

    invoke-static {p1, v0}, Lb01/p;->f(Lb01/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, La61/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Laz1/h;->b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, La61/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Laz1/g;->l(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, La61/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lar2/b;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, La61/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, La61/b;->b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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
