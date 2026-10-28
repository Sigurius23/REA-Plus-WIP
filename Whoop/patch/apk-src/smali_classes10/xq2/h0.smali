.class public final enum Lxq2/h0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lxq2/h0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lxq2/h0;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "HIGHLIGHT",
        "NEUTRAL",
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

.field private static final synthetic $VALUES:[Lxq2/h0;

.field public static final enum HIGHLIGHT:Lxq2/h0;

.field public static final enum NEUTRAL:Lxq2/h0;


# direct methods
.method private static final synthetic $values()[Lxq2/h0;
    .locals 2

    sget-object v0, Lxq2/h0;->HIGHLIGHT:Lxq2/h0;

    sget-object v1, Lxq2/h0;->NEUTRAL:Lxq2/h0;

    filled-new-array {v0, v1}, [Lxq2/h0;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lxq2/h0;

    const-string v1, "HIGHLIGHT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lxq2/h0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxq2/h0;->HIGHLIGHT:Lxq2/h0;

    new-instance v0, Lxq2/h0;

    const-string v1, "NEUTRAL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lxq2/h0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxq2/h0;->NEUTRAL:Lxq2/h0;

    invoke-static {}, Lxq2/h0;->$values()[Lxq2/h0;

    move-result-object v0

    sput-object v0, Lxq2/h0;->$VALUES:[Lxq2/h0;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lxq2/h0;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lxq2/h0;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lxq2/h0;
    .locals 1

    const-class v0, Lxq2/h0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lxq2/h0;

    return-object p0
.end method

.method public static values()[Lxq2/h0;
    .locals 1

    sget-object v0, Lxq2/h0;->$VALUES:[Lxq2/h0;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lxq2/h0;

    return-object v0
.end method
