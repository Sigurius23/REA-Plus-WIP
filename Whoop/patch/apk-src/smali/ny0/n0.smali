.class public final enum Lny0/n0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lny0/n0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B)\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0011\u001a\u0004\u0008\u0014\u0010\u0013j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lny0/n0;",
        "",
        "Lb91/a;",
        "style",
        "Ll0/k1;",
        "textPadding",
        "Ly3/f;",
        "iconSize",
        "iconPaddingLeft",
        "<init>",
        "(Ljava/lang/String;ILb91/a;Ll0/k1;FF)V",
        "Lb91/a;",
        "getStyle",
        "()Lb91/a;",
        "Ll0/k1;",
        "getTextPadding",
        "()Ll0/k1;",
        "F",
        "getIconSize-D9Ej5fM",
        "()F",
        "getIconPaddingLeft-D9Ej5fM",
        "TextSmall",
        "TextMedium",
        "TextLarge",
        "NumbersSmall",
        "NumbersMedium",
        "NumbersLarge",
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

.field private static final synthetic $VALUES:[Lny0/n0;

.field public static final enum NumbersLarge:Lny0/n0;

.field public static final enum NumbersMedium:Lny0/n0;

.field public static final enum NumbersSmall:Lny0/n0;

.field public static final enum TextLarge:Lny0/n0;

.field public static final enum TextMedium:Lny0/n0;

.field public static final enum TextSmall:Lny0/n0;


# instance fields
.field private final iconPaddingLeft:F

.field private final iconSize:F

.field private final style:Lb91/a;

.field private final textPadding:Ll0/k1;


# direct methods
.method private static final synthetic $values()[Lny0/n0;
    .locals 6

    sget-object v0, Lny0/n0;->TextSmall:Lny0/n0;

    sget-object v1, Lny0/n0;->TextMedium:Lny0/n0;

    sget-object v2, Lny0/n0;->TextLarge:Lny0/n0;

    sget-object v3, Lny0/n0;->NumbersSmall:Lny0/n0;

    sget-object v4, Lny0/n0;->NumbersMedium:Lny0/n0;

    sget-object v5, Lny0/n0;->NumbersLarge:Lny0/n0;

    filled-new-array/range {v0 .. v5}, [Lny0/n0;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 22

    new-instance v0, Lny0/n0;

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->k()Lb91/a;

    move-result-object v3

    const-wide/high16 v1, 0x3ff8000000000000L    # 1.5

    double-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v7, v2

    mul-float v14, v1, v7

    const/4 v1, 0x1

    int-to-float v1, v1

    mul-float v6, v1, v7

    new-instance v4, Ll0/l1;

    invoke-direct {v4, v14, v6, v14, v6}, Ll0/l1;-><init>(FFFF)V

    const/4 v1, 0x4

    int-to-float v15, v1

    mul-float v20, v15, v15

    const-string v1, "TextSmall"

    const/4 v2, 0x0

    move/from16 v5, v20

    invoke-direct/range {v0 .. v6}, Lny0/n0;-><init>(Ljava/lang/String;ILb91/a;Ll0/k1;FF)V

    sput-object v0, Lny0/n0;->TextSmall:Lny0/n0;

    new-instance v8, Lny0/n0;

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->j()Lb91/a;

    move-result-object v11

    const/4 v0, 0x2

    int-to-float v0, v0

    mul-float/2addr v0, v7

    new-instance v12, Ll0/l1;

    invoke-direct {v12, v0, v14, v0, v14}, Ll0/l1;-><init>(FFFF)V

    const/4 v1, 0x5

    int-to-float v1, v1

    mul-float v13, v1, v15

    const-string v9, "TextMedium"

    const/4 v10, 0x1

    invoke-direct/range {v8 .. v14}, Lny0/n0;-><init>(Ljava/lang/String;ILb91/a;Ll0/k1;FF)V

    sput-object v8, Lny0/n0;->TextMedium:Lny0/n0;

    new-instance v8, Lny0/n0;

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->i()Lb91/a;

    move-result-object v11

    const-wide/high16 v1, 0x4004000000000000L    # 2.5

    double-to-float v1, v1

    mul-float/2addr v1, v7

    new-instance v12, Ll0/l1;

    invoke-direct {v12, v1, v14, v1, v14}, Ll0/l1;-><init>(FFFF)V

    const-string v9, "TextLarge"

    const/4 v10, 0x2

    invoke-direct/range {v8 .. v14}, Lny0/n0;-><init>(Ljava/lang/String;ILb91/a;Ll0/k1;FF)V

    sput-object v8, Lny0/n0;->TextLarge:Lny0/n0;

    move v2, v15

    new-instance v15, Lny0/n0;

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->h()Lb91/a;

    move-result-object v18

    new-instance v3, Ll0/l1;

    invoke-direct {v3, v0, v6, v0, v6}, Ll0/l1;-><init>(FFFF)V

    const-string v16, "NumbersSmall"

    const/16 v17, 0x3

    move-object/from16 v19, v3

    move/from16 v21, v6

    invoke-direct/range {v15 .. v21}, Lny0/n0;-><init>(Ljava/lang/String;ILb91/a;Ll0/k1;FF)V

    sput-object v15, Lny0/n0;->NumbersSmall:Lny0/n0;

    new-instance v8, Lny0/n0;

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->g()Lb91/a;

    move-result-object v11

    new-instance v12, Ll0/l1;

    invoke-direct {v12, v1, v14, v1, v14}, Ll0/l1;-><init>(FFFF)V

    const/4 v0, 0x6

    int-to-float v0, v0

    mul-float v13, v0, v2

    const-string v9, "NumbersMedium"

    const/4 v10, 0x4

    invoke-direct/range {v8 .. v14}, Lny0/n0;-><init>(Ljava/lang/String;ILb91/a;Ll0/k1;FF)V

    sput-object v8, Lny0/n0;->NumbersMedium:Lny0/n0;

    new-instance v8, Lny0/n0;

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->f()Lb91/a;

    move-result-object v11

    const-wide/high16 v0, 0x400c000000000000L    # 3.5

    double-to-float v0, v0

    mul-float/2addr v0, v7

    new-instance v12, Ll0/l1;

    invoke-direct {v12, v0, v14, v0, v14}, Ll0/l1;-><init>(FFFF)V

    mul-float v13, v7, v2

    const-string v9, "NumbersLarge"

    const/4 v10, 0x5

    invoke-direct/range {v8 .. v14}, Lny0/n0;-><init>(Ljava/lang/String;ILb91/a;Ll0/k1;FF)V

    sput-object v8, Lny0/n0;->NumbersLarge:Lny0/n0;

    invoke-static {}, Lny0/n0;->$values()[Lny0/n0;

    move-result-object v0

    sput-object v0, Lny0/n0;->$VALUES:[Lny0/n0;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lny0/n0;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILb91/a;Ll0/k1;FF)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb91/a;",
            "Ll0/k1;",
            "FF)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lny0/n0;->style:Lb91/a;

    iput-object p4, p0, Lny0/n0;->textPadding:Ll0/k1;

    iput p5, p0, Lny0/n0;->iconSize:F

    iput p6, p0, Lny0/n0;->iconPaddingLeft:F

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

    sget-object v0, Lny0/n0;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lny0/n0;
    .locals 1

    const-class v0, Lny0/n0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lny0/n0;

    return-object p0
.end method

.method public static values()[Lny0/n0;
    .locals 1

    sget-object v0, Lny0/n0;->$VALUES:[Lny0/n0;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lny0/n0;

    return-object v0
.end method


# virtual methods
.method public final getIconPaddingLeft-D9Ej5fM()F
    .locals 1

    iget v0, p0, Lny0/n0;->iconPaddingLeft:F

    return v0
.end method

.method public final getIconSize-D9Ej5fM()F
    .locals 1

    iget v0, p0, Lny0/n0;->iconSize:F

    return v0
.end method

.method public final getStyle()Lb91/a;
    .locals 1

    iget-object v0, p0, Lny0/n0;->style:Lb91/a;

    return-object v0
.end method

.method public final getTextPadding()Ll0/k1;
    .locals 1

    iget-object v0, p0, Lny0/n0;->textPadding:Ll0/k1;

    return-object v0
.end method
