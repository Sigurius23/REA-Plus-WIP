.class public final synthetic Ll1/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lm1/o;

.field public final synthetic F:Li93/j;

.field public final synthetic G:Ll1/y;

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:J

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Ll1/n3;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;JLkotlin/jvm/functions/Function1;Ll1/n3;Lm1/o;Li93/j;Ll1/y;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/j0;->w:Landroidx/compose/ui/Modifier;

    iput-wide p2, p0, Ll1/j0;->x:J

    iput-object p4, p0, Ll1/j0;->y:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Ll1/j0;->z:Ll1/n3;

    iput-object p6, p0, Ll1/j0;->E:Lm1/o;

    iput-object p7, p0, Ll1/j0;->F:Li93/j;

    iput-object p8, p0, Ll1/j0;->G:Ll1/y;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x7

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v9

    iget-object v0, p0, Ll1/j0;->w:Landroidx/compose/ui/Modifier;

    iget-wide v1, p0, Ll1/j0;->x:J

    iget-object v3, p0, Ll1/j0;->y:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Ll1/j0;->z:Ll1/n3;

    iget-object v5, p0, Ll1/j0;->E:Lm1/o;

    iget-object v6, p0, Ll1/j0;->F:Li93/j;

    iget-object v7, p0, Ll1/j0;->G:Ll1/y;

    invoke-static/range {v0 .. v9}, Ll1/f1;->n(Landroidx/compose/ui/Modifier;JLkotlin/jvm/functions/Function1;Ll1/n3;Lm1/o;Li93/j;Ll1/y;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
