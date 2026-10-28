.class final Lem1/a0$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lem1/a0$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lem1/a0;


# direct methods
.method public constructor <init>(Lem1/a0;)V
    .locals 0

    iput-object p1, p0, Lem1/a0$a$a;->w:Lem1/a0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lfn2/j;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfn2/j;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p1, p0, Lem1/a0$a$a;->w:Lem1/a0;

    invoke-static {p1}, Lem1/a0;->j(Lem1/a0;)Lfn2/c;

    move-result-object p1

    invoke-interface {p1}, Lfn2/c;->a()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lem1/a0$a$a;->w:Lem1/a0;

    invoke-virtual {p1}, Lem1/a0;->q()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lem1/a0$a$a;->w:Lem1/a0;

    invoke-static {p1}, Lem1/a0;->n(Lem1/a0;)Lc93/a;

    move-result-object p1

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lem1/a0$a$a;->w:Lem1/a0;

    invoke-virtual {p1}, Lem1/a0;->q()V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lem1/a0$a$a;->w:Lem1/a0;

    invoke-virtual {p1}, Lem1/a0;->w()V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfn2/j;

    invoke-virtual {p0, p1, p2}, Lem1/a0$a$a;->b(Lfn2/j;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
