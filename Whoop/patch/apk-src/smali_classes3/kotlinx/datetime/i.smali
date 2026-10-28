.class public final Lkotlinx/datetime/i;
.super Lpc3/v;
.source "SourceFile"

# interfaces
.implements Li93/g;


# static fields
.field public static final z:Lkotlinx/datetime/i;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlinx/datetime/i;

    new-instance v1, Lkotlinx/datetime/YearMonth;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v1, v3, v2}, Lkotlinx/datetime/YearMonth;-><init>(II)V

    new-instance v2, Lkotlinx/datetime/YearMonth;

    const/4 v4, 0x1

    invoke-direct {v2, v3, v4}, Lkotlinx/datetime/YearMonth;-><init>(II)V

    invoke-direct {v0, v1, v2}, Lpc3/v;-><init>(Lkotlinx/datetime/YearMonth;Lkotlinx/datetime/YearMonth;)V

    sput-object v0, Lkotlinx/datetime/i;->z:Lkotlinx/datetime/i;

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Comparable;
    .locals 1

    iget-object v0, p0, Lpc3/v;->y:Lkotlinx/datetime/YearMonth;

    return-object v0
.end method

.method public final getStart()Ljava/lang/Comparable;
    .locals 1

    iget-object v0, p0, Lpc3/v;->x:Lkotlinx/datetime/YearMonth;

    return-object v0
.end method

.method public final isEmpty()Z
    .locals 2

    iget-object v0, p0, Lpc3/v;->x:Lkotlinx/datetime/YearMonth;

    iget-object v1, p0, Lpc3/v;->y:Lkotlinx/datetime/YearMonth;

    invoke-virtual {v0, v1}, Lkotlinx/datetime/YearMonth;->compareTo(Lkotlinx/datetime/YearMonth;)I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lpc3/v;->x:Lkotlinx/datetime/YearMonth;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpc3/v;->y:Lkotlinx/datetime/YearMonth;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
