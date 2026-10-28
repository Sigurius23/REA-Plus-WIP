.class public final Le51/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\u0008\u001a\u00020\u0001*\u00020\u00042\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ#\u0010\u000b\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Le51/g;",
        "",
        "<init>",
        "()V",
        "Le51/h$b;",
        "",
        "Le51/p;",
        "tags",
        "b",
        "(Le51/h$b;Ljava/util/List;)Ljava/lang/Object;",
        "event",
        "a",
        "(Ljava/lang/Object;Ljava/util/List;)Ljava/lang/Object;",
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
.field public static final a:Le51/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le51/g;

    invoke-direct {v0}, Le51/g;-><init>()V

    sput-object v0, Le51/g;->a:Le51/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b(Le51/h$b;Ljava/util/List;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le51/h$b;",
            "Ljava/util/List<",
            "Le51/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Le51/p;

    invoke-virtual {v1}, Le51/p;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Le51/h$b;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Le51/p;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Le51/p;->a()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object p2

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Lcom/whoop/design/item/DesignItemInteraction;

    invoke-direct {v0, p1, p2}, Lcom/whoop/design/item/DesignItemInteraction;-><init>(Ljava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;)V

    return-object v0

    :cond_3
    :goto_1
    return-object p1
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/util/List;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/util/List<",
            "Le51/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tags"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Le51/h$a;

    if-eqz v0, :cond_0

    check-cast p1, Le51/h$a;

    invoke-virtual {p1}, Le51/h$a;->a()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Le51/h$b;

    if-eqz v0, :cond_1

    check-cast p1, Le51/h$b;

    invoke-direct {p0, p1, p2}, Le51/g;->b(Le51/h$b;Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    :cond_1
    return-object p1
.end method
