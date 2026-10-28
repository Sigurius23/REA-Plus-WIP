.class public final synthetic Lg1/p5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Lc93/a;

.field public final synthetic w:Z

.field public final synthetic x:Li93/f;

.field public final synthetic y:I

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(ZLi93/f;IFLkotlin/jvm/functions/Function1;Lc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lg1/p5;->w:Z

    iput-object p2, p0, Lg1/p5;->x:Li93/f;

    iput p3, p0, Lg1/p5;->y:I

    iput p4, p0, Lg1/p5;->z:F

    iput-object p5, p0, Lg1/p5;->E:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lg1/p5;->F:Lc93/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    check-cast p1, Li3/z;

    iget-boolean v0, p0, Lg1/p5;->w:Z

    if-nez v0, :cond_0

    invoke-static {p1}, Li3/w;->a(Li3/z;)V

    :cond_0
    new-instance v1, Lg1/g;

    iget-object v2, p0, Lg1/p5;->x:Li93/f;

    iget v3, p0, Lg1/p5;->y:I

    iget v4, p0, Lg1/p5;->z:F

    iget-object v5, p0, Lg1/p5;->E:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lg1/p5;->F:Lc93/a;

    invoke-direct/range {v1 .. v6}, Lg1/g;-><init>(Li93/f;IFLkotlin/jvm/functions/Function1;Lc93/a;)V

    sget-object v0, Li3/w;->a:[Lj93/z;

    sget-object v0, Li3/k;->h:Li3/y;

    new-instance v2, Li3/a;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v1}, Li3/a;-><init>(Ljava/lang/String;Ll83/e;)V

    check-cast p1, Li3/l;

    invoke-virtual {p1, v0, v2}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
