.class public final Lek0/o;
.super Lot0/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lek0/o$a;,
        Lek0/o$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u001c\u0010\u000c\u001a\n \t*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u000f\u001a\u0004\u0008\u0014\u0010\u0011R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00168\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001f"
    }
    d2 = {
        "Lek0/o;",
        "Lot0/a;",
        "Ljava/nio/ByteBuffer;",
        "payload",
        "<init>",
        "(Ljava/nio/ByteBuffer;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "kotlin.jvm.PlatformType",
        "e",
        "Ljava/nio/ByteBuffer;",
        "cachedPayload",
        "",
        "f",
        "I",
        "getRevision",
        "()I",
        "revision",
        "g",
        "getEventIdRaw",
        "eventIdRaw",
        "Lek0/o$b;",
        "h",
        "Lek0/o$b;",
        "T",
        "()Lek0/o$b;",
        "genericEventId",
        "i",
        "a",
        "b",
        "connectivity_release"
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
.field public static final i:Lek0/o$a;


# instance fields
.field private final e:Ljava/nio/ByteBuffer;

.field private final f:I

.field private final g:I

.field private final h:Lek0/o$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lek0/o$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lek0/o$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lek0/o;->i:Lek0/o$a;

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 2

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lot0/a;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-virtual {p0}, Lot0/a;->Q()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {}, Llt0/d;->a()Ljava/nio/ByteOrder;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lek0/o;->e:Ljava/nio/ByteBuffer;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    invoke-static {v0}, Luk0/b;->b(B)S

    move-result v0

    iput v0, p0, Lek0/o;->f:I

    sget-object v0, Luk0/b;->a:Luk0/b;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result p1

    invoke-virtual {v0, p1}, Luk0/b;->e(S)I

    move-result p1

    iput p1, p0, Lek0/o;->g:I

    sget-object v0, Lek0/o$b;->Companion:Lek0/o$b$a;

    invoke-virtual {v0, p1}, Lek0/o$b$a;->a(I)Lek0/o$b;

    move-result-object p1

    iput-object p1, p0, Lek0/o;->h:Lek0/o$b;

    return-void
.end method


# virtual methods
.method public final T()Lek0/o$b;
    .locals 1

    iget-object v0, p0, Lek0/o;->h:Lek0/o$b;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget v0, p0, Lek0/o;->f:I

    iget-object v1, p0, Lek0/o;->h:Lek0/o$b;

    if-nez v1, :cond_0

    iget v1, p0, Lek0/o;->g:I

    const/16 v2, 0x10

    invoke-static {v2}, Lva3/d;->c(I)V

    invoke-static {v1, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v1

    const-string v2, "toString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "0x"

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "GenericFirmwareEventPacket(revision="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", eventId="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
