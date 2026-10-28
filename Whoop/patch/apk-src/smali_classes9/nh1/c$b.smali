.class public final Lnh1/c$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnh1/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0087\u0008\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u0018\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0019\u001a\u0004\u0008\u001b\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0019\u001a\u0004\u0008\u0014\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Lnh1/c$b;",
        "",
        "Lsz0/q0;",
        "state",
        "Lnh1/a;",
        "primaryClickEvent",
        "secondaryClickEvent",
        "backClickEvent",
        "<init>",
        "(Lsz0/q0;Lnh1/a;Lnh1/a;Lnh1/a;)V",
        "",
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
        "Lsz0/q0;",
        "d",
        "()Lsz0/q0;",
        "b",
        "Lnh1/a;",
        "()Lnh1/a;",
        "c",
        "gifting_release"
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
.field private final a:Lsz0/q0;

.field private final b:Lnh1/a;

.field private final c:Lnh1/a;

.field private final d:Lnh1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lsz0/q0;->k:I

    sput v0, Lnh1/c$b;->e:I

    return-void
.end method

.method public constructor <init>(Lsz0/q0;Lnh1/a;Lnh1/a;Lnh1/a;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lnh1/c$b;->a:Lsz0/q0;

    .line 3
    iput-object p2, p0, Lnh1/c$b;->b:Lnh1/a;

    .line 4
    iput-object p3, p0, Lnh1/c$b;->c:Lnh1/a;

    .line 5
    iput-object p4, p0, Lnh1/c$b;->d:Lnh1/a;

    return-void
.end method

.method public synthetic constructor <init>(Lsz0/q0;Lnh1/a;Lnh1/a;Lnh1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move-object p4, v0

    .line 6
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lnh1/c$b;-><init>(Lsz0/q0;Lnh1/a;Lnh1/a;Lnh1/a;)V

    return-void
.end method


# virtual methods
.method public final a()Lnh1/a;
    .locals 1

    iget-object v0, p0, Lnh1/c$b;->d:Lnh1/a;

    return-object v0
.end method

.method public final b()Lnh1/a;
    .locals 1

    iget-object v0, p0, Lnh1/c$b;->b:Lnh1/a;

    return-object v0
.end method

.method public final c()Lnh1/a;
    .locals 1

    iget-object v0, p0, Lnh1/c$b;->c:Lnh1/a;

    return-object v0
.end method

.method public final d()Lsz0/q0;
    .locals 1

    iget-object v0, p0, Lnh1/c$b;->a:Lsz0/q0;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lnh1/c$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lnh1/c$b;

    iget-object v1, p0, Lnh1/c$b;->a:Lsz0/q0;

    iget-object v3, p1, Lnh1/c$b;->a:Lsz0/q0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lnh1/c$b;->b:Lnh1/a;

    iget-object v3, p1, Lnh1/c$b;->b:Lnh1/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lnh1/c$b;->c:Lnh1/a;

    iget-object v3, p1, Lnh1/c$b;->c:Lnh1/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lnh1/c$b;->d:Lnh1/a;

    iget-object p1, p1, Lnh1/c$b;->d:Lnh1/a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lnh1/c$b;->a:Lsz0/q0;

    invoke-virtual {v0}, Lsz0/q0;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnh1/c$b;->b:Lnh1/a;

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

    iget-object v1, p0, Lnh1/c$b;->c:Lnh1/a;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnh1/c$b;->d:Lnh1/a;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lnh1/c$b;->a:Lsz0/q0;

    iget-object v1, p0, Lnh1/c$b;->b:Lnh1/a;

    iget-object v2, p0, Lnh1/c$b;->c:Lnh1/a;

    iget-object v3, p0, Lnh1/c$b;->d:Lnh1/a;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "FullScreenModal(state="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", primaryClickEvent="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", secondaryClickEvent="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", backClickEvent="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
