.class public final Lew/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:Ljava/lang/String;

.field public final c:Ll83/p;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 1

    const-string v0, "randomUUID().toString()"

    invoke-static {v0}, Ldc/b;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lew/d;->a:Ljava/util/ArrayList;

    iput-object v0, p0, Lew/d;->b:Ljava/lang/String;

    new-instance p1, Lav/b;

    const/16 v0, 0xd

    invoke-direct {p1, p0, v0}, Lav/b;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lew/d;->c:Ll83/p;

    return-void
.end method


# virtual methods
.method public final a(Ljava/io/OutputStream;)V
    .locals 5

    invoke-static {p1}, Lne3/b;->i(Ljava/io/OutputStream;)Lne3/d0;

    move-result-object p1

    invoke-static {p1}, Lne3/b;->b(Lne3/n0;)Lne3/h0;

    move-result-object p1

    iget-object v0, p0, Lew/d;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    iget-object v2, p0, Lew/d;->b:Ljava/lang/String;

    const-string v3, "--"

    const-string v4, "\r\n"

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lew/e;

    invoke-virtual {p1, v3}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {p1, v2}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {p1, v4}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    iget-object v1, v1, Lew/e;->a:Lew/a;

    iget-object v1, v1, Lew/a;->a:[B

    const-string v2, "Content-Length: "

    invoke-virtual {p1, v2}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    array-length v2, v1

    int-to-long v2, v2

    invoke-virtual {p1, v2, v3}, Lne3/h0;->h0(J)Lne3/i;

    invoke-interface {p1, v4}, Lne3/i;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {p1, v4}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {p1}, Lne3/h0;->flush()V

    new-instance v2, Lne3/g0;

    invoke-direct {v2, p1}, Lne3/g0;-><init>(Lne3/h0;)V

    invoke-static {v2}, Lne3/b;->i(Ljava/io/OutputStream;)Lne3/d0;

    move-result-object v2

    invoke-static {v2}, Lne3/b;->b(Lne3/n0;)Lne3/h0;

    move-result-object v2

    invoke-virtual {v2, v1}, Lne3/h0;->write([B)Lne3/i;

    invoke-virtual {v2}, Lne3/h0;->flush()V

    invoke-virtual {p1, v4}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v3}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {p1, v2}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {p1, v3}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {p1, v4}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {p1}, Lne3/h0;->flush()V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lew/d;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lew/d;

    iget-object v0, p0, Lew/d;->a:Ljava/util/ArrayList;

    iget-object v1, p1, Lew/d;->a:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lew/d;->b:Ljava/lang/String;

    iget-object p1, p1, Lew/d;->b:Ljava/lang/String;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_3
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lew/d;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lew/d;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MixedMultipartBody(parts="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lew/d;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", boundary="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lew/d;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
