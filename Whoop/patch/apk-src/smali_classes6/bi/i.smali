.class public final synthetic Lbi/i;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final w:Lbi/i;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lbi/i;

    const-string v4, "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;"

    const/4 v5, 0x1

    const/4 v1, 0x1

    const-class v2, Lbi/g;

    const-string v3, "ConnectivityChecker"

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Lbi/i;->w:Lbi/i;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-class v0, Landroid/net/ConnectivityManager;

    invoke-static {p1, v0}, Ls4/c;->getSystemService(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    if-eqz v0, :cond_0

    const-string v1, "android.permission.ACCESS_NETWORK_STATE"

    invoke-static {p1, v1}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_0

    :try_start_0
    new-instance p1, Lbi/f;

    invoke-direct {p1, v0}, Lbi/f;-><init>(Landroid/net/ConnectivityManager;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    :cond_0
    sget-object p1, Lbi/e;->a:Lbi/d;

    return-object p1
.end method
