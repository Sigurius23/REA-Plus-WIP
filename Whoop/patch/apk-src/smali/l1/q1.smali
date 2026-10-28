.class public final synthetic Ll1/q1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:Ln2/a;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/q1;->w:Ln2/a;

    iput-object p2, p0, Ll1/q1;->x:Ljava/lang/String;

    iput-object p3, p0, Ll1/q1;->y:Landroidx/compose/ui/Modifier;

    iput-wide p4, p0, Ll1/q1;->z:J

    iput p6, p0, Ll1/q1;->E:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Ll1/q1;->E:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v6

    iget-object v0, p0, Ll1/q1;->w:Ln2/a;

    iget-object v1, p0, Ll1/q1;->x:Ljava/lang/String;

    iget-object v2, p0, Ll1/q1;->y:Landroidx/compose/ui/Modifier;

    iget-wide v3, p0, Ll1/q1;->z:J

    invoke-static/range {v0 .. v6}, Ll1/r1;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
