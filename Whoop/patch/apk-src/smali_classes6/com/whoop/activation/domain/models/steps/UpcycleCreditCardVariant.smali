.class public final enum Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;",
        "",
        "value",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getValue",
        "()Ljava/lang/String;",
        "CONTROL",
        "AFTER_UPCYCLE",
        "Companion",
        "activation_release"
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

.field private static final synthetic $VALUES:[Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;

.field public static final enum AFTER_UPCYCLE:Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;

.field public static final enum CONTROL:Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;

.field public static final Companion:Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant$Companion;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;
    .locals 2

    sget-object v0, Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;->CONTROL:Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;

    sget-object v1, Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;->AFTER_UPCYCLE:Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;

    filled-new-array {v0, v1}, [Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;

    const/4 v1, 0x0

    const-string v2, "control"

    const-string v3, "CONTROL"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;->CONTROL:Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;

    new-instance v0, Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;

    const/4 v1, 0x1

    const-string v2, "after-upcycle"

    const-string v3, "AFTER_UPCYCLE"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;->AFTER_UPCYCLE:Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;

    invoke-static {}, Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;->$values()[Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;

    move-result-object v0

    sput-object v0, Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;->$VALUES:[Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;->$ENTRIES:Lt83/a;

    new-instance v0, Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;->Companion:Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant$Companion;

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

    iput-object p3, p0, Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;->value:Ljava/lang/String;

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

    sget-object v0, Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;
    .locals 1

    const-class v0, Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;

    return-object p0
.end method

.method public static values()[Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;
    .locals 1

    sget-object v0, Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;->$VALUES:[Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/UpcycleCreditCardVariant;->value:Ljava/lang/String;

    return-object v0
.end method
