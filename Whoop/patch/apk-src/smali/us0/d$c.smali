.class public final enum Lus0/d$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lus0/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lus0/d$c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lus0/d$c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\r\u0008\u0086\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lus0/d$c;",
        "",
        "",
        "value",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getValue",
        "()Ljava/lang/String;",
        "Companion",
        "a",
        "SLIDE_IN",
        "STRAP_CONNECTION",
        "DISCONNECT_RETRY",
        "PERIODIC_SCAN",
        "connectivity-core_release"
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

.field private static final synthetic $VALUES:[Lus0/d$c;

.field public static final Companion:Lus0/d$c$a;

.field public static final enum DISCONNECT_RETRY:Lus0/d$c;

.field public static final enum PERIODIC_SCAN:Lus0/d$c;

.field public static final enum SLIDE_IN:Lus0/d$c;

.field public static final enum STRAP_CONNECTION:Lus0/d$c;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lus0/d$c;
    .locals 4

    sget-object v0, Lus0/d$c;->SLIDE_IN:Lus0/d$c;

    sget-object v1, Lus0/d$c;->STRAP_CONNECTION:Lus0/d$c;

    sget-object v2, Lus0/d$c;->DISCONNECT_RETRY:Lus0/d$c;

    sget-object v3, Lus0/d$c;->PERIODIC_SCAN:Lus0/d$c;

    filled-new-array {v0, v1, v2, v3}, [Lus0/d$c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lus0/d$c;

    const/4 v1, 0x0

    const-string v2, "slide_in"

    const-string v3, "SLIDE_IN"

    invoke-direct {v0, v3, v1, v2}, Lus0/d$c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lus0/d$c;->SLIDE_IN:Lus0/d$c;

    new-instance v0, Lus0/d$c;

    const/4 v1, 0x1

    const-string v2, "strap_connection"

    const-string v3, "STRAP_CONNECTION"

    invoke-direct {v0, v3, v1, v2}, Lus0/d$c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lus0/d$c;->STRAP_CONNECTION:Lus0/d$c;

    new-instance v0, Lus0/d$c;

    const/4 v1, 0x2

    const-string v2, "disconnect_retry"

    const-string v3, "DISCONNECT_RETRY"

    invoke-direct {v0, v3, v1, v2}, Lus0/d$c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lus0/d$c;->DISCONNECT_RETRY:Lus0/d$c;

    new-instance v0, Lus0/d$c;

    const/4 v1, 0x3

    const-string v2, "periodic_scan"

    const-string v3, "PERIODIC_SCAN"

    invoke-direct {v0, v3, v1, v2}, Lus0/d$c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lus0/d$c;->PERIODIC_SCAN:Lus0/d$c;

    invoke-static {}, Lus0/d$c;->$values()[Lus0/d$c;

    move-result-object v0

    sput-object v0, Lus0/d$c;->$VALUES:[Lus0/d$c;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lus0/d$c;->$ENTRIES:Lt83/a;

    new-instance v0, Lus0/d$c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lus0/d$c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lus0/d$c;->Companion:Lus0/d$c$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lus0/d$c;->value:Ljava/lang/String;

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

    sget-object v0, Lus0/d$c;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lus0/d$c;
    .locals 1

    const-class v0, Lus0/d$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lus0/d$c;

    return-object p0
.end method

.method public static values()[Lus0/d$c;
    .locals 1

    sget-object v0, Lus0/d$c;->$VALUES:[Lus0/d$c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lus0/d$c;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lus0/d$c;->value:Ljava/lang/String;

    return-object v0
.end method
