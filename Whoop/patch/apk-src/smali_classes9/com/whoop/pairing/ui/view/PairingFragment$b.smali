.class public final enum Lcom/whoop/pairing/ui/view/PairingFragment$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/pairing/ui/view/PairingFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/pairing/ui/view/PairingFragment$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\t\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/pairing/ui/view/PairingFragment$b;",
        "",
        "",
        "route",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getRoute",
        "()Ljava/lang/String;",
        "READY_TO_PAIR_SCREEN",
        "SEARCHING_SCREEN",
        "pairing-ui_release"
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

.field private static final synthetic $VALUES:[Lcom/whoop/pairing/ui/view/PairingFragment$b;

.field public static final enum READY_TO_PAIR_SCREEN:Lcom/whoop/pairing/ui/view/PairingFragment$b;

.field public static final enum SEARCHING_SCREEN:Lcom/whoop/pairing/ui/view/PairingFragment$b;


# instance fields
.field private final route:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/pairing/ui/view/PairingFragment$b;
    .locals 2

    sget-object v0, Lcom/whoop/pairing/ui/view/PairingFragment$b;->READY_TO_PAIR_SCREEN:Lcom/whoop/pairing/ui/view/PairingFragment$b;

    sget-object v1, Lcom/whoop/pairing/ui/view/PairingFragment$b;->SEARCHING_SCREEN:Lcom/whoop/pairing/ui/view/PairingFragment$b;

    filled-new-array {v0, v1}, [Lcom/whoop/pairing/ui/view/PairingFragment$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/pairing/ui/view/PairingFragment$b;

    sget-object v1, Lj22/j$f;->b:Lj22/j$f;

    invoke-virtual {v1}, Lj22/j;->a()Ljava/lang/String;

    move-result-object v1

    const-string v2, "READY_TO_PAIR_SCREEN"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lcom/whoop/pairing/ui/view/PairingFragment$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/pairing/ui/view/PairingFragment$b;->READY_TO_PAIR_SCREEN:Lcom/whoop/pairing/ui/view/PairingFragment$b;

    new-instance v0, Lcom/whoop/pairing/ui/view/PairingFragment$b;

    sget-object v1, Lj22/j$g;->b:Lj22/j$g;

    invoke-virtual {v1}, Lj22/j;->a()Ljava/lang/String;

    move-result-object v1

    const-string v2, "SEARCHING_SCREEN"

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, Lcom/whoop/pairing/ui/view/PairingFragment$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/pairing/ui/view/PairingFragment$b;->SEARCHING_SCREEN:Lcom/whoop/pairing/ui/view/PairingFragment$b;

    invoke-static {}, Lcom/whoop/pairing/ui/view/PairingFragment$b;->$values()[Lcom/whoop/pairing/ui/view/PairingFragment$b;

    move-result-object v0

    sput-object v0, Lcom/whoop/pairing/ui/view/PairingFragment$b;->$VALUES:[Lcom/whoop/pairing/ui/view/PairingFragment$b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/pairing/ui/view/PairingFragment$b;->$ENTRIES:Lt83/a;

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

    iput-object p3, p0, Lcom/whoop/pairing/ui/view/PairingFragment$b;->route:Ljava/lang/String;

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

    sget-object v0, Lcom/whoop/pairing/ui/view/PairingFragment$b;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/pairing/ui/view/PairingFragment$b;
    .locals 1

    const-class v0, Lcom/whoop/pairing/ui/view/PairingFragment$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/pairing/ui/view/PairingFragment$b;

    return-object p0
.end method

.method public static values()[Lcom/whoop/pairing/ui/view/PairingFragment$b;
    .locals 1

    sget-object v0, Lcom/whoop/pairing/ui/view/PairingFragment$b;->$VALUES:[Lcom/whoop/pairing/ui/view/PairingFragment$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/pairing/ui/view/PairingFragment$b;

    return-object v0
.end method


# virtual methods
.method public final getRoute()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/pairing/ui/view/PairingFragment$b;->route:Ljava/lang/String;

    return-object v0
.end method
