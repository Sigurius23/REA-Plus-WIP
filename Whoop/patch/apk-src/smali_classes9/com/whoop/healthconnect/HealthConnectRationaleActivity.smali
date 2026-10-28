.class public final Lcom/whoop/healthconnect/HealthConnectRationaleActivity;
.super Lm/m;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/whoop/healthconnect/HealthConnectRationaleActivity;",
        "Lm/m;",
        "<init>",
        "()V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Ll83/a0;",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "Lor2/y;",
        "w",
        "Ll83/h;",
        "o",
        "()Lor2/y;",
        "externalLinkNavigator",
        "health-connect_release"
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
.field private final w:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lm/m;-><init>()V

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/healthconnect/HealthConnectRationaleActivity$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/healthconnect/HealthConnectRationaleActivity$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/healthconnect/HealthConnectRationaleActivity;->w:Ll83/h;

    return-void
.end method

.method private final o()Lor2/y;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/HealthConnectRationaleActivity;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lor2/y;

    return-object v0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    invoke-super {p0, p1}, Landroidx/fragment/app/r0;->onCreate(Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/whoop/healthconnect/HealthConnectRationaleActivity;->o()Lor2/y;

    move-result-object v0

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v2, "https://www.whoop.com/privacy/full-privacy-policy"

    const/4 v3, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v5}, Lor2/y;->y(Lor2/y;Landroid/app/Activity;Ljava/lang/String;ZILjava/lang/Object;)V

    return-void
.end method
