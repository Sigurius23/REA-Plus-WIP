.class public final Ljx1/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u00002\u00020\u0001B/\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001e\u001a\u0004\u0008\u001a\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010 \u001a\u0004\u0008\u0016\u0010!\u00a8\u0006\""
    }
    d2 = {
        "Ljx1/e0;",
        "",
        "Ljx1/c0;",
        "membershipManagementScreenViewState",
        "Ljx1/o;",
        "membershipAdjustmentCheckoutScreenViewState",
        "Ljx1/l;",
        "manageMembershipScreenViewState",
        "Ljx1/e;",
        "checkoutScreenViewState",
        "<init>",
        "(Ljx1/c0;Ljx1/o;Ljx1/l;Ljx1/e;)V",
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
        "Ljx1/c0;",
        "d",
        "()Ljx1/c0;",
        "b",
        "Ljx1/o;",
        "c",
        "()Ljx1/o;",
        "Ljx1/l;",
        "()Ljx1/l;",
        "Ljx1/e;",
        "()Ljx1/e;",
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


# instance fields
.field private final a:Ljx1/c0;

.field private final b:Ljx1/o;

.field private final c:Ljx1/l;

.field private final d:Ljx1/e;


# direct methods
.method public constructor <init>(Ljx1/c0;Ljx1/o;Ljx1/l;Ljx1/e;)V
    .locals 1

    const-string v0, "membershipManagementScreenViewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "membershipAdjustmentCheckoutScreenViewState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "manageMembershipScreenViewState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checkoutScreenViewState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ljx1/e0;->a:Ljx1/c0;

    .line 3
    iput-object p2, p0, Ljx1/e0;->b:Ljx1/o;

    .line 4
    iput-object p3, p0, Ljx1/e0;->c:Ljx1/l;

    .line 5
    iput-object p4, p0, Ljx1/e0;->d:Ljx1/e;

    return-void
.end method

.method public synthetic constructor <init>(Ljx1/c0;Ljx1/o;Ljx1/l;Ljx1/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 6
    sget-object p1, Ljx1/c0$e;->a:Ljx1/c0$e;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    .line 7
    sget-object p2, Ljx1/o$d;->b:Ljx1/o$d;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    .line 8
    sget-object p3, Ljx1/l$d;->a:Ljx1/l$d;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    .line 9
    sget-object p4, Ljx1/e$b;->a:Ljx1/e$b;

    .line 10
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Ljx1/e0;-><init>(Ljx1/c0;Ljx1/o;Ljx1/l;Ljx1/e;)V

    return-void
.end method


# virtual methods
.method public final a()Ljx1/e;
    .locals 1

    iget-object v0, p0, Ljx1/e0;->d:Ljx1/e;

    return-object v0
.end method

.method public final b()Ljx1/l;
    .locals 1

    iget-object v0, p0, Ljx1/e0;->c:Ljx1/l;

    return-object v0
.end method

.method public final c()Ljx1/o;
    .locals 1

    iget-object v0, p0, Ljx1/e0;->b:Ljx1/o;

    return-object v0
.end method

.method public final d()Ljx1/c0;
    .locals 1

    iget-object v0, p0, Ljx1/e0;->a:Ljx1/c0;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ljx1/e0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ljx1/e0;

    iget-object v1, p0, Ljx1/e0;->a:Ljx1/c0;

    iget-object v3, p1, Ljx1/e0;->a:Ljx1/c0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ljx1/e0;->b:Ljx1/o;

    iget-object v3, p1, Ljx1/e0;->b:Ljx1/o;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ljx1/e0;->c:Ljx1/l;

    iget-object v3, p1, Ljx1/e0;->c:Ljx1/l;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ljx1/e0;->d:Ljx1/e;

    iget-object p1, p1, Ljx1/e0;->d:Ljx1/e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Ljx1/e0;->a:Ljx1/c0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ljx1/e0;->b:Ljx1/o;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Ljx1/e0;->c:Ljx1/l;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ljx1/e0;->d:Ljx1/e;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Ljx1/e0;->a:Ljx1/c0;

    iget-object v1, p0, Ljx1/e0;->b:Ljx1/o;

    iget-object v2, p0, Ljx1/e0;->c:Ljx1/l;

    iget-object v3, p0, Ljx1/e0;->d:Ljx1/e;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "MembershipManagementViewState(membershipManagementScreenViewState="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", membershipAdjustmentCheckoutScreenViewState="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", manageMembershipScreenViewState="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", checkoutScreenViewState="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
