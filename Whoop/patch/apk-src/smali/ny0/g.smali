.class public final enum Lny0/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lny0/g;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0018\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001BK\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0010\u001a\u0004\u0008\u0013\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0010\u001a\u0004\u0008\u0017\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u001e\u001a\u0004\u0008\u001f\u0010 j\u0002\u0008!j\u0002\u0008\"j\u0002\u0008#\u00a8\u0006$"
    }
    d2 = {
        "Lny0/g;",
        "",
        "Ly3/f;",
        "verticalPadding",
        "cornerRadius",
        "Lb91/a;",
        "textStyle",
        "horizontalPadding",
        "Lny0/f;",
        "shape",
        "Lny0/i;",
        "widthScaleMode",
        "",
        "maxLines",
        "<init>",
        "(Ljava/lang/String;IFFLb91/a;FLny0/f;Lny0/i;I)V",
        "F",
        "getVerticalPadding-D9Ej5fM",
        "()F",
        "getCornerRadius-D9Ej5fM",
        "Lb91/a;",
        "getTextStyle",
        "()Lb91/a;",
        "getHorizontalPadding-D9Ej5fM",
        "Lny0/f;",
        "getShape",
        "()Lny0/f;",
        "Lny0/i;",
        "getWidthScaleMode",
        "()Lny0/i;",
        "I",
        "getMaxLines",
        "()I",
        "STANDARD",
        "COMPACT",
        "CHIP",
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

.field private static final synthetic $VALUES:[Lny0/g;

.field public static final enum CHIP:Lny0/g;

.field public static final enum COMPACT:Lny0/g;

.field public static final enum STANDARD:Lny0/g;


# instance fields
.field private final cornerRadius:F

.field private final horizontalPadding:F

.field private final maxLines:I

.field private final shape:Lny0/f;

.field private final textStyle:Lb91/a;

.field private final verticalPadding:F

.field private final widthScaleMode:Lny0/i;


# direct methods
.method private static final synthetic $values()[Lny0/g;
    .locals 3

    sget-object v0, Lny0/g;->STANDARD:Lny0/g;

    sget-object v1, Lny0/g;->COMPACT:Lny0/g;

    sget-object v2, Lny0/g;->CHIP:Lny0/g;

    filled-new-array {v0, v1, v2}, [Lny0/g;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 31

    new-instance v0, Lny0/g;

    const-wide/high16 v1, 0x4000000000000000L    # 2.0

    double-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v12, v2

    mul-float v3, v1, v12

    const/4 v1, 0x4

    int-to-float v13, v1

    mul-float v18, v13, v13

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->i()Lb91/a;

    move-result-object v5

    const/16 v10, 0x78

    const/4 v11, 0x0

    const-string v1, "STANDARD"

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move/from16 v4, v18

    invoke-direct/range {v0 .. v11}, Lny0/g;-><init>(Ljava/lang/String;IFFLb91/a;FLny0/f;Lny0/i;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lny0/g;->STANDARD:Lny0/g;

    new-instance v19, Lny0/g;

    const-wide/high16 v0, 0x3ff8000000000000L    # 1.5

    double-to-float v0, v0

    mul-float v22, v0, v12

    const/4 v0, 0x2

    int-to-float v0, v0

    mul-float v23, v0, v13

    const/16 v29, 0x7c

    const/16 v30, 0x0

    const-string v20, "COMPACT"

    const/16 v21, 0x1

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    invoke-direct/range {v19 .. v30}, Lny0/g;-><init>(Ljava/lang/String;IFFLb91/a;FLny0/f;Lny0/i;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v19, Lny0/g;->COMPACT:Lny0/g;

    new-instance v14, Lny0/g;

    const/4 v1, 0x1

    int-to-float v1, v1

    mul-float v17, v1, v12

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->b()Lb91/a;

    move-result-object v19

    mul-float v20, v0, v12

    sget-object v21, Lny0/f;->PILL:Lny0/f;

    sget-object v22, Lny0/i;->HUG:Lny0/i;

    const/16 v23, 0x1

    const-string v15, "CHIP"

    const/16 v16, 0x2

    invoke-direct/range {v14 .. v23}, Lny0/g;-><init>(Ljava/lang/String;IFFLb91/a;FLny0/f;Lny0/i;I)V

    sput-object v14, Lny0/g;->CHIP:Lny0/g;

    invoke-static {}, Lny0/g;->$values()[Lny0/g;

    move-result-object v0

    sput-object v0, Lny0/g;->$VALUES:[Lny0/g;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lny0/g;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IFFLb91/a;FLny0/f;Lny0/i;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FF",
            "Lb91/a;",
            "F",
            "Lny0/f;",
            "Lny0/i;",
            "I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput p3, p0, Lny0/g;->verticalPadding:F

    .line 3
    iput p4, p0, Lny0/g;->cornerRadius:F

    .line 4
    iput-object p5, p0, Lny0/g;->textStyle:Lb91/a;

    .line 5
    iput p6, p0, Lny0/g;->horizontalPadding:F

    .line 6
    iput-object p7, p0, Lny0/g;->shape:Lny0/f;

    .line 7
    iput-object p8, p0, Lny0/g;->widthScaleMode:Lny0/i;

    .line 8
    iput p9, p0, Lny0/g;->maxLines:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IFFLb91/a;FLny0/f;Lny0/i;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    and-int/lit8 v0, p10, 0x4

    if-eqz v0, :cond_0

    .line 9
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->s()Lb91/a;

    move-result-object v0

    move-object v6, v0

    goto :goto_0

    :cond_0
    move-object/from16 v6, p5

    :goto_0
    and-int/lit8 v0, p10, 0x8

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    int-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v0, v1

    move v7, v0

    goto :goto_1

    :cond_1
    move/from16 v7, p6

    :goto_1
    and-int/lit8 v0, p10, 0x10

    if-eqz v0, :cond_2

    .line 10
    sget-object v0, Lny0/f;->ROUNDED:Lny0/f;

    move-object v8, v0

    goto :goto_2

    :cond_2
    move-object/from16 v8, p7

    :goto_2
    and-int/lit8 v0, p10, 0x20

    if-eqz v0, :cond_3

    .line 11
    sget-object v0, Lny0/i;->FLEXIBLE:Lny0/i;

    move-object v9, v0

    goto :goto_3

    :cond_3
    move-object/from16 v9, p8

    :goto_3
    and-int/lit8 v0, p10, 0x40

    if-eqz v0, :cond_4

    const/4 v0, 0x2

    move v10, v0

    :goto_4
    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    goto :goto_5

    :cond_4
    move/from16 v10, p9

    goto :goto_4

    .line 12
    :goto_5
    invoke-direct/range {v1 .. v10}, Lny0/g;-><init>(Ljava/lang/String;IFFLb91/a;FLny0/f;Lny0/i;I)V

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

    sget-object v0, Lny0/g;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lny0/g;
    .locals 1

    const-class v0, Lny0/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lny0/g;

    return-object p0
.end method

.method public static values()[Lny0/g;
    .locals 1

    sget-object v0, Lny0/g;->$VALUES:[Lny0/g;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lny0/g;

    return-object v0
.end method


# virtual methods
.method public final getCornerRadius-D9Ej5fM()F
    .locals 1

    iget v0, p0, Lny0/g;->cornerRadius:F

    return v0
.end method

.method public final getHorizontalPadding-D9Ej5fM()F
    .locals 1

    iget v0, p0, Lny0/g;->horizontalPadding:F

    return v0
.end method

.method public final getMaxLines()I
    .locals 1

    iget v0, p0, Lny0/g;->maxLines:I

    return v0
.end method

.method public final getShape()Lny0/f;
    .locals 1

    iget-object v0, p0, Lny0/g;->shape:Lny0/f;

    return-object v0
.end method

.method public final getTextStyle()Lb91/a;
    .locals 1

    iget-object v0, p0, Lny0/g;->textStyle:Lb91/a;

    return-object v0
.end method

.method public final getVerticalPadding-D9Ej5fM()F
    .locals 1

    iget v0, p0, Lny0/g;->verticalPadding:F

    return v0
.end method

.method public final getWidthScaleMode()Lny0/i;
    .locals 1

    iget-object v0, p0, Lny0/g;->widthScaleMode:Lny0/i;

    return-object v0
.end method
