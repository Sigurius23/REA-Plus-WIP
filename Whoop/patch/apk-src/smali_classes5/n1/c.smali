.class public final synthetic Ln1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:J

.field public final synthetic G:F

.field public final synthetic w:Ln1/g;

.field public final synthetic x:Ln1/o;

.field public final synthetic y:Z

.field public final synthetic z:Landroidx/compose/ui/Modifier;


# direct methods
.method public synthetic constructor <init>(Ln1/g;Ln1/o;ZLandroidx/compose/ui/Modifier;JJFI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln1/c;->w:Ln1/g;

    iput-object p2, p0, Ln1/c;->x:Ln1/o;

    iput-boolean p3, p0, Ln1/c;->y:Z

    iput-object p4, p0, Ln1/c;->z:Landroidx/compose/ui/Modifier;

    iput-wide p5, p0, Ln1/c;->E:J

    iput-wide p7, p0, Ln1/c;->F:J

    iput p9, p0, Ln1/c;->G:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v10

    iget-object v0, p0, Ln1/c;->w:Ln1/g;

    iget-object v1, p0, Ln1/c;->x:Ln1/o;

    iget-boolean v2, p0, Ln1/c;->y:Z

    iget-object v3, p0, Ln1/c;->z:Landroidx/compose/ui/Modifier;

    iget-wide v4, p0, Ln1/c;->E:J

    iget-wide v6, p0, Ln1/c;->F:J

    iget v8, p0, Ln1/c;->G:F

    invoke-virtual/range {v0 .. v10}, Ln1/g;->a(Ln1/o;ZLandroidx/compose/ui/Modifier;JJFLandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
