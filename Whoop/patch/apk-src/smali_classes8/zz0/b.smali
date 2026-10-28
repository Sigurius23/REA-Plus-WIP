.class public final enum Lzz0/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lzz0/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\u0008\u0002\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0007\u001a\u0004\u0008\n\u0010\tj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lzz0/b;",
        "",
        "Ly81/f;",
        "fillColor",
        "borderColor",
        "<init>",
        "(Ljava/lang/String;ILy81/f;Ly81/f;)V",
        "Ly81/f;",
        "getFillColor",
        "()Ly81/f;",
        "getBorderColor",
        "YES",
        "NO",
        "INVALID",
        "EMPTY",
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

.field private static final synthetic $VALUES:[Lzz0/b;

.field public static final enum EMPTY:Lzz0/b;

.field public static final enum INVALID:Lzz0/b;

.field public static final enum NO:Lzz0/b;

.field public static final enum YES:Lzz0/b;


# instance fields
.field private final borderColor:Ly81/f;

.field private final fillColor:Ly81/f;


# direct methods
.method private static final synthetic $values()[Lzz0/b;
    .locals 4

    sget-object v0, Lzz0/b;->YES:Lzz0/b;

    sget-object v1, Lzz0/b;->NO:Lzz0/b;

    sget-object v2, Lzz0/b;->INVALID:Lzz0/b;

    sget-object v3, Lzz0/b;->EMPTY:Lzz0/b;

    filled-new-array {v0, v1, v2, v3}, [Lzz0/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lzz0/b;

    sget-object v1, Ly81/f;->RECOVERY:Ly81/f;

    const-string v2, "YES"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v2, v3, v1, v4}, Lzz0/b;-><init>(Ljava/lang/String;ILy81/f;Ly81/f;)V

    sput-object v0, Lzz0/b;->YES:Lzz0/b;

    new-instance v0, Lzz0/b;

    const/4 v1, 0x1

    sget-object v2, Ly81/f;->WHITE_50:Ly81/f;

    const-string v3, "NO"

    invoke-direct {v0, v3, v1, v2, v4}, Lzz0/b;-><init>(Ljava/lang/String;ILy81/f;Ly81/f;)V

    sput-object v0, Lzz0/b;->NO:Lzz0/b;

    new-instance v0, Lzz0/b;

    const/4 v1, 0x2

    sget-object v2, Ly81/f;->WHITE_30:Ly81/f;

    const-string v3, "INVALID"

    invoke-direct {v0, v3, v1, v4, v2}, Lzz0/b;-><init>(Ljava/lang/String;ILy81/f;Ly81/f;)V

    sput-object v0, Lzz0/b;->INVALID:Lzz0/b;

    new-instance v0, Lzz0/b;

    const-string v1, "EMPTY"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v4, v4}, Lzz0/b;-><init>(Ljava/lang/String;ILy81/f;Ly81/f;)V

    sput-object v0, Lzz0/b;->EMPTY:Lzz0/b;

    invoke-static {}, Lzz0/b;->$values()[Lzz0/b;

    move-result-object v0

    sput-object v0, Lzz0/b;->$VALUES:[Lzz0/b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lzz0/b;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILy81/f;Ly81/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly81/f;",
            "Ly81/f;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lzz0/b;->fillColor:Ly81/f;

    iput-object p4, p0, Lzz0/b;->borderColor:Ly81/f;

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

    sget-object v0, Lzz0/b;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lzz0/b;
    .locals 1

    const-class v0, Lzz0/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lzz0/b;

    return-object p0
.end method

.method public static values()[Lzz0/b;
    .locals 1

    sget-object v0, Lzz0/b;->$VALUES:[Lzz0/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lzz0/b;

    return-object v0
.end method


# virtual methods
.method public final getBorderColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Lzz0/b;->borderColor:Ly81/f;

    return-object v0
.end method

.method public final getFillColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Lzz0/b;->fillColor:Ly81/f;

    return-object v0
.end method
