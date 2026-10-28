.class final Ldy1/d$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldy1/d$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Ldy1/d;


# direct methods
.method public constructor <init>(Ldy1/d;)V
    .locals 0

    iput-object p1, p0, Ldy1/d$d$a;->w:Ldy1/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lst0/f;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lst0/f;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lst0/n;->a:Lst0/n;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-eqz v0, :cond_0

    iget-object p1, p0, Ldy1/d$d$a;->w:Ldy1/d;

    invoke-static {p1}, Ldy1/d;->r(Ldy1/d;)V

    goto :goto_0

    :cond_0
    sget-object v0, Lst0/g;->a:Lst0/g;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Ldy1/d$d$a;->w:Ldy1/d;

    invoke-static {p1}, Ldy1/d;->a(Ldy1/d;)Lec3/o1;

    move-result-object p1

    invoke-interface {p1, v1, p2}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    :goto_0
    return-object v1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lst0/f;

    invoke-virtual {p0, p1, p2}, Ldy1/d$d$a;->b(Lst0/f;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
