.class public final Ltx0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u00002\u00020\u0001B3\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000c\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0015\u001a\u0004\u0008\u0019\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u001a\u001a\u0004\u0008\u0018\u0010\u001bR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001c\u001a\u0004\u0008\u0014\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Ltx0/g;",
        "",
        "",
        "isOverrideEnabled",
        "isSelectLottieSheetVisible",
        "Lgv1/o;",
        "lottieSource",
        "Li51/h;",
        "celebrationMediaSource",
        "<init>",
        "(ZZLgv1/o;Li51/h;)V",
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
        "c",
        "()Z",
        "b",
        "d",
        "Lgv1/o;",
        "()Lgv1/o;",
        "Li51/h;",
        "()Li51/h;",
        "debug-tools_release"
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

.field private final b:Z

.field private final c:Lgv1/o;

.field private final d:Li51/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Li51/h;->a:I

    sget v1, Lgv1/o;->a:I

    or-int/2addr v0, v1

    sput v0, Ltx0/g;->e:I

    return-void
.end method

.method public constructor <init>(ZZLgv1/o;Li51/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Ltx0/g;->a:Z

    .line 3
    iput-boolean p2, p0, Ltx0/g;->b:Z

    .line 4
    iput-object p3, p0, Ltx0/g;->c:Lgv1/o;

    .line 5
    iput-object p4, p0, Ltx0/g;->d:Li51/h;

    return-void
.end method

.method public synthetic constructor <init>(ZZLgv1/o;Li51/h;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move-object p4, v0

    .line 6
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Ltx0/g;-><init>(ZZLgv1/o;Li51/h;)V

    return-void
.end method


# virtual methods
.method public final a()Li51/h;
    .locals 1

    iget-object v0, p0, Ltx0/g;->d:Li51/h;

    return-object v0
.end method

.method public final b()Lgv1/o;
    .locals 1

    iget-object v0, p0, Ltx0/g;->c:Lgv1/o;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Ltx0/g;->a:Z

    return v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Ltx0/g;->b:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ltx0/g;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ltx0/g;

    iget-boolean v1, p0, Ltx0/g;->a:Z

    iget-boolean v3, p1, Ltx0/g;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Ltx0/g;->b:Z

    iget-boolean v3, p1, Ltx0/g;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ltx0/g;->c:Lgv1/o;

    iget-object v3, p1, Ltx0/g;->c:Lgv1/o;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ltx0/g;->d:Li51/h;

    iget-object p1, p1, Ltx0/g;->d:Li51/h;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Ltx0/g;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Ltx0/g;->b:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Ltx0/g;->c:Lgv1/o;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Ltx0/g;->d:Li51/h;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-boolean v0, p0, Ltx0/g;->a:Z

    iget-boolean v1, p0, Ltx0/g;->b:Z

    iget-object v2, p0, Ltx0/g;->c:Lgv1/o;

    iget-object v3, p0, Ltx0/g;->d:Li51/h;

    const-string v4, ", isSelectLottieSheetVisible="

    const-string v5, ", lottieSource="

    const-string v6, "LottieTesterViewState(isOverrideEnabled="

    invoke-static {v6, v4, v5, v0, v1}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", celebrationMediaSource="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
