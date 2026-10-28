.class public final Lca2/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lca2/m;",
        "",
        "Lfi0/a;",
        "baseAnalytics",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lfi0/a;Ltr2/n;)V",
        "Ll83/a0;",
        "a",
        "()V",
        "Lfi0/a;",
        "b",
        "Ltr2/n;",
        "app_prodStandardRelease"
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
.field private final a:Lfi0/a;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lfi0/a;Ltr2/n;)V
    .locals 1

    const-string v0, "baseAnalytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lca2/m;->a:Lfi0/a;

    iput-object p2, p0, Lca2/m;->b:Ltr2/n;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    :try_start_0
    iget-object v0, p0, Lca2/m;->a:Lfi0/a;

    const-string v1, "Connectivity"

    const-string v2, ""

    const-string v3, ""

    const-string v4, "Application Force Closed"

    const-string v5, "strap_status"

    sget-object v6, Lq92/a;->w:Lq92/a;

    invoke-virtual {v6}, Lq92/a;->k()Lst0/f;

    move-result-object v6

    new-instance v7, Ll83/k;

    invoke-direct {v7, v5, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v7}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v5

    invoke-interface/range {v0 .. v5}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lca2/m;->b:Ltr2/n;

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    const-string v3, "Failed to track force quit analytics"

    invoke-interface {v1, v3, v0, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-void
.end method
