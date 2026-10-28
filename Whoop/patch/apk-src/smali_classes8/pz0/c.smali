.class public final synthetic Lpz0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Li2/t;

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic G:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;ZZJLi2/t;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpz0/c;->w:Landroidx/compose/ui/Modifier;

    iput-boolean p2, p0, Lpz0/c;->x:Z

    iput-boolean p3, p0, Lpz0/c;->y:Z

    iput-wide p4, p0, Lpz0/c;->z:J

    iput-object p6, p0, Lpz0/c;->E:Li2/t;

    iput-object p7, p0, Lpz0/c;->F:Lkotlin/jvm/functions/Function1;

    iput p8, p0, Lpz0/c;->G:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v0, p0, Lpz0/c;->w:Landroidx/compose/ui/Modifier;

    iget-boolean v1, p0, Lpz0/c;->x:Z

    iget-boolean v2, p0, Lpz0/c;->y:Z

    iget-wide v3, p0, Lpz0/c;->z:J

    iget-object v5, p0, Lpz0/c;->E:Li2/t;

    iget-object v6, p0, Lpz0/c;->F:Lkotlin/jvm/functions/Function1;

    iget v7, p0, Lpz0/c;->G:I

    invoke-static/range {v0 .. v9}, Lpz0/d;->d(Landroidx/compose/ui/Modifier;ZZJLi2/t;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
