.class public final Lsm2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\r\u0010\u000eJ!\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lsm2/b;",
        "",
        "<init>",
        "()V",
        "",
        "",
        "c",
        "(Ljava/lang/String;)Z",
        "Lcom/whoop/navigation/e;",
        "destination",
        "b",
        "(Lcom/whoop/navigation/e;)Ljava/lang/String;",
        "json",
        "a",
        "(Ljava/lang/String;)Lcom/whoop/navigation/e;",
        "dismissDestination",
        "Lo02/d;",
        "reducer",
        "Lj02/m0;",
        "d",
        "(Ljava/lang/String;Lo02/d;)Lj02/m0;",
        "Lcom/whoop/navigation/json/a;",
        "Lcom/whoop/navigation/json/a;",
        "serializer",
        "Ltr2/n;",
        "Ltr2/n;",
        "logger",
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
.field public static final a:Lsm2/b;

.field private static final b:Lcom/whoop/navigation/json/a;

.field private static final c:Ltr2/n;

.field public static final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lsm2/b;

    invoke-direct {v0}, Lsm2/b;-><init>()V

    sput-object v0, Lsm2/b;->a:Lsm2/b;

    new-instance v0, Lcom/whoop/navigation/json/a;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-direct {v0, v1, v1, v2, v1}, Lcom/whoop/navigation/json/a;-><init>(Ljava/util/Map;Liy1/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lsm2/b;->b:Lcom/whoop/navigation/json/a;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "DismissDestinationConverter"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sput-object v0, Lsm2/b;->c:Ltr2/n;

    const/16 v0, 0x8

    sput v0, Lsm2/b;->d:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final c(Ljava/lang/String;)Z
    .locals 4

    const-string v0, "Dismiss destination is not a JSON object"

    const/4 v1, 0x0

    :try_start_0
    invoke-static {}, Lu82/k;->c()Lad3/c;

    move-result-object v2

    invoke-virtual {v2, p1}, Lad3/c;->f(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;

    move-result-object p1

    invoke-static {p1}, Lad3/m;->i(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;

    move-result-object p1

    const-string v2, "parameters"

    invoke-virtual {p1, v2}, Lkotlinx/serialization/json/JsonObject;->containsKey(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catch Lkotlinx/serialization/SerializationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :goto_0
    sget-object v2, Lsm2/b;->c:Ltr2/n;

    new-array v3, v1, [Lqr2/a$a;

    invoke-interface {v2, v0, p1, v3}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_2

    :goto_1
    sget-object v2, Lsm2/b;->c:Ltr2/n;

    new-array v3, v1, [Lqr2/a$a;

    invoke-interface {v2, v0, p1, v3}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :goto_2
    return v1
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/whoop/navigation/e;
    .locals 2

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lu82/k;->c()Lad3/c;

    move-result-object v0

    sget-object v1, Lsm2/b;->b:Lcom/whoop/navigation/json/a;

    invoke-virtual {v0, v1, p1}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/navigation/e;

    return-object p1
.end method

.method public final b(Lcom/whoop/navigation/e;)Ljava/lang/String;
    .locals 2

    const-string v0, "destination"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lu82/k;->c()Lad3/c;

    move-result-object v0

    sget-object v1, Lsm2/b;->b:Lcom/whoop/navigation/json/a;

    invoke-virtual {v0, v1, p1}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/lang/String;Lo02/d;)Lj02/m0;
    .locals 3

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    invoke-direct {p0, p1}, Lsm2/b;->c(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    sget-object p1, Lsm2/b;->c:Ltr2/n;

    const-string p2, "Dismiss destination has no parameters, falling back to back press"

    new-array v2, v1, [Lqr2/a$a;

    invoke-interface {p1, p2, v2}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v0

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Lsm2/b;->a(Ljava/lang/String;)Lcom/whoop/navigation/e;

    move-result-object p1
    :try_end_0
    .catch Lkotlinx/serialization/SerializationException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object p1

    invoke-interface {p2, p1}, Lo02/d;->a(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/c;

    move-result-object p1

    instance-of p2, p1, Lj02/m0;

    if-eqz p2, :cond_2

    sget-object p2, Lj02/m0$j3;->b:Lj02/m0$j3;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    check-cast p1, Lj02/m0;

    return-object p1

    :cond_2
    return-object v0

    :goto_0
    sget-object p2, Lsm2/b;->c:Ltr2/n;

    const-string v2, "Could not decode dismiss destination, falling back to back press"

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p2, v2, p1, v1}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_3
    :goto_1
    return-object v0
.end method
