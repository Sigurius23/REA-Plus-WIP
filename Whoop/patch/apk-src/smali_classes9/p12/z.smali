.class public final Lp12/z;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000c\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0017\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u000fR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u0013\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lp12/z;",
        "",
        "",
        "shouldShowProgressBar",
        "",
        "pageNumber",
        "totalPages",
        "Lcom/whoop/design/model/ParagraphInsets;",
        "insets",
        "<init>",
        "(ZIILcom/whoop/design/model/ParagraphInsets;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Z",
        "c",
        "()Z",
        "b",
        "I",
        "d",
        "Lcom/whoop/design/model/ParagraphInsets;",
        "()Lcom/whoop/design/model/ParagraphInsets;",
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


# static fields
.field public static final e:I


# instance fields
.field private final a:Z

.field private final b:I

.field private final c:I

.field private final d:Lcom/whoop/design/model/ParagraphInsets;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/whoop/design/model/ParagraphInsets;->$stable:I

    sput v0, Lp12/z;->e:I

    return-void
.end method

.method public constructor <init>(ZIILcom/whoop/design/model/ParagraphInsets;)V
    .locals 1

    const-string v0, "insets"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lp12/z;->a:Z

    iput p2, p0, Lp12/z;->b:I

    iput p3, p0, Lp12/z;->c:I

    iput-object p4, p0, Lp12/z;->d:Lcom/whoop/design/model/ParagraphInsets;

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/design/model/ParagraphInsets;
    .locals 1

    iget-object v0, p0, Lp12/z;->d:Lcom/whoop/design/model/ParagraphInsets;

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lp12/z;->b:I

    return v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lp12/z;->a:Z

    return v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lp12/z;->c:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lp12/z;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lp12/z;

    iget-boolean v1, p0, Lp12/z;->a:Z

    iget-boolean v3, p1, Lp12/z;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lp12/z;->b:I

    iget v3, p1, Lp12/z;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lp12/z;->c:I

    iget v3, p1, Lp12/z;->c:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lp12/z;->d:Lcom/whoop/design/model/ParagraphInsets;

    iget-object p1, p1, Lp12/z;->d:Lcom/whoop/design/model/ParagraphInsets;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lp12/z;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lp12/z;->b:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lp12/z;->c:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lp12/z;->d:Lcom/whoop/design/model/ParagraphInsets;

    invoke-virtual {v1}, Lcom/whoop/design/model/ParagraphInsets;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-boolean v0, p0, Lp12/z;->a:Z

    iget v1, p0, Lp12/z;->b:I

    iget v2, p0, Lp12/z;->c:I

    iget-object v3, p0, Lp12/z;->d:Lcom/whoop/design/model/ParagraphInsets;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "ProgressBarInfo(shouldShowProgressBar="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", pageNumber="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", totalPages="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", insets="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
