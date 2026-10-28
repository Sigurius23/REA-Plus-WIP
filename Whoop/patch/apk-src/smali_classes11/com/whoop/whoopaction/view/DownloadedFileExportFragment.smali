.class public final Lcom/whoop/whoopaction/view/DownloadedFileExportFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whoopaction/view/DownloadedFileExportFragment$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J-\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016R\"\u0010\u001d\u001a\u0010\u0012\u000c\u0012\n \u001a*\u0004\u0018\u00010\u00190\u00190\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006 "
    }
    d2 = {
        "Lcom/whoop/whoopaction/view/DownloadedFileExportFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Ll83/a0;",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "Lcom/whoop/whoopaction/view/a;",
        "w",
        "Lcom/whoop/whoopaction/view/a;",
        "A",
        "()Lcom/whoop/whoopaction/view/a;",
        "setFileExportUtil$whoop_action_release",
        "(Lcom/whoop/whoopaction/view/a;)V",
        "fileExportUtil",
        "Lj/d;",
        "",
        "kotlin.jvm.PlatformType",
        "x",
        "Lj/d;",
        "createDocument",
        "y",
        "a",
        "whoop-action_release"
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
.field public static final y:Lcom/whoop/whoopaction/view/DownloadedFileExportFragment$a;

.field public static final z:I


# instance fields
.field private w:Lcom/whoop/whoopaction/view/a;

.field private final x:Lj/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/d;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/whoopaction/view/DownloadedFileExportFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/whoopaction/view/DownloadedFileExportFragment$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/whoopaction/view/DownloadedFileExportFragment;->y:Lcom/whoop/whoopaction/view/DownloadedFileExportFragment$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/whoopaction/view/DownloadedFileExportFragment;->z:I

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Lcom/whoop/whoopaction/view/a;

    invoke-direct {v0}, Lcom/whoop/whoopaction/view/a;-><init>()V

    iput-object v0, p0, Lcom/whoop/whoopaction/view/DownloadedFileExportFragment;->w:Lcom/whoop/whoopaction/view/a;

    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$CreateDocument;

    const-string v1, "application/octet-stream"

    invoke-direct {v0, v1}, Landroidx/activity/result/contract/ActivityResultContracts$CreateDocument;-><init>(Ljava/lang/String;)V

    new-instance v1, Laq0/o;

    const/16 v2, 0x14

    invoke-direct {v1, p0, v2}, Laq0/o;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/m0;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object v0

    const-string v1, "registerForActivityResult(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/whoop/whoopaction/view/DownloadedFileExportFragment;->x:Lj/d;

    return-void
.end method

.method public static synthetic y(Lcom/whoop/whoopaction/view/DownloadedFileExportFragment;Landroid/net/Uri;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/whoopaction/view/DownloadedFileExportFragment;->z(Lcom/whoop/whoopaction/view/DownloadedFileExportFragment;Landroid/net/Uri;)V

    return-void
.end method

.method private static final z(Lcom/whoop/whoopaction/view/DownloadedFileExportFragment;Landroid/net/Uri;)V
    .locals 4

    const-string v0, "DownloadedFileExport"

    if-nez p1, :cond_0

    const-string p1, "Document creation was cancelled or failed - URI is null"

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    invoke-virtual {p0}, Leb/a0;->z()Z

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    const-string v3, "path"

    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    iget-object v3, p0, Lcom/whoop/whoopaction/view/DownloadedFileExportFragment;->w:Lcom/whoop/whoopaction/view/a;

    invoke-virtual {v3, v1}, Lcom/whoop/whoopaction/view/a;->d(Ljava/lang/String;)Lcom/whoop/whoopaction/view/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/whoopaction/view/a$b;->c()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v1}, Lcom/whoop/whoopaction/view/a$b;->b()Ljava/io/File;

    move-result-object v3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    new-instance v3, Lcom/whoop/whoopaction/view/DownloadedFileExportFragment$b;

    invoke-direct {v3, p0, v1, p1, v2}, Lcom/whoop/whoopaction/view/DownloadedFileExportFragment$b;-><init>(Lcom/whoop/whoopaction/view/DownloadedFileExportFragment;Lcom/whoop/whoopaction/view/a$b;Landroid/net/Uri;Lq83/d;)V

    const/4 p0, 0x3

    invoke-static {v0, v2, v2, v3, p0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_3
    :goto_1
    invoke-virtual {v1}, Lcom/whoop/whoopaction/view/a$b;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "File validation failed: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    invoke-virtual {p0}, Leb/a0;->z()Z

    return-void
.end method


# virtual methods
.method public final A()Lcom/whoop/whoopaction/view/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/view/DownloadedFileExportFragment;->w:Lcom/whoop/whoopaction/view/a;

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroidx/fragment/app/m0;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string v1, "path"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    iget-object v1, p0, Lcom/whoop/whoopaction/view/DownloadedFileExportFragment;->w:Lcom/whoop/whoopaction/view/a;

    invoke-virtual {v1, p1}, Lcom/whoop/whoopaction/view/a;->d(Ljava/lang/String;)Lcom/whoop/whoopaction/view/a$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/whoopaction/view/a$b;->c()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lcom/whoop/whoopaction/view/a$b;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "File validation failed: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "DownloadedFileExport"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p1

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_1
    iget-object v1, p0, Lcom/whoop/whoopaction/view/DownloadedFileExportFragment;->x:Lj/d;

    invoke-virtual {p1}, Lcom/whoop/whoopaction/view/a$b;->b()Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    :cond_2
    const-string p1, "export"

    :cond_3
    invoke-virtual {v1, p1, v0}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method
