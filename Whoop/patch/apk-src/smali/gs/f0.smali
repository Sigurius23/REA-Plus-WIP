.class public final Lgs/f0;
.super Lgs/d;
.source "SourceFile"


# instance fields
.field public final a:Lgs/b0;

.field public final b:Ljava/lang/String;

.field public final c:Lgs/b0;

.field public final d:Lgs/d;


# direct methods
.method public constructor <init>(Lgs/b0;Ljava/lang/String;Lgs/b0;Lgs/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgs/f0;->a:Lgs/b0;

    iput-object p2, p0, Lgs/f0;->b:Ljava/lang/String;

    iput-object p3, p0, Lgs/f0;->c:Lgs/b0;

    iput-object p4, p0, Lgs/f0;->d:Lgs/d;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    iget-object v0, p0, Lgs/f0;->a:Lgs/b0;

    sget-object v1, Lgs/b0;->l:Lgs/b0;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lgs/f0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lgs/f0;

    iget-object v0, p1, Lgs/f0;->c:Lgs/b0;

    iget-object v2, p0, Lgs/f0;->c:Lgs/b0;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lgs/f0;->d:Lgs/d;

    iget-object v2, p0, Lgs/f0;->d:Lgs/d;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lgs/f0;->b:Ljava/lang/String;

    iget-object v2, p0, Lgs/f0;->b:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p1, Lgs/f0;->a:Lgs/b0;

    iget-object v0, p0, Lgs/f0;->a:Lgs/b0;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 5

    iget-object v0, p0, Lgs/f0;->d:Lgs/d;

    iget-object v1, p0, Lgs/f0;->a:Lgs/b0;

    const-class v2, Lgs/f0;

    iget-object v3, p0, Lgs/f0;->b:Ljava/lang/String;

    iget-object v4, p0, Lgs/f0;->c:Lgs/b0;

    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "LegacyKmsEnvelopeAead Parameters (kekUri: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lgs/f0;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", dekParsingStrategy: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lgs/f0;->c:Lgs/b0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dekParametersForNewKeys: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lgs/f0;->d:Lgs/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", variant: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lgs/f0;->a:Lgs/b0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
