.class public final synthetic Lf01/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lf01/f;->w:I

    iput-object p2, p0, Lf01/f;->y:Ljava/lang/Object;

    iput-object p3, p0, Lf01/f;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 2
    iput p4, p0, Lf01/f;->w:I

    iput-object p1, p0, Lf01/f;->y:Ljava/lang/Object;

    iput-object p2, p0, Lf01/f;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lf41/e;)V
    .locals 1

    .line 3
    const/4 v0, 0x7

    iput v0, p0, Lf01/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf01/f;->x:Ljava/lang/Object;

    iput-object p2, p0, Lf01/f;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lf01/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf01/f;->y:Ljava/lang/Object;

    check-cast v0, Lj01/d;

    iget-object v1, p0, Lf01/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lj01/b;->a(Lj01/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lf01/f;->y:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    iget-object v1, p0, Lf01/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/util/Collection;

    check-cast p2, Lio/getstream/chat/android/models/User;

    invoke-static {v0, v1, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->s(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Lkotlin/jvm/functions/Function1;Ljava/util/Collection;Lio/getstream/chat/android/models/User;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lf01/f;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lf01/f;->x:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/api2/MoshiChatApi;

    check-cast p1, Lio/getstream/chat/android/client/api2/mapping/DomainMapping;

    check-cast p2, Lio/getstream/chat/android/client/api2/model/response/PushPreferencesResponse;

    invoke-static {v0, v1, p1, p2}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->l0(Ljava/lang/String;Lio/getstream/chat/android/client/api2/MoshiChatApi;Lio/getstream/chat/android/client/api2/mapping/DomainMapping;Lio/getstream/chat/android/client/api2/model/response/PushPreferencesResponse;)Lo23/d;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lf01/f;->y:Ljava/lang/Object;

    check-cast v0, Ly3/c;

    iget-object v1, p0, Lf01/f;->x:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lid2/n;->e(Ly3/c;Lc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lf01/f;->y:Ljava/lang/Object;

    check-cast v0, Lic2/a;

    iget-object v1, p0, Lf01/f;->x:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lic2/f;->k(Lic2/a;Lc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lf01/f;->y:Ljava/lang/Object;

    check-cast v0, Lh81/g;

    iget-object v1, p0, Lf01/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lh81/e;->c(Lh81/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lf01/f;->y:Ljava/lang/Object;

    check-cast v0, Lh00/o0;

    iget-object v1, p0, Lf01/f;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lh00/n0;->d(Lh00/o0;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lf01/f;->y:Ljava/lang/Object;

    check-cast v0, Ly3/l;

    iget-object v1, p0, Lf01/f;->x:Ljava/lang/Object;

    check-cast v1, Lx1/b;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 p2, 0x31

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lh00/f0;->b(Ly3/l;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lf01/f;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/d0;

    iget-object v1, p0, Lf01/f;->x:Ljava/lang/Object;

    check-cast v1, Lh0/k2;

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    iget p2, v0, Lkotlin/jvm/internal/d0;->w:F

    sub-float/2addr p1, p2

    invoke-interface {v1, p1}, Lh0/k2;->a(F)F

    move-result p1

    add-float/2addr p1, p2

    iput p1, v0, Lkotlin/jvm/internal/d0;->w:F

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lf01/f;->y:Ljava/lang/Object;

    check-cast v0, Lcz/s0;

    iget-object v1, p0, Lf01/f;->x:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/Modifier;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Le4/a;->l(Lcz/s0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lf01/f;->y:Ljava/lang/Object;

    check-cast v0, Lbo1/b;

    iget-object v1, p0, Lf01/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lgo1/b;->c(Lbo1/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lf01/f;->y:Ljava/lang/Object;

    check-cast v0, Lg81/c;

    iget-object v1, p0, Lf01/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lg81/b;->a(Lg81/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lf01/f;->y:Ljava/lang/Object;

    check-cast v0, Lg41/e;

    iget-object v1, p0, Lf01/f;->x:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lg41/d;->j(Lg41/e;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lf01/f;->y:Ljava/lang/Object;

    check-cast v0, Lg40/f;

    iget-object v1, p0, Lf01/f;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/lang/Boolean;

    const-string v2, "fields"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lg40/f;->o:Ljava/lang/Boolean;

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    iput-object p2, v0, Lg40/f;->o:Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    move-object p2, v3

    :goto_0
    iget-object v2, v0, Lg40/f;->d:Lg40/i0;

    iget-boolean v4, v0, Lg40/f;->f:Z

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    move-object v2, v3

    :goto_1
    invoke-static {v2}, Lwb3/f;->L(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v2, p1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p2, :cond_7

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_2

    if-nez v1, :cond_5

    sget-object v1, Lm83/z;->w:Lm83/z;

    goto :goto_4

    :cond_2
    iget-object p2, v0, Lg40/f;->m:Ljava/util/LinkedHashMap;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v2

    invoke-static {v2}, Lm83/g0;->W(I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-virtual {p2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCountry$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_3

    :cond_3
    iget-object v4, v0, Lg40/f;->b:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_4

    const-string v2, ""

    :cond_4
    :goto_3
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_5
    :goto_4
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lg40/y2;

    invoke-interface {p2, v1}, Lg40/y2;->h(Ljava/util/Map;)V

    goto :goto_5

    :cond_6
    sget-object v3, Ll83/a0;->a:Ll83/a0;

    :cond_7
    return-object v3

    :pswitch_d
    iget-object v0, p0, Lf01/f;->y:Ljava/lang/Object;

    check-cast v0, Ll1/g1;

    iget-object v1, p0, Lf01/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lg11/c;->f(Ll1/g1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lf01/f;->y:Ljava/lang/Object;

    check-cast v0, Lx1/b;

    iget-object v1, p0, Lf01/f;->x:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lg1/s6;->a(Lx1/b;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lf01/f;->y:Ljava/lang/Object;

    check-cast v0, Lg1/w;

    iget-object v1, p0, Lf01/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/d0;

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    iget-object v0, v0, Lg1/w;->a:Lg1/a0;

    iget-object v2, v0, Lg1/a0;->j:Lp1/g1;

    invoke-virtual {v2, p1}, Lp1/g1;->y(F)V

    iget-object v0, v0, Lg1/a0;->l:Lp1/g1;

    invoke-virtual {v0, p2}, Lp1/g1;->y(F)V

    iput p1, v1, Lkotlin/jvm/internal/d0;->w:F

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lf01/f;->y:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v1, p0, Lf01/f;->x:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x7

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lg1/k;->a(Lc93/m;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lf01/f;->y:Ljava/lang/Object;

    check-cast v0, Lg01/d;

    iget-object v1, p0, Lf01/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lg01/c;->a(Lg01/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lf01/f;->y:Ljava/lang/Object;

    check-cast v0, Lwz/d0;

    iget-object v1, p0, Lf01/f;->x:Ljava/lang/Object;

    check-cast v1, Lx1/b;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 p2, 0x31

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lg00/g;->a(Lwz/d0;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lf01/f;->y:Ljava/lang/Object;

    check-cast v0, Lg0/d;

    iget-object v1, p0, Lf01/f;->x:Ljava/lang/Object;

    check-cast v1, Lg0/c;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-virtual {v0, v1, p1, p2}, Lg0/d;->a(Lg0/c;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lf01/f;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lf01/f;->x:Ljava/lang/Object;

    check-cast v1, Lfj1/c;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lfj1/b;->d(Landroidx/compose/ui/Modifier;Lfj1/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lf01/f;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lf01/f;->y:Ljava/lang/Object;

    check-cast v1, Lf41/e;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lf41/p;->h(Lkotlin/jvm/functions/Function1;Lf41/e;ZI)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lf01/f;->y:Ljava/lang/Object;

    check-cast v0, Lf1/s1;

    iget-object v1, p0, Lf01/f;->x:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    move-object v2, p1

    check-cast v2, Lw0/a;

    move-object v3, p2

    check-cast v3, Landroid/content/Context;

    iget-object p1, v0, Lf1/s1;->m:Lp1/k1;

    invoke-virtual {p1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {v0}, Lf1/s1;->l()Ll3/g;

    move-result-object p1

    const/4 p2, 0x0

    if-eqz p1, :cond_8

    iget-object p1, p1, Ll3/g;->x:Ljava/lang/String;

    move-object v5, p1

    goto :goto_6

    :cond_8
    move-object v5, p2

    :goto_6
    iget-object p1, v0, Lf1/s1;->w:Ll3/u0;

    if-eqz p1, :cond_9

    iget-wide p1, p1, Ll3/u0;->a:J

    iget-object v6, v0, Lf1/s1;->b:Lq3/r;

    const/16 v7, 0x20

    shr-long v7, p1, v7

    long-to-int v7, v7

    invoke-interface {v6, v7}, Lq3/r;->x(I)I

    move-result v7

    const-wide v8, 0xffffffffL

    and-long/2addr p1, v8

    long-to-int p1, p1

    invoke-interface {v6, p1}, Lq3/r;->x(I)I

    move-result p1

    invoke-static {v7, p1}, Lj93/l0;->f(II)J

    move-result-wide p1

    new-instance v6, Ll3/u0;

    invoke-direct {v6, p1, p2}, Ll3/u0;-><init>(J)V

    goto :goto_7

    :cond_9
    move-object v6, p2

    :goto_7
    iget-object v7, v0, Lf1/s1;->j:Lf1/p;

    new-instance v8, Lep1/g;

    const/4 p1, 0x6

    invoke-direct {v8, v0, v1, v3, p1}, Lep1/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static/range {v2 .. v8}, Lf1/q;->a(Lw0/a;Landroid/content/Context;ZLjava/lang/CharSequence;Ll3/u0;Lf1/p;Lkotlin/jvm/functions/Function1;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lf01/f;->y:Ljava/lang/Object;

    check-cast v0, Lf01/l1;

    iget-object v1, p0, Lf01/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lf01/k1;->a(Lf01/l1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lf01/f;->y:Ljava/lang/Object;

    check-cast v0, Lf01/a1;

    iget-object v1, p0, Lf01/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lf01/z0;->c(Lf01/a1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lf01/f;->y:Ljava/lang/Object;

    check-cast v0, Lf01/u0;

    iget-object v1, p0, Lf01/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lf01/t0;->b(Lf01/u0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lf01/f;->y:Ljava/lang/Object;

    check-cast v0, Lf01/o0;

    iget-object v1, p0, Lf01/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lf01/n0;->d(Lf01/o0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lf01/f;->y:Ljava/lang/Object;

    check-cast v0, Lf01/a0;

    iget-object v1, p0, Lf01/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lf01/z;->a(Lf01/a0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lf01/f;->y:Ljava/lang/Object;

    check-cast v0, Lf01/h;

    iget-object v1, p0, Lf01/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lf01/g;->d(Lf01/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

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
