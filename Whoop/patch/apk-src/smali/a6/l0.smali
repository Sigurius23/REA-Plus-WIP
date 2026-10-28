.class public final synthetic La6/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, La6/l0;->w:I

    iput-object p1, p0, La6/l0;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/16 v0, 0xe

    iput v0, p0, La6/l0;->w:I

    sget-object v0, Lg1/b2;->w:Lg1/b2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La6/l0;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 22

    move-object/from16 v1, p0

    iget v0, v1, La6/l0;->w:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, La6/l0;->x:Ljava/lang/Object;

    check-cast v0, Llb/p;

    iget-object v2, v0, Llb/p;->w:Ltb/b;

    iget-object v0, v0, Llb/p;->x:Ljava/lang/String;

    invoke-interface {v2, v0}, Ltb/b;->h(Ljava/lang/String;)Ltb/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, v1, La6/l0;->x:Ljava/lang/Object;

    check-cast v0, Lu82/d;

    invoke-static {v0}, Ljj1/b;->d(Lu82/d;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, v1, La6/l0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v2, Lq73/d;->w:Lq73/d;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln73/b;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ln73/b;->dispose()V

    :cond_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_2
    iget-object v0, v1, La6/l0;->x:Ljava/lang/Object;

    check-cast v0, Ljc/v;

    iget-object v2, v0, Ljc/v;->c:Landroidx/work/impl/WorkDatabase;

    iget-object v5, v0, Ljc/v;->a:Landroid/content/Context;

    sget-object v6, Llc/c;->F:Ljava/lang/String;

    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x22

    if-lt v6, v7, :cond_1

    invoke-static {v5}, Llc/a;->b(Landroid/content/Context;)Landroid/app/job/JobScheduler;

    move-result-object v6

    invoke-virtual {v6}, Landroid/app/job/JobScheduler;->cancelAll()V

    :cond_1
    const-string v6, "jobscheduler"

    invoke-virtual {v5, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/app/job/JobScheduler;

    invoke-static {v5, v6}, Llc/c;->d(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_2

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/app/job/JobInfo;

    invoke-virtual {v7}, Landroid/app/job/JobInfo;->getId()I

    move-result v7

    invoke-static {v6, v7}, Llc/c;->b(Landroid/app/job/JobScheduler;I)V

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->h()Lqc/u;

    move-result-object v5

    iget-object v5, v5, Lqc/u;->a:Landroidx/room/z0;

    new-instance v6, Lpl0/a;

    const/16 v7, 0x1d

    invoke-direct {v6, v7}, Lpl0/a;-><init>(I)V

    invoke-static {v5, v4, v3, v6}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    iget-object v3, v0, Ljc/v;->b:Lic/b;

    iget-object v0, v0, Ljc/v;->e:Ljava/util/List;

    invoke-static {v3, v2, v0}, Ljc/k;->b(Lic/b;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_3
    iget-object v0, v1, La6/l0;->x:Ljava/lang/Object;

    check-cast v0, Ljc/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lrc/a;->a(Ljc/o;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_4
    iget-object v0, v1, La6/l0;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/scope/user/UserIdentifier;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/scope/user/UserIdentifier;->getValue()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, v1, La6/l0;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase_Impl;

    new-instance v2, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;

    invoke-direct {v2, v0}, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;-><init>(Landroidx/room/z0;)V

    return-object v2

    :pswitch_6
    iget-object v0, v1, La6/l0;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/parser2/adapters/CustomObjectDtoAdapter;

    invoke-static {v0}, Lio/getstream/chat/android/client/parser2/adapters/CustomObjectDtoAdapter;->a(Lio/getstream/chat/android/client/parser2/adapters/CustomObjectDtoAdapter;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, v1, La6/l0;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/parser2/MoshiChatParser;

    invoke-static {v0}, Lio/getstream/chat/android/client/parser2/MoshiChatParser;->a(Lio/getstream/chat/android/client/parser2/MoshiChatParser;)Lqx/l0;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, v1, La6/l0;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/api/ChatApiConfig;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/api/ChatApiConfig;->getDistinctApiCalls()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_9
    iget-object v0, v1, La6/l0;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/api2/MoshiChatApi;

    invoke-static {v0}, Lio/getstream/chat/android/client/api2/MoshiChatApi;->V(Lio/getstream/chat/android/client/api2/MoshiChatApi;)Lio/getstream/chat/android/client/helpers/CallPostponeHelper;

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v0, v1, La6/l0;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/api/interceptor/HeadersInterceptor;

    invoke-static {v0}, Lio/getstream/chat/android/client/api/interceptor/HeadersInterceptor;->a(Lio/getstream/chat/android/client/api/interceptor/HeadersInterceptor;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_b
    iget-object v0, v1, La6/l0;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/ChatClient$Builder;

    invoke-static {v0}, Lio/getstream/chat/android/client/ChatClient$Builder;->a(Lio/getstream/chat/android/client/ChatClient$Builder;)Lb9/f0;

    move-result-object v0

    return-object v0

    :pswitch_c
    iget-object v0, v1, La6/l0;->x:Ljava/lang/Object;

    check-cast v0, Lh0/w2;

    iget-boolean v0, v0, Lb2/v;->N:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_d
    iget-object v0, v1, La6/l0;->x:Ljava/lang/Object;

    check-cast v0, Lg1/n7;

    iget-object v0, v0, Lg1/n7;->i:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0

    :pswitch_e
    sget-object v0, Lg1/b2;->w:Lg1/b2;

    iget-object v3, v1, La6/l0;->x:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    new-instance v4, Lg1/a2;

    invoke-direct {v4, v0, v3, v2}, Lg1/n7;-><init>(Ljava/lang/Enum;Lkotlin/jvm/functions/Function1;I)V

    return-object v4

    :pswitch_f
    iget-object v0, v1, La6/l0;->x:Ljava/lang/Object;

    check-cast v0, Lf0/s1;

    sget-object v2, Lf0/g1;->a:Lp1/b0;

    invoke-static {v0, v2}, La3/g;->f(La3/m;Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf0/l;

    iput-object v2, v0, Lf0/s1;->a0:Lf0/l;

    if-eqz v2, :cond_3

    new-instance v6, Lf0/k;

    iget-object v7, v2, Lf0/l;->a:Landroid/content/Context;

    iget-object v8, v2, Lf0/l;->b:Ly3/c;

    iget-wide v9, v2, Lf0/l;->c:J

    iget-object v11, v2, Lf0/l;->d:Ll0/k1;

    invoke-direct/range {v6 .. v11}, Lf0/k;-><init>(Landroid/content/Context;Ly3/c;JLl0/k1;)V

    move-object v5, v6

    :cond_3
    iput-object v5, v0, Lf0/s1;->b0:Lf0/k;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_10
    iget-object v0, v1, La6/l0;->x:Ljava/lang/Object;

    check-cast v0, Ld61/a;

    invoke-static {v0}, Le61/h;->l(Ld61/a;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_11
    iget-object v0, v1, La6/l0;->x:Ljava/lang/Object;

    check-cast v0, Le1/s;

    iput-object v5, v0, Le1/s;->Z:Le1/r;

    invoke-static {v0}, La3/g;->j(La3/j2;)V

    invoke-static {v0}, La3/g;->i(La3/c0;)V

    invoke-static {v0}, La3/g;->h(La3/r;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_12
    iget-object v0, v1, La6/l0;->x:Ljava/lang/Object;

    check-cast v0, Le1/p;

    iput-object v5, v0, Le1/p;->f0:Le1/o;

    invoke-static {v0}, La3/g;->j(La3/j2;)V

    invoke-static {v0}, La3/g;->i(La3/c0;)V

    invoke-static {v0}, La3/g;->h(La3/r;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_13
    iget-object v0, v1, La6/l0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-static {v0}, Ldk0/i;->Q(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0

    :pswitch_14
    iget-object v0, v1, La6/l0;->x:Ljava/lang/Object;

    check-cast v0, Ldh/e;

    new-instance v6, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v6}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    iget-object v7, v0, Ldh/e;->b:Lmh/m;

    new-instance v8, Ldh/b;

    iget-object v9, v0, Ldh/e;->a:Ldh/x;

    invoke-virtual {v9}, Ldh/x;->d1()Lne3/j;

    move-result-object v10

    invoke-direct {v8, v10}, Ldh/b;-><init>(Lne3/p0;)V

    invoke-static {v8}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object v10

    iput-boolean v3, v6, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    invoke-virtual {v10}, Lne3/j0;->peek()Lne3/j0;

    move-result-object v11

    new-instance v12, Lne3/i0;

    invoke-direct {v12, v11}, Lne3/i0;-><init>(Lne3/j0;)V

    invoke-static {v12, v5, v6}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    iget-object v11, v8, Ldh/b;->y:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Exception;

    if-nez v11, :cond_2d

    iput-boolean v4, v6, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    sget-object v11, Ldh/n;->a:Landroid/graphics/Paint;

    iget-object v11, v6, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    iget-object v0, v0, Ldh/e;->d:Ldh/m;

    sget-object v12, Ldh/o;->a:Ljava/util/Set;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_6

    if-eq v0, v3, :cond_5

    if-ne v0, v2, :cond_4

    goto :goto_1

    :cond_4
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_5
    if-eqz v11, :cond_6

    sget-object v0, Ldh/o;->a:Ljava/util/Set;

    invoke-interface {v0, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    :goto_1
    new-instance v0, Lk6/g;

    new-instance v2, Ldh/l;

    invoke-virtual {v10}, Lne3/j0;->peek()Lne3/j0;

    move-result-object v11

    new-instance v12, Lne3/i0;

    invoke-direct {v12, v11}, Lne3/i0;-><init>(Lne3/j0;)V

    invoke-direct {v2, v12}, Ldh/l;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v2}, Lk6/g;-><init>(Ljava/io/InputStream;)V

    new-instance v2, Ldh/k;

    invoke-virtual {v0}, Lk6/g;->p()Z

    move-result v11

    invoke-virtual {v0}, Lk6/g;->l()I

    move-result v0

    invoke-direct {v2, v11, v0}, Ldh/k;-><init>(ZI)V

    goto :goto_2

    :cond_6
    sget-object v2, Ldh/k;->c:Ldh/k;

    :goto_2
    iget v0, v2, Ldh/k;->b:I

    iget-boolean v2, v2, Ldh/k;->a:Z

    iget-object v11, v8, Ldh/b;->y:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Exception;

    if-nez v11, :cond_2c

    iput-boolean v4, v6, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    iget-object v11, v7, Lmh/m;->c:Landroid/graphics/ColorSpace;

    iget-object v12, v7, Lmh/m;->a:Landroid/content/Context;

    iget-object v13, v7, Lmh/m;->d:Lnh/h;

    if-eqz v11, :cond_7

    iput-object v11, v6, Landroid/graphics/BitmapFactory$Options;->inPreferredColorSpace:Landroid/graphics/ColorSpace;

    :cond_7
    iget-boolean v11, v7, Lmh/m;->h:Z

    iput-boolean v11, v6, Landroid/graphics/BitmapFactory$Options;->inPremultiplied:Z

    iget-object v11, v7, Lmh/m;->b:Landroid/graphics/Bitmap$Config;

    if-nez v2, :cond_8

    if-lez v0, :cond_a

    :cond_8
    if-eqz v11, :cond_9

    sget-object v14, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    if-ne v11, v14, :cond_a

    :cond_9
    sget-object v11, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    :cond_a
    iget-boolean v14, v7, Lmh/m;->g:Z

    if-eqz v14, :cond_b

    sget-object v14, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    if-ne v11, v14, :cond_b

    iget-object v14, v6, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    const-string v15, "image/jpeg"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_b

    sget-object v11, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    :cond_b
    iget-object v14, v6, Landroid/graphics/BitmapFactory$Options;->outConfig:Landroid/graphics/Bitmap$Config;

    sget-object v15, Landroid/graphics/Bitmap$Config;->RGBA_F16:Landroid/graphics/Bitmap$Config;

    if-ne v14, v15, :cond_c

    sget-object v14, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    if-eq v11, v14, :cond_c

    move-object v11, v15

    :cond_c
    iput-object v11, v6, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    invoke-virtual {v9}, Ldh/x;->b()Ldt/b;

    move-result-object v9

    instance-of v11, v9, Ldh/y;

    const/16 v14, 0x10e

    const/16 v15, 0x5a

    if-eqz v11, :cond_d

    sget-object v11, Lnh/h;->c:Lnh/h;

    invoke-static {v13, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_d

    iput v3, v6, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    iput-boolean v3, v6, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    check-cast v9, Ldh/y;

    iget v7, v9, Ldh/y;->c:I

    iput v7, v6, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    invoke-virtual {v12}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v7

    iget v7, v7, Landroid/util/DisplayMetrics;->densityDpi:I

    iput v7, v6, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    move/from16 v17, v2

    move v2, v4

    goto/16 :goto_d

    :cond_d
    iget v9, v6, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    if-lez v9, :cond_e

    iget v11, v6, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    if-gtz v11, :cond_f

    :cond_e
    move/from16 v17, v2

    move v14, v3

    goto/16 :goto_c

    :cond_f
    if-eq v0, v15, :cond_11

    if-ne v0, v14, :cond_10

    goto :goto_3

    :cond_10
    move v5, v9

    goto :goto_4

    :cond_11
    :goto_3
    move v5, v11

    :goto_4
    if-eq v0, v15, :cond_13

    if-ne v0, v14, :cond_12

    goto :goto_5

    :cond_12
    move v9, v11

    :cond_13
    :goto_5
    iget-object v11, v7, Lmh/m;->e:Lnh/g;

    sget-object v14, Lnh/h;->c:Lnh/h;

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_14

    move v15, v5

    goto :goto_6

    :cond_14
    iget-object v15, v13, Lnh/h;->a:Ldt/b;

    invoke-static {v15, v11}, Lqh/d;->d(Ldt/b;Lnh/g;)I

    move-result v15

    :goto_6
    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_15

    move v13, v9

    goto :goto_7

    :cond_15
    iget-object v13, v13, Lnh/h;->b:Ldt/b;

    invoke-static {v13, v11}, Lqh/d;->d(Ldt/b;Lnh/g;)I

    move-result v13

    :goto_7
    div-int v14, v5, v15

    invoke-static {v14}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v14

    div-int v17, v9, v13

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v4

    move/from16 v17, v2

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-eqz v2, :cond_17

    if-ne v2, v3, :cond_16

    invoke-static {v14, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    goto :goto_8

    :cond_16
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_17
    invoke-static {v14, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    :goto_8
    if-ge v2, v3, :cond_18

    move v2, v3

    :cond_18
    iput v2, v6, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    int-to-double v4, v5

    move-wide/from16 v18, v4

    int-to-double v3, v2

    div-double v18, v18, v3

    move-wide/from16 v20, v3

    int-to-double v2, v9

    div-double v2, v2, v20

    int-to-double v4, v15

    int-to-double v14, v13

    div-double v4, v4, v18

    div-double v2, v14, v2

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    if-eqz v11, :cond_1a

    const/4 v14, 0x1

    if-ne v11, v14, :cond_19

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(DD)D

    move-result-wide v2

    goto :goto_9

    :cond_19
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1a
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v2

    :goto_9
    iget-boolean v4, v7, Lmh/m;->f:Z

    const-wide/high16 v18, 0x3ff0000000000000L    # 1.0

    if-eqz v4, :cond_1b

    cmpl-double v4, v2, v18

    if-lez v4, :cond_1b

    move-wide/from16 v2, v18

    :cond_1b
    cmpg-double v4, v2, v18

    if-nez v4, :cond_1c

    const/4 v4, 0x1

    goto :goto_a

    :cond_1c
    const/4 v4, 0x0

    :goto_a
    xor-int/lit8 v5, v4, 0x1

    iput-boolean v5, v6, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    if-nez v4, :cond_1d

    cmpl-double v4, v2, v18

    const v5, 0x7fffffff

    if-lez v4, :cond_1e

    int-to-double v14, v5

    div-double/2addr v14, v2

    invoke-static {v14, v15}, Le93/b;->W(D)I

    move-result v2

    iput v2, v6, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    iput v5, v6, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    :cond_1d
    :goto_b
    const/4 v2, 0x0

    goto :goto_d

    :cond_1e
    iput v5, v6, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    int-to-double v4, v5

    mul-double/2addr v4, v2

    invoke-static {v4, v5}, Le93/b;->W(D)I

    move-result v2

    iput v2, v6, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    goto :goto_b

    :goto_c
    iput v14, v6, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    const/4 v2, 0x0

    iput-boolean v2, v6, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    :goto_d
    :try_start_0
    new-instance v3, Lne3/i0;

    invoke-direct {v3, v10}, Lne3/i0;-><init>(Lne3/j0;)V

    const/4 v4, 0x0

    invoke-static {v3, v4, v6}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v10}, Lne3/j0;->close()V

    iget-object v4, v8, Ldh/b;->y:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Exception;

    if-nez v4, :cond_2b

    if-eqz v3, :cond_2a

    invoke-virtual {v12}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    iget v4, v4, Landroid/util/DisplayMetrics;->densityDpi:I

    invoke-virtual {v3, v4}, Landroid/graphics/Bitmap;->setDensity(I)V

    if-nez v17, :cond_1f

    if-lez v0, :cond_27

    :cond_1f
    new-instance v4, Landroid/graphics/Matrix;

    invoke-direct {v4}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    int-to-float v5, v5

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v5, v7

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    int-to-float v8, v8

    div-float/2addr v8, v7

    if-eqz v17, :cond_20

    const/high16 v7, -0x40800000    # -1.0f

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-virtual {v4, v7, v9, v5, v8}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    :cond_20
    if-lez v0, :cond_21

    int-to-float v7, v0

    invoke-virtual {v4, v7, v5, v8}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    :cond_21
    new-instance v5, Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    int-to-float v7, v7

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    int-to-float v8, v8

    const/4 v9, 0x0

    invoke-direct {v5, v9, v9, v7, v8}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {v4, v5}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    iget v7, v5, Landroid/graphics/RectF;->left:F

    cmpg-float v8, v7, v9

    if-nez v8, :cond_22

    iget v8, v5, Landroid/graphics/RectF;->top:F

    cmpg-float v8, v8, v9

    if-nez v8, :cond_22

    :goto_e
    const/16 v5, 0x5a

    goto :goto_f

    :cond_22
    neg-float v7, v7

    iget v5, v5, Landroid/graphics/RectF;->top:F

    neg-float v5, v5

    invoke-virtual {v4, v7, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    goto :goto_e

    :goto_f
    if-eq v0, v5, :cond_25

    const/16 v5, 0x10e

    if-ne v0, v5, :cond_23

    goto :goto_10

    :cond_23
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v7

    if-nez v7, :cond_24

    sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    :cond_24
    invoke-static {v0, v5, v7}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_11

    :cond_25
    :goto_10
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v7

    if-nez v7, :cond_26

    sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    :cond_26
    invoke-static {v0, v5, v7}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    :goto_11
    new-instance v5, Landroid/graphics/Canvas;

    invoke-direct {v5, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    sget-object v7, Ldh/n;->a:Landroid/graphics/Paint;

    invoke-virtual {v5, v3, v4, v7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    move-object v3, v0

    :cond_27
    new-instance v0, Ldh/h;

    invoke-virtual {v12}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    new-instance v5, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v5, v4, v3}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    iget v3, v6, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    const/4 v14, 0x1

    if-gt v3, v14, :cond_29

    iget-boolean v3, v6, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    if-eqz v3, :cond_28

    goto :goto_12

    :cond_28
    move v3, v2

    goto :goto_13

    :cond_29
    :goto_12
    move v3, v14

    :goto_13
    invoke-direct {v0, v5, v3}, Ldh/h;-><init>(Landroid/graphics/drawable/Drawable;Z)V

    return-object v0

    :cond_2a
    const-string v0, "BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it\'s not encoded as a valid image format."

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_2b
    throw v4

    :catchall_0
    move-exception v0

    move-object v2, v0

    :try_start_1
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {v10, v2}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_2c
    throw v11

    :cond_2d
    throw v11

    :pswitch_15
    iget-object v0, v1, La6/l0;->x:Ljava/lang/Object;

    check-cast v0, Ld0/f1;

    iget-object v2, v0, Ld0/f1;->F:Ld0/z1;

    if-eqz v2, :cond_2e

    iget-object v2, v2, Ld0/z1;->l:Lp1/f0;

    invoke-virtual {v2}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    goto :goto_14

    :cond_2e
    const-wide/16 v2, 0x0

    :goto_14
    iput-wide v2, v0, Ld0/f1;->G:J

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_16
    iget-object v0, v1, La6/l0;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    invoke-interface {v0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Ld0/f;->p(Lq83/j;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_17
    iget-object v0, v1, La6/l0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/remote/domain/response/growth/UserStraps;

    invoke-static {v0}, Lcom/whoop/data/repositories/UserStrapsRepository;->f(Lcom/whoop/data/remote/domain/response/growth/UserStraps;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_18
    iget-object v0, v1, La6/l0;->x:Ljava/lang/Object;

    check-cast v0, Lcoil/compose/AsyncImagePainter;

    iget-object v0, v0, Lcoil/compose/AsyncImagePainter;->R:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmh/j;

    return-object v0

    :pswitch_19
    iget-object v0, v1, La6/l0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    new-instance v2, Lb23/k;

    sget-object v3, Lb23/i;->c:Lb23/j;

    sget-object v4, Lb23/i;->d:Lb23/e;

    invoke-direct {v2, v0, v3, v4}, Lb23/k;-><init>(Ljava/lang/String;Lb23/j;Lb23/e;)V

    return-object v2

    :pswitch_1a
    iget-object v0, v1, La6/l0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/Callable;

    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_1b
    iget-object v0, v1, La6/l0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_1c
    iget-object v0, v1, La6/l0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    sget-object v2, La6/m0;->e:Ljava/lang/Object;

    monitor-enter v2

    :try_start_2
    sget-object v3, La6/m0;->d:Ljava/util/LinkedHashSet;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    monitor-exit v2

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :catchall_2
    move-exception v0

    monitor-exit v2

    throw v0

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
