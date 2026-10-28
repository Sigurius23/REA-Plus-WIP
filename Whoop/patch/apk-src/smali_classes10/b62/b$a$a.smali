.class final Lb62/b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb62/b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lb62/b;


# direct methods
.method public constructor <init>(Lb62/b;)V
    .locals 0

    iput-object p1, p0, Lb62/b$a$a;->w:Lb62/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lc62/c;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc62/c;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lb62/b$a$a;->w:Lb62/b;

    invoke-static {v0}, Lb62/b;->n(Lb62/b;)Lec3/p1;

    move-result-object v0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v0, p1}, Lb62/c;->a(ZLc62/c;)Lcom/whoop/navigation/e;

    move-result-object v0

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-eqz v0, :cond_1

    iget-object p1, p0, Lb62/b$a$a;->w:Lb62/b;

    invoke-static {p1}, Lb62/b;->o(Lb62/b;)Lec3/p1;

    move-result-object v2

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {p1}, Lb62/b;->o(Lb62/b;)Lec3/p1;

    move-result-object v2

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x0

    invoke-virtual {v2, v4, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-static {p1}, Lb62/b;->p(Lb62/b;)Lec3/o1;

    move-result-object p1

    invoke-interface {p1, v0, p2}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    return-object v1

    :cond_1
    iget-object p2, p0, Lb62/b$a$a;->w:Lb62/b;

    invoke-static {p2}, Lb62/b;->n(Lb62/b;)Lec3/p1;

    move-result-object p2

    check-cast p2, Lec3/h2;

    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {p2, p1}, Lb62/c;->b(ZLc62/c;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lb62/b$a$a;->w:Lb62/b;

    invoke-virtual {p1}, Lb62/b;->v()V

    :cond_2
    return-object v1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lc62/c;

    invoke-virtual {p0, p1, p2}, Lb62/b$a$a;->b(Lc62/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
