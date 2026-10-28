.class public final enum Lw81/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw81/d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lw81/d;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u0000 \u00072\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0008B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lw81/d;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "",
        "isPaging",
        "()Z",
        "Companion",
        "a",
        "IDLE",
        "DRAGGING",
        "SETTLING",
        "design_release"
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

.field private static final synthetic $VALUES:[Lw81/d;

.field public static final Companion:Lw81/d$a;

.field public static final enum DRAGGING:Lw81/d;

.field public static final enum IDLE:Lw81/d;

.field public static final enum SETTLING:Lw81/d;


# direct methods
.method private static final synthetic $values()[Lw81/d;
    .locals 3

    sget-object v0, Lw81/d;->IDLE:Lw81/d;

    sget-object v1, Lw81/d;->DRAGGING:Lw81/d;

    sget-object v2, Lw81/d;->SETTLING:Lw81/d;

    filled-new-array {v0, v1, v2}, [Lw81/d;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lw81/d;

    const-string v1, "IDLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lw81/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw81/d;->IDLE:Lw81/d;

    new-instance v0, Lw81/d;

    const-string v1, "DRAGGING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lw81/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw81/d;->DRAGGING:Lw81/d;

    new-instance v0, Lw81/d;

    const-string v1, "SETTLING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lw81/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw81/d;->SETTLING:Lw81/d;

    invoke-static {}, Lw81/d;->$values()[Lw81/d;

    move-result-object v0

    sput-object v0, Lw81/d;->$VALUES:[Lw81/d;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lw81/d;->$ENTRIES:Lt83/a;

    new-instance v0, Lw81/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lw81/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lw81/d;->Companion:Lw81/d$a;

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

    sget-object v0, Lw81/d;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lw81/d;
    .locals 1

    const-class v0, Lw81/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lw81/d;

    return-object p0
.end method

.method public static values()[Lw81/d;
    .locals 1

    sget-object v0, Lw81/d;->$VALUES:[Lw81/d;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lw81/d;

    return-object v0
.end method


# virtual methods
.method public final isPaging()Z
    .locals 1

    sget-object v0, Lw81/d;->IDLE:Lw81/d;

    if-eq p0, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
