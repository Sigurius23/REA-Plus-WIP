.class public final enum Ly00/h8;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic E:Lt83/b;

.field public static final x:Lt9/c0;

.field public static final enum y:Ly00/h8;

.field public static final synthetic z:[Ly00/h8;


# instance fields
.field public final w:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Ly00/h8;

    const-string v1, "apple_pay"

    invoke-static {v1}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    const-string v2, "ApplePay"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Ly00/h8;-><init>(Ljava/lang/String;ILjava/util/Set;)V

    sput-object v0, Ly00/h8;->y:Ly00/h8;

    new-instance v1, Ly00/h8;

    const-string v2, "android_pay"

    const-string v3, "google"

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    const-string v3, "GooglePay"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v2}, Ly00/h8;-><init>(Ljava/lang/String;ILjava/util/Set;)V

    new-instance v2, Ly00/h8;

    const-string v3, "masterpass"

    invoke-static {v3}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    const-string v4, "Masterpass"

    const/4 v5, 0x2

    invoke-direct {v2, v4, v5, v3}, Ly00/h8;-><init>(Ljava/lang/String;ILjava/util/Set;)V

    new-instance v3, Ly00/h8;

    const-string v4, "visa_checkout"

    invoke-static {v4}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    const-string v5, "VisaCheckout"

    const/4 v6, 0x3

    invoke-direct {v3, v5, v6, v4}, Ly00/h8;-><init>(Ljava/lang/String;ILjava/util/Set;)V

    filled-new-array {v0, v1, v2, v3}, [Ly00/h8;

    move-result-object v0

    sput-object v0, Ly00/h8;->z:[Ly00/h8;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ly00/h8;->E:Lt83/b;

    new-instance v0, Lt9/c0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ly00/h8;->x:Lt9/c0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/util/Set;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ly00/h8;->w:Ljava/util/Set;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ly00/h8;
    .locals 1

    const-class v0, Ly00/h8;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly00/h8;

    return-object p0
.end method

.method public static values()[Ly00/h8;
    .locals 1

    sget-object v0, Ly00/h8;->z:[Ly00/h8;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly00/h8;

    return-object v0
.end method
