.class public final enum Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0087\u0081\u0002\u0018\u0000 \u00082\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0008B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "YES",
        "NO",
        "INVALID",
        "EMPTY",
        "Companion",
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

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;

.field private static final $cachedSerializer$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus$Companion;

.field public static final enum EMPTY:Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;
    .annotation runtime Lwc3/h;
        value = "EMPTY"
    .end annotation
.end field

.field public static final enum INVALID:Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;
    .annotation runtime Lwc3/h;
        value = "INVALID"
    .end annotation
.end field

.field public static final enum NO:Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;
    .annotation runtime Lwc3/h;
        value = "NO"
    .end annotation
.end field

.field public static final enum YES:Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;
    .annotation runtime Lwc3/h;
        value = "YES"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;
    .locals 4

    sget-object v0, Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;->YES:Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;

    sget-object v1, Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;->NO:Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;

    sget-object v2, Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;->INVALID:Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;

    sget-object v3, Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;->EMPTY:Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;

    filled-new-array {v0, v1, v2, v3}, [Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;

    const-string v1, "YES"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;->YES:Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;

    new-instance v0, Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;

    const-string v1, "NO"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;->NO:Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;

    new-instance v0, Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;

    const-string v1, "INVALID"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;->INVALID:Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;

    new-instance v0, Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;

    const-string v1, "EMPTY"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;->EMPTY:Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;

    invoke-static {}, Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;->$values()[Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;->$VALUES:[Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;->$ENTRIES:Lt83/a;

    new-instance v0, Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;->Companion:Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Ls51/p;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Ls51/p;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;->$cachedSerializer$delegate:Ll83/h;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic _init_$_anonymous_()Lwc3/c;
    .locals 5

    invoke-static {}, Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;->values()[Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;

    move-result-object v0

    const-string v1, "INVALID"

    const-string v2, "EMPTY"

    const-string v3, "YES"

    const-string v4, "NO"

    filled-new-array {v3, v4, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    filled-new-array {v2, v2, v2, v2}, [[Ljava/lang/annotation/Annotation;

    move-result-object v3

    const-string v4, "com.whoop.design.models.calendar.BehaviorsCalendarDayStatus"

    invoke-static {v4, v0, v1, v3, v2}, Lkotlinx/serialization/internal/EnumsKt;->createAnnotatedEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;->_init_$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;->$cachedSerializer$delegate:Ll83/h;

    return-object v0
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;
    .locals 1

    const-class v0, Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;

    return-object p0
.end method

.method public static values()[Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;->$VALUES:[Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;

    return-object v0
.end method
