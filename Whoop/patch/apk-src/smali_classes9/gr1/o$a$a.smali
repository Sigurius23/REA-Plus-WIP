.class final Lgr1/o$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgr1/o$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lgr1/o;


# direct methods
.method public constructor <init>(Lgr1/o;)V
    .locals 0

    iput-object p1, p0, Lgr1/o$a$a;->w:Lgr1/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lcr1/b$g;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcr1/b$g;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcr1/b$c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lgr1/o$a$a;->w:Lgr1/o;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lgr1/o;->r(Lgr1/o;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lgr1/o$a$a;->w:Lgr1/o;

    invoke-static {v0}, Lgr1/o;->n(Lgr1/o;)Ldc3/l;

    move-result-object v0

    iget-object v1, p0, Lgr1/o$a$a;->w:Lgr1/o;

    invoke-static {v1, p1}, Lgr1/o;->p(Lgr1/o;Lcr1/b$g;)Lfr1/c;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Ldc3/x;->t(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcr1/b$g;

    invoke-virtual {p0, p1, p2}, Lgr1/o$a$a;->b(Lcr1/b$g;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
