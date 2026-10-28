.class public final synthetic Lej1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcz/n0;I)V
    .locals 0

    .line 1
    const/16 p2, 0x16

    iput p2, p0, Lej1/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lej1/h;->x:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, Lej1/h;->w:I

    iput-object p1, p0, Lej1/h;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lej1/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lej1/h;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/settings/debug/AiChatTalkTextCardDebugFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/settings/debug/AiChatTalkTextCardDebugFragment;->z(Lcom/whoop/settings/debug/AiChatTalkTextCardDebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lej1/h;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/settings/debug/AiChatJournalEntryWidgetDebugFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/settings/debug/AiChatJournalEntryWidgetDebugFragment;->z(Lcom/whoop/settings/debug/AiChatJournalEntryWidgetDebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lej1/h;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;->F(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lej1/h;->x:Ljava/lang/Object;

    check-cast v0, Lh41/c;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lh41/b;->f(Lh41/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lej1/h;->x:Ljava/lang/Object;

    check-cast v0, Lkd1/o;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lh21/c;->a(Lkd1/o;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lej1/h;->x:Ljava/lang/Object;

    check-cast v0, Lh20/z4;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Ljava/util/List;

    const-string v1, "items"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_5

    check-cast p2, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lh20/r0;

    if-eqz v2, :cond_0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lh20/r0;

    iget-object v1, v0, Lh20/z4;->i:Lh20/f;

    iget-object v1, v1, Lh20/f;->g:Ln53/e;

    iget-object v1, v1, Ln53/e;->y:Ll83/e;

    check-cast v1, Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iget-object p2, p2, Lh20/r0;->a:Lh20/l;

    invoke-virtual {p2, v1}, Lh20/l;->d(Z)Z

    move-result p2

    if-eqz p2, :cond_3

    goto :goto_2

    :cond_4
    :goto_1
    const/4 p1, 0x0

    goto :goto_3

    :cond_5
    :goto_2
    const/4 p1, 0x1

    :goto_3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lej1/h;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/nativestore/pdp/view/ProductDescriptionPageFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/nativestore/pdp/view/ProductDescriptionPageFragment;->z(Lcom/whoop/nativestore/pdp/view/ProductDescriptionPageFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lej1/h;->x:Ljava/lang/Object;

    check-cast v0, Lcz/n0;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, p1, p2}, Le4/a;->e(Lcz/n0;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lej1/h;->x:Ljava/lang/Object;

    check-cast v0, Lft1/c$g;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lgt1/f;->b(Lft1/c$g;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lej1/h;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/universalcheckout/features/cart/view/UniversalCartDialogFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/universalcheckout/features/cart/view/UniversalCartDialogFragment;->F(Lcom/whoop/universalcheckout/features/cart/view/UniversalCartDialogFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lej1/h;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/referafriend/ReferAFriendFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/referafriend/ReferAFriendFragment;->C(Lcom/whoop/referafriend/ReferAFriendFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lej1/h;->x:Ljava/lang/Object;

    check-cast v0, Lg40/a2;

    check-cast p1, Ll40/a;

    check-cast p2, Lg40/k2;

    const-string v1, "phoneEntry"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "formatter"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, v0, Lg40/a2;->b:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    new-instance v1, Ll83/k;

    invoke-direct {v1, p2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getPhoneNumberCountry$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p1

    new-instance p2, Ll40/a;

    iget-object v0, v0, Lg40/a2;->c:Lg40/z1;

    invoke-virtual {v0}, Lg40/z1;->u()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    invoke-direct {p2, v0, v2}, Ll40/a;-><init>(Ljava/lang/String;Z)V

    new-instance v0, Ll83/k;

    invoke-direct {v0, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v0}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lej1/h;->x:Ljava/lang/Object;

    check-cast v0, Lg40/z1;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/Integer;

    const-string v1, "value"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_4

    :cond_6
    move p2, v2

    :goto_4
    if-ge v1, p2, :cond_7

    iget-boolean p2, v0, Lg40/z1;->c:Z

    if-eqz p2, :cond_8

    :cond_7
    const/4 v2, 0x1

    :cond_8
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    new-instance v0, Ll83/k;

    invoke-direct {v0, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :pswitch_c
    iget-object v0, p0, Lej1/h;->x:Ljava/lang/Object;

    check-cast v0, Lg1/y3;

    check-cast p1, Ly3/l;

    check-cast p2, Ly3/a;

    iget-wide v1, p2, Ly3/a;->a:J

    invoke-static {v1, v2}, Ly3/a;->h(J)I

    move-result p2

    int-to-float p2, p2

    new-instance v1, Lg1/k3;

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    sget-object v3, Lg1/z3;->w:Lg1/z3;

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, p2, v3

    iget-boolean v4, v0, Lg1/y3;->a:Z

    const-wide v5, 0xffffffffL

    if-nez v4, :cond_9

    iget-wide v7, p1, Ly3/l;->a:J

    and-long/2addr v7, v5

    long-to-int v4, v7

    int-to-float v4, v4

    cmpl-float v4, v4, v3

    if-lez v4, :cond_9

    sget-object v4, Lg1/z3;->y:Lg1/z3;

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    iget-wide v3, p1, Ly3/l;->a:J

    and-long/2addr v3, v5

    long-to-int p1, v3

    if-eqz p1, :cond_a

    sget-object v3, Lg1/z3;->x:Lg1/z3;

    int-to-float p1, p1

    sub-float/2addr p2, p1

    const/4 p1, 0x0

    invoke-static {p1, p2}, Ljava/lang/Math;->max(FF)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {v2, v3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    invoke-direct {v1, v2}, Lg1/k3;-><init>(Ljava/util/Map;)V

    iget-object p1, v0, Lg1/y3;->b:Lg1/a0;

    invoke-virtual {p1}, Lg1/a0;->e()Lg1/k3;

    move-result-object p1

    iget-object p1, p1, Lg1/k3;->a:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result p1

    const/4 p2, 0x1

    if-lez p1, :cond_b

    move p1, p2

    goto :goto_5

    :cond_b
    const/4 p1, 0x0

    :goto_5
    invoke-virtual {v0}, Lg1/y3;->b()Lg1/z3;

    move-result-object v3

    if-nez p1, :cond_c

    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    goto :goto_8

    :cond_c
    invoke-virtual {v0}, Lg1/y3;->c()Lg1/z3;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_11

    if-eq p1, p2, :cond_e

    const/4 p2, 0x2

    if-ne p1, p2, :cond_d

    goto :goto_6

    :cond_d
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_e
    :goto_6
    sget-object p1, Lg1/z3;->y:Lg1/z3;

    invoke-interface {v2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_f

    :goto_7
    move-object v3, p1

    goto :goto_8

    :cond_f
    sget-object p1, Lg1/z3;->x:Lg1/z3;

    invoke-interface {v2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_10

    goto :goto_7

    :cond_10
    sget-object p1, Lg1/z3;->w:Lg1/z3;

    goto :goto_7

    :cond_11
    sget-object v3, Lg1/z3;->w:Lg1/z3;

    :goto_8
    new-instance p1, Ll83/k;

    invoke-direct {p1, v1, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lej1/h;->x:Ljava/lang/Object;

    check-cast v0, Lfo2/d;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lfo2/c;->f(Lfo2/d;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lej1/h;->x:Ljava/lang/Object;

    check-cast v0, Lfj1/m;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lfj1/l;->d(Lfj1/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lej1/h;->x:Ljava/lang/Object;

    check-cast v0, Lcj1/p;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lfj1/e;->c(Lcj1/p;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lej1/h;->x:Ljava/lang/Object;

    check-cast v0, Ly2/y;

    check-cast p1, Lf1/l;

    check-cast p2, Lf1/l;

    invoke-virtual {p1}, Lf1/l;->d()Ly2/y;

    move-result-object p1

    invoke-virtual {p2}, Lf1/l;->d()Ly2/y;

    move-result-object p2

    const-wide/16 v1, 0x0

    if-eqz p1, :cond_12

    invoke-interface {v0, p1, v1, v2}, Ly2/y;->k(Ly2/y;J)J

    move-result-wide v3

    goto :goto_9

    :cond_12
    move-wide v3, v1

    :goto_9
    if-eqz p2, :cond_13

    invoke-interface {v0, p2, v1, v2}, Ly2/y;->k(Ly2/y;J)J

    move-result-wide v1

    :cond_13
    const-wide p1, 0xffffffffL

    and-long v5, v3, p1

    long-to-int v0, v5

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    and-long/2addr p1, v1

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    cmpg-float p2, v5, p2

    if-nez p2, :cond_14

    const/16 p1, 0x20

    shr-long/2addr v3, p1

    long-to-int p2, v3

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    shr-long v0, v1, p1

    long-to-int p1, v0

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p2, p1}, Lq83/g;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    goto :goto_a

    :cond_14
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p2, p1}, Lq83/g;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    :goto_a
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lej1/h;->x:Ljava/lang/Object;

    check-cast v0, Lf1/w0;

    move-object v1, p1

    check-cast v1, Lw0/a;

    move-object v2, p2

    check-cast v2, Landroid/content/Context;

    invoke-virtual {v0}, Lf1/w0;->e()Ll83/k;

    move-result-object p1

    const/4 p2, 0x0

    if-eqz p1, :cond_15

    iget-object v3, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v3, Ll3/g;

    move-object v4, v3

    goto :goto_b

    :cond_15
    move-object v4, p2

    :goto_b
    if-eqz p1, :cond_16

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Ll3/u0;

    :cond_16
    move-object v5, p2

    iget-object v6, v0, Lf1/w0;->w:Lf1/p;

    new-instance v7, Lcom/whoop/profile/view/edit/n;

    const/16 p1, 0x1d

    invoke-direct {v7, p1, v0, v2}, Lcom/whoop/profile/view/edit/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 v3, 0x0

    invoke-static/range {v1 .. v7}, Lf1/q;->a(Lw0/a;Landroid/content/Context;ZLjava/lang/CharSequence;Ll3/u0;Lf1/p;Lkotlin/jvm/functions/Function1;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lej1/h;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;->B(Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lej1/h;->x:Ljava/lang/Object;

    check-cast v0, Lf01/u1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lf01/t1;->c(Lf01/u1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lej1/h;->x:Ljava/lang/Object;

    check-cast v0, Lf01/h0;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lf01/g0;->a(Lf01/h0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lej1/h;->x:Ljava/lang/Object;

    check-cast v0, Lf01/e0;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lf01/d0;->b(Lf01/e0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lej1/h;->x:Ljava/lang/Object;

    check-cast v0, Lf01/u;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lf01/t;->c(Lf01/u;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lej1/h;->x:Ljava/lang/Object;

    check-cast v0, Lcv1/d;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lev1/j;->b(Lcv1/d;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lej1/h;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;->z(Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lej1/h;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/hormonalinsights/onboarding/view/MciOnboardingFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/hormonalinsights/onboarding/view/MciOnboardingFragment;->D(Lcom/whoop/hormonalinsights/onboarding/view/MciOnboardingFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lej1/h;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/changepassword/view/reset/PasswordResetFragment;->A(Lcom/whoop/changepassword/view/reset/PasswordResetFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lej1/h;->x:Ljava/lang/Object;

    check-cast v0, Lej1/j0;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lej1/i0;->a(Lej1/j0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lej1/h;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/health/view/HealthTabFragment;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/whoop/health/view/HealthTabFragment;->y(Lcom/whoop/health/view/HealthTabFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

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
