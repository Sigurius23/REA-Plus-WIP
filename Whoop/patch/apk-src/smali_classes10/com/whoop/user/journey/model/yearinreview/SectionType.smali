.class public final enum Lcom/whoop/user/journey/model/yearinreview/SectionType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/user/journey/model/yearinreview/SectionType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/user/journey/model/yearinreview/SectionType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0087\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/whoop/user/journey/model/yearinreview/SectionType;",
        "",
        "Ly3/f;",
        "spacing",
        "<init>",
        "(Ljava/lang/String;IF)V",
        "F",
        "getSpacing-D9Ej5fM",
        "()F",
        "Companion",
        "COMPACT",
        "LARGE",
        "NORMAL",
        "user-journey_release"
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

.field private static final synthetic $VALUES:[Lcom/whoop/user/journey/model/yearinreview/SectionType;

.field private static final $cachedSerializer$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final enum COMPACT:Lcom/whoop/user/journey/model/yearinreview/SectionType;

.field public static final Companion:Lcom/whoop/user/journey/model/yearinreview/SectionType$Companion;

.field public static final enum LARGE:Lcom/whoop/user/journey/model/yearinreview/SectionType;

.field public static final enum NORMAL:Lcom/whoop/user/journey/model/yearinreview/SectionType;


# instance fields
.field private final spacing:F


# direct methods
.method private static final synthetic $values()[Lcom/whoop/user/journey/model/yearinreview/SectionType;
    .locals 3

    sget-object v0, Lcom/whoop/user/journey/model/yearinreview/SectionType;->COMPACT:Lcom/whoop/user/journey/model/yearinreview/SectionType;

    sget-object v1, Lcom/whoop/user/journey/model/yearinreview/SectionType;->LARGE:Lcom/whoop/user/journey/model/yearinreview/SectionType;

    sget-object v2, Lcom/whoop/user/journey/model/yearinreview/SectionType;->NORMAL:Lcom/whoop/user/journey/model/yearinreview/SectionType;

    filled-new-array {v0, v1, v2}, [Lcom/whoop/user/journey/model/yearinreview/SectionType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/user/journey/model/yearinreview/SectionType;

    const/4 v1, 0x2

    int-to-float v2, v1

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float/2addr v2, v3

    const-string v4, "COMPACT"

    const/4 v5, 0x0

    invoke-direct {v0, v4, v5, v2}, Lcom/whoop/user/journey/model/yearinreview/SectionType;-><init>(Ljava/lang/String;IF)V

    sput-object v0, Lcom/whoop/user/journey/model/yearinreview/SectionType;->COMPACT:Lcom/whoop/user/journey/model/yearinreview/SectionType;

    new-instance v0, Lcom/whoop/user/journey/model/yearinreview/SectionType;

    const/4 v2, 0x1

    mul-float v4, v3, v3

    const-string v5, "LARGE"

    invoke-direct {v0, v5, v2, v4}, Lcom/whoop/user/journey/model/yearinreview/SectionType;-><init>(Ljava/lang/String;IF)V

    sput-object v0, Lcom/whoop/user/journey/model/yearinreview/SectionType;->LARGE:Lcom/whoop/user/journey/model/yearinreview/SectionType;

    new-instance v0, Lcom/whoop/user/journey/model/yearinreview/SectionType;

    const/4 v2, 0x3

    int-to-float v2, v2

    mul-float/2addr v2, v3

    const-string v3, "NORMAL"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/user/journey/model/yearinreview/SectionType;-><init>(Ljava/lang/String;IF)V

    sput-object v0, Lcom/whoop/user/journey/model/yearinreview/SectionType;->NORMAL:Lcom/whoop/user/journey/model/yearinreview/SectionType;

    invoke-static {}, Lcom/whoop/user/journey/model/yearinreview/SectionType;->$values()[Lcom/whoop/user/journey/model/yearinreview/SectionType;

    move-result-object v0

    sput-object v0, Lcom/whoop/user/journey/model/yearinreview/SectionType;->$VALUES:[Lcom/whoop/user/journey/model/yearinreview/SectionType;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/user/journey/model/yearinreview/SectionType;->$ENTRIES:Lt83/a;

    new-instance v0, Lcom/whoop/user/journey/model/yearinreview/SectionType$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/user/journey/model/yearinreview/SectionType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/user/journey/model/yearinreview/SectionType;->Companion:Lcom/whoop/user/journey/model/yearinreview/SectionType$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Lcq2/a;

    const/16 v2, 0xf

    invoke-direct {v1, v2}, Lcq2/a;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/whoop/user/journey/model/yearinreview/SectionType;->$cachedSerializer$delegate:Ll83/h;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IF)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/whoop/user/journey/model/yearinreview/SectionType;->spacing:F

    return-void
.end method

.method private static final synthetic _init_$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.user.journey.model.yearinreview.SectionType"

    invoke-static {}, Lcom/whoop/user/journey/model/yearinreview/SectionType;->values()[Lcom/whoop/user/journey/model/yearinreview/SectionType;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/user/journey/model/yearinreview/SectionType;->_init_$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/user/journey/model/yearinreview/SectionType;->$cachedSerializer$delegate:Ll83/h;

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

    sget-object v0, Lcom/whoop/user/journey/model/yearinreview/SectionType;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/user/journey/model/yearinreview/SectionType;
    .locals 1

    const-class v0, Lcom/whoop/user/journey/model/yearinreview/SectionType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/user/journey/model/yearinreview/SectionType;

    return-object p0
.end method

.method public static values()[Lcom/whoop/user/journey/model/yearinreview/SectionType;
    .locals 1

    sget-object v0, Lcom/whoop/user/journey/model/yearinreview/SectionType;->$VALUES:[Lcom/whoop/user/journey/model/yearinreview/SectionType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/user/journey/model/yearinreview/SectionType;

    return-object v0
.end method


# virtual methods
.method public final getSpacing-D9Ej5fM()F
    .locals 1

    iget v0, p0, Lcom/whoop/user/journey/model/yearinreview/SectionType;->spacing:F

    return v0
.end method
