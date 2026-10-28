.class public final synthetic Lq0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:Lb2/g;

.field public final synthetic G:Lh0/p3;

.field public final synthetic H:Z

.field public final synthetic I:Lt2/a;

.field public final synthetic J:Li0/n;

.field public final synthetic K:Lx1/b;

.field public final synthetic w:Lq0/b;

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Ll0/k1;

.field public final synthetic z:Lq0/e;


# direct methods
.method public synthetic constructor <init>(Lq0/b;Landroidx/compose/ui/Modifier;Ll0/k1;Lq0/e;FLb2/g;Lh0/p3;ZLt2/a;Li0/n;Lx1/b;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq0/k;->w:Lq0/b;

    iput-object p2, p0, Lq0/k;->x:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lq0/k;->y:Ll0/k1;

    iput-object p4, p0, Lq0/k;->z:Lq0/e;

    iput p5, p0, Lq0/k;->E:F

    iput-object p6, p0, Lq0/k;->F:Lb2/g;

    iput-object p7, p0, Lq0/k;->G:Lh0/p3;

    iput-boolean p8, p0, Lq0/k;->H:Z

    iput-object p9, p0, Lq0/k;->I:Lt2/a;

    iput-object p10, p0, Lq0/k;->J:Li0/n;

    iput-object p11, p0, Lq0/k;->K:Lx1/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v12

    iget-object v0, p0, Lq0/k;->w:Lq0/b;

    iget-object v1, p0, Lq0/k;->x:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Lq0/k;->y:Ll0/k1;

    iget-object v3, p0, Lq0/k;->z:Lq0/e;

    iget v4, p0, Lq0/k;->E:F

    iget-object v5, p0, Lq0/k;->F:Lb2/g;

    iget-object v6, p0, Lq0/k;->G:Lh0/p3;

    iget-boolean v7, p0, Lq0/k;->H:Z

    iget-object v8, p0, Lq0/k;->I:Lt2/a;

    iget-object v9, p0, Lq0/k;->J:Li0/n;

    iget-object v10, p0, Lq0/k;->K:Lx1/b;

    invoke-static/range {v0 .. v12}, Ldp/d;->e(Lq0/b;Landroidx/compose/ui/Modifier;Ll0/k1;Lq0/e;FLb2/g;Lh0/p3;ZLt2/a;Li0/n;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
