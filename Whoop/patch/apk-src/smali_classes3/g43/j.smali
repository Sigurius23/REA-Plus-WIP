.class public abstract Lg43/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg43/o;
.implements Lg43/p;
.implements Lg43/r;
.implements La13/c;


# instance fields
.field public final E:Z

.field public final F:Lg43/k;

.field public final G:Lg43/q;

.field public final H:Lg43/n;

.field public final I:Lg43/e;

.field public final J:Ld1/j;

.field public final K:Lc93/m;

.field public final L:Ll83/p;

.field public final M:La30/w0;

.field public final N:Ls43/a;

.field public final O:Lgm/j;

.field public final w:Landroid/app/Application;

.field public final x:Landroidx/core/app/NotificationManagerCompat;

.field public final y:La13/c;

.field public final z:La33/d;


# direct methods
.method public constructor <init>(Landroid/app/Application;Landroidx/core/app/NotificationManagerCompat;La13/c;La33/d;ZLg43/k;Lg43/q;Lg43/n;Lg43/e;)V
    .locals 2

    new-instance v0, Ld1/j;

    invoke-direct {v0, p2}, Ld1/j;-><init>(Landroidx/core/app/NotificationManagerCompat;)V

    const-string v1, "application"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg43/j;->w:Landroid/app/Application;

    iput-object p2, p0, Lg43/j;->x:Landroidx/core/app/NotificationManagerCompat;

    iput-object p3, p0, Lg43/j;->y:La13/c;

    iput-object p4, p0, Lg43/j;->z:La33/d;

    iput-boolean p5, p0, Lg43/j;->E:Z

    iput-object p6, p0, Lg43/j;->F:Lg43/k;

    iput-object p7, p0, Lg43/j;->G:Lg43/q;

    iput-object p8, p0, Lg43/j;->H:Lg43/n;

    iput-object p9, p0, Lg43/j;->I:Lg43/e;

    iput-object v0, p0, Lg43/j;->J:Ld1/j;

    sget-object p2, Lg43/f;->w:Lg43/f;

    iput-object p2, p0, Lg43/j;->K:Lc93/m;

    const-string p2, "Video:StreamNotificationHandler"

    invoke-static {p0, p2}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p2

    iput-object p2, p0, Lg43/j;->L:Ll83/p;

    new-instance p2, La30/w0;

    const/16 p3, 0x8

    invoke-direct {p2, p1, p3}, La30/w0;-><init>(Landroid/content/Context;I)V

    iput-object p2, p0, Lg43/j;->M:La30/w0;

    new-instance p2, Ls43/a;

    invoke-direct {p2, p1}, Ls43/a;-><init>(Landroid/app/Application;)V

    iput-object p2, p0, Lg43/j;->N:Ls43/a;

    new-instance p2, Lgm/j;

    const-string p3, "context"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object p1, p2, Lgm/j;->w:Landroid/content/Context;

    iput-object p2, p0, Lg43/j;->O:Lgm/j;

    return-void
.end method

.method public static final k(Lg43/j;Landroidx/core/app/NotificationCompat$Builder;Landroid/app/PendingIntent;Ljava/lang/String;I)V
    .locals 7

    invoke-virtual {p0}, Lg43/j;->n()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, " (remoteParticipantCount="

    const-string v5, ")"

    const-string v6, "[addHangUpAction] Adding hang up action for "

    invoke-static {p4, v6, p3, v1, v5}, Ldc/b;->l(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_3

    iget-object v0, p0, Lg43/j;->O:Lgm/j;

    iget-object v0, v0, Lgm/j;->w:Landroid/content/Context;

    const-class v1, Landroid/app/ActivityManager;

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    invoke-virtual {v0}, Landroid/app/ActivityManager;->isBackgroundRestricted()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object p0, p0, Lg43/j;->N:Ls43/a;

    iget-object p0, p0, Ls43/a;->a:Landroid/app/Application;

    new-instance v0, Landroidx/core/app/Person$Builder;

    invoke-direct {v0}, Landroidx/core/app/Person$Builder;-><init>()V

    invoke-virtual {v0, p3}, Landroidx/core/app/Person$Builder;->setName(Ljava/lang/CharSequence;)Landroidx/core/app/Person$Builder;

    move-result-object p3

    if-nez p4, :cond_1

    const p4, 0x7f08078e

    invoke-static {p0, p4}, Landroidx/core/graphics/drawable/IconCompat;->d(Landroid/content/Context;I)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p0

    invoke-virtual {p3, p0}, Landroidx/core/app/Person$Builder;->setIcon(Landroidx/core/graphics/drawable/IconCompat;)Landroidx/core/app/Person$Builder;

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    if-le p4, v0, :cond_2

    const p4, 0x7f08078f

    invoke-static {p0, p4}, Landroidx/core/graphics/drawable/IconCompat;->d(Landroid/content/Context;I)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p0

    invoke-virtual {p3, p0}, Landroidx/core/app/Person$Builder;->setIcon(Landroidx/core/graphics/drawable/IconCompat;)Landroidx/core/app/Person$Builder;

    :cond_2
    :goto_0
    invoke-virtual {p3}, Landroidx/core/app/Person$Builder;->build()Landroidx/core/app/Person;

    move-result-object p0

    invoke-static {p0, p2}, Landroidx/core/app/NotificationCompat$CallStyle;->forOngoingCall(Landroidx/core/app/Person;Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$CallStyle;

    move-result-object p0

    const-string p2, "forOngoingCall(...)"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Landroidx/core/app/NotificationCompat$Builder;->setStyle(Landroidx/core/app/NotificationCompat$Style;)Landroidx/core/app/NotificationCompat$Builder;

    return-void

    :cond_3
    invoke-virtual {p0}, Lg43/j;->n()Lb23/k;

    move-result-object p3

    iget-object p4, p3, Lb23/k;->c:Lb23/e;

    iget-object v0, p3, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {p4, v2, v0}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_4

    iget-object p3, p3, Lb23/k;->b:Lb23/j;

    const-string p4, "[getLeaveAction]"

    invoke-interface {p3, v2, v0, p4, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    new-instance p3, Landroidx/core/app/NotificationCompat$Action$Builder;

    iget-object p0, p0, Lg43/j;->w:Landroid/app/Application;

    const p4, 0x7f140eea

    invoke-virtual {p0, p4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p3, v4, p0, p2}, Landroidx/core/app/NotificationCompat$Action$Builder;-><init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    invoke-virtual {p3}, Landroidx/core/app/NotificationCompat$Action$Builder;->build()Landroidx/core/app/NotificationCompat$Action;

    move-result-object p0

    const-string p2, "build(...)"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Landroidx/core/app/NotificationCompat$Builder;->addAction(Landroidx/core/app/NotificationCompat$Action;)Landroidx/core/app/NotificationCompat$Builder;

    return-void
.end method

.method public static o(Lt23/c0;Ljava/util/List;)Ljava/lang/String;
    .locals 4

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lt23/z1;

    iget-object v2, v2, Lt23/z1;->a:Lio/getstream/video/android/model/User;

    invoke-virtual {v2}, Lio/getstream/video/android/model/User;->getId()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lt23/c0;->p:Lt23/s0;

    iget-object v3, v3, Lt23/s0;->m:Ln53/e;

    iget-object v3, v3, Ln53/e;->y:Ll83/e;

    check-cast v3, Lkotlin/jvm/internal/m;

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lt23/g2;

    if-eqz v3, :cond_1

    iget-object v3, v3, Lt23/g2;->y:Lec3/h2;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    :cond_1
    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    move-object v1, v0

    :cond_2
    check-cast v1, Lt23/z1;

    if-eqz v1, :cond_3

    iget-object p0, v1, Lt23/z1;->a:Lio/getstream/video/android/model/User;

    invoke-virtual {p0}, Lio/getstream/video/android/model/User;->getName()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_3

    return-object p0

    :cond_3
    const-string p0, "Unknown"

    return-object p0
.end method

.method public static q(Lg43/j;Lt23/c0;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    iget-object v4, v0, Lg43/j;->z:La33/d;

    instance-of v5, v3, Lg43/g;

    if-eqz v5, :cond_0

    move-object v5, v3

    check-cast v5, Lg43/g;

    iget v6, v5, Lg43/g;->y:I

    const/high16 v7, -0x80000000

    and-int v8, v6, v7

    if-eqz v8, :cond_0

    sub-int/2addr v6, v7

    iput v6, v5, Lg43/g;->y:I

    goto :goto_0

    :cond_0
    new-instance v5, Lg43/g;

    invoke-direct {v5, v0, v3}, Lg43/g;-><init>(Lg43/j;Ls83/c;)V

    :goto_0
    iget-object v3, v5, Lg43/g;->w:Ljava/lang/Object;

    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v7, v5, Lg43/g;->y:I

    const/4 v8, 0x1

    if-eqz v7, :cond_2

    if-ne v7, v8, :cond_1

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lg43/j;->n()Lb23/k;

    move-result-object v3

    iget-object v7, v0, Lg43/j;->w:Landroid/app/Application;

    iget-object v9, v0, Lg43/j;->H:Lg43/n;

    iget-boolean v10, v0, Lg43/j;->E:Z

    iget-object v11, v3, Lb23/k;->c:Lb23/e;

    iget-object v12, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v13, Lb23/g;->y:Lb23/g;

    invoke-interface {v11, v13, v12}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v11

    const-string v14, ", callDisplayName: "

    const/4 v15, 0x0

    if-eqz v11, :cond_3

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    iget-object v11, v1, Lt23/c0;->v:Ljava/lang/String;

    const-string v8, "[onUpdateIncomingCallNotification] callId: "

    invoke-static {v8, v11, v14, v2}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v3, v13, v12, v8, v15}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    sget-object v3, Lio/getstream/video/android/model/StreamCallId;->Companion:Lio/getstream/video/android/model/b;

    iget-object v8, v1, Lt23/c0;->v:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8}, Lio/getstream/video/android/model/b;->a(Ljava/lang/String;)Lio/getstream/video/android/model/StreamCallId;

    move-result-object v3

    iget-object v1, v1, Lt23/c0;->p:Lt23/s0;

    iget-object v1, v1, Lt23/s0;->G:Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt23/d3;

    invoke-virtual {v0}, Lg43/j;->n()Lb23/k;

    move-result-object v8

    iget-object v11, v8, Lb23/k;->c:Lb23/e;

    iget-object v12, v8, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v11, v13, v12}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v11

    const-string v15, ", shouldHaveContentIntent: true"

    if-eqz v11, :cond_4

    iget-object v8, v8, Lb23/k;->b:Lb23/j;

    invoke-virtual {v3}, Lio/getstream/video/android/model/StreamCallId;->getId()Ljava/lang/String;

    move-result-object v11

    move/from16 v16, v10

    new-instance v10, Ljava/lang/StringBuilder;

    move-object/from16 v17, v6

    const-string v6, "[getRingingCallNotificationInternal] callId: "

    invoke-direct {v10, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ", ringingState: "

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2, v15, v10}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v6

    const/4 v10, 0x0

    invoke-interface {v8, v13, v12, v6, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_4
    move-object/from16 v17, v6

    move/from16 v16, v10

    :goto_1
    instance-of v6, v1, Lt23/z2;

    const-string v8, "Ringing call notification not shown, one of the intents is null."

    sget-object v10, Lm83/z;->w:Lm83/z;

    if-eqz v6, :cond_e

    invoke-static {v4, v3, v10}, La33/d;->J(La33/d;Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-static {v4, v3, v10}, La33/d;->F(La33/d;Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)Landroid/app/PendingIntent;

    move-result-object v6

    invoke-virtual {v4, v3, v10}, La33/d;->M(Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)Landroid/app/PendingIntent;

    move-result-object v11

    if-eqz v1, :cond_c

    if-eqz v6, :cond_c

    if-eqz v11, :cond_c

    invoke-virtual {v0}, Lg43/j;->n()Lb23/k;

    move-result-object v12

    iget-object v14, v12, Lb23/k;->c:Lb23/e;

    move-object/from16 v18, v5

    iget-object v5, v12, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v14, v13, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_5

    iget-object v12, v12, Lb23/k;->b:Lb23/j;

    const-string v14, "[getIncomingCallNotificationInternal] callerName: "

    invoke-static {v14, v2, v15}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const/4 v15, 0x0

    invoke-interface {v12, v13, v5, v14, v15}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    invoke-static {}, Lvd/e;->G()Z

    move-result v5

    if-eqz v5, :cond_6

    if-eqz v16, :cond_6

    iget-object v5, v9, Lg43/n;->f:Lg43/m;

    goto :goto_2

    :cond_6
    iget-object v5, v9, Lg43/n;->a:Lg43/m;

    :goto_2
    iget-object v9, v5, Lg43/m;->a:Ljava/lang/String;

    invoke-virtual {v0}, Lg43/j;->n()Lb23/k;

    move-result-object v12

    iget-object v14, v12, Lb23/k;->c:Lb23/e;

    iget-object v15, v12, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v14, v13, v15}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_7

    iget-object v12, v12, Lb23/k;->b:Lb23/j;

    const-string v14, "[ensureChannelAndBuildNotification] channelId: "

    invoke-virtual {v14, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    move-object/from16 p1, v8

    const/4 v8, 0x0

    invoke-interface {v12, v13, v15, v14, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_7
    move-object/from16 p1, v8

    :goto_3
    iget-object v8, v0, Lg43/j;->x:Landroidx/core/app/NotificationManagerCompat;

    invoke-static {v5, v8}, Lg43/a;->a(Lg43/m;Landroidx/core/app/NotificationManagerCompat;)V

    new-instance v5, Landroidx/core/app/NotificationCompat$Builder;

    invoke-direct {v5, v7, v9}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    if-eqz v16, :cond_8

    const/4 v8, -0x1

    goto :goto_4

    :cond_8
    const/4 v8, 0x2

    :goto_4
    invoke-virtual {v5, v8}, Landroidx/core/app/NotificationCompat$Builder;->setPriority(I)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v5, v2}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    const v8, 0x7f140f08

    invoke-virtual {v7, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    const v7, 0x7f080774

    invoke-virtual {v5, v7}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v5, v9}, Landroidx/core/app/NotificationCompat$Builder;->setChannelId(Ljava/lang/String;)Landroidx/core/app/NotificationCompat$Builder;

    const/4 v7, 0x1

    invoke-virtual {v5, v7}, Landroidx/core/app/NotificationCompat$Builder;->setOngoing(Z)Landroidx/core/app/NotificationCompat$Builder;

    const-string v8, "call"

    invoke-virtual {v5, v8}, Landroidx/core/app/NotificationCompat$Builder;->setCategory(Ljava/lang/String;)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v5, v1, v7}, Landroidx/core/app/NotificationCompat$Builder;->setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v5, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v0, v5, v6, v11, v2}, Lg43/j;->l(Landroidx/core/app/NotificationCompat$Builder;Landroid/app/PendingIntent;Landroid/app/PendingIntent;Ljava/lang/String;)V

    invoke-static {v4, v3, v10}, La33/d;->J(La33/d;Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-static {v4, v3, v10}, La33/d;->F(La33/d;Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)Landroid/app/PendingIntent;

    move-result-object v2

    invoke-virtual {v4, v3, v10}, La33/d;->M(Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)Landroid/app/PendingIntent;

    move-result-object v3

    if-eqz v1, :cond_9

    if-eqz v2, :cond_9

    if-eqz v3, :cond_9

    iget-object v1, v0, Lg43/j;->F:Lg43/k;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_5

    :cond_9
    invoke-virtual {v0}, Lg43/j;->n()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->F:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_a

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    move-object/from16 v6, p1

    const/4 v15, 0x0

    invoke-interface {v1, v4, v3, v6, v15}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_a
    :goto_5
    iget-object v0, v0, Lg43/j;->G:Lg43/q;

    move-object/from16 v1, v18

    const/4 v7, 0x1

    iput v7, v1, Lg43/g;->y:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v0, v17

    if-ne v5, v0, :cond_b

    return-object v0

    :cond_b
    move-object v3, v5

    :goto_6
    check-cast v3, Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v3}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    const-string v1, "build(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_c
    move-object v6, v8

    invoke-virtual {v0}, Lg43/j;->n()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->F:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_d

    :goto_7
    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const/4 v15, 0x0

    invoke-interface {v0, v3, v2, v6, v15}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v15

    :cond_d
    const/4 v15, 0x0

    goto :goto_8

    :cond_e
    move-object v6, v8

    instance-of v1, v1, Lt23/a3;

    if-eqz v1, :cond_d

    sget-object v1, Le43/i;->b:Le43/i;

    invoke-virtual {v3, v1}, Lio/getstream/video/android/model/StreamCallId;->getNotificationId(Le43/m;)I

    move-result v1

    invoke-virtual {v4, v3, v1, v10}, La33/d;->L(Lio/getstream/video/android/model/StreamCallId;ILjava/util/Map;)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v4, v3, v10}, La33/d;->I(Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)Landroid/app/PendingIntent;

    move-result-object v4

    if-eqz v1, :cond_f

    if-eqz v4, :cond_f

    const/16 v1, 0x8

    invoke-static {v0, v3, v2, v10, v1}, Lg43/p;->d(Lg43/p;Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/util/Map;I)Landroid/app/Notification;

    move-result-object v0

    return-object v0

    :cond_f
    invoke-virtual {v0}, Lg43/j;->n()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->F:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_d

    goto :goto_7

    :goto_8
    return-object v15
