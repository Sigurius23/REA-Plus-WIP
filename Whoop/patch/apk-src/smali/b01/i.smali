.class public final Lb01/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ0\u0010\n\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008\u001e\u0010 \u00a8\u0006!"
    }
    d2 = {
        "Lb01/i;",
        "Lm91/u;",
        "Lb01/q;",
        "searchableListViewState",
        "Lb01/d;",
        "cta",
        "Lny0/h;",
        "button",
        "<init>",
        "(Lb01/q;Lb01/d;Lny0/h;)V",
        "a",
        "(Lb01/q;Lb01/d;Lny0/h;)Lb01/i;",
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
        "Lb01/q;",
        "f",
        "()Lb01/q;",
        "b",
        "Lb01/d;",
        "e",
        "()Lb01/d;",
        "c",
        "Lny0/h;",
        "()Lny0/h;",
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


# instance fields
.field private final a:Lb01/q;

.field private final b:Lb01/d;

.field private final c:Lny0/h;


# direct methods
.method public constructor <init>(Lb01/q;Lb01/d;Lny0/h;)V
    .locals 1

    const-string v0, "searchableListViewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cta"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb01/i;->a:Lb01/q;

    iput-object p2, p0, Lb01/i;->b:Lb01/d;

    iput-object p3, p0, Lb01/i;->c:Lny0/h;

    return-void
.end method

.method public static synthetic b(Lb01/i;Lb01/q;Lb01/d;Lny0/h;ILjava/lang/Object;)Lb01/i;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lb01/i;->a:Lb01/q;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lb01/i;->b:Lb01/d;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lb01/i;->c:Lny0/h;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lb01/i;->a(Lb01/q;Lb01/d;Lny0/h;)Lb01/i;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lb01/q;Lb01/d;Lny0/h;)Lb01/i;
    .locals 1

    const-string v0, "searchableListViewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cta"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lb01/i;

    invoke-direct {v0, p1, p2, p3}, Lb01/i;-><init>(Lb01/q;Lb01/d;Lny0/h;)V

    return-object v0
.end method

.method public final c()Lny0/h;
    .locals 1

    iget-object v0, p0, Lb01/i;->c:Lny0/h;

    return-object v0
.end method

.method public final e()Lb01/d;
    .locals 1

    iget-object v0, p0, Lb01/i;->b:Lb01/d;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lb01/i;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lb01/i;

    iget-object v1, p0, Lb01/i;->a:Lb01/q;

    iget-object v3, p1, Lb01/i;->a:Lb01/q;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lb01/i;->b:Lb01/d;

    iget-object v3, p1, Lb01/i;->b:Lb01/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lb01/i;->c:Lny0/h;

    iget-object p1, p1, Lb01/i;->c:Lny0/h;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final f()Lb01/q;
    .locals 1

    iget-object v0, p0, Lb01/i;->a:Lb01/q;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lb01/i;->a:Lb01/q;

    invoke-virtual {v0}, Lb01/q;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lb01/i;->b:Lb01/d;

    invoke-virtual {v1}, Lb01/d;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lb01/i;->c:Lny0/h;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lny0/h;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lb01/i;->a:Lb01/q;

    iget-object v1, p0, Lb01/i;->b:Lb01/d;

    iget-object v2, p0, Lb01/i;->c:Lny0/h;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "SanguineWaitlistBiomarkerListPreviewViewState(searchableListViewState="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", cta="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", button="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
