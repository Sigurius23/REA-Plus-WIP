.class final Lpq0/f$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpq0/f$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lpq0/f;

.field final synthetic x:Ljava/lang/String;

.field final synthetic y:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lpq0/f;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lpq0/f$c$a;->w:Lpq0/f;

    iput-object p2, p0, Lpq0/f$c$a;->x:Ljava/lang/String;

    iput-object p3, p0, Lpq0/f$c$a;->y:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Li92/h;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li92/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Li92/h;->a()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p1, p0, Lpq0/f$c$a;->w:Lpq0/f;

    iget-object p2, p0, Lpq0/f$c$a;->x:Ljava/lang/String;

    iget-object v0, p0, Lpq0/f$c$a;->y:Ljava/lang/String;

    invoke-static {p1, p2, v0}, Lpq0/f;->w(Lpq0/f;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lpq0/f$c$a;->w:Lpq0/f;

    invoke-virtual {p2}, Lpq0/f;->G()Landroidx/lifecycle/p0;

    move-result-object v0

    new-instance v1, Lpq0/i;

    invoke-virtual {p1}, Li92/h;->a()Z

    move-result v5

    sget-object p1, Lpq0/g;->g:Lpq0/g$a;

    invoke-virtual {p1}, Lpq0/g$a;->b()Lpq0/g;

    move-result-object v6

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v8}, Lpq0/i;-><init>(Ljava/util/List;Ll83/k;ZZLpq0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p2, v0, v1}, Lpq0/f;->C(Lpq0/f;Landroidx/lifecycle/p0;Ljava/lang/Object;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li92/h;

    invoke-virtual {p0, p1, p2}, Lpq0/f$c$a;->b(Li92/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
