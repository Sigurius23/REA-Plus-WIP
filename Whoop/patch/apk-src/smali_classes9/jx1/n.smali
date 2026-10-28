.class public final enum Ljx1/n;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ljx1/n;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Ljx1/n;",
        "",
        "Li91/a;",
        "background",
        "<init>",
        "(Ljava/lang/String;ILi91/a;)V",
        "Li91/a;",
        "getBackground",
        "()Li91/a;",
        "ONE",
        "PEAK",
        "LIFE",
        "membership_release"
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

.field private static final synthetic $VALUES:[Ljx1/n;

.field public static final enum LIFE:Ljx1/n;

.field public static final enum ONE:Ljx1/n;

.field public static final enum PEAK:Ljx1/n;


# instance fields
.field private final background:Li91/a;


# direct methods
.method private static final synthetic $values()[Ljx1/n;
    .locals 3

    sget-object v0, Ljx1/n;->ONE:Ljx1/n;

    sget-object v1, Ljx1/n;->PEAK:Ljx1/n;

    sget-object v2, Ljx1/n;->LIFE:Ljx1/n;

    filled-new-array {v0, v1, v2}, [Ljx1/n;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ljx1/n;

    sget-wide v1, Li2/x;->m:J

    invoke-static {v1, v2}, Li91/c;->o(J)Li91/a;

    move-result-object v1

    const-string v2, "ONE"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Ljx1/n;-><init>(Ljava/lang/String;ILi91/a;)V

    sput-object v0, Ljx1/n;->ONE:Ljx1/n;

    new-instance v0, Ljx1/n;

    invoke-static {}, Ljx1/p;->a()Li2/t;

    move-result-object v1

    invoke-static {v1}, Lj91/c;->a(Li2/t;)Lj91/b;

    move-result-object v1

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-static {v1, v2}, Li91/c;->i(Lj91/b;F)Li91/a;

    move-result-object v1

    const-string v3, "PEAK"

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1}, Ljx1/n;-><init>(Ljava/lang/String;ILi91/a;)V

    sput-object v0, Ljx1/n;->PEAK:Ljx1/n;

    new-instance v0, Ljx1/n;

    invoke-static {}, Lgb1/b0;->I0()Li2/t;

    move-result-object v1

    invoke-static {v1}, Lj91/c;->a(Li2/t;)Lj91/b;

    move-result-object v1

    invoke-static {v1, v2}, Li91/c;->i(Lj91/b;F)Li91/a;

    move-result-object v1

    const-string v2, "LIFE"

    const/4 v3, 0x2

    invoke-direct {v0, v2, v3, v1}, Ljx1/n;-><init>(Ljava/lang/String;ILi91/a;)V

    sput-object v0, Ljx1/n;->LIFE:Ljx1/n;

    invoke-static {}, Ljx1/n;->$values()[Ljx1/n;

    move-result-object v0

    sput-object v0, Ljx1/n;->$VALUES:[Ljx1/n;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ljx1/n;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILi91/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li91/a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ljx1/n;->background:Li91/a;

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

    sget-object v0, Ljx1/n;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ljx1/n;
    .locals 1

    const-class v0, Ljx1/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljx1/n;

    return-object p0
.end method

.method public static values()[Ljx1/n;
    .locals 1

    sget-object v0, Ljx1/n;->$VALUES:[Ljx1/n;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljx1/n;

    return-object v0
.end method


# virtual methods
.method public final getBackground()Li91/a;
    .locals 1

    iget-object v0, p0, Ljx1/n;->background:Li91/a;

    return-object v0
.end method
