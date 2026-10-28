.class public final Lcom/whoop/navigation/exception/NavigationDeserializationException$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/navigation/exception/NavigationDeserializationException;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ-\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/whoop/navigation/exception/NavigationDeserializationException$a;",
        "",
        "<init>",
        "()V",
        "",
        "screenName",
        "Lkotlinx/serialization/json/JsonElement;",
        "parameters",
        "b",
        "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/String;",
        "unrecognizedScreen",
        "rawParameters",
        "Ltr2/n;",
        "logger",
        "Liy1/c;",
        "metricWriter",
        "Lcom/whoop/navigation/exception/NavigationDeserializationException;",
        "c",
        "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ltr2/n;Liy1/c;)Lcom/whoop/navigation/exception/NavigationDeserializationException;",
        "navigation_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/navigation/exception/NavigationDeserializationException$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lcom/whoop/navigation/exception/NavigationDeserializationException$a;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/navigation/exception/NavigationDeserializationException$a;->b(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final b(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to deserialize NavigationAction: Unknown screen \'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\' with parameters: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final c(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ltr2/n;Liy1/c;)Lcom/whoop/navigation/exception/NavigationDeserializationException;
    .locals 10

    const-string v0, "unrecognizedScreen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rawParameters"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricWriter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/navigation/exception/NavigationDeserializationException;

    invoke-direct {v0, p1, p2}, Lcom/whoop/navigation/exception/NavigationDeserializationException;-><init>(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V

    const-string p2, "Unidentified navigation screen: "

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p3, p2, v0, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    new-instance v2, Ljy1/a;

    const-string p2, "screen_name:"

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    const/16 v8, 0x11

    const/4 v9, 0x0

    const/4 v3, 0x0

    const-string v4, "mobile.navigation.failures"

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p4, v2}, Liy1/c;->b(Ljy1/a;)V

    return-object v0
.end method
