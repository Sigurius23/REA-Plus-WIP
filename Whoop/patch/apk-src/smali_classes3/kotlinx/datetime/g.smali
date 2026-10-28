.class public final Lkotlinx/datetime/g;
.super Lpc3/h;
.source "SourceFile"

# interfaces
.implements Li93/g;


# static fields
.field public static final z:Lkotlinx/datetime/g;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlinx/datetime/g;

    new-instance v1, Lkotlinx/datetime/LocalDate;

    const/4 v2, 0x2

    const/16 v3, 0x7b2

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v2}, Lkotlinx/datetime/LocalDate;-><init>(III)V

    new-instance v2, Lkotlinx/datetime/LocalDate;

    invoke-direct {v2, v3, v4, v4}, Lkotlinx/datetime/LocalDate;-><init>(III)V

    invoke-direct {v0, v1, v2}, Lpc3/h;-><init>(Lkotlinx/datetime/LocalDate;Lkotlinx/datetime/LocalDate;)V

    sput-object v0, Lkotlinx/datetime/g;->z:Lkotlinx/datetime/g;

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Comparable;
    .locals 1

    iget-object v0, p0, Lpc3/h;->y:Lkotlinx/datetime/LocalDate;

    return-object v0
.end method

.method public final getStart()Ljava/lang/Comparable;
    .locals 1

    iget-object v0, p0, Lpc3/h;->x:Lkotlinx/datetime/LocalDate;

    return-object v0
.end method

.method public final isEmpty()Z
    .locals 2

    iget-object v0, p0, Lpc3/h;->x:Lkotlinx/datetime/LocalDate;

    iget-object v1, p0, Lpc3/h;->y:Lkotlinx/datetime/LocalDate;

    invoke-virtual {v0, v1}, Lkotlinx/datetime/LocalDate;->compareTo(Lkotlinx/datetime/LocalDate;)I

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

    iget-object v1, p0, Lpc3/h;->x:Lkotlinx/datetime/LocalDate;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpc3/h;->y:Lkotlinx/datetime/LocalDate;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