.end method

.method public static r(Lg43/j;Lt23/c0;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    instance-of v4, v3, Lg43/h;

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Lg43/h;

    iget v5, v4, Lg43/h;->L:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, Lg43/h;->L:I

    goto :goto_0

    :cond_0
    new-instance v4, Lg43/h;

    invoke-direct {v4, v0, v3}, Lg43/h;-><init>(Lg43/j;Ls83/c;)V

    :goto_0
    iget-object v3, v4, Lg43/h;->J:Ljava/lang/Object;

    sget-object v5, Lr83/a;->w:Lr83/a;

    iget v6, v4, Lg43/h;->L:I

    const-string v7, "Ongoing intent is null click on the ongoing call notification will not work."

    const-string v8, "[ensureChannelAndBuildNotification] channelId: "

    const-string v9, "build(...)"

    const-string v10, "getApplicationContext(...)"

    const/4 v11, 0x4

    const/4 v12, 0x3

    const/4 v13, 0x2

    const/4 v15, 0x1

    if-eqz v6, :cond_5

    if-eq v6, v15, :cond_4

    if-eq v6, v13, :cond_3

    if-eq v6, v12, :cond_2

    if-ne v6, v11, :cond_1

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v22, v9

    goto/16 :goto_d

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v16, v9

    goto/16 :goto_7

    :cond_3
    iget-object v0, v4, Lg43/h;->I:Landroid/support/v4/media/session/p;

    iget-object v1, v4, Lg43/h;->H:Landroid/app/PendingIntent;

    iget-object v2, v4, Lg43/h;->G:Lg43/j;

    iget-object v6, v4, Lg43/h;->F:Lio/getstream/video/android/model/StreamCallId;

    iget-object v10, v4, Lg43/h;->E:Lio/getstream/video/android/model/StreamCallId;

    iget-object v11, v4, Lg43/h;->z:Ljava/util/Map;

    check-cast v11, Ljava/util/Map;

    iget-object v13, v4, Lg43/h;->w:Lg43/j;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v12, v5

    move-object/from16 v17, v7

    move-object/from16 v18, v8

    move-object/from16 v16, v9

    move-object v8, v4

    goto/16 :goto_4

    :cond_4
    iget-object v0, v4, Lg43/h;->I:Landroid/support/v4/media/session/p;

    iget-object v1, v4, Lg43/h;->H:Landroid/app/PendingIntent;

    iget-object v2, v4, Lg43/h;->G:Lg43/j;

    iget-object v6, v4, Lg43/h;->F:Lio/getstream/video/android/model/StreamCallId;

    iget-object v11, v4, Lg43/h;->E:Lio/getstream/video/android/model/StreamCallId;

    iget-object v12, v4, Lg43/h;->z:Ljava/util/Map;

    check-cast v12, Ljava/util/Map;

    iget-object v13, v4, Lg43/h;->y:Ljava/lang/String;

    iget-object v15, v4, Lg43/h;->x:Lt23/c0;

    iget-object v14, v4, Lg43/h;->w:Lg43/j;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v17, v7

    move-object/from16 v18, v8

    move-object/from16 v16, v9

    move-object v9, v10

    move-object v10, v11

    move-object v11, v12

    move-object v8, v4

    move-object v12, v5

    goto/16 :goto_3

    :cond_5
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lg43/j;->n()Lb23/k;

    move-result-object v3

    iget-object v6, v0, Lg43/j;->x:Landroidx/core/app/NotificationManagerCompat;

    iget-object v12, v0, Lg43/j;->I:Lg43/e;

    iget-object v13, v0, Lg43/j;->z:La33/d;

    iget-object v14, v0, Lg43/j;->H:Lg43/n;

    iget-object v15, v0, Lg43/j;->w:Landroid/app/Application;

    iget-object v11, v3, Lb23/k;->c:Lb23/e;

    move-object/from16 v16, v9

    iget-object v9, v3, Lb23/k;->a:Ljava/lang/String;

    move-object/from16 v17, v7

    sget-object v7, Lb23/g;->y:Lb23/g;

    invoke-interface {v11, v7, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v11

    move/from16 v18, v11

    const-string v11, ", callDisplayName: "

    if-eqz v18, :cond_6

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    move-object/from16 v18, v8

    iget-object v8, v1, Lt23/c0;->v:Ljava/lang/String;

    move-object/from16 v19, v5

    const-string v5, "[updateOngoingCallNotification] callId: "

    invoke-static {v5, v8, v11, v2}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x0

    invoke-interface {v3, v7, v9, v5, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_6
    move-object/from16 v19, v5

    move-object/from16 v18, v8

    :goto_1
    sget-object v3, Lio/getstream/video/android/model/StreamCallId;->Companion:Lio/getstream/video/android/model/b;

    iget-object v5, v1, Lt23/c0;->v:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5}, Lio/getstream/video/android/model/b;->a(Ljava/lang/String;)Lio/getstream/video/android/model/StreamCallId;

    move-result-object v3

    iget-object v5, v1, Lt23/c0;->v:Ljava/lang/String;

    invoke-static {v5}, Lio/getstream/video/android/model/b;->a(Ljava/lang/String;)Lio/getstream/video/android/model/StreamCallId;

    move-result-object v5

    iget-object v8, v1, Lt23/c0;->p:Lt23/s0;

    iget-object v8, v8, Lt23/s0;->o:Ll83/p;

    invoke-virtual {v8}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lec3/f2;

    invoke-interface {v8}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    invoke-virtual {v0}, Lg43/j;->n()Lb23/k;

    move-result-object v9

    iget-object v1, v9, Lb23/k;->c:Lb23/e;

    iget-object v0, v9, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v7, v0}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    move/from16 v20, v1

    const-string v1, ", isOutgoingCall: false, remoteParticipantCount: "

    if-eqz v20, :cond_7

    iget-object v9, v9, Lb23/k;->b:Lb23/j;

    move-object/from16 v20, v4

    invoke-virtual {v5}, Lio/getstream/video/android/model/StreamCallId;->getId()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v21, v10

    const-string v10, "[getOngoingCallNotificationInternal] callId: "

    invoke-static {v10, v4, v11, v2, v1}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v10, 0x0

    invoke-interface {v9, v7, v0, v4, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_7
    move-object/from16 v20, v4

    move-object/from16 v21, v10

    :goto_2
    sget-object v0, Lt23/j3;->t:Lt23/i3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lt23/i3;->a()Lt23/j3;

    move-result-object v0

    check-cast v0, Lt23/b4;

    iget-object v0, v0, Lt23/b4;->H:Lh43/b;

    iget-object v0, v0, Lh43/b;->x:Le43/g;

    iget-object v0, v0, Le43/g;->h:Ljava/util/Set;

    invoke-virtual {v5}, Lio/getstream/video/android/model/StreamCallId;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    sget-object v4, Lm83/z;->w:Lm83/z;

    if-eqz v0, :cond_f

    invoke-virtual/range {p0 .. p0}, Lg43/j;->n()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v8, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v7, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {v5}, Lio/getstream/video/android/model/StreamCallId;->getId()Ljava/lang/String;

    move-result-object v1

    const-string v9, "[getMinimalMediaStyleNotification] callId: "

    invoke-static {v9, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v10, 0x0

    invoke-interface {v0, v7, v8, v1, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    invoke-virtual {v5}, Lio/getstream/video/android/model/StreamCallId;->hashCode()I

    move-result v0

    invoke-virtual {v13, v5, v0, v4}, La33/d;->K(Lio/getstream/video/android/model/StreamCallId;ILjava/util/Map;)Landroid/app/PendingIntent;

    move-result-object v0

    iget-object v1, v14, Lg43/n;->b:Lg43/m;

    iget-object v7, v14, Lg43/n;->b:Lg43/m;

    invoke-static {v1, v6}, Lg43/a;->a(Lg43/m;Landroidx/core/app/NotificationManagerCompat;)V

    iget-object v1, v7, Lg43/m;->a:Ljava/lang/String;

    invoke-virtual {v12, v15, v5, v1}, Lg43/e;->b(Landroid/app/Application;Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;)Landroid/support/v4/media/session/p;

    move-result-object v1

    new-instance v6, Landroid/support/v4/media/c;

    invoke-direct {v6}, Landroid/support/v4/media/c;-><init>()V

    iget-object v7, v7, Lg43/m;->a:Ljava/lang/String;

    invoke-virtual {v12, v15, v3, v7}, Lg43/e;->b(Landroid/app/Application;Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;)Landroid/support/v4/media/session/p;

    move-result-object v7

    invoke-virtual {v15}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v8

    move-object/from16 v9, v21

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p0

    move-object/from16 v8, v20

    iput-object v10, v8, Lg43/h;->w:Lg43/j;

    move-object/from16 v11, p1

    iput-object v11, v8, Lg43/h;->x:Lt23/c0;

    iput-object v2, v8, Lg43/h;->y:Ljava/lang/String;

    iput-object v4, v8, Lg43/h;->z:Ljava/util/Map;

    iput-object v3, v8, Lg43/h;->E:Lio/getstream/video/android/model/StreamCallId;

    iput-object v5, v8, Lg43/h;->F:Lio/getstream/video/android/model/StreamCallId;

    iput-object v10, v8, Lg43/h;->G:Lg43/j;

    iput-object v0, v8, Lg43/h;->H:Landroid/app/PendingIntent;

    iput-object v1, v8, Lg43/h;->I:Landroid/support/v4/media/session/p;

    const/4 v13, 0x1

    iput v13, v8, Lg43/h;->L:I

    invoke-static {v12, v7, v11, v6, v8}, Lg43/e;->c(Lg43/e;Landroid/support/v4/media/session/p;Lt23/c0;Landroid/support/v4/media/c;Ls83/c;)Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v12, v19

    if-ne v6, v12, :cond_9

    goto/16 :goto_c

    :cond_9
    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    move-object v13, v2

    move-object v6, v5

    move-object v2, v10

    move-object v14, v2

    move-object v15, v11

    move-object v10, v3

    move-object v11, v4

    :goto_3
    new-instance v3, Landroid/support/v4/media/session/s;

    invoke-direct {v3}, Landroid/support/v4/media/session/s;-><init>()V

    iget-object v4, v14, Lg43/j;->I:Lg43/e;

    iget-object v5, v14, Lg43/j;->w:Landroid/app/Application;

    iget-object v7, v14, Lg43/j;->H:Lg43/n;

    iget-object v7, v7, Lg43/n;->b:Lg43/m;

    iget-object v7, v7, Lg43/m;->a:Ljava/lang/String;

    invoke-virtual {v4, v5, v10, v7}, Lg43/e;->b(Landroid/app/Application;Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;)Landroid/support/v4/media/session/p;

    move-result-object v4

    iget-object v7, v14, Lg43/j;->I:Lg43/e;

    invoke-virtual {v5}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v14, v8, Lg43/h;->w:Lg43/j;

    iput-object v15, v8, Lg43/h;->x:Lt23/c0;

    iput-object v13, v8, Lg43/h;->y:Ljava/lang/String;

    move-object v5, v11

    check-cast v5, Ljava/util/Map;

    iput-object v5, v8, Lg43/h;->z:Ljava/util/Map;

    iput-object v10, v8, Lg43/h;->E:Lio/getstream/video/android/model/StreamCallId;

    iput-object v6, v8, Lg43/h;->F:Lio/getstream/video/android/model/StreamCallId;

    iput-object v2, v8, Lg43/h;->G:Lg43/j;

    iput-object v1, v8, Lg43/h;->H:Landroid/app/PendingIntent;

    iput-object v0, v8, Lg43/h;->I:Landroid/support/v4/media/session/p;

    const/4 v5, 0x2

    iput v5, v8, Lg43/h;->L:I

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v7, v4, v15, v3, v8}, Lg43/e;->d(Lg43/e;Landroid/support/v4/media/session/p;Lt23/c0;Landroid/support/v4/media/session/s;Ls83/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v12, :cond_a

    goto/16 :goto_c

    :cond_a
    move-object v13, v14

    :goto_4
    iget-object v3, v2, Lg43/j;->F:Lg43/k;

    iget-object v4, v2, Lg43/j;->w:Landroid/app/Application;

    new-instance v5, Ls8/e;

    invoke-direct {v5}, Landroidx/core/app/NotificationCompat$Style;-><init>()V

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "callId"

    invoke-static {v6, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Landroid/support/v4/media/session/p;->a:Landroid/support/v4/media/session/l;

    iget-object v0, v0, Landroid/support/v4/media/session/l;->b:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    iput-object v0, v5, Ls8/e;->a:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    iget-object v0, v2, Lg43/j;->H:Lg43/n;

    iget-object v0, v0, Lg43/n;->b:Lg43/m;

    iget-object v6, v0, Lg43/m;->a:Ljava/lang/String;

    invoke-virtual {v2}, Lg43/j;->n()Lb23/k;

    move-result-object v7

    iget-object v9, v7, Lb23/k;->c:Lb23/e;

    iget-object v14, v7, Lb23/k;->a:Ljava/lang/String;

    sget-object v15, Lb23/g;->y:Lb23/g;

    invoke-interface {v9, v15, v14}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_b

    iget-object v7, v7, Lb23/k;->b:Lb23/j;

    move-object/from16 v9, v18

    invoke-virtual {v9, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v19, v12

    const/4 v12, 0x0

    invoke-interface {v7, v15, v14, v9, v12}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_5

    :cond_b
    move-object/from16 v19, v12

    :goto_5
    iget-object v7, v2, Lg43/j;->x:Landroidx/core/app/NotificationManagerCompat;

    invoke-static {v0, v7}, Lg43/a;->a(Lg43/m;Landroidx/core/app/NotificationManagerCompat;)V

    new-instance v0, Landroidx/core/app/NotificationCompat$Builder;

    invoke-direct {v0, v4, v6}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    if-eqz v1, :cond_c

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    goto :goto_6

    :cond_c
    invoke-virtual {v2}, Lg43/j;->n()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v6, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_d

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    move-object/from16 v12, v17

    const/4 v2, 0x0

    invoke-interface {v1, v7, v6, v12, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_d
    :goto_6
    const v1, 0x7f140f0f

    invoke-virtual {v4, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v4, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setShowWhen(Z)Landroidx/core/app/NotificationCompat$Builder;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setOngoing(Z)Landroidx/core/app/NotificationCompat$Builder;

    const v1, 0x7f08077f

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    invoke-virtual {v1, v5}, Landroidx/core/app/NotificationCompat$Builder;->setStyle(Landroidx/core/app/NotificationCompat$Style;)Landroidx/core/app/NotificationCompat$Builder;

    iget-object v1, v13, Lg43/j;->F:Lg43/k;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v10, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "payload"

    invoke-static {v11, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v13, Lg43/j;->G:Lg43/q;

    const/4 v10, 0x0

    iput-object v10, v8, Lg43/h;->w:Lg43/j;

    iput-object v10, v8, Lg43/h;->x:Lt23/c0;

    iput-object v10, v8, Lg43/h;->y:Ljava/lang/String;

    iput-object v10, v8, Lg43/h;->z:Ljava/util/Map;

    iput-object v10, v8, Lg43/h;->E:Lio/getstream/video/android/model/StreamCallId;

    iput-object v10, v8, Lg43/h;->F:Lio/getstream/video/android/model/StreamCallId;

    iput-object v10, v8, Lg43/h;->G:Lg43/j;

    iput-object v10, v8, Lg43/h;->H:Landroid/app/PendingIntent;

    iput-object v10, v8, Lg43/h;->I:Landroid/support/v4/media/session/p;

    const/4 v2, 0x3

    iput v2, v8, Lg43/h;->L:I

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v3, v19

    if-ne v0, v3, :cond_e

    move-object v12, v3

    goto/16 :goto_c

    :cond_e
    move-object v3, v0

    :goto_7
    check-cast v3, Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v3}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_f
    move-object/from16 v10, p0

    move-object/from16 v22, v16

    move-object/from16 v12, v17

    move-object/from16 v9, v18

    move-object/from16 v0, v20

    invoke-virtual {v10}, Lg43/j;->n()Lb23/k;

    move-result-object v3

    iget-object v0, v3, Lb23/k;->c:Lb23/e;

    iget-object v10, v3, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v0, v7, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object v0, v3, Lb23/k;->b:Lb23/j;

    invoke-virtual {v5}, Lio/getstream/video/android/model/StreamCallId;->getId()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v17, v12

    const-string v12, "[getSimpleOngoingCallNotification] callId: "

    invoke-static {v12, v3, v11, v2, v1}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v12, 0x0

    invoke-interface {v0, v7, v10, v1, v12}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_8

    :cond_10
    move-object/from16 v17, v12

    :goto_8
    invoke-virtual {v5}, Lio/getstream/video/android/model/StreamCallId;->hashCode()I

    move-result v0

    invoke-virtual {v13, v5, v0, v4}, La33/d;->K(Lio/getstream/video/android/model/StreamCallId;ILjava/util/Map;)Landroid/app/PendingIntent;

    move-result-object v0

    invoke-virtual {v13, v5, v4}, La33/d;->I(Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)Landroid/app/PendingIntent;

    move-result-object v1

    if-nez v1, :cond_12

    invoke-virtual/range {p0 .. p0}, Lg43/j;->n()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->F:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_11

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "End call intent is null, not showing notification!"

    const/4 v10, 0x0

    invoke-interface {v0, v3, v2, v1, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v10

    :cond_11
    const/4 v10, 0x0

    return-object v10

    :cond_12
    const/4 v10, 0x0

    iget-object v3, v14, Lg43/n;->b:Lg43/m;

    iget-object v4, v3, Lg43/m;->a:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lg43/j;->n()Lb23/k;

    move-result-object v5

    iget-object v11, v5, Lb23/k;->c:Lb23/e;

    iget-object v12, v5, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v11, v7, v12}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_13

    iget-object v5, v5, Lb23/k;->b:Lb23/j;

    invoke-virtual {v9, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v5, v7, v12, v9, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_13
    invoke-static {v3, v6}, Lg43/a;->a(Lg43/m;Landroidx/core/app/NotificationManagerCompat;)V

    new-instance v3, Landroidx/core/app/NotificationCompat$Builder;

    invoke-direct {v3, v15, v4}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const v4, 0x7f080774

    invoke-virtual {v3, v4}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v4

    if-eqz v0, :cond_14

    invoke-virtual {v4, v0}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    goto :goto_9

    :cond_14
    invoke-virtual/range {p0 .. p0}, Lg43/j;->n()Lb23/k;

    move-result-object v0

    iget-object v4, v0, Lb23/k;->c:Lb23/e;

    iget-object v5, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->E:Lb23/g;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_15

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    move-object/from16 v12, v17

    const/4 v10, 0x0

    invoke-interface {v0, v6, v5, v12, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_15
    :goto_9
    const v0, 0x7f140f24

    invoke-virtual {v15, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    const v4, 0x7f140f23

    invoke-virtual {v15, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroidx/core/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v4

    const/4 v13, 0x1

    invoke-virtual {v4, v13}, Landroidx/core/app/NotificationCompat$Builder;->setOngoing(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v4

    const-string v5, "setOngoing(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v2, :cond_16

    invoke-virtual {v15, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "getString(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_a
    move-object/from16 v10, p0

    goto :goto_b

    :cond_16
    move-object v0, v2

    goto :goto_a

    :goto_b
    invoke-static {v10, v4, v1, v0, v8}, Lg43/j;->k(Lg43/j;Landroidx/core/app/NotificationCompat$Builder;Landroid/app/PendingIntent;Ljava/lang/String;I)V

    iget-object v0, v10, Lg43/j;->F:Lg43/k;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v10, Lg43/j;->G:Lg43/q;

    move-object/from16 v8, v20

    const/4 v1, 0x4

    iput v1, v8, Lg43/h;->L:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v12, v19

    if-ne v3, v12, :cond_17

    :goto_c
    return-object v12

    :cond_17
    :goto_d
    check-cast v3, Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v3}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    move-object/from16 v1, v22

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public static s(Lg43/j;Lt23/c0;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    iget-object v4, v0, Lg43/j;->z:La33/d;

    instance-of v5, v3, Lg43/i;

    if-eqz v5, :cond_0

    move-object v5, v3

    check-cast v5, Lg43/i;

    iget v6, v5, Lg43/i;->y:I

    const/high16 v7, -0x80000000

    and-int v8, v6, v7

    if-eqz v8, :cond_0

    sub-int/2addr v6, v7

    iput v6, v5, Lg43/i;->y:I

    goto :goto_0

    :cond_0
    new-instance v5, Lg43/i;

    invoke-direct {v5, v0, v3}, Lg43/i;-><init>(Lg43/j;Ls83/c;)V

    :goto_0
    iget-object v3, v5, Lg43/i;->w:Ljava/lang/Object;

    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v7, v5, Lg43/i;->y:I

    const/4 v8, 0x1

    if-eqz v7, :cond_2

    if-ne v7, v8, :cond_1

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lg43/j;->n()Lb23/k;

    move-result-object v3

    iget-object v7, v0, Lg43/j;->w:Landroid/app/Application;

    iget-object v9, v0, Lg43/j;->H:Lg43/n;

    iget-boolean v10, v0, Lg43/j;->E:Z

    iget-object v11, v3, Lb23/k;->c:Lb23/e;

    iget-object v12, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v13, Lb23/g;->y:Lb23/g;

    invoke-interface {v11, v13, v12}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v11

    const-string v14, ", callDisplayName: "

    const/4 v15, 0x0

    if-eqz v11, :cond_3

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    iget-object v11, v1, Lt23/c0;->v:Ljava/lang/String;

    const-string v8, "[updateOutgoingCallNotification] callId: "

    invoke-static {v8, v11, v14, v2}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v3, v13, v12, v8, v15}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    iget-object v3, v1, Lt23/c0;->p:Lt23/s0;

    iget-object v8, v1, Lt23/c0;->v:Ljava/lang/String;

    iget-object v3, v3, Lt23/s0;->G:Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lt23/d3;

    sget-object v11, Lio/getstream/video/android/model/StreamCallId;->Companion:Lio/getstream/video/android/model/b;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8}, Lio/getstream/video/android/model/b;->a(Ljava/lang/String;)Lio/getstream/video/android/model/StreamCallId;

    move-result-object v11

    invoke-virtual {v0}, Lg43/j;->n()Lb23/k;

    move-result-object v12

    iget-object v15, v12, Lb23/k;->c:Lb23/e;

    move-object/from16 v16, v8

    iget-object v8, v12, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v15, v13, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v15

    move/from16 v17, v10

    const-string v10, ", shouldHaveContentIntent: true"

    if-eqz v15, :cond_4

    iget-object v12, v12, Lb23/k;->b:Lb23/j;

    invoke-virtual {v11}, Lio/getstream/video/android/model/StreamCallId;->getId()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v18, v6

    new-instance v6, Ljava/lang/StringBuilder;

    move-object/from16 v19, v5

    const-string v5, "[getRingingCallNotificationInternal] callId: "

    invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ", ringingState: "

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2, v10, v6}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-interface {v12, v13, v8, v5, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_4
    move-object/from16 v19, v5

    move-object/from16 v18, v6

    :goto_1
    instance-of v5, v3, Lt23/z2;

    const-string v6, "Ringing call notification not shown, one of the intents is null."

    sget-object v8, Lm83/z;->w:Lm83/z;

    if-eqz v5, :cond_c

    invoke-static {v4, v11, v8}, La33/d;->J(La33/d;Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)Landroid/app/PendingIntent;

    move-result-object v3

    invoke-static {v4, v11, v8}, La33/d;->F(La33/d;Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)Landroid/app/PendingIntent;

    move-result-object v5

    invoke-virtual {v4, v11, v8}, La33/d;->M(Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)Landroid/app/PendingIntent;

    move-result-object v4

    if-eqz v3, :cond_a

    if-eqz v5, :cond_a

    if-eqz v4, :cond_a

    invoke-virtual {v0}, Lg43/j;->n()Lb23/k;

    move-result-object v6

    iget-object v8, v6, Lb23/k;->c:Lb23/e;

    iget-object v11, v6, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v8, v13, v11}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_5

    iget-object v6, v6, Lb23/k;->b:Lb23/j;

    const-string v8, "[getIncomingCallNotificationInternal] callerName: "

    invoke-static {v8, v2, v10}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const/4 v10, 0x0

    invoke-interface {v6, v13, v11, v8, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    invoke-static {}, Lvd/e;->G()Z

    move-result v6

    if-eqz v6, :cond_6

    if-eqz v17, :cond_6

    iget-object v6, v9, Lg43/n;->f:Lg43/m;

    goto :goto_2

    :cond_6
    iget-object v6, v9, Lg43/n;->a:Lg43/m;

    :goto_2
    iget-object v8, v6, Lg43/m;->a:Ljava/lang/String;

    invoke-virtual {v0}, Lg43/j;->n()Lb23/k;

    move-result-object v9

    iget-object v10, v9, Lb23/k;->c:Lb23/e;

    iget-object v11, v9, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v10, v13, v11}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_7

    iget-object v9, v9, Lb23/k;->b:Lb23/j;

    const-string v10, "[ensureChannelAndBuildNotification] channelId: "

    invoke-virtual {v10, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const/4 v12, 0x0

    invoke-interface {v9, v13, v11, v10, v12}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    iget-object v9, v0, Lg43/j;->x:Landroidx/core/app/NotificationManagerCompat;

    invoke-static {v6, v9}, Lg43/a;->a(Lg43/m;Landroidx/core/app/NotificationManagerCompat;)V

    new-instance v6, Landroidx/core/app/NotificationCompat$Builder;

    invoke-direct {v6, v7, v8}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    if-eqz v17, :cond_8

    const/4 v9, -0x1

    goto :goto_3

    :cond_8
    const/4 v9, 0x2

    :goto_3
    invoke-virtual {v6, v9}, Landroidx/core/app/NotificationCompat$Builder;->setPriority(I)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v6, v2}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    const v9, 0x7f140f08

    invoke-virtual {v7, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    const v7, 0x7f080774

    invoke-virtual {v6, v7}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v6, v8}, Landroidx/core/app/NotificationCompat$Builder;->setChannelId(Ljava/lang/String;)Landroidx/core/app/NotificationCompat$Builder;

    const/4 v7, 0x1

    invoke-virtual {v6, v7}, Landroidx/core/app/NotificationCompat$Builder;->setOngoing(Z)Landroidx/core/app/NotificationCompat$Builder;

    const-string v8, "call"

    invoke-virtual {v6, v8}, Landroidx/core/app/NotificationCompat$Builder;->setCategory(Ljava/lang/String;)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v6, v3, v7}, Landroidx/core/app/NotificationCompat$Builder;->setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v6, v3}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v0, v6, v5, v4, v2}, Lg43/j;->l(Landroidx/core/app/NotificationCompat$Builder;Landroid/app/PendingIntent;Landroid/app/PendingIntent;Ljava/lang/String;)V

    iget-object v2, v0, Lg43/j;->F:Lg43/k;

    iget-object v1, v1, Lt23/c0;->p:Lt23/s0;

    iget-object v1, v1, Lt23/s0;->G:Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt23/d3;

    invoke-static/range {v16 .. v16}, Lio/getstream/video/android/model/b;->a(Ljava/lang/String;)Lio/getstream/video/android/model/StreamCallId;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "ringingState"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lg43/j;->G:Lg43/q;

    move-object/from16 v5, v19

    const/4 v7, 0x1

    iput v7, v5, Lg43/i;->y:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v0, v18

    if-ne v6, v0, :cond_9

    return-object v0

    :cond_9
    move-object v3, v6

    :goto_4
    check-cast v3, Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v3}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    const-string v1, "build(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_a
    invoke-virtual {v0}, Lg43/j;->n()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->F:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b

    :goto_5
    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const/4 v12, 0x0

    invoke-interface {v0, v3, v2, v6, v12}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v12

    :cond_b
    const/4 v12, 0x0

    goto :goto_6

    :cond_c
    instance-of v1, v3, Lt23/a3;

    if-eqz v1, :cond_b

    sget-object v1, Le43/i;->b:Le43/i;

    invoke-virtual {v11, v1}, Lio/getstream/video/android/model/StreamCallId;->getNotificationId(Le43/m;)I

    move-result v1

    invoke-virtual {v4, v11, v1, v8}, La33/d;->L(Lio/getstream/video/android/model/StreamCallId;ILjava/util/Map;)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v4, v11, v8}, La33/d;->I(Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)Landroid/app/PendingIntent;

    move-result-object v3

    if-eqz v1, :cond_d

    if-eqz v3, :cond_d

    const/16 v1, 0x8

    invoke-static {v0, v11, v2, v8, v1}, Lg43/p;->d(Lg43/p;Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/util/Map;I)Landroid/app/Notification;

    move-result-object v0

    return-object v0

    :cond_d
    invoke-virtual {v0}, Lg43/j;->n()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->F:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b

    goto :goto_5

    :goto_6
    return-object v12
.end method


# virtual methods
.method public final a(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;ZLjava/util/Map;)Landroid/app/Notification;
    .locals 36

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v4, p4

    const-string v5, "callId"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "payload"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lg43/j;->n()Lb23/k;

    move-result-object v5

    iget-object v6, v5, Lb23/k;->c:Lb23/e;

    sget-object v7, Lb23/g;->y:Lb23/g;

    iget-object v8, v5, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v6, v7, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    const-string v9, ", remoteParticipantCount: 0"

    const/4 v10, 0x0

    const-string v11, ", isOutgoingCall: "

    const-string v12, ", callDisplayName: "

    if-eqz v6, :cond_0

    iget-object v5, v5, Lb23/k;->b:Lb23/j;

    invoke-virtual {v1}, Lio/getstream/video/android/model/StreamCallId;->getId()Ljava/lang/String;

    move-result-object v6

    const-string v13, "[getOngoingCallNotification] callId: "

    invoke-static {v13, v6, v12, v2, v11}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-static {v6, v3, v9}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v7, v8, v6, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-virtual {v0}, Lg43/j;->n()Lb23/k;

    move-result-object v5

    iget-object v6, v5, Lb23/k;->c:Lb23/e;

    iget-object v8, v5, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v6, v7, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    iget-object v5, v5, Lb23/k;->b:Lb23/j;

    invoke-virtual {v1}, Lio/getstream/video/android/model/StreamCallId;->getId()Ljava/lang/String;

    move-result-object v6

    const-string v13, "[getOngoingCallNotificationInternal] callId: "

    invoke-static {v13, v6, v12, v2, v11}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-static {v6, v3, v9}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v7, v8, v6, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    sget-object v5, Lt23/j3;->t:Lt23/i3;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lt23/i3;->a()Lt23/j3;

    move-result-object v5

    check-cast v5, Lt23/b4;

    iget-object v5, v5, Lt23/b4;->H:Lh43/b;

    iget-object v5, v5, Lh43/b;->x:Le43/g;

    iget-object v5, v5, Le43/g;->h:Ljava/util/Set;

    invoke-virtual {v1}, Lio/getstream/video/android/model/StreamCallId;->getType()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    const-string v6, "Ongoing intent is null click on the ongoing call notification will not work."

    const-string v8, "[ensureChannelAndBuildNotification] channelId: "

    const-string v13, "build(...)"

    iget-object v15, v0, Lg43/j;->F:Lg43/k;

    iget-object v14, v0, Lg43/j;->x:Landroidx/core/app/NotificationManagerCompat;

    const/16 v17, 0x0

    iget-object v10, v0, Lg43/j;->z:La33/d;

    move/from16 v16, v5

    iget-object v5, v0, Lg43/j;->H:Lg43/n;

    move-object/from16 v33, v15

    iget-object v15, v0, Lg43/j;->w:Landroid/app/Application;

    if-eqz v16, :cond_a

    invoke-virtual {v0}, Lg43/j;->n()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v9, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v7, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    invoke-virtual {v1}, Lio/getstream/video/android/model/StreamCallId;->getId()Ljava/lang/String;

    move-result-object v3

    const-string v11, "[getMinimalMediaStyleNotification] callId: "

    invoke-static {v11, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v11, 0x0

    invoke-interface {v2, v7, v9, v3, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    invoke-virtual {v1}, Lio/getstream/video/android/model/StreamCallId;->hashCode()I

    move-result v2

    invoke-virtual {v10, v1, v2, v4}, La33/d;->K(Lio/getstream/video/android/model/StreamCallId;ILjava/util/Map;)Landroid/app/PendingIntent;

    move-result-object v2

    iget-object v3, v5, Lg43/n;->b:Lg43/m;

    iget-object v4, v5, Lg43/n;->b:Lg43/m;

    invoke-static {v3, v14}, Lg43/a;->a(Lg43/m;Landroidx/core/app/NotificationManagerCompat;)V

    iget-object v3, v4, Lg43/m;->a:Ljava/lang/String;

    iget-object v5, v0, Lg43/j;->I:Lg43/e;

    invoke-virtual {v5, v15, v1, v3}, Lg43/e;->b(Landroid/app/Application;Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;)Landroid/support/v4/media/session/p;

    move-result-object v3

    iget-object v9, v5, Lg43/e;->a:Ll83/p;

    new-instance v10, Landroid/os/Bundle;

    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    iget-object v11, v4, Lg43/m;->a:Ljava/lang/String;

    invoke-virtual {v5, v15, v1, v11}, Lg43/e;->b(Landroid/app/Application;Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;)Landroid/support/v4/media/session/p;

    move-result-object v11

    invoke-virtual {v15}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v12

    move-object/from16 v16, v9

    const-string v9, "getApplicationContext(...)"

    invoke-static {v12, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {v16 .. v16}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lb23/k;

    iget-object v0, v12, Lb23/k;->c:Lb23/e;

    move-object/from16 v34, v13

    iget-object v13, v12, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v0, v7, v13}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, v12, Lb23/k;->b:Lb23/j;

    new-instance v12, Ljava/lang/StringBuilder;

    move-object/from16 v35, v6

    const-string v6, "[initialMetadata] Updating media metadata for session: "

    invoke-direct {v12, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v12, 0x0

    invoke-interface {v0, v7, v13, v6, v12}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_3
    move-object/from16 v35, v6

    :goto_0
    sget-object v0, Landroid/support/v4/media/MediaMetadataCompat;->y:La0/g;

    const-string v6, "android.media.metadata.DURATION"

    invoke-virtual {v0, v6}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_5

    invoke-virtual {v0, v6}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The android.media.metadata.DURATION key cannot be used to put a long"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_1
    const-wide/16 v12, -0x1

    invoke-virtual {v10, v6, v12, v13}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    new-instance v0, Landroid/support/v4/media/MediaMetadataCompat;

    invoke-direct {v0, v10}, Landroid/support/v4/media/MediaMetadataCompat;-><init>(Landroid/os/Bundle;)V

    invoke-virtual {v11, v0}, Landroid/support/v4/media/session/p;->b(Landroid/support/v4/media/MediaMetadataCompat;)V

    new-instance v29, Ljava/util/ArrayList;

    invoke-direct/range {v29 .. v29}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, v4, Lg43/m;->a:Ljava/lang/String;

    invoke-virtual {v5, v15, v1, v0}, Lg43/e;->b(Landroid/app/Application;Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;)Landroid/support/v4/media/session/p;

    move-result-object v0

    invoke-virtual {v15}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {v16 .. v16}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb23/k;

    iget-object v5, v1, Lb23/k;->c:Lb23/e;

    iget-object v6, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v5, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_6

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v9, "[initialPlaybackState] Updating media metadata for session: "

    invoke-direct {v5, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v11, 0x0

    invoke-interface {v1, v7, v6, v5, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v27

    new-instance v16, Landroid/support/v4/media/session/PlaybackStateCompat;

    const/16 v26, 0x0

    const/16 v32, 0x0

    const-wide/16 v18, -0x1

    const-wide/16 v20, 0x0

    const/high16 v22, 0x3f800000    # 1.0f

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const-wide/16 v30, -0x1

    invoke-direct/range {v16 .. v32}, Landroid/support/v4/media/session/PlaybackStateCompat;-><init>(IJJFJILjava/lang/CharSequence;JLjava/util/ArrayList;JLandroid/os/Bundle;)V

    move-object/from16 v1, v16

    move/from16 v6, v17

    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/p;->c(Landroid/support/v4/media/session/PlaybackStateCompat;)V

    new-instance v0, Ls8/e;

    invoke-direct {v0}, Landroidx/core/app/NotificationCompat$Style;-><init>()V

    invoke-virtual/range {v33 .. v33}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v3, Landroid/support/v4/media/session/p;->a:Landroid/support/v4/media/session/l;

    iget-object v1, v1, Landroid/support/v4/media/session/l;->b:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    iput-object v1, v0, Ls8/e;->a:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    iget-object v1, v4, Lg43/m;->a:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lg43/j;->n()Lb23/k;

    move-result-object v3

    iget-object v5, v3, Lb23/k;->c:Lb23/e;

    iget-object v9, v3, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v5, v7, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_7

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    invoke-virtual {v8, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v11, 0x0

    invoke-interface {v3, v7, v9, v5, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    invoke-static {v4, v14}, Lg43/a;->a(Lg43/m;Landroidx/core/app/NotificationManagerCompat;)V

    new-instance v3, Landroidx/core/app/NotificationCompat$Builder;

    invoke-direct {v3, v15, v1}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    if-eqz v2, :cond_8

    invoke-virtual {v3, v2}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    goto :goto_2

    :cond_8
    invoke-virtual/range {p0 .. p0}, Lg43/j;->n()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    move-object/from16 v13, v35

    const/4 v11, 0x0

    invoke-interface {v1, v5, v4, v13, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    :goto_2
    const v1, 0x7f140f0f

    invoke-virtual {v15, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v15, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v3, v6}, Landroidx/core/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v3, v6}, Landroidx/core/app/NotificationCompat$Builder;->setShowWhen(Z)Landroidx/core/app/NotificationCompat$Builder;

    const/4 v1, 0x1

    invoke-virtual {v3, v1}, Landroidx/core/app/NotificationCompat$Builder;->setOngoing(Z)Landroidx/core/app/NotificationCompat$Builder;

    const v1, 0x7f08077f

    invoke-virtual {v3, v1}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setStyle(Landroidx/core/app/NotificationCompat$Style;)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v3}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    move-object/from16 v1, v34

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_a
    move-object v0, v13

    move-object v13, v6

    invoke-virtual/range {p0 .. p0}, Lg43/j;->n()Lb23/k;

    move-result-object v6

    move-object/from16 v34, v0

    iget-object v0, v6, Lb23/k;->c:Lb23/e;

    move-object/from16 v35, v13

    iget-object v13, v6, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v0, v7, v13}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, v6, Lb23/k;->b:Lb23/j;

    invoke-virtual {v1}, Lio/getstream/video/android/model/StreamCallId;->getId()Ljava/lang/String;

    move-result-object v6

    move-object/from16 v16, v15

    const-string v15, "[getSimpleOngoingCallNotification] callId: "

    invoke-static {v15, v6, v12, v2, v11}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-static {v6, v3, v9}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v11, 0x0

    invoke-interface {v0, v7, v13, v6, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_b
    move-object/from16 v16, v15

    :goto_3
    invoke-virtual {v1}, Lio/getstream/video/android/model/StreamCallId;->hashCode()I

    move-result v0

    if-eqz v3, :cond_c

    invoke-virtual {v10, v1, v0, v4}, La33/d;->L(Lio/getstream/video/android/model/StreamCallId;ILjava/util/Map;)Landroid/app/PendingIntent;

    move-result-object v0

    goto :goto_4

    :cond_c
    invoke-virtual {v10, v1, v0, v4}, La33/d;->K(Lio/getstream/video/android/model/StreamCallId;ILjava/util/Map;)Landroid/app/PendingIntent;

    move-result-object v0

    :goto_4
    if-eqz v3, :cond_d

    invoke-virtual {v10, v1, v4}, La33/d;->M(Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)Landroid/app/PendingIntent;

    move-result-object v1

    goto :goto_5

    :cond_d
    invoke-virtual {v10, v1, v4}, La33/d;->I(Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)Landroid/app/PendingIntent;

    move-result-object v1

    :goto_5
    if-nez v1, :cond_f

    invoke-virtual/range {p0 .. p0}, Lg43/j;->n()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->F:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_e

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "End call intent is null, not showing notification!"

    const/4 v11, 0x0

    invoke-interface {v0, v3, v2, v1, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_6

    :cond_e
    const/4 v11, 0x0

    :goto_6
    return-object v11

    :cond_f
    const/4 v11, 0x0

    iget-object v4, v5, Lg43/n;->b:Lg43/m;

    iget-object v5, v4, Lg43/m;->a:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lg43/j;->n()Lb23/k;

    move-result-object v6

    iget-object v9, v6, Lb23/k;->c:Lb23/e;

    iget-object v10, v6, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v9, v7, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_10

    iget-object v6, v6, Lb23/k;->b:Lb23/j;

    invoke-virtual {v8, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v6, v7, v10, v8, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_10
    invoke-static {v4, v14}, Lg43/a;->a(Lg43/m;Landroidx/core/app/NotificationManagerCompat;)V

    new-instance v4, Landroidx/core/app/NotificationCompat$Builder;

    move-object/from16 v6, v16

    invoke-direct {v4, v6, v5}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const v5, 0x7f080774

    invoke-virtual {v4, v5}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v5

    if-eqz v0, :cond_11

    invoke-virtual {v5, v0}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    goto :goto_7

    :cond_11
    invoke-virtual/range {p0 .. p0}, Lg43/j;->n()Lb23/k;

    move-result-object v0

    iget-object v5, v0, Lb23/k;->c:Lb23/e;

    iget-object v7, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->E:Lb23/g;

    invoke-interface {v5, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_12

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    move-object/from16 v13, v35

    const/4 v11, 0x0

    invoke-interface {v0, v8, v7, v13, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_12
    :goto_7
    const v0, 0x7f140f24

    if-eqz v3, :cond_13

    const v3, 0x7f140f2a

    invoke-virtual {v6, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_8

    :cond_13
    invoke-virtual {v6, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    :goto_8
    invoke-virtual {v4, v3}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    const v3, 0x7f140f23

    invoke-virtual {v6, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    const/4 v3, 0x0

    invoke-virtual {v4, v3}, Landroidx/core/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v3

    const/4 v5, 0x1

    invoke-virtual {v3, v5}, Landroidx/core/app/NotificationCompat$Builder;->setOngoing(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v3

    const-string v5, "setOngoing(...)"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v2, :cond_14

    invoke-virtual {v6, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "getString(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_9

    :cond_14
    move-object v0, v2

    :goto_9
    const/4 v2, 0x0

    move-object/from16 v5, p0

    invoke-static {v5, v3, v1, v0, v2}, Lg43/j;->k(Lg43/j;Landroidx/core/app/NotificationCompat$Builder;Landroid/app/PendingIntent;Ljava/lang/String;I)V

    invoke-virtual/range {v33 .. v33}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    move-object/from16 v1, v34

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final b(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/util/Map;)V
    .locals 9

    const-string v0, "callId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callDisplayName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lg43/j;->n()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lio/getstream/video/android/model/StreamCallId;->getId()Ljava/lang/String;

    move-result-object v1

    const-string v5, "[onLiveCall] callId: "

    const-string v6, ", callDisplayName: "

    invoke-static {v5, v1, v6, p2}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-virtual {p1}, Lio/getstream/video/android/model/StreamCallId;->hashCode()I

    move-result v0

    iget-object v1, p0, Lg43/j;->z:La33/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Landroid/content/Intent;

    const-string v5, "io.getstream.video.android.action.LIVE_CALL"

    invoke-direct {v3, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v3, v5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v3

    const-string v5, "putExtras(...)"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v3, p1, v0}, La33/d;->G(Landroid/content/Intent;Lio/getstream/video/android/model/StreamCallId;I)Landroid/app/PendingIntent;

    move-result-object v3

    if-nez v3, :cond_2

    invoke-virtual {p0}, Lg43/j;->n()Lb23/k;

    move-result-object v3

    iget-object v5, v3, Lb23/k;->c:Lb23/e;

    iget-object v6, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->F:Lb23/g;

    invoke-interface {v5, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    const-string v5, "Couldn\'t find any activity for io.getstream.video.android.action.LIVE_CALL"

    invoke-interface {v3, v7, v6, v5, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    invoke-virtual {v1, p3}, La33/d;->p(Ljava/util/Map;)Landroid/app/PendingIntent;

    move-result-object v3

    :cond_2
    iget-object p3, p0, Lg43/j;->H:Lg43/n;

    iget-object v1, p3, Lg43/n;->a:Lg43/m;

    iget-object v5, v1, Lg43/m;->a:Ljava/lang/String;

    invoke-virtual {p0}, Lg43/j;->n()Lb23/k;

    move-result-object v6

    iget-object v7, v6, Lb23/k;->c:Lb23/e;

    iget-object v8, v6, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v7, v2, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    iget-object v6, v6, Lb23/k;->b:Lb23/j;

    const-string v7, "[ensureChannelAndBuildNotification] channelId: "

    invoke-virtual {v7, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v6, v2, v8, v7, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    iget-object v2, p0, Lg43/j;->x:Landroidx/core/app/NotificationManagerCompat;

    invoke-static {v1, v2}, Lg43/a;->a(Lg43/m;Landroidx/core/app/NotificationManagerCompat;)V

    new-instance v1, Landroidx/core/app/NotificationCompat$Builder;

    iget-object v2, p0, Lg43/j;->w:Landroid/app/Application;

    invoke-direct {v1, v2, v5}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    iget-object p2, p3, Lg43/n;->a:Lg43/m;

    iget-object p2, p2, Lg43/m;->a:Ljava/lang/String;

    invoke-virtual {v1, p2}, Landroidx/core/app/NotificationCompat$Builder;->setChannelId(Ljava/lang/String;)Landroidx/core/app/NotificationCompat$Builder;

    const-string p2, "status"

    invoke-virtual {v1, p2}, Landroidx/core/app/NotificationCompat$Builder;->setCategory(Ljava/lang/String;)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v1, v3}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    const/4 p2, 0x0

    invoke-virtual {v1, p2}, Landroidx/core/app/NotificationCompat$Builder;->setOngoing(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p2

    const-string p3, "setOngoing(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object p2

    const-string p3, "build(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, p2, p1}, Lg43/j;->p(ILandroid/app/Notification;Lio/getstream/video/android/model/StreamCallId;)V

    return-void
.end method

.method public final e(Lt23/c0;Ln43/d;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p1, Lt23/c0;->p:Lt23/s0;

    iget-object v1, p1, Lt23/c0;->v:Ljava/lang/String;

    iget-object v2, v0, Lt23/s0;->G:Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt23/d3;

    iget-object v3, v0, Lt23/s0;->x:Ln53/e;

    iget-object v3, v3, Ln53/e;->y:Ll83/e;

    check-cast v3, Lkotlin/jvm/internal/m;

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    iget-object v4, v0, Lt23/s0;->o:Ll83/p;

    invoke-virtual {v4}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lec3/f2;

    invoke-interface {v4}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-virtual {p0}, Lg43/j;->n()Lb23/k;

    move-result-object v5

    iget-object v6, v5, Lb23/k;->c:Lb23/e;

    sget-object v7, Lb23/g;->y:Lb23/g;

    iget-object v8, v5, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v6, v7, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    const/4 v9, 0x0

    const-string v10, "; callId: "

    if-eqz v6, :cond_0

    iget-object v5, v5, Lb23/k;->b:Lb23/j;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v11, "[onCallNotificationUpdate] #ringingState: "

    invoke-direct {v6, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v7, v8, v6, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-virtual {p0}, Lg43/j;->n()Lb23/k;

    move-result-object v5

    iget-object v6, v5, Lb23/k;->c:Lb23/e;

    iget-object v8, v5, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v6, v7, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    iget-object v5, v5, Lb23/k;->b:Lb23/j;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v11, "[onCallNotificationUpdate] #members: "

    invoke-direct {v6, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v7, v8, v6, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    invoke-virtual {p0}, Lg43/j;->n()Lb23/k;

    move-result-object v5

    iget-object v6, v5, Lb23/k;->c:Lb23/e;

    iget-object v8, v5, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v6, v7, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    iget-object v5, v5, Lb23/k;->b:Lb23/j;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v11, "[onCallNotificationUpdate] #remoteParticipants: "

    invoke-direct {v6, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v7, v8, v1, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    instance-of v1, v2, Lt23/a3;

    const/4 v5, 0x1

    iget-object v6, p0, Lg43/j;->w:Landroid/app/Application;

    if-eqz v1, :cond_5

    invoke-virtual {p0}, Lg43/j;->n()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v7, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[onCallNotificationUpdate] Handling outgoing call"

    invoke-interface {v0, v7, v2, v1, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, v5

    if-eq v0, v5, :cond_4

    const v0, 0x7f140f2a

    invoke-virtual {v6, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_4
    invoke-static {p1, v3}, Lg43/j;->o(Lt23/c0;Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p0, p1, v0}, Lg43/j;->m(Lt23/c0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, p1, v0, p2}, Lg43/j;->s(Lg43/j;Lt23/c0;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    instance-of v1, v2, Lt23/z2;

    if-eqz v1, :cond_b

    invoke-virtual {p0}, Lg43/j;->n()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v7, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "[onCallNotificationUpdate] Handling incoming call"

    invoke-interface {v1, v7, v4, v2, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    iget-object v0, v0, Lt23/s0;->g0:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/video/android/model/User;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lio/getstream/video/android/model/User;->getName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_8

    :cond_7
    invoke-static {p1, v3}, Lg43/j;->o(Lt23/c0;Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    :cond_8
    invoke-virtual {p0}, Lg43/j;->n()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v7, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    invoke-virtual {p0, p1, v0}, Lg43/j;->m(Lt23/c0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "[getIncomingCallDisplayName] baseName = "

    const-string v5, ", getCustomDisplayNameOrDefault(..) = "

    invoke-static {v4, v0, v5, v2}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v7, v3, v2, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    invoke-virtual {p0, p1, v0}, Lg43/j;->m(Lt23/c0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lg43/j;->n()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v7, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_a

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "[onCallNotificationUpdate] Incoming call from: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v7, v3, v2, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_a
    invoke-static {p0, p1, v0, p2}, Lg43/j;->q(Lg43/j;Lt23/c0;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_b
    instance-of v0, v2, Lt23/x2;

    if-eqz v0, :cond_11

    invoke-virtual {p0}, Lg43/j;->n()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v7, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[onCallNotificationUpdate] Handling active call"

    invoke-interface {v0, v7, v2, v1, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_c
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const-string v1, "getString(...)"

    if-eqz v0, :cond_d

    const v0, 0x7f140f24

    invoke-virtual {v6, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_d
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v5, :cond_e

    const v0, 0x7f140f25

    invoke-virtual {v6, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_e
    invoke-static {v4}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt23/g2;

    if-eqz v0, :cond_f

    iget-object v0, v0, Lt23/g2;->v:Lec3/h2;

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_10

    :cond_f
    const-string v0, "Unknown"

    :cond_10
    :goto_1
    invoke-static {p0, p1, v0, p2}, Lg43/j;->r(Lg43/j;Lt23/c0;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_11
    invoke-virtual {p0}, Lg43/j;->n()Lb23/k;

    move-result-object p1

    iget-object p2, p1, Lb23/k;->c:Lb23/e;

    iget-object v0, p1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {p2, v7, v0}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_12

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "[onCallNotificationUpdate] Unhandled ringing state: "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v7, v0, p2, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_12
    return-object v9
.end method

.method public final f(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/util/Map;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    const-string v4, ""

    const-string v5, "callId"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "callDisplayName"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "payload"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lg43/j;->n()Lb23/k;

    move-result-object v5

    iget-object v6, v5, Lb23/k;->c:Lb23/e;

    sget-object v7, Lb23/g;->y:Lb23/g;

    iget-object v8, v5, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v6, v7, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    const/4 v8, 0x0

    if-eqz v6, :cond_0

    iget-object v6, v5, Lb23/k;->b:Lb23/j;

    iget-object v5, v5, Lb23/k;->a:Ljava/lang/String;

    invoke-virtual {v1}, Lio/getstream/video/android/model/StreamCallId;->getId()Ljava/lang/String;

    move-result-object v9

    const-string v10, "[onMissedCall] #ringing; callId: "

    invoke-static {v10, v9}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v6, v7, v5, v9, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    sget-object v5, Le43/j;->b:Le43/j;

    invoke-virtual {v1, v5}, Lio/getstream/video/android/model/StreamCallId;->getNotificationId(Le43/m;)I

    move-result v6

    iget-object v9, v0, Lg43/j;->H:Lg43/n;

    iget-object v10, v0, Lg43/j;->z:La33/d;

    iget-object v11, v0, Lg43/j;->w:Landroid/app/Application;

    invoke-virtual {v0}, Lg43/j;->n()Lb23/k;

    move-result-object v12

    iget-object v13, v12, Lb23/k;->c:Lb23/e;

    iget-object v14, v12, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v13, v7, v14}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_1

    iget-object v13, v12, Lb23/k;->b:Lb23/j;

    iget-object v12, v12, Lb23/k;->a:Ljava/lang/String;

    invoke-virtual {v1}, Lio/getstream/video/android/model/StreamCallId;->getId()Ljava/lang/String;

    move-result-object v14

    const-string v15, "[getMissedCallNotification] callId: "

    move-object/from16 v16, v4

    const-string v4, ", callDisplayName: "

    invoke-static {v15, v14, v4, v2}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v13, v7, v12, v4, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    move-object/from16 v16, v4

    :goto_0
    invoke-virtual {v1, v5}, Lio/getstream/video/android/model/StreamCallId;->getNotificationId(Le43/m;)I

    move-result v4

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v5, Landroid/content/Intent;

    const-string v12, "io.getstream.video.android.action.MISSED_CALL"

    invoke-direct {v5, v12}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v12, Landroid/os/Bundle;

    invoke-direct {v12}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v5, v12}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v5

    const-string v12, "putExtras(...)"

    invoke-static {v5, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v10, v5, v1, v4}, La33/d;->G(Landroid/content/Intent;Lio/getstream/video/android/model/StreamCallId;I)Landroid/app/PendingIntent;

    move-result-object v4

    if-nez v4, :cond_2

    invoke-virtual {v10, v3}, La33/d;->p(Ljava/util/Map;)Landroid/app/PendingIntent;

    move-result-object v4

    :cond_2
    invoke-static {}, Lvd/e;->G()Z

    move-result v5

    if-eqz v5, :cond_3

    iget-boolean v5, v0, Lg43/j;->E:Z

    if-eqz v5, :cond_3

    iget-object v5, v9, Lg43/n;->e:Lg43/m;

    goto :goto_1

    :cond_3
    iget-object v5, v9, Lg43/n;->d:Lg43/m;

    :goto_1
    const v9, 0x7f140f1c

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v11, v9, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lg43/j;->n()Lb23/k;

    move-result-object v9

    iget-object v10, v9, Lb23/k;->c:Lb23/e;

    iget-object v12, v9, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v10, v7, v12}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_4

    iget-object v10, v9, Lb23/k;->b:Lb23/j;

    iget-object v9, v9, Lb23/k;->a:Ljava/lang/String;

    iget-object v12, v5, Lg43/m;->a:Ljava/lang/String;

    const-string v13, "[ensureChannelAndBuildNotification] channelId: "

    invoke-virtual {v13, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-interface {v10, v7, v9, v12, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    iget-object v7, v0, Lg43/j;->x:Landroidx/core/app/NotificationManagerCompat;

    invoke-static {v5, v7}, Lg43/a;->a(Lg43/m;Landroidx/core/app/NotificationManagerCompat;)V

    iget-object v5, v5, Lg43/m;->a:Ljava/lang/String;

    new-instance v7, Landroidx/core/app/NotificationCompat$Builder;

    invoke-direct {v7, v11, v5}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const v8, 0x7f080774

    invoke-virtual {v7, v8}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v7, v5}, Landroidx/core/app/NotificationCompat$Builder;->setChannelId(Ljava/lang/String;)Landroidx/core/app/NotificationCompat$Builder;

    const v5, 0x7f140f1e

    invoke-virtual {v11, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v5}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v7, v2}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v7, v4}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v2

    const/4 v4, 0x1

    invoke-virtual {v2, v4}, Landroidx/core/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroidx/core/app/NotificationCompat$Builder;

    iget-object v2, v0, Lg43/j;->F:Lg43/k;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v7}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v2

    const-string v4, "build(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v6, v2, v1}, Lg43/j;->p(ILandroid/app/Notification;Lio/getstream/video/android/model/StreamCallId;)V

    :try_start_0
    const-string v2, "created_by_id"

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-object/from16 v2, v16

    :goto_2
    sget-object v3, Lt23/j3;->t:Lt23/i3;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lt23/i3;->b:Lt23/j3;

    if-eqz v3, :cond_5

    check-cast v3, Lt23/b4;

    new-instance v4, Lio/getstream/android/video/generated/models/LocalCallMissedEvent;

    invoke-virtual {v1}, Lio/getstream/video/android/model/StreamCallId;->getCid()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v4, v1, v2}, Lio/getstream/android/video/generated/models/LocalCallMissedEvent;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, v16

    invoke-virtual {v3, v4, v1}, Lt23/b4;->o(Lio/getstream/android/video/generated/models/VideoEvent;Ljava/lang/String;)V

    :cond_5
    return-void
.end method

.method public final g(Lt23/d3;Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;ZLjava/util/Map;)Landroid/app/Notification;
    .locals 9

    const-string v0, "callId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lg43/j;->n()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const-string v3, ", shouldHaveContentIntent: "

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v1, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-virtual {p2}, Lio/getstream/video/android/model/StreamCallId;->getId()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "[getRingingCallNotification] callId: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ", ringingState: "

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, ", callDisplayName: "

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1, v2, v0, v5, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    instance-of v0, p1, Lt23/z2;

    const-string v1, "Ringing call notification not shown, one of the intents is null."

    if-eqz v0, :cond_b

    iget-object p1, p0, Lg43/j;->z:La33/d;

    invoke-static {p1, p2, p5}, La33/d;->J(La33/d;Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)Landroid/app/PendingIntent;

    move-result-object p1

    iget-object v0, p0, Lg43/j;->z:La33/d;

    invoke-static {v0, p2, p5}, La33/d;->F(La33/d;Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)Landroid/app/PendingIntent;

    move-result-object v0

    iget-object v5, p0, Lg43/j;->z:La33/d;

    invoke-virtual {v5, p2, p5}, La33/d;->M(Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)Landroid/app/PendingIntent;

    move-result-object p5

    sget-object v5, Lt23/j3;->t:Lt23/i3;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lt23/i3;->b:Lt23/j3;

    if-eqz v5, :cond_3

    invoke-virtual {p2}, Lio/getstream/video/android/model/StreamCallId;->getType()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p2}, Lio/getstream/video/android/model/StreamCallId;->getId()Ljava/lang/String;

    move-result-object p2

    check-cast v5, Lt23/b4;

    invoke-virtual {v5, v6, p2}, Lt23/b4;->n(Ljava/lang/String;Ljava/lang/String;)Lt23/c0;

    move-result-object p2

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    if-eqz v0, :cond_1

    sget-object v6, Le43/d;->a:Le43/d;

    invoke-virtual {v5, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    if-eqz p5, :cond_2

    sget-object v6, Le43/e;->a:Le43/e;

    invoke-virtual {v5, v6, p5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-object p2, p2, Lt23/c0;->p:Lt23/s0;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_3
    if-eqz p1, :cond_a

    if-eqz v0, :cond_a

    if-eqz p5, :cond_a

    iget-object p2, p0, Lg43/j;->H:Lg43/n;

    iget-boolean v1, p0, Lg43/j;->E:Z

    iget-object v5, p0, Lg43/j;->w:Landroid/app/Application;

    invoke-virtual {p0}, Lg43/j;->n()Lb23/k;

    move-result-object v6

    iget-object v7, v6, Lb23/k;->c:Lb23/e;

    iget-object v8, v6, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v7, v2, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_4

    iget-object v7, v6, Lb23/k;->b:Lb23/j;

    iget-object v6, v6, Lb23/k;->a:Ljava/lang/String;

    const-string v8, "[getIncomingCallNotification] callerName: "

    invoke-static {v8, p3, v3, p4}, Ld13/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v7, v2, v6, v8, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    invoke-virtual {p0}, Lg43/j;->n()Lb23/k;

    move-result-object v6

    iget-object v7, v6, Lb23/k;->c:Lb23/e;

    iget-object v8, v6, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v7, v2, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_5

    iget-object v7, v6, Lb23/k;->b:Lb23/j;

    iget-object v6, v6, Lb23/k;->a:Ljava/lang/String;

    const-string v8, "[getIncomingCallNotificationInternal] callerName: "

    invoke-static {v8, p3, v3, p4}, Ld13/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v7, v2, v6, v3, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    invoke-static {}, Lvd/e;->G()Z

    move-result v3

    if-eqz v3, :cond_6

    if-eqz v1, :cond_6

    iget-object p2, p2, Lg43/n;->f:Lg43/m;

    goto :goto_0

    :cond_6
    iget-object p2, p2, Lg43/n;->a:Lg43/m;

    :goto_0
    invoke-virtual {p0}, Lg43/j;->n()Lb23/k;

    move-result-object v3

    iget-object v6, v3, Lb23/k;->c:Lb23/e;

    iget-object v7, v3, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v6, v2, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_7

    iget-object v6, v3, Lb23/k;->b:Lb23/j;

    iget-object v3, v3, Lb23/k;->a:Ljava/lang/String;

    iget-object v7, p2, Lg43/m;->a:Ljava/lang/String;

    const-string v8, "[ensureChannelAndBuildNotification] channelId: "

    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v6, v2, v3, v7, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    iget-object v2, p0, Lg43/j;->x:Landroidx/core/app/NotificationManagerCompat;

    invoke-static {p2, v2}, Lg43/a;->a(Lg43/m;Landroidx/core/app/NotificationManagerCompat;)V

    iget-object p2, p2, Lg43/m;->a:Ljava/lang/String;

    new-instance v2, Landroidx/core/app/NotificationCompat$Builder;

    invoke-direct {v2, v5, p2}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    if-eqz v1, :cond_8

    const/4 v1, -0x1

    goto :goto_1

    :cond_8
    const/4 v1, 0x2

    :goto_1
    invoke-virtual {v2, v1}, Landroidx/core/app/NotificationCompat$Builder;->setPriority(I)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v2, p3}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    const v1, 0x7f140f08

    invoke-virtual {v5, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    const v1, 0x7f080774

    invoke-virtual {v2, v1}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v2, p2}, Landroidx/core/app/NotificationCompat$Builder;->setChannelId(Ljava/lang/String;)Landroidx/core/app/NotificationCompat$Builder;

    const/4 p2, 0x1

    invoke-virtual {v2, p2}, Landroidx/core/app/NotificationCompat$Builder;->setOngoing(Z)Landroidx/core/app/NotificationCompat$Builder;

    const-string v1, "call"

    invoke-virtual {v2, v1}, Landroidx/core/app/NotificationCompat$Builder;->setCategory(Ljava/lang/String;)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v2, p1, p2}, Landroidx/core/app/NotificationCompat$Builder;->setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroidx/core/app/NotificationCompat$Builder;

    if-eqz p4, :cond_9

    invoke-virtual {v2, p1}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    goto :goto_2

    :cond_9
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    const/high16 p2, 0x4000000

    const/4 p4, 0x0

    invoke-static {v5, p4, p1, p2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v2, p4}, Landroidx/core/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroidx/core/app/NotificationCompat$Builder;

    :goto_2
    invoke-virtual {p0, v2, v0, p5, p3}, Lg43/j;->l(Landroidx/core/app/NotificationCompat$Builder;Landroid/app/PendingIntent;Landroid/app/PendingIntent;Ljava/lang/String;)V

    iget-object p1, p0, Lg43/j;->F:Lg43/k;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object p1

    const-string p2, "build(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_a
    invoke-virtual {p0}, Lg43/j;->n()Lb23/k;

    move-result-object p1

    iget-object p2, p1, Lb23/k;->c:Lb23/e;

    sget-object p3, Lb23/g;->F:Lb23/g;

    iget-object p4, p1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {p2, p3, p4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_d

    iget-object p2, p1, Lb23/k;->b:Lb23/j;

    iget-object p1, p1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {p2, p3, p1, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v4

    :cond_b
    instance-of p1, p1, Lt23/a3;

    if-eqz p1, :cond_d

    iget-object p1, p0, Lg43/j;->z:La33/d;

    sget-object p4, Le43/i;->b:Le43/i;

    invoke-virtual {p2, p4}, Lio/getstream/video/android/model/StreamCallId;->getNotificationId(Le43/m;)I

    move-result p4

    invoke-virtual {p1, p2, p4, p5}, La33/d;->L(Lio/getstream/video/android/model/StreamCallId;ILjava/util/Map;)Landroid/app/PendingIntent;

    move-result-object p1

    iget-object p4, p0, Lg43/j;->z:La33/d;

    invoke-virtual {p4, p2, p5}, La33/d;->I(Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)Landroid/app/PendingIntent;

    move-result-object p4

    if-eqz p1, :cond_c

    if-eqz p4, :cond_c

    const/16 p1, 0x8

    invoke-static {p0, p2, p3, p5, p1}, Lg43/p;->d(Lg43/p;Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/util/Map;I)Landroid/app/Notification;

    move-result-object p1

    return-object p1

    :cond_c
    invoke-virtual {p0}, Lg43/j;->n()Lb23/k;

    move-result-object p1

    iget-object p2, p1, Lb23/k;->c:Lb23/e;

    sget-object p3, Lb23/g;->F:Lb23/g;

    iget-object p4, p1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {p2, p3, p4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_d

    iget-object p2, p1, Lb23/k;->b:Lb23/j;

    iget-object p1, p1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {p2, p3, p1, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_d
    return-object v4
.end method

.method public final h(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/util/Map;)V
    .locals 8

    const-string v0, "callId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callDisplayName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lg43/j;->n()Lb23/k;

    move-result-object p3

    iget-object v0, p3, Lb23/k;->c:Lb23/e;

    sget-object v1, Lb23/g;->y:Lb23/g;

    iget-object v2, p3, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    iget-object p3, p3, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lio/getstream/video/android/model/StreamCallId;->getId()Ljava/lang/String;

    move-result-object v0

    const-string v4, "[onNotification] callId: "

    const-string v5, ", callDisplayName: "

    invoke-static {v4, v0, v5, p2}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, v1, v2, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-virtual {p1}, Lio/getstream/video/android/model/StreamCallId;->hashCode()I

    move-result p3

    iget-object v0, p0, Lg43/j;->z:La33/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Landroid/content/Intent;

    const-string v4, "io.getstream.video.android.action.NOTIFICATION"

    invoke-direct {v2, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v2, v4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v2

    const-string v4, "putExtras(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2, p1, p3}, La33/d;->G(Landroid/content/Intent;Lio/getstream/video/android/model/StreamCallId;I)Landroid/app/PendingIntent;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lg43/j;->n()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v4, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->F:Lb23/g;

    invoke-interface {v2, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v2, "Couldn\'t find any activity for io.getstream.video.android.action.NOTIFICATION"

    invoke-interface {v0, v5, v4, v2, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    iget-object v0, p0, Lg43/j;->H:Lg43/n;

    iget-object v2, v0, Lg43/n;->b:Lg43/m;

    iget-object v4, v2, Lg43/m;->a:Ljava/lang/String;

    invoke-virtual {p0}, Lg43/j;->n()Lb23/k;

    move-result-object v5

    iget-object v6, v5, Lb23/k;->c:Lb23/e;

    iget-object v7, v5, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v6, v1, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    iget-object v5, v5, Lb23/k;->b:Lb23/j;

    const-string v6, "[ensureChannelAndBuildNotification] channelId: "

    invoke-virtual {v6, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v1, v7, v6, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    iget-object v1, p0, Lg43/j;->x:Landroidx/core/app/NotificationManagerCompat;

    invoke-static {v2, v1}, Lg43/a;->a(Lg43/m;Landroidx/core/app/NotificationManagerCompat;)V

    new-instance v1, Landroidx/core/app/NotificationCompat$Builder;

    iget-object v2, p0, Lg43/j;->w:Landroid/app/Application;

    invoke-direct {v1, v2, v4}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    iget-object p2, v0, Lg43/n;->b:Lg43/m;

    iget-object p2, p2, Lg43/m;->a:Ljava/lang/String;

    invoke-virtual {v1, p2}, Landroidx/core/app/NotificationCompat$Builder;->setChannelId(Ljava/lang/String;)Landroidx/core/app/NotificationCompat$Builder;

    const-string p2, "status"

    invoke-virtual {v1, p2}, Landroidx/core/app/NotificationCompat$Builder;->setCategory(Ljava/lang/String;)Landroidx/core/app/NotificationCompat$Builder;

    const/4 p2, 0x0

    invoke-virtual {v1, p2}, Landroidx/core/app/NotificationCompat$Builder;->setOngoing(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p2

    const-string v0, "setOngoing(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object p2

    const-string v0, "build(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p3, p2, p1}, Lg43/j;->p(ILandroid/app/Notification;Lio/getstream/video/android/model/StreamCallId;)V

    return-void
.end method

.method public final i(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/util/Map;)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v6, p3

    const-string v0, "callId"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callDisplayName"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lg43/j;->n()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    sget-object v7, Lb23/g;->y:Lb23/g;

    iget-object v5, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v7, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    const/4 v8, 0x0

    if-eqz v2, :cond_0

    iget-object v2, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-virtual {v3}, Lio/getstream/video/android/model/StreamCallId;->getId()Ljava/lang/String;

    move-result-object v5

    const-string v9, "[onRingingCall] #ringing; callId: "

    invoke-static {v9, v5}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v7, v0, v5, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    sget-object v0, Lt23/j3;->t:Lt23/i3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lt23/i3;->a()Lt23/j3;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lt23/b4;

    iget-object v5, v2, Lt23/b4;->V:Ld33/c;

    invoke-virtual {v3}, Lio/getstream/video/android/model/StreamCallId;->getCid()Ljava/lang/String;

    move-result-object v9

    const-string v10, "callBusyHandler"

    invoke-static {v5, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "callCid"

    invoke-static {v9, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Ld33/a;->w:Ld33/a;

    iget-object v2, v2, Lt23/b4;->K:Lbi/p;

    invoke-virtual {v3}, Lio/getstream/video/android/model/StreamCallId;->getType()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lbi/p;->b(Ljava/lang/String;)Lj43/c;

    move-result-object v2

    iget-boolean v2, v2, Lj43/c;->a:Z

    if-eqz v2, :cond_d

    iget-object v9, v1, Lg43/j;->M:La30/w0;

    iget-object v10, v1, Lg43/j;->w:Landroid/app/Application;

    check-cast v0, Lt23/b4;

    iget-object v0, v0, Lt23/b4;->U:Lt23/g1;

    iget-object v0, v0, Lt23/g1;->i:Lbi/p;

    invoke-virtual {v3}, Lio/getstream/video/android/model/StreamCallId;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lbi/p;->b(Ljava/lang/String;)Lj43/c;

    move-result-object v11

    const-string v0, "video"

    invoke-interface {v6, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    sget-object v0, Lt23/i3;->b:Lt23/j3;

    if-eqz v0, :cond_2

    invoke-virtual {v3}, Lio/getstream/video/android/model/StreamCallId;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3}, Lio/getstream/video/android/model/StreamCallId;->getId()Ljava/lang/String;

    move-result-object v5

    check-cast v0, Lt23/b4;

    invoke-virtual {v0, v2, v5}, Lt23/b4;->n(Ljava/lang/String;Ljava/lang/String;)Lt23/c0;

    move-result-object v0

    goto :goto_0

    :cond_2
    move-object v0, v8

    :goto_0
    if-eqz v0, :cond_3

    iget-object v0, v0, Lt23/c0;->p:Lt23/s0;

    iget-object v0, v0, Lt23/s0;->J:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/android/video/generated/models/CallSettingsResponse;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallSettingsResponse;->getVideo()Lio/getstream/android/video/generated/models/VideoSettingsResponse;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->getEnabled()Z

    :cond_3
    :goto_1
    new-instance v2, Lt23/z2;

    const/4 v0, 0x0

    invoke-direct {v2, v0}, Lt23/z2;-><init>(Z)V

    const/4 v5, 0x1

    invoke-virtual/range {v1 .. v6}, Lg43/j;->g(Lt23/d3;Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;ZLjava/util/Map;)Landroid/app/Notification;

    move-result-object v2

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "context"

    invoke-static {v10, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v9, La30/w0;->E:Ljava/lang/Object;

    check-cast v1, Lqg3/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Lqg3/d;->r()Lb23/k;

    move-result-object v5

    iget-object v6, v5, Lb23/k;->c:Lb23/e;

    iget-object v12, v5, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v6, v7, v12}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_5

    iget-object v6, v5, Lb23/k;->b:Lb23/j;

    iget-object v5, v5, Lb23/k;->a:Ljava/lang/String;

    invoke-virtual {v3}, Lio/getstream/video/android/model/StreamCallId;->getId()Ljava/lang/String;

    move-result-object v12

    if-eqz v2, :cond_4

    const/4 v0, 0x1

    :cond_4
    const-string v13, ", callDisplayName="

    const-string v14, ", notification="

    const-string v15, "[showIncomingCall] callId="

    invoke-static {v15, v12, v13, v4, v14}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v6, v7, v5, v0, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    new-instance v0, Lj43/i;

    const-string v5, "incoming_call"

    invoke-direct {v0, v3, v5, v4, v11}, Lj43/i;-><init>(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/lang/String;Lj43/c;)V

    sget-object v4, Lj43/h;->z:Lj43/h;

    :try_start_0
    invoke-virtual {v1}, Lqg3/d;->v()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-virtual {v1}, Lqg3/d;->r()Lb23/k;

    move-result-object v5

    iget-object v6, v5, Lb23/k;->c:Lb23/e;

    iget-object v12, v5, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v6, v7, v12}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_6

    iget-object v6, v5, Lb23/k;->b:Lb23/j;

    iget-object v5, v5, Lb23/k;->a:Ljava/lang/String;

    const-string v12, "[showIncomingCall] Starting foreground service"

    invoke-interface {v6, v7, v5, v12, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    iget-object v5, v1, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v5, Lj43/g;

    invoke-virtual {v5, v10, v0}, Lj43/g;->a(Landroid/content/Context;Lj43/i;)Landroid/content/Intent;

    move-result-object v0

    invoke-static {v10, v0}, Ls4/c;->startForegroundService(Landroid/content/Context;Landroid/content/Intent;)V

    sget-object v0, Lj43/h;->w:Lj43/h;

    :goto_2
    move-object v4, v0

    goto :goto_3

    :catch_0
    move-exception v0

    goto :goto_4

    :cond_7
    invoke-virtual {v1, v10, v0, v2}, Lqg3/d;->u(Landroid/content/Context;Lj43/i;Landroid/app/Notification;)Lj43/h;

    move-result-object v0

    goto :goto_2

    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    new-instance v5, Ln23/g;

    invoke-direct {v5, v0}, Ln23/g;-><init>(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :goto_4
    sget-object v5, Lb23/i;->a:Lb23/i;

    sget-object v5, Lb23/i;->d:Lb23/e;

    sget-object v6, Lb23/g;->F:Lb23/g;

    const-string v7, "SafeCall"

    invoke-interface {v5, v6, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_8

    sget-object v5, Lb23/i;->c:Lb23/j;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v12

    const-string v13, "Exception occurred: "

    invoke-static {v13, v12}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-interface {v5, v6, v7, v12, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    new-instance v5, Ln23/f;

    new-instance v6, Ln23/d;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v7

    const-string v12, "Safe call failed with "

    invoke-static {v12, v7}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7, v0}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v5, v6}, Ln23/f;-><init>(Ln23/e;)V

    :goto_5
    instance-of v0, v5, Ln23/g;

    if-nez v0, :cond_b

    instance-of v0, v5, Ln23/f;

    if-eqz v0, :cond_a

    invoke-virtual {v1}, Lqg3/d;->r()Lb23/k;

    move-result-object v0

    iget-object v4, v0, Lb23/k;->c:Lb23/e;

    sget-object v5, Lb23/g;->y:Lb23/g;

    iget-object v6, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v4, v5, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_9

    iget-object v4, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    const-string v6, "[showIncomingCall] onError"

    invoke-interface {v4, v5, v0, v6, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    invoke-virtual {v1, v10, v2, v3}, Lqg3/d;->C(Landroid/content/Context;Landroid/app/Notification;Lio/getstream/video/android/model/StreamCallId;)Lj43/h;

    move-result-object v4

    goto :goto_6

    :cond_a
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_b
    :goto_6
    invoke-virtual {v9}, La30/w0;->r()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    iget-object v1, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "[showIncomingCall] service start result: "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v0, v3, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_c
    iget-object v0, v9, La30/w0;->F:Ljava/lang/Object;

    check-cast v0, Lng3/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v11, v10}, Lng3/o;->m(Lj43/c;Landroid/content/Context;)V

    :cond_d
    return-void
.end method

.method public final j(Ljava/lang/String;Lio/getstream/video/android/model/StreamCallId;)Landroid/app/Notification;
    .locals 16

    move-object/from16 v0, p0

    const-string v1, "incoming_call"

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "[ensureChannelAndBuildNotification] channelId: "

    const-string v4, "build(...)"

    const-string v5, "call"

    iget-object v7, v0, Lg43/j;->x:Landroidx/core/app/NotificationManagerCompat;

    const v8, 0x7f140efd

    const v9, 0x7f140efe

    iget-object v11, v0, Lg43/j;->H:Lg43/n;

    const-string v12, "getString(...)"

    iget-object v13, v0, Lg43/j;->w:Landroid/app/Application;

    if-eqz v1, :cond_4

    invoke-virtual {v13, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v13, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lvd/e;->G()Z

    move-result v9

    iget-boolean v12, v0, Lg43/j;->E:Z

    if-eqz v9, :cond_0

    if-eqz v12, :cond_0

    iget-object v9, v11, Lg43/n;->f:Lg43/m;

    goto :goto_0

    :cond_0
    iget-object v9, v11, Lg43/n;->a:Lg43/m;

    :goto_0
    iget-object v11, v9, Lg43/m;->a:Ljava/lang/String;

    iget-object v14, v0, Lg43/j;->z:La33/d;

    sget-object v15, Lm83/z;->w:Lm83/z;

    move-object/from16 v10, p2

    invoke-static {v14, v10, v15}, La33/d;->J(La33/d;Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)Landroid/app/PendingIntent;

    move-result-object v10

    if-nez v10, :cond_1

    invoke-virtual {v0}, Lg43/j;->n()Lb23/k;

    move-result-object v14

    iget-object v15, v14, Lb23/k;->c:Lb23/e;

    iget-object v6, v14, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v15, v3, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v15

    if-eqz v15, :cond_1

    iget-object v14, v14, Lb23/k;->b:Lb23/j;

    const-string v15, "[getSettingUpCallNotification] fullScreenPendingIntent is null; lock-screen wake-up may not work."

    const/4 v0, 0x0

    invoke-interface {v14, v3, v6, v15, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lg43/j;->n()Lb23/k;

    move-result-object v0

    iget-object v3, v0, Lb23/k;->c:Lb23/e;

    iget-object v6, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v14, Lb23/g;->y:Lb23/g;

    invoke-interface {v3, v14, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {v2, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v0, v14, v6, v2, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    invoke-static {v9, v7}, Lg43/a;->a(Lg43/m;Landroidx/core/app/NotificationManagerCompat;)V

    new-instance v0, Landroidx/core/app/NotificationCompat$Builder;

    invoke-direct {v0, v13, v11}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    if-eqz v12, :cond_3

    const/4 v2, -0x1

    goto :goto_1

    :cond_3
    const/4 v2, 0x2

    :goto_1
    invoke-virtual {v0, v2}, Landroidx/core/app/NotificationCompat$Builder;->setPriority(I)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v0, v8}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    const v1, 0x7f080774

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v0, v11}, Landroidx/core/app/NotificationCompat$Builder;->setChannelId(Ljava/lang/String;)Landroidx/core/app/NotificationCompat$Builder;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setOngoing(Z)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v0, v5}, Landroidx/core/app/NotificationCompat$Builder;->setCategory(Ljava/lang/String;)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v0, v10, v1}, Landroidx/core/app/NotificationCompat$Builder;->setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v0, v10}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    const-string v1, "setContentIntent(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_4
    iget-object v0, v11, Lg43/n;->c:Lg43/m;

    iget-object v0, v0, Lg43/m;->a:Ljava/lang/String;

    invoke-virtual {v13, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v13, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v11, Lg43/n;->c:Lg43/m;

    iget-object v8, v6, Lg43/m;->a:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lg43/j;->n()Lb23/k;

    move-result-object v9

    iget-object v10, v9, Lb23/k;->c:Lb23/e;

    iget-object v11, v9, Lb23/k;->a:Ljava/lang/String;

    sget-object v12, Lb23/g;->y:Lb23/g;

    invoke-interface {v10, v12, v11}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_5

    iget-object v9, v9, Lb23/k;->b:Lb23/j;

    invoke-virtual {v2, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v10, 0x0

    invoke-interface {v9, v12, v11, v2, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    invoke-static {v6, v7}, Lg43/a;->a(Lg43/m;Landroidx/core/app/NotificationManagerCompat;)V

    new-instance v2, Landroidx/core/app/NotificationCompat$Builder;

    invoke-direct {v2, v13, v8}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v2, v3}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    const v1, 0x7f080774

    invoke-virtual {v2, v1}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v2, v0}, Landroidx/core/app/NotificationCompat$Builder;->setChannelId(Ljava/lang/String;)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v2, v5}, Landroidx/core/app/NotificationCompat$Builder;->setCategory(Ljava/lang/String;)Landroidx/core/app/NotificationCompat$Builder;

    const/4 v1, 0x1

    invoke-virtual {v2, v1}, Landroidx/core/app/NotificationCompat$Builder;->setOngoing(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    const-string v1, "setOngoing(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final l(Landroidx/core/app/NotificationCompat$Builder;Landroid/app/PendingIntent;Landroid/app/PendingIntent;Ljava/lang/String;)V
    .locals 5

    invoke-virtual {p0}, Lg43/j;->n()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[addCallActions] callDisplayName: "

    invoke-static {v1, p4}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_3

    iget-object v0, p0, Lg43/j;->O:Lgm/j;

    iget-object v0, v0, Lgm/j;->w:Landroid/content/Context;

    const-class v1, Landroid/app/ActivityManager;

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    invoke-virtual {v0}, Landroid/app/ActivityManager;->isBackgroundRestricted()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lg43/j;->N:Ls43/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Landroidx/core/app/Person$Builder;

    invoke-direct {v1}, Landroidx/core/app/Person$Builder;-><init>()V

    if-nez p4, :cond_1

    const-string v2, "Unknown"

    goto :goto_0

    :cond_1
    move-object v2, p4

    :goto_0
    invoke-virtual {v1, v2}, Landroidx/core/app/Person$Builder;->setName(Ljava/lang/CharSequence;)Landroidx/core/app/Person$Builder;

    move-result-object v1

    if-nez p4, :cond_2

    iget-object p4, v0, Ls43/a;->a:Landroid/app/Application;

    const v0, 0x7f08078e

    invoke-static {p4, v0}, Landroidx/core/graphics/drawable/IconCompat;->d(Landroid/content/Context;I)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p4

    invoke-virtual {v1, p4}, Landroidx/core/app/Person$Builder;->setIcon(Landroidx/core/graphics/drawable/IconCompat;)Landroidx/core/app/Person$Builder;

    :cond_2
    invoke-virtual {v1}, Landroidx/core/app/Person$Builder;->build()Landroidx/core/app/Person;

    move-result-object p4

    invoke-static {p4, p3, p2}, Landroidx/core/app/NotificationCompat$CallStyle;->forIncomingCall(Landroidx/core/app/Person;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$CallStyle;

    move-result-object p2

    const-string p3, "forIncomingCall(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Landroidx/core/app/NotificationCompat$Builder;->setStyle(Landroidx/core/app/NotificationCompat$Style;)Landroidx/core/app/NotificationCompat$Builder;

    return-void

    :cond_3
    invoke-virtual {p0}, Lg43/j;->n()Lb23/k;

    move-result-object p4

    iget-object v0, p4, Lb23/k;->c:Lb23/e;

    iget-object v1, p4, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v0, v2, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object p4, p4, Lb23/k;->b:Lb23/j;

    const-string v0, "[getAcceptAction]"

    invoke-interface {p4, v2, v1, v0, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    new-instance p4, Landroidx/core/app/NotificationCompat$Action$Builder;

    const v0, 0x7f140ee8

    iget-object v1, p0, Lg43/j;->w:Landroid/app/Application;

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p4, v4, v0, p2}, Landroidx/core/app/NotificationCompat$Action$Builder;-><init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    invoke-virtual {p4}, Landroidx/core/app/NotificationCompat$Action$Builder;->build()Landroidx/core/app/NotificationCompat$Action;

    move-result-object p2

    const-string p4, "build(...)"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Landroidx/core/app/NotificationCompat$Builder;->addAction(Landroidx/core/app/NotificationCompat$Action;)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {p0}, Lg43/j;->n()Lb23/k;

    move-result-object p2

    iget-object v0, p2, Lb23/k;->c:Lb23/e;

    iget-object v3, p2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v0, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object p2, p2, Lb23/k;->b:Lb23/j;

    const-string v0, "[getRejectAction]"

    invoke-interface {p2, v2, v3, v0, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    new-instance p2, Landroidx/core/app/NotificationCompat$Action$Builder;

    const v0, 0x7f140eeb

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v4, v0, p3}, Landroidx/core/app/NotificationCompat$Action$Builder;-><init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    invoke-virtual {p2}, Landroidx/core/app/NotificationCompat$Action$Builder;->build()Landroidx/core/app/NotificationCompat$Action;

    move-result-object p2

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Landroidx/core/app/NotificationCompat$Builder;->addAction(Landroidx/core/app/NotificationCompat$Action;)Landroidx/core/app/NotificationCompat$Builder;

    return-void
.end method

.method public final m(Lt23/c0;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    iget-object v0, p1, Lt23/c0;->p:Lt23/s0;

    iget-object v0, v0, Lt23/s0;->w0:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Landroid/app/Notification;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Landroid/app/Notification;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_4

    iget-object v1, v0, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    const-string v3, "android.title"

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v2

    :goto_1
    invoke-virtual {p0}, Lg43/j;->n()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    iget-object v5, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->y:Lb23/g;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    iget-object p1, p1, Lt23/c0;->v:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v7, "[getCustomDisplayNameOrDefault] callId: "

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", lastNotification: "

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", title from notification = "

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", defaultName: "

    invoke-static {v4, v1, p1, p2}, Lb9/y;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v3, v6, v5, p1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    return-object v1

    :cond_4
    :goto_2
    return-object p2
.end method

.method public final n()Lb23/k;
    .locals 1

    iget-object v0, p0, Lg43/j;->L:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method public final onPermissionDenied()V
    .locals 1

    iget-object v0, p0, Lg43/j;->y:La13/c;

    invoke-interface {v0}, La13/c;->onPermissionDenied()V

    return-void
.end method

.method public final onPermissionGranted()V
    .locals 1

    iget-object v0, p0, Lg43/j;->y:La13/c;

    invoke-interface {v0}, La13/c;->onPermissionGranted()V

    return-void
.end method

.method public final onPermissionRationale()V
    .locals 1

    iget-object v0, p0, Lg43/j;->y:La13/c;

    invoke-interface {v0}, La13/c;->onPermissionRationale()V

    return-void
.end method

.method public final onPermissionRequested()V
    .locals 1

    iget-object v0, p0, Lg43/j;->y:La13/c;

    invoke-interface {v0}, La13/c;->onPermissionRequested()V

    return-void
.end method

.method public final p(ILandroid/app/Notification;Lio/getstream/video/android/model/StreamCallId;)V
    .locals 3

    iget-object v0, p0, Lg43/j;->w:Landroid/app/Application;

    const-string v1, "android.permission.POST_NOTIFICATIONS"

    iget-object v2, p0, Lg43/j;->K:Lc93/m;

    invoke-interface {v2, v0, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lg43/j;->J:Ld1/j;

    invoke-virtual {v0, p1, p2, p3}, Ld1/j;->C(ILandroid/app/Notification;Lio/getstream/video/android/model/StreamCallId;)V

    invoke-virtual {p0}, Lg43/j;->n()Lb23/k;

    move-result-object p2

    iget-object p3, p2, Lb23/k;->c:Lb23/e;

    iget-object v0, p2, Lb23/k;->a:Ljava/lang/String;

    sget-object v2, Lb23/g;->y:Lb23/g;

    invoke-interface {p3, v2, v0}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_1

    iget-object p2, p2, Lb23/k;->b:Lb23/j;

    const-string p3, "[showNotification] with notificationId: "

    invoke-static {p1, p3}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v2, v0, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lg43/j;->n()Lb23/k;

    move-result-object p1

    iget-object p2, p1, Lb23/k;->c:Lb23/e;

    iget-object p3, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v0, Lb23/g;->E:Lb23/g;

    invoke-interface {p2, v0, p3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string p2, "[showNotification] Permission not granted, not showing notification."

    invoke-interface {p1, v0, p3, p2, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method
