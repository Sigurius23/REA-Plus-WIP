.class public final Lj02/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj02/k0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u0017\u00a8\u0006\u001b"
    }
    d2 = {
        "Lj02/k;",
        "Lj02/k0;",
        "Landroid/content/Context;",
        "context",
        "Lj02/i0;",
        "navDeepLinkRequestHelper",
        "Landroid/content/Intent;",
        "bluetoothSettingsIntent",
        "Leb/x0;",
        "strapSettingsOptions",
        "statusIntent",
        "<init>",
        "(Landroid/content/Context;Lj02/i0;Landroid/content/Intent;Leb/x0;Landroid/content/Intent;)V",
        "Lj02/m0;",
        "navigationScreen",
        "Lj02/j0;",
        "provideNavigationData",
        "(Lj02/m0;)Lj02/j0;",
        "a",
        "Landroid/content/Context;",
        "b",
        "Lj02/i0;",
        "c",
        "Landroid/content/Intent;",
        "d",
        "Leb/x0;",
        "e",
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
.field private final a:Landroid/content/Context;

.field private final b:Lj02/i0;

.field private final c:Landroid/content/Intent;

.field private final d:Leb/x0;

.field private final e:Landroid/content/Intent;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lj02/i0;Landroid/content/Intent;Leb/x0;Landroid/content/Intent;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navDeepLinkRequestHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bluetoothSettingsIntent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strapSettingsOptions"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "statusIntent"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lj02/k;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lj02/k;->b:Lj02/i0;

    .line 4
    iput-object p3, p0, Lj02/k;->c:Landroid/content/Intent;

    .line 5
    iput-object p4, p0, Lj02/k;->d:Leb/x0;

    .line 6
    iput-object p5, p0, Lj02/k;->e:Landroid/content/Intent;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lj02/i0;Landroid/content/Intent;Leb/x0;Landroid/content/Intent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    and-int/lit8 v0, p6, 0x2

    if-eqz v0, :cond_0

    .line 7
    new-instance v0, Lj02/i0;

    invoke-direct {v0}, Lj02/i0;-><init>()V

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    and-int/lit8 v1, p6, 0x4

    if-eqz v1, :cond_1

    .line 8
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.settings.BLUETOOTH_SETTINGS"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 v2, 0x10000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v1

    const-string v2, "addFlags(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    move-object/from16 v1, p3

    :goto_1
    and-int/lit8 v2, p6, 0x8

    if-eqz v2, :cond_2

    .line 9
    sget v9, Lnf1/a;->e:I

    .line 10
    new-instance v3, Leb/x0;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, -0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    move v10, v6

    move v11, v6

    move v12, v6

    invoke-direct/range {v3 .. v12}, Leb/x0;-><init>(ZZIZZIIII)V

    goto :goto_2

    :cond_2
    move-object/from16 v3, p4

    :goto_2
    and-int/lit8 v2, p6, 0x10

    if-eqz v2, :cond_3

    .line 11
    new-instance v2, Landroid/content/Intent;

    const-string v4, "https://status.whoop.com/"

    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    const-string v5, "android.intent.action.VIEW"

    invoke-direct {v2, v5, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    move-object/from16 p7, v2

    :goto_3
    move-object p2, p0

    move-object/from16 p3, p1

    move-object/from16 p4, v0

    move-object/from16 p5, v1

    move-object/from16 p6, v3

    goto :goto_4

    :cond_3
    move-object/from16 p7, p5

    goto :goto_3

    .line 12
    :goto_4
    invoke-direct/range {p2 .. p7}, Lj02/k;-><init>(Landroid/content/Context;Lj02/i0;Landroid/content/Intent;Leb/x0;Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public provideNavigationData(Lj02/m0;)Lj02/j0;
    .locals 7

    const-string v0, "navigationScreen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lj02/m0$r0;

    if-eqz v0, :cond_6

    check-cast p1, Lj02/m0$r0;

    invoke-virtual {p1}, Lj02/m0$r0;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x79209ddf

    if-eq v0, v1, :cond_4

    const v1, 0x1b72d28e

    if-eq v0, v1, :cond_2

    const v1, 0x467878bd

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "SERVER_ISSUE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lj02/k;->a:Landroid/content/Context;

    iget-object v0, p0, Lj02/k;->e:Landroid/content/Intent;

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    sget-object p1, Lj02/j0$a;->a:Lj02/j0$a;

    return-object p1

    :cond_2
    const-string v0, "BLUETOOTH"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lj02/k;->a:Landroid/content/Context;

    iget-object v0, p0, Lj02/k;->c:Landroid/content/Intent;

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    sget-object p1, Lj02/j0$a;->a:Lj02/j0$a;

    return-object p1

    :cond_4
    const-string v0, "DEFAULT"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    const-string p1, "whoop://com.whoop/settings/newStrapSettings"

    iget-object v0, p0, Lj02/k;->b:Lj02/i0;

    invoke-virtual {v0, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v2

    new-instance v1, Lj02/j0$c;

    iget-object v3, p0, Lj02/k;->d:Leb/x0;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_6
    :goto_0
    sget-object p1, Lj02/j0$d;->a:Lj02/j0$d;

    return-object p1
.end method
