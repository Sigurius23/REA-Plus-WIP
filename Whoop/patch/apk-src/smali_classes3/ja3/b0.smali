.class public final Lja3/b0;
.super Ljava/lang/Object;

# interfaces
.implements Lub3/a;


# static fields
.field public static final w:Lja3/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lja3/b0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lja3/b0;->w:Lja3/b0;

    return-void
.end method


# virtual methods
.method public final r(Ljava/lang/Object;)Ljava/lang/Iterable;
    .locals 1

    check-cast p1, Lr93/e;

    sget v0, Lja3/d0;->p:I

    invoke-interface {p1}, Lr93/h;->e()Llb3/q0;

    move-result-object p1

    invoke-interface {p1}, Llb3/q0;->getSupertypes()Ljava/util/Collection;

    move-result-object p1

    const-string v0, "getSupertypes(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object p1

    sget-object v0, Lja3/m;->F:Lja3/m;

    invoke-static {p1, v0}, Lxb3/k;->B(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/f;

    move-result-object p1

    new-instance v0, Lxb3/l;

    invoke-direct {v0, p1}, Lxb3/l;-><init>(Lxb3/i;)V

    return-object v0
.end method
