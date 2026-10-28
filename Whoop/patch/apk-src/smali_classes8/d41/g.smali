.class public final enum Ld41/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ld41/g;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0007\u001a\u0004\u0008\n\u0010\tj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Ld41/g;",
        "",
        "Ly3/f;",
        "height",
        "width",
        "<init>",
        "(Ljava/lang/String;IFF)V",
        "F",
        "getHeight-D9Ej5fM",
        "()F",
        "getWidth-D9Ej5fM",
        "SMALL",
        "LARGE",
        "FULLWIDTH",
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

.field private static final synthetic $VALUES:[Ld41/g;

.field public static final enum FULLWIDTH:Ld41/g;

.field public static final enum LARGE:Ld41/g;

.field public static final enum SMALL:Ld41/g;


# instance fields
.field private final height:F

.field private final width:F


# direct methods
.method private static final synthetic $values()[Ld41/g;
    .locals 3

    sget-object v0, Ld41/g;->SMALL:Ld41/g;

    sget-object v1, Ld41/g;->LARGE:Ld41/g;

    sget-object v2, Ld41/g;->FULLWIDTH:Ld41/g;

    filled-new-array {v0, v1, v2}, [Ld41/g;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ld41/g;

    const/16 v1, 0xbe

    int-to-float v1, v1

    const/16 v2, 0xa0

    int-to-float v2, v2

    const-string v3, "SMALL"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Ld41/g;-><init>(Ljava/lang/String;IFF)V

    sput-object v0, Ld41/g;->SMALL:Ld41/g;

    new-instance v0, Ld41/g;

    const/16 v1, 0x104

    int-to-float v1, v1

    const/16 v2, 0xf0

    int-to-float v2, v2

    const-string v3, "LARGE"

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1, v2}, Ld41/g;-><init>(Ljava/lang/String;IFF)V

    sput-object v0, Ld41/g;->LARGE:Ld41/g;

    new-instance v0, Ld41/g;

    const/16 v1, 0xd8

    int-to-float v1, v1

    const/16 v2, 0x12c

    int-to-float v2, v2

    const-string v3, "FULLWIDTH"

    const/4 v4, 0x2

    invoke-direct {v0, v3, v4, v1, v2}, Ld41/g;-><init>(Ljava/lang/String;IFF)V

    sput-object v0, Ld41/g;->FULLWIDTH:Ld41/g;

    invoke-static {}, Ld41/g;->$values()[Ld41/g;

    move-result-object v0

    sput-object v0, Ld41/g;->$VALUES:[Ld41/g;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ld41/g;->$ENTRIES:Lt83/a;

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

    iput p3, p0, Ld41/g;->height:F

    iput p4, p0, Ld41/g;->width:F

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

    sget-object v0, Ld41/g;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ld41/g;
    .locals 1

    const-class v0, Ld41/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ld41/g;

    return-object p0
.end method

.method public static values()[Ld41/g;
    .locals 1

    sget-object v0, Ld41/g;->$VALUES:[Ld41/g;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ld41/g;

    return-object v0
.end method


# virtual methods
.method public final getHeight-D9Ej5fM()F
    .locals 1

    iget v0, p0, Ld41/g;->height:F

    return v0
.end method

.method public final getWidth-D9Ej5fM()F
    .locals 1

    iget v0, p0, Ld41/g;->width:F

    return v0
.end method
