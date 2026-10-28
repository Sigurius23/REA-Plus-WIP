.class final Lch0/n$k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lch0/n$k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lz1/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lz1/s;"
        }
    .end annotation
.end field

.field final synthetic x:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field final synthetic y:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic z:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lz1/s;Lp1/t2;Lp1/c1;Lp1/c1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz1/s;",
            "Lp1/t2;",
            "Lp1/c1;",
            "Lp1/c1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lch0/n$k$a;->w:Lz1/s;

    iput-object p2, p0, Lch0/n$k$a;->x:Lp1/t2;

    iput-object p3, p0, Lch0/n$k$a;->y:Lp1/c1;

    iput-object p4, p0, Lch0/n$k$a;->z:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ILq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p1, p0, Lch0/n$k$a;->z:Lp1/c1;

    iget-object p2, p0, Lch0/n$k$a;->x:Lp1/t2;

    invoke-static {p2}, Lch0/n;->b0(Lp1/t2;)Lzg0/i;

    move-result-object p2

    invoke-virtual {p2}, Lzg0/i;->f()Lzg0/f;

    move-result-object p2

    invoke-virtual {p2}, Lzg0/f;->e()Ljava/util/List;

    move-result-object p2

    iget-object v0, p0, Lch0/n$k$a;->w:Lz1/s;

    iget-object v1, p0, Lch0/n$k$a;->y:Lp1/c1;

    invoke-static {v1}, Lch0/n;->h0(Lp1/c1;)F

    move-result v1

    invoke-static {p2, v0, v1}, Lch0/t0;->b(Ljava/util/List;Ljava/util/Map;F)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lch0/n;->d0(Lp1/c1;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1, p2}, Lch0/n$k$a;->b(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
