.class public final enum Llf1/n;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llf1/n$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Llf1/n;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u000b\u0008\u0086\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Llf1/n;",
        "",
        "",
        "variantString",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getVariantString",
        "()Ljava/lang/String;",
        "Companion",
        "a",
        "CONTROL",
        "CHECKMARK",
        "experiments_release"
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

.field private static final synthetic $VALUES:[Llf1/n;

.field public static final enum CHECKMARK:Llf1/n;

.field public static final enum CONTROL:Llf1/n;

.field public static final Companion:Llf1/n$a;


# instance fields
.field private final variantString:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Llf1/n;
    .locals 2

    sget-object v0, Llf1/n;->CONTROL:Llf1/n;

    sget-object v1, Llf1/n;->CHECKMARK:Llf1/n;

    filled-new-array {v0, v1}, [Llf1/n;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Llf1/n;

    const/4 v1, 0x0

    const-string v2, "control"

    const-string v3, "CONTROL"

    invoke-direct {v0, v3, v1, v2}, Llf1/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Llf1/n;->CONTROL:Llf1/n;

    new-instance v0, Llf1/n;

    const/4 v1, 0x1

    const-string v2, "checkmark"

    const-string v3, "CHECKMARK"

    invoke-direct {v0, v3, v1, v2}, Llf1/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Llf1/n;->CHECKMARK:Llf1/n;

    invoke-static {}, Llf1/n;->$values()[Llf1/n;

    move-result-object v0

    sput-object v0, Llf1/n;->$VALUES:[Llf1/n;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Llf1/n;->$ENTRIES:Lt83/a;

    new-instance v0, Llf1/n$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llf1/n$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llf1/n;->Companion:Llf1/n$a;

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

    iput-object p3, p0, Llf1/n;->variantString:Ljava/lang/String;

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

    sget-object v0, Llf1/n;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Llf1/n;
    .locals 1

    const-class v0, Llf1/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Llf1/n;

    return-object p0
.end method

.method public static values()[Llf1/n;
    .locals 1

    sget-object v0, Llf1/n;->$VALUES:[Llf1/n;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llf1/n;

    return-object v0
.end method


# virtual methods
.method public final getVariantString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llf1/n;->variantString:Ljava/lang/String;

    return-object v0
.end method
