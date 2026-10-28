.class public final enum Lh11/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lh11/g;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lh11/g;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "COMPLETED_JOURNAL",
        "INCOMPLETE_JOURNAL",
        "INVALID",
        "NO_APPOINTMENTS",
        "HAS_APPOINTMENT",
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

.field private static final synthetic $VALUES:[Lh11/g;

.field public static final enum COMPLETED_JOURNAL:Lh11/g;

.field public static final enum HAS_APPOINTMENT:Lh11/g;

.field public static final enum INCOMPLETE_JOURNAL:Lh11/g;

.field public static final enum INVALID:Lh11/g;

.field public static final enum NO_APPOINTMENTS:Lh11/g;


# direct methods
.method private static final synthetic $values()[Lh11/g;
    .locals 5

    sget-object v0, Lh11/g;->COMPLETED_JOURNAL:Lh11/g;

    sget-object v1, Lh11/g;->INCOMPLETE_JOURNAL:Lh11/g;

    sget-object v2, Lh11/g;->INVALID:Lh11/g;

    sget-object v3, Lh11/g;->NO_APPOINTMENTS:Lh11/g;

    sget-object v4, Lh11/g;->HAS_APPOINTMENT:Lh11/g;

    filled-new-array {v0, v1, v2, v3, v4}, [Lh11/g;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lh11/g;

    const-string v1, "COMPLETED_JOURNAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lh11/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh11/g;->COMPLETED_JOURNAL:Lh11/g;

    new-instance v0, Lh11/g;

    const-string v1, "INCOMPLETE_JOURNAL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lh11/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh11/g;->INCOMPLETE_JOURNAL:Lh11/g;

    new-instance v0, Lh11/g;

    const-string v1, "INVALID"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lh11/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh11/g;->INVALID:Lh11/g;

    new-instance v0, Lh11/g;

    const-string v1, "NO_APPOINTMENTS"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lh11/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh11/g;->NO_APPOINTMENTS:Lh11/g;

    new-instance v0, Lh11/g;

    const-string v1, "HAS_APPOINTMENT"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lh11/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh11/g;->HAS_APPOINTMENT:Lh11/g;

    invoke-static {}, Lh11/g;->$values()[Lh11/g;

    move-result-object v0

    sput-object v0, Lh11/g;->$VALUES:[Lh11/g;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lh11/g;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lh11/g;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lh11/g;
    .locals 1

    const-class v0, Lh11/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lh11/g;

    return-object p0
.end method

.method public static values()[Lh11/g;
    .locals 1

    sget-object v0, Lh11/g;->$VALUES:[Lh11/g;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lh11/g;

    return-object v0
.end method
