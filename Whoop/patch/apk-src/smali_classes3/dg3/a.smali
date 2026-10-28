.class public final Ldg3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcg3/d;


# instance fields
.field public final w:Lcg3/c;

.field public final x:I

.field public final y:I


# direct methods
.method public constructor <init>(Lcg3/c;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldg3/a;->w:Lcg3/c;

    iput p2, p0, Ldg3/a;->x:I

    iput p3, p0, Ldg3/a;->y:I

    return-void
.end method


# virtual methods
.method public final getBeginIndex()I
    .locals 1

    iget v0, p0, Ldg3/a;->x:I

    return v0
.end method

.method public final getEndIndex()I
    .locals 1

    iget v0, p0, Ldg3/a;->y:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Link{type="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ldg3/a;->w:Lcg3/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", beginIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ldg3/a;->x:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", endIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ldg3/a;->y:I

    const-string v2, "}"

    invoke-static {v0, v1, v2}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
