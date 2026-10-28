.class public final enum Lcom/whoop/whoopaction/domain/models/AuthOperation;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whoopaction/domain/models/AuthOperation$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/whoopaction/domain/models/AuthOperation;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000c\u0008\u0087\u0081\u0002\u0018\u0000 \u000c2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000cB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/whoop/whoopaction/domain/models/AuthOperation;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "SIGN_IN",
        "SIGN_UP",
        "RESET_PASSWORD",
        "COMPLETE_MFA",
        "RESEND_MFA",
        "START_ATTESTATION",
        "SIGN_OUT",
        "UNKNOWN",
        "Companion",
        "whoop-action_release"
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

.field private static final synthetic $VALUES:[Lcom/whoop/whoopaction/domain/models/AuthOperation;

.field private static final $cachedSerializer$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final enum COMPLETE_MFA:Lcom/whoop/whoopaction/domain/models/AuthOperation;

.field public static final Companion:Lcom/whoop/whoopaction/domain/models/AuthOperation$Companion;

.field public static final enum RESEND_MFA:Lcom/whoop/whoopaction/domain/models/AuthOperation;

.field public static final enum RESET_PASSWORD:Lcom/whoop/whoopaction/domain/models/AuthOperation;

.field public static final enum SIGN_IN:Lcom/whoop/whoopaction/domain/models/AuthOperation;

.field public static final enum SIGN_OUT:Lcom/whoop/whoopaction/domain/models/AuthOperation;

.field public static final enum SIGN_UP:Lcom/whoop/whoopaction/domain/models/AuthOperation;

.field public static final enum START_ATTESTATION:Lcom/whoop/whoopaction/domain/models/AuthOperation;

.field public static final enum UNKNOWN:Lcom/whoop/whoopaction/domain/models/AuthOperation;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/whoopaction/domain/models/AuthOperation;
    .locals 8

    sget-object v0, Lcom/whoop/whoopaction/domain/models/AuthOperation;->SIGN_IN:Lcom/whoop/whoopaction/domain/models/AuthOperation;

    sget-object v1, Lcom/whoop/whoopaction/domain/models/AuthOperation;->SIGN_UP:Lcom/whoop/whoopaction/domain/models/AuthOperation;

    sget-object v2, Lcom/whoop/whoopaction/domain/models/AuthOperation;->RESET_PASSWORD:Lcom/whoop/whoopaction/domain/models/AuthOperation;

    sget-object v3, Lcom/whoop/whoopaction/domain/models/AuthOperation;->COMPLETE_MFA:Lcom/whoop/whoopaction/domain/models/AuthOperation;

    sget-object v4, Lcom/whoop/whoopaction/domain/models/AuthOperation;->RESEND_MFA:Lcom/whoop/whoopaction/domain/models/AuthOperation;

    sget-object v5, Lcom/whoop/whoopaction/domain/models/AuthOperation;->START_ATTESTATION:Lcom/whoop/whoopaction/domain/models/AuthOperation;

    sget-object v6, Lcom/whoop/whoopaction/domain/models/AuthOperation;->SIGN_OUT:Lcom/whoop/whoopaction/domain/models/AuthOperation;

    sget-object v7, Lcom/whoop/whoopaction/domain/models/AuthOperation;->UNKNOWN:Lcom/whoop/whoopaction/domain/models/AuthOperation;

    filled-new-array/range {v0 .. v7}, [Lcom/whoop/whoopaction/domain/models/AuthOperation;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/whoopaction/domain/models/AuthOperation;

    const-string v1, "SIGN_IN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/whoopaction/domain/models/AuthOperation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/whoopaction/domain/models/AuthOperation;->SIGN_IN:Lcom/whoop/whoopaction/domain/models/AuthOperation;

    new-instance v0, Lcom/whoop/whoopaction/domain/models/AuthOperation;

    const-string v1, "SIGN_UP"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/whoopaction/domain/models/AuthOperation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/whoopaction/domain/models/AuthOperation;->SIGN_UP:Lcom/whoop/whoopaction/domain/models/AuthOperation;

    new-instance v0, Lcom/whoop/whoopaction/domain/models/AuthOperation;

    const-string v1, "RESET_PASSWORD"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/whoop/whoopaction/domain/models/AuthOperation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/whoopaction/domain/models/AuthOperation;->RESET_PASSWORD:Lcom/whoop/whoopaction/domain/models/AuthOperation;

    new-instance v0, Lcom/whoop/whoopaction/domain/models/AuthOperation;

    const-string v1, "COMPLETE_MFA"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/whoop/whoopaction/domain/models/AuthOperation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/whoopaction/domain/models/AuthOperation;->COMPLETE_MFA:Lcom/whoop/whoopaction/domain/models/AuthOperation;

    new-instance v0, Lcom/whoop/whoopaction/domain/models/AuthOperation;

    const-string v1, "RESEND_MFA"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/whoop/whoopaction/domain/models/AuthOperation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/whoopaction/domain/models/AuthOperation;->RESEND_MFA:Lcom/whoop/whoopaction/domain/models/AuthOperation;

    new-instance v0, Lcom/whoop/whoopaction/domain/models/AuthOperation;

    const-string v1, "START_ATTESTATION"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/whoop/whoopaction/domain/models/AuthOperation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/whoopaction/domain/models/AuthOperation;->START_ATTESTATION:Lcom/whoop/whoopaction/domain/models/AuthOperation;

    new-instance v0, Lcom/whoop/whoopaction/domain/models/AuthOperation;

    const-string v1, "SIGN_OUT"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/whoop/whoopaction/domain/models/AuthOperation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/whoopaction/domain/models/AuthOperation;->SIGN_OUT:Lcom/whoop/whoopaction/domain/models/AuthOperation;

    new-instance v0, Lcom/whoop/whoopaction/domain/models/AuthOperation;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/whoop/whoopaction/domain/models/AuthOperation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/whoopaction/domain/models/AuthOperation;->UNKNOWN:Lcom/whoop/whoopaction/domain/models/AuthOperation;

    invoke-static {}, Lcom/whoop/whoopaction/domain/models/AuthOperation;->$values()[Lcom/whoop/whoopaction/domain/models/AuthOperation;

    move-result-object v0

    sput-object v0, Lcom/whoop/whoopaction/domain/models/AuthOperation;->$VALUES:[Lcom/whoop/whoopaction/domain/models/AuthOperation;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/whoopaction/domain/models/AuthOperation;->$ENTRIES:Lt83/a;

    new-instance v0, Lcom/whoop/whoopaction/domain/models/AuthOperation$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/whoopaction/domain/models/AuthOperation$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/whoopaction/domain/models/AuthOperation;->Companion:Lcom/whoop/whoopaction/domain/models/AuthOperation$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Lcom/whoop/weeklyplan/customizeplan/domain/api/a;

    const/16 v2, 0xc

    invoke-direct {v1, v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/a;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/whoop/whoopaction/domain/models/AuthOperation;->$cachedSerializer$delegate:Ll83/h;

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
    .locals 2

    const-string v0, "com.whoop.whoopaction.domain.models.AuthOperation"

    invoke-static {}, Lcom/whoop/whoopaction/domain/models/AuthOperation;->values()[Lcom/whoop/whoopaction/domain/models/AuthOperation;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/whoopaction/domain/models/AuthOperation;->_init_$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/whoopaction/domain/models/AuthOperation;->$cachedSerializer$delegate:Ll83/h;

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

    sget-object v0, Lcom/whoop/whoopaction/domain/models/AuthOperation;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/whoopaction/domain/models/AuthOperation;
    .locals 1

    const-class v0, Lcom/whoop/whoopaction/domain/models/AuthOperation;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/whoopaction/domain/models/AuthOperation;

    return-object p0
.end method

.method public static values()[Lcom/whoop/whoopaction/domain/models/AuthOperation;
    .locals 1

    sget-object v0, Lcom/whoop/whoopaction/domain/models/AuthOperation;->$VALUES:[Lcom/whoop/whoopaction/domain/models/AuthOperation;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/whoopaction/domain/models/AuthOperation;

    return-object v0
.end method
