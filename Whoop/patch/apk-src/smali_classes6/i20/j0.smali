.class public final synthetic Li20/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:Z

.field public final synthetic G:Lx1/b;

.field public final synthetic H:Lc93/a;

.field public final synthetic I:Lc93/a;

.field public final synthetic J:Lkotlin/jvm/functions/Function1;

.field public final synthetic K:I

.field public final synthetic w:Ljava/util/List;

.field public final synthetic x:Z

.field public final synthetic y:Lg40/m3;

.field public final synthetic z:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;ZLg40/m3;Ljava/lang/Integer;JZLx1/b;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li20/j0;->w:Ljava/util/List;

    iput-boolean p2, p0, Li20/j0;->x:Z

    iput-object p3, p0, Li20/j0;->y:Lg40/m3;

    iput-object p4, p0, Li20/j0;->z:Ljava/lang/Integer;

    iput-wide p5, p0, Li20/j0;->E:J

    iput-boolean p7, p0, Li20/j0;->F:Z

    iput-object p8, p0, Li20/j0;->G:Lx1/b;

    iput-object p9, p0, Li20/j0;->H:Lc93/a;

    iput-object p10, p0, Li20/j0;->I:Lc93/a;

    iput-object p11, p0, Li20/j0;->J:Lkotlin/jvm/functions/Function1;

    iput p12, p0, Li20/j0;->K:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Li20/j0;->K:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v12

    iget-object v0, p0, Li20/j0;->w:Ljava/util/List;

    iget-boolean v1, p0, Li20/j0;->x:Z

    iget-object v2, p0, Li20/j0;->y:Lg40/m3;

    iget-object v3, p0, Li20/j0;->z:Ljava/lang/Integer;

    iget-wide v4, p0, Li20/j0;->E:J

    iget-boolean v6, p0, Li20/j0;->F:Z

    iget-object v7, p0, Li20/j0;->G:Lx1/b;

    iget-object v8, p0, Li20/j0;->H:Lc93/a;

    iget-object v9, p0, Li20/j0;->I:Lc93/a;

    iget-object v10, p0, Li20/j0;->J:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v12}, Li20/l1;->e(Ljava/util/List;ZLg40/m3;Ljava/lang/Integer;JZLx1/b;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
