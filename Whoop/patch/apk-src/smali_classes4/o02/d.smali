.class public interface abstract Lo02/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006JE\u0010\u000e\u001a\u00020\u00002\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00072&\u0010\r\u001a\"\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\n\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000bj\u0002`\u000c0\tH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010\u00c0\u0006\u0003"
    }
    d2 = {
        "Lo02/d;",
        "",
        "Lcom/whoop/navigation/NavigationScreenModel;",
        "navigationScreenModel",
        "Lj02/c;",
        "a",
        "(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/c;",
        "",
        "mappers",
        "",
        "Lj93/d;",
        "Lkotlin/Function1;",
        "Lcom/whoop/navigation/reducer/NavigationScreenConfig;",
        "configs",
        "b",
        "(Ljava/util/List;Ljava/util/Map;)Lo02/d;",
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


# virtual methods
.method public abstract a(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/c;
.end method

.method public b(Ljava/util/List;Ljava/util/Map;)Lo02/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lo02/d;",
            ">;",
            "Ljava/util/Map<",
            "Lj93/d;",
            "+",
            "Lkotlin/jvm/functions/Function1;",
            ">;)",
            "Lo02/d;"
        }
    .end annotation

    const-string v0, "mappers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "configs"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
