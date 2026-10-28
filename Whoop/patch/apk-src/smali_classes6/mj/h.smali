.class public final Lmj/h;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:J

.field public final synthetic x:Lcom/amplitude/android/engagement/types/DebugStatus;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:Lc93/a;


# direct methods
.method public constructor <init>(JLcom/amplitude/android/engagement/types/DebugStatus;Landroidx/compose/ui/Modifier;Lc93/a;I)V
    .locals 0

    iput-wide p1, p0, Lmj/h;->w:J

    iput-object p3, p0, Lmj/h;->x:Lcom/amplitude/android/engagement/types/DebugStatus;

    iput-object p4, p0, Lmj/h;->y:Landroidx/compose/ui/Modifier;

    iput-object p5, p0, Lmj/h;->z:Lc93/a;

    iput p6, p0, Lmj/h;->E:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget p1, p0, Lmj/h;->E:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v6

    iget-wide v0, p0, Lmj/h;->w:J

    iget-object v2, p0, Lmj/h;->x:Lcom/amplitude/android/engagement/types/DebugStatus;

    iget-object v3, p0, Lmj/h;->y:Landroidx/compose/ui/Modifier;

    iget-object v4, p0, Lmj/h;->z:Lc93/a;

    invoke-static/range {v0 .. v6}, Ldp/d;->j(JLcom/amplitude/android/engagement/types/DebugStatus;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
