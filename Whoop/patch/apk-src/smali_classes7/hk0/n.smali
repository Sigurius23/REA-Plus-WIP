.class public final enum Lhk0/n;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhk0/n$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhk0/n;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u000e\u0008\u0086\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lhk0/n;",
        "",
        "",
        "value",
        "<init>",
        "(Ljava/lang/String;II)V",
        "I",
        "getValue",
        "()I",
        "Companion",
        "a",
        "UNKNOWN",
        "HISTORY_START",
        "HISTORY_END",
        "HISTORY_COMPLETE",
        "HISTORY_START_V2",
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

.field private static final synthetic $VALUES:[Lhk0/n;

.field public static final Companion:Lhk0/n$a;

.field public static final enum HISTORY_COMPLETE:Lhk0/n;

.field public static final enum HISTORY_END:Lhk0/n;

.field public static final enum HISTORY_START:Lhk0/n;

.field public static final enum HISTORY_START_V2:Lhk0/n;

.field public static final enum UNKNOWN:Lhk0/n;


# instance fields
.field private final value:I


# direct methods
.method private static final synthetic $values()[Lhk0/n;
    .locals 5

    sget-object v0, Lhk0/n;->UNKNOWN:Lhk0/n;

    sget-object v1, Lhk0/n;->HISTORY_START:Lhk0/n;

    sget-object v2, Lhk0/n;->HISTORY_END:Lhk0/n;

    sget-object v3, Lhk0/n;->HISTORY_COMPLETE:Lhk0/n;

    sget-object v4, Lhk0/n;->HISTORY_START_V2:Lhk0/n;

    filled-new-array {v0, v1, v2, v3, v4}, [Lhk0/n;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lhk0/n;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lhk0/n;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lhk0/n;->UNKNOWN:Lhk0/n;

    new-instance v0, Lhk0/n;

    const-string v1, "HISTORY_START"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lhk0/n;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lhk0/n;->HISTORY_START:Lhk0/n;

    new-instance v0, Lhk0/n;

    const-string v1, "HISTORY_END"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lhk0/n;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lhk0/n;->HISTORY_END:Lhk0/n;

    new-instance v0, Lhk0/n;

    const-string v1, "HISTORY_COMPLETE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lhk0/n;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lhk0/n;->HISTORY_COMPLETE:Lhk0/n;

    new-instance v0, Lhk0/n;

    const-string v1, "HISTORY_START_V2"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2}, Lhk0/n;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lhk0/n;->HISTORY_START_V2:Lhk0/n;

    invoke-static {}, Lhk0/n;->$values()[Lhk0/n;

    move-result-object v0

    sput-object v0, Lhk0/n;->$VALUES:[Lhk0/n;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lhk0/n;->$ENTRIES:Lt83/a;

    new-instance v0, Lhk0/n$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lhk0/n$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lhk0/n;->Companion:Lhk0/n$a;

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

    iput p3, p0, Lhk0/n;->value:I

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

    sget-object v0, Lhk0/n;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lhk0/n;
    .locals 1

    const-class v0, Lhk0/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhk0/n;

    return-object p0
.end method

.method public static values()[Lhk0/n;
    .locals 1

    sget-object v0, Lhk0/n;->$VALUES:[Lhk0/n;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhk0/n;

    return-object v0
.end method


# virtual methods
.method public final getValue()I
    .locals 1

    iget v0, p0, Lhk0/n;->value:I

    return v0
.end method
