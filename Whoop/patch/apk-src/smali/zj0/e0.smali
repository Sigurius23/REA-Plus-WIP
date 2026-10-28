.class public final Lzj0/e0;
.super Lzj0/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzj0/e0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0008"
    }
    d2 = {
        "Lzj0/e0;",
        "Lzj0/h;",
        "Ljava/nio/ByteBuffer;",
        "payload",
        "<init>",
        "(Ljava/nio/ByteBuffer;)V",
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
.field public static final f:Lzj0/e0$a;

.field private static final g:I

.field private static final h:I

.field private static final i:I

.field private static final j:I

.field private static final k:I

.field private static final l:I

.field private static final m:I

.field private static final n:I

.field private static final o:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lzj0/e0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lzj0/e0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lzj0/e0;->f:Lzj0/e0$a;

    const/4 v0, 0x4

    sput v0, Lzj0/e0;->g:I

    const/4 v0, 0x1

    sput v0, Lzj0/e0;->h:I

    sget v0, Lzj0/e0;->i:I

    add-int/lit8 v1, v0, 0x4

    sput v1, Lzj0/e0;->j:I

    add-int/lit8 v1, v0, 0x8

    sput v1, Lzj0/e0;->k:I

    add-int/lit8 v1, v0, 0xc

    sput v1, Lzj0/e0;->l:I

    add-int/lit8 v1, v0, 0x10

    sput v1, Lzj0/e0;->m:I

    add-int/lit8 v1, v0, 0x11

    sput v1, Lzj0/e0;->n:I

    add-int/lit8 v0, v0, 0x12

    sput v0, Lzj0/e0;->o:I

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 2

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lzj0/h;-><init>(Ljava/nio/ByteBuffer;Lst0/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
