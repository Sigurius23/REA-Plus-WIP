.class public final Lh/d;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Z

.field public final synthetic x:Lc93/a;

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public constructor <init>(ZLc93/a;II)V
    .locals 0

    iput-boolean p1, p0, Lh/d;->w:Z

    iput-object p2, p0, Lh/d;->x:Lc93/a;

    iput p3, p0, Lh/d;->y:I

    iput p4, p0, Lh/d;->z:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget p2, p0, Lh/d;->y:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget v0, p0, Lh/d;->z:I

    iget-object v1, p0, Lh/d;->x:Lc93/a;

    iget-boolean v2, p0, Lh/d;->w:Z

    invoke-static {v1, v2, p1, p2, v0}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
