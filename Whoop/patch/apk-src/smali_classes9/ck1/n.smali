.class public final Lck1/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u0018\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001b\u0010\u0013R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\u0017\u0010\t\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u001e\u001a\u0004\u0008!\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010%\u001a\u0004\u0008\u001d\u0010&\u00a8\u0006\'"
    }
    d2 = {
        "Lck1/n;",
        "",
        "",
        "description",
        "disclaimer",
        "",
        "icon",
        "Lcom/whoop/design/util/TextResource;",
        "trendSubTitle",
        "trendTitle",
        "Lhy0/b2;",
        "trendType",
        "Lny0/p0;",
        "secondaryButton",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/b2;Lny0/p0;)V",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Ljava/lang/String;",
        "b",
        "c",
        "I",
        "d",
        "Lcom/whoop/design/util/TextResource;",
        "e",
        "()Lcom/whoop/design/util/TextResource;",
        "f",
        "Lhy0/b2;",
        "g",
        "()Lhy0/b2;",
        "Lny0/p0;",
        "()Lny0/p0;",
        "health-monitor_release"
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
.field public static final h:I


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:I

.field private final d:Lcom/whoop/design/util/TextResource;

.field private final e:Lcom/whoop/design/util/TextResource;

.field private final f:Lhy0/b2;

.field private final g:Lny0/p0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Lny0/p0;->o:I

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int/2addr v0, v1

    or-int/2addr v0, v1

    sput v0, Lck1/n;->h:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/b2;Lny0/p0;)V
    .locals 1

    const-string v0, "description"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "disclaimer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trendSubTitle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trendTitle"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trendType"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lck1/n;->a:Ljava/lang/String;

    iput-object p2, p0, Lck1/n;->b:Ljava/lang/String;

    iput p3, p0, Lck1/n;->c:I

    iput-object p4, p0, Lck1/n;->d:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lck1/n;->e:Lcom/whoop/design/util/TextResource;

    iput-object p6, p0, Lck1/n;->f:Lhy0/b2;

    iput-object p7, p0, Lck1/n;->g:Lny0/p0;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lck1/n;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lck1/n;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lck1/n;->c:I

    return v0
.end method

.method public final d()Lny0/p0;
    .locals 1

    iget-object v0, p0, Lck1/n;->g:Lny0/p0;

    return-object v0
.end method

.method public final e()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lck1/n;->d:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lck1/n;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lck1/n;

    iget-object v1, p0, Lck1/n;->a:Ljava/lang/String;

    iget-object v3, p1, Lck1/n;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lck1/n;->b:Ljava/lang/String;

    iget-object v3, p1, Lck1/n;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lck1/n;->c:I

    iget v3, p1, Lck1/n;->c:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lck1/n;->d:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lck1/n;->d:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lck1/n;->e:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lck1/n;->e:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lck1/n;->f:Lhy0/b2;

    iget-object v3, p1, Lck1/n;->f:Lhy0/b2;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lck1/n;->g:Lny0/p0;

    iget-object p1, p1, Lck1/n;->g:Lny0/p0;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final f()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lck1/n;->e:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final g()Lhy0/b2;
    .locals 1

    iget-object v0, p0, Lck1/n;->f:Lhy0/b2;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lck1/n;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lck1/n;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lck1/n;->c:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lck1/n;->d:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lck1/n;->e:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lck1/n;->f:Lhy0/b2;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lck1/n;->g:Lny0/p0;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lny0/p0;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lck1/n;->a:Ljava/lang/String;

    iget-object v1, p0, Lck1/n;->b:Ljava/lang/String;

    iget v2, p0, Lck1/n;->c:I

    iget-object v3, p0, Lck1/n;->d:Lcom/whoop/design/util/TextResource;

    iget-object v4, p0, Lck1/n;->e:Lcom/whoop/design/util/TextResource;

    iget-object v5, p0, Lck1/n;->f:Lhy0/b2;

    iget-object v6, p0, Lck1/n;->g:Lny0/p0;

    const-string v7, ", disclaimer="

    const-string v8, ", icon="

    const-string v9, "KeyMetricDialogViewState(description="

    invoke-static {v9, v0, v7, v1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", trendSubTitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", trendTitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", trendType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", secondaryButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
