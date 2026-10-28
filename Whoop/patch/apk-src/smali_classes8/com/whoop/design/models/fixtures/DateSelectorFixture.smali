.class public final Lcom/whoop/design/models/fixtures/DateSelectorFixture;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0006\u001a\u0004\u0008\n\u0010\u0008R\u0017\u0010\u000b\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0006\u001a\u0004\u0008\u000c\u0010\u0008R\u0017\u0010\u000e\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u000f\u001a\u0004\u0008\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u000f\u001a\u0004\u0008\u0015\u0010\u0011\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/whoop/design/models/fixtures/DateSelectorFixture;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/design/models/items/DateSelectorModel;",
        "weekDateSelectorModel",
        "Lcom/whoop/design/models/items/DateSelectorModel;",
        "getWeekDateSelectorModel",
        "()Lcom/whoop/design/models/items/DateSelectorModel;",
        "monthDateSelectorModel",
        "getMonthDateSelectorModel",
        "sixMonthSelectorModel",
        "getSixMonthSelectorModel",
        "Li11/f;",
        "weekDateSelectorState",
        "Li11/f;",
        "getWeekDateSelectorState",
        "()Li11/f;",
        "monthDateSelectorState",
        "getMonthDateSelectorState",
        "sixMonthDateSelectorState",
        "getSixMonthDateSelectorState",
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


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/whoop/design/models/fixtures/DateSelectorFixture;

.field private static final monthDateSelectorModel:Lcom/whoop/design/models/items/DateSelectorModel;

.field private static final monthDateSelectorState:Li11/f;

.field private static final sixMonthDateSelectorState:Li11/f;

.field private static final sixMonthSelectorModel:Lcom/whoop/design/models/items/DateSelectorModel;

.field private static final weekDateSelectorModel:Lcom/whoop/design/models/items/DateSelectorModel;

.field private static final weekDateSelectorState:Li11/f;


# direct methods
.method static constructor <clinit>()V
    .locals 17

    new-instance v0, Lcom/whoop/design/models/fixtures/DateSelectorFixture;

    invoke-direct {v0}, Lcom/whoop/design/models/fixtures/DateSelectorFixture;-><init>()V

    sput-object v0, Lcom/whoop/design/models/fixtures/DateSelectorFixture;->INSTANCE:Lcom/whoop/design/models/fixtures/DateSelectorFixture;

    new-instance v1, Lcom/whoop/design/models/items/DateSelectorModel;

    const/16 v9, 0x78

    const/4 v10, 0x0

    const-string v2, "Mar 8 - Mar 14, 2022"

    const-string v3, "Feb 22 - Feb 28, 2022"

    const-string v4, "Mar 1 - Mar 7, 2022"

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/whoop/design/models/items/DateSelectorModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/DateStripModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lcom/whoop/design/models/fixtures/DateSelectorFixture;->weekDateSelectorModel:Lcom/whoop/design/models/items/DateSelectorModel;

    new-instance v2, Lcom/whoop/design/models/items/DateSelectorModel;

    const/16 v10, 0x78

    const/4 v11, 0x0

    const-string v3, "Apr 1 - Apr 30, 2022"

    const-string v4, "Feb 1 - Feb 28, 2022"

    const-string v5, "Mar 1 - Mar 31, 2022"

    const/4 v9, 0x0

    invoke-direct/range {v2 .. v11}, Lcom/whoop/design/models/items/DateSelectorModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/DateStripModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, Lcom/whoop/design/models/fixtures/DateSelectorFixture;->monthDateSelectorModel:Lcom/whoop/design/models/items/DateSelectorModel;

    new-instance v3, Lcom/whoop/design/models/items/DateSelectorModel;

    const/16 v11, 0x78

    const/4 v12, 0x0

    const-string v4, "Jul 1 - Dec 31, 2022"

    const-string v5, "Jul 1 - Dec 31, 2021"

    const-string v6, "Jan 1 - Jun 30, 2022"

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v12}, Lcom/whoop/design/models/items/DateSelectorModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/DateStripModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v3, Lcom/whoop/design/models/fixtures/DateSelectorFixture;->sixMonthSelectorModel:Lcom/whoop/design/models/items/DateSelectorModel;

    sget-object v5, Ll0/m;->e:Ll0/h;

    const-string v0, "Mar 1 - Mar 7, 2022"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    new-instance v4, Li11/f;

    const/16 v15, 0x3c0

    const/16 v16, 0x0

    const/4 v7, 0x1

    const-string v8, "Feb 22 - Feb 28, 2022"

    const/4 v9, 0x1

    const-string v10, "Mar 8 - Mar 14, 2022"

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v4 .. v16}, Li11/f;-><init>(Ll0/i;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;ZLjava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Li11/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v4, Lcom/whoop/design/models/fixtures/DateSelectorFixture;->weekDateSelectorState:Li11/f;

    const-string v0, "Mar 1 - Mar 31, 2022"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    new-instance v4, Li11/f;

    const-string v8, "Feb 1 - Feb 28, 2022"

    const-string v10, "Apr 1 - Apr 30, 2022"

    invoke-direct/range {v4 .. v16}, Li11/f;-><init>(Ll0/i;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;ZLjava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Li11/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v4, Lcom/whoop/design/models/fixtures/DateSelectorFixture;->monthDateSelectorState:Li11/f;

    const-string v0, "Jan 1 - Jun 30, 2022"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    new-instance v4, Li11/f;

    const-string v8, "Jul 1 - Dec 31, 2021"

    const-string v10, "Jul 1 - Dec 31, 2022"

    invoke-direct/range {v4 .. v16}, Li11/f;-><init>(Ll0/i;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;ZLjava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Li11/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v4, Lcom/whoop/design/models/fixtures/DateSelectorFixture;->sixMonthDateSelectorState:Li11/f;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/fixtures/DateSelectorFixture;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getMonthDateSelectorModel()Lcom/whoop/design/models/items/DateSelectorModel;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/fixtures/DateSelectorFixture;->monthDateSelectorModel:Lcom/whoop/design/models/items/DateSelectorModel;

    return-object v0
.end method

.method public final getMonthDateSelectorState()Li11/f;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/fixtures/DateSelectorFixture;->monthDateSelectorState:Li11/f;

    return-object v0
.end method

.method public final getSixMonthDateSelectorState()Li11/f;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/fixtures/DateSelectorFixture;->sixMonthDateSelectorState:Li11/f;

    return-object v0
.end method

.method public final getSixMonthSelectorModel()Lcom/whoop/design/models/items/DateSelectorModel;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/fixtures/DateSelectorFixture;->sixMonthSelectorModel:Lcom/whoop/design/models/items/DateSelectorModel;

    return-object v0
.end method

.method public final getWeekDateSelectorModel()Lcom/whoop/design/models/items/DateSelectorModel;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/fixtures/DateSelectorFixture;->weekDateSelectorModel:Lcom/whoop/design/models/items/DateSelectorModel;

    return-object v0
.end method

.method public final getWeekDateSelectorState()Li11/f;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/fixtures/DateSelectorFixture;->weekDateSelectorState:Li11/f;

    return-object v0
.end method
