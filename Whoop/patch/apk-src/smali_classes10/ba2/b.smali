.class public final enum Lba2/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lba2/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lba2/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0016\u0008\u0086\u0081\u0002\u0018\u0000 \u000f2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0019\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\u0008\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\r\u001a\u0004\u0008\u000e\u0010\tj\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lba2/b;",
        "",
        "",
        "byteValue",
        "",
        "displayValue",
        "<init>",
        "(Ljava/lang/String;IBLjava/lang/String;)V",
        "toString",
        "()Ljava/lang/String;",
        "B",
        "getByteValue",
        "()B",
        "Ljava/lang/String;",
        "getDisplayValue",
        "Companion",
        "a",
        "TWENTY",
        "FIFTY",
        "ONE_HUNDRED",
        "TWO_HUNDRED",
        "FIVE_HUNDRED",
        "ONE_THOUSAND",
        "TWO_THOUSAND",
        "THREE_THOUSAND",
        "FOUR_THOUSAND",
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

.field private static final synthetic $VALUES:[Lba2/b;

.field public static final Companion:Lba2/b$a;

.field public static final enum FIFTY:Lba2/b;

.field public static final enum FIVE_HUNDRED:Lba2/b;

.field public static final enum FOUR_THOUSAND:Lba2/b;

.field public static final enum ONE_HUNDRED:Lba2/b;

.field public static final enum ONE_THOUSAND:Lba2/b;

.field public static final enum THREE_THOUSAND:Lba2/b;

.field public static final enum TWENTY:Lba2/b;

.field public static final enum TWO_HUNDRED:Lba2/b;

.field public static final enum TWO_THOUSAND:Lba2/b;


# instance fields
.field private final byteValue:B

.field private final displayValue:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lba2/b;
    .locals 9

    sget-object v0, Lba2/b;->TWENTY:Lba2/b;

    sget-object v1, Lba2/b;->FIFTY:Lba2/b;

    sget-object v2, Lba2/b;->ONE_HUNDRED:Lba2/b;

    sget-object v3, Lba2/b;->TWO_HUNDRED:Lba2/b;

    sget-object v4, Lba2/b;->FIVE_HUNDRED:Lba2/b;

    sget-object v5, Lba2/b;->ONE_THOUSAND:Lba2/b;

    sget-object v6, Lba2/b;->TWO_THOUSAND:Lba2/b;

    sget-object v7, Lba2/b;->THREE_THOUSAND:Lba2/b;

    sget-object v8, Lba2/b;->FOUR_THOUSAND:Lba2/b;

    filled-new-array/range {v0 .. v8}, [Lba2/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lba2/b;

    const-string v1, "20x"

    const-string v2, "TWENTY"

    const/4 v3, 0x0

    const/4 v4, 0x7

    invoke-direct {v0, v2, v3, v4, v1}, Lba2/b;-><init>(Ljava/lang/String;IBLjava/lang/String;)V

    sput-object v0, Lba2/b;->TWENTY:Lba2/b;

    new-instance v0, Lba2/b;

    const-string v1, "50x"

    const-string v2, "FIFTY"

    const/4 v3, 0x1

    const/16 v5, 0x8

    invoke-direct {v0, v2, v3, v5, v1}, Lba2/b;-><init>(Ljava/lang/String;IBLjava/lang/String;)V

    sput-object v0, Lba2/b;->FIFTY:Lba2/b;

    new-instance v0, Lba2/b;

    const/16 v1, 0x9

    const-string v2, "100x"

    const-string v3, "ONE_HUNDRED"

    const/4 v6, 0x2

    invoke-direct {v0, v3, v6, v1, v2}, Lba2/b;-><init>(Ljava/lang/String;IBLjava/lang/String;)V

    sput-object v0, Lba2/b;->ONE_HUNDRED:Lba2/b;

    new-instance v0, Lba2/b;

    const/16 v1, 0xa

    const-string v2, "200x"

    const-string v3, "TWO_HUNDRED"

    const/4 v6, 0x3

    invoke-direct {v0, v3, v6, v1, v2}, Lba2/b;-><init>(Ljava/lang/String;IBLjava/lang/String;)V

    sput-object v0, Lba2/b;->TWO_HUNDRED:Lba2/b;

    new-instance v0, Lba2/b;

    const/16 v1, 0xb

    const-string v2, "500x"

    const-string v3, "FIVE_HUNDRED"

    const/4 v6, 0x4

    invoke-direct {v0, v3, v6, v1, v2}, Lba2/b;-><init>(Ljava/lang/String;IBLjava/lang/String;)V

    sput-object v0, Lba2/b;->FIVE_HUNDRED:Lba2/b;

    new-instance v0, Lba2/b;

    const/16 v1, 0xc

    const-string v2, "1000x"

    const-string v3, "ONE_THOUSAND"

    const/4 v6, 0x5

    invoke-direct {v0, v3, v6, v1, v2}, Lba2/b;-><init>(Ljava/lang/String;IBLjava/lang/String;)V

    sput-object v0, Lba2/b;->ONE_THOUSAND:Lba2/b;

    new-instance v0, Lba2/b;

    const/16 v1, 0xd

    const-string v2, "2000x"

    const-string v3, "TWO_THOUSAND"

    const/4 v6, 0x6

    invoke-direct {v0, v3, v6, v1, v2}, Lba2/b;-><init>(Ljava/lang/String;IBLjava/lang/String;)V

    sput-object v0, Lba2/b;->TWO_THOUSAND:Lba2/b;

    new-instance v0, Lba2/b;

    const/16 v1, 0xe

    const-string v2, "3000x"

    const-string v3, "THREE_THOUSAND"

    invoke-direct {v0, v3, v4, v1, v2}, Lba2/b;-><init>(Ljava/lang/String;IBLjava/lang/String;)V

    sput-object v0, Lba2/b;->THREE_THOUSAND:Lba2/b;

    new-instance v0, Lba2/b;

    const/16 v1, 0xf

    const-string v2, "4000x"

    const-string v3, "FOUR_THOUSAND"

    invoke-direct {v0, v3, v5, v1, v2}, Lba2/b;-><init>(Ljava/lang/String;IBLjava/lang/String;)V

    sput-object v0, Lba2/b;->FOUR_THOUSAND:Lba2/b;

    invoke-static {}, Lba2/b;->$values()[Lba2/b;

    move-result-object v0

    sput-object v0, Lba2/b;->$VALUES:[Lba2/b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lba2/b;->$ENTRIES:Lt83/a;

    new-instance v0, Lba2/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lba2/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lba2/b;->Companion:Lba2/b$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IBLjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(B",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-byte p3, p0, Lba2/b;->byteValue:B

    iput-object p4, p0, Lba2/b;->displayValue:Ljava/lang/String;

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

    sget-object v0, Lba2/b;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lba2/b;
    .locals 1

    const-class v0, Lba2/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lba2/b;

    return-object p0
.end method

.method public static values()[Lba2/b;
    .locals 1

    sget-object v0, Lba2/b;->$VALUES:[Lba2/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lba2/b;

    return-object v0
.end method


# virtual methods
.method public final getByteValue()B
    .locals 1

    iget-byte v0, p0, Lba2/b;->byteValue:B

    return v0
.end method

.method public final getDisplayValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lba2/b;->displayValue:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lba2/b;->displayValue:Ljava/lang/String;

    return-object v0
.end method
