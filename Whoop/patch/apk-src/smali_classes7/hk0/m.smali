.class public abstract Lhk0/m;
.super Lhk0/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhk0/m$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008&\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0004\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u001b\u0010\u0014\u001a\u00020\u00028DX\u0084\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u001b"
    }
    d2 = {
        "Lhk0/m;",
        "Lhk0/b;",
        "Ljava/nio/ByteBuffer;",
        "buffer",
        "<init>",
        "(Ljava/nio/ByteBuffer;)V",
        "",
        "d0",
        "()Z",
        "",
        "offset",
        "Z",
        "(I)Ljava/nio/ByteBuffer;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "e",
        "Ll83/h;",
        "a0",
        "()Ljava/nio/ByteBuffer;",
        "metadataPayload",
        "Lhk0/n;",
        "b0",
        "()Lhk0/n;",
        "subtype",
        "f",
        "a",
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
.field public static final f:Lhk0/m$a;


# instance fields
.field private final e:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhk0/m$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lhk0/m$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lhk0/m;->f:Lhk0/m$a;

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 2

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lhk0/b;-><init>(Ljava/nio/ByteBuffer;)V

    new-instance v0, Lh02/n0;

    const/16 v1, 0xa

    invoke-direct {v0, p1, v1}, Lh02/n0;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lhk0/m;->e:Ll83/h;

    return-void
.end method

.method public static synthetic Y(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 0

    invoke-static {p0}, Lhk0/m;->c0(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object p0

    return-object p0
.end method

.method private static final c0(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 1

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object p0

    const/16 v0, 0x15

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-static {}, Llt0/d;->a()Ljava/nio/ByteOrder;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final Z(I)Ljava/nio/ByteBuffer;
    .locals 2

    invoke-virtual {p0}, Lhk0/m;->a0()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Llt0/d;->a()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    return-object v0
.end method

.method public final a0()Ljava/nio/ByteBuffer;
    .locals 2

    iget-object v0, p0, Lhk0/m;->e:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public abstract b0()Lhk0/n;
.end method

.method public d0()Z
    .locals 2

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v0

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Llt0/c;->K()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Llt0/c;->O()Ljava/lang/String;

    move-result-object v1

    const-string v2, " - "

    invoke-static {v0, v2, v1}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
