.class public final Lkotlin/time/LongParser;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/time/LongParser$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007JP\u0010\u000f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u000cH\u0086\u0008\u00f8\u0001\u0000\u0082\u0002\n\n\u0008\u0008\u0001\u0012\u0002\u0010\u0003 \u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0011\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006\u0016"
    }
    d2 = {
        "Lkotlin/time/LongParser;",
        "",
        "",
        "overflowLimit",
        "",
        "allowSign",
        "<init>",
        "(JZ)V",
        "",
        "value",
        "",
        "startIndex",
        "Lkotlin/Function3;",
        "Ll83/a0;",
        "callback",
        "parse",
        "(Ljava/lang/String;ILkotlin/jvm/functions/Function3;)J",
        "J",
        "Z",
        "overflowThreshold",
        "lastDigitMax",
        "Companion",
        "kotlin-stdlib"
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
.field public static final Companion:Lkotlin/time/LongParser$Companion;

.field private static final default:Lkotlin/time/LongParser;

.field private static final iso:Lkotlin/time/LongParser;


# instance fields
.field private final allowSign:Z

.field private final lastDigitMax:J

.field private final overflowLimit:J

.field private final overflowThreshold:J


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lkotlin/time/LongParser$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlin/time/LongParser$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkotlin/time/LongParser;->Companion:Lkotlin/time/LongParser$Companion;

    new-instance v0, Lkotlin/time/LongParser;

    const-wide v1, 0x3fffffffffffffffL    # 1.9999999999999998

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lkotlin/time/LongParser;-><init>(JZ)V

    sput-object v0, Lkotlin/time/LongParser;->iso:Lkotlin/time/LongParser;

    new-instance v0, Lkotlin/time/LongParser;

    const-wide v1, 0x7fffffffffffffffL

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lkotlin/time/LongParser;-><init>(JZ)V

    sput-object v0, Lkotlin/time/LongParser;->default:Lkotlin/time/LongParser;

    return-void
.end method

.method private constructor <init>(JZ)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lkotlin/time/LongParser;->overflowLimit:J

    iput-boolean p3, p0, Lkotlin/time/LongParser;->allowSign:Z

    const/16 p3, 0xa

    int-to-long v0, p3

    div-long v2, p1, v0

    iput-wide v2, p0, Lkotlin/time/LongParser;->overflowThreshold:J

    rem-long/2addr p1, v0

    iput-wide p1, p0, Lkotlin/time/LongParser;->lastDigitMax:J

    return-void
.end method

.method public static final synthetic access$getAllowSign$p(Lkotlin/time/LongParser;)Z
    .locals 0

    iget-boolean p0, p0, Lkotlin/time/LongParser;->allowSign:Z

    return p0
.end method

.method public static final synthetic access$getDefault$cp()Lkotlin/time/LongParser;
    .locals 1

    sget-object v0, Lkotlin/time/LongParser;->default:Lkotlin/time/LongParser;

    return-object v0
.end method

.method public static final synthetic access$getIso$cp()Lkotlin/time/LongParser;
    .locals 1

    sget-object v0, Lkotlin/time/LongParser;->iso:Lkotlin/time/LongParser;

    return-object v0
.end method

.method public static final synthetic access$getLastDigitMax$p(Lkotlin/time/LongParser;)J
    .locals 2

    iget-wide v0, p0, Lkotlin/time/LongParser;->lastDigitMax:J

    return-wide v0
.end method

.method public static final synthetic access$getOverflowLimit$p(Lkotlin/time/LongParser;)J
    .locals 2

    iget-wide v0, p0, Lkotlin/time/LongParser;->overflowLimit:J

    return-wide v0
.end method

.method public static final synthetic access$getOverflowThreshold$p(Lkotlin/time/LongParser;)J
    .locals 2

    iget-wide v0, p0, Lkotlin/time/LongParser;->overflowThreshold:J

    return-wide v0
.end method


# virtual methods
.method public final parse(Ljava/lang/String;ILkotlin/jvm/functions/Function3;)J
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lkotlin/jvm/functions/Function3;",
            ")J"
        }
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lkotlin/time/LongParser;->access$getAllowSign$p(Lkotlin/time/LongParser;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v2, 0x2b

    if-eq v0, v2, :cond_1

    const/16 v2, 0x2d

    if-eq v0, v2, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 p2, p2, 0x1

    const/4 v0, -0x1

    goto :goto_1

    :cond_1
    add-int/lit8 p2, p2, 0x1

    :cond_2
    :goto_0
    move v0, v1

    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x30

    if-ge p2, v2, :cond_3

    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v3, :cond_3

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_3
    const-wide/16 v4, 0x0

    :goto_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge p2, v2, :cond_7

    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-gt v3, v2, :cond_7

    const/16 v6, 0x3a

    if-ge v2, v6, :cond_7

    add-int/lit8 v2, v2, -0x30

    invoke-static {p0}, Lkotlin/time/LongParser;->access$getOverflowThreshold$p(Lkotlin/time/LongParser;)J

    move-result-wide v7

    cmp-long v7, v4, v7

    if-gtz v7, :cond_5

    invoke-static {p0}, Lkotlin/time/LongParser;->access$getOverflowThreshold$p(Lkotlin/time/LongParser;)J

    move-result-wide v7

    cmp-long v7, v4, v7

    if-nez v7, :cond_4

    int-to-long v7, v2

    invoke-static {p0}, Lkotlin/time/LongParser;->access$getLastDigitMax$p(Lkotlin/time/LongParser;)J

    move-result-wide v9

    cmp-long v7, v7, v9

    if-lez v7, :cond_4

    goto :goto_3

    :cond_4
    const/4 v6, 0x3

    shl-long v6, v4, v6

    shl-long/2addr v4, v1

    add-long/2addr v6, v4

    int-to-long v4, v2

    add-long/2addr v4, v6

    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    :cond_5
    :goto_3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge p2, v1, :cond_6

    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-gt v3, v1, :cond_6

    if-ge v1, v6, :cond_6

    add-int/lit8 p2, p2, 0x1

    goto :goto_3

    :cond_6
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p3, p1, p2, v0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Lkotlin/time/LongParser;->access$getOverflowLimit$p(Lkotlin/time/LongParser;)J

    move-result-wide p1

    return-wide p1

    :cond_7
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p3, p1, p2, v0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-wide v4
.end method
