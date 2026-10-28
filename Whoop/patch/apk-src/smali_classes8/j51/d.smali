.class public final synthetic Lj51/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:F

.field public final synthetic w:Lj51/g;

.field public final synthetic x:Lp1/t2;

.field public final synthetic y:Lp1/z0;

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Lj51/g;Lp1/t2;Lp1/z0;FFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj51/d;->w:Lj51/g;

    iput-object p2, p0, Lj51/d;->x:Lp1/t2;

    iput-object p3, p0, Lj51/d;->y:Lp1/z0;

    iput p4, p0, Lj51/d;->z:F

    iput p5, p0, Lj51/d;->E:F

    iput p6, p0, Lj51/d;->F:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v5, p0, Lj51/d;->F:F

    move-object v6, p1

    check-cast v6, Lk2/e;

    iget-object v0, p0, Lj51/d;->w:Lj51/g;

    iget-object v1, p0, Lj51/d;->x:Lp1/t2;

    iget-object v2, p0, Lj51/d;->y:Lp1/z0;

    iget v3, p0, Lj51/d;->z:F

    iget v4, p0, Lj51/d;->E:F

    invoke-static/range {v0 .. v6}, Lj51/f;->a(Lj51/g;Lp1/t2;Lp1/z0;FFFLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
