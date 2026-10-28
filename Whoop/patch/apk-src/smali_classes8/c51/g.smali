.class public final synthetic Lc51/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Lp1/c1;

.field public final synthetic w:Ly3/c;

.field public final synthetic x:Ljava/util/ArrayList;

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Ly3/c;Ljava/util/ArrayList;IIILp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc51/g;->w:Ly3/c;

    iput-object p2, p0, Lc51/g;->x:Ljava/util/ArrayList;

    iput p3, p0, Lc51/g;->y:I

    iput p4, p0, Lc51/g;->z:I

    iput p5, p0, Lc51/g;->E:I

    iput-object p6, p0, Lc51/g;->F:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    iget v4, p0, Lc51/g;->E:I

    iget-object v5, p0, Lc51/g;->F:Lp1/c1;

    iget-object v0, p0, Lc51/g;->w:Ly3/c;

    iget-object v1, p0, Lc51/g;->x:Ljava/util/ArrayList;

    iget v2, p0, Lc51/g;->y:I

    iget v3, p0, Lc51/g;->z:I

    invoke-static/range {v0 .. v5}, Lc51/k;->h(Ly3/c;Ljava/util/ArrayList;IIILp1/c1;)Li2/s0;

    move-result-object v0

    return-object v0
.end method
