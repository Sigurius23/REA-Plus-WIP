.class public final Lj02/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj02/k0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lj02/r0;",
        "Lj02/k0;",
        "Landroid/app/Activity;",
        "activity",
        "<init>",
        "(Landroid/app/Activity;)V",
        "Lj02/m0;",
        "navigationScreen",
        "Lj02/j0;",
        "provideNavigationData",
        "(Lj02/m0;)Lj02/j0;",
        "a",
        "Landroid/app/Activity;",
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
.field private final a:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj02/r0;->a:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public provideNavigationData(Lj02/m0;)Lj02/j0;
    .locals 5

    const-string v0, "navigationScreen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lj02/m0$n3;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lj02/r0;->a:Landroid/app/Activity;

    invoke-static {v0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/a;->a(Landroid/content/Context;)Lqm2/o;

    move-result-object v0

    invoke-virtual {v0}, Lqm2/o;->s()Lqm2/o;

    move-result-object v0

    check-cast p1, Lj02/m0$n3;

    invoke-virtual {p1}, Lj02/m0$n3;->b()Lcom/whoop/navigation/e;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {}, Lu82/k;->c()Lad3/c;

    move-result-object v1

    new-instance v2, Lcom/whoop/navigation/json/a;

    const/4 v3, 0x3

    const/4 v4, 0x0

    invoke-direct {v2, v4, v4, v3, v4}, Lcom/whoop/navigation/json/a;-><init>(Ljava/util/Map;Liy1/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v2, p1}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lqm2/o;->z(Ljava/lang/String;)Lqm2/o;

    :cond_0
    invoke-virtual {v0}, Lhj0/q;->m()V

    sget-object p1, Lj02/j0$a;->a:Lj02/j0$a;

    return-object p1

    :cond_1
    sget-object p1, Lj02/j0$d;->a:Lj02/j0$d;

    return-object p1
.end method
