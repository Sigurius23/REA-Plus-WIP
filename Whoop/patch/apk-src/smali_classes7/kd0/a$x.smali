.class public final Lkd0/a$x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkd0/a;
.implements Lkd0/a$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkd0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "x"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0087\u0008\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J$\u0010\u0008\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00018\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lkd0/a$x;",
        "",
        "Lkd0/a$c;",
        "event",
        "Lm91/u;",
        "element",
        "<init>",
        "(Ljava/lang/Object;Lm91/u;)V",
        "a",
        "(Ljava/lang/Object;Lm91/u;)Lkd0/a$x;",
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
        "Ljava/lang/Object;",
        "d",
        "()Ljava/lang/Object;",
        "b",
        "Lm91/u;",
        "c",
        "()Lm91/u;",
        "advanced-labs_release"
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
.field private final a:Ljava/lang/Object;

.field private final b:Lm91/u;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lm91/u;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkd0/a$x;->a:Ljava/lang/Object;

    iput-object p2, p0, Lkd0/a$x;->b:Lm91/u;

    return-void
.end method

.method public static synthetic b(Lkd0/a$x;Ljava/lang/Object;Lm91/u;ILjava/lang/Object;)Lkd0/a$x;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lkd0/a$x;->a:Ljava/lang/Object;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lkd0/a$x;->b:Lm91/u;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lkd0/a$x;->a(Ljava/lang/Object;Lm91/u;)Lkd0/a$x;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lm91/u;)Lkd0/a$x;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkd0/a$x;

    invoke-direct {v0, p1, p2}, Lkd0/a$x;-><init>(Ljava/lang/Object;Lm91/u;)V

    return-object v0
.end method

.method public final c()Lm91/u;
    .locals 1

    iget-object v0, p0, Lkd0/a$x;->b:Lm91/u;

    return-object v0
.end method

.method public final d()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lkd0/a$x;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lkd0/a$x;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lkd0/a$x;

    iget-object v1, p0, Lkd0/a$x;->a:Ljava/lang/Object;

    iget-object v3, p1, Lkd0/a$x;->a:Ljava/lang/Object;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lkd0/a$x;->b:Lm91/u;

    iget-object p1, p1, Lkd0/a$x;->b:Lm91/u;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lkd0/a$x;->a:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lkd0/a$x;->b:Lm91/u;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lkd0/a$x;->a:Ljava/lang/Object;

    iget-object v1, p0, Lkd0/a$x;->b:Lm91/u;

    const-string v2, ", element="

    const-string v3, ")"

    const-string v4, "ItemClicked(event="

    invoke-static {v4, v0, v2, v1, v3}, Lte0/d;->k(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Lm91/u;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
