.class public final enum Lxc2/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lxc2/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lxc2/a;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "FETCH_BILLING_MODAL_ERROR",
        "SWITCH_BILLING_ERROR",
        "settings_release"
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

.field private static final synthetic $VALUES:[Lxc2/a;

.field public static final enum FETCH_BILLING_MODAL_ERROR:Lxc2/a;

.field public static final enum SWITCH_BILLING_ERROR:Lxc2/a;


# direct methods
.method private static final synthetic $values()[Lxc2/a;
    .locals 2

    sget-object v0, Lxc2/a;->FETCH_BILLING_MODAL_ERROR:Lxc2/a;

    sget-object v1, Lxc2/a;->SWITCH_BILLING_ERROR:Lxc2/a;

    filled-new-array {v0, v1}, [Lxc2/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lxc2/a;

    const-string v1, "FETCH_BILLING_MODAL_ERROR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lxc2/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxc2/a;->FETCH_BILLING_MODAL_ERROR:Lxc2/a;

    new-instance v0, Lxc2/a;

    const-string v1, "SWITCH_BILLING_ERROR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lxc2/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxc2/a;->SWITCH_BILLING_ERROR:Lxc2/a;

    invoke-static {}, Lxc2/a;->$values()[Lxc2/a;

    move-result-object v0

    sput-object v0, Lxc2/a;->$VALUES:[Lxc2/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lxc2/a;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lxc2/a;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lxc2/a;
    .locals 1

    const-class v0, Lxc2/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lxc2/a;

    return-object p0
.end method

.method public static values()[Lxc2/a;
    .locals 1

    sget-object v0, Lxc2/a;->$VALUES:[Lxc2/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lxc2/a;

    return-object v0
.end method
