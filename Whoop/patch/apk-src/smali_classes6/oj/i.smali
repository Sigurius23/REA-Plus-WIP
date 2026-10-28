.class public final Loj/i;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lcom/amplitude/android/engagement/a;

.field public final synthetic F:Lp1/c1;

.field public final synthetic G:Lc93/a;

.field public final synthetic w:Lcom/amplitude/android/engagement/types/Nudge;

.field public final synthetic x:Z

.field public final synthetic y:Lb2/z;

.field public final synthetic z:I


# direct methods
.method public constructor <init>(Lcom/amplitude/android/engagement/types/Nudge;ZLb2/z;ILcom/amplitude/android/engagement/a;Lp1/c1;Lc93/a;)V
    .locals 0

    iput-object p1, p0, Loj/i;->w:Lcom/amplitude/android/engagement/types/Nudge;

    iput-boolean p2, p0, Loj/i;->x:Z

    iput-object p3, p0, Loj/i;->y:Lb2/z;

    iput p4, p0, Loj/i;->z:I

    iput-object p5, p0, Loj/i;->E:Lcom/amplitude/android/engagement/a;

    iput-object p6, p0, Loj/i;->F:Lp1/c1;

    iput-object p7, p0, Loj/i;->G:Lc93/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 p2, p2, 0xb

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    move-object p2, p1

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v1, Loj/h;

    iget-object v7, p0, Loj/i;->F:Lp1/c1;

    iget-object v8, p0, Loj/i;->G:Lc93/a;

    iget-object v2, p0, Loj/i;->w:Lcom/amplitude/android/engagement/types/Nudge;

    iget-boolean v3, p0, Loj/i;->x:Z

    iget-object v4, p0, Loj/i;->y:Lb2/z;

    iget v5, p0, Loj/i;->z:I

    iget-object v6, p0, Loj/i;->E:Lcom/amplitude/android/engagement/a;

    invoke-direct/range {v1 .. v8}, Loj/h;-><init>(Lcom/amplitude/android/engagement/types/Nudge;ZLb2/z;ILcom/amplitude/android/engagement/a;Lp1/c1;Lc93/a;)V

    const p2, 0x1f7cfc40

    invoke-static {p2, p1, v1}, Lx1/c;->b(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object p2

    const/4 v0, 0x6

    invoke-static {p2, p1, v0}, Lx43/j;->k(Lx1/b;Landroidx/compose/runtime/Composer;I)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
