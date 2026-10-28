.class public final synthetic Lm22/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Lp1/z0;

.field public final synthetic w:Lbc3/c0;

.field public final synthetic x:Ld0/e;

.field public final synthetic y:F

.field public final synthetic z:Lp1/z0;


# direct methods
.method public synthetic constructor <init>(Lbc3/c0;Ld0/e;FLp1/z0;Lp1/z0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm22/p;->w:Lbc3/c0;

    iput-object p2, p0, Lm22/p;->x:Ld0/e;

    iput p3, p0, Lm22/p;->y:F

    iput-object p4, p0, Lm22/p;->z:Lp1/z0;

    iput-object p5, p0, Lm22/p;->E:Lp1/z0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lm22/p;->z:Lp1/z0;

    iget-object v1, p0, Lm22/p;->E:Lp1/z0;

    iget-object v2, p0, Lm22/p;->w:Lbc3/c0;

    iget-object v3, p0, Lm22/p;->x:Ld0/e;

    iget v4, p0, Lm22/p;->y:F

    invoke-static {v2, v3, v4, v0, v1}, Lm22/s$a;->b(Lbc3/c0;Ld0/e;FLp1/z0;Lp1/z0;)Ll83/a0;

    move-result-object v0

    return-object v0
.end method
