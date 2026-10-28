.class public final enum Lny0/d0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lny0/d0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B9\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\n\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\r\u001a\u0004\u0008\u0010\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\r\u001a\u0004\u0008\u0011\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\r\u001a\u0004\u0008\u0018\u0010\u000fj\u0002\u0008\u0019j\u0002\u0008\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lny0/d0;",
        "",
        "",
        "padding",
        "canvasSize",
        "toggleSize",
        "Lf0/t;",
        "borderStroke",
        "Ly81/f;",
        "textColor",
        "textSpacing",
        "<init>",
        "(Ljava/lang/String;IFFFLf0/t;Ly81/f;F)V",
        "F",
        "getPadding",
        "()F",
        "getCanvasSize",
        "getToggleSize",
        "Lf0/t;",
        "getBorderStroke",
        "()Lf0/t;",
        "Ly81/f;",
        "getTextColor",
        "()Ly81/f;",
        "getTextSpacing",
        "DEFAULT",
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

.field private static final synthetic $VALUES:[Lny0/d0;

.field public static final enum COMPACT:Lny0/d0;

.field public static final enum DEFAULT:Lny0/d0;


# instance fields
.field private final borderStroke:Lf0/t;

.field private final canvasSize:F

.field private final padding:F

.field private final textColor:Ly81/f;

.field private final textSpacing:F

.field private final toggleSize:F


# direct methods
.method private static final synthetic $values()[Lny0/d0;
    .locals 2

    sget-object v0, Lny0/d0;->DEFAULT:Lny0/d0;

    sget-object v1, Lny0/d0;->COMPACT:Lny0/d0;

    filled-new-array {v0, v1}, [Lny0/d0;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lny0/d0;

    invoke-static {}, Lz81/d;->q()Lz81/b;

    move-result-object v1

    invoke-virtual {v1}, Lz81/b;->c()Lf0/t;

    move-result-object v6

    sget-object v7, Ly81/f;->WHITE_70:Ly81/f;

    const/high16 v8, 0x40400000    # 3.0f

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    const/high16 v4, 0x40f00000    # 7.5f

    const/high16 v5, 0x40000000    # 2.0f

    invoke-direct/range {v0 .. v8}, Lny0/d0;-><init>(Ljava/lang/String;IFFFLf0/t;Ly81/f;F)V

    sput-object v0, Lny0/d0;->DEFAULT:Lny0/d0;

    new-instance v1, Lny0/d0;

    invoke-static {}, Lz81/d;->q()Lz81/b;

    move-result-object v0

    invoke-virtual {v0}, Lz81/b;->d()Lf0/t;

    move-result-object v7

    sget-object v8, Ly81/f;->BRAND_WHITE:Ly81/f;

    const/high16 v9, 0x40000000    # 2.0f

    const-string v2, "COMPACT"

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/high16 v5, 0x40b00000    # 5.5f

    const/high16 v6, 0x3fc00000    # 1.5f

    invoke-direct/range {v1 .. v9}, Lny0/d0;-><init>(Ljava/lang/String;IFFFLf0/t;Ly81/f;F)V

    sput-object v1, Lny0/d0;->COMPACT:Lny0/d0;

    invoke-static {}, Lny0/d0;->$values()[Lny0/d0;

    move-result-object v0

    sput-object v0, Lny0/d0;->$VALUES:[Lny0/d0;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lny0/d0;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IFFFLf0/t;Ly81/f;F)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FFF",
            "Lf0/t;",
            "Ly81/f;",
            "F)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lny0/d0;->padding:F

    iput p4, p0, Lny0/d0;->canvasSize:F

    iput p5, p0, Lny0/d0;->toggleSize:F

    iput-object p6, p0, Lny0/d0;->borderStroke:Lf0/t;

    iput-object p7, p0, Lny0/d0;->textColor:Ly81/f;

    iput p8, p0, Lny0/d0;->textSpacing:F

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

    sget-object v0, Lny0/d0;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lny0/d0;
    .locals 1

    const-class v0, Lny0/d0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lny0/d0;

    return-object p0
.end method

.method public static values()[Lny0/d0;
    .locals 1

    sget-object v0, Lny0/d0;->$VALUES:[Lny0/d0;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lny0/d0;

    return-object v0
.end method


# virtual methods
.method public final getBorderStroke()Lf0/t;
    .locals 1

    iget-object v0, p0, Lny0/d0;->borderStroke:Lf0/t;

    return-object v0
.end method

.method public final getCanvasSize()F
    .locals 1

    iget v0, p0, Lny0/d0;->canvasSize:F

    return v0
.end method

.method public final getPadding()F
    .locals 1

    iget v0, p0, Lny0/d0;->padding:F

    return v0
.end method

.method public final getTextColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Lny0/d0;->textColor:Ly81/f;

    return-object v0
.end method

.method public final getTextSpacing()F
    .locals 1

    iget v0, p0, Lny0/d0;->textSpacing:F

    return v0
.end method

.method public final getToggleSize()F
    .locals 1

    iget v0, p0, Lny0/d0;->toggleSize:F

    return v0
.end method
