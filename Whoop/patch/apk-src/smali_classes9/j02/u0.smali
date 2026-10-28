.class public final enum Lj02/u0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj02/u0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lj02/u0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0081\u0002\u0018\u0000 \u00042\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lj02/u0;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Companion",
        "a",
        "FULL",
        "ENTERPRISE_ONLY",
        "navigation_release"
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

.field private static final synthetic $VALUES:[Lj02/u0;

.field public static final Companion:Lj02/u0$a;

.field public static final enum ENTERPRISE_ONLY:Lj02/u0;

.field public static final enum FULL:Lj02/u0;


# direct methods
.method private static final synthetic $values()[Lj02/u0;
    .locals 2

    sget-object v0, Lj02/u0;->FULL:Lj02/u0;

    sget-object v1, Lj02/u0;->ENTERPRISE_ONLY:Lj02/u0;

    filled-new-array {v0, v1}, [Lj02/u0;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lj02/u0;

    const-string v1, "FULL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lj02/u0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj02/u0;->FULL:Lj02/u0;

    new-instance v0, Lj02/u0;

    const-string v1, "ENTERPRISE_ONLY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lj02/u0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj02/u0;->ENTERPRISE_ONLY:Lj02/u0;

    invoke-static {}, Lj02/u0;->$values()[Lj02/u0;

    move-result-object v0

    sput-object v0, Lj02/u0;->$VALUES:[Lj02/u0;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lj02/u0;->$ENTRIES:Lt83/a;

    new-instance v0, Lj02/u0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj02/u0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lj02/u0;->Companion:Lj02/u0$a;

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

    sget-object v0, Lj02/u0;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lj02/u0;
    .locals 1

    const-class v0, Lj02/u0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lj02/u0;

    return-object p0
.end method

.method public static values()[Lj02/u0;
    .locals 1

    sget-object v0, Lj02/u0;->$VALUES:[Lj02/u0;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj02/u0;

    return-object v0
.end method
