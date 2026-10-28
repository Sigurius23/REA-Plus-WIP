.class public final Ldj0/v;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0003R\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0008\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Ldj0/v;",
        "",
        "<init>",
        "()V",
        "Ll83/a0;",
        "b",
        "Lec3/p1;",
        "Ldj0/u;",
        "a",
        "Lec3/p1;",
        "()Lec3/p1;",
        "challengeData",
        "auth_release"
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
.field private final a:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Ldj0/v;->a:Lec3/p1;

    return-void
.end method


# virtual methods
.method public final a()Lec3/p1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/p1;"
        }
    .end annotation

    iget-object v0, p0, Ldj0/v;->a:Lec3/p1;

    return-object v0
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Ldj0/v;->a:Lec3/p1;

    const/4 v1, 0x0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0, v1}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-void
.end method
