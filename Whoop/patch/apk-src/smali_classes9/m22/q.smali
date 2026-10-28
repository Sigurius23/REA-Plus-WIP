.class public final synthetic Lm22/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lp1/z0;

.field public final synthetic F:Lp1/z0;

.field public final synthetic w:F

.field public final synthetic x:Ld0/e;

.field public final synthetic y:Lbc3/c0;

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lbc3/c0;Ld0/e;FLp1/z0;Lp1/z0;Lc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lm22/q;->w:F

    iput-object p2, p0, Lm22/q;->x:Ld0/e;

    iput-object p1, p0, Lm22/q;->y:Lbc3/c0;

    iput-object p6, p0, Lm22/q;->z:Lc93/a;

    iput-object p4, p0, Lm22/q;->E:Lp1/z0;

    iput-object p5, p0, Lm22/q;->F:Lp1/z0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    move-object v6, p1

    check-cast v6, Lu2/r;

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result v7

    iget v0, p0, Lm22/q;->w:F

    iget-object v1, p0, Lm22/q;->x:Ld0/e;

    iget-object v2, p0, Lm22/q;->y:Lbc3/c0;

    iget-object v3, p0, Lm22/q;->z:Lc93/a;

    iget-object v4, p0, Lm22/q;->E:Lp1/z0;

    iget-object v5, p0, Lm22/q;->F:Lp1/z0;

    invoke-static/range {v0 .. v7}, Lm22/s$a;->a(FLd0/e;Lbc3/c0;Lc93/a;Lp1/z0;Lp1/z0;Lu2/r;F)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
