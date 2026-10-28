.class public abstract enum Lcm2/j;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcm2/j$a;,
        Lcm2/j$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcm2/j;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcm2/j;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Lcom/whoop/domain/model/UnitSystem;",
        "getUnitSystem",
        "()Lcom/whoop/domain/model/UnitSystem;",
        "KG",
        "LBS",
        "trends_release"
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

.field private static final synthetic $VALUES:[Lcm2/j;

.field public static final enum KG:Lcm2/j;

.field public static final enum LBS:Lcm2/j;


# direct methods
.method private static final synthetic $values()[Lcm2/j;
    .locals 2

    sget-object v0, Lcm2/j;->KG:Lcm2/j;

    sget-object v1, Lcm2/j;->LBS:Lcm2/j;

    filled-new-array {v0, v1}, [Lcm2/j;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcm2/j$a;

    const-string v1, "KG"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcm2/j$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcm2/j;->KG:Lcm2/j;

    new-instance v0, Lcm2/j$b;

    const-string v1, "LBS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcm2/j$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcm2/j;->LBS:Lcm2/j;

    invoke-static {}, Lcm2/j;->$values()[Lcm2/j;

    move-result-object v0

    sput-object v0, Lcm2/j;->$VALUES:[Lcm2/j;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcm2/j;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcm2/j;-><init>(Ljava/lang/String;I)V

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

    sget-object v0, Lcm2/j;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcm2/j;
    .locals 1

    const-class v0, Lcm2/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcm2/j;

    return-object p0
.end method

.method public static values()[Lcm2/j;
    .locals 1

    sget-object v0, Lcm2/j;->$VALUES:[Lcm2/j;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcm2/j;

    return-object v0
.end method


# virtual methods
.method public abstract getUnitSystem()Lcom/whoop/domain/model/UnitSystem;
.end method
