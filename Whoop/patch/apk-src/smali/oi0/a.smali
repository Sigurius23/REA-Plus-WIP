.class public final Loi0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\u0017\u0010\r\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Loi0/a;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "event",
        "Ll83/a0;",
        "d",
        "(Lcom/whoop/analytics/AnalyticEventModel;)V",
        "b",
        "Lri0/b$j;",
        "c",
        "(Lri0/b$j;)V",
        "Lri0/b$a;",
        "a",
        "(Lri0/b$a;)V",
        "Lfi0/a;",
        "getAnalytics$arch_v2_release",
        "()Lfi0/a;",
        "arch-v2_release"
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
.field private final a:Lfi0/a;


# direct methods
.method public constructor <init>(Lfi0/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loi0/a;->a:Lfi0/a;

    return-void
.end method

.method private final b(Lcom/whoop/analytics/AnalyticEventModel;)V
    .locals 1

    iget-object v0, p0, Loi0/a;->a:Lfi0/a;

    invoke-static {v0, p1}, Lfi0/b;->a(Lfi0/a;Lcom/whoop/analytics/AnalyticEventModel;)V

    return-void
.end method

.method private final c(Lri0/b$j;)V
    .locals 0

    return-void
.end method

.method private final d(Lcom/whoop/analytics/AnalyticEventModel;)V
    .locals 4

    new-instance v0, Ln83/f;

    invoke-direct {v0}, Ln83/f;-><init>()V

    const-string v1, "category"

    invoke-virtual {p1}, Lcom/whoop/analytics/AnalyticEventModel;->getCategory()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/whoop/analytics/AnalyticEventModel;->getAction()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "action"

    invoke-virtual {v0, v2, v1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/analytics/AnalyticEventModel;->getLabel()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v2, "label"

    invoke-virtual {v0, v2, v1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-virtual {p1}, Lcom/whoop/analytics/AnalyticEventModel;->getValue()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    const-string v2, "value"

    invoke-virtual {v0, v2, v1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-virtual {p1}, Lcom/whoop/analytics/AnalyticEventModel;->getSource()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    const-string v2, "source"

    invoke-virtual {v0, v2, v1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-virtual {p1}, Lcom/whoop/analytics/AnalyticEventModel;->getProperties()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/serialization/json/JsonElement;

    if-eqz v2, :cond_4

    invoke-static {v2}, Lu82/h;->c(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v0, v3, v2}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_5
    invoke-virtual {v0}, Ln83/f;->b()Ln83/f;

    move-result-object v0

    iget-object v1, p0, Loi0/a;->a:Lfi0/a;

    invoke-virtual {p1}, Lcom/whoop/analytics/AnalyticEventModel;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1, v0}, Lfi0/a;->e(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public final a(Lri0/b$a;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lri0/b$g;

    if-eqz v0, :cond_0

    check-cast p1, Lri0/b$g;

    invoke-virtual {p1}, Lri0/b$g;->a()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object p1

    invoke-direct {p0, p1}, Loi0/a;->b(Lcom/whoop/analytics/AnalyticEventModel;)V

    return-void

    :cond_0
    instance-of v0, p1, Lri0/b$v;

    if-eqz v0, :cond_1

    check-cast p1, Lri0/b$v;

    invoke-virtual {p1}, Lri0/b$v;->a()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object p1

    invoke-direct {p0, p1}, Loi0/a;->d(Lcom/whoop/analytics/AnalyticEventModel;)V

    return-void

    :cond_1
    instance-of v0, p1, Lri0/b$j;

    if-eqz v0, :cond_2

    check-cast p1, Lri0/b$j;

    invoke-direct {p0, p1}, Loi0/a;->c(Lri0/b$j;)V

    return-void

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
