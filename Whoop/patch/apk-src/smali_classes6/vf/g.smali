.class public final Lvf/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvf/a;


# instance fields
.field public final a:Lvf/b;

.field public final b:Z

.field public final c:Lmf/r;

.field public final d:Ll83/p;

.field public final e:Ll83/p;

.field public final f:Lmf/l;


# direct methods
.method public constructor <init>(Lvf/b;Z)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvf/g;->a:Lvf/b;

    iput-boolean p2, p0, Lvf/g;->b:Z

    iget-object p2, p1, Lvf/b;->w:Lmf/r;

    iput-object p2, p0, Lvf/g;->c:Lmf/r;

    new-instance p2, Lvf/f;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0}, Lvf/f;-><init>(Lvf/g;I)V

    invoke-static {p2}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p2

    iput-object p2, p0, Lvf/g;->d:Ll83/p;

    new-instance p2, Lvf/f;

    const/4 v0, 0x1

    invoke-direct {p2, p0, v0}, Lvf/f;-><init>(Lvf/g;I)V

    invoke-static {p2}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p2

    iput-object p2, p0, Lvf/g;->e:Ll83/p;

    iget-object p1, p1, Lvf/b;->z:Lmf/l;

    iput-object p1, p0, Lvf/g;->f:Lmf/l;

    new-instance p1, Lvf/f;

    const/4 p2, 0x2

    invoke-direct {p1, p0, p2}, Lvf/f;-><init>(Lvf/g;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lvf/g;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lvf/g;

    iget-object v0, p0, Lvf/g;->a:Lvf/b;

    iget-object v1, p1, Lvf/g;->a:Lvf/b;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-boolean v0, p0, Lvf/g;->b:Z

    iget-boolean p1, p1, Lvf/g;->b:Z

    if-eq v0, p1, :cond_3

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_3
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final getBody()Lmf/l;
    .locals 1

    iget-object v0, p0, Lvf/g;->f:Lmf/l;

    return-object v0
.end method

.method public final getHeaders()Lmf/h;
    .locals 1

    iget-object v0, p0, Lvf/g;->e:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmf/h;

    return-object v0
.end method

.method public final getMethod()Lmf/r;
    .locals 1

    iget-object v0, p0, Lvf/g;->c:Lmf/r;

    return-object v0
.end method

.method public final getUrl()Lcg/o;
    .locals 1

    iget-object v0, p0, Lvf/g;->d:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcg/o;

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lvf/g;->a:Lvf/b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lvf/g;->b:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HttpRequestBuilderView(builder="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lvf/g;->a:Lvf/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", allowToBuilder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lvf/g;->b:Z

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lb9/y;->r(Ljava/lang/StringBuilder;ZC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
