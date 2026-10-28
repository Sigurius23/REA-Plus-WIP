.class public final enum Lxk1/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lxk1/f;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lxk1/f;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "WEB_LINK",
        "ORDER_STATUS",
        "ALL_SUPPORT_ARTICLES",
        "UNKNOWN",
        "help-center_release"
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

.field private static final synthetic $VALUES:[Lxk1/f;

.field public static final enum ALL_SUPPORT_ARTICLES:Lxk1/f;

.field public static final enum ORDER_STATUS:Lxk1/f;

.field public static final enum UNKNOWN:Lxk1/f;

.field public static final enum WEB_LINK:Lxk1/f;


# direct methods
.method private static final synthetic $values()[Lxk1/f;
    .locals 4

    sget-object v0, Lxk1/f;->WEB_LINK:Lxk1/f;

    sget-object v1, Lxk1/f;->ORDER_STATUS:Lxk1/f;

    sget-object v2, Lxk1/f;->ALL_SUPPORT_ARTICLES:Lxk1/f;

    sget-object v3, Lxk1/f;->UNKNOWN:Lxk1/f;

    filled-new-array {v0, v1, v2, v3}, [Lxk1/f;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lxk1/f;

    const-string v1, "WEB_LINK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lxk1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxk1/f;->WEB_LINK:Lxk1/f;

    new-instance v0, Lxk1/f;

    const-string v1, "ORDER_STATUS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lxk1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxk1/f;->ORDER_STATUS:Lxk1/f;

    new-instance v0, Lxk1/f;

    const-string v1, "ALL_SUPPORT_ARTICLES"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lxk1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxk1/f;->ALL_SUPPORT_ARTICLES:Lxk1/f;

    new-instance v0, Lxk1/f;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lxk1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxk1/f;->UNKNOWN:Lxk1/f;

    invoke-static {}, Lxk1/f;->$values()[Lxk1/f;

    move-result-object v0

    sput-object v0, Lxk1/f;->$VALUES:[Lxk1/f;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lxk1/f;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lxk1/f;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lxk1/f;
    .locals 1

    const-class v0, Lxk1/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lxk1/f;

    return-object p0
.end method

.method public static values()[Lxk1/f;
    .locals 1

    sget-object v0, Lxk1/f;->$VALUES:[Lxk1/f;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lxk1/f;

    return-object v0
.end method
