.class public final Ldy1/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldw/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldy1/d;-><init>(Lci2/b;Ldy1/b;Lbc3/c0;Ldw/b;Lju0/a;Ltr2/n;)V
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
        "dy1/d$b",
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
.field final synthetic a:Ldy1/d;


# direct methods
.method public constructor <init>(Ldy1/d;)V
    .locals 0

    iput-object p1, p0, Ldy1/d$b;->a:Ldy1/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(JILjava/lang/Exception;)V
    .locals 2

    const-string p3, "exception"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p3, p0, Ldy1/d$b;->a:Ldy1/d;

    invoke-static {p3}, Ldy1/d;->e(Ldy1/d;)Ltr2/n;

    move-result-object p3

    const-string v0, "Something went wrong sending memfault chunks, waiting "

    const-string v1, "s"

    invoke-static {p1, p2, v0, v1}, Lr80/c;->l(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p3, v0, p4, v1}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    iget-object p3, p0, Ldy1/d$b;->a:Ldy1/d;

    invoke-static {p3}, Ldy1/d;->c(Ldy1/d;)Lbc3/c0;

    move-result-object p3

    new-instance p4, Ldy1/d$b$b;

    iget-object v0, p0, Ldy1/d$b;->a:Ldy1/d;

    const/4 v1, 0x0

    invoke-direct {p4, p1, p2, v0, v1}, Ldy1/d$b$b;-><init>(JLdy1/d;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p3, v1, v1, p4, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public b(I)V
    .locals 4

    iget-object v0, p0, Ldy1/d$b;->a:Ldy1/d;

    invoke-static {v0}, Ldy1/d;->e(Ldy1/d;)Ltr2/n;

    move-result-object v0

    const-string v1, "Finished sending chunks, sent "

    invoke-static {p1, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Ldy1/d$b;->a:Ldy1/d;

    invoke-static {v0}, Ldy1/d;->c(Ldy1/d;)Lbc3/c0;

    move-result-object v0

    new-instance v1, Ldy1/d$b$a;

    iget-object v2, p0, Ldy1/d$b;->a:Ldy1/d;

    const/4 v3, 0x0

    invoke-direct {v1, v2, p1, v3}, Ldy1/d$b$a;-><init>(Ldy1/d;ILq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v3, v3, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
