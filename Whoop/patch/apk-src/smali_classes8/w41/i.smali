.class public final synthetic Lw41/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Leu/g;

.field public final synthetic F:I

.field public final synthetic G:Lp1/c1;

.field public final synthetic H:Lp1/c1;

.field public final synthetic I:Lp1/c1;

.field public final synthetic w:Lw41/z$a;

.field public final synthetic x:Z

.field public final synthetic y:Lbc3/c0;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lw41/z$a;ZLbc3/c0;ZLeu/g;ILp1/c1;Lp1/c1;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw41/i;->w:Lw41/z$a;

    iput-boolean p2, p0, Lw41/i;->x:Z

    iput-object p3, p0, Lw41/i;->y:Lbc3/c0;

    iput-boolean p4, p0, Lw41/i;->z:Z

    iput-object p5, p0, Lw41/i;->E:Leu/g;

    iput p6, p0, Lw41/i;->F:I

    iput-object p7, p0, Lw41/i;->G:Lp1/c1;

    iput-object p8, p0, Lw41/i;->H:Lp1/c1;

    iput-object p9, p0, Lw41/i;->I:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    iget-object v7, p0, Lw41/i;->H:Lp1/c1;

    iget-object v8, p0, Lw41/i;->I:Lp1/c1;

    iget-object v0, p0, Lw41/i;->w:Lw41/z$a;

    iget-boolean v1, p0, Lw41/i;->x:Z

    iget-object v2, p0, Lw41/i;->y:Lbc3/c0;

    iget-boolean v3, p0, Lw41/i;->z:Z

    iget-object v4, p0, Lw41/i;->E:Leu/g;

    iget v5, p0, Lw41/i;->F:I

    iget-object v6, p0, Lw41/i;->G:Lp1/c1;

    invoke-static/range {v0 .. v8}, Lw41/k;->d(Lw41/z$a;ZLbc3/c0;ZLeu/g;ILp1/c1;Lp1/c1;Lp1/c1;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
