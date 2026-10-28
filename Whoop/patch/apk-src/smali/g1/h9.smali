.class public final Lg1/h9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ll3/v0;

.field public final b:Ll3/v0;

.field public final c:Ll3/v0;

.field public final d:Ll3/v0;

.field public final e:Ll3/v0;

.field public final f:Ll3/v0;

.field public final g:Ll3/v0;

.field public final h:Ll3/v0;

.field public final i:Ll3/v0;

.field public final j:Ll3/v0;

.field public final k:Ll3/v0;

.field public final l:Ll3/v0;

.field public final m:Ll3/v0;


# direct methods
.method public constructor <init>(Ll3/v0;Ll3/v0;Ll3/v0;Ll3/v0;Ll3/v0;Ll3/v0;Ll3/v0;Ll3/v0;Ll3/v0;Ll3/v0;Ll3/v0;Ll3/v0;Ll3/v0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/h9;->a:Ll3/v0;

    iput-object p2, p0, Lg1/h9;->b:Ll3/v0;

    iput-object p3, p0, Lg1/h9;->c:Ll3/v0;

    iput-object p4, p0, Lg1/h9;->d:Ll3/v0;

    iput-object p5, p0, Lg1/h9;->e:Ll3/v0;

    iput-object p6, p0, Lg1/h9;->f:Ll3/v0;

    iput-object p7, p0, Lg1/h9;->g:Ll3/v0;

    iput-object p8, p0, Lg1/h9;->h:Ll3/v0;

    iput-object p9, p0, Lg1/h9;->i:Ll3/v0;

    iput-object p10, p0, Lg1/h9;->j:Ll3/v0;

    iput-object p11, p0, Lg1/h9;->k:Ll3/v0;

    iput-object p12, p0, Lg1/h9;->l:Ll3/v0;

    iput-object p13, p0, Lg1/h9;->m:Ll3/v0;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lg1/h9;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lg1/h9;

    iget-object v1, p1, Lg1/h9;->a:Ll3/v0;

    iget-object v3, p0, Lg1/h9;->a:Ll3/v0;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lg1/h9;->b:Ll3/v0;

    iget-object v3, p1, Lg1/h9;->b:Ll3/v0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lg1/h9;->c:Ll3/v0;

    iget-object v3, p1, Lg1/h9;->c:Ll3/v0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lg1/h9;->d:Ll3/v0;

    iget-object v3, p1, Lg1/h9;->d:Ll3/v0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lg1/h9;->e:Ll3/v0;

    iget-object v3, p1, Lg1/h9;->e:Ll3/v0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lg1/h9;->f:Ll3/v0;

    iget-object v3, p1, Lg1/h9;->f:Ll3/v0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lg1/h9;->g:Ll3/v0;

    iget-object v3, p1, Lg1/h9;->g:Ll3/v0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lg1/h9;->h:Ll3/v0;

    iget-object v3, p1, Lg1/h9;->h:Ll3/v0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lg1/h9;->i:Ll3/v0;

    iget-object v3, p1, Lg1/h9;->i:Ll3/v0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lg1/h9;->j:Ll3/v0;

    iget-object v3, p1, Lg1/h9;->j:Ll3/v0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lg1/h9;->k:Ll3/v0;

    iget-object v3, p1, Lg1/h9;->k:Ll3/v0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lg1/h9;->l:Ll3/v0;

    iget-object v3, p1, Lg1/h9;->l:Ll3/v0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lg1/h9;->m:Ll3/v0;

    iget-object p1, p1, Lg1/h9;->m:Ll3/v0;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    return v2

    :cond_e
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lg1/h9;->a:Ll3/v0;

    invoke-virtual {v0}, Ll3/v0;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lg1/h9;->b:Ll3/v0;

    invoke-static {v0, v1, v2}, Ld13/a;->a(IILl3/v0;)I

    move-result v0

    iget-object v2, p0, Lg1/h9;->c:Ll3/v0;

    invoke-static {v0, v1, v2}, Ld13/a;->a(IILl3/v0;)I

    move-result v0

    iget-object v2, p0, Lg1/h9;->d:Ll3/v0;

    invoke-static {v0, v1, v2}, Ld13/a;->a(IILl3/v0;)I

    move-result v0

    iget-object v2, p0, Lg1/h9;->e:Ll3/v0;

    invoke-static {v0, v1, v2}, Ld13/a;->a(IILl3/v0;)I

    move-result v0

    iget-object v2, p0, Lg1/h9;->f:Ll3/v0;

    invoke-static {v0, v1, v2}, Ld13/a;->a(IILl3/v0;)I

    move-result v0

    iget-object v2, p0, Lg1/h9;->g:Ll3/v0;

    invoke-static {v0, v1, v2}, Ld13/a;->a(IILl3/v0;)I

    move-result v0

    iget-object v2, p0, Lg1/h9;->h:Ll3/v0;

    invoke-static {v0, v1, v2}, Ld13/a;->a(IILl3/v0;)I

    move-result v0

    iget-object v2, p0, Lg1/h9;->i:Ll3/v0;

    invoke-static {v0, v1, v2}, Ld13/a;->a(IILl3/v0;)I

    move-result v0

    iget-object v2, p0, Lg1/h9;->j:Ll3/v0;

    invoke-static {v0, v1, v2}, Ld13/a;->a(IILl3/v0;)I

    move-result v0

    iget-object v2, p0, Lg1/h9;->k:Ll3/v0;

    invoke-static {v0, v1, v2}, Ld13/a;->a(IILl3/v0;)I

    move-result v0

    iget-object v2, p0, Lg1/h9;->l:Ll3/v0;

    invoke-static {v0, v1, v2}, Ld13/a;->a(IILl3/v0;)I

    move-result v0

    iget-object v1, p0, Lg1/h9;->m:Ll3/v0;

    invoke-virtual {v1}, Ll3/v0;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Typography(h1="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lg1/h9;->a:Ll3/v0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", h2="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg1/h9;->b:Ll3/v0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", h3="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg1/h9;->c:Ll3/v0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", h4="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg1/h9;->d:Ll3/v0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", h5="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg1/h9;->e:Ll3/v0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", h6="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg1/h9;->f:Ll3/v0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", subtitle1="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg1/h9;->g:Ll3/v0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", subtitle2="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg1/h9;->h:Ll3/v0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", body1="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg1/h9;->i:Ll3/v0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", body2="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg1/h9;->j:Ll3/v0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", button="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg1/h9;->k:Ll3/v0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", caption="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg1/h9;->l:Ll3/v0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", overline="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg1/h9;->m:Ll3/v0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
