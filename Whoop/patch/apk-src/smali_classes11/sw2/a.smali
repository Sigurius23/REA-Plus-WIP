.class public abstract Lsw2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a/\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\u0004\u0008\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u001b\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u001b\u0010\r\u001a\u0004\u0018\u00010\u000c*\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "T",
        "Lkotlinx/serialization/json/JsonElement;",
        "Lad3/c;",
        "json",
        "Lwc3/c;",
        "serializer",
        "c",
        "(Lkotlinx/serialization/json/JsonElement;Lad3/c;Lwc3/c;)Ljava/lang/Object;",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "a",
        "(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/whoopaction/domain/models/Action;",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "b",
        "(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/analytics/AnalyticEventModel;",
        "Ltr2/n;",
        "Ltr2/n;",
        "logger",
        "whoop-action_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "GenericInteractionDecoding"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sput-object v0, Lsw2/a;->a:Ltr2/n;

    return-void
.end method

.method public static final a(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/whoopaction/domain/models/Action;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/navigation/models/GenericInteraction;->getAction()Lkotlinx/serialization/json/JsonElement;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    new-instance v1, Luw2/b;

    const/4 v2, 0x3

    invoke-direct {v1, v0, v0, v2, v0}, Luw2/b;-><init>(Ljava/util/Map;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p0, p1, v1}, Lsw2/a;->c(Lkotlinx/serialization/json/JsonElement;Lad3/c;Lwc3/c;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/whoopaction/domain/models/Action;

    return-object p0

    :cond_0
    return-object v0
.end method

.method public static final b(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/analytics/AnalyticEventModel;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/navigation/models/GenericInteraction;->getAnalyticEvent()Lkotlinx/serialization/json/JsonElement;

    move-result-object p0

    if-eqz p0, :cond_0

    sget-object v0, Lcom/whoop/analytics/AnalyticEventModel;->Companion:Lcom/whoop/analytics/AnalyticEventModel$a;

    invoke-virtual {v0}, Lcom/whoop/analytics/AnalyticEventModel$a;->serializer()Lwc3/c;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lsw2/a;->c(Lkotlinx/serialization/json/JsonElement;Lad3/c;Lwc3/c;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/analytics/AnalyticEventModel;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final c(Lkotlinx/serialization/json/JsonElement;Lad3/c;Lwc3/c;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/serialization/json/JsonElement;",
            "Lad3/c;",
            "Lwc3/c;",
            ")TT;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serializer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    move-object v0, p2

    check-cast v0, Lwc3/b;

    invoke-virtual {p1, v0, p0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    sget-object p1, Lsw2/a;->a:Ltr2/n;

    invoke-interface {p2}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object p2

    invoke-interface {p2}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object p2

    const-string v0, "Failed to decode "

    const-string v1, " from GenericInteraction field"

    invoke-static {v0, p2, v1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p1, p2, p0, v0}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    const/4 p0, 0x0

    return-object p0
.end method
