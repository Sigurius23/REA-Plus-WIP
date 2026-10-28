.class public final Lo70/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lo70/d;",
        "Lo70/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0082@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J#\u0010\u0013\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u0003*\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0003*\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0011J\u001b\u0010\u0019\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u0011J\u0017\u0010\u001b\u001a\u00020\u000c2\u0006\u0010\u001a\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ#\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u001d2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001dH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$\u00a8\u0006%"
    }
    d2 = {
        "Lo70/a;",
        "Lod1/g;",
        "Lo70/d;",
        "Lo70/c;",
        "Lcom/whoop/data/remote/api/FileDownloaderApi;",
        "fileDownloaderApi",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/data/remote/api/FileDownloaderApi;Ltr2/n;)V",
        "",
        "fullTermsUrl",
        "Lr90/i;",
        "k",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "termId",
        "p",
        "(Lo70/c;Ljava/lang/String;)Lo70/c;",
        "termDetail",
        "q",
        "(Lo70/c;Ljava/lang/String;Lr90/i;)Lo70/c;",
        "o",
        "(Lo70/c;)Lo70/c;",
        "m",
        "l",
        "n",
        "body",
        "r",
        "(Ljava/lang/String;)Lr90/i;",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/data/remote/api/FileDownloaderApi;",
        "b",
        "Ltr2/n;",
        "activation_release"
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
.field private final a:Lcom/whoop/data/remote/api/FileDownloaderApi;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/data/remote/api/FileDownloaderApi;Ltr2/n;)V
    .locals 1

    const-string v0, "fileDownloaderApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo70/a;->a:Lcom/whoop/data/remote/api/FileDownloaderApi;

    iput-object p2, p0, Lo70/a;->b:Ltr2/n;

    return-void
.end method

.method public static final synthetic c(Lo70/a;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lo70/a;->k(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lo70/a;)Lcom/whoop/data/remote/api/FileDownloaderApi;
    .locals 0

    iget-object p0, p0, Lo70/a;->a:Lcom/whoop/data/remote/api/FileDownloaderApi;

    return-object p0
.end method

.method public static final synthetic e(Lo70/a;Lo70/c;Ljava/lang/String;)Lo70/c;
    .locals 0

    invoke-direct {p0, p1, p2}, Lo70/a;->l(Lo70/c;Ljava/lang/String;)Lo70/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lo70/a;Lo70/c;)Lo70/c;
    .locals 0

    invoke-direct {p0, p1}, Lo70/a;->m(Lo70/c;)Lo70/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lo70/a;Lo70/c;Ljava/lang/String;)Lo70/c;
    .locals 0

    invoke-direct {p0, p1, p2}, Lo70/a;->n(Lo70/c;Ljava/lang/String;)Lo70/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(Lo70/a;Lo70/c;)Lo70/c;
    .locals 0

    invoke-direct {p0, p1}, Lo70/a;->o(Lo70/c;)Lo70/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(Lo70/a;Lo70/c;Ljava/lang/String;)Lo70/c;
    .locals 0

    invoke-direct {p0, p1, p2}, Lo70/a;->p(Lo70/c;Ljava/lang/String;)Lo70/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j(Lo70/a;Lo70/c;Ljava/lang/String;Lr90/i;)Lo70/c;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lo70/a;->q(Lo70/c;Ljava/lang/String;Lr90/i;)Lo70/c;

    move-result-object p0

    return-object p0
.end method

.method private final k(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lr90/i;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lo70/a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lo70/a$a;

    iget v1, v0, Lo70/a$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lo70/a$a;->z:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lo70/a$a;

    invoke-direct {v0, p0, p2}, Lo70/a$a;-><init>(Lo70/a;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Lo70/a$a;->x:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lo70/a$a;->z:I

    const/4 v2, 0x1

    const/4 v9, 0x0

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Lo70/a$a;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p2, v2

    iget-object v2, p0, Lo70/a;->b:Ltr2/n;

    new-instance v5, Lo70/a$b;

    invoke-direct {v5, p0, p1, v9}, Lo70/a$b;-><init>(Lo70/a;Ljava/lang/String;Lq83/d;)V

    iput-object v9, v6, Lo70/a$a;->w:Ljava/lang/Object;

    iput p2, v6, Lo70/a$a;->z:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p2, Lu02/a;

    invoke-static {p2}, Lu02/b;->b(Lu02/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lud3/a1;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lud3/a1;->m()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lo70/a;->r(Ljava/lang/String;)Lr90/i;

    move-result-object p1

    return-object p1

    :cond_4
    return-object v9
.end method

.method private final l(Lo70/c;Ljava/lang/String;)Lo70/c;
    .locals 19

    invoke-virtual/range {p1 .. p1}, Lo70/c;->b()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_0
    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lr90/j;

    invoke-virtual {v3}, Lr90/j;->h()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    move-object/from16 v5, p2

    invoke-static {v2, v5, v4}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v3}, Lr90/j;->k()Z

    move-result v2

    xor-int/lit8 v16, v2, 0x1

    const/16 v17, 0xfff

    const/16 v18, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v3 .. v18}, Lr90/j;->b(Lr90/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/whoop/activation/domain/models/steps/TermExpansion;ZLjava/lang/String;Lr90/d;Lr90/i;ZZILjava/lang/Object;)Lr90/j;

    move-result-object v3

    :cond_1
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lo70/c;->a(Ljava/util/List;)Lo70/c;

    move-result-object v0

    return-object v0
.end method

.method private final m(Lo70/c;)Lo70/c;
    .locals 19

    invoke-virtual/range {p1 .. p1}, Lo70/c;->b()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_0
    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lr90/j;

    const/16 v17, 0xfff

    const/16 v18, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v3 .. v18}, Lr90/j;->b(Lr90/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/whoop/activation/domain/models/steps/TermExpansion;ZLjava/lang/String;Lr90/d;Lr90/i;ZZILjava/lang/Object;)Lr90/j;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lo70/c;->a(Ljava/util/List;)Lo70/c;

    move-result-object v0

    return-object v0
