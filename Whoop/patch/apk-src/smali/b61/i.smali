.class public final synthetic Lb61/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Lj71/c;

.field public final synthetic F:Lp1/c1;

.field public final synthetic G:Lp1/c1;

.field public final synthetic w:Lj71/c;

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lp1/c1;

.field public final synthetic z:Lj71/c;


# direct methods
.method public synthetic constructor <init>(Lj71/c;Lkotlin/jvm/functions/Function1;Lp1/c1;Lj71/c;Lj71/c;Lp1/c1;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb61/i;->w:Lj71/c;

    iput-object p2, p0, Lb61/i;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lb61/i;->y:Lp1/c1;

    iput-object p4, p0, Lb61/i;->z:Lj71/c;

    iput-object p5, p0, Lb61/i;->E:Lj71/c;

    iput-object p6, p0, Lb61/i;->F:Lp1/c1;

    iput-object p7, p0, Lb61/i;->G:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    iget-object v5, p0, Lb61/i;->F:Lp1/c1;

    iget-object v6, p0, Lb61/i;->G:Lp1/c1;

    iget-object v0, p0, Lb61/i;->w:Lj71/c;

    iget-object v1, p0, Lb61/i;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lb61/i;->y:Lp1/c1;

    iget-object v3, p0, Lb61/i;->z:Lj71/c;

    iget-object v4, p0, Lb61/i;->E:Lj71/c;

    invoke-static/range {v0 .. v6}, Lb61/k;->f(Lj71/c;Lkotlin/jvm/functions/Function1;Lp1/c1;Lj71/c;Lj71/c;Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0
.end method
