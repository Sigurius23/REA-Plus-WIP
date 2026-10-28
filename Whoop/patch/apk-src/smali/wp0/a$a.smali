.class public final Lwp0/a$a;
.super Lud3/v0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwp0/a;->b(Lud3/v0;)Lud3/v0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "wp0/a$a",
        "Lud3/v0;",
        "Lud3/h0;",
        "contentType",
        "()Lud3/h0;",
        "",
        "contentLength",
        "()J",
        "Lne3/i;",
        "sink",
        "Ll83/a0;",
        "writeTo",
        "(Lne3/i;)V",
        "commons_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic a:Lud3/v0;

.field final synthetic b:Lne3/h;


# direct methods
.method public constructor <init>(Lud3/v0;Lne3/h;)V
    .locals 0

    iput-object p1, p0, Lwp0/a$a;->a:Lud3/v0;

    iput-object p2, p0, Lwp0/a$a;->b:Lne3/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    iget-object v0, p0, Lwp0/a$a;->b:Lne3/h;

    iget-wide v0, v0, Lne3/h;->x:J

    return-wide v0
.end method

.method public contentType()Lud3/h0;
    .locals 1

    iget-object v0, p0, Lwp0/a$a;->a:Lud3/v0;

    invoke-virtual {v0}, Lud3/v0;->contentType()Lud3/h0;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Lne3/i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwp0/a$a;->b:Lne3/h;

    invoke-virtual {v0}, Lne3/h;->X0()Lne3/l;

    move-result-object v0

    invoke-interface {p1, v0}, Lne3/i;->Q(Lne3/l;)Lne3/i;

    return-void
.end method
