.class public final enum Lqv2/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lqv2/f;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lqv2/f;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "LoadingShareableWorkoutLink",
        "LoadingShareableWorkoutQrCode",
        "weightlifting_release"
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

.field private static final synthetic $VALUES:[Lqv2/f;

.field public static final enum LoadingShareableWorkoutLink:Lqv2/f;

.field public static final enum LoadingShareableWorkoutQrCode:Lqv2/f;


# direct methods
.method private static final synthetic $values()[Lqv2/f;
    .locals 2

    sget-object v0, Lqv2/f;->LoadingShareableWorkoutLink:Lqv2/f;

    sget-object v1, Lqv2/f;->LoadingShareableWorkoutQrCode:Lqv2/f;

    filled-new-array {v0, v1}, [Lqv2/f;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lqv2/f;

    const-string v1, "LoadingShareableWorkoutLink"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lqv2/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lqv2/f;->LoadingShareableWorkoutLink:Lqv2/f;

    new-instance v0, Lqv2/f;

    const-string v1, "LoadingShareableWorkoutQrCode"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lqv2/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lqv2/f;->LoadingShareableWorkoutQrCode:Lqv2/f;

    invoke-static {}, Lqv2/f;->$values()[Lqv2/f;

    move-result-object v0

    sput-object v0, Lqv2/f;->$VALUES:[Lqv2/f;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lqv2/f;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lqv2/f;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lqv2/f;
    .locals 1

    const-class v0, Lqv2/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lqv2/f;

    return-object p0
.end method

.method public static values()[Lqv2/f;
    .locals 1

    sget-object v0, Lqv2/f;->$VALUES:[Lqv2/f;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqv2/f;

    return-object v0
.end method
