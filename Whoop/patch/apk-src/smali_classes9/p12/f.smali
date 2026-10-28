.class public final Lp12/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0018\u0008\u0087\u0008\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00022\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010!\u001a\u0004\u0008\"\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008$\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\'\u001a\u0004\u0008\u0019\u0010(R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010)\u001a\u0004\u0008\u001d\u0010*\u00a8\u0006+"
    }
    d2 = {
        "Lp12/f;",
        "",
        "",
        "isImageBackground",
        "Lkd1/o;",
        "imageSource",
        "Lp12/a;",
        "mediaType",
        "Lv41/r0;",
        "lottieWrapper",
        "Li91/a;",
        "background",
        "Lp12/c;",
        "backgroundType",
        "<init>",
        "(ZLkd1/o;Lp12/a;Lv41/r0;Li91/a;Lp12/c;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Z",
        "f",
        "()Z",
        "b",
        "Lkd1/o;",
        "c",
        "()Lkd1/o;",
        "Lp12/a;",
        "e",
        "()Lp12/a;",
        "d",
        "Lv41/r0;",
        "()Lv41/r0;",
        "Li91/a;",
        "()Li91/a;",
        "Lp12/c;",
        "()Lp12/c;",
        "onboarding-story_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Z

.field private final b:Lkd1/o;

.field private final c:Lp12/a;

.field private final d:Lv41/r0;

.field private final e:Li91/a;

.field private final f:Lp12/c;


# direct methods
.method public constructor <init>(ZLkd1/o;Lp12/a;Lv41/r0;Li91/a;Lp12/c;)V
    .locals 1

    const-string v0, "imageSource"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mediaType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundType"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lp12/f;->a:Z

    iput-object p2, p0, Lp12/f;->b:Lkd1/o;

    iput-object p3, p0, Lp12/f;->c:Lp12/a;

    iput-object p4, p0, Lp12/f;->d:Lv41/r0;

    iput-object p5, p0, Lp12/f;->e:Li91/a;

    iput-object p6, p0, Lp12/f;->f:Lp12/c;

    return-void
.end method


# virtual methods
.method public final a()Li91/a;
    .locals 1

    iget-object v0, p0, Lp12/f;->e:Li91/a;

    return-object v0
.end method

.method public final b()Lp12/c;
    .locals 1

    iget-object v0, p0, Lp12/f;->f:Lp12/c;

    return-object v0
.end method

.method public final c()Lkd1/o;
    .locals 1

    iget-object v0, p0, Lp12/f;->b:Lkd1/o;

    return-object v0
.end method

.method public final d()Lv41/r0;
    .locals 1

    iget-object v0, p0, Lp12/f;->d:Lv41/r0;

    return-object v0
.end method

.method public final e()Lp12/a;
    .locals 1

    iget-object v0, p0, Lp12/f;->c:Lp12/a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lp12/f;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lp12/f;

    iget-boolean v1, p0, Lp12/f;->a:Z

    iget-boolean v3, p1, Lp12/f;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lp12/f;->b:Lkd1/o;

    iget-object v3, p1, Lp12/f;->b:Lkd1/o;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lp12/f;->c:Lp12/a;

    iget-object v3, p1, Lp12/f;->c:Lp12/a;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lp12/f;->d:Lv41/r0;

    iget-object v3, p1, Lp12/f;->d:Lv41/r0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lp12/f;->e:Li91/a;

    iget-object v3, p1, Lp12/f;->e:Li91/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lp12/f;->f:Lp12/c;

    iget-object p1, p1, Lp12/f;->f:Lp12/c;

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lp12/f;->a:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Lp12/f;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lp12/f;->b:Lkd1/o;

    invoke-static {v2, v0, v1}, Lq63/c;->c(Lkd1/o;II)I

    move-result v0

    iget-object v2, p0, Lp12/f;->c:Lp12/a;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lp12/f;->d:Lv41/r0;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lp12/f;->e:Li91/a;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v2, v3

    mul-int/2addr v2, v1

    iget-object v0, p0, Lp12/f;->f:Lp12/c;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-boolean v0, p0, Lp12/f;->a:Z

    iget-object v1, p0, Lp12/f;->b:Lkd1/o;

    iget-object v2, p0, Lp12/f;->c:Lp12/a;

    iget-object v3, p0, Lp12/f;->d:Lv41/r0;

    iget-object v4, p0, Lp12/f;->e:Li91/a;

    iget-object v5, p0, Lp12/f;->f:Lp12/c;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "ImageInfo(isImageBackground="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", imageSource="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", mediaType="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", lottieWrapper="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", background="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", backgroundType="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
