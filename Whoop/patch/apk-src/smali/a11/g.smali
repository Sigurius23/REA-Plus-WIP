.class public final synthetic La11/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, La11/g;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, La11/g;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lod1/u$a;

    invoke-static {p1}, Lcom/whoop/data/repositories/UserStrapsRepository;->d(Lod1/u$a;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ltd1/e;

    invoke-static {p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->g(Ltd1/e;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lcom/whoop/data/repositories/FeatureFlagRepositoryImpl;->a(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;->c(Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao_Impl;->b(Ltb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao_Impl;->a(Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lch/f;

    return-object p1

    :pswitch_6
    sget-object v0, Lcg/h;->w:Lcg/h;

    check-cast p1, Ljava/util/Map$Entry;

    const-string v1, "<destruct>"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltg/b;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ltg/b;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Lcg/h;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3d

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Lcg/h;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Leg/o;

    const-string v0, "$this$DslBuilderProperty"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Leg/o;->f()Lae3/k;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Leg/j;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Leg/j;-><init>(Ljava/lang/Object;I)V

    return-object v0

    :pswitch_8
    invoke-static {p1}, Lc41/v5;->d(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-static {p1}, Lc41/d5;->c(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    invoke-static {p1}, Lc41/m3;->e(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    invoke-static {p1}, Lc41/n;->a(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lcom/whoop/whoopstatus/models/WhoopStatusArchMiniModel;

    invoke-static {p1}, Lc03/a;->d(Lcom/whoop/whoopstatus/models/WhoopStatusArchMiniModel;)Lt41/a;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lc03/a;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lc03/a;->b(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Lq83/h;

    instance-of v0, p1, Lbc3/c1;

    if-eqz v0, :cond_0

    check-cast p1, Lbc3/c1;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1

    :pswitch_10
    check-cast p1, Lq83/h;

    instance-of v0, p1, Lbc3/z;

    if-eqz v0, :cond_1

    check-cast p1, Lbc3/z;

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return-object p1

    :pswitch_11
    check-cast p1, Lkd1/g;

    invoke-static {p1}, Lb91/e;->a(Lkd1/g;)Lb91/d;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Lb61/k;->l(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Lb61/k;->d(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_14
    invoke-static {p1}, Lb61/k;->k(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lau0/f;->m(Ltb/a;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Ltb/c;

    const-string v0, "statement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ln83/i;

    invoke-direct {v0}, Ln83/i;-><init>()V

    :goto_2
    invoke-interface {p1}, Ltb/c;->e1()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ltb/c;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln83/i;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    invoke-static {v0}, Ldt/b;->g(Ln83/i;)Ln83/i;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Ltb/c;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ltb/c;->e1()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Ljava/util/Map$Entry;

    invoke-static {p1}, Lkotlinx/serialization/json/JsonObject;->a(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Lyc3/a;

    const-string v0, "$this$buildSerialDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La13/f;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, La13/f;-><init>(I)V

    new-instance v1, Lad3/o;

    invoke-direct {v1, v0}, Lad3/o;-><init>(Lc93/a;)V

    const-string v0, "JsonPrimitive"

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    new-instance v0, La13/f;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, La13/f;-><init>(I)V

    new-instance v1, Lad3/o;

    invoke-direct {v1, v0}, Lad3/o;-><init>(Lc93/a;)V

    const-string v0, "JsonNull"

    invoke-virtual {p1, v0, v1, v2}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    new-instance v0, La13/f;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, La13/f;-><init>(I)V

    new-instance v1, Lad3/o;

    invoke-direct {v1, v0}, Lad3/o;-><init>(Lc93/a;)V

    const-string v0, "JsonLiteral"

    invoke-virtual {p1, v0, v1, v2}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    new-instance v0, La13/f;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, La13/f;-><init>(I)V

    new-instance v1, Lad3/o;

    invoke-direct {v1, v0}, Lad3/o;-><init>(Lc93/a;)V

    const-string v0, "JsonObject"

    invoke-virtual {p1, v0, v1, v2}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    new-instance v0, La13/f;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, La13/f;-><init>(I)V

    new-instance v1, Lad3/o;

    invoke-direct {v1, v0}, Lad3/o;-><init>(Lc93/a;)V

    const-string v0, "JsonArray"

    invoke-virtual {p1, v0, v1, v2}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1a
    check-cast p1, Ltb/a;

    invoke-static {p1}, Laa2/f;->j(Ltb/a;)Laa2/g;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Ljava/io/File;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    const-string v0, "getAbsolutePath(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La6/d1;

    invoke-direct {v0, p1}, La6/d1;-><init>(Ljava/lang/String;)V

    return-object v0

    :pswitch_1c
    invoke-static {p1}, La11/q;->n(Ljava/lang/Object;)Ll83/a0;

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
