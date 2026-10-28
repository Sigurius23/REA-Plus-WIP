.class public final enum Lf21/a;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemEnum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lf21/a;",
        ">;",
        "Lcom/whoop/design/models/DesignSystemEnum;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0086\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B!\u0008\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0005\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\n\u001a\u0004\u0008\r\u0010\u000cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lf21/a;",
        "Lcom/whoop/design/models/DesignSystemEnum;",
        "",
        "Ly3/f;",
        "iconSize",
        "spacing",
        "Lb2/g;",
        "verticalAlignment",
        "<init>",
        "(Ljava/lang/String;IFFLb2/g;)V",
        "F",
        "getIconSize-D9Ej5fM",
        "()F",
        "getSpacing-D9Ej5fM",
        "Lb2/g;",
        "getVerticalAlignment",
        "()Lb2/g;",
        "COMPACT",
        "PROMINENT",
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

.field private static final synthetic $VALUES:[Lf21/a;

.field public static final enum COMPACT:Lf21/a;

.field public static final enum PROMINENT:Lf21/a;


# instance fields
.field private final iconSize:F

.field private final spacing:F

.field private final verticalAlignment:Lb2/g;


# direct methods
.method private static final synthetic $values()[Lf21/a;
    .locals 2

    sget-object v0, Lf21/a;->COMPACT:Lf21/a;

    sget-object v1, Lf21/a;->PROMINENT:Lf21/a;

    filled-new-array {v0, v1}, [Lf21/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Lf21/a;

    const/4 v1, 0x4

    int-to-float v6, v1

    mul-float v3, v6, v6

    const/4 v1, 0x1

    int-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v7, v2

    mul-float v4, v1, v7

    sget-object v5, Lb2/e;->K:Lb2/l;

    const-string v1, "COMPACT"

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v5}, Lf21/a;-><init>(Ljava/lang/String;IFFLb2/g;)V

    sput-object v0, Lf21/a;->COMPACT:Lf21/a;

    new-instance v8, Lf21/a;

    const/4 v0, 0x5

    int-to-float v0, v0

    mul-float v11, v0, v6

    const-wide/high16 v0, 0x3ff8000000000000L    # 1.5

    double-to-float v0, v0

    mul-float v12, v0, v7

    sget-object v13, Lb2/e;->J:Lb2/l;

    const-string v9, "PROMINENT"

    const/4 v10, 0x1

    invoke-direct/range {v8 .. v13}, Lf21/a;-><init>(Ljava/lang/String;IFFLb2/g;)V

    sput-object v8, Lf21/a;->PROMINENT:Lf21/a;

    invoke-static {}, Lf21/a;->$values()[Lf21/a;

    move-result-object v0

    sput-object v0, Lf21/a;->$VALUES:[Lf21/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lf21/a;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IFFLb2/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FF",
            "Lb2/g;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lf21/a;->iconSize:F

    iput p4, p0, Lf21/a;->spacing:F

    iput-object p5, p0, Lf21/a;->verticalAlignment:Lb2/g;

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

    sget-object v0, Lf21/a;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lf21/a;
    .locals 1

    const-class v0, Lf21/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lf21/a;

    return-object p0
.end method

.method public static values()[Lf21/a;
    .locals 1

    sget-object v0, Lf21/a;->$VALUES:[Lf21/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf21/a;

    return-object v0
.end method


# virtual methods
.method public final getIconSize-D9Ej5fM()F
    .locals 1

    iget v0, p0, Lf21/a;->iconSize:F

    return v0
.end method

.method public final getSpacing-D9Ej5fM()F
    .locals 1

    iget v0, p0, Lf21/a;->spacing:F

    return v0
.end method

.method public final getVerticalAlignment()Lb2/g;
    .locals 1

    iget-object v0, p0, Lf21/a;->verticalAlignment:Lb2/g;

    return-object v0
.end method
