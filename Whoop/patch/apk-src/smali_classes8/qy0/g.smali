.class public final enum Lqy0/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lqy0/g;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0011\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B)\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\n\u001a\u0004\u0008\r\u0010\u000cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u000e\u001a\u0004\u0008\u0011\u0010\u0010j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lqy0/g;",
        "",
        "Ly3/f;",
        "startPadding",
        "endPadding",
        "",
        "startRadius",
        "endRadius",
        "<init>",
        "(Ljava/lang/String;IFFII)V",
        "F",
        "getStartPadding-D9Ej5fM",
        "()F",
        "getEndPadding-D9Ej5fM",
        "I",
        "getStartRadius",
        "()I",
        "getEndRadius",
        "ALL",
        "LEFT",
        "RIGHT",
        "NONE",
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

.field private static final synthetic $VALUES:[Lqy0/g;

.field public static final enum ALL:Lqy0/g;

.field public static final enum LEFT:Lqy0/g;

.field public static final enum NONE:Lqy0/g;

.field public static final enum RIGHT:Lqy0/g;


# instance fields
.field private final endPadding:F

.field private final endRadius:I

.field private final startPadding:F

.field private final startRadius:I


# direct methods
.method private static final synthetic $values()[Lqy0/g;
    .locals 4

    sget-object v0, Lqy0/g;->ALL:Lqy0/g;

    sget-object v1, Lqy0/g;->LEFT:Lqy0/g;

    sget-object v2, Lqy0/g;->RIGHT:Lqy0/g;

    sget-object v3, Lqy0/g;->NONE:Lqy0/g;

    filled-new-array {v0, v1, v2, v3}, [Lqy0/g;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Lqy0/g;

    const/16 v1, 0xb

    int-to-float v3, v1

    const/16 v5, 0x32

    const/16 v6, 0x32

    const-string v1, "ALL"

    const/4 v2, 0x0

    move v4, v3

    invoke-direct/range {v0 .. v6}, Lqy0/g;-><init>(Ljava/lang/String;IFFII)V

    sput-object v0, Lqy0/g;->ALL:Lqy0/g;

    new-instance v2, Lqy0/g;

    const/4 v0, 0x0

    int-to-float v5, v0

    const/16 v7, 0x32

    const/4 v8, 0x0

    move v6, v3

    const-string v3, "LEFT"

    const/4 v4, 0x1

    move v11, v6

    move v6, v5

    move v5, v11

    invoke-direct/range {v2 .. v8}, Lqy0/g;-><init>(Ljava/lang/String;IFFII)V

    move v3, v5

    move v5, v6

    sput-object v2, Lqy0/g;->LEFT:Lqy0/g;

    new-instance v2, Lqy0/g;

    const/4 v7, 0x0

    const/16 v8, 0x32

    move v6, v3

    const-string v3, "RIGHT"

    const/4 v4, 0x2

    invoke-direct/range {v2 .. v8}, Lqy0/g;-><init>(Ljava/lang/String;IFFII)V

    sput-object v2, Lqy0/g;->RIGHT:Lqy0/g;

    new-instance v4, Lqy0/g;

    const/4 v9, 0x0

    const/4 v10, 0x0

    move v6, v5

    const-string v5, "NONE"

    move v7, v6

    const/4 v6, 0x3

    move v8, v7

    invoke-direct/range {v4 .. v10}, Lqy0/g;-><init>(Ljava/lang/String;IFFII)V

    sput-object v4, Lqy0/g;->NONE:Lqy0/g;

    invoke-static {}, Lqy0/g;->$values()[Lqy0/g;

    move-result-object v0

    sput-object v0, Lqy0/g;->$VALUES:[Lqy0/g;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lqy0/g;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IFFII)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FFII)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lqy0/g;->startPadding:F

    iput p4, p0, Lqy0/g;->endPadding:F

    iput p5, p0, Lqy0/g;->startRadius:I

    iput p6, p0, Lqy0/g;->endRadius:I

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

    sget-object v0, Lqy0/g;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lqy0/g;
    .locals 1

    const-class v0, Lqy0/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lqy0/g;

    return-object p0
.end method

.method public static values()[Lqy0/g;
    .locals 1

    sget-object v0, Lqy0/g;->$VALUES:[Lqy0/g;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqy0/g;

    return-object v0
.end method


# virtual methods
.method public final getEndPadding-D9Ej5fM()F
    .locals 1

    iget v0, p0, Lqy0/g;->endPadding:F

    return v0
.end method

.method public final getEndRadius()I
    .locals 1

    iget v0, p0, Lqy0/g;->endRadius:I

    return v0
.end method

.method public final getStartPadding-D9Ej5fM()F
    .locals 1

    iget v0, p0, Lqy0/g;->startPadding:F

    return v0
.end method

.method public final getStartRadius()I
    .locals 1

    iget v0, p0, Lqy0/g;->startRadius:I

    return v0
.end method
