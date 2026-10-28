.class public final Lek0/b;
.super Lot0/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lek0/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\t\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\r\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0010"
    }
    d2 = {
        "Lek0/b;",
        "Lot0/a;",
        "Ljava/nio/ByteBuffer;",
        "payload",
        "<init>",
        "(Ljava/nio/ByteBuffer;)V",
        "Lkk0/a;",
        "b",
        "()Lkk0/a;",
        "batteryLevel",
        "Lkk0/b;",
        "T",
        "()Lkk0/b;",
        "external5VStatus",
        "e",
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
.field public static final e:Lek0/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lek0/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lek0/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lek0/b;->e:Lek0/b$a;

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 1

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lot0/a;-><init>(Ljava/nio/ByteBuffer;)V

    return-void
.end method


# virtual methods
.method public final T()Lkk0/b;
    .locals 3

    new-instance v0, Lkk0/b;

    invoke-direct {v0}, Lkk0/b;-><init>()V

    invoke-virtual {p0}, Lot0/a;->Q()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v1

    invoke-virtual {v0, v1}, Lkk0/b;->l(B)V

    return-object v0
.end method

.method public final b()Lkk0/a;
    .locals 3

    sget-object v0, Lkk0/a;->d:Lkk0/a$a;

    invoke-virtual {p0}, Lot0/a;->Q()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    invoke-static {v1}, Luk0/b;->d(I)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lkk0/a$a;->a(J)Lkk0/a;

    move-result-object v0

    return-object v0
.end method
