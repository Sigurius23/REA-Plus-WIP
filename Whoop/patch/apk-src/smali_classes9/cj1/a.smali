.class public final Lcj1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0081\u0008\u0018\u00002\u00020\u0001BK\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001a\u001a\u0004\u0008\u001d\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008\u0019\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008%\u0010&\u001a\u0004\u0008\u001e\u0010\'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010&\u001a\u0004\u0008%\u0010\'\u00a8\u0006("
    }
    d2 = {
        "Lcj1/a;",
        "Lm91/u;",
        "Lcom/whoop/design/util/TextResource;",
        "heading",
        "title",
        "Lhy0/c2;",
        "trend",
        "Lj71/c;",
        "graph",
        "Lcj1/d;",
        "prefixCta",
        "suffixCta",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/c2;Lj71/c;Lcj1/d;Lcj1/d;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lcom/whoop/design/util/TextResource;",
        "b",
        "()Lcom/whoop/design/util/TextResource;",
        "f",
        "c",
        "Lhy0/c2;",
        "g",
        "()Lhy0/c2;",
        "d",
        "Lj71/c;",
        "()Lj71/c;",
        "e",
        "Lcj1/d;",
        "()Lcj1/d;",
        "health_release"
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
.field public static final g:I


# instance fields
.field private final a:Lcom/whoop/design/util/TextResource;

.field private final b:Lcom/whoop/design/util/TextResource;

.field private final c:Lhy0/c2;

.field private final d:Lj71/c;

.field private final e:Lcj1/d;

.field private final f:Lcj1/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Ld11/i;->E:I

    sget v1, Lj71/c;->e:I

    or-int/2addr v0, v1

    sget v1, Lhy0/c2;->p:I

    or-int/2addr v0, v1

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int/2addr v0, v1

    or-int/2addr v0, v1

    sput v0, Lcj1/a;->g:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/c2;Lj71/c;Lcj1/d;Lcj1/d;)V
    .locals 1

    const-string v0, "heading"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcj1/a;->a:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lcj1/a;->b:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lcj1/a;->c:Lhy0/c2;

    iput-object p4, p0, Lcj1/a;->d:Lj71/c;

    iput-object p5, p0, Lcj1/a;->e:Lcj1/d;

    iput-object p6, p0, Lcj1/a;->f:Lcj1/d;

    return-void
.end method


# virtual methods
.method public final a()Lj71/c;
    .locals 1

    iget-object v0, p0, Lcj1/a;->d:Lj71/c;

    return-object v0
.end method

.method public final b()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcj1/a;->a:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final c()Lcj1/d;
    .locals 1

    iget-object v0, p0, Lcj1/a;->e:Lcj1/d;

    return-object v0
.end method

.method public final e()Lcj1/d;
    .locals 1

    iget-object v0, p0, Lcj1/a;->f:Lcj1/d;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcj1/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcj1/a;

    iget-object v1, p0, Lcj1/a;->a:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcj1/a;->a:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcj1/a;->b:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcj1/a;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcj1/a;->c:Lhy0/c2;

    iget-object v3, p1, Lcj1/a;->c:Lhy0/c2;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcj1/a;->d:Lj71/c;

    iget-object v3, p1, Lcj1/a;->d:Lj71/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcj1/a;->e:Lcj1/d;

    iget-object v3, p1, Lcj1/a;->e:Lcj1/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcj1/a;->f:Lcj1/d;

    iget-object p1, p1, Lcj1/a;->f:Lcj1/d;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcj1/a;->b:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final g()Lhy0/c2;
    .locals 1

    iget-object v0, p0, Lcj1/a;->c:Lhy0/c2;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcj1/a;->a:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcj1/a;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcj1/a;->c:Lhy0/c2;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lhy0/c2;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcj1/a;->d:Lj71/c;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lj71/c;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcj1/a;->e:Lcj1/d;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcj1/d;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcj1/a;->f:Lcj1/d;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lcj1/d;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcj1/a;->a:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lcj1/a;->b:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lcj1/a;->c:Lhy0/c2;

    iget-object v3, p0, Lcj1/a;->d:Lj71/c;

    iget-object v4, p0, Lcj1/a;->e:Lcj1/d;

    iget-object v5, p0, Lcj1/a;->f:Lcj1/d;

    const-string v6, ", title="

    const-string v7, ", trend="

    const-string v8, "DataVisualizationCardBodyViewState(heading="

    invoke-static {v8, v0, v6, v1, v7}, Lte0/d;->q(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", graph="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", prefixCta="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", suffixCta="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
