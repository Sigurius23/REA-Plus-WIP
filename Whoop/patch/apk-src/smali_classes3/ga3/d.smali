.class public final Lga3/d;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final w:Lga3/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lga3/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lga3/d;->w:Lga3/d;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lr93/b0;

    sget-object v0, Lga3/e;->a:Ljava/lang/Object;

    const-string v0, "module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lga3/c;->b:Lva3/h;

    invoke-interface {p1}, Lr93/b0;->c()Lo93/h;

    move-result-object p1

    sget-object v1, Lo93/m;->t:Lva3/e;

    invoke-virtual {p1, v1}, Lo93/h;->j(Lva3/e;)Lr93/e;

    move-result-object p1

    invoke-static {v0, p1}, Lbi/g;->C(Lva3/h;Lr93/e;)Lr93/a1;

    move-result-object p1

    if-eqz p1, :cond_1

    check-cast p1, Lu93/x0;

    invoke-virtual {p1}, Lu93/x0;->getType()Llb3/y;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    :cond_1
    :goto_0
    sget-object p1, Lnb3/k;->c0:Lnb3/k;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    invoke-static {p1, v0}, Lnb3/l;->c(Lnb3/k;[Ljava/lang/String;)Lnb3/i;

    move-result-object p1

    return-object p1
.end method
