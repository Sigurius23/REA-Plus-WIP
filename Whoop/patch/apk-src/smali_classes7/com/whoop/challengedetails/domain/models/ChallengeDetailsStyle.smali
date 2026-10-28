.class public final enum Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0081\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;",
        "",
        "Ly81/f;",
        "color",
        "<init>",
        "(Ljava/lang/String;ILy81/f;)V",
        "Ly81/f;",
        "getColor",
        "()Ly81/f;",
        "Companion",
        "CHALLENGE",
        "challenge-details_release"
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

.field private static final synthetic $VALUES:[Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;

.field private static final $cachedSerializer$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final enum CHALLENGE:Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;

.field public static final Companion:Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle$Companion;


# instance fields
.field private final color:Ly81/f;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;
    .locals 1

    sget-object v0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;->CHALLENGE:Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;

    filled-new-array {v0}, [Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;

    const/4 v1, 0x0

    sget-object v2, Ly81/f;->BRAND_WHOOP_PRO:Ly81/f;

    const-string v3, "CHALLENGE"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;-><init>(Ljava/lang/String;ILy81/f;)V

    sput-object v0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;->CHALLENGE:Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;

    invoke-static {}, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;->$values()[Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;

    move-result-object v0

    sput-object v0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;->$VALUES:[Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;->$ENTRIES:Lt83/a;

    new-instance v0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;->Companion:Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Lkg2/d;

    const/16 v2, 0xd

    invoke-direct {v1, v2}, Lkg2/d;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;->$cachedSerializer$delegate:Ll83/h;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILy81/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly81/f;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;->color:Ly81/f;

    return-void
.end method

.method private static final synthetic _init_$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.challengedetails.domain.models.ChallengeDetailsStyle"

    invoke-static {}, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;->values()[Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;->_init_$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;->$cachedSerializer$delegate:Ll83/h;

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

    sget-object v0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;
    .locals 1

    const-class v0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;

    return-object p0
.end method

.method public static values()[Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;
    .locals 1

    sget-object v0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;->$VALUES:[Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;

    return-object v0
.end method


# virtual methods
.method public final getColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;->color:Ly81/f;

    return-object v0
.end method