.end method

.method private final n(Lo70/c;Ljava/lang/String;)Lo70/c;
    .locals 19

    invoke-virtual/range {p1 .. p1}, Lo70/c;->b()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_0
    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lr90/j;

    invoke-virtual {v3}, Lr90/j;->h()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    move-object/from16 v5, p2

    invoke-static {v2, v5, v4}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v3}, Lr90/j;->l()Z

    move-result v2

    xor-int/lit8 v15, v2, 0x1

    const/16 v17, 0x17ff

    const/16 v18, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    invoke-static/range {v3 .. v18}, Lr90/j;->b(Lr90/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/whoop/activation/domain/models/steps/TermExpansion;ZLjava/lang/String;Lr90/d;Lr90/i;ZZILjava/lang/Object;)Lr90/j;

    move-result-object v3

    :cond_1
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lo70/c;->a(Ljava/util/List;)Lo70/c;

    move-result-object v0

    return-object v0
.end method

.method private final o(Lo70/c;)Lo70/c;
    .locals 19

    invoke-virtual/range {p1 .. p1}, Lo70/c;->b()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_0
    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lr90/j;

    const/16 v17, 0xfff

    const/16 v18, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x1

    invoke-static/range {v3 .. v18}, Lr90/j;->b(Lr90/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/whoop/activation/domain/models/steps/TermExpansion;ZLjava/lang/String;Lr90/d;Lr90/i;ZZILjava/lang/Object;)Lr90/j;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lo70/c;->a(Ljava/util/List;)Lo70/c;

    move-result-object v0

    return-object v0
.end method

.method private final p(Lo70/c;Ljava/lang/String;)Lo70/c;
    .locals 19

    invoke-virtual/range {p1 .. p1}, Lo70/c;->b()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_0
    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lr90/j;

    invoke-virtual {v3}, Lr90/j;->h()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    move-object/from16 v5, p2

    invoke-static {v2, v5, v4}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v14, Lr90/i;

    sget-object v2, Lo70/b$a;->a:Lo70/b$a;

    const/4 v4, 0x0

    const/4 v6, 0x2

    invoke-direct {v14, v2, v4, v6, v4}, Lr90/i;-><init>(Lo70/b;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v17, 0x1bff

    const/16 v18, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v3 .. v18}, Lr90/j;->b(Lr90/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/whoop/activation/domain/models/steps/TermExpansion;ZLjava/lang/String;Lr90/d;Lr90/i;ZZILjava/lang/Object;)Lr90/j;

    move-result-object v3

    :cond_1
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lo70/c;->a(Ljava/util/List;)Lo70/c;

    move-result-object v0

    return-object v0
.end method

.method private final q(Lo70/c;Ljava/lang/String;Lr90/i;)Lo70/c;
    .locals 19

    invoke-virtual/range {p1 .. p1}, Lo70/c;->b()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_0
    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lr90/j;

    invoke-virtual {v3}, Lr90/j;->h()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    move-object/from16 v5, p2

    invoke-static {v2, v5, v4}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-eqz v2, :cond_1

    const/16 v17, 0x1bff

    const/16 v18, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v14, p3

    invoke-static/range {v3 .. v18}, Lr90/j;->b(Lr90/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/whoop/activation/domain/models/steps/TermExpansion;ZLjava/lang/String;Lr90/d;Lr90/i;ZZILjava/lang/Object;)Lr90/j;

    move-result-object v3

    :cond_1
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lo70/c;->a(Ljava/util/List;)Lo70/c;

    move-result-object v0

    return-object v0
.end method

.method private final r(Ljava/lang/String;)Lr90/i;
    .locals 2

    sget-object v0, Lo70/b$b;->a:Lo70/b$b;

    new-instance v1, Lr90/i;

    invoke-direct {v1, v0, p1}, Lr90/i;-><init>(Lo70/b;Ljava/lang/String;)V

    return-object v1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 3
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

    new-instance v0, Lo70/c;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, v2}, Lo70/c;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lo70/a$c;

    invoke-direct {v1, p0, v2}, Lo70/a$c;-><init>(Lo70/a;Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v0, p1, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v2
.end method
