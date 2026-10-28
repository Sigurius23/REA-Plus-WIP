.class public final enum Lm62/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lm62/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0013\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B;\u0008\u0002\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u000f\u001a\u0004\u0008\u0012\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018j\u0002\u0008\u0019j\u0002\u0008\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lm62/a;",
        "",
        "",
        "backgroundImage",
        "leftIcon",
        "rightIcon",
        "Ly3/f;",
        "paddingBottom",
        "",
        "addBottomSpacer",
        "<init>",
        "(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;FZ)V",
        "I",
        "getBackgroundImage",
        "()I",
        "Ljava/lang/Integer;",
        "getLeftIcon",
        "()Ljava/lang/Integer;",
        "getRightIcon",
        "F",
        "getPaddingBottom-D9Ej5fM",
        "()F",
        "Z",
        "getAddBottomSpacer",
        "()Z",
        "STANDARD",
        "YEAR_IN_REVIEW",
        "refer-a-friend_release"
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

.field private static final synthetic $VALUES:[Lm62/a;

.field public static final enum STANDARD:Lm62/a;

.field public static final enum YEAR_IN_REVIEW:Lm62/a;


# instance fields
.field private final addBottomSpacer:Z

.field private final backgroundImage:I

.field private final leftIcon:Ljava/lang/Integer;

.field private final paddingBottom:F

.field private final rightIcon:Ljava/lang/Integer;


# direct methods
.method private static final synthetic $values()[Lm62/a;
    .locals 2

    sget-object v0, Lm62/a;->STANDARD:Lm62/a;

    sget-object v1, Lm62/a;->YEAR_IN_REVIEW:Lm62/a;

    filled-new-array {v0, v1}, [Lm62/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 18

    new-instance v0, Lm62/a;

    sget v3, Lf62/a;->b:I

    sget-object v8, Lx81/d;->a:Lx81/d;

    invoke-static {v8}, Ly00/t7;->e(Lx81/d;)Ljava/lang/Integer;

    move-result-object v4

    const/4 v1, 0x2

    int-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v9, v2

    mul-float v6, v1, v9

    const/4 v7, 0x1

    const-string v1, "STANDARD"

    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Lm62/a;-><init>(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;FZ)V

    sput-object v0, Lm62/a;->STANDARD:Lm62/a;

    new-instance v10, Lm62/a;

    sget v13, Lf62/a;->d:I

    invoke-static {v8}, Ly00/t7;->e(Lx81/d;)Ljava/lang/Integer;

    move-result-object v15

    const-wide v0, 0x4025800000000000L    # 10.75

    double-to-float v0, v0

    mul-float v16, v0, v9

    const/16 v17, 0x0

    const-string v11, "YEAR_IN_REVIEW"

    const/4 v12, 0x1

    const/4 v14, 0x0

    invoke-direct/range {v10 .. v17}, Lm62/a;-><init>(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;FZ)V

    sput-object v10, Lm62/a;->YEAR_IN_REVIEW:Lm62/a;

    invoke-static {}, Lm62/a;->$values()[Lm62/a;

    move-result-object v0

    sput-object v0, Lm62/a;->$VALUES:[Lm62/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lm62/a;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;FZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "FZ)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lm62/a;->backgroundImage:I

    iput-object p4, p0, Lm62/a;->leftIcon:Ljava/lang/Integer;

    iput-object p5, p0, Lm62/a;->rightIcon:Ljava/lang/Integer;

    iput p6, p0, Lm62/a;->paddingBottom:F

    iput-boolean p7, p0, Lm62/a;->addBottomSpacer:Z

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

    sget-object v0, Lm62/a;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lm62/a;
    .locals 1

    const-class v0, Lm62/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lm62/a;

    return-object p0
.end method

.method public static values()[Lm62/a;
    .locals 1

    sget-object v0, Lm62/a;->$VALUES:[Lm62/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lm62/a;

    return-object v0
.end method


# virtual methods
.method public final getAddBottomSpacer()Z
    .locals 1

    iget-boolean v0, p0, Lm62/a;->addBottomSpacer:Z

    return v0
.end method

.method public final getBackgroundImage()I
    .locals 1

    iget v0, p0, Lm62/a;->backgroundImage:I

    return v0
.end method

.method public final getLeftIcon()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lm62/a;->leftIcon:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getPaddingBottom-D9Ej5fM()F
    .locals 1

    iget v0, p0, Lm62/a;->paddingBottom:F

    return v0
.end method

.method public final getRightIcon()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lm62/a;->rightIcon:Ljava/lang/Integer;

    return-object v0
.end method
