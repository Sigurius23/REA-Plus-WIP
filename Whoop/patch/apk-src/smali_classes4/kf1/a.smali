.class public final synthetic Lkf1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lkf1/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lkf1/a;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ly1/b;

    check-cast p2, Lw3/q;

    iget-wide v0, p2, Lw3/q;->a:J

    new-instance v2, Ly3/o;

    invoke-direct {v2, v0, v1}, Ly3/o;-><init>(J)V

    sget-object v0, Ll3/l0;->s:Ll3/k0;

    invoke-static {v2, v0, p1}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object v1

    iget-wide v2, p2, Lw3/q;->b:J

    new-instance p2, Ly3/o;

    invoke-direct {p2, v2, v3}, Ly3/o;-><init>(J)V

    invoke-static {p2, v0, p1}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object p1

    filled-new-array {v1, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ly1/b;

    check-cast p2, Lw3/p;

    iget p1, p2, Lw3/p;->a:F

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iget p2, p2, Lw3/p;->b:F

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    filled-new-array {p1, p2}, [Ljava/lang/Float;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ly1/b;

    check-cast p2, Lw3/l;

    iget p1, p2, Lw3/l;->a:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ly1/b;

    check-cast p2, Ll3/g;

    iget-object v0, p2, Ll3/g;->x:Ljava/lang/String;

    iget-object p2, p2, Ll3/g;->w:Ljava/util/List;

    sget-object v1, Ll3/l0;->b:Lp0/n0;

    invoke-static {p2, v1, p1}, Ll3/l0;->a(Ljava/lang/Object;Ly1/j;Ly1/b;)Ljava/lang/Object;

    move-result-object p1

    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Ly3/m;

    int-to-float p1, p1

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p1, v0

    sget-object v0, Ly3/m;->w:Ly3/m;

    const/high16 v1, -0x40800000    # -1.0f

    if-ne p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, -0x1

    int-to-float p2, p2

    mul-float/2addr v1, p2

    :goto_0
    const/4 p2, 0x1

    int-to-float p2, p2

    add-float/2addr p2, v1

    mul-float/2addr p2, p1

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lkv1/a;->d(Lxf3/c;Luf3/a;)Llv1/c;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lkv1/a;->a(Lxf3/c;Luf3/a;)Lmv1/a;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lkv1/a;->b(Lxf3/c;Luf3/a;)Lov1/b;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lkv1/a;->e(Lxf3/c;Luf3/a;)Lcom/whoop/memberdataexport/services/network/MemberDataExportServiceApi;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lkr0/a;->d(Lxf3/c;Luf3/a;)Lkr0/b;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lkr0/a;->b(Lxf3/c;Luf3/a;)Lkr0/c;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lkr0/a;->c(Lxf3/c;Luf3/a;)Lkr0/d;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lkr0/a;->a(Lxf3/c;Luf3/a;)Ljava/util/Map;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lki0/a;->d(Lxf3/c;Luf3/a;)Lcom/whoop/appconfiguration/AppConfigurationApi;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lki0/a;->a(Lxf3/c;Luf3/a;)Lj02/r;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lki0/a;->b(Lxf3/c;Luf3/a;)Lji0/e;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lkg0/a;->c(Lxf3/c;Luf3/a;)Lpg0/a;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lkg0/a;->k(Lxf3/c;Luf3/a;)Llg0/d;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lkg0/a;->b(Lxf3/c;Luf3/a;)Lnm0/e;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lkg0/a;->i(Lxf3/c;Luf3/a;)Lu82/a;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lkg0/a;->g(Lxf3/c;Luf3/a;)Lad3/c;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lkg0/a;->m(Lxf3/c;Luf3/a;)Lcom/google/gson/Gson;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lkg0/a;->h(Lxf3/c;Luf3/a;)Log0/b;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lkg0/a;->d(Lxf3/c;Luf3/a;)Ljg0/a;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lkg0/a;->e(Lxf3/c;Luf3/a;)Ljava/util/Map;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lkg0/a;->f(Lxf3/c;Luf3/a;)Llg0/f;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lkg0/a;->n(Lxf3/c;Luf3/a;)Lng0/a;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lkg0/a;->a(Lxf3/c;Luf3/a;)Lng0/c;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lkf1/b;->f(Lxf3/c;Luf3/a;)Lcom/whoop/experiments/api/ExperimentsAuthApi;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lkf1/b;->d(Lxf3/c;Luf3/a;)Lcom/whoop/experiments/api/ExperimentsApi;

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
