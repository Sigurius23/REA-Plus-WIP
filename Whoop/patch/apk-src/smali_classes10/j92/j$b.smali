.class public final Lj92/j$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj92/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj92/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u000b\n\u0002\u0010 \n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u00d6\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00068\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0008R \u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00188\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0019\u001a\u0004\u0008\u0010\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Lj92/j$b;",
        "Lj92/j;",
        "",
        "usingCognito",
        "<init>",
        "(Ljava/lang/Boolean;)V",
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
        "a",
        "Ljava/lang/Boolean;",
        "c",
        "()Ljava/lang/Boolean;",
        "b",
        "Ljava/lang/String;",
        "getName",
        "name",
        "",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "tags",
        "core_release"
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
.field private final a:Ljava/lang/Boolean;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Boolean;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj92/j$b;->a:Ljava/lang/Boolean;

    const-string p1, "whoop.token-refresh.success"

    iput-object p1, p0, Lj92/j$b;->b:Ljava/lang/String;

    sget-object p1, Lm83/y;->w:Lm83/y;

    iput-object p1, p0, Lj92/j$b;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lj92/j$b;->c:Ljava/util/List;

    return-object v0
.end method

.method public bridge b()Ljy1/a;
    .locals 1

    invoke-super {p0}, Lj92/j;->b()Ljy1/a;

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lj92/j$b;->a:Ljava/lang/Boolean;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lj92/j$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lj92/j$b;

    iget-object v1, p0, Lj92/j$b;->a:Ljava/lang/Boolean;

    iget-object p1, p1, Lj92/j$b;->a:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj92/j$b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lj92/j$b;->a:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lj92/j$b;->a:Ljava/lang/Boolean;

    const-string v1, "RefreshTokenSuccessMetric(usingCognito="

    const-string v2, ")"

    invoke-static {v1, v0, v2}, Lte0/d;->j(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
