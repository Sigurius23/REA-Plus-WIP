.class public final enum Lry0/c;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemEnum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lry0/c;",
        ">;",
        "Lcom/whoop/design/models/DesignSystemEnum;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0008\u0086\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B+\u0008\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u000b\u001a\u0004\u0008\u000e\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u000b\u001a\u0004\u0008\u000f\u0010\rR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lry0/c;",
        "Lcom/whoop/design/models/DesignSystemEnum;",
        "",
        "Ly81/f;",
        "backgroundColor",
        "borderColor",
        "iconColor",
        "Ly3/f;",
        "minContentHeight",
        "<init>",
        "(Ljava/lang/String;ILy81/f;Ly81/f;Ly81/f;F)V",
        "Ly81/f;",
        "getBackgroundColor",
        "()Ly81/f;",
        "getBorderColor",
        "getIconColor",
        "F",
        "getMinContentHeight-D9Ej5fM",
        "()F",
        "MCI_FLOW",
        "CERVICAL_MUCUS",
        "BLUE_OUTLINED",
        "DEFAULT",
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

.field private static final synthetic $VALUES:[Lry0/c;

.field public static final enum BLUE_OUTLINED:Lry0/c;

.field public static final enum CERVICAL_MUCUS:Lry0/c;

.field public static final enum DEFAULT:Lry0/c;

.field public static final enum MCI_FLOW:Lry0/c;


# instance fields
.field private final backgroundColor:Ly81/f;

.field private final borderColor:Ly81/f;

.field private final iconColor:Ly81/f;

.field private final minContentHeight:F


# direct methods
.method private static final synthetic $values()[Lry0/c;
    .locals 4

    sget-object v0, Lry0/c;->MCI_FLOW:Lry0/c;

    sget-object v1, Lry0/c;->CERVICAL_MUCUS:Lry0/c;

    sget-object v2, Lry0/c;->BLUE_OUTLINED:Lry0/c;

    sget-object v3, Lry0/c;->DEFAULT:Lry0/c;

    filled-new-array {v0, v1, v2, v3}, [Lry0/c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Lry0/c;

    sget-object v3, Ly81/f;->SURFACE_MCI_MENSTRUAL_DIM:Ly81/f;

    sget-object v4, Ly81/f;->SURFACE_MCI_MENSTRUAL:Ly81/f;

    const/16 v7, 0x8

    const/4 v8, 0x0

    const-string v1, "MCI_FLOW"

    const/4 v2, 0x0

    const/4 v6, 0x0

    move-object v5, v4

    invoke-direct/range {v0 .. v8}, Lry0/c;-><init>(Ljava/lang/String;ILy81/f;Ly81/f;Ly81/f;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lry0/c;->MCI_FLOW:Lry0/c;

    new-instance v1, Lry0/c;

    sget-object v4, Ly81/f;->SURFACE_MCI_OVULATORY_DIM:Ly81/f;

    sget-object v5, Ly81/f;->SURFACE_MCI_OVULATORY:Ly81/f;

    const/16 v8, 0x8

    const/4 v9, 0x0

    const-string v2, "CERVICAL_MUCUS"

    const/4 v3, 0x1

    const/4 v7, 0x0

    move-object v6, v5

    invoke-direct/range {v1 .. v9}, Lry0/c;-><init>(Ljava/lang/String;ILy81/f;Ly81/f;Ly81/f;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lry0/c;->CERVICAL_MUCUS:Lry0/c;

    new-instance v2, Lry0/c;

    sget-object v5, Ly81/f;->NEUTRAL_15:Ly81/f;

    sget-object v6, Ly81/f;->RECOVERY:Ly81/f;

    const/4 v0, 0x0

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float v8, v0, v1

    const-string v3, "BLUE_OUTLINED"

    const/4 v4, 0x2

    move-object v7, v6

    invoke-direct/range {v2 .. v8}, Lry0/c;-><init>(Ljava/lang/String;ILy81/f;Ly81/f;Ly81/f;F)V

    sput-object v2, Lry0/c;->BLUE_OUTLINED:Lry0/c;

    new-instance v3, Lry0/c;

    sget-object v6, Ly81/f;->WHITE_10:Ly81/f;

    sget-object v7, Ly81/f;->BRAND_WHITE:Ly81/f;

    const/16 v10, 0x8

    const/4 v11, 0x0

    const-string v4, "DEFAULT"

    const/4 v5, 0x3

    const/4 v9, 0x0

    move-object v8, v7

    invoke-direct/range {v3 .. v11}, Lry0/c;-><init>(Ljava/lang/String;ILy81/f;Ly81/f;Ly81/f;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v3, Lry0/c;->DEFAULT:Lry0/c;

    invoke-static {}, Lry0/c;->$values()[Lry0/c;

    move-result-object v0

    sput-object v0, Lry0/c;->$VALUES:[Lry0/c;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lry0/c;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILy81/f;Ly81/f;Ly81/f;F)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly81/f;",
            "Ly81/f;",
            "Ly81/f;",
            "F)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-object p3, p0, Lry0/c;->backgroundColor:Ly81/f;

    .line 3
    iput-object p4, p0, Lry0/c;->borderColor:Ly81/f;

    .line 4
    iput-object p5, p0, Lry0/c;->iconColor:Ly81/f;

    .line 5
    iput p6, p0, Lry0/c;->minContentHeight:F

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILy81/f;Ly81/f;Ly81/f;FILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    const/16 p8, 0x8

    and-int/2addr p7, p8

    if-eqz p7, :cond_0

    int-to-float p6, p8

    const/4 p7, 0x4

    int-to-float p7, p7

    mul-float/2addr p6, p7

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    .line 6
    invoke-direct/range {v0 .. v6}, Lry0/c;-><init>(Ljava/lang/String;ILy81/f;Ly81/f;Ly81/f;F)V

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

    sget-object v0, Lry0/c;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lry0/c;
    .locals 1

    const-class v0, Lry0/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lry0/c;

    return-object p0
.end method

.method public static values()[Lry0/c;
    .locals 1

    sget-object v0, Lry0/c;->$VALUES:[Lry0/c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lry0/c;

    return-object v0
.end method


# virtual methods
.method public final getBackgroundColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Lry0/c;->backgroundColor:Ly81/f;

    return-object v0
.end method

.method public final getBorderColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Lry0/c;->borderColor:Ly81/f;

    return-object v0
.end method

.method public final getIconColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Lry0/c;->iconColor:Ly81/f;

    return-object v0
.end method

.method public final getMinContentHeight-D9Ej5fM()F
    .locals 1

    iget v0, p0, Lry0/c;->minContentHeight:F

    return v0
.end method
