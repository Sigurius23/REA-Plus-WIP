.class public final enum Lhw0/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhw0/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhw0/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u0000 \u00042\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lhw0/a;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Companion",
        "a",
        "CARDIO",
        "RECOVERY",
        "SLEEP",
        "core-details_release"
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

.field private static final synthetic $VALUES:[Lhw0/a;

.field public static final enum CARDIO:Lhw0/a;

.field public static final CARDIO_TYPE:Ljava/lang/String; = "Cardio"

.field public static final Companion:Lhw0/a$a;

.field public static final enum RECOVERY:Lhw0/a;

.field public static final RECOVERY_TYPE:Ljava/lang/String; = "Recovery"

.field public static final enum SLEEP:Lhw0/a;

.field public static final SLEEP_TYPE:Ljava/lang/String; = "Sleep"


# direct methods
.method private static final synthetic $values()[Lhw0/a;
    .locals 3

    sget-object v0, Lhw0/a;->CARDIO:Lhw0/a;

    sget-object v1, Lhw0/a;->RECOVERY:Lhw0/a;

    sget-object v2, Lhw0/a;->SLEEP:Lhw0/a;

    filled-new-array {v0, v1, v2}, [Lhw0/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lhw0/a;

    const-string v1, "CARDIO"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lhw0/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhw0/a;->CARDIO:Lhw0/a;

    new-instance v0, Lhw0/a;

    const-string v1, "RECOVERY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lhw0/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhw0/a;->RECOVERY:Lhw0/a;

    new-instance v0, Lhw0/a;

    const-string v1, "SLEEP"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lhw0/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhw0/a;->SLEEP:Lhw0/a;

    invoke-static {}, Lhw0/a;->$values()[Lhw0/a;

    move-result-object v0

    sput-object v0, Lhw0/a;->$VALUES:[Lhw0/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lhw0/a;->$ENTRIES:Lt83/a;

    new-instance v0, Lhw0/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lhw0/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lhw0/a;->Companion:Lhw0/a$a;

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

    sget-object v0, Lhw0/a;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lhw0/a;
    .locals 1

    const-class v0, Lhw0/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhw0/a;

    return-object p0
.end method

.method public static values()[Lhw0/a;
    .locals 1

    sget-object v0, Lhw0/a;->$VALUES:[Lhw0/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhw0/a;

    return-object v0
.end method
