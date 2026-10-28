.class public final synthetic Lch0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Lch0/e;->w:I

    iput-object p1, p0, Lch0/e;->y:Ljava/lang/Object;

    iput-object p2, p0, Lch0/e;->z:Ljava/lang/Object;

    iput-boolean p3, p0, Lch0/e;->x:Z

    iput-object p4, p0, Lch0/e;->E:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p5, p0, Lch0/e;->w:I

    iput-object p1, p0, Lch0/e;->y:Ljava/lang/Object;

    iput-boolean p2, p0, Lch0/e;->x:Z

    iput-object p3, p0, Lch0/e;->z:Ljava/lang/Object;

    iput-object p4, p0, Lch0/e;->E:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZLjava/lang/Object;Lp1/c1;I)V
    .locals 0

    .line 3
    iput p5, p0, Lch0/e;->w:I

    iput-object p1, p0, Lch0/e;->y:Ljava/lang/Object;

    iput-boolean p2, p0, Lch0/e;->x:Z

    iput-object p3, p0, Lch0/e;->E:Ljava/lang/Object;

    iput-object p4, p0, Lch0/e;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly3/c;Lkotlin/jvm/functions/Function1;Ld0/l;Z)V
    .locals 1

    .line 4
    const/4 v0, 0x7

    iput v0, p0, Lch0/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch0/e;->y:Ljava/lang/Object;

    iput-object p2, p0, Lch0/e;->z:Ljava/lang/Object;

    iput-object p3, p0, Lch0/e;->E:Ljava/lang/Object;

    iput-boolean p4, p0, Lch0/e;->x:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;Lp1/c1;)V
    .locals 1

    .line 5
    const/16 v0, 0xb

    iput v0, p0, Lch0/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lch0/e;->x:Z

    iput-object p2, p0, Lch0/e;->y:Ljava/lang/Object;

    iput-object p3, p0, Lch0/e;->E:Ljava/lang/Object;

    iput-object p4, p0, Lch0/e;->z:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 6
    iput p5, p0, Lch0/e;->w:I

    iput-boolean p1, p0, Lch0/e;->x:Z

    iput-object p2, p0, Lch0/e;->y:Ljava/lang/Object;

    iput-object p3, p0, Lch0/e;->z:Ljava/lang/Object;

    iput-object p4, p0, Lch0/e;->E:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lch0/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lch0/e;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;

    iget-object v1, p0, Lch0/e;->z:Ljava/lang/Object;

    check-cast v1, Lyu2/a;

    iget-object v2, p0, Lch0/e;->E:Ljava/lang/Object;

    check-cast v2, Ll83/h;

    check-cast p1, Lhu2/b;

    iget-boolean v3, p0, Lch0/e;->x:Z

    invoke-static {v0, v1, v3, v2, p1}, Lyu2/e;->j(Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;Lyu2/a;ZLl83/h;Lhu2/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lch0/e;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lch0/e;->E:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lch0/e;->z:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    iget-boolean v3, p0, Lch0/e;->x:Z

    invoke-static {v0, v3, v1, v2, p1}, Ly21/i;->e(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lch0/e;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lch0/e;->z:Ljava/lang/Object;

    check-cast v1, Landroid/icu/text/NumberFormat;

    iget-object v2, p0, Lch0/e;->E:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/String;

    iget-boolean v3, p0, Lch0/e;->x:Z

    invoke-static {v3, v0, v1, v2, p1}, Lqz0/f;->a(ZLkotlin/jvm/functions/Function1;Landroid/icu/text/NumberFormat;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lch0/e;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$a$a;

    iget-object v1, p0, Lch0/e;->z:Ljava/lang/Object;

    check-cast v1, Lou2/b;

    iget-object v2, p0, Lch0/e;->E:Ljava/lang/Object;

    check-cast v2, Ll83/h;

    check-cast p1, Lhu2/a;

    iget-boolean v3, p0, Lch0/e;->x:Z

    invoke-static {v0, v1, v3, v2, p1}, Lqu2/h;->x(Lcom/whoop/weightlifting/StrengthTrainerDestination$a$a;Lou2/b;ZLl83/h;Lhu2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lch0/e;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/navigation/e;

    iget-object v1, p0, Lch0/e;->E:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lch0/e;->z:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    check-cast p1, Landroidx/compose/ui/Modifier;

    iget-boolean v3, p0, Lch0/e;->x:Z

    invoke-static {v3, v0, v1, v2, p1}, Lp71/b;->e(ZLcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;Lp1/c1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lch0/e;->y:Ljava/lang/Object;

    check-cast v0, Lot2/m;

    iget-object v1, p0, Lch0/e;->z:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    iget-object v2, p0, Lch0/e;->E:Ljava/lang/Object;

    check-cast v2, Lmt2/f;

    check-cast p1, Lmt2/g;

    iget-boolean v3, p0, Lch0/e;->x:Z

    invoke-static {v0, v3, v1, v2, p1}, Lmt2/e;->p(Lot2/m;ZLc93/a;Lmt2/f;Lmt2/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lch0/e;->y:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;

    iget-object v1, p0, Lch0/e;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/Date;

    iget-object v2, p0, Lch0/e;->E:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    check-cast p1, Ltb/a;

    iget-boolean v3, p0, Lch0/e;->x:Z

    invoke-static {v3, v0, v1, v2, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->d(ZLio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;Ljava/util/Date;Ljava/lang/String;Ltb/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lch0/e;->y:Ljava/lang/Object;

    check-cast v0, Lid2/j;

    iget-object v1, p0, Lch0/e;->z:Ljava/lang/Object;

    check-cast v1, Lid2/j;

    iget-object v2, p0, Lch0/e;->E:Ljava/lang/Object;

    check-cast v2, Lid2/j;

    check-cast p1, Lp1/i0;

    iget-boolean v3, p0, Lch0/e;->x:Z

    invoke-static {v0, v3, v1, v2, p1}, Lid2/n;->f(Lid2/j;ZLid2/j;Lid2/j;Lp1/i0;)Lp1/h0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lch0/e;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ly3/c;

    iget-object v0, p0, Lch0/e;->z:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lch0/e;->E:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ld0/l;

    move-object v2, p1

    check-cast v2, Lg1/z3;

    new-instance v1, Lg1/y3;

    iget-boolean v6, p0, Lch0/e;->x:Z

    invoke-direct/range {v1 .. v6}, Lg1/y3;-><init>(Lg1/z3;Ly3/c;Lkotlin/jvm/functions/Function1;Ld0/l;Z)V

    return-object v1

    :pswitch_8
    iget-object v0, p0, Lch0/e;->y:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    iget-object v1, p0, Lch0/e;->z:Ljava/lang/Object;

    check-cast v1, Li2/g;

    iget-object v2, p0, Lch0/e;->E:Ljava/lang/Object;

    check-cast v2, Li2/p;

    check-cast p1, Lk2/c;

    check-cast p1, La3/p0;

    invoke-virtual {p1}, La3/p0;->a()V

    iget-object p1, p1, La3/p0;->w:Lk2/b;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lch0/e;->x:Z

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lk2/e;->B0()J

    move-result-wide v3

    iget-object v5, p1, Lk2/b;->x:La3/p;

    invoke-virtual {v5}, La3/p;->A()J

    move-result-wide v6

    invoke-virtual {v5}, La3/p;->w()Li2/v;

    move-result-object v0

    invoke-interface {v0}, Li2/v;->q()V

    :try_start_0
    iget-object v0, v5, La3/p;->x:Ljava/lang/Object;

    check-cast v0, Laj/d;

    const/high16 v8, -0x40800000    # -1.0f

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-virtual {v0, v8, v3, v4, v9}, Laj/d;->w(FJF)V

    invoke-virtual {p1, v1, v2}, Lk2/b;->e(Li2/g;Li2/p;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v5, v6, v7}, Ld;->z(La3/p;J)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-static {v5, v6, v7}, Ld;->z(La3/p;J)V

    throw p1

    :cond_1
    invoke-virtual {p1, v1, v2}, Lk2/b;->e(Li2/g;Li2/p;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lch0/e;->y:Ljava/lang/Object;

    check-cast v0, Leb/u0;

    iget-object v1, p0, Lch0/e;->z:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/weightlifting/StrengthTrainerDestination$h$a;

    iget-object v2, p0, Lch0/e;->E:Ljava/lang/Object;

    check-cast v2, Ll83/h;

    check-cast p1, Ldv2/b;

    iget-boolean v3, p0, Lch0/e;->x:Z

    invoke-static {v0, v1, v3, v2, p1}, Lev2/u;->m(Leb/u0;Lcom/whoop/weightlifting/StrengthTrainerDestination$h$a;ZLl83/h;Ldv2/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lch0/e;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lch0/e;->E:Ljava/lang/Object;

    check-cast v1, Lz1/s;

    iget-object v2, p0, Lch0/e;->z:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    check-cast p1, Ln0/q;

    iget-boolean v3, p0, Lch0/e;->x:Z

    invoke-static {v0, v3, v1, v2, p1}, Lcom/whoop/settings/h;->h(Ljava/util/List;ZLz1/s;Lp1/c1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lch0/e;->y:Ljava/lang/Object;

    check-cast v0, Lep0/j;

    iget-object v1, p0, Lch0/e;->z:Ljava/lang/Object;

    check-cast v1, Ltr2/n;

    iget-object v2, p0, Lch0/e;->E:Ljava/lang/Object;

    check-cast v2, Ldp0/g;

    check-cast p1, Lp1/i0;

    iget-boolean v3, p0, Lch0/e;->x:Z

    invoke-static {v0, v1, v3, v2, p1}, Ldp0/f;->a(Lep0/j;Ltr2/n;ZLdp0/g;Lp1/i0;)Lp1/h0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lch0/e;->y:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    iget-object v1, p0, Lch0/e;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lch0/e;->E:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/profile/view/edit/form/TextFieldConfig;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-boolean v3, p0, Lch0/e;->x:Z

    invoke-static {v3, v0, v1, v2, p1}, Lcom/whoop/profile/view/edit/EditProfileFieldsContentKt;->b(ZLc93/a;Lkotlin/jvm/functions/Function1;Lcom/whoop/profile/view/edit/form/TextFieldConfig;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lch0/e;->y:Ljava/lang/Object;

    check-cast v0, Lor2/h0;

    iget-object v1, p0, Lch0/e;->z:Ljava/lang/Object;

    check-cast v1, Lvl2/w$c;

    iget-object v2, p0, Lch0/e;->E:Ljava/lang/Object;

    check-cast v2, Lcm2/v;

    check-cast p1, Ljb1/b;

    iget-boolean v3, p0, Lch0/e;->x:Z

    invoke-static {v3, v0, v1, v2, p1}, Lcm2/v;->b(ZLor2/h0;Lvl2/w$c;Lcm2/v;Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lch0/e;->y:Ljava/lang/Object;

    check-cast v0, Ly2/w;

    iget-object v1, p0, Lch0/e;->z:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    iget-object v2, p0, Lch0/e;->E:Ljava/lang/Object;

    check-cast v2, Lch0/v0;

    check-cast p1, Ljava/lang/String;

    iget-boolean v3, p0, Lch0/e;->x:Z

    invoke-static {v3, v0, v1, v2, p1}, Lch0/n;->i(ZLy2/w;Lp1/c1;Lch0/v0;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
