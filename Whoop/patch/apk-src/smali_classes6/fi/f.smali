.class public final Lfi/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final o:Lfi/f;


# instance fields
.field public final a:Lne3/p;

.field public final b:Lq83/j;

.field public final c:Lq83/j;

.field public final d:Lq83/j;

.field public final e:Lfi/b;

.field public final f:Lfi/b;

.field public final g:Lfi/b;

.field public final h:Lkotlin/jvm/functions/Function1;

.field public final i:Lkotlin/jvm/functions/Function1;

.field public final j:Lkotlin/jvm/functions/Function1;

.field public final k:Lgi/j;

.field public final l:Lgi/g;

.field public final m:Lgi/d;

.field public final n:Lrh/i;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v0, Lfi/f;

    sget-object v1, Lne3/p;->w:Lne3/a0;

    sget-object v2, Lbc3/q0;->a:Lkc3/e;

    sget-object v3, Lkc3/d;->w:Lkc3/d;

    sget-object v5, Lfi/b;->y:Lfi/b;

    sget-object v11, Lgi/j;->a:Lgi/e;

    sget-object v12, Lgi/g;->x:Lgi/g;

    sget-object v13, Lgi/d;->w:Lgi/d;

    sget-object v14, Lrh/i;->b:Lrh/i;

    sget-object v2, Lq83/k;->w:Lq83/k;

    sget-object v8, Lki/j;->w:Lki/j;

    move-object v4, v3

    move-object v6, v5

    move-object v7, v5

    move-object v9, v8

    move-object v10, v8

    invoke-direct/range {v0 .. v14}, Lfi/f;-><init>(Lne3/p;Lq83/j;Lq83/j;Lq83/j;Lfi/b;Lfi/b;Lfi/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lgi/j;Lgi/g;Lgi/d;Lrh/i;)V

    sput-object v0, Lfi/f;->o:Lfi/f;

    return-void
.end method

.method public constructor <init>(Lne3/p;Lq83/j;Lq83/j;Lq83/j;Lfi/b;Lfi/b;Lfi/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lgi/j;Lgi/g;Lgi/d;Lrh/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfi/f;->a:Lne3/p;

    iput-object p2, p0, Lfi/f;->b:Lq83/j;

    iput-object p3, p0, Lfi/f;->c:Lq83/j;

    iput-object p4, p0, Lfi/f;->d:Lq83/j;

    iput-object p5, p0, Lfi/f;->e:Lfi/b;

    iput-object p6, p0, Lfi/f;->f:Lfi/b;

    iput-object p7, p0, Lfi/f;->g:Lfi/b;

    iput-object p8, p0, Lfi/f;->h:Lkotlin/jvm/functions/Function1;

    iput-object p9, p0, Lfi/f;->i:Lkotlin/jvm/functions/Function1;

    iput-object p10, p0, Lfi/f;->j:Lkotlin/jvm/functions/Function1;

    iput-object p11, p0, Lfi/f;->k:Lgi/j;

    iput-object p12, p0, Lfi/f;->l:Lgi/g;

    iput-object p13, p0, Lfi/f;->m:Lgi/d;

    iput-object p14, p0, Lfi/f;->n:Lrh/i;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lfi/f;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lfi/f;

    iget-object v1, p0, Lfi/f;->a:Lne3/p;

    iget-object v3, p1, Lfi/f;->a:Lne3/p;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lfi/f;->b:Lq83/j;

    iget-object v3, p1, Lfi/f;->b:Lq83/j;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lfi/f;->c:Lq83/j;

    iget-object v3, p1, Lfi/f;->c:Lq83/j;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lfi/f;->d:Lq83/j;

    iget-object v3, p1, Lfi/f;->d:Lq83/j;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lfi/f;->e:Lfi/b;

    iget-object v3, p1, Lfi/f;->e:Lfi/b;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lfi/f;->f:Lfi/b;

    iget-object v3, p1, Lfi/f;->f:Lfi/b;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lfi/f;->g:Lfi/b;

    iget-object v3, p1, Lfi/f;->g:Lfi/b;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lfi/f;->h:Lkotlin/jvm/functions/Function1;

    iget-object v3, p1, Lfi/f;->h:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lfi/f;->i:Lkotlin/jvm/functions/Function1;

    iget-object v3, p1, Lfi/f;->i:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lfi/f;->j:Lkotlin/jvm/functions/Function1;

    iget-object v3, p1, Lfi/f;->j:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lfi/f;->k:Lgi/j;

    iget-object v3, p1, Lfi/f;->k:Lgi/j;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lfi/f;->l:Lgi/g;

    iget-object v3, p1, Lfi/f;->l:Lgi/g;

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lfi/f;->m:Lgi/d;

    iget-object v3, p1, Lfi/f;->m:Lgi/d;

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lfi/f;->n:Lrh/i;

    iget-object p1, p1, Lfi/f;->n:Lrh/i;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_f

    return v2

    :cond_f
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lfi/f;->a:Lne3/p;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lfi/f;->b:Lq83/j;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lfi/f;->c:Lq83/j;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lfi/f;->d:Lq83/j;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lfi/f;->e:Lfi/b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lfi/f;->f:Lfi/b;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lfi/f;->g:Lfi/b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lfi/f;->h:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1}, Lr;->e(Lkotlin/jvm/functions/Function1;II)I

    move-result v0

    iget-object v2, p0, Lfi/f;->i:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1}, Lr;->e(Lkotlin/jvm/functions/Function1;II)I

    move-result v0

    iget-object v2, p0, Lfi/f;->j:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1}, Lr;->e(Lkotlin/jvm/functions/Function1;II)I

    move-result v0

    iget-object v2, p0, Lfi/f;->k:Lgi/j;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lfi/f;->l:Lgi/g;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lfi/f;->m:Lgi/d;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lfi/f;->n:Lrh/i;

    iget-object v0, v0, Lrh/i;->a:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Defaults(fileSystem="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lfi/f;->a:Lne3/p;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", interceptorCoroutineContext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfi/f;->b:Lq83/j;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fetcherCoroutineContext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfi/f;->c:Lq83/j;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", decoderCoroutineContext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfi/f;->d:Lq83/j;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", memoryCachePolicy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfi/f;->e:Lfi/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", diskCachePolicy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfi/f;->f:Lfi/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", networkCachePolicy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfi/f;->g:Lfi/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", placeholderFactory="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfi/f;->h:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", errorFactory="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfi/f;->i:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fallbackFactory="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfi/f;->j:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sizeResolver="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfi/f;->k:Lgi/j;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", scale="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfi/f;->l:Lgi/g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", precision="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfi/f;->m:Lgi/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", extras="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfi/f;->n:Lrh/i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
