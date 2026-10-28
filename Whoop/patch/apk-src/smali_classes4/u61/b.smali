.class public final enum Lu61/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lu61/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lu61/b;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "CIRCLE",
        "DOT",
        "SQUARE",
        "DIAMOND",
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

.field private static final synthetic $VALUES:[Lu61/b;

.field public static final enum CIRCLE:Lu61/b;

.field public static final enum DIAMOND:Lu61/b;

.field public static final enum DOT:Lu61/b;

.field public static final enum SQUARE:Lu61/b;


# direct methods
.method private static final synthetic $values()[Lu61/b;
    .locals 4

    sget-object v0, Lu61/b;->CIRCLE:Lu61/b;

    sget-object v1, Lu61/b;->DOT:Lu61/b;

    sget-object v2, Lu61/b;->SQUARE:Lu61/b;

    sget-object v3, Lu61/b;->DIAMOND:Lu61/b;

    filled-new-array {v0, v1, v2, v3}, [Lu61/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lu61/b;

    const-string v1, "CIRCLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lu61/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lu61/b;->CIRCLE:Lu61/b;

    new-instance v0, Lu61/b;

    const-string v1, "DOT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lu61/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lu61/b;->DOT:Lu61/b;

    new-instance v0, Lu61/b;

    const-string v1, "SQUARE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lu61/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lu61/b;->SQUARE:Lu61/b;

    new-instance v0, Lu61/b;

    const-string v1, "DIAMOND"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lu61/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lu61/b;->DIAMOND:Lu61/b;

    invoke-static {}, Lu61/b;->$values()[Lu61/b;

    move-result-object v0

    sput-object v0, Lu61/b;->$VALUES:[Lu61/b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lu61/b;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

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

    sget-object v0, Lu61/b;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lu61/b;
    .locals 1

    const-class v0, Lu61/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lu61/b;

    return-object p0
.end method

.method public static values()[Lu61/b;
    .locals 1

    sget-object v0, Lu61/b;->$VALUES:[Lu61/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lu61/b;

    return-object v0
.end method
