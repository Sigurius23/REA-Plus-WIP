.class public final Lqj1/g;
.super Lqj1/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lqj1/a<",
        "Lm7/m0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ<\u0010\u0016\u001a\u00020\u00132\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000f2\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0096@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u001aR\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lqj1/g;",
        "Lqj1/a;",
        "Lm7/m0;",
        "Lu92/d;",
        "sharedPreferences",
        "Ljava/time/Clock;",
        "clock",
        "Lcom/whoop/healthconnect/domain/HealthConnectApi;",
        "healthConnectApi",
        "Ltr2/n;",
        "logger",
        "Lrj1/a;",
        "healthConnectIntentActivityMatcher",
        "<init>",
        "(Lu92/d;Ljava/time/Clock;Lcom/whoop/healthconnect/domain/HealthConnectApi;Ltr2/n;Lrj1/a;)V",
        "",
        "records",
        "",
        "deletions",
        "",
        "isInitialImport",
        "isTokenRefreshImport",
        "g",
        "(Ljava/util/List;Ljava/util/List;ZZLq83/d;)Ljava/lang/Object;",
        "f",
        "Lcom/whoop/healthconnect/domain/HealthConnectApi;",
        "Ltr2/n;",
        "h",
        "Lrj1/a;",
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
.field private final f:Lcom/whoop/healthconnect/domain/HealthConnectApi;

.field private final g:Ltr2/n;

.field private final h:Lrj1/a;


# direct methods
.method public constructor <init>(Lu92/d;Ljava/time/Clock;Lcom/whoop/healthconnect/domain/HealthConnectApi;Ltr2/n;Lrj1/a;)V
    .locals 8

    const-string v0, "sharedPreferences"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clock"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "healthConnectApi"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "healthConnectIntentActivityMatcher"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    const-class v0, Lm7/m0;

    .line 2
    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    .line 3
    const-string v4, "nutrition_records"

    move-object v2, p0

    move-object v5, p1

    move-object v6, p2

    move-object v7, p4

    .line 4
    invoke-direct/range {v2 .. v7}, Lqj1/a;-><init>(Lj93/d;Ljava/lang/String;Lu92/d;Ljava/time/Clock;Ltr2/n;)V

    .line 5
    iput-object p3, v2, Lqj1/g;->f:Lcom/whoop/healthconnect/domain/HealthConnectApi;

    .line 6
    iput-object v7, v2, Lqj1/g;->g:Ltr2/n;

    .line 7
    iput-object p5, v2, Lqj1/g;->h:Lrj1/a;

    return-void
.end method

.method public synthetic constructor <init>(Lu92/d;Ljava/time/Clock;Lcom/whoop/healthconnect/domain/HealthConnectApi;Ltr2/n;Lrj1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    .line 8
    invoke-static {}, Ljava/time/Clock;->systemDefaultZone()Ljava/time/Clock;

    move-result-object p2

    const-string p7, "systemDefaultZone(...)"

    invoke-static {p2, p7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_1

    .line 9
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "HealthConnectNutritionManager"

    invoke-virtual {p2, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p4

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 10
    invoke-direct/range {v0 .. v5}, Lqj1/g;-><init>(Lu92/d;Ljava/time/Clock;Lcom/whoop/healthconnect/domain/HealthConnectApi;Ltr2/n;Lrj1/a;)V

    return-void
.end method

.method public static final synthetic k(Lqj1/g;)Lcom/whoop/healthconnect/domain/HealthConnectApi;
    .locals 0

    iget-object p0, p0, Lqj1/g;->f:Lcom/whoop/healthconnect/domain/HealthConnectApi;

    return-object p0
.end method

.method public static final synthetic l(Lqj1/g;)Lrj1/a;
    .locals 0

    iget-object p0, p0, Lqj1/g;->h:Lrj1/a;

    return-object p0
.end method


# virtual methods
.method public g(Ljava/util/List;Ljava/util/List;ZZLq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lm7/m0;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;ZZ",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lrj1/b;->a:Lrj1/b$a;

    iget-object v3, p0, Lqj1/g;->g:Ltr2/n;

    new-instance v4, Lqj1/g$a;

    const/4 v1, 0x0

    invoke-direct {v4, p0, p3, p4, v1}, Lqj1/g$a;-><init>(Lqj1/g;ZZLq83/d;)V

    move-object v1, p1

    move-object v2, p2

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lrj1/b$a;->a(Ljava/util/List;Ljava/util/List;Ltr2/n;Lkotlin/jvm/functions/Function3;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
