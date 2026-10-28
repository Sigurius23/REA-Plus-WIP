.class public final Loh2/c$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Loh2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Loh2/c$b;",
        "",
        "<init>",
        "()V",
        "Loh2/c$a;",
        "a",
        "()Loh2/c$a;",
        "Ljava/nio/ByteBuffer;",
        "buffer",
        "Loh2/c;",
        "b",
        "(Ljava/nio/ByteBuffer;)Loh2/c;",
        "Ltr2/n;",
        "logger",
        "Ltr2/n;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Loh2/c$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Loh2/c$a;
    .locals 1

    new-instance v0, Loh2/c$a;

    invoke-direct {v0}, Loh2/c$a;-><init>()V

    return-object v0
.end method

.method public final b(Ljava/nio/ByteBuffer;)Loh2/c;
    .locals 3

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Loh2/c$b;->a()Loh2/c$a;

    move-result-object v0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    invoke-static {v1}, Luk0/b;->d(I)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Loh2/c$a;->b(J)Loh2/c$a;

    move-result-object v0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    invoke-static {v1}, Luk0/b;->d(I)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Loh2/c$a;->d(J)Loh2/c$a;

    move-result-object v0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p1

    invoke-static {p1}, Luk0/b;->d(I)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Loh2/c$a;->c(J)Loh2/c$a;

    move-result-object p1

    invoke-virtual {p1}, Loh2/c$a;->a()Loh2/c;

    move-result-object p1

    return-object p1
.end method
