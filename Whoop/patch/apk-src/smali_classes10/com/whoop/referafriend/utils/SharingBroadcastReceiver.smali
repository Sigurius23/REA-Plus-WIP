.class public final Lcom/whoop/referafriend/utils/SharingBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"

# interfaces
.implements Lof3/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/referafriend/utils/SharingBroadcastReceiver$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u000c2\u00020\u00012\u00020\u0002:\u0001\rB\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/whoop/referafriend/utils/SharingBroadcastReceiver;",
        "Landroid/content/BroadcastReceiver;",
        "Lof3/a;",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Intent;",
        "intent",
        "Ll83/a0;",
        "onReceive",
        "(Landroid/content/Context;Landroid/content/Intent;)V",
        "w",
        "a",
        "refer-a-friend_release"
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
.field public static final w:Lcom/whoop/referafriend/utils/SharingBroadcastReceiver$a;

.field public static final x:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/referafriend/utils/SharingBroadcastReceiver$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/referafriend/utils/SharingBroadcastReceiver$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/referafriend/utils/SharingBroadcastReceiver;->w:Lcom/whoop/referafriend/utils/SharingBroadcastReceiver$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/referafriend/utils/SharingBroadcastReceiver;->x:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge getKoin()Lnf3/a;
    .locals 1

    invoke-static {p0}, Lts/o;->A(Lof3/a;)Lnf3/a;

    move-result-object v0

    return-object v0
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 10

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "intent"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "source"

    invoke-virtual {p2, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, ""

    if-nez p1, :cond_0

    move-object p1, v0

    :cond_0
    const-string v1, "checkout_origin"

    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v1, "analytics_properties"

    invoke-virtual {p2, v1}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v3

    const-string v4, "keySet(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/LinkedHashMap;

    const/16 v6, 0xa

    invoke-static {v3, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-static {v6}, Lm83/g0;->W(I)I

    move-result v6

    const/16 v7, 0x10

    if-ge v6, v7, :cond_1

    move v6, v7

    :cond_1
    invoke-direct {v4, v6}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v1, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_2

    move-object v7, v0

    :cond_2
    invoke-interface {v4, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    move-object v6, v4

    goto :goto_1

    :cond_4
    move-object v6, v2

    :goto_1
    const-string v0, "android.intent.extra.CHOSEN_COMPONENT"

    const-class v1, Landroid/content/ComponentName;

    invoke-static {p2, v0, v1}, Ls4/g;->h(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/ComponentName;

    if-eqz p2, :cond_5

    invoke-interface {p0}, Lof3/a;->getKoin()Lnf3/a;

    move-result-object v0

    iget-object v0, v0, Lnf3/a;->a:Lwf3/a;

    iget-object v0, v0, Lwf3/a;->d:Lxf3/c;

    const-class v1, Lh62/b;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh62/b;

    new-instance v2, Lh62/a$c;

    invoke-virtual {p2}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v4

    const-string p2, "getPackageName(...)"

    invoke-static {v4, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x11

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Lh62/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v2, p1}, Lh62/b;->a(Lh62/a;Ljava/lang/String;)V

    :cond_5
    return-void
.end method
