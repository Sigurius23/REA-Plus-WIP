.class public final La52/a;
.super Lxj0/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La52/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0006"
    }
    d2 = {
        "La52/a;",
        "Lxj0/b;",
        "<init>",
        "()V",
        "i",
        "a",
        "puffin_release"
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
.field public static final i:La52/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La52/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La52/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, La52/a;->i:La52/a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    sget-object v0, Llt0/l;->PUFFIN_GET_HELLO:Llt0/l;

    sget-object v1, La52/a;->i:La52/a$a;

    invoke-static {v1}, La52/a$a;->a(La52/a$a;)Ljava/nio/ByteBuffer;

    move-result-object v1

    sget-object v2, Lst0/v;->PUFFIN:Lst0/v;

    invoke-direct {p0, v0, v1, v2}, Lxj0/b;-><init>(Llt0/a;Ljava/nio/ByteBuffer;Lst0/v;)V

    return-void
.end method
