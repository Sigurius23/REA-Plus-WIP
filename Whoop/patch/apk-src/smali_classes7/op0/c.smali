.class public final enum Lop0/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lop0/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0014\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001BU\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u000e\u001a\u0004\u0008\u0011\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u000e\u001a\u0004\u0008\u0012\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u000e\u001a\u0004\u0008\u0013\u0010\u0010R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u000e\u001a\u0004\u0008\u0017\u0010\u0010R\u0017\u0010\n\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0014\u001a\u0004\u0008\u0018\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0014\u001a\u0004\u0008\u000b\u0010\u0016j\u0002\u0008\u0019j\u0002\u0008\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lop0/c;",
        "",
        "",
        "title",
        "descriptionOne",
        "descriptionTwo",
        "backgroundImage",
        "",
        "backButtonVisibility",
        "nextButtonText",
        "nextButtonVisibility",
        "isCloseIconVisible",
        "<init>",
        "(Ljava/lang/String;IIIIIZIZZ)V",
        "I",
        "getTitle",
        "()I",
        "getDescriptionOne",
        "getDescriptionTwo",
        "getBackgroundImage",
        "Z",
        "getBackButtonVisibility",
        "()Z",
        "getNextButtonText",
        "getNextButtonVisibility",
        "ONBOARDING_SCREEN_PLANNER_ONE",
        "ONBOARDING_SCREEN_PLANNER_TWO",
        "sleep-coach_release"
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

.field private static final synthetic $VALUES:[Lop0/c;

.field public static final enum ONBOARDING_SCREEN_PLANNER_ONE:Lop0/c;

.field public static final enum ONBOARDING_SCREEN_PLANNER_TWO:Lop0/c;


# instance fields
.field private final backButtonVisibility:Z

.field private final backgroundImage:I

.field private final descriptionOne:I

.field private final descriptionTwo:I

.field private final isCloseIconVisible:Z

.field private final nextButtonText:I

.field private final nextButtonVisibility:Z

.field private final title:I


# direct methods
.method private static final synthetic $values()[Lop0/c;
    .locals 2

    sget-object v0, Lop0/c;->ONBOARDING_SCREEN_PLANNER_ONE:Lop0/c;

    sget-object v1, Lop0/c;->ONBOARDING_SCREEN_PLANNER_TWO:Lop0/c;

    filled-new-array {v0, v1}, [Lop0/c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 12

    sget v3, Lqe2/g;->t0:I

    sget v4, Lqe2/g;->r0:I

    sget v5, Lqe2/g;->f1:I

    sget v6, Lqe2/d;->j:I

    sget v8, Lqe2/g;->h:I

    new-instance v0, Lop0/c;

    const/4 v9, 0x1

    const/4 v10, 0x1

    const-string v1, "ONBOARDING_SCREEN_PLANNER_ONE"

    const/4 v2, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v10}, Lop0/c;-><init>(Ljava/lang/String;IIIIIZIZZ)V

    sput-object v0, Lop0/c;->ONBOARDING_SCREEN_PLANNER_ONE:Lop0/c;

    new-instance v1, Lop0/c;

    sget v4, Lqe2/g;->u0:I

    sget v5, Lqe2/g;->g1:I

    sget v6, Lqe2/g;->s0:I

    sget v7, Lqe2/d;->i:I

    sget v9, Lqe2/g;->k1:I

    const/4 v11, 0x0

    const-string v2, "ONBOARDING_SCREEN_PLANNER_TWO"

    const/4 v3, 0x1

    const/4 v8, 0x1

    invoke-direct/range {v1 .. v11}, Lop0/c;-><init>(Ljava/lang/String;IIIIIZIZZ)V

    sput-object v1, Lop0/c;->ONBOARDING_SCREEN_PLANNER_TWO:Lop0/c;

    invoke-static {}, Lop0/c;->$values()[Lop0/c;

    move-result-object v0

    sput-object v0, Lop0/c;->$VALUES:[Lop0/c;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lop0/c;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IIIIIZIZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIIZIZZ)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput p3, p0, Lop0/c;->title:I

    .line 3
    iput p4, p0, Lop0/c;->descriptionOne:I

    .line 4
    iput p5, p0, Lop0/c;->descriptionTwo:I

    .line 5
    iput p6, p0, Lop0/c;->backgroundImage:I

    .line 6
    iput-boolean p7, p0, Lop0/c;->backButtonVisibility:Z

    .line 7
    iput p8, p0, Lop0/c;->nextButtonText:I

    .line 8
    iput-boolean p9, p0, Lop0/c;->nextButtonVisibility:Z

    .line 9
    iput-boolean p10, p0, Lop0/c;->isCloseIconVisible:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IIIIIZIZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p12, p11, 0x2

    const/4 v0, 0x0

    if-eqz p12, :cond_0

    move p4, v0

    :cond_0
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_1

    move p5, v0

    :cond_1
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_2

    move p7, v0

    :cond_2
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_3

    move p8, v0

    :cond_3
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_4

    move p9, v0

    :cond_4
    and-int/lit16 p11, p11, 0x80

    if-eqz p11, :cond_5

    move p11, v0

    :goto_0
    move p10, p9

    move p9, p8

    move p8, p7

    move p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_5
    move p11, p10

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {p1 .. p11}, Lop0/c;-><init>(Ljava/lang/String;IIIIIZIZZ)V

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

    sget-object v0, Lop0/c;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lop0/c;
    .locals 1

    const-class v0, Lop0/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lop0/c;

    return-object p0
.end method

.method public static values()[Lop0/c;
    .locals 1

    sget-object v0, Lop0/c;->$VALUES:[Lop0/c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lop0/c;

    return-object v0
.end method


# virtual methods
.method public final getBackButtonVisibility()Z
    .locals 1

    iget-boolean v0, p0, Lop0/c;->backButtonVisibility:Z

    return v0
.end method

.method public final getBackgroundImage()I
    .locals 1

    iget v0, p0, Lop0/c;->backgroundImage:I

    return v0
.end method

.method public final getDescriptionOne()I
    .locals 1

    iget v0, p0, Lop0/c;->descriptionOne:I

    return v0
.end method

.method public final getDescriptionTwo()I
    .locals 1

    iget v0, p0, Lop0/c;->descriptionTwo:I

    return v0
.end method

.method public final getNextButtonText()I
    .locals 1

    iget v0, p0, Lop0/c;->nextButtonText:I

    return v0
.end method

.method public final getNextButtonVisibility()Z
    .locals 1

    iget-boolean v0, p0, Lop0/c;->nextButtonVisibility:Z

    return v0
.end method

.method public final getTitle()I
    .locals 1

    iget v0, p0, Lop0/c;->title:I

    return v0
.end method

.method public final isCloseIconVisible()Z
    .locals 1

    iget-boolean v0, p0, Lop0/c;->isCloseIconVisible:Z

    return v0
.end method
