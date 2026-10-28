.class public final Lik2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0017\u0008\u0087\u0008\u0018\u00002\u00020\u0001BO\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001f\u001a\u0004\u0008 \u0010!R\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u001f\u001a\u0004\u0008#\u0010!R\u0017\u0010\t\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010\u001f\u001a\u0004\u0008\u0017\u0010!R\u0017\u0010\n\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001f\u001a\u0004\u0008\u001b\u0010!R\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008\"\u0010\u0013\u00a8\u0006&"
    }
    d2 = {
        "Lik2/a;",
        "",
        "",
        "display",
        "Lkd1/o;",
        "imageUrl",
        "Lcom/whoop/design/util/TextResource;",
        "contentDescription",
        "headerTitle",
        "bodyText",
        "buttonText",
        "",
        "featureId",
        "<init>",
        "(ZLkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;I)V",
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
        "Lkd1/o;",
        "f",
        "()Lkd1/o;",
        "Lcom/whoop/design/util/TextResource;",
        "getContentDescription",
        "()Lcom/whoop/design/util/TextResource;",
        "d",
        "e",
        "g",
        "I",
        "home_release"
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
.field private final a:Z

.field private final b:Lkd1/o;

.field private final c:Lcom/whoop/design/util/TextResource;

.field private final d:Lcom/whoop/design/util/TextResource;

.field private final e:Lcom/whoop/design/util/TextResource;

.field private final f:Lcom/whoop/design/util/TextResource;

.field private final g:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sget v1, Lkd1/o;->a:I

    or-int/2addr v0, v1

    sput v0, Lik2/a;->h:I

    return-void
.end method

.method public constructor <init>(ZLkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;I)V
    .locals 1

    const-string v0, "contentDescription"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headerTitle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bodyText"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buttonText"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lik2/a;->a:Z

    iput-object p2, p0, Lik2/a;->b:Lkd1/o;

    iput-object p3, p0, Lik2/a;->c:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lik2/a;->d:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lik2/a;->e:Lcom/whoop/design/util/TextResource;

    iput-object p6, p0, Lik2/a;->f:Lcom/whoop/design/util/TextResource;

    iput p7, p0, Lik2/a;->g:I

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lik2/a;->e:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final b()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lik2/a;->f:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lik2/a;->a:Z

    return v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lik2/a;->g:I

    return v0
.end method

.method public final e()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lik2/a;->d:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lik2/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lik2/a;

    iget-boolean v1, p0, Lik2/a;->a:Z

    iget-boolean v3, p1, Lik2/a;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lik2/a;->b:Lkd1/o;

    iget-object v3, p1, Lik2/a;->b:Lkd1/o;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lik2/a;->c:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lik2/a;->c:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lik2/a;->d:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lik2/a;->d:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lik2/a;->e:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lik2/a;->e:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lik2/a;->f:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lik2/a;->f:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lik2/a;->g:I

    iget p1, p1, Lik2/a;->g:I

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final f()Lkd1/o;
    .locals 1

    iget-object v0, p0, Lik2/a;->b:Lkd1/o;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lik2/a;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lik2/a;->b:Lkd1/o;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lik2/a;->c:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lik2/a;->d:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lik2/a;->e:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lik2/a;->f:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget v1, p0, Lik2/a;->g:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-boolean v0, p0, Lik2/a;->a:Z

    iget-object v1, p0, Lik2/a;->b:Lkd1/o;

    iget-object v2, p0, Lik2/a;->c:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lik2/a;->d:Lcom/whoop/design/util/TextResource;

    iget-object v4, p0, Lik2/a;->e:Lcom/whoop/design/util/TextResource;

    iget-object v5, p0, Lik2/a;->f:Lcom/whoop/design/util/TextResource;

    iget v6, p0, Lik2/a;->g:I

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "DayOneTransitionOverlayViewState(display="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", imageUrl="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", contentDescription="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", headerTitle="

    const-string v1, ", bodyText="

    invoke-static {v7, v2, v0, v3, v1}, Lq63/c;->y(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    const-string v0, ", buttonText="

    const-string v1, ", featureId="

    invoke-static {v7, v4, v0, v5, v1}, Lq63/c;->y(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    const-string v0, ")"

    invoke-static {v7, v6, v0}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
