.class public final Lcom/bumptech/glide/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ComponentCallbacks2;


# static fields
.field public static volatile J:Lcom/bumptech/glide/b;

.field public static volatile K:Z


# instance fields
.field public final E:La3/l1;

.field public final F:Lal/g;

.field public final G:Lml/g;

.field public final H:Ljc/a;

.field public final I:Ljava/util/ArrayList;

.field public final w:Lzk/l;

.field public final x:Lal/b;

.field public final y:Lbl/e;

.field public final z:Lcom/bumptech/glide/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lzk/l;Lbl/e;Lal/b;Lal/g;Lml/g;Ljc/a;Lio/sentry/hints/j;La0/g;Ljava/util/List;)V
    .locals 37

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move-object/from16 v0, p4

    move-object/from16 v4, p5

    const-string v2, "Gif"

    const-class v5, Luk/a;

    const-string v6, "BitmapDrawable"

    const-class v7, Ljava/lang/String;

    const-class v8, Ljava/lang/Integer;

    const-string v9, "legacy_append"

    const-class v10, Lkl/b;

    const-class v11, [B

    const-class v12, Landroid/content/res/AssetFileDescriptor;

    const-class v13, Landroid/graphics/drawable/Drawable;

    const-class v14, Landroid/graphics/drawable/BitmapDrawable;

    const-string v15, "Bitmap"

    move-object/from16 v16, v11

    const-class v11, Ljava/io/File;

    move-object/from16 v17, v7

    const-class v7, Ljava/nio/ByteBuffer;

    move-object/from16 v18, v8

    const-class v8, Landroid/os/ParcelFileDescriptor;

    move-object/from16 v19, v11

    const-class v11, Landroid/graphics/Bitmap;

    move-object/from16 v20, v9

    const-class v9, Landroid/net/Uri;

    move-object/from16 v21, v9

    const-class v9, Ljava/io/InputStream;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    move-object/from16 v22, v13

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    iput-object v13, v1, Lcom/bumptech/glide/b;->I:Ljava/util/ArrayList;

    move-object/from16 v13, p2

    iput-object v13, v1, Lcom/bumptech/glide/b;->w:Lzk/l;

    iput-object v0, v1, Lcom/bumptech/glide/b;->x:Lal/b;

    iput-object v4, v1, Lcom/bumptech/glide/b;->F:Lal/g;

    move-object/from16 v13, p3

    iput-object v13, v1, Lcom/bumptech/glide/b;->y:Lbl/e;

    move-object/from16 v13, p6

    iput-object v13, v1, Lcom/bumptech/glide/b;->G:Lml/g;

    move-object/from16 v13, p7

    iput-object v13, v1, Lcom/bumptech/glide/b;->H:Ljc/a;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v13

    move-object/from16 v23, v5

    new-instance v5, La3/l1;

    invoke-direct {v5}, La3/l1;-><init>()V

    iput-object v5, v1, Lcom/bumptech/glide/b;->E:La3/l1;

    new-instance v1, Lgl/j;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    move-object/from16 v24, v2

    iget-object v2, v5, La3/l1;->h:Ljava/lang/Object;

    check-cast v2, Lij/n;

    monitor-enter v2

    move-object/from16 v25, v10

    :try_start_0
    iget-object v10, v2, Lij/n;->a:Ljava/util/ArrayList;

    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v2

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    new-instance v2, Lgl/q;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iget-object v10, v5, La3/l1;->h:Ljava/lang/Object;

    check-cast v10, Lij/n;

    monitor-enter v10

    move/from16 p3, v1

    :try_start_1
    iget-object v1, v10, Lij/n;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v10

    invoke-virtual {v5}, La3/l1;->h()Ljava/util/ArrayList;

    move-result-object v1

    new-instance v2, Lkl/a;

    invoke-direct {v2, v3, v1, v0, v4}, Lkl/a;-><init>(Landroid/content/Context;Ljava/util/ArrayList;Lal/b;Lal/g;)V

    new-instance v10, Lgl/b0;

    move-object/from16 p6, v1

    new-instance v1, Lqt/e;

    move-object/from16 p7, v2

    const/16 v2, 0x16

    invoke-direct {v1, v2}, Lqt/e;-><init>(I)V

    invoke-direct {v10, v0, v1}, Lgl/b0;-><init>(Lal/b;Lgl/a0;)V

    new-instance v1, Lgl/m;

    invoke-virtual {v5}, La3/l1;->h()Ljava/util/ArrayList;

    move-result-object v2

    move-object/from16 v26, v6

    invoke-virtual {v13}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v6

    invoke-direct {v1, v2, v6, v0, v4}, Lgl/m;-><init>(Ljava/util/ArrayList;Landroid/util/DisplayMetrics;Lal/b;Lal/g;)V

    new-instance v2, Lgl/e;

    const/4 v6, 0x0

    invoke-direct {v2, v1, v6}, Lgl/e;-><init>(Lgl/m;I)V

    new-instance v6, Lgl/a;

    move-object/from16 v27, v14

    const/4 v14, 0x2

    invoke-direct {v6, v14, v1, v4}, Lgl/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v14, Lil/c;

    invoke-direct {v14, v3}, Lil/c;-><init>(Landroid/content/Context;)V

    new-instance v3, Ldl/a0;

    move-object/from16 v28, v14

    const/4 v14, 0x2

    invoke-direct {v3, v13, v14}, Ldl/a0;-><init>(Landroid/content/res/Resources;I)V

    new-instance v14, Ldl/a0;

    move-object/from16 v29, v3

    const/4 v3, 0x3

    invoke-direct {v14, v13, v3}, Ldl/a0;-><init>(Landroid/content/res/Resources;I)V

    new-instance v3, Ldl/a0;

    move-object/from16 v30, v14

    const/4 v14, 0x1

    invoke-direct {v3, v13, v14}, Ldl/a0;-><init>(Landroid/content/res/Resources;I)V

    new-instance v14, Ldl/a0;

    move-object/from16 v31, v3

    const/4 v3, 0x0

    invoke-direct {v14, v13, v3}, Ldl/a0;-><init>(Landroid/content/res/Resources;I)V

    new-instance v3, Lgl/b;

    invoke-direct {v3, v4}, Lgl/b;-><init>(Lal/g;)V

    move-object/from16 v32, v14

    new-instance v14, Lbd3/v;

    move-object/from16 v33, v13

    const/4 v13, 0x6

    move-object/from16 v34, v3

    const/4 v3, 0x0

    invoke-direct {v14, v13, v3}, Lbd3/v;-><init>(IB)V

    new-instance v3, Lll/c;

    const/4 v13, 0x1

    invoke-direct {v3, v13}, Lll/c;-><init>(I)V

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v13

    move-object/from16 v35, v3

    new-instance v3, Ldl/e;

    move-object/from16 v36, v14

    const/4 v14, 0x0

    invoke-direct {v3, v14}, Ldl/e;-><init>(I)V

    invoke-virtual {v5, v7, v3}, La3/l1;->c(Ljava/lang/Class;Lwk/c;)V

    new-instance v3, Laj/d;

    invoke-direct {v3, v4}, Laj/d;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v5, v9, v3}, La3/l1;->c(Ljava/lang/Class;Lwk/c;)V

    invoke-virtual {v5, v15, v7, v11, v2}, La3/l1;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lwk/j;)V

    invoke-virtual {v5, v15, v9, v11, v6}, La3/l1;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lwk/j;)V

    new-instance v3, Lgl/e;

    const/4 v14, 0x1

    invoke-direct {v3, v1, v14}, Lgl/e;-><init>(Lgl/m;I)V

    invoke-virtual {v5, v15, v8, v11, v3}, La3/l1;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lwk/j;)V

    invoke-virtual {v5, v15, v8, v11, v10}, La3/l1;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lwk/j;)V

    new-instance v1, Lgl/b0;

    new-instance v3, Lio/sentry/hints/j;

    const/16 v14, 0x15

    invoke-direct {v3, v14}, Lio/sentry/hints/j;-><init>(I)V

    invoke-direct {v1, v0, v3}, Lgl/b0;-><init>(Lal/b;Lgl/a0;)V

    invoke-virtual {v5, v15, v12, v11, v1}, La3/l1;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lwk/j;)V

    sget-object v1, Ldl/c0;->b:Ldl/c0;

    invoke-virtual {v5, v11, v11, v1}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    new-instance v3, Lgl/y;

    const/4 v14, 0x0

    invoke-direct {v3, v14}, Lgl/y;-><init>(I)V

    invoke-virtual {v5, v15, v11, v11, v3}, La3/l1;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lwk/j;)V

    move-object/from16 v3, v34

    invoke-virtual {v5, v11, v3}, La3/l1;->d(Ljava/lang/Class;Lwk/k;)V

    new-instance v14, Lgl/a;

    move-object/from16 v34, v13

    move-object/from16 v13, v33

    invoke-direct {v14, v13, v2}, Lgl/a;-><init>(Landroid/content/res/Resources;Lwk/j;)V

    move-object/from16 v2, v26

    move-object/from16 v26, v12

    move-object/from16 v12, v27

    invoke-virtual {v5, v2, v7, v12, v14}, La3/l1;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lwk/j;)V

    new-instance v14, Lgl/a;

    invoke-direct {v14, v13, v6}, Lgl/a;-><init>(Landroid/content/res/Resources;Lwk/j;)V

    invoke-virtual {v5, v2, v9, v12, v14}, La3/l1;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lwk/j;)V

    new-instance v6, Lgl/a;

    invoke-direct {v6, v13, v10}, Lgl/a;-><init>(Landroid/content/res/Resources;Lwk/j;)V

    invoke-virtual {v5, v2, v8, v12, v6}, La3/l1;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lwk/j;)V

    new-instance v2, Lwe/o;

    invoke-direct {v2, v0, v3}, Lwe/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v5, v12, v2}, La3/l1;->d(Ljava/lang/Class;Lwk/k;)V

    new-instance v2, Lkl/i;

    move-object/from16 v3, p6

    move-object/from16 v6, p7

    invoke-direct {v2, v3, v6, v4}, Lkl/i;-><init>(Ljava/util/ArrayList;Lkl/a;Lal/g;)V

    move-object/from16 v3, v24

    move-object/from16 v10, v25

    invoke-virtual {v5, v3, v9, v10, v2}, La3/l1;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lwk/j;)V

    invoke-virtual {v5, v3, v7, v10, v6}, La3/l1;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lwk/j;)V

    new-instance v2, Ljc/b;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Ljc/b;-><init>(I)V

    invoke-virtual {v5, v10, v2}, La3/l1;->d(Ljava/lang/Class;Lwk/k;)V

    move-object/from16 v2, v23

    invoke-virtual {v5, v2, v2, v1}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    new-instance v3, Lil/c;

    invoke-direct {v3, v0}, Lil/c;-><init>(Lal/b;)V

    invoke-virtual {v5, v15, v2, v11, v3}, La3/l1;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lwk/j;)V

    move-object/from16 v2, v20

    move-object/from16 v6, v21

    move-object/from16 v3, v22

    move-object/from16 v14, v28

    invoke-virtual {v5, v2, v6, v3, v14}, La3/l1;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lwk/j;)V

    new-instance v15, Lgl/a;

    const/4 v10, 0x1

    invoke-direct {v15, v10, v14, v0}, Lgl/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v5, v2, v6, v11, v15}, La3/l1;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lwk/j;)V

    new-instance v10, Lhl/a;

    const/4 v14, 0x0

    invoke-direct {v10, v14}, Lhl/a;-><init>(I)V

    invoke-virtual {v5, v10}, La3/l1;->l(Lxk/f;)V

    new-instance v10, Ldl/c0;

    const/4 v14, 0x3

    invoke-direct {v10, v14}, Ldl/c0;-><init>(I)V

    move-object/from16 v14, v19

    invoke-virtual {v5, v14, v7, v10}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    new-instance v10, Ldl/h;

    new-instance v15, Ldl/e;

    const/4 v0, 0x3

    invoke-direct {v15, v0}, Ldl/e;-><init>(I)V

    invoke-direct {v10, v15}, Ldl/h;-><init>(Ldl/e;)V

    invoke-virtual {v5, v14, v9, v10}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    new-instance v0, Lgl/y;

    const/4 v10, 0x2

    invoke-direct {v0, v10}, Lgl/y;-><init>(I)V

    invoke-virtual {v5, v2, v14, v14, v0}, La3/l1;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lwk/j;)V

    new-instance v0, Ldl/h;

    new-instance v10, Ldl/e;

    const/4 v15, 0x2

    invoke-direct {v10, v15}, Ldl/e;-><init>(I)V

    invoke-direct {v0, v10}, Ldl/h;-><init>(Ldl/e;)V

    invoke-virtual {v5, v14, v8, v0}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    invoke-virtual {v5, v14, v14, v1}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    new-instance v0, Lxk/l;

    invoke-direct {v0, v4}, Lxk/l;-><init>(Lal/g;)V

    invoke-virtual {v5, v0}, La3/l1;->l(Lxk/f;)V

    new-instance v0, Lhl/a;

    const/4 v10, 0x2

    invoke-direct {v0, v10}, Lhl/a;-><init>(I)V

    invoke-virtual {v5, v0}, La3/l1;->l(Lxk/f;)V

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    move-object/from16 v10, v29

    invoke-virtual {v5, v0, v9, v10}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    move-object/from16 v15, v31

    invoke-virtual {v5, v0, v8, v15}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    move-object/from16 v4, v18

    invoke-virtual {v5, v4, v9, v10}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    invoke-virtual {v5, v4, v8, v15}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    move-object/from16 v10, v30

    invoke-virtual {v5, v4, v6, v10}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    move-object/from16 v18, v11

    move-object/from16 v15, v26

    move-object/from16 v11, v32

    invoke-virtual {v5, v0, v15, v11}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    invoke-virtual {v5, v4, v15, v11}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    invoke-virtual {v5, v0, v6, v10}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    new-instance v0, Lvk/b;

    const/4 v4, 0x1

    invoke-direct {v0, v4}, Lvk/b;-><init>(I)V

    move-object/from16 v4, v17

    invoke-virtual {v5, v4, v9, v0}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    new-instance v0, Lvk/b;

    const/4 v10, 0x1

    invoke-direct {v0, v10}, Lvk/b;-><init>(I)V

    invoke-virtual {v5, v6, v9, v0}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    new-instance v0, Ldl/c0;

    const/4 v10, 0x6

    invoke-direct {v0, v10}, Ldl/c0;-><init>(I)V

    invoke-virtual {v5, v4, v9, v0}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    new-instance v0, Ldl/c0;

    const/4 v10, 0x5

    invoke-direct {v0, v10}, Ldl/c0;-><init>(I)V

    invoke-virtual {v5, v4, v8, v0}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    new-instance v0, Ldl/c0;

    const/4 v10, 0x4

    invoke-direct {v0, v10}, Ldl/c0;-><init>(I)V

    invoke-virtual {v5, v4, v15, v0}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    new-instance v0, Lel/b;

    const/4 v4, 0x0

    invoke-direct {v0, v4}, Lel/b;-><init>(I)V

    invoke-virtual {v5, v6, v9, v0}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    new-instance v0, Ldl/a;

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v4

    const/4 v10, 0x1

    invoke-direct {v0, v4, v10}, Ldl/a;-><init>(Landroid/content/res/AssetManager;I)V

    invoke-virtual {v5, v6, v9, v0}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    new-instance v0, Ldl/a;

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v4

    const/4 v10, 0x0

    invoke-direct {v0, v4, v10}, Ldl/a;-><init>(Landroid/content/res/AssetManager;I)V

    invoke-virtual {v5, v6, v8, v0}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    new-instance v0, Ldl/n;

    const/4 v4, 0x1

    move-object/from16 v10, p1

    invoke-direct {v0, v10, v4}, Ldl/n;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v5, v6, v9, v0}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    new-instance v0, Ldl/n;

    const/4 v4, 0x2

    invoke-direct {v0, v10, v4}, Ldl/n;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v5, v6, v9, v0}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    const/16 v0, 0x1d

    move/from16 v4, p3

    if-lt v4, v0, :cond_0

    new-instance v0, Lel/d;

    invoke-direct {v0, v10, v9}, Lel/d;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v5, v6, v9, v0}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    new-instance v0, Lel/d;

    invoke-direct {v0, v10, v8}, Lel/d;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v5, v6, v8, v0}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    :cond_0
    new-instance v0, Ldl/e0;

    const/4 v4, 0x2

    move-object/from16 v11, v34

    invoke-direct {v0, v11, v4}, Ldl/e0;-><init>(Landroid/content/ContentResolver;I)V

    invoke-virtual {v5, v6, v9, v0}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    new-instance v0, Ldl/e0;

    const/4 v4, 0x1

    invoke-direct {v0, v11, v4}, Ldl/e0;-><init>(Landroid/content/ContentResolver;I)V

    invoke-virtual {v5, v6, v8, v0}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    new-instance v0, Ldl/e0;

    const/4 v4, 0x0

    invoke-direct {v0, v11, v4}, Ldl/e0;-><init>(Landroid/content/ContentResolver;I)V

    invoke-virtual {v5, v6, v15, v0}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    new-instance v0, Ldl/c0;

    const/4 v4, 0x7

    invoke-direct {v0, v4}, Ldl/c0;-><init>(I)V

    invoke-virtual {v5, v6, v9, v0}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    const-class v0, Ljava/net/URL;

    new-instance v4, Lel/b;

    const/4 v8, 0x1

    invoke-direct {v4, v8}, Lel/b;-><init>(I)V

    invoke-virtual {v5, v0, v9, v4}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    new-instance v0, Ldl/n;

    const/4 v4, 0x0

    invoke-direct {v0, v10, v4}, Ldl/n;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v5, v6, v14, v0}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    const-class v0, Ldl/i;

    new-instance v4, Lvk/b;

    const/4 v8, 0x2

    invoke-direct {v4, v8}, Lvk/b;-><init>(I)V

    invoke-virtual {v5, v0, v9, v4}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    new-instance v0, Ldl/c0;

    const/4 v4, 0x1

    invoke-direct {v0, v4}, Ldl/c0;-><init>(I)V

    move-object/from16 v4, v16

    invoke-virtual {v5, v4, v7, v0}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    new-instance v0, Ldl/c0;

    const/4 v7, 0x2

    invoke-direct {v0, v7}, Ldl/c0;-><init>(I)V

    invoke-virtual {v5, v4, v9, v0}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    invoke-virtual {v5, v6, v6, v1}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    invoke-virtual {v5, v3, v3, v1}, La3/l1;->b(Ljava/lang/Class;Ljava/lang/Class;Ldl/u;)V

    new-instance v0, Lgl/y;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lgl/y;-><init>(I)V

    invoke-virtual {v5, v2, v3, v3, v0}, La3/l1;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lwk/j;)V

    new-instance v0, Laj/c;

    const/16 v1, 0x14

    invoke-direct {v0, v13, v1}, Laj/c;-><init>(Ljava/lang/Object;I)V

    move-object/from16 v1, v18

    invoke-virtual {v5, v1, v12, v0}, La3/l1;->k(Ljava/lang/Class;Ljava/lang/Class;Lll/a;)V

    move-object/from16 v0, v36

    invoke-virtual {v5, v1, v4, v0}, La3/l1;->k(Ljava/lang/Class;Ljava/lang/Class;Lll/a;)V

    new-instance v2, La3/p;

    const/16 v6, 0x13

    move-object/from16 v7, p4

    move-object/from16 v8, v35

    invoke-direct {v2, v7, v0, v8, v6}, La3/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v5, v3, v4, v2}, La3/l1;->k(Ljava/lang/Class;Ljava/lang/Class;Lll/a;)V

    move-object/from16 v0, v25

    invoke-virtual {v5, v0, v4, v8}, La3/l1;->k(Ljava/lang/Class;Ljava/lang/Class;Lll/a;)V

    new-instance v0, Lgl/b0;

    new-instance v2, Lqt/e;

    const/16 v3, 0x15

    invoke-direct {v2, v3}, Lqt/e;-><init>(I)V

    invoke-direct {v0, v7, v2}, Lgl/b0;-><init>(Lal/b;Lgl/a0;)V

    const-class v2, Ljava/nio/ByteBuffer;

    const-string v3, "legacy_append"

    invoke-virtual {v5, v3, v2, v1, v0}, La3/l1;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lwk/j;)V

    new-instance v1, Lgl/a;

    invoke-direct {v1, v13, v0}, Lgl/a;-><init>(Landroid/content/res/Resources;Lwk/j;)V

    const-class v0, Ljava/nio/ByteBuffer;

    const-string v2, "legacy_append"

    invoke-virtual {v5, v2, v0, v12, v1}, La3/l1;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lwk/j;)V

    new-instance v6, Ljc/b;

    const/16 v0, 0x14

    invoke-direct {v6, v0}, Ljc/b;-><init>(I)V

    new-instance v2, Lcom/bumptech/glide/c;

    move-object/from16 v4, p5

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object/from16 v9, p10

    move-object v3, v10

    move-object/from16 v10, p2

    invoke-direct/range {v2 .. v10}, Lcom/bumptech/glide/c;-><init>(Landroid/content/Context;Lal/g;La3/l1;Ljc/b;Lio/sentry/hints/j;La0/g;Ljava/util/List;Lzk/l;)V

    move-object/from16 v1, p0

    iput-object v2, v1, Lcom/bumptech/glide/b;->z:Lcom/bumptech/glide/c;

    return-void

    :catchall_0
    move-exception v0

    move-object/from16 v1, p0

    :goto_0
    :try_start_2
    monitor-exit v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    :catchall_1
    move-exception v0

    goto :goto_0

    :catchall_2
    move-exception v0

    move-object/from16 v1, p0

    :goto_1
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    throw v0

    :catchall_3
    move-exception v0

    goto :goto_1
