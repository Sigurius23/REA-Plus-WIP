.class public final enum Lfk0/g$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfk0/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfk0/g$b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lfk0/g$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u000c\u0008\u0086\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lfk0/g$b;",
        "",
        "",
        "intValue",
        "<init>",
        "(Ljava/lang/String;II)V",
        "I",
        "getIntValue",
        "()I",
        "Companion",
        "a",
        "HISTORY_START",
        "HISTORY_END",
        "HISTORY_COMPLETE",
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

.field private static final synthetic $VALUES:[Lfk0/g$b;

.field public static final Companion:Lfk0/g$b$a;

.field public static final enum HISTORY_COMPLETE:Lfk0/g$b;

.field public static final enum HISTORY_END:Lfk0/g$b;

.field public static final enum HISTORY_START:Lfk0/g$b;


# instance fields
.field private final intValue:I


# direct methods
.method private static final synthetic $values()[Lfk0/g$b;
    .locals 3

    sget-object v0, Lfk0/g$b;->HISTORY_START:Lfk0/g$b;

    sget-object v1, Lfk0/g$b;->HISTORY_END:Lfk0/g$b;

    sget-object v2, Lfk0/g$b;->HISTORY_COMPLETE:Lfk0/g$b;

    filled-new-array {v0, v1, v2}, [Lfk0/g$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lfk0/g$b;

    const-string v1, "HISTORY_START"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lfk0/g$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lfk0/g$b;->HISTORY_START:Lfk0/g$b;

    new-instance v0, Lfk0/g$b;

    const-string v1, "HISTORY_END"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v3, v2}, Lfk0/g$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lfk0/g$b;->HISTORY_END:Lfk0/g$b;

    new-instance v0, Lfk0/g$b;

    const-string v1, "HISTORY_COMPLETE"

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lfk0/g$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lfk0/g$b;->HISTORY_COMPLETE:Lfk0/g$b;

    invoke-static {}, Lfk0/g$b;->$values()[Lfk0/g$b;

    move-result-object v0

    sput-object v0, Lfk0/g$b;->$VALUES:[Lfk0/g$b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lfk0/g$b;->$ENTRIES:Lt83/a;

    new-instance v0, Lfk0/g$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lfk0/g$b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lfk0/g$b;->Companion:Lfk0/g$b$a;

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

    iput p3, p0, Lfk0/g$b;->intValue:I

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

    sget-object v0, Lfk0/g$b;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lfk0/g$b;
    .locals 1

    const-class v0, Lfk0/g$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lfk0/g$b;

    return-object p0
.end method

.method public static values()[Lfk0/g$b;
    .locals 1

    sget-object v0, Lfk0/g$b;->$VALUES:[Lfk0/g$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfk0/g$b;

    return-object v0
.end method


# virtual methods
.method public final getIntValue()I
    .locals 1

    iget v0, p0, Lfk0/g$b;->intValue:I

    return v0
.end method
