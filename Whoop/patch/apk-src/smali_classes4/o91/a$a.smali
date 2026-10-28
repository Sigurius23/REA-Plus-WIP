.class public final Lo91/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo91/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JA\u0010\u000f\u001a$\u0012\u0004\u0012\u00020\t\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\nj\u0002`\u000e0\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R0\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00120\u00088\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010\u0014\u0012\u0004\u0008\u0017\u0010\u0003\u001a\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\t8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\t8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\t8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u0019\u00a8\u0006\u001c"
    }
    d2 = {
        "Lo91/a$a;",
        "",
        "<init>",
        "()V",
        "Ltr2/n;",
        "logger",
        "Lrr2/c;",
        "crashReporter",
        "",
        "",
        "Lkotlin/Function2;",
        "Lad3/k;",
        "Lkotlinx/serialization/json/JsonElement;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/json/serializers/DesignSystemModelFactory;",
        "b",
        "(Ltr2/n;Lrr2/c;)Ljava/util/Map;",
        "Lcom/whoop/design/json/e;",
        "Lj93/d;",
        "coreTypeModelMap",
        "Ljava/util/Map;",
        "a",
        "()Ljava/util/Map;",
        "getCoreTypeModelMap$design_models_release$annotations",
        "TYPE",
        "Ljava/lang/String;",
        "CONTENT",
        "PRIMARY_ANALYTIC_EVENT",
        "design-models_release"
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
    invoke-direct {p0}, Lo91/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/whoop/design/json/e;",
            "Lj93/d;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lo91/a;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ltr2/n;Lrr2/c;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr2/n;",
            "Lrr2/c;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lc93/m;",
            ">;"
        }
    .end annotation

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lo91/a$a;->a()Ljava/util/Map;

    move-result-object v0

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v2

    invoke-static {v2}, Lm83/g0;->W(I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/json/e;

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-static {v1, p1, p2}, Lo91/b;->b(Ljava/util/Map;Ltr2/n;Lrr2/c;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method
