.class public final Lsy0/k$a;
.super Lsy0/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsy0/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u00002\u00020\u0001B3\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00082\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u0016\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\u001d\u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Lsy0/k$a;",
        "Lsy0/k;",
        "Li2/x;",
        "linkColor",
        "Lb91/a;",
        "textStyle",
        "Lb2/f;",
        "horizontalAlignment",
        "",
        "trimStartGutter",
        "<init>",
        "(Li2/x;Lb91/a;Lb2/f;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "b",
        "Li2/x;",
        "c",
        "()Li2/x;",
        "Lb91/a;",
        "getTextStyle",
        "()Lb91/a;",
        "d",
        "Lb2/f;",
        "()Lb2/f;",
        "e",
        "Z",
        "()Z",
        "design_release"
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
.field private final b:Li2/x;

.field private final c:Lb91/a;

.field private final d:Lb2/f;

.field private final e:Z


# direct methods
.method private constructor <init>(Li2/x;Lb91/a;Lb2/f;Z)V
    .locals 1

    const-string v0, "textStyle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p2, v0}, Lsy0/k;-><init>(Lb91/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object p1, p0, Lsy0/k$a;->b:Li2/x;

    .line 4
    iput-object p2, p0, Lsy0/k$a;->c:Lb91/a;

    .line 5
    iput-object p3, p0, Lsy0/k$a;->d:Lb2/f;

    .line 6
    iput-boolean p4, p0, Lsy0/k$a;->e:Z

    return-void
.end method

.method public synthetic constructor <init>(Li2/x;Lb91/a;Lb2/f;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object v2, v0

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 p1, p5, 0x2

    if-eqz p1, :cond_1

    .line 7
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->a()Lb91/a;

    move-result-object p2

    :cond_1
    move-object v3, p2

    and-int/lit8 p1, p5, 0x4

    if-eqz p1, :cond_2

    move-object v4, v0

    goto :goto_1

    :cond_2
    move-object v4, p3

    :goto_1
    and-int/lit8 p1, p5, 0x8

    if-eqz p1, :cond_3

    const/4 p4, 0x0

    :cond_3
    move v5, p4

    const/4 v6, 0x0

    move-object v1, p0

    .line 8
    invoke-direct/range {v1 .. v6}, Lsy0/k$a;-><init>(Li2/x;Lb91/a;Lb2/f;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Li2/x;Lb91/a;Lb2/f;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lsy0/k$a;-><init>(Li2/x;Lb91/a;Lb2/f;Z)V

    return-void
.end method


# virtual methods
.method public final b()Lb2/f;
    .locals 1

    iget-object v0, p0, Lsy0/k$a;->d:Lb2/f;

    return-object v0
.end method

.method public final c()Li2/x;
    .locals 1

    iget-object v0, p0, Lsy0/k$a;->b:Li2/x;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lsy0/k$a;->e:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lsy0/k$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lsy0/k$a;

    iget-object v1, p0, Lsy0/k$a;->b:Li2/x;

    iget-object v3, p1, Lsy0/k$a;->b:Li2/x;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lsy0/k$a;->c:Lb91/a;

    iget-object v3, p1, Lsy0/k$a;->c:Lb91/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lsy0/k$a;->d:Lb2/f;

    iget-object v3, p1, Lsy0/k$a;->d:Lb2/f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lsy0/k$a;->e:Z

    iget-boolean p1, p1, Lsy0/k$a;->e:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lsy0/k$a;->b:Li2/x;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    iget-wide v2, v0, Li2/x;->a:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lsy0/k$a;->c:Lb91/a;

    invoke-static {v3, v0, v2}, Ldc/b;->c(Lb91/a;II)I

    move-result v0

    iget-object v3, p0, Lsy0/k$a;->d:Lb2/f;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-boolean v1, p0, Lsy0/k$a;->e:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lsy0/k$a;->b:Li2/x;

    iget-object v1, p0, Lsy0/k$a;->c:Lb91/a;

    iget-object v2, p0, Lsy0/k$a;->d:Lb2/f;

    iget-boolean v3, p0, Lsy0/k$a;->e:Z

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "MarkdownCheckbox(linkColor="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", textStyle="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", horizontalAlignment="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", trimStartGutter="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
