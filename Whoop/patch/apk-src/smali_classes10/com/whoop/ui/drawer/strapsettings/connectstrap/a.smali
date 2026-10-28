.class public abstract Lcom/whoop/ui/drawer/strapsettings/connectstrap/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Landroid/content/Context;",
        "context",
        "Lqm2/o;",
        "a",
        "(Landroid/content/Context;)Lqm2/o;",
        "app_prodStandardRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Landroid/content/Context;)Lqm2/o;
    .locals 2

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lqm2/o;

    const-class v1, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;

    invoke-direct {v0, p0, v1}, Lqm2/o;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-object v0
.end method
