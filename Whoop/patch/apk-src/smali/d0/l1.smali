.class public final synthetic Ld0/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ld0/m;

.field public final synthetic F:F

.field public final synthetic G:Lkotlin/jvm/functions/Function1;

.field public final synthetic w:Lkotlin/jvm/internal/g0;

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ld0/h;

.field public final synthetic z:Ld0/r;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/g0;Ljava/lang/Object;Ld0/h;Ld0/r;Ld0/m;FLkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/l1;->w:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Ld0/l1;->x:Ljava/lang/Object;

    iput-object p3, p0, Ld0/l1;->y:Ld0/h;

    iput-object p4, p0, Ld0/l1;->z:Ld0/r;

    iput-object p5, p0, Ld0/l1;->E:Ld0/m;

    iput p6, p0, Ld0/l1;->F:F

    iput-object p7, p0, Ld0/l1;->G:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    new-instance v0, Ld0/k;

    iget-object p1, p0, Ld0/l1;->y:Ld0/h;

    move-wide v4, v1

    invoke-interface {p1}, Ld0/h;->e()Ld0/f2;

    move-result-object v2

    invoke-interface {p1}, Ld0/h;->g()Ljava/lang/Object;

    move-result-object v6

    new-instance v9, Ld0/m1;

    const/4 v1, 0x1

    iget-object v10, p0, Ld0/l1;->E:Ld0/m;

    invoke-direct {v9, v1, v10}, Ld0/m1;-><init>(ILd0/m;)V

    iget-object v1, p0, Ld0/l1;->x:Ljava/lang/Object;

    iget-object v3, p0, Ld0/l1;->z:Ld0/r;

    move-wide v7, v4

    invoke-direct/range {v0 .. v9}, Ld0/k;-><init>(Ljava/lang/Object;Ld0/f2;Ld0/r;JLjava/lang/Object;JLc93/a;)V

    iget v3, p0, Ld0/l1;->F:F

    iget-object v6, p0, Ld0/l1;->G:Lkotlin/jvm/functions/Function1;

    move-wide v1, v4

    move-object v5, v10

    move-object v4, p1

    invoke-static/range {v0 .. v6}, Ld0/f;->n(Ld0/k;JFLd0/h;Ld0/m;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, p0, Ld0/l1;->w:Lkotlin/jvm/internal/g0;

    iput-object v0, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
