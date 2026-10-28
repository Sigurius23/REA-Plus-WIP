.class public final Lsv0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lsv0/a;",
        "",
        "Lpv0/c;",
        "viewModel",
        "Lsv0/c;",
        "navRouter",
        "Llv0/b;",
        "analyticsHelper",
        "<init>",
        "(Lpv0/c;Lsv0/c;Llv0/b;)V",
        "event",
        "Ll83/a0;",
        "a",
        "(Ljava/lang/Object;)V",
        "Lpv0/c;",
        "b",
        "Lsv0/c;",
        "c",
        "Llv0/b;",
        "content-search_release"
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
.field private final a:Lpv0/c;

.field private final b:Lsv0/c;

.field private final c:Llv0/b;


# direct methods
.method public constructor <init>(Lpv0/c;Lsv0/c;Llv0/b;)V
    .locals 1

    const-string v0, "viewModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navRouter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsv0/a;->a:Lpv0/c;

    iput-object p2, p0, Lsv0/a;->b:Lsv0/c;

    iput-object p3, p0, Lsv0/a;->c:Llv0/b;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 9

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lpv0/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lsv0/a;->b:Lsv0/c;

    invoke-virtual {v0, p1}, Lsv0/c;->a(Ljava/lang/Object;)V

    return-void

    :cond_0
    instance-of v0, p1, Lc41/z2;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lsv0/a;->c:Llv0/b;

    new-instance v1, Llv0/a$b;

    move-object v2, p1

    check-cast v2, Lc41/z2;

    invoke-virtual {v2}, Lc41/z2;->c()Lc41/d3;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lc41/z2;->b()Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v2, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v6, ""

    invoke-direct/range {v1 .. v8}, Llv0/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, Llv0/b;->a(Llv0/a;)V

    iget-object v0, p0, Lsv0/a;->b:Lsv0/c;

    invoke-virtual {v0, p1}, Lsv0/c;->a(Ljava/lang/Object;)V

    return-void

    :cond_1
    instance-of v0, p1, Lpv0/b;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lsv0/a;->a:Lpv0/c;

    check-cast p1, Lpv0/b;

    invoke-virtual {v0, p1}, Lpv0/c;->p(Lpv0/b;)V

    iget-object v0, p0, Lsv0/a;->c:Llv0/b;

    invoke-virtual {v0, p1}, Llv0/b;->b(Lpv0/b;)V

    return-void

    :cond_2
    instance-of v0, p1, Lhy0/x0$b;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lsv0/a;->a:Lpv0/c;

    new-instance v1, Lpv0/b$b;

    check-cast p1, Lhy0/x0$b;

    invoke-virtual {p1}, Lhy0/x0$b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->b(Lcom/whoop/design/util/TextResource;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lpv0/b$b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lpv0/c;->p(Lpv0/b;)V

    iget-object p1, p0, Lsv0/a;->b:Lsv0/c;

    sget-object v0, Lpv0/a$b;->a:Lpv0/a$b;

    invoke-virtual {p1, v0}, Lsv0/c;->a(Ljava/lang/Object;)V

    return-void

    :cond_3
    instance-of v0, p1, Lhy0/x0$c;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lsv0/a;->a:Lpv0/c;

    new-instance v1, Lpv0/b$e;

    check-cast p1, Lhy0/x0$c;

    invoke-virtual {p1}, Lhy0/x0$c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lpv0/b$e;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lpv0/c;->p(Lpv0/b;)V

    return-void

    :cond_4
    instance-of v0, p1, Lhy0/x0$a;

    if-eqz v0, :cond_5

    iget-object p1, p0, Lsv0/a;->a:Lpv0/c;

    sget-object v0, Lpv0/b$a;->a:Lpv0/b$a;

    invoke-virtual {p1, v0}, Lpv0/c;->p(Lpv0/b;)V

    return-void

    :cond_5
    instance-of v0, p1, Llv0/a;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lsv0/a;->c:Llv0/b;

    check-cast p1, Llv0/a;

    invoke-virtual {v0, p1}, Llv0/b;->a(Llv0/a;)V

    :cond_6
    return-void
.end method
