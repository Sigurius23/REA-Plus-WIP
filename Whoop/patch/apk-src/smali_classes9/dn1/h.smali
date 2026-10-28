.class public final enum Ldn1/h;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldn1/h$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ldn1/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u000c\u0008\u0086\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Ldn1/h;",
        "",
        "",
        "gaugeIndex",
        "<init>",
        "(Ljava/lang/String;II)V",
        "I",
        "getGaugeIndex",
        "()I",
        "Companion",
        "a",
        "START",
        "END",
        "NONE",
        "home-customization_release"
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

.field private static final synthetic $VALUES:[Ldn1/h;

.field public static final Companion:Ldn1/h$a;

.field public static final enum END:Ldn1/h;

.field public static final enum NONE:Ldn1/h;

.field public static final enum START:Ldn1/h;


# instance fields
.field private final gaugeIndex:I


# direct methods
.method private static final synthetic $values()[Ldn1/h;
    .locals 3

    sget-object v0, Ldn1/h;->START:Ldn1/h;

    sget-object v1, Ldn1/h;->END:Ldn1/h;

    sget-object v2, Ldn1/h;->NONE:Ldn1/h;

    filled-new-array {v0, v1, v2}, [Ldn1/h;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ldn1/h;

    const-string v1, "START"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Ldn1/h;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ldn1/h;->START:Ldn1/h;

    new-instance v0, Ldn1/h;

    const-string v1, "END"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v3, v2}, Ldn1/h;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ldn1/h;->END:Ldn1/h;

    new-instance v0, Ldn1/h;

    const/4 v1, 0x2

    const/4 v2, -0x1

    const-string v3, "NONE"

    invoke-direct {v0, v3, v1, v2}, Ldn1/h;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ldn1/h;->NONE:Ldn1/h;

    invoke-static {}, Ldn1/h;->$values()[Ldn1/h;

    move-result-object v0

    sput-object v0, Ldn1/h;->$VALUES:[Ldn1/h;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ldn1/h;->$ENTRIES:Lt83/a;

    new-instance v0, Ldn1/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldn1/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ldn1/h;->Companion:Ldn1/h$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Ldn1/h;->gaugeIndex:I

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

    sget-object v0, Ldn1/h;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ldn1/h;
    .locals 1

    const-class v0, Ldn1/h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ldn1/h;

    return-object p0
.end method

.method public static values()[Ldn1/h;
    .locals 1

    sget-object v0, Ldn1/h;->$VALUES:[Ldn1/h;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldn1/h;

    return-object v0
.end method


# virtual methods
.method public final getGaugeIndex()I
    .locals 1

    iget v0, p0, Ldn1/h;->gaugeIndex:I

    return v0
.end method
