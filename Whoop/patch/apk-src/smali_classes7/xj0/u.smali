.class public final Lxj0/u;
.super Lxj0/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxj0/u$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000c"
    }
    d2 = {
        "Lxj0/u;",
        "Lxj0/b;",
        "Lxj0/v;",
        "selection",
        "<init>",
        "(Lxj0/v;)V",
        "i",
        "Lxj0/v;",
        "getSelection",
        "()Lxj0/v;",
        "j",
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
.field private static final j:Lxj0/u$a;


# instance fields
.field private final i:Lxj0/v;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxj0/u$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lxj0/u$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lxj0/u;->j:Lxj0/u$a;

    return-void
.end method

.method public constructor <init>(Lxj0/v;)V
    .locals 7

    const-string v0, "selection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Llt0/e;->TOGGLE_LABRADOR_DATA_GENERATION:Llt0/e;

    sget-object v0, Lxj0/u;->j:Lxj0/u$a;

    invoke-static {v0, p1}, Lxj0/u$a;->a(Lxj0/u$a;Lxj0/v;)Ljava/nio/ByteBuffer;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lxj0/b;-><init>(Llt0/a;Ljava/nio/ByteBuffer;Lst0/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, v1, Lxj0/u;->i:Lxj0/v;

    return-void
.end method
