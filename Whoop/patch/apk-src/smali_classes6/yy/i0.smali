.class public final Lyy/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lyv0/h;


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lyv0/h;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lyv0/h;-><init>(I)V

    sput-object v0, Lyy/i0;->b:Lyv0/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lyy/i0;->b:Lyv0/h;

    iput-object v0, p0, Lyy/i0;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "connectivity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.net.ConnectivityManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/net/ConnectivityManager;

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lyy/i0;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lqy/c;)Ljava/util/Map;
    .locals 9

    new-instance v0, Lorg/json/JSONObject;

    new-instance v1, Ll83/k;

    const-string v2, "os.name"

    const-string v3, "android"

    invoke-direct {v1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    move-object v3, v2

    new-instance v2, Ll83/k;

    const-string v4, "os.version"

    invoke-direct {v2, v4, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    const-string v4, "bindings.version"

    const-string v5, "22.6.1"

    invoke-direct {v3, v4, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Ll83/k;

    const-string v5, "lang"

    const-string v6, "Java"

    invoke-direct {v4, v5, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Ll83/k;

    const-string v6, "publisher"

    const-string v7, "Stripe"

    invoke-direct {v5, v6, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v6, p0, Lyy/i0;->a:Ljava/lang/Object;

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const-string v7, "http.agent"

    invoke-interface {v6, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    new-instance v6, Ll83/k;

    invoke-direct {v6, v7, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v1 .. v6}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    if-eqz p1, :cond_0

    const-string v2, "application"

    invoke-virtual {p1}, Lqy/c;->b()Ljava/util/Map;

    move-result-object p1

    invoke-static {v2, p1}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    sget-object p1, Lm83/z;->w:Lm83/z;

    :cond_1
    invoke-static {v1, p1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "X-Stripe-Client-User-Agent"

    invoke-static {v0, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method
