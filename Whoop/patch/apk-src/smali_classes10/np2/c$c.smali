.class public final Lnp2/c$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnp2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0014\u0008\u0087\u0008\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00082\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001a\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001b\u001a\u0004\u0008\u001d\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u001b\u001a\u0004\u0008\u0016\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!R\u0017\u0010\n\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010\"\u001a\u0004\u0008\u001e\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lnp2/c$c;",
        "",
        "Lsz0/q0;",
        "state",
        "Lnp2/a;",
        "primaryClickEvent",
        "secondaryClickEvent",
        "backClickEvent",
        "",
        "isFormSubmissionLoading",
        "isCustomSubmissionError",
        "<init>",
        "(Lsz0/q0;Lnp2/a;Lnp2/a;Lnp2/a;Ljava/lang/Boolean;Z)V",
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
        "Lsz0/q0;",
        "d",
        "()Lsz0/q0;",
        "b",
        "Lnp2/a;",
        "()Lnp2/a;",
        "c",
        "e",
        "Ljava/lang/Boolean;",
        "f",
        "()Ljava/lang/Boolean;",
        "Z",
        "()Z",
        "universal-checkout_release"
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
.field private final a:Lsz0/q0;

.field private final b:Lnp2/a;

.field private final c:Lnp2/a;

.field private final d:Lnp2/a;

.field private final e:Ljava/lang/Boolean;

.field private final f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lsz0/q0;->k:I

    sput v0, Lnp2/c$c;->g:I

    return-void
.end method

.method public constructor <init>(Lsz0/q0;Lnp2/a;Lnp2/a;Lnp2/a;Ljava/lang/Boolean;Z)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lnp2/c$c;->a:Lsz0/q0;

    .line 3
    iput-object p2, p0, Lnp2/c$c;->b:Lnp2/a;

    .line 4
    iput-object p3, p0, Lnp2/c$c;->c:Lnp2/a;

    .line 5
    iput-object p4, p0, Lnp2/c$c;->d:Lnp2/a;

    .line 6
    iput-object p5, p0, Lnp2/c$c;->e:Ljava/lang/Boolean;

    .line 7
    iput-boolean p6, p0, Lnp2/c$c;->f:Z

    return-void
.end method

.method public synthetic constructor <init>(Lsz0/q0;Lnp2/a;Lnp2/a;Lnp2/a;Ljava/lang/Boolean;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p7, 0x2

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_2

    move-object p4, v0

    :cond_2
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_3

    move-object p5, v0

    :cond_3
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_4

    const/4 p6, 0x0

    :cond_4
    move p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 8
    invoke-direct/range {p1 .. p7}, Lnp2/c$c;-><init>(Lsz0/q0;Lnp2/a;Lnp2/a;Lnp2/a;Ljava/lang/Boolean;Z)V

    return-void
.end method


# virtual methods
.method public final a()Lnp2/a;
    .locals 1

    iget-object v0, p0, Lnp2/c$c;->d:Lnp2/a;

    return-object v0
.end method

.method public final b()Lnp2/a;
    .locals 1

    iget-object v0, p0, Lnp2/c$c;->b:Lnp2/a;

    return-object v0
.end method

.method public final c()Lnp2/a;
    .locals 1

    iget-object v0, p0, Lnp2/c$c;->c:Lnp2/a;

    return-object v0
.end method

.method public final d()Lsz0/q0;
    .locals 1

    iget-object v0, p0, Lnp2/c$c;->a:Lsz0/q0;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lnp2/c$c;->f:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lnp2/c$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lnp2/c$c;

    iget-object v1, p0, Lnp2/c$c;->a:Lsz0/q0;

    iget-object v3, p1, Lnp2/c$c;->a:Lsz0/q0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lnp2/c$c;->b:Lnp2/a;

    iget-object v3, p1, Lnp2/c$c;->b:Lnp2/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lnp2/c$c;->c:Lnp2/a;

    iget-object v3, p1, Lnp2/c$c;->c:Lnp2/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lnp2/c$c;->d:Lnp2/a;

    iget-object v3, p1, Lnp2/c$c;->d:Lnp2/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lnp2/c$c;->e:Ljava/lang/Boolean;

    iget-object v3, p1, Lnp2/c$c;->e:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lnp2/c$c;->f:Z

    iget-boolean p1, p1, Lnp2/c$c;->f:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lnp2/c$c;->e:Ljava/lang/Boolean;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lnp2/c$c;->a:Lsz0/q0;

    invoke-virtual {v0}, Lsz0/q0;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnp2/c$c;->b:Lnp2/a;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnp2/c$c;->c:Lnp2/a;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnp2/c$c;->d:Lnp2/a;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnp2/c$c;->e:Ljava/lang/Boolean;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lnp2/c$c;->f:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lnp2/c$c;->a:Lsz0/q0;

    iget-object v1, p0, Lnp2/c$c;->b:Lnp2/a;

    iget-object v2, p0, Lnp2/c$c;->c:Lnp2/a;

    iget-object v3, p0, Lnp2/c$c;->d:Lnp2/a;

    iget-object v4, p0, Lnp2/c$c;->e:Ljava/lang/Boolean;

    iget-boolean v5, p0, Lnp2/c$c;->f:Z

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "FullScreenModal(state="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", primaryClickEvent="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", secondaryClickEvent="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", backClickEvent="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isFormSubmissionLoading="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isCustomSubmissionError="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
