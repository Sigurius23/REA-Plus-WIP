.class public final Ldy1/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldw/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldy1/f;-><init>(Ldy1/a;Lbc3/c0;Ldw/b;Ltr2/n;Ly42/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J+\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "dy1/f$a",
        "Ldw/f;",
        "",
        "sent",
        "Ll83/a0;",
        "b",
        "(I)V",
        "",
        "delay",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "exception",
        "a",
        "(JILjava/lang/Exception;)V",
        "memfault_release"
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
.field final synthetic a:Ldy1/f;


# direct methods
.method public constructor <init>(Ldy1/f;)V
    .locals 0

    iput-object p1, p0, Ldy1/f$a;->a:Ldy1/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(JILjava/lang/Exception;)V
    .locals 0

    const-string p1, "exception"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Ldy1/f$a;->a:Ldy1/f;

    invoke-static {p1}, Ldy1/f;->l(Ldy1/f;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object p1, p0, Ldy1/f$a;->a:Ldy1/f;

    invoke-static {p1}, Ldy1/f;->i(Ldy1/f;)Ltr2/n;

    move-result-object p1

    const-string p3, "Something went wrong sending memfault chunks"

    new-array p2, p2, [Lqr2/a$a;

    invoke-interface {p1, p3, p4, p2}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    iget-object p1, p0, Ldy1/f$a;->a:Ldy1/f;

    invoke-static {p1}, Ldy1/f;->b(Ldy1/f;)V

    return-void
.end method

.method public b(I)V
    .locals 4

    iget-object v0, p0, Ldy1/f$a;->a:Ldy1/f;

    invoke-static {v0}, Ldy1/f;->l(Ldy1/f;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, Ldy1/f$a;->a:Ldy1/f;

    invoke-static {v0}, Ldy1/f;->i(Ldy1/f;)Ltr2/n;

    move-result-object v0

    const-string v2, "Finished sending "

    const-string v3, " chunks"

    invoke-static {p1, v2, v3}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method
