.class final Ldy1/f$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldy1/f$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Ldy1/f;


# direct methods
.method public constructor <init>(Ldy1/f;)V
    .locals 0

    iput-object p1, p0, Ldy1/f$d$a;->w:Ldy1/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lc52/b;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc52/b;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p2, Lc52/b$f;->a:Lc52/b$f;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p1, p0, Ldy1/f$d$a;->w:Ldy1/f;

    invoke-static {p1}, Ldy1/f;->e(Ldy1/f;)Ldw/c;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Ldy1/f$d$a;->w:Ldy1/f;

    invoke-static {p1}, Ldy1/f;->a(Ldy1/f;)V

    :cond_0
    iget-object p1, p0, Ldy1/f$d$a;->w:Ldy1/f;

    invoke-static {p1}, Ldy1/f;->c(Ldy1/f;)V

    goto :goto_0

    :cond_1
    sget-object p2, Lc52/b$c;->a:Lc52/b$c;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Ldy1/f$d$a;->w:Ldy1/f;

    invoke-static {p1}, Ldy1/f;->l(Ldy1/f;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object p1, p0, Ldy1/f$d$a;->w:Ldy1/f;

    invoke-static {p1}, Ldy1/f;->n(Ldy1/f;)V

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lc52/b;

    invoke-virtual {p0, p1, p2}, Ldy1/f$d$a;->b(Lc52/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
