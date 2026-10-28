.class public final Lhb3/u;
.super Ljava/lang/Object;

# interfaces
.implements Lc93/a;


# instance fields
.field public final E:I

.field public final F:Lqa3/e1;

.field public final w:Lhb3/x;

.field public final x:Lhb3/a0;

.field public final y:Lwa3/v;

.field public final z:I


# direct methods
.method public constructor <init>(Lhb3/x;Lhb3/a0;Lwa3/v;IILqa3/e1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhb3/u;->w:Lhb3/x;

    iput-object p2, p0, Lhb3/u;->x:Lhb3/a0;

    iput-object p3, p0, Lhb3/u;->y:Lwa3/v;

    iput p4, p0, Lhb3/u;->z:I

    iput p5, p0, Lhb3/u;->E:I

    iput-object p6, p0, Lhb3/u;->F:Lqa3/e1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lhb3/u;->w:Lhb3/x;

    iget-object v0, v0, Lhb3/x;->a:Lhb3/k;

    iget-object v0, v0, Lhb3/k;->a:Lhb3/i;

    iget-object v1, v0, Lhb3/i;->e:Lhb3/a;

    iget-object v2, p0, Lhb3/u;->x:Lhb3/a0;

    iget-object v3, p0, Lhb3/u;->y:Lwa3/v;

    iget v4, p0, Lhb3/u;->z:I

    iget v5, p0, Lhb3/u;->E:I

    iget-object v6, p0, Lhb3/u;->F:Lqa3/e1;

    invoke-interface/range {v1 .. v6}, Lhb3/c;->w(Lhb3/a0;Lwa3/v;IILqa3/e1;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
