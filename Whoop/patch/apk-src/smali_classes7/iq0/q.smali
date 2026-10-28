.class public final Liq0/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J7\u0010\n\u001a\u0004\u0018\u00010\u00012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\'\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Liq0/q;",
        "",
        "<init>",
        "()V",
        "",
        "url",
        "Ll83/k;",
        "header",
        "Lcom/whoop/data/local/prefs/PreferenceHelper;",
        "preferenceHelper",
        "b",
        "(Ljava/lang/String;Ll83/k;Lcom/whoop/data/local/prefs/PreferenceHelper;)Ljava/lang/Object;",
        "Landroid/graphics/Bitmap;",
        "bitmap",
        "Landroid/content/Context;",
        "context",
        "Ltr2/n;",
        "logger",
        "Landroid/net/Uri;",
        "a",
        "(Landroid/graphics/Bitmap;Landroid/content/Context;Ltr2/n;)Landroid/net/Uri;",
        "community_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Liq0/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Liq0/q;

    invoke-direct {v0}, Liq0/q;-><init>()V

    sput-object v0, Liq0/q;->a:Liq0/q;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Bitmap;Landroid/content/Context;Ltr2/n;)Landroid/net/Uri;
    .locals 4

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/io/File;

    invoke-virtual {p2}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object v1

    const-string v2, "images"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    new-instance v1, Ljava/io/File;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ".png"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v3, 0x64

    invoke-virtual {p1, v2, v3, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".provider"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1, v1}, Landroidx/core/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catchall_0
    move-exception p1

    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p2

    :try_start_4
    invoke-static {v0, p1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p2
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Exception occurred while getting the widget image uri: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [Lqr2/a$a;

    invoke-interface {p3, p1, p2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final b(Ljava/lang/String;Ll83/k;Lcom/whoop/data/local/prefs/PreferenceHelper;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ll83/k;",
            "Lcom/whoop/data/local/prefs/PreferenceHelper;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "preferenceHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    new-instance v1, Ldl/i;

    new-instance v2, Ldl/k;

    invoke-direct {v2}, Ldl/k;-><init>()V

    iget-object v3, p2, Ll83/k;->w:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object p2, p2, Ll83/k;->x:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {v2, v3, p2}, Ldl/k;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p2, Lcom/whoop/data/repositories/LanguageRepository;->Companion:Lcom/whoop/data/repositories/LanguageRepository$Companion;

    invoke-virtual {p2, p3, v0}, Lcom/whoop/data/repositories/LanguageRepository$Companion;->getAcceptLanguageHeaderValue(Lcom/whoop/data/local/prefs/PreferenceHelper;Lcom/whoop/data/repositories/DefaultLanguageDecider;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "Accept-Language"

    invoke-virtual {v2, p3, p2}, Ldl/k;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p2, 0x1

    iput-boolean p2, v2, Ldl/k;->a:Z

    new-instance p2, Ldl/m;

    iget-object p3, v2, Ldl/k;->b:Ljava/util/Map;

    invoke-direct {p2, p3}, Ldl/m;-><init>(Ljava/util/Map;)V

    invoke-direct {v1, p1, p2}, Ldl/i;-><init>(Ljava/lang/String;Ldl/j;)V

    return-object v1

    :cond_0
    return-object p1

    :cond_1
    return-object v0
.end method
