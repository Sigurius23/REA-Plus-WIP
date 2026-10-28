.class public final synthetic Lv40/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lv40/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    iget v0, p0, Lv40/d;->w:I

    const-class v1, Lkotlinx/datetime/DateTimeUnit$MonthBased;

    const-class v2, Lkotlinx/datetime/DateTimeUnit$DayBased;

    const-string v3, "Blank serial names are prohibited"

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    packed-switch v0, :pswitch_data_0

    new-array v0, v6, [Lyc3/g;

    const-string v8, "kotlinx.datetime.TimeBased"

    invoke-static {v8}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v12, Lyc3/a;

    invoke-direct {v12, v8}, Lyc3/a;-><init>(Ljava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    invoke-interface {v1}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v1

    const-string v2, "nanoseconds"

    invoke-virtual {v12, v2, v1, v6}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    new-instance v7, Lyc3/h;

    sget-object v9, Lyc3/l;->a:Lyc3/l;

    iget-object v1, v12, Lyc3/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v10

    invoke-static {v0}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    invoke-direct/range {v7 .. v12}, Lyc3/h;-><init>(Ljava/lang/String;Lyc3/k;ILjava/util/List;Lyc3/a;)V

    return-object v7

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    new-array v0, v6, [Lyc3/g;

    const-string v8, "kotlinx.datetime.MonthBased"

    invoke-static {v8}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v12, Lyc3/a;

    invoke-direct {v12, v8}, Lyc3/a;-><init>(Ljava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    invoke-interface {v1}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v1

    const-string v2, "months"

    invoke-virtual {v12, v2, v1, v6}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    new-instance v7, Lyc3/h;

    sget-object v9, Lyc3/l;->a:Lyc3/l;

    iget-object v1, v12, Lyc3/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v10

    invoke-static {v0}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    invoke-direct/range {v7 .. v12}, Lyc3/h;-><init>(Ljava/lang/String;Lyc3/k;ILjava/util/List;Lyc3/a;)V

    return-object v7

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_1
    new-array v0, v6, [Lyc3/g;

    const-string v8, "kotlinx.datetime.DayBased"

    invoke-static {v8}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v12, Lyc3/a;

    invoke-direct {v12, v8}, Lyc3/a;-><init>(Ljava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    invoke-interface {v1}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v1

    const-string v2, "days"

    invoke-virtual {v12, v2, v1, v6}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    new-instance v7, Lyc3/h;

    sget-object v9, Lyc3/l;->a:Lyc3/l;

    iget-object v1, v12, Lyc3/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v10

    invoke-static {v0}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    invoke-direct/range {v7 .. v12}, Lyc3/h;-><init>(Ljava/lang/String;Lyc3/k;ILjava/util/List;Lyc3/a;)V

    return-object v7

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_2
    new-instance v0, Lwc3/g;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v7, Lkotlinx/datetime/DateTimeUnit;

    invoke-virtual {v3, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v3, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-class v8, Lkotlinx/datetime/DateTimeUnit$TimeBased;

    invoke-virtual {v3, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const/4 v8, 0x3

    new-array v9, v8, [Lj93/d;

    aput-object v2, v9, v6

    aput-object v1, v9, v5

    aput-object v3, v9, v4

    new-array v1, v8, [Lwc3/c;

    sget-object v2, Lvc3/g;->a:Lvc3/g;

    aput-object v2, v1, v6

    sget-object v2, Lvc3/l;->a:Lvc3/l;

    aput-object v2, v1, v5

    sget-object v2, Lvc3/m;->a:Lvc3/m;

    aput-object v2, v1, v4

    const-string v2, "kotlinx.datetime.DateTimeUnit"

    invoke-direct {v0, v2, v7, v9, v1}, Lwc3/g;-><init>(Ljava/lang/String;Lj93/d;[Lj93/d;[Lwc3/c;)V

    return-object v0

    :pswitch_3
    new-instance v0, Lwc3/g;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v7, Lkotlinx/datetime/DateTimeUnit$DateBased;

    invoke-virtual {v3, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v3, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-array v3, v4, [Lj93/d;

    aput-object v2, v3, v6

    aput-object v1, v3, v5

    new-array v1, v4, [Lwc3/c;

    sget-object v2, Lvc3/g;->a:Lvc3/g;

    aput-object v2, v1, v6

    sget-object v2, Lvc3/l;->a:Lvc3/l;

    aput-object v2, v1, v5

    const-string v2, "kotlinx.datetime.DateTimeUnit.DateBased"

    invoke-direct {v0, v2, v7, v3, v1}, Lwc3/g;-><init>(Ljava/lang/String;Lj93/d;[Lj93/d;[Lwc3/c;)V

    return-object v0

    :pswitch_4
    invoke-static {}, Lvb2/a;->c()Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {}, Lcom/whoop/design/models/items/hrzonesrow/HrZonesRowModel$HrZone;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-static {}, Lcom/whoop/design/models/items/hrzonesrow/HrZonesRowModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-static {}, Lcom/whoop/design/models/colortheme/ColorValueModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_8
    invoke-static {}, Lcom/whoop/design/models/colortheme/ColorBackgroundType;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_9
    invoke-static {}, Lcom/whoop/design/models/colortheme/ColorBackgroundModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-static {}, Lcom/whoop/design/models/colortheme/ColorBackgroundModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_b
    invoke-static {}, Lv90/u;->b()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_c
    invoke-static {}, Lv90/s;->a()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_d
    invoke-static {}, Lv90/n;->b()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_e
    invoke-static {}, Lv90/k;->a()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_f
    invoke-static {}, Lv71/d;->b()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_10
    invoke-static {}, Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentLayout;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_11
    invoke-static {}, Lcom/whoop/design/atomic/organism/expandablecontent/ExpandableContentHeaderPosition;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_12
    invoke-static {}, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_13
    invoke-static {}, Lv41/q0;->f()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_14
    invoke-static {}, Lv41/q0;->a()Lud3/l0;

    move-result-object v0

    return-object v0

    :pswitch_15
    invoke-static {}, Lv41/g0;->f()Lv41/f0;

    move-result-object v0

    return-object v0

    :pswitch_16
    invoke-static {}, Lv41/d0;->n()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_17
    invoke-static {}, Lv41/e;->a()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_18
    invoke-static {}, Lv41/e;->b()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_19
    invoke-static {}, Lv41/e;->f()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1a
    invoke-static {}, Lv41/d;->e()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1b
    invoke-static {}, Lv41/d;->h()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1c
    invoke-static {}, Lcom/stripe/hcaptcha/config/HCaptchaTheme;->a()Lwc3/c;

    move-result-object v0

    return-object v0

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
