.class public final enum Lbz/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Lbz/b;

.field public static final enum F:Lbz/b;

.field public static final enum G:Lbz/b;

.field public static final enum H:Lbz/b;

.field public static final enum I:Lbz/b;

.field public static final enum J:Lbz/b;

.field public static final synthetic K:[Lbz/b;

.field public static final enum w:Lbz/b;

.field public static final enum x:Lbz/b;

.field public static final enum y:Lbz/b;

.field public static final enum z:Lbz/b;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Lbz/b;

    const-string v1, "Loading"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbz/b;->w:Lbz/b;

    new-instance v1, Lbz/b;

    const-string v2, "Checkout"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lbz/b;->x:Lbz/b;

    new-instance v2, Lbz/b;

    const-string v3, "LinkSignup"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lbz/b;->y:Lbz/b;

    new-instance v3, Lbz/b;

    const-string v4, "ConfirmButtonClicked"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lbz/b;->z:Lbz/b;

    new-instance v4, Lbz/b;

    const-string v5, "CardScan"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lbz/b;->E:Lbz/b;

    new-instance v5, Lbz/b;

    const-string v6, "Captcha"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lbz/b;->F:Lbz/b;

    new-instance v6, Lbz/b;

    const-string v7, "CaptchaAttach"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v6, Lbz/b;->G:Lbz/b;

    new-instance v7, Lbz/b;

    const-string v8, "PaymentLauncher"

    const/4 v9, 0x7

    invoke-direct {v7, v8, v9}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lbz/b;->H:Lbz/b;

    new-instance v8, Lbz/b;

    const-string v9, "PrepareAttestation"

    const/16 v10, 0x8

    invoke-direct {v8, v9, v10}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v8, Lbz/b;->I:Lbz/b;

    new-instance v9, Lbz/b;

    const-string v10, "Attest"

    const/16 v11, 0x9

    invoke-direct {v9, v10, v11}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lbz/b;->J:Lbz/b;

    filled-new-array/range {v0 .. v9}, [Lbz/b;

    move-result-object v0

    sput-object v0, Lbz/b;->K:[Lbz/b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lbz/b;
    .locals 1

    const-class v0, Lbz/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lbz/b;

    return-object p0
.end method

.method public static values()[Lbz/b;
    .locals 1

    sget-object v0, Lbz/b;->K:[Lbz/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbz/b;

    return-object v0
.end method
