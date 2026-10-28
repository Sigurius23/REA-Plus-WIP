.class public final synthetic Lt81/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic F:Lp1/c1;

.field public final synthetic G:Lp1/c1;

.field public final synthetic H:Lp1/c1;

.field public final synthetic w:Lt81/r;

.field public final synthetic x:Lf0/r1;

.field public final synthetic y:Lp1/z0;

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lt81/r;Lf0/r1;Lp1/z0;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt81/n;->w:Lt81/r;

    iput-object p2, p0, Lt81/n;->x:Lf0/r1;

    iput-object p3, p0, Lt81/n;->y:Lp1/z0;

    iput-object p4, p0, Lt81/n;->z:Lp1/c1;

    iput-object p5, p0, Lt81/n;->E:Lp1/c1;

    iput-object p6, p0, Lt81/n;->F:Lp1/c1;

    iput-object p7, p0, Lt81/n;->G:Lp1/c1;

    iput-object p8, p0, Lt81/n;->H:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v7, p0, Lt81/n;->H:Lp1/c1;

    move-object v8, p1

    check-cast v8, Lh2/b;

    iget-object v0, p0, Lt81/n;->w:Lt81/r;

    iget-object v1, p0, Lt81/n;->x:Lf0/r1;

    iget-object v2, p0, Lt81/n;->y:Lp1/z0;

    iget-object v3, p0, Lt81/n;->z:Lp1/c1;

    iget-object v4, p0, Lt81/n;->E:Lp1/c1;

    iget-object v5, p0, Lt81/n;->F:Lp1/c1;

    iget-object v6, p0, Lt81/n;->G:Lp1/c1;

    invoke-static/range {v0 .. v8}, Lt81/l$c;->b(Lt81/r;Lf0/r1;Lp1/z0;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lh2/b;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
