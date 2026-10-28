.class public final Lvm2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lvm2/a;",
        "",
        "Lo02/d;",
        "navigationReducer",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lo02/d;Ltr2/n;)V",
        "Lcom/whoop/appconfiguration/TabConfiguration;",
        "tab",
        "Lj02/m0;",
        "a",
        "(Lcom/whoop/appconfiguration/TabConfiguration;)Lj02/m0;",
        "Lo02/d;",
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
.field private final a:Lo02/d;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lo02/d;Ltr2/n;)V
    .locals 1

    const-string v0, "navigationReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lvm2/a;->a:Lo02/d;

    .line 3
    iput-object p2, p0, Lvm2/a;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lo02/d;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "AppConfigurationTabResolver"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lvm2/a;-><init>(Lo02/d;Ltr2/n;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/whoop/appconfiguration/TabConfiguration;)Lj02/m0;
    .locals 7

    const-string v0, "tab"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/appconfiguration/TabConfiguration;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "\'"

    const/4 v3, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lvm2/a;->b:Ltr2/n;

    invoke-virtual {p1}, Lcom/whoop/appconfiguration/TabConfiguration;->getId()Ljava/lang/String;

    move-result-object p1

    const-string v4, "No destination configured for tab \'"

    invoke-static {v4, p1, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v3

    :cond_0
    iget-object v4, p0, Lvm2/a;->a:Lo02/d;

    invoke-virtual {v0}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v5

    invoke-interface {v4, v5}, Lo02/d;->a(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/c;

    move-result-object v4

    instance-of v5, v4, Lj02/m0;

    if-eqz v5, :cond_1

    check-cast v4, Lj02/m0;

    goto :goto_0

    :cond_1
    move-object v4, v3

    :goto_0
    if-nez v4, :cond_2

    iget-object v4, p0, Lvm2/a;->b:Ltr2/n;

    invoke-virtual {v0}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/appconfiguration/TabConfiguration;->getId()Ljava/lang/String;

    move-result-object p1

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "NavigationReducer could not map "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " for tab \'"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v1, [Lqr2/a$a;

    invoke-interface {v4, p1, v0}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v3

    :cond_2
    return-object v4
.end method
