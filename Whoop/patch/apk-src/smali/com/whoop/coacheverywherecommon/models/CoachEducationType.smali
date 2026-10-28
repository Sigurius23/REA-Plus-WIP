.class public final enum Lcom/whoop/coacheverywherecommon/models/CoachEducationType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/coacheverywherecommon/models/CoachEducationType$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/coacheverywherecommon/models/CoachEducationType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0087\u0081\u0002\u0018\u0000 \u00042\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/whoop/coacheverywherecommon/models/CoachEducationType;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Companion",
        "a",
        "COACH_EVERYWHERE_DAY_ZERO",
        "OVERLAY_COACH_EVERYWHERE",
        "NONE",
        "coach-everywhere-common_release"
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

.field private static final synthetic $VALUES:[Lcom/whoop/coacheverywherecommon/models/CoachEducationType;

.field private static final $cachedSerializer$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final enum COACH_EVERYWHERE_DAY_ZERO:Lcom/whoop/coacheverywherecommon/models/CoachEducationType;
    .annotation runtime Lwc3/h;
        value = "COACH_EVERYWHERE_DAY_ZERO"
    .end annotation
.end field

.field public static final Companion:Lcom/whoop/coacheverywherecommon/models/CoachEducationType$a;

.field public static final enum NONE:Lcom/whoop/coacheverywherecommon/models/CoachEducationType;
    .annotation runtime Lwc3/h;
        value = "NONE"
    .end annotation
.end field

.field public static final enum OVERLAY_COACH_EVERYWHERE:Lcom/whoop/coacheverywherecommon/models/CoachEducationType;
    .annotation runtime Lwc3/h;
        value = "OVERLAY_COACH_EVERYWHERE"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/whoop/coacheverywherecommon/models/CoachEducationType;
    .locals 3

    sget-object v0, Lcom/whoop/coacheverywherecommon/models/CoachEducationType;->COACH_EVERYWHERE_DAY_ZERO:Lcom/whoop/coacheverywherecommon/models/CoachEducationType;

    sget-object v1, Lcom/whoop/coacheverywherecommon/models/CoachEducationType;->OVERLAY_COACH_EVERYWHERE:Lcom/whoop/coacheverywherecommon/models/CoachEducationType;

    sget-object v2, Lcom/whoop/coacheverywherecommon/models/CoachEducationType;->NONE:Lcom/whoop/coacheverywherecommon/models/CoachEducationType;

    filled-new-array {v0, v1, v2}, [Lcom/whoop/coacheverywherecommon/models/CoachEducationType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/coacheverywherecommon/models/CoachEducationType;

    const-string v1, "COACH_EVERYWHERE_DAY_ZERO"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/coacheverywherecommon/models/CoachEducationType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/coacheverywherecommon/models/CoachEducationType;->COACH_EVERYWHERE_DAY_ZERO:Lcom/whoop/coacheverywherecommon/models/CoachEducationType;

    new-instance v0, Lcom/whoop/coacheverywherecommon/models/CoachEducationType;

    const-string v1, "OVERLAY_COACH_EVERYWHERE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/coacheverywherecommon/models/CoachEducationType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/coacheverywherecommon/models/CoachEducationType;->OVERLAY_COACH_EVERYWHERE:Lcom/whoop/coacheverywherecommon/models/CoachEducationType;

    new-instance v0, Lcom/whoop/coacheverywherecommon/models/CoachEducationType;

    const-string v1, "NONE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/whoop/coacheverywherecommon/models/CoachEducationType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/coacheverywherecommon/models/CoachEducationType;->NONE:Lcom/whoop/coacheverywherecommon/models/CoachEducationType;

    invoke-static {}, Lcom/whoop/coacheverywherecommon/models/CoachEducationType;->$values()[Lcom/whoop/coacheverywherecommon/models/CoachEducationType;

    move-result-object v0

    sput-object v0, Lcom/whoop/coacheverywherecommon/models/CoachEducationType;->$VALUES:[Lcom/whoop/coacheverywherecommon/models/CoachEducationType;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/coacheverywherecommon/models/CoachEducationType;->$ENTRIES:Lt83/a;

    new-instance v0, Lcom/whoop/coacheverywherecommon/models/CoachEducationType$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/coacheverywherecommon/models/CoachEducationType$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/coacheverywherecommon/models/CoachEducationType;->Companion:Lcom/whoop/coacheverywherecommon/models/CoachEducationType$a;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Lep0/a;

    invoke-direct {v1, v2}, Lep0/a;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/whoop/coacheverywherecommon/models/CoachEducationType;->$cachedSerializer$delegate:Ll83/h;

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

    invoke-static {}, Lcom/whoop/coacheverywherecommon/models/CoachEducationType;->values()[Lcom/whoop/coacheverywherecommon/models/CoachEducationType;

    move-result-object v0

    const-string v1, "OVERLAY_COACH_EVERYWHERE"

    const-string v2, "NONE"

    const-string v3, "COACH_EVERYWHERE_DAY_ZERO"

    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    filled-new-array {v2, v2, v2}, [[Ljava/lang/annotation/Annotation;

    move-result-object v3

    const-string v4, "com.whoop.coacheverywherecommon.models.CoachEducationType"

    invoke-static {v4, v0, v1, v3, v2}, Lkotlinx/serialization/internal/EnumsKt;->createAnnotatedEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/coacheverywherecommon/models/CoachEducationType;->_init_$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/coacheverywherecommon/models/CoachEducationType;->$cachedSerializer$delegate:Ll83/h;

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

    sget-object v0, Lcom/whoop/coacheverywherecommon/models/CoachEducationType;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/coacheverywherecommon/models/CoachEducationType;
    .locals 1

    const-class v0, Lcom/whoop/coacheverywherecommon/models/CoachEducationType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/coacheverywherecommon/models/CoachEducationType;

    return-object p0
.end method

.method public static values()[Lcom/whoop/coacheverywherecommon/models/CoachEducationType;
    .locals 1

    sget-object v0, Lcom/whoop/coacheverywherecommon/models/CoachEducationType;->$VALUES:[Lcom/whoop/coacheverywherecommon/models/CoachEducationType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/coacheverywherecommon/models/CoachEducationType;

    return-object v0
.end method
