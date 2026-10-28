.class public abstract Lcom/whoop/archv2/feature/domain/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a)\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0006*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\u0008\t\u0010\n\"\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/whoop/archv2/feature/domain/m;",
        "Lad3/c;",
        "json",
        "Lcom/whoop/archv2/feature/domain/a;",
        "b",
        "(Lcom/whoop/archv2/feature/domain/m;Lad3/c;)Lcom/whoop/archv2/feature/domain/a;",
        "",
        "Lkotlinx/serialization/json/JsonElement;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "a",
        "(Ljava/util/List;Lad3/c;)Ljava/util/List;",
        "Ltr2/n;",
        "Ltr2/n;",
        "logger",
        "arch-v2_release"
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

    const-string v1, "GenericTopItems"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sput-object v0, Lcom/whoop/archv2/feature/domain/n;->a:Ltr2/n;

    return-void
.end method

.method private static final a(Ljava/util/List;Lad3/c;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;",
            "Lad3/c;",
            ")",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    :try_start_0
    iget-object v2, p1, Lad3/c;->b:Lcd3/f;

    const-class v3, Lcom/whoop/design/models/DesignSystemModel;

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-static {v2, v3}, Lvb/g;->e(Lcd3/f;Lj93/d;)Lwc3/c;

    move-result-object v2

    check-cast v2, Lwc3/b;

    invoke-virtual {p1, v2, v1}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/design/models/DesignSystemModel;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    sget-object v2, Lcom/whoop/archv2/feature/domain/n;->a:Ltr2/n;

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    const-string v4, "Failed to decode DesignSystemModel from topItems"

    invoke-interface {v2, v4, v1, v3}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0

    :cond_3
    :goto_2
    sget-object p0, Lm83/y;->w:Lm83/y;

    return-object p0
.end method

.method public static final b(Lcom/whoop/archv2/feature/domain/m;Lad3/c;)Lcom/whoop/archv2/feature/domain/a;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/archv2/feature/domain/m;->b()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/archv2/feature/domain/m;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/whoop/archv2/feature/domain/a;

    invoke-virtual {p0}, Lcom/whoop/archv2/feature/domain/m;->b()Ljava/util/List;

    move-result-object v2

    invoke-static {v2, p1}, Lcom/whoop/archv2/feature/domain/n;->a(Ljava/util/List;Lad3/c;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/archv2/feature/domain/m;->a()Ljava/util/List;

    move-result-object p0

    invoke-static {p0, p1}, Lcom/whoop/archv2/feature/domain/n;->a(Ljava/util/List;Lad3/c;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, v2, p0}, Lcom/whoop/archv2/feature/domain/a;-><init>(Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v0}, Lcom/whoop/archv2/feature/domain/a;->b()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    if-eqz p0, :cond_2

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_3

    :cond_2
    invoke-virtual {v0}, Lcom/whoop/archv2/feature/domain/a;->a()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    if-eqz p0, :cond_4

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_3

    goto :goto_0

    :cond_3
    return-object v0

    :cond_4
    :goto_0
    return-object v1
.end method
