.class public final Leb/s;
.super Lkotlin/jvm/internal/m;
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

    iput p4, p0, Leb/s;->w:I

    iput-object p1, p0, Leb/s;->y:Ljava/lang/Object;

    iput-object p2, p0, Leb/s;->z:Ljava/lang/Object;

    iput-boolean p3, p0, Leb/s;->x:Z

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    iget v0, p0, Leb/s;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Leb/s;->y:Ljava/lang/Object;

    check-cast v0, [Landroid/animation/ValueAnimator;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    instance-of v5, v4, Lgv/d;

    if-eqz v5, :cond_0

    sget-object v5, Lcom/mapbox/maps/threading/AnimationThreadController;->INSTANCE:Lcom/mapbox/maps/threading/AnimationThreadController;

    new-instance v6, Lfv/g;

    check-cast v4, Lgv/d;

    const/4 v7, 0x0

    iget-boolean v8, p0, Leb/s;->x:Z

    invoke-direct {v6, v8, v4, v7}, Lfv/g;-><init>(ZLjava/lang/Object;I)V

    invoke-virtual {v5, v6}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnAnimatorThread(Lc93/a;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    const-string v0, "Mbgl-CameraManager"

    const-string v1, "All animators must be CameraAnimator\'s to be unregistered!"

    invoke-static {v0, v1}, Lcom/mapbox/maps/MapboxLogger;->logE(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_1
    iget-object v1, p0, Leb/s;->z:Ljava/lang/Object;

    check-cast v1, Lfv/h;

    iget-object v1, v1, Lfv/h;->w:Ljava/util/HashSet;

    new-instance v3, Ljava/util/ArrayList;

    array-length v4, v0

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    array-length v4, v0

    :goto_1
    if-ge v2, v4, :cond_2

    aget-object v5, v0, v2

    const-string v6, "null cannot be cast to non-null type com.mapbox.maps.plugin.animation.animator.CameraAnimator<*>"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lgv/d;

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {v1, v3}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Leb/s;->y:Ljava/lang/Object;

    check-cast v0, Leb/t;

    iget-object v1, p0, Leb/s;->z:Ljava/lang/Object;

    check-cast v1, Leb/q;

    iget-boolean v2, p0, Leb/s;->x:Z

    invoke-virtual {v0, v1, v2}, Leb/t;->e(Leb/q;Z)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
