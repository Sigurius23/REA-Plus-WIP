.class public final enum Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\n\u0008\u0087\u0081\u0002\u0018\u0000 \u000c2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000cB\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;",
        "",
        "value",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getValue",
        "()Ljava/lang/String;",
        "CANCEL_ENROLLMENT",
        "CANCEL_ENROLLMENT_EXTENDED",
        "CANCEL_TASK",
        "UNKNOWN",
        "Companion",
        "whooplabs_release"
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

.field private static final synthetic $VALUES:[Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;

.field private static final $cachedSerializer$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final enum CANCEL_ENROLLMENT:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;

.field public static final enum CANCEL_ENROLLMENT_EXTENDED:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;

.field public static final enum CANCEL_TASK:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;

.field public static final Companion:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption$Companion;

.field public static final enum UNKNOWN:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;
    .locals 4

    sget-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;->CANCEL_ENROLLMENT:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;

    sget-object v1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;->CANCEL_ENROLLMENT_EXTENDED:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;

    sget-object v2, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;->CANCEL_TASK:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;

    sget-object v3, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;->UNKNOWN:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;

    filled-new-array {v0, v1, v2, v3}, [Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;

    const/4 v1, 0x0

    const-string v2, "cancel_enrollment"

    const-string v3, "CANCEL_ENROLLMENT"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;->CANCEL_ENROLLMENT:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;

    new-instance v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;

    const/4 v1, 0x1

    const-string v2, "cancel_enrollment_extended"

    const-string v3, "CANCEL_ENROLLMENT_EXTENDED"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;->CANCEL_ENROLLMENT_EXTENDED:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;

    new-instance v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;

    const/4 v1, 0x2

    const-string v2, "cancel_task"

    const-string v3, "CANCEL_TASK"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;->CANCEL_TASK:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;

    new-instance v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;

    const/4 v1, 0x3

    const-string v2, "unknown"

    const-string v3, "UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;->UNKNOWN:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;

    invoke-static {}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;->$values()[Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;

    move-result-object v0

    sput-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;->$VALUES:[Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;->$ENTRIES:Lt83/a;

    new-instance v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;->Companion:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Ldq2/a;

    const/16 v2, 0xe

    invoke-direct {v1, v2}, Ldq2/a;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;->$cachedSerializer$delegate:Ll83/h;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;->value:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _init_$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.whooplabs.data.remote.domain.dto.bff.BottomSheetOption"

    invoke-static {}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;->values()[Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;->_init_$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;->$cachedSerializer$delegate:Ll83/h;

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

    sget-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;
    .locals 1

    const-class v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;

    return-object p0
.end method

.method public static values()[Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;
    .locals 1

    sget-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;->$VALUES:[Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BottomSheetOption;->value:Ljava/lang/String;

    return-object v0
.end method
