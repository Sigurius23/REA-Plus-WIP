.class public final enum Lz51/k;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lz51/k;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lz51/k;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "NONE",
        "CALIBRATING",
        "LOW",
        "MEDIUM",
        "HIGH",
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

.field private static final synthetic $VALUES:[Lz51/k;

.field public static final enum CALIBRATING:Lz51/k;

.field public static final enum HIGH:Lz51/k;

.field public static final enum LOW:Lz51/k;

.field public static final enum MEDIUM:Lz51/k;

.field public static final enum NONE:Lz51/k;


# direct methods
.method private static final synthetic $values()[Lz51/k;
    .locals 5

    sget-object v0, Lz51/k;->NONE:Lz51/k;

    sget-object v1, Lz51/k;->CALIBRATING:Lz51/k;

    sget-object v2, Lz51/k;->LOW:Lz51/k;

    sget-object v3, Lz51/k;->MEDIUM:Lz51/k;

    sget-object v4, Lz51/k;->HIGH:Lz51/k;

    filled-new-array {v0, v1, v2, v3, v4}, [Lz51/k;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lz51/k;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lz51/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz51/k;->NONE:Lz51/k;

    new-instance v0, Lz51/k;

    const-string v1, "CALIBRATING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lz51/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz51/k;->CALIBRATING:Lz51/k;

    new-instance v0, Lz51/k;

    const-string v1, "LOW"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lz51/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz51/k;->LOW:Lz51/k;

    new-instance v0, Lz51/k;

    const-string v1, "MEDIUM"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lz51/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz51/k;->MEDIUM:Lz51/k;

    new-instance v0, Lz51/k;

    const-string v1, "HIGH"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lz51/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz51/k;->HIGH:Lz51/k;

    invoke-static {}, Lz51/k;->$values()[Lz51/k;

    move-result-object v0

    sput-object v0, Lz51/k;->$VALUES:[Lz51/k;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lz51/k;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lz51/k;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lz51/k;
    .locals 1

    const-class v0, Lz51/k;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lz51/k;

    return-object p0
.end method

.method public static values()[Lz51/k;
    .locals 1

    sget-object v0, Lz51/k;->$VALUES:[Lz51/k;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lz51/k;

    return-object v0
.end method
