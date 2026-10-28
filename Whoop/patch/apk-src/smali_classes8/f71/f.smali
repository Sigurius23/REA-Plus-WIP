.class public final enum Lf71/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf71/f$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lf71/f;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lf71/f;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Ly81/e;",
        "mapToWhoopColor",
        "()Ly81/e;",
        "NO_DATA",
        "RECOVERY_HIGH",
        "RECOVERY_LOW",
        "RECOVERY_MEDIUM",
        "STRAIN",
        "design_release"
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

.field private static final synthetic $VALUES:[Lf71/f;

.field public static final enum NO_DATA:Lf71/f;

.field public static final enum RECOVERY_HIGH:Lf71/f;

.field public static final enum RECOVERY_LOW:Lf71/f;

.field public static final enum RECOVERY_MEDIUM:Lf71/f;

.field public static final enum STRAIN:Lf71/f;


# direct methods
.method private static final synthetic $values()[Lf71/f;
    .locals 5

    sget-object v0, Lf71/f;->NO_DATA:Lf71/f;

    sget-object v1, Lf71/f;->RECOVERY_HIGH:Lf71/f;

    sget-object v2, Lf71/f;->RECOVERY_LOW:Lf71/f;

    sget-object v3, Lf71/f;->RECOVERY_MEDIUM:Lf71/f;

    sget-object v4, Lf71/f;->STRAIN:Lf71/f;

    filled-new-array {v0, v1, v2, v3, v4}, [Lf71/f;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lf71/f;

    const-string v1, "NO_DATA"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lf71/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf71/f;->NO_DATA:Lf71/f;

    new-instance v0, Lf71/f;

    const-string v1, "RECOVERY_HIGH"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lf71/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf71/f;->RECOVERY_HIGH:Lf71/f;

    new-instance v0, Lf71/f;

    const-string v1, "RECOVERY_LOW"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lf71/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf71/f;->RECOVERY_LOW:Lf71/f;

    new-instance v0, Lf71/f;

    const-string v1, "RECOVERY_MEDIUM"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lf71/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf71/f;->RECOVERY_MEDIUM:Lf71/f;

    new-instance v0, Lf71/f;

    const-string v1, "STRAIN"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lf71/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf71/f;->STRAIN:Lf71/f;

    invoke-static {}, Lf71/f;->$values()[Lf71/f;

    move-result-object v0

    sput-object v0, Lf71/f;->$VALUES:[Lf71/f;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lf71/f;->$ENTRIES:Lt83/a;

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

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lf71/f;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lf71/f;
    .locals 1

    const-class v0, Lf71/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lf71/f;

    return-object p0
.end method

.method public static values()[Lf71/f;
    .locals 1

    sget-object v0, Lf71/f;->$VALUES:[Lf71/f;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf71/f;

    return-object v0
.end method


# virtual methods
.method public final mapToWhoopColor()Ly81/e;
    .locals 2

    sget-object v0, Lf71/f$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    sget-object v0, Lf71/f$g;->w:Lf71/f$g;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Lf71/f$f;->w:Lf71/f$f;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v0

    return-object v0

    :cond_1
    sget-object v0, Lf71/f$e;->w:Lf71/f$e;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v0

    return-object v0

    :cond_2
    sget-object v0, Lf71/f$d;->w:Lf71/f$d;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v0

    return-object v0

    :cond_3
    sget-object v0, Lf71/f$c;->w:Lf71/f$c;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v0

    return-object v0

    :cond_4
    sget-object v0, Lf71/f$b;->w:Lf71/f$b;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v0

    return-object v0
.end method
