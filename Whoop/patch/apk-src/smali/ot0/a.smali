.class public Lot0/a;
.super Llt0/c;
.source "SourceFile"

# interfaces
.implements Lot0/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lot0/a$a;,
        Lot0/a$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0016\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0002\u001c\u001dB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00138F\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001e"
    }
    d2 = {
        "Lot0/a;",
        "Llt0/c;",
        "Lot0/b;",
        "Ljava/nio/ByteBuffer;",
        "payload",
        "<init>",
        "(Ljava/nio/ByteBuffer;)V",
        "Q",
        "()Ljava/nio/ByteBuffer;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "c",
        "Ljava/nio/ByteBuffer;",
        "dataBuffer",
        "Lot0/a$b;",
        "R",
        "()Lot0/a$b;",
        "eventTypeEnum",
        "",
        "S",
        "()Ljava/lang/Integer;",
        "legacyGetEventType",
        "Lfk2/a;",
        "getTimestamp",
        "()Lfk2/a;",
        "timestamp",
        "d",
        "b",
        "a",
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
.field public static final d:Lot0/a$a;


# instance fields
.field private c:Ljava/nio/ByteBuffer;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lot0/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lot0/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lot0/a;->d:Lot0/a$a;

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 1

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Llt0/c;-><init>(Ljava/nio/ByteBuffer;)V

    return-void
.end method


# virtual methods
.method public final Q()Ljava/nio/ByteBuffer;
    .locals 2

    iget-object v0, p0, Lot0/a;->c:Ljava/nio/ByteBuffer;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v0

    const/16 v1, 0xc

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Llt0/d;->a()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lot0/a;->c:Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    :cond_0
    iget-object v0, p0, Lot0/a;->c:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public final R()Lot0/a$b;
    .locals 2

    sget-object v0, Lot0/a;->d:Lot0/a$a;

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lot0/a$a;->a(Ljava/nio/ByteBuffer;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Lot0/a$b;->Companion:Lot0/a$b$a;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Lot0/a$b$a;->a(I)Lot0/a$b;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final S()Ljava/lang/Integer;
    .locals 2

    sget-object v0, Lot0/a;->d:Lot0/a$a;

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lot0/a$a;->a(Ljava/nio/ByteBuffer;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getTimestamp()Lfk2/a;
    .locals 5

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_0

    new-instance v0, Lfk2/a;

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    invoke-static {v1}, Luk0/b;->d(I)J

    move-result-wide v1

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v3

    const/16 v4, 0x8

    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v3

    invoke-static {v3}, Luk0/b;->d(I)J

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lfk2/a;-><init>(JJ)V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lot0/a;->R()Lot0/a$b;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    invoke-virtual {p0}, Lot0/a;->S()Ljava/lang/Integer;

    move-result-object v1

    :cond_1
    invoke-virtual {p0}, Llt0/c;->N()B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " (Event: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " Seq#: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " )"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
