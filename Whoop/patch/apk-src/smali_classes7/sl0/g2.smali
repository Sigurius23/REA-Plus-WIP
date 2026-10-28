.class public final synthetic Lsl0/g2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Z

.field public final synthetic G:Liz0/m;

.field public final synthetic H:Lzk0/i0;

.field public final synthetic I:Z

.field public final synthetic J:Lkotlin/jvm/functions/Function1;

.field public final synthetic K:I

.field public final synthetic L:I

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Lbf3/b;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lbf3/b;ZZZLiz0/m;Lzk0/i0;ZLkotlin/jvm/functions/Function1;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsl0/g2;->w:Ljava/lang/String;

    iput-object p2, p0, Lsl0/g2;->x:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lsl0/g2;->y:Lbf3/b;

    iput-boolean p4, p0, Lsl0/g2;->z:Z

    iput-boolean p5, p0, Lsl0/g2;->E:Z

    iput-boolean p6, p0, Lsl0/g2;->F:Z

    iput-object p7, p0, Lsl0/g2;->G:Liz0/m;

    iput-object p8, p0, Lsl0/g2;->H:Lzk0/i0;

    iput-boolean p9, p0, Lsl0/g2;->I:Z

    iput-object p10, p0, Lsl0/g2;->J:Lkotlin/jvm/functions/Function1;

    iput p11, p0, Lsl0/g2;->K:I

    iput p12, p0, Lsl0/g2;->L:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    move-object v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    iget-object v0, p0, Lsl0/g2;->w:Ljava/lang/String;

    iget-object v1, p0, Lsl0/g2;->x:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Lsl0/g2;->y:Lbf3/b;

    iget-boolean v3, p0, Lsl0/g2;->z:Z

    iget-boolean v4, p0, Lsl0/g2;->E:Z

    iget-boolean v5, p0, Lsl0/g2;->F:Z

    iget-object v6, p0, Lsl0/g2;->G:Liz0/m;

    iget-object v7, p0, Lsl0/g2;->H:Lzk0/i0;

    iget-boolean v8, p0, Lsl0/g2;->I:Z

    iget-object v9, p0, Lsl0/g2;->J:Lkotlin/jvm/functions/Function1;

    iget v10, p0, Lsl0/g2;->K:I

    iget v11, p0, Lsl0/g2;->L:I

    invoke-static/range {v0 .. v13}, Lsl0/l2;->l(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lbf3/b;ZZZLiz0/m;Lzk0/i0;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
