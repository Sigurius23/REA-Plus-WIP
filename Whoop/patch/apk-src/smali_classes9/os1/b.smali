.class public final Los1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Los1/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0013BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0018\u0010\n\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0012\u0010\u0011R\u001a\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\"\u0010\u001a\u001a\u0010\u0012\u000c\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\u000c\u0012\n \u0017*\u0004\u0018\u00010\u000c0\u000c0\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u0019\u00a8\u0006\u001e"
    }
    d2 = {
        "Los1/b;",
        "",
        "Landroidx/fragment/app/m0;",
        "fragment",
        "Lkotlin/Function1;",
        "Lj/a;",
        "Ll83/a0;",
        "onFilesSelected",
        "",
        "Landroid/net/Uri;",
        "onImagesSelected",
        "",
        "",
        "mimeTypes",
        "<init>",
        "(Landroidx/fragment/app/m0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;[Ljava/lang/String;)V",
        "e",
        "()V",
        "f",
        "a",
        "[Ljava/lang/String;",
        "Lj/d;",
        "Landroid/content/Intent;",
        "kotlin.jvm.PlatformType",
        "b",
        "Lj/d;",
        "filePickerLauncher",
        "c",
        "imagePickerLauncher",
        "d",
        "lab-file-upload_release"
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
.field private static final d:Los1/b$a;

.field public static final e:I


# instance fields
.field private final a:[Ljava/lang/String;

.field private final b:Lj/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/d;"
        }
    .end annotation
.end field

.field private final c:Lj/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/d;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Los1/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Los1/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Los1/b;->d:Los1/b$a;

    const/16 v0, 0x8

    sput v0, Los1/b;->e:I

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/m0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;[Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/m0;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "[",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onFilesSelected"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onImagesSelected"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mimeTypes"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p4, p0, Los1/b;->a:[Ljava/lang/String;

    .line 3
    new-instance p4, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;

    invoke-direct {p4}, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;-><init>()V

    .line 4
    new-instance v0, Los1/a;

    const/4 v1, 0x0

    invoke-direct {v0, p2, v1}, Los1/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {p1, p4, v0}, Landroidx/fragment/app/m0;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object p2

    const-string p4, "registerForActivityResult(...)"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Los1/b;->b:Lj/d;

    .line 5
    new-instance p2, Landroidx/activity/result/contract/ActivityResultContracts$GetMultipleContents;

    invoke-direct {p2}, Landroidx/activity/result/contract/ActivityResultContracts$GetMultipleContents;-><init>()V

    .line 6
    new-instance v0, Los1/a;

    const/4 v1, 0x1

    invoke-direct {v0, p3, v1}, Los1/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {p1, p2, v0}, Landroidx/fragment/app/m0;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object p1

    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Los1/b;->c:Lj/d;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/fragment/app/m0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;[Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 7
    sget-object p4, Lps1/a;->f:Lps1/a$a;

    invoke-virtual {p4}, Lps1/a$a;->a()[Ljava/lang/String;

    move-result-object p4

    .line 8
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Los1/b;-><init>(Landroidx/fragment/app/m0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;[Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lj/a;)V
    .locals 0

    invoke-static {p0, p1}, Los1/b;->c(Lkotlin/jvm/functions/Function1;Lj/a;)V

    return-void
.end method

.method public static synthetic b(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-static {p1, p0}, Los1/b;->d(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    return-void
.end method

.method private static final c(Lkotlin/jvm/functions/Function1;Lj/a;)V
    .locals 0

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V
    .locals 1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method


# virtual methods
.method public final e()V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.GET_CONTENT"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "*/*"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "android.intent.extra.ALLOW_MULTIPLE"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string v1, "android.intent.extra.MIME_TYPES"

    iget-object v2, p0, Los1/b;->a:[Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "android.intent.category.OPENABLE"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v1, p0, Los1/b;->b:Lj/d;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v1, v0, v2}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void
.end method

.method public final f()V
    .locals 3

    iget-object v0, p0, Los1/b;->c:Lj/d;

    const-string v1, "image/*"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void
.end method
