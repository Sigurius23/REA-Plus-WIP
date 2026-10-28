.class public final Ljx1/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000c\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001b\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001c\u001a\u0004\u0008\u001f\u0010\u001dR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\u0018\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010#\u001a\u0004\u0008\u001e\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010#\u001a\u0004\u0008 \u0010$R\u0017\u0010\u000c\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008%\u0010\u0019\u001a\u0004\u0008%\u0010\u0010\u00a8\u0006&"
    }
    d2 = {
        "Ljx1/j;",
        "",
        "",
        "title",
        "Lkd1/o;",
        "fromMembership",
        "toMembership",
        "Ljx1/h;",
        "daysLeft",
        "Ljx1/g;",
        "primaryCta",
        "secondaryCta",
        "trackingTier",
        "<init>",
        "(Ljava/lang/String;Lkd1/o;Lkd1/o;Ljx1/h;Ljx1/g;Ljx1/g;Ljava/lang/String;)V",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Ljava/lang/String;",
        "e",
        "b",
        "Lkd1/o;",
        "()Lkd1/o;",
        "c",
        "f",
        "d",
        "Ljx1/h;",
        "()Ljx1/h;",
        "Ljx1/g;",
        "()Ljx1/g;",
        "g",
        "membership_release"
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

.field private final b:Lkd1/o;

.field private final c:Lkd1/o;

.field private final d:Ljx1/h;

.field private final e:Ljx1/g;

.field private final f:Ljx1/g;

.field private final g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Lcom/whoop/navigation/e;->d:I

    sget v1, Lkd1/o;->a:I

    or-int/2addr v0, v1

    or-int/2addr v0, v1

    sput v0, Ljx1/j;->h:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lkd1/o;Lkd1/o;Ljx1/h;Ljx1/g;Ljx1/g;Ljava/lang/String;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fromMembership"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "toMembership"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primaryCta"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackingTier"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljx1/j;->a:Ljava/lang/String;

    iput-object p2, p0, Ljx1/j;->b:Lkd1/o;

    iput-object p3, p0, Ljx1/j;->c:Lkd1/o;

    iput-object p4, p0, Ljx1/j;->d:Ljx1/h;

    iput-object p5, p0, Ljx1/j;->e:Ljx1/g;

    iput-object p6, p0, Ljx1/j;->f:Ljx1/g;

    iput-object p7, p0, Ljx1/j;->g:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ljx1/h;
    .locals 1

    iget-object v0, p0, Ljx1/j;->d:Ljx1/h;

    return-object v0
.end method

.method public final b()Lkd1/o;
    .locals 1

    iget-object v0, p0, Ljx1/j;->b:Lkd1/o;

    return-object v0
.end method

.method public final c()Ljx1/g;
    .locals 1

    iget-object v0, p0, Ljx1/j;->e:Ljx1/g;

    return-object v0
.end method

.method public final d()Ljx1/g;
    .locals 1

    iget-object v0, p0, Ljx1/j;->f:Ljx1/g;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ljx1/j;->a:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ljx1/j;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ljx1/j;

    iget-object v1, p0, Ljx1/j;->a:Ljava/lang/String;

    iget-object v3, p1, Ljx1/j;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ljx1/j;->b:Lkd1/o;

    iget-object v3, p1, Ljx1/j;->b:Lkd1/o;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ljx1/j;->c:Lkd1/o;

    iget-object v3, p1, Ljx1/j;->c:Lkd1/o;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ljx1/j;->d:Ljx1/h;

    iget-object v3, p1, Ljx1/j;->d:Ljx1/h;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Ljx1/j;->e:Ljx1/g;

    iget-object v3, p1, Ljx1/j;->e:Ljx1/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Ljx1/j;->f:Ljx1/g;

    iget-object v3, p1, Ljx1/j;->f:Ljx1/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Ljx1/j;->g:Ljava/lang/String;

    iget-object p1, p1, Ljx1/j;->g:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final f()Lkd1/o;
    .locals 1

    iget-object v0, p0, Ljx1/j;->c:Lkd1/o;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ljx1/j;->g:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Ljx1/j;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Ljx1/j;->b:Lkd1/o;

    invoke-static {v2, v0, v1}, Lq63/c;->c(Lkd1/o;II)I

    move-result v0

    iget-object v2, p0, Ljx1/j;->c:Lkd1/o;

    invoke-static {v2, v0, v1}, Lq63/c;->c(Lkd1/o;II)I

    move-result v0

    iget-object v2, p0, Ljx1/j;->d:Ljx1/h;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljx1/h;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Ljx1/j;->e:Ljx1/g;

    invoke-virtual {v2}, Ljx1/g;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Ljx1/j;->f:Ljx1/g;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljx1/g;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v2, v3

    mul-int/2addr v2, v1

    iget-object v0, p0, Ljx1/j;->g:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Ljx1/j;->a:Ljava/lang/String;

    iget-object v1, p0, Ljx1/j;->b:Lkd1/o;

    iget-object v2, p0, Ljx1/j;->c:Lkd1/o;

    iget-object v3, p0, Ljx1/j;->d:Ljx1/h;

    iget-object v4, p0, Ljx1/j;->e:Ljx1/g;

    iget-object v5, p0, Ljx1/j;->f:Ljx1/g;

    iget-object v6, p0, Ljx1/j;->g:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "DowngradingInfoViewState(title="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", fromMembership="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", toMembership="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", daysLeft="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", primaryCta="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", secondaryCta="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", trackingTier="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v6, v0, v7}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
