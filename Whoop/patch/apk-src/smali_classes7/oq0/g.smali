.class public final Loq0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u001d\u0008\u0087\u0008\u0018\u00002\u00020\u0001BG\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0003\u0010\n\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJP\u0010\r\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0003\u0010\n\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010 \u001a\u0004\u0008!\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001d\u001a\u0004\u0008\"\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010 \u001a\u0004\u0008\u001c\u0010\u0012\u00a8\u0006#"
    }
    d2 = {
        "Loq0/g;",
        "",
        "",
        "progressVisible",
        "",
        "inviteCode",
        "",
        "inviteCodeErrorTextId",
        "inviteCodeErrorVisibility",
        "inviteCodeSelection",
        "backgroundResId",
        "<init>",
        "(ZLjava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;I)V",
        "a",
        "(ZLjava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;I)Loq0/g;",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Z",
        "getProgressVisible",
        "()Z",
        "b",
        "Ljava/lang/String;",
        "d",
        "c",
        "Ljava/lang/Integer;",
        "e",
        "()Ljava/lang/Integer;",
        "I",
        "f",
        "g",
        "community_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Z

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/Integer;

.field private final d:I

.field private final e:Ljava/lang/Integer;

.field private final f:I


# direct methods
.method public constructor <init>(ZLjava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;I)V
    .locals 1

    const-string v0, "inviteCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Loq0/g;->a:Z

    .line 3
    iput-object p2, p0, Loq0/g;->b:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Loq0/g;->c:Ljava/lang/Integer;

    .line 5
    iput p4, p0, Loq0/g;->d:I

    .line 6
    iput-object p5, p0, Loq0/g;->e:Ljava/lang/Integer;

    .line 7
    iput p6, p0, Loq0/g;->f:I

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    .line 8
    const-string p2, ""

    :cond_1
    and-int/lit8 p8, p7, 0x4

    const/4 v0, 0x0

    if-eqz p8, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    const/16 p4, 0x8

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    .line 9
    sget p6, Lvu1/a;->a:I

    :cond_5
    move-object p7, p5

    move p8, p6

    move-object p5, p3

    move p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    .line 10
    invoke-direct/range {p2 .. p8}, Loq0/g;-><init>(ZLjava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;I)V

    return-void
.end method

.method public static synthetic b(Loq0/g;ZLjava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;IILjava/lang/Object;)Loq0/g;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-boolean p1, p0, Loq0/g;->a:Z

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Loq0/g;->b:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Loq0/g;->c:Ljava/lang/Integer;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget p4, p0, Loq0/g;->d:I

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Loq0/g;->e:Ljava/lang/Integer;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget p6, p0, Loq0/g;->f:I

    :cond_5
    move-object p7, p5

    move p8, p6

    move-object p5, p3

    move p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Loq0/g;->a(ZLjava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;I)Loq0/g;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(ZLjava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;I)Loq0/g;
    .locals 8

    const-string v0, "inviteCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Loq0/g;

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Loq0/g;-><init>(ZLjava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;I)V

    return-object v1
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Loq0/g;->f:I

    return v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Loq0/g;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Loq0/g;->c:Ljava/lang/Integer;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Loq0/g;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Loq0/g;

    iget-boolean v1, p0, Loq0/g;->a:Z

    iget-boolean v3, p1, Loq0/g;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Loq0/g;->b:Ljava/lang/String;

    iget-object v3, p1, Loq0/g;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Loq0/g;->c:Ljava/lang/Integer;

    iget-object v3, p1, Loq0/g;->c:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Loq0/g;->d:I

    iget v3, p1, Loq0/g;->d:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Loq0/g;->e:Ljava/lang/Integer;

    iget-object v3, p1, Loq0/g;->e:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Loq0/g;->f:I

    iget p1, p1, Loq0/g;->f:I

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Loq0/g;->d:I

    return v0
.end method

.method public final g()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Loq0/g;->e:Ljava/lang/Integer;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Loq0/g;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Loq0/g;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Loq0/g;->c:Ljava/lang/Integer;

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

    iget v2, p0, Loq0/g;->d:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Loq0/g;->e:Ljava/lang/Integer;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget v1, p0, Loq0/g;->f:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-boolean v0, p0, Loq0/g;->a:Z

    iget-object v1, p0, Loq0/g;->b:Ljava/lang/String;

    iget-object v2, p0, Loq0/g;->c:Ljava/lang/Integer;

    iget v3, p0, Loq0/g;->d:I

    iget-object v4, p0, Loq0/g;->e:Ljava/lang/Integer;

    iget v5, p0, Loq0/g;->f:I

    const-string v6, ", inviteCode="

    const-string v7, ", inviteCodeErrorTextId="

    const-string v8, "InviteCodeViewState(progressVisible="

    invoke-static {v8, v6, v1, v7, v0}, Lev/n;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", inviteCodeErrorVisibility="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", inviteCodeSelection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", backgroundResId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
