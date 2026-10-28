.class public final Lj02/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj02/b0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000bB\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lj02/b0;",
        "",
        "Lad3/c;",
        "json",
        "<init>",
        "(Lad3/c;)V",
        "Landroid/os/Bundle;",
        "arguments",
        "Lcom/whoop/analytics/MetricEventModel;",
        "c",
        "(Landroid/os/Bundle;)Lcom/whoop/analytics/MetricEventModel;",
        "a",
        "Lad3/c;",
        "b",
        "feature_release"
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
.field public static final b:Lj02/b0$a;

.field public static final c:I


# instance fields
.field private final a:Lad3/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj02/b0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj02/b0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lj02/b0;->b:Lj02/b0$a;

    const/16 v0, 0x8

    sput v0, Lj02/b0;->c:I

    return-void
.end method

.method public constructor <init>(Lad3/c;)V
    .locals 1

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lj02/b0;->a:Lad3/c;

    return-void
.end method

.method public synthetic constructor <init>(Lad3/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    new-instance p1, Lim1/p0;

    const/16 p2, 0x14

    invoke-direct {p1, p2}, Lim1/p0;-><init>(I)V

    .line 4
    sget-object p2, Lad3/c;->d:Lad3/b;

    invoke-static {p2, p1}, Lts/o;->b(Lad3/c;Lkotlin/jvm/functions/Function1;)Lad3/r;

    move-result-object p1

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Lj02/b0;-><init>(Lad3/c;)V

    return-void
.end method

.method public static synthetic a(Lad3/g;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lj02/b0;->b(Lad3/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lad3/g;)Ll83/a0;
    .locals 1

    const-string v0, "$this$Json"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lad3/g;->c:Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final c(Landroid/os/Bundle;)Lcom/whoop/analytics/MetricEventModel;
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    const-string v1, "metricEvents"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1}, Lor2/o1;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    :try_start_0
    const-string v1, "UTF-8"

    invoke-static {p1, v1}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    :try_start_1
    iget-object v1, p0, Lj02/b0;->a:Lad3/c;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lcom/whoop/analytics/MetricEventModel;->Companion:Lcom/whoop/analytics/MetricEventModel$a;

    invoke-virtual {v2}, Lcom/whoop/analytics/MetricEventModel$a;->serializer()Lwc3/c;

    move-result-object v2

    check-cast v2, Lwc3/b;

    invoke-virtual {v1, v2, p1}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/analytics/MetricEventModel;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :catch_0
    :cond_1
    :goto_0
    return-object v0
.end method
