.class public final enum Lcom/whoop/profile/domain/models/Gender;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/profile/domain/models/Gender$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/profile/domain/models/Gender;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u0087\u0081\u0002\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\u0008\u001a\u00020\tj\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/profile/domain/models/Gender;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "MALE",
        "FEMALE",
        "NON_BINARY",
        "PREFER_NOT",
        "requiresPhysiologicalBaseline",
        "",
        "Companion",
        "profile_release"
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

.field private static final synthetic $VALUES:[Lcom/whoop/profile/domain/models/Gender;

.field private static final $cachedSerializer$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/whoop/profile/domain/models/Gender$Companion;

.field public static final enum FEMALE:Lcom/whoop/profile/domain/models/Gender;
    .annotation runtime Lwc3/h;
        value = "FEMALE"
    .end annotation
.end field

.field public static final enum MALE:Lcom/whoop/profile/domain/models/Gender;
    .annotation runtime Lwc3/h;
        value = "MALE"
    .end annotation
.end field

.field public static final enum NON_BINARY:Lcom/whoop/profile/domain/models/Gender;
    .annotation runtime Lwc3/h;
        value = "NON_BINARY"
    .end annotation
.end field

.field public static final enum PREFER_NOT:Lcom/whoop/profile/domain/models/Gender;
    .annotation runtime Lwc3/h;
        value = "PREFER_NOT"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/whoop/profile/domain/models/Gender;
    .locals 4

    sget-object v0, Lcom/whoop/profile/domain/models/Gender;->MALE:Lcom/whoop/profile/domain/models/Gender;

    sget-object v1, Lcom/whoop/profile/domain/models/Gender;->FEMALE:Lcom/whoop/profile/domain/models/Gender;

    sget-object v2, Lcom/whoop/profile/domain/models/Gender;->NON_BINARY:Lcom/whoop/profile/domain/models/Gender;

    sget-object v3, Lcom/whoop/profile/domain/models/Gender;->PREFER_NOT:Lcom/whoop/profile/domain/models/Gender;

    filled-new-array {v0, v1, v2, v3}, [Lcom/whoop/profile/domain/models/Gender;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/profile/domain/models/Gender;

    const-string v1, "MALE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/profile/domain/models/Gender;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/profile/domain/models/Gender;->MALE:Lcom/whoop/profile/domain/models/Gender;

    new-instance v0, Lcom/whoop/profile/domain/models/Gender;

    const-string v1, "FEMALE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/profile/domain/models/Gender;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/profile/domain/models/Gender;->FEMALE:Lcom/whoop/profile/domain/models/Gender;

    new-instance v0, Lcom/whoop/profile/domain/models/Gender;

    const-string v1, "NON_BINARY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/whoop/profile/domain/models/Gender;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/profile/domain/models/Gender;->NON_BINARY:Lcom/whoop/profile/domain/models/Gender;

    new-instance v0, Lcom/whoop/profile/domain/models/Gender;

    const-string v1, "PREFER_NOT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/whoop/profile/domain/models/Gender;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/profile/domain/models/Gender;->PREFER_NOT:Lcom/whoop/profile/domain/models/Gender;

    invoke-static {}, Lcom/whoop/profile/domain/models/Gender;->$values()[Lcom/whoop/profile/domain/models/Gender;

    move-result-object v0

    sput-object v0, Lcom/whoop/profile/domain/models/Gender;->$VALUES:[Lcom/whoop/profile/domain/models/Gender;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/profile/domain/models/Gender;->$ENTRIES:Lt83/a;

    new-instance v0, Lcom/whoop/profile/domain/models/Gender$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/profile/domain/models/Gender$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/profile/domain/models/Gender;->Companion:Lcom/whoop/profile/domain/models/Gender$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Lrx0/f;

    const/16 v2, 0x1a

    invoke-direct {v1, v2}, Lrx0/f;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/whoop/profile/domain/models/Gender;->$cachedSerializer$delegate:Ll83/h;

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

    invoke-static {}, Lcom/whoop/profile/domain/models/Gender;->values()[Lcom/whoop/profile/domain/models/Gender;

    move-result-object v0

    const-string v1, "NON_BINARY"

    const-string v2, "PREFER_NOT"

    const-string v3, "MALE"

    const-string v4, "FEMALE"

    filled-new-array {v3, v4, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    filled-new-array {v2, v2, v2, v2}, [[Ljava/lang/annotation/Annotation;

    move-result-object v3

    const-string v4, "com.whoop.profile.domain.models.Gender"

    invoke-static {v4, v0, v1, v3, v2}, Lkotlinx/serialization/internal/EnumsKt;->createAnnotatedEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/profile/domain/models/Gender;->_init_$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/profile/domain/models/Gender;->$cachedSerializer$delegate:Ll83/h;

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

    sget-object v0, Lcom/whoop/profile/domain/models/Gender;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/profile/domain/models/Gender;
    .locals 1

    const-class v0, Lcom/whoop/profile/domain/models/Gender;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/profile/domain/models/Gender;

    return-object p0
.end method

.method public static values()[Lcom/whoop/profile/domain/models/Gender;
    .locals 1

    sget-object v0, Lcom/whoop/profile/domain/models/Gender;->$VALUES:[Lcom/whoop/profile/domain/models/Gender;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/profile/domain/models/Gender;

    return-object v0
.end method


# virtual methods
.method public final requiresPhysiologicalBaseline()Z
    .locals 1

    sget-object v0, Lcom/whoop/profile/domain/models/Gender;->NON_BINARY:Lcom/whoop/profile/domain/models/Gender;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/whoop/profile/domain/models/Gender;->PREFER_NOT:Lcom/whoop/profile/domain/models/Gender;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
