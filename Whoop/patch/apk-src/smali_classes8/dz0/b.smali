.class public final Ldz0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\r\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\r\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Ldz0/b;",
        "",
        "Lu2/r;",
        "change",
        "<init>",
        "(Lu2/r;)V",
        "",
        "c",
        "()Z",
        "Lh2/b;",
        "b",
        "()J",
        "Ll83/a0;",
        "a",
        "()V",
        "Lu2/r;",
        "design_release"
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
.field private final a:Lu2/r;


# direct methods
.method public constructor <init>(Lu2/r;)V
    .locals 1

    const-string v0, "change"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldz0/b;->a:Lu2/r;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Ldz0/b;->a:Lu2/r;

    invoke-virtual {v0}, Lu2/r;->a()V

    return-void
.end method

.method public final b()J
    .locals 2

    iget-object v0, p0, Ldz0/b;->a:Lu2/r;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lu2/d0;->k(Lu2/r;Z)J

    move-result-wide v0

    return-wide v0
.end method

.method public final c()Z
    .locals 1

    iget-object v0, p0, Ldz0/b;->a:Lu2/r;

    invoke-static {v0}, Lu2/d0;->l(Lu2/r;)Z

    move-result v0

    return v0
.end method
