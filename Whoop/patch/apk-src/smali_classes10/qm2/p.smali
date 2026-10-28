.class public final enum Lqm2/p;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lqm2/p;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\r\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\'\u0008\u0002\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0008\u001a\u0004\u0008\u000b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0008\u001a\u0004\u0008\u000c\u0010\nj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lqm2/p;",
        "",
        "",
        "titleTextResource",
        "subtitleTextResource",
        "errorImageResource",
        "<init>",
        "(Ljava/lang/String;IIII)V",
        "I",
        "getTitleTextResource",
        "()I",
        "getSubtitleTextResource",
        "getErrorImageResource",
        "ACCOUNT_ERROR",
        "NO_NETWORK",
        "app_prodStandardRelease"
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

.field private static final synthetic $VALUES:[Lqm2/p;

.field public static final enum ACCOUNT_ERROR:Lqm2/p;

.field public static final enum NO_NETWORK:Lqm2/p;


# instance fields
.field private final errorImageResource:I

.field private final subtitleTextResource:I

.field private final titleTextResource:I


# direct methods
.method private static final synthetic $values()[Lqm2/p;
    .locals 2

    sget-object v0, Lqm2/p;->ACCOUNT_ERROR:Lqm2/p;

    sget-object v1, Lqm2/p;->NO_NETWORK:Lqm2/p;

    filled-new-array {v0, v1}, [Lqm2/p;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lqm2/p;

    sget v3, Lhi0/j;->f1:I

    sget v4, Lhi0/j;->c1:I

    sget v5, Lhi0/d;->c:I

    const-string v1, "ACCOUNT_ERROR"

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v5}, Lqm2/p;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lqm2/p;->ACCOUNT_ERROR:Lqm2/p;

    new-instance v1, Lqm2/p;

    sget v4, Lhi0/j;->s0:I

    sget v5, Lhi0/j;->r0:I

    sget v6, Lhi0/d;->e:I

    const-string v2, "NO_NETWORK"

    const/4 v3, 0x1

    invoke-direct/range {v1 .. v6}, Lqm2/p;-><init>(Ljava/lang/String;IIII)V

    sput-object v1, Lqm2/p;->NO_NETWORK:Lqm2/p;

    invoke-static {}, Lqm2/p;->$values()[Lqm2/p;

    move-result-object v0

    sput-object v0, Lqm2/p;->$VALUES:[Lqm2/p;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lqm2/p;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IIII)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lqm2/p;->titleTextResource:I

    iput p4, p0, Lqm2/p;->subtitleTextResource:I

    iput p5, p0, Lqm2/p;->errorImageResource:I

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

    sget-object v0, Lqm2/p;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lqm2/p;
    .locals 1

    const-class v0, Lqm2/p;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lqm2/p;

    return-object p0
.end method

.method public static values()[Lqm2/p;
    .locals 1

    sget-object v0, Lqm2/p;->$VALUES:[Lqm2/p;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqm2/p;

    return-object v0
.end method


# virtual methods
.method public final getErrorImageResource()I
    .locals 1

    iget v0, p0, Lqm2/p;->errorImageResource:I

    return v0
.end method

.method public final getSubtitleTextResource()I
    .locals 1

    iget v0, p0, Lqm2/p;->subtitleTextResource:I

    return v0
.end method

.method public final getTitleTextResource()I
    .locals 1

    iget v0, p0, Lqm2/p;->titleTextResource:I

    return v0
.end method
