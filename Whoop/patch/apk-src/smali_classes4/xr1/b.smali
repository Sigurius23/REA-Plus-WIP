.class public final Lxr1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo02/d;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lxr1/b;",
        "Lo02/d;",
        "<init>",
        "()V",
        "Lcom/whoop/navigation/NavigationScreenModel;",
        "navigationScreenModel",
        "Lj02/m0;",
        "c",
        "(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/m0;",
        "journal_release"
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
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/c;
    .locals 0

    invoke-virtual {p0, p1}, Lxr1/b;->c(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/m0;

    move-result-object p1

    return-object p1
.end method

.method public bridge b(Ljava/util/List;Ljava/util/Map;)Lo02/d;
    .locals 0
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

    invoke-super {p0, p1, p2}, Lo02/d;->b(Ljava/util/List;Ljava/util/Map;)Lo02/d;

    move-result-object p1

    return-object p1
.end method

.method public c(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/m0;
    .locals 19

    move-object/from16 v0, p1

    const-string v1, "navigationScreenModel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, v0, Lcom/whoop/navigation/InterdayJournalScreenModel;

    if-eqz v1, :cond_1

    new-instance v2, Lj02/m0$e2;

    check-cast v0, Lcom/whoop/navigation/InterdayJournalScreenModel;

    invoke-virtual {v0}, Lcom/whoop/navigation/InterdayJournalScreenModel;->getDate()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/whoop/navigation/InterdayJournalScreenModel;->getCycleId()J

    move-result-wide v6

    invoke-static {}, Ljava/time/LocalDate;->now()Ljava/time/LocalDate;

    move-result-object v10

    const-string v1, "now(...)"

    invoke-static {v10, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/time/LocalDate;->now()Ljava/time/LocalDate;

    move-result-object v11

    invoke-virtual {v0}, Lcom/whoop/navigation/InterdayJournalScreenModel;->getSource()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    move-object v13, v0

    const/16 v17, 0x1d00

    const/16 v18, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v2 .. v18}, Lj02/m0$e2;-><init>(Ljava/lang/String;ZZJLjava/lang/Long;Ljava/lang/Long;Ljava/time/LocalDate;Ljava/time/LocalDate;ZLjava/lang/String;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_1
    sget-object v0, Lj02/m0$j3;->b:Lj02/m0$j3;

    return-object v0
.end method
