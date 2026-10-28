.class final Lg12/e$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg12/e;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
.field final synthetic w:Lg12/e;


# direct methods
.method public constructor <init>(Lg12/e;)V
    .locals 0

    iput-object p1, p0, Lg12/e$d;->w:Lg12/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lf12/b;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf12/b;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lf12/b$b;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-eqz v0, :cond_1

    iget-object p1, p0, Lg12/e$d;->w:Lg12/e;

    invoke-static {p1}, Lg12/e;->c(Lg12/e;)Lec3/o1;

    move-result-object p1

    sget-object v0, Lg12/c$c;->a:Lg12/c$c;

    invoke-interface {p1, v0, p2}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    return-object v1

    :cond_1
    instance-of p1, p1, Lf12/b$a;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lg12/e$d;->w:Lg12/e;

    invoke-static {p1}, Lg12/e;->c(Lg12/e;)Lec3/o1;

    move-result-object p1

    sget-object v0, Lg12/c$b;->a:Lg12/c$b;

    invoke-interface {p1, v0, p2}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    return-object v1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lf12/b;

    invoke-virtual {p0, p1, p2}, Lg12/e$d;->b(Lf12/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
