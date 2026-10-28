.class public final enum Lw51/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lw51/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\u0008\u0002\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lw51/a;",
        "",
        "Ly81/f;",
        "color",
        "<init>",
        "(Ljava/lang/String;ILy81/f;)V",
        "Ly81/f;",
        "getColor",
        "()Ly81/f;",
        "RECOVERY",
        "STRAIN",
        "SLEEP",
        "NO_DATA",
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

.field private static final synthetic $VALUES:[Lw51/a;

.field public static final enum NO_DATA:Lw51/a;

.field public static final enum RECOVERY:Lw51/a;

.field public static final enum SLEEP:Lw51/a;

.field public static final enum STRAIN:Lw51/a;


# instance fields
.field private final color:Ly81/f;


# direct methods
.method private static final synthetic $values()[Lw51/a;
    .locals 4

    sget-object v0, Lw51/a;->RECOVERY:Lw51/a;

    sget-object v1, Lw51/a;->STRAIN:Lw51/a;

    sget-object v2, Lw51/a;->SLEEP:Lw51/a;

    sget-object v3, Lw51/a;->NO_DATA:Lw51/a;

    filled-new-array {v0, v1, v2, v3}, [Lw51/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lw51/a;

    const/4 v1, 0x0

    sget-object v2, Ly81/f;->RECOVERY:Ly81/f;

    const-string v3, "RECOVERY"

    invoke-direct {v0, v3, v1, v2}, Lw51/a;-><init>(Ljava/lang/String;ILy81/f;)V

    sput-object v0, Lw51/a;->RECOVERY:Lw51/a;

    new-instance v0, Lw51/a;

    const/4 v1, 0x1

    sget-object v2, Ly81/f;->STRAIN:Ly81/f;

    const-string v3, "STRAIN"

    invoke-direct {v0, v3, v1, v2}, Lw51/a;-><init>(Ljava/lang/String;ILy81/f;)V

    sput-object v0, Lw51/a;->STRAIN:Lw51/a;

    new-instance v0, Lw51/a;

    const/4 v1, 0x2

    sget-object v2, Ly81/f;->SLEEP:Ly81/f;

    const-string v3, "SLEEP"

    invoke-direct {v0, v3, v1, v2}, Lw51/a;-><init>(Ljava/lang/String;ILy81/f;)V

    sput-object v0, Lw51/a;->SLEEP:Lw51/a;

    new-instance v0, Lw51/a;

    const/4 v1, 0x3

    const/4 v2, 0x0

    const-string v3, "NO_DATA"

    invoke-direct {v0, v3, v1, v2}, Lw51/a;-><init>(Ljava/lang/String;ILy81/f;)V

    sput-object v0, Lw51/a;->NO_DATA:Lw51/a;

    invoke-static {}, Lw51/a;->$values()[Lw51/a;

    move-result-object v0

    sput-object v0, Lw51/a;->$VALUES:[Lw51/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lw51/a;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILy81/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly81/f;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lw51/a;->color:Ly81/f;

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

    sget-object v0, Lw51/a;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lw51/a;
    .locals 1

    const-class v0, Lw51/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lw51/a;

    return-object p0
.end method

.method public static values()[Lw51/a;
    .locals 1

    sget-object v0, Lw51/a;->$VALUES:[Lw51/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lw51/a;

    return-object v0
.end method


# virtual methods
.method public final getColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Lw51/a;->color:Ly81/f;

    return-object v0
.end method
