.class public final synthetic Lbm2/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V
    .locals 0

    .line 1
    iput p4, p0, Lbm2/d0;->w:I

    iput-object p1, p0, Lbm2/d0;->y:Ljava/lang/Object;

    iput-object p2, p0, Lbm2/d0;->z:Ljava/lang/Object;

    iput-boolean p3, p0, Lbm2/d0;->x:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZLjava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, Lbm2/d0;->w:I

    iput-object p1, p0, Lbm2/d0;->y:Ljava/lang/Object;

    iput-boolean p2, p0, Lbm2/d0;->x:Z

    iput-object p3, p0, Lbm2/d0;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lp1/c1;Z)V
    .locals 1

    .line 3
    const/4 v0, 0x3

    iput v0, p0, Lbm2/d0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p3, p0, Lbm2/d0;->x:Z

    iput-object p2, p0, Lbm2/d0;->z:Ljava/lang/Object;

    iput-object p1, p0, Lbm2/d0;->y:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 4
    iput p4, p0, Lbm2/d0;->w:I

    iput-boolean p1, p0, Lbm2/d0;->x:Z

    iput-object p2, p0, Lbm2/d0;->y:Ljava/lang/Object;

    iput-object p3, p0, Lbm2/d0;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    iget v0, p0, Lbm2/d0;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iget-boolean v2, p0, Lbm2/d0;->x:Z

    iget-object v3, p0, Lbm2/d0;->z:Ljava/lang/Object;

    iget-object v4, p0, Lbm2/d0;->y:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v4, Lv90/k;

    check-cast v3, Lp1/c1;

    invoke-static {v2, v4, v3}, Lv90/n;->e(ZLv90/k;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    check-cast v4, Ljava/lang/String;

    check-cast v3, Loo2/c;

    invoke-static {v2, v4, v3}, Lto2/a;->e(ZLjava/lang/String;Loo2/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    check-cast v4, Lt20/n;

    check-cast v3, Lp00/j;

    if-eqz v2, :cond_0

    iget-object v0, v4, Lt20/n;->r:Lkotlin/jvm/functions/Function1;

    sget-object v2, Lb30/n3;->a:Lb30/n3;

    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {v3}, Lp00/j;->invoke()Ljava/lang/Object;

    iget-object v0, v4, Lt20/n;->q:Lkotlin/jvm/functions/Function1;

    new-instance v2, Lsz0/k;

    const/16 v3, 0x11

    invoke-direct {v2, v3}, Lsz0/k;-><init>(I)V

    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1

    :pswitch_2
    check-cast v4, Lc93/a;

    check-cast v3, Lp1/c1;

    invoke-static {v4, v2, v3}, Lry0/b;->b(Lc93/a;ZLp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    check-cast v4, Ljava/lang/String;

    check-cast v3, Ljava/lang/String;

    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-static {v4, v3, v2}, Lio/getstream/chat/android/client/api/models/identifier/IdentifiersKt;->HideChannelIdentifier(Ljava/lang/String;Ljava/lang/String;Z)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_4
    check-cast v4, Lio/getstream/chat/android/models/Reaction;

    check-cast v3, Ljava/lang/String;

    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-static {v4, v2, v3}, Lio/getstream/chat/android/client/api/models/identifier/IdentifiersKt;->SendReactionIdentifier(Lio/getstream/chat/android/models/Reaction;ZLjava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_5
    check-cast v4, Lh20/z4;

    move-object v9, v3

    check-cast v9, Lec3/f2;

    iget-object v0, v4, Lh20/z4;->a:Ljava/lang/Object;

    new-instance v1, Lh00/l0;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Lh00/l0;-><init>(I)V

    invoke-static {v0, v1}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v6

    iget-object v1, v4, Lh20/z4;->i:Lh20/f;

    iget-object v7, v1, Lh20/f;->b:Lec3/r1;

    new-instance v1, Lh00/l0;

    const/16 v2, 0xb

    invoke-direct {v1, v2}, Lh00/l0;-><init>(I)V

    invoke-static {v0, v1}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v8

    new-instance v5, Le30/d;

    new-instance v10, Ld30/g;

    const/4 v0, 0x1

    invoke-direct {v10, v4, v0}, Ld30/g;-><init>(Lh20/z4;I)V

    new-instance v12, Lh02/n0;

    const/4 v0, 0x4

    invoke-direct {v12, v4, v0}, Lh02/n0;-><init>(Ljava/lang/Object;I)V

    iget-boolean v11, p0, Lbm2/d0;->x:Z

    invoke-direct/range {v5 .. v12}, Le30/d;-><init>(Ln53/e;Lec3/r1;Ln53/e;Lec3/f2;Ld30/g;ZLh02/n0;)V

    return-object v5

    :pswitch_6
    check-cast v4, Lg1/s0;

    check-cast v3, Lbc3/c0;

    if-eqz v2, :cond_1

    sget-object v0, Lg1/t0;->w:Lg1/t0;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lg1/t0;->w:Lg1/t0;

    iget-object v2, v4, Lg1/s0;->a:Lg1/a0;

    iget-object v2, v2, Lg1/a0;->d:Lkotlin/jvm/functions/Function1;

    invoke-interface {v2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lg1/j2;

    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-direct {v0, v4, v5, v2}, Lg1/j2;-><init>(Lg1/s0;Lq83/d;I)V

    const/4 v2, 0x3

    invoke-static {v3, v5, v5, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_1
    return-object v1

    :pswitch_7
    check-cast v3, Lp1/c1;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v4, v3, v2}, Leg2/i;->b(Lkotlin/jvm/functions/Function1;Lp1/c1;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    check-cast v4, Landroid/app/DatePickerDialog;

    check-cast v3, Lc93/a;

    invoke-static {v2, v4, v3}, Ld42/p;->p(ZLandroid/app/DatePickerDialog;Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    check-cast v4, Lq2/a;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v4, v2, v3}, Lc31/p;->e(Lq2/a;ZLkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    check-cast v4, Ljava/util/Locale;

    check-cast v3, Lp1/c1;

    invoke-static {v2, v4, v3}, Lbm2/e0;->k(ZLjava/util/Locale;Lp1/c1;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
