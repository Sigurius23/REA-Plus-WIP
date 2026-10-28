.class public final Loj/t;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# static fields
.field public static final w:Loj/t;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Loj/t;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/m;-><init>(I)V

    sput-object v0, Loj/t;->w:Loj/t;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Li2/s0;

    check-cast p2, Lh2/e;

    iget-wide v0, p2, Lh2/e;->a:J

    check-cast p3, Ly3/m;

    const-string p2, "$this$$receiver"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "<anonymous parameter 1>"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lh2/e;->e(J)F

    move-result p2

    const/high16 p3, 0x40000000    # 2.0f

    div-float/2addr p2, p3

    invoke-static {v0, v1}, Lh2/e;->c(J)F

    move-result p3

    check-cast p1, Li2/j;

    invoke-virtual {p1, p2, p3}, Li2/j;->i(FF)V

    const/4 p2, 0x0

    invoke-virtual {p1, p2, p2}, Li2/j;->h(FF)V

    invoke-static {v0, v1}, Lh2/e;->e(J)F

    move-result p3

    invoke-virtual {p1, p3, p2}, Li2/j;->h(FF)V

    invoke-virtual {p1}, Li2/j;->f()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
