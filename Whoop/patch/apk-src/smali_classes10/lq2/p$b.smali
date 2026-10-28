.class public final enum Llq2/p$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llq2/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Llq2/p$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0007\n\u0002\u0008\u000f\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B)\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\t\u001a\u0004\u0008\u000c\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\t\u001a\u0004\u0008\r\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\t\u001a\u0004\u0008\u000e\u0010\u000bj\u0002\u0008\u000fj\u0002\u0008\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Llq2/p$b;",
        "",
        "",
        "startX",
        "startY",
        "endX",
        "endY",
        "<init>",
        "(Ljava/lang/String;IFFFF)V",
        "F",
        "getStartX",
        "()F",
        "getStartY",
        "getEndX",
        "getEndY",
        "Normal",
        "Reversed",
        "user-journey_release"
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

.field private static final synthetic $VALUES:[Llq2/p$b;

.field public static final enum Normal:Llq2/p$b;

.field public static final enum Reversed:Llq2/p$b;


# instance fields
.field private final endX:F

.field private final endY:F

.field private final startX:F

.field private final startY:F


# direct methods
.method private static final synthetic $values()[Llq2/p$b;
    .locals 2

    sget-object v0, Llq2/p$b;->Normal:Llq2/p$b;

    sget-object v1, Llq2/p$b;->Reversed:Llq2/p$b;

    filled-new-array {v0, v1}, [Llq2/p$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Llq2/p$b;

    const/high16 v5, 0x3f800000    # 1.0f

    const v6, 0x3fd1eb85    # 1.64f

    const-string v1, "Normal"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, 0x3f0dd2f2    # 0.554f

    invoke-direct/range {v0 .. v6}, Llq2/p$b;-><init>(Ljava/lang/String;IFFFF)V

    sput-object v0, Llq2/p$b;->Normal:Llq2/p$b;

    new-instance v1, Llq2/p$b;

    const/4 v6, 0x0

    const v7, 0x3f0ccccd    # 0.55f

    const-string v2, "Reversed"

    const/4 v3, 0x1

    const/high16 v4, 0x3f800000    # 1.0f

    const v5, 0x3fd1eb85    # 1.64f

    invoke-direct/range {v1 .. v7}, Llq2/p$b;-><init>(Ljava/lang/String;IFFFF)V

    sput-object v1, Llq2/p$b;->Reversed:Llq2/p$b;

    invoke-static {}, Llq2/p$b;->$values()[Llq2/p$b;

    move-result-object v0

    sput-object v0, Llq2/p$b;->$VALUES:[Llq2/p$b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Llq2/p$b;->$ENTRIES:Lt83/a;

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

    iput p3, p0, Llq2/p$b;->startX:F

    iput p4, p0, Llq2/p$b;->startY:F

    iput p5, p0, Llq2/p$b;->endX:F

    iput p6, p0, Llq2/p$b;->endY:F

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

    sget-object v0, Llq2/p$b;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Llq2/p$b;
    .locals 1

    const-class v0, Llq2/p$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Llq2/p$b;

    return-object p0
.end method

.method public static values()[Llq2/p$b;
    .locals 1

    sget-object v0, Llq2/p$b;->$VALUES:[Llq2/p$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llq2/p$b;

    return-object v0
.end method


# virtual methods
.method public final getEndX()F
    .locals 1

    iget v0, p0, Llq2/p$b;->endX:F

    return v0
.end method

.method public final getEndY()F
    .locals 1

    iget v0, p0, Llq2/p$b;->endY:F

    return v0
.end method

.method public final getStartX()F
    .locals 1

    iget v0, p0, Llq2/p$b;->startX:F

    return v0
.end method

.method public final getStartY()F
    .locals 1

    iget v0, p0, Llq2/p$b;->startY:F

    return v0
.end method
