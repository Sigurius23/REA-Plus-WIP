.class public final enum La10/h;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:La10/h;

.field public static final enum F:La10/h;

.field public static final enum G:La10/h;

.field public static final enum H:La10/h;

.field public static final enum I:La10/h;

.field public static final synthetic J:[La10/h;

.field public static final synthetic K:Lt83/b;

.field public static final x:Lkr/e;

.field public static final enum y:La10/h;

.field public static final enum z:La10/h;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, La10/h;

    const/4 v1, 0x0

    const-string v2, "amex_express_checkout"

    const-string v3, "AmexExpressCheckout"

    invoke-direct {v0, v3, v1, v2}, La10/h;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, La10/h;->y:La10/h;

    new-instance v1, La10/h;

    const/4 v2, 0x1

    const-string v3, "apple_pay"

    const-string v4, "ApplePay"

    invoke-direct {v1, v4, v2, v3}, La10/h;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, La10/h;->z:La10/h;

    new-instance v2, La10/h;

    const/4 v3, 0x2

    const-string v4, "google_pay"

    const-string v5, "GooglePay"

    invoke-direct {v2, v5, v3, v4}, La10/h;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, La10/h;->E:La10/h;

    new-instance v3, La10/h;

    const/4 v4, 0x3

    const-string v5, "master_pass"

    const-string v6, "Masterpass"

    invoke-direct {v3, v6, v4, v5}, La10/h;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, La10/h;->F:La10/h;

    new-instance v4, La10/h;

    const/4 v5, 0x4

    const-string v6, "samsung_pay"

    const-string v7, "SamsungPay"

    invoke-direct {v4, v7, v5, v6}, La10/h;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, La10/h;->G:La10/h;

    new-instance v5, La10/h;

    const/4 v6, 0x5

    const-string v7, "visa_checkout"

    const-string v8, "VisaCheckout"

    invoke-direct {v5, v8, v6, v7}, La10/h;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, La10/h;->H:La10/h;

    new-instance v6, La10/h;

    const/4 v7, 0x6

    const-string v8, "link"

    const-string v9, "Link"

    invoke-direct {v6, v9, v7, v8}, La10/h;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, La10/h;->I:La10/h;

    filled-new-array/range {v0 .. v6}, [La10/h;

    move-result-object v0

    sput-object v0, La10/h;->J:[La10/h;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, La10/h;->K:Lt83/b;

    new-instance v0, Lkr/e;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lkr/e;-><init>(I)V

    sput-object v0, La10/h;->x:Lkr/e;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, La10/h;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La10/h;
    .locals 1

    const-class v0, La10/h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, La10/h;

    return-object p0
.end method

.method public static values()[La10/h;
    .locals 1

    sget-object v0, La10/h;->J:[La10/h;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La10/h;

    return-object v0
.end method
