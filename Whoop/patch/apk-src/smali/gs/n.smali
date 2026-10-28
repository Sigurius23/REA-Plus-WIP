.class public final Lgs/n;
.super Lgs/d;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:Lgs/j;


# direct methods
.method public constructor <init>(IIILgs/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lgs/n;->a:I

    iput p2, p0, Lgs/n;->b:I

    iput p3, p0, Lgs/n;->c:I

    iput-object p4, p0, Lgs/n;->d:Lgs/j;

    return-void
.end method

.method public static b()Lzt/q;
    .locals 3

    new-instance v0, Lzt/q;

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lzt/q;-><init>(IZ)V

    const/4 v1, 0x0

    iput-object v1, v0, Lzt/q;->x:Ljava/lang/Object;

    iput-object v1, v0, Lzt/q;->y:Ljava/lang/Object;

    iput-object v1, v0, Lzt/q;->z:Ljava/lang/Object;

    sget-object v1, Lgs/j;->m:Lgs/j;

    iput-object v1, v0, Lzt/q;->E:Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public final a()Z
    .locals 2

    iget-object v0, p0, Lgs/n;->d:Lgs/j;

    sget-object v1, Lgs/j;->m:Lgs/j;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lgs/n;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lgs/n;

    iget v0, p1, Lgs/n;->a:I

    iget v2, p0, Lgs/n;->a:I

    if-ne v0, v2, :cond_1

    iget v0, p1, Lgs/n;->b:I

    iget v2, p0, Lgs/n;->b:I

    if-ne v0, v2, :cond_1

    iget v0, p1, Lgs/n;->c:I

    iget v2, p0, Lgs/n;->c:I

    if-ne v0, v2, :cond_1

    iget-object p1, p1, Lgs/n;->d:Lgs/j;

    iget-object v0, p0, Lgs/n;->d:Lgs/j;

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 5

    iget v0, p0, Lgs/n;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Lgs/n;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p0, Lgs/n;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, p0, Lgs/n;->d:Lgs/j;

    const-class v4, Lgs/n;

    filled-new-array {v4, v0, v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AesEax Parameters (variant: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lgs/n;->d:Lgs/j;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lgs/n;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "-byte IV, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lgs/n;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "-byte tag, and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lgs/n;->a:I

    const-string v2, "-byte key)"

    invoke-static {v0, v1, v2}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