.end method

.method public static a(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V
    .locals 29

    sget-boolean v0, Lcom/bumptech/glide/b;->K:Z

    if-nez v0, :cond_13

    const/4 v0, 0x1

    sput-boolean v0, Lcom/bumptech/glide/b;->K:Z

    new-instance v10, La0/g;

    const/4 v12, 0x0

    invoke-direct {v10, v12}, La0/f1;-><init>(I)V

    new-instance v9, Lio/sentry/hints/j;

    const/16 v1, 0xd

    invoke-direct {v9, v1}, Lio/sentry/hints/j;-><init>(I)V

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    const-string v1, "Got app info metadata: "

    const-string v3, "ManifestParser"

    const/4 v4, 0x3

    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_0

    const-string v5, "Loading Glide modules"

    invoke-static {v3, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0x80

    invoke-virtual {v5, v6, v7}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v5

    iget-object v6, v5, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const/4 v7, 0x2

    if-nez v6, :cond_1

    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_5

    const-string v1, "Got null app info metadata"

    invoke-static {v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_1
    invoke-static {v3, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v6

    if-eqz v6, :cond_2

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v5, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    iget-object v1, v5, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    const-string v8, "GlideModule"

    iget-object v11, v5, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    invoke-virtual {v11, v6}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lj93/l0;->S(Ljava/lang/String;)Lcom/bumptech/glide/integration/okhttp3/OkHttpGlideModule;

    move-result-object v8

    invoke-virtual {v13, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v8

    if-eqz v8, :cond_3

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Loaded Glide module: "

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :cond_4
    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_5

    const-string v1, "Finished loading Glide modules"

    invoke-static {v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_5
    :goto_1
    const-string v1, "Glide"

    if-eqz p1, :cond_8

    invoke-virtual/range {p1 .. p1}, Lcom/bumptech/glide/GeneratedAppGlideModule;->W()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_8

    invoke-virtual/range {p1 .. p1}, Lcom/bumptech/glide/GeneratedAppGlideModule;->W()Ljava/util/Set;

    move-result-object v3

    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/bumptech/glide/integration/okhttp3/OkHttpGlideModule;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-interface {v3, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    goto :goto_2

    :cond_6
    invoke-static {v1, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v8

    if-eqz v8, :cond_7

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v11, "AppGlideModule excludes manifest GlideModule: "

    invoke-direct {v8, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    invoke-interface {v5}, Ljava/util/Iterator;->remove()V

    goto :goto_2

    :cond_8
    invoke-static {v1, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/bumptech/glide/integration/okhttp3/OkHttpGlideModule;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Discovered GlideModule from manifest: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3

    :cond_9
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/bumptech/glide/integration/okhttp3/OkHttpGlideModule;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_4

    :cond_a
    sget v1, Lcl/b;->y:I

    const/4 v3, 0x4

    if-nez v1, :cond_b

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v1

    invoke-static {v3, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    sput v1, Lcl/b;->y:I

    :cond_b
    sget v15, Lcl/b;->y:I

    const-string v1, "source"

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_12

    new-instance v14, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v21, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v20, Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-direct/range {v20 .. v20}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    new-instance v4, Lcl/a;

    invoke-direct {v4, v1, v12}, Lcl/a;-><init>(Ljava/lang/String;Z)V

    const-wide/16 v17, 0x0

    move/from16 v16, v15

    move-object/from16 v19, v21

    move-object/from16 v21, v4

    invoke-direct/range {v14 .. v21}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    move-object/from16 v21, v19

    new-instance v1, Lcl/b;

    invoke-direct {v1, v14}, Lcl/b;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    const-string v4, "disk-cache"

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_11

    new-instance v16, Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v22, Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-direct/range {v22 .. v22}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    new-instance v5, Lcl/a;

    const/4 v6, 0x1

    invoke-direct {v5, v4, v6}, Lcl/a;-><init>(Ljava/lang/String;Z)V

    const-wide/16 v19, 0x0

    move/from16 v18, v6

    move-object/from16 v23, v5

    move/from16 v17, v6

    invoke-direct/range {v16 .. v23}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    move-object/from16 v4, v16

    new-instance v5, Lcl/b;

    invoke-direct {v5, v4}, Lcl/b;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    sget v4, Lcl/b;->y:I

    if-nez v4, :cond_c

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    sput v4, Lcl/b;->y:I

    :cond_c
    sget v4, Lcl/b;->y:I

    if-lt v4, v3, :cond_d

    move/from16 v17, v7

    goto :goto_5

    :cond_d
    move/from16 v17, v0

    :goto_5
    const-string v3, "animation"

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_10

    new-instance v16, Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v22, Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-direct/range {v22 .. v22}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    new-instance v4, Lcl/a;

    invoke-direct {v4, v3, v0}, Lcl/a;-><init>(Ljava/lang/String;Z)V

    const-wide/16 v19, 0x0

    move/from16 v18, v17

    move-object/from16 v23, v4

    invoke-direct/range {v16 .. v23}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    move-object/from16 v0, v16

    new-instance v3, Lcl/b;

    invoke-direct {v3, v0}, Lcl/b;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    new-instance v0, Lbl/f;

    invoke-direct {v0, v2}, Lbl/f;-><init>(Landroid/content/Context;)V

    new-instance v4, Lbl/g;

    invoke-direct {v4, v0}, Lbl/g;-><init>(Lbl/f;)V

    new-instance v8, Ljc/a;

    const/16 v0, 0x9

    invoke-direct {v8, v0}, Ljc/a;-><init>(I)V

    iget v0, v4, Lbl/g;->a:I

    if-lez v0, :cond_e

    new-instance v6, Lal/h;

    int-to-long v14, v0

    invoke-direct {v6, v14, v15}, Lal/h;-><init>(J)V

    goto :goto_6

    :cond_e
    new-instance v6, Lu00/e;

    const/4 v0, 0x5

    invoke-direct {v6, v0}, Lu00/e;-><init>(I)V

    :goto_6
    new-instance v0, Lal/g;

    iget v7, v4, Lbl/g;->c:I

    invoke-direct {v0, v7}, Lal/g;-><init>(I)V

    new-instance v7, Lbl/e;

    iget v4, v4, Lbl/g;->b:I

    int-to-long v14, v4

    invoke-direct {v7, v14, v15}, Ltl/h;-><init>(J)V

    new-instance v4, Lad3/z;

    invoke-direct {v4, v2}, Lad3/z;-><init>(Landroid/content/Context;)V

    new-instance v11, Lzk/l;

    new-instance v14, Lcl/b;

    new-instance v16, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-wide v19, Lcl/b;->x:J

    new-instance v22, Ljava/util/concurrent/SynchronousQueue;

    invoke-direct/range {v22 .. v22}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    new-instance v15, Lcl/a;

    move-object/from16 p0, v0

    const-string v0, "source-unlimited"

    invoke-direct {v15, v0, v12}, Lcl/a;-><init>(Ljava/lang/String;Z)V

    const/16 v17, 0x0

    const v18, 0x7fffffff

    move-object/from16 v23, v15

    invoke-direct/range {v16 .. v23}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    move-object/from16 v0, v16

    invoke-direct {v14, v0}, Lcl/b;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    move-object/from16 v26, v1

    move-object/from16 v28, v3

    move-object/from16 v24, v4

    move-object/from16 v25, v5

    move-object/from16 v23, v7

    move-object/from16 v22, v11

    move-object/from16 v27, v14

    invoke-direct/range {v22 .. v28}, Lzk/l;-><init>(Lbl/e;Lad3/z;Lcl/b;Lcl/b;Lcl/b;Lcl/b;)V

    move-object/from16 v3, v22

    move-object/from16 v4, v23

    sget-object v11, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    new-instance v7, Lml/g;

    invoke-direct {v7}, Lml/g;-><init>()V

    new-instance v1, Lcom/bumptech/glide/b;

    move-object v5, v6

    move-object/from16 v6, p0

    invoke-direct/range {v1 .. v11}, Lcom/bumptech/glide/b;-><init>(Landroid/content/Context;Lzk/l;Lbl/e;Lal/b;Lal/g;Lml/g;Ljc/a;Lio/sentry/hints/j;La0/g;Ljava/util/List;)V

    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/bumptech/glide/integration/okhttp3/OkHttpGlideModule;

    :try_start_1
    iget-object v4, v1, Lcom/bumptech/glide/b;->E:La3/l1;

    invoke-virtual {v3, v4}, Lcom/bumptech/glide/integration/okhttp3/OkHttpGlideModule;->a(La3/l1;)V
    :try_end_1
    .catch Ljava/lang/AbstractMethodError; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_7

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you\'re using Glide v4. You\'ll need to find and remove (or update) the offending dependency. The v3 module name is: "

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_f
    invoke-virtual {v2, v1}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    sput-object v1, Lcom/bumptech/glide/b;->J:Lcom/bumptech/glide/b;

    sput-boolean v12, Lcom/bumptech/glide/b;->K:Z

    return-void

    :cond_10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Name must be non-null and non-empty, but given: animation"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Name must be non-null and non-empty, but given: disk-cache"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Name must be non-null and non-empty, but given: source"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_1
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Unable to find metadata to parse GlideModules"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_13
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static c(Landroid/content/Context;)Lcom/bumptech/glide/b;
    .locals 4

    sget-object v0, Lcom/bumptech/glide/b;->J:Lcom/bumptech/glide/b;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "Glide"

    :try_start_0
    const-string v2, "com.bumptech.glide.GeneratedAppGlideModuleImpl"

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const-class v3, Landroid/content/Context;

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/GeneratedAppGlideModule;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_2
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_3
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_4
    const/4 v0, 0x5

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-class v1, Lcom/bumptech/glide/b;

    monitor-enter v1

    :try_start_1
    sget-object v2, Lcom/bumptech/glide/b;->J:Lcom/bumptech/glide/b;

    if-nez v2, :cond_1

    invoke-static {p0, v0}, Lcom/bumptech/glide/b;->a(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_1
    :goto_1
    monitor-exit v1

    goto :goto_3

    :goto_2
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    :cond_2
    :goto_3
    sget-object p0, Lcom/bumptech/glide/b;->J:Lcom/bumptech/glide/b;

    return-object p0
.end method

.method public static d(Landroid/content/Context;)Lml/g;
    .locals 1

    const-string v0, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed)."

    invoke-static {p0, v0}, Lpf/c;->p(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/bumptech/glide/b;->c(Landroid/content/Context;)Lcom/bumptech/glide/b;

    move-result-object p0

    iget-object p0, p0, Lcom/bumptech/glide/b;->G:Lml/g;

    return-object p0
.end method

.method public static e(Landroid/content/Context;)Lcom/bumptech/glide/h;
    .locals 1

    invoke-static {p0}, Lcom/bumptech/glide/b;->d(Landroid/content/Context;)Lml/g;

    move-result-object v0

    invoke-virtual {v0, p0}, Lml/g;->f(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/view/View;)Lcom/bumptech/glide/h;
    .locals 6

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/b;->d(Landroid/content/Context;)Lml/g;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ltl/l;->g()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {v0, p0}, Lml/g;->f(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "Unable to obtain a request manager for a view without a Context"

    invoke-static {v1, v2}, Lpf/c;->p(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lml/g;->a(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {v0, p0}, Lml/g;->f(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object p0

    return-object p0

    :cond_1
    instance-of v2, v1, Landroidx/fragment/app/r0;

    const v3, 0x1020002

    const/4 v4, 0x0

    if-eqz v2, :cond_5

    check-cast v1, Landroidx/fragment/app/r0;

    iget-object v2, v0, Lml/g;->F:La0/g;

    invoke-virtual {v2}, La0/f1;->clear()V

    invoke-virtual {v1}, Landroidx/fragment/app/r0;->getSupportFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v5

    iget-object v5, v5, Landroidx/fragment/app/o1;->c:Landroidx/fragment/app/a2;

    invoke-virtual {v5}, Landroidx/fragment/app/a2;->f()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v5, v2}, Lml/g;->c(Ljava/util/List;Ljava/util/Map;)V

    invoke-virtual {v1, v3}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    :goto_0
    invoke-virtual {p0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    invoke-virtual {v2, p0}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/m0;

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v5

    instance-of v5, v5, Landroid/view/View;

    if-eqz v5, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    check-cast p0, Landroid/view/View;

    goto :goto_0

    :cond_3
    :goto_1
    invoke-virtual {v2}, La0/f1;->clear()V

    if-eqz v4, :cond_4

    invoke-virtual {v0, v4}, Lml/g;->g(Landroidx/fragment/app/m0;)Lcom/bumptech/glide/h;

    move-result-object p0

    return-object p0

    :cond_4
    invoke-virtual {v0, v1}, Lml/g;->h(Landroidx/fragment/app/r0;)Lcom/bumptech/glide/h;

    move-result-object p0

    return-object p0

    :cond_5
    iget-object v2, v0, Lml/g;->G:La0/g;

    invoke-virtual {v2}, La0/f1;->clear()V

    invoke-virtual {v1}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v5

    invoke-static {v5, v2}, Lml/g;->b(Landroid/app/FragmentManager;La0/g;)V

    invoke-virtual {v1, v3}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    :goto_2
    invoke-virtual {p0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    invoke-virtual {v2, p0}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/app/Fragment;

    if-eqz v4, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v5

    instance-of v5, v5, Landroid/view/View;

    if-eqz v5, :cond_7

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    check-cast p0, Landroid/view/View;

    goto :goto_2

    :cond_7
    :goto_3
    invoke-virtual {v2}, La0/f1;->clear()V

    if-nez v4, :cond_8

    invoke-virtual {v0, v1}, Lml/g;->e(Landroid/app/Activity;)Lcom/bumptech/glide/h;

    move-result-object p0

    return-object p0

    :cond_8
    invoke-virtual {v4}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object p0

    if-eqz p0, :cond_a

    invoke-static {}, Ltl/l;->g()Z

    move-result p0

    if-nez p0, :cond_9

    invoke-virtual {v4}, Landroid/app/Fragment;->getChildFragmentManager()Landroid/app/FragmentManager;

    move-result-object p0

    invoke-virtual {v4}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v4}, Landroid/app/Fragment;->isVisible()Z

    move-result v2

    invoke-virtual {v0, v1, p0, v4, v2}, Lml/g;->d(Landroid/app/Activity;Landroid/app/FragmentManager;Landroid/app/Fragment;Z)Lcom/bumptech/glide/h;

    move-result-object p0

    return-object p0

    :cond_9
    invoke-virtual {v4}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {v0, p0}, Lml/g;->f(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object p0

    return-object p0

    :cond_a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "You cannot start a load on a fragment before it is attached"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final b()V
    .locals 3

    sget-object v0, Ltl/l;->a:[C

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/b;->y:Lbl/e;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Ltl/h;->e(J)V

    iget-object v0, p0, Lcom/bumptech/glide/b;->x:Lal/b;

    invoke-interface {v0}, Lal/b;->b()V

    iget-object v0, p0, Lcom/bumptech/glide/b;->F:Lal/g;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v0, v1}, Lal/g;->b(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "You must call this method on the main thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    return-void
.end method

.method public final onLowMemory()V
    .locals 0

    invoke-virtual {p0}, Lcom/bumptech/glide/b;->b()V

    return-void
.end method

.method public final onTrimMemory(I)V
    .locals 8

    sget-object v0, Ltl/l;->a:[C

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_7

    iget-object v0, p0, Lcom/bumptech/glide/b;->I:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bumptech/glide/h;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/b;->y:Lbl/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v1, 0xf

    const/16 v2, 0x14

    const/16 v3, 0x28

    if-lt p1, v3, :cond_1

    const-wide/16 v4, 0x0

    invoke-virtual {v0, v4, v5}, Ltl/h;->e(J)V

    goto :goto_1

    :cond_1
    if-ge p1, v2, :cond_2

    if-ne p1, v1, :cond_3

    :cond_2
    monitor-enter v0

    :try_start_0
    iget-wide v4, v0, Ltl/h;->b:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v0

    const-wide/16 v6, 0x2

    div-long/2addr v4, v6

    invoke-virtual {v0, v4, v5}, Ltl/h;->e(J)V

    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/bumptech/glide/b;->x:Lal/b;

    invoke-interface {v0, p1}, Lal/b;->a(I)V

    iget-object v4, p0, Lcom/bumptech/glide/b;->F:Lal/g;

    monitor-enter v4

    if-lt p1, v3, :cond_4

    :try_start_1
    monitor-enter v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 p1, 0x0

    :try_start_2
    invoke-virtual {v4, p1}, Lal/g;->b(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_0
    move-exception p1

    :try_start_4
    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw p1

    :cond_4
    if-ge p1, v2, :cond_5

    if-ne p1, v1, :cond_6

    :cond_5
    iget p1, v4, Lal/g;->e:I

    div-int/lit8 p1, p1, 0x2

    invoke-virtual {v4, p1}, Lal/g;->b(I)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :cond_6
    :goto_2
    monitor-exit v4

    return-void

    :catchall_1
    move-exception p1

    :try_start_6
    monitor-exit v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw p1

    :catchall_2
    move-exception p1

    :try_start_7
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "You must call this method on the main thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
