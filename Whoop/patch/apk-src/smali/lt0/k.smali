.class public abstract Llt0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001B\u0019\u0008\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0008\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\u000b\u0010\r\u0082\u0001\u0002\u000e\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Llt0/k;",
        "",
        "Lmt0/b;",
        "framedPacket",
        "Llt0/c;",
        "packet",
        "<init>",
        "(Lmt0/b;Llt0/c;)V",
        "a",
        "Lmt0/b;",
        "()Lmt0/b;",
        "b",
        "Llt0/c;",
        "()Llt0/c;",
        "Llt0/h;",
        "Llt0/m;",
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


# instance fields
.field private final a:Lmt0/b;

.field private final b:Llt0/c;


# direct methods
.method private constructor <init>(Lmt0/b;Llt0/c;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llt0/k;->a:Lmt0/b;

    iput-object p2, p0, Llt0/k;->b:Llt0/c;

    return-void
.end method

.method public synthetic constructor <init>(Lmt0/b;Llt0/c;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Llt0/k;-><init>(Lmt0/b;Llt0/c;)V

    return-void
.end method


# virtual methods
.method public final a()Lmt0/b;
    .locals 1

    iget-object v0, p0, Llt0/k;->a:Lmt0/b;

    return-object v0
.end method

.method public final b()Llt0/c;
    .locals 1

    iget-object v0, p0, Llt0/k;->b:Llt0/c;

    return-object v0
.end method
