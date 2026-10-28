.class public final enum Lcom/whoop/design/models/calendar/archmini/CalendarDayType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/design/models/calendar/archmini/CalendarDayType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\u0008\u0002\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/design/models/calendar/archmini/CalendarDayType;",
        "",
        "Lj93/d;",
        "Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;",
        "modelType",
        "<init>",
        "(Ljava/lang/String;ILj93/d;)V",
        "Lj93/d;",
        "getModelType",
        "()Lj93/d;",
        "HORMONAL_INSIGHTS_CALENDAR_DAY",
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
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lcom/whoop/design/models/calendar/archmini/CalendarDayType;

.field public static final enum HORMONAL_INSIGHTS_CALENDAR_DAY:Lcom/whoop/design/models/calendar/archmini/CalendarDayType;


# instance fields
.field private final modelType:Lj93/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj93/d;"
        }
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/whoop/design/models/calendar/archmini/CalendarDayType;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/calendar/archmini/CalendarDayType;->HORMONAL_INSIGHTS_CALENDAR_DAY:Lcom/whoop/design/models/calendar/archmini/CalendarDayType;

    filled-new-array {v0}, [Lcom/whoop/design/models/calendar/archmini/CalendarDayType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/design/models/calendar/archmini/CalendarDayType;

    const-class v1, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v2, "HORMONAL_INSIGHTS_CALENDAR_DAY"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lcom/whoop/design/models/calendar/archmini/CalendarDayType;-><init>(Ljava/lang/String;ILj93/d;)V

    sput-object v0, Lcom/whoop/design/models/calendar/archmini/CalendarDayType;->HORMONAL_INSIGHTS_CALENDAR_DAY:Lcom/whoop/design/models/calendar/archmini/CalendarDayType;

    invoke-static {}, Lcom/whoop/design/models/calendar/archmini/CalendarDayType;->$values()[Lcom/whoop/design/models/calendar/archmini/CalendarDayType;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/calendar/archmini/CalendarDayType;->$VALUES:[Lcom/whoop/design/models/calendar/archmini/CalendarDayType;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/calendar/archmini/CalendarDayType;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILj93/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj93/d;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/whoop/design/models/calendar/archmini/CalendarDayType;->modelType:Lj93/d;

    return-void
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/design/models/calendar/archmini/CalendarDayType;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/design/models/calendar/archmini/CalendarDayType;
    .locals 1

    const-class v0, Lcom/whoop/design/models/calendar/archmini/CalendarDayType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/design/models/calendar/archmini/CalendarDayType;

    return-object p0
.end method

.method public static values()[Lcom/whoop/design/models/calendar/archmini/CalendarDayType;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/calendar/archmini/CalendarDayType;->$VALUES:[Lcom/whoop/design/models/calendar/archmini/CalendarDayType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/design/models/calendar/archmini/CalendarDayType;

    return-object v0
.end method


# virtual methods
.method public final getModelType()Lj93/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj93/d;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/CalendarDayType;->modelType:Lj93/d;

    return-object v0
.end method
