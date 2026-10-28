.class final Lm91/c$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm91/c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lz1/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lz1/p;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lz1/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz1/p;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lm91/c$b$a;->w:Lz1/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Lm91/d;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lm91/c$b$a;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(Lm91/a;)Z
    .locals 0

    invoke-static {p0}, Lm91/c$b$a;->f(Lm91/a;)Z

    move-result p0

    return p0
.end method

.method private static final f(Lm91/a;)Z
    .locals 1

    const-string v0, "item"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm91/a;->f()Lm91/e0;

    move-result-object p0

    sget-object v0, Lm91/e0;->Invisible:Lm91/e0;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final e(Lm91/a;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm91/a<",
            "TK;TV;>;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-eqz p1, :cond_0

    iget-object p1, p0, Lm91/c$b$a;->w:Lz1/p;

    new-instance p2, Lm91/d;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, Lm91/d;-><init>(I)V

    new-instance v0, Lm91/e;

    invoke-direct {v0, p2}, Lm91/e;-><init>(Lm91/d;)V

    invoke-interface {p1, v0}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm91/a;

    invoke-virtual {p0, p1, p2}, Lm91/c$b$a;->e(Lm91/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
