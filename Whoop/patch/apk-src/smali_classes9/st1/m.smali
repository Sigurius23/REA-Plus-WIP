.class public final synthetic Lst1/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Ljava/util/Map;

.field public final synthetic F:Lkotlin/jvm/functions/Function3;

.field public final synthetic G:Lp1/c1;

.field public final synthetic w:Z

.field public final synthetic x:Lp1/t2;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lrt1/k;


# direct methods
.method public synthetic constructor <init>(ZLp1/t2;Lkotlin/jvm/functions/Function1;Lrt1/k;Lz1/s;Lkotlin/jvm/functions/Function3;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lst1/m;->w:Z

    iput-object p2, p0, Lst1/m;->x:Lp1/t2;

    iput-object p3, p0, Lst1/m;->y:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lst1/m;->z:Lrt1/k;

    iput-object p5, p0, Lst1/m;->E:Ljava/util/Map;

    iput-object p6, p0, Lst1/m;->F:Lkotlin/jvm/functions/Function3;

    iput-object p7, p0, Lst1/m;->G:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    iget-object v5, p0, Lst1/m;->F:Lkotlin/jvm/functions/Function3;

    iget-object v6, p0, Lst1/m;->G:Lp1/c1;

    iget-boolean v0, p0, Lst1/m;->w:Z

    iget-object v1, p0, Lst1/m;->x:Lp1/t2;

    iget-object v2, p0, Lst1/m;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lst1/m;->z:Lrt1/k;

    iget-object v4, p0, Lst1/m;->E:Ljava/util/Map;

    invoke-static/range {v0 .. v6}, Lst1/n;->a(ZLp1/t2;Lkotlin/jvm/functions/Function1;Lrt1/k;Ljava/util/Map;Lkotlin/jvm/functions/Function3;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0
.end method
