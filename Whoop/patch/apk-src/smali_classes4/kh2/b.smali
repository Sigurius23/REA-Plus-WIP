.class public final Lkh2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\t\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lkh2/b;",
        "",
        "Landroid/app/Application;",
        "application",
        "<init>",
        "(Landroid/app/Application;)V",
        "",
        "Ld6/b;",
        "Lf6/f;",
        "a",
        "()Ljava/util/List;",
        "Landroid/app/Application;",
        "essentials_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Landroid/app/Application;


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 1

    const-string v0, "application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkh2/b;->a:Landroid/app/Application;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ld6/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lkh2/b;->a:Landroid/app/Application;

    const-string v1, "ShowLanguageModal"

    invoke-static {v1}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    const-string v2, "mainPreferences"

    invoke-static {v0, v1, v2}, Le6/j;->a(Landroid/content/Context;Ljava/util/Set;Ljava/lang/String;)Ld6/b;

    move-result-object v0

    iget-object v1, p0, Lkh2/b;->a:Landroid/app/Application;

    const-string v2, "appInstallationUuid"

    invoke-static {v2}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    const-string v3, "HttpUtil"

    invoke-static {v1, v2, v3}, Le6/j;->a(Landroid/content/Context;Ljava/util/Set;Ljava/lang/String;)Ld6/b;

    move-result-object v1

    filled-new-array {v0, v1}, [Ld6/b;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
