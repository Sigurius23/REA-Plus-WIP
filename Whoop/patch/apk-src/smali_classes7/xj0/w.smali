.class public final enum Lxj0/w;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lxj0/w;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\u0008\t\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lxj0/w;",
        "",
        "",
        "input",
        "<init>",
        "(Ljava/lang/String;IB)V",
        "B",
        "getInput",
        "()B",
        "DISABLE",
        "ENABLE",
        "connectivity_release"
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

.field private static final synthetic $VALUES:[Lxj0/w;

.field public static final enum DISABLE:Lxj0/w;

.field public static final enum ENABLE:Lxj0/w;


# instance fields
.field private final input:B


# direct methods
.method private static final synthetic $values()[Lxj0/w;
    .locals 2

    sget-object v0, Lxj0/w;->DISABLE:Lxj0/w;

    sget-object v1, Lxj0/w;->ENABLE:Lxj0/w;

    filled-new-array {v0, v1}, [Lxj0/w;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lxj0/w;

    const-string v1, "DISABLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lxj0/w;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lxj0/w;->DISABLE:Lxj0/w;

    new-instance v0, Lxj0/w;

    const-string v1, "ENABLE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lxj0/w;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lxj0/w;->ENABLE:Lxj0/w;

    invoke-static {}, Lxj0/w;->$values()[Lxj0/w;

    move-result-object v0

    sput-object v0, Lxj0/w;->$VALUES:[Lxj0/w;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lxj0/w;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IB)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(B)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-byte p3, p0, Lxj0/w;->input:B

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

    sget-object v0, Lxj0/w;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lxj0/w;
    .locals 1

    const-class v0, Lxj0/w;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lxj0/w;

    return-object p0
.end method

.method public static values()[Lxj0/w;
    .locals 1

    sget-object v0, Lxj0/w;->$VALUES:[Lxj0/w;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lxj0/w;

    return-object v0
.end method


# virtual methods
.method public final getInput()B
    .locals 1

    iget-byte v0, p0, Lxj0/w;->input:B

    return v0
.end method
