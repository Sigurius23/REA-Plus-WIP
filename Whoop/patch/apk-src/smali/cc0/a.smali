.class public final Lcc0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ!\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000c2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcc0/a;",
        "",
        "Lzr2/a;",
        "dateAndTimeProvider",
        "<init>",
        "(Lzr2/a;)V",
        "Lzb0/b$f;",
        "",
        "testId",
        "Lbc0/c$d;",
        "c",
        "(Lzb0/b$f;Ljava/lang/String;)Lbc0/c$d;",
        "Lec3/l;",
        "Lzb0/b;",
        "upstream",
        "Lbc0/c;",
        "b",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lzr2/a;",
        "advanced-labs_release"
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
.field private final a:Lzr2/a;


# direct methods
.method public constructor <init>(Lzr2/a;)V
    .locals 1

    const-string v0, "dateAndTimeProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcc0/a;->a:Lzr2/a;

    return-void
.end method

.method public static final synthetic a(Lcc0/a;Lzb0/b$f;Ljava/lang/String;)Lbc0/c$d;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcc0/a;->c(Lzb0/b$f;Ljava/lang/String;)Lbc0/c$d;

    move-result-object p0

    return-object p0
.end method

.method private final c(Lzb0/b$f;Ljava/lang/String;)Lbc0/c$d;
    .locals 2

    new-instance v0, Lbc0/c$d;

    invoke-virtual {p1}, Lzb0/b$f;->a()Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;

    move-result-object p1

    iget-object v1, p0, Lcc0/a;->a:Lzr2/a;

    invoke-static {p1, v1}, Lmf0/f;->b(Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;Lzr2/a;)Lmf0/g;

    move-result-object p1

    invoke-direct {v0, p2, p1}, Lbc0/c$d;-><init>(Ljava/lang/String;Lmf0/g;)V

    return-object v0
.end method


# virtual methods
.method public final b(Lec3/l;)Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcc0/a$a;

    invoke-direct {v0, p1, p0}, Lcc0/a$a;-><init>(Lec3/l;Lcc0/a;)V

    return-object v0
.end method
