.class public final Lzu2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzu2/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0015B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ0\u0010\n\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u000c\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lzu2/c;",
        "",
        "",
        "name",
        "Lzu2/f;",
        "nameValidity",
        "Lzu2/a;",
        "currentFocusState",
        "<init>",
        "(Ljava/lang/String;Lzu2/f;Lzu2/a;)V",
        "b",
        "(Ljava/lang/String;Lzu2/f;Lzu2/a;)Lzu2/c;",
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
        "Lzu2/f;",
        "f",
        "()Lzu2/f;",
        "c",
        "Lzu2/a;",
        "d",
        "()Lzu2/a;",
        "weightlifting_release"
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
.field public static final d:Lzu2/c$a;

.field public static final e:I

.field private static final f:Lzu2/c;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lzu2/f;

.field private final c:Lzu2/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lzu2/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lzu2/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lzu2/c;->d:Lzu2/c$a;

    const/16 v0, 0x8

    sput v0, Lzu2/c;->e:I

    new-instance v0, Lzu2/c;

    const-string v2, ""

    sget-object v3, Lzu2/f;->Blank:Lzu2/f;

    invoke-direct {v0, v2, v3, v1}, Lzu2/c;-><init>(Ljava/lang/String;Lzu2/f;Lzu2/a;)V

    sput-object v0, Lzu2/c;->f:Lzu2/c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lzu2/f;Lzu2/a;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameValidity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzu2/c;->a:Ljava/lang/String;

    iput-object p2, p0, Lzu2/c;->b:Lzu2/f;

    iput-object p3, p0, Lzu2/c;->c:Lzu2/a;

    return-void
.end method

.method public static final synthetic a()Lzu2/c;
    .locals 1

    sget-object v0, Lzu2/c;->f:Lzu2/c;

    return-object v0
.end method

.method public static synthetic c(Lzu2/c;Ljava/lang/String;Lzu2/f;Lzu2/a;ILjava/lang/Object;)Lzu2/c;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lzu2/c;->a:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lzu2/c;->b:Lzu2/f;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lzu2/c;->c:Lzu2/a;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lzu2/c;->b(Ljava/lang/String;Lzu2/f;Lzu2/a;)Lzu2/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/String;Lzu2/f;Lzu2/a;)Lzu2/c;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameValidity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lzu2/c;

    invoke-direct {v0, p1, p2, p3}, Lzu2/c;-><init>(Ljava/lang/String;Lzu2/f;Lzu2/a;)V

    return-object v0
.end method

.method public final d()Lzu2/a;
    .locals 1

    iget-object v0, p0, Lzu2/c;->c:Lzu2/a;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzu2/c;->a:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lzu2/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lzu2/c;

    iget-object v1, p0, Lzu2/c;->a:Ljava/lang/String;

    iget-object v3, p1, Lzu2/c;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lzu2/c;->b:Lzu2/f;

    iget-object v3, p1, Lzu2/c;->b:Lzu2/f;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lzu2/c;->c:Lzu2/a;

    iget-object p1, p1, Lzu2/c;->c:Lzu2/a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final f()Lzu2/f;
    .locals 1

    iget-object v0, p0, Lzu2/c;->b:Lzu2/f;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lzu2/c;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lzu2/c;->b:Lzu2/f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lzu2/c;->c:Lzu2/a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lzu2/c;->a:Ljava/lang/String;

    iget-object v1, p0, Lzu2/c;->b:Lzu2/f;

    iget-object v2, p0, Lzu2/c;->c:Lzu2/a;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "InputWorkoutNameDomainState(name="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", nameValidity="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", currentFocusState="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
