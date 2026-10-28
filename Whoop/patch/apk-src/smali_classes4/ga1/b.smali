.class public final synthetic Lga1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lga1/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lga1/b;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lim1/t0;->L()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {}, Lim1/t0;->T()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {}, Lim1/t0;->C()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {}, Lim1/t0;->q()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-static {}, Lcom/whoop/home/view/HomeFragment;->M()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-static {}, Lcom/whoop/home/view/HomeFragment;->e0()Lp1/c1;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {}, Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel;->e()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-static {}, Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-static {}, Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel;->d()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_8
    invoke-static {}, Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_9
    invoke-static {}, Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel;->c()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-static {}, Li92/c;->a()Ltr2/n;

    move-result-object v0

    return-object v0

    :pswitch_b
    invoke-static {}, Li60/a;->b()Llb1/y0;

    move-result-object v0

    return-object v0

    :pswitch_c
    invoke-static {}, Lht2/e;->b()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_d
    invoke-static {}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_e
    invoke-static {}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_f
    invoke-static {}, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_10
    invoke-static {}, Lcom/whoop/connectivityCore/firmware/models/ChipDetails;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_11
    invoke-static {}, Lhf2/b;->A()Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_12
    invoke-static {}, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_13
    invoke-static {}, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_14
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :pswitch_15
    invoke-static {}, Lh01/f;->b()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_16
    invoke-static {}, Lh01/f;->c()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_17
    invoke-static {}, Lcom/whoop/journalhometile/domain/model/JournalHomeTileResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_18
    invoke-static {}, Lcom/whoop/journalhometile/domain/model/JournalHomeTileModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_19
    invoke-static {}, Lcom/whoop/journalhometile/domain/model/JournalHomeTileModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1a
    const-string v0, "java.version"

    invoke-static {v0}, Lge/c;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ll83/k;

    const-string v2, "javaVersion"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "java.vm.name"

    invoke-static {v0}, Lge/c;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ll83/k;

    const-string v3, "jvmName"

    invoke-direct {v2, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "java.vm.version"

    invoke-static {v0}, Lge/c;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ll83/k;

    const-string v4, "jvmVersion"

    invoke-direct {v3, v4, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v2, v3}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->b0([Ll83/k;)Ljava/util/LinkedHashMap;

    move-result-object v0

    sget-object v1, Lvg/n;->a:Lvg/m;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lvg/m;->b:Lvg/r;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lvg/r;->c:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "android.os.Build$VERSION"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "SDK_INT"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    const-string v3, "RELEASE"

    invoke-virtual {v1, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const-string v4, "androidApiVersion"

    invoke-interface {v0, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/String;

    const-string v2, "androidRelease"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0

    :pswitch_1b
    invoke-static {}, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1c
    invoke-static {}, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->c()Lwc3/c;

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
