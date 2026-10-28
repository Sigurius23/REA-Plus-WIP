.class public abstract Lcom/whoop/realtime/presentation/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00008BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/whoop/realtime/presentation/c$a;",
        "Lcom/whoop/service/network/model/Sport;",
        "b",
        "(Lcom/whoop/realtime/presentation/c$a;)Lcom/whoop/service/network/model/Sport;",
        "sport",
        "realtime-activity_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic a(Lcom/whoop/realtime/presentation/c$a;)Lcom/whoop/service/network/model/Sport;
    .locals 0

    invoke-static {p0}, Lcom/whoop/realtime/presentation/l;->b(Lcom/whoop/realtime/presentation/c$a;)Lcom/whoop/service/network/model/Sport;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lcom/whoop/realtime/presentation/c$a;)Lcom/whoop/service/network/model/Sport;
    .locals 2

    invoke-virtual {p0}, Lcom/whoop/realtime/presentation/c$a;->c()Llm2/b;

    move-result-object p0

    instance-of v0, p0, Llm2/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Llm2/d;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Llm2/d;->k()Lcom/whoop/service/network/model/Sport;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v1
.end method
