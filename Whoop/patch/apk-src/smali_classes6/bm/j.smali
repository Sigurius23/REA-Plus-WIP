.class public final Lbm/j;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:I

.field public final synthetic x:Lbm/a;

.field public final synthetic y:Lx1/b;

.field public final synthetic z:Lbm/n;


# direct methods
.method public constructor <init>(ILbm/a;Lx1/b;Lbm/n;I)V
    .locals 0

    iput p1, p0, Lbm/j;->w:I

    iput-object p2, p0, Lbm/j;->x:Lbm/a;

    iput-object p3, p0, Lbm/j;->y:Lx1/b;

    iput-object p4, p0, Lbm/j;->z:Lbm/n;

    iput p5, p0, Lbm/j;->E:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    check-cast p1, Ln0/q;

    const-string v0, "$this$LazyRow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbm/i;

    iget-object v1, p0, Lbm/j;->z:Lbm/n;

    iget v2, p0, Lbm/j;->E:I

    iget-object v3, p0, Lbm/j;->x:Lbm/a;

    iget-object v4, p0, Lbm/j;->y:Lx1/b;

    invoke-direct {v0, v3, v4, v1, v2}, Lbm/i;-><init>(Lbm/a;Lx1/b;Lbm/n;I)V

    new-instance v1, Lx1/b;

    const/4 v2, 0x1

    const v3, -0x434ab74

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const/4 v0, 0x4

    iget v2, p0, Lbm/j;->w:I

    const/4 v3, 0x0

    invoke-static {p1, v2, v3, v1, v0}, Ln0/q;->a(Ln0/q;ILkotlin/jvm/functions/Function1;Lc93/n;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
