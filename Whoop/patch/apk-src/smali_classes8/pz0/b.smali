.class public final synthetic Lpz0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lpz0/e;

.field public final synthetic F:Li2/t;

.field public final synthetic G:Lkotlin/jvm/functions/Function1;

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;ZZJLpz0/e;Li2/t;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpz0/b;->w:Landroidx/compose/ui/Modifier;

    iput-boolean p2, p0, Lpz0/b;->x:Z

    iput-boolean p3, p0, Lpz0/b;->y:Z

    iput-wide p4, p0, Lpz0/b;->z:J

    iput-object p6, p0, Lpz0/b;->E:Lpz0/e;

    iput-object p7, p0, Lpz0/b;->F:Li2/t;

    iput-object p8, p0, Lpz0/b;->G:Lkotlin/jvm/functions/Function1;

    iput p9, p0, Lpz0/b;->H:I

    iput p10, p0, Lpz0/b;->I:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-object v0, p0, Lpz0/b;->w:Landroidx/compose/ui/Modifier;

    iget-boolean v1, p0, Lpz0/b;->x:Z

    iget-boolean v2, p0, Lpz0/b;->y:Z

    iget-wide v3, p0, Lpz0/b;->z:J

    iget-object v5, p0, Lpz0/b;->E:Lpz0/e;

    iget-object v6, p0, Lpz0/b;->F:Li2/t;

    iget-object v7, p0, Lpz0/b;->G:Lkotlin/jvm/functions/Function1;

    iget v8, p0, Lpz0/b;->H:I

    iget v9, p0, Lpz0/b;->I:I

    invoke-static/range {v0 .. v11}, Lpz0/d;->a(Landroidx/compose/ui/Modifier;ZZJLpz0/e;Li2/t;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
