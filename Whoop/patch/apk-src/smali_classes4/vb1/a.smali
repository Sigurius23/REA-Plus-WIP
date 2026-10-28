.class public final synthetic Lvb1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lvb1/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lvb1/a;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lz1/l;->i:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-interface {v4, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    monitor-exit v0

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :goto_1
    monitor-exit v0

    throw p1

    :pswitch_0
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lyt0/f;->g(Ltb/a;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lkotlinx/coroutines/TimeoutCancellationException;

    invoke-static {p1}, Lyr2/b;->e(Lkotlinx/coroutines/TimeoutCancellationException;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;

    invoke-static {p1}, Lyq0/b;->d(Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;)Lzq0/l;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lcom/whoop/communityeverydaystats/domain/models/SnapshotHeaderModel;

    invoke-static {p1}, Lyq0/b;->a(Lcom/whoop/communityeverydaystats/domain/models/SnapshotHeaderModel;)Lzq0/y;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;

    invoke-static {p1}, Lyq0/b;->b(Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;)Lzq0/u;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;

    invoke-static {p1}, Lyq0/b;->g(Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;)Lzq0/d0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lyq0/b;->h(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lyq0/b;->c(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    invoke-static {p1}, Lym1/c;->e(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lkd1/g;

    invoke-static {p1}, Ly81/j;->a(Lkd1/g;)Ly81/i;

    move-result-object p1

    :pswitch_a
    return-object p1

    :pswitch_b
    check-cast p1, Ljava/util/Map;

    new-instance v0, Ly1/d;

    invoke-direct {v0, p1}, Ly1/d;-><init>(Ljava/util/Map;)V

    return-object v0

    :pswitch_c
    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_2

    :cond_1
    const/4 p1, 0x0

    :goto_2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_d
    invoke-static {p1}, Lx71/b;->b(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    invoke-static {p1}, Lx51/d;->a(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, La63/f0;

    invoke-static {p1}, Lx02/b;->b(La63/f0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lwe1/d;->g(Ltb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lv61/a;

    invoke-static {p1}, Lw61/b;->a(Lv61/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Ld0/o0;

    invoke-static {p1}, Lvy0/h0;->g(Ld0/o0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Ld0/o0;

    invoke-static {p1}, Lvy0/h0;->e(Ld0/o0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Ld0/o0;

    invoke-static {p1}, Lvy0/h0;->b(Ld0/o0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lg1/z1;

    invoke-static {p1}, Lvn1/s;->d(Lg1/z1;)Lg1/g9;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lvn1/i;

    invoke-static {p1}, Lvn1/p;->b(Lvn1/i;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    invoke-static {p1}, Lvn1/p;->j(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {p1}, Lvn1/c;->c(F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1a
    check-cast p1, Ltd1/e;

    invoke-static {p1}, Lvd1/d;->p(Ltd1/e;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lvb1/b;->g(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Lcom/whoop/design/models/items/ImpactBarSegmentModel;

    invoke-static {p1}, Lvb1/b;->h(Lcom/whoop/design/models/items/ImpactBarSegmentModel;)Ly11/r;

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
