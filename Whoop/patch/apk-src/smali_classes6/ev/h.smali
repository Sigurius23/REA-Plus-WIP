.class public final Lev/h;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Lev/h;->w:I

    iput-object p1, p0, Lev/h;->x:Ljava/lang/Object;

    iput-object p2, p0, Lev/h;->y:Ljava/lang/Object;

    iput-object p3, p0, Lev/h;->z:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    iget v1, v0, Lev/h;->w:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Lev/h;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/Executor;

    iget-object v2, v0, Lev/h;->y:Ljava/lang/Object;

    check-cast v2, Lm5/g;

    new-instance v3, Lio/sentry/android/core/r0;

    const/16 v4, 0x1b

    iget-object v5, v0, Lev/h;->z:Ljava/lang/Object;

    invoke-direct {v3, v4, v2, v5}, Lio/sentry/android/core/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "During clear credential sign out failed with "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, v0, Lev/h;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Exception;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "PlayServicesImpl"

    invoke-static {v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, v0, Lev/h;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/Executor;

    iget-object v3, v0, Lev/h;->z:Ljava/lang/Object;

    check-cast v3, Lm5/g;

    new-instance v4, Lio/sentry/android/core/r0;

    const/16 v5, 0x19

    invoke-direct {v4, v5, v3, v2}, Lio/sentry/android/core/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_1
    iget-object v1, v0, Lev/h;->x:Ljava/lang/Object;

    check-cast v1, Lb3/s1;

    new-instance v2, Ll3/g;

    iget-object v3, v0, Lev/h;->y:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    const/4 v4, 0x6

    const/4 v5, 0x0

    invoke-direct {v2, v4, v3, v5}, Ll3/g;-><init>(ILjava/lang/String;Ljava/util/ArrayList;)V

    check-cast v1, Lb3/j;

    iget-object v1, v1, Lb3/j;->a:Landroid/content/ClipboardManager;

    sget-object v5, Lm83/y;->w:Lm83/y;

    iget-object v2, v2, Ll3/g;->y:Ljava/util/ArrayList;

    if-nez v2, :cond_0

    move-object v6, v5

    goto :goto_0

    :cond_0
    move-object v6, v2

    :goto_0
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_1

    :goto_1
    move-object/from16 v18, v1

    goto/16 :goto_7

    :cond_1
    new-instance v6, Landroid/text/SpannableString;

    invoke-direct {v6, v3}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    new-instance v3, Lb3/b2;

    const/4 v8, 0x0

    invoke-direct {v3, v8}, Lb3/b2;-><init>(I)V

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v8

    iput-object v8, v3, Lb3/b2;->b:Landroid/os/Parcel;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    move-object v5, v2

    :goto_2
    move-object v2, v5

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v8, 0x0

    :goto_3
    if-ge v8, v2, :cond_15

    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll3/e;

    iget-object v10, v9, Ll3/e;->a:Ljava/lang/Object;

    check-cast v10, Ll3/m0;

    iget v11, v9, Ll3/e;->b:I

    iget v9, v9, Ll3/e;->c:I

    iget-object v12, v3, Lb3/b2;->b:Landroid/os/Parcel;

    invoke-virtual {v12}, Landroid/os/Parcel;->recycle()V

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v12

    iput-object v12, v3, Lb3/b2;->b:Landroid/os/Parcel;

    iget-object v12, v10, Ll3/m0;->a:Lw3/o;

    iget-wide v13, v10, Ll3/m0;->l:J

    move/from16 v16, v8

    iget-wide v7, v10, Ll3/m0;->h:J

    move-object/from16 v17, v5

    iget-wide v4, v10, Ll3/m0;->b:J

    move-object/from16 v18, v1

    invoke-interface {v12}, Lw3/o;->b()J

    move-result-wide v0

    move/from16 v19, v11

    sget-wide v11, Li2/x;->n:J

    invoke-static {v0, v1, v11, v12}, Li2/x;->d(JJ)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_3

    invoke-virtual {v3, v1}, Lb3/b2;->c(B)V

    iget-object v0, v10, Ll3/m0;->a:Lw3/o;

    move/from16 v20, v2

    invoke-interface {v0}, Lw3/o;->b()J

    move-result-wide v1

    invoke-virtual {v3, v1, v2}, Lb3/b2;->f(J)V

    goto :goto_4

    :cond_3
    move/from16 v20, v2

    :goto_4
    sget-wide v0, Ly3/o;->c:J

    invoke-static {v4, v5, v0, v1}, Ly3/o;->a(JJ)Z

    move-result v2

    const/4 v15, 0x2

    if-nez v2, :cond_4

    invoke-virtual {v3, v15}, Lb3/b2;->c(B)V

    invoke-virtual {v3, v4, v5}, Lb3/b2;->e(J)V

    :cond_4
    iget-object v2, v10, Ll3/m0;->c:Lp3/r;

    const/4 v4, 0x3

    if-eqz v2, :cond_5

    invoke-virtual {v3, v4}, Lb3/b2;->c(B)V

    iget v2, v2, Lp3/r;->w:I

    iget-object v5, v3, Lb3/b2;->b:Landroid/os/Parcel;

    invoke-virtual {v5, v2}, Landroid/os/Parcel;->writeInt(I)V

    :cond_5
    iget-object v2, v10, Ll3/m0;->d:Lp3/n;

    if-eqz v2, :cond_8

    iget v2, v2, Lp3/n;->a:I

    const/4 v5, 0x4

    invoke-virtual {v3, v5}, Lb3/b2;->c(B)V

    if-nez v2, :cond_7

    :cond_6
    const/4 v2, 0x0

    goto :goto_5

    :cond_7
    const/4 v5, 0x1

    if-ne v2, v5, :cond_6

    const/4 v2, 0x1

    :goto_5
    invoke-virtual {v3, v2}, Lb3/b2;->c(B)V

    :cond_8
    iget-object v2, v10, Ll3/m0;->e:Lp3/o;

    if-eqz v2, :cond_d

    iget v2, v2, Lp3/o;->a:I

    const/4 v5, 0x5

    invoke-virtual {v3, v5}, Lb3/b2;->c(B)V

    if-nez v2, :cond_a

    :cond_9
    const/4 v15, 0x0

    goto :goto_6

    :cond_a
    const v5, 0xffff

    if-ne v2, v5, :cond_b

    const/4 v15, 0x1

    goto :goto_6

    :cond_b
    const/4 v5, 0x1

    if-ne v2, v5, :cond_c

    goto :goto_6

    :cond_c
    if-ne v2, v15, :cond_9

    move v15, v4

    :goto_6
    invoke-virtual {v3, v15}, Lb3/b2;->c(B)V

    :cond_d
    iget-object v2, v10, Ll3/m0;->g:Ljava/lang/String;

    const/4 v4, 0x6

    if-eqz v2, :cond_e

    invoke-virtual {v3, v4}, Lb3/b2;->c(B)V

    iget-object v5, v3, Lb3/b2;->b:Landroid/os/Parcel;

    invoke-virtual {v5, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :cond_e
    invoke-static {v7, v8, v0, v1}, Ly3/o;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_f

    const/4 v0, 0x7

    invoke-virtual {v3, v0}, Lb3/b2;->c(B)V

    invoke-virtual {v3, v7, v8}, Lb3/b2;->e(J)V

    :cond_f
    iget-object v0, v10, Ll3/m0;->i:Lw3/a;

    if-eqz v0, :cond_10

    iget v0, v0, Lw3/a;->a:F

    const/16 v1, 0x8

    invoke-virtual {v3, v1}, Lb3/b2;->c(B)V

    invoke-virtual {v3, v0}, Lb3/b2;->d(F)V

    :cond_10
    iget-object v0, v10, Ll3/m0;->j:Lw3/p;

    if-eqz v0, :cond_11

    const/16 v1, 0x9

    invoke-virtual {v3, v1}, Lb3/b2;->c(B)V

    iget v1, v0, Lw3/p;->a:F

    invoke-virtual {v3, v1}, Lb3/b2;->d(F)V

    iget v0, v0, Lw3/p;->b:F

    invoke-virtual {v3, v0}, Lb3/b2;->d(F)V

    :cond_11
    invoke-static {v13, v14, v11, v12}, Li2/x;->d(JJ)Z

    move-result v0

    if-nez v0, :cond_12

    const/16 v0, 0xa

    invoke-virtual {v3, v0}, Lb3/b2;->c(B)V

    invoke-virtual {v3, v13, v14}, Lb3/b2;->f(J)V

    :cond_12
    iget-object v0, v10, Ll3/m0;->m:Lw3/l;

    if-eqz v0, :cond_13

    const/16 v1, 0xb

    invoke-virtual {v3, v1}, Lb3/b2;->c(B)V

    iget v0, v0, Lw3/l;->a:I

    iget-object v1, v3, Lb3/b2;->b:Landroid/os/Parcel;

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V

    :cond_13
    iget-object v0, v10, Ll3/m0;->n:Li2/z0;

    if-eqz v0, :cond_14

    const/16 v1, 0xc

    invoke-virtual {v3, v1}, Lb3/b2;->c(B)V

    iget-wide v1, v0, Li2/z0;->a:J

    invoke-virtual {v3, v1, v2}, Lb3/b2;->f(J)V

    iget-wide v1, v0, Li2/z0;->b:J

    const/16 v5, 0x20

    shr-long v7, v1, v5

    long-to-int v5, v7

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    invoke-virtual {v3, v5}, Lb3/b2;->d(F)V

    const-wide v7, 0xffffffffL

    and-long/2addr v1, v7

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-virtual {v3, v1}, Lb3/b2;->d(F)V

    iget v0, v0, Li2/z0;->c:F

    invoke-virtual {v3, v0}, Lb3/b2;->d(F)V

    :cond_14
    new-instance v0, Landroid/text/Annotation;

    iget-object v1, v3, Lb3/b2;->b:Landroid/os/Parcel;

    invoke-virtual {v1}, Landroid/os/Parcel;->marshall()[B

    move-result-object v1

    const/4 v15, 0x0

    invoke-static {v1, v15}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    const-string v2, "androidx.compose.text.SpanStyle"

    invoke-direct {v0, v2, v1}, Landroid/text/Annotation;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v1, 0x21

    move/from16 v2, v19

    invoke-virtual {v6, v0, v2, v9, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    add-int/lit8 v8, v16, 0x1

    move-object/from16 v0, p0

    move-object/from16 v5, v17

    move-object/from16 v1, v18

    move/from16 v2, v20

    goto/16 :goto_3

    :cond_15
    move-object v3, v6

    goto/16 :goto_1

    :goto_7
    const-string v0, "plain text"

    invoke-static {v0, v3}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    move-object/from16 v0, p0

    iget-object v1, v0, Lev/h;->z:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    const-string v2, "Copied!"

    const/4 v15, 0x0

    invoke-static {v1, v2, v15}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_2
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "AmplitudeEngagement.sdk[internal]#determineAction(step="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, v0, Lev/h;->x:Ljava/lang/Object;

    check-cast v2, Lcom/amplitude/android/engagement/types/NudgeStep;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", buttonMeta="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v0, Lev/h;->y:Ljava/lang/Object;

    check-cast v2, Lcom/amplitude/android/engagement/types/ButtonMeta;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", surveyResponse="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v0, Lev/h;->z:Ljava/lang/Object;

    check-cast v2, Llj/e0;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v2, 0x29

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1

    :pswitch_3
    iget-object v1, v0, Lev/h;->x:Ljava/lang/Object;

    check-cast v1, Landroid/animation/AnimatorSet;

    new-instance v2, Lar/d;

    iget-object v3, v0, Lev/h;->z:Ljava/lang/Object;

    check-cast v3, Lfv/h;

    const/16 v4, 0x9

    invoke-direct {v2, v3, v4}, Lar/d;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    iget-object v2, v0, Lev/h;->y:Ljava/lang/Object;

    check-cast v2, Landroid/animation/Animator$AnimatorListener;

    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_4
    iget-object v1, v0, Lev/h;->x:Ljava/lang/Object;

    check-cast v1, Lfv/h;

    iget-object v2, v0, Lev/h;->y:Ljava/lang/Object;

    check-cast v2, Lgv/d;

    iget-object v3, v0, Lev/h;->z:Ljava/lang/Object;

    check-cast v3, Landroid/animation/ValueAnimator;

    iget-object v4, v1, Lfv/h;->x:Ljava/util/LinkedHashSet;

    invoke-virtual {v4, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Lgv/d;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v4

    iget-object v5, v1, Lfv/h;->Q:Lcom/mapbox/maps/CameraOptions$Builder;

    invoke-static {v2, v4, v5}, Lfv/h;->m(Lgv/d;Ljava/lang/Object;Lcom/mapbox/maps/CameraOptions$Builder;)V

    invoke-virtual {v2}, Lgv/d;->k()Lfv/j;

    move-result-object v2

    sget-object v4, Lfv/j;->E:Lfv/j;

    if-ne v2, v4, :cond_16

    invoke-virtual {v3}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type com.mapbox.maps.ScreenCoordinate"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lcom/mapbox/maps/ScreenCoordinate;

    invoke-virtual {v1, v2}, Lfv/h;->k(Lcom/mapbox/maps/ScreenCoordinate;)V

    :cond_16
    invoke-virtual {v1}, Lfv/h;->e()V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_5
    new-instance v1, Lev/f;

    iget-object v2, v0, Lev/h;->x:Ljava/lang/Object;

    check-cast v2, Lev/i;

    iget-object v2, v2, Lev/i;->a:Ljava/lang/Object;

    check-cast v2, Lcom/mapbox/maps/MapboxMap;

    iget-object v3, v0, Lev/h;->y:Ljava/lang/Object;

    check-cast v3, Lcom/mapbox/maps/module/MapTelemetry;

    iget-object v4, v0, Lev/h;->z:Ljava/lang/Object;

    check-cast v4, Lcom/mapbox/maps/geofencing/MapGeofencingConsent;

    invoke-direct {v1, v2, v3, v4}, Lev/f;-><init>(Lcom/mapbox/maps/MapboxMap;Lcom/mapbox/maps/module/MapTelemetry;Lcom/mapbox/maps/geofencing/MapGeofencingConsent;)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
