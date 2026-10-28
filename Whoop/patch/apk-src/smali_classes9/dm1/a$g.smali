.class public final Ldm1/a$g;
.super Ldm1/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldm1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001c\u001a\u0004\u0008\u0015\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Ldm1/a$g;",
        "Ldm1/a;",
        "La11/b;",
        "connectivityNavType",
        "Lfm1/g;",
        "sourcePillar",
        "Lb11/h;",
        "connectivityIndicatorState",
        "<init>",
        "(La11/b;Lfm1/g;Lb11/h;)V",
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
        "La11/b;",
        "b",
        "()La11/b;",
        "Lfm1/g;",
        "c",
        "()Lfm1/g;",
        "Lb11/h;",
        "()Lb11/h;",
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
.field public static final d:I


# instance fields
.field private final a:La11/b;

.field private final b:Lfm1/g;

.field private final c:Lb11/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lb11/h;->e:I

    sput v0, Ldm1/a$g;->d:I

    return-void
.end method

.method public constructor <init>(La11/b;Lfm1/g;Lb11/h;)V
    .locals 1

    const-string v0, "connectivityNavType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Ldm1/a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2
    iput-object p1, p0, Ldm1/a$g;->a:La11/b;

    .line 3
    iput-object p2, p0, Ldm1/a$g;->b:Lfm1/g;

    .line 4
    iput-object p3, p0, Ldm1/a$g;->c:Lb11/h;

    return-void
.end method

.method public synthetic constructor <init>(La11/b;Lfm1/g;Lb11/h;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    .line 5
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Ldm1/a$g;-><init>(La11/b;Lfm1/g;Lb11/h;)V

    return-void
.end method


# virtual methods
.method public final a()Lb11/h;
    .locals 1

    iget-object v0, p0, Ldm1/a$g;->c:Lb11/h;

    return-object v0
.end method

.method public final b()La11/b;
    .locals 1

    iget-object v0, p0, Ldm1/a$g;->a:La11/b;

    return-object v0
.end method

.method public final c()Lfm1/g;
    .locals 1

    iget-object v0, p0, Ldm1/a$g;->b:Lfm1/g;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ldm1/a$g;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ldm1/a$g;

    iget-object v1, p0, Ldm1/a$g;->a:La11/b;

    iget-object v3, p1, Ldm1/a$g;->a:La11/b;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ldm1/a$g;->b:Lfm1/g;

    iget-object v3, p1, Ldm1/a$g;->b:Lfm1/g;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ldm1/a$g;->c:Lb11/h;

    iget-object p1, p1, Ldm1/a$g;->c:Lb11/h;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Ldm1/a$g;->a:La11/b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ldm1/a$g;->b:Lfm1/g;

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

    iget-object v1, p0, Ldm1/a$g;->c:Lb11/h;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lb11/h;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Ldm1/a$g;->a:La11/b;

    iget-object v1, p0, Ldm1/a$g;->b:Lfm1/g;

    iget-object v2, p0, Ldm1/a$g;->c:Lb11/h;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "ConnectivityEvent(connectivityNavType="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sourcePillar="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", connectivityIndicatorState="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
