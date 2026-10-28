.class public final enum Lvn0/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lvn0/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lvn0/a;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "CURRENT_PASSWORD_INCORRECT",
        "OLD_PASSWORD_CANNOT_BE_NEW_PASSWORD",
        "NEW_PASSWORD_TOO_SHORT",
        "GENERIC_ERROR",
        "change-password_release"
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

.field private static final synthetic $VALUES:[Lvn0/a;

.field public static final enum CURRENT_PASSWORD_INCORRECT:Lvn0/a;

.field public static final enum GENERIC_ERROR:Lvn0/a;

.field public static final enum NEW_PASSWORD_TOO_SHORT:Lvn0/a;

.field public static final enum OLD_PASSWORD_CANNOT_BE_NEW_PASSWORD:Lvn0/a;


# direct methods
.method private static final synthetic $values()[Lvn0/a;
    .locals 4

    sget-object v0, Lvn0/a;->CURRENT_PASSWORD_INCORRECT:Lvn0/a;

    sget-object v1, Lvn0/a;->OLD_PASSWORD_CANNOT_BE_NEW_PASSWORD:Lvn0/a;

    sget-object v2, Lvn0/a;->NEW_PASSWORD_TOO_SHORT:Lvn0/a;

    sget-object v3, Lvn0/a;->GENERIC_ERROR:Lvn0/a;

    filled-new-array {v0, v1, v2, v3}, [Lvn0/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lvn0/a;

    const-string v1, "CURRENT_PASSWORD_INCORRECT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lvn0/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvn0/a;->CURRENT_PASSWORD_INCORRECT:Lvn0/a;

    new-instance v0, Lvn0/a;

    const-string v1, "OLD_PASSWORD_CANNOT_BE_NEW_PASSWORD"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lvn0/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvn0/a;->OLD_PASSWORD_CANNOT_BE_NEW_PASSWORD:Lvn0/a;

    new-instance v0, Lvn0/a;

    const-string v1, "NEW_PASSWORD_TOO_SHORT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lvn0/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvn0/a;->NEW_PASSWORD_TOO_SHORT:Lvn0/a;

    new-instance v0, Lvn0/a;

    const-string v1, "GENERIC_ERROR"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lvn0/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvn0/a;->GENERIC_ERROR:Lvn0/a;

    invoke-static {}, Lvn0/a;->$values()[Lvn0/a;

    move-result-object v0

    sput-object v0, Lvn0/a;->$VALUES:[Lvn0/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lvn0/a;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lvn0/a;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lvn0/a;
    .locals 1

    const-class v0, Lvn0/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lvn0/a;

    return-object p0
.end method

.method public static values()[Lvn0/a;
    .locals 1

    sget-object v0, Lvn0/a;->$VALUES:[Lvn0/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lvn0/a;

    return-object v0
.end method
