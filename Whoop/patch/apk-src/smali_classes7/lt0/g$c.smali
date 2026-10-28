.class public final Llt0/g$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llt0/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llt0/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llt0/g$c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0086\u0008\u0018\u0000 \u00132\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u00d6\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u000bR\u0014\u0010\u0017\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u000b\u00a8\u0006\u0018"
    }
    d2 = {
        "Llt0/g$c;",
        "Llt0/g;",
        "Lhk0/p;",
        "type",
        "<init>",
        "(Lhk0/p;)V",
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
        "b",
        "Lhk0/p;",
        "c",
        "()Lhk0/p;",
        "frameRevision",
        "a",
        "packetType",
        "connectivity-core_release"
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
.field public static final c:Llt0/g$c$a;


# instance fields
.field private final b:Lhk0/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llt0/g$c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llt0/g$c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llt0/g$c;->c:Llt0/g$c$a;

    return-void
.end method

.method public constructor <init>(Lhk0/p;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llt0/g$c;->b:Lhk0/p;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Llt0/g$c;->b:Lhk0/p;

    invoke-virtual {v0}, Lhk0/p;->getValue()I

    move-result v0

    return v0
.end method

.method public b()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public final c()Lhk0/p;
    .locals 1

    iget-object v0, p0, Llt0/g$c;->b:Lhk0/p;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llt0/g$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llt0/g$c;

    iget-object v1, p0, Llt0/g$c;->b:Lhk0/p;

    iget-object p1, p1, Llt0/g$c;->b:Lhk0/p;

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Llt0/g$c;->b:Lhk0/p;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Llt0/g$c;->b:Lhk0/p;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Rev2."

    invoke-static {v1, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
