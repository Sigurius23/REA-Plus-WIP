.class public final synthetic Lg1/w8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lg1/w8;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lg1/w8;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/util/Map;

    invoke-static {p1, p2}, Li22/c;->s(Ljava/lang/String;Ljava/util/Map;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/util/Map;

    invoke-static {p1, p2}, Li22/c;->f(Ljava/lang/String;Ljava/util/Map;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/Long;

    invoke-static {p1, p2}, Li11/e;->a(Ljava/lang/String;Ljava/lang/Long;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lhz1/a;->d(Lxf3/c;Luf3/a;)Ljz1/b;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lhz1/a;->a(Lxf3/c;Luf3/a;)Lkz1/a;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lhz1/a;->c(Lxf3/c;Luf3/a;)Liz1/c;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lhz1/a;->b(Lxf3/c;Luf3/a;)Lgz1/a;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Le41/k;

    check-cast p2, Le41/k;

    invoke-static {p1, p2}, Lhy0/b1;->f(Le41/k;Le41/k;)Lg1/g9;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Landroidx/compose/ui/Modifier;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p2, p1}, Lhy0/f0;->b(ILandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Landroidx/compose/ui/Modifier;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p2, p1}, Lhy0/f0;->h(ILandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lhy0/b;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lhy0/b;->b(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lhy0/b;->c(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lh60/a;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, La30/a;

    check-cast p2, Lv00/c0;

    if-eqz p2, :cond_0

    iget-object p2, p2, Lv00/c0;->P:Lv00/p;

    if-eqz p2, :cond_0

    iget-boolean p2, p2, Lv00/p;->z:Z

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    if-eqz p1, :cond_0

    iget-object p1, p1, La30/a;->x:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1

    :pswitch_e
    check-cast p1, Ljava/util/List;

    check-cast p2, Lv00/o;

    const-string v0, "paymentMethods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p2, :cond_4

    iget-object v1, p2, Lv00/o;->w:Lmy/b;

    sget-object v2, Lmy/b;->x:Lmy/b;

    const/4 v3, 0x1

    if-eq v1, v2, :cond_2

    sget-object v2, Lmy/b;->y:Lmy/b;

    if-ne v1, v2, :cond_1

    goto :goto_1

    :cond_1
    move v1, v0

    goto :goto_2

    :cond_2
    :goto_1
    move v1, v3

    :goto_2
    iget-boolean p2, p2, Lv00/o;->x:Z

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-eqz p1, :cond_4

    if-eq p1, v3, :cond_3

    move v0, v1

    goto :goto_3

    :cond_3
    if-eqz p2, :cond_4

    if-eqz v1, :cond_4

    move v0, v3

    :cond_4
    :goto_3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, La30/a;

    check-cast p2, Lv00/o;

    if-eqz p2, :cond_5

    iget-boolean p1, p2, Lv00/o;->y:Z

    goto :goto_4

    :cond_5
    const/4 p1, 0x0

    :goto_4
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lgv1/b;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lgp2/a;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lgh0/a;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Ljava/lang/String;

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll40/a;

    invoke-direct {v0, p2, p1}, Ll40/a;-><init>(Ljava/lang/String;Z)V

    return-object v0

    :pswitch_14
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Lg40/s3;

    const-string v0, "fieldState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Lg40/s3;->f()Lg40/h1;

    move-result-object p2

    if-eqz p2, :cond_6

    if-eqz p1, :cond_6

    goto :goto_5

    :cond_6
    const/4 p2, 0x0

    :goto_5
    return-object p2

    :pswitch_15
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    const-string v0, "rawFieldValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll40/a;

    invoke-direct {v0, p1, p2}, Ll40/a;-><init>(Ljava/lang/String;Z)V

    return-object v0

    :pswitch_16
    check-cast p1, Ljava/lang/String;

    check-cast p2, Lg40/k2;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formatter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lg40/k2;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Ljava/lang/String;

    new-instance v0, Ll40/a;

    invoke-direct {v0, p2, p1}, Ll40/a;-><init>(Ljava/lang/String;Z)V

    return-object v0

    :pswitch_18
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Ljava/lang/Integer;

    const/4 v0, 0x0

    if-eqz p1, :cond_7

    if-nez p2, :cond_7

    new-instance p1, Lg40/f1;

    const p2, 0x7f140fce

    invoke-direct {p1, p2, v0}, Lg40/f1;-><init>(ILjava/util/List;)V

    move-object v0, p1

    :cond_7
    return-object v0

    :pswitch_19
    check-cast p1, Lg40/f;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lg40/f;->b(Z)V

    return-object p1

    :pswitch_1a
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Ljava/lang/String;

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll40/a;

    invoke-direct {v0, p2, p1}, Ll40/a;-><init>(Ljava/lang/String;Z)V

    return-object v0

    :pswitch_1b
    check-cast p1, Ly2/q0;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, p2}, Ly2/q0;->O(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Ly2/q0;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, p2}, Ly2/q0;->b(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

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
