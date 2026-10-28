.class public final Lja3/c0;
.super Ls9/f;
.source "SourceFile"


# instance fields
.field public final synthetic w:Lr93/e;

.field public final synthetic x:Ljava/util/Set;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lr93/e;Ljava/util/Set;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lja3/c0;->w:Lr93/e;

    iput-object p2, p0, Lja3/c0;->x:Ljava/util/Set;

    iput-object p3, p0, Lja3/c0;->y:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;)Z
    .locals 1

    check-cast p1, Lr93/e;

    const-string v0, "current"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lja3/c0;->w:Lr93/e;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lr93/e;->V()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object p1

    const-string v0, "getStaticScope(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lja3/e0;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lja3/c0;->y:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    iget-object v0, p0, Lja3/c0;->x:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final bridge synthetic y()Ljava/lang/Object;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
