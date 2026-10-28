.class public final Ljg3/k;
.super Lvp/c;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final x:Ljg3/k;


# instance fields
.field public final w:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljg3/k;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljg3/k;-><init>(I)V

    sput-object v0, Ljg3/k;->x:Ljg3/k;

    const-string v0, "([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ljg3/k;->w:I

    return-void
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ljg3/k;->w:I

    if-nez v0, :cond_0

    sget-object v0, Ljg3/k;->x:Ljg3/k;

    return-object v0

    :cond_0
    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ljg3/k;

    if-eqz v0, :cond_1

    check-cast p1, Ljg3/k;

    iget v0, p0, Ljg3/k;->w:I

    iget p1, p1, Ljg3/k;->w:I

    if-ne v0, p1, :cond_1

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    const/16 v1, 0x8

    invoke-static {v0, v1}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v0

    iget v1, p0, Ljg3/k;->w:I

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    sget-object v0, Ljg3/k;->x:Ljg3/k;

    if-ne p0, v0, :cond_0

    const-string v0, "P0D"

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "P"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ljg3/k;->w:I

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x44

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
