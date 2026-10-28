.class public final Lya2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lya2/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lya2/a;",
        "",
        "Lj02/o0;",
        "navigator",
        "<init>",
        "(Lj02/o0;)V",
        "Ll83/a0;",
        "a",
        "()V",
        "Lj02/o0;",
        "b",
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


# static fields
.field public static final b:Lya2/a$a;

.field public static final c:I


# instance fields
.field private final a:Lj02/o0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lya2/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lya2/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lya2/a;->b:Lya2/a$a;

    const/16 v0, 0x8

    sput v0, Lya2/a;->c:I

    return-void
.end method

.method public constructor <init>(Lj02/o0;)V
    .locals 1

    const-string v0, "navigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lya2/a;->a:Lj02/o0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 14

    iget-object v0, p0, Lya2/a;->a:Lj02/o0;

    new-instance v1, Lj02/m0$m1;

    new-instance v2, Lcom/whoop/navigation/models/ApiRequest;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const-string v3, "language-service/v1/language-beta/optout"

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/whoop/navigation/models/ApiRequest;-><init>(Ljava/lang/String;Lcom/whoop/navigation/models/GenericHttpMethod;Lkotlinx/serialization/json/JsonElement;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v12, 0x3fe

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v1 .. v13}, Lj02/m0$m1;-><init>(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/GenericCachePolicy;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/AiAction;Lcom/whoop/navigation/models/GenericInteraction;Leb/x0;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void
.end method
