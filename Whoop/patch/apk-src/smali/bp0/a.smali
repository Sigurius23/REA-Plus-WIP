.class public final Lbp0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001d\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0014\u0010\rJ\u001d\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00082\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00082\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u0019R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lbp0/a;",
        "",
        "Lzo0/c;",
        "internalCallbacks",
        "Lbc3/c0;",
        "scope",
        "<init>",
        "(Lzo0/c;Lbc3/c0;)V",
        "",
        "conversationId",
        "messageId",
        "Ll83/a0;",
        "b",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "drawerState",
        "Lep0/j;",
        "screenContext",
        "d",
        "(Ljava/lang/String;Lep0/j;)V",
        "previewContent",
        "a",
        "screenId",
        "",
        "wasCutoff",
        "c",
        "(Ljava/lang/String;Z)V",
        "e",
        "Lzo0/c;",
        "Lbc3/c0;",
        "coach-everywhere_release"
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
.field private final a:Lzo0/c;

.field private final b:Lbc3/c0;


# direct methods
.method public constructor <init>(Lzo0/c;Lbc3/c0;)V
    .locals 1

    const-string v0, "scope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbp0/a;->a:Lzo0/c;

    iput-object p2, p0, Lbp0/a;->b:Lbc3/c0;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    const-string v0, "previewContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbp0/a;->a:Lzo0/c;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lbp0/a;->b:Lbc3/c0;

    new-instance v2, Lbp0/a$a;

    const/4 v3, 0x0

    invoke-direct {v2, v0, p1, p2, v3}, Lbp0/a$a;-><init>(Lzo0/c;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v1, v3, v3, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    const-string v0, "conversationId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbp0/a;->a:Lzo0/c;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lbp0/a;->b:Lbc3/c0;

    new-instance v2, Lbp0/a$b;

    const/4 v3, 0x0

    invoke-direct {v2, v0, p1, p2, v3}, Lbp0/a$b;-><init>(Lzo0/c;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v1, v3, v3, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_0
    return-void
.end method

.method public final c(Ljava/lang/String;Z)V
    .locals 2

    const-string v0, "screenId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbp0/a;->a:Lzo0/c;

    if-eqz v0, :cond_0

    new-instance v1, Ldp0/e$c;

    invoke-direct {v1, p1, p2}, Ldp0/e$c;-><init>(Ljava/lang/String;Z)V

    invoke-interface {v0, v1}, Lzo0/c;->n(Ldp0/e;)V

    :cond_0
    return-void
.end method

.method public final d(Ljava/lang/String;Lep0/j;)V
    .locals 3

    const-string v0, "screenContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_3

    iget-object v0, p0, Lbp0/a;->a:Lzo0/c;

    if-eqz v0, :cond_3

    invoke-virtual {p2}, Lep0/j;->s()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-static {p2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_2

    :cond_1
    const-string p2, ""

    :cond_2
    new-instance v1, Ldp0/e$d;

    const-string v2, "drawer_dismiss"

    invoke-direct {v1, p2, p1, v2}, Ldp0/e$d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lzo0/c;->n(Ldp0/e;)V

    :cond_3
    return-void
.end method

.method public final e(Ljava/lang/String;Z)V
    .locals 2

    const-string v0, "screenId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbp0/a;->a:Lzo0/c;

    if-eqz v0, :cond_0

    new-instance v1, Ldp0/e$e;

    invoke-direct {v1, p1, p2}, Ldp0/e$e;-><init>(Ljava/lang/String;Z)V

    invoke-interface {v0, v1}, Lzo0/c;->n(Ldp0/e;)V

    :cond_0
    return-void
.end method
