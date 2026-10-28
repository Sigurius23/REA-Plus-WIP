.class public final synthetic Lb30/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lg2/i;


# direct methods
.method public synthetic constructor <init>(Lg2/i;I)V
    .locals 0

    iput p2, p0, Lb30/l1;->w:I

    iput-object p1, p0, Lb30/l1;->x:Lg2/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lb30/l1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb30/l1;->x:Lg2/i;

    check-cast p1, Lu0/p0;

    invoke-static {v0, p1}, Lw80/b;->k(Lg2/i;Lu0/p0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lb30/l1;->x:Lg2/i;

    check-cast p1, Lu0/p0;

    invoke-static {v0, p1}, Lw80/b;->a(Lg2/i;Lu0/p0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lb30/l1;->x:Lg2/i;

    check-cast p1, Lu0/p0;

    invoke-static {v0, p1}, Lv80/b;->h(Lg2/i;Lu0/p0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lb30/l1;->x:Lg2/i;

    check-cast p1, Lu0/p0;

    invoke-static {v0, p1}, Lr41/h;->i(Lg2/i;Lu0/p0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lb30/l1;->x:Lg2/i;

    check-cast p1, Lu0/p0;

    invoke-static {v0, p1}, Lqz0/l;->a(Lg2/i;Lu0/p0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lb30/l1;->x:Lg2/i;

    check-cast p1, Lu0/p0;

    invoke-static {v0, p1}, Lp90/d;->u(Lg2/i;Lu0/p0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lb30/l1;->x:Lg2/i;

    check-cast p1, Lu0/p0;

    invoke-static {v0, p1}, Lp90/d;->f(Lg2/i;Lu0/p0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lb30/l1;->x:Lg2/i;

    check-cast p1, Lu0/p0;

    invoke-static {v0, p1}, Lp90/d;->o(Lg2/i;Lu0/p0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lb30/l1;->x:Lg2/i;

    check-cast p1, Lu0/p0;

    invoke-static {v0, p1}, Lp90/d;->q(Lg2/i;Lu0/p0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lb30/l1;->x:Lg2/i;

    check-cast p1, Lu0/p0;

    invoke-static {v0, p1}, Lm90/b;->a(Lg2/i;Lu0/p0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lb30/l1;->x:Lg2/i;

    check-cast p1, Lu0/p0;

    invoke-static {v0, p1}, Lm90/b;->j(Lg2/i;Lu0/p0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lb30/l1;->x:Lg2/i;

    check-cast p1, Lu0/p0;

    invoke-static {v0, p1}, Lm90/b;->d(Lg2/i;Lu0/p0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lb30/l1;->x:Lg2/i;

    check-cast p1, Lu0/p0;

    invoke-static {v0, p1}, Lm80/d;->b(Lg2/i;Lu0/p0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lu0/p0;

    const-string v0, "$this$KeyboardActions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    iget-object v0, p0, Lb30/l1;->x:Lg2/i;

    check-cast v0, Lg2/l;

    invoke-virtual {v0, p1}, Lg2/l;->b(Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_d
    check-cast p1, Lu0/p0;

    const-string v0, "$this$KeyboardActions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    iget-object v0, p0, Lb30/l1;->x:Lg2/i;

    invoke-static {v0, p1}, Luf/c0;->c0(Lg2/i;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_e
    check-cast p1, Lu0/p0;

    const-string v0, "$this$KeyboardActions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    iget-object v0, p0, Lb30/l1;->x:Lg2/i;

    check-cast v0, Lg2/l;

    invoke-virtual {v0, p1}, Lg2/l;->b(Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_f
    check-cast p1, Lu0/p0;

    const-string v0, "$this$KeyboardActions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    iget-object v0, p0, Lb30/l1;->x:Lg2/i;

    invoke-static {v0, p1}, Luf/c0;->c0(Lg2/i;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_10
    check-cast p1, Lu0/p0;

    const-string v0, "$this$KeyboardActions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    iget-object v0, p0, Lb30/l1;->x:Lg2/i;

    check-cast v0, Lg2/l;

    invoke-virtual {v0, p1}, Lg2/l;->b(Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lb30/l1;->x:Lg2/i;

    check-cast p1, Lu0/p0;

    invoke-static {v0, p1}, Lcom/whoop/profile/view/edit/EditProfileFieldsContentKt;->k(Lg2/i;Lu0/p0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lb30/l1;->x:Lg2/i;

    check-cast p1, Lu0/p0;

    invoke-static {v0, p1}, Lcom/whoop/profile/view/edit/EditProfileFieldsContentKt;->j(Lg2/i;Lu0/p0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lb30/l1;->x:Lg2/i;

    check-cast p1, Lu0/p0;

    invoke-static {v0, p1}, Lb90/f;->b(Lg2/i;Lu0/p0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lu0/p0;

    const-string v0, "$this$KeyboardActions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    iget-object v0, p0, Lb30/l1;->x:Lg2/i;

    check-cast v0, Lg2/l;

    invoke-virtual {v0, p1}, Lg2/l;->h(I)Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
