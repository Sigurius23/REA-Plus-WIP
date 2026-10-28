.class final Lev2/u$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lev2/u$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Ln0/u;

.field final synthetic x:Ln0/u;


# direct methods
.method public constructor <init>(Ln0/u;Ln0/u;)V
    .locals 0

    iput-object p1, p0, Lev2/u$b$a;->w:Ln0/u;

    iput-object p2, p0, Lev2/u$b$a;->x:Ln0/u;

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

    iget-object p1, p0, Lev2/u$b$a;->w:Ln0/u;

    iget-object v0, p0, Lev2/u$b$a;->x:Ln0/u;

    iget-object v0, v0, Ln0/u;->e:Ll2/a;

    iget-object v0, v0, Ll2/a;->b:Ljava/lang/Object;

    check-cast v0, Lp1/h1;

    invoke-virtual {v0}, Lp1/h1;->x()I

    move-result v0

    iget-object v1, p0, Lev2/u$b$a;->x:Ln0/u;

    iget-object v1, v1, Ln0/u;->e:Ll2/a;

    iget-object v1, v1, Ll2/a;->c:Ljava/lang/Object;

    check-cast v1, Lp1/h1;

    invoke-virtual {v1}, Lp1/h1;->x()I

    move-result v1

    invoke-virtual {p1, v0, v1, p2}, Ln0/u;->j(IILq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1, p2}, Lev2/u$b$a;->b(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
