.class public final enum Lzy0/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lzy0/d;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0007\u001a\u0004\u0008\n\u0010\tj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lzy0/d;",
        "",
        "Ly3/f;",
        "startCornerPadding",
        "endCornerPadding",
        "<init>",
        "(Ljava/lang/String;IFF)V",
        "F",
        "getStartCornerPadding-D9Ej5fM",
        "()F",
        "getEndCornerPadding-D9Ej5fM",
        "DEFAULT",
        "LEFT",
        "RIGHT",
        "CENTER",
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

.field private static final synthetic $VALUES:[Lzy0/d;

.field public static final enum CENTER:Lzy0/d;

.field public static final enum DEFAULT:Lzy0/d;

.field public static final enum LEFT:Lzy0/d;

.field public static final enum RIGHT:Lzy0/d;


# instance fields
.field private final endCornerPadding:F

.field private final startCornerPadding:F


# direct methods
.method private static final synthetic $values()[Lzy0/d;
    .locals 4

    sget-object v0, Lzy0/d;->DEFAULT:Lzy0/d;

    sget-object v1, Lzy0/d;->LEFT:Lzy0/d;

    sget-object v2, Lzy0/d;->RIGHT:Lzy0/d;

    sget-object v3, Lzy0/d;->CENTER:Lzy0/d;

    filled-new-array {v0, v1, v2, v3}, [Lzy0/d;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lzy0/d;

    const/4 v1, 0x1

    int-to-float v2, v1

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float/2addr v2, v3

    const-string v4, "DEFAULT"

    const/4 v5, 0x0

    invoke-direct {v0, v4, v5, v2, v2}, Lzy0/d;-><init>(Ljava/lang/String;IFF)V

    sput-object v0, Lzy0/d;->DEFAULT:Lzy0/d;

    new-instance v0, Lzy0/d;

    int-to-float v4, v5

    mul-float/2addr v4, v3

    const-string v3, "LEFT"

    invoke-direct {v0, v3, v1, v2, v4}, Lzy0/d;-><init>(Ljava/lang/String;IFF)V

    sput-object v0, Lzy0/d;->LEFT:Lzy0/d;

    new-instance v0, Lzy0/d;

    const-string v1, "RIGHT"

    const/4 v3, 0x2

    invoke-direct {v0, v1, v3, v4, v2}, Lzy0/d;-><init>(Ljava/lang/String;IFF)V

    sput-object v0, Lzy0/d;->RIGHT:Lzy0/d;

    new-instance v0, Lzy0/d;

    const-string v1, "CENTER"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v4, v4}, Lzy0/d;-><init>(Ljava/lang/String;IFF)V

    sput-object v0, Lzy0/d;->CENTER:Lzy0/d;

    invoke-static {}, Lzy0/d;->$values()[Lzy0/d;

    move-result-object v0

    sput-object v0, Lzy0/d;->$VALUES:[Lzy0/d;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lzy0/d;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IFF)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FF)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lzy0/d;->startCornerPadding:F

    iput p4, p0, Lzy0/d;->endCornerPadding:F

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

    sget-object v0, Lzy0/d;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lzy0/d;
    .locals 1

    const-class v0, Lzy0/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lzy0/d;

    return-object p0
.end method

.method public static values()[Lzy0/d;
    .locals 1

    sget-object v0, Lzy0/d;->$VALUES:[Lzy0/d;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lzy0/d;

    return-object v0
.end method


# virtual methods
.method public final getEndCornerPadding-D9Ej5fM()F
    .locals 1

    iget v0, p0, Lzy0/d;->endCornerPadding:F

    return v0
.end method

.method public final getStartCornerPadding-D9Ej5fM()F
    .locals 1

    iget v0, p0, Lzy0/d;->startCornerPadding:F

    return v0
.end method
