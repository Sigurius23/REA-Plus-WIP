.class public final Lts/h;
.super Lns/t;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Lts/g;

.field public final c:Lct/a;


# direct methods
.method public constructor <init>(ILts/g;Lct/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lts/h;->a:I

    iput-object p2, p0, Lts/h;->b:Lts/g;

    iput-object p3, p0, Lts/h;->c:Lct/a;

    return-void
.end method

.method public static b()Ls/m2;
    .locals 2

    new-instance v0, Ls/m2;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    iput-object v1, v0, Ls/m2;->w:Ljava/lang/Object;

    iput-object v1, v0, Ls/m2;->x:Ljava/lang/Object;

    iput-object v1, v0, Ls/m2;->y:Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lts/h;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lts/h;

    iget v0, p1, Lts/h;->a:I

    iget v2, p0, Lts/h;->a:I

    if-ne v0, v2, :cond_1

    iget-object v0, p1, Lts/h;->b:Lts/g;

    iget-object v2, p0, Lts/h;->b:Lts/g;

    if-ne v0, v2, :cond_1

    iget-object p1, p1, Lts/h;->c:Lct/a;

    iget-object v0, p0, Lts/h;->c:Lct/a;

    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 4

    iget v0, p0, Lts/h;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lts/h;->b:Lts/g;

    iget-object v2, p0, Lts/h;->c:Lct/a;

    const-class v3, Lts/h;

    filled-new-array {v3, v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HKDF PRF Parameters (hashType: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lts/h;->b:Lts/g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", salt: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lts/h;->c:Lct/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lts/h;->a:I

    const-string v2, "-byte key)"

    invoke-static {v0, v1, v2}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
