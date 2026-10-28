.class public final Lxr1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo02/d;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lxr1/c;",
        "Lo02/d;",
        "Lzr2/a;",
        "dateAndTimeProvider",
        "<init>",
        "(Lzr2/a;)V",
        "Lcom/whoop/navigation/NavigationScreenModel;",
        "navigationScreenModel",
        "Lj02/m0;",
        "c",
        "(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/m0;",
        "a",
        "Lzr2/a;",
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

.annotation runtime Ll83/c;
.end annotation


# instance fields
.field private final a:Lzr2/a;


# direct methods
.method public constructor <init>(Lzr2/a;)V
    .locals 1

    const-string v0, "dateAndTimeProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxr1/c;->a:Lzr2/a;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/c;
    .locals 0

    invoke-virtual {p0, p1}, Lxr1/c;->c(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/m0;

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
    .locals 22

    move-object/from16 v0, p1

    const-string v1, "navigationScreenModel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, v0, Lcom/whoop/navigation/JournalScreenModel;

    if-eqz v1, :cond_0

    move-object/from16 v1, p0

    iget-object v2, v1, Lxr1/c;->a:Lzr2/a;

    invoke-interface {v2}, Lzr2/a;->d()Lorg/joda/time/LocalDate;

    move-result-object v2

    invoke-virtual {v2}, Lorg/joda/time/LocalDate;->getYear()I

    move-result v3

    invoke-virtual {v2}, Lorg/joda/time/LocalDate;->getMonthOfYear()I

    move-result v4

    invoke-virtual {v2}, Lorg/joda/time/LocalDate;->getDayOfMonth()I

    move-result v2

    invoke-static {v3, v4, v2}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    move-result-object v13

    check-cast v0, Lcom/whoop/navigation/JournalScreenModel;

    invoke-virtual {v0}, Lcom/whoop/navigation/JournalScreenModel;->getShouldShowOnboarding()Z

    move-result v8

    invoke-virtual {v0}, Lcom/whoop/navigation/JournalScreenModel;->getSource()Ljava/lang/String;

    move-result-object v16

    invoke-static {v13}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v5, Lj02/m0$e2;

    const/16 v20, 0x1d01

    const/16 v21, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v9, -0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object v14, v13

    invoke-direct/range {v5 .. v21}, Lj02/m0$e2;-><init>(Ljava/lang/String;ZZJLjava/lang/Long;Ljava/lang/Long;Ljava/time/LocalDate;Ljava/time/LocalDate;ZLjava/lang/String;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5

    :cond_0
    move-object/from16 v1, p0

    sget-object v0, Lj02/m0$j3;->b:Lj02/m0$j3;

    return-object v0
.end method
