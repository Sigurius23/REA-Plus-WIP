.class public final Lca2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lca2/g$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\t\n\u0002\u0008\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u000eB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001d"
    }
    d2 = {
        "Lca2/g;",
        "",
        "Landroid/content/SharedPreferences;",
        "sharedPreferences",
        "Lzr2/a;",
        "dateAndTimeProvider",
        "Lfi0/a;",
        "baseAnalytics",
        "Ljs0/c;",
        "configurationRepository",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Landroid/content/SharedPreferences;Lzr2/a;Lfi0/a;Ljs0/c;Ltr2/n;)V",
        "a",
        "Landroid/content/SharedPreferences;",
        "b",
        "Lzr2/a;",
        "c",
        "Lfi0/a;",
        "d",
        "Ljs0/c;",
        "e",
        "Ltr2/n;",
        "",
        "f",
        "J",
        "_startTimeMillis",
        "g",
        "core_release"
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
.field public static final g:Lca2/g$a;


# instance fields
.field private final a:Landroid/content/SharedPreferences;

.field private final b:Lzr2/a;

.field private final c:Lfi0/a;

.field private final d:Ljs0/c;

.field private final e:Ltr2/n;

.field private f:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lca2/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lca2/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lca2/g;->g:Lca2/g$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/SharedPreferences;Lzr2/a;Lfi0/a;Ljs0/c;Ltr2/n;)V
    .locals 1

    const-string v0, "sharedPreferences"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateAndTimeProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "baseAnalytics"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configurationRepository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lca2/g;->a:Landroid/content/SharedPreferences;

    iput-object p2, p0, Lca2/g;->b:Lzr2/a;

    iput-object p3, p0, Lca2/g;->c:Lfi0/a;

    iput-object p4, p0, Lca2/g;->d:Ljs0/c;

    iput-object p5, p0, Lca2/g;->e:Ltr2/n;

    invoke-interface {p2}, Lzr2/a;->b()J

    move-result-wide p1

    iput-wide p1, p0, Lca2/g;->f:J

    return-void
.end method
