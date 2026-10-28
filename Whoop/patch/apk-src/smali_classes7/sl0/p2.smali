.class public abstract Lsl0/p2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a3\u0010\u0007\u001a\u00020\u00062\"\u0010\u0005\u001a\u001e\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lkotlin/Function2;",
        "",
        "Landroid/net/Uri;",
        "Lsl0/q2;",
        "Ll83/a0;",
        "onResult",
        "Lsl0/n2;",
        "h",
        "(Lc93/m;Landroidx/compose/runtime/Composer;I)Lsl0/n2;",
        "Landroid/content/Context;",
        "context",
        "Ljava/io/File;",
        "g",
        "(Landroid/content/Context;)Ljava/io/File;",
        "Ltr2/n;",
        "a",
        "Ltr2/n;",
        "logger",
        "bot_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "MediaPickerLauncher"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sput-object v0, Lsl0/p2;->a:Ltr2/n;

    return-void
.end method

.method public static synthetic a()Lp1/c1;
    .locals 1

    invoke-static {}, Lsl0/p2;->l()Lp1/c1;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Lp1/c1;Lc93/m;Landroid/content/Context;Lj/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lsl0/p2;->m(Lp1/c1;Lc93/m;Landroid/content/Context;Lj/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/c1;Lp1/c1;Landroid/content/Context;Lh/i;Lh/i;Z)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lsl0/p2;->n(Lp1/c1;Lp1/c1;Landroid/content/Context;Lh/i;Lh/i;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lp1/c1;Lc93/m;Landroid/content/Context;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lsl0/p2;->k(Lp1/c1;Lc93/m;Landroid/content/Context;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e()Lp1/c1;
    .locals 1

    invoke-static {}, Lsl0/p2;->j()Lp1/c1;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f(Lc93/m;Ljava/util/List;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lsl0/p2;->i(Lc93/m;Ljava/util/List;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Landroid/content/Context;)Ljava/io/File;
    .locals 3

    :try_start_0
    const-string v0, "camera_"

    const-string v1, ".jpg"

    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p0

    invoke-static {v0, v1, p0}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    sget-object v0, Lsl0/p2;->a:Ltr2/n;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to create temp file with exception: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p0, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static final h(Lc93/m;Landroidx/compose/runtime/Composer;I)Lsl0/n2;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/m;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Lsl0/n2;"
        }
    .end annotation

    const-string v0, "onResult"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    check-cast p1, Lp1/q;

    invoke-virtual {p1, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/content/Context;

    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$PickMultipleVisualMedia;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Landroidx/activity/result/contract/ActivityResultContracts$PickMultipleVisualMedia;-><init>(I)V

    and-int/lit8 v1, p2, 0xe

    xor-int/lit8 v1, v1, 0x6

    const/4 v2, 0x1

    const/4 v7, 0x0

    const/4 v3, 0x4

    if-le v1, v3, :cond_0

    invoke-virtual {p1, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    :cond_0
    and-int/lit8 v5, p2, 0x6

    if-ne v5, v3, :cond_2

    :cond_1
    move v5, v2

    goto :goto_0

    :cond_2
    move v5, v7

    :goto_0
    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-nez v5, :cond_3

    if-ne v6, v8, :cond_4

    :cond_3
    new-instance v6, Lsl0/f;

    const/4 v5, 0x1

    invoke-direct {v6, p0, v5}, Lsl0/f;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v6, p1, v7}, Lwb3/f;->a0(Lk/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lh/i;

    move-result-object v0

    new-array v5, v7, [Ljava/lang/Object;

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v8, :cond_5

    new-instance v6, Lsl0/a1;

    const/16 v9, 0xb

    invoke-direct {v6, v9}, Lsl0/a1;-><init>(I)V

    invoke-virtual {p1, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v6, Lc93/a;

    const/16 v9, 0x30

    invoke-static {v5, v6, p1, v9}, Ly1/k;->c([Ljava/lang/Object;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lp1/c1;

    new-instance v6, Landroidx/activity/result/contract/ActivityResultContracts$TakePicture;

    invoke-direct {v6}, Landroidx/activity/result/contract/ActivityResultContracts$TakePicture;-><init>()V

    invoke-virtual {p1, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {p1, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v10, v11

    if-le v1, v3, :cond_6

    invoke-virtual {p1, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_7

    :cond_6
    and-int/lit8 v11, p2, 0x6

    if-ne v11, v3, :cond_8

    :cond_7
    move v11, v2

    goto :goto_1

    :cond_8
    move v11, v7

    :goto_1
    or-int/2addr v10, v11

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_9

    if-ne v11, v8, :cond_a

    :cond_9
    new-instance v11, Lsl0/o2;

    const/4 v10, 0x0

    invoke-direct {v11, v5, p0, v4, v10}, Lsl0/o2;-><init>(Lp1/c1;Lc93/m;Landroid/content/Context;I)V

    invoke-virtual {p1, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v11, Lkotlin/jvm/functions/Function1;

    invoke-static {v6, v11, p1, v7}, Lwb3/f;->a0(Lk/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lh/i;

    move-result-object v6

    new-array v10, v7, [Ljava/lang/Object;

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v8, :cond_b

    new-instance v11, Lsl0/a1;

    const/16 v12, 0xc

    invoke-direct {v11, v12}, Lsl0/a1;-><init>(I)V

    invoke-virtual {p1, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v11, Lc93/a;

    invoke-static {v10, v11, p1, v9}, Ly1/k;->c([Ljava/lang/Object;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lp1/c1;

    new-instance v10, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;

    invoke-direct {v10}, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;-><init>()V

    invoke-virtual {p1, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    invoke-virtual {p1, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v11, v12

    if-le v1, v3, :cond_c

    invoke-virtual {p1, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    :cond_c
    and-int/lit8 p2, p2, 0x6

    if-ne p2, v3, :cond_d

    goto :goto_2

    :cond_d
    move v2, v7

    :cond_e
    :goto_2
    or-int p2, v11, v2

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez p2, :cond_f

    if-ne v1, v8, :cond_10

    :cond_f
    new-instance v1, Lsl0/o2;

    const/4 p2, 0x1

    invoke-direct {v1, v5, p0, v4, p2}, Lsl0/o2;-><init>(Lp1/c1;Lc93/m;Landroid/content/Context;I)V

    invoke-virtual {p1, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v10, v1, p1, v7}, Lwb3/f;->a0(Lk/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lh/i;

    move-result-object p0

    new-instance p2, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;

    invoke-direct {p2}, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;-><init>()V

    invoke-virtual {p1, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p1, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {p1, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {p1, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_12

    if-ne v2, v8, :cond_11

    goto :goto_3

    :cond_11
    move-object v5, p0

    move-object v1, v2

    move-object v2, v9

    goto :goto_4

    :cond_12
    :goto_3
    new-instance v1, Lpp2/d;

    move-object v3, v5

    move-object v2, v9

    move-object v5, p0

    invoke-direct/range {v1 .. v6}, Lpp2/d;-><init>(Lp1/c1;Lp1/c1;Landroid/content/Context;Lh/i;Lh/i;)V

    invoke-virtual {p1, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_4
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {p2, v1, p1, v7}, Lwb3/f;->a0(Lk/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lh/i;

    move-result-object p0

    invoke-virtual {p1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {p1, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p2, v1

    invoke-virtual {p1, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p2, v1

    invoke-virtual {p1, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p2, v1

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez p2, :cond_13

    if-ne v1, v8, :cond_14

    :cond_13
    new-instance v1, Lsl0/p2$a;

    invoke-direct {v1, v0, v2, p0}, Lsl0/p2$a;-><init>(Lh/i;Lp1/c1;Lh/i;)V

    invoke-virtual {p1, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v1, Lsl0/p2$a;

    return-object v1
.end method

.method private static final i(Lc93/m;Ljava/util/List;)Ll83/a0;
    .locals 1

    const-string v0, "uris"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lsl0/q2$c;->a:Lsl0/q2$c;

    invoke-interface {p0, p1, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j()Lp1/c1;
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    return-object v0
.end method

.method private static final k(Lp1/c1;Lc93/m;Landroid/content/Context;Z)Ll83/a0;
    .locals 2

    const/4 v0, 0x0

    if-eqz p3, :cond_2

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-eqz p0, :cond_0

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p3

    const-string v1, ".provider"

    invoke-static {p3, v1}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {p2, p3, v1}, Landroidx/core/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v0

    :goto_0
    if-eqz p0, :cond_1

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    :cond_1
    sget-object p0, Lsl0/q2$a;->a:Lsl0/q2$a;

    invoke-interface {p1, v0, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-eqz p2, :cond_3

    new-instance p3, Ljava/io/File;

    invoke-direct {p3, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3}, Ljava/io/File;->delete()Z

    :cond_3
    invoke-interface {p0, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    invoke-interface {p1, v0, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l()Lp1/c1;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    return-object v0
.end method

.method private static final m(Lp1/c1;Lc93/m;Landroid/content/Context;Lj/a;)Ll83/a0;
    .locals 2

    const-string v0, "result"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget p3, p3, Lj/a;->w:I

    const/4 v0, -0x1

    const/4 v1, 0x0

    if-ne p3, v0, :cond_2

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-eqz p0, :cond_0

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p3

    const-string v0, ".provider"

    invoke-static {p3, v0}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {p2, p3, v0}, Landroidx/core/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    :cond_1
    sget-object p0, Lsl0/q2$b;->a:Lsl0/q2$b;

    invoke-interface {p1, v1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-eqz p2, :cond_3

    new-instance p3, Ljava/io/File;

    invoke-direct {p3, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3}, Ljava/io/File;->delete()Z

    :cond_3
    invoke-interface {p0, v1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    invoke-interface {p1, v1, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lp1/c1;Lp1/c1;Landroid/content/Context;Lh/i;Lh/i;Z)Ll83/a0;
    .locals 0

    if-eqz p5, :cond_0

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ljava/lang/Boolean;

    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p5

    invoke-static {p1, p2, p3, p4, p5}, Lsl0/p2;->o(Lp1/c1;Landroid/content/Context;Lh/i;Lh/i;Z)V

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lp1/c1;Landroid/content/Context;Lh/i;Lh/i;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Landroid/content/Context;",
            "Lh/i;",
            "Lh/i;",
            "Z)V"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    :cond_0
    invoke-static {p1}, Lsl0/p2;->g(Landroid/content/Context;)Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ".provider"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0, v0}, Landroidx/core/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object p0

    const/4 p1, 0x0

    if-eqz p4, :cond_2

    new-instance p3, Landroid/content/Intent;

    const-string p4, "android.media.action.IMAGE_CAPTURE"

    invoke-direct {p3, p4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string p4, "output"

    invoke-virtual {p3, p4, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string p0, "android.intent.extra.USE_FRONT_CAMERA"

    const/4 p4, 0x1

    invoke-virtual {p3, p0, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string p0, "android.intent.extras.LENS_FACING_FRONT"

    invoke-virtual {p3, p0, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p0, "android.intent.extras.CAMERA_FACING"

    invoke-virtual {p3, p0, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p0, "com.google.assistant.extra.USE_FRONT_CAMERA"

    invoke-virtual {p3, p0, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string p0, "camerafacing"

    const-string p4, "front"

    invoke-virtual {p3, p0, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p0, "previous_mode"

    const-string p4, "Selfie"

    invoke-virtual {p3, p0, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p2, p3, p1}, Lh/i;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void

    :cond_2
    invoke-virtual {p3, p0, p1}, Lh/i;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void
.end method
