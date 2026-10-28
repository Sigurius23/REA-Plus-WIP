.class public final Lws/c;
.super Lns/t;
.source "SourceFile"


# instance fields
.field public final a:Lws/b;

.field public final b:Lws/a;

.field public final c:Lws/b;

.field public final d:Lws/b;


# direct methods
.method public constructor <init>(Lws/b;Lws/a;Lws/b;Lws/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lws/c;->a:Lws/b;

    iput-object p2, p0, Lws/c;->b:Lws/a;

    iput-object p3, p0, Lws/c;->c:Lws/b;

    iput-object p4, p0, Lws/c;->d:Lws/b;

    return-void
.end method

.method public static b()Lzt/q;
    .locals 3

    new-instance v0, Lzt/q;

    const/16 v1, 0x14

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lzt/q;-><init>(IZ)V

    const/4 v1, 0x0

    iput-object v1, v0, Lzt/q;->x:Ljava/lang/Object;

    iput-object v1, v0, Lzt/q;->y:Ljava/lang/Object;

    iput-object v1, v0, Lzt/q;->z:Ljava/lang/Object;

    sget-object v1, Lws/b;->k:Lws/b;

    iput-object v1, v0, Lzt/q;->E:Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public final a()Z
    .locals 2

    iget-object v0, p0, Lws/c;->d:Lws/b;

    sget-object v1, Lws/b;->k:Lws/b;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lws/c;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lws/c;

    iget-object v0, p1, Lws/c;->a:Lws/b;

    iget-object v2, p0, Lws/c;->a:Lws/b;

    if-ne v0, v2, :cond_1

    iget-object v0, p1, Lws/c;->b:Lws/a;

    iget-object v2, p0, Lws/c;->b:Lws/a;

    if-ne v0, v2, :cond_1

    iget-object v0, p1, Lws/c;->c:Lws/b;

    iget-object v2, p0, Lws/c;->c:Lws/b;

    if-ne v0, v2, :cond_1

    iget-object p1, p1, Lws/c;->d:Lws/b;

    iget-object v0, p0, Lws/c;->d:Lws/b;

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 5

    iget-object v0, p0, Lws/c;->c:Lws/b;

    iget-object v1, p0, Lws/c;->d:Lws/b;

    const-class v2, Lws/c;

    iget-object v3, p0, Lws/c;->a:Lws/b;

    iget-object v4, p0, Lws/c;->b:Lws/a;

    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ECDSA Parameters (variant: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lws/c;->d:Lws/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hashType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lws/c;->c:Lws/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", encoding: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lws/c;->a:Lws/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", curve: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lws/c;->b:Lws/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
