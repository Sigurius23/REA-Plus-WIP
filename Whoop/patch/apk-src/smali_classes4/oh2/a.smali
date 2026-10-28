.class public final Loh2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Loh2/a$a;,
        Loh2/a$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0016\u0018\u0000 \'2\u00020\u0001:\u0002\u001a\u0016BC\u0008\u0000\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001b\u001a\u0004\u0008\u001a\u0010\u001dR$\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010\u001e\u001a\u0004\u0008\u001f\u0010 \"\u0004\u0008!\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010#\u001a\u0004\u0008$\u0010%R\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010&\u001a\u0004\u0008\'\u0010(\u00a8\u0006)"
    }
    d2 = {
        "Loh2/a;",
        "",
        "Loh2/c;",
        "hardwareVersion",
        "Loh2/b;",
        "firmwareVersion",
        "bluetoothVersion",
        "Loh2/e;",
        "sigProcVersion",
        "",
        "strapId",
        "",
        "version",
        "<init>",
        "(Loh2/c;Loh2/b;Loh2/b;Loh2/e;Ljava/lang/String;B)V",
        "o",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "",
        "hashCode",
        "()I",
        "a",
        "Loh2/c;",
        "d",
        "()Loh2/c;",
        "b",
        "Loh2/b;",
        "c",
        "()Loh2/b;",
        "Loh2/e;",
        "e",
        "()Loh2/e;",
        "setSigProcVersion",
        "(Loh2/e;)V",
        "Ljava/lang/String;",
        "f",
        "()Ljava/lang/String;",
        "B",
        "g",
        "()B",
        "strap-metadata_release"
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
.field public static final g:Loh2/a$a;


# instance fields
.field private final a:Loh2/c;

.field private final b:Loh2/b;

.field private final c:Loh2/b;

.field private d:Loh2/e;

.field private final e:Ljava/lang/String;

.field private final f:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Loh2/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Loh2/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Loh2/a;->g:Loh2/a$a;

    return-void
.end method

.method public constructor <init>(Loh2/c;Loh2/b;Loh2/b;Loh2/e;Ljava/lang/String;B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loh2/a;->a:Loh2/c;

    iput-object p2, p0, Loh2/a;->b:Loh2/b;

    iput-object p3, p0, Loh2/a;->c:Loh2/b;

    iput-object p4, p0, Loh2/a;->d:Loh2/e;

    iput-object p5, p0, Loh2/a;->e:Ljava/lang/String;

    iput-byte p6, p0, Loh2/a;->f:B

    return-void
.end method

.method public static final a()Loh2/a$b;
    .locals 1

    sget-object v0, Loh2/a;->g:Loh2/a$a;

    invoke-virtual {v0}, Loh2/a$a;->a()Loh2/a$b;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final b()Loh2/b;
    .locals 1

    iget-object v0, p0, Loh2/a;->c:Loh2/b;

    return-object v0
.end method

.method public final c()Loh2/b;
    .locals 1

    iget-object v0, p0, Loh2/a;->b:Loh2/b;

    return-object v0
.end method

.method public final d()Loh2/c;
    .locals 1

    iget-object v0, p0, Loh2/a;->a:Loh2/c;

    return-object v0
.end method

.method public final e()Loh2/e;
    .locals 1

    iget-object v0, p0, Loh2/a;->d:Loh2/e;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    const-class v2, Loh2/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Loh2/a;

    iget-object v2, p0, Loh2/a;->a:Loh2/c;

    iget-object v3, p1, Loh2/a;->a:Loh2/c;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Loh2/a;->b:Loh2/b;

    iget-object v3, p1, Loh2/a;->b:Loh2/b;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Loh2/a;->c:Loh2/b;

    iget-object v3, p1, Loh2/a;->c:Loh2/b;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Loh2/a;->d:Loh2/e;

    iget-object v3, p1, Loh2/a;->d:Loh2/e;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Loh2/a;->e:Ljava/lang/String;

    iget-object p1, p1, Loh2/a;->e:Ljava/lang/String;

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Loh2/a;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final g()B
    .locals 1

    iget-byte v0, p0, Loh2/a;->f:B

    return v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, Loh2/a;->a:Loh2/c;

    iget-object v1, p0, Loh2/a;->b:Loh2/b;

    iget-object v2, p0, Loh2/a;->c:Loh2/b;

    iget-object v3, p0, Loh2/a;->d:Loh2/e;

    iget-object v4, p0, Loh2/a;->e:Ljava/lang/String;

    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
