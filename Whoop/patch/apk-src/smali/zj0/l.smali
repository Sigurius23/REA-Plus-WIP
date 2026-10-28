.class public final Lzj0/l;
.super Lzj0/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzj0/l$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u000e\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u000b\u001a\u0004\u0008\u0016\u0010\rR\u0014\u0010\u001b\u001a\u00020\u00188BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u001aR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u0008\u00a8\u0006 "
    }
    d2 = {
        "Lzj0/l;",
        "Lzj0/h;",
        "Ljava/nio/ByteBuffer;",
        "payload",
        "<init>",
        "(Ljava/nio/ByteBuffer;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "f",
        "I",
        "getRevision",
        "()I",
        "revision",
        "Lzj0/a;",
        "g",
        "Lzj0/a;",
        "getStatus$connectivity_release",
        "()Lzj0/a;",
        "status",
        "h",
        "getAdvertisingNameLength",
        "advertisingNameLength",
        "",
        "Y",
        "()Z",
        "isAdvertisingNameSet",
        "X",
        "advertisingName",
        "i",
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
.field private static final i:Lzj0/l$a;


# instance fields
.field private final f:I

.field private final g:Lzj0/a;

.field private final h:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lzj0/l$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lzj0/l$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lzj0/l;->i:Lzj0/l$a;

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 3

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lzj0/h;-><init>(Ljava/nio/ByteBuffer;Lst0/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    invoke-static {p1}, Lwj0/a;->a(B)I

    move-result p1

    iput p1, p0, Lzj0/l;->f:I

    sget-object p1, Lzj0/a;->Companion:Lzj0/a$a;

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    invoke-virtual {p1, v0}, Lzj0/a$a;->a(B)Lzj0/a;

    move-result-object p1

    iput-object p1, p0, Lzj0/l;->g:Lzj0/a;

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    invoke-static {p1}, Lwj0/a;->a(B)I

    move-result p1

    iput p1, p0, Lzj0/l;->h:I

    return-void
.end method

.method private final Y()Z
    .locals 2

    iget-object v0, p0, Lzj0/l;->g:Lzj0/a;

    sget-object v1, Lzj0/a;->SET:Lzj0/a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final X()Ljava/lang/String;
    .locals 2

    invoke-direct {p0}, Lzj0/l;->Y()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    const-string v1, "array(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x8

    invoke-static {v0, v1}, Ltt0/b;->b([BI)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget v0, p0, Lzj0/l;->f:I

    iget-object v1, p0, Lzj0/l;->g:Lzj0/a;

    iget v2, p0, Lzj0/l;->h:I

    invoke-virtual {p0}, Lzj0/l;->X()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0}, Lzj0/l;->Y()Z

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Revision: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " - Status: "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " - Length: "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " - Name: "

    const-string v1, " - isSet: "

    invoke-static {v2, v0, v3, v1, v5}, Ldc/b;->B(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
