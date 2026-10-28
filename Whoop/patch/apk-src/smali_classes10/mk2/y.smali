.class final Lmk2/y;
.super Ljava/lang/Exception;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\u0008\u00030\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001b\u0010\u0004\u001a\u0006\u0012\u0002\u0008\u00030\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lmk2/y;",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "Lpm0/a$c;",
        "error",
        "<init>",
        "(Lpm0/a$c;)V",
        "w",
        "Lpm0/a$c;",
        "a",
        "()Lpm0/a$c;",
        "track-activity_release"
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
.field private final w:Lpm0/a$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpm0/a$c<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lpm0/a$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpm0/a$c<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    iput-object p1, p0, Lmk2/y;->w:Lpm0/a$c;

    return-void
.end method


# virtual methods
.method public final a()Lpm0/a$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lpm0/a$c<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lmk2/y;->w:Lpm0/a$c;

    return-object v0
.end method
