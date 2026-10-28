.class public final synthetic Lb30/y4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    iput p2, p0, Lb30/y4;->w:I

    iput-object p1, p0, Lb30/y4;->x:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lb30/y4;->w:I

    const/4 v1, 0x0

    const-string v2, "$this$semantics"

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    iget-object v4, p0, Lb30/y4;->x:Ljava/lang/String;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {p1, v4}, Lht2/e;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {p1, v4}, Lht2/e;->i(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Li3/z;

    invoke-static {v4, p1}, Lh11/d;->d(Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Li3/z;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, p1}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    return-object v3

    :pswitch_3
    check-cast p1, Li3/z;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, p1}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    return-object v3

    :pswitch_4
    check-cast p1, Li3/z;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li3/w;->a:[Lj93/z;

    sget-object v0, Li3/u;->b:Li3/y;

    sget-object v2, Li3/w;->a:[Lj93/z;

    aget-object v1, v2, v1

    invoke-virtual {v0, p1, v4}, Li3/y;->a(Li3/z;Ljava/lang/Object;)V

    return-object v3

    :pswitch_5
    check-cast p1, Li3/z;

    sget-object v0, Li3/w;->a:[Lj93/z;

    sget-object v0, Li3/u;->K:Li3/y;

    check-cast p1, Li3/l;

    invoke-virtual {p1, v0, v4}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    return-object v3

    :pswitch_6
    check-cast p1, Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    invoke-static {v4, p1}, Lfu2/d;->i(Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/WorkoutSet;)Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    invoke-static {v4, p1}, Lfu2/d;->e(Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/WorkoutSet;)Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    invoke-static {v4, p1}, Lfu2/d;->l(Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/WorkoutSet;)Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    invoke-static {v4, p1}, Lfu2/d;->h(Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/WorkoutSet;)Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    invoke-static {v4, p1}, Lfu2/d;->g(Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/WorkoutSet;)Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    invoke-static {v4, p1}, Lfu2/d;->b(Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/WorkoutSet;)Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1, v4}, Lep1/w;->g(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Ljb1/b;

    invoke-static {v4, p1}, Ldv1/a;->b(Ljava/lang/String;Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Li3/z;

    invoke-static {v4, p1}, Ldn0/h;->f(Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Li3/z;

    invoke-static {v4, p1}, Ld71/d;->b(Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Li3/z;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v4, :cond_0

    invoke-static {v4, p1}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    :cond_0
    return-object v3

    :pswitch_11
    check-cast p1, Li3/z;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "manage_screen_chevron_icon_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Li3/w;->k(Ljava/lang/String;Li3/z;)V

    return-object v3

    :pswitch_12
    check-cast p1, Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-static {v4, p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->a(Ljava/lang/String;Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-static {v4, p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->h(Ljava/lang/String;Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Li3/z;

    invoke-static {v4, p1}, Lcom/whoop/profile/view/edit/avatar/PhotoSourceActionSheetKt;->c(Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Ll83/k;

    invoke-static {v4, p1}, Lcom/whoop/profile/view/edit/CountrySelectionContentKt;->d(Ljava/lang/String;Ll83/k;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Ltb/a;

    invoke-static {v4, p1}, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;->f(Ljava/lang/String;Ltb/a;)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Ltb/a;

    invoke-static {v4, p1}, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;->i(Ljava/lang/String;Ltb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Ltb/a;

    invoke-static {v4, p1}, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;->a(Ljava/lang/String;Ltb/a;)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Li3/z;

    invoke-static {v4, p1}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    const/4 v0, 0x5

    invoke-static {p1, v0}, Li3/w;->i(Li3/z;I)V

    return-object v3

    :pswitch_1a
    check-cast p1, Li3/z;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc30/g;->b:Li3/y;

    sget-object v2, Lc30/g;->a:[Lj93/z;

    aget-object v1, v2, v1

    invoke-virtual {v0, p1, v4}, Li3/y;->a(Li3/z;Ljava/lang/Object;)V

    return-object v3

    :pswitch_1b
    check-cast p1, Li3/z;

    invoke-static {v4, p1}, Lb71/c;->a(Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Li3/z;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Lkotlin/jvm/internal/j;->O(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    return-object v3

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
