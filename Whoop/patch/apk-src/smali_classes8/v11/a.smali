.class public final enum Lv11/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lv11/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B)\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\t\u001a\u0004\u0008\u000c\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\t\u001a\u0004\u0008\r\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\t\u001a\u0004\u0008\u000e\u0010\u000bj\u0002\u0008\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lv11/a;",
        "",
        "Ly3/f;",
        "height",
        "horizontalPadding",
        "cornerRadius",
        "iconSize",
        "<init>",
        "(Ljava/lang/String;IFFFF)V",
        "F",
        "getHeight-D9Ej5fM",
        "()F",
        "getHorizontalPadding-D9Ej5fM",
        "getCornerRadius-D9Ej5fM",
        "getIconSize-D9Ej5fM",
        "COMPACT",
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

.field private static final synthetic $VALUES:[Lv11/a;

.field public static final enum COMPACT:Lv11/a;


# instance fields
.field private final cornerRadius:F

.field private final height:F

.field private final horizontalPadding:F

.field private final iconSize:F


# direct methods
.method private static final synthetic $values()[Lv11/a;
    .locals 1

    sget-object v0, Lv11/a;->COMPACT:Lv11/a;

    filled-new-array {v0}, [Lv11/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lv11/a;

    const/16 v1, 0xa

    int-to-float v1, v1

    const/4 v2, 0x4

    int-to-float v2, v2

    mul-float v3, v1, v2

    const-wide/high16 v4, 0x3ff8000000000000L    # 1.5

    double-to-float v1, v4

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v4, v1

    const/4 v1, 0x2

    int-to-float v1, v1

    mul-float v5, v1, v2

    const/4 v1, 0x6

    int-to-float v1, v1

    mul-float v6, v1, v2

    const-string v1, "COMPACT"

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v6}, Lv11/a;-><init>(Ljava/lang/String;IFFFF)V

    sput-object v0, Lv11/a;->COMPACT:Lv11/a;

    invoke-static {}, Lv11/a;->$values()[Lv11/a;

    move-result-object v0

    sput-object v0, Lv11/a;->$VALUES:[Lv11/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lv11/a;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IFFFF)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FFFF)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lv11/a;->height:F

    iput p4, p0, Lv11/a;->horizontalPadding:F

    iput p5, p0, Lv11/a;->cornerRadius:F

    iput p6, p0, Lv11/a;->iconSize:F

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

    sget-object v0, Lv11/a;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lv11/a;
    .locals 1

    const-class v0, Lv11/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lv11/a;

    return-object p0
.end method

.method public static values()[Lv11/a;
    .locals 1

    sget-object v0, Lv11/a;->$VALUES:[Lv11/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lv11/a;

    return-object v0
.end method


# virtual methods
.method public final getCornerRadius-D9Ej5fM()F
    .locals 1

    iget v0, p0, Lv11/a;->cornerRadius:F

    return v0
.end method

.method public final getHeight-D9Ej5fM()F
    .locals 1

    iget v0, p0, Lv11/a;->height:F

    return v0
.end method

.method public final getHorizontalPadding-D9Ej5fM()F
    .locals 1

    iget v0, p0, Lv11/a;->horizontalPadding:F

    return v0
.end method

.method public final getIconSize-D9Ej5fM()F
    .locals 1

    iget v0, p0, Lv11/a;->iconSize:F

    return v0
.end method
