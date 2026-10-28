.class public final Lwf1/c$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwf1/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000c\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001a\u001a\u0004\u0008\u001d\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001a\u001a\u0004\u0008\u0015\u0010\u001cR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u001a\u001a\u0004\u0008\u0019\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Lwf1/c$c;",
        "",
        "Lsz0/q0;",
        "state",
        "Lwf1/a;",
        "primaryClickEvent",
        "secondaryClickEvent",
        "backClickEvent",
        "followUpEvent",
        "<init>",
        "(Lsz0/q0;Lwf1/a;Lwf1/a;Lwf1/a;Lwf1/a;)V",
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
        "e",
        "()Lsz0/q0;",
        "b",
        "Lwf1/a;",
        "c",
        "()Lwf1/a;",
        "d",
        "feedback-survey_release"
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
.field public static final f:I


# instance fields
.field private final a:Lsz0/q0;

.field private final b:Lwf1/a;

.field private final c:Lwf1/a;

.field private final d:Lwf1/a;

.field private final e:Lwf1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lsz0/q0;->k:I

    sput v0, Lwf1/c$c;->f:I

    return-void
.end method

.method public constructor <init>(Lsz0/q0;Lwf1/a;Lwf1/a;Lwf1/a;Lwf1/a;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lwf1/c$c;->a:Lsz0/q0;

    .line 3
    iput-object p2, p0, Lwf1/c$c;->b:Lwf1/a;

    .line 4
    iput-object p3, p0, Lwf1/c$c;->c:Lwf1/a;

    .line 5
    iput-object p4, p0, Lwf1/c$c;->d:Lwf1/a;

    .line 6
    iput-object p5, p0, Lwf1/c$c;->e:Lwf1/a;

    return-void
.end method

.method public synthetic constructor <init>(Lsz0/q0;Lwf1/a;Lwf1/a;Lwf1/a;Lwf1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_2

    move-object p4, v0

    :cond_2
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_3

    move-object p6, v0

    :goto_0
    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_3
    move-object p6, p5

    goto :goto_0

    .line 7
    :goto_1
    invoke-direct/range {p1 .. p6}, Lwf1/c$c;-><init>(Lsz0/q0;Lwf1/a;Lwf1/a;Lwf1/a;Lwf1/a;)V

    return-void
.end method


# virtual methods
.method public final a()Lwf1/a;
    .locals 1

    iget-object v0, p0, Lwf1/c$c;->d:Lwf1/a;

    return-object v0
.end method

.method public final b()Lwf1/a;
    .locals 1

    iget-object v0, p0, Lwf1/c$c;->e:Lwf1/a;

    return-object v0
.end method

.method public final c()Lwf1/a;
    .locals 1

    iget-object v0, p0, Lwf1/c$c;->b:Lwf1/a;

    return-object v0
.end method

.method public final d()Lwf1/a;
    .locals 1

    iget-object v0, p0, Lwf1/c$c;->c:Lwf1/a;

    return-object v0
.end method

.method public final e()Lsz0/q0;
    .locals 1

    iget-object v0, p0, Lwf1/c$c;->a:Lsz0/q0;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lwf1/c$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lwf1/c$c;

    iget-object v1, p0, Lwf1/c$c;->a:Lsz0/q0;

    iget-object v3, p1, Lwf1/c$c;->a:Lsz0/q0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lwf1/c$c;->b:Lwf1/a;

    iget-object v3, p1, Lwf1/c$c;->b:Lwf1/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lwf1/c$c;->c:Lwf1/a;

    iget-object v3, p1, Lwf1/c$c;->c:Lwf1/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lwf1/c$c;->d:Lwf1/a;

    iget-object v3, p1, Lwf1/c$c;->d:Lwf1/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lwf1/c$c;->e:Lwf1/a;

    iget-object p1, p1, Lwf1/c$c;->e:Lwf1/a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lwf1/c$c;->a:Lsz0/q0;

    invoke-virtual {v0}, Lsz0/q0;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lwf1/c$c;->b:Lwf1/a;

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

    iget-object v1, p0, Lwf1/c$c;->c:Lwf1/a;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lwf1/c$c;->d:Lwf1/a;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lwf1/c$c;->e:Lwf1/a;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lwf1/c$c;->a:Lsz0/q0;

    iget-object v1, p0, Lwf1/c$c;->b:Lwf1/a;

    iget-object v2, p0, Lwf1/c$c;->c:Lwf1/a;

    iget-object v3, p0, Lwf1/c$c;->d:Lwf1/a;

    iget-object v4, p0, Lwf1/c$c;->e:Lwf1/a;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "FullScreenModal(state="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", primaryClickEvent="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", secondaryClickEvent="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", backClickEvent="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", followUpEvent="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
