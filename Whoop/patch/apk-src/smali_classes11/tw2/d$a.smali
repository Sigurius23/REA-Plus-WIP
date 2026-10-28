.class final Ltw2/d$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltw2/d;->a(Ljava/lang/String;Ltw2/b;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "",
        "<anonymous>",
        "(Lbc3/c0;)[B"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.whoopaction.domain.media.UploadMediaPreparerImpl$prepare$2"
    f = "UploadMediaPreparerImpl.kt"
    l = {
        0x2d,
        0x30
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:I

.field H:I

.field private synthetic I:Ljava/lang/Object;

.field final synthetic J:Ljava/lang/String;

.field final synthetic K:Ltw2/b;

.field final synthetic L:Ltw2/d;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ltw2/b;Ltw2/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ltw2/b;",
            "Ltw2/d;",
            "Lq83/d<",
            "-",
            "Ltw2/d$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ltw2/d$a;->J:Ljava/lang/String;

    iput-object p2, p0, Ltw2/d$a;->K:Ltw2/b;

    iput-object p3, p0, Ltw2/d$a;->L:Ltw2/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Ltw2/d$a;

    iget-object v1, p0, Ltw2/d$a;->J:Ljava/lang/String;

    iget-object v2, p0, Ltw2/d$a;->K:Ltw2/b;

    iget-object v3, p0, Ltw2/d$a;->L:Ltw2/d;

    invoke-direct {v0, v1, v2, v3, p2}, Ltw2/d$a;-><init>(Ljava/lang/String;Ltw2/b;Ltw2/d;Lq83/d;)V

    iput-object p1, v0, Ltw2/d$a;->I:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-[B>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Ltw2/d$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ltw2/d$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ltw2/d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ltw2/d$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    const-string v0, "Could not bring the picked file under "

    iget-object v1, p0, Ltw2/d$a;->I:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Ltw2/d$a;->H:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v3, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v2, p0, Ltw2/d$a;->F:Ljava/lang/Object;

    check-cast v2, Landroid/graphics/Bitmap;

    iget-object v3, p0, Ltw2/d$a;->E:Ljava/lang/Object;

    check-cast v3, Landroid/graphics/Bitmap;

    iget-object v4, p0, Ltw2/d$a;->z:Ljava/lang/Object;

    check-cast v4, Landroid/graphics/Bitmap;

    iget-object v5, p0, Ltw2/d$a;->y:Ljava/lang/Object;

    check-cast v5, Ljava/io/InputStream;

    iget-object v5, p0, Ltw2/d$a;->x:Ljava/lang/Object;

    check-cast v5, Landroid/graphics/BitmapFactory$Options;

    iget-object v5, p0, Ltw2/d$a;->w:Ljava/lang/Object;

    check-cast v5, Landroid/net/Uri;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_6

    :catchall_0
    move-exception p1

    goto/16 :goto_7

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget v3, p0, Ltw2/d$a;->G:I

    iget-object v5, p0, Ltw2/d$a;->E:Ljava/lang/Object;

    check-cast v5, Landroid/graphics/Bitmap;

    iget-object v8, p0, Ltw2/d$a;->z:Ljava/lang/Object;

    check-cast v8, Landroid/graphics/Bitmap;

    iget-object v9, p0, Ltw2/d$a;->y:Ljava/lang/Object;

    check-cast v9, Ljava/io/InputStream;

    iget-object v9, p0, Ltw2/d$a;->x:Ljava/lang/Object;

    check-cast v9, Landroid/graphics/BitmapFactory$Options;

    iget-object v9, p0, Ltw2/d$a;->w:Ljava/lang/Object;

    check-cast v9, Landroid/net/Uri;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v11, v5

    move v5, v3

    move-object v3, v11

    goto/16 :goto_3

    :catchall_1
    move-exception p1

    move-object v3, v5

    :goto_0
    move-object v2, v7

    :goto_1
    move-object v4, v8

    goto/16 :goto_7

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ltw2/d$a;->J:Ljava/lang/String;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iget-object v3, p0, Ltw2/d$a;->K:Ltw2/b;

    invoke-virtual {v3}, Ltw2/b;->b()I

    move-result v3

    :try_start_2
    new-instance v8, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v8}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    iget-object v9, p0, Ltw2/d$a;->L:Ltw2/d;

    invoke-static {v9, p1, v3}, Ltw2/d;->g(Ltw2/d;Landroid/net/Uri;I)I

    move-result v9

    iput v9, v8, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    iget-object v9, p0, Ltw2/d$a;->L:Ltw2/d;

    invoke-static {v9}, Ltw2/d;->e(Ltw2/d;)Landroid/content/Context;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v9

    invoke-virtual {v9, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v9

    if-nez v9, :cond_3

    iget-object p1, p0, Ltw2/d$a;->L:Ltw2/d;

    invoke-static {p1}, Ltw2/d;->f(Ltw2/d;)Ltr2/n;

    move-result-object p1

    const-string v0, "The picked file could not be opened"

    new-array v2, v6, [Lqr2/a$a;

    invoke-interface {p1, v0, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object v7

    :catch_0
    move-exception p1

    goto/16 :goto_8

    :cond_3
    :try_start_3
    invoke-static {v9, v7, v8}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_6

    :try_start_4
    invoke-interface {v9}, Ljava/io/Closeable;->close()V

    if-nez v8, :cond_4

    iget-object p1, p0, Ltw2/d$a;->L:Ltw2/d;

    invoke-static {p1}, Ltw2/d;->f(Ltw2/d;)Ltr2/n;

    move-result-object p1

    const-string v0, "The picked file is not a decodable image"

    new-array v2, v6, [Lqr2/a$a;

    invoke-interface {p1, v0, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    return-object v7

    :cond_4
    :try_start_5
    iget-object v9, p0, Ltw2/d$a;->L:Ltw2/d;

    invoke-static {v9, v8, v3}, Ltw2/d;->h(Ltw2/d;Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v9
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    if-eq v9, v8, :cond_5

    :try_start_6
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_2

    :catchall_2
    move-exception p1

    move-object v2, v7

    move-object v4, v8

    move-object v3, v9

    goto/16 :goto_7

    :cond_5
    :goto_2
    iget-object v10, p0, Ltw2/d$a;->L:Ltw2/d;

    iput-object v1, p0, Ltw2/d$a;->I:Ljava/lang/Object;

    iput-object v7, p0, Ltw2/d$a;->w:Ljava/lang/Object;

    iput-object v7, p0, Ltw2/d$a;->x:Ljava/lang/Object;

    iput-object v7, p0, Ltw2/d$a;->y:Ljava/lang/Object;

    iput-object v8, p0, Ltw2/d$a;->z:Ljava/lang/Object;

    iput-object v9, p0, Ltw2/d$a;->E:Ljava/lang/Object;

    iput v3, p0, Ltw2/d$a;->G:I

    iput v5, p0, Ltw2/d$a;->H:I

    invoke-static {v10, v9, p1, p0}, Ltw2/d;->c(Ltw2/d;Landroid/graphics/Bitmap;Landroid/net/Uri;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    if-ne p1, v2, :cond_6

    goto :goto_5

    :cond_6
    move v5, v3

    move-object v3, v9

    :goto_3
    :try_start_7
    check-cast p1, Landroid/graphics/Bitmap;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    if-eq p1, v3, :cond_7

    :try_start_8
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_4

    :catchall_3
    move-exception v0

    move-object v2, p1

    move-object p1, v0

    goto/16 :goto_1

    :cond_7
    :goto_4
    iget-object v9, p0, Ltw2/d$a;->L:Ltw2/d;

    iget-object v10, p0, Ltw2/d$a;->K:Ltw2/b;

    invoke-virtual {v10}, Ltw2/b;->a()Ljava/lang/Long;

    move-result-object v10

    iput-object v1, p0, Ltw2/d$a;->I:Ljava/lang/Object;

    iput-object v7, p0, Ltw2/d$a;->w:Ljava/lang/Object;

    iput-object v7, p0, Ltw2/d$a;->x:Ljava/lang/Object;

    iput-object v7, p0, Ltw2/d$a;->y:Ljava/lang/Object;

    iput-object v8, p0, Ltw2/d$a;->z:Ljava/lang/Object;

    iput-object v3, p0, Ltw2/d$a;->E:Ljava/lang/Object;

    iput-object p1, p0, Ltw2/d$a;->F:Ljava/lang/Object;

    iput v5, p0, Ltw2/d$a;->G:I

    iput v4, p0, Ltw2/d$a;->H:I

    invoke-static {v9, p1, v10, p0}, Ltw2/d;->d(Ltw2/d;Landroid/graphics/Bitmap;Ljava/lang/Long;Lq83/d;)Ljava/lang/Object;

    move-result-object v4
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    if-ne v4, v2, :cond_8

    :goto_5
    return-object v2

    :cond_8
    move-object v2, p1

    move-object p1, v4

    move-object v4, v8

    :goto_6
    :try_start_9
    check-cast p1, [B

    if-nez p1, :cond_9

    iget-object v5, p0, Ltw2/d$a;->L:Ltw2/d;

    invoke-static {v5}, Ltw2/d;->f(Ltw2/d;)Ltr2/n;

    move-result-object v5

    iget-object v8, p0, Ltw2/d$a;->K:Ltw2/b;

    invoke-virtual {v8}, Ltw2/b;->a()Ljava/lang/Long;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " base64 bytes"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v8, v6, [Lqr2/a$a;

    invoke-interface {v5, v0, v8}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :cond_9
    :try_start_a
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    if-eqz v3, :cond_a

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    :cond_a
    if-eqz v2, :cond_b

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    :cond_b
    return-object p1

    :catchall_4
    move-exception p1

    goto/16 :goto_0

    :catchall_5
    move-exception p1

    move-object v2, v7

    move-object v3, v2

    goto/16 :goto_1

    :goto_7
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    if-eqz v3, :cond_c

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    :cond_c
    if-eqz v2, :cond_d

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    :cond_d
    throw p1
    :try_end_a
    .catch Ljava/lang/OutOfMemoryError; {:try_start_a .. :try_end_a} :catch_3
    .catch Ljava/io/FileNotFoundException; {:try_start_a .. :try_end_a} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_a .. :try_end_a} :catch_1
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0

    :catchall_6
    move-exception p1

    :try_start_b
    throw p1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    :catchall_7
    move-exception v0

    :try_start_c
    invoke-static {v9, p1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
    :try_end_c
    .catch Ljava/lang/OutOfMemoryError; {:try_start_c .. :try_end_c} :catch_3
    .catch Ljava/io/FileNotFoundException; {:try_start_c .. :try_end_c} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_c .. :try_end_c} :catch_1
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_0

    :goto_8
    invoke-interface {v1}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->o(Lq83/j;)V

    iget-object v0, p0, Ltw2/d$a;->L:Ltw2/d;

    invoke-static {v0}, Ltw2/d;->f(Ltw2/d;)Ltr2/n;

    move-result-object v0

    const-string v1, "Could not prepare the picked file for upload"

    new-array v2, v6, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_9

    :catch_1
    iget-object p1, p0, Ltw2/d$a;->L:Ltw2/d;

    invoke-static {p1}, Ltw2/d;->f(Ltw2/d;)Ltr2/n;

    move-result-object p1

    const-string v0, "Not permitted to read the picked file"

    new-array v1, v6, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_9

    :catch_2
    iget-object p1, p0, Ltw2/d$a;->L:Ltw2/d;

    invoke-static {p1}, Ltw2/d;->f(Ltw2/d;)Ltr2/n;

    move-result-object p1

    const-string v0, "The picked file could not be found"

    new-array v1, v6, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_9

    :catch_3
    iget-object p1, p0, Ltw2/d$a;->L:Ltw2/d;

    invoke-static {p1}, Ltw2/d;->f(Ltw2/d;)Ltr2/n;

    move-result-object p1

    const-string v0, "Ran out of memory preparing the picked file"

    new-array v1, v6, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_9
    return-object v7
.end method
