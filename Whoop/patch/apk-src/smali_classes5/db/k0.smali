.class public final synthetic Ldb/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ldb/k0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 6

    iget v0, p0, Ldb/k0;->w:I

    const/4 v1, 0x1

    const/4 v2, -0x1

    const/4 v3, 0x0

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    const-string v0, ":"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    aget-object p1, p1, v3

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p2

    aget-object p2, p2, v3

    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p2

    sub-int/2addr p1, p2

    return p1

    :pswitch_0
    check-cast p1, Lko/g0;

    check-cast p2, Lko/g0;

    iget p1, p1, Lko/g0;->c:F

    iget p2, p2, Lko/g0;->c:F

    invoke-static {p1, p2}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    return p1

    :pswitch_1
    check-cast p1, Lko/g0;

    check-cast p2, Lko/g0;

    iget p1, p1, Lko/g0;->a:I

    iget p2, p2, Lko/g0;->a:I

    sub-int/2addr p1, p2

    return p1

    :pswitch_2
    check-cast p1, Lcom/whoop/service/network/model/Sport;

    check-cast p2, Lcom/whoop/service/network/model/Sport;

    invoke-static {p1, p2}, Lcom/whoop/service/network/model/SportList;->a(Lcom/whoop/service/network/model/Sport;Lcom/whoop/service/network/model/Sport;)I

    move-result p1

    return p1

    :pswitch_3
    check-cast p1, Ljo/g;

    check-cast p2, Ljo/g;

    iget v0, p2, Ljo/g;->a:I

    iget v1, p1, Ljo/g;->a:I

    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p2, Ljo/g;->c:Ljava/lang/String;

    iget-object v1, p1, Ljo/g;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object p2, p2, Ljo/g;->d:Ljava/lang/String;

    iget-object p1, p1, Ljo/g;->d:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    :goto_0
    return v0

    :pswitch_4
    check-cast p1, Ljo/g;

    check-cast p2, Ljo/g;

    iget v0, p2, Ljo/g;->b:I

    iget v1, p1, Ljo/g;->b:I

    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p1, Ljo/g;->c:Ljava/lang/String;

    iget-object v1, p2, Ljo/g;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    iget-object p1, p1, Ljo/g;->d:Ljava/lang/String;

    iget-object p2, p2, Ljo/g;->d:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    :goto_1
    return v0

    :pswitch_5
    check-cast p1, Lt23/g2;

    check-cast p2, Lt23/g2;

    iget-object p1, p1, Lt23/g2;->y:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object p2, p2, Lt23/g2;->y:Lec3/h2;

    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1

    :pswitch_6
    check-cast p1, Lt23/g2;

    check-cast p2, Lt23/g2;

    iget-object v0, p1, Lt23/g2;->p:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p2, Lt23/g2;->p:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_4

    move v1, v2

    goto :goto_2

    :cond_4
    iget-object p1, p1, Lt23/g2;->p:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_5

    iget-object p1, p2, Lt23/g2;->p:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_2

    :cond_5
    move v1, v3

    :goto_2
    return v1

    :pswitch_7
    check-cast p1, Lt23/g2;

    check-cast p2, Lt23/g2;

    iget-object v0, p1, Lt23/g2;->l:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p2, Lt23/g2;->l:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_6

    move v1, v2

    goto :goto_3

    :cond_6
    iget-object p1, p1, Lt23/g2;->l:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_7

    iget-object p1, p2, Lt23/g2;->l:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_7

    goto :goto_3

    :cond_7
    move v1, v3

    :goto_3
    return v1

    :pswitch_8
    check-cast p1, Lt23/g2;

    check-cast p2, Lt23/g2;

    iget-object v0, p1, Lt23/g2;->s:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p2, Lt23/g2;->s:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_8

    move v1, v2

    goto :goto_4

    :cond_8
    iget-object p1, p1, Lt23/g2;->s:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_9

    iget-object p1, p2, Lt23/g2;->s:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_9

    goto :goto_4

    :cond_9
    move v1, v3

    :goto_4
    return v1

    :pswitch_9
    check-cast p1, Lt23/g2;

    check-cast p2, Lt23/g2;

    iget-object v0, p1, Lt23/g2;->H:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p2, Lt23/g2;->H:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_a

    move v1, v2

    goto :goto_5

    :cond_a
    iget-object p1, p1, Lt23/g2;->H:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_b

    iget-object p1, p2, Lt23/g2;->H:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_b

    goto :goto_5

    :cond_b
    move v1, v3

    :goto_5
    return v1

    :pswitch_a
    check-cast p1, Lt23/g2;

    check-cast p2, Lt23/g2;

    iget-object v0, p1, Lt23/g2;->F:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, p2, Lt23/g2;->F:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_c

    move v1, v2

    goto :goto_6

    :cond_c
    iget-object p1, p1, Lt23/g2;->F:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_d

    iget-object p1, p2, Lt23/g2;->F:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_d

    goto :goto_6

    :cond_d
    move v1, v3

    :goto_6
    return v1

    :pswitch_b
    check-cast p1, Lt23/g2;

    check-cast p2, Lt23/g2;

    iget-object p1, p1, Lt23/g2;->J:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    instance-of v0, p1, Ljava/util/Collection;

    const-string v4, ":raise-hand:"

    if-eqz v0, :cond_f

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_f

    :cond_e
    move p1, v3

    goto :goto_7

    :cond_f
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_10
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc43/o;

    iget-object v0, v0, Lc43/o;->b:Lio/getstream/android/video/generated/models/ReactionResponse;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/ReactionResponse;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    move p1, v1

    :goto_7
    iget-object p2, p2, Lt23/g2;->J:Lec3/h2;

    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    instance-of v0, p2, Ljava/util/Collection;

    if-eqz v0, :cond_12

    move-object v0, p2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_12

    :cond_11
    move p2, v3

    goto :goto_8

    :cond_12
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_13
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc43/o;

    iget-object v0, v0, Lc43/o;->b:Lio/getstream/android/video/generated/models/ReactionResponse;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/ReactionResponse;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    move p2, v1

    :goto_8
    if-eqz p1, :cond_14

    if-nez p2, :cond_14

    move v1, v2

    goto :goto_9

    :cond_14
    if-nez p1, :cond_15

    if-eqz p2, :cond_15

    goto :goto_9

    :cond_15
    move v1, v3

    :goto_9
    return v1

    :pswitch_c
    check-cast p1, Ljava/io/File;

    check-cast p2, Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    move-result-wide v0

    invoke-virtual {p2}, Ljava/io/File;->lastModified()J

    move-result-wide p1

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Long;->compare(JJ)I

    move-result p1

    return p1

    :pswitch_d
    check-cast p1, Lio/sentry/android/core/anr/a;

    check-cast p2, Lio/sentry/android/core/anr/a;

    iget v0, p1, Lio/sentry/android/core/anr/a;->f:I

    int-to-float v0, v0

    iget v1, p1, Lio/sentry/android/core/anr/a;->b:F

    const/high16 v2, 0x3f800000    # 1.0f

    add-float/2addr v1, v2

    mul-float/2addr v1, v0

    iget p1, p1, Lio/sentry/android/core/anr/a;->a:I

    int-to-float p1, p1

    mul-float/2addr v1, p1

    iget p1, p2, Lio/sentry/android/core/anr/a;->f:I

    int-to-float p1, p1

    iget v0, p2, Lio/sentry/android/core/anr/a;->b:F

    add-float/2addr v0, v2

    mul-float/2addr v0, p1

    iget p1, p2, Lio/sentry/android/core/anr/a;->a:I

    int-to-float p1, p1

    mul-float/2addr v0, p1

    invoke-static {v1, v0}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    return p1

    :pswitch_e
    check-cast p1, Lio/l;

    check-cast p2, Lio/l;

    iget-boolean v0, p1, Lio/l;->E:Z

    iget v1, p1, Lio/l;->I:I

    if-eqz v0, :cond_16

    iget-boolean v0, p1, Lio/l;->H:Z

    if-eqz v0, :cond_16

    sget-object v0, Lio/m;->e:Lzr/v0;

    goto :goto_a

    :cond_16
    sget-object v0, Lio/m;->e:Lzr/v0;

    invoke-virtual {v0}, Lzr/v0;->a()Lzr/v0;

    move-result-object v0

    :goto_a
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p2, Lio/l;->I:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, p1, Lio/l;->F:Lio/f;

    iget-boolean v4, v4, Lio/w;->V:Z

    if-eqz v4, :cond_17

    sget-object v4, Lio/m;->e:Lzr/v0;

    invoke-virtual {v4}, Lzr/v0;->a()Lzr/v0;

    move-result-object v4

    goto :goto_b

    :cond_17
    sget-object v4, Lio/m;->f:Lzr/v0;

    :goto_b
    sget-object v5, Lzr/y;->a:Lzr/w;

    invoke-virtual {v5, v2, v3, v4}, Lzr/w;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lzr/y;

    move-result-object v2

    iget p1, p1, Lio/l;->J:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget v3, p2, Lio/l;->J:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, p1, v3, v0}, Lzr/y;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lzr/y;

    move-result-object p1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget p2, p2, Lio/l;->I:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, v1, p2, v0}, Lzr/y;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lzr/y;

    move-result-object p1

    invoke-virtual {p1}, Lzr/y;->e()I

    move-result p1

    return p1

    :pswitch_f
    check-cast p1, Lio/l;

    check-cast p2, Lio/l;

    invoke-static {p1, p2}, Lio/l;->c(Lio/l;Lio/l;)I

    move-result p1

    return p1

    :pswitch_10
    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/List;

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/i;

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/i;

    invoke-virtual {p1, p2}, Lio/i;->c(Lio/i;)I

    move-result p1

    return p1

    :pswitch_11
    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/d;

    invoke-static {p2}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/d;

    invoke-virtual {p1, p2}, Lio/d;->c(Lio/d;)I

    move-result p1

    return p1

    :pswitch_12
    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/List;

    new-instance v0, Ldb/k0;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Ldb/k0;-><init>(I)V

    invoke-static {p1, v0}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/l;

    new-instance v2, Ldb/k0;

    invoke-direct {v2, v1}, Ldb/k0;-><init>(I)V

    invoke-static {p2, v2}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/l;

    invoke-static {v0, v1}, Lio/l;->c(Lio/l;Lio/l;)I

    move-result v0

    invoke-static {v0}, Lzr/w;->f(I)Lzr/y;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lzr/y;->a(II)Lzr/y;

    move-result-object v0

    new-instance v1, Ldb/k0;

    const/16 v2, 0xe

    invoke-direct {v1, v2}, Ldb/k0;-><init>(I)V

    invoke-static {p1, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/l;

    new-instance v1, Ldb/k0;

    invoke-direct {v1, v2}, Ldb/k0;-><init>(I)V

    invoke-static {p2, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/l;

    new-instance v1, Ldb/k0;

    invoke-direct {v1, v2}, Ldb/k0;-><init>(I)V

    invoke-virtual {v0, p1, p2, v1}, Lzr/y;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lzr/y;

    move-result-object p1

    invoke-virtual {p1}, Lzr/y;->e()I

    move-result p1

    return p1

    :pswitch_13
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Ljava/lang/Integer;

    sget-object p1, Lio/m;->e:Lzr/v0;

    return v3

    :pswitch_14
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v2, :cond_19

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne p1, v2, :cond_18

    move v1, v3

    goto :goto_c

    :cond_18
    move v1, v2

    goto :goto_c

    :cond_19
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v2, :cond_1a

    goto :goto_c

    :cond_1a
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    sub-int v1, p1, p2

    :goto_c
    return v1

    :pswitch_15
    check-cast p1, Lrm/c0;

    check-cast p2, Lrm/c0;

    iget p2, p2, Lrm/c0;->H:I

    iget p1, p1, Lrm/c0;->H:I

    sub-int/2addr p2, p1

    return p2

    :pswitch_16
    check-cast p1, Lho/d;

    check-cast p2, Lho/d;

    iget-wide v0, p1, Lho/d;->b:J

    iget-wide p1, p2, Lho/d;->b:J

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Long;->compare(JJ)I

    move-result p1

    return p1

    :pswitch_17
    check-cast p1, Lho/e;

    check-cast p2, Lho/e;

    iget-object p1, p1, Lho/e;->a:Lho/f;

    iget p1, p1, Lho/f;->b:I

    iget-object p2, p2, Lho/e;->a:Lho/f;

    iget p2, p2, Lho/f;->b:I

    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1

    :pswitch_18
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Long;->compare(JJ)I

    move-result p1

    return p1

    :pswitch_19
    check-cast p1, Ljava/lang/Double;

    check-cast p2, Ljava/lang/Double;

    invoke-virtual {p1, p2}, Ljava/lang/Double;->compareTo(Ljava/lang/Double;)I

    move-result p1

    return p1

    :pswitch_1a
    check-cast p1, Lf9/b;

    check-cast p2, Lf9/b;

    iget v0, p1, Lf9/b;->c:I

    iget v1, p2, Lf9/b;->c:I

    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_1b

    goto :goto_d

    :cond_1b
    iget-object p1, p1, Lf9/b;->b:Ljava/lang/String;

    iget-object p2, p2, Lf9/b;->b:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    :goto_d
    return v0

    :pswitch_1b
    check-cast p1, Ldb/l0;

    check-cast p2, Ldb/l0;

    iget v0, p2, Ldb/l0;->a:I

    iget v1, p1, Ldb/l0;->a:I

    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_1c

    goto :goto_e

    :cond_1c
    iget-object v0, p2, Ldb/l0;->c:Ljava/lang/String;

    iget-object v1, p1, Ldb/l0;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1d

    goto :goto_e

    :cond_1d
    iget-object p2, p2, Ldb/l0;->d:Ljava/lang/String;

    iget-object p1, p1, Ldb/l0;->d:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    :goto_e
    return v0

    :pswitch_1c
    check-cast p1, Ldb/l0;

    check-cast p2, Ldb/l0;

    iget v0, p2, Ldb/l0;->b:I

    iget v1, p1, Ldb/l0;->b:I

    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_1e

    goto :goto_f

    :cond_1e
    iget-object v0, p1, Ldb/l0;->c:Ljava/lang/String;

    iget-object v1, p2, Ldb/l0;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1f

    goto :goto_f

    :cond_1f
    iget-object p1, p1, Ldb/l0;->d:Ljava/lang/String;

    iget-object p2, p2, Ldb/l0;->d:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    :goto_f
    return v0

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
