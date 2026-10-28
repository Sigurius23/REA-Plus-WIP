.class public final Lo31/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lo31/a;",
        "",
        "<init>",
        "()V",
        "",
        "keyword",
        "stateUpdateSearchKey",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "a",
        "(Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/whoopaction/domain/models/Action;",
        "design_release"
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
.field public static final a:Lo31/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo31/a;

    invoke-direct {v0}, Lo31/a;-><init>()V

    sput-object v0, Lo31/a;->a:Lo31/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/whoopaction/domain/models/Action;
    .locals 5

    const-string v0, "keyword"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stateUpdateSearchKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p2, v1

    :goto_0
    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-lez v0, :cond_1

    new-instance v0, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;

    invoke-static {p1}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p1

    new-instance v4, Ll83/k;

    invoke-direct {v4, p2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p1

    invoke-direct {v0, p1, v3, v2, v1}, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;-><init>(Ljava/util/Map;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_1
    new-instance p1, Lcom/whoop/whoopaction/domain/models/StateClearAction;

    invoke-static {p2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-direct {p1, p2, v3, v2, v1}, Lcom/whoop/whoopaction/domain/models/StateClearAction;-><init>(Ljava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_2
    return-object v1
.end method
