.class public final enum Lgo0/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lgo0/e;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lgo0/e;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "INFORMATION",
        "STATE_SELECT",
        "MULTI_SELECT",
        "PERSONAL_INTAKE",
        "TEXT_ENTRY",
        "HEIGHT_WEIGHT",
        "UNKNOWN",
        "clinician-in-the-loop_release"
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

.field private static final synthetic $VALUES:[Lgo0/e;

.field public static final enum HEIGHT_WEIGHT:Lgo0/e;

.field public static final enum INFORMATION:Lgo0/e;

.field public static final enum MULTI_SELECT:Lgo0/e;

.field public static final enum PERSONAL_INTAKE:Lgo0/e;

.field public static final enum STATE_SELECT:Lgo0/e;

.field public static final enum TEXT_ENTRY:Lgo0/e;

.field public static final enum UNKNOWN:Lgo0/e;


# direct methods
.method private static final synthetic $values()[Lgo0/e;
    .locals 7

    sget-object v0, Lgo0/e;->INFORMATION:Lgo0/e;

    sget-object v1, Lgo0/e;->STATE_SELECT:Lgo0/e;

    sget-object v2, Lgo0/e;->MULTI_SELECT:Lgo0/e;

    sget-object v3, Lgo0/e;->PERSONAL_INTAKE:Lgo0/e;

    sget-object v4, Lgo0/e;->TEXT_ENTRY:Lgo0/e;

    sget-object v5, Lgo0/e;->HEIGHT_WEIGHT:Lgo0/e;

    sget-object v6, Lgo0/e;->UNKNOWN:Lgo0/e;

    filled-new-array/range {v0 .. v6}, [Lgo0/e;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lgo0/e;

    const-string v1, "INFORMATION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lgo0/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgo0/e;->INFORMATION:Lgo0/e;

    new-instance v0, Lgo0/e;

    const-string v1, "STATE_SELECT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lgo0/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgo0/e;->STATE_SELECT:Lgo0/e;

    new-instance v0, Lgo0/e;

    const-string v1, "MULTI_SELECT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lgo0/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgo0/e;->MULTI_SELECT:Lgo0/e;

    new-instance v0, Lgo0/e;

    const-string v1, "PERSONAL_INTAKE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lgo0/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgo0/e;->PERSONAL_INTAKE:Lgo0/e;

    new-instance v0, Lgo0/e;

    const-string v1, "TEXT_ENTRY"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lgo0/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgo0/e;->TEXT_ENTRY:Lgo0/e;

    new-instance v0, Lgo0/e;

    const-string v1, "HEIGHT_WEIGHT"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lgo0/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgo0/e;->HEIGHT_WEIGHT:Lgo0/e;

    new-instance v0, Lgo0/e;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lgo0/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgo0/e;->UNKNOWN:Lgo0/e;

    invoke-static {}, Lgo0/e;->$values()[Lgo0/e;

    move-result-object v0

    sput-object v0, Lgo0/e;->$VALUES:[Lgo0/e;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lgo0/e;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lgo0/e;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lgo0/e;
    .locals 1

    const-class v0, Lgo0/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lgo0/e;

    return-object p0
.end method

.method public static values()[Lgo0/e;
    .locals 1

    sget-object v0, Lgo0/e;->$VALUES:[Lgo0/e;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lgo0/e;

    return-object v0
.end method
