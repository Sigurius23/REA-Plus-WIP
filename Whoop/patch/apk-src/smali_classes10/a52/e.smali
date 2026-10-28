.class public final La52/e;
.super Lxj0/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La52/e$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0006\u0018\u0000 \u00082\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\n"
    }
    d2 = {
        "La52/e;",
        "Lxj0/b;",
        "",
        "index",
        "",
        "data",
        "<init>",
        "(J[B)V",
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
.field public static final i:La52/e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La52/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La52/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, La52/e;->i:La52/e$a;

    return-void
.end method

.method public constructor <init>(J[B)V
    .locals 2

    const-string v0, "data"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llt0/l;->PUFFIN_LOAD_FW_DATA:Llt0/l;

    sget-object v1, La52/e;->i:La52/e$a;

    invoke-static {v1, p1, p2, p3}, La52/e$a;->a(La52/e$a;J[B)Ljava/nio/ByteBuffer;

    move-result-object p1

    sget-object p2, Lst0/v;->PUFFIN:Lst0/v;

    invoke-direct {p0, v0, p1, p2}, Lxj0/b;-><init>(Llt0/a;Ljava/nio/ByteBuffer;Lst0/v;)V

    return-void
.end method
