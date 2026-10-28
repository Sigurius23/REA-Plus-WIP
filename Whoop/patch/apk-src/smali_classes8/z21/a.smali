.class public final synthetic Lz21/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Lc93/a;

.field public final synthetic G:Z

.field public final synthetic H:Lkotlin/jvm/functions/Function1;

.field public final synthetic I:I

.field public final synthetic J:I

.field public final synthetic w:I

.field public final synthetic x:Lf31/a;

.field public final synthetic y:Z

.field public final synthetic z:Lny0/v0;


# direct methods
.method public synthetic constructor <init>(ILf31/a;ZLny0/v0;Lkotlin/jvm/functions/Function1;Lc93/a;ZLkotlin/jvm/functions/Function1;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lz21/a;->w:I

    iput-object p2, p0, Lz21/a;->x:Lf31/a;

    iput-boolean p3, p0, Lz21/a;->y:Z

    iput-object p4, p0, Lz21/a;->z:Lny0/v0;

    iput-object p5, p0, Lz21/a;->E:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lz21/a;->F:Lc93/a;

    iput-boolean p7, p0, Lz21/a;->G:Z

    iput-object p8, p0, Lz21/a;->H:Lkotlin/jvm/functions/Function1;

    iput p9, p0, Lz21/a;->I:I

    iput p10, p0, Lz21/a;->J:I

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

    iget v0, p0, Lz21/a;->w:I

    iget-object v1, p0, Lz21/a;->x:Lf31/a;

    iget-boolean v2, p0, Lz21/a;->y:Z

    iget-object v3, p0, Lz21/a;->z:Lny0/v0;

    iget-object v4, p0, Lz21/a;->E:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lz21/a;->F:Lc93/a;

    iget-boolean v6, p0, Lz21/a;->G:Z

    iget-object v7, p0, Lz21/a;->H:Lkotlin/jvm/functions/Function1;

    iget v8, p0, Lz21/a;->I:I

    iget v9, p0, Lz21/a;->J:I

    invoke-static/range {v0 .. v11}, Lz21/b;->b(ILf31/a;ZLny0/v0;Lkotlin/jvm/functions/Function1;Lc93/a;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
