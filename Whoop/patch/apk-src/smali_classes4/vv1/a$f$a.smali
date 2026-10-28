.class final Lvv1/a$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvv1/a$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lvv1/a;


# direct methods
.method public constructor <init>(Lvv1/a;)V
    .locals 0

    iput-object p1, p0, Lvv1/a$f$a;->w:Lvv1/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ZLq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lvv1/a$f$a;->w:Lvv1/a;

    invoke-static {p1}, Lvv1/a;->h(Lvv1/a;)Lec3/p1;

    move-result-object p1

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lvv1/e;

    invoke-virtual {v1}, Lvv1/e;->e()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lvv1/a$f$a;->w:Lvv1/a;

    invoke-static {p1}, Lvv1/a;->h(Lvv1/a;)Lec3/p1;

    move-result-object p1

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lvv1/e;->b(Lvv1/e;Lzv1/a;ZZILjava/lang/Object;)Lvv1/e;

    move-result-object v1

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, v1, p2}, Lec3/h2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    :cond_0
    return-object v0
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1, p2}, Lvv1/a$f$a;->b(ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
