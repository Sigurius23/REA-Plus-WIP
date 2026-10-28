.class final enum Lcom/whoop/whooplive/selfie/SelfieActivity$i;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/whooplive/selfie/SelfieActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/whooplive/selfie/SelfieActivity$i;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/whoop/whooplive/selfie/SelfieActivity$i;

.field public static final enum EDITING:Lcom/whoop/whooplive/selfie/SelfieActivity$i;

.field public static final enum NONE:Lcom/whoop/whooplive/selfie/SelfieActivity$i;

.field public static final enum SHOOTING:Lcom/whoop/whooplive/selfie/SelfieActivity$i;

.field public static final enum SNAP_PLUS:Lcom/whoop/whooplive/selfie/SelfieActivity$i;

.field public static final enum ZOOMING:Lcom/whoop/whooplive/selfie/SelfieActivity$i;


# direct methods
.method private static synthetic $values()[Lcom/whoop/whooplive/selfie/SelfieActivity$i;
    .locals 5

    sget-object v0, Lcom/whoop/whooplive/selfie/SelfieActivity$i;->NONE:Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    sget-object v1, Lcom/whoop/whooplive/selfie/SelfieActivity$i;->SHOOTING:Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    sget-object v2, Lcom/whoop/whooplive/selfie/SelfieActivity$i;->EDITING:Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    sget-object v3, Lcom/whoop/whooplive/selfie/SelfieActivity$i;->ZOOMING:Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    sget-object v4, Lcom/whoop/whooplive/selfie/SelfieActivity$i;->SNAP_PLUS:Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/whooplive/selfie/SelfieActivity$i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/whooplive/selfie/SelfieActivity$i;->NONE:Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    new-instance v0, Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    const-string v1, "SHOOTING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/whooplive/selfie/SelfieActivity$i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/whooplive/selfie/SelfieActivity$i;->SHOOTING:Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    new-instance v0, Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    const-string v1, "EDITING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/whoop/whooplive/selfie/SelfieActivity$i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/whooplive/selfie/SelfieActivity$i;->EDITING:Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    new-instance v0, Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    const-string v1, "ZOOMING"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/whoop/whooplive/selfie/SelfieActivity$i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/whooplive/selfie/SelfieActivity$i;->ZOOMING:Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    new-instance v0, Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    const-string v1, "SNAP_PLUS"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/whoop/whooplive/selfie/SelfieActivity$i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/whooplive/selfie/SelfieActivity$i;->SNAP_PLUS:Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    invoke-static {}, Lcom/whoop/whooplive/selfie/SelfieActivity$i;->$values()[Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    move-result-object v0

    sput-object v0, Lcom/whoop/whooplive/selfie/SelfieActivity$i;->$VALUES:[Lcom/whoop/whooplive/selfie/SelfieActivity$i;

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

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/whooplive/selfie/SelfieActivity$i;
    .locals 1

    const-class v0, Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    return-object p0
.end method

.method public static values()[Lcom/whoop/whooplive/selfie/SelfieActivity$i;
    .locals 1

    sget-object v0, Lcom/whoop/whooplive/selfie/SelfieActivity$i;->$VALUES:[Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    invoke-virtual {v0}, [Lcom/whoop/whooplive/selfie/SelfieActivity$i;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    return-object v0
.end method
