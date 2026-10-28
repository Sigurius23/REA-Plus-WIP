.class public final enum Lyi1/n;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyi1/n$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lyi1/n;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0016\u0008\u0080\u0081\u0002\u0018\u0000 \u00152\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B)\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u000e\u001a\u0004\u0008\u0011\u0010\u0010R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001bj\u0002\u0008\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lyi1/n;",
        "",
        "Lgz0/m0;",
        "iconImage",
        "Ly81/f;",
        "iconColor",
        "iconBackgroundColor",
        "",
        "key",
        "<init>",
        "(Ljava/lang/String;ILgz0/m0;Ly81/f;Ly81/f;Ljava/lang/String;)V",
        "Lgz0/m0;",
        "getIconImage",
        "()Lgz0/m0;",
        "Ly81/f;",
        "getIconColor",
        "()Ly81/f;",
        "getIconBackgroundColor",
        "Ljava/lang/String;",
        "getKey",
        "()Ljava/lang/String;",
        "Companion",
        "a",
        "None",
        "Error",
        "ErrorConnection",
        "Possible",
        "AllNotifications",
        "RecentlyActivated",
        "kennel_release"
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

.field private static final synthetic $VALUES:[Lyi1/n;

.field public static final enum AllNotifications:Lyi1/n;

.field public static final Companion:Lyi1/n$a;

.field public static final enum Error:Lyi1/n;

.field public static final enum ErrorConnection:Lyi1/n;

.field public static final enum None:Lyi1/n;

.field public static final enum Possible:Lyi1/n;

.field public static final enum RecentlyActivated:Lyi1/n;


# instance fields
.field private final iconBackgroundColor:Ly81/f;

.field private final iconColor:Ly81/f;

.field private final iconImage:Lgz0/m0;

.field private final key:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lyi1/n;
    .locals 6

    sget-object v0, Lyi1/n;->None:Lyi1/n;

    sget-object v1, Lyi1/n;->Error:Lyi1/n;

    sget-object v2, Lyi1/n;->ErrorConnection:Lyi1/n;

    sget-object v3, Lyi1/n;->Possible:Lyi1/n;

    sget-object v4, Lyi1/n;->AllNotifications:Lyi1/n;

    sget-object v5, Lyi1/n;->RecentlyActivated:Lyi1/n;

    filled-new-array/range {v0 .. v5}, [Lyi1/n;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Lyi1/n;

    sget-object v3, Lgz0/m0;->TINY_CHECKMARK:Lgz0/m0;

    sget-object v4, Ly81/f;->BRAND_BLACK:Ly81/f;

    sget-object v5, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    const-string v6, "NOT_DETECTED"

    const-string v1, "None"

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v6}, Lyi1/n;-><init>(Ljava/lang/String;ILgz0/m0;Ly81/f;Ly81/f;Ljava/lang/String;)V

    sput-object v0, Lyi1/n;->None:Lyi1/n;

    new-instance v5, Lyi1/n;

    sget-object v8, Lgz0/m0;->TINY_INFORMATION:Lgz0/m0;

    sget-object v9, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    sget-object v10, Ly81/f;->ACCENT_NEGATIVE_TREND_15:Ly81/f;

    const-string v11, "ERROR"

    const-string v6, "Error"

    const/4 v7, 0x1

    invoke-direct/range {v5 .. v11}, Lyi1/n;-><init>(Ljava/lang/String;ILgz0/m0;Ly81/f;Ly81/f;Ljava/lang/String;)V

    sput-object v5, Lyi1/n;->Error:Lyi1/n;

    new-instance v6, Lyi1/n;

    move-object v11, v10

    move-object v10, v9

    move-object v9, v8

    const/4 v8, 0x2

    const-string v12, "ERROR-connection"

    const-string v7, "ErrorConnection"

    invoke-direct/range {v6 .. v12}, Lyi1/n;-><init>(Ljava/lang/String;ILgz0/m0;Ly81/f;Ly81/f;Ljava/lang/String;)V

    move-object v9, v10

    sput-object v6, Lyi1/n;->ErrorConnection:Lyi1/n;

    move-object v8, v4

    new-instance v4, Lyi1/n;

    sget-object v7, Lgz0/m0;->TINY_ATTENTION:Lgz0/m0;

    const-string v10, "POSSIBLE_AFIB_DETECTED"

    const-string v5, "Possible"

    const/4 v6, 0x3

    invoke-direct/range {v4 .. v10}, Lyi1/n;-><init>(Ljava/lang/String;ILgz0/m0;Ly81/f;Ly81/f;Ljava/lang/String;)V

    sput-object v4, Lyi1/n;->Possible:Lyi1/n;

    new-instance v5, Lyi1/n;

    sget-object v8, Lgz0/m0;->LIST:Lgz0/m0;

    sget-object v9, Ly81/f;->WHITE_50:Ly81/f;

    sget-object v10, Ly81/f;->TRANSPARENT:Ly81/f;

    const-string v11, "ALL_NOTIFICATIONS"

    const-string v6, "AllNotifications"

    const/4 v7, 0x4

    invoke-direct/range {v5 .. v11}, Lyi1/n;-><init>(Ljava/lang/String;ILgz0/m0;Ly81/f;Ly81/f;Ljava/lang/String;)V

    sput-object v5, Lyi1/n;->AllNotifications:Lyi1/n;

    move-object v13, v9

    new-instance v9, Lyi1/n;

    sget-object v12, Lgz0/m0;->TINY_ELLIPSE:Lgz0/m0;

    sget-object v14, Ly81/f;->WHITE_10:Ly81/f;

    const-string v15, "RECENTLY_ACTIVATED"

    const-string v10, "RecentlyActivated"

    const/4 v11, 0x5

    invoke-direct/range {v9 .. v15}, Lyi1/n;-><init>(Ljava/lang/String;ILgz0/m0;Ly81/f;Ly81/f;Ljava/lang/String;)V

    sput-object v9, Lyi1/n;->RecentlyActivated:Lyi1/n;

    invoke-static {}, Lyi1/n;->$values()[Lyi1/n;

    move-result-object v0

    sput-object v0, Lyi1/n;->$VALUES:[Lyi1/n;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lyi1/n;->$ENTRIES:Lt83/a;

    new-instance v0, Lyi1/n$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lyi1/n$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lyi1/n;->Companion:Lyi1/n$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILgz0/m0;Ly81/f;Ly81/f;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgz0/m0;",
            "Ly81/f;",
            "Ly81/f;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lyi1/n;->iconImage:Lgz0/m0;

    iput-object p4, p0, Lyi1/n;->iconColor:Ly81/f;

    iput-object p5, p0, Lyi1/n;->iconBackgroundColor:Ly81/f;

    iput-object p6, p0, Lyi1/n;->key:Ljava/lang/String;

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

    sget-object v0, Lyi1/n;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lyi1/n;
    .locals 1

    const-class v0, Lyi1/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lyi1/n;

    return-object p0
.end method

.method public static values()[Lyi1/n;
    .locals 1

    sget-object v0, Lyi1/n;->$VALUES:[Lyi1/n;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lyi1/n;

    return-object v0
.end method


# virtual methods
.method public final getIconBackgroundColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Lyi1/n;->iconBackgroundColor:Ly81/f;

    return-object v0
.end method

.method public final getIconColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Lyi1/n;->iconColor:Ly81/f;

    return-object v0
.end method

.method public final getIconImage()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lyi1/n;->iconImage:Lgz0/m0;

    return-object v0
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lyi1/n;->key:Ljava/lang/String;

    return-object v0
.end method
