.class public final synthetic Ljp2/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Ljava/lang/String;

.field public final synthetic G:Lg2/i;

.field public final synthetic H:Lkotlin/jvm/functions/Function1;

.field public final synthetic I:Lkotlin/jvm/functions/Function1;

.field public final synthetic J:I

.field public final synthetic K:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Ljp2/o;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljp2/o;IILjava/lang/String;Lg2/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljp2/k;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Ljp2/k;->x:Ljava/lang/String;

    iput-object p3, p0, Ljp2/k;->y:Ljp2/o;

    iput p4, p0, Ljp2/k;->z:I

    iput p5, p0, Ljp2/k;->E:I

    iput-object p6, p0, Ljp2/k;->F:Ljava/lang/String;

    iput-object p7, p0, Ljp2/k;->G:Lg2/i;

    iput-object p8, p0, Ljp2/k;->H:Lkotlin/jvm/functions/Function1;

    iput-object p9, p0, Ljp2/k;->I:Lkotlin/jvm/functions/Function1;

    iput p10, p0, Ljp2/k;->J:I

    iput p11, p0, Ljp2/k;->K:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-object v0, p0, Ljp2/k;->w:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Ljp2/k;->x:Ljava/lang/String;

    iget-object v2, p0, Ljp2/k;->y:Ljp2/o;

    iget v3, p0, Ljp2/k;->z:I

    iget v4, p0, Ljp2/k;->E:I

    iget-object v5, p0, Ljp2/k;->F:Ljava/lang/String;

    iget-object v6, p0, Ljp2/k;->G:Lg2/i;

    iget-object v7, p0, Ljp2/k;->H:Lkotlin/jvm/functions/Function1;

    iget-object v8, p0, Ljp2/k;->I:Lkotlin/jvm/functions/Function1;

    iget v9, p0, Ljp2/k;->J:I

    iget v10, p0, Ljp2/k;->K:I

    invoke-static/range {v0 .. v12}, Ljp2/n;->b(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljp2/o;IILjava/lang/String;Lg2/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
